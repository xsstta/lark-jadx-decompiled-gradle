package com.ss.android.lark.passport.signinsdk_api.interfaces;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceSetting;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.NotifySettings;
import java.io.Serializable;

public interface IDeviceService {
    void deleteDevice(String str, IGetDataCallback<Boolean> iGetDataCallback);

    void fetchDevices(IGetDataCallback<Devices> iGetDataCallback);

    DeviceInfo getDeviceInfo();

    IDeviceManager getDeviceManager();

    String getDevicePlatform();

    void getGeoInfo(String str, IGetDataCallback<Country> iGetDataCallback);

    void pullDeviceNotifySetting(IGetDataCallback<NotifySettings> iGetDataCallback);

    void pullDeviceOnlineStatus(IGetDataCallback<DevicesStatus> iGetDataCallback);

    void putDeviceAtNotifySetting(boolean z, IGetDataCallback<String> iGetDataCallback);

    void putDeviceNotifySetting(boolean z, IGetDataCallback<String> iGetDataCallback);

    void putDeviceSetting(String str, String str2, IGetDataCallback<DeviceSetting> iGetDataCallback);

    void setDeviceId(String str);

    NotifySettings syncPullDeviceNotifySetting();

    boolean syncUpdateDevice(String str, String str2, String str3);

    public static class Country implements Serializable {
        private long geocodeNameId;
        private String isoCode;

        public long getGeocodeNameId() {
            return this.geocodeNameId;
        }

        public String getIsoCode() {
            return this.isoCode;
        }

        public void setGeocodeNameId(long j) {
            this.geocodeNameId = j;
        }

        public void setIsoCode(String str) {
            this.isoCode = str;
        }

        public Country(long j, String str) {
            this.geocodeNameId = j;
            this.isoCode = str;
        }
    }
}
