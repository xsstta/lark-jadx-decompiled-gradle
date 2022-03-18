package com.ss.android.lark.passport.signinsdk_api.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

public class Devices implements Serializable {
    @JSONField(name = "device")
    private List<Device> sessions;

    public static final class DeleteDevice implements Serializable {
        private boolean success;

        public boolean isSuccess() {
            return this.success;
        }

        public void setSuccess(boolean z) {
            this.success = z;
        }
    }

    public static final class Device implements Serializable {
        @JSONField(name = "device_id")
        private String deviceId;
        @JSONField(name = "device_model")
        private String deviceModel;
        @JSONField(name = "device_name")
        private String deviceName;
        @JSONField(name = "device_os")
        private String deviceOs;
        @JSONField(name = "is_current")
        private boolean isCurrentDevice;
        @JSONField(name = "is_online")
        private boolean isOnline;
        @JSONField(name = "login_time")
        private long loginTime;
        @JSONField(name = "tenant_name")
        public String tenantName;
        @JSONField(name = "terminal_type")
        private int terminalType;

        public String getDeviceId() {
            return this.deviceId;
        }

        public String getDeviceModel() {
            return this.deviceModel;
        }

        public String getDeviceName() {
            return this.deviceName;
        }

        public String getDeviceOs() {
            return this.deviceOs;
        }

        public boolean getIsCurrentDevice() {
            return this.isCurrentDevice;
        }

        public boolean getIsOnline() {
            return this.isOnline;
        }

        public long getLoginTime() {
            return this.loginTime;
        }

        public int getTerminalType() {
            return this.terminalType;
        }

        public void setDeviceId(String str) {
            this.deviceId = str;
        }

        public void setDeviceModel(String str) {
            this.deviceModel = str;
        }

        public void setDeviceName(String str) {
            this.deviceName = str;
        }

        public void setDeviceOs(String str) {
            this.deviceOs = str;
        }

        public void setIsCurrentDevice(boolean z) {
            this.isCurrentDevice = z;
        }

        public void setIsOnline(boolean z) {
            this.isOnline = z;
        }

        public void setLoginTime(long j) {
            this.loginTime = j;
        }

        public void setTerminalType(int i) {
            this.terminalType = i;
        }
    }

    public List<Device> getSessions() {
        return this.sessions;
    }

    public void setSessions(List<Device> list) {
        this.sessions = list;
    }
}
