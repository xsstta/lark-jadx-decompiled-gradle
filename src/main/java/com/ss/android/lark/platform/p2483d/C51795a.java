package com.ss.android.lark.platform.p2483d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.authorization.C29403a;
import com.ss.android.lark.authorization.p1380a.AbstractC29404a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49334a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.Locale;

/* renamed from: com.ss.android.lark.platform.d.a */
public class C51795a {

    /* renamed from: a */
    private static volatile C29403a f128738a;

    /* renamed from: a */
    public static C29403a m200798a() {
        if (f128738a == null) {
            synchronized (C51795a.class) {
                if (f128738a == null) {
                    f128738a = new C29403a(m200797a(LarkContext.getApplication()));
                }
            }
        }
        return f128738a;
    }

    /* renamed from: a */
    private static AbstractC29404a m200797a(final Context context) {
        return new AbstractC29404a() {
            /* class com.ss.android.lark.platform.p2483d.C51795a.C517961 */

            @Override // com.ss.android.lark.authorization.p1380a.AbstractC29404a
            /* renamed from: a */
            public Context mo104165a() {
                return context;
            }

            @Override // com.ss.android.lark.authorization.p1380a.AbstractC29404a
            /* renamed from: b */
            public boolean mo104168b() {
                return C36083a.m141487b().isUsPackage();
            }

            /* renamed from: c */
            private String m200799c() {
                String str;
                String str2;
                String a = DynamicConfigModule.m145551a(DomainSettings.Alias.CONTACT);
                String language = Locale.getDefault().getLanguage();
                if (PackageChannelManager.isKABuildPackage(context)) {
                    str = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getServiceTermUrlBeforeLogin();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    Log.m165389i("AuthorizedModuleProvider", "Ka ServiceTermUrl is enable");
                    return str;
                } else if (TextUtils.isEmpty(language)) {
                    return "https://" + a + "/terms";
                } else {
                    if (mo104168b()) {
                        str2 = "https://" + a + "/{lang}/terms";
                    } else {
                        str2 = "https://" + a + "/terms/?lang={lang}";
                    }
                    return str2.replace("{lang}", language);
                }
            }

            /* renamed from: d */
            private String m200800d() {
                String str;
                String str2;
                String a = DynamicConfigModule.m145551a(DomainSettings.Alias.CONTACT);
                String language = Locale.getDefault().getLanguage();
                if (PackageChannelManager.isKABuildPackage(context)) {
                    str = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getPolicyUrlBeforeLogin();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    Log.m165389i("AuthorizedModuleProvider", "Ka PolicyUrl is enable");
                    return str;
                } else if (TextUtils.isEmpty(language)) {
                    return "https://" + a + "/privacy/";
                } else {
                    if (mo104168b()) {
                        str2 = "https://" + a + "/{lang}/privacy";
                    } else {
                        str2 = "https://" + a + "/privacy/?lang={lang}";
                    }
                    return str2.replace("{lang}", language);
                }
            }

            @Override // com.ss.android.lark.authorization.p1380a.AbstractC29404a
            /* renamed from: a */
            public void mo104167a(Context context, String str, Bundle bundle) {
                bundle.putInt("key_source_from", 3);
                C36149a.m142162a().mo157098b().mo105707b(context, str, bundle);
            }

            @Override // com.ss.android.lark.authorization.p1380a.AbstractC29404a
            /* renamed from: a */
            public CharSequence mo104166a(Context context, int i, int i2, int i3, AbstractC49334a.AbstractC49335a aVar) {
                return C36083a.m141486a().getPassportDependency().mo133092k().getChoosePolicyApi().mo171995a(context, i, i2, i3, m200800d(), m200799c(), aVar);
            }
        };
    }
}
