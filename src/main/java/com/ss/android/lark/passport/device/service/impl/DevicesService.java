package com.ss.android.lark.passport.device.service.impl;

import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.device.service.AbstractC48976a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceSetting;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.NotifySettings;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;

@ClaymoreImpl(IDeviceService.class)
public class DevicesService implements IDeviceService {
    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public IDeviceManager getDeviceManager() {
        return C48987c.m192916a();
    }

    public void registerPush() {
        C48981b.m192898a().mo171014b();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public String getDevicePlatform() {
        return C48987c.m192916a().mo171042j();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public NotifySettings syncPullDeviceNotifySetting() {
        AbstractC48976a aVar = (AbstractC48976a) ServiceFinder.m193746a(AbstractC48976a.class);
        if (aVar != null) {
            return aVar.syncPullDeviceNotifySetting();
        }
        Log.m165383e("DevicesService", "no IDeviceRustCmdService impl found!");
        return null;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public DeviceInfo getDeviceInfo() {
        String l = RomUtils.m94957l();
        String m = RomUtils.m94958m();
        return new DeviceInfo.C49363a().mo172254a(l).mo172256b(m).mo172257c(RomUtils.m94959n()).mo172255a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void fetchDevices(IGetDataCallback<Devices> iGetDataCallback) {
        DeviceApi.m192886a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void pullDeviceNotifySetting(IGetDataCallback<NotifySettings> iGetDataCallback) {
        AbstractC48976a aVar = (AbstractC48976a) ServiceFinder.m193746a(AbstractC48976a.class);
        if (aVar == null) {
            Log.m165383e("DevicesService", "no IDeviceRustCmdService impl found!");
        } else {
            aVar.pullDeviceNotifySetting(iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void pullDeviceOnlineStatus(IGetDataCallback<DevicesStatus> iGetDataCallback) {
        AbstractC48976a aVar = (AbstractC48976a) ServiceFinder.m193746a(AbstractC48976a.class);
        if (aVar == null) {
            Log.m165383e("DevicesService", "no IDeviceRustCmdService impl found!");
        } else {
            aVar.pullDeviceOnlineStatus(iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void setDeviceId(String str) {
        AbstractC48976a aVar = (AbstractC48976a) ServiceFinder.m193746a(AbstractC48976a.class);
        if (aVar == null) {
            Log.m165383e("DevicesService", "no IDeviceRustCmdService impl found!");
        } else {
            aVar.setDeviceId(str);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void deleteDevice(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            DeviceApi.m192887a(str, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void putDeviceAtNotifySetting(boolean z, IGetDataCallback<String> iGetDataCallback) {
        NotifySettings notifySettings = new NotifySettings();
        notifySettings.setStillNotifyAt(z);
        putDeviceNotifySettingInternal(notifySettings, 2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void putDeviceNotifySetting(boolean z, IGetDataCallback<String> iGetDataCallback) {
        NotifySettings notifySettings = new NotifySettings();
        notifySettings.setDisableMobileNotify(z);
        putDeviceNotifySettingInternal(notifySettings, 1, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void getGeoInfo(String str, IGetDataCallback<IDeviceService.Country> iGetDataCallback) {
        AbstractC48976a aVar = (AbstractC48976a) ServiceFinder.m193746a(AbstractC48976a.class);
        if (aVar == null) {
            Log.m165383e("DevicesService", "no IDeviceRustCmdService impl found!");
        } else {
            aVar.getGeoInfo(str, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public boolean syncUpdateDevice(String str, String str2, String str3) {
        updateDevice(str, str2, str3, null);
        return true;
    }

    private void putDeviceNotifySettingInternal(NotifySettings notifySettings, int i, IGetDataCallback<String> iGetDataCallback) {
        if (notifySettings != null) {
            AbstractC48976a aVar = (AbstractC48976a) ServiceFinder.m193746a(AbstractC48976a.class);
            if (aVar == null) {
                Log.m165383e("DevicesService", "no IDeviceRustCmdService impl found!");
            } else {
                aVar.putDeviceNotifySettingInternal(notifySettings, i, iGetDataCallback);
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService
    public void putDeviceSetting(String str, final String str2, final IGetDataCallback<DeviceSetting> iGetDataCallback) {
        if (ServiceFinder.m193748c().isLogin()) {
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("DevicesService", "Set DeviceSetting failed: device id is empty");
                return;
            }
            AbstractC48976a aVar = (AbstractC48976a) ServiceFinder.m193746a(AbstractC48976a.class);
            if (aVar == null) {
                Log.m165383e("DevicesService", "no IDeviceRustCmdService impl found!");
            } else {
                aVar.putDeviceSetting(str, str2, new IGetDataCallback<DeviceSetting>() {
                    /* class com.ss.android.lark.passport.device.service.impl.DevicesService.C489771 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(DeviceSetting deviceSetting) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(deviceSetting);
                        }
                        ServiceFinder.m193752g().loadSystemMessageTemplates(str2, false);
                    }
                });
            }
        }
    }

    public void updateDevice(String str, String str2, String str3, IGetDataCallback<Object> iGetDataCallback) {
        DeviceApi.m192888a(str, str3, str2, "", "", iGetDataCallback);
    }
}
