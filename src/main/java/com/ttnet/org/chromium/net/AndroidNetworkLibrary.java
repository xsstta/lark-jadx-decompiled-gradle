package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ttnet.org.chromium.base.ApiCompatibilityUtils;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.compat.ApiHelperForM;
import com.ttnet.org.chromium.base.compat.ApiHelperForP;
import com.ttnet.org.chromium.base.metrics.RecordHistogram;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.lancet.base.annotations.Skip;

class AndroidNetworkLibrary {
    private static final Set<String> sAutoDohDotServers;
    private static final Set<InetAddress> sAutoDohServers;
    private static Boolean sHaveAccessNetworkState;
    private static Boolean sHaveAccessWifiState;
    public static AtomicBoolean sIsRequestingCellular = new AtomicBoolean(false);

    public static String getWifiSSID() {
        return "";
    }

    public static native void nativeOnCellularAlwaysUp(boolean z);

    public static class NetworkSecurityPolicyProxy {
        private static NetworkSecurityPolicyProxy sInstance = new NetworkSecurityPolicyProxy();

        public static NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public boolean isCleartextTrafficPermitted() {
            if (Build.VERSION.SDK_INT < 23) {
                return true;
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }

        public static void setInstanceForTesting(NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            sInstance = networkSecurityPolicyProxy;
        }

        public boolean isCleartextTrafficPermitted(String str) {
            if (Build.VERSION.SDK_INT < 24) {
                return isCleartextTrafficPermitted();
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
    }

    private static class SetFileDescriptor {
        private static final Method sFileDescriptorSetInt;

        private SetFileDescriptor() {
        }

        static {
            try {
                sFileDescriptorSetInt = FileDescriptor.class.getMethod("setInt$", Integer.TYPE);
            } catch (NoSuchMethodException | SecurityException e) {
                throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
            }
        }

        public static FileDescriptor createWithFd(int i) {
            try {
                FileDescriptor fileDescriptor = new FileDescriptor();
                sFileDescriptorSetInt.invoke(fileDescriptor, Integer.valueOf(i));
                return fileDescriptor;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e2);
            }
        }
    }

    AndroidNetworkLibrary() {
    }

    public static void clearTestRootCertificates() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        X509Util.clearTestRootCertificates();
    }

    private static class SocketFd extends Socket {

