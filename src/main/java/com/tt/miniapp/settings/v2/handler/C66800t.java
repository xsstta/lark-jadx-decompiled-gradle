package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.google.gson.Gson;
import com.tt.miniapp.settings.configs.PreLaunchSetting;

/* renamed from: com.tt.miniapp.settings.v2.handler.t */
public class C66800t extends AbstractC12744b {

    /* renamed from: a */
    private static final String f168537a = "t";

    /* renamed from: d */
    private static final AbstractC12790g<C66800t> f168538d = new AbstractC12790g<C66800t>() {
        /* class com.tt.miniapp.settings.v2.handler.C66800t.C668011 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66800t mo48227b(Context... contextArr) {
            return new C66800t();
        }
    };

    /* renamed from: b */
    private final Gson f168539b = new Gson();

    /* renamed from: c */
    private PreLaunchSetting f168540c;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "mini_app_pre_launch";
    }

    /* renamed from: a */
    public static final C66800t m260674a() {
        return f168538d.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public PreLaunchSetting mo232708b() {
        if (this.f168540c == null) {
            String settingFromLocal = getSettingFromLocal("mini_app_pre_launch", "");
            if (!TextUtils.isEmpty(settingFromLocal)) {
                this.f168540c = (PreLaunchSetting) this.f168539b.fromJson(settingFromLocal, PreLaunchSetting.class);
            }
        }
        return this.f168540c;
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("mini_app_pre_launch", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
