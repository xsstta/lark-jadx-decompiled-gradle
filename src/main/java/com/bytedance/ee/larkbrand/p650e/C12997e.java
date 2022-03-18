package com.bytedance.ee.larkbrand.p650e;

import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.hostbridge.async.GetUserInfoExHandler;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13079a;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13081b;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13083c;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13086e;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13089g;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13090h;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13092i;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13094j;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13097k;
import com.bytedance.ee.larkbrand.hostbridge.p655a.C13100l;
import com.bytedance.ee.larkbrand.permission.C13299j;
import com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25107c;
import com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25111e;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import com.tt.option.p3384e.C67613a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.e.e */
public class C12997e extends C67613a {
    @Override // com.tt.option.p3384e.C67613a, com.tt.option.p3384e.AbstractC67614b
    public List<AbstractC67571b> createSyncHostDataHandlerList() {
        return C13046y.m53528a(LarkHostDependManager.f34682b.mo49086a().mo48919b());
    }

    @Override // com.tt.option.p3384e.C67613a, com.tt.option.p3384e.AbstractC67614b
    public List<AbstractC67728b> createAsyncHostDataHandlerV2List() {
        AbstractC41371j b = LarkHostDependManager.f34682b.mo49086a().mo48919b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13094j());
        arrayList.add(new C13097k());
        arrayList.add(new C13081b(b));
        arrayList.add(new C25111e());
        arrayList.add(new C25107c());
        arrayList.add(new C13299j());
        return arrayList;
    }

    @Override // com.tt.option.p3384e.C67613a, com.tt.option.p3384e.AbstractC67614b
    public List<AbstractC67570a> createAsyncHostDataHandlerList() {
        AbstractC41371j b = LarkHostDependManager.f34682b.mo49086a().mo48919b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13079a());
        arrayList.add(new C13100l());
        arrayList.add(new C13086e());
        arrayList.add(new C13083c(b));
        arrayList.add(new GetUserInfoExHandler(b));
        arrayList.add(new C13089g());
        arrayList.add(new C13090h());
        arrayList.add(new C13092i());
        return arrayList;
    }
}
