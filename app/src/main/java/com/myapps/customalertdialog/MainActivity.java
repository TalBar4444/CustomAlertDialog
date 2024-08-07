package com.myapps.customalertdialog;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.myapps.customdialog.CustomDialog;

public class MainActivity extends AppCompatActivity {

    private MaterialButton main_BTN_success, main_BTN_error, main_BTN_warning, main_BTN_info,main_BTN_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

        main_BTN_success.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.SUCCESS, null, null,
                    null,null);

        });

        main_BTN_error.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.ERROR, "Error", "Something went wrong",
                    null,
                    view -> {
                        Toast.makeText(MainActivity.this, "error choose ok", Toast.LENGTH_SHORT).show();
                    });

        });


        main_BTN_warning.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.WARNING, "warning", "Im warning",
                    view -> {
                        Toast.makeText(MainActivity.this, "warning choose ok", Toast.LENGTH_SHORT).show();
                    },null);

        });

        main_BTN_info.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.INFO, "info", "Im info",
                    view -> {
                        Toast.makeText(MainActivity.this, "info choose ok", Toast.LENGTH_SHORT).show();
                    },view -> {
                        Toast.makeText(MainActivity.this, "info choose not", Toast.LENGTH_SHORT).show();
                    });

        });

        main_BTN_delete.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.DELETE, "Deleting", "null",
                    view -> {
                        Toast.makeText(MainActivity.this, "delete choose ok", Toast.LENGTH_SHORT).show();
                    },
                    view -> {
                        Toast.makeText(MainActivity.this, "delete choose not", Toast.LENGTH_SHORT).show();
                    });

        });
    }

    private void findViews() {
        main_BTN_success = findViewById(R.id.main_BTN_success);
        main_BTN_error = findViewById(R.id.main_BTN_error);
        main_BTN_warning = findViewById(R.id.main_BTN_warning);
        main_BTN_info = findViewById(R.id.main_BTN_info);
        main_BTN_delete = findViewById(R.id.main_BTN_delete);
    }
}