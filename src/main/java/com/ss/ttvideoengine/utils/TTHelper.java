package com.ss.ttvideoengine.utils;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.JniUtils;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngineConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTHelper {
    private static String mAppPath = null;
    private static String queryStrAllowCharset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.~#[]!\\()*%";
    private static String sBoeSuffix = "";
    private static volatile String sLastExternalStorageState = null;
    private static volatile long sLastGetExternalStorageStateTime = -1;

    public static Looper getLooper() {
        if (Looper.myLooper() != null) {
            return Looper.myLooper();
        }
        return Looper.getMainLooper();
    }

    public static final boolean isAndroidJB2() {
        if (Build.VERSION.SDK_INT >= 18) {
            return true;
        }
        return false;
    }

    public static final boolean isExternalStorageWritable() {
        return "mounted".equals(safeGetExternalStorageState());
    }

    public static final HashMap<String, Resolution> defaultAudioResolutionMap() {
        HashMap<String, Resolution> hashMap = new HashMap<>();
        hashMap.put("medium", Resolution.Standard);
        hashMap.put("higher", Resolution.High);
        hashMap.put("highest", Resolution.SuperHigh);
        hashMap.put("original", Resolution.ExtremelyHigh);
        return hashMap;
    }

    public static final String safeGetExternalStorageState() {
        if (!TextUtils.isEmpty(sLastExternalStorageState) && System.currentTimeMillis() - sLastGetExternalStorageStateTime < 5000) {
            return sLastExternalStorageState;
        }
        try {
            sLastGetExternalStorageStateTime = System.currentTimeMillis();
            sLastExternalStorageState = Environment.getExternalStorageState();
            return sLastExternalStorageState;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final HashMap<String, Resolution> defaultVideoResolutionMap() {
        HashMap<String, Resolution> hashMap = new HashMap<>();
        hashMap.put("240p", Resolution.L_Standard);
        hashMap.put("360p", Resolution.Standard);
        hashMap.put("480p", Resolution.High);
        hashMap.put("540p", Resolution.H_High);
        hashMap.put("720p", Resolution.SuperHigh);
        hashMap.put("1080p", Resolution.ExtremelyHigh);
        hashMap.put("2k", Resolution.TwoK);
        hashMap.put("4k", Resolution.FourK);
        hashMap.put("hdr", Resolution.HDR);
        hashMap.put("1080p 50fps", Resolution.ExtremelyHigh_50F);
        hashMap.put("2k 50fps", Resolution.TwoK_50F);
        hashMap.put("4k 50fps", Resolution.FourK_50F);
        hashMap.put("1080p 60fps", Resolution.ExtremelyHigh_60F);
        hashMap.put("2k 60fps", Resolution.TwoK_60F);
        hashMap.put("4k 60fps", Resolution.FourK_60F);
        hashMap.put("1080p 120fps", Resolution.ExtremelyHigh_120F);
        hashMap.put("2k 120fps", Resolution.TwoK_120F);
        hashMap.put("4k 120fps", Resolution.FourK_120F);
        hashMap.put("240p HDR", Resolution.L_Standard_HDR);
        hashMap.put("360p HDR", Resolution.Standard_HDR);
        hashMap.put("480p HDR", Resolution.High_HDR);
        hashMap.put("540p HDR", Resolution.H_High_HDR);
        hashMap.put("720p HDR", Resolution.SuperHigh_HDR);
        hashMap.put("1080p HDR", Resolution.ExtremelyHigh_HDR);
        hashMap.put("2k HDR", Resolution.TwoK_HDR);
        hashMap.put("4k HDR", Resolution.FourK_HDR);
        return hashMap;
    }

    public static void configBoeSuffix(String str) {
        sBoeSuffix = str;
    }

    public static String base64Decode(String str) {
        return base64Decode(str, null);
    }

    public static boolean isBase64(String str) {
        return Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str);
    }

    public static final String encodeQuery(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return Uri.encode(str, queryStrAllowCharset);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String encodeUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final long getFreeSize(Context context) {
        if (context != null && isExternalStorageWritable()) {
            return getAvailableStorageSize(context);
        }
        return -1;
    }

    public static boolean isEmpty(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final String buildHttpUrl(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("https")) {
            return str;
        }
        return str.replace("https", "http");
    }

    public static final String buildHttpsUrl(String str) {
        if (TextUtils.isEmpty(str) || str.contains("http://127.0.0.1")) {
            return str;
        }
        return str.replaceAll("http:", "https:");
    }

    public static final String computeMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }

    public static final String decodeUrl(String str) {
        String str2 = "";
        while (!str2.equals(str)) {
            try {
                str2 = str;
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        return str;
    }

    public static final String getAppFilesPath(Context context) {
        String str = mAppPath;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = context.getApplicationContext().getFilesDir().getAbsolutePath();
            mAppPath = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final long getAvailableStorageSize(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return getDirectoryAvailableSize(context.getFilesDir().getParent());
    }

    public static float getVolume(Context context) {
        int i;
        if (context == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = 0;
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                i = audioManager.getStreamVolume(3);
            } else {
                i = 0;
            }
            if (i >= 0) {
                i2 = i;
            }
        } catch (Exception unused) {
        }
        return (float) i2;
    }

    public static boolean isEmpty(Map map) {
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

    public static byte[] base64DecodeToBytes(String str) {
        TTVideoEngineLog.m256500d("TTHelper", "base64DecodeToBytes " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.decode(str, 0);
            } catch (Throwable th) {
                TTVideoEngineLog.m256503e("TTHelper", "base64DecodeToBytes " + th.toString());
            }
        }
        return null;
    }

    private static final String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static final String customBase64Decode(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace("$", "_").replace("@", "/").replace("#", ".");
    }

    public static final String customBase64Encode(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace("_", "$").replace("/", "@").replace(".", "#");
    }

    public static final long getDirectoryAvailableSize(String str) {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(str);
            if (isAndroidJB2()) {
                j2 = statFs.getBlockSizeLong();
                j = statFs.getAvailableBlocksLong();
            } else {
                j2 = (long) statFs.getBlockSize();
                j = (long) statFs.getAvailableBlocks();
            }
            return j2 * j;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static final String getFileMd5(File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return bytesToHexString(instance.digest());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isEmpty(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    public static int parseInt(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        throw new NumberFormatException("Can't format " + obj.getClass() + " to int");
    }

    public static final void recursionDeleteFile(File file) {
        if (file != null) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File file2 : listFiles) {
                    recursionDeleteFile(file2);
                }
                file.delete();
            }
        }
    }

    public static int versionStringToInt(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] split = str.split("\\.");
        if (split.length <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (i2 == 0) {
                try {
                    i = Integer.parseInt(split[i2]);
                } catch (Exception unused) {
                }
            } else {
                i = (i * 100) + Integer.parseInt(split[i2]);
            }
        }
        return i;
    }

    public static final String buildBoeUrl(String str) {
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty(sBoeSuffix)) {
            return str;
        }
        boolean contains = str.contains(sBoeSuffix);
        boolean isIP = isIP(str);
        if (str.startsWith("https")) {
            str = str.replace("https", "http");
        }
        if (isIP || str.indexOf("http") != 0 || contains) {
            return str;
        }
        try {
            String host = new URL(str).getHost();
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append(String.format(".%s", sBoeSuffix));
            return str.replace(host, sb);
        } catch (Exception e) {
            TTVideoEngineLog.m256501d(e);
            return str;
        }
    }

    public static final void deleteBeforeDirFiles(Context context) {
        String appFilesPath;
        File[] listFiles;
        if (!(context == null || (appFilesPath = getAppFilesPath(context)) == null)) {
            File file = new File(appFilesPath);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (file2.isFile() && file2.getName().matches("^[0-9]{1,15}\\.cach$")) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public static final String encodeUrlByQuery(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        TTVideoEngineLog.m256500d("TTHelperEncode", "before encode:" + str);
        try {
            String queryComponentEncode = AVMDLDataLoader.queryComponentEncode(str);
            if (TextUtils.isEmpty(queryComponentEncode)) {
                TTVideoEngineLog.m256500d("TTHelperEncode", "call native encode fail,try java");
                queryComponentEncode = URLEncoder.encode(str, "UTF-8");
            }
            TTVideoEngineLog.m256500d("TTHelperEncode", "after encode:" + queryComponentEncode);
            return queryComponentEncode;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final Error errorWithJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new Error(jSONObject.optString("domain"), jSONObject.optInt("code"), jSONObject.optInt("innerCode"), jSONObject.optString("des"));
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean isEmpty(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isIP(String str) {
        if (str != null) {
            String str2 = "";
            if (!str.equals(str2)) {
                try {
                    str2 = new URL(str).getHost();
                } catch (Exception e) {
                    TTVideoEngineLog.m256501d(e);
                }
                if (Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
                    return true;
                }
                int indexOf = str.indexOf("[");
                int indexOf2 = str.indexOf("]");
                if (indexOf <= 0 || indexOf2 <= indexOf || str.substring(indexOf, indexOf2).indexOf(":") <= 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final JSONObject jsonWithError(Error error) {
        Throwable th;
        JSONObject jSONObject = null;
        if (error == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("domain", error.domain);
                jSONObject2.put("code", error.code);
                jSONObject2.put("innerCode", error.internalCode);
                jSONObject2.put("des", error.description);
                return jSONObject2;
            } catch (Throwable th2) {
                th = th2;
                jSONObject = jSONObject2;
                try {
                    TTVideoEngineLog.m256503e("TTVideoEngineTTHelper", "error to json fail. " + th.toString() + " " + jSONObject.toString());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        } catch (Throwable th3) {
            th = th3;
            TTVideoEngineLog.m256503e("TTVideoEngineTTHelper", "error to json fail. " + th.toString() + " " + jSONObject.toString());
            return jSONObject;
        }
    }

    public static final String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            TTVideoEngineLog.m256501d(e);
            return "";
        }
    }

    public static String keyFromFilePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (context != null) {
            String appFilesPath = getAppFilesPath(context);
            if (!TextUtils.isEmpty(appFilesPath)) {
                str.replace(appFilesPath, "");
            }
        }
        return md5(str);
    }

    public static String base64Decode(String str, String str2) {
        if (TextUtils.isEmpty(str) || !isBase64(str)) {
            return str;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            if (TextUtils.isEmpty(str2)) {
                return new String(decode, "utf-8");
            }
            return JniUtils.getDecodedStrWithKey(decode, Base64.decode(str2, 0));
        } catch (Throwable th) {
            TTVideoEngineLog.m256500d("TTHelper", th.toString());
            return "";
        }
    }

    public static String genTrackID(String str, long j) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("T");
        }
        sb.append(Long.toString(j));
        sb.append("T");
        sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
        return sb.toString();
    }

    public static Class<?> getClzUsingPluginLoader(int i, String str) throws Exception {
        if (i < 0 || TextUtils.isEmpty(str)) {
            throw new Exception("pluginName or/and className is empty");
        }
        ClassLoader classLoader = TTVideoEngineConfig.getClassLoader(i);
        if (classLoader == null) {
            return Class.forName(str);
        }
        return Class.forName(str, true, classLoader);
    }

    public static String replaceHostInURL(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            String host = new URI(str).getHost();
            if (TextUtils.isEmpty(host)) {
                return str;
            }
            return str.replaceFirst(host, str2);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static final String appendQueryString(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.indexOf(str2) != -1) {
            return str;
        }
        if (str.indexOf("?") == -1) {
            return str + "?" + str2;
        }
        return str + ContainerUtils.FIELD_DELIMITER + str2;
    }

    public static String getParam(String str, String str2) {
        List<String> urlSlices = getUrlSlices(str, str2);
        if (!(urlSlices == null || urlSlices.size() == 0)) {
            for (String str3 : urlSlices) {
                if (str3.startsWith(str2 + ContainerUtils.KEY_VALUE_DELIMITER)) {
                    return str3.substring(str2.length() + 1);
                }
            }
        }
        return null;
    }

    private static List<String> getUrlSlices(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("[?]");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        int indexOf = str4.indexOf(str2 + ContainerUtils.KEY_VALUE_DELIMITER);
        if (indexOf == -1) {
            return null;
        }
        arrayList.add(str3);
        arrayList.add("?");
        arrayList.add(str4.substring(0, indexOf));
        int indexOf2 = str4.indexOf(ContainerUtils.FIELD_DELIMITER, indexOf);
        if (indexOf2 == -1) {
            arrayList.add(str4.substring(indexOf));
            return arrayList;
        }
        arrayList.add(str4.substring(indexOf, indexOf2));
        arrayList.add(str4.substring(indexOf2));
        return arrayList;
    }

    public static String overrideUrlParam(String str, String str2, String str3) {
        List<String> urlSlices = getUrlSlices(str, str2);
        if (urlSlices == null || urlSlices.size() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str4 : urlSlices) {
            if (str4.startsWith(str2 + ContainerUtils.KEY_VALUE_DELIMITER)) {
                sb.append(str2);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(str3);
            } else {
                sb.append(str4);
            }
        }
        return sb.toString();
    }
}
