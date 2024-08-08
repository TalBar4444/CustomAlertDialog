package com.myapps.customalertdialog;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.myapps.customdialog.CustomDialog;

public class MainActivity extends AppCompatActivity {

    private MaterialButton main_BTN_success, main_BTN_error, main_BTN_warning, main_BTN_info, main_BTN_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

        main_BTN_success.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.SUCCESS,
                    "Success",
                    "Congratulation!",
                    view -> {
                        Toast.makeText(MainActivity.this, "Success choose Done", Toast.LENGTH_SHORT).show();
                    }, null);

        });

        main_BTN_error.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.ERROR,
                    "Error",
                    "Something went wrong, try again later",
                    view -> {
                        Toast.makeText(MainActivity.this, "error choose ok", Toast.LENGTH_SHORT).show();
                    }, null);

        });


        main_BTN_warning.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.WARNING,
                    "Warning",
                    "Do you want to continue?",
                    view -> {
                        Toast.makeText(MainActivity.this, "warning choose continue", Toast.LENGTH_SHORT).show();
                    },
                    view -> {
                        Toast.makeText(MainActivity.this, "warning choose cancel", Toast.LENGTH_SHORT).show();
                    });
        });

        main_BTN_info.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.INFO,
                    "Information",
                    "This is an informative content",
                    view -> {
                        Toast.makeText(MainActivity.this, "Info choose ok", Toast.LENGTH_SHORT).show();
                    }, null);

        });

        main_BTN_delete.setOnClickListener(v -> {
            CustomDialog.showDialog(this, CustomDialog.DialogType.DELETE,
                    "Deleting",
                    "Are you sure you want to delete this item? ",
                    view -> {
                        Toast.makeText(MainActivity.this, "delete choose Delete", Toast.LENGTH_SHORT).show();
                    },
                    view -> {
                        Toast.makeText(MainActivity.this, "delete choose Cancel", Toast.LENGTH_SHORT).show();
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