package com.bytedance.ee.bear.contract.net;

import java.io.IOException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.StreamResetException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.ee.bear.contract.net.c */
public class C5202c {
    /* renamed from: a */
    public static int m21233a(Throwable th) {
        if (th == null) {
            return 0;
        }
        if (th instanceof SocketTimeoutException) {
            return -2;
        }
        if (th instanceof ConnectTimeoutException) {
            return -4;
        }
        if (th instanceof UnknownHostException) {
            return -5;
        }
        if (th instanceof SSLHandshakeException) {
            if (th.toString().contains("Connection closed by peer")) {
                return -14;
            }
            if (th.toString().contains("CertPathValidatorException")) {
                return -7;
            }
            return -6;
        } else if (th instanceof SocketException) {
            if (th instanceof NoRouteToHostException) {
                return -13;
            }
            if (th.toString().contains("Socket closed")) {
                return -8;
            }
            if (th.toString().contains("Network is unreachable")) {
                return -15;
            }
            return -9;
        } else if (th instanceof SSLPeerUnverifiedException) {
            return -10;
        } else {
            if (th instanceof StreamResetException) {
                return -16;
            }
            if (!(th instanceof IOException)) {
                return -3;
            }
            if (th.toString().contains("Canceled")) {
                return -11;
            }
            if (th.toString().contains("unexpected end of stream on null")) {
                return -17;
            }
            return -3;
        }
    }
}
