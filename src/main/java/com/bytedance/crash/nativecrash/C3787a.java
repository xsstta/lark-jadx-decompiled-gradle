package com.bytedance.crash.nativecrash;

import com.bytedance.crash.C3691b;
import com.bytedance.crash.util.C3954p;
import com.bytedance.crash.util.NativeTools;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.nativecrash.a */
public class C3787a {

    /* renamed from: g */
    private static final Pattern f11653g = Pattern.compile("(?<===).*?(?===ERROR)");

    /* renamed from: h */
    private static final Pattern f11654h = Pattern.compile("(?<=AddressSanitizer:).*?(?=on)");

    /* renamed from: i */
    private static final Pattern f11655i = Pattern.compile("(?<=asan/).*?(?=/asan_report)");

    /* renamed from: j */
    private static final Pattern f11656j = Pattern.compile("__asan_handle_no_return");

    /* renamed from: k */
    private static final Pattern f11657k = Pattern.compile("(?<=\\().*?(?=\\+)");

    /* renamed from: a */
    private String f11658a;

    /* renamed from: b */
    private String f11659b;

    /* renamed from: c */
    private String f11660c;

    /* renamed from: d */
    private long f11661d;

    /* renamed from: e */
    private final boolean f11662e = true;

    /* renamed from: f */
    private final Map<String, String> f11663f = new HashMap();

    /* renamed from: c */
    public boolean mo15304c() {
        return true;
    }

    /* renamed from: a */
    public String mo15302a() {
        return this.f11658a;
    }

    /* renamed from: b */
    public String mo15303b() {
        return this.f11659b;
    }

    /* renamed from: d */
    public long mo15305d() {
        return this.f11661d;
    }

    /* renamed from: e */
    public String mo15306e() {
        return this.f11660c;
    }

    /* renamed from: f */
    public Map<String, String> mo15307f() {
        return this.f11663f;
    }

    public C3787a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        File file = new File(str);
        if (file.exists() && file.length() != 0) {
            this.f11661d = new Date(file.lastModified()).getTime();
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("    #")) {
                            Matcher matcher = f11657k.matcher(readLine);
                            if (matcher.find() && matcher.group(0) != null) {
                                String str2 = matcher.group(0) + "\n";
                                if (str2.startsWith("/data/")) {
                                    String name = new File(str2.trim()).getName();
                                    String j = NativeTools.m16236b().mo15622j(name);
                                    if (j != null) {
                                        this.f11663f.put(name, j);
                                    } else {
                                        String j2 = NativeTools.m16236b().mo15622j(str2);
                                        if (j2 != null) {
                                            this.f11663f.put(name, j2);
                                        }
                                    }
                                }
                            }
                        }
                        sb.append(readLine + "\n");
                    }
                    this.f11660c = sb.toString();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                        C3954p.m16437a(bufferedReader);
                    } catch (Throwable th3) {
                        C3954p.m16437a(bufferedReader);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                C3954p.m16437a(bufferedReader);
            }
            C3954p.m16437a(bufferedReader);
        }
    }
}
