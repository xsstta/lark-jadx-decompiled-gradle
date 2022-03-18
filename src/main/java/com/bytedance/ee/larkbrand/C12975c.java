package com.bytedance.ee.larkbrand;

import com.bytedance.ee.larkbrand.nativeMoudule.rich.C13236c;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.C13238d;
import com.bytedance.ee.larkbrand.p647b.C12974a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.openplatform.core.plugin.applink.C24581b;
import com.larksuite.component.openplatform.core.plugin.container.C24672l;
import com.larksuite.component.openplatform.core.plugin.container.C24673m;
import com.larksuite.component.openplatform.core.plugin.container.C24674n;
import com.larksuite.component.openplatform.core.plugin.device.C24734b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24749a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24750b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24751c;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24752d;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24753e;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24756f;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24757g;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24786b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24788c;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24790d;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24792e;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24794f;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24795g;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24797h;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24799i;
import com.larksuite.component.openplatform.core.plugin.device.p1133d.C24827i;
import com.larksuite.component.openplatform.core.plugin.inner.C24996a;
import com.larksuite.component.openplatform.core.plugin.inner.C24999c;
import com.larksuite.component.openplatform.core.plugin.inner.C25008i;
import com.larksuite.component.openplatform.core.plugin.inner.C25012n;
import com.larksuite.component.openplatform.core.plugin.inner.LarkApiGetServerTimeCtrl;
import com.larksuite.component.openplatform.core.plugin.messenger.AbstractC25162j;
import com.larksuite.component.openplatform.core.plugin.messenger.C25233o;
import com.larksuite.component.openplatform.core.plugin.messenger.C25234p;
import com.larksuite.component.openplatform.core.plugin.messenger.C25239q;
import com.larksuite.component.openplatform.core.plugin.messenger.C25240r;
import com.larksuite.component.openplatform.core.plugin.messenger.C25245s;
import com.larksuite.component.openplatform.core.plugin.messenger.C25304v;
import com.larksuite.component.openplatform.core.plugin.messenger.LarkApiOffChatBadgeChangeCtrl;
import com.larksuite.component.openplatform.core.plugin.messenger.LarkApiOnChatBadgeChangeCtrl;
import com.larksuite.component.openplatform.core.plugin.messenger.LarkApiScanCodeCtrl;
import com.larksuite.component.openplatform.core.plugin.messenger.chat.C25139c;
import com.larksuite.component.openplatform.core.plugin.messenger.chat.LarkApiGetChatInfoCtrl;
import com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25170a;
import com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25176b;
import com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25180c;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25213d;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25220e;
import com.larksuite.component.openplatform.core.plugin.messenger.location.C25221f;
import com.larksuite.component.openplatform.core.plugin.messenger.share.C25292b;
import com.larksuite.component.openplatform.core.plugin.op.LarkApiCheckSessionCtrl;
import com.larksuite.component.openplatform.core.plugin.passport.C25453c;
import com.larksuite.component.openplatform.core.plugin.passport.LarkApiGetKaInfo;
import com.larksuite.component.openplatform.core.plugin.passport.LarkApiGetUserInfoExCtrl;
import com.larksuite.component.openplatform.core.plugin.router.C25474d;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.option.ext.AbstractC67619e;
import com.tt.option.ext.AbstractC67622h;

/* renamed from: com.bytedance.ee.larkbrand.c */
public class C12975c implements AbstractC67622h.AbstractC67623a {

    /* renamed from: a */
    private AbstractC25162j f34527a = new C12974a();

    @Override // com.tt.option.ext.AbstractC67622h.AbstractC67623a
    /* renamed from: a */
    public AbstractC66715a mo48875a(String str, String str2) {
        str.hashCode();
        if (!str.equals("reportAnalytics")) {
            return null;
        }
        return new C25012n(str2);
    }

