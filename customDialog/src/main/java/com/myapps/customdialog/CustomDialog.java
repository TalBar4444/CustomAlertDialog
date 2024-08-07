package com.myapps.customdialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class CustomDialog {

    public enum DialogType {
        SUCCESS, ERROR, WARNING, INFO, DELETE
    }

    public interface DialogClickListener {
        void onClick(View view);
    }

    public static void showDialog(Context context, DialogType dialogType, String title, String content,
                                  @Nullable DialogClickListener positiveClickListener, @Nullable DialogClickListener negativeClickListener) {
        int layoutResId;

        switch (dialogType) {
            case SUCCESS:
                layoutResId = R.layout.success_dialog;
                break;
            case ERROR:
                layoutResId = R.layout.error_dialog;
                break;
            case WARNING:
                layoutResId = R.layout.warning_dialog;
                break;
            case INFO:
                layoutResId = R.layout.info_dialog;
                break;
            case DELETE:
                layoutResId = R.layout.delete_dialog;
                break;
            default:
                throw new IllegalArgumentException("Invalid dialog type");
        }

        showCustomDialog(context, layoutResId, title, content, positiveClickListener, negativeClickListener);
    }

    private static void showCustomDialog(Context context, int layoutResId, String title, String content,
                                         @Nullable DialogClickListener positiveClickListener, @Nullable DialogClickListener negativeClickListener) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(context);
        View view = LayoutInflater.from(context).inflate(layoutResId, null);

        builder.setView(view);

        TextView dialog_LBL_title = view.findViewById(R.id.dialog_LBL_title);
        TextView dialog_LBL_content = view.findViewById(R.id.dialog_LBL_content);

        if (title != null) {
            dialog_LBL_title.setText(title);
        }

        if (content != null) {
            dialog_LBL_content.setText(content);
        }

        final AlertDialog alertDialog = builder.create();
        view.findViewById(R.id.dialog_BTN_positive).setOnClickListener(v -> {
            if (positiveClickListener != null) {
                positiveClickListener.onClick(v);
            }
            dismissDialog(alertDialog);
        });

        View dialog_BTN_negative = view.findViewById(R.id.dialog_BTN_negative);
        if(dialog_BTN_negative != null) {
            dialog_BTN_negative.setOnClickListener(v -> {
                if (negativeClickListener != null) {
                    negativeClickListener.onClick(v);
                    dismissDialog(alertDialog);
                }});
        }

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog.show();
    }
    private static void dismissDialog(AlertDialog alertDialog) {
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
}

