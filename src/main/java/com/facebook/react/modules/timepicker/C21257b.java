package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.facebook.react.modules.timepicker.b */
public class C21257b extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    private TimePickerDialog.OnTimeSetListener f51779c;

    /* renamed from: d */
    private DialogInterface.OnDismissListener f51780d;

    /* renamed from: a */
    public void mo72115a(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f51779c = onTimeSetListener;
    }

    /* renamed from: a */
    public void mo72116a(DialogInterface.OnDismissListener onDismissListener) {
        this.f51780d = onDismissListener;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        return m77056a(getArguments(), getActivity(), this.f51779c);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f51780d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* renamed from: a */
    static Dialog m77056a(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(12);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        TimePickerMode timePickerMode = TimePickerMode.DEFAULT;
        if (!(bundle == null || bundle.getString("mode", null) == null)) {
            timePickerMode = TimePickerMode.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        if (bundle != null) {
            i = bundle.getInt("hour", instance.get(11));
            i2 = bundle.getInt("minute", instance.get(12));
            is24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (timePickerMode == TimePickerMode.CLOCK) {
                return new TimePickerDialogC21256a(context, context.getResources().getIdentifier("ClockTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
            if (timePickerMode == TimePickerMode.SPINNER) {
                return new TimePickerDialogC21256a(context, context.getResources().getIdentifier("SpinnerTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
        }
        return new TimePickerDialogC21256a(context, onTimeSetListener, i, i2, is24HourFormat);
    }
}
