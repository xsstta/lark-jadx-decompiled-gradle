package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class DeviceInfo implements Serializable {
    private String deviceModel;
    private String deviceName;
    private String deviceOs;

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceOs() {
        return this.deviceOs;
    }

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.entity.DeviceInfo$a */
    public static class C49363a {

        /* renamed from: a */
        public String f123886a;

        /* renamed from: b */
        public String f123887b;

        /* renamed from: c */
        public String f123888c;

        /* renamed from: a */
        public DeviceInfo mo172255a() {
            return new DeviceInfo(this);
        }

        /* renamed from: a */
        public C49363a mo172254a(String str) {
            this.f123886a = str;
            return this;
        }

        /* renamed from: b */
        public C49363a mo172256b(String str) {
            this.f123887b = str;
            return this;
        }

        /* renamed from: c */
        public C49363a mo172257c(String str) {
            this.f123888c = str;
            return this;
        }
    }

    private DeviceInfo(C49363a aVar) {
        this.deviceName = aVar.f123886a;
        this.deviceOs = aVar.f123887b;
        this.deviceModel = aVar.f123888c;
    }
}
