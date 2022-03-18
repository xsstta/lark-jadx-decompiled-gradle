package com.ss.android.lark.apihandler.basic;

import com.larksuite.component.webview.container.dto.C25830a;
import com.ss.android.lark.apihandler.basic.jsapi.demo.TTWebViewStatusHandler;
import com.ss.android.lark.apihandler.basic.jsapi.demo.TTWebViewSwitchHandler;
import com.ss.android.lark.apihandler.basic.jsapi.device.BluetoothDeviceStateHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.ConnWifiInfoHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.ConnectBluetoothDeviceHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.GetConnectedWifiHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.GetDeviceInfoHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.GetGatewayIpHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.GetWifiListHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.NetworkTypeHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.OffUserCaptureScreenHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.OnUserCaptureScreenHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.ScanBluetoothHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.device.WifiStatusHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.navigation.CloseHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.navigation.GoBackHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.navigation.SetLeftHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.navigation.SetMenuHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.navigation.SetRightHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.navigation.SetTitleHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.notification.AlertHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.notification.ConfirmHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.notification.HidePreloaderHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.notification.PromptHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.notification.ShowPreloaderHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.notification.ToastHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.notification.VibrateHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.CopyTextHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.DatePickerHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.GetClipboardInfoHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.LockViewOrientationHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.SavePageSnapshotHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.SendEventHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.SharePageSnapshotHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.TimePickerHandlerV2;
import com.ss.android.lark.apihandler.basic.jsapi.util.UnlockViewOrientationHandlerV2;
import com.ss.android.lark.apihandler.basic.queryapi.AlwaysShowBackQueryApiHandler;
import com.ss.android.lark.apihandler.basic.queryapi.ForceNoHttpCacheQueryApiHandler;
import com.ss.android.lark.apihandler.basic.queryapi.NavBgQueryApiHandler;
import com.ss.android.lark.apihandler.basic.queryapi.ShowRightMoreQueryApiHandler;

/* renamed from: com.ss.android.lark.apihandler.basic.a */
public class C28709a {
    /* renamed from: b */
    public static C25830a m105269b(C25830a aVar) {
        if (aVar == null) {
            return null;
        }
        aVar.mo91892a("show_left_button", new AlwaysShowBackQueryApiHandler());
        aVar.mo91892a("lark_nav_bgcolor", new NavBgQueryApiHandler());
        aVar.mo91892a("show_right_button", new ShowRightMoreQueryApiHandler());
        aVar.mo91892a("force_no_http_cache", new ForceNoHttpCacheQueryApiHandler());
        return aVar;
    }

    /* renamed from: a */
    public static C25830a m105268a(C25830a aVar) {
        if (aVar == null) {
            return null;
        }
        aVar.mo91891a("biz.navigation.setMenu", new SetMenuHandlerV2());
        aVar.mo91891a("biz.navigation.setLeft", new SetLeftHandlerV2());
        aVar.mo91891a("biz.navigation.setRight", new SetRightHandlerV2());
        aVar.mo91891a("biz.navigation.setTitle", new SetTitleHandlerV2());
        aVar.mo91891a("biz.navigation.close", new CloseHandlerV2());
        aVar.mo91891a("biz.navigation.goBack", new GoBackHandlerV2());
        aVar.mo91891a("device.notification.alert", new AlertHandlerV2());
        aVar.mo91891a("device.notification.confirm", new ConfirmHandlerV2());
        aVar.mo91891a("device.notification.showPreloader", new ShowPreloaderHandlerV2());
        aVar.mo91891a("device.notification.hidePreloader", new HidePreloaderHandlerV2());
        aVar.mo91891a("device.notification.prompt", new PromptHandlerV2());
        aVar.mo91891a("device.notification.toast", new ToastHandlerV2());
        aVar.mo91891a("device.notification.actionSheet", new ActionSheetHandlerV2());
        aVar.mo91891a("device.notification.vibrate", new VibrateHandlerV2());
        aVar.mo91891a("biz.util.copyText", new CopyTextHandlerV2());
        aVar.mo91891a("biz.util.getClipboardInfo", new GetClipboardInfoHandlerV2());
        aVar.mo91891a("biz.util.datePicker", new DatePickerHandlerV2());
        aVar.mo91891a("biz.util.timePicker", new TimePickerHandlerV2());
        aVar.mo91891a("biz.util.savePageSnapshot", new SavePageSnapshotHandlerV2());
        aVar.mo91891a("biz.util.sharePageSnapshot", new SharePageSnapshotHandlerV2());
        aVar.mo91891a("biz.reporter.sendEvent", new SendEventHandlerV2());
        aVar.mo91891a("device.connection.getNetworkType", new NetworkTypeHandlerV2());
        aVar.mo91891a("device.base.getInterface", new ConnWifiInfoHandlerV2());
        aVar.mo91891a("device.base.getWifiStatus", new WifiStatusHandlerV2());
        aVar.mo91891a("device.base.getWifiList", new GetWifiListHandlerV2());
        aVar.mo91891a("device.connection.getGatewayIP", new GetGatewayIpHandlerV2());
        aVar.mo91891a("device.base.getDeviceInfo", new GetDeviceInfoHandlerV2());
        aVar.mo91891a("device.connection.getBluetoothDeviceState", new BluetoothDeviceStateHandlerV2());
        aVar.mo91891a("device.connection.scanBluetoothDevice", new ScanBluetoothHandlerV2());
        aVar.mo91891a("device.connection.connectBluetoothDevice", new ConnectBluetoothDeviceHandlerV2());
        aVar.mo91891a("device.connection.getConnectedWifi", new GetConnectedWifiHandlerV2());
        aVar.mo91891a("device.base.onUserCaptureScreen", new OnUserCaptureScreenHandlerV2());
        aVar.mo91891a("device.base.offUserCaptureScreen", new OffUserCaptureScreenHandlerV2());
        aVar.mo91891a("device.screen.lockViewOrientation", new LockViewOrientationHandlerV2());
        aVar.mo91891a("device.screen.unlockViewOrientation", new UnlockViewOrientationHandlerV2());
        aVar.mo91891a("device.ttwebview", new TTWebViewStatusHandler());
        aVar.mo91891a("device.ttwebview.switch", new TTWebViewSwitchHandler());
        return aVar;
    }
}
