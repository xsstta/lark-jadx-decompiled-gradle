package com.ss.ttm.net;

import android.util.Log;
import com.ss.ttm.player.AVThreadPool;
import java.net.InetAddress;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class AVResolver {
    public static int HOST_MAX_CACHE_TIME = 600000;
    private static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public String mError;
    private HostInfo mHostInfo;
    private String mHostName;
    public String[] mIPStr;
    public boolean mRet;
    private Thread mThread;

    /* access modifiers changed from: package-private */
    public static class HostInfo {
        public String ip;
        public long time;

        HostInfo() {
        }
    }

    public void freeAddress() {
        Thread thread = this.mThread;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int isSuccess() {
        if (!this.mRet) {
            return 0;
        }
        String[] strArr = this.mIPStr;
        if (strArr == null || strArr[0] == null) {
            return -1;
        }
        return 1;
    }

    public String getAddress() {
        String[] strArr;
        if (this.mRet && (strArr = this.mIPStr) != null && strArr[0] != null) {
            return strArr[0];
        }
        return "parser host name: " + this.mHostName + " error.err msg:" + this.mError;
    }

    static class ParserHost implements Runnable {
        String mHostName;
        AVResolver mResolver;

        public void run() {
            InetAddress inetAddress;
            Throwable th;
            Log.i("ttmj", "start ParserHost task");
            String str = null;
            try {
                inetAddress = InetAddress.getByName(this.mHostName);
                try {
                    str = inetAddress.getHostAddress();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inetAddress = null;
                th.printStackTrace();
                this.mResolver.mError = th.getMessage();
                this.mResolver.mRet = true;
                if (inetAddress != null) {
                    return;
                }
            }
            this.mResolver.mRet = true;
            if (inetAddress != null && str != null) {
                this.mResolver.mIPStr = new String[1];
                this.mResolver.mIPStr[0] = str;
                HostInfo hostInfo = new HostInfo();
                hostInfo.time = System.currentTimeMillis();
                hostInfo.ip = str;
                AVResolver.putHostInfo(this.mHostName, hostInfo);
                hostInfo.time = System.currentTimeMillis();
            }
        }

        public ParserHost(AVResolver aVResolver, String str) {
            this.mResolver = aVResolver;
            this.mHostName = str;
        }
    }

    public static final boolean isIP(String str) {
        if (str.length() >= 7 && str.length() <= 15) {
            return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
        }
        if (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
            return true;
        }
        return false;
    }

    public void getAddressInfo(String str) {
        this.mHostName = str;
        if (str == null || str.length() < 1 || "".equals(str)) {
            this.mRet = true;
        } else if (isIP(this.mHostName)) {
            String[] strArr = new String[1];
            this.mIPStr = strArr;
            strArr[0] = this.mHostName;
            this.mRet = true;
        } else {
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            HostInfo hostInfo = hashtable.get(str);
            this.mHostInfo = hostInfo;
            if (hostInfo != null) {
                if (hostInfo.ip == null || System.currentTimeMillis() - this.mHostInfo.time >= ((long) HOST_MAX_CACHE_TIME)) {
                    hashtable.remove(str);
                    this.mHostInfo = null;
                } else {
                    String[] strArr2 = new String[1];
                    this.mIPStr = strArr2;
                    strArr2[0] = this.mHostInfo.ip;
                    this.mRet = true;
                    return;
                }
            }
            try {
                AVThreadPool.addTask(new ParserHost(this, this.mHostName));
            } catch (Exception e) {
                this.mRet = true;
                this.mError = e.getMessage();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: com.ss.ttm.net.AVResolver$HostInfo */
    /* JADX WARN: Multi-variable type inference failed */
    static synchronized void putHostInfo(String str, HostInfo hostInfo) {
        String str2;
        synchronized (AVResolver.class) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Hashtable<String, HostInfo> hashtable = mCacheHosts;
                String str3 = null;
                if (hashtable.size() > 128) {
                    Iterator<Map.Entry<String, HostInfo>> it = hashtable.entrySet().iterator();
                    String str4 = null;
                    while (it.hasNext()) {
                        HostInfo value = it.next().getValue();
                        str3 = it.next().getKey();
                        if (value != 0 && value.time < currentTimeMillis) {
                            currentTimeMillis = value.time;
                            str4 = value;
                        }
                    }
                    str2 = str3;
                    str3 = str4;
                } else {
                    str2 = null;
                }
                if (!(str3 == null || str2 == null)) {
                    mCacheHosts.remove(str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            mCacheHosts.put(str, hostInfo);
        }
    }
}
