package com.ss.android.lark.integrator.minutes;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.p085b.C2219g;
import com.bumptech.glide.load.p085b.C2223j;
import com.bumptech.glide.request.C2537g;
import com.bumptech.glide.request.p095a.AbstractC2520h;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.C29538a;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IUiModeService;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.ShareTextForwardData;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.integrator.minutes.MinutesDependencyInjector;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.minutes.push.MmPushProxy;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.AbstractC45898b;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.module.share.model.C47008a;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47087j;
import com.ss.android.lark.mm.utils.UrlUtil;
import com.ss.android.lark.mm.widget.onboarding.MmNewGuideConfig;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p2550q.p2551a.C52926b;
import com.ss.android.lark.passport.signinsdk_api.entity.AccountInterceptorBean;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor;
import com.ss.android.lark.passport_api.IEnv;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.vc.api.IVCApi;
import com.ss.android.lark.vcintegrator.guide.GuideBridge;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dto.NewGuideConfig;
import io.reactivex.Scheduler;
import java.io.File;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public final class MinutesDependencyInjector {

    /* renamed from: a */
    public static List<IMmDepend.AbstractC45888o.AbstractC45889a> f101518a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static Map<IMmDepend.AbstractC45871b.AbstractC45873b, C29538a> f101519b = new HashMap();

    /* renamed from: c */
    public static Map<IMmDepend.AbstractC45871b.AbstractC45874c, AbstractC29586u> f101520c = new IdentityHashMap();

    /* renamed from: d */
    public static IPassportApi f101521d = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

    @ClaymoreImpl(IMmDepend.class)
    public static class MmDependImpl implements IMmDepend {
        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45870a getBrowserDepend() {
            return new IMmDepend.AbstractC45870a() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398693 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45870a
                /* renamed from: a */
                public void mo144660a(Context context, String str) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45875c getDomainDepend() {
            return new IMmDepend.AbstractC45875c() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass21 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45875c
                /* renamed from: f */
                public String mo144621f() {
                    return C52926b.C52927a.m204904a("vc_mm_url_pattern");
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45875c
                /* renamed from: g */
                public String mo144622g() {
                    return C52926b.C52927a.m204904a("vc_live_link_identifier");
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45875c
                /* renamed from: d */
                public String mo144619d() {
                    String a = DynamicConfigModule.m145552b().mo136165a("suite_main_domain");
                    if (a != null) {
                        return a;
                    }
                    return "";
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45875c
                /* renamed from: e */
                public String mo144620e() {
                    String a = DynamicConfigModule.m145552b().mo136165a("open_moment");
                    if (a != null) {
                        return a;
                    }
                    return "";
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45875c
                /* renamed from: h */
                public String mo144623h() {
                    String a = DynamicConfigModule.m145552b().mo136165a("tt_dns_server_host");
                    if (a != null) {
                        return a;
                    }
                    return "";
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45875c
                /* renamed from: b */
                public String mo144617b() {
                    List<String> b = DynamicConfigModule.m145553b(DomainSettings.Alias.VC_MM);
                    if (b == null || b.size() <= 0) {
                        return "";
                    }
                    return "https://" + b.get(0);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45875c
                /* renamed from: c */
                public String mo144618c() {
                    String a = DynamicConfigModule.m145552b().mo136165a("applink");
                    if (TextUtils.isEmpty(a)) {
                        return null;
                    }
                    return "https://" + a;
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45875c
                /* renamed from: a */
                public String mo144616a() {
                    List<String> b = DynamicConfigModule.m145553b(DomainSettings.Alias.VC_MM);
                    if (b == null || b.size() <= 0) {
                        return "https://meetings.feishu-boe.cn";
                    }
                    if (MinutesDependencyInjector.f101521d.provideEnv(LarkContext.getApplication()).mo145139d() == 3) {
                        String[] split = b.get(0).split("\\.");
                        String str = "";
                        for (int i = 0; i < split.length; i++) {
                            String str2 = ".";
                            if (i == split.length - 2) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(split[i]);
                                if (!split[i].endsWith("-pre")) {
                                    str2 = "-pre.";
                                }
                                sb.append(str2);
                                str = sb.toString();
                            } else {
                                str = str + split[i] + str2;
                            }
                        }
                        return "https://" + str.substring(0, str.length() - 1);
                    }
                    return "https://" + b.get(0);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45876d getFeatureGatingDepend() {
            return new IMmDepend.AbstractC45876d() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398704 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45876d
                /* renamed from: a */
                public boolean mo144661a(String str, boolean z) {
                    return C37239a.m146648b().mo136955b(str, z);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45884l getGuideDependency() {
            return new IMmDepend.AbstractC45884l() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass18 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45884l
                /* renamed from: a */
                public boolean mo144594a(String str) {
                    return GuideBridge.f142662a.mo196591a(str);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45884l
                /* renamed from: a */
                public void mo144593a(MmNewGuideConfig mmNewGuideConfig, final IMmDepend.AbstractC45884l.AbstractC45885a aVar) {
                    GuideBridge.f142662a.mo196589a(new NewGuideConfig(mmNewGuideConfig.mo165787a(), mmNewGuideConfig.mo165788b(), mmNewGuideConfig.mo165789c(), mmNewGuideConfig.mo165791d(), mmNewGuideConfig.mo165792e()), new AbstractC60902q.AbstractC60903a() {
                        /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass18.C398631 */

                        @Override // com.ss.android.vc.dependency.AbstractC60902q.AbstractC60903a
                        /* renamed from: a */
                        public void mo144595a(String str) {
                            IMmDepend.AbstractC45884l.AbstractC45885a aVar = aVar;
                            if (aVar != null) {
                                aVar.mo161220a(str);
                            }
                        }

                        @Override // com.ss.android.vc.dependency.AbstractC60902q.AbstractC60903a
                        /* renamed from: b */
                        public void mo144596b(String str) {
                            IMmDepend.AbstractC45884l.AbstractC45885a aVar = aVar;
                            if (aVar != null) {
                                aVar.mo161221b(str);
                            }
                        }

                        @Override // com.ss.android.vc.dependency.AbstractC60902q.AbstractC60903a
                        /* renamed from: c */
                        public void mo144597c(String str) {
                            IMmDepend.AbstractC45884l.AbstractC45885a aVar = aVar;
                            if (aVar != null) {
                                aVar.mo161222c(str);
                            }
                        }
                    });
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45878f getHitPointDepend() {
            return new IMmDepend.AbstractC45878f() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398642 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45878f
                /* renamed from: a */
                public void mo144605a(String str) {
                    Statistics.sendEvent(str, C47087j.m186456a());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45878f
                /* renamed from: a */
                public void mo144603a(C47084f fVar, String str) {
                    Statistics.sendEvent(str, C47087j.m186457a(fVar, C47087j.m186456a()));
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45878f
                /* renamed from: a */
                public void mo144606a(String str, JSONObject jSONObject) {
                    Statistics.sendEvent(str, C47087j.m186458a(jSONObject));
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45878f
                /* renamed from: a */
                public void mo144604a(C47084f fVar, String str, JSONObject jSONObject) {
                    Statistics.sendEvent(str, C47087j.m186457a(fVar, C47087j.m186458a(jSONObject)));
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45880h getHttpExecutorDepend() {
            return new IMmDepend.AbstractC45880h() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass22 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45880h
                /* renamed from: a */
                public void mo144625a(String str, String str2, Map<String, String> map, HttpHeaders httpHeaders, AbstractC47070c cVar) {
                    C52926b.C52927a.m204907a(MinutesDependencyInjector.m158238a(str, str2, map), httpHeaders, cVar, str2);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45880h
                /* renamed from: a */
                public void mo144624a(String str, HttpHeaders httpHeaders, Map<String, String> map, Map<String, Pair<String, File>> map2, AbstractC47070c cVar) {
                    C52926b.C52927a.m204911a(C45899c.m181859a().getDomainDepend().mo144616a() + str, httpHeaders, map, map2, cVar);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45880h
                /* renamed from: a */
                public void mo144626a(String str, String str2, Map<String, String> map, HttpHeaders httpHeaders, AbstractC47070c cVar, IHttpLocalErrorHandler aVar) {
                    C52926b.C52927a.m204908a(MinutesDependencyInjector.m158238a(str, str2, map), httpHeaders, cVar, str2, aVar);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45880h
                /* renamed from: a */
                public void mo144627a(String str, String str2, Map<String, String> map, Map<String, String> map2, HttpHeaders httpHeaders, AbstractC47070c cVar) {
                    C52926b.C52927a.m204909a(MinutesDependencyInjector.m158238a(str, str2, map), httpHeaders, map2, cVar, str2);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45880h
                /* renamed from: a */
                public void mo144628a(String str, String str2, Map<String, String> map, Map<String, String> map2, HttpHeaders httpHeaders, AbstractC47070c cVar, IHttpLocalErrorHandler aVar) {
                    C52926b.C52927a.m204910a(MinutesDependencyInjector.m158238a(str, str2, map), httpHeaders, map2, cVar, str2, aVar);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45881i getImageLoaderDepend() {
            return new IMmDepend.AbstractC45881i() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass20 */

                /* renamed from: a */
                private C2223j.C2224a m158291a(C2223j.C2224a aVar) {
                    for (Map.Entry<String, String> entry : C47057a.m186234a().headersMap.entrySet()) {
                        aVar.mo10586a(entry.getKey(), entry.getValue());
                    }
                    return aVar;
                }

                /* renamed from: a */
                public C2219g mo144607a(String str) {
                    C2223j.C2224a aVar = new C2223j.C2224a();
                    for (Map.Entry<String, String> entry : C47057a.m186234a().headersMap.entrySet()) {
                        aVar.mo10586a(entry.getKey(), entry.getValue());
                    }
                    return new C2219g(str, aVar.mo10587a());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45881i
                /* renamed from: a */
                public void mo144609a(final ImageView imageView, final String str) {
                    if (!TextUtils.isEmpty(str)) {
                        imageView.post(new Runnable() {
                            /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass20.RunnableC398651 */

                            public void run() {
                                ((C2124f) ComponentCallbacks2C2115c.m9151c(C45851c.m181646a()).mo10430i().mo10395a((Object) AnonymousClass20.this.mo144607a(str)).mo10391a(new C2537g().mo11144c(imageView.getMeasuredWidth(), imageView.getMeasuredHeight())).mo11157n()).mo10397a((AbstractC2522j) new AbstractC2520h<Bitmap>() {
                                    /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass20.RunnableC398651.C398661 */

                                    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                                    /* renamed from: a */
                                    public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
                                        mo144614a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
                                    }

                                    /* renamed from: a */
                                    public void mo144614a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
                                        C45855f.m181663b("MinutesDependencyInjector", "url: " + str);
                                        imageView.setImageBitmap(bitmap);
                                    }
                                });
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45881i
                /* renamed from: b */
                public void mo144612b(ImageView imageView, String str) {
                    ComponentCallbacks2C2115c.m9151c(C45851c.m181646a()).mo10414a(new C2219g(str, m158291a(new C2223j.C2224a()).mo10587a())).mo10391a(((C2537g) new C2537g().mo11123a(R.drawable.mm_icon_avatar_placeholder)).mo11143c(R.drawable.mm_icon_avatar_placeholder)).mo10399a(imageView);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45881i
                /* renamed from: a */
                public void mo144610a(ImageView imageView, String str, int i) {
                    ComponentCallbacks2C2115c.m9151c(C45851c.m181646a()).mo10414a(new C2219g(str, m158291a(new C2223j.C2224a()).mo10587a())).mo10391a(((C2537g) new C2537g().mo11123a(i)).mo11143c(i)).mo10399a(imageView);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45881i
                /* renamed from: a */
                public void mo144608a(Context context, String str, int i, int i2, final C45853e.AbstractC45854a aVar) {
                    ((C2124f) ComponentCallbacks2C2115c.m9151c(C45851c.m181646a()).mo10430i().mo10395a((Object) new C2219g(str, m158291a(new C2223j.C2224a()).mo10587a())).mo11157n()).mo10391a(((C2537g) ((C2537g) new C2537g().mo11144c(i, i2)).mo11123a(R.drawable.mm_icon_avatar_placeholder)).mo11143c(R.drawable.mm_icon_avatar_placeholder)).mo10397a((AbstractC2522j) new AbstractC2520h<Bitmap>(i, i2) {
                        /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass20.C398672 */

                        @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
                        /* renamed from: a */
                        public void mo11036a(Drawable drawable) {
                        }

                        /* renamed from: a */
                        public void mo144615a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
                            aVar.mo161154a(bitmap);
                        }

                        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                        /* renamed from: a */
                        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
                            mo144615a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
                        }
                    });
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45881i
                /* renamed from: a */
                public void mo144611a(ImageView imageView, String str, String str2, int i, int i2, int i3, int i4) {
                    AvatarImage build = AvatarImage.Builder.obtain(str, str2, i, i2).build();
                    ImageLoader.with(LarkContext.getApplication()).load(AvatarImage.Builder.obtain(str, str2, i3, i4).build()).thumbnail(ImageLoader.with(LarkContext.getApplication()).load(build)).into(imageView);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45882j getLanguageDependency() {
            return new IMmDepend.AbstractC45882j() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398737 */

                /* renamed from: a */
                ICoreApi f101571a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45882j
                /* renamed from: a */
                public Locale mo144665a() {
                    return this.f101571a.getCacheLanguageSetting();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45882j
                /* renamed from: b */
                public Locale mo144666b() {
                    return this.f101571a.getLanguageSetting();
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public AbstractC45897a getLifecycleDependency() {
            return new AbstractC45897a() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass11 */

                /* renamed from: a */
                ICoreApi f101534a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

                @Override // com.ss.android.lark.mm.depend.AbstractC45897a
                /* renamed from: a */
                public Activity mo144570a() {
                    return this.f101534a.getLastTopActivity();
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45897a
                /* renamed from: b */
                public boolean mo144571b() {
                    return this.f101534a.isAppRealForeground();
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45883k getLogDepend() {
            return new IMmDepend.AbstractC45883k() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass12 */

                /* renamed from: b */
                private String f101537b = "mm_";

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45883k
                /* renamed from: a */
                public void mo144572a(String str, String str2) {
                    Log.m165393v(this.f101537b + str, str2);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45883k
                /* renamed from: b */
                public void mo144573b(String str, String str2) {
                    Log.m165379d(this.f101537b + str, str2);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45883k
                /* renamed from: c */
                public void mo144574c(String str, String str2) {
                    Log.m165389i(this.f101537b + str, str2);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45883k
                /* renamed from: d */
                public void mo144575d(String str, String str2) {
                    Log.m165397w(this.f101537b + str, str2);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45883k
                /* renamed from: e */
                public void mo144576e(String str, String str2) {
                    Log.m165385e(this.f101537b + str, str2, null, true);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45886m getMagicDependency() {
            return new IMmDepend.AbstractC45886m() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass16 */

                /* renamed from: a */
                ICoreApi f101543a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45886m
                /* renamed from: a */
                public void mo144591a(String str) {
                    this.f101543a.unregisterScenario(str);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45886m
                /* renamed from: a */
                public void mo144592a(String str, Context context, Map<String, String> map) {
                    this.f101543a.registerScenario(str, map, new MagicViewContainer(context), null);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45890p getMultiTaskDependency() {
            return new IMmDepend.AbstractC45890p() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass14 */

                /* renamed from: a */
                ICoreApi f101539a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45890p
                /* renamed from: a */
                public boolean mo144587a() {
                    return this.f101539a.isMultitaskEnabled(LarkContext.getApplication());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45890p
                /* renamed from: a */
                public void mo144586a(View view) {
                    this.f101539a.addAppFloatView(view);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45890p
                /* renamed from: b */
                public void mo144588b(View view) {
                    this.f101539a.removeAppFloatView(view);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45891q getPushDependency() {
            return new IMmDepend.AbstractC45891q() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398748 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45891q
                /* renamed from: a */
                public void mo144667a() {
                    MmPushProxy.f130788a.mo180836a();
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45887n getSettingDepend() {
            return new IMmDepend.AbstractC45887n() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398715 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45887n
                /* renamed from: a */
                public String mo144662a(String str) {
                    return C52926b.C52927a.m204904a(str);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45892r getShareDepend() {
            return new IMmDepend.AbstractC45892r() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398726 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45892r
                /* renamed from: a */
                public boolean mo144664a() {
                    return "1".equals(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantId());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45892r
                /* renamed from: a */
                public void mo144663a(String str, String str2, String str3, boolean z) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goShareForwardSelectPage(LarkContext.getApplication(), new ShareTextForwardData(str, str2, str3, z));
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public AbstractC45898b getSpDependency() {
            return new AbstractC45898b() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass13 */

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: b */
                public void mo144585b(String str) {
                    C57744a.m224104a().remove(str);
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: a */
                public int mo144577a(String str) {
                    return C57744a.m224104a().getInt(str);
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: a */
                public void mo144579a(String str, int i) {
                    C57744a.m224104a().putInt(str, i);
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: b */
                public int mo144583b(String str, int i) {
                    return C57744a.m224104a().getInt(str, i);
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: a */
                public <T> T mo144578a(String str, Class<T> cls) {
                    return (T) C57744a.m224104a().getJSONObject(str, cls);
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: b */
                public String mo144584b(String str, String str2) {
                    return C57744a.m224104a().getString(str, str2);
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: a */
                public void mo144580a(String str, Object obj) {
                    C57744a.m224104a().putJSONObject(str, obj);
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: a */
                public void mo144581a(String str, String str2) {
                    C57744a.m224104a().putString(str, str2);
                }

                @Override // com.ss.android.lark.mm.depend.AbstractC45898b
                /* renamed from: a */
                public boolean mo144582a(String str, boolean z) {
                    return C57744a.m224104a().getBoolean(str, z);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45893s getThreadDepend() {
            return new IMmDepend.AbstractC45893s() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass19 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45893s
                /* renamed from: a */
                public Scheduler mo144598a() {
                    return LarkRxSchedulers.io();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45893s
                /* renamed from: b */
                public Scheduler mo144600b() {
                    return LarkRxSchedulers.computation();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45893s
                /* renamed from: c */
                public ScheduledExecutorService mo144602c() {
                    return CoreThreadPool.getDefault().getScheduleThreadPool();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45893s
                /* renamed from: a */
                public void mo144599a(Runnable runnable) {
                    CoreThreadPool.getDefault().getCachedThreadPool().execute(runnable);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45893s
                /* renamed from: b */
                public void mo144601b(Runnable runnable) {
                    CoreThreadPool.getDefault().getCachedThreadPool().execute(runnable);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45894t getUiDepend() {
            return new IMmDepend.AbstractC45894t() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass25 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45894t
                /* renamed from: a */
                public void mo144658a(Context context, String str) {
                    UDToast.show(context, str);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45894t
                /* renamed from: a */
                public void mo144659a(Context context, String str, int i) {
                    UDToast.show(context, str, i);
                }
            };
        }

        public IMmDepend.AbstractC45888o getUiModeDependency() {
            return new IMmDepend.AbstractC45888o() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass17 */
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45895u getUserSettingDependency() {
            return new IMmDepend.AbstractC45895u() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398759 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45895u
                /* renamed from: a */
                public boolean mo144668a() {
                    if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocalTimeFormat().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                        return true;
                    }
                    return false;
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45896v getVideoChatDependency() {
            return new IMmDepend.AbstractC45896v() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass15 */

                /* renamed from: a */
                IVCApi f101541a = ((IVCApi) ApiUtils.getApi(IVCApi.class));

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45896v
                /* renamed from: a */
                public boolean mo144589a() {
                    return this.f101541a.isLivingInFloat();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45896v
                /* renamed from: b */
                public boolean mo144590b() {
                    return this.f101541a.hasMeetingOngoingOnCurrentProcess();
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.IWschannelDependency getWschannelDependency() {
            return new IMmDepend.IWschannelDependency() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass10 */

                /* renamed from: a */
                ConcurrentHashMap f101529a = new ConcurrentHashMap();

                /* renamed from: b */
                ICoreApi f101530b = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

                @Override // com.ss.android.lark.mm.depend.IMmDepend.IWschannelDependency
                /* renamed from: a */
                public IMmDepend.IWschannelDependency.MmNetworkLevel mo144566a() {
                    return mo144567a(this.f101530b.getCurNetWorkLevel());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.IWschannelDependency
                /* renamed from: a */
                public void mo144568a(final IMmDepend.IWschannelDependency.AbstractC45869a aVar) {
                    if (aVar != null) {
                        C398621 r0 = new NetworkLevelListener() {
                            /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass10.C398621 */

                            @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
                            public void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                                aVar.mo161212a(AnonymousClass10.this.mo144567a(networkLevel));
                            }
                        };
                        this.f101530b.registerNetworkLevelListener(r0);
                        this.f101529a.put(aVar, r0);
                    }
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.IWschannelDependency
                /* renamed from: b */
                public void mo144569b(IMmDepend.IWschannelDependency.AbstractC45869a aVar) {
                    if (aVar != null) {
                        this.f101530b.unRegisterNetworkLevelListener((NetworkLevelListener) this.f101529a.remove(aVar));
                    }
                }

                /* renamed from: a */
                public IMmDepend.IWschannelDependency.MmNetworkLevel mo144567a(NetworkLevelListener.NetworkLevel networkLevel) {
                    int i = C398582.f101522a[networkLevel.ordinal()];
                    if (i == 1) {
                        return IMmDepend.IWschannelDependency.MmNetworkLevel.NET_UNAVAILABLE;
                    }
                    if (i == 2) {
                        return IMmDepend.IWschannelDependency.MmNetworkLevel.WEAK;
                    }
                    if (i == 3) {
                        return IMmDepend.IWschannelDependency.MmNetworkLevel.EXCELLENT;
                    }
                    if (i == 4) {
                        return IMmDepend.IWschannelDependency.MmNetworkLevel.SERVICE_UNAVAILABLE;
                    }
                    if (i != 5) {
                        return null;
                    }
                    return IMmDepend.IWschannelDependency.MmNetworkLevel.EVALUATING;
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45871b getContextDepend() {
            final ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            return new IMmDepend.AbstractC45871b() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398591 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b
                /* renamed from: a */
                public Context mo144557a() {
                    return LarkContext.getApplication();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b
                /* renamed from: b */
                public Context mo144562b() {
                    return iCoreApi.getTopActivity();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b
                /* renamed from: a */
                public void mo144559a(final IMmDepend.AbstractC45871b.AbstractC45873b bVar) {
                    C398601 r0 = new C29538a() {
                        /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398591.C398601 */

                        @Override // com.ss.android.lark.biz.core.api.C29538a
                        public void onActivityDestroyed(Activity activity) {
                            bVar.mo161219e(activity);
                        }

                        @Override // com.ss.android.lark.biz.core.api.C29538a
                        public void onActivityPaused(Activity activity) {
                            bVar.mo161217c(activity);
                        }

                        @Override // com.ss.android.lark.biz.core.api.C29538a
                        public void onActivityResumed(Activity activity) {
                            bVar.mo161215b(activity);
                        }

                        @Override // com.ss.android.lark.biz.core.api.C29538a
                        public void onActivityStarted(Activity activity) {
                            bVar.mo161213a(activity);
                        }

                        @Override // com.ss.android.lark.biz.core.api.C29538a
                        public void onActivityStopped(Activity activity) {
                            bVar.mo161218d(activity);
                        }

                        @Override // com.ss.android.lark.biz.core.api.C29538a
                        public void onActivityCreated(Activity activity, Bundle bundle) {
                            bVar.mo161214a(activity, bundle);
                        }

                        @Override // com.ss.android.lark.biz.core.api.C29538a
                        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            bVar.mo161216b(activity, bundle);
                        }
                    };
                    iCoreApi.addActivityObserver(r0);
                    MinutesDependencyInjector.f101519b.put(bVar, r0);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b
                /* renamed from: b */
                public boolean mo144565b(String str) {
                    return iCoreApi.checkToShow(str);
                }

                /* renamed from: a */
                public IMmDepend.AbstractC45871b.C45872a mo144558a(AbstractC29586u.C29587a aVar) {
                    if (aVar != null) {
                        return new IMmDepend.AbstractC45871b.C45872a(aVar.mo105885a(), aVar.mo105886b(), aVar.mo105887c(), aVar.mo105888d());
                    }
                    return null;
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b
                /* renamed from: b */
                public void mo144563b(IMmDepend.AbstractC45871b.AbstractC45873b bVar) {
                    C29538a aVar = MinutesDependencyInjector.f101519b.get(bVar);
                    if (aVar != null) {
                        iCoreApi.removeActivityObserver(aVar);
                        MinutesDependencyInjector.f101519b.remove(bVar);
                    }
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b
                /* renamed from: a */
                public void mo144560a(final IMmDepend.AbstractC45871b.AbstractC45874c cVar) {
                    C398612 r0 = new AbstractC29586u() {
                        /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.C398591.C398612 */

                        @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                        public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                            cVar.mo149331a(C398591.this.mo144558a(aVar), C398591.this.mo144558a(aVar2));
                        }
                    };
                    iCoreApi.addLifecycleObserver(r0);
                    MinutesDependencyInjector.f101520c.put(cVar, r0);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b
                /* renamed from: b */
                public void mo144564b(IMmDepend.AbstractC45871b.AbstractC45874c cVar) {
                    AbstractC29586u uVar = MinutesDependencyInjector.f101520c.get(cVar);
                    if (uVar != null) {
                        iCoreApi.removeLifecycleObserver(uVar);
                        MinutesDependencyInjector.f101520c.remove(cVar);
                    }
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b
                /* renamed from: a */
                public void mo144561a(String str) {
                    iCoreApi.completeGuide(str);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45877e getForwardDependency() {
            return new IMmDepend.AbstractC45877e() {
                /* class com.ss.android.lark.integrator.minutes.$$Lambda$MinutesDependencyInjector$MmDependImpl$3jDPHYIdtLLKXFVIIHLYHOsM95A */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45877e
                public final void gotoShareForwardSelectPage(Context context, String str, String str2, String str3) {
                    MinutesDependencyInjector.MmDependImpl.lambda$getForwardDependency$0(ICoreApi.this, context, str, str2, str3);
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.AbstractC45879g getHostDepend() {
            final ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            return new IMmDepend.AbstractC45879g() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass23 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: m */
                public String mo144645m() {
                    return "vc_foreground";
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: n */
                public String mo144646n() {
                    return "vc_foreground";
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: c */
                public String mo144635c() {
                    return iCoreApi.getLanguageWithLocal();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: g */
                public String mo144639g() {
                    return UIHelper.getAppName();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: j */
                public long mo144642j() {
                    return iCoreApi.getNtpTime();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: a */
                public String mo144630a() {
                    return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: e */
                public String mo144637e() {
                    return C26246a.m94977a(C45851c.m181646a());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: f */
                public String mo144638f() {
                    return C57824f.m224460a(LarkContext.getApplication(), null, iCoreApi.getLanguageSetting());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: h */
                public String mo144640h() {
                    return C26246a.m94977a(C45851c.m181646a());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: i */
                public List<String> mo144641i() {
                    return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getWholeReactionList();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: k */
                public boolean mo144643k() {
                    return C26284k.m95185a(LarkContext.getApplication());
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: l */
                public boolean mo144644l() {
                    if (iCoreApi.getTabType("videomm") != TabType.Others) {
                        return true;
                    }
                    return false;
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: b */
                public String mo144634b() {
                    return C29410a.m108287a().mo104277a() + "";
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: d */
                public IMmDepend.MmAppEnv mo144636d() {
                    IEnv provideEnv = MinutesDependencyInjector.f101521d.provideEnv(LarkContext.getApplication());
                    if (provideEnv.mo145139d() == 1) {
                        return IMmDepend.MmAppEnv.RELEASE;
                    }
                    if (provideEnv.mo145139d() == 3) {
                        return IMmDepend.MmAppEnv.PRE_RELEASE;
                    }
                    if (provideEnv.mo145139d() == 2) {
                        return IMmDepend.MmAppEnv.STAGING;
                    }
                    return IMmDepend.MmAppEnv.RELEASE;
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: a */
                public String mo144631a(String str) {
                    return "mm#" + SystemClock.elapsedRealtimeNanos();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: a */
                public void mo144632a(Context context, Bundle bundle) {
                    iCoreApi.launchMainWindow(context, "videomm", bundle);
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: a */
                public DialogInterface$OnCancelListenerC1021b mo144629a(FragmentActivity fragmentActivity, C47008a aVar) {
                    return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).providePermissionProvider().mo17074a(C39877b.m158361a(fragmentActivity, aVar));
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45879g
                /* renamed from: a */
                public void mo144633a(Context context, String str, BaseUserType baseUserType) {
                    if (BaseUserType.Companion.mo161470b(baseUserType.getValue())) {
                        ContactSource contactSource = new ContactSource();
                        contactSource.setSourceType(5);
                        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
                        contactSource.setSender(iPassportApi.getUser().name);
                        contactSource.setSenderId(iPassportApi.getUserId());
                        iCoreApi.startUserProfile(context, str, null, contactSource);
                    }
                }
            };
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public AbstractC25990b getHttpClient() {
            return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLarkHttpClient();
        }

        @Override // com.ss.android.lark.mm.depend.IMmDepend
        public IMmDepend.ILoginDepend getLoginDepend() {
            final IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
            return new IMmDepend.ILoginDepend() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass24 */

                @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend
                /* renamed from: a */
                public String mo144647a() {
                    return iPassportApi.getUserId();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend
                /* renamed from: b */
                public String mo144650b() {
                    return iPassportApi.getTenantId();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend
                /* renamed from: d */
                public String mo144652d() {
                    return iPassportApi.getSession();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend
                /* renamed from: e */
                public boolean mo144653e() {
                    return iPassportApi.isLogin();
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend
                /* renamed from: c */
                public String mo144651c() {
                    return iPassportApi.getUser().name;
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend
                /* renamed from: a */
                public void mo144648a(final IMmDepend.ILoginDepend.IMmAccountInterceptor iMmAccountInterceptor) {
                    iPassportApi.registerInterceptor(new IAccountInterceptor() {
                        /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.MmDependImpl.AnonymousClass24.C398681 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                        /* renamed from: a */
                        public boolean mo144654a() {
                            return iMmAccountInterceptor.mo161146a();
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                        /* renamed from: c */
                        public int mo144656c() {
                            return iMmAccountInterceptor.mo161148c();
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                        /* renamed from: d */
                        public int mo144657d() {
                            return iMmAccountInterceptor.mo161149d();
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor
                        /* renamed from: b */
                        public AccountInterceptorBean mo144655b() {
                            IMmDepend.ILoginDepend.C45868b b = iMmAccountInterceptor.mo161147b();
                            if (b == null) {
                                return null;
                            }
                            return new AccountInterceptorBean(b.mo161207a(), b.mo161208b(), b.mo161209c(), b.mo161210d());
                        }
                    });
                }

                @Override // com.ss.android.lark.mm.depend.IMmDepend.ILoginDepend
                /* renamed from: a */
                public void mo144649a(IMmDepend.ILoginDepend.AbstractC45867a aVar) {
                    new IAccountChangeObserver.AbstractC49385a() {
                        /* class com.ss.android.lark.integrator.minutes.$$Lambda$MinutesDependencyInjector$MmDependImpl$24$xO4KPlS1MSTzfqoMR7Bdz0UeLiI */

                        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver.AbstractC49385a
                        public final void onAccountChange(LoginInfo loginInfo) {
                            MinutesDependencyInjector.MmDependImpl.AnonymousClass24.m158334a(IMmDepend.ILoginDepend.AbstractC45867a.this, loginInfo);
                        }
                    };
                    iPassportApi.registerUserSwitchListener(new AbstractC49379a() {
                        /* class com.ss.android.lark.integrator.minutes.$$Lambda$MinutesDependencyInjector$MmDependImpl$24$hQMrvIT44kWB4SKNDho0Y7WwfyI */

                        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                        /* renamed from: a */
                        public /* synthetic */ void mo102549a(C49380b bVar) {
                            AbstractC49379a.CC.$default$a(this, bVar);
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                        /* renamed from: a */
                        public /* synthetic */ void mo102550a(C49381c cVar) {
                            AbstractC49379a.CC.$default$a(this, cVar);
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                        public final void onUserSwitchSuccess(C49382d dVar) {
                            MinutesDependencyInjector.MmDependImpl.AnonymousClass24.m158335a(IMmDepend.ILoginDepend.AbstractC45867a.this, dVar);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m158334a(IMmDepend.ILoginDepend.AbstractC45867a aVar, LoginInfo loginInfo) {
                    String str;
                    if (loginInfo == null) {
                        str = null;
                    } else {
                        str = loginInfo.getUserId();
                    }
                    aVar.onAccountChange(str);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m158335a(IMmDepend.ILoginDepend.AbstractC45867a aVar, C49382d dVar) {
                    aVar.onAccountChange(dVar.f123937c.getUserId());
                }
            };
        }

        static /* synthetic */ void lambda$getForwardDependency$0(ICoreApi iCoreApi, Context context, String str, String str2, String str3) {
            Message message = new Message();
            message.setType(Message.Type.TEXT);
            TextContent textContent = new TextContent();
            textContent.setRichText(C59029c.m229161b(str));
            message.setMessageContent(textContent);
            ShareModel shareModel = new ShareModel();
            shareModel.setTitle(str2);
            shareModel.setUrl(str);
            shareModel.setContent(str3);
            shareModel.setImage("");
            iCoreApi.gotoShareForwardSelectPage(context, message, shareModel);
        }
    }

    /* renamed from: a */
    public static void m158240a() {
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (iCoreApi.getUiModeService().mo105602a()) {
            iCoreApi.getUiModeService().mo105601a(new IUiModeService.UiModeChangeListener() {
                /* class com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.C398571 */

                @Override // com.ss.android.lark.biz.core.api.IUiModeService.UiModeChangeListener
                public void onNightModeChange(int i) {
                    for (IMmDepend.AbstractC45888o.AbstractC45889a aVar : MinutesDependencyInjector.f101518a) {
                        aVar.mo161223a(i);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.integrator.minutes.MinutesDependencyInjector$2 */
    public static /* synthetic */ class C398582 {

        /* renamed from: a */
        static final /* synthetic */ int[] f101522a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel[] r0 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.C398582.f101522a = r0
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.NET_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.C398582.f101522a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.WEAK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.C398582.f101522a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.C398582.f101522a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.SERVICE_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.C398582.f101522a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.biz.core.api.NetworkLevelListener$NetworkLevel r1 = com.ss.android.lark.biz.core.api.NetworkLevelListener.NetworkLevel.EVALUATING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.minutes.MinutesDependencyInjector.C398582.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m158239a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map == null || map.size() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith("?")) {
            sb.append("?");
        }
        boolean z = true;
        for (String str2 : map.keySet()) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(UrlUtil.f118671a.mo165519c(map.get(str2)))) {
                if (z) {
                    z = false;
                } else {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                sb.append(str2);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m158238a(String str, String str2, Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return str + str2;
        }
        return str + m158239a(str2, map);
    }
}
