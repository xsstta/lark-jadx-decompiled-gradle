package com.ss.ttvideoengine.net;

import android.os.SystemClock;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSServerIP {
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static void updateDNSServerIP() {
        if (SystemClock.elapsedRealtime() - mServerIPTime >= 300000) {
            EngineThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.ttvideoengine.net.DNSServerIP.RunnableC654681 */

                public void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            DNSServerIP.mServerIP = byName.getHostAddress();
                            DNSServerIP.mServerIPTime = SystemClock.elapsedRealtime();
                            TTVideoEngineLog.m256505i("DNSServerIP", "update dns server ip:" + DNSServerIP.mServerIP);
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }
}
