package com.ss.android.lark.ug.invitation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.entity.mobile.ContactsMobileFeishuInfo;
import com.ss.android.lark.contact.feat.p1745d.C35464c;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.p2489j.C51819a;
import com.ss.android.lark.platform.p2497q.C51931a;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a;
import com.ss.android.lark.ug.p2860d.C57397a;
import com.ss.android.lark.ug.p2879i.C57522a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.ViewUtils;
import java.util.List;
import java.util.Locale;

@ClaymoreImpl(IInvitationModuleDependency.class)
public class InvitationModuleDependencyImpl implements IInvitationModuleDependency {
    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public IInvitationModuleDependency.AbstractC40085a getChatDependency() {
        return new IInvitationModuleDependency.AbstractC40085a() {
            /* class com.ss.android.lark.ug.invitation.InvitationModuleDependencyImpl.C575281 */

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40085a
            /* renamed from: a */
            public String mo145575a(String str, String str2, String str3, String str4) {
                return C36083a.m141486a().getIMDependency().mo132811a(str, str2, str3, (String) null, str4, ChatterNameDisplayRule.ALIAS_NAME);
            }
        };
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public IInvitationModuleDependency.AbstractC40086b getContactDependency() {
        return new IInvitationModuleDependency.AbstractC40086b() {
            /* class com.ss.android.lark.ug.invitation.InvitationModuleDependencyImpl.C575314 */

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40086b
            /* renamed from: b */
            public boolean mo145581b() {
                return C36099a.m141515a().mo130140i();
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40086b
            /* renamed from: a */
            public boolean mo145580a() {
                return C36099a.m141515a().mo130139h();
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40086b
            /* renamed from: a */
            public void mo145577a(Context context) {
                C36099a.m141515a().mo130130b().mo130272c(context);
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40086b
            /* renamed from: a */
            public void mo145579a(boolean z, IGetDataCallback<?> iGetDataCallback) {
                C35464c.m138732a(z, (IGetDataCallback<ContactsMobileFeishuInfo>) iGetDataCallback);
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40086b
            /* renamed from: a */
            public Fragment mo145576a(Object obj, Object obj2, String str) {
                return C36099a.m141515a().mo130137f().mo130575a((ContactMobileApi.ContactType) obj, (ContactMobileApi.C35402a) obj2, str);
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40086b
            /* renamed from: a */
            public void mo145578a(Context context, String str, String str2, C36516a aVar) {
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(10);
                AbstractC36232b.m142703a().mo178821b().mo105577a(context, str, "", (String) null, str2, contactSource, aVar, -1);
            }
        };
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public Context getContext() {
        return LarkContext.getApplication();
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public IInvitationModuleDependency.AbstractC40087c getLoginDependency() {
        return new IInvitationModuleDependency.AbstractC40087c() {
            /* class com.ss.android.lark.ug.invitation.InvitationModuleDependencyImpl.C575292 */

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: a */
            public String mo145582a() {
                return C36083a.m141486a().getPassportDependency().mo133085d();
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: f */
            public String mo145590f() {
                return C36083a.m141486a().getPassportDependency().mo133088g();
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: c */
            public String mo145587c() {
                LoginInfo a = C36083a.m141486a().getPassportDependency().mo133094m().mo172419a();
                if (a != null) {
                    return a.getAvatarKey();
                }
                return "";
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: d */
            public String mo145588d() {
                LoginInfo a = C36083a.m141486a().getPassportDependency().mo133094m().mo172419a();
                if (a != null) {
                    return a.getTenantName();
                }
                return "";
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: e */
            public boolean mo145589e() {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172421b().isSmallB();
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: g */
            public String mo145591g() {
                TenantInfo a = C36083a.m141486a().getPassportDependency().mo133052a(mo145582a());
                if (a == null) {
                    return "";
                }
                return a.getAvatarUrl();
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: b */
            public String mo145586b() {
                return C36083a.m141486a().getIMDependency().mo132808a(C36083a.m141486a().getIMDependency().mo132923e(C36083a.m141486a().getPassportDependency().mo133085d()), ChatterNameDisplayRule.NAME);
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: a */
            public void mo145584a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback) {
                C36083a.m141486a().getPassportDependency().mo133099r().mo172431a(context, str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: a */
            public void mo145583a(Activity activity, int i, int i2, int i3) {
                C36083a.m141486a().getPassportDependency().mo133099r().mo172432a(activity, i, i2, i3, 1);
            }

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40087c
            /* renamed from: a */
            public void mo145585a(String str, String str2, String str3, IGetDataCallback<Boolean> iGetDataCallback) {
                C36083a.m141486a().getPassportDependency().mo133071a(str, str2, str3, iGetDataCallback);
            }
        };
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public IInvitationModuleDependency.AbstractC40088d getThirdShareDependency() {
        return new IInvitationModuleDependency.AbstractC40088d() {
            /* class com.ss.android.lark.ug.invitation.InvitationModuleDependencyImpl.C575303 */

            @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency.AbstractC40088d
            /* renamed from: a */
            public void mo145592a(Context context, ShareEntity shareEntity) {
                ((AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class)).share(context, shareEntity);
            }
        };
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public C24258a getDynamicRouter() {
        return C51819a.m200877a().mo86774d();
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public AbstractC24152a getH5Service() {
        return C51819a.m200877a().mo86772b();
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public Locale getLocale() {
        return C36235a.m142710a().mo148282c().mo148297b();
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public Activity getTopActivity() {
        return C29410a.m108289c().mo104289c();
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public boolean isEnLanguage() {
        return C36235a.m142710a().mo148281b().mo105664e();
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public boolean isGooglePlay() {
        return C36083a.m141487b().isUsPackage();
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public boolean isLarkEnv() {
        return C36083a.m141486a().getPassportDependency().mo133089h();
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void bizReport(List<String> list) {
        C57522a.m223261a().mo194454a(list);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void startScanQRCodeActivity(Activity activity) {
        C51931a.m201432a().mo180840a(activity);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public boolean isFgEnable(String str) {
        return C37239a.m146648b().mo136955b(str, false);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void openF2fGroupPage(Activity activity) {
        C36083a.m141486a().getIMDependency().mo132816a(activity);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void openUrl(String str) {
        BrowserModuleProvider.m200667a().mo106842a(getContext(), str);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void openTeamSettingsPage(Context context, String str) {
        C57397a.m222529a().mo141240c().mo141343a(context, "update_dialog", str);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void openLdrGuidePage(Context context, boolean z, String str) {
        C57522a.m223261a().mo194451a(context, z, str);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void openProfile(Context context, Object obj, int i) {
        openProfileForResult(context, obj, i, -1);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void openInviteInactiveParentListActivity(Context context, String str, String str2, int i) {
        C36099a.m141515a().mo130126a(context, str, "", str2, i);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public Bitmap encodeQRCode(String str, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C51931a.m201432a().mo180837a(str, i, i2, i3);
    }

    @Override // com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency
    public void openProfileForResult(Context context, Object obj, int i, int i2) {
        ContactSource contactSource = new ContactSource();
        contactSource.setSourceType(i);
        if (obj instanceof String) {
            AbstractC36232b.m142703a().mo178821b().mo105574a(context, (String) obj, (String) null, contactSource, i2);
        } else if (obj instanceof Profile) {
            Profile profile = (Profile) obj;
            if (!TextUtils.isEmpty(profile.getId())) {
                AbstractC36232b.m142703a().mo178821b().mo105574a(context, profile.getId(), (String) null, contactSource, i2);
            } else if (!TextUtils.isEmpty(profile.getContactToken())) {
                AbstractC36232b.m142703a().mo178821b().mo105571a(context, profile.getContactToken(), contactSource, i2);
            } else {
                Log.m165383e("InvitationModule", "open profile page failed");
                ViewUtils.m224144a();
            }
        } else {
            Log.m165383e("InvitationModule", "open profile page failed -> unknown type");
            ViewUtils.m224144a();
        }
    }
}
