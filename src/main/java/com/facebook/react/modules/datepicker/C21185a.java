package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.facebook.react.modules.datepicker.a */
public class C21185a extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    private DatePickerDialog.OnDateSetListener f51654c;

    /* renamed from: d */
    private DialogInterface.OnDismissListener f51655d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.modules.datepicker.a$1 */
    public static /* synthetic */ class C211861 {

        /* renamed from: a */
        static final /* synthetic */ int[] f51656a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.modules.datepicker.DatePickerMode[] r0 = com.facebook.react.modules.datepicker.DatePickerMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.modules.datepicker.C21185a.C211861.f51656a = r0
                com.facebook.react.modules.datepicker.DatePickerMode r1 = com.facebook.react.modules.datepicker.DatePickerMode.CALENDAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.modules.datepicker.C21185a.C211861.f51656a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.modules.datepicker.DatePickerMode r1 = com.facebook.react.modules.datepicker.DatePickerMode.SPINNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.modules.datepicker.C21185a.C211861.f51656a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.modules.datepicker.DatePickerMode r1 = com.facebook.react.modules.datepicker.DatePickerMode.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.datepicker.C21185a.C211861.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71984a(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f51654c = onDateSetListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71985a(DialogInterface.OnDismissListener onDismissListener) {
        this.f51655d = onDismissListener;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        return m76917a(getArguments(), getActivity(), this.f51654c);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f51655d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* renamed from: a */
    static Dialog m76917a(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        DatePickerDialogC21187b bVar;
        Calendar instance = Calendar.getInstance();
        if (bundle != null && bundle.containsKey("date")) {
            instance.setTimeInMillis(bundle.getLong("date"));
        }
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        DatePickerMode datePickerMode = DatePickerMode.DEFAULT;
        DatePickerDialogC21187b bVar2 = null;
        if (!(bundle == null || bundle.getString("mode", null) == null)) {
            datePickerMode = DatePickerMode.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int i4 = C211861.f51656a[datePickerMode.ordinal()];
            if (i4 == 1) {
                bVar = new DatePickerDialogC21187b(context, context.getResources().getIdentifier("CalendarDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
            } else if (i4 == 2) {
                bVar = new DatePickerDialogC21187b(context, 16973939, onDateSetListener, i, i2, i3);
                bVar.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } else if (i4 == 3) {
                bVar = new DatePickerDialogC21187b(context, onDateSetListener, i, i2, i3);
            }
            bVar2 = bVar;
        } else {
            DatePickerDialogC21187b bVar3 = new DatePickerDialogC21187b(context, onDateSetListener, i, i2, i3);
            int i5 = C211861.f51656a[datePickerMode.ordinal()];
            if (i5 == 1) {
                bVar3.getDatePicker().setCalendarViewShown(true);
                bVar3.getDatePicker().setSpinnersShown(false);
            } else if (i5 == 2) {
                bVar3.getDatePicker().setCalendarViewShown(false);
            }
            bVar2 = bVar3;
        }
        DatePicker datePicker = bVar2.getDatePicker();
        if (bundle == null || !bundle.containsKey("minDate")) {
            datePicker.setMinDate(-2208988800001L);
        } else {
            instance.setTimeInMillis(bundle.getLong("minDate"));
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            datePicker.setMinDate(instance.getTimeInMillis());
        }
        if (bundle != null && bundle.containsKey("maxDate")) {
            instance.setTimeInMillis(bundle.getLong("maxDate"));
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            datePicker.setMaxDate(instance.getTimeInMillis());
        }
        return bVar2;
    }
}
