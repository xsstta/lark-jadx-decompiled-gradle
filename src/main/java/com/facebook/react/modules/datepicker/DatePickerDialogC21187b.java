package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.facebook.react.modules.datepicker.b */
public class DatePickerDialogC21187b extends DatePickerDialog {
    /* access modifiers changed from: protected */
    public void onStop() {
        if (Build.VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }

    /* renamed from: a */
    private static Field m76921a(Class cls, Class cls2, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    private void m76922a(Context context, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT == 24) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$styleable");
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, (int[]) cls.getField("DatePicker").get(null), 16843612, 0);
                int i4 = obtainStyledAttributes.getInt(cls.getField("DatePicker_datePickerMode").getInt(null), 2);
                obtainStyledAttributes.recycle();
                if (i4 == 2) {
                    DatePicker datePicker = (DatePicker) m76921a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                    Field a = m76921a(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                    Object obj = a.get(datePicker);
                    if (obj.getClass() != Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                        a.set(datePicker, null);
                        datePicker.removeAllViews();
                        Method declaredMethod = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE);
                        declaredMethod.setAccessible(true);
                        a.set(datePicker, declaredMethod.invoke(datePicker, context, null, 16843612, 0));
                        datePicker.setCalendarViewShown(false);
                        datePicker.init(i, i2, i3, this);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public DatePickerDialogC21187b(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, onDateSetListener, i, i2, i3);
        m76922a(context, i, i2, i3);
    }

    public DatePickerDialogC21187b(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        m76922a(context, i2, i3, i4);
    }
}
