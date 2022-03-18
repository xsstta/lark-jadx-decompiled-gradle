package com.tt.miniapp.p3324r;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.applink.C24579a;
import com.larksuite.component.openplatform.core.plugin.authorization.C24601b;
import com.larksuite.component.openplatform.core.plugin.container.C24656b;
import com.larksuite.component.openplatform.core.plugin.container.C24660d;
import com.larksuite.component.openplatform.core.plugin.container.C24661e;
import com.larksuite.component.openplatform.core.plugin.container.C24663f;
import com.larksuite.component.openplatform.core.plugin.container.C24665g;
import com.larksuite.component.openplatform.core.plugin.container.C24666h;
import com.larksuite.component.openplatform.core.plugin.container.C24667i;
import com.larksuite.component.openplatform.core.plugin.container.C24668j;
import com.larksuite.component.openplatform.core.plugin.container.C24670k;
import com.larksuite.component.openplatform.core.plugin.container.navigation.C24680a;
import com.larksuite.component.openplatform.core.plugin.container.navigation.C24682b;
import com.larksuite.component.openplatform.core.plugin.container.navigation.C24684c;
import com.larksuite.component.openplatform.core.plugin.container.navigation.C24686d;
import com.larksuite.component.openplatform.core.plugin.container.navigation.C24688e;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24636a;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24639b;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24644c;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24648e;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24651f;
import com.larksuite.component.openplatform.core.plugin.container.p1128a.C24653g;
import com.larksuite.component.openplatform.core.plugin.container.p1129b.C24657a;
import com.larksuite.component.openplatform.core.plugin.container.p1129b.C24658b;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.C24706a;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.C24708b;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.C24710c;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.C24712d;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.C24715e;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.C24717f;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.C24719g;
import com.larksuite.component.openplatform.core.plugin.container.tabbar.C24721h;
import com.larksuite.component.openplatform.core.plugin.device.C24724a;
import com.larksuite.component.openplatform.core.plugin.device.C24801c;
import com.larksuite.component.openplatform.core.plugin.device.C24807d;
import com.larksuite.component.openplatform.core.plugin.device.C24830e;
import com.larksuite.component.openplatform.core.plugin.device.C24832f;
import com.larksuite.component.openplatform.core.plugin.device.C24835g;
import com.larksuite.component.openplatform.core.plugin.device.accelerometer.C24733b;
import com.larksuite.component.openplatform.core.plugin.device.p1130a.C24725a;
import com.larksuite.component.openplatform.core.plugin.device.p1130a.C24726b;
import com.larksuite.component.openplatform.core.plugin.device.p1131b.C24735a;
import com.larksuite.component.openplatform.core.plugin.device.p1132c.C24803a;
import com.larksuite.component.openplatform.core.plugin.device.p1132c.C24804b;
import com.larksuite.component.openplatform.core.plugin.device.p1133d.C24808a;
import com.larksuite.component.openplatform.core.plugin.device.p1133d.C24810b;
import com.larksuite.component.openplatform.core.plugin.device.p1133d.C24817c;
import com.larksuite.component.openplatform.core.plugin.device.p1133d.C24818d;
import com.larksuite.component.openplatform.core.plugin.infra.C24872a;
import com.larksuite.component.openplatform.core.plugin.infra.file.C24912m;
import com.larksuite.component.openplatform.core.plugin.infra.file.C24915p;
import com.larksuite.component.openplatform.core.plugin.infra.network.C24928a;
import com.larksuite.component.openplatform.core.plugin.infra.network.C24929b;
import com.larksuite.component.openplatform.core.plugin.infra.network.C24932d;
import com.larksuite.component.openplatform.core.plugin.infra.network.C24933e;
import com.larksuite.component.openplatform.core.plugin.infra.network.C24934f;
import com.larksuite.component.openplatform.core.plugin.infra.network.C24935g;
import com.larksuite.component.openplatform.core.plugin.infra.p1134a.C24873a;
import com.larksuite.component.openplatform.core.plugin.infra.p1134a.C24875c;
import com.larksuite.component.openplatform.core.plugin.infra.storage.C24961a;
import com.larksuite.component.openplatform.core.plugin.infra.storage.C24963c;
import com.larksuite.component.openplatform.core.plugin.infra.storage.C24964d;
import com.larksuite.component.openplatform.core.plugin.infra.storage.C24965e;
import com.larksuite.component.openplatform.core.plugin.inner.C24997b;
import com.larksuite.component.openplatform.core.plugin.inner.C25002e;
import com.larksuite.component.openplatform.core.plugin.inner.C25006g;
import com.larksuite.component.openplatform.core.plugin.inner.C25007h;
import com.larksuite.component.openplatform.core.plugin.inner.C25010k;
import com.larksuite.component.openplatform.core.plugin.messenger.C25095a;
import com.larksuite.component.openplatform.core.plugin.messenger.C25116b;
import com.larksuite.component.openplatform.core.plugin.messenger.C25122c;
import com.larksuite.component.openplatform.core.plugin.messenger.C25144d;
import com.larksuite.component.openplatform.core.plugin.messenger.C25146e;
import com.larksuite.component.openplatform.core.plugin.messenger.C25156f;
import com.larksuite.component.openplatform.core.plugin.messenger.C25159g;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25191a;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25200b;
import com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a;
import com.larksuite.component.openplatform.core.plugin.op.C25327a;
import com.larksuite.component.openplatform.core.plugin.op.C25329aa;
import com.larksuite.component.openplatform.core.plugin.op.C25330ab;
import com.larksuite.component.openplatform.core.plugin.op.C25378b;
import com.larksuite.component.openplatform.core.plugin.op.C25379c;
import com.larksuite.component.openplatform.core.plugin.op.C25382e;
import com.larksuite.component.openplatform.core.plugin.op.C25386g;
import com.larksuite.component.openplatform.core.plugin.op.C25388h;
import com.larksuite.component.openplatform.core.plugin.op.C25398k;
import com.larksuite.component.openplatform.core.plugin.op.C25408l;
import com.larksuite.component.openplatform.core.plugin.op.C25410n;
import com.larksuite.component.openplatform.core.plugin.op.C25413o;
import com.larksuite.component.openplatform.core.plugin.op.C25414p;
import com.larksuite.component.openplatform.core.plugin.op.C25415q;
import com.larksuite.component.openplatform.core.plugin.op.C25417r;
import com.larksuite.component.openplatform.core.plugin.op.C25419s;
import com.larksuite.component.openplatform.core.plugin.op.C25420t;
import com.larksuite.component.openplatform.core.plugin.op.C25424v;
import com.larksuite.component.openplatform.core.plugin.op.C25429w;
import com.larksuite.component.openplatform.core.plugin.op.C25430x;
import com.larksuite.component.openplatform.core.plugin.op.C25432y;
import com.larksuite.component.openplatform.core.plugin.op.C25435z;
import com.larksuite.component.openplatform.core.plugin.passport.C25449a;
import com.larksuite.component.openplatform.core.plugin.router.C25471a;
import com.larksuite.component.openplatform.core.plugin.router.C25472b;
import com.larksuite.component.openplatform.core.plugin.settings.C25478a;
import com.larksuite.component.openplatform.core.plugin.settings.C25479b;
import com.larksuite.component.openplatform.core.plugin.vc.audio.async.C25487a;
import com.larksuite.component.openplatform.core.plugin.vc.audio.async.C25488b;
import com.larksuite.component.openplatform.core.plugin.vc.audio.async.C25489c;
import com.larksuite.component.openplatform.core.plugin.vc.audio.async.C25490d;
import com.larksuite.component.openplatform.core.plugin.vc.audio.async.C25492e;
import com.larksuite.component.openplatform.core.plugin.vc.audio.bg.C25498a;
import com.larksuite.component.openplatform.core.plugin.vc.audio.bg.C25500b;
import com.larksuite.component.openplatform.core.plugin.vc.audio.bg.C25501c;
import com.larksuite.component.openplatform.core.plugin.vc.audio.bg.C25503d;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.C65807c;
import com.tt.miniapp.jsbridge.C66254h;
import com.tt.miniapp.p3323q.C66692i;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.option.ext.AbstractC67619e;
import com.tt.option.ext.AbstractC67622h;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.r.b */
public class C66713b {

