package com.ss.android.vc.entity;

import java.io.Serializable;

public final class RTCProxy implements Serializable {
    public String passport;
    public String proxy_ip;
    public long proxy_port;
    public ProxyType proxy_type;
    public boolean status;
    public String user_name;

    public enum ProxyType implements Serializable {
        NONE(0),
        HTTPS(1),
        SOCKS5(2),
        HTTP(3),
        UNKNOWN(4);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static ProxyType fromValue(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return HTTPS;
            }
            if (i == 2) {
                return SOCKS5;
            }
            if (i == 3) {
                return HTTP;
            }
            if (i != 4) {
                return null;
            }
            return UNKNOWN;
        }

        private ProxyType(int i) {
            this.value = i;
        }
    }

    public RTCProxy() {
    }

    public RTCProxy(boolean z, ProxyType proxyType, String str, long j, String str2, String str3) {
        this.status = z;
        this.proxy_type = proxyType;
        this.proxy_ip = str;
        this.proxy_port = j;
        this.user_name = str2;
        this.passport = str3;
    }
}
