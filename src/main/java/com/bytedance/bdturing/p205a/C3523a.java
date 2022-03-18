package com.bytedance.bdturing.p205a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.bytedance.bdturing.C3520a;
import com.bytedance.bdturing.C3567l;
import com.bytedance.bdturing.EventReport;
import com.bytedance.bdturing.net.HttpClient;
import com.bytedance.bdturing.setting.ConfigProvider;
import com.bytedance.bdturing.setting.ServiceInterceptor;
import com.bytedance.bdturing.setting.SettingUpdateRequest;
import com.bytedance.bdturing.setting.SettingsManager;

/* renamed from: com.bytedance.bdturing.a.a */
public class C3523a {

    /* renamed from: a */
    private static SettingUpdateRequest.Callback f11145a = new SettingUpdateRequest.Callback() {
        /* class com.bytedance.bdturing.p205a.C3523a.C35241 */

        @Override // com.bytedance.bdturing.setting.SettingUpdateRequest.Callback
        /* renamed from: a */
        public void mo14278a(int i, String str, long j) {
            int i2;
            if (i == 200) {
                C3523a.m14843a();
            }
            if (i == 200) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            EventReport.m14809a(j, i2);
        }
    };

    /* renamed from: a */
    public static void m14843a() {
        try {
            SharedPreferences.Editor edit = C3520a.m14831a().mo14275c().mo14224m().getSharedPreferences("bd_turning_settings_init", 0).edit();
            edit.putBoolean("inited", true);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m14844a(Context context) {
        SettingsManager.f11297a.mo14397a(context, new ConfigProvider() {
            /* class com.bytedance.bdturing.p205a.C3523a.C35252 */

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: i */
            public String mo14287i() {
                return "2.2.2.i18n";
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: a */
            public ServiceInterceptor mo14279a() {
                return C3520a.m14831a().mo14275c().mo14233v();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: b */
            public HttpClient mo14280b() {
                return C3520a.m14831a().mo14275c().mo14231t();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: c */
            public String mo14281c() {
                return C3520a.m14831a().mo14275c().mo14214c();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: d */
            public String mo14282d() {
                return C3520a.m14831a().mo14275c().mo14225n();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: e */
            public String mo14283e() {
                return C3520a.m14831a().mo14275c().mo14226o();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: f */
            public String mo14284f() {
                return C3520a.m14831a().mo14275c().mo14217f();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: g */
            public String mo14285g() {
                return C3520a.m14831a().mo14275c().mo14215d();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: h */
            public String mo14286h() {
                return C3520a.m14831a().mo14275c().mo14216e();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: j */
            public String mo14288j() {
                return C3520a.m14831a().mo14275c().mo14220i();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: l */
            public Looper mo14290l() {
                return C3567l.m15030a().mo14388c();
            }

            @Override // com.bytedance.bdturing.setting.ConfigProvider
            /* renamed from: k */
            public String mo14289k() {
                return C3520a.m14831a().mo14275c().mo14210b().getName();
            }
        });
        SettingsManager.f11297a.mo14400a(f11145a);
    }
}
