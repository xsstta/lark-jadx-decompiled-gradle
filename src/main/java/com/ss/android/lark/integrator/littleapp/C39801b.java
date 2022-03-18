package com.ss.android.lark.integrator.littleapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.bytedance.ee.bear.integrator.dto.C7925a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12784c;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesRequest;
import com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d;
import com.ss.android.appcenter.p1262a.p1264b.C27563c;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.AbstractC29616i;
import com.ss.android.lark.biz.im.api.C29608b;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.AbstractC38407b;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardTargetSource;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider;
import com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.littleapp.C41318d;
import com.ss.android.lark.littleapp.entity.ShareAppModel;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a;
import com.ss.android.lark.openplatform.shareApp.dto.C48868b;
import com.ss.android.lark.openplatform.shareApp.dto.C48869c;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppDataV2;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppType;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59029c;
import com.tt.refer.impl.business.file.TTFileHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.littleapp.b */
public class C39801b implements ILittleAppService.AbstractC41416a {

    /* renamed from: a */
    public Map<String, Integer> f101373a = new ConcurrentHashMap();

    /* renamed from: b */
    private IIMApi f101374b = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    /* renamed from: c */
    private ICoreApi f101375c = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: d */
    private IPassportApi f101376d = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

    /* renamed from: e */
    private Map<String, AbstractC29616i> f101377e = new ConcurrentHashMap();

    /* renamed from: f */
    private ArrayList<ILittleAppService.AbstractC41417b> f101378f = new ArrayList<>();

