package com.ss.android.lark.applogbridge.util;

import android.content.Context;
import com.bytedance.applog.AbstractC3419f;
import com.bytedance.applog.C3424j;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.applogbridge.model.InitConfig;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/applogbridge/util/InitConfigConverter;", "", "()V", "getInitConfig", "Lcom/bytedance/applog/InitConfig;", "context", "Landroid/content/Context;", "config", "Lcom/ss/android/lark/applogbridge/model/InitConfig;", "applog-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.applogbridge.c.a */
public final class InitConfigConverter {

    /* renamed from: a */
    public static final InitConfigConverter f73088a = new InitConfigConverter();

    private InitConfigConverter() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "checkIpcData", "([Ljava/lang/String;)Z"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.applogbridge.c.a$b */
    public static final class C29204b implements C3424j.AbstractC3425a {

        /* renamed from: a */
        public static final C29204b f73090a = new C29204b();

        C29204b() {
        }

        @Override // com.bytedance.applog.C3424j.AbstractC3425a
        /* renamed from: a */
        public final boolean mo13772a(String[] strArr) {
            Log.m165385e("InitConfigConveter", "ipcDataChecker failed", new RuntimeException("AppLog IPC data too large"), true);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "msg", "", "kotlin.jvm.PlatformType", "t", "", "log"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.applogbridge.c.a$a */
    public static final class C29203a implements AbstractC3419f {

        /* renamed from: a */
        public static final C29203a f73089a = new C29203a();

        C29203a() {
        }

        @Override // com.bytedance.applog.AbstractC3419f
        /* renamed from: a */
        public final void mo13716a(String str, Throwable th) {
            Log.m165390i("AppLogSDK", str, th);
        }
    }

    /* renamed from: a */
    public final C3424j mo103501a(Context context, InitConfig aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (aVar != null) {
            String num = Integer.toString(aVar.mo103495a());
            String b = aVar.mo103496b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            C3424j jVar = new C3424j(num, b);
            jVar.mo13738a(C29203a.f73089a);
            jVar.mo13739a(C29204b.f73090a);
            if (aVar.mo103497c() != null) {
                jVar.mo13741a(aVar.mo103497c());
            }
            if (aVar.mo103500f() != null) {
                jVar.mo13742a(aVar.mo103500f());
            }
            jVar.mo13737a(C26246a.m94979c(context));
            UriConfigCreator bVar = UriConfigCreator.f73091a;
            String d = aVar.mo103498d();
            if (d == null) {
                d = "";
            }
            jVar.mo13740a(bVar.mo103502a(d, aVar.mo103499e()));
            return jVar;
        }
        throw new IllegalArgumentException("InitConfig could not be null");
    }
}
