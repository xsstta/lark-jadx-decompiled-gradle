package com.ss.android.lark.core.p1772j;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.IMineController;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.main.IFeedLoadListener;
import com.ss.android.lark.biz.im.api.AbstractC29621n;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.contact.p1735d.AbstractC35386a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.dependency.AbstractC36122g;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.core.p1772j.p1773a.C36168a;
import com.ss.android.lark.core.p1772j.p1773a.C36169b;
import com.ss.android.lark.core.p1772j.p1773a.C36172c;
import com.ss.android.lark.core.p1772j.p1773a.C36175d;
import com.ss.android.lark.core.p1772j.p1773a.C36177e;
import com.ss.android.lark.core.p1772j.p1773a.C36185f;
import com.ss.android.lark.core.p1774k.C36187a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.inv.export.router.AbstractC40091a;
import com.ss.android.lark.larkconfig.larksetting.handler.customnav.NavDataSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.main.interfaces.AbstractC44502e;
import com.ss.android.lark.main.interfaces.IChatterPushListener;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.p2231a.AbstractC44176b;
import com.ss.android.lark.main.p2231a.AbstractC44177c;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginSourceInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService;
import com.ss.android.lark.platform.af.C51682a;
import com.ss.android.lark.platform.ag.C51689a;
import com.ss.android.lark.platform.applink.C51707a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b;
import com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler;
import com.ss.android.lark.platform.p2482c.C51790a;
import com.ss.android.lark.platform.p2483d.C51795a;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2489j.C51819a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.p2497q.C51931a;
import com.ss.android.lark.platform.p2505u.C52013b;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.platform.statistics.p2502b.C51973e;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.platform.statistics.perf.C51997c;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.search.p2583a.C53264a;
import com.ss.android.lark.simple.C54866b;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.ug.invitation.C57532a;
import com.ss.android.lark.ug.p2860d.C57397a;
import com.ss.android.lark.ug.p2874e.C57480a;
import com.ss.android.lark.ug.p2879i.C57522a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57762aa;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.watermark.C58275e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.core.j.a */
public class C36149a {

    /* renamed from: a */
    public static final Map<String, AbstractC44136a.C44142ac.AbstractC44143a> f93339a = new LinkedHashMap();

    /* renamed from: b */
    public static final Map<AbstractC44502e, AbstractC29621n> f93340b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final Map<AbstractC44136a.AbstractC44160o.AbstractC44162b, C28513a.AbstractC28514a> f93341c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final C57762aa f93342d = new C57762aa();

    /* renamed from: e */
    private static volatile C44134a f93343e;

    /* renamed from: a */
    public static C44134a m142162a() {
        if (f93343e == null) {
            synchronized (C36149a.class) {
                if (f93343e == null) {
                    f93343e = new C44134a(m142161a(LarkContext.getApplication()));
                }
            }
        }
        return f93343e;
    }

