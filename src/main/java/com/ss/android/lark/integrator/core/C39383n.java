package com.ss.android.lark.integrator.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.browser.AbstractC29553b;
import com.ss.android.lark.biz.core.api.browser.AbstractC29554c;
import com.ss.android.lark.biz.core.api.browser.PreviewRequest;
import com.ss.android.lark.biz.core.api.browser.PreviewV2Request;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.core.dependency.AbstractC36127m;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.openplatform_api.AbstractC48902a;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler;
import com.ss.android.lark.platform.statistics.C51987e;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.core.n */
class C39383n implements AbstractC36127m {
    C39383n() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133020a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public boolean mo133026a(Context context) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).isMiniProcess(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public boolean mo133029a(Context context, String str, String str2) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openAppBrandFromMain(context, str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133010a(Context context, IGetDataCallback<String> iGetDataCallback) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).requestAvatarAppList(context, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133012a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC38365a.AbstractC38377l lVar) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).previewCard(context, str, str2, cardContent, z, new AbstractC48902a() {
            /* class com.ss.android.lark.integrator.core.$$Lambda$n$RhH6AK9FCupDGh7YoSVbTqTUVmA */

            @Override // com.ss.android.lark.openplatform_api.AbstractC48902a
            public final void onResult(boolean z, boolean z2, String str) {
                C39383n.lambda$RhH6AK9FCupDGh7YoSVbTqTUVmA(AbstractC38365a.AbstractC38377l.this, z, z2, str);
            }
        });
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133014a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC38365a.AbstractC38377l lVar) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).previewCard(context, list, cardContent, z, new AbstractC48902a() {
            /* class com.ss.android.lark.integrator.core.$$Lambda$n$tzwSFk7fjzSuvHvrQTb4j3EAjjs */

            @Override // com.ss.android.lark.openplatform_api.AbstractC48902a
            public final void onResult(boolean z, boolean z2, String str) {
                C39383n.lambda$tzwSFk7fjzSuvHvrQTb4j3EAjjs(AbstractC38365a.AbstractC38377l.this, z, z2, str);
            }
        });
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133023a(Map<String, AbstractC44136a.C44142ac> map, TabAppInfo tabAppInfo) {
        if (!map.containsKey(tabAppInfo.getKey())) {
            map.put(tabAppInfo.getKey(), new AbstractC44136a.C44142ac(tabAppInfo.getKey(), -1, false, AbstractC44136a.C44142ac.AbstractC44143a.f112086a, new AbstractC44136a.C44142ac.AbstractC44145c() {
                /* class com.ss.android.lark.integrator.core.$$Lambda$n$lopw7FFvv8u5S3MJNoB5nMuQmZM */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44145c
                public final AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                    return C39383n.lambda$lopw7FFvv8u5S3MJNoB5nMuQmZM(TabAppInfo.this, context, eVar, iTitleController);
                }
            }, new AbstractC44136a.C44142ac.AbstractC44144b() {
                /* class com.ss.android.lark.integrator.core.C39383n.C393852 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: b */
                public void mo133369b(Context context) {
                }

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: a */
                public void mo133368a(Context context) {
                    ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initMiniApp(context);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133011a(Context context, String str) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openMiniAppByUriFromSearch(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133013a(Context context, String str, boolean z) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).startAppDetailActivity(context, str, z);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133017a(String str) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).enterBotChatByBotId(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133021a(String str, boolean z) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).enterBotChatByBotIdFromSearch(str, z);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133022a(String str, boolean z, int i) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).enterBotChatByChatIdFromSearch(str, z, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public boolean mo133027a(Context context, Bundle bundle) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openLittleAppFromMain(context, bundle);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133016a(Fragment fragment, List<PreviewV2Request> list, int i, AbstractC29554c cVar) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).startPreviewImageV2(fragment, list, i, cVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133018a(String str, IGetDataCallback<String> iGetDataCallback) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).insertAilabThreeElement(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133015a(Fragment fragment, List<PreviewRequest> list, int i, AbstractC29553b bVar) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).startPreviewImage(fragment, list, i, bVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133019a(String str, JSONObject jSONObject) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).monitorDuration(str, jSONObject, null);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public boolean mo133028a(Context context, String str, UrlParams.Source source) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openUrl(context, str, m155455a(source));
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public boolean mo133030a(String str, UrlParams urlParams) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).canOpenH5App(str, urlParams);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133009a(Activity activity, String str, String str2, String str3, String str4, String str5) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).gotoSharedH5Page(activity, str, str2, str3, str4, str5);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133024a(int[] iArr, boolean z, IGetDataCallback<String> iGetDataCallback) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).startScanQRCodeActivity(iArr, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public boolean mo133025a(Activity activity, String str, String str2, String str3, boolean z) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).tryOpenFilePreviewActivity(activity, str, str2, str3, z);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: c */
    public boolean mo133038c() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isUsPackage();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: b */
    public AbstractInjectWebViewDelegate mo133031b() {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getWebAppDelegate();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public OkHttpClient mo133007a() {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getOkHttpClient();
    }

    /* renamed from: a */
    private int m155455a(UrlParams.Source source) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getScene(source);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: d */
    public void mo133041d(Context context) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initWebDependency(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: b */
    public void mo133032b(Context context) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).preloadProcessFromQR(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: c */
    public boolean mo133039c(Context context) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).onAppIntercpte(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: b */
    public boolean mo133036b(String str) {
        if (!((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).canOpen(str) || DesktopUtil.m144301a(C29638a.m109622a().getContext())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: c */
    public void mo133037c(Map<String, AbstractC44136a.C44142ac> map, TabAppInfo tabAppInfo) {
        if (!map.containsKey(tabAppInfo.getKey())) {
            map.put(tabAppInfo.getKey(), new AbstractC44136a.C44142ac(tabAppInfo.getKey(), 14, false, AbstractC44136a.C44142ac.AbstractC44143a.f112086a, new AbstractC44136a.C44142ac.AbstractC44145c() {
                /* class com.ss.android.lark.integrator.core.$$Lambda$n$rBtkzl6RHc5FUvhbRlxHHDgRri4 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44145c
                public final AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                    return C39383n.lambda$rBtkzl6RHc5FUvhbRlxHHDgRri4(TabAppInfo.this, context, eVar, iTitleController);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: c */
    public boolean mo133040c(Context context, String str) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openAppBrandFromMain(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: b */
    public void mo133033b(final Context context, final String str) {
        try {
            String optString = new JSONObject(str).optString("extra_str");
            if (TextUtils.isEmpty(optString)) {
                Log.m165383e("OpenPlatformDependencyImpl", "openAppChat receive empty extra_str");
                return;
            }
            JSONObject jSONObject = new JSONObject(optString);
            String optString2 = jSONObject.optString("cli_app_id");
            String optString3 = jSONObject.optString("android_schema");
            int optInt = jSONObject.optInt("last_notification_seq_id");
            String optString4 = jSONObject.optString("open_app_chat_feed_id");
            Log.m165379d("OpenPlatformDependencyImpl", String.format("openAppChat args cliAppId=%1s androidSchema=%2s noticeSeqId=%3s openAppChatFeedId=%4s", optString2, optString3, Integer.valueOf(optInt), optString4));
            if (!TextUtils.isEmpty(optString2)) {
                if (!TextUtils.isEmpty(optString3)) {
                    String str2 = null;
                    if (context instanceof Activity) {
                        str2 = C44134a.m174960a((Activity) context);
                    } else {
                        Log.m165397w("OpenPlatformDependencyImpl", "openAppChat cannot get bdPushSchema from context");
                    }
                    Uri parse = Uri.parse(optString3);
                    String scheme = parse.getScheme();
                    Uri.Builder buildUpon = parse.buildUpon();
                    if (TextUtils.isEmpty(scheme)) {
                        Log.m165397w("OpenPlatformDependencyImpl", "openAppChat pushDataSchema is empty");
                    } else if (scheme.equals(str2)) {
                        buildUpon.scheme("sslocal");
                    } else {
                        Log.m165389i("OpenPlatformDependencyImpl", "openAppChat bdPushSchema=" + str2 + " pushDataSchema=" + scheme);
                    }
                    buildUpon.appendQueryParameter("open_app_chat_feed_id", optString4);
                    final Intent b = C57858o.m224559a(C36149a.m142162a().mo157098b().mo105704b()).mo196058a("appId", optString2).mo196058a("schema", buildUpon.build().toString()).mo196058a("last_notification_seq_id", String.valueOf(optInt)).mo196066b(context);
                    C51987e.m201660a().mo178193a(optString2);
                    CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                        /* class com.ss.android.lark.integrator.core.C39383n.RunnableC393863 */

                        public void run() {
                            Context context = context;
                            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                                OfflinePushClickHandler.m201275a(context, b, str);
                            } else {
                                Log.m165397w("OpenPlatformDependencyImpl", "openAppChat handleSwitchTenant activity destroyed");
                            }
                        }
                    });
                    return;
                }
            }
            Log.m165397w("OpenPlatformDependencyImpl", "openAppChat recv invalid args cliAppId=" + optString2 + " androidSchema=" + optString3);
        } catch (JSONException e) {
            Log.m165384e("OpenPlatformDependencyImpl", "openAppChat notification click error", e);
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: b */
    public void mo133035b(Map<String, AbstractC44136a.C44142ac> map, final TabAppInfo tabAppInfo) {
        if (!map.containsKey(tabAppInfo.getKey())) {
            map.put(tabAppInfo.getKey(), new AbstractC44136a.C44142ac(tabAppInfo.getKey(), -1, false, AbstractC44136a.C44142ac.AbstractC44143a.f112086a, new AbstractC44136a.C44142ac.AbstractC44145c() {
                /* class com.ss.android.lark.integrator.core.$$Lambda$n$o3p0h5Jlb6K8V438gn_2UNdEbO8 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44145c
                public final AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
                    return C39383n.lambda$o3p0h5Jlb6K8V438gn_2UNdEbO8(TabAppInfo.this, context, eVar, iTitleController);
                }
            }, new AbstractC44136a.C44142ac.AbstractC44144b() {
                /* class com.ss.android.lark.integrator.core.C39383n.C393841 */

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: b */
                public void mo133369b(Context context) {
                }

                @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.C44142ac.AbstractC44144b
                /* renamed from: a */
                public void mo133368a(Context context) {
                    ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).preloadTabPageData(context, tabAppInfo.getKey());
                }
            }));
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public AbstractC44552i mo133005a(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).createWebAppPageSpec(context, iTitleController, tabAppInfo);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: b */
    public void mo133034b(Context context, String str, UrlParams.Source source) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).openAppBrand(context, str, m155455a(source));
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public void mo133008a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).doCheckFace(activity, str, iGetDataCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC44552i m155458b(TabAppInfo tabAppInfo, Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return C44134a.m174959a().mo133206a(context, iTitleController, tabAppInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ AbstractC44552i m155460c(TabAppInfo tabAppInfo, Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return C44134a.m174959a().mo133207a(context, eVar, iTitleController, tabAppInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC44552i m155456a(TabAppInfo tabAppInfo, Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).createMomentsTabPageSpec(context, iTitleController, tabAppInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m155459b(AbstractC38365a.AbstractC38377l lVar, boolean z, boolean z2, String str) {
        if (lVar != null) {
            lVar.mo140512a(z, z2, str);
        } else {
            Log.m165383e("OpenPlatformDependencyImpl", "callback is null");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m155457a(AbstractC38365a.AbstractC38377l lVar, boolean z, boolean z2, String str) {
        if (lVar != null) {
            lVar.mo140512a(z, z2, str);
        } else {
            Log.m165383e("OpenPlatformDependencyImpl", "callback is null");
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public Intent mo133004a(String str, String str2, String str3, int i) {
        return C57858o.m224559a(C36149a.m142162a().mo157098b().mo105704b()).mo196058a("appId", str).mo196058a("schema", str3).mo196058a("last_notification_seq_id", String.valueOf(i)).mo196066b(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36127m
    /* renamed from: a */
    public AbstractC44552i mo133006a(Context context, AbstractC44548e eVar, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        return ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).createMiniAppPageSpec(context, eVar, iTitleController, tabAppInfo);
    }
}