        private static class SocketImplFd extends SocketImpl {
            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void close() {
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void create(boolean z) {
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public int available() {
                throw new RuntimeException("accept not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public InputStream getInputStream() {
                throw new RuntimeException("getInputStream not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public OutputStream getOutputStream() {
                throw new RuntimeException("getOutputStream not implemented");
            }

            SocketImplFd(FileDescriptor fileDescriptor) {
                this.fd = fileDescriptor;
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void accept(SocketImpl socketImpl) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketOptions
            public Object getOption(int i) {
                throw new RuntimeException("getOption not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void listen(int i) {
                throw new RuntimeException("listen not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void sendUrgentData(int i) {
                throw new RuntimeException("sendUrgentData not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void bind(InetAddress inetAddress, int i) {
                throw new RuntimeException("accept not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void connect(String str, int i) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketOptions
            public void setOption(int i, Object obj) {
                throw new RuntimeException("setOption not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void connect(InetAddress inetAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public void connect(SocketAddress socketAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }
        }

        SocketFd(FileDescriptor fileDescriptor) throws IOException {
            super(new SocketImplFd(fileDescriptor));
        }
    }

    private static boolean checkIsVpnOn() {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < 21 || (connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        for (int i = 0; i < allNetworks.length; i++) {
            if (connectivityManager.getNetworkInfo(allNetworks[i]).isConnected() && connectivityManager.getNetworkCapabilities(allNetworks[i]).hasTransport(4)) {
                return true;
            }
        }
        return false;
    }

    private static boolean getIsCaptivePortal() {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT < 23 || (connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")) == null || (activeNetwork = ApiHelperForM.getActiveNetwork(connectivityManager)) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    public static int[] getRouteInfo() {
        DhcpInfo dhcpInfo;
        try {
            WifiManager wifiManager = (WifiManager) ContextUtils.getApplicationContext().getSystemService("wifi");
            if (!(wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null)) {
                return new int[]{dhcpInfo.ipAddress, dhcpInfo.netmask};
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return new int[0];
    }

    private static boolean haveAccessNetworkState() {
        boolean z;
        if (sHaveAccessNetworkState == null) {
            if (ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                z = true;
            } else {
                z = false;
            }
            sHaveAccessNetworkState = Boolean.valueOf(z);
        }
        return sHaveAccessNetworkState.booleanValue();
    }

    private static boolean haveAccessWifiState() {
        boolean z;
        if (sHaveAccessWifiState == null) {
            if (ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                z = true;
            } else {
                z = false;
            }
            sHaveAccessWifiState = Boolean.valueOf(z);
        }
        return sHaveAccessWifiState.booleanValue();
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: " + e);
            return false;
        }
    }

    private static boolean alwayUpCellular() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (sIsRequestingCellular.compareAndSet(false, true)) {
            final ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                sIsRequestingCellular.set(false);
                return false;
            }
            try {
                connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new ConnectivityManager.NetworkCallback() {
                    /* class com.ttnet.org.chromium.net.AndroidNetworkLibrary.C680031 */

                    public void onAvailable(Network network) {
                        AndroidNetworkLibrary.sIsRequestingCellular.set(false);
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities == null || !networkCapabilities.hasTransport(0) || !networkCapabilities.hasCapability(12)) {
                            AndroidNetworkLibrary.nativeOnCellularAlwaysUp(false);
                        } else {
                            AndroidNetworkLibrary.nativeOnCellularAlwaysUp(true);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                sIsRequestingCellular.set(false);
                return false;
            }
        }
        return true;
    }

    static {
        HashSet hashSet = new HashSet();
        sAutoDohServers = hashSet;
        HashSet hashSet2 = new HashSet();
        sAutoDohDotServers = hashSet2;
        try {
            hashSet.add(InetAddress.getByName("8.8.8.8"));
            hashSet.add(InetAddress.getByName("8.8.4.4"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8888"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8844"));
            hashSet.add(InetAddress.getByName("1.1.1.1"));
            hashSet.add(InetAddress.getByName("1.0.0.1"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1111"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1001"));
            hashSet.add(InetAddress.getByName("9.9.9.9"));
            hashSet.add(InetAddress.getByName("149.112.112.112"));
            hashSet.add(InetAddress.getByName("2620:fe::fe"));
            hashSet.add(InetAddress.getByName("2620:fe::9"));
            hashSet2.add("dns.google");
            hashSet2.add("1dot1dot1dot1.cloudflare-dns.com");
            hashSet2.add("cloudflare-dns.com");
            hashSet2.add("dns.quad9.net");
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to parse IP addresses", e);
        }
    }

    private static byte[][] getDnsServers() {
        boolean z;
        int i;
        boolean z2;
        if (!haveAccessNetworkState()) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        Network activeNetwork = ApiHelperForM.getActiveNetwork(connectivityManager);
        if (activeNetwork == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        Iterator<InetAddress> it = dnsServers.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (sAutoDohServers.contains(it.next())) {
                z2 = true;
                break;
            }
        }
        if (isPrivateDnsActive(linkProperties)) {
            String privateDnsServerName = getPrivateDnsServerName(linkProperties);
            if (privateDnsServerName != null) {
                z2 = sAutoDohDotServers.contains(privateDnsServerName.toLowerCase(Locale.US));
            }
            if (privateDnsServerName == null) {
                z = false;
            }
            RecordHistogram.recordBooleanHistogram("Net.DNS.Android.DotExplicit", z);
            RecordHistogram.recordBooleanHistogram("Net.DNS.Android.AutoDohPrivate", z2);
            return (byte[][]) Array.newInstance(byte.class, 1, 1);
        }
        RecordHistogram.recordBooleanHistogram("Net.DNS.Android.AutoDohPublic", z2);
        byte[][] bArr = new byte[dnsServers.size()][];
        for (i = 0; i < dnsServers.size(); i++) {
            bArr[i] = dnsServers.get(i).getAddress();
        }
        return bArr;
    }

    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        X509Util.addTestRootCertificate(bArr);
    }

    private static String getPrivateDnsServerName(LinkProperties linkProperties) {
        if (Build.VERSION.SDK_INT < 28 || linkProperties == null) {
            return null;
        }
        return ApiHelperForP.getPrivateDnsServerName(linkProperties);
    }

    static boolean isPrivateDnsActive(LinkProperties linkProperties) {
        if (Build.VERSION.SDK_INT < 28 || linkProperties == null) {
            return false;
        }
        return ApiHelperForP.isPrivateDnsActive(linkProperties);
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    public static int getWifiSignalLevel(int i) {
        int i2;
        int calculateSignalLevel;
        try {
            if (ContextUtils.getApplicationContext() == null || ContextUtils.getApplicationContext().getContentResolver() == null) {
                return -1;
            }
            if (haveAccessWifiState()) {
                Log.w("AndroidNetworkLibrary", "lz, getConnectionInfo calles");
                WifiInfo connectionInfo = ((WifiManager) ContextUtils.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo == null) {
                    return -1;
                }
                i2 = connectionInfo.getRssi();
            } else {
                try {
                    Intent INVOKEVIRTUAL_com_ttnet_org_chromium_net_AndroidNetworkLibrary_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_ttnet_org_chromium_net_AndroidNetworkLibrary_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(ContextUtils.getApplicationContext(), null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                    if (INVOKEVIRTUAL_com_ttnet_org_chromium_net_AndroidNetworkLibrary_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver == null) {
                        return -1;
                    }
                    i2 = INVOKEVIRTUAL_com_ttnet_org_chromium_net_AndroidNetworkLibrary_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("newRssi", Integer.MIN_VALUE);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (i2 != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(i2, i)) >= 0 && calculateSignalLevel < i) {
                return calculateSignalLevel;
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ttnet_org_chromium_net_AndroidNetworkLibrary_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    private static void tagSocket(int i, int i2, int i3) throws IOException {
        FileDescriptor fileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            ThreadStatsUid.set(i2);
        }
        if (Build.VERSION.SDK_INT < 23) {
            parcelFileDescriptor = null;
            fileDescriptor = SetFileDescriptor.createWithFd(i);
        } else {
            parcelFileDescriptor = ParcelFileDescriptor.adoptFd(i);
            fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        }
        SocketFd socketFd = new SocketFd(fileDescriptor);
        TrafficStats.tagSocket(socketFd);
        socketFd.close();
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            ThreadStatsUid.clear();
        }
    }
}
