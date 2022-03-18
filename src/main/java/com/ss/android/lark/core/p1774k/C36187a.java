package com.ss.android.lark.core.p1774k;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.AbstractC29545ai;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.im.api.AbstractC29621n;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.HomeOnCallInfo;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1763a.C36084a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1774k.C36187a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.AbstractC41584c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.C45423a;
import com.ss.android.lark.mine.dto.C45424b;
import com.ss.android.lark.mine.dto.C45425c;
import com.ss.android.lark.mine.dto.C45427e;
import com.ss.android.lark.mine.dto.SidebarInfo;
import com.ss.android.lark.mine.impl.p2273b.AbstractC45431a;
import com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45432a;
import com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45433b;
import com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45434a;
import com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45435b;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.money_export.IMoneyModule;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.platform.ac.C51661a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.map.MapModuleProvider;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.profile.dto.ChatterDescriptionResponse;
import com.ss.android.lark.profile.entity.ChatterDescription;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.service.AbstractC54601a;
import com.ss.android.lark.setting.service.AbstractC54602b;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.setting.service.ISidebarService;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.k.a */
public class C36187a {

    /* renamed from: a */
    private static C45421b f93420a;

    /* renamed from: b */
    private static AbstractC45399a m142442b() {
        return new AbstractC45399a() {
            /* class com.ss.android.lark.core.p1774k.C36187a.C361881 */

            /* renamed from: a */
            public final Map<AbstractC45435b, AbstractC49400m> f93421a = new ConcurrentHashMap();

            /* renamed from: b */
            public final Map<AbstractC29545ai, AbstractC29627s> f93422b = new ConcurrentHashMap();

            /* renamed from: c */
            public final Map<AbstractC45434a, AbstractC29623p> f93423c = new ConcurrentHashMap();

            /* renamed from: d */
            public final Map<AbstractC45432a, az> f93424d = new ConcurrentHashMap();

            /* renamed from: e */
            public final Map<AbstractC45433b, ar> f93425e = new ConcurrentHashMap();

            /* renamed from: f */
            public final Map<AbstractC45431a, AbstractC29621n> f93426f = new ConcurrentHashMap();

            /* renamed from: g */
            public final Map<IGetDataCallback<List<SidebarInfo>>, C54115c.AbstractC54120c> f93427g = new ConcurrentHashMap();

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: A */
            public AbstractC45399a.AbstractC45412m mo133433A() {
                return new AbstractC45399a.AbstractC45412m() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass15 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45412m
                    /* renamed from: a */
                    public String mo133478a() {
                        return C36083a.m141486a().getIMDependency().mo132951m();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45412m
                    /* renamed from: a */
                    public void mo133479a(final Context context) {
                        C36083a.m141486a().getIMDependency().mo132855a((UIGetPluginCallback<IMoneyModule>) new UIGetPluginCallback<IMoneyModule>() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass15.C361911 */

                            @Override // com.larksuite.framework.callback.UIGetDataCallback
                            public void onErrored(ErrorResult errorResult) {
                            }

                            /* renamed from: a */
                            public void onSuccessed(IMoneyModule iMoneyModule) {
                                iMoneyModule.openWallet(context);
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: c */
            public Application mo133443c() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: d */
            public AbstractC45399a.AbstractC45406g mo133445d() {
                return new AbstractC45399a.AbstractC45406g() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361891 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45406g
                    /* renamed from: a */
                    public void mo133468a(String str) {
                        C57480a.m223132a().mo141830f(str);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45406g
                    /* renamed from: b */
                    public boolean mo133469b(String str) {
                        return C57480a.m223132a().mo141828e(str);
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: i */
            public AbstractC45399a.AbstractC45403d mo133450i() {
                return new AbstractC45399a.AbstractC45403d() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass11 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45403d
                    /* renamed from: a */
                    public int mo133473a() {
                        return C36083a.m141486a().getPassportDependency().mo133098q().mo171037e();
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: j */
            public AbstractC45399a.AbstractC45405f mo133451j() {
                return new AbstractC45399a.AbstractC45405f() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass16 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45405f
                    /* renamed from: a */
                    public boolean mo133481a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: k */
            public AbstractC45399a.AbstractC45404e mo133452k() {
                return new AbstractC45399a.AbstractC45404e() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass17 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45404e
                    /* renamed from: a */
                    public boolean mo133482a() {
                        return C37239a.m146648b().mo136951a("suite_join_function");
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: l */
            public AbstractC45399a.AbstractC45407h mo133453l() {
                return new AbstractC45399a.AbstractC45407h() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass18 */

                    /* renamed from: b */
                    private final AbstractC41118a f93442b = C36235a.m142710a().mo148282c();

                    /* renamed from: c */
                    private final AbstractC29551a f93443c = C36235a.m142710a().mo148281b();
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: m */
            public AbstractC45399a.AbstractC45420u mo133454m() {
                return new AbstractC45399a.AbstractC45420u() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass19 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45420u
                    /* renamed from: a */
                    public boolean mo133483a() {
                        return C51661a.m200388a().mo195609d();
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: n */
            public AbstractC45399a.AbstractC45400a mo133455n() {
                return new AbstractC45399a.AbstractC45400a() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass20 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45400a
                    /* renamed from: a */
                    public void mo133492a(Context context, String str) {
                        mo133493a(context, str, false);
                    }

                    /* renamed from: a */
                    public void mo133493a(Context context, String str, boolean z) {
                        if (!z) {
                            BrowserModuleProvider.m200667a().mo106842a(context, str);
                        } else {
                            BrowserModuleProvider.m200667a().mo106843a(context, str, 0);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: o */
            public AbstractC45399a.AbstractC45417r mo133456o() {
                return new AbstractC45399a.AbstractC45417r() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361922 */

                    /* renamed from: a */
                    final AbstractC54603d f93445a = SettingModuleProvider.f129183h.mo178263a().mo185219e();

                    /* renamed from: b */
                    final AbstractC54601a f93446b = SettingModuleProvider.f129183h.mo178263a().mo185212b();

                    /* renamed from: d */
                    private final AbstractC54602b f93448d = SettingModuleProvider.f129183h.mo178263a().mo185216c();

                    /* renamed from: e */
                    private final ISidebarService f93449e = SettingModuleProvider.f129183h.mo178263a().mo185218d();

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45417r
                    /* renamed from: a */
                    public void mo133485a() {
                        this.f93449e.mo186534a();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45417r
                    /* renamed from: b */
                    public boolean mo133488b() {
                        return this.f93445a.mo186574g();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45417r
                    /* renamed from: c */
                    public Long mo133489c() {
                        return Long.valueOf(this.f93446b.mo186512a());
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45417r
                    /* renamed from: a */
                    public void mo133486a(final IGetDataCallback<List<SidebarInfo>> iGetDataCallback) {
                        this.f93449e.mo186535a(new IGetDataCallback<List<com.ss.android.lark.setting.dto.SidebarInfo>>() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361922.C361931 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                            }

                            /* renamed from: a */
                            public void onSuccess(List<com.ss.android.lark.setting.dto.SidebarInfo> list) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(C361922.this.mo133484a(list));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45417r
                    /* renamed from: b */
                    public void mo133487b(IGetDataCallback<List<SidebarInfo>> iGetDataCallback) {
                        $$Lambda$a$1$2$5iNxxuf57F3jNyh17S9I5vp7DEw r0 = new C54115c.AbstractC54120c(iGetDataCallback) {
                            /* class com.ss.android.lark.core.p1774k.$$Lambda$a$1$2$5iNxxuf57F3jNyh17S9I5vp7DEw */
                            public final /* synthetic */ IGetDataCallback f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.lark.setting.C54115c.AbstractC54120c
                            public final void onDataChange(List list, List list2) {
                                C36187a.C361881.C361922.this.m142497a(this.f$1, list, list2);
                            }
                        };
                        C361881.this.f93427g.put(iGetDataCallback, r0);
                        this.f93449e.mo186536a(r0);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45417r
                    /* renamed from: c */
                    public void mo133490c(IGetDataCallback<List<SidebarInfo>> iGetDataCallback) {
                        C54115c.AbstractC54120c cVar = C361881.this.f93427g.get(iGetDataCallback);
                        if (cVar != null) {
                            this.f93449e.mo186537b(cVar);
                        }
                    }

                    /* renamed from: a */
                    public List<SidebarInfo> mo133484a(List<com.ss.android.lark.setting.dto.SidebarInfo> list) {
                        ArrayList arrayList = new ArrayList();
                        for (com.ss.android.lark.setting.dto.SidebarInfo dVar : list) {
                            arrayList.add(new SidebarInfo(dVar.mo185288a(), dVar.mo185289b(), dVar.mo185290c(), dVar.mo185291d()));
                        }
                        return arrayList;
                    }

                    /* access modifiers changed from: private */
                    /* access modifiers changed from: public */
                    /* renamed from: a */
                    private /* synthetic */ void m142497a(IGetDataCallback iGetDataCallback, List list, List list2) {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(mo133484a(list2));
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: p */
            public AbstractC45399a.AbstractC45414o mo133457p() {
                return new AbstractC45399a.AbstractC45414o() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361943 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45414o
                    /* renamed from: a */
                    public void mo133494a(final IGetDataCallback<List<C45424b>> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132927e(new IGetDataCallback<List<HomeOnCallInfo>>() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361943.C361951 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(List<HomeOnCallInfo> list) {
                                ArrayList arrayList = new ArrayList();
                                for (HomeOnCallInfo hVar : list) {
                                    arrayList.add(new C45424b(hVar.mo106718a(), hVar.mo106719b(), hVar.mo106720c(), hVar.mo106721d(), hVar.mo106722e(), hVar.mo106723f()));
                                }
                                iGetDataCallback.onSuccess(arrayList);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45414o
                    /* renamed from: a */
                    public void mo133496a(String str, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132899b(C361881.this.mo133458q().mo133504e(), str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45414o
                    /* renamed from: a */
                    public void mo133495a(String str, float f, float f2, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132862a(C361881.this.mo133458q().mo133504e(), str, f, f2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45414o
                    /* renamed from: a */
                    public void mo133497a(String str, String str2, String str3, ImageView imageView, int i, int i2) {
                        C36083a.m141486a().getIMDependency().mo132821a(LarkContext.getApplication(), str, str2, str3, imageView, i, i2);
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: q */
            public AbstractC45399a.AbstractC45410k mo133458q() {
                return new AbstractC45399a.AbstractC45410k() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361964 */

                    /* renamed from: b */
                    private final AbstractC49389b f93457b = C36083a.m141486a().getPassportDependency().mo133094m();

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45410k
                    /* renamed from: a */
                    public boolean mo133500a() {
                        return this.f93457b.mo172430k();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45410k
                    /* renamed from: b */
                    public boolean mo133501b() {
                        return this.f93457b.mo172429j();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45410k
                    /* renamed from: c */
                    public boolean mo133502c() {
                        return this.f93457b.mo172421b().isSmallB();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45410k
                    /* renamed from: d */
                    public boolean mo133503d() {
                        return this.f93457b.mo172421b().isExcludeLogin();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45410k
                    /* renamed from: e */
                    public String mo133504e() {
                        return C36083a.m141486a().getPassportDependency().mo133085d();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45410k
                    /* renamed from: a */
                    public void mo133499a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback) {
                        C36083a.m141486a().getPassportDependency().mo133099r().mo172431a(context, str, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: r */
            public AbstractC45399a.AbstractC45401b mo133459r() {
                return new AbstractC45399a.AbstractC45401b() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361975 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: b */
                    public List<String> mo133511b() {
                        return C36083a.m141486a().getIMDependency().mo132798T();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: a */
                    public void mo133506a() {
                        C36083a.m141486a().getIMDependency().mo132782D();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: a */
                    public String mo133505a(Chatter chatter) {
                        return C36083a.m141486a().getIMDependency().mo132808a(chatter, ChatterNameDisplayRule.NAME);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: b */
                    public void mo133512b(Context context) {
                        C36083a.m141486a().getIMDependency().mo132937g(context);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: a */
                    public void mo133507a(Context context) {
                        C36083a.m141486a().getIMDependency().mo132932f(context);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: b */
                    public void mo133513b(IGetDataCallback<Boolean> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132919d(iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: a */
                    public void mo133509a(IGetDataCallback<Chatter> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132891b(iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: a */
                    public void mo133508a(Context context, String str) {
                        C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105927a(str).mo105933c("mine_activity").mo105923a(ChatBundle.SourceType.PROFILE).mo105929a());
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45401b
                    /* renamed from: a */
                    public void mo133510a(String str, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132933f(str, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: s */
            public AbstractC45399a.AbstractC45416q mo133460s() {
                return new AbstractC45399a.AbstractC45416q() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361986 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45416q
                    /* renamed from: a */
                    public void mo133514a(final AbstractC29545ai aiVar) {
                        C362002 r0 = new AbstractC29627s() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361986.C362002 */

                            @Override // com.ss.android.lark.biz.im.api.AbstractC29627s
                            public void onPushMineChatterChanged(Chatter chatter, Chat chat) {
                                AbstractC29545ai aiVar = aiVar;
                                if (aiVar != null) {
                                    aiVar.mo105590a(chatter);
                                }
                            }
                        };
                        C361881.this.f93422b.put(aiVar, r0);
                        C36083a.m141486a().getIMDependency().mo132848a(r0);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45416q
                    /* renamed from: b */
                    public void mo133517b(AbstractC29545ai aiVar) {
                        AbstractC29627s remove = C361881.this.f93422b.remove(aiVar);
                        if (remove != null) {
                            C36083a.m141486a().getIMDependency().mo132896b(remove);
                        }
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45416q
                    /* renamed from: a */
                    public void mo133515a(final AbstractC45434a aVar) {
                        C362013 r0 = new AbstractC29623p() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361986.C362013 */

                            @Override // com.ss.android.lark.biz.im.api.AbstractC29623p
                            public void onPushChatter(Chatter chatter) {
                                AbstractC45434a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo160320a(chatter);
                                }
                            }
                        };
                        C361881.this.f93423c.put(aVar, r0);
                        C36083a.m141486a().getIMDependency().mo132846a(r0);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45416q
                    /* renamed from: b */
                    public void mo133518b(AbstractC45434a aVar) {
                        AbstractC29623p remove = C361881.this.f93423c.remove(aVar);
                        if (remove != null) {
                            C36083a.m141486a().getIMDependency().mo132894b(remove);
                        }
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45416q
                    /* renamed from: a */
                    public void mo133516a(final AbstractC45435b bVar) {
                        C361991 r0 = new AbstractC49400m() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C361986.C361991 */

                            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m
                            /* renamed from: a */
                            public void mo133520a(DevicesStatus.DeviceStatus deviceStatus) {
                                AbstractC45435b bVar = bVar;
                                if (bVar != null) {
                                    bVar.mo160321a();
                                }
                            }
                        };
                        C361881.this.f93421a.put(bVar, r0);
                        C36083a.m141486a().getPassportDependency().mo133066a(r0);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45416q
                    /* renamed from: b */
                    public void mo133519b(AbstractC45435b bVar) {
                        AbstractC49400m remove = C361881.this.f93421a.remove(bVar);
                        if (remove != null) {
                            C36083a.m141486a().getPassportDependency().mo133077b(remove);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: t */
            public AbstractC45399a.AbstractC45418s mo133461t() {
                return new AbstractC45399a.AbstractC45418s() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362027 */

                    /* renamed from: b */
                    private final Map<AbstractC45399a.AbstractC45419t, AbstractC49405t> f93467b = new ConcurrentHashMap();

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45418s
                    /* renamed from: a */
                    public void mo133521a(AbstractC45399a.AbstractC45419t tVar) {
                        if (tVar != null) {
                            $$Lambda$a$1$7$nfwEaiagtGkX1yqoIEMtzU9DK8 r0 = new AbstractC49405t() {
                                /* class com.ss.android.lark.core.p1774k.$$Lambda$a$1$7$nfwEaiagtGkX1yqoIEMtzU9DK8 */

                                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t
                                public final void onTenantInfoChanged(List list, List list2) {
                                    C36187a.C361881.C362027.m142535a(AbstractC45399a.AbstractC45419t.this, list, list2);
                                }
                            };
                            this.f93467b.put(tVar, r0);
                            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerTenantInfoListener(r0);
                        }
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45418s
                    /* renamed from: b */
                    public void mo133522b(AbstractC45399a.AbstractC45419t tVar) {
                        AbstractC49405t remove = this.f93467b.remove(tVar);
                        if (remove != null) {
                            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterTenantInfoListener(remove);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: u */
            public AbstractC45399a.AbstractC45413n mo133462u() {
                return new AbstractC45399a.AbstractC45413n() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362038 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45413n
                    /* renamed from: a */
                    public void mo133523a(final AbstractC45432a aVar) {
                        C362041 r0 = new az() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362038.C362041 */

                            @Override // com.ss.android.lark.biz.core.api.az
                            /* renamed from: a */
                            public void mo105622a(boolean z) {
                                AbstractC45432a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo160317a(z);
                                }
                            }

                            @Override // com.ss.android.lark.biz.core.api.az
                            /* renamed from: b */
                            public void mo105623b(boolean z) {
                                AbstractC45432a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo160318b(z);
                                }
                            }
                        };
                        C361881.this.f93424d.put(aVar, r0);
                        C51661a.m200388a().mo195604a(r0);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45413n
                    /* renamed from: b */
                    public void mo133525b(AbstractC45432a aVar) {
                        az remove = C361881.this.f93424d.remove(aVar);
                        if (remove != null) {
                            C51661a.m200388a().mo195607b(remove);
                        }
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45413n
                    /* renamed from: a */
                    public void mo133524a(final AbstractC45433b bVar) {
                        C362052 r0 = new ar() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362038.C362052 */

                            @Override // com.ss.android.lark.biz.core.api.ar
                            /* renamed from: a */
                            public void mo105603a(boolean z) {
                                AbstractC45433b bVar = bVar;
                                if (bVar != null) {
                                    bVar.mo160319a(z);
                                }
                            }
                        };
                        C361881.this.f93425e.put(bVar, r0);
                        SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186545a(r0);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45413n
                    /* renamed from: b */
                    public void mo133526b(AbstractC45433b bVar) {
                        ar remove = C361881.this.f93425e.remove(bVar);
                        if (remove != null) {
                            SettingModuleProvider.f129183h.mo178263a().mo185219e().mo186558b(remove);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: v */
            public AbstractC45399a.AbstractC45415p mo133463v() {
                return new AbstractC45399a.AbstractC45415p() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362069 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45415p
                    /* renamed from: a */
                    public Bundle mo133527a(UserCustomStatus userCustomStatus) {
                        return AbstractC36232b.m142703a().mo178817a(userCustomStatus);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45415p
                    /* renamed from: a */
                    public void mo133529a(Context context) {
                        AbstractC36232b.m142703a().mo178821b().mo105572a(context, "dialogTag", "edit_profile");
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45415p
                    /* renamed from: a */
                    public void mo133531a(final IGetDataCallback<C45427e> iGetDataCallback) {
                        AbstractC36232b.m142703a().mo178819a().mo180508a(C361881.this.mo133458q().mo133504e(), new IGetDataCallback<ProfileResponse>() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362069.C362071 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(final ProfileResponse profileResponse) {
                                if (iGetDataCallback != null) {
                                    C57865c.m224574a(new C57865c.AbstractC57873d<C45427e>() {
                                        /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362069.C362071.C362081 */

                                        /* renamed from: a */
                                        public C45427e produce() {
                                            C45427e a = C361881.this.mo133434a(profileResponse.profile);
                                            String tenantName = C36083a.m141486a().getPassportDependency().mo133094m().mo172419a().getTenantName();
                                            Log.m165389i("MineModuleDependencyInitor", "tenant name is empty : " + TextUtils.isEmpty(tenantName));
                                            if (TextUtils.isEmpty(tenantName)) {
                                                tenantName = "";
                                            }
                                            a.mo160304c(tenantName);
                                            return a;
                                        }
                                    }, new C57865c.AbstractC57871b<C45427e>() {
                                        /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362069.C362071.C362092 */

                                        /* renamed from: a */
                                        public void consume(C45427e eVar) {
                                            iGetDataCallback.onSuccess(eVar);
                                        }
                                    });
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45415p
                    /* renamed from: b */
                    public void mo133533b(Context context, String str) {
                        AbstractC36232b.m142703a().mo178821b().mo105581a(context, str, false, true);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45415p
                    /* renamed from: b */
                    public void mo133534b(ChatterDescription chatterDescription, final IGetDataCallback<String> iGetDataCallback) {
                        AbstractC36232b.m142703a().mo178819a().mo180507a(chatterDescription.description, chatterDescription.type.getNumber(), new IGetDataCallback<String>() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362069.C362124 */

                            /* renamed from: a */
                            public void onSuccess(String str) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(str);
                                }
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45415p
                    /* renamed from: a */
                    public void mo133530a(Context context, String str) {
                        AbstractC29542ad b = AbstractC36232b.m142703a().mo178821b();
                        ContactSource contactSource = new ContactSource();
                        contactSource.setSourceType(0);
                        b.mo105573a(context, str, (String) null, contactSource);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45415p
                    /* renamed from: a */
                    public void mo133532a(ChatterDescription chatterDescription, final IGetDataCallback<Boolean> iGetDataCallback) {
                        AbstractC36232b.m142703a().mo178819a().mo180506a(C36187a.m142439a(chatterDescription), new IGetDataCallback<Boolean>() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362069.C362102 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(Boolean bool) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(true);
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45415p
                    /* renamed from: a */
                    public void mo133528a(int i, int i2, final IGetDataCallback<C45423a> iGetDataCallback) {
                        AbstractC36232b.m142703a().mo178819a().mo180505a(i, i2, new IGetDataCallback<ChatterDescriptionResponse.ChatterDescriptionsResponse>() {
                            /* class com.ss.android.lark.core.p1774k.C36187a.C361881.C362069.C362113 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(ChatterDescriptionResponse.ChatterDescriptionsResponse chatterDescriptionsResponse) {
                                if (iGetDataCallback != null) {
                                    C45423a aVar = new C45423a();
                                    aVar.mo160291a(C36187a.m142441a(chatterDescriptionsResponse.descriptions));
                                    aVar.mo160292a(chatterDescriptionsResponse.hasMore);
                                    iGetDataCallback.onSuccess(aVar);
                                }
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: w */
            public AbstractC45399a.AbstractC45408i mo133464w() {
                return new AbstractC45399a.AbstractC45408i() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass10 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45408i
                    /* renamed from: a */
                    public boolean mo133471a() {
                        return C36083a.m141486a().getIMDependency().mo132793O();
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45408i
                    /* renamed from: a */
                    public void mo133470a(final AbstractC45431a aVar) {
                        if (aVar != null) {
                            C361901 r0 = new AbstractC29621n() {
                                /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass10.C361901 */

                                @Override // com.ss.android.lark.biz.im.api.AbstractC29621n
                                /* renamed from: a */
                                public void mo106730a(boolean z) {
                                    aVar.mo160316a(z);
                                }
                            };
                            C361881.this.f93426f.put(aVar, r0);
                            C36083a.m141486a().getIMDependency().mo132845a(r0);
                        }
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45408i
                    /* renamed from: b */
                    public void mo133472b(AbstractC45431a aVar) {
                        AbstractC29621n nVar = C361881.this.f93426f.get(aVar);
                        C361881.this.f93426f.remove(aVar);
                        if (nVar != null) {
                            C36083a.m141486a().getIMDependency().mo132893b(nVar);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: x */
            public AbstractC45399a.AbstractC45409j mo133465x() {
                return new AbstractC45399a.AbstractC45409j() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass12 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45409j
                    /* renamed from: a */
                    public void mo133474a(String str, Context context) {
                        BrowserModuleProvider.m200667a().mo106842a(context, str);
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: y */
            public AbstractC45399a.AbstractC45402c mo133466y() {
                return new AbstractC45399a.AbstractC45402c() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass13 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45402c
                    /* renamed from: a */
                    public void mo133475a(Context context) {
                        C36099a.m141515a().mo130130b().mo130272c(context);
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: z */
            public AbstractC45399a.AbstractC45411l mo133467z() {
                return new AbstractC45399a.AbstractC45411l() {
                    /* class com.ss.android.lark.core.p1774k.C36187a.C361881.AnonymousClass14 */

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45411l
                    /* renamed from: a */
                    public boolean mo133476a(String str) {
                        return MiraModule.m205163c(str);
                    }

                    @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a.AbstractC45411l
                    /* renamed from: b */
                    public boolean mo133477b(String str) {
                        return MiraModule.m205164d(str);
                    }
                };
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: b */
            public boolean mo133442b() {
                return C36083a.m141486a().getPassportDependency().mo133089h();
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: f */
            public boolean mo133447f() {
                return C51804b.m200825a().mo148365b().mo148371a("favorite");
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: g */
            public boolean mo133448g() {
                return C37239a.m146648b().mo136951a("suite_help_service");
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: e */
            public boolean mo133446e() {
                boolean a = C51804b.m200825a().mo148365b().mo148371a("chat.hongbao");
                boolean a2 = C37239a.m146648b().mo136951a("tt_pay");
                if (!a || !a2) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: h */
            public String mo133449h() {
                LoginInfo a = C36083a.m141486a().getPassportDependency().mo133094m().mo172419a();
                if (a != null && !TextUtils.isEmpty(a.getTenantName())) {
                    return a.getTenantName();
                }
                return "";
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: a */
            public boolean mo133439a() {
                return C36083a.m141487b().isUsPackage();
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: b */
            public void mo133441b(Context context) {
                C51907a.m201314a().mo169321b(context);
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: a */
            public void mo133436a(Context context) {
                SettingModuleProvider.f129183h.mo178263a().mo185213b(context);
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: c */
            public boolean mo133444c(Context context) {
                return C36083a.m141486a().getPassportDependency().mo133098q().mo171028a(context);
            }

            /* renamed from: a */
            public C45427e mo133434a(Profile profile) {
                C45427e eVar = new C45427e();
                eVar.mo160300a(profile.getOrganization());
                eVar.mo160302b(profile.getDepartment());
                eVar.mo160304c(profile.getTenant());
                new ChatterDescription().description = profile.getDescription().description;
                eVar.mo160298a(C36187a.m142436a(profile.getDescription()));
                eVar.mo160299a(C36187a.m142437a(profile.getWorkStatus()));
                return eVar;
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: a */
            public boolean mo133440a(IGetDataCallback<C45425c> iGetDataCallback) {
                return MapModuleProvider.m201088a().getLocationClient(LarkContext.getApplication()).mo149526a(new AbstractC41584c() {
                    /* class com.ss.android.lark.core.p1774k.$$Lambda$a$1$iipvMd8i_YvlXqXhKfYiuniUMFA */

                    @Override // com.ss.android.lark.location.listener.AbstractC41584c
                    public final void onLocationChange(LarkLocation larkLocation, List list) {
                        C36187a.C361881.m142444a(IGetDataCallback.this, larkLocation, list);
                    }
                });
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: a */
            public void mo133435a(Activity activity, String str) {
                C36083a.m141486a().getIMDependency().mo132818a(activity, str);
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: a */
            public void mo133438a(CallbackManager callbackManager, IGetDataCallback<Devices> iGetDataCallback) {
                C36083a.m141486a().getPassportDependency().mo133098q().mo171023a(iGetDataCallback);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m142444a(IGetDataCallback iGetDataCallback, LarkLocation larkLocation, List list) {
                if (larkLocation == null) {
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("location is null"));
                    }
                } else if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(new C45425c(larkLocation.getLongitude(), larkLocation.getLatitude()));
                }
            }

            @Override // com.ss.android.lark.mine.p2270a.AbstractC45399a
            /* renamed from: a */
            public void mo133437a(Context context, String str, String str2, View view) {
                C36084a.m141488a().mo222593a(context, str, str2, view);
            }
        };
    }

    /* renamed from: a */
    public static C45421b m142438a() {
        if (f93420a == null) {
            synchronized (C36187a.class) {
                if (f93420a == null) {
                    f93420a = new C45421b(m142442b());
                }
            }
        }
        return f93420a;
    }

    /* renamed from: a */
    public static List<ChatterDescription> m142441a(List<com.ss.android.lark.profile.entity.ChatterDescription> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.ss.android.lark.profile.entity.ChatterDescription, ChatterDescription>() {
            /* class com.ss.android.lark.core.p1774k.C36187a.C362132 */

            /* renamed from: a */
            public ChatterDescription get(com.ss.android.lark.profile.entity.ChatterDescription chatterDescription) {
                return C36187a.m142436a(chatterDescription);
            }
        });
    }

    /* renamed from: a */
    public static ChatterDescription m142436a(com.ss.android.lark.profile.entity.ChatterDescription chatterDescription) {
        ChatterDescription.Type type = null;
        if (chatterDescription == null) {
            return null;
        }
        String str = chatterDescription.description;
        if (chatterDescription.type != null) {
            type = ChatterDescription.Type.valueOf(chatterDescription.type.getNumber());
        }
        return new ChatterDescription(str, type);
    }

    /* renamed from: a */
    public static WorkStatus m142437a(com.ss.android.lark.profile.entity.WorkStatus workStatus) {
        WorkStatus.Status status = null;
        if (workStatus == null) {
            return null;
        }
        if (workStatus.status != null) {
            status = WorkStatus.Status.valueOf(workStatus.status.getNumber());
        }
        return new WorkStatus(status, workStatus.description, workStatus.startTime, workStatus.endTime, workStatus.isCrossTenant);
    }

    /* renamed from: b */
    public static List<LanguageInfo> m142443b(TranslateLanguageSetting translateLanguageSetting) {
        boolean z;
        Integer num;
        int i;
        ArrayList arrayList = new ArrayList();
        if (!(translateLanguageSetting == null || translateLanguageSetting.getSupportedLanguageList() == null)) {
            for (com.ss.android.lark.chat.entity.translate.LanguageInfo languageInfo : translateLanguageSetting.getSupportedLanguageList()) {
                if (languageInfo != null) {
                    String key = languageInfo.getKey();
                    boolean equals = translateLanguageSetting.getTargetLanguageKey().equals(key);
                    Set<String> disAutoTranslateKeySet = translateLanguageSetting.getDisAutoTranslateKeySet();
                    if (disAutoTranslateKeySet == null || !disAutoTranslateKeySet.contains(key)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Map<String, Integer> displayConfigMap = translateLanguageSetting.getDisplayConfigMap();
                    if (displayConfigMap != null) {
                        num = displayConfigMap.get(key);
                    } else {
                        num = null;
                    }
                    if (num == null || num.intValue() == 0) {
                        i = translateLanguageSetting.getGlobalDisplayConfig();
                    } else {
                        i = num.intValue();
                    }
                    arrayList.add(new LanguageInfo(languageInfo.getKey(), languageInfo.getDisplayName(), equals, z, i));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static com.ss.android.lark.profile.entity.ChatterDescription m142439a(ChatterDescription chatterDescription) {
        if (chatterDescription == null) {
            return null;
        }
        com.ss.android.lark.profile.entity.ChatterDescription chatterDescription2 = new com.ss.android.lark.profile.entity.ChatterDescription();
        chatterDescription2.description = chatterDescription.description;
        chatterDescription2.type = ChatterDescription.Type.valueOf(chatterDescription.type.getNumber());
        return chatterDescription2;
    }

    /* renamed from: a */
    public static MineTranslateLanguageSetting m142440a(TranslateLanguageSetting translateLanguageSetting) {
        if (translateLanguageSetting != null) {
            return new MineTranslateLanguageSetting(translateLanguageSetting.getGlobalAutoTranslateScope(), translateLanguageSetting.getTargetLanguageKey(), m142443b(translateLanguageSetting), translateLanguageSetting.getDisAutoTranslateKeySet(), translateLanguageSetting.getGlobalDisplayConfig(), translateLanguageSetting.getDisplayConfigMap(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
        }
        return null;
    }
}
