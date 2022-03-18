package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.android.HwBuildEx;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.BuildConfig;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.compat.ApiHelperForM;
import java.util.Arrays;
import me.ele.lancet.base.annotations.Skip;

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    public ConnectivityManagerDelegate mConnectivityManagerDelegate = new ConnectivityManagerDelegate(ContextUtils.getApplicationContext());
    private DefaultNetworkCallback mDefaultNetworkCallback;
    private final Handler mHandler;
    public boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private MyNetworkCallback mNetworkCallback;
    private NetworkRequest mNetworkRequest;
    private NetworkState mNetworkState;
    public final Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    public boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private WifiManagerDelegate mWifiManagerDelegate;

    public interface Observer {
        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    public static int convertToConnectionType(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (!(i == 4 || i == 5)) {
                if (i == 6) {
                    return 5;
                }
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public static class ConnectivityManagerDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final ConnectivityManager mConnectivityManager;

        ConnectivityManagerDelegate() {
        }

        /* access modifiers changed from: protected */
        public Network[] getAllNetworksUnfiltered() {
            Network[] networkArr;
            try {
                networkArr = this.mConnectivityManager.getAllNetworks();
            } catch (Throwable unused) {
                networkArr = null;
            }
            if (networkArr == null) {
                return new Network[0];
            }
            return networkArr;
        }

        /* access modifiers changed from: package-private */
        public Network getDefaultNetwork() {
            Network network;
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    network = ApiHelperForM.getActiveNetwork(this.mConnectivityManager);
                } catch (Throwable unused) {
                    network = null;
                }
                if (network != null) {
                    return network;
                }
            } else {
                network = null;
            }
            try {
                NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return null;
                }
                Network[] allNetworksFiltered = NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null);
                for (Network network2 : allNetworksFiltered) {
                    NetworkInfo networkInfo = getNetworkInfo(network2);
                    if (networkInfo != null && (networkInfo.getType() == activeNetworkInfo.getType() || networkInfo.getType() == 17)) {
                        network = network2;
                    }
                }
                return network;
            } catch (Throwable unused2) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            try {
                this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
            } catch (Throwable unused) {
            }
        }

        ConnectivityManagerDelegate(Context context) {
            this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.net.Network */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: android.net.Network */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [android.net.NetworkInfo] */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            return r1.mConnectivityManager.getNetworkInfo(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            return null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.net.NetworkInfo getNetworkInfo(android.net.Network r2) {
            /*
                r1 = this;
                android.net.ConnectivityManager r0 = r1.mConnectivityManager     // Catch:{ all -> 0x0007 }
                android.net.NetworkInfo r2 = r0.getNetworkInfo(r2)     // Catch:{ all -> 0x0007 }
                return r2
            L_0x0007:
                android.net.ConnectivityManager r0 = r1.mConnectivityManager     // Catch:{ all -> 0x000e }
                android.net.NetworkInfo r2 = r0.getNetworkInfo(r2)     // Catch:{ all -> 0x000e }
                return r2
            L_0x000e:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate.getNetworkInfo(android.net.Network):android.net.NetworkInfo");
        }

        /* access modifiers changed from: protected */
        public NetworkCapabilities getNetworkCapabilities(Network network) {
            try {
                return this.mConnectivityManager.getNetworkCapabilities(network);
            } catch (Throwable unused) {
                return null;
            }
        }

        private NetworkInfo processActiveNetworkInfo(NetworkInfo networkInfo) {
            if (networkInfo == null) {
                return null;
            }
            if (networkInfo.isConnected()) {
                return networkInfo;
            }
            if (Build.VERSION.SDK_INT >= 21 && networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1) {
                return networkInfo;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int getConnectionType(Network network) {
            NetworkInfo networkInfo = getNetworkInfo(network);
            if (networkInfo != null && networkInfo.getType() == 17) {
                try {
                    networkInfo = this.mConnectivityManager.getActiveNetworkInfo();
                } catch (Throwable unused) {
                    networkInfo = null;
                }
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.convertToConnectionType(networkInfo.getType(), networkInfo.getSubtype());
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            if (r1 != null) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
            r4.addSuppressed(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean vpnAccessible(android.net.Network r4) {
            /*
                r3 = this;
                java.net.Socket r0 = new java.net.Socket
                r0.<init>()
                com.ttnet.org.chromium.base.StrictModeContext r1 = com.ttnet.org.chromium.base.StrictModeContext.allowAllVmPolicies()     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
                r4.bindSocket(r0)     // Catch:{ all -> 0x0016 }
                if (r1 == 0) goto L_0x0011
                r1.close()
            L_0x0011:
                r0.close()     // Catch:{ IOException -> 0x0014 }
            L_0x0014:
                r4 = 1
                return r4
            L_0x0016:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x0018 }
            L_0x0018:
                r2 = move-exception
                if (r1 == 0) goto L_0x0023
                r1.close()     // Catch:{ all -> 0x001f }
                goto L_0x0023
            L_0x001f:
                r1 = move-exception
                r4.addSuppressed(r1)
            L_0x0023:
                throw r2
            L_0x0024:
                r4 = move-exception
                r0.close()     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                throw r4
            L_0x0029:
                r4 = 0
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate.vpnAccessible(android.net.Network):boolean");
        }

        /* access modifiers changed from: package-private */
        public NetworkState getNetworkState(WifiManagerDelegate wifiManagerDelegate) {
            Network network;
            boolean z;
            NetworkInfo networkInfo;
            NetworkInfo networkInfo2 = null;
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    network = getDefaultNetwork();
                    try {
                        NetworkInfo networkInfo3 = ApiHelperForM.getNetworkInfo(this.mConnectivityManager, network);
                        if (networkInfo3 == null || networkInfo3.getType() != 17) {
                            networkInfo2 = network;
                            networkInfo = networkInfo3;
                        } else {
                            networkInfo = this.mConnectivityManager.getActiveNetworkInfo();
                            networkInfo2 = network;
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    networkInfo = this.mConnectivityManager.getActiveNetworkInfo();
                }
                network = networkInfo2;
                networkInfo2 = networkInfo;
            } catch (Throwable unused2) {
                network = null;
            }
            NetworkInfo processActiveNetworkInfo = processActiveNetworkInfo(networkInfo2);
            if (processActiveNetworkInfo == null) {
                return new NetworkState(false, -1, -1, null, false);
            }
            if (network != null) {
                try {
                    int type = processActiveNetworkInfo.getType();
                    int subtype = processActiveNetworkInfo.getSubtype();
                    String valueOf = String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network));
                    if (Build.VERSION.SDK_INT < 28 || !AndroidNetworkLibrary.isPrivateDnsActive(this.mConnectivityManager.getLinkProperties(network))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return new NetworkState(true, type, subtype, valueOf, z);
                } catch (Throwable unused3) {
                    return new NetworkState(false, -1, -1, null, false);
                }
            } else if (processActiveNetworkInfo.getType() != 1) {
                return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), null, false);
            } else {
                if (processActiveNetworkInfo.getExtraInfo() == null || "".equals(processActiveNetworkInfo.getExtraInfo())) {
                    return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), wifiManagerDelegate.getWifiSsid(), false);
                }
                return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), processActiveNetworkInfo.getExtraInfo(), false);
            }
        }

        /* access modifiers changed from: package-private */
        public void registerDefaultNetworkCallback(ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            try {
                this.mConnectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback, handler);
                } else {
                    this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static class NetworkState {
        private final boolean mConnected;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final int mSubtype;
        private final int mType;

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }

        public int getConnectionType() {
            if (!isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType != 0 && networkType != 4 && networkType != 5) {
                return 0;
            }
            switch (getNetworkSubType()) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case 5:
                    return 10;
                case 6:
                    return 11;
                case 7:
                    return 6;
                case 8:
                    return 14;
                case 9:
                    return 15;
                case 10:
                    return 12;
                case 11:
                    return 4;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return 13;
                case 13:
                    return 18;
                case 14:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        public NetworkState(boolean z, int i, int i2, String str, boolean z2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    /* access modifiers changed from: package-private */
    public boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
    }

    public static abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        /* access modifiers changed from: protected */
        public abstract void destroy();

        /* access modifiers changed from: protected */
        public final void register() {
            this.mNotifier.register();
        }

        /* access modifiers changed from: protected */
        public final void unregister() {
            this.mNotifier.unregister();
        }

        /* access modifiers changed from: protected */
        public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }
    }

    /* access modifiers changed from: private */
    public static class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    /* access modifiers changed from: package-private */
    public static class WifiManagerDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Context mContext;
        private boolean mHasWifiPermission;
        private boolean mHasWifiPermissionComputed;
        private final Object mLock;
        private WifiManager mWifiManager;

        /* access modifiers changed from: package-private */
        public String getWifiSsid() {
            return "";
        }

        WifiManagerDelegate() {
            this.mLock = new Object();
            this.mContext = null;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            return r1.mWifiManager.getConnectionInfo();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            return null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.net.wifi.WifiInfo getWifiInfoLocked() {
            /*
                r1 = this;
                android.net.wifi.WifiManager r0 = r1.mWifiManager     // Catch:{ NullPointerException -> 0x0007 }
                android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ NullPointerException -> 0x0007 }
                return r0
            L_0x0007:
                android.net.wifi.WifiManager r0 = r1.mWifiManager     // Catch:{ NullPointerException -> 0x000e }
                android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ NullPointerException -> 0x000e }
                return r0
            L_0x000e:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.WifiManagerDelegate.getWifiInfoLocked():android.net.wifi.WifiInfo");
        }

        private boolean hasPermissionLocked() {
            boolean z;
            WifiManager wifiManager;
            if (this.mHasWifiPermissionComputed) {
                return this.mHasWifiPermission;
            }
            if (this.mContext.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.mContext.getPackageName()) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.mHasWifiPermission = z;
            if (z) {
                wifiManager = (WifiManager) this.mContext.getSystemService("wifi");
            } else {
                wifiManager = null;
            }
            this.mWifiManager = wifiManager;
            this.mHasWifiPermissionComputed = true;
            return this.mHasWifiPermission;
        }

        WifiManagerDelegate(Context context) {
            this.mLock = new Object();
            this.mContext = context;
        }
    }

    private boolean onThread() {
        if (this.mLooper == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public void destroy() {
        assertOnThread();
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public NetworkState getCurrentNetworkState() {
        return this.mConnectivityManagerDelegate.getNetworkState(this.mWifiManagerDelegate);
    }

    private void assertOnThread() {
        if (BuildConfig.DCHECK_IS_ON && !onThread()) {
            throw new IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
        }
    }

    public long getDefaultNetId() {
        Network defaultNetwork;
        if (Build.VERSION.SDK_INT >= 21 && (defaultNetwork = this.mConnectivityManagerDelegate.getDefaultNetwork()) != null) {
            return networkToNetId(defaultNetwork);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public class MyNetworkCallback extends ConnectivityManager.NetworkCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Network mVpnInPlace;

        /* access modifiers changed from: package-private */
        public void initializeVpnInPlace() {
            NetworkCapabilities networkCapabilities;
            Network[] allNetworksFiltered = NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, null);
            this.mVpnInPlace = null;
            if (allNetworksFiltered.length == 1 && (networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(allNetworksFiltered[0])) != null && networkCapabilities.hasTransport(4)) {
                this.mVpnInPlace = allNetworksFiltered[0];
            }
        }

        private MyNetworkCallback() {
        }

        private boolean ignoreNetworkDueToVpn(Network network) {
            Network network2 = this.mVpnInPlace;
            if (network2 == null || network2.equals(network)) {
                return false;
            }
            return true;
        }

        public void onAvailable(Network network) {
            try {
                NetworkCapabilities networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
                if (!ignoreConnectedNetwork(network, networkCapabilities)) {
                    final boolean hasTransport = networkCapabilities.hasTransport(4);
                    if (hasTransport) {
                        this.mVpnInPlace = network;
                    }
                    final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.RunnableC680081 */

                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                            if (hasTransport) {
                                NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                                NetworkChangeNotifierAutoDetect.this.mObserver.purgeActiveNetworkList(new long[]{networkToNetId});
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }

        public void onLost(final Network network) {
            if (!ignoreNetworkDueToVpn(network)) {
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                    /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.RunnableC680114 */

                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(network));
                    }
                });
                if (this.mVpnInPlace != null) {
                    this.mVpnInPlace = null;
                    for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, network)) {
                        onAvailable(network2);
                    }
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.getCurrentNetworkState().getConnectionType();
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.RunnableC680125 */

                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                        }
                    });
                }
            }
        }

        private boolean ignoreConnectedNetwork(Network network, NetworkCapabilities networkCapabilities) {
            if (ignoreNetworkDueToVpn(network) || ignoreConnectedInaccessibleVpn(network, networkCapabilities)) {
                return true;
            }
            return false;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            try {
                if (!ignoreConnectedNetwork(network, networkCapabilities)) {
                    final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.RunnableC680092 */

                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }

        public void onLosing(Network network, int i) {
            if (!ignoreConnectedNetwork(network, null)) {
                final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                    /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.RunnableC680103 */

                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkSoonToDisconnect(networkToNetId);
                    }
                });
            }
        }

        private boolean ignoreConnectedInaccessibleVpn(Network network, NetworkCapabilities networkCapabilities) {
            if (networkCapabilities == null) {
                networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
            }
            if (networkCapabilities == null || (networkCapabilities.hasTransport(4) && !NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.vpnAccessible(network))) {
                return true;
            }
            return false;
        }
    }

    public long[] getNetworksAndTypes() {
        if (Build.VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
        long[] jArr = new long[(allNetworksFiltered.length * 2)];
        int i = 0;
        for (Network network : allNetworksFiltered) {
            int i2 = i + 1;
            jArr[i] = networkToNetId(network);
            i = i2 + 1;
            jArr[i2] = (long) this.mConnectivityManagerDelegate.getConnectionType(network);
        }
        return jArr;
    }

    public void unregister() {
        assertOnThread();
        if (this.mRegistered) {
            this.mRegistered = false;
            MyNetworkCallback myNetworkCallback = this.mNetworkCallback;
            if (myNetworkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(myNetworkCallback);
            }
            DefaultNetworkCallback defaultNetworkCallback = this.mDefaultNetworkCallback;
            if (defaultNetworkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(defaultNetworkCallback);
            } else {
                ContextUtils.getApplicationContext().unregisterReceiver(this);
            }
        }
    }

    public void connectionTypeChanged() {
        NetworkState currentNetworkState = getCurrentNetworkState();
        if (!(currentNetworkState.getConnectionType() == this.mNetworkState.getConnectionType() && currentNetworkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) && currentNetworkState.isPrivateDnsActive() == this.mNetworkState.isPrivateDnsActive())) {
            this.mObserver.onConnectionTypeChanged(currentNetworkState.getConnectionType());
        }
        if (!(currentNetworkState.getConnectionType() == this.mNetworkState.getConnectionType() && currentNetworkState.getConnectionSubtype() == this.mNetworkState.getConnectionSubtype())) {
            this.mObserver.onConnectionSubtypeChanged(currentNetworkState.getConnectionSubtype());
        }
        this.mNetworkState = currentNetworkState;
    }

    public void register() {
        boolean z;
        assertOnThread();
        if (!this.mRegistered) {
            if (this.mShouldSignalObserver) {
                connectionTypeChanged();
            }
            DefaultNetworkCallback defaultNetworkCallback = this.mDefaultNetworkCallback;
            if (defaultNetworkCallback != null) {
                try {
                    this.mConnectivityManagerDelegate.registerDefaultNetworkCallback(defaultNetworkCallback, this.mHandler);
                } catch (RuntimeException unused) {
                    this.mDefaultNetworkCallback = null;
                }
            }
            if (this.mDefaultNetworkCallback == null) {
                try {
                    if (INVOKEVIRTUAL_com_ttnet_org_chromium_net_NetworkChangeNotifierAutoDetect_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(ContextUtils.getApplicationContext(), this, this.mIntentFilter) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.mIgnoreNextBroadcast = z;
                } catch (RuntimeException unused2) {
                    this.mIgnoreNextBroadcast = false;
                }
            }
            this.mRegistered = true;
            MyNetworkCallback myNetworkCallback = this.mNetworkCallback;
            if (myNetworkCallback != null) {
                myNetworkCallback.initializeVpnInPlace();
                try {
                    this.mConnectivityManagerDelegate.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback, this.mHandler);
                } catch (RuntimeException unused3) {
                    this.mRegisterNetworkCallbackFailed = true;
                    this.mNetworkCallback = null;
                }
                if (!this.mRegisterNetworkCallbackFailed && this.mShouldSignalObserver) {
                    Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
                    long[] jArr = new long[allNetworksFiltered.length];
                    for (int i = 0; i < allNetworksFiltered.length; i++) {
                        jArr[i] = networkToNetId(allNetworksFiltered[i]);
                    }
                    this.mObserver.purgeActiveNetworkList(jArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.mConnectivityManagerDelegate = connectivityManagerDelegate;
    }

    /* access modifiers changed from: package-private */
    public void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        this.mWifiManagerDelegate = wifiManagerDelegate;
    }

    /* access modifiers changed from: private */
    public class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        private DefaultNetworkCallback() {
        }

        public void onLost(Network network) {
            onAvailable(null);
        }

        public void onAvailable(Network network) {
            if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
            }
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            onAvailable(null);
        }
    }

    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    static long networkToNetId(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ApiHelperForM.getNetworkHandle(network);
        }
        return (long) Integer.parseInt(network.toString());
    }

    public void onReceive(Context context, Intent intent) {
        runOnThread(new Runnable() {
            /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.RunnableC680071 */

            public void run() {
                if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                    if (NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast) {
                        NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast = false;
                    } else {
                        NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
                    }
                }
            }
        });
    }

    public static Network[] getAllNetworksFiltered(ConnectivityManagerDelegate connectivityManagerDelegate, Network network) {
        NetworkCapabilities networkCapabilities;
        Network[] allNetworksUnfiltered = connectivityManagerDelegate.getAllNetworksUnfiltered();
        int i = 0;
        for (Network network2 : allNetworksUnfiltered) {
            if (!network2.equals(network) && (networkCapabilities = connectivityManagerDelegate.getNetworkCapabilities(network2)) != null && networkCapabilities.hasCapability(12)) {
                if (!networkCapabilities.hasTransport(4)) {
                    allNetworksUnfiltered[i] = network2;
                    i++;
                } else if (connectivityManagerDelegate.vpnAccessible(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworksUnfiltered, i);
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
        this.mObserver = observer;
        if (Build.VERSION.SDK_INT < 23) {
            this.mWifiManagerDelegate = new WifiManagerDelegate(ContextUtils.getApplicationContext());
        }
        DefaultNetworkCallback defaultNetworkCallback = null;
        if (Build.VERSION.SDK_INT >= 21) {
            this.mNetworkCallback = new MyNetworkCallback();
            this.mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.mNetworkCallback = null;
            this.mNetworkRequest = null;
        }
        this.mDefaultNetworkCallback = Build.VERSION.SDK_INT >= 28 ? new DefaultNetworkCallback() : defaultNetworkCallback;
        this.mNetworkState = getCurrentNetworkState();
        this.mIntentFilter = new NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        registrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ttnet_org_chromium_net_NetworkChangeNotifierAutoDetect_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
