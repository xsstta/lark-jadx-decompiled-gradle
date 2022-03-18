package com.ss.android.lark.integrator.im.p2041s;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.groupmember.C39633a;
import com.ss.android.lark.integrator.im.p2023c.C39452a;
import com.ss.android.lark.integrator.im.p2029i.C39640a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.s.a */
public class C39776a {

    /* renamed from: com.ss.android.lark.integrator.im.s.a$a */
    public static class C39785a {

        /* renamed from: a */
        public static final ITeamModuleDependency f101337a = C39776a.m157895a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C55356a m157896a() {
        return new C55356a(C39785a.f101337a);
    }

    /* renamed from: a */
    public static ITeamModuleDependency m157895a(Context context) {
        return new ITeamModuleDependency() {
            /* class com.ss.android.lark.integrator.im.p2041s.C39776a.C397771 */

            @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency
            /* renamed from: a */
            public ITeamModuleDependency.IImageDependency mo144121a() {
                return new ITeamModuleDependency.IImageDependency() {
                    /* class com.ss.android.lark.integrator.im.p2041s.C39776a.C397771.C397781 */

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IImageDependency
                    /* renamed from: a */
                    public void mo144129a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                        C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
                    }
                };
            }

            @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency
            /* renamed from: b */
            public ITeamModuleDependency.ILoginDependency mo144123b() {
                return new ITeamModuleDependency.ILoginDependency() {
                    /* class com.ss.android.lark.integrator.im.p2041s.C39776a.C397771.C397792 */

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.ILoginDependency
                    /* renamed from: a */
                    public String mo144130a() {
                        return C39603g.m157159a().getPassportDependency().mo143668b();
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.ILoginDependency
                    /* renamed from: b */
                    public String mo144131b() {
                        LoginInfo a = C39603g.m157159a().getPassportDependency().mo143678i().mo172419a();
                        if (a == null) {
                            return "";
                        }
                        return a.getTenantId();
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.ILoginDependency
                    /* renamed from: c */
                    public LoginInfo mo144132c() {
                        return C39603g.m157159a().getPassportDependency().mo143678i().mo172419a();
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.ILoginDependency
                    /* renamed from: d */
                    public boolean mo144133d() {
                        return C39603g.m157159a().getPassportDependency().mo143678i().mo172429j();
                    }
                };
            }

            @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency
            /* renamed from: c */
            public ITeamModuleDependency.IChatDependency mo144124c() {
                return new ITeamModuleDependency.IChatDependency() {
                    /* class com.ss.android.lark.integrator.im.p2041s.C39776a.C397771.C397803 */

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public void mo144144a(List<String> list, String str, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121029a(list, str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public void mo144143a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121023a(str, list, list2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public IChatParser mo144134a() {
                        return AbstractC39484a.m156004a().mo104275z();
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: b */
                    public Chat mo144145b(String str) {
                        return AbstractC39484a.m156004a().mo104251d().mo121056e(str);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public Chat mo144135a(String str) {
                        return AbstractC39484a.m156004a().mo104251d().mo120985a(str);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public String mo144136a(Chatter chatter) {
                        return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.NICKNAME_WITH_ALIAS);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: b */
                    public void mo144146b(String str, List<String> list, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121006a(str, list, 1, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public void mo144137a(Activity activity, String str, boolean z) {
                        C39633a.m157280a().mo158793a(activity, str, z, false, true);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public void mo144138a(Context context, String str, Chat.ChatMode chatMode) {
                        AbstractC39484a.m156004a().mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105926a(chatMode).mo105929a());
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public void mo144141a(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121049c(str, str2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public void mo144142a(String str, List<String> list, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121007a(str, list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public void mo144139a(String str, String str2, int i, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121019a(str, str2, true, i, iGetDataCallback, 0);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatDependency
                    /* renamed from: a */
                    public void mo144140a(String str, String str2, int i, boolean z, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i2) {
                        AbstractC39484a.m156004a().mo104251d().mo121011a(str, str2, i, z, iGetDataCallback, i2);
                    }
                };
            }

            @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency
            /* renamed from: d */
            public ITeamModuleDependency.IProfileDependency mo144125d() {
                return new ITeamModuleDependency.IProfileDependency() {
                    /* class com.ss.android.lark.integrator.im.p2041s.C39776a.C397771.C397814 */

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IProfileDependency
                    /* renamed from: a */
                    public void mo144148a(Context context, String str) {
                        C39603g.m157159a().getCoreDependency().mo143379E().mo105585c(context, str);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IProfileDependency
                    /* renamed from: a */
                    public void mo144147a(Context context, Chatter chatter) {
                        if (chatter.isAnonymous()) {
                            Log.m165397w("OpenUserProfile", "chatter is anonymous, can't open profile");
                            return;
                        }
                        AbstractC29542ad E = C39603g.m157159a().getCoreDependency().mo143379E();
                        ContactSource contactSource = new ContactSource();
                        contactSource.setSourceType(2);
                        E.mo105573a(context, chatter.getId(), (String) null, contactSource);
                    }

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IProfileDependency
                    /* renamed from: a */
                    public void mo144149a(Context context, String str, String str2) {
                        ContactSource contactSource = new ContactSource();
                        contactSource.setSourceName(str2);
                        contactSource.setSourceType(2);
                        C39603g.m157159a().getCoreDependency().mo143379E().mo105573a(context, str, (String) null, contactSource);
                    }
                };
            }

            @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency
            /* renamed from: e */
            public ITeamModuleDependency.IFeedDependency mo144126e() {
                return new ITeamModuleDependency.IFeedDependency() {
                    /* class com.ss.android.lark.integrator.im.p2041s.C39776a.C397771.C397825 */

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IFeedDependency
                    /* renamed from: a */
                    public void mo144150a() {
                        C39640a.m157299a().mo136981e().mo139434a(FeedFilter.TEAM);
                    }
                };
            }

            @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency
            /* renamed from: f */
            public ITeamModuleDependency.IChatSettingDependency mo144127f() {
                return new ITeamModuleDependency.IChatSettingDependency() {
                    /* class com.ss.android.lark.integrator.im.p2041s.C39776a.C397771.C397836 */

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.IChatSettingDependency
                    /* renamed from: a */
                    public Intent mo144151a(Context context, String str, String str2, Team team, AvatarMeta avatarMeta, boolean z) {
                        return C39452a.m155775a().mo127220a(context, str, str2, team, avatarMeta, z);
                    }
                };
            }

            @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency
            /* renamed from: g */
            public ITeamModuleDependency.ICoreDependency mo144128g() {
                return new ITeamModuleDependency.ICoreDependency() {
                    /* class com.ss.android.lark.integrator.im.p2041s.C39776a.C397771.C397847 */

                    @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency.ICoreDependency
                    /* renamed from: a */
                    public boolean mo144152a(long j) {
                        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInZenMode(j);
                    }
                };
            }

            @Override // com.ss.android.lark.team.dependency.ITeamModuleDependency
            /* renamed from: a */
            public boolean mo144122a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }
        };
    }
}
