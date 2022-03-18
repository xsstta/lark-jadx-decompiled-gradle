package com.tt.miniapp.manager;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.util.C67866g;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.o */
public class C66467o {

    /* renamed from: com.tt.miniapp.manager.o$a */
    public interface AbstractC66469a {
        /* renamed from: b */
        void mo230316b();

        /* renamed from: c */
        void mo230317c();

        /* renamed from: d */
        void mo230318d();

        /* renamed from: e */
        void mo230319e();

        /* renamed from: f */
        void mo230320f();
    }

    /* renamed from: com.tt.miniapp.manager.o$b */
    public static class C66470b {

        /* renamed from: k */
        public static final C66470b f167774k = new C66470b();

        /* renamed from: a */
        public String f167775a;

        /* renamed from: b */
        public String f167776b;

        /* renamed from: c */
        public String f167777c;

        /* renamed from: d */
        public String f167778d;

        /* renamed from: e */
        public String f167779e;

        /* renamed from: f */
        public boolean f167780f;

        /* renamed from: g */
        public String f167781g;

        /* renamed from: h */
        public String f167782h;

        /* renamed from: i */
        public boolean f167783i;

        /* renamed from: j */
        public String f167784j;

        private C66470b() {
        }

        public String toString() {
            return "UserInfo{avatarUrl='" + this.f167775a + '\'' + ", nickName='" + this.f167776b + '\'' + ", gender='" + this.f167777c + '\'' + ", language='" + this.f167778d + '\'' + ", country='" + this.f167779e + '\'' + ", isLogin=" + this.f167780f + ", userId='" + this.f167781g + '\'' + ", sessionId='" + this.f167782h + '\'' + '}';
        }

        public C66470b(CrossProcessDataEntity crossProcessDataEntity) {
            this.f167775a = crossProcessDataEntity.mo234744b("avatarUrl");
            this.f167776b = crossProcessDataEntity.mo234744b("nickName");
            this.f167777c = crossProcessDataEntity.mo234744b("gender");
            this.f167779e = crossProcessDataEntity.mo234744b("country");
            this.f167780f = crossProcessDataEntity.mo234746d("isLogin");
            this.f167778d = crossProcessDataEntity.mo234744b("language");
            this.f167782h = crossProcessDataEntity.mo234744b("sessionId");
            this.f167781g = crossProcessDataEntity.mo234744b("userId");
            this.f167783i = crossProcessDataEntity.mo234746d("isVerified");
            this.f167784j = crossProcessDataEntity.mo234744b("authInfo");
        }
    }

    /* renamed from: a */
    public static C66470b m259788a(IAppContext iAppContext) {
        CrossProcessDataEntity f = C67556a.m262949f();
        if (f != null) {
            return new C66470b(f);
        }
        m259792b(iAppContext);
        return C66470b.f167774k;
    }

    /* renamed from: b */
    private static void m259792b(IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", "ipc userinfo emtpy");
        } catch (JSONException unused) {
        }
        C67509b.m262587a("mp_userinfo_lost", 20001, jSONObject, iAppContext);
    }

    /* renamed from: a */
    public static void m259790a(AbstractC66469a aVar, HashMap<String, Object> hashMap, IAppContext iAppContext) {
        m259789a(iAppContext.getCurrentActivity(), aVar, hashMap, true, iAppContext);
    }

    /* renamed from: a */
    public static boolean m259791a(int i, int i2, Intent intent, final AbstractC66469a aVar, final IAppContext iAppContext) {
        if (!HostDependManager.getInst().handleActivityLoginResult(i, i2, intent)) {
            return false;
        }
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.manager.C66467o.C664681 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                if (C66467o.m259788a(iAppContext).f167780f) {
                    AppBrandLogger.m52828d("UserInfoManager", "host client login success");
                    C66020b.m258530a("mp_login_page_result", iAppContext).mo231090a("result_type", "success").mo231092a();
                    aVar.mo230316b();
                    return;
                }
                AppBrandLogger.m52828d("UserInfoManager", "host client login fail");
                C66020b.m258530a("mp_login_page_result", iAppContext).mo231090a("result_type", "close").mo231092a();
                aVar.mo230318d();
            }
        }, C67554l.m262725b());
        return true;
    }

    /* renamed from: a */
    public static void m259789a(Activity activity, AbstractC66469a aVar, HashMap<String, Object> hashMap, boolean z, IAppContext iAppContext) {
        AppBrandLogger.m52828d("UserInfoManager", "requestLoginHostClient");
        if (activity == null) {
            aVar.mo230318d();
        } else if (!z || !AppbrandApplicationImpl.getInst(iAppContext).getForeBackgroundManager().mo231962d()) {
            AppBrandLogger.m52830i("UserInfoManager", "requestLoginHostClient when foreground");
            if (!HostDependManager.getInst().openLoginActivity(activity, hashMap)) {
                aVar.mo230320f();
                return;
            }
            AppBrandLogger.m52828d("UserInfoManager", "triggerHostClientLogin");
            aVar.mo230317c();
            C66020b.m258530a("mp_login_page_show", iAppContext).mo231092a();
        } else {
            AppBrandLogger.m52830i("UserInfoManager", "requestLoginHostClient when background or going background");
            aVar.mo230319e();
        }
    }
}
