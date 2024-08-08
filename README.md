# CustomDialog-Android
This library is a set of simple wrapper classes that was created to help you easily make custom pop-ups dialogs.

<img src="" width="288">

<img src="https://github.com/user-attachments/assets/f8919d3b-73e2-4e6c-a32c-8dbe506c9b88" width="200" height="288">
<img src="https://github.com/user-attachments/assets/6f200125-544b-4dba-8278-56f4ef50c840" width="288">
<img src="https://github.com/user-attachments/assets/8863675e-83c8-4d3a-aef3-55f06a2d78de" width="288">
<img src="https://github.com/user-attachments/assets/e77fd33a-9497-4295-9584-72f9002d6c4d" width="288">
<img src="https://github.com/TalBar4444/CustomAlertDialog/blob/master/img_delete.png" width="300" height="380">

## Setup
Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
	maven { url 'https://jitpack.io' }
    }
}
```
Step 2. Add the dependency:

```
dependencies {
	implementation ''
}
```
## Usage

### Dialog Types

Each Dialog has its own top color, icon, title and message + its own featured. There are 5 types of dialogs available:
* [CustomSuccessDialog](#customsuccessdialog)
* [CustomErrorDialog](#customeerrordialog)
* [CustomWarningDialog](#customwarningdialog)
* [CustomInfoDialog](#custominfodialog)
* [CustomDeleteDialog](#customdeletedialog)

#### CustomSuccessDialog
Displays a success message, with 1 button

```java
    CustomDialog.showDialog(this, CustomDialog.DialogType.SUCCESS,
            "Success",
            "Congratulation!",
            view -> {
                  Toast.makeText(MainActivity.this, "Success choose Done", Toast.LENGTH_SHORT).show();
            }, null);
```

#### CustomErrorDialog
Displays an Error message, with 1 button.
```
    CustomDialog.showDialog(this, CustomDialog.DialogType.ERROR,
          "Error", 
          "Something went wrong, try again later",
          view -> {
              Toast.makeText(MainActivity.this, "error choose ok", Toast.LENGTH_SHORT).show();
          },null);

```

#### CustomWarningDialog
Displays a Warning message, with 2 buttons
```
    CustomDialog.showDialog(this, CustomDialog.DialogType.WARNING,
          "Warning",
          "Do you want to continue?",
          view -> {
              Toast.makeText(MainActivity.this, "warning choose continue", Toast.LENGTH_SHORT).show();
          },
          view -> {
              Toast.makeText(MainActivity.this, "warning choose cancel", Toast.LENGTH_SHORT).show();
          });
```

#### CustomInfoDialog
Displays an informative message, with 1 button.
```
     CustomDialog.showDialog(this, CustomDialog.DialogType.INFO,
           "Information",
           "This is an informative content",
            view -> {
                Toast.makeText(MainActivity.this, "Info choose ok", Toast.LENGTH_SHORT).show();
            }, null);

```
#### CustomDeleteDialog
Displays a delete message, with 2 buttons.
```
    CustomDialog.showDialog(this, CustomDialog.DialogType.DELETE,
           "Deleting",
           "Are you sure you want to delete this item? ",
            view -> {
                Toast.makeText(MainActivity.this, "delete choose Delete", Toast.LENGTH_SHORT).show();
            },
            view -> {
                Toast.makeText(MainActivity.this, "delete choose Cancel", Toast.LENGTH_SHORT).show();
            });

```
      
## Success
![img_success](https://github.com/user-attachments/assets/f8919d3b-73e2-4e6c-a32c-8dbe506c9b88)
## Error
![img_error](https://github.com/user-attachments/assets/6f200125-544b-4dba-8278-56f4ef50c840)
## Warning
![img_warning](https://github.com/user-attachments/assets/8863675e-83c8-4d3a-aef3-55f06a2d78de)
## Info
![img_info](https://github.com/user-attachments/assets/e77fd33a-9497-4295-9584-72f9002d6c4d)
## Delete
![img_delete](https://github.com/user-attachments/assets/8cd4c825-880d-4240-ba04-0338c0eaea43)

## Credits
Icon made by Flat Icons (www.flat-icons.com) from www.flaticon.com
