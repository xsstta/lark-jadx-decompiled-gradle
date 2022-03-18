package com.tt.miniapp.p3298k;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24636a;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.aa.C65722b;
import com.tt.miniapp.p3298k.AbstractC66269f;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.p3382c.C67602b;
import com.tt.refer.common.util.C67866g;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.k.g */
public class C66273g {

    /* renamed from: a */
    public AbstractC66281a f167263a;

    /* renamed from: b */
    public C66267e f167264b;

    /* renamed from: c */
    public C66264c f167265c;

    /* renamed from: d */
    public IAppContext f167266d;

    /* renamed from: com.tt.miniapp.k.g$a */
    public interface AbstractC66281a {
        /* renamed from: a */
        Activity mo231038a();

        /* renamed from: b */
        boolean mo231039b();
    }

    /* renamed from: g */
    private void m259319g() {
        C66263b.m259267a(false, this.f167266d);
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.p3298k.C66273g.RunnableC662806 */

            public void run() {
                HostDependManager.getInst().showToast(C66273g.this.f167263a.mo231038a(), null, C66273g.this.f167263a.mo231038a().getString(R.string.microapp_m_favorite_fail), 0, null);
            }
        });
    }

    /* renamed from: b */
    public void mo231671b() {
        C66267e eVar = this.f167264b;
        if (eVar != null) {
            eVar.mo231655a(false);
            this.f167264b = null;
        }
    }

    /* renamed from: c */
    public void mo231672c() {
        C66264c cVar = this.f167265c;
        if (cVar != null) {
            cVar.mo231655a(false);
            this.f167265c = null;
        }
    }

    /* renamed from: e */
    public void mo231674e() {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.p3298k.C66273g.C662774 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                if (C66273g.this.mo231675f()) {
                    C67866g.m264027a(new Runnable() {
                        /* class com.tt.miniapp.p3298k.C66273g.C662774.RunnableC662781 */

                        public void run() {
                            C66273g.this.mo231670a();
                        }
                    });
                }
            }
        }, Schedulers.longIO());
    }

    /* renamed from: a */
    public void mo231670a() {
        mo231671b();
        mo231672c();
    }

    /* renamed from: d */
    public void mo231673d() {
        if (C65722b.m257660a(this.f167266d).mo230313a()) {
            mo231674e();
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("key_favorite_login_flag", "");
        C65722b.m257660a(this.f167266d).mo230312a(new C65722b.AbstractC65725a() {
            /* class com.tt.miniapp.p3298k.C66273g.C662763 */

            @Override // com.tt.miniapp.aa.C65722b.AbstractC65725a
            /* renamed from: b */
            public void mo230322b() {
            }

            @Override // com.tt.miniapp.aa.C65722b.AbstractC65725a
            /* renamed from: d */
            public void mo230324d() {
            }

            @Override // com.tt.miniapp.aa.C65722b.AbstractC65725a
            /* renamed from: e */
            public void mo230325e() {
            }

            @Override // com.tt.miniapp.aa.C65722b.AbstractC65725a
            /* renamed from: a */
            public void mo230321a() {
                C66273g.this.mo231674e();
            }

            @Override // com.tt.miniapp.aa.C65722b.AbstractC65725a
            /* renamed from: c */
            public void mo230323c() {
                String str;
                C66263b.m259267a(false, C66273g.this.f167266d);
                C67602b hostCustomFavoriteEntity = HostDependManager.getInst().getHostCustomFavoriteEntity(C66273g.this.f167263a.mo231038a());
                if (C66273g.this.f167263a.mo231039b()) {
                    str = hostCustomFavoriteEntity.mo234857f();
                } else {
                    str = hostCustomFavoriteEntity.mo234856e();
                }
                HostDependManager.getInst().showToast(C66273g.this.f167263a.mo231038a(), null, str, 0, null);
            }
        }, hashMap);
    }

    /* renamed from: f */
    public boolean mo231675f() {
        boolean z;
        boolean z2;
        try {
            JSONObject jSONObject = new JSONObject(C24636a.m89711a(AppbrandApplicationImpl.getInst(this.f167266d).getAppInfo().appId, this.f167266d));
            int optInt = jSONObject.optInt("error", 1);
            AppBrandLogger.m52828d("FavoriteGuideWidget", "addMiniAppToFavoriteList", "error == ", Integer.valueOf(optInt));
            if (optInt == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    z2 = optJSONObject.optBoolean("isFirst", false);
                } else {
                    z2 = false;
                }
                m259316a(z2);
                return true;
            }
            AppBrandLogger.m52828d("FavoriteGuideWidget", "addMiniAppToFavoriteList", jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "not errMsg"));
            m259319g();
            return false;
        } catch (Exception e) {
            AppBrandLogger.m52829e("FavoriteGuideWidget", e);
        }
    }

    /* renamed from: a */
    public static void m259315a(IAppContext iAppContext) {
        m259314a(0, iAppContext);
    }

    /* renamed from: a */
    private void m259316a(final boolean z) {
        C66263b.m259267a(true, this.f167266d);
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.p3298k.C66273g.RunnableC662795 */

            public void run() {
                if (z) {
                    AppBrandLogger.m52828d("FavoriteGuideWidget", "addMiniAppToFavoriteList", "firstFavorite");
                    HostDependManager.getInst().firstFavoriteAction();
                    return;
                }
                HostDependManager.getInst().showToast(C66273g.this.f167263a.mo231038a(), null, C66273g.this.f167263a.mo231038a().getString(R.string.microapp_m_favorite_success), 0, "success");
            }
        });
    }

    /* renamed from: b */
    private ApiResult m259317b(C66266d dVar) {
        C66264c cVar = new C66264c(dVar, new AbstractC66269f.AbstractC66272a() {
            /* class com.tt.miniapp.p3298k.C66273g.C662741 */

            @Override // com.tt.miniapp.p3298k.AbstractC66269f.AbstractC66272a
            /* renamed from: c */
            public void mo231667c() {
                C66273g.this.f167265c = null;
            }

            @Override // com.tt.miniapp.p3298k.AbstractC66269f.AbstractC66272a
            /* renamed from: d */
            public void mo231668d() {
                C66273g.this.mo231673d();
            }

            @Override // com.tt.miniapp.p3298k.AbstractC66269f.AbstractC66272a
            /* renamed from: a */
            public Activity mo231665a() {
                return C66273g.this.f167263a.mo231038a();
            }

            @Override // com.tt.miniapp.p3298k.AbstractC66269f.AbstractC66272a
            /* renamed from: b */
            public boolean mo231666b() {
                return C66273g.this.f167263a.mo231039b();
            }
        }, this.f167266d);
        ApiResult g = cVar.mo231644g();
        if (!g.success) {
            return g;
        }
        mo231672c();
        cVar.mo231638c();
        this.f167265c = cVar;
        return ApiResult.success();
    }

    /* renamed from: c */
    private ApiResult m259318c(C66266d dVar) {
        C66267e eVar = new C66267e(dVar, new AbstractC66269f.AbstractC66272a() {
            /* class com.tt.miniapp.p3298k.C66273g.C662752 */

            @Override // com.tt.miniapp.p3298k.AbstractC66269f.AbstractC66272a
            /* renamed from: c */
            public void mo231667c() {
                C66273g.this.f167264b = null;
            }

            @Override // com.tt.miniapp.p3298k.AbstractC66269f.AbstractC66272a
            /* renamed from: d */
            public void mo231668d() {
                C66273g.this.mo231673d();
            }

            @Override // com.tt.miniapp.p3298k.AbstractC66269f.AbstractC66272a
            /* renamed from: a */
            public Activity mo231665a() {
                return C66273g.this.f167263a.mo231038a();
            }

            @Override // com.tt.miniapp.p3298k.AbstractC66269f.AbstractC66272a
            /* renamed from: b */
            public boolean mo231666b() {
                return C66273g.this.f167263a.mo231039b();
            }
        }, this.f167266d);
        ApiResult g = eVar.mo231644g();
        if (!g.success) {
            return g;
        }
        mo231671b();
        eVar.mo231638c();
        this.f167264b = eVar;
        return ApiResult.success();
    }

    /* renamed from: a */
    public ApiResult mo231669a(C66266d dVar) {
        ApiResult a = C66282h.m259342a(this.f167266d);
        if (!a.success) {
            return a;
        }
        if (C66282h.m259344b(this.f167266d)) {
            return ApiResult.fail("launch from feed not support favorites tip");
        }
        if (this.f167263a.mo231039b() && !"tip".equals(dVar.f167250a)) {
            return ApiResult.fail("game not support floating tip");
        }
        if ("tip".equals(dVar.f167250a)) {
            return m259318c(dVar);
        }
        return m259317b(dVar);
    }

    public C66273g(AbstractC66281a aVar, IAppContext iAppContext) {
        this.f167263a = aVar;
        this.f167266d = iAppContext;
    }

    /* renamed from: a */
    public static void m259314a(int i, IAppContext iAppContext) {
        AbstractC67497e activityProxy;
        Activity currentActivity = iAppContext.getCurrentActivity();
        if ((currentActivity instanceof MiniappHostBase) && (activityProxy = ((MiniappHostBase) currentActivity).getActivityProxy()) != null) {
            activityProxy.mo231010c(i);
        }
    }
}
