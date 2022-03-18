package com.ss.android.lark.integrator.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.dynamicres.BaseConfig;
import com.bytedance.ee.bear.dynamicres.DynamicResourceManager;
import com.bytedance.ee.bear.dynamicres.ResourceBean;
import com.bytedance.ee.bear.dynamicres.ResourceStatusListener;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.contact.ContactMobileModel;
import com.bytedance.ee.bear.search.AbstractC10816c;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.dybrid.h5core.AbstractC24186b;
import com.larksuite.component.dybrid.h5core.C24178a;
import com.larksuite.component.dybrid.offlineresource.C24256d;
import com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24252b;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.ccm_api.SpacekitConst;
import com.ss.android.lark.ccm_api.p1592a.C32804a;
import com.ss.android.lark.core.dependency.AbstractC36117b;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler;
import com.ss.android.lark.platform.statistics.perf.C51997c;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.core.b */
class C39352b implements AbstractC36117b {

    /* renamed from: a */
    public static BaseConfig f100660a;

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: h */
    public void mo132725h() {
    }

    C39352b() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public void mo132707a(String str) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).setCCMConfig(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public void mo132708a(boolean z) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).apiGroups().mo17137d().mo17021a(z);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public boolean mo132710a(Context context, String str, Map<String, String> map) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).open(context, str, "web", map);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public void mo132706a(AbstractC44552i iVar, boolean z) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).reloadTabPageSpecUrl(iVar, z);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public boolean mo132709a(Context context, Bundle bundle) {
        if (!bundle.getBoolean("key_doc_jump_detail", false)) {
            return false;
        }
        boolean z = bundle.getBoolean("key_doc_open_from_notice", false);
        String string = bundle.getString("key_doc_url");
        String string2 = bundle.getString("key_doc_id");
        String string3 = bundle.getString("key_doc_message_id");
        if (TextUtils.isEmpty(string)) {
            String string4 = bundle.getString("key_doc_feed_id");
            if (TextUtils.isEmpty(string4)) {
                return false;
            }
            DocFeed docFeed = ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).syncPullDocFeedsByIds(Collections.singletonList(string4)).mo135951a().get(string4);
            if (docFeed == null) {
                Log.m165383e("CCMDependencyImpl", "DocFeed is null!");
                return false;
            }
            string = docFeed.getUrl();
            string2 = docFeed.getId();
        }
        C51997c.m201743a("key_doc", z ? ChatBundle.SourceType.PUSH : ChatBundle.SourceType.FEED);
        BrowserModuleProvider.m200667a().mo106844a(context, ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocUrlWithParams(string, m155110b(string2, string3)), UrlParams.m108857a().mo105523a(), new C32804a().mo120923a("lark_other").mo120925a());
        return true;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public boolean mo132711a(String str, Map<String, String> map) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).open(str, map);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: e */
    public IBrowserModuleDependency.AbstractC29886d mo132722e() {
        return new IBrowserModuleDependency.AbstractC29886d() {
            /* class com.ss.android.lark.integrator.core.C39352b.C393617 */

            @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29886d
            /* renamed from: a */
            public void mo107669a(String str, List<String> list) {
                DynamicResourceManager.f20600b.mo29847a().mo29844a(str, list);
            }

            @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29886d
            /* renamed from: a */
            public String mo107668a(String str, String str2) {
                ResourceBean a = DynamicResourceManager.f20600b.mo29847a().mo29842a(str, str2);
                if (a != null) {
                    return a.mo29826a();
                }
                return null;
            }

            @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29886d
            /* renamed from: a */
            public void mo107670a(String str, final List<String> list, final IBrowserModuleDependency.AbstractC29886d.AbstractC29887a aVar) {
                DynamicResourceManager.f20600b.mo29847a().mo29843a(new BaseConfig(LarkContext.getApplication(), C29410a.m108287a().mo104277a(), ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(), DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_FE_RESOURCE_HOTFIX)), str, list, new ResourceStatusListener() {
                    /* class com.ss.android.lark.integrator.core.C39352b.C393617.C393621 */

                    @Override // com.bytedance.ee.bear.dynamicres.ResourceStatusListener
                    /* renamed from: a */
                    public void mo29849a() {
                        IBrowserModuleDependency.AbstractC29886d.AbstractC29887a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo107671a();
                        }
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public Map<String, String> mo132701a() {
        return new C32804a().mo120923a("message").mo120925a();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: b */
    public Map<String, String> mo132713b() {
        return new C32804a().mo120923a("lark_search").mo120925a();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: c */
    public Map<String, String> mo132717c() {
        return new C32804a().mo120923a("lark_other").mo120925a();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: f */
    public Map<String, String> mo132723f() {
        return new C32804a().mo120923a("web").mo120925a();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: g */
    public void mo132724g() {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).injectSessionCookies();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: i */
    public String mo132726i() {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocPageName();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: j */
    public void mo132727j() {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).checkAndInit();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: k */
    public boolean mo132728k() {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).isP0MergeToMainProc();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: d */
    public AbstractC24186b.AbstractC24188b mo132721d() {
        LarkContext.getApplication();
        final boolean a = C37239a.m146648b().mo136951a("tt_gecko_hotfix");
        f100660a = new BaseConfig(LarkContext.getApplication().getApplicationContext(), C29410a.m108287a().mo104277a(), ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(), DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_FE_RESOURCE_HOTFIX));
        return new AbstractC24186b.AbstractC24188b() {
            /* class com.ss.android.lark.integrator.core.C39352b.C393564 */

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24188b
            /* renamed from: a */
            public boolean mo86793a() {
                boolean a = C37239a.m146648b().mo136951a("lark_dynamic_mapper");
                boolean z = UserSP.getInstance().getBoolean("lark_dynamic_mapper", a);
                if (a || z) {
                    return true;
                }
                return false;
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24188b
            /* renamed from: a */
            public boolean mo86794a(String str) {
                Log.m165389i("CCMDependencyImpl", "gecko -> hasRegisterBiz");
                if (!a) {
                    return false;
                }
                boolean a = DynamicResourceManager.f20600b.mo29847a().mo29846a(str);
                Log.m165389i("CCMDependencyImpl", "gecko ->  hasRegisterBiz " + str + " " + a);
                return a;
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24188b
            /* renamed from: a */
            public void mo86791a(String str, List<String> list) {
                Log.m165389i("CCMDependencyImpl", "gecko -> sync isEnableGecko=" + a + " " + list.toString());
                if (a) {
                    DynamicResourceManager.f20600b.mo29847a().mo29844a(str, list);
                }
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24188b
            /* renamed from: a */
            public String mo86790a(String str, String str2) {
                String str3;
                ResourceBean a = DynamicResourceManager.f20600b.mo29847a().mo29842a(str, str2);
                if (a != null) {
                    str3 = a.mo29826a() + File.separator;
                } else {
                    str3 = "";
                }
                Log.m165389i("CCMDependencyImpl", "gecko ->  getResource " + str2 + " " + str3);
                return str3;
            }

            @Override // com.larksuite.component.dybrid.h5core.AbstractC24186b.AbstractC24188b
            /* renamed from: a */
            public void mo86792a(String str, List<String> list, final AbstractC24252b bVar) {
                Log.m165389i("CCMDependencyImpl", "gecko -> init isEnableGecko=" + a + " " + list.toString());
                if (a) {
                    DynamicResourceManager.f20600b.mo29847a().mo29843a(C39352b.f100660a, str, list, new ResourceStatusListener() {
                        /* class com.ss.android.lark.integrator.core.C39352b.C393564.C393571 */

                        @Override // com.bytedance.ee.bear.dynamicres.ResourceStatusListener
                        /* renamed from: a */
                        public void mo29849a() {
                            Log.m165389i("CCMDependencyImpl", "gecko -> onRegisterFinished ");
                            AbstractC24252b bVar = bVar;
                            if (bVar != null) {
                                bVar.mo86872a();
                            }
                        }
                    });
                }
            }
        };
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: b */
    public ISearchModuleDependency.AbstractC53321h.AbstractC53322a mo132712b(boolean z) {
        return new ISearchModuleDependency.AbstractC53321h.AbstractC53322a(z) {
            /* class com.ss.android.lark.integrator.core.C39352b.C393531 */

            /* renamed from: a */
            final AbstractC10816c f100661a;

            /* renamed from: b */
            final /* synthetic */ boolean f100662b;

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53321h.AbstractC53322a
            /* renamed from: a */
            public Fragment mo143225a() {
                return this.f100661a.mo40910a();
            }

            @Override // com.ss.android.lark.search.dependency.ISearchModuleDependency.AbstractC53321h.AbstractC53322a
            /* renamed from: a */
            public void mo143226a(String str) {
                this.f100661a.mo40911a(str);
            }

            {
                this.f100662b = r2;
                this.f100661a = ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).makeDocForLarkGlobalSearch(r2);
            }
        };
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public int mo132698a(int i) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocFilterIcon(DocType.forNumber(i));
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: c */
    public void mo132718c(String str) {
        C57783ah.m224245a().mo196093a(ContactMobileModel.f26786b.mo37696a(), str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: b */
    public void mo132714b(IGetDataCallback<Boolean> iGetDataCallback) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).clearCache(iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: c */
    public void mo132719c(boolean z) {
        ICCMApi iCCMApi = (ICCMApi) ApiUtils.getApi(ICCMApi.class);
        if (iCCMApi == null) {
            return;
        }
        if (z) {
            iCCMApi.onLoginStatusChangedEvent(SpacekitConst.LoginEvent.Login.ordinal());
        } else {
            iCCMApi.onLoginStatusChangedEvent(SpacekitConst.LoginEvent.Logout.ordinal());
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: d */
    public Intent mo132720d(String str) {
        Intent b = C57858o.m224559a(C36149a.m142162a().mo157098b().mo105704b()).mo196058a("key_doc_image_extra", str).mo196066b(LarkContext.getApplication());
        Log.m165389i("DocOfflineExtraParser", "send To Doc success!");
        return b;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public void mo132702a(Context context) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).forceStopKeepAliveService(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: b */
    public boolean mo132716b(String str) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).canOpen(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public void mo132704a(final C24178a aVar) {
        Log.m165389i("CCMDependencyImpl", "DybridModule ->  initDynamic ");
        C29410a.m108289c().mo104284a(new AbstractC29417b.AbstractC29418a() {
            /* class com.ss.android.lark.integrator.core.C39352b.C393585 */

            @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b.AbstractC29418a
            public void OnAppStateChanged(boolean z) {
                C24256d c;
                if (z && (c = aVar.mo86773c()) != null) {
                    c.mo86887b();
                }
            }
        });
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addDeviceIdChangeListener(new AbstractC49390d.AbstractC49391a() {
            /* class com.ss.android.lark.integrator.core.C39352b.C393596 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d.AbstractC49391a
            public void onDeviceIdChange(String str) {
                C39352b.f100660a = new BaseConfig(LarkContext.getApplication().getApplicationContext(), C29410a.m108287a().mo104277a(), str, DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_FE_RESOURCE_HOTFIX));
                final C24256d c = aVar.mo86773c();
                if (c != null) {
                    c.mo86885a(new AbstractC24252b() {
                        /* class com.ss.android.lark.integrator.core.C39352b.C393596.C393601 */

                        @Override // com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24252b
                        /* renamed from: a */
                        public void mo86872a() {
                            c.mo86887b();
                        }
                    });
                }
            }
        });
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public void mo132705a(IGetDataCallback<Long> iGetDataCallback) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getCacheSize(iGetDataCallback);
    }

    /* renamed from: b */
    private Map<String, String> m155110b(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("docId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("last_doc_message_id", str2);
        }
        return hashMap;
    }

    /* renamed from: b */
    private static void m155111b(final Context context, final String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("user_id");
            String string = jSONObject.getString("extra_str");
            if (TextUtils.isEmpty(string)) {
                Log.m165383e("CCMDependencyImpl", "notification doc pass through data is null");
                return;
            }
            final Intent b = C57858o.m224559a(C36149a.m142162a().mo157098b().mo105704b()).mo196058a("key_doc_image_extra", string).mo196058a("user_id", optString).mo196066b(context);
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.integrator.core.C39352b.RunnableC393542 */

                public void run() {
                    OfflinePushClickHandler.m201275a(context, b, str);
                }
            });
            Log.m165389i("CCMDependencyImpl", "send To Doc success!");
        } catch (JSONException e) {
            Log.m165383e("CCMDependencyImpl", "imageRelay: obj = " + str + " exception = " + e);
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public Intent mo132699a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C57858o.m224559a(C36149a.m142162a().mo157098b().mo105704b()).mo196060a("key_doc_jump_detail", true).mo196058a("key_doc_feed_id", str).mo196060a("key_doc_open_from_notice", true).mo196058a("key_doc_message_id", str2).mo196066b(LarkContext.getApplication());
    }

    /* renamed from: c */
    private static void m155112c(final Context context, final String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("extra_str"));
            if ("PUSH_DOC_FEED".equals(jSONObject.getString(ShareHitPoint.f121869d))) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                String string = jSONObject2.getString("msg_id");
                String string2 = jSONObject2.getString("feed_id");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                if (!TextUtils.isEmpty(string2)) {
                    DocFeed docFeed = ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).syncPullDocFeedsByIds(Collections.singletonList(string2)).mo135951a().get(string2);
                    if (docFeed != null) {
                        final Intent b = C57858o.m224559a(C36149a.m142162a().mo157098b().mo105704b()).mo196060a("key_doc_jump_detail", true).mo196058a("key_doc_url", docFeed.getUrl()).mo196058a("key_doc_id", docFeed.getId()).mo196060a("key_doc_open_from_notice", true).mo196058a("key_doc_message_id", string).mo196066b(context);
                        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                            /* class com.ss.android.lark.integrator.core.C39352b.RunnableC393553 */

                            public void run() {
                                OfflinePushClickHandler.m201275a(context, b, str);
                            }
                        });
                    }
                }
            }
        } catch (JSONException e) {
            Log.m165383e("CCMDependencyImpl", "openDocDetail: obj = " + str + " exception = " + e);
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: b */
    public boolean mo132715b(Context context, Bundle bundle) {
        Log.m165383e("DocNotification", "The DocImageRelay Function Has Been Offline");
        return false;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public void mo132703a(Context context, String str) {
        try {
            if (new JSONObject(str).optInt("direct", 1) == 4) {
                m155111b(context, str);
            } else {
                m155112c(context, str);
            }
        } catch (JSONException e) {
            Log.m165383e("CCMDependencyImpl", "notification click catch = " + e);
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36117b
    /* renamed from: a */
    public String mo132700a(String str, String str2, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (!(str2 == null || map == null)) {
            map.put("sourceType", str2);
        }
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocUrlWithQuerys(str, map);
    }
}
