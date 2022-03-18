package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3954p;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.NativeTools;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.crash.nativecrash.j */
public class C3818j {

    /* renamed from: k */
    private static final Pattern f11723k = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: l */
    private static final Pattern f11724l = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: m */
    private static final Pattern f11725m = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: n */
    private static final Pattern f11726n = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: o */
    private static final Pattern f11727o = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a */
    private String f11728a;

    /* renamed from: b */
    private String f11729b;

    /* renamed from: c */
    private String f11730c;

    /* renamed from: d */
    private String f11731d;

    /* renamed from: e */
    private String f11732e;

    /* renamed from: f */
    private String f11733f;

    /* renamed from: g */
    private String f11734g;

    /* renamed from: h */
    private boolean f11735h;

    /* renamed from: i */
    private final Map<String, String> f11736i = new HashMap();

    /* renamed from: j */
    private final Set<String> f11737j = new HashSet();

    /* renamed from: a */
    public String mo15340a() {
        return this.f11731d;
    }

    /* renamed from: b */
    public boolean mo15343b() {
        return this.f11735h;
    }

    /* renamed from: c */
    public String mo15344c() {
        return this.f11732e;
    }

    /* renamed from: d */
    public String mo15345d() {
        return this.f11734g;
    }

    /* renamed from: e */
    public String mo15346e() {
        return this.f11733f;
    }

    /* renamed from: f */
    public Map<String, String> mo15347f() {
        return this.f11736i;
    }

    /* renamed from: g */
    public String mo15348g() {
        StringBuilder sb = new StringBuilder();
        String str = this.f11732e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f11733f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f11734g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void mo15342b(File file) {
        m15798c(C3962t.m16492c(file));
    }

    public C3818j(File file) {
        m15798c(C3962t.m16492c(file));
    }

    /* renamed from: a */
    public void mo15341a(File file) {
        File c = C3962t.m16492c(file);
        if (c.exists()) {
            c.renameTo(new File(c.getAbsoluteFile() + ".old"));
        }
        NativeImpl.m15684a(file);
        m15798c(C3962t.m16492c(file));
    }

    /* renamed from: a */
    public static String[] m15797a(String str) {
        int lastIndexOf;
        String[] split = str.split("\\s+");
        String[] strArr = {"", ""};
        if (split.length >= 4) {
            String str2 = null;
            for (String str3 : split) {
                if (str3.startsWith("/") && str3.endsWith(".so")) {
                    str2 = str3;
                }
            }
            if (!TextUtils.isEmpty(str2) && str2.endsWith(".so") && !str2.contains("/system/lib") && (lastIndexOf = str2.lastIndexOf(47)) != -1) {
                int i = lastIndexOf + 1;
                String substring = str2.substring(i);
                if (substring.contains(".apk!")) {
                    substring = substring.substring(substring.indexOf(".apk!") + 5);
                }
                strArr[0] = substring;
                strArr[1] = str2.substring(0, i) + substring;
                return strArr;
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m15799d(File file) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f11737j) {
            if (!TextUtils.isEmpty(str)) {
                String name = new File(str).getName();
                if (!this.f11736i.containsKey(name)) {
                    String j = NativeTools.m16236b().mo15622j(str);
                    if (!TextUtils.isEmpty(j)) {
                        this.f11736i.put(name, j);
                        arrayList.add("    " + str + " (BuildId: " + j + ")");
                        StringBuilder sb = new StringBuilder();
                        sb.append("getBuildId nextStart: ");
                        sb.append(str);
                        sb.append(" : ");
                        sb.append(this.f11736i.get(name));
                        C3968x.m16530a((Object) sb.toString());
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            C3949m.m16407a(file.getAbsolutePath(), "build id:", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    /* renamed from: c */
    private void m15798c(File file) {
        Throwable th;
        if (file.exists() && file.length() != 0) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null || i2 >= 64) {
                            break;
                        }
                        if (this.f11728a == null && readLine.startsWith("pid: ")) {
                            Matcher matcher = f11723k.matcher(readLine);
                            if (matcher.find() && matcher.groupCount() == 4) {
                                this.f11728a = matcher.group(1);
                                this.f11729b = matcher.group(2);
                                this.f11731d = matcher.group(3);
                                this.f11730c = matcher.group(4);
                            }
                        } else if (this.f11732e == null && readLine.startsWith("signal ")) {
                            Matcher matcher2 = f11724l.matcher(readLine);
                            if (matcher2.find() && matcher2.groupCount() == 3) {
                                String replace = matcher2.group(1).replace(" ", "");
                                String replace2 = matcher2.group(2).replace(" ", "");
                                int indexOf = replace2.indexOf("frompid");
                                if (indexOf > 0) {
                                    replace2 = replace2.substring(0, indexOf) + ")";
                                }
                                this.f11732e = "Signal " + replace + ", Code " + replace2 + "\n";
                            }
                        } else if (this.f11733f == null && readLine.startsWith("Abort ")) {
                            Matcher matcher3 = f11725m.matcher(readLine);
                            if (matcher3.find() && matcher3.groupCount() == 1) {
                                this.f11733f = "abort message: " + matcher3.group(1) + "\n";
                            }
                        } else if (this.f11733f == null && readLine.startsWith("Crash ")) {
                            Matcher matcher4 = f11726n.matcher(readLine);
                            if (matcher4.find() && matcher4.groupCount() == 1) {
                                this.f11733f = "crash message: " + matcher4.group(1) + "\n";
                            }
                        } else if (this.f11734g == null && readLine.startsWith("backtrace:")) {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine2 = bufferedReader2.readLine();
                                if (readLine2 == null || !readLine2.startsWith("    #")) {
                                    i2++;
                                    this.f11734g = sb.toString();
                                } else {
                                    String substring = readLine2.substring(4);
                                    sb.append(substring);
                                    sb.append('\n');
                                    String[] a = m15797a(substring);
                                    if (a != null) {
                                        this.f11737j.add(a[1]);
                                    }
                                }
                            }
                            i2++;
                            this.f11734g = sb.toString();
                        } else if (this.f11736i.isEmpty() && readLine.startsWith("build id:")) {
                            while (true) {
                                String readLine3 = bufferedReader2.readLine();
                                if (readLine3 == null) {
                                    break;
                                } else if (!readLine3.contains("BuildId:")) {
                                    while (true) {
                                        if (i >= 10 || readLine3 == null) {
                                            break;
                                        } else if (readLine3.startsWith("stack:")) {
                                            this.f11735h = true;
                                            break;
                                        } else {
                                            readLine3 = bufferedReader2.readLine();
                                            i++;
                                        }
                                    }
                                } else {
                                    Matcher matcher5 = f11727o.matcher(readLine3);
                                    if (matcher5.find()) {
                                        this.f11736i.put(matcher5.group(2), matcher5.group(3));
                                    }
                                }
                            }
                            C3968x.m16530a((Object) "check complete end buildIds");
                        }
                        i2++;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        try {
                            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                        } finally {
                            C3954p.m16437a(bufferedReader);
                        }
                    }
                }
                C3968x.m16530a((Object) "check complete end");
                C3954p.m16437a(bufferedReader2);
                m15799d(file);
                C3954p.m16437a(bufferedReader2);
            } catch (Throwable th3) {
                th = th3;
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }
}
