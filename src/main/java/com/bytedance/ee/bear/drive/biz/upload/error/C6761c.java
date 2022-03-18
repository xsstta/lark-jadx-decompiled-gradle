package com.bytedance.ee.bear.drive.biz.upload.error;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.importfile.request.C6497b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.drive.biz.upload.error.c */
public class C6761c implements AbstractC6759a {
    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: a */
    public int mo26588a() {
        return R.string.Drive_CreateDocumentExceedLimit;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: a */
    public void mo26590a(FragmentActivity fragmentActivity) {
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: b */
    public int mo26591b() {
        return R.string.Drive_Drive_NumberExceededQuotaTips;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: c */
    public int mo26593c() {
        return R.string.Doc_Facade_NotifyAdminUpgrade;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: d */
    public boolean mo26594d() {
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: e */
    public boolean mo26595e() {
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: f */
    public boolean mo26596f() {
        return false;
    }

    public C6761c(Intent intent) {
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: b */
    public void mo26592b(Context context, C10917c cVar) {
        m26657a(cVar, "cancel");
    }

    /* renamed from: a */
    private void m26657a(C10917c cVar, String str) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.biz.upload.error.$$Lambda$c$o6FrUQa3T6ZXtQITBeLb794Fy7Q */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6761c.m26658a(this.f$0, (String) obj);
            }
        }, $$Lambda$c$9sptUvLGRsoYMSeaRSS28mX_90.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26658a(String str, String str2) throws Exception {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("trigger_action", "drive");
        b.mo21079a("client_commerce", hashMap);
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.error.AbstractC6759a
    /* renamed from: a */
    public void mo26589a(Context context, C10917c cVar) {
        new C6497b().mo25990a(context, (NetService) KoinJavaComponent.m268610a(NetService.class));
        m26657a(cVar, "notify_admin");
    }
}
