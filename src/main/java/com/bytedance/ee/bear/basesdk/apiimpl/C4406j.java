package com.bytedance.ee.bear.basesdk.apiimpl;

import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.OnlineOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drive.module.C7098c;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drivesdk.PreviewType;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.j */
public final class C4406j implements AbstractC4385i {

    /* renamed from: a */
    private AbstractC5239d f13020a;

    /* renamed from: a */
    private void m18194a() {
        if (!C4211a.m17514a().mo16536a("spacekit.mobile.drive_sdk_enable_open_check", false)) {
            C13479a.m54764b("DriveSdkImpl", "checkAndOpen() fg false...");
            return;
        }
        C13479a.m54764b("DriveSdkImpl", "checkAndOpen()...");
        long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238014c($$Lambda$j$Ow3wDvuEy9zFpKOrVIyM9TXETw.INSTANCE).mo238014c(new Function(uptimeMillis) {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$j$wsux6r9uRMS0JMHm8tWj5oGTks */
            public final /* synthetic */ long f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4406j.m18197b(this.f$0, (Boolean) obj);
            }
        }).mo238001b(new Consumer(uptimeMillis) {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$j$uLEvkjtnSQncA7rLxiw2G49GRGw */
            public final /* synthetic */ long f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4406j.m18195a(this.f$0, (Boolean) obj);
            }
        }, $$Lambda$j$iugLIk3sJaKoPMHSFhwT5KCF_Ic.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public Fragment mo17055a(LocalOpenEntity localOpenEntity) {
        m18194a();
        return this.f13020a.mo21089a(localOpenEntity);
    }

    public C4406j(C10929e eVar) {
        try {
            this.f13020a = (AbstractC5239d) KoinJavaComponent.m268610a(AbstractC5239d.class);
        } catch (Exception e) {
            this.f13020a = new C7098c(eVar);
            C13606d.m55245a("DriveSdkImpl", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m18193a(String str) throws Exception {
        String v = C4511g.m18594d().mo17372v();
        if (v == null) {
            v = "";
        }
        return ((an) KoinJavaComponent.m268610a(an.class)).mo16396a(v);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public void mo17059a(OnlineOpenEntity onlineOpenEntity) {
        mo17057a(C13615c.f35773a, onlineOpenEntity);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public void mo17058a(Context context, LocalOpenEntity localOpenEntity) {
        mo17057a(context, (BaseOpenEntity) localOpenEntity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18195a(long j, Boolean bool) throws Exception {
        C13479a.m54764b("DriveSdkImpl", "checkInitPluginFlowable ret=" + bool + " cost=" + (SystemClock.uptimeMillis() - j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC70020b m18197b(long j, Boolean bool) throws Exception {
        C13479a.m54764b("DriveSdkImpl", "checkAndLogin ret=" + bool + " cost=" + (SystemClock.uptimeMillis() - j));
        return ar.m20936a().mo41508c(AbstractC7184l.class).mo238014c($$Lambda$Dxt55vxbvnGw97h8HhsPVejK4y8.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public PreviewType mo17056a(String str, String str2) {
        return this.f13020a.mo21091a(str, str2);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public void mo17057a(Context context, BaseOpenEntity baseOpenEntity) {
        this.f13020a.mo21092a(context, baseOpenEntity);
        m18194a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4385i
    /* renamed from: a */
    public void mo17060a(String str, PreviewAction previewAction) {
        this.f13020a.mo21094a(str, previewAction);
    }
}
