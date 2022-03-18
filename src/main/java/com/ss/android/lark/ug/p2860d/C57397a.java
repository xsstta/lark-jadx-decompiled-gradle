package com.ss.android.lark.ug.p2860d;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1774k.C36187a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.platform.abtest.C51660a;
import com.ss.android.lark.platform.applink.C51707a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.p2489j.C51819a;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.ug.invitation.C57532a;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.ug.d.a */
public class C57397a {

    /* renamed from: com.ss.android.lark.ug.d.a$a */
    public static class C57406a {

        /* renamed from: a */
        public static final AbstractC38549a f141352a = C57397a.m222530b();
    }

    /* renamed from: a */
    public static C38548a m222529a() {
        return new C38548a(C57406a.f141352a);
    }

    /* renamed from: b */
    public static AbstractC38549a m222530b() {
        return new AbstractC38549a() {
            /* class com.ss.android.lark.ug.p2860d.C57397a.C573981 */

            /* renamed from: a */
            private List<String> f141344a;

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: b */
            public Context mo141251b() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: i */
            public AbstractC38549a.AbstractC38552c mo141259i() {
                return new AbstractC38549a.AbstractC38552c() {
                    /* class com.ss.android.lark.ug.p2860d.C57397a.C573981.C573991 */

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38552c
                    /* renamed from: a */
                    public boolean mo141269a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38552c
                    /* renamed from: b */
                    public boolean mo141270b(String str) {
                        return C37239a.m146648b().mo136955b(str, false);
                    }
                };
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: j */
            public AbstractC38549a.AbstractC38554e mo141260j() {
                return new AbstractC38549a.AbstractC38554e() {
                    /* class com.ss.android.lark.ug.p2860d.C57397a.C573981.C574002 */

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38554e
                    /* renamed from: a */
                    public TenantInfo mo141273a() {
                        return C36083a.m141486a().getPassportDependency().mo133087f();
                    }

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38554e
                    /* renamed from: b */
                    public ISigninSdkApi mo141275b() {
                        return C36083a.m141486a().getPassportDependency().mo133092k();
                    }

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38554e
                    /* renamed from: a */
                    public AbstractC49347c mo141274a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback) {
                        return C36083a.m141486a().getPassportDependency().mo133099r().mo172431a(context, str, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: l */
            public AbstractC38549a.AbstractC38555f mo141262l() {
                return new AbstractC38549a.AbstractC38555f() {
                    /* class com.ss.android.lark.ug.p2860d.C57397a.C573981.C574013 */

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38555f
                    /* renamed from: a */
                    public void mo141276a(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback) {
                        C36149a.m142162a().mo157082a(activity, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38555f
                    /* renamed from: a */
                    public void mo141277a(String str, Bundle bundle, boolean z) {
                        if (bundle != null && z) {
                            bundle.putInt("key_source_from", 1);
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = "conversation";
                        }
                        C36149a.m142162a().mo157098b().mo105707b(LarkContext.getApplication(), str, bundle);
                    }
                };
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: m */
            public AbstractC38549a.AbstractC38551b mo141263m() {
                return new AbstractC38549a.AbstractC38551b() {
                    /* class com.ss.android.lark.ug.p2860d.C57397a.C573981.C574024 */

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38551b
                    /* renamed from: a */
                    public void mo141268a(String str, int i) {
                        C36083a.m141486a().getIMDependency().mo132857a(str, i);
                    }
                };
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: n */
            public AbstractC38549a.AbstractC38553d mo141264n() {
                return new AbstractC38549a.AbstractC38553d() {
                    /* class com.ss.android.lark.ug.p2860d.C57397a.C573981.C574035 */

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38553d
                    /* renamed from: a */
                    public boolean mo141271a(String str) {
                        return C57480a.m223132a().mo141826d(str);
                    }

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38553d
                    /* renamed from: a */
                    public boolean mo141272a(String str, C38708a aVar) {
                        return C57480a.m223132a().mo141819a(str, aVar);
                    }
                };
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: o */
            public AbstractC38549a.AbstractC38550a mo141265o() {
                return new AbstractC38549a.AbstractC38550a() {
                    /* class com.ss.android.lark.ug.p2860d.C57397a.C573981.C574046 */

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38550a
                    /* renamed from: a */
                    public void mo141267a(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            if (C51707a.m200495a().mo103470a(Uri.parse(str))) {
                                C51707a.m200495a().mo103471b(C573981.this.mo141251b(), str, 0);
                            } else {
                                BrowserModuleProvider.m200667a().mo106842a(C573981.this.mo141251b(), str);
                            }
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: p */
            public AbstractC38549a.AbstractC38556g mo141266p() {
                return new AbstractC38549a.AbstractC38556g() {
                    /* class com.ss.android.lark.ug.p2860d.C57397a.C573981.C574057 */

                    @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a.AbstractC38556g
                    /* renamed from: a */
                    public int mo141278a() {
                        return C36083a.m141486a().getPassportDependency().mo133049H();
                    }
                };
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: c */
            public boolean mo141253c() {
                return C36083a.m141486a().getPassportDependency().mo133089h();
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: h */
            public boolean mo141258h() {
                return C57532a.m223304a().isInviteMemberFgEnable();
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: k */
            public C24258a mo141261k() {
                return C51819a.m200877a().mo86774d();
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: d */
            public String mo141254d() {
                LoginInfo a = C36083a.m141486a().getPassportDependency().mo133094m().mo172419a();
                if (a != null) {
                    return a.getTenantName();
                }
                return null;
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: e */
            public boolean mo141255e() {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172429j();
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: f */
            public boolean mo141256f() {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172421b().isSmallB();
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: g */
            public List<String> mo141257g() {
                if (this.f141344a == null) {
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(C36083a.m141486a().getIMDependency().mo132787I());
                    hashSet.addAll(SettingModuleProvider.f129183h.mo178263a().mo185227m());
                    hashSet.addAll(C36149a.m142162a().mo157110e());
                    hashSet.addAll(C36187a.m142438a().mo160273d());
                    C36083a.m141486a().getOpenFeatureDependency().mo132998a(hashSet);
                    hashSet.addAll(C51907a.m201314a().mo169328i());
                    this.f141344a = new ArrayList(hashSet);
                }
                return this.f141344a;
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: a */
            public boolean mo141250a() {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172428i();
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: a */
            public void mo141247a(Context context) {
                C36083a.m141486a().getPassportDependency().mo133100s().mo172411a(context, true);
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: b */
            public void mo141252b(Context context) {
                Statistics.sendEvent("login_guide_page");
                C36083a.m141486a().getPassportDependency().mo133100s().mo172409a(context, SigninParams.newBuilder().mo172353c(true).mo172350a());
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: a */
            public void mo141249a(String str, JSONObject jSONObject) {
                Statistics.sendEvent(str, jSONObject);
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: a */
            public void mo141246a(Activity activity, String str) {
                C57532a.m223304a().openInviteMemberPageSmart(activity, str);
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: a */
            public <T> T mo141245a(Class<? extends AbstractC28490a> cls, boolean z) {
                return (T) C51660a.m200386a().getAbTestValue(cls, z);
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: a */
            public void mo141248a(Context context, String str) {
                C57532a.m223304a().openInviteMemberGuidePage(context, str, null);
            }

            @Override // com.ss.android.lark.guide.p1911a.AbstractC38549a
            /* renamed from: a */
            public Fragment mo141244a(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
                return C36083a.m141486a().getPassportDependency().mo133051a(str, str2, str3, str4, iGetDataCallback);
            }
        };
    }
}
