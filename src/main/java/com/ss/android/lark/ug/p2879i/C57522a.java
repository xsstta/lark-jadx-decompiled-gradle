package com.ss.android.lark.ug.p2879i;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.invitation.C57532a;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import com.ss.android.lark.ug.p2860d.C57397a;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.utils.LarkContext;
import io.reactivex.AbstractC69009q;
import java.util.Collections;

/* renamed from: com.ss.android.lark.ug.i.a */
public class C57522a {

    /* renamed from: a */
    private static C57345a f141724a;

    static {
        C57397a.m222529a();
        C36083a.m141486a().getPassportDependency().mo133064a(new AbstractC49379a() {
            /* class com.ss.android.lark.ug.p2879i.C57522a.C575231 */

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public void mo102549a(C49380b bVar) {
                C57522a.m223261a().mo194458c();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            public void onUserSwitchSuccess(C49382d dVar) {
                C57522a.m223261a().mo194458c();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public void mo102550a(C49381c cVar) {
                C57522a.m223261a().mo194458c();
            }
        });
    }

    /* renamed from: a */
    public static C57345a m223261a() {
        if (f141724a == null) {
            synchronized (C57522a.class) {
                if (f141724a == null) {
                    f141724a = new C57345a(m223262a(LarkContext.getApplication()));
                }
            }
        }
        return f141724a;
    }

    /* renamed from: a */
    private static AbstractC57392a m223262a(final Context context) {
        return new AbstractC57392a() {
            /* class com.ss.android.lark.ug.p2879i.C57522a.C575242 */

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: d */
            public Context mo194672d() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: f */
            public AbstractC57392a.AbstractC57394b mo194674f() {
                return new AbstractC57392a.AbstractC57394b() {
                    /* class com.ss.android.lark.ug.p2879i.C57522a.C575242.C575251 */

                    @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a.AbstractC57394b
                    /* renamed from: a */
                    public void mo194679a(AbstractC69009q<Pair<Activity, String>> qVar) {
                        C36149a.m142162a().mo157093a(qVar);
                    }

                    @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a.AbstractC57394b
                    /* renamed from: a */
                    public void mo194680a(boolean z) {
                        C36149a.m142162a().mo157095a(z);
                    }
                };
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: g */
            public AbstractC57392a.AbstractC57395c mo194675g() {
                return new AbstractC57392a.AbstractC57395c() {
                    /* class com.ss.android.lark.ug.p2879i.C57522a.C575242.C575262 */

                    @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a.AbstractC57395c
                    /* renamed from: a */
                    public void mo194681a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                        C36083a.m141486a().getPassportDependency().mo133070a(str, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: h */
            public AbstractC57392a.AbstractC57393a mo194676h() {
                return new AbstractC57392a.AbstractC57393a() {
                    /* class com.ss.android.lark.ug.p2879i.C57522a.C575242.C575273 */

                    @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a.AbstractC57393a
                    /* renamed from: b */
                    public void mo194678b(String str) {
                        C57480a.m223132a().mo141832h(str);
                    }

                    @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a.AbstractC57393a
                    /* renamed from: a */
                    public boolean mo194677a(String str) {
                        return C57480a.m223132a().mo141831g(str);
                    }
                };
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: b */
            public String mo194668b() {
                return C36083a.m141486a().getPassportDependency().mo133085d();
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: e */
            public Activity mo194673e() {
                return C29410a.m108289c().mo104290d();
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: a */
            public String mo194662a() {
                LoginInfo a = C36083a.m141486a().getPassportDependency().mo133094m().mo172419a();
                if (a != null) {
                    return a.getUserName();
                }
                return "";
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: c */
            public String mo194671c() {
                LoginInfo a = C36083a.m141486a().getPassportDependency().mo133094m().mo172419a();
                if (a != null) {
                    return a.getTenantName();
                }
                return null;
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: a */
            public String mo194663a(DomainSettings.Alias alias) {
                return DynamicConfigModule.m145551a(alias);
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: b */
            public void mo194669b(String str) {
                BrowserModuleProvider.m200667a().mo106842a(mo194672d(), str);
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: a */
            public String mo194664a(String str) {
                return C36149a.m142162a().mo157106c(str);
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: b */
            public boolean mo194670b(Context context) {
                return C36149a.m142162a().mo157098b().mo105702a(context);
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: a */
            public void mo194665a(Context context) {
                C57532a.m223304a().openInviteMemberGuidePage(context, null, null);
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: a */
            public void mo194667a(String str, Bundle bundle) {
                if (bundle != null) {
                    bundle.putInt("key_source_from", 1);
                }
                if (TextUtils.isEmpty(str)) {
                    str = "conversation";
                }
                C36149a.m142162a().mo157098b().mo105707b(LarkContext.getApplication(), str, bundle);
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: a */
            public void mo194666a(Context context, String str, String str2) {
                C57532a.m223304a().openInviteMemberPageSmartWithExtraParams(context, str, Collections.singletonMap("ug_flow_invite_btn_text", str2));
            }

            @Override // com.ss.android.lark.ug.p2859c.AbstractC57392a
            /* renamed from: a */
            public Fragment mo194661a(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
                return C36099a.m141515a().mo130138g().mo130265a(str, str2, onClickListener, onClickListener2);
            }
        };
    }
}