    @Override // com.tt.option.ext.AbstractC67622h.AbstractC67623a
    /* renamed from: a */
    public ApiHandler mo48874a(String str, String str2, int i, AbstractC67619e eVar) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123672410:
                if (str.equals("getServerTime")) {
                    c = 0;
                    break;
                }
                break;
            case -2105905201:
                if (str.equals("enterBot")) {
                    c = 1;
                    break;
                }
                break;
            case -1950665647:
                if (str.equals("enablePullDownRefresh")) {
                    c = 2;
                    break;
                }
                break;
            case -1871877439:
                if (str.equals("navigateToMiniProgram")) {
                    c = 3;
                    break;
                }
                break;
            case -1746750626:
                if (str.equals("openOuterURL")) {
                    c = 4;
                    break;
                }
                break;
            case -1746641096:
                if (str.equals("startFaceVerify")) {
                    c = 5;
                    break;
                }
                break;
            case -1626238453:
                if (str.equals("startFaceIdentify")) {
                    c = 6;
                    break;
                }
                break;
            case -1378908273:
                if (str.equals("getShowModalTipInfo")) {
                    c = 7;
                    break;
                }
                break;
            case -1292995619:
                if (str.equals("getBLEDeviceCharacteristics")) {
                    c = '\b';
                    break;
                }
                break;
            case -1186820151:
                if (str.equals("logManager")) {
                    c = '\t';
                    break;
                }
                break;
            case -1107875993:
                if (str.equals("getDeviceID")) {
                    c = '\n';
                    break;
                }
                break;
            case -1081572750:
                if (str.equals("mailto")) {
                    c = 11;
                    break;
                }
                break;
            case -1063449094:
                if (str.equals("writeBLECharacteristicValue")) {
                    c = '\f';
                    break;
                }
                break;
            case -1044911399:
                if (str.equals("closeBluetoothAdapter")) {
                    c = '\r';
                    break;
                }
                break;
            case -989318261:
                if (str.equals("hideRichText")) {
                    c = 14;
                    break;
                }
                break;
            case -961595471:
                if (str.equals("enterProfile")) {
                    c = 15;
                    break;
                }
                break;
            case -891002358:
                if (str.equals("scanCode")) {
                    c = 16;
                    break;
                }
                break;
            case -858529200:
                if (str.equals("enterChat")) {
                    c = 17;
                    break;
                }
                break;
            case -801410610:
                if (str.equals("consoleLogOutput")) {
                    c = 18;
                    break;
                }
                break;
            case -796581812:
                if (str.equals("disablePullDownRefresh")) {
                    c = 19;
                    break;
                }
                break;
            case -779993700:
                if (str.equals("getChatInfo")) {
                    c = 20;
                    break;
                }
                break;
            case -699407929:
                if (str.equals("connectBLEDevice")) {
                    c = 21;
                    break;
                }
                break;
            case -496055043:
                if (str.equals("getLocationStatus")) {
                    c = 22;
                    break;
                }
                break;
            case -316023509:
                if (str.equals("getLocation")) {
                    c = 23;
                    break;
                }
                break;
            case -253179333:
                if (str.equals("shareAppMessageDirectly")) {
                    c = 24;
                    break;
                }
                break;
            case -177914214:
                if (str.equals("getBluetoothAdapterState")) {
                    c = 25;
                    break;
                }
                break;
            case -154222755:
                if (str.equals("getWifiStatus")) {
                    c = 26;
                    break;
                }
                break;
            case 64407381:
                if (str.equals("setBLEMTU")) {
                    c = 27;
                    break;
                }
                break;
            case 94388255:
                if (str.equals("openLocation")) {
                    c = 28;
                    break;
                }
                break;
            case 151161429:
                if (str.equals("disconnectBLEDevice")) {
                    c = 29;
                    break;
                }
                break;
            case 154104540:
                if (str.equals("onChatBadgeChange")) {
                    c = 30;
                    break;
                }
                break;
            case 173837833:
                if (str.equals("chooseContact")) {
                    c = 31;
                    break;
                }
                break;
            case 215866481:
                if (str.equals("readBLECharacteristicValue")) {
                    c = ' ';
                    break;
                }
                break;
            case 271360840:
                if (str.equals("setAuthenticationInfo")) {
                    c = '!';
                    break;
                }
                break;
            case 323226175:
                if (str.equals("stopBluetoothDevicesDiscovery")) {
                    c = '\"';
                    break;
                }
                break;
            case 526679546:
                if (str.equals("getKAInfo")) {
                    c = '#';
                    break;
                }
                break;
            case 607733580:
                if (str.equals("setTiming")) {
                    c = '$';
                    break;
                }
                break;
            case 695283393:
                if (str.equals("showPrompt")) {
                    c = '%';
                    break;
                }
                break;
            case 790324418:
                if (str.equals("getConnectedBluetoothDevices")) {
                    c = '&';
                    break;
                }
                break;
            case 1002194338:
                if (str.equals("getUserInfoEx")) {
                    c = '\'';
                    break;
                }
                break;
            case 1484597701:
                if (str.equals("getBluetoothDevices")) {
                    c = '(';
                    break;
                }
                break;
            case 1576663519:
                if (str.equals("startBluetoothDevicesDiscovery")) {
                    c = ')';
                    break;
                }
                break;
            case 1626524732:
                if (str.equals("checkWatermark")) {
                    c = '*';
                    break;
                }
                break;
            case 1642643788:
                if (str.equals("offChatBadgeChange")) {
                    c = '+';
                    break;
                }
                break;
            case 1735241305:
                if (str.equals("getBLEDeviceServices")) {
                    c = ',';
                    break;
                }
                break;
            case 1891452486:
                if (str.equals("showRichText")) {
                    c = '-';
                    break;
                }
                break;
            case 1924332654:
                if (str.equals("checkSession")) {
                    c = '.';
                    break;
                }
                break;
            case 2023135759:
                if (str.equals("chooseChat")) {
                    c = '/';
                    break;
                }
                break;
            case 2099203883:
                if (str.equals("openBluetoothAdapter")) {
                    c = '0';
                    break;
                }
                break;
            case 2131134132:
                if (str.equals("notifyBLECharacteristicValueChange")) {
                    c = '1';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new LarkApiGetServerTimeCtrl(str2, i, eVar);
            case 1:
                return new C25239q(str2, i, eVar);
            case 2:
                return new C24673m(str2, i, eVar);
            case 3:
                return new C25474d(str2, i, eVar);
            case 4:
                return new C24581b(str2, i, eVar);
            case 5:
                return new C25176b(str2, i, eVar);
            case 6:
                return new C25170a(str2, i, eVar);
            case 7:
                return new C24674n(str2, i, eVar);
            case '\b':
                return new C24790d(str2, i, eVar);
            case '\t':
                return new C24999c(str2, i, eVar);
            case '\n':
                return new C25453c(str2, i, eVar);
            case 11:
                return new C24734b(str2, i, eVar);
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return new C24799i(str2, i, eVar);
            case '\r':
                return new C24749a(str2, i, eVar);
            case 14:
                return new C13236c(str2, i, eVar);
            case 15:
                return new C25245s(str2, i, eVar);
            case 16:
                return new LarkApiScanCodeCtrl(str2, i, eVar);
            case 17:
                return new C25240r(str2, i, eVar);
            case 18:
                return new C24996a(str2, i, eVar);
            case 19:
                return new C24672l(str2, i, eVar);
            case 20:
                return new LarkApiGetChatInfoCtrl(str2, i, eVar);
            case 21:
                return new C24786b(str2, i, eVar);
            case 22:
                return new C25220e(str2, i, eVar);
            case 23:
                return new C25213d(str2, i, eVar);
            case 24:
                return new C25292b(str2, i, eVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                return new C24751c(str2, i, eVar);
            case 26:
                return new C24827i(str2, i, eVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                return new C24797h(str2, i, eVar);
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                return new C25221f(str2, i, eVar);
            case 29:
                return new C24788c(str2, i, eVar);
            case 30:
                return new LarkApiOnChatBadgeChangeCtrl(str2, i, eVar);
            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                return new C25234p(str2, i, eVar);
            case ' ':
                return new C24795g(str2, i, eVar);
            case '!':
                return new C25180c(str2, i, eVar);
            case '\"':
                return new C24757g(str2, i, eVar);
            case '#':
                return new LarkApiGetKaInfo(str2, i, eVar);
            case '$':
                return new C25008i(str2, i, eVar);
            case '%':
                return new C25304v(str2, i, eVar, this.f34527a);
            case '&':
                return new C24752d(str2, i, eVar);
            case '\'':
                return new LarkApiGetUserInfoExCtrl(str2, i, eVar);
            case '(':
                return new C24750b(str2, i, eVar);
            case ')':
                return new C24756f(str2, i, eVar);
            case '*':
                return new C25233o(str2, i, eVar);
            case '+':
                return new LarkApiOffChatBadgeChangeCtrl(str2, i, eVar);
            case ',':
                return new C24792e(str2, i, eVar);
            case '-':
                return new C13238d(str2, i, eVar);
            case '.':
                return new LarkApiCheckSessionCtrl(str2, i, eVar);
            case '/':
                return new C25139c(str2, i, eVar);
            case '0':
                return new C24753e(str2, i, eVar);
            case '1':
                return new C24794f(str2, i, eVar);
            default:
                return null;
        }
    }
}
