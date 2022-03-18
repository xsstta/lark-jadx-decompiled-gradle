package com.facebook.react.modules.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;

/* renamed from: com.facebook.react.modules.timepicker.a */
public class TimePickerDialogC21256a extends TimePickerDialog {
    /* access modifiers changed from: protected */
    public void onStop() {
        if (Build.VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }

    public TimePickerDialogC21256a(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, boolean z) {
        super(context, onTimeSetListener, i, i2, z);
    }

    public TimePickerDialogC21256a(Context context, int i, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i2, int i3, boolean z) {
        super(context, i, onTimeSetListener, i2, i3, z);
    }
}
