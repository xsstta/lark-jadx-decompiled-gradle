package com.ss.android.lark.larkconfig.larksetting.handler.p2112f;

import android.text.TextUtils;
import com.larksuite.component.dybrid.offlineresource.C24256d;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.larkconfig.larksetting.C41163b;
import com.ss.android.lark.larkconfig.larksetting.C41164c;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.f.a */
public class C41187a extends AbstractBaseSettingHandler {

    /* renamed from: a */
    private static Boolean f104967a;

    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.f.a$b */
    private static class C41190b {

        /* renamed from: a */
        public static C41187a f104969a = new C41187a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "dynamic_url_mapper";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "DynamicUrlHandler";
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.f.a$a */
    public static class C41189a extends C41152a {

        /* renamed from: a */
        private String f104968a;

        /* renamed from: a */
        public String mo148484a() {
            return this.f104968a;
        }

        public C41189a(String str) {
            this.f104968a = str;
        }
    }

    /* renamed from: d */
    public static C41187a m163397d() {
        return C41190b.f104969a;
    }

    private C41187a() {
        mo148402a(mo148411i().mo148421a($$Lambda$a$nat_DxWHDKtyoi9DGNK1CQGaGg.INSTANCE));
    }

    /* renamed from: e */
    public static boolean m163399e() {
        if (f104967a == null) {
            f104967a = Boolean.valueOf(C41163b.m163326a().isFeatureEnable("lark.dynamic.lazy.init"));
        }
        return f104967a.booleanValue();
    }

    /* renamed from: f */
    public static void m163400f() {
        if (m163399e()) {
            C41189a aVar = (C41189a) C41164c.m163343a().mo148460a("dynamic_url_mapper", new AbstractC41160a() {
                /* class com.ss.android.lark.larkconfig.larksetting.handler.p2112f.C41187a.C411881 */

                /* renamed from: a */
                public C41189a mo103073b(String str) {
                    return new C41189a(str);
                }
            });
            if (!TextUtils.isEmpty(aVar.mo148484a())) {
                m163396a(aVar.mo148484a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m163396a(String str) {
        C24256d offlineResourceAPi = C41163b.m163326a().getOfflineResourceAPi();
        if (offlineResourceAPi == null) {
            Log.m165383e("DynamicUrlHandler", "offlineResourceAPi == null");
        } else {
            offlineResourceAPi.mo86888b(str);
        }
    }
}
