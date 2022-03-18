package com.ss.android.lark.floating.utils;

import com.ss.android.lark.floating.widget.appfloat.AppFloatManager;
import com.ss.android.lark.floating.widget.appfloat.FloatManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/floating/utils/InputMethodUtils;", "", "()V", "closedInputMethod", "", "tag", "", "(Ljava/lang/String;)Lkotlin/Unit;", "openInputMethod", "editText", "Landroid/widget/EditText;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.d.d */
public final class InputMethodUtils {

    /* renamed from: a */
    public static final InputMethodUtils f98498a = new InputMethodUtils();

    private InputMethodUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Unit m150969a(String str) {
        AppFloatManager e = FloatManager.f98554a.mo140335e(str);
        if (e == null) {
            return null;
        }
        e.mo140307b().mo140376d(40);
        e.mo140300a().updateViewLayout(e.mo140309c(), e.mo140307b().mo140375d());
        return Unit.INSTANCE;
    }
}
