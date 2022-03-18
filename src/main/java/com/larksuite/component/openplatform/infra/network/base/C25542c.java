package com.larksuite.component.openplatform.infra.network.base;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkException;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12867c;
import com.bytedance.ee.lark.infra.network.ref.p636b.C12872h;
import com.bytedance.ee.larkbrand.hostbridge.sync.C13118f;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

/* renamed from: com.larksuite.component.openplatform.infra.network.base.c */
public class C25542c extends C12872h {

    /* renamed from: a */
    private DomainSettings.Alias f62175a;

    public C25542c(DomainSettings.Alias alias) {
        this.f62175a = alias;
    }

    /* renamed from: a */
    private String m91201a(DomainSettings.Alias alias) {
        CrossProcessDataEntity b = C13118f.m53717b("lark_get_domain", CrossProcessDataEntity.C67574a.m263013a().mo234760a("domain_alias", (Object) Integer.valueOf(alias.getValue())).mo234763b());
        if (b != null) {
            return b.mo234740a("domain", "");
        }
        return "";
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p636b.C12872h
    /* renamed from: a */
    public C12874a<C12867c> mo48533a(C12878e eVar, C12867c cVar) {
        DomainSettings.Alias alias = this.f62175a;
        if (alias == null) {
            return new C12874a<>(new ECONetworkException(" domain alias is null "));
        }
        String a = m91201a(alias);
        if (TextUtils.isEmpty(a)) {
            return new C12874a<>(new ECONetworkException(" domain  is null "));
        }
        cVar.mo48503a(a);
        return new C12874a<>(cVar);
    }
}