    /* renamed from: g */
    private AbstractC29586u f101379g;

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: c */
    public String mo144286c() {
        return null;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41418c
    /* renamed from: a */
    public void mo144265a(String str) {
        List<AbstractC27537d.AbstractC27539b> i = AppCenterModuleProvider.m154360a().mo103324i();
        if (i != null) {
            for (AbstractC27537d.AbstractC27539b bVar : i) {
                bVar.mo98182a(str);
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41418c
    /* renamed from: a */
    public void mo144271a(String str, boolean z) {
        List<AbstractC27537d.AbstractC27539b> i = AppCenterModuleProvider.m154360a().mo103324i();
        if (i != null) {
            for (AbstractC27537d.AbstractC27539b bVar : i) {
                bVar.mo98184a(str, !z);
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41418c
    /* renamed from: a */
    public void mo144266a(String str, int i) {
        List<AbstractC27537d.AbstractC27539b> i2 = AppCenterModuleProvider.m154360a().mo103324i();
        if (i2 != null) {
            for (AbstractC27537d.AbstractC27539b bVar : i2) {
                bVar.mo98183a(str, i);
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144269a(String str, JSONObject jSONObject) {
        C39824h.m158095a().mo144323a(str, jSONObject);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144267a(String str, int i, JSONObject jSONObject) {
        C39824h.m158095a().mo144322a(str, i, jSONObject);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144270a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C39824h.m158095a().mo144324a(str, jSONObject, jSONObject2);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144262a(final AbstractC41371j.AbstractC41376e eVar) {
        Log.m165389i("LittleAppDependencyImpl", "getDeviceId");
        this.f101376d.getDeviceId(LarkContext.getApplication(), new IGetDataCallback<DeviceId>() {
            /* class com.ss.android.lark.integrator.littleapp.C39801b.C398021 */

            /* renamed from: a */
            public void onSuccess(DeviceId deviceId) {
                eVar.mo49150a(C57859q.m224566b(deviceId.getDeviceId()));
                Log.m165389i("LittleAppDependencyImpl", "getDeviceId success");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                eVar.mo49151b(errorResult.getDisplayMsg());
                Log.m165389i("LittleAppDependencyImpl", "getDeviceId error");
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public boolean mo144277a(Context context, String str, String str2, boolean z) {
        this.f101374b.openChat(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.PROFILE).mo105934c(z).mo105935d(str2).mo105929a());
        if (!DesktopUtil.m144301a(context)) {
            return true;
        }
        this.f101374b.peakFeedCard(str, FeedCard.Type.CHAT);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public boolean mo144275a(Context context, String str, String str2, String str3, int i) {
        ShareModel shareModel = new ShareModel();
        shareModel.setTitle(str);
        shareModel.setContent(str2);
        shareModel.setUrl(str3);
        Message a = m157976a(shareModel);
        a.setShared(true);
        this.f101375c.forwardWithTemplate(context, this.f101375c.getForwardTemplate(context, a, shareModel), i);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public boolean mo144273a(final Context context, ShareAppModel shareAppModel, int i) {
        if (shareAppModel == null) {
            return false;
        }
        if (shareAppModel.isAppPage()) {
            C48869c cVar = new C48869c(shareAppModel.getAppId(), shareAppModel.getImgKey());
            cVar.mo170685c(shareAppModel.getTitle());
            cVar.mo170680a(ShareAppType.SHARE_APP_PAGE);
            String href = shareAppModel.getHref();
            if (!TextUtils.isEmpty(href)) {
                href = Uri.parse(href).buildUpon().appendQueryParameter("op_tracking", "opshare_gadget_pageshare").toString();
            }
            cVar.mo170683b(href);
            OpenPlatformModuleProvider.m158457a().mo170497a(context, "opshare_gadget_pageshare", cVar, new AbstractC48867a() {
                /* class com.ss.android.lark.integrator.littleapp.C39801b.C398087 */

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: a */
                public void mo142986a() {
                }

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: a */
                public void mo142988a(boolean z, String str) {
                }

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: b */
                public void mo142989b() {
                }

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: b */
                public void mo142990b(boolean z, String str) {
                }

                @Override // com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a
                /* renamed from: a */
                public void mo142987a(ShareAppResult shareAppResult) {
                    String str;
                    if (shareAppResult != null) {
                        Context context = context;
                        if (context instanceof Activity) {
                            Activity activity = (Activity) context;
                            Intent intent = new Intent();
                            List<C48868b> b = shareAppResult.mo170673b();
                            String tab = shareAppResult.mo170670a().getTab();
                            if (b != null && b.size() > 0) {
                                JSONArray jSONArray = new JSONArray();
                                for (C48868b bVar : b) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("id", bVar.mo170676a());
                                        if (bVar.mo170677b()) {
                                            str = "0";
                                        } else {
                                            str = "1";
                                        }
                                        jSONObject.put("chatType", str);
                                        jSONObject.put("isBot", bVar.mo170678c());
                                    } catch (JSONException e) {
                                        Log.m165384e("LittleAppDependencyImpl", " put chat json err", e);
                                    }
                                    jSONArray.put(jSONObject);
                                }
                                intent.putExtra("share_data", jSONArray.toString());
                            }
                            intent.putExtra("share_type", tab);
                            activity.setResult(-1, intent);
                            activity.finish();
                        }
                    }
                }
            });
            return true;
        }
        ShareAppDataV2 shareAppDataV2 = new ShareAppDataV2();
        shareAppDataV2.setAppId(shareAppModel.getAppId());
        shareAppDataV2.setHref(shareAppModel.getHref());
        shareAppDataV2.setAndroidHref(shareAppModel.getAndroidHref());
        shareAppDataV2.setIosHref(shareAppModel.getIosHref());
        shareAppDataV2.setPcHref(shareAppModel.getPcHref());
        if (shareAppModel.isAppPage()) {
            shareAppDataV2.setTitle(shareAppModel.getTitle());
            shareAppDataV2.setImgKey(shareAppModel.getImgKey());
        }
        OpenPlatformModuleProvider.m158457a().mo170496a(context, shareAppDataV2, shareAppModel.isAppPage() ? ShareAppType.SHARE_APP_PAGE : ShareAppType.SHARE_APP, i);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public boolean mo144276a(Context context, String str, String str2, String str3, boolean z) {
        ArrayList arrayList;
        if (z) {
            ArrayList arrayList2 = new ArrayList(1);
            if (TTFileHelper.m264257a().isCryptoToastDisable() || !C12784c.m52844a()) {
                arrayList2.add(new OpenExternalMenu((BinderMenuAction) null));
            } else {
                arrayList2.add(new OpenExternalMenu(new LittleAppDependencyImpl$7(this, context)));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).startDriveSDKActivity(context, new C7925a(str, str2, str3, "1002", arrayList));
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public boolean mo144274a(Context context, String str) {
        return mo144282b(context, str) || mo144290c(str) || mo144294d(str);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144261a(Context context, String str, String str2, String str3, Map<String, String> map, int i, int i2) {
        AppCenterModuleProvider.m154360a().mo103303a(context, str, str2, map, 1, str3);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144268a(String str, final AbstractC41371j.AbstractC41378g gVar) {
        this.f101375c.uploadEncryptImage(LarkContext.getApplication(), str, false, false, null, new IGetDataCallback<EncryptImageData>() {
            /* class com.ss.android.lark.integrator.littleapp.C39801b.C398098 */

            /* renamed from: a */
            public void onSuccess(EncryptImageData encryptImageData) {
                gVar.mo149054a(encryptImageData.f73838b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                gVar.mo149053a();
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144263a(final AbstractC41371j.AbstractC41377f fVar) {
        this.f101376d.getIdpIdentity(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.integrator.littleapp.C39801b.C398109 */

            /* renamed from: a */
            public void onSuccess(String str) {
                Log.m165389i("GetUerInfoEx", "idpIdentity: " + str);
                if (!TextUtils.isEmpty(str)) {
                    fVar.mo49152a(str);
                } else {
                    fVar.mo49153b("");
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("GetUerInfoEx", "getUserInfoEx: " + errorResult.getDebugMsg());
                fVar.mo49153b("");
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144264a(ILittleAppService.AbstractC41417b bVar) {
        ArrayList<ILittleAppService.AbstractC41417b> arrayList;
        if (bVar != null && (arrayList = this.f101378f) != null) {
            arrayList.add(bVar);
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144272a(boolean z) {
        this.f101375c.fetchWebViewCore(z);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public boolean mo144278a(Uri uri) {
        return this.f101375c.isAppLink(uri);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: g */
    public String mo144299g() {
        return this.f101375c.getLocalSoVersion();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: h */
    public String mo144301h() {
        return this.f101375c.getLoadSoVersion();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: i */
    public C29187c mo144303i() {
        return this.f101375c.getAppLink();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: j */
    public void mo144305j() {
        this.f101375c.initBytecertSdk();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public AbstractC13304a mo144254a() {
        return new C39821g(this.f101375c.getLittleAppMap());
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: d */
    public void mo144291d() {
        C27563c.m100585a().mo98241a(true);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: e */
    public String mo144295e() {
        return PackageChannelManager.getBuildPackageChannel(LarkContext.getApplication());
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: f */
    public Long mo144297f() {
        return Long.valueOf(this.f101375c.getNtpTime());
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: b */
    public boolean mo144281b() {
        return this.f101375c.isUsingTTWebView();
    }

    public C39801b() {
        $$Lambda$b$ml1mrrDzkQHlRYBjAhIGITSMUdM r0 = new AbstractC29586u() {
            /* class com.ss.android.lark.integrator.littleapp.$$Lambda$b$ml1mrrDzkQHlRYBjAhIGITSMUdM */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
            public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                C39801b.this.m157977a((C39801b) aVar, aVar2);
            }
        };
        this.f101379g = r0;
        this.f101375c.addLifecycleObserver(r0);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144256a(Context context) {
        this.f101375c.openAboutPage(context);
    }

    /* renamed from: c */
    public boolean mo144290c(String str) {
        return this.f101375c.isInterceptUrl(str);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: f */
    public String mo144298f(String str) {
        return this.f101375c.decodeQRCode(str);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: h */
    public String mo144302h(String str) {
        return DynamicConfigModule.m145552b().mo136165a(str);
    }

    /* renamed from: l */
    private int m157980l(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        Chat chat = this.f101374b.getLocalChats(arrayList).get(str);
        if (chat == null) {
            return 0;
        }
        return chat.getUnReadBadgeCount();
    }

    /* renamed from: m */
    private int m157981m(String str) {
        GetUnreadAtMessagesRequest.C17743a aVar = new GetUnreadAtMessagesRequest.C17743a();
        aVar.mo61931a(Collections.singletonList(str));
        return ((Integer) SdkSender.syncSend(Command.GET_UNREAD_AT_MESSAGES, aVar, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.integrator.littleapp.$$Lambda$b$eeImXTk22Gs9jN08ZnaMvSEAcI */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C39801b.this.m157978b((C39801b) this.f$1, (String) bArr);
            }
        })).intValue();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public String mo144255a(DomainSettings.Alias alias) {
        List<String> b = DynamicConfigModule.m145553b(alias);
        if (b == null || b.size() == 0) {
            return "";
        }
        return b.get(0);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41418c
    /* renamed from: b */
    public void mo144279b(String str) {
        List<AbstractC27537d.AbstractC27539b> i = AppCenterModuleProvider.m154360a().mo103324i();
        if (i != null) {
            for (AbstractC27537d.AbstractC27539b bVar : i) {
                bVar.mo98185b(str);
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: e */
    public boolean mo144296e(String str) {
        return C37239a.m146648b().mo136952a(str, m157979k(str));
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: i */
    public void mo144304i(String str) {
        if (!this.f101377e.containsKey(str)) {
            C398032 r0 = new AbstractC29616i() {
                /* class com.ss.android.lark.integrator.littleapp.C39801b.C398032 */

                @Override // com.ss.android.lark.biz.im.api.AbstractC29616i
                /* renamed from: a */
                public void mo106724a(String str, C29608b bVar) {
                    Integer num = C39801b.this.f101373a.get(str);
                    if (num == null || num.intValue() != bVar.mo106690b()) {
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.ss.android.lark.littleapp.badgeChange");
                            Bundle bundle = new Bundle();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", str);
                            jSONObject.put("unread_count", bVar.mo106690b());
                            bundle.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject.toString());
                            intent.putExtras(bundle);
                            LarkContext.getApplication().sendBroadcast(intent);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    C39801b.this.f101373a.put(str, Integer.valueOf(bVar.mo106690b()));
                }
            };
            this.f101374b.registerBadgeChangeListener(str, r0);
            this.f101377e.put(str, r0);
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: j */
    public void mo144306j(String str) {
        AbstractC29616i remove = this.f101377e.remove(str);
        this.f101373a.remove(str);
        if (remove != null) {
            this.f101374b.unRegisterBadgeChangeListener(str, remove);
        } else {
            Log.m165383e("unRegisterBadgeChange", "not found badgeChangeListener for chatId");
        }
    }

    /* renamed from: a */
    private Message m157976a(ShareModel shareModel) {
        String str;
        if (shareModel == null || TextUtils.isEmpty(shareModel.getUrl())) {
            str = "";
        } else {
            str = shareModel.getUrl();
        }
        Message message = new Message();
        message.setType(Message.Type.TEXT);
        TextContent textContent = new TextContent();
        textContent.setRichText(C59029c.m229161b(str));
        message.setMessageContent(textContent);
        return message;
    }

    /* renamed from: k */
    private boolean m157979k(String str) {
        Boolean bool = C41318d.m163782a().get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        Log.m165397w("LittleAppDependencyImpl", "getFgDefault " + str + "not in the map so return true");
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: g */
    public String mo144300g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("badge", m157980l(str));
            jSONObject.put("atCount", m157981m(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: d */
    public boolean mo144294d(String str) {
        if (((ICCMApi) ApiUtils.getApi(ICCMApi.class)).canOpen(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: b */
    public void mo144280b(String str, JSONObject jSONObject) {
        C39824h.m158095a().mo144326b(str, jSONObject);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ Integer m157978b(String str, byte[] bArr) throws IOException {
        return Integer.valueOf(m157975a(str, bArr));
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: d */
    public void mo144292d(Context context, String str) {
        if (!this.f101375c.parseQRCode(context, str)) {
            LKUIToast.show(context, UIHelper.getString(R.string.Lark_Legacy_AnalysQRFail));
        }
    }

    /* renamed from: a */
    private int m157975a(String str, byte[] bArr) throws IOException {
        Message message;
        boolean z;
        GetUnreadAtMessagesResponse decode = GetUnreadAtMessagesResponse.ADAPTER.decode(bArr);
        if (decode == null || decode.entity == null || decode.entity.messages == null) {
            return 0;
        }
        int i = 0;
        for (com.bytedance.lark.pb.basic.v1.Message message2 : decode.entity.messages.values()) {
            if (str.equals(message2.chat_id) && (message = this.f101374b.getMessage(decode.entity, message2.id)) != null) {
                if (message.isFromMe() || (!message.isAtAll() && !message.isOtherAtMe())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public boolean mo144282b(Context context, String str) {
        return this.f101375c.canOpenInternal(context, str, 7);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: c */
    public boolean mo144287c(Context context, String str) {
        if (this.f101375c.canOpenInternal(context, str, 7)) {
            this.f101375c.openInternal(context, str, 7);
            return true;
        } else if (((ICCMApi) ApiUtils.getApi(ICCMApi.class)).canOpen(str)) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("from", "micro_app");
            return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).open(context, buildUpon.toString(), null, null);
        } else if (this.f101375c.openCustomUrl(context, str)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m157977a(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        ArrayList<ILittleAppService.AbstractC41417b> arrayList = this.f101378f;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<ILittleAppService.AbstractC41417b> it = this.f101378f.iterator();
            while (it.hasNext()) {
                ILittleAppService.AbstractC41417b next = it.next();
                if (aVar.mo105887c() != aVar2.mo105887c()) {
                    next.mo149192a(aVar2.mo105887c());
                } else {
                    AppBrandLogger.m52830i("LittleAppDependencyImpl", "app front status of old state & new state is equal");
                }
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144257a(Context context, Bundle bundle) {
        if (bundle != null) {
            boolean z = bundle.getBoolean("allowCreateGroup", true);
            boolean z2 = bundle.getBoolean("multiSelect", false);
            boolean z3 = bundle.getBoolean("ignoreSelf", false);
            final boolean z4 = bundle.getBoolean("ignoreBot", false);
            boolean z5 = bundle.getBoolean("showMessageInput", false);
            String str = bundle.getInt("selectType", 0) + "";
            String string = bundle.getString("confirmTitle", "");
            String string2 = bundle.getString("confirmDesc", "");
            ForwardFeature b = new ForwardFeature.C38394a().mo140775a(z).mo140776b(z2).mo140780e(z5).mo140777b();
            ForwardTargetFilter.C38400a d = new ForwardTargetFilter.C38400a().mo140845b(!bundle.getBoolean("externalChat", true)).mo140844a(z3).mo140848d(true);
            if ("2".equals(str)) {
                d.mo140850f(true);
                b.mo140753b(false);
            } else if ("1".equals(str)) {
                d.mo140849e(true);
            }
            d.mo140843a(new AbstractC38407b() {
                /* class com.ss.android.lark.integrator.littleapp.C39801b.C398043 */

                @Override // com.ss.android.lark.forward.dto.template.AbstractC38407b
                /* renamed from: a */
                public boolean mo140837a(ForwardTarget forwardTarget) {
                    if (z4) {
                        return forwardTarget.mo140571e();
                    }
                    return false;
                }
            });
            ForwardTemplate a = new ForwardTemplate.C38388a().mo140610a(b).mo140614a(ForwardTargetSource.C38402a.m151436a()).mo140613a(d.mo140846b()).mo140615a(new ForwardViewDependency.C38404a().mo140898c(string).mo140891a(new BasicDialogContent.C38391a().mo140730a(string2).mo140732a()).mo140892a(this.f101375c.getMessageCardEnhancedView()).mo140897b()).mo140612a(new ForwardLaunchParam.C38396a().mo140813a(1).mo140814b()).mo140617a(new AbstractC38405a() {
                /* class com.ss.android.lark.integrator.littleapp.C39801b.C398054 */

                @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
                public void onForward(List<ForwardTarget> list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                    Bundle bundle2;
                    JSONObject jSONObject = new JSONObject();
                    if (!CollectionUtils.isEmpty(list)) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            for (ForwardTarget forwardTarget : list) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("id", forwardTarget.mo140567b());
                                jSONObject2.put("name", forwardTarget.mo140568c());
                                jSONObject2.put("avatar", forwardTarget.mo140569d());
                                jSONObject2.put("isBot", forwardTarget.mo140571e());
                                if (forwardTarget.mo140572f().isP2PChat()) {
                                    jSONObject2.put("chatType", "0");
                                } else {
                                    jSONObject2.put("chatType", "1");
                                }
                                jSONArray.put(jSONObject2);
                            }
                            jSONObject.put("choose_chat_result", jSONArray);
                            if (bundle.containsKey("send_preview_card_response") && (bundle2 = bundle.getBundle("send_preview_card_response")) != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                for (String str : bundle2.keySet()) {
                                    try {
                                        jSONObject3.put(str, JSONObject.wrap(bundle2.get(str)));
                                    } catch (JSONException e) {
                                        Log.m165384e("LittleAppDependencyImpl", "JSONException", e);
                                    }
                                }
                                jSONObject.put("send_message_card_result", jSONObject3);
                            }
                            if (bundle.containsKey("key_param_addition_note")) {
                                String str2 = (String) bundle.get("key_param_addition_note");
                                if (!TextUtils.isEmpty(str2)) {
                                    jSONObject.put("message", str2);
                                }
                            }
                        } catch (JSONException e2) {
                            Log.m165384e("LittleAppDependencyImpl", "JSONException", e2);
                        }
                        Intent intent = new Intent();
                        intent.putExtra("result", jSONObject.toString());
                        aVar.mo140599a(-1, intent);
                    }
                }
            });
            a.mo140580a(bundle);
            this.f101375c.forwardWithTemplate(context, a, 20009);
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: b */
    public boolean mo144285b(String str, boolean z) {
        return C37239a.m146648b().mo136952a(str, z);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: c */
    public boolean mo144288c(Context context, String str, String str2) {
        final Bundle bundle = new Bundle();
        bundle.putString("extra_key_app_id", str2);
        this.f101376d.startSecurityVerify(context, str, str2, new AbstractC49402q() {
            /* class com.ss.android.lark.integrator.littleapp.C39801b.C398076 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q
            public void handleResult(Context context, String str) {
                LittleAppModuleProvider.m157932a().mo148943b().mo149145a((Activity) context, bundle, str);
            }
        });
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: b */
    public boolean mo144283b(Context context, String str, String str2) {
        this.f101375c.startUserProfile(context, str, null, new ContactSource.C29531a().mo104726a(0).mo104728a());
        Log.m165389i("LittleAppDependencyImpl", "startProfileActivityByChatterId");
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144259a(Context context, String str, String str2) {
        AppCenterModuleProvider.m154360a().mo103301a(context, str, str2);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: d */
    public boolean mo144293d(Context context, String str, String str2, boolean z) {
        String str3;
        FileContent fileContent = new FileContent();
        fileContent.setFilePath(str);
        fileContent.setKey(str);
        fileContent.setFileState(FileState.DONE);
        fileContent.setMime(str2);
        File file = new File(str);
        if (file.exists()) {
            str3 = file.getName();
        } else {
            str3 = "";
        }
        fileContent.setName(str3);
        this.f101375c.openLocalFileDetail(context, fileContent, z);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: c */
    public boolean mo144289c(Context context, String str, String str2, boolean z) {
        final Bundle bundle = new Bundle();
        bundle.putString("extra_key_app_id", str);
        int[] iArr = {0, 1};
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str2, "barCode")) {
                iArr = new int[]{1};
            } else if (TextUtils.equals(str2, "qrCode")) {
                iArr = new int[]{0};
            }
        }
        AppCenterModuleProvider.m154360a().mo103305a(context, iArr, z, new AppCenterModule.AbstractC29127a() {
            /* class com.ss.android.lark.integrator.littleapp.C39801b.C398065 */

            @Override // com.ss.android.lark.appcenter.wrapper.AppCenterModule.AbstractC29127a
            public boolean handleResult(Context context, String str, int i) {
                LittleAppModuleProvider.m157932a().mo148943b().mo149145a((Activity) context, bundle, str);
                return true;
            }
        });
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: b */
    public boolean mo144284b(Context context, String str, String str2, boolean z) {
        this.f101374b.openChat(context, ChatBundle.m109259a().mo105935d(str2).mo105931b(str).mo105929a());
        if (!DesktopUtil.m144301a(context)) {
            return true;
        }
        this.f101374b.peakFeedCard(str);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144260a(Context context, String str, String str2, String str3) {
        AppCenterModuleProvider.m154360a().mo103313b(context, str, str2, str3);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41416a
    /* renamed from: a */
    public void mo144258a(Context context, String str, float f, long j, String str2, long j2, AbstractC41371j.AbstractC41380i iVar) {
        boolean isUsPackage = this.f101376d.isUsPackage();
        Log.m165389i("GetLocation", "::isGooglePlay:" + isUsPackage);
        C39815e.m158060a().mo144315a(context, str, f, j, str2, j2, iVar);
    }
}
