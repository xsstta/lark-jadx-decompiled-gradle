package com.ss.android.lark.mm.module.floatwindow.floating.permission;

import android.app.Activity;
import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.permission.C51323b;
import com.ss.android.lark.utils.C57805b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J3\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\b0\n¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/floating/permission/MicrophonePermission;", "", "()V", "isGranted", "", "context", "Landroid/content/Context;", "request", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.d */
public final class MicrophonePermission {

    /* renamed from: a */
    public static final MicrophonePermission f116672a = new MicrophonePermission();

    private MicrophonePermission() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted", "com/ss/android/lark/mm/module/floatwindow/floating/permission/MicrophonePermission$request$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.d$a */
    static final class C46319a implements C57805b.AbstractC57809a {

        /* renamed from: a */
        final /* synthetic */ Function1 f116673a;

        C46319a(Function1 function1) {
            this.f116673a = function1;
        }

        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
        public final void permissionGranted(boolean z) {
            Function1 function1 = this.f116673a;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo162800a(Context context) {
        return C51323b.m199076a(context, "android.permission.RECORD_AUDIO");
    }

    /* renamed from: a */
    public final void mo162799a(Context context, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        if (mo162800a(context)) {
            function1.invoke(true);
            return;
        }
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        Context b = contextDepend.mo144562b();
        if (!(b instanceof Activity)) {
            b = null;
        }
        Activity activity = (Activity) b;
        if (activity != null) {
            C57805b.m224328a(activity, new C46319a(function1), "android.permission.RECORD_AUDIO", R.string.MMWeb_G_AccessToMicDenied, R.string.MMWeb_G_AllowAccessToMic);
        }
    }
}
