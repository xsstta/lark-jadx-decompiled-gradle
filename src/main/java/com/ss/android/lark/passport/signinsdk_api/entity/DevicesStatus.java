package com.ss.android.lark.passport.signinsdk_api.entity;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DevicesStatus implements Serializable {
    private List<DeviceStatus> devices;

    public static class DeviceStatus implements Serializable {
        private String deviceId;
        private OnLineStatus onlineStatus;
        private TerminalType terminalType;

        public enum OnLineStatus {
            UNKNOWN_ONLINE_STATUS(0),
            ONLINE(1),
            OFFLINE(2);
            
            int value;

            public int getValue() {
                return this.value;
            }

            public void setValue(int i) {
                this.value = i;
            }

            public static OnLineStatus valueOf(int i) {
                if (i == 0) {
                    return UNKNOWN_ONLINE_STATUS;
                }
                if (i == 1) {
                    return ONLINE;
                }
                if (i != 2) {
                    return UNKNOWN_ONLINE_STATUS;
                }
                return OFFLINE;
            }

            private OnLineStatus(int i) {
                this.value = i;
            }
        }

        public enum TerminalType {
            UNKNOWN_TERMINAL_TYPE(0),
            PC(1),
            WEB(2),
            ANDROID(3),
            IOS(4);
            
            int value;

            public int getValue() {
                return this.value;
            }

            public void setValue(int i) {
                this.value = i;
            }

            public static TerminalType valueOf(int i) {
                if (i == 0) {
                    return UNKNOWN_TERMINAL_TYPE;
                }
                if (i == 1) {
                    return PC;
                }
                if (i == 2) {
                    return WEB;
                }
                if (i == 3) {
                    return ANDROID;
                }
                if (i != 4) {
                    return UNKNOWN_TERMINAL_TYPE;
                }
                return IOS;
            }

            private TerminalType(int i) {
                this.value = i;
            }
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public OnLineStatus getOnlineStatus() {
            return this.onlineStatus;
        }

        public TerminalType getTerminalType() {
            return this.terminalType;
        }

        public void setDeviceId(String str) {
            this.deviceId = str;
        }

        public void setOnlineStatus(OnLineStatus onLineStatus) {
            this.onlineStatus = onLineStatus;
        }

        public void setTerminalType(TerminalType terminalType2) {
            this.terminalType = terminalType2;
        }
    }

    public List<DeviceStatus> getDevices() {
        return this.devices;
    }

    public int getDeviceCount() {
        List<DeviceStatus> list = this.devices;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setDevices(List<DeviceStatus> list) {
        this.devices = list;
    }

    public void add(DeviceStatus deviceStatus) {
        if (deviceStatus != null && !TextUtils.isEmpty(deviceStatus.getDeviceId())) {
            if (this.devices == null) {
                this.devices = new ArrayList();
            }
            this.devices.add(deviceStatus);
        }
    }

    public boolean contains(DeviceStatus deviceStatus) {
        List<DeviceStatus> list;
        if (!(deviceStatus == null || (list = this.devices) == null)) {
            for (DeviceStatus deviceStatus2 : list) {
                if (deviceStatus2 != null && equal(deviceStatus2.getDeviceId(), deviceStatus.getDeviceId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void remove(DeviceStatus deviceStatus) {
        List<DeviceStatus> list;
        if (!(deviceStatus == null || (list = this.devices) == null)) {
            for (DeviceStatus deviceStatus2 : list) {
                if (deviceStatus2 != null && equal(deviceStatus2.getDeviceId(), deviceStatus.getDeviceId())) {
                    this.devices.remove(deviceStatus2);
                    return;
                }
            }
        }
    }

    public void update(DeviceStatus deviceStatus) {
        if (deviceStatus != null) {
            List<DeviceStatus> list = this.devices;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.devices = arrayList;
                arrayList.add(deviceStatus);
                return;
            }
            for (DeviceStatus deviceStatus2 : list) {
                if (deviceStatus2 != null && equal(deviceStatus2.getDeviceId(), deviceStatus.getDeviceId())) {
                    deviceStatus2.setOnlineStatus(deviceStatus.getOnlineStatus());
                    return;
                }
            }
            this.devices.add(deviceStatus);
        }
    }

    private boolean equal(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.equals(str2);
    }
}
