package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.android.os.BuildEx;
import com.huawei.android.telephony.ServiceStateEx;
import com.huawei.hms.android.HwBuildEx;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NetworkUtil {
    private static final String TAG = "NetworkUtil";
    private static final int TYPE_WIFI_P2P = 13;

    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_5G = 5;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    public static String getDnsServerIps(Context context) {
        return Arrays.toString(getDnsServerIpsFromConnectionManager(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] getDnsServerIpsFromConnectionManager(android.content.Context r4) {
        /*
            java.lang.String r0 = "getActiveNetworkInfo failed, exception:"
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x004a
            if (r4 == 0) goto L_0x004a
            java.lang.String r2 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r2)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            if (r4 == 0) goto L_0x004a
            android.net.NetworkInfo r2 = r4.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x002d, RuntimeException -> 0x0024 }
            if (r2 == 0) goto L_0x004a
            java.util.LinkedList r1 = getDnsServerIpsFromLinkProperties(r4, r2)     // Catch:{ SecurityException -> 0x002d, RuntimeException -> 0x0024 }
            goto L_0x004a
        L_0x0024:
            r4 = move-exception
            java.lang.String r2 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0035
        L_0x002d:
            r4 = move-exception
            java.lang.String r2 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0035:
            r3.append(r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            com.huawei.hms.framework.common.Logger.m85371i(r2, r4)
        L_0x004a:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0054
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            goto L_0x0060
        L_0x0054:
            int r4 = r1.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r4 = r1.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.NetworkUtil.getDnsServerIpsFromConnectionManager(android.content.Context):java.lang.String[]");
    }

    private static LinkedList<String> getDnsServerIpsFromLinkProperties(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        LinkProperties linkProperties;
        LinkedList<String> linkedList = new LinkedList<>();
        Network[] allNetworks = connectivityManager.getAllNetworks();
        if (!(allNetworks == null || allNetworks.length == 0)) {
            for (Network network : allNetworks) {
                if (network != null) {
                    NetworkInfo networkInfo2 = null;
                    try {
                        networkInfo2 = connectivityManager.getNetworkInfo(network);
                    } catch (NullPointerException e) {
                        Logger.m85371i(TAG, "connectivityManager getNetworkInfo failed, exception:" + e.getClass().getSimpleName());
                    }
                    if (!(networkInfo2 == null || networkInfo2.getType() != networkInfo.getType() || (linkProperties = connectivityManager.getLinkProperties(network)) == null)) {
                        for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                            linkedList.add(inetAddress.getHostAddress());
                        }
                    }
                }
            }
        }
        return linkedList;
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            URI uri = new URI(str);
            if (uri.getPort() == -1) {
                return uri.getHost();
            }
            return uri.getHost() + ":" + uri.getPort();
        } catch (URISyntaxException e) {
            Logger.m85375w(TAG, e.getClass().getSimpleName());
            return "";
        }
    }

    private static int getHwNetworkType(Context context) {
        TelephonyManager telephonyManager;
        String str;
        String str2;
        ServiceState serviceState;
        int i = 0;
        if (!EmuiUtil.isEMUI()) {
            return 0;
        }
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            try {
                if (BuildEx.VERSION.EMUI_SDK_INT >= 21 && (serviceState = telephonyManager.getServiceState()) != null) {
                    i = ServiceStateEx.getConfigRadioTechnology(serviceState);
                    String str3 = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("getHwNetworkType return networkType is:");
                    sb.append(i);
                    Logger.m85371i(str3, sb.toString());
                }
            } catch (SecurityException unused) {
                str = TAG;
                str2 = "requires permission maybe missing.";
                Logger.m85375w(str, str2);
                return i;
            } catch (NoSuchMethodError unused2) {
                str = TAG;
                str2 = "NoSuchMethodError occur in method getHwNetworkType.";
                Logger.m85375w(str, str2);
                return i;
            } catch (NoClassDefFoundError unused3) {
                str = TAG;
                str2 = "NoClassDefFoundError occur in method getHwNetworkType.";
                Logger.m85375w(str, str2);
                return i;
            }
        }
        return i;
    }

    public static int getMobileRsrp(Context context) {
        String str;
        String str2;
        if (context == null) {
            return 0;
        }
        Object systemService = context.getSystemService("phone");
        SignalStrength signalStrength = null;
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signalStrength = telephonyManager.createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId()).getSignalStrength();
        }
        if (signalStrength == null) {
            return 0;
        }
        try {
            return ((Integer) SignalStrength.class.getDeclaredMethod("getDbm", new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (NoSuchMethodException unused) {
            str = TAG;
            str2 = "getDbm: function not found";
        } catch (IllegalAccessException unused2) {
            str = TAG;
            str2 = "getDbm: cannot access";
        } catch (InvocationTargetException unused3) {
            str = TAG;
            str2 = "getDbm: InvocationTargetException";
        }
        Logger.m85371i(str, str2);
        return 0;
    }

    public static int getMobileRsrpLevel(Context context) {
        String str;
        String str2;
        if (context == null) {
            return 0;
        }
        Object systemService = context.getSystemService("phone");
        SignalStrength signalStrength = null;
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signalStrength = telephonyManager.getSignalStrength();
        }
        if (signalStrength == null) {
            return 0;
        }
        try {
            return ((Integer) SignalStrength.class.getDeclaredMethod("getLteLevel", new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (NoSuchMethodException unused) {
            str = TAG;
            str2 = "getDbm: function not found";
        } catch (IllegalAccessException unused2) {
            str = TAG;
            str2 = "getDbm: cannot access";
        } catch (InvocationTargetException unused3) {
            str = TAG;
            str2 = "getDbm: InvocationTargetException";
        }
        Logger.m85371i(str, str2);
        return 0;
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (SecurityException unused) {
            return null;
        } catch (RuntimeException e) {
            String str = TAG;
            Logger.m85371i(str, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName());
            return null;
        }
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        int i;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    i = 2;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case HwBuildEx.VersionCodes.EMUI_5_1:
                case 14:
                case 15:
                    i = 3;
                    break;
                case 13:
                    i = 4;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0 || Build.VERSION.SDK_INT < 25) {
                return i;
            }
            if (subtype != 16) {
                return subtype != 17 ? 0 : 3;
            }
            return 2;
        }
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type == 0) {
            int hwNetworkType = getHwNetworkType(context);
            String str = TAG;
            Logger.m85373v(str, "getHwNetworkType return is: " + hwNetworkType);
            if (hwNetworkType == 0) {
                hwNetworkType = networkInfo.getSubtype();
            }
            if (hwNetworkType != 20) {
                switch (hwNetworkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        i = 2;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                    case 14:
                    case 15:
                        i = 3;
                        break;
                    case 13:
                        i = 4;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 5;
            }
            if (i != 0 || Build.VERSION.SDK_INT < 25) {
                return i;
            }
            if (hwNetworkType != 16) {
                return hwNetworkType != 17 ? 0 : 3;
            }
            return 2;
        }
    }

    public static String getSSIDByNetWorkId(Context context) {
        return "";
    }

    public static String getWifiGatewayIp(Context context) {
        if (context == null) {
            return " ";
        }
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            return " ";
        }
        try {
            DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
            if (dhcpInfo == null) {
                return " ";
            }
            int i = dhcpInfo.gateway;
            try {
                return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)}).getHostAddress();
            } catch (Exception unused) {
                Logger.m85371i(TAG, "getWifiGatewayIp: can not get ip addr");
                return " ";
            }
        } catch (SecurityException unused2) {
            Logger.m85371i(TAG, "getWifiGatewayIp did not has permission!");
            return " ";
        }
    }

    public static int getWifiRssi(Context context) {
        if (context == null) {
            return 0;
        }
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            return 0;
        }
        try {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                return 0;
            }
            return connectionInfo.getRssi();
        } catch (SecurityException unused) {
            Logger.m85371i(TAG, "getWifiRssiLevel did not has permission!");
            return 0;
        }
    }

    public static int getWifiRssiLevel(Context context) {
        if (context == null) {
            return 0;
        }
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            return 0;
        }
        try {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                return 0;
            }
            return WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5);
        } catch (SecurityException unused) {
            Logger.m85371i(TAG, "getWifiRssiLevel did not has permission!");
            return 0;
        }
    }

    public static boolean isForeground(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return false;
        }
        List<ActivityManager.RunningAppProcessInfo> list = null;
        try {
            list = activityManager.getRunningAppProcesses();
        } catch (Exception e) {
            Logger.m85376w(TAG, "activityManager getRunningAppProcesses occur exception: ", e);
        }
        if (list == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            String str = runningAppProcessInfo.processName;
            if (str != null && str.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                Logger.m85373v(TAG, "isForeground true");
                return true;
            }
        }
        return false;
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null && Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager;
        if (!(context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (SecurityException unused) {
                Logger.m85375w(TAG, "networkIsConnected catch SecurityException");
                return true;
            }
        }
        return false;
    }

    public static NetworkInfo.DetailedState networkStatus(Context context) {
        String str;
        String str2;
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.getDetailedState();
                    }
                    Logger.m85371i(TAG, "networkIsConnected netInfo is null!");
                    return detailedState;
                } catch (SecurityException unused) {
                }
            } else {
                str = TAG;
                str2 = "networkStatus ConnectivityManager is null!";
            }
        } else {
            str = TAG;
            str2 = "networkStatus Context is null!";
        }
        Logger.m85371i(str, str2);
        return detailedState;
    }
}