    /* renamed from: a */
    private static AbstractC44136a m142161a(final Context context) {
        return new AbstractC44136a() {
            /* class com.ss.android.lark.core.p1772j.C36149a.C361501 */

            /* renamed from: b */
            private final Map<String, AbstractC44136a.C44142ac> f93345b = new ConcurrentHashMap();

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: y */
            public void mo133269y() {
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: D */
            public void mo133184D() {
                C51973e.m201590h();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: M */
            public AbstractC44136a.AbstractC44149e mo133193M() {
                return $$Lambda$a$1$MZZCip95207W3CssKI913aUdHLY.INSTANCE;
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: i */
            public Context mo133253i() {
                return context;
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public boolean mo133230a(MainActivity mainActivity) {
                return C57397a.m222529a().mo141242f().mo141519a(mainActivity);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133222a(String str, JSONObject jSONObject) {
                Statistics.sendEvent(str, jSONObject);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133218a(Context context, String str, String str2, boolean z) {
                BrowserModuleProvider.m200667a().mo106844a(context, str, UrlParams.m108857a().mo105518a(z ? UrlParams.Source.APP : UrlParams.Source.SPLASH).mo105537g(str2).mo105523a(), C36083a.m141486a().getCCMDependency().mo132717c());
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public boolean mo133226a(Context context, Bundle bundle) {
                return C36083a.m141486a().getCCMDependency().mo132709a(context, bundle);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public boolean mo133239b(Context context, Bundle bundle) {
                return C36083a.m141486a().getCCMDependency().mo132715b(context, bundle);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public boolean mo133223a(Context context, Intent intent) {
                return C36083a.m141486a().getMailDependency().mo132970a(context, intent);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public boolean mo133229a(Uri uri, Context context) {
                return C36083a.m141486a().getCalendarDependency().mo132743a(uri, context);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133220a(AbstractC49404s sVar) {
                C36083a.m141486a().getPassportDependency().mo133067a(sVar);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133221a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback) {
                C36083a.m141486a().getIMDependency().mo132900b(str, str2, str3, iGetDataCallback);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public boolean mo133227a(Context context, String str, String str2) {
                return C36083a.m141486a().getOpenPlatformDependency().mo133029a(context, str, str2);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public boolean mo133224a(Context context, Uri uri) {
                return C57522a.m223261a().mo194455a(context, uri);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133217a(Context context, String str, String str2, String str3, String str4, int i, boolean z) {
                ContactSource contactSource = new ContactSource();
                contactSource.setSender(str3);
                contactSource.setSourceName(str4);
                contactSource.setSourceType(i);
                AbstractC36232b.m142703a().mo178821b().mo105576a(context, str, str2, contactSource, z);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133216a(Context context, String str, String str2, String str3, int i) {
                ContactSource contactSource = new ContactSource();
                contactSource.setSender(str2);
                contactSource.setSourceName(str3);
                contactSource.setSourceType(i);
                AbstractC36232b.m142703a().mo178821b().mo105570a(context, str, contactSource);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public boolean mo133225a(Context context, Uri uri, boolean z) {
                C51707a.m200495a().mo103464a(context, uri, z);
                if (z) {
                    return C51707a.m200495a().mo103478c(uri);
                }
                return true;
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public boolean mo133228a(Uri uri) {
                return C51707a.m200495a().mo103476b(uri);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133215a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                C51854a.m201094a().mo142158a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133219a(TabAppInfo tabAppInfo) {
                C36083a.m141486a().getOpenPlatformDependency().mo133023a(this.f93345b, tabAppInfo);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: B */
            public AbstractC44136a.AbstractC44165r mo133182B() {
                return new AbstractC44136a.AbstractC44165r() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361614 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44165r
                    /* renamed from: a */
                    public void mo133362a() {
                        C51995b.m201714a();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44165r
                    /* renamed from: c */
                    public void mo133365c(String str, String str2) {
                        C51995b.m201724b(str, str2);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44165r
                    /* renamed from: d */
                    public void mo133366d(String str, String str2) {
                        C51995b.m201726c(str, str2);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44165r
                    /* renamed from: a */
                    public void mo133363a(String str, String str2) {
                        C51995b.m201718a(str, str2, 1);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44165r
                    /* renamed from: b */
                    public void mo133364b(String str, String str2) {
                        C51995b.m201718a(str, str2, 3);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: C */
            public AbstractC44136a.AbstractC44166s mo133183C() {
                return new AbstractC44136a.AbstractC44166s() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361625 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44166s
                    /* renamed from: a */
                    public void mo133367a() {
                        C51997c.m201743a("key_doc", ChatBundle.SourceType.PROFILE);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: F */
            public void mo133186F() {
                this.f93345b.clear();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: G */
            public AbstractC44136a.AbstractC44159n mo133187G() {
                return new AbstractC44136a.AbstractC44159n() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361647 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44159n
                    /* renamed from: a */
                    public boolean mo133371a() {
                        return C36083a.m141486a().getIMDependency().mo132793O();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44159n
                    /* renamed from: a */
                    public void mo133370a(final AbstractC44502e eVar) {
                        if (eVar != null) {
                            C361651 r0 = new AbstractC29621n() {
                                /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361647.C361651 */

                                @Override // com.ss.android.lark.biz.im.api.AbstractC29621n
                                /* renamed from: a */
                                public void mo106730a(boolean z) {
                                    eVar.mo157283a(z);
                                }
                            };
                            C36149a.f93340b.put(eVar, r0);
                            C36083a.m141486a().getIMDependency().mo132845a(r0);
                        }
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44159n
                    /* renamed from: b */
                    public void mo133372b(AbstractC44502e eVar) {
                        AbstractC29621n nVar = C36149a.f93340b.get(eVar);
                        C36149a.f93340b.remove(eVar);
                        if (nVar != null) {
                            C36083a.m141486a().getIMDependency().mo132893b(nVar);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: H */
            public AbstractC44136a.AbstractC44171x mo133188H() {
                return new C36177e();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: I */
            public AbstractC44136a.AbstractC44169v mo133189I() {
                return new C36175d();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: J */
            public AbstractC44136a.AbstractC44173y mo133190J() {
                return new C36185f();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: K */
            public AbstractC44136a.AbstractC44164q mo133191K() {
                return new C36169b();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: L */
            public AbstractC44136a.AbstractC44147c mo133192L() {
                return new C36168a();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: O */
            public AbstractC44136a.AbstractC44158m mo133195O() {
                return new AbstractC44136a.AbstractC44158m() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361679 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44158m
                    /* renamed from: a */
                    public Map<String, AbstractC40091a> mo133375a() {
                        return C57532a.m223304a().getRouterMap();
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: Q */
            public AbstractC44136a.AbstractC44175z mo133197Q() {
                return new AbstractC44136a.AbstractC44175z() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass10 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44175z
                    /* renamed from: a */
                    public void mo133272a() {
                        C51682a.m200447a();
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: T */
            public AbstractC44136a.AbstractC44155k mo133200T() {
                return new AbstractC44136a.AbstractC44155k() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass12 */

                    /* renamed from: b */
                    private boolean f93350b;

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: a */
                    public AbstractC44136a.AbstractC44155k.AbstractC44156a mo133278a() {
                        return new AbstractC44136a.AbstractC44155k.AbstractC44156a() {
                            /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass12.C361521 */

                            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k.AbstractC44156a
                            /* renamed from: a */
                            public void mo133290a(Activity activity) {
                                C57522a.m223261a().mo194448a(activity);
                            }

                            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k.AbstractC44156a
                            /* renamed from: a */
                            public void mo133291a(Activity activity, Intent intent) {
                                C57522a.m223261a().mo194449a(activity, intent);
                            }
                        };
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: c */
                    public void mo133286c() {
                        this.f93350b = true;
                        mo133284b("all_feed_navibar_avatar_badge");
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: d */
                    public boolean mo133288d() {
                        return C57397a.m222529a().mo141243g().mo141338a();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: e */
                    public boolean mo133289e() {
                        return C57480a.m223132a().mo141829f();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: b */
                    public boolean mo133285b() {
                        if (!C36083a.m141486a().getPassportDependency().mo133104w() || C36083a.m141486a().getPassportDependency().mo133044C() != 1 || !C57480a.m223132a().mo141826d("all_feed_navibar_avatar_badge") || this.f93350b) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: b */
                    public void mo133284b(String str) {
                        C57480a.m223132a().mo141824c(str);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: c */
                    public boolean mo133287c(String str) {
                        return C57480a.m223132a().mo141830f(str);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: a */
                    public boolean mo133282a(Uri uri) {
                        return C57397a.m222529a().mo141238a(uri);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: a */
                    public boolean mo133283a(String str) {
                        return C57480a.m223132a().mo141828e(str);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: a */
                    public void mo133281a(String str, boolean z) {
                        C57480a.m223132a().mo141830f(str);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: a */
                    public void mo133280a(View view, View.OnClickListener onClickListener) {
                        C57397a.m222529a().mo141241e().mo141294a(view, (Activity) view.getContext(), onClickListener);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44155k
                    /* renamed from: a */
                    public void mo133279a(View view, Rect rect, String str, String str2, View.OnClickListener onClickListener) {
                        C57397a.m222529a().mo141241e().mo141296a(view, rect, str, str2, onClickListener);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: U */
            public AbstractC44136a.AbstractC44146b mo133201U() {
                return new AbstractC44136a.AbstractC44146b() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass13 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44146b
                    /* renamed from: a */
                    public Boolean mo133292a() {
                        return LarkSettingModuleProvider.m200903a().mo148450d();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44146b
                    /* renamed from: b */
                    public void mo133298b(IGetDataCallback<AppConfig> iGetDataCallback) {
                        C51804b.m200825a().mo148365b().mo148374b(iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44146b
                    /* renamed from: a */
                    public String mo133293a(NavDataSource navDataSource) {
                        return LarkSettingModuleProvider.m200903a().mo148445a(navDataSource);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44146b
                    /* renamed from: a */
                    public void mo133294a(IGetDataCallback<AppConfig> iGetDataCallback) {
                        C51804b.m200825a().mo148365b().mo148368a(iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44146b
                    /* renamed from: a */
                    public void mo133296a(boolean z) {
                        LarkSettingModuleProvider.m200903a().mo148447a(z);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44146b
                    /* renamed from: a */
                    public void mo133295a(String str, NavDataSource navDataSource) {
                        LarkSettingModuleProvider.m200903a().mo148446a(str, navDataSource);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44146b
                    /* renamed from: a */
                    public void mo133297a(boolean z, IGetDataCallback<AppConfig> iGetDataCallback) {
                        C51804b.m200825a().mo148365b().mo148370a(z, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: V */
            public AbstractC44136a.AbstractC44151g mo133202V() {
                return new AbstractC44136a.AbstractC44151g() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass14 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44151g
                    /* renamed from: a */
                    public String mo133299a() {
                        return C36083a.m141486a().getCCMDependency().mo132726i();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44151g
                    /* renamed from: b */
                    public void mo133301b() {
                        C36083a.m141486a().getCCMDependency().mo132725h();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44151g
                    /* renamed from: a */
                    public void mo133300a(AbstractC44552i iVar, boolean z) {
                        C36083a.m141486a().getCCMDependency().mo132706a(iVar, z);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: W */
            public AbstractC44136a.AbstractC44168u mo133203W() {
                return new AbstractC44136a.AbstractC44168u() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass15 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44168u
                    /* renamed from: a */
                    public long mo133302a() {
                        return C51790a.m200787a();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44168u
                    /* renamed from: b */
                    public long mo133303b() {
                        return C51790a.m200789b();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44168u
                    /* renamed from: c */
                    public long mo133304c() {
                        return C51790a.m200790c();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44168u
                    /* renamed from: d */
                    public boolean mo133305d() {
                        return C51973e.m201588f();
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: Y */
            public AbstractC44136a.AbstractC44167t mo133205Y() {
                return new AbstractC44136a.AbstractC44167t() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass16 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44167t
                    /* renamed from: a */
                    public boolean mo133306a(Context context, Bundle bundle) {
                        return C51931a.m201432a().mo180843a(context, bundle);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public AbstractC44136a.AbstractC44157l mo133231b() {
                return new AbstractC44136a.AbstractC44157l() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361511 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44157l
                    /* renamed from: a */
                    public void mo133271a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                        C51854a.m201094a().mo142158a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: f */
            public AbstractC44136a.AbstractC44163p mo133250f() {
                return new AbstractC44136a.AbstractC44163p() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass18 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: a */
                    public Fragment mo133309a() {
                        return C36187a.m142438a().mo160269b().mo105902a();
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m142300a(AbstractC44176b bVar) {
                        if (bVar != null) {
                            bVar.mo157139a();
                        }
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: b */
                    public void mo133317b(Fragment fragment) {
                        C36187a.m142438a().mo160269b().mo105905b(fragment);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: a */
                    public Chatter.ChatterCustomStatus mo133310a(List<Chatter.ChatterCustomStatus> list) {
                        return C36187a.m142438a().mo160263a(list);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: a */
                    public void mo133311a(Context context) {
                        C53264a.m205974a().mo181717d(context, "", "", 0);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: a */
                    public void mo133314a(Fragment fragment) {
                        C36187a.m142438a().mo160269b().mo105903a(fragment);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: a */
                    public void mo133312a(Context context, int i) {
                        C36187a.m142438a().mo160265a(context, i);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: a */
                    public void mo133313a(Context context, int[] iArr) {
                        C36187a.m142438a().mo160267a(context, iArr);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: a */
                    public void mo133315a(Fragment fragment, AbstractC44176b bVar) {
                        if (fragment == null) {
                            Log.m165383e("MainModuleProvider", "setMinePageChangeListener failed: mine fragment is null");
                        } else {
                            C36187a.m142438a().mo160268a(fragment, new IMineController.OnGotoOtherPageListener() {
                                /* class com.ss.android.lark.core.p1772j.$$Lambda$a$1$18$kB3uQNp_xvuZ7rOKXP4CGZFytw */

                                @Override // com.ss.android.lark.biz.core.api.IMineController.OnGotoOtherPageListener
                                public final void onGotoOtherPage() {
                                    C36149a.C361501.AnonymousClass18.m142300a(AbstractC44176b.this);
                                }
                            });
                        }
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44163p
                    /* renamed from: a */
                    public void mo133316a(Fragment fragment, boolean z) {
                        C36187a.m142438a().mo160269b().mo105904a(fragment, z);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: h */
            public AbstractC44136a.AbstractC44140ab mo133252h() {
                return new AbstractC44136a.AbstractC44140ab() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass20 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44140ab
                    /* renamed from: a */
                    public boolean mo133337a() {
                        return true;
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44140ab
                    /* renamed from: b */
                    public boolean mo133338b() {
                        if (C51689a.m200461a().mo197373c() == 0) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44140ab
                    /* renamed from: a */
                    public void mo133334a(Activity activity) {
                        C51689a.m200461a().mo197374c(activity);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44140ab
                    /* renamed from: a */
                    public void mo133336a(final AbstractC44136a.AbstractC44140ab.AbstractC44141a aVar) {
                        C51689a.m200461a().mo197368a(new C58275e.AbstractC58276a() {
                            /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass20.C361551 */

                            @Override // com.ss.android.lark.watermark.C58275e.AbstractC58276a
                            /* renamed from: a */
                            public void mo133339a() {
                                AbstractC44136a.AbstractC44140ab.AbstractC44141a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo157126a();
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44140ab
                    /* renamed from: a */
                    public void mo133335a(Activity activity, LifecycleOwner lifecycleOwner) {
                        C51689a.m200461a().mo197362a(activity, lifecycleOwner);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: m */
            public AbstractC44136a.AbstractC44160o mo133257m() {
                return new AbstractC44136a.AbstractC44160o() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass21 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public boolean mo133349a(Activity activity) {
                        if (!C36083a.m141486a().getPassportDependency().mo133094m().mo172428i() || !PackageChannelManager.isKABuildPackage(context) || PackageChannelManager.getDeployMode(context) == 1 || TextUtils.equals(C36083a.m141486a().getPassportDependency().mo133094m().mo172419a().getIdpType(), PackageChannelManager.getBuildPackageChannel(context))) {
                            return true;
                        }
                        C36083a.m141486a().getPassportDependency().mo133100s().mo172412a(context, false, "IdpClientTypeChanged makes logout", new AbstractC49338a() {
                            /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass21.C361561 */

                            @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
                            public void onResult(boolean z) {
                                if (!z) {
                                    C53241h.m205898b("MainModuleProvider", "logout error");
                                } else {
                                    C53241h.m205898b("MainModuleProvider", "logout when upgrade from feishu success");
                                }
                            }
                        });
                        return false;
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: c */
                    public boolean mo133353c() {
                        return C36083a.m141486a().getPassportDependency().mo133104w();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: b */
                    public String mo133350b() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172422c();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public boolean mo133348a() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172428i();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public void mo133340a(Dialog dialog) {
                        C51689a.m200461a().mo197371b(dialog);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public void mo133341a(Context context) {
                        C36083a.m141486a().getPassportDependency().mo133100s().mo172409a(context, SigninParams.DEFAULT);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: b */
                    public void mo133352b(AbstractC44136a.AbstractC44160o.AbstractC44162b bVar) {
                        C28513a.m104515b(C36149a.f93341c.get(bVar));
                        C36149a.f93341c.remove(bVar);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public void mo133346a(final AbstractC44136a.AbstractC44160o.AbstractC44162b bVar) {
                        C361583 r0 = new C28513a.AbstractC28514a() {
                            /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass21.C361583 */

                            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
                            public void onLoginStatusChanged(int i) {
                                if (i == 0) {
                                    bVar.mo157135b();
                                } else {
                                    bVar.mo157134a();
                                }
                            }
                        };
                        C36149a.f93341c.put(bVar, r0);
                        C28513a.m104512a(r0);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public void mo133347a(String str) {
                        ((ILoginSourceService) ApiUtils.getApi(ILoginSourceService.class)).setLoginSource(new LoginSourceInfo(1, str));
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: b */
                    public void mo133351b(Context context, String str) {
                        C36083a.m141486a().getPassportDependency().mo133100s().mo172410a(context, str);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public void mo133343a(Context context, SigninParams signinParams) {
                        ILoginService s = C36083a.m141486a().getPassportDependency().mo133100s();
                        if (signinParams == null) {
                            signinParams = SigninParams.DEFAULT;
                        }
                        s.mo172409a(context, signinParams);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public void mo133344a(Context context, String str) {
                        C36083a.m141486a().getPassportDependency().mo133075b(context, str);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public void mo133342a(Context context, int i, final AbstractC44136a.AbstractC44160o.AbstractC44161a aVar) {
                        C51689a.m200461a().mo197364a(context, i, 0.1f, new IGetDataCallback<Drawable>() {
                            /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass21.C361572 */

                            /* renamed from: a */
                            public void onSuccess(Drawable drawable) {
                                boolean z;
                                if (aVar != null) {
                                    if (C51689a.m200461a().mo197373c() == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    aVar.mo157133a(z, drawable);
                                }
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                C53241h.m205894a("MainModuleProvider", "generateGlobalWatermark onError " + errorResult.getDisplayMsg());
                            }
                        });
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o
                    /* renamed from: a */
                    public void mo133345a(Context context, String str, Bundle bundle) {
                        C36083a.m141486a().getPassportDependency().mo133060a(context, str, bundle);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: o */
            public AbstractC44136a.AbstractC44170w mo133259o() {
                return new AbstractC44136a.AbstractC44170w() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass22 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44170w
                    /* renamed from: b */
                    public void mo133358b(Context context) {
                        if (context == null) {
                            C53241h.m205894a("MainModuleProvider", "context is null: launch simple mode fail");
                        } else {
                            C54866b.m212765a().mo187077b().mo187160a(context);
                        }
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44170w
                    /* renamed from: a */
                    public void mo133356a(FragmentActivity fragmentActivity) {
                        if (fragmentActivity == null) {
                            C53241h.m205894a("MainModuleProvider", "context is null: check simple mode");
                        } else {
                            C54866b.m212765a().mo187073a(fragmentActivity, 0);
                        }
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44170w
                    /* renamed from: a */
                    public boolean mo133357a(Context context) {
                        if (context != null) {
                            return C54866b.m212765a().mo187076a(context);
                        }
                        C53241h.m205894a("MainModuleProvider", "context is null: simple mode off");
                        return false;
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44170w
                    /* renamed from: a */
                    public void mo133355a(Activity activity, View view) {
                        if (activity == null || view == null) {
                            C53241h.m205894a("MainModuleProvider", "context is null: show simple popup");
                        } else {
                            C54866b.m212765a().mo187075a(activity, view);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: p */
            public AbstractC44136a.AbstractC44150f mo133260p() {
                return new AbstractC44136a.AbstractC44150f() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass23 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44150f
                    /* renamed from: a */
                    public void mo133359a(final IChatterPushListener cVar) {
                        C36083a.m141486a().getIMDependency().mo132891b(new IGetDataCallback<com.ss.android.lark.chat.entity.chatter.Chatter>() {
                            /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass23.C361591 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                C53241h.m205899c("MainModuleProvider", errorResult.getDebugMsg());
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
                                if (chatter != null) {
                                    cVar.mo157411a(chatter.getId(), ChatterCustomStatus.toPB(chatter.getCustomStatus()));
                                }
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: q */
            public AbstractC44136a.AbstractC44148d mo133261q() {
                return new AbstractC44136a.AbstractC44148d() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361542 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: b */
                    public void mo133333b() {
                        C36083a.m141486a().getIMDependency().mo132786H();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: a */
                    public SparseArray<AbstractC29524c> mo133325a() {
                        SparseArray<AbstractC29524c> sparseArray = new SparseArray<>();
                        AbstractC29524c F = C36083a.m141486a().getIMDependency().mo132784F();
                        if (F != null) {
                            sparseArray.append(4098, F);
                        }
                        AbstractC29524c G = C36083a.m141486a().getIMDependency().mo132785G();
                        if (F != null) {
                            sparseArray.append(4100, G);
                        }
                        return sparseArray;
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: a */
                    public void mo133330a(AbstractC36551c.AbstractC36552a aVar) {
                        C36083a.m141486a().getIMDependency().mo132854a(aVar);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: a */
                    public boolean mo133332a(String str) {
                        return C36083a.m141486a().getIMDependency().mo132903b(C36083a.m141486a().getIMDependency().mo132939h(str));
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: a */
                    public String mo133326a(String str, String str2) {
                        return C36083a.m141486a().getIMDependency().mo132886b(str, str2);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: a */
                    public void mo133327a(Context context, String str) {
                        C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105927a(str).mo105933c("router_activity").mo105923a(ChatBundle.SourceType.PROFILE).mo105929a());
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: a */
                    public void mo133331a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132934f(list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: a */
                    public void mo133329a(Context context, String str, String str2) {
                        C36083a.m141486a().getIMDependency().mo132829a(context, str, str2);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44148d
                    /* renamed from: a */
                    public void mo133328a(Context context, String str, int i) {
                        boolean z;
                        AbstractC36122g iMDependency = C36083a.m141486a().getIMDependency();
                        ChatBundle.C29590a c = ChatBundle.m109259a().mo105927a(str).mo105933c("router_activity");
                        if (i >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iMDependency.mo132823a(context, c.mo105932b(z).mo105920a(i).mo105923a(ChatBundle.SourceType.PROFILE).mo105929a());
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: z */
            public AbstractC44136a.AbstractC44153i mo133270z() {
                return new AbstractC44136a.AbstractC44153i() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361603 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44153i
                    /* renamed from: a */
                    public boolean mo133361a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            /* renamed from: Z */
            private boolean m142163Z() {
                return C36083a.m141486a().getMailDependency().mo132969a();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ boolean aa() {
                return DesktopUtil.m144301a(mo133253i());
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: A */
            public AbstractC44136a.AbstractC44139aa mo133181A() {
                return C36083a.m141486a().getVideoConferenceDependency().mo133151h();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: N */
            public AbstractC44177c mo133194N() {
                return (AbstractC44177c) C36149a.f93342d.mo196049a(AbstractC44177c.class, new C57762aa.AbstractC57763a<AbstractC44177c>() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361668 */

                    /* renamed from: a */
                    public AbstractC44177c mo133374b(Class<AbstractC44177c> cls) {
                        return new C36172c();
                    }
                });
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: R */
            public boolean mo133198R() {
                return C51795a.m200798a().mo104163b();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: S */
            public boolean mo133199S() {
                return C36083a.m141486a().getPassportDependency().mo133072a();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: X */
            public Locale mo133204X() {
                return C36235a.m142710a().mo148282c().mo148297b();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: e */
            public AbstractC44136a.AbstractC44152h mo133248e() {
                return new AbstractC44136a.AbstractC44152h() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass17 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44152h
                    /* renamed from: a */
                    public boolean mo133307a() {
                        return C37239a.m146648b().mo136951a("suite_join_function");
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44152h
                    /* renamed from: b */
                    public boolean mo133308b() {
                        return C37239a.m146648b().mo136951a("suite_transfer_function");
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: j */
            public boolean mo133254j() {
                return C36083a.m141487b().isUsPackage();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: k */
            public boolean mo133255k() {
                return C36083a.m141486a().getPassportDependency().mo133089h();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: l */
            public int mo133256l() {
                return AppLifecycle.m200904a().mo177977g();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: n */
            public boolean mo133258n() {
                return C36149a.m142162a().mo157115g();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: r */
            public String mo133262r() {
                return C36083a.m141486a().getMailDependency().mo132976d();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: s */
            public boolean mo133263s() {
                return C36083a.m141486a().getMailDependency().mo132977e();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: t */
            public String mo133264t() {
                return C36083a.m141486a().getCalendarDependency().mo132755g();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: u */
            public String mo133265u() {
                return C36083a.m141486a().getTodoDependency().mo133123a();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: v */
            public C24258a mo133266v() {
                return C51819a.m200877a().mo86774d();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: w */
            public String mo133267w() {
                return DynamicConfigModule.m145552b().mo136165a("applink");
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: x */
            public String mo133268x() {
                return C36083a.m141486a().getPassportDependency().mo133090i();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: P */
            public String mo133196P() {
                return C36083a.m141486a().getPassportDependency().mo133094m().mo172422c();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: c */
            public AbstractC44136a.AbstractC44154j mo133240c() {
                return new AbstractC44136a.AbstractC44154j() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass11 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44154j
                    /* renamed from: a */
                    public View mo133273a() {
                        return C36083a.m141486a().getIMDependency().mo132949l();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44154j
                    /* renamed from: b */
                    public void mo133276b() {
                        C36083a.m141486a().getIMDependency().mo132946j();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44154j
                    /* renamed from: a */
                    public void mo133274a(IFeedLoadListener aVar) {
                        C36083a.m141486a().getIMDependency().mo132838a(aVar);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44154j
                    /* renamed from: b */
                    public void mo133277b(IFeedLoadListener aVar) {
                        C36083a.m141486a().getIMDependency().mo132892b(aVar);
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44154j
                    /* renamed from: a */
                    public void mo133275a(boolean z) {
                        C36083a.m141486a().getIMDependency().mo132877a(z);
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: d */
            public void mo133246d() {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).gotoLeanMode();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: g */
            public AbstractC44136a.AbstractC44137a mo133251g() {
                final AbstractC49389b m = C36083a.m141486a().getPassportDependency().mo133094m();
                return new AbstractC44136a.AbstractC44137a() {
                    /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass19 */

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44137a
                    /* renamed from: a */
                    public String mo133318a() {
                        return m.mo172422c();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44137a
                    /* renamed from: b */
                    public String mo133320b() {
                        return m.mo172425f();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44137a
                    /* renamed from: c */
                    public String mo133321c() {
                        return m.mo172424e();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44137a
                    /* renamed from: d */
                    public boolean mo133322d() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172421b().isExcludeLogin();
                    }

                    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44137a
                    /* renamed from: a */
                    public void mo133319a(Context context, final AbstractC44136a.AbstractC44137a.AbstractC44138a aVar) {
                        C36083a.m141486a().getPassportDependency().mo133102u().mo171619a(context, new IAccountInterceptor.AbstractC49386a() {
                            /* class com.ss.android.lark.core.p1772j.C36149a.C361501.AnonymousClass19.C361531 */

                            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor.AbstractC49386a
                            /* renamed from: b */
                            public /* synthetic */ void mo133324b() {
                                IAccountInterceptor.AbstractC49386a.CC.$default$b(this);
                            }

                            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor.AbstractC49386a
                            /* renamed from: a */
                            public void mo133323a() {
                                AbstractC44136a.AbstractC44137a.AbstractC44138a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo157125a();
                                }
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133209a() {
                C36083a.m141486a().getGeckoResDependency().mo132777a();
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: E */
            public Map<String, AbstractC44136a.C44142ac.AbstractC44143a> mo133185E() {
                if (C36149a.f93339a.isEmpty()) {
                    synchronized (C36149a.f93339a) {
                        if (C36149a.f93339a.isEmpty()) {
                            C36149a.f93339a.put("conversation", AbstractC44136a.C44142ac.AbstractC44143a.f112086a);
                            C36149a.f93339a.put("contact", AbstractC44136a.C44142ac.AbstractC44143a.f112086a);
                            C36149a.f93339a.put("calendar", AbstractC44136a.C44142ac.AbstractC44143a.f112086a);
                            C36149a.f93339a.put("space", AbstractC44136a.C44142ac.AbstractC44143a.f112086a);
                            C36149a.f93339a.put("system_setting", new AbstractC44136a.C44142ac.AbstractC44143a() {
                                /* class com.ss.android.lark.core.p1772j.$$Lambda$a$1$HPcfb8KcRfKZMmGbIv9vo6dZLA */

                                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44143a
                                public final boolean isEnable() {
                                    return C36149a.C361501.this.aa();
                                }
                            });
                            C36149a.f93339a.put("favorite", new AbstractC44136a.C44142ac.AbstractC44143a(context) {
                                /* class com.ss.android.lark.core.p1772j.$$Lambda$a$1$bG8b6Yf798TWnb7RIhijkpkRSbE */
                                public final /* synthetic */ Context f$0;

                                {
                                    this.f$0 = r1;
                                }

                                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44143a
                                public final boolean isEnable() {
                                    return DesktopUtil.m144301a(this.f$0);
                                }
                            });
                            C36149a.f93339a.put("videochat", new AbstractC44136a.C44142ac.AbstractC44143a(context) {
                                /* class com.ss.android.lark.core.p1772j.$$Lambda$a$1$ePBUDGg2qIDKpFu9u98116Q5OM */
                                public final /* synthetic */ Context f$0;

                                {
                                    this.f$0 = r1;
                                }

                                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44143a
                                public final boolean isEnable() {
                                    return C36149a.C361501.m142170d(this.f$0);
                                }
                            });
                            C36149a.f93339a.put("create_group", new AbstractC44136a.C44142ac.AbstractC44143a(context) {
                                /* class com.ss.android.lark.core.p1772j.$$Lambda$a$1$Kr_dNXJwtV3uQpjvU17ZmcWR_A */
                                public final /* synthetic */ Context f$0;

                                {
                                    this.f$0 = r1;
                                }

                                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44143a
                                public final boolean isEnable() {
                                    return DesktopUtil.m144301a(this.f$0);
                                }
                            });
                            C36083a.m141486a().getOpenFeatureDependency().mo133001b(C36149a.f93339a);
                        }
                    }
                }
                return C36149a.f93339a;
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133211a(ComponentCallbacks2 componentCallbacks2) {
                ComponentCallbacks2C51833b.m200968a(componentCallbacks2);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public void mo133233b(ComponentCallbacks2 componentCallbacks2) {
                ComponentCallbacks2C51833b.m200972b(componentCallbacks2);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static /* synthetic */ boolean m142170d(Context context) {
                return !DesktopUtil.m144301a(context);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public String mo133208a(DomainSettings.Alias alias) {
                return DynamicConfigModule.m145551a(alias);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: c */
            public void mo133242c(TabAppInfo tabAppInfo) {
                C36083a.m141486a().getOpenPlatformDependency().mo133037c(this.f93345b, tabAppInfo);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public void mo133236b(TabAppInfo tabAppInfo) {
                C36083a.m141486a().getOpenPlatformDependency().mo133035b(this.f93345b, tabAppInfo);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133212a(Context context) {
                AbstractC36232b.m142703a().mo178821b().mo105572a(context, "dialogTag", "profile");
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public Map<String, AbstractC44136a.C44142ac> mo133232b(Context context) {
                Map<String, AbstractC44136a.C44142ac.AbstractC44143a> E = mo133185E();
                C36083a.m141486a().getOpenFeatureDependency().mo132997a(this.f93345b, E);
                if (!this.f93345b.containsKey(C36083a.m141486a().getIMDependency().mo132944i())) {
                    this.f93345b.put(C36083a.m141486a().getIMDependency().mo132944i(), new AbstractC44136a.C44142ac(C36083a.m141486a().getIMDependency().mo132944i(), 0, true, null, $$Lambda$a$1$O9pU7y4T1mX7bLY06Ros0YObW0Y.INSTANCE, new AbstractC44136a.C44142ac.AbstractC44144b() {
                        /* class com.ss.android.lark.core.p1772j.C36149a.C361501.C361636 */

                        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                        /* renamed from: a */
                        public void mo133368a(Context context) {
                            C36083a.m141486a().getIMDependency().mo132946j();
                        }

                        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                        /* renamed from: b */
                        public void mo133369b(Context context) {
                            C36083a.m141486a().getIMDependency().mo132889b(context);
                        }
                    }));
                }
                AbstractC35386a c = C36099a.m141515a().mo130134c();
                if (!this.f93345b.containsKey(c.mo130264b())) {
                    Map<String, AbstractC44136a.C44142ac> map = this.f93345b;
                    String b = c.mo130264b();
                    c.getClass();
                    map.put(b, new AbstractC44136a.C44142ac(c.mo130264b(), 4, false, E.get(c.mo130264b()), new AbstractC44136a.C44142ac.AbstractC44145c() {
                        /* class com.ss.android.lark.core.p1772j.$$Lambda$TmNSiKFY1wUwI7X3IsaX2dgJ4A */

                        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44145c
                        public final AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                            return AbstractC35386a.this.mo130263a(context, eVar, iTitleController);
                        }
                    }));
                }
                if (!this.f93345b.containsKey(SettingModuleProvider.f129183h.mo178263a().mo185228n())) {
                    this.f93345b.put(SettingModuleProvider.f129183h.mo178263a().mo185228n(), new AbstractC44136a.C44142ac(SettingModuleProvider.f129183h.mo178263a().mo185228n(), 9, false, E.get(SettingModuleProvider.f129183h.mo178263a().mo185228n()), $$Lambda$a$1$go41bwDgWw6UvJn_HN7kXrLkpM.INSTANCE));
                }
                if (!this.f93345b.containsKey(C36083a.m141486a().getIMDependency().mo132783E())) {
                    this.f93345b.put(C36083a.m141486a().getIMDependency().mo132783E(), new AbstractC44136a.C44142ac(C36083a.m141486a().getIMDependency().mo132783E(), 10, false, E.get(C36083a.m141486a().getIMDependency().mo132783E()), $$Lambda$a$1$TcgOeT0LpbvQlwIPXzs7DCT_mZE.INSTANCE));
                }
                if (!this.f93345b.containsKey(C36083a.m141486a().getIMDependency().mo132960u())) {
                    this.f93345b.put(C36083a.m141486a().getIMDependency().mo132960u(), new AbstractC44136a.C44142ac(C36083a.m141486a().getIMDependency().mo132960u(), 12, false, E.get(C36083a.m141486a().getIMDependency().mo132960u()), $$Lambda$a$1$jsjTYIFenkXqcqgg4f_tiX2YXAc.INSTANCE));
                }
                C53241h.m205898b("MainModuleProvider", "mLocalTabConfigs " + this.f93345b.size());
                return this.f93345b;
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public void mo133234b(Context context, Intent intent) {
                C36083a.m141486a().getPassportDependency().mo133055a(context, intent);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: c */
            public void mo133241c(Context context, Intent intent) {
                C51795a.m200798a().mo104162a(context, intent);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: d */
            public void mo133247d(Context context, String str) {
                C36083a.m141486a().getIMDependency().mo132918d(context, str);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: e */
            public void mo133249e(Context context, String str) {
                if (!m142163Z()) {
                    Log.m165389i("MainModuleProvider", "mail isSupportMailTo false");
                    return;
                }
                BrowserModuleProvider.m200667a().mo106850a("messenger", "messenger_profile");
                BrowserModuleProvider.m200667a().mo106842a(context, str);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public void mo133235b(Context context, String str) {
                OfflinePushClickHandler.m201276a(context, str);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133210a(Activity activity, int i) {
                C36149a.m142162a().mo157081a(activity, AppLifecycle.m200904a().mo177979i());
                C36083a.m141486a().getIMDependency().mo132948k();
                C36083a.m141486a().getPassportDependency().mo133069a("main", i);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: c */
            public boolean mo133243c(Context context, Uri uri) {
                return C52013b.m201803a().mo178255a(context, uri);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: c */
            public boolean mo133244c(Context context, Bundle bundle) {
                return C36083a.m141486a().getOpenPlatformDependency().mo133027a(context, bundle);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133213a(Context context, String str) {
                BrowserModuleProvider.m200667a().mo106854b(context, str, UrlParams.m108857a().mo105523a());
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public boolean mo133237b(Context context, Uri uri) {
                if ("tab".equals(uri.getLastPathSegment())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("transition", true);
                    bundle.putInt("key_source_from", 1);
                    C36149a.m142162a().mo157098b().mo105707b(context, uri.getQueryParameter("tabKey"), bundle);
                    return true;
                } else if (!"chat".equals(uri.getLastPathSegment())) {
                    return false;
                } else {
                    C57522a.m223261a().mo194453a(uri.getQueryParameter("chatId"), uri.getQueryParameter("title"), uri.getQueryParameter("detail"));
                    return true;
                }
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: c */
            public boolean mo133245c(Context context, String str) {
                return C36083a.m141486a().getOpenPlatformDependency().mo133040c(context, str);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC44552i m142164a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                return C36083a.m141486a().getIMDependency().mo132914d(context);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ AbstractC44552i m142165b(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                return C36083a.m141486a().getIMDependency().mo132940h(context);
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static /* synthetic */ AbstractC44552i m142167c(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                return SettingModuleProvider.f129183h.mo178263a().mo185199a(context);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static /* synthetic */ AbstractC44552i m142169d(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                return C36083a.m141486a().getIMDependency().mo132805a(context, eVar, iTitleController);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m142166b(Context context, String str, int i) {
                C36083a.m141486a().getIMDependency().mo132827a(context, str, i, false, false, false);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public AbstractC44552i mo133206a(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo) {
                return C36083a.m141486a().getOpenPlatformDependency().mo133005a(context, iTitleController, tabAppInfo);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public void mo133214a(Context context, String str, int i) {
                AbstractC29542ad b = AbstractC36232b.m142703a().mo178821b();
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(1);
                b.mo105570a(context, str, contactSource);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: b */
            public boolean mo133238b(Context context, Uri uri, boolean z) {
                if (z) {
                    return C51707a.m200495a().mo103468a(context, uri);
                }
                return C51707a.m200495a().mo103474b(context, uri);
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a
            /* renamed from: a */
            public AbstractC44552i mo133207a(Context context, AbstractC44548e eVar, ITitleController iTitleController, TabAppInfo tabAppInfo) {
                return C36083a.m141486a().getOpenPlatformDependency().mo133006a(context, eVar, iTitleController, tabAppInfo);
            }
        };
    }
}
