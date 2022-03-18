package com.larksuite.component.openplatform.core.container.impl;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.larksuite.component.blockit.AbstractC24073e;
import com.larksuite.component.blockit.AbstractC24076f;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.service.AbstractC24149b;
import com.larksuite.component.blockit.service.AbstractC24150c;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.api.entity.BlockInitData;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24369b;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24370c;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24371d;
import com.larksuite.component.openplatform.core.block.C24417g;
import com.larksuite.component.openplatform.core.container.impl.C24481b;
import com.larksuite.component.openplatform.core.p1106a.C24401b;
import com.tt.miniapp.event.lark.C66038a;
import com.tt.refer.common.base.AppType;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.container.impl.d */
public class C24484d {

    /* renamed from: a */
    private static boolean f60406a = true;

    /* renamed from: b */
    private static AbstractC24150c f60407b;

    /* renamed from: a */
    public static void m89301a(AbstractC24150c cVar) {
        f60407b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m89298a(AbstractC24073e eVar) {
        if (eVar != null) {
            AppBrandLogger.m52830i("BlockProvider", "loadingTimeOut");
            eVar.mo86341c();
        }
    }

    /* renamed from: a */
    public static synchronized void m89302a(String str, AbstractC24149b bVar) {
        synchronized (C24484d.class) {
            AbstractC24150c cVar = f60407b;
            if (cVar != null) {
                cVar.mo86304a(str, bVar);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m89303b(String str, AbstractC24149b bVar) {
        synchronized (C24484d.class) {
            AbstractC24150c cVar = f60407b;
            if (cVar != null) {
                cVar.mo86308b(str, bVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m89299a(AbstractC24073e eVar, ViewGroup viewGroup, Runnable runnable, AbstractC24361a aVar) {
        if (eVar != null) {
            viewGroup.removeCallbacks(runnable);
            eVar.mo86339b();
        }
        new C24417g("op_block_hide_loading", aVar.mo87113d()).flush();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m89300a(AbstractC24073e eVar, ViewGroup viewGroup, Runnable runnable, JSONObject jSONObject) {
        AppBrandLogger.m52830i("BlockProvider", "onConfig load " + jSONObject);
        boolean optBoolean = jSONObject.optBoolean("useStartLoading");
        if (eVar != null) {
            eVar.mo86336a(new AbstractC24073e.C24074a(optBoolean, jSONObject));
        }
        if (optBoolean) {
            AppBrandLogger.m52830i("BlockProvider", "showLoading");
            viewGroup.postDelayed(runnable, 10000);
        }
    }

    /* renamed from: a */
    public static void m89296a(ViewGroup viewGroup, BlockEntity blockEntity, OPContainerBundle oPContainerBundle, final AbstractC24073e eVar) {
        long currentTimeMillis = System.currentTimeMillis();
        Bundle c = oPContainerBundle.mo87152c();
        c.putSerializable(C24377a.f60160e, AppType.BlockitApp);
        c.putString(C24377a.f60157b, blockEntity.getBlockTypeID());
        c.putString("block_id", blockEntity.getBlockID());
        String json = new Gson().toJson(blockEntity);
        BlockInitData blockInitData = (BlockInitData) new Gson().fromJson(c.getString(C24377a.f60162g), BlockInitData.class);
        for (OPContainerBundle.C24376a aVar : oPContainerBundle.mo87143a()) {
            blockInitData.customApis.add(new BlockInitData.CustomApis(aVar.f60154a, aVar.f60155b.getType()));
        }
        if (oPContainerBundle.f60145a != null) {
            blockInitData.host = oPContainerBundle.f60145a;
            String string = oPContainerBundle.mo87152c().getString("typedDataCollection");
            if (TextUtils.isEmpty(string)) {
                string = "{}";
            }
            blockInitData.typedDataCollection = new JsonParser().parse(string).getAsJsonObject();
            c.putString("host", blockInitData.host);
            c.putString(C24377a.f60161f, json);
            c.putString(C24377a.f60162g, new Gson().toJson(blockInitData));
            AppBrandLogger.m52830i("BlockProvider", "mountBlock  blockTypeID" + blockEntity.getBlockTypeID() + " init_data" + json);
            $$Lambda$d$HYOasduryctJB0FbHAvHOzfDNkM r8 = new Runnable() {
                /* class com.larksuite.component.openplatform.core.container.impl.$$Lambda$d$HYOasduryctJB0FbHAvHOzfDNkM */

                public final void run() {
                    C24484d.lambda$HYOasduryctJB0FbHAvHOzfDNkM(AbstractC24073e.this);
                }
            };
            oPContainerBundle.mo87146a(new AbstractC24369b(viewGroup, r8) {
                /* class com.larksuite.component.openplatform.core.container.impl.$$Lambda$d$aDtE69Ziw3JqwfLFKsuqoL4msPw */
                public final /* synthetic */ ViewGroup f$1;
                public final /* synthetic */ Runnable f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24369b
                public final void onConfigLoaded(JSONObject jSONObject) {
                    C24484d.lambda$aDtE69Ziw3JqwfLFKsuqoL4msPw(AbstractC24073e.this, this.f$1, this.f$2, jSONObject);
                }
            });
            oPContainerBundle.mo87147a(new AbstractC24370c() {
                /* class com.larksuite.component.openplatform.core.container.impl.C24484d.C244851 */

                @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
                public void ai_() {
                }

                @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
                /* renamed from: a */
                public void mo49118a() {
                    AppBrandLogger.m52830i("BlockProvider", "onLaunchSuccess");
                    AbstractC24073e eVar = eVar;
                    if (eVar != null) {
                        eVar.mo86335a();
                    }
                }

                @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
                /* renamed from: a */
                public void mo49119a(String str, String str2) {
                    AppBrandLogger.m52829e("BlockProvider", "initGadgetApp : errCode：" + str + " & " + str2);
                    AbstractC24073e eVar = eVar;
                    if (eVar != null) {
                        eVar.mo86340b(str, str2);
                    }
                }
            });
            oPContainerBundle.mo87148a(new AbstractC24371d() {
                /* class com.larksuite.component.openplatform.core.container.impl.C24484d.C244862 */

                @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24371d
                /* renamed from: a */
                public void mo87137a() {
                    AppBrandLogger.m52830i("BlockProvider", "onUpdateReady");
                    AbstractC24073e eVar = eVar;
                    if (eVar != null) {
                        eVar.mo86342d();
                    }
                }
            });
            C24401b.m89051c().mo87131a(viewGroup.getContext());
            AbstractC24361a a = C24401b.m89051c().mo87130a(blockEntity.getAppID()).mo87126a(oPContainerBundle);
            if (a == null) {
                AppBrandLogger.m52830i("BlockProvider", "onMountFail appContainer null");
                if (eVar != null) {
                    eVar.mo86338a("-10001", "no  container");
                    return;
                }
                return;
            }
            m89297a(viewGroup, blockEntity, oPContainerBundle, eVar, c, blockInitData, r8, a);
            a.mo87108a(OPContainerLifecycleEventEnum.ON_CREATE, new Object[0]);
            a.mo87107a(viewGroup);
            if (f60406a) {
                C66038a.m258620a("openplatform_website_blockit_init_dev", a.mo87113d()).setResultTypeSuccess().setDuration(System.currentTimeMillis() - currentTimeMillis).flush();
                f60406a = false;
                return;
            }
            return;
        }
        eVar.mo86338a("-10002", "not config block host");
    }

    /* renamed from: a */
    private static void m89297a(ViewGroup viewGroup, BlockEntity blockEntity, OPContainerBundle oPContainerBundle, AbstractC24073e eVar, Bundle bundle, BlockInitData blockInitData, Runnable runnable, AbstractC24361a aVar) {
        aVar.mo92183u().mo92199a(new C24481b(new C24481b.AbstractC24482a(viewGroup, runnable, aVar) {
            /* class com.larksuite.component.openplatform.core.container.impl.$$Lambda$d$2wvdmBW28xvrLZz9oOAViX76ykc */
            public final /* synthetic */ ViewGroup f$1;
            public final /* synthetic */ Runnable f$2;
            public final /* synthetic */ AbstractC24361a f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.larksuite.component.openplatform.core.container.impl.C24481b.AbstractC24482a
            public final void onHideLoadingCalled() {
                C24484d.lambda$2wvdmBW28xvrLZz9oOAViX76ykc(AbstractC24073e.this, this.f$1, this.f$2, this.f$3);
            }
        }));
        if ("force_update".equals(bundle.getString("block_launch_type"))) {
            aVar.mo87113d().putExtra("FORCE_UPDATE", true);
        }
        aVar.mo87113d().putExtra("host", blockInitData.host);
        aVar.mo87113d().putExtra("block_id", blockEntity.getBlockID());
        if (!TextUtils.isEmpty(oPContainerBundle.f60146b)) {
            aVar.mo87113d().putExtra("containerID", oPContainerBundle.f60146b);
        } else {
            aVar.mo87113d().putExtra("containerID", "");
        }
        if (eVar != null) {
            eVar.mo86337a(aVar);
        }
        if ("creator".equals(bundle.getString("componentType"))) {
            C244873 r3 = new AbstractC24076f() {
                /* class com.larksuite.component.openplatform.core.container.impl.C24484d.C244873 */

                @Override // com.larksuite.component.blockit.AbstractC24076f
                /* renamed from: a */
                public void mo86424a() {
                }

                @Override // com.larksuite.component.blockit.AbstractC24076f
                /* renamed from: a */
                public void mo86425a(BlockEntity blockEntity) {
                }
            };
            aVar.mo92183u().mo92199a(new SetBlockInfoPlugin(r3));
            aVar.mo92183u().mo92199a(new CancelPlugin(r3));
        }
    }
}
