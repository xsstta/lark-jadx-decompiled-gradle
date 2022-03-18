package com.ss.android.lark.platform.p2489j;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.larksuite.component.dybrid.h5core.AbstractC24186b;
import com.larksuite.component.dybrid.h5core.C24178a;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.ug.thirdshare.C57559a;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.ss.android.lark.platform.j.a */
public class C51819a {

    /* renamed from: a */
    private static volatile C24178a f128774a;

    /* renamed from: a */
    public static C24178a m200877a() {
        if (f128774a == null) {
            synchronized (C51819a.class) {
                if (f128774a == null) {
                    C53241h.m205898b("DybridModuleProvider", "init DybridModule");
                    f128774a = new C24178a(C36083a.m141486a().getCCMDependency().mo132721d(), m200878a(LarkContext.getApplication()));
                    f128774a.mo86771a();
                    C36083a.m141486a().getCCMDependency().mo132704a(f128774a);
                }
            }
        }
        return f128774a;
    }

    /* renamed from: a */
    private static AbstractC24186b.AbstractC24187a m200878a(final Context context) {
        return new AbstractC24186b.AbstractC24187a() {
            /* class com.ss.android.lark.platform.p2489j.C51819a.C518201 */

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24187a
            /* renamed from: a */
            public Context mo86784a() {
                return context;
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24187a
            /* renamed from: b */
            public boolean mo86789b() {
                boolean a = C37239a.m146648b().mo136951a("lark_dynamic_mapper");
                boolean z = UserSP.getInstance().getBoolean("lark_dynamic_mapper", a);
                if (a || z) {
                    return true;
                }
                return false;
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24187a
            /* renamed from: a */
            public void mo86785a(Context context) {
                C53241h.m205898b("DybridModuleProvider", "DybridModule ->  registerH5Plugins ");
                C57559a.m223559a().registerH5SharePlugin();
                C36083a.m141486a().getPassportDependency().mo133103v();
                C36099a.m141515a().mo130125a(context);
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24187a
            /* renamed from: a */
            public boolean mo86787a(String str) {
                if (TextUtils.isEmpty(str)) {
                    C53241h.m205894a("DybridModuleProvider", "checkPermissionByHost but host is empty.");
                    return false;
                }
                List<String> j = BrowserModuleProvider.m200667a().mo106866j();
                try {
                    if (!CollectionUtils.isEmpty(j)) {
                        for (String str2 : j) {
                            C53241h.m205899c("DybridModuleProvider", "whiteRule:" + str2);
                            if (Pattern.compile(str2).matcher(str).matches()) {
                            }
                        }
                        return false;
                    }
                    return true;
                } catch (PatternSyntaxException e) {
                    Log.m165391i("DybridModuleProvider", e);
                } catch (UnsupportedOperationException e2) {
                    Log.m165391i("DybridModuleProvider", e2);
                } catch (IllegalArgumentException e3) {
                    Log.m165391i("DybridModuleProvider", e3);
                } catch (Exception e4) {
                    Log.m165391i("DybridModuleProvider", e4);
                }
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24187a
            /* renamed from: a */
            public void mo86786a(Context context, Bundle bundle) {
                C53241h.m205898b("DybridModuleProvider", "DybridModule ->  openUrl ");
                BrowserModuleProvider.m200667a().mo106854b(context, bundle.getString("url"), mo177949a(bundle, context));
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24187a
            /* renamed from: b */
            public Fragment mo86788b(Context context, Bundle bundle) {
                C53241h.m205898b("DybridModuleProvider", "DybridModule ->  createH5Fragment ");
                return BrowserModuleProvider.m200667a().mo106837a(context, bundle.getString("url"), mo177949a(bundle, context));
            }

            /* renamed from: a */
            public UrlParams mo177949a(Bundle bundle, Context context) {
                UrlParams.C29536a b = UrlParams.m108857a().mo105537g(bundle.getString("appId")).mo105533e(bundle.getString("bizName")).mo105525b(bundle.getString("offlineResPath")).mo105534e(bundle.getBoolean("isShowLoading")).mo105532d(bundle.getBoolean("isNeedLogin")).mo105536f(bundle.getBoolean("showTitle")).mo105524b(bundle.getInt("startFlag")).mo105529c(bundle.getString("titleBackgroundTranslate")).mo105521a(bundle.getBoolean("screenForcePortrait")).mo105535f(bundle.getString("userAgent")).mo105539h(C51819a.m200879a(bundle)).mo105528c(bundle.getInt("lkp_launch_type")).mo105527b(bundle.getBoolean("isLoginUrl"));
                boolean a = m200880a(bundle.getString("url"), bundle, b);
                b.mo105530c(a);
                int i = bundle.getInt("sourceId");
                if (i != -1) {
                    b.mo105518a(UrlParams.Source.getSource(i));
                }
                return BrowserModuleProvider.m200667a().mo106839a(b, a).mo105523a();
            }

            /* renamed from: a */
            private boolean m200880a(String str, Bundle bundle, UrlParams.C29536a aVar) {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                if (aVar != null && OpenKAUrlChecker.f128776a.mo177951a(aVar.mo105523a())) {
                    return true;
                }
                if (bundle == null || !bundle.getBoolean("isRunMain", false)) {
                    return false;
                }
                return true;
            }
        };
    }

    /* renamed from: a */
    public static boolean m200879a(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return !bundle.getBoolean("doNotShowMore");
    }
}