    /* renamed from: g */
    private static String f168417g = "";

    /* renamed from: h */
    private static long f168418h;

    /* renamed from: a */
    public String f168419a;

    /* renamed from: b */
    public String f168420b;

    /* renamed from: c */
    public int f168421c;

    /* renamed from: d */
    public IAppContext f168422d;

    /* renamed from: e */
    private AbstractC67619e f168423e;

    /* renamed from: f */
    private IApiInputParam f168424f;

    /* renamed from: a */
    public void mo232443a() {
        AbstractC67622h.AbstractC67623a extensionApiCreator;
        ApiHandler a;
        ApiHandler pVar;
        if (this.f168419a.equals("navigateTo") || this.f168419a.equals("navigateBack") || this.f168419a.equals("redirectTo") || this.f168419a.equals("reLaunch") || this.f168419a.equals("switchTab")) {
            AppBrandLogger.m52828d("tma_ApiInvokeCtrl", "Start ", Long.valueOf(System.currentTimeMillis()));
            String str = C67054r.m261336a(this.f168420b).f169027a;
            if (m260481a(this.f168419a, str, this.f168422d)) {
                AppBrandLogger.m52830i("tma_ApiInvokeCtrl", "router same in 300 ms");
                return;
            }
            C66692i.m260474a(str, this.f168422d);
            m260482b();
            return;
        }
        ApiHandler apiHandler = null;
        if (DebugUtil.debug()) {
            AppBrandLogger.m52828d("tma_ApiInvokeCtrl", "doAct mApi ", this.f168419a, "param:" + this.f168420b);
        } else {
            AppBrandLogger.m52828d("tma_ApiInvokeCtrl", "doAct mApi ", this.f168419a);
        }
        if (this.f168419a.equals("createAudioInstance")) {
            apiHandler = new C25487a(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("destroyAudioInstance")) {
            apiHandler = new C25488b(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("setAudioState")) {
            apiHandler = new C25492e(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("operateAudio")) {
            apiHandler = new C25490d(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getAudioState")) {
            apiHandler = new C25489c(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("showModal")) {
            apiHandler = new C25156f(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("showActionSheet")) {
            apiHandler = new C25095a(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("showToast")) {
            apiHandler = new C25159g(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("hideToast")) {
            apiHandler = new C25144d(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getLocation")) {
            apiHandler = new C25191a(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getSystemInfo")) {
            apiHandler = new C24872a(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getNetworkType")) {
            apiHandler = new C24928a(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getConnectedWifi")) {
            apiHandler = new C24808a(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getWifiList")) {
            apiHandler = new C24810b(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("onGetWifiList")) {
            apiHandler = new C24818d(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("offGetWifiList")) {
            apiHandler = new C24817c(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("scanCode")) {
            apiHandler = new C25146e(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("operateRequestTask")) {
            apiHandler = new C24932d(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("startPullDownRefresh")) {
            apiHandler = new C24668j(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("stopPullDownRefresh")) {
            apiHandler = new C24670k(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("setNavigationBarTitle")) {
            apiHandler = new C24686d(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("setNavigationBarColor")) {
            apiHandler = new C24684c(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("operateUploadTask")) {
            apiHandler = new C24935g(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getSavedFileList")) {
            apiHandler = new C24965e(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getSavedFileInfo")) {
            apiHandler = new C24964d(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getFileInfo")) {
            apiHandler = new C24963c(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("setClipboardData")) {
            apiHandler = new C24726b(this.f168420b, this.f168421c, this.f168423e);
        } else if (this.f168419a.equals("getClipboardData")) {
            apiHandler = new C24725a(this.f168420b, this.f168421c, this.f168423e);
        } else {
            if (this.f168419a.equals("operateSocketTask")) {
                IApiInputParam iApiInputParam = this.f168424f;
                if (iApiInputParam != null) {
                    pVar = new C24934f(iApiInputParam, this.f168421c, this.f168423e);
                } else {
                    apiHandler = new C24933e(this.f168420b, this.f168421c, this.f168423e);
                }
            } else if (this.f168419a.equals("vibrateLong")) {
                apiHandler = new C24803a(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("vibrateShort")) {
                apiHandler = new C24804b(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("checkSession")) {
                apiHandler = new C25382e(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("shareAppMessageDirectly")) {
                apiHandler = new C25277a(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("systemLog")) {
                apiHandler = new C25010k(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("dealUserRelation")) {
                apiHandler = new C25386g(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("enableAccelerometer")) {
                apiHandler = new C24733b(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("base64ToTempFilePath")) {
                apiHandler = new C24961a(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("startCompass")) {
                apiHandler = new C24735a(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("stopCompass")) {
                apiHandler = new C24735a(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("getBatteryInfo")) {
                apiHandler = new C24724a(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("getScreenBrightness")) {
                apiHandler = new C24832f(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("setKeepScreenOn")) {
                apiHandler = C67432a.m262319a(this.f168422d).getAppInfo().type == 2 ? new C24832f(this.f168419a, this.f168420b, this.f168421c, this.f168423e) : new C24835g(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("setScreenBrightness")) {
                apiHandler = new C24832f(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("onUserCaptureScreen")) {
                apiHandler = new C24830e(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("offUserCaptureScreen")) {
                apiHandler = new C24807d(this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("writeFile")) {
                IApiInputParam iApiInputParam2 = this.f168424f;
                if (iApiInputParam2 != null) {
                    pVar = new C24915p(this.f168419a, iApiInputParam2, this.f168421c, this.f168423e);
                } else {
                    apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
                }
            } else if (this.f168419a.equals("access")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("copyFile")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("mkdir")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("readFile")) {
                IApiInputParam iApiInputParam3 = this.f168424f;
                if (iApiInputParam3 != null) {
                    pVar = new C24915p(this.f168419a, iApiInputParam3, this.f168421c, this.f168423e);
                } else {
                    apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
                }
            } else if (this.f168419a.equals("rename")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("rmdir")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("readdir")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("stat")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("unlink")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (this.f168419a.equals("unzip")) {
                apiHandler = new C24912m(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
            } else if (!this.f168419a.equals("isDirectory") && !this.f168419a.equals("isFile")) {
                if (this.f168419a.equals("showKeyboard")) {
                    apiHandler = new C25424v(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("hideKeyboard")) {
                    apiHandler = new C25424v(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("updateKeyboard")) {
                    apiHandler = new C25424v(this.f168419a, this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("sentryReport")) {
                    apiHandler = new C24997b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("makePhoneCall")) {
                    apiHandler = new C24801c(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("openLocation")) {
                    apiHandler = new C25200b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("chooseLocation")) {
                    apiHandler = new C25122c(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("chooseAddress")) {
                    apiHandler = new C25116b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("authorize")) {
                    apiHandler = new C24601b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getSetting")) {
                    apiHandler = new C25478a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("openSetting")) {
                    apiHandler = new C25479b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("showShareMenu")) {
                    apiHandler = new C24667i(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("hideShareMenu")) {
                    apiHandler = new C24660d(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getGeneralInfo")) {
                    apiHandler = new C25413o(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("openSchema")) {
                    apiHandler = new C24579a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getCloudStorageByRelation")) {
                    apiHandler = new C25410n(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getUserCloudStorage")) {
                    apiHandler = new C25420t(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("setUserCloudStorage")) {
                    apiHandler = new C25435z(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("removeUserCloudStorage")) {
                    apiHandler = new C25432y(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("applyUpdate")) {
                    apiHandler = new C25378b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("triggerCheckUpdate")) {
                    apiHandler = new C25330ab(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("createDownloadAppTask")) {
                    apiHandler = new C24873a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("operateDownloadAppTask")) {
                    apiHandler = new C24875c(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("callHostMethod")) {
                    apiHandler = new C25379c(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getBackgroundAudioContext")) {
                    apiHandler = new C25498a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("setBgAudioState")) {
                    apiHandler = new C25503d(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getBgAudioState")) {
                    apiHandler = new C25500b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("operateBgAudio")) {
                    apiHandler = new C25501c(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getShareInfo")) {
                    apiHandler = new C25417r(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getExtConfig")) {
                    apiHandler = new C25408l(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("navigateToMiniProgram")) {
                    apiHandler = new C25472b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("navigateBackMiniProgram")) {
                    apiHandler = new C25471a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("setTabBarBadge")) {
                    apiHandler = new C24717f(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("removeTabBarBadge")) {
                    apiHandler = new C24710c(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("showTabBarRedDot")) {
                    apiHandler = new C24721h(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("hideTabBarRedDot")) {
                    apiHandler = new C24708b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("hideTabBar")) {
                    apiHandler = new C24706a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("showTabBar")) {
                    apiHandler = new C24719g(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("setTabBarItem")) {
                    apiHandler = new C24712d(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("setTabBarStyle")) {
                    apiHandler = new C24715e(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getCloudStorageByLocation")) {
                    apiHandler = new C25398k(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("openModalWebview")) {
                    apiHandler = new C24661e(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("closeModalWebview")) {
                    apiHandler = new C24656b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("operateInnerRequestTask")) {
                    apiHandler = new C24929b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getRecentAppList")) {
                    apiHandler = new C25415q(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("removeFromRecentAppList")) {
                    apiHandler = new C25430x(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("reportTimelinePoints")) {
                    apiHandler = new C25007h(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getFavoritesList")) {
                    apiHandler = new C24644c(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("addToFavorites")) {
                    apiHandler = new C24636a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("removeFromFavorites")) {
                    apiHandler = new C24648e(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("sortFavorites")) {
                    apiHandler = new C24653g(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("showFavoriteGuide")) {
                    apiHandler = new C24651f(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("addToUserFavorites")) {
                    apiHandler = new C24639b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("operateModalWebviewState")) {
                    apiHandler = new C24663f(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("reportJsRuntimeError")) {
                    apiHandler = new C25006g(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getUserStateDirectly")) {
                    apiHandler = new C25449a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getTimingSettings")) {
                    apiHandler = new C25419s(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("preloadMiniProgram")) {
                    apiHandler = new C25002e(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("addShortcut")) {
                    apiHandler = new C24657a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("showMorePanel")) {
                    apiHandler = new C24666h(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("setMenuButtonVisibility")) {
                    apiHandler = new C24665g(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getHostLaunchQuery")) {
                    apiHandler = new C25414p(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("checkShortcut")) {
                    apiHandler = new C24658b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("getAdSiteBaseInfo")) {
                    apiHandler = new C25388h(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("showNavigationBarLoading")) {
                    apiHandler = new C24688e(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("hideNavigationBarLoading")) {
                    apiHandler = new C24682b(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("hideHomeButton")) {
                    apiHandler = new C24680a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("addHostEventListener")) {
                    apiHandler = new C25327a(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("removeHostEventListener")) {
                    apiHandler = new C25429w(this.f168420b, this.f168421c, this.f168423e);
                } else if (this.f168419a.equals("showErrorPage")) {
                    apiHandler = new C25329aa(this.f168420b, this.f168421c, this.f168423e);
                }
            }
            apiHandler = pVar;
        }
        if (!((apiHandler != null && !apiHandler.canOverride()) || (extensionApiCreator = AppbrandContext.getInst().getExtensionApiCreator()) == null || (a = extensionApiCreator.mo48874a(this.f168419a, this.f168420b, this.f168421c, this.f168423e)) == null)) {
            apiHandler = a;
        }
        if (apiHandler != null) {
            apiHandler.setAppContext(this.f168422d);
            C66625a.m260273a(apiHandler);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, this.f168419a + ":fail api is not exist");
            AppBrandLogger.m52828d("tma_ApiInvokeCtrl", "apiinvoke jsonObject ", jSONObject);
            this.f168423e.callback(this.f168421c, jSONObject.toString());
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_ApiInvokeCtrl", e.getStackTrace());
        }
    }

    /* renamed from: b */
    private void m260482b() {
        AppBrandLogger.m52828d("tma_ApiInvokeCtrl", "mApi : ", this.f168419a, " mArgs : ", this.f168420b);
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.p3324r.C66713b.RunnableC667141 */

            public void run() {
                C65807c appRouter = AppbrandApplicationImpl.getInst(C66713b.this.f168422d).getAppRouter();
                if (appRouter != null) {
                    ApiCallResult.Builder a = appRouter.mo230503a(C66713b.this.f168419a, C66713b.this.f168420b);
                    if (a != null) {
                        AppbrandApplicationImpl.getInst(C66713b.this.f168422d).getJsBridge().returnAsyncResult(C66713b.this.f168421c, C66713b.this.f168419a, C66713b.this.mo232442a(a), null);
                        return;
                    }
                    return;
                }
                AppBrandLogger.m52829e("tma_ApiInvokeCtrl", "router == null");
                if (DebugUtil.debug()) {
                    throw new IllegalStateException("router is null");
                }
            }
        });
    }

    /* renamed from: a */
    public String mo232442a(ApiCallResult.Builder builder) {
        builder.appendResponseData("callbackID", Integer.valueOf(this.f168421c));
        return builder.build().toString();
    }

    public C66713b(C66254h hVar, IAppContext iAppContext) {
        this.f168419a = hVar.f167222a;
        this.f168420b = hVar.f167223b;
        this.f168421c = hVar.f167224c;
        this.f168423e = hVar.f167225d;
        this.f168424f = hVar.f167226e;
        this.f168422d = iAppContext;
    }

    /* renamed from: a */
    private boolean m260481a(String str, String str2, IAppContext iAppContext) {
        String str3 = iAppContext.getAppId() + ";api:" + str + ";path:" + str2;
        boolean z = false;
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.gadget.router_jump_same_filter", false);
        AppBrandLogger.m52829e("tma_ApiInvokeCtrl", "enable router filter " + featureGating);
        if (f168417g.equals(str3) && System.currentTimeMillis() - f168418h < 300) {
            new C67500a("op_router_repeat", C67501b.bv, iAppContext).addCategoryValue("app_id", iAppContext.getAppIdentify()).addCategoryValue("api_name", this.f168419a).addCategoryValue("path", str2).addCategoryValue("enable_router_filter", Boolean.valueOf(featureGating)).flush();
            if (featureGating) {
                z = true;
            }
        }
        f168417g = str3;
        f168418h = System.currentTimeMillis();
        return z;
    }
}
