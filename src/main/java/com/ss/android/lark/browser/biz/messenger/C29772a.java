package com.ss.android.lark.browser.biz.messenger;

import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.apihandler.basic.C28709a;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.basic.C29644a;
import com.ss.android.lark.browser.biz.messenger.jsapi.ConfigHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.GetAppLanguageHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.GetStepCountHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.GetSystemInfoHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.GetUserInfoExHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.GetUserInfoHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.InsertUserInfoThreeElementHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.LiveCheckHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.MultiSelectHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.NativeLogHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.OpenContactHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.OpenDetailHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.OpenDocumentHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.OpenLinkHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.OpenLinkWithSystemHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.PassportLogoutHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.PreviewImageHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.ScanQcodeHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.ShareHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.SwitchUserHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.TeaTrackerHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.chat.ConversationHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.chat.P2pChatHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoOnceLocationHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStartLocationHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStopLocationHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig.SDKConfigHandler;
import com.ss.android.lark.browser.biz.messenger.jsapi.translate.C29867a;
import com.ss.android.lark.browser.biz.messenger.queryapi.AudioAutoPlayQueryApiHandler;
import com.ss.android.lark.browser.biz.messenger.queryapi.InterceptBackQueryApiHandler;
import com.ss.android.lark.browser.biz.messenger.queryapi.LarkMediaAutoPlayQueryApiHandler;
import com.ss.android.lark.browser.biz.messenger.queryapi.LarkRemoveVideoOverlayQueryApiHandler;
import com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate;
import com.ss.android.lark.browser.biz.webapp.queryapi.OpPlatformServiceQueryApiHandler;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.ss.android.lark.browser.biz.messenger.a */
public class C29772a {
    /* renamed from: a */
    public static C25830a m110103a(boolean z) {
        C25830a aVar = new C25830a(z);
        aVar.mo91890a(new MessengerWebViewDelegate());
        m110101a(aVar);
        if (C29638a.m109622a().isFeatureGatingEnable("lark.basic.api.handler.v3")) {
            C28709a.m105268a(aVar);
            C28709a.m105269b(aVar);
            Log.m165389i("MessengerInjectorFactory", "enableBasicApiHandlerV3 is true");
        } else {
            C29644a.m109718a(aVar);
            C29644a.m109719b(aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public static C25830a m110101a(C25830a aVar) {
        if (aVar == null) {
            return null;
        }
        aVar.mo91892a("op_platform_service", new OpPlatformServiceQueryApiHandler());
        aVar.mo91892a("support_h5_media_autoplay", new AudioAutoPlayQueryApiHandler());
        aVar.mo91892a("lark_media_auto_play", new LarkMediaAutoPlayQueryApiHandler());
        aVar.mo91892a("lark_remove_video_overlay_icon", new LarkRemoveVideoOverlayQueryApiHandler());
        aVar.mo91892a("lark_intercept_back", new InterceptBackQueryApiHandler());
        aVar.mo91891a("config", new ConfigHandlerV2());
        aVar.mo91891a("getSDKConfig", new SDKConfigHandler());
        aVar.mo91891a("biz.util.previewImage", new PreviewImageHandlerV2());
        aVar.mo91891a("biz.util.share", new ShareHandlerV2());
        aVar.mo91891a("biz.util.getAppLanguage", new GetAppLanguageHandlerV2());
        aVar.mo91891a("biz.util.openDocument", new OpenDocumentHandlerV2());
        aVar.mo91891a("biz.user.getUserInfo", new GetUserInfoHandlerV2());
        aVar.mo91891a("biz.user.getUserInfoEx", new GetUserInfoExHandlerV2());
        aVar.mo91891a("biz.user.switchUser", new SwitchUserHandlerV2());
        aVar.mo91891a("biz.util.setAuthenticationInfo", new InsertUserInfoThreeElementHandlerV2());
        aVar.mo91891a("biz.util.startBiometrics", new LiveCheckHandlerV2());
        aVar.mo91891a("biz.chat.toConversation", new ConversationHandlerV2());
        aVar.mo91891a("biz.chat.openSingleChat", new P2pChatHandlerV2());
        aVar.mo91891a("biz.user.openDetail", new OpenDetailHandlerV2());
        aVar.mo91891a("biz.util.scan", new ScanQcodeHandlerV2());
        aVar.mo91891a("biz.contact.open", new OpenContactHandlerV2());
        aVar.mo91891a("device.health.getStepCount", new GetStepCountHandlerV2());
        aVar.mo91891a("biz.passport.logout", new PassportLogoutHandlerV2());
        C29867a.m110436a(aVar);
        aVar.mo91891a("biz.util.nativeLog", new NativeLogHandlerV2());
        aVar.mo91891a("biz.util.page.openLinkWithSystem", new OpenLinkWithSystemHandlerV2());
        aVar.mo91891a("biz.util.base.event.track", new TeaTrackerHandlerV2());
        aVar.mo91891a("device.base.getSystemInfo", new GetSystemInfoHandlerV2());
        aVar.mo91891a("biz.util.multiSelect", new MultiSelectHandlerV2());
        aVar.mo91891a("biz.util.openLink", new OpenLinkHandlerV2());
        return aVar;
    }

    /* renamed from: a */
    public static C25830a m110102a(String str, C25830a aVar) {
        if (aVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("MessengerInjectorFactory", "appendTrustHostJSApi failed url is empty");
            return aVar;
        }
        boolean z = false;
        List<String> k = C29638a.m109630k();
        try {
            String b = aq.m95059b(str);
            if (!TextUtils.isEmpty(b) && !CollectionUtils.isEmpty(k)) {
                Iterator<String> it = k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Pattern.compile(it.next()).matcher(b).matches()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } catch (PatternSyntaxException e) {
            Log.m165391i("MessengerInjectorFactory", e);
        } catch (UnsupportedOperationException e2) {
            Log.m165391i("MessengerInjectorFactory", e2);
        } catch (IllegalArgumentException e3) {
            Log.m165391i("MessengerInjectorFactory", e3);
        } catch (Exception e4) {
            Log.m165391i("MessengerInjectorFactory", e4);
        }
        if (!z) {
            return aVar;
        }
        aVar.mo91891a("device.geolocation.get", new GeoOnceLocationHandlerV2());
        aVar.mo91891a("device.geolocation.start", new GeoStartLocationHandlerV2());
        aVar.mo91891a("device.geolocation.stop", new GeoStopLocationHandlerV2());
        return aVar;
    }
}
