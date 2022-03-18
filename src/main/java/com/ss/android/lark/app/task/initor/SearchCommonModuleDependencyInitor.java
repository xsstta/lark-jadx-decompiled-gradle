package com.ss.android.lark.app.task.initor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.larksuite.component.metriclogger.AbstractC24339c;
import com.larksuite.component.metriclogger.C24350k;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.env.AppEnvType;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.ViewUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jp.wasabeef.glide.transformations.AbstractC69021a;

public class SearchCommonModuleDependencyInitor {
    /* renamed from: a */
    public static void m106523a(final Context context) {
        SearchCommonModuleDependency.m208731a(new SearchCommonModuleDependency.ISearchCommonModuleDependency() {
            /* class com.ss.android.lark.app.task.initor.SearchCommonModuleDependencyInitor.C290071 */

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102891a(Context context, String str) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startUserProfile(context, str, null, new ContactSource.C29531a().mo104728a());
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102893a(final Context context, final String str, final String str2) {
                C26171w.m94675a(new Runnable() {
                    /* class com.ss.android.lark.app.task.initor.SearchCommonModuleDependencyInitor.C290071.RunnableC290092 */

                    public void run() {
                        ((IIMApi) ApiUtils.getApi(IIMApi.class)).callUserConfirm(ViewUtils.m224141a(context), str, str2);
                    }
                });
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102892a(Context context, String str, ImageView imageView, Drawable drawable, Drawable drawable2, int i, int i2) {
                LoadParams loadParams = new LoadParams();
                loadParams.mo105413a(i).mo105422b(i2);
                if (drawable != null) {
                    loadParams.mo105414a(drawable);
                }
                if (drawable2 != null) {
                    loadParams.mo105423b(drawable2);
                }
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadLocalOrUrlImage(context, imageView, str, loadParams);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102897a(String str, IGetDataCallback<Chat> iGetDataCallback) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChatById(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102900a(boolean z, long j, C24341b bVar, Map<String, ?> map) {
                AbstractC24339c cVar;
                if (z) {
                    cVar = C24350k.m88899a(j, bVar);
                } else {
                    cVar = C24350k.m88900a(bVar);
                }
                if (map != null) {
                    for (String str : map.keySet()) {
                        cVar.mo87077a(str, map.get(str));
                    }
                }
                cVar.mo87079a();
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102899a(List<String> list, UIGetDataCallback<Map<String, Chatter>> uIGetDataCallback) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChattersByIds(list, uIGetDataCallback);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102896a(String str, int i) {
                if (!TextUtils.isEmpty(str)) {
                    ((IIMApi) ApiUtils.getApi(IIMApi.class)).openChat(context, ChatBundle.m109259a().mo105927a(str).mo105920a(i).mo105933c("search").mo105923a(ChatBundle.SourceType.SEARCH).mo105941h(true).mo105929a());
                }
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102898a(String str, SearchCommonConstants.FeedType feedType) {
                if (!TextUtils.isEmpty(str) && feedType != null) {
                    ((IIMApi) ApiUtils.getApi(IIMApi.class)).peakFeedCard(str, FeedCard.Type.forNumber(feedType.getNumber()));
                }
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public boolean mo102902a(Context context) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openPrivacyPolicy(context);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102894a(Context context, String str, String str2, String str3, int i, int i2, AbstractC69021a aVar, ImageView imageView) {
                C2124f<Drawable> a = ComponentCallbacks2C2115c.m9151c(context).mo10414a(AvatarImage.Builder.obtain(str, str2, i, i2).fsUnit(str3).build());
                if (aVar != null) {
                    ((C2124f) a.mo11130a((AbstractC2393i<Bitmap>) aVar)).mo10399a(imageView);
                } else {
                    a.mo10399a(imageView);
                }
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public boolean mo102901a(long j) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInZenMode(j);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102895a(SearchCommonModuleDependency.ISearchCommonModuleDependency.IOnLanguageChangeListener aVar) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerLanguageChangeListener(new AbstractC29540ab() {
                    /* class com.ss.android.lark.app.task.initor.$$Lambda$SearchCommonModuleDependencyInitor$1$4R6nLYUG2L0zGqrfkuStjcI4Ic8 */

                    @Override // com.ss.android.lark.biz.core.api.AbstractC29540ab
                    public final void onLanguageChange(Locale locale, Locale locale2) {
                        SearchCommonModuleDependency.ISearchCommonModuleDependency.IOnLanguageChangeListener.this.mo183786a();
                    }
                });
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public int mo102882a() {
                return C29410a.m108287a().mo104277a();
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: d */
            public void mo102912d() {
                ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initCardEnv(context);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: e */
            public Locale mo102914e() {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCachedLanguageSetting();
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: g */
            public boolean mo102917g() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isCustomer();
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: i */
            public AbstractC32808a mo102919i() {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChannelParser();
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: j */
            public String mo102920j() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantId();
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: l */
            public boolean mo102922l() {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isOpenUserCustomStatus();
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: c */
            public AppEnvType mo102909c() {
                int envType = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType();
                if (envType == 2) {
                    return AppEnvType.Boe;
                }
                if (envType != 3) {
                    return AppEnvType.Release;
                }
                return AppEnvType.PreRelease;
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: f */
            public boolean mo102916f() {
                if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantTag() != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: h */
            public boolean mo102918h() {
                return C37239a.m146648b().mo136955b("lark.search.erase.invisible.char.disable", C37239a.m146645a("lark.search.erase.invisible.char.disable").booleanValue());
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: k */
            public String mo102921k() {
                String userId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
                if (userId == null) {
                    return "";
                }
                return userId;
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: b */
            public String mo102905b() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: b */
            public int mo102903b(int i) {
                return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocInlineGrayIcon(i);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public int mo102883a(int i) {
                return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocInlineBlueIcon(i);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public Chatter.ChatterCustomStatus mo102885a(List<Chatter.ChatterCustomStatus> list) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getOpenedUserStatus(list);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public String mo102886a(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getDisplayName(chatter, ChatterNameDisplayRule.ALIAS_NAME);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public String mo102887a(String str) {
                return DynamicConfigModule.m145552b().mo136165a(str);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: c */
            public void mo102911c(String str, int i) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).cardAction(str, i);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: b */
            public int mo102904b(int i, String str) {
                return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getWikiIcon(i, str);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: d */
            public void mo102913d(Context context, String str) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startAppProfileByBotId(context, str);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: e */
            public void mo102915e(Context context, String str) {
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(0);
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startUserProfile(context, str, null, contactSource);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public int mo102884a(int i, String str) {
                return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocIcon(i, str);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: c */
            public void mo102910c(Context context, String str) {
                if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).canOpenInternal(context, str, 0)) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openInternal(context, str, 0);
                } else {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str);
                }
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: b */
            public void mo102906b(Context context, String str) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openSearchMainPageFromLynxCard(context, str, "", 0);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: b */
            public void mo102908b(String str, int i) {
                if (!TextUtils.isEmpty(str)) {
                    ((IIMApi) ApiUtils.getApi(IIMApi.class)).openThread(context, new C29604ae.C29606a().mo106670b(str).mo106679h(false).mo106662a(i).mo106671b(true).mo106674d("search").mo106668a());
                }
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public String mo102888a(String str, String str2) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAvatarPath(str2, str, 240, 1.0f);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102889a(Activity activity, String str) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).switchToOpenSearchTab(activity, str);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: b */
            public void mo102907b(Context context, String str, String str2) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).seeMoreDefinitions(context, str, str2);
            }

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency
            /* renamed from: a */
            public void mo102890a(final Context context, double d, double d2) {
                final LocationInfo a = new LocationInfo.C29595a(String.valueOf(d), String.valueOf(d2)).mo106512a(new Message()).mo106514a(true).mo106513a("").mo106511a(15).mo106515a();
                C26171w.m94675a(new Runnable() {
                    /* class com.ss.android.lark.app.task.initor.SearchCommonModuleDependencyInitor.C290071.RunnableC290081 */

                    public void run() {
                        ((IIMApi) ApiUtils.getApi(IIMApi.class)).showNavigateDialog(ViewUtils.m224141a(context), a);
                    }
                });
            }
        });
    }
}
