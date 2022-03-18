package com.bytedance.frameworks.baselib.network.http.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.retrofit2.client.Header;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.a */
public class C14083a {

    /* renamed from: a */
    static final /* synthetic */ boolean f37006a = true;

    /* renamed from: b */
    private static volatile String f37007b;

    /* renamed from: c */
    private static volatile String f37008c;

    /* renamed from: d */
    private static volatile boolean f37009d;

    /* renamed from: e */
    private static volatile boolean f37010e;

    /* renamed from: f */
    private static volatile List<String> f37011f = new ArrayList();

    /* renamed from: g */
    private static volatile List<String> f37012g = new ArrayList();

    /* renamed from: h */
    private static volatile boolean f37013h = false;

    /* renamed from: i */
    private static volatile List<Pattern> f37014i = new ArrayList();

    /* renamed from: a */
    public static void m57017a(String str) {
        f37007b = str;
        if (!TextUtils.isEmpty(str)) {
            f37010e = f37006a;
        }
    }

    /* renamed from: b */
    public static void m57020b(String str) {
        f37008c = str;
        if (!TextUtils.isEmpty(str)) {
            f37010e = false;
        }
    }

    /* renamed from: b */
    public static boolean m57021b(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return false;
        }
        try {
            if (new File(absolutePath + "/" + "ttnet_boe.flag").exists()) {
                return f37006a;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m57018a(Context context) {
        String a = m57013a(context, "ttnet_config.json");
        if (!TextUtils.isEmpty(a)) {
            try {
                if (new JSONObject(a).optBoolean("boe_proxy_enabled", false)) {
                    return f37006a;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m57013a(Context context, String str) {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            String str2 = new String(bArr, "UTF-8");
            if (inputStream == null) {
                return str2;
            }
            try {
                inputStream.close();
                return str2;
            } catch (IOException e) {
                e.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return "";
        }
    }

    /* renamed from: b */
    private static String m57019b(String str, String str2) {
        if (!f37010e) {
            return str;
        }
        String str3 = null;
        if (str2.equals("https")) {
            str3 = "http";
        } else if (str2.equals("wss")) {
            str3 = "ws";
        }
        if (!StringUtils.isEmpty(str3)) {
            return str.replaceFirst(str2, str3);
        }
        return str;
    }

    /* renamed from: c */
    private static boolean m57022c(String str, String str2) {
        if (f37011f.isEmpty() && f37012g.isEmpty() && f37014i.isEmpty()) {
            return false;
        }
        for (String str3 : f37011f) {
            if (UrlUtils.matchPattern(str, str3)) {
                return f37006a;
            }
        }
        for (String str4 : f37012g) {
            if (UrlUtils.matchPattern(str2, str4)) {
                return f37006a;
            }
        }
        String str5 = str + str2;
        for (Pattern pattern : f37014i) {
            if (pattern.matcher(str5).matches()) {
                return f37006a;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static String m57016a(String str, String str2) {
        String[] split;
        int length;
        String str3;
        if (TextUtils.isEmpty(f37008c) || (length = (split = str2.split("\\.")).length) < 2) {
            return str;
        }
        int i = 0;
        if (length == 2) {
            str3 = split[0];
        } else if (f37006a || length >= 3) {
            int i2 = length - 3;
            String str4 = split[i2];
            i = m57012a(str2, ".", i2);
            str3 = str4;
        } else {
            throw new AssertionError();
        }
        if (str3.contains(f37008c)) {
            return str;
        }
        return m57015a(str, i, str3, str3 + f37008c);
    }

    /* renamed from: a */
    private static int m57012a(String str, String str2, int i) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 == 0) {
                i2 = 0;
            } else {
                i2 = i3 + 1;
            }
            i3 = str.indexOf(str2, i2);
            if (i3 == -1) {
                return 0;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static String m57014a(Context context, String str, List<Header> list) {
        boolean z;
        boolean z2 = false;
        if (!f37013h && !f37009d) {
            if (m57018a(context) || m57021b(context)) {
                z = f37006a;
            } else {
                z = false;
            }
            f37009d = z;
            f37013h = f37006a;
        }
        if (f37009d && (!TextUtils.isEmpty(f37007b) || !TextUtils.isEmpty(f37008c))) {
            Uri parse = Uri.parse(str);
            if (StringUtils.isEmpty(parse.getScheme()) || StringUtils.isEmpty(parse.getHost()) || StringUtils.isEmpty(parse.getPath()) || m57022c(parse.getHost(), parse.getPath())) {
                return str;
            }
            for (Header header : list) {
                if (!StringUtils.isEmpty(header.getName()) && !StringUtils.isEmpty(header.getValue()) && header.getName().equals("bypass-boe") && header.getValue().equals("1")) {
                    return str;
                }
            }
            String b = m57019b(str, parse.getScheme());
            if (C14086d.m57027a(parse.getHost()) || C14086d.m57028b(parse.getHost()) || C14086d.m57029c(parse.getHost())) {
                z2 = f37006a;
            }
            if (z2) {
                return b;
            }
            if (!f37010e) {
                return m57016a(b, parse.getHost());
            }
            String host = parse.getHost();
            if (host.contains(f37007b)) {
                return b;
            }
            return b.replaceFirst(host, host + f37007b);
        }
        return str;
    }

    /* renamed from: a */
    private static String m57015a(String str, int i, String str2, String str3) {
        String substring = str.substring(0, i);
        String replaceFirst = str.substring(i).replaceFirst(str2, str3);
        return substring + replaceFirst;
    }
}
