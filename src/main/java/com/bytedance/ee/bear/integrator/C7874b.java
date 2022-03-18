package com.bytedance.ee.bear.integrator;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.account.AbstractC4163a;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5469i;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.p276c.C4969a;
import com.bytedance.ee.bear.p288d.C5240a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13617e;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.integrator.b */
public class C7874b {

    /* renamed from: a */
    private static Context f21262a;

    /* renamed from: b */
    private static C10917c f21263b;

    /* renamed from: a */
    public static Context m31585a() {
        Context context = f21262a;
        if (context == null) {
            return C13615c.f35773a;
        }
        return context;
    }

    /* renamed from: b */
    public static C10917c m31589b() {
        C10917c cVar = f21263b;
        if (cVar == null) {
            return new C10917c(new C10929e());
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Context m31586a(Context context) {
        Locale locale;
        ao b = C4484g.m18494b();
        if (b != null) {
            locale = b.mo17253d();
        } else {
            locale = null;
        }
        if (locale != null) {
            return C13617e.m55264a(context, locale);
        }
        return context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31588a(DocDynamicConfig docDynamicConfig) {
        al d = C4511g.m18594d();
        d.mo17355b(docDynamicConfig);
        ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20124d();
        C6313i.m25327a().mo25391c(d.mo17363m(), d.mo17362l());
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35639e();
        ((AbstractC5469i) KoinJavaComponent.m268610a(AbstractC5469i.class)).mo21870a();
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19660b();
    }

    /* renamed from: a */
    public static void m31587a(Application application, C10917c cVar) {
        f21262a = application;
        f21263b = cVar;
        C4969a.m20608a($$Lambda$jUl1Vw3kj9RznVuwoTGxleyHtdY.INSTANCE);
        ((AbstractC4163a) KoinJavaComponent.m268610a(AbstractC4163a.class)).mo16375a($$Lambda$b$6TgXY4RJIvVFDsmvtP1b0jb6Ma8.INSTANCE);
        ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20800a();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40647a(cVar, application);
        ((AbstractC5469i) KoinJavaComponent.m268610a(AbstractC5469i.class)).mo21871a(application);
        C5240a.m21423a($$Lambda$b$UfkIoaAinWOddfMT8gvpMWTQQA.INSTANCE);
    }
}
