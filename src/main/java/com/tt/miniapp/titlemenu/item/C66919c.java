package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24636a;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24644c;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24648e;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.p3298k.C66273g;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.util.C67866g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.titlemenu.item.c */
public class C66919c extends C66937e {

    /* renamed from: b */
    public static LinkedHashSet<String> f168793b;

    /* renamed from: a */
    public final Activity f168794a;

    /* renamed from: c */
    private C66899a f168795c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.titlemenu.item.c$b */
    public interface AbstractC66933b {
        /* renamed from: a */
        void mo232955a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.titlemenu.item.c$c */
    public interface AbstractC66934c {
        /* renamed from: a */
        void mo232953a();
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "favorite_mini_app";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public final C66899a mo49184b() {
        return this.f168795c;
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: c */
    public void mo232939c() {
        boolean a = m260966a(this.f168835d);
        mo49184b().setLabel(m260964a((Context) this.f168794a, a));
        mo49184b().setIcon(m260963a(this.f168794a, a));
    }

    /* renamed from: com.tt.miniapp.titlemenu.item.c$a */
    public static class C66931a extends AbstractC67550j {

        /* renamed from: a */
        public static boolean f168826a;

        /* renamed from: b */
        public static AbstractC66934c f168827b;

        /* renamed from: c */
        public static AbstractC66933b f168828c;

        /* renamed from: d */
        public static IAppContext f168829d;

        /* renamed from: e */
        public static C66467o.AbstractC66469a f168830e = new C66467o.AbstractC66469a() {
            /* class com.tt.miniapp.titlemenu.item.C66919c.C66931a.C669321 */

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: c */
            public void mo230317c() {
                AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "onTriggerHostClientLogin");
                C66931a.f168826a = true;
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: e */
            public void mo230319e() {
                AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "onLoginWhenBackground");
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: f */
            public void mo230320f() {
                AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "onLoginUnSupport");
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: b */
            public void mo230316b() {
                AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "onLoginSuccess");
                if (C66931a.f168827b != null) {
                    C66931a.f168827b.mo232953a();
                    C24644c.m89720a(C66931a.f168829d);
                }
            }

            @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
            /* renamed from: d */
            public void mo230318d() {
                AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "onLoginFail");
                if (C66931a.f168828c != null) {
                    C66931a.f168828c.mo232955a();
                }
            }
        };

        @Override // com.tt.miniapphost.AbstractC67550j
        /* renamed from: a */
        public String mo49103a() {
            return null;
        }

        @Override // com.tt.miniapphost.AbstractC67550j
        /* renamed from: a */
        public <T> String mo49104a(String str, AbstractC67550j.AbstractC67551a<T> aVar) {
            return null;
        }

        public C66931a(AppbrandContext appbrandContext) {
            super(appbrandContext);
        }

        /* renamed from: a */
        public static void m260975a(IAppContext iAppContext) {
            f168829d = iAppContext;
        }

        /* renamed from: a */
        public static void m260976a(AbstractC66933b bVar) {
            f168828c = bVar;
        }

        /* renamed from: a */
        public static void m260977a(AbstractC66934c cVar) {
            f168827b = cVar;
        }

        @Override // com.tt.miniapphost.AbstractC67550j
        /* renamed from: a */
        public boolean mo49465a(int i, int i2, Intent intent) {
            C66467o.AbstractC66469a aVar;
            if (!f168826a || (aVar = f168830e) == null) {
                return false;
            }
            return C66467o.m259791a(i, i2, intent, aVar, f168829d);
        }
    }

