package com.ss.android.lark.core.p1766d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.core.api.ax;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.BotsResponse;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.C35394e;
import com.ss.android.lark.contact.dto.ChatBotsResponse;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.contact.p1734c.AbstractC35383a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.platform.ab.C51659a;
import com.ss.android.lark.platform.ah.C51701b;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.p2583a.C53264a;
import com.ss.android.lark.search.p2584b.AbstractC53280a;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.ug.banner.C57365e;
import com.ss.android.lark.ug.invitation.C57532a;
import com.ss.android.lark.ug.p2860d.C57397a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.d.a */
public class C36099a {

    /* renamed from: a */
    public static final Map<AbstractC35383a, WSConnState.AbstractC29537a> f93279a = new ConcurrentHashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.core.d.a$a */
    public static class C36115a {

        /* renamed from: a */
        public static final AbstractC35361b f93322a = C36099a.m141516a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C35358a m141515a() {
        return new C35358a(C36115a.f93322a);
    }

    /* renamed from: a */
    public static AbstractC35361b m141516a(final Context context) {
        return new AbstractC35361b() {
            /* class com.ss.android.lark.core.p1766d.C36099a.C361001 */

            /* renamed from: a */
            public final Map<C35394e.AbstractC35395a, AbstractC29623p> f93280a = new ConcurrentHashMap();

            /* renamed from: b */
            public final Map<C35394e.AbstractC35396b, AbstractC29627s> f93281b = new ConcurrentHashMap();

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: a */
            public Context mo130143a() {
                return context;
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: b */
            public AbstractC35361b.AbstractC35370i mo130150b() {
                return new AbstractC35361b.AbstractC35370i() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361011 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35370i
                    /* renamed from: a */
                    public boolean mo130208a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: c */
            public AbstractC35361b.AbstractC35375n mo130153c() {
                return new AbstractC35361b.AbstractC35375n() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass11 */

                    /* renamed from: b */
                    private final AbstractC41118a f93286b = C36235a.m142710a().mo148282c();

                    /* renamed from: c */
                    private final AbstractC29551a f93287c = C36235a.m142710a().mo148281b();

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35375n
                    /* renamed from: a */
                    public Locale mo130223a() {
                        return this.f93286b.mo148303f();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35375n
                    /* renamed from: b */
                    public Boolean mo130224b() {
                        return Boolean.valueOf(this.f93287c.mo105664e());
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35375n
                    /* renamed from: c */
                    public Boolean mo130225c() {
                        return Boolean.valueOf(this.f93287c.mo105661b());
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: d */
            public AbstractC35361b.AbstractC35382u mo130156d() {
                return new AbstractC35361b.AbstractC35382u() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass18 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35382u
                    /* renamed from: a */
                    public Observable mo130256a() {
                        return new Observable() {
                            /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass18.C361021 */

                            /* renamed from: a */
                            final AbstractC49405t f93295a = new AbstractC49405t() {
                                /* class com.ss.android.lark.core.p1766d.$$Lambda$a$1$18$1$asX8IygRNOV474jDwjfKDRtH8_U */

                                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t
                                public final void onTenantInfoChanged(List list, List list2) {
                                    C36099a.C361001.AnonymousClass18.C361021.this.m141583a(list, list2);
                                }
                            };

                            public synchronized void deleteObservers() {
                                super.deleteObservers();
                                m141584b();
                            }

                            /* renamed from: a */
                            private void m141582a() {
                                if (countObservers() == 0) {
                                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerTenantInfoListener(this.f93295a);
                                }
                            }

                            /* renamed from: b */
                            private void m141584b() {
                                if (countObservers() == 0) {
                                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterTenantInfoListener(this.f93295a);
                                }
                            }

                            public synchronized void addObserver(Observer observer) {
                                m141582a();
                                super.addObserver(observer);
                            }

                            public synchronized void deleteObserver(Observer observer) {
                                super.deleteObserver(observer);
                                m141584b();
                            }

                            /* access modifiers changed from: private */
                            /* access modifiers changed from: public */
                            /* renamed from: a */
                            private /* synthetic */ void m141583a(List list, List list2) {
                                setChanged();
                                notifyObservers();
                            }
                        };
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35382u
                    /* renamed from: b */
                    public String mo130258b() {
                        TenantInfo f = C36083a.m141486a().getPassportDependency().mo133087f();
                        if (f == null) {
                            return "";
                        }
                        return f.getTenantName();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35382u
                    /* renamed from: c */
                    public String mo130259c() {
                        TenantInfo f = C36083a.m141486a().getPassportDependency().mo133087f();
                        if (f == null) {
                            return "";
                        }
                        return f.getAvatarUrl();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35382u
                    /* renamed from: a */
                    public void mo130257a(List<String> list, boolean z, IGetDataCallback<Map<String, String>> iGetDataCallback) {
                        C36083a.m141486a().getPassportDependency().mo133107z().asyncGetTenantsByIds(list, z, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: e */
            public AbstractC35361b.AbstractC35374m mo130158e() {
                return new AbstractC35361b.AbstractC35374m() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass19 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: c */
                    public String mo130220c() {
                        return C57532a.m223304a().getInviteExternalPageTitle();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: b */
                    public boolean mo130219b() {
                        return C57532a.m223304a().isInvitationUnionEnable();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: a */
                    public boolean mo130216a() {
                        return C57532a.m223304a().isInviteExternalEnable();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: d */
                    public void mo130222d(Context context) {
                        C57532a.m223304a().registerH5Plugin(context);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: a */
                    public void mo130213a(Context context) {
                        C57532a.m223304a().openInviteMemberPageSmart(context, "department");
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: b */
                    public void mo130217b(Context context) {
                        C57532a.m223304a().openInviteB2bPage(context, "");
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: c */
                    public void mo130221c(Context context) {
                        C57532a.m223304a().openInvitationUnionPage(context, "contact");
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: a */
                    public void mo130215a(C57865c.AbstractC57871b<Boolean> bVar) {
                        C57532a.m223304a().getService().checkInviteMemberPermission(bVar);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: a */
                    public void mo130212a(Activity activity, String str) {
                        C57532a.m223304a().openExternalContactV2Page(activity, str);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: a */
                    public void mo130214a(Context context, String str) {
                        C57532a.m223304a().openInviteExternalPage(context, str, false);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35374m
                    /* renamed from: b */
                    public void mo130218b(Context context, String str) {
                        C57532a.m223304a().openInviteParentChannel(context, str, "", InvitationSource.HOME_SCHOOL_CONTACT);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: f */
            public AbstractC35361b.AbstractC35366e mo130160f() {
                return new AbstractC35361b.AbstractC35366e() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass20 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35366e
                    /* renamed from: a */
                    public void mo130192a(Context context, String str) {
                        BrowserModuleProvider.m200667a().mo106842a(context, str);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: g */
            public AbstractC35361b.AbstractC35381t mo130162g() {
                return new AbstractC35361b.AbstractC35381t() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass21 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35381t
                    /* renamed from: b */
                    public String mo130255b() {
                        return SettingModuleProvider.f129183h.mo178263a().mo185228n();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35381t
                    /* renamed from: a */
                    public boolean mo130254a() {
                        if (SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186572e().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                            return true;
                        }
                        return false;
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: h */
            public AbstractC35361b.AbstractC35376o mo130163h() {
                return new AbstractC35361b.AbstractC35376o() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass22 */

                    /* renamed from: b */
                    private final AbstractC49389b f93302b = C36083a.m141486a().getPassportDependency().mo133094m();

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: a */
                    public boolean mo130229a() {
                        return this.f93302b.mo172429j();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: c */
                    public String mo130231c() {
                        return this.f93302b.mo172422c();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: b */
                    public boolean mo130230b() {
                        return this.f93302b.mo172421b().isSmallB();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: d */
                    public String mo130232d() {
                        return this.f93302b.mo172419a().getTenantId();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: e */
                    public boolean mo130233e() {
                        return this.f93302b.mo172421b().isIdp();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: g */
                    public boolean mo130235g() {
                        if (this.f93302b.mo172421b().getTenantTag() != 0) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: f */
                    public boolean mo130234f() {
                        if (!PackageChannelManager.isKABuildPackage(context) || PackageChannelManager.getDeployMode(context) == 1) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: a */
                    public void mo130226a(Context context, int i) {
                        C36083a.m141486a().getPassportDependency().mo133099r().mo172432a((Activity) context, i, 0, 0, 3);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: a */
                    public void mo130228a(Context context, JSONObject jSONObject) {
                        C36083a.m141486a().getPassportDependency().mo133056a(context, jSONObject);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35376o
                    /* renamed from: a */
                    public void mo130227a(Context context, int i, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getPassportDependency().mo133054a(context, i, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: i */
            public AbstractC35361b.AbstractC35373l mo130164i() {
                return new AbstractC35361b.AbstractC35373l() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361032 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35373l
                    /* renamed from: a */
                    public void mo130211a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                        C51854a.m201094a().mo142158a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: j */
            public AbstractC35361b.AbstractC35367f mo130165j() {
                return new AbstractC35361b.AbstractC35367f() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361043 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public void mo130201a(List<String> list, UIGetDataCallback<Map<String, Chatter>> uIGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132873a(list, uIGetDataCallback);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: b */
                    public IChatterParser mo130202b() {
                        return C36083a.m141486a().getIMDependency().mo132780B();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public IChatParser mo130194a() {
                        return C36083a.m141486a().getIMDependency().mo132779A();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: b */
                    public Chat mo130203b(String str) {
                        if (TextUtils.isEmpty(str)) {
                            return null;
                        }
                        return C36083a.m141486a().getIMDependency().mo132930f(str);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public String mo130195a(Chatter chatter) {
                        return C36083a.m141486a().getIMDependency().mo132808a(chatter, ChatterNameDisplayRule.ALIAS_NAME);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public void mo130197a(final IGetDataCallback<ChatBotsResponse> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132910c(new IGetDataCallback<BotsResponse>() {
                            /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361043.C361062 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(BotsResponse botsResponse) {
                                if (botsResponse != null) {
                                    iGetDataCallback.onSuccess(new ChatBotsResponse(botsResponse.chatters, botsResponse.hasMore));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public void mo130199a(String str) {
                        C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105931b(str).mo105933c("contact_home").mo105923a(ChatBundle.SourceType.PROFILE).mo105929a());
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public char mo130193a(Chatter chatter, Locale locale) {
                        return C36083a.m141486a().getIMDependency().mo132799a(chatter, locale);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: b */
                    public void mo130204b(String str, IGetDataCallback<Chat> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132868a(str, new ArrayList(), "", "", iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public String mo130196a(String str, String str2) {
                        return C36083a.m141486a().getIMDependency().mo132886b(str, str2);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: b */
                    public void mo130205b(String str, String str2) {
                        C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105927a(str).mo105933c(str2).mo105923a(ChatBundle.SourceType.PROFILE).mo105929a());
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public void mo130198a(final IGetDataCallback<ChatBotsResponse> iGetDataCallback, int i) {
                        C36083a.m141486a().getIMDependency().mo132836a(new IGetDataCallback<BotsResponse>() {
                            /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361043.C361051 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(BotsResponse botsResponse) {
                                if (botsResponse != null) {
                                    iGetDataCallback.onSuccess(new ChatBotsResponse(botsResponse.chatters, botsResponse.hasMore));
                                }
                            }
                        }, i);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35367f
                    /* renamed from: a */
                    public void mo130200a(String str, IGetDataCallback<Chatter> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132912c(str, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: k */
            public AbstractC35361b.AbstractC35380s mo130166k() {
                return new AbstractC35361b.AbstractC35380s() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361074 */

                    /* renamed from: b */
                    private final C53258a f93309b;

                    /* renamed from: c */
                    private final AbstractC53280a f93310c;

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35380s
                    /* renamed from: a */
                    public int mo130250a() {
                        return this.f93309b.mo181711b();
                    }

                    {
                        C53258a a = C53264a.m205974a();
                        this.f93309b = a;
                        this.f93310c = a.mo181714c();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35380s
                    /* renamed from: b */
                    public void mo130253b(Context context, String str, int i) {
                        this.f93309b.mo181705a(context, str, i);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35380s
                    /* renamed from: a */
                    public void mo130251a(Context context, String str, int i) {
                        this.f93309b.mo181713b(context, "", str, i);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35380s
                    /* renamed from: a */
                    public void mo130252a(String str, Chat chat, List<String> list, IGetDataCallback<Void> iGetDataCallback) {
                        String str2;
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        while (i < list.size()) {
                            int i2 = i + 1;
                            arrayList.add(new C53892a(i2, 1, list.get(i)));
                            i = i2;
                        }
                        AbstractC53280a aVar = this.f93310c;
                        if (chat == null) {
                            str2 = "";
                        } else {
                            str2 = chat.getId();
                        }
                        aVar.mo181833a(str, new Scene(str2, Scene.Type.ADD_CHAT_CHATTERS), arrayList, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: l */
            public AbstractC35361b.AbstractC35379r mo130167l() {
                return new AbstractC35361b.AbstractC35379r() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361085 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35379r
                    /* renamed from: a */
                    public void mo130246a(final C35394e.AbstractC35395a aVar) {
                        C361091 r0 = new AbstractC29623p() {
                            /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361085.C361091 */

                            @Override // com.ss.android.lark.biz.im.api.AbstractC29623p
                            public void onPushChatter(Chatter chatter) {
                                aVar.mo130390a(chatter);
                            }
                        };
                        C361001.this.f93280a.put(aVar, r0);
                        C36083a.m141486a().getIMDependency().mo132846a(r0);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35379r
                    /* renamed from: b */
                    public void mo130248b(C35394e.AbstractC35395a aVar) {
                        AbstractC29623p pVar = C361001.this.f93280a.get(aVar);
                        C361001.this.f93280a.remove(aVar);
                        if (pVar != null) {
                            C36083a.m141486a().getIMDependency().mo132894b(pVar);
                        }
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35379r
                    /* renamed from: a */
                    public void mo130247a(final C35394e.AbstractC35396b bVar) {
                        C361102 r0 = new AbstractC29627s() {
                            /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361085.C361102 */

                            @Override // com.ss.android.lark.biz.im.api.AbstractC29627s
                            public void onPushMineChatterChanged(Chatter chatter, Chat chat) {
                                bVar.mo130391a(chatter);
                            }
                        };
                        C361001.this.f93281b.put(bVar, r0);
                        C36083a.m141486a().getIMDependency().mo132848a(r0);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35379r
                    /* renamed from: b */
                    public void mo130249b(C35394e.AbstractC35396b bVar) {
                        AbstractC29627s sVar = C361001.this.f93281b.get(bVar);
                        C361001.this.f93281b.remove(bVar);
                        if (sVar != null) {
                            C36083a.m141486a().getIMDependency().mo132896b(sVar);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: m */
            public AbstractC35361b.AbstractC35378q mo130168m() {
                return new AbstractC35361b.AbstractC35378q() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass12 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35378q
                    /* renamed from: a */
                    public String mo130240a(BaseField baseField) {
                        return AbstractC36232b.m142703a().mo178819a().mo180503a(baseField);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35378q
                    /* renamed from: a */
                    public List<BaseField> mo130241a(List<GetUserProfileResponse.Field> list) {
                        return AbstractC36232b.m142703a().mo178819a().mo180504a(list);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35378q
                    /* renamed from: a */
                    public void mo130242a(Context context, String str) {
                        AbstractC36232b.m142703a().mo178821b().mo105573a(context, str, (String) null, new ContactSource.C29531a().mo104726a(19).mo104728a());
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35378q
                    /* renamed from: a */
                    public void mo130243a(Context context, String str, int i, ContactSource contactSource) {
                        AbstractC36232b.m142703a().mo178821b().mo105584b(context, str, null, new ContactSource.C29531a().mo104727a(contactSource.getSender()).mo104731d(contactSource.getSenderId()).mo104726a(contactSource.getSourceType()).mo104729b(contactSource.getSourceName()).mo104730c(contactSource.getSourceId()).mo104732e(contactSource.getSubSourceType()).mo104728a(), i);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35378q
                    /* renamed from: a */
                    public void mo130244a(Context context, String str, C36516a<?> aVar, int i) {
                        AbstractC36232b.m142703a().mo178821b().mo105565a(context, new ax.C29549a().mo105617a(str).mo105616a(new ContactSource.C29531a().mo104726a(0).mo104728a()).mo105619a(), aVar, i);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35378q
                    /* renamed from: a */
                    public void mo130245a(Context context, String str, String str2, C36516a aVar, String str3, int i) {
                        ContactSource.C29531a aVar2 = new ContactSource.C29531a();
                        if ("email".equalsIgnoreCase(str3)) {
                            aVar2.mo104726a(9);
                        } else if ("phone".equalsIgnoreCase(str3)) {
                            aVar2.mo104726a(8);
                        } else {
                            aVar2.mo104726a(0);
                        }
                        AbstractC36232b.m142703a().mo178821b().mo105577a(context, str, "", (String) null, str2, new ContactSource(aVar2), aVar, i);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: n */
            public AbstractC35361b.AbstractC35363b mo130169n() {
                return new AbstractC35361b.AbstractC35363b() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361116 */

                    /* renamed from: a */
                    final AbstractC29417b f93316a = C29410a.m108289c();

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35363b
                    /* renamed from: a */
                    public boolean mo130184a() {
                        return this.f93316a.mo104288b();
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: o */
            public AbstractC35361b.AbstractC35377p mo130170o() {
                return new AbstractC35361b.AbstractC35377p() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361138 */

                    /* renamed from: d */
                    private String m141635d(int i) {
                        return i != 2 ? "normal_v2" : "at_v2";
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35377p
                    /* renamed from: a */
                    public AbstractNotification.AbstractC48496c<Notice> mo130236a() {
                        return C51907a.m201314a().mo169326g();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35377p
                    /* renamed from: a */
                    public boolean mo130237a(int i) {
                        return C51907a.m201314a().mo169324e().mo105561b(m141635d(i));
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35377p
                    /* renamed from: b */
                    public boolean mo130238b(int i) {
                        return C51907a.m201314a().mo169324e().mo105562c(m141635d(i));
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35377p
                    /* renamed from: c */
                    public String mo130239c(int i) {
                        return C51907a.m201314a().mo169324e().mo105560a(m141635d(i)).toString();
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: p */
            public AbstractC35361b.AbstractC35371j mo130171p() {
                return new AbstractC35361b.AbstractC35371j() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass13 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35371j
                    /* renamed from: a */
                    public void mo130209a(Context context, String str, List<String> list, AbstractC44896a aVar) {
                        C36083a.m141486a().getIMDependency().mo132830a(context, str, list, 5, aVar);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: q */
            public AbstractC35361b.AbstractC35365d mo130172q() {
                return new AbstractC35361b.AbstractC35365d() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass14 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35365d
                    /* renamed from: a */
                    public AbstractC29479b mo130190a() {
                        return C57365e.m222366a().mo104319a("BANNER_SCENE_CONTACT");
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35365d
                    /* renamed from: a */
                    public void mo130191a(String str) {
                        C57365e.m222366a().mo104320b(str);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: r */
            public AbstractC35361b.AbstractC35372k mo130173r() {
                return new AbstractC35361b.AbstractC35372k() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass15 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35372k
                    /* renamed from: a */
                    public void mo130210a(Activity activity, View view, View.OnClickListener onClickListener) {
                        C57397a.m222529a().mo141241e().mo141298b(activity, view, onClickListener);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: s */
            public AbstractC35361b.AbstractC35364c mo130174s() {
                return new AbstractC35361b.AbstractC35364c() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass16 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35364c
                    /* renamed from: a */
                    public int mo130185a() {
                        return C36083a.m141486a().getIMDependency().mo132788J();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35364c
                    /* renamed from: b */
                    public int mo130187b() {
                        return C36083a.m141486a().getIMDependency().mo132789K();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35364c
                    /* renamed from: c */
                    public String mo130188c() {
                        return C36083a.m141486a().getIMDependency().mo132790L();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35364c
                    /* renamed from: d */
                    public int mo130189d() {
                        return C36083a.m141486a().getIMDependency().mo132791M();
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35364c
                    /* renamed from: a */
                    public void mo130186a(Context context, String str) {
                        C36083a.m141486a().getIMDependency().mo132828a(context, str, (DialogInterface.OnDismissListener) null);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: t */
            public AbstractC35361b.AbstractC35368g mo130175t() {
                return new AbstractC35361b.AbstractC35368g() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass17 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35368g
                    /* renamed from: a */
                    public void mo130206a(Context context) {
                        C36083a.m141486a().getIMDependency().mo132909c(context, C36083a.m141486a().getIMDependency().mo132959t());
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: u */
            public AbstractC35361b.AbstractC35369h mo130176u() {
                return new AbstractC35361b.AbstractC35369h() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361149 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35369h
                    /* renamed from: a */
                    public boolean mo130207a() {
                        return C37239a.m146648b().mo136951a("suite_help_service_contact");
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: v */
            public AbstractC35361b.AbstractC35362a mo130177v() {
                return new AbstractC35361b.AbstractC35362a() {
                    /* class com.ss.android.lark.core.p1766d.C36099a.C361001.AnonymousClass10 */

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35362a
                    /* renamed from: a */
                    public UniversalUserSetting mo130182a(String str) {
                        return C51659a.m200385a().mo148385a().mo148377a(str);
                    }

                    @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b.AbstractC35362a
                    /* renamed from: a */
                    public void mo130183a(String str, Boolean bool, IGetDataCallback<UniversalUserSetting> iGetDataCallback) {
                        C51659a.m200385a().mo148385a().mo148380a(str, bool.booleanValue(), iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: w */
            public int mo130178w() {
                return LarkSettingModuleProvider.m200903a().mo148454h();
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: x */
            public String mo130179x() {
                return LarkSettingModuleProvider.m200903a().mo148455i();
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: y */
            public boolean mo130180y() {
                return C36083a.m141486a().getIMDependency().mo132958s();
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: z */
            public boolean mo130181z() {
                return C36083a.m141486a().getIMDependency().mo132957r();
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: a */
            public void mo130147a(ImageView imageView) {
                ImageLoader.clear(imageView);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: b */
            public void mo130152b(String str) {
                C36083a.m141486a().getIMDependency().mo132860a(str, FeedCard.Type.CHAT);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: c */
            public void mo130155c(String str) {
                C36083a.m141486a().getOpenPlatformDependency().mo133017a(str);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: e */
            public void mo130159e(String str) {
                C36149a.m142162a().mo157119i(str);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: f */
            public void mo130161f(String str) {
                C36083a.m141486a().getCCMDependency().mo132718c(str);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: d */
            public boolean mo130157d(String str) {
                AppConfig.FeatureConfig b = C51804b.m200825a().mo148365b().mo148372b(str);
                if (b == null) {
                    return true;
                }
                return b.isOn();
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: a */
            public void mo130148a(final AbstractC35383a aVar) {
                if (aVar != null) {
                    C361127 r0 = new WSConnState.AbstractC29537a() {
                        /* class com.ss.android.lark.core.p1766d.C36099a.C361001.C361127 */

                        @Override // com.ss.android.lark.biz.core.api.WSConnState.AbstractC29537a
                        /* renamed from: a */
                        public void mo102563a(WSConnState.ConnState connState) {
                            boolean z;
                            AbstractC35383a aVar = aVar;
                            if (connState == WSConnState.ConnState.Connected) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar.mo130260a(z);
                        }
                    };
                    C36099a.f93279a.put(aVar, r0);
                    C51701b.m200482a().mo201515a().mo201519a(r0);
                }
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: a */
            public void mo130149a(String str) {
                C36083a.m141486a().getIMDependency().mo132856a(str);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: a */
            public void mo130145a(Context context, String str) {
                C36083a.m141486a().getIMDependency().mo132890b(context, str);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: a */
            public void mo130144a(Context context, Chatter chatter) {
                AbstractC29542ad b = AbstractC36232b.m142703a().mo178821b();
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(0);
                b.mo105573a(context, chatter.getId(), (String) null, contactSource);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: b */
            public void mo130151b(Context context, Chatter chatter) {
                AbstractC29542ad b = AbstractC36232b.m142703a().mo178821b();
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(12);
                b.mo105573a(context, chatter.getId(), (String) null, contactSource);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: c */
            public void mo130154c(Context context, Chatter chatter) {
                AbstractC29542ad b = AbstractC36232b.m142703a().mo178821b();
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(0);
                b.mo105573a(context, chatter.getId(), (String) null, contactSource);
            }

            @Override // com.ss.android.lark.contact.p1733b.AbstractC35361b
            /* renamed from: a */
            public void mo130146a(Context context, String str, String str2) {
                AbstractC29542ad b = AbstractC36232b.m142703a().mo178821b();
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(13);
                b.mo105573a(context, str, (String) null, contactSource);
            }
        };
    }
}
