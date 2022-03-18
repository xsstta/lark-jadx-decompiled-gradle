package com.bytedance.ee.bear.quoto;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.quoto.p524a.C10559b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p699b.C13595b;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.quoto.d */
public class C10565d implements AbstractC10575k {

    /* renamed from: a */
    private final boolean f28345a;

    /* renamed from: b */
    private final C10559b f28346b = new C10559b((NetService) KoinJavaComponent.m268610a(NetService.class));

    @Override // com.bytedance.ee.bear.quoto.AbstractC10575k
    /* renamed from: a */
    public boolean mo40014a() {
        return this.f28345a;
    }

    public C10565d() {
        boolean a = C4211a.m17514a().mo16536a("ccm.drive.size_limit_enable", false);
        this.f28345a = a;
        C13479a.m54764b("ExceedQuotaImpl", "DRIVE_UPLOAD_SIZE_LIMIT_ENABLE = " + a);
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10575k
    /* renamed from: a */
    public boolean mo40015a(int i) {
        if (!this.f28345a || (i != 90003043 && i != 90001043)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10575k
    /* renamed from: a */
    public AbstractC68307f<C10582o> mo40010a(Long l) {
        if (!this.f28345a || l == null || l.longValue() <= 0) {
            return AbstractC68307f.m265083a(new C10582o(l, false));
        }
        return this.f28346b.mo40008a(l);
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10575k
    /* renamed from: a */
    public void mo40012a(FragmentActivity fragmentActivity, FullQuotoConfig fullQuotoConfig) {
        FullQuotoDialogFragment.m43795a(fragmentActivity, fullQuotoConfig);
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10575k
    /* renamed from: a */
    public void mo40011a(Context context, SingleFileQuotaConfig singleFileQuotaConfig, Long l) {
        Class cls;
        Bundle bundle = new Bundle();
        bundle.putLong("key_file_size", l.longValue());
        bundle.putParcelable("key_quota_config", singleFileQuotaConfig);
        if (C13595b.m55176a()) {
            cls = ExceedQuotaMainProcActivity.class;
        } else {
            cls = ExceedQuotaActivity.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("exceed_quota_code", 90001043);
        intent.putExtras(bundle);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10575k
    /* renamed from: a */
    public void mo40013a(FragmentActivity fragmentActivity, String str, String str2, boolean z) {
        C10564c.m43770a(fragmentActivity, str, str2, z);
    }
}
