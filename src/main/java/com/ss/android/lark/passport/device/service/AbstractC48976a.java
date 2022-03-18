package com.ss.android.lark.passport.device.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceSetting;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.NotifySettings;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;

/* renamed from: com.ss.android.lark.passport.device.service.a */
public interface AbstractC48976a {
    void getGeoInfo(String str, IGetDataCallback<IDeviceService.Country> iGetDataCallback);

    void pullDeviceNotifySetting(IGetDataCallback<NotifySettings> iGetDataCallback);

    void pullDeviceOnlineStatus(IGetDataCallback<DevicesStatus> iGetDataCallback);

    void putDeviceNotifySettingInternal(NotifySettings notifySettings, int i, IGetDataCallback<String> iGetDataCallback);

    void putDeviceSetting(String str, String str2, IGetDataCallback<DeviceSetting> iGetDataCallback);

    void setDeviceId(String str);

    NotifySettings syncPullDeviceNotifySetting();
}
