package com.larksuite.component.openplatform.core.container.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.blockit.service.AbstractC24149b;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.larksuite.component.openplatform.core.block.C24417g;
import com.larksuite.component.openplatform.core.block.C24418h;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24468c;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24393c;
import com.lynx.tasm.base.LLog;
import com.tt.miniapp.event.lark.C66038a;
import com.tt.miniapp.webbridge.aysnc.SaveLogPlugin;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3367e.C67458d;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3410g.AbstractC67729a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.container.impl.f */
public class C24488f extends AbstractC24468c implements AbstractC24149b {

    /* renamed from: l */
    private boolean f60412l;

    /* renamed from: m */
    private volatile boolean f60413m;

    /* renamed from: n */
    private final List<JSTasks> f60414n = Collections.synchronizedList(new ArrayList());

    @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
    public void ai_() {
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: r */
    public boolean mo87300r() {
        return true;
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: e */
    public void mo87114e() {
        super.mo87114e();
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: g */
    public AppType mo87289g() {
        return AppType.BlockitApp;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87285a(ConcurrentLinkedDeque<AbstractC24387a> concurrentLinkedDeque) {
        concurrentLinkedDeque.add(new C24393c());
        super.mo87285a(concurrentLinkedDeque);
    }

    /* renamed from: A */
    private boolean m89311A() {
        return this.f60357g.getBoolean("has_creator");
    }

    /* renamed from: y */
    private boolean m89312y() {
        return HostDependManager.getInst().getFeatureGating("openplatform.block.api_save_log", false);
    }

    /* renamed from: z */
    private void m89313z() {
        if (TextUtils.equals(this.f60357g.getString("componentType"), "creator")) {
            this.f60412l = true;
        } else {
            this.f60412l = false;
        }
        AppBrandLogger.m52830i("OP_SDK_OPBlockitAppContainer", "initLaunchComponentMode, mMountCreator: ", Boolean.valueOf(this.f60412l), Integer.valueOf(hashCode()));
    }

    /* renamed from: s */
    public void mo87354s() {
        AppBrandLogger.m52830i("OP_SDK_OPBlockitAppContainer", "onWorkerReady execute tasks:" + this.f60414n.size());
        synchronized (this.f60414n) {
            for (JSTasks eVar : this.f60414n) {
                super.mo87110a(eVar.mo87349a(), eVar.mo87350b());
            }
            this.f60414n.clear();
            this.f60413m = true;
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b, com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d
    /* renamed from: a */
    public void mo87282a(AbstractC24364a aVar) {
        this.f60360j = null;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87281a(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("renderType", "blockit");
            bundle.putString("workerType", "blockit");
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public IAppContext mo87278a(Context context) {
        if (this.f60359i == null) {
            this.f60359i = new C67458d(context);
            this.f60359i.putExtra("APP_START", Long.valueOf(System.currentTimeMillis()));
        }
        return this.f60359i;
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87107a(ViewGroup viewGroup) {
        new C24417g("mp_app_launch_start", C24418h.f60271u, mo87113d()).flush();
        super.mo87107a(viewGroup);
        C66038a.m258620a("openplatform_website_block_instance_view", this.f60359i).flush();
        C24484d.m89302a(this.f60357g.getString("block_id"), this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b4  */
    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.larksuite.component.openplatform.api.p1100a.AbstractC24362a mo87279a(com.larksuite.component.openplatform.core.component.C24436d r12) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.container.impl.C24488f.mo87279a(com.larksuite.component.openplatform.core.component.d):com.larksuite.component.openplatform.api.a.a");
    }

    @Override // com.larksuite.component.blockit.service.AbstractC24149b
    /* renamed from: b */
    public void mo86663b(String str, String str2) {
        mo87288c(str, str2);
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: c */
    public void mo87288c(String str, String str2) {
        if (m89311A()) {
            AppBrandLogger.m52829e("OP_SDK_OPBlockitAppContainer", "updateData ONLY available in block");
            return;
        }
        try {
            mo87110a(str, new JSONObject(str2));
        } catch (JSONException e) {
            AppBrandLogger.m52829e("OP_SDK_OPBlockitAppContainer", str2, e.getMessage());
        }
    }

    public C24488f(OPContainerBundle oPContainerBundle, String str) {
        super(oPContainerBundle, str);
        m89313z();
        new C24417g("mp_app_container_start", C24418h.f60269s, this.f60359i).flush();
        this.f60359i.registerService(AbstractC24480a.class, new AbstractC24480a() {
            /* class com.larksuite.component.openplatform.core.container.impl.C24488f.C244891 */

            @Override // com.larksuite.component.openplatform.core.container.impl.AbstractC24480a
            /* renamed from: a */
            public void mo87348a() {
                C24488f.this.mo87354s();
            }
        });
        this.f60359i.registerService(AbstractC24459a.class, new C24483c());
        if ("force_update".equals(this.f60357g.getString("block_launch_type"))) {
            new C24417g("op_block_force_update", C24418h.f60268r, this.f60359i).flush();
        }
        boolean y = m89312y();
        AppBrandLogger.m52830i("OP_SDK_OPBlockitAppContainer", "enableSaveLog: ", Boolean.valueOf(y));
        if (y) {
            mo92183u().mo92199a(new SaveLogPlugin());
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87108a(OPContainerLifecycleEventEnum oPContainerLifecycleEventEnum, Object... objArr) {
        super.mo87108a(oPContainerLifecycleEventEnum, objArr);
        if (oPContainerLifecycleEventEnum.equals(OPContainerLifecycleEventEnum.ON_DESTROY)) {
            AbstractC67729a aVar = (AbstractC67729a) this.f60359i.findServiceByInterface(AbstractC67729a.class);
            if (aVar != null) {
                LLog.m96422b(aVar.mo235099a());
                LLog.m96414a(4);
                AppBrandLogger.m52830i("OP_SDK_OPBlockitAppContainer", "remove log " + aVar.mo235099a());
            }
            C24484d.m89303b(this.f60357g.getString("block_id"), this);
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87109a(Class cls, Object obj) {
        C67485a a = C67485a.m262488a(this.f60359i);
        if (a != null) {
            a.mo234274D().mo230964a(cls, obj);
            return;
        }
        AppBrandLogger.m52829e("OP_SDK_OPBlockitAppContainer", "appSingletonInstance is null!");
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b, com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
    /* renamed from: a */
    public void mo49119a(String str, String str2) {
        boolean z;
        super.mo49119a(str, str2);
        long currentTimeMillis = System.currentTimeMillis() - ((Long) this.f60359i.getExtra("APP_START")).longValue();
        Boolean bool = (Boolean) this.f60359i.getExtra("meta_cache");
        Boolean bool2 = (Boolean) this.f60359i.getExtra("package_cache");
        if (bool == null || bool2 == null || !bool.booleanValue() || !bool2.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        C66038a.m258620a("openplatform_website_block_instance_dev", this.f60359i).setDuration(currentTimeMillis).setResultTypeFail().addCategoryValue("cache", Boolean.valueOf(z)).flush();
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24361a, com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b
    /* renamed from: a */
    public void mo87110a(String str, JSONObject jSONObject) {
        if (!this.f60413m) {
            AppBrandLogger.m52829e("OP_SDK_OPBlockitAppContainer", "sendEventToJS: runtime not ready! ");
            synchronized (this.f60414n) {
                this.f60414n.add(new JSTasks(str, jSONObject));
            }
            return;
        }
        super.mo87110a(str, jSONObject);
    }
}
