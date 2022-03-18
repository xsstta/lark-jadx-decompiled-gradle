package com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

public class BeaconInfo {
    @JSONField(name = "accuracy")
    public double accuracy;
    @JSONField(name = "major")
    public String major;
    @JSONField(name = "minor")
    public String minor;
    @JSONField(name = "proximity")
    public int proximity;
    @JSONField(name = "rssi")
    public double rssi;
    private int txPower;
    @JSONField(name = "uuid")
    public String uuid;

    public static int buildUint16(byte b, byte b2) {
        return (b << 8) + (b2 & 255);
    }

    private void getProximity() {
        double d = this.accuracy;
        if (d == -1.0d) {
            this.proximity = ProximityEnum.ProximityUnknown.code;
        } else if (d < 1.0d) {
            this.proximity = ProximityEnum.ProximityImmediate.code;
        } else if (d < 10.0d) {
            this.proximity = ProximityEnum.ProximityNear.code;
        } else {
            this.proximity = ProximityEnum.ProximityFar.code;
        }
    }

    public void calculateAccuracy() {
        AppBrandLogger.m52830i("BeaconInfo", "show txPower:" + this.txPower);
        double d = this.rssi;
        if (d == 0.0d) {
            this.accuracy = -1.0d;
        }
        double d2 = (d * 1.0d) / ((double) this.txPower);
        if (d2 < 1.0d) {
            this.accuracy = Math.pow(d2, 10.0d);
        } else {
            this.accuracy = (Math.pow(d2, 7.7095d) * 0.89976d) + 0.111d;
        }
    }

    public String toString() {
        return "BeaconInfo{uuid='" + this.uuid + '\'' + ", major='" + this.major + '\'' + ", minor='" + this.minor + '\'' + ", proximity=" + this.proximity + ", accuracy=" + this.accuracy + ", rssi=" + this.rssi + '}';
    }

    public BeaconInfo(int i) {
        this.rssi = (double) i;
    }

    public BeaconInfo fromScanData(byte[] bArr) {
        if (bArr.length >= 30 && bArr[5] == 76 && bArr[6] == 0 && bArr[7] == 2 && bArr[8] == 21) {
            this.major = String.valueOf(buildUint16(bArr[25], bArr[26]));
            this.txPower = bArr[29];
            this.minor = String.valueOf(buildUint16(bArr[27], bArr[28]));
            try {
                byte[] bArr2 = new byte[16];
                System.arraycopy(bArr, 9, bArr2, 0, 16);
                String a = C24768a.m89859a(bArr2);
                this.uuid = (a.substring(0, 8) + "-" + a.substring(8, 12) + "-" + a.substring(12, 16) + "-" + a.substring(16, 20) + "-" + a.substring(20, 32)).toUpperCase();
                calculateAccuracy();
                getProximity();
                return this;
            } catch (Exception e) {
                AppBrandLogger.m52829e("BeaconInfo", "parse beacon fail" + e.getMessage());
            }
        }
        return null;
    }

    public enum ProximityEnum {
        ProximityUnknown(0),
        ProximityImmediate(1),
        ProximityNear(2),
        ProximityFar(3);
        
        public int code;

        private ProximityEnum(int i) {
            this.code = i;
        }
    }
}
