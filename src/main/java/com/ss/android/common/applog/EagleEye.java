package com.ss.android.common.applog;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipFile;
import p001a.p002a.p003a.p005b.C0031d;

public class EagleEye {
    private static final String TAG = EagleEye.class.getSimpleName();
    private static boolean isInited = false;
    private static IEagleEyeInterface mIEagleEyeInterface;
    private static List<ScanResult> mScanResults;
    private static boolean sApkAllUploaded;
    private static WifiManager wifi;

    public interface IEagleEyeInterface {
        String appVersion();

        String channel();

        String deviceId();

        String huoshanId();

        Pair<Double, Double> location();

        String networkType();

        String nickName();

        String userId();
    }

    static {
        try {
            C0031d.m53a(GlobalContext.getContext(), "ees");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String byteArrayToHexStr(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = charArray[i2 >>> 4];
            cArr[i3 + 1] = charArray[i2 & 15];
        }
        return new String(cArr);
    }

    public static int bytesToInt(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[i];
        }
        return new BigInteger(bArr2).intValue();
    }

    public static byte[] compress(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    private static String decryptAES(String str) {
        throw new UnsupportedOperationException();
    }

    private static String decryptAES2(String str) {
        throw new UnsupportedOperationException();
    }

    public static byte[] encryptAES(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public static byte[] encryptAES2(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public static String getCRC32(String str) {
        CRC32 crc32 = new CRC32();
        crc32.update(str.getBytes());
        return "" + crc32.getValue();
    }

    public static String getCRC32(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return "" + crc32.getValue();
    }

    public static String getDexCRC(Context context, int i) {
        String packageCodePath = context.getPackageCodePath();
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = str + "," + new ZipFile(packageCodePath).getEntry(i2 == 0 ? "classes.dex" : "classes" + i2 + ".dex").getCrc();
            } catch (Exception unused) {
            }
        }
        return !TextUtils.isEmpty(str) ? str.substring(1) : "";
    }

    public static String getIpAddressJava() {
        String str;
        String str2;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            str2 = "";
            str = str2;
            while (networkInterfaces.hasMoreElements()) {
                try {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if ("wlan0".equals(nextElement.getName())) {
                        for (InterfaceAddress interfaceAddress : nextElement.getInterfaceAddresses()) {
                            if (interfaceAddress.getAddress() instanceof Inet4Address) {
                                str2 = ((Inet4Address) interfaceAddress.getAddress()).getHostAddress();
                            }
                        }
                    }
                    if ("rmnet0".equals(nextElement.getName())) {
                        for (InterfaceAddress interfaceAddress2 : nextElement.getInterfaceAddresses()) {
                            if (interfaceAddress2.getAddress() instanceof Inet4Address) {
                                str = ((Inet4Address) interfaceAddress2.getAddress()).getHostAddress();
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            str2 = "";
            str = str2;
        }
        return !str2.equals("") ? str2 : str;
    }

    public static String getPrivacyString(String str) {
        try {
            return decryptAES2(str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static List<ScanResult> getScanResults() {
        return mScanResults;
    }

    public static String getVericationString(String str) {
        try {
            return decryptAES(str);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }

    public static String getWifiBSSID(Context context) {
        try {
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getBSSID();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static synchronized void init(Context context) {
        synchronized (EagleEye.class) {
            if (!isInited) {
                isInited = true;
            }
        }
    }

    public static String sendVerification(String str) {
        try {
            return byteArrayToHexStr(encryptAES(str.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void setIEagleEyeInterface(IEagleEyeInterface iEagleEyeInterface) {
        mIEagleEyeInterface = iEagleEyeInterface;
    }

    public static String tanscode(String str) {
        try {
            String byteArrayToHexStr = byteArrayToHexStr(encryptAES(str.getBytes()));
            return byteArrayToHexStr(compress(byteArrayToHexStr + "," + getCRC32(byteArrayToHexStr)));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String tanscode2(String str) {
        try {
            return byteArrayToHexStr(encryptAES2(str.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static synchronized void uninit(Context context) {
        synchronized (EagleEye.class) {
        }
    }

    public static boolean useVpn(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp()) {
                    arrayList.add(networkInterface.getName());
                }
            }
        } catch (Exception unused) {
        }
        return arrayList.contains("tun0");
    }
}