    /* renamed from: a */
    public static boolean m260966a(IAppContext iAppContext) {
        LinkedHashSet<String> b = C66612a.m260233b();
        String str = C67432a.m262319a(iAppContext).getAppInfo().appId;
        if (b != null) {
            Iterator<String> it = b.iterator();
            while (it.hasNext()) {
                if (str.contentEquals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m260965a(android.content.Context r12) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.titlemenu.item.C66919c.m260965a(android.content.Context):boolean");
    }

    /* renamed from: b */
    public boolean mo232948b(String str) {
        final String str2;
        final String str3;
        boolean z;
        final Activity currentActivity = this.f168835d.getCurrentActivity();
        C66020b.m258530a("mp_collect_cancel", this.f168835d).mo231092a();
        if (AppbrandContext.getInst().isGame()) {
            str2 = HostDependManager.getInst().getHostCustomFavoriteEntity(currentActivity).mo234863l();
        } else {
            str2 = HostDependManager.getInst().getHostCustomFavoriteEntity(currentActivity).mo234862k();
        }
        if (AppbrandContext.getInst().isGame()) {
            str3 = HostDependManager.getInst().getHostCustomFavoriteEntity(currentActivity).mo234865n();
        } else {
            str3 = HostDependManager.getInst().getHostCustomFavoriteEntity(currentActivity).mo234864m();
        }
        String a = C24648e.m89727a(str, this.f168835d);
        if (a == null) {
            C66020b.m258530a("mp_collect_cancel_result", this.f168835d).mo231090a("result_type", "fail").mo231092a();
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.titlemenu.item.C66919c.RunnableC669309 */

                public void run() {
                    HostDependManager.getInst().showToast(currentActivity, null, str3, 0, null);
                }
            });
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(a);
            int optInt = jSONObject.optInt("error", 1);
            AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "removeMiniAppFromFavoriteList", "error == ", Integer.valueOf(optInt));
            if (optInt == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C66020b.m258530a("mp_collect_cancel_result", this.f168835d).mo231090a("result_type", "success").mo231092a();
                C67866g.m264027a(new Runnable() {
                    /* class com.tt.miniapp.titlemenu.item.C66919c.AnonymousClass10 */

                    public void run() {
                        HostDependManager.getInst().showToast(currentActivity, null, str2, 0, "success");
                    }
                });
                return true;
            }
            AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "removeMiniAppFromFavoriteList", jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "not errMsg"));
            C66020b.m258530a("mp_collect_cancel_result", this.f168835d).mo231090a("result_type", "fail").mo231092a();
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.titlemenu.item.C66919c.RunnableC669222 */

