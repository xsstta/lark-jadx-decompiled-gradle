package com.ss.android.lark.larkconfig.larksetting.handler.p2109c;

import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.DevicePerfUtils;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.c.a */
public class C41174a extends AbstractBaseSettingHandler {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.c.a$a */
    public static class C41175a {

        /* renamed from: a */
        public static C41174a f104960a = new C41174a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "bytebench";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "ByteBenchHandler";
    }

    /* renamed from: d */
    public static C41174a m163368d() {
        return C41175a.f104960a;
    }

    public C41174a() {
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.larkconfig.larksetting.handler.p2109c.$$Lambda$a$vTeWyTIsPVghMY7UEdzNnWUifuU */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41174a.lambda$vTeWyTIsPVghMY7UEdzNnWUifuU(C41174a.this, (String) obj);
            }
        }).mo148424c($$Lambda$a$xvDQ8H1g3xXclx9FFvU1kQFc9Fs.INSTANCE));
    }

    /* renamed from: e */
    public static /* synthetic */ Boolean m163369e() {
        C57744a.m224104a().remove(DevicePerfUtils.m224112a());
        return true;
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x0046;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ kotlin.Unit m163367a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r6 = "unknown"
            java.lang.String r0 = r5.mo148410h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "config="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ByteBenchHandler"
            com.ss.android.lark.log.Log.m165389i(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r1 == 0) goto L_0x0024
            return r3
        L_0x0024:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x003c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x003c }
            java.lang.String r0 = com.ss.android.lark.utils.DevicePerfUtils.m224112a()     // Catch:{ Exception -> 0x003c }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x003c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x003c }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x0045
            goto L_0x0046
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0040:
            java.lang.String r1 = "byte bench parse error!!"
            com.ss.android.lark.log.Log.m165384e(r2, r1, r6)
        L_0x0045:
            r6 = r0
        L_0x0046:
            com.ss.android.lark.util.share_preference.a r0 = com.ss.android.lark.util.share_preference.C57744a.m224104a()
            java.lang.String r1 = com.ss.android.lark.utils.DevicePerfUtils.m224112a()
            r0.putString(r1, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.larkconfig.larksetting.handler.p2109c.C41174a.m163367a(java.lang.String):kotlin.Unit");
    }
}
