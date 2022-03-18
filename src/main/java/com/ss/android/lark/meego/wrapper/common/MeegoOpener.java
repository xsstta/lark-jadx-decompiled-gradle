package com.ss.android.lark.meego.wrapper.common;

import android.content.Context;
import com.ss.android.lark.meego.wrapper.MeegoActivity;
import com.ss.android.lark.meego.wrapper.manis.AbstractC44874a;
import com.ss.android.lark.meego.wrapper.p2250e.C44866a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\rH\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/common/MeegoOpener;", "", "()V", "hasInstallOnce", "", "openMeegoActivity", "", "context", "Landroid/content/Context;", "route", "", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "preInstallPlugin", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.meego.wrapper.a.e */
public final class MeegoOpener {

    /* renamed from: a */
    public static final MeegoOpener f113633a = new MeegoOpener();

    /* renamed from: b */
    private static boolean f113634b;

    private MeegoOpener() {
    }

    /* renamed from: a */
    private final void m177844a() {
        if (!f113634b) {
            f113634b = true;
            C44866a.m177883a((AbstractC44874a) null);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m177845a(Context context, String str, HashMap<String, String> hashMap) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        f113633a.m177844a();
        MeegoActivity.f113621a.mo158725a(context, str, hashMap);
    }
}
