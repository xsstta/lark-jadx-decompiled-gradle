package com.bytedance.ee.lark.infra.foundation.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Character;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class CharacterUtils {
    static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String empty() {
        return "";
    }

    public static String nullValue() {
        return null;
    }

    public static String null2Empty(String str) {
        if (str == null) {
            return empty();
        }
        return str;
    }

    public static String toBinaryString(int i) {
        return Integer.toBinaryString(i);
    }

    public static Bitmap toBitmap(byte[] bArr) {
        return toBitmap(bArr, -1, -1);
    }

    public static String toHexString(int i) {
        return Integer.toHexString(i);
    }

    public static <T> List<T> toList(T[] tArr) {
        return Arrays.asList(tArr);
    }

    public static String toString(InputStream inputStream) {
        return toString(inputStream, "utf-8");
    }

    public static int length(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    public static byte[] toByteArray(Drawable drawable) {
        return toByteArray(toBitmap(drawable));
    }

    public static Drawable toDrawable(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(Resources.getSystem(), bitmap);
    }

    public static float toFloat(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (NumberFormatException unused) {
            return -1.0f;
        }
    }

    public static int toInt(Object obj) {
        try {
            return Integer.parseInt(obj.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static long toLong(Object obj) {
        try {
            return Long.parseLong(obj.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String toString(Object[] objArr) {
        return Arrays.deepToString(objArr);
    }

    public static Map<String, Object> getMapFromJson(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getMapFromJson((JSONObject) new JSONParser().parse(str));
    }

    public static String replaceBlank(String str) {
        if (str != null) {
            return Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("");
        }
        return "";
    }

    public static Drawable toDrawable(byte[] bArr) {
        return toDrawable(toBitmap(bArr));
    }

    public static int toInt(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i += (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public static List<Object> getArrayFromJsonArray(JSONArray jSONArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = getArrayFromJsonArray((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getMapFromJson((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static JSONObject getJsonFromMap(Map map) {
        if (map == null) {
            return null;
        }
        try {
            return (JSONObject) new JSONParser().parse(JSONValue.toJSONString(map));
        } catch (Exception e) {
            AppBrandLogger.m52829e("CharacterUtils", e.toString());
            return null;
        }
    }

    public static Map<String, Object> getMapFromJson(JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                obj = getArrayFromJsonArray((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getMapFromJson((JSONObject) obj);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    public static final boolean isChinese(char c) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        if (of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            return true;
        }
        return false;
    }

    public static String md5Hex(File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            if (instance == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 8192);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return toHexString(instance.digest());
                }
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "CharacterUtils", e.getStackTrace());
            return null;
        }
    }

    public static String splitCharByPoints(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            sb.append(charArray[i]);
            if (i != charArray.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static byte[] toByteArray(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            AppBrandLogger.m52831w("CharacterUtils", e.getMessage());
        }
        return byteArray;
    }

    public static String toHexString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : str.getBytes()) {
            sb.append(Integer.toHexString(b & 255));
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String toSlashString(String str) {
        char[] charArray = str.toCharArray();
        String str2 = "";
        for (char c : charArray) {
            if (c == '\"' || c == '\'' || c == '\\') {
                str2 = str2 + "\\";
            }
            str2 = str2 + c;
        }
        return str2;
    }

    private static String getCharSet(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1388966911:
                if (str.equals("binary")) {
                    c = 0;
                    break;
                }
                break;
            case -1109877331:
                if (str.equals("latin1")) {
                    c = 1;
                    break;
                }
                break;
            case -119555963:
                if (str.equals("utf16le")) {
                    c = 2;
                    break;
                }
                break;
            case 3584301:
                if (str.equals("ucs2")) {
                    c = 3;
                    break;
                }
                break;
            case 111113226:
                if (str.equals("ucs-2")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return "latin1";
            case 2:
            case 3:
            case 4:
                return "UTF-16LE";
            default:
                return str;
        }
    }

    public static byte[] hexStringToBytes(String str) throws IllegalArgumentException {
        if (str == null || str.length() % 2 == 1) {
            throw new IllegalArgumentException("hexBinary needs to be even-length: " + str);
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(charArray[i], 16) << 4) + Character.digit(charArray[i + 1], 16));
        }
        return bArr;
    }

    public static String md5Hex(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return toHexString(instance.digest());
                }
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "CharacterUtils", e.getStackTrace());
            }
        }
        return null;
    }

    public static String toAndroidStyleColor(String str) {
        int length = str.length();
        if (length == 7 || length != 4 || str.charAt(0) != '#') {
            return str;
        }
        return "#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3);
    }

    public static Bitmap toBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof ColorDrawable) {
            Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(((ColorDrawable) drawable).getColor());
            return createBitmap;
        } else if (!(drawable instanceof NinePatchDrawable)) {
            return null;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return createBitmap2;
        }
    }

    public static byte[] toByteArray(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[100];
            while (true) {
                int read = inputStream.read(bArr, 0, 100);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            AppBrandLogger.m52831w("CharacterUtils", e.getMessage());
            return null;
        }
    }

    public static String toFileSizeString(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (j < 1024) {
            return j + "B";
        } else if (j < 1048576) {
            return decimalFormat.format(((double) j) / 1024.0d) + "K";
        } else if (j < 1073741824) {
            return decimalFormat.format(((double) j) / 1048576.0d) + "M";
        } else {
            return decimalFormat.format(((double) j) / 1.073741824E9d) + "G";
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x001c */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static String toHexString(byte... bArr) {
        byte b;
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] < 0) {
                b = bArr[i2] + DynamicModule.f58006b;
            } else {
                b = bArr[i2];
            }
            int i3 = i + 1;
            cArr2[i] = cArr[(b == true ? 1 : 0) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[(b == true ? 1 : 0) & 15];
        }
        return new String(cArr2);
    }

    public static String md5Hex(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr);
                    return toHexString(instance.digest());
                }
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "CharacterUtils", e.getStackTrace());
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x001c */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public static String toBinaryString(byte... bArr) {
        byte b;
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 8)];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] < 0) {
                b = bArr[i2] + DynamicModule.f58006b;
            } else {
                b = bArr[i2];
            }
            int i3 = i + 1;
            cArr2[i] = cArr[((b == true ? 1 : 0) >>> 7) & 1];
            int i4 = i3 + 1;
            cArr2[i3] = cArr[(b >>> 6) & 1];
            int i5 = i4 + 1;
            cArr2[i4] = cArr[(b >>> 5) & 1];
            int i6 = i5 + 1;
            cArr2[i5] = cArr[(b >>> 4) & 1];
            int i7 = i6 + 1;
            cArr2[i6] = cArr[(b >>> 3) & 1];
            int i8 = i7 + 1;
            cArr2[i7] = cArr[(b >>> 2) & 1];
            int i9 = i8 + 1;
            cArr2[i8] = cArr[(b >>> 1) & 1];
            i = i9 + 1;
            cArr2[i9] = cArr[(b == true ? 1 : 0) & 1];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap toBitmap(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils.toBitmap(android.view.View):android.graphics.Bitmap");
    }

    public static int toDp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int toSp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int toPx(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String toString(Object[] objArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String toString(InputStream inputStream, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            bufferedReader.close();
            inputStream.close();
        } catch (IOException e) {
            AppBrandLogger.m52829e("CharacterUtils", "toString", e);
        }
        return sb.toString();
    }

    public static byte[] toByteArray(String str, boolean z) {
        if (str == null || str.equals("")) {
            return null;
        }
        if (!z) {
            return str.getBytes();
        }
        String replaceAll = str.replaceAll("\\s+", "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(replaceAll.length() / 2);
        for (int i = 0; i < replaceAll.length(); i += 2) {
            byteArrayOutputStream.write(("0123456789ABCDEF".indexOf(replaceAll.charAt(i)) << 4) | "0123456789ABCDEF".indexOf(replaceAll.charAt(i + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            AppBrandLogger.m52829e("CharacterUtils", e.getMessage());
        }
        return byteArray;
    }

    public static Bitmap toBitmap(byte[] bArr, int i, int i2) {
        if (bArr.length == 0) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = false;
            options.inPreferredConfig = null;
            if (i > 0 && i2 > 0) {
                options.outWidth = i;
                options.outHeight = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            decodeByteArray.setDensity(96);
            return decodeByteArray;
        } catch (Exception e) {
            AppBrandLogger.m52829e("CharacterUtils", e.getMessage());
            return null;
        }
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5 + i] & 255;
            int i7 = i4 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i4] = cArr2[i6 >> 4];
            i4 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new String(cArr, 0, i3);
    }

    public static String md5Hex(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 > 0) {
            try {
                if (i + i2 <= bArr.length) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr, i, i2);
                    return toHexString(instance.digest());
                }
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "CharacterUtils", e.getStackTrace());
            }
        }
        return null;
    }

    public static final String trimString(String str, int i, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (char c : charArray) {
            if (i >= 2) {
                sb.append(c);
            } else if (i != 1) {
                break;
            } else if (!isChinese(c)) {
                sb.append(c);
            } else if (z) {
                sb.append(c);
            }
            i = isChinese(c) ? i - 2 : i - 1;
        }
        String sb2 = sb.toString();
        if (!sb2.contentEquals(str) && str2 != null) {
            z2 = true;
        }
        if (!z2) {
            return sb2;
        }
        return sb2 + str2;
    }
}
