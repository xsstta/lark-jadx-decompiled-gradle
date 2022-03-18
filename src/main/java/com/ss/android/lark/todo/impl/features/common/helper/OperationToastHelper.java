package com.ss.android.lark.todo.impl.features.common.helper;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

public final class OperationToastHelper {

    /* renamed from: a */
    public static final OperationToastHelper f139395a = new OperationToastHelper();

    public enum ToastType {
        SUCCESS,
        FAIL,
        PROMPT
    }

    private OperationToastHelper() {
    }

    /* renamed from: a */
    public final void mo191992a() {
        LKUIToast.cancelLoading();
    }

    /* renamed from: a */
    public final Unit mo191991a(Context context, int i) {
        if (context == null) {
            return null;
        }
        LKUIToast.showLoading(context, i);
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Unit mo191995b(Context context, int i) {
        if (context == null) {
            return null;
        }
        f139395a.mo191992a();
        UDToast.build(context).mo91637a(i).mo91640a(-1L).mo91656k();
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo191993a(Context context, int i, Integer num, Integer num2, Integer num3) {
        m219776a(this, context, ToastType.SUCCESS, i, num, num2, num3, null, 64, null);
    }

    /* renamed from: b */
    public final void mo191996b(Context context, int i, String str, Integer num, Integer num2, Integer num3) {
        m219773a(context, ToastType.PROMPT, i, num, num2, num3, str);
    }

    /* renamed from: a */
    public final void mo191994a(Context context, int i, String str, Integer num, Integer num2, Integer num3) {
        m219773a(context, ToastType.FAIL, i, num, num2, num3, str);
    }

    /* renamed from: a */
    private final void m219772a(Context context, int i, int i2, Integer num, Integer num2, Integer num3, String str) {
        mo191992a();
        UDToast.Builder a = UDToast.build(context).mo91647b(i).mo91640a(-1L);
        if (str != null) {
            a.mo91643a(str);
        } else {
            a.mo91637a(i2);
        }
        if (!(num == null || num2 == null || num3 == null)) {
            a.mo91638a(num.intValue(), num2.intValue(), num3.intValue());
        }
        a.mo91655j().show();
    }

    /* renamed from: a */
    private final void m219773a(Context context, ToastType toastType, int i, Integer num, Integer num2, Integer num3, String str) {
        int i2;
        if (context != null) {
            int i3 = C56334d.f139402a[toastType.ordinal()];
            if (i3 == 1) {
                i2 = R.drawable.ud_icon_yes_outlined;
            } else if (i3 == 2) {
                i2 = R.drawable.ud_icon_more_close_outlined;
            } else if (i3 == 3) {
                i2 = R.drawable.ud_icon_warning_outlined;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            m219772a(context, i2, i, num, num2, num3, str);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m219774a(OperationToastHelper operationToastHelper, Context context, int i, Integer num, Integer num2, Integer num3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if ((i2 & 16) != 0) {
            num3 = null;
        }
        operationToastHelper.mo191993a(context, i, num, num2, num3);
    }

    /* renamed from: b */
    public static /* synthetic */ void m219777b(OperationToastHelper operationToastHelper, Context context, int i, String str, Integer num, Integer num2, Integer num3, int i2, Object obj) {
        String str2;
        Integer num4;
        Integer num5;
        Integer num6;
        if ((i2 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i2 & 16) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i2 & 32) != 0) {
            num6 = null;
        } else {
            num6 = num3;
        }
        operationToastHelper.mo191996b(context, i, str2, num4, num5, num6);
    }

    /* renamed from: a */
    public static /* synthetic */ void m219775a(OperationToastHelper operationToastHelper, Context context, int i, String str, Integer num, Integer num2, Integer num3, int i2, Object obj) {
        String str2;
        Integer num4;
        Integer num5;
        Integer num6;
        if ((i2 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i2 & 16) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i2 & 32) != 0) {
            num6 = null;
        } else {
            num6 = num3;
        }
        operationToastHelper.mo191994a(context, i, str2, num4, num5, num6);
    }

    /* renamed from: a */
    static /* synthetic */ void m219776a(OperationToastHelper operationToastHelper, Context context, ToastType toastType, int i, Integer num, Integer num2, Integer num3, String str, int i2, Object obj) {
        Integer num4;
        Integer num5;
        Integer num6;
        String str2;
        if ((i2 & 8) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i2 & 16) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i2 & 32) != 0) {
            num6 = null;
        } else {
            num6 = num3;
        }
        if ((i2 & 64) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        operationToastHelper.m219773a(context, toastType, i, num4, num5, num6, str2);
    }
}