                public void run() {
                    HostDependManager.getInst().showToast(currentActivity, null, str3, 0, null);
                }
            });
            return false;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("FavoriteMiniAppMenuItem", e);
        }
    }

    /* renamed from: a */
    public boolean mo232947a(String str) {
        final String str2;
        final String str3;
        boolean z;
        final Activity currentActivity = this.f168835d.getCurrentActivity();
        C66020b.m258530a("mp_collect_click", this.f168835d).mo231092a();
        if (AppbrandContext.getInst().isGame()) {
            str2 = HostDependManager.getInst().getHostCustomFavoriteEntity(currentActivity).mo234859h();
        } else {
            str2 = HostDependManager.getInst().getHostCustomFavoriteEntity(currentActivity).mo234858g();
        }
        if (AppbrandContext.getInst().isGame()) {
            str3 = HostDependManager.getInst().getHostCustomFavoriteEntity(currentActivity).mo234861j();
        } else {
            str3 = HostDependManager.getInst().getHostCustomFavoriteEntity(currentActivity).mo234860i();
        }
        String a = C24636a.m89711a(str, this.f168835d);
        if (a == null) {
            C66020b.m258530a("mp_collect_click_result", this.f168835d).mo231090a("result_type", "fail").mo231092a();
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.titlemenu.item.C66919c.RunnableC669276 */

                public void run() {
                    HostDependManager.getInst().showToast(currentActivity, null, str3, 0, null);
                }
            });
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(a);
            int optInt = jSONObject.optInt("error", 1);
            AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "addMiniAppToFavoriteList", "error == ", Integer.valueOf(optInt));
            if (optInt == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C66020b.m258530a("mp_collect_click_result", this.f168835d).mo231090a("result_type", "success").mo231092a();
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    final boolean optBoolean = optJSONObject.optBoolean("isFirst", false);
                    C67866g.m264027a(new Runnable() {
                        /* class com.tt.miniapp.titlemenu.item.C66919c.RunnableC669287 */

                        public void run() {
                            if (optBoolean) {
                                AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "addMiniAppToFavoriteList", "firstFavorite");
                                HostDependManager.getInst().firstFavoriteAction();
                                return;
                            }
                            HostDependManager.getInst().showToast(currentActivity, null, str2, 0, "success");
                        }
                    });
                }
                return true;
            }
            AppBrandLogger.m52828d("FavoriteMiniAppMenuItem", "addMiniAppToFavoriteList", jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "not errMsg"));
            C66020b.m258530a("mp_collect_click_result", this.f168835d).mo231090a("result_type", "fail").mo231092a();
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.titlemenu.item.C66919c.RunnableC669298 */

                public void run() {
                    HostDependManager.getInst().showToast(currentActivity, null, str3, 0, null);
                }
            });
            return false;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("FavoriteMiniAppMenuItem", e);
        }
    }

    /* renamed from: a */
    private Drawable m260963a(Activity activity, boolean z) {
        if (z) {
            return activity.getDrawable(2131234583);
        }
        return activity.getDrawable(2131234579);
    }

    public C66919c(Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        this.f168794a = activity;
        this.f168795c = new C66899a(activity, iAppContext);
        boolean a = m260966a(iAppContext);
        this.f168795c.setIcon(m260963a(activity, a));
        this.f168795c.setLabel(m260964a((Context) activity, a));
        this.f168795c.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66919c.View$OnClickListenerC669201 */

            public void onClick(View view) {
                C67866g.m264025a(new Action() {
                    /* class com.tt.miniapp.titlemenu.item.C66919c.View$OnClickListenerC669201.C669211 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                    public void act() {
                        C66919c.this.mo232946a(C66919c.this.f168794a, C66919c.m260966a(iAppContext), C67432a.m262319a(iAppContext).getAppInfo().appId);
                        DialogC66908d.m260930a(iAppContext).dismiss();
                    }
                }, Schedulers.longIO());
            }
        });
        if (m260965a(activity)) {
            this.f168795c.setVisibility(0);
        } else {
            this.f168795c.setVisibility(8);
        }
    }

    /* renamed from: a */
    private String m260964a(Context context, boolean z) {
        String str;
        String str2;
        if (AppbrandContext.getInst().isGame()) {
            str = HostDependManager.getInst().getHostCustomFavoriteEntity(context).mo234853b();
        } else {
            str = HostDependManager.getInst().getHostCustomFavoriteEntity(context).mo234852a();
        }
        if (AppbrandContext.getInst().isGame()) {
            str2 = HostDependManager.getInst().getHostCustomFavoriteEntity(context).mo234855d();
        } else {
            str2 = HostDependManager.getInst().getHostCustomFavoriteEntity(context).mo234854c();
        }
        return z ? str2 : str;
    }

    /* renamed from: a */
    public void mo232946a(final Context context, final boolean z, final String str) {
        if (!C66467o.m259788a(this.f168835d).f167780f) {
            C66931a.m260975a(this.f168835d);
            C66931a.m260977a(new AbstractC66934c() {
                /* class com.tt.miniapp.titlemenu.item.C66919c.C669244 */

                @Override // com.tt.miniapp.titlemenu.item.C66919c.AbstractC66934c
                /* renamed from: a */
                public void mo232953a() {
                    if (z) {
                        C66919c.this.mo232948b(str);
                    } else if (C66919c.this.mo232947a(str)) {
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.titlemenu.item.C66919c.C669244.RunnableC669251 */

                            public void run() {
                                C66273g.m259315a(C66919c.this.f168835d);
                            }
                        });
                    }
                }
            });
            C66931a.m260976a(new AbstractC66933b() {
                /* class com.tt.miniapp.titlemenu.item.C66919c.C669265 */

                @Override // com.tt.miniapp.titlemenu.item.C66919c.AbstractC66933b
                /* renamed from: a */
                public void mo232955a() {
                    String str;
                    if (!z) {
                        if (AppbrandContext.getInst().isGame()) {
                            str = HostDependManager.getInst().getHostCustomFavoriteEntity(context).mo234857f();
                        } else {
                            str = HostDependManager.getInst().getHostCustomFavoriteEntity(context).mo234856e();
                        }
                        HostDependManager.getInst().showToast(context, null, str, 0, null);
                    }
                }
            });
            if (C66931a.f168830e != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("key_favorite_login_flag", "");
                C66467o.m259790a(C66931a.f168830e, hashMap, this.f168835d);
                return;
            }
            AppBrandLogger.m52829e("FavoriteMiniAppMenuItem", "mHostClientLoginListener can't be null!");
        } else if (z) {
            mo232948b(str);
        } else if (mo232947a(str)) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.titlemenu.item.C66919c.RunnableC669233 */

                public void run() {
                    C66273g.m259315a(C66919c.this.f168835d);
                }
            });
        }
    }
}
