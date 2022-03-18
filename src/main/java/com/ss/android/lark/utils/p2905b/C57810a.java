package com.ss.android.lark.utils.p2905b;

import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.utils.b.a */
public class C57810a {
    /* renamed from: a */
    private static float m224335a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    /* renamed from: a */
    public static void m224336a(Context context, Dialog dialog) {
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.936d);
        attributes.y = UIUtils.dp2px(context, 12.0f);
        attributes.gravity = 80;
        window.setAttributes(attributes);
        if (DesktopUtil.m144301a(context)) {
            window.setWindowAnimations(R.style.UtilsAnimBottomFade);
        } else {
            window.setWindowAnimations(R.style.UtilsAnimBottom);
        }
        window.setDimAmount(m224335a(context, (int) R.dimen.ud_dialog_background_dim_amount));
        dialog.show();
    }

    /* renamed from: c */
    public static void m224339c(Context context, Dialog dialog, float[] fArr) {
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 53;
        float f = fArr[0];
        float f2 = fArr[1];
        attributes.x = UIUtils.dp2px(context, f);
        attributes.y = UIUtils.dp2px(context, f2);
        window.setAttributes(attributes);
        window.setWindowAnimations(R.style.UtilsAnimRightDialog);
        window.setDimAmount(m224335a(context, (int) R.dimen.ud_dialog_background_dim_amount));
        dialog.show();
    }

    /* renamed from: b */
    public static void m224338b(Context context, Dialog dialog, float[] fArr) {
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        attributes.gravity = 51;
        float f = fArr[0];
        float f2 = fArr[1];
        attributes.horizontalMargin = ((float) UIUtils.dp2px(context, f)) / ((float) displayMetrics.widthPixels);
        attributes.verticalMargin = ((float) UIUtils.dp2px(context, f2)) / ((float) displayMetrics.heightPixels);
        window.setAttributes(attributes);
        window.setWindowAnimations(R.style.UtilsAnimRightDialog);
        window.setDimAmount(m224335a(context, (int) R.dimen.ud_dialog_background_dim_amount));
        dialog.show();
    }

    /* renamed from: a */
    public static void m224337a(Context context, Dialog dialog, float[] fArr) {
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        attributes.gravity = 53;
        float f = fArr[0];
        float f2 = fArr[1];
        attributes.horizontalMargin = ((float) UIUtils.dp2px(context, f)) / ((float) displayMetrics.widthPixels);
        attributes.verticalMargin = ((float) UIUtils.dp2px(context, f2)) / ((float) displayMetrics.heightPixels);
        window.setAttributes(attributes);
        window.setWindowAnimations(R.style.UtilsAnimRightDialog);
        window.setDimAmount(m224335a(context, (int) R.dimen.ud_dialog_background_dim_amount));
        dialog.show();
    }
}
