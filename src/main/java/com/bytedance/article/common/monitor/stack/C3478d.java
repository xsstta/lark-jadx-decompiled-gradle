package com.bytedance.article.common.monitor.stack;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.article.common.monitor.stack.d */
public class C3478d {
    /* renamed from: a */
    public static boolean m14714a(Throwable th) {
        if (th == null) {
            return false;
        }
        try {
            if (!(th instanceof ConnectTimeoutException) && !(th instanceof SocketTimeoutException) && !(th instanceof BindException) && !(th instanceof ConnectException) && !(th instanceof NoRouteToHostException) && !(th instanceof PortUnreachableException) && !(th instanceof SocketException) && !(th instanceof UnknownHostException) && !(th instanceof NoRouteToHostException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof ConnectTimeoutException) && !(th instanceof SSLHandshakeException)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
