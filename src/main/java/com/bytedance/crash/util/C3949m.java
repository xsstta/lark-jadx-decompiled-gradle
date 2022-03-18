package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.C3748g;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.p221e.C3735d;
import com.bytedance.crash.upload.CrashUploader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.m */
public class C3949m {
    /* renamed from: a */
    public static void m16402a(File file, String str, boolean z) throws IOException {
        Throwable th;
        if (!TextUtils.isEmpty(str)) {
            file.getParentFile().mkdirs();
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.flush();
                    C3954p.m16437a(fileOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    C3954p.m16437a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C3954p.m16437a(fileOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m16405a(File file, JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, z));
                try {
                    C3956r.m16469a(jSONObject, bufferedWriter2);
                    C3954p.m16437a(bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    C3954p.m16437a(bufferedWriter);
                }
            } catch (Throwable unused2) {
                C3954p.m16437a(bufferedWriter);
            }
        }
    }

    /* renamed from: a */
    public static void m16404a(File file, JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, z));
                try {
                    C3956r.m16467a(jSONArray, bufferedWriter2);
                    C3954p.m16437a(bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    C3954p.m16437a(bufferedWriter);
                }
            } catch (Throwable unused2) {
                C3954p.m16437a(bufferedWriter);
            }
        }
    }

    /* renamed from: a */
    public static boolean m16413a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m16412a(new File(str));
    }

    /* renamed from: a */
    public static boolean m16412a(File file) {
        boolean z;
        boolean z2 = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        int i = 0;
        while (listFiles != null && i < listFiles.length) {
            if (!listFiles[i].isFile()) {
                z = m16412a(listFiles[i]);
            } else if (listFiles[i].canWrite()) {
                z = listFiles[i].delete();
            } else {
                z2 = false;
                i++;
            }
            z2 &= z;
            i++;
        }
        return z2 & file.delete();
    }

    /* renamed from: a */
    public static boolean m16414a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* renamed from: a */
    public static boolean m16411a(C3742b bVar, File file) {
        return m16415b(bVar, file) != -1;
    }

    /* renamed from: a */
    public static void m16403a(File file, Map<String, String> map) {
        Throwable th;
        IOException e;
        if (map != null && !map.isEmpty()) {
            FileOutputStream fileOutputStream = null;
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    C3954p.m16437a(fileOutputStream2);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C3968x.m16537b((Throwable) e);
                        C3954p.m16437a(fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C3954p.m16437a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    C3954p.m16437a(fileOutputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                C3968x.m16537b((Throwable) e);
                C3954p.m16437a(fileOutputStream);
            }
        }
    }

    /* renamed from: a */
    public static void m16399a(File file, File file2) {
        m16400a(file, file2, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static void m16400a(File file, File file2, int i) {
        m16401a(file, file2, i, false);
    }

    /* renamed from: a */
    public static void m16401a(File file, File file2, int i, boolean z) {
        FileOutputStream fileOutputStream;
        Throwable th;
        if (file != null && file2 != null && file.exists()) {
            if (!file2.exists() || z) {
                FileInputStream fileInputStream = null;
                try {
                    file2.getParentFile().mkdirs();
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2, z);
                        try {
                            byte[] bArr = new byte[8192];
                            int i2 = 0;
                            do {
                                int read = fileInputStream2.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                i2 += read;
                            } while (i2 < i);
                            C3954p.m16437a(fileInputStream2);
                        } catch (Exception unused) {
                            fileInputStream = fileInputStream2;
                            C3954p.m16437a(fileInputStream);
                            C3954p.m16437a(fileOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            C3954p.m16437a(fileInputStream);
                            C3954p.m16437a(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception unused2) {
                        fileOutputStream = null;
                        fileInputStream = fileInputStream2;
                        C3954p.m16437a(fileInputStream);
                        C3954p.m16437a(fileOutputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        fileInputStream = fileInputStream2;
                        C3954p.m16437a(fileInputStream);
                        C3954p.m16437a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception unused3) {
                    fileOutputStream = null;
                    C3954p.m16437a(fileInputStream);
                    C3954p.m16437a(fileOutputStream);
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                    C3954p.m16437a(fileInputStream);
                    C3954p.m16437a(fileOutputStream);
                    throw th;
                }
                C3954p.m16437a(fileOutputStream);
            }
        }
    }

    /* renamed from: a */
    public static void m16407a(String str, String str2, String[] strArr) {
        try {
            File file = new File(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            File file2 = new File(file.getParent(), file.getName() + ".temp");
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file2));
            int i = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    printWriter.flush();
                    printWriter.close();
                    bufferedReader.close();
                    file.delete();
                    file2.renameTo(file);
                    return;
                } else if (!readLine.equals(str2) || i > 0) {
                    printWriter.println(readLine);
                } else {
                    i++;
                    printWriter.println(readLine);
                    for (String str3 : strArr) {
                        printWriter.println(str3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16406a(OutputStream outputStream, C3951b... bVarArr) throws IOException {
        Throwable th;
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (C3951b bVar : bVarArr) {
                    m16408a(zipOutputStream2, bVar);
                }
                C3954p.m16437a(zipOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                C3954p.m16437a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C3954p.m16437a(zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m16408a(ZipOutputStream zipOutputStream, C3951b bVar) throws IOException {
        if (bVar != null) {
            if (bVar.f12051a != null || bVar.f12052b == null) {
                m16410a(zipOutputStream, bVar.f12051a, bVar.f12053c);
                return;
            }
            for (File file : bVar.f12052b) {
                m16410a(zipOutputStream, file, bVar.f12053c);
            }
        }
    }

    /* renamed from: a */
    private static void m16410a(ZipOutputStream zipOutputStream, File file, boolean z) throws IOException {
        if (file != null && file.exists()) {
            if (z || !file.isDirectory()) {
                File[] listFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        m16409a(zipOutputStream, file2, file2.getName());
                    }
                    return;
                }
                return;
            }
            m16409a(zipOutputStream, file, file.getName());
        }
    }

    /* renamed from: a */
    private static void m16409a(ZipOutputStream zipOutputStream, File file, String str) throws IOException {
        Throwable th;
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
                    String str2 = str.length() == 0 ? "" : str + "/";
                    for (File file2 : listFiles) {
                        m16409a(zipOutputStream, file2, str2 + file2.getName());
                    }
                    return;
                }
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str));
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (-1 != read) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            C3954p.m16437a(fileInputStream2);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    C3954p.m16437a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C3954p.m16437a(fileInputStream);
                throw th;
            }
        }
    }

    /* renamed from: com.bytedance.crash.util.m$a */
    public static class C3950a implements FilenameFilter {

        /* renamed from: a */
        private String f12050a;

        public C3950a(String str) {
            this.f12050a = str;
        }

        public boolean accept(File file, String str) {
            return !str.equals(this.f12050a);
        }
    }

    /* renamed from: c */
    public static String m16421c(String str) throws IOException {
        return m16396a(str, "\n");
    }

    /* renamed from: d */
    public static String m16425d(File file) {
        try {
            return m16426e(file);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m16426e(File file) throws IOException {
        return m16392a(file, "\n");
    }

    /* renamed from: b */
    public static JSONArray m16417b(File file) throws IOException {
        return m16397a(file, -1);
    }

    /* renamed from: b */
    public static JSONArray m16418b(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m16397a(new File(str), -1);
    }

    /* renamed from: c */
    public static boolean m16423c(File file) {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static C3748g m16424d(String str) {
        try {
            String c = m16421c(str);
            if (c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c);
            C3748g gVar = new C3748g();
            gVar.mo15259a(jSONObject.optString("url"));
            gVar.mo15261a(jSONObject.optJSONObject("body"));
            gVar.mo15264b(jSONObject.optString("dump_file"));
            gVar.mo15262a(jSONObject.optBoolean("encrypt", false));
            return gVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static int m16428g(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            return NativeTools.m16236b().mo15611e(file2.getAbsolutePath());
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return -1;
        }
    }

    /* renamed from: h */
    public static boolean m16429h(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int e = NativeTools.m16236b().mo15611e(file.getAbsolutePath());
            if (e <= 0) {
                return true;
            }
            NativeTools.m16236b().mo15599b(e);
            return false;
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return false;
        }
    }

    /* renamed from: i */
    public static void m16430i(File file) {
        try {
            file.createNewFile();
        } catch (Throwable th) {
            C3968x.m16537b(th);
            C3968x.m16530a((Object) ("err create file " + file.getAbsolutePath()));
        }
    }

    /* renamed from: f */
    public static Map<String, String> m16427f(File file) {
        Throwable th;
        IOException e;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                Set<String> stringPropertyNames = properties.stringPropertyNames();
                HashMap hashMap = new HashMap();
                for (String str : stringPropertyNames) {
                    hashMap.put(str, properties.getProperty(str));
                }
                C3954p.m16437a(fileInputStream);
                return hashMap;
            } catch (IOException e2) {
                e = e2;
                try {
                    C3968x.m16537b((Throwable) e);
                    C3954p.m16437a(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    C3954p.m16437a(fileInputStream2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
            C3968x.m16537b((Throwable) e);
            C3954p.m16437a(fileInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C3954p.m16437a(fileInputStream2);
            throw th;
        }
    }

    /* renamed from: j */
    private static C3742b m16431j(File file) {
        C3742b a = m16390a(new File(file, "logEventStack"), file.getName().contains("oom"));
        m16415b(a, file);
        JSONObject optJSONObject = a.mo15252e().optJSONObject("header");
        C3742b a2 = Header.m15399a(a.mo15252e().optString("process_name"), C3774m.m15609j(), a.mo15252e().optLong("app_start_time", 0), a.mo15252e().optLong("crash_time", 0));
        if (optJSONObject == null) {
            a.mo15239a(a2.mo15253f().mo15227f());
        } else {
            C3955q.m16449a(optJSONObject, a2.mo15253f().mo15227f());
        }
        C3955q.m16449a(a.mo15254g(), a2.mo15254g());
        return a;
    }

    /* renamed from: a */
    public static void m16398a(int i) {
        NativeTools.m16236b().mo15599b(i);
    }

    /* renamed from: com.bytedance.crash.util.m$b */
    public static class C3951b {

        /* renamed from: a */
        public File f12051a;

        /* renamed from: b */
        public File[] f12052b;

        /* renamed from: c */
        public boolean f12053c;

        public C3951b(File file, boolean z) {
            this.f12051a = file;
            this.f12053c = z;
        }

        public C3951b(File[] fileArr, boolean z) {
            this.f12052b = fileArr;
            this.f12053c = z;
        }
    }

    /* renamed from: a */
    public static String m16392a(File file, String str) throws IOException {
        return m16393a(file, str, -1);
    }

    /* renamed from: b */
    public static String m16416b(File file, long j) throws IOException {
        return m16393a(file, "\n", j);
    }

    /* renamed from: c */
    public static void m16422c(File file, File file2) {
        m16401a(file, file2, Integer.MAX_VALUE, true);
    }

    /* renamed from: a */
    public static String m16396a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m16392a(new File(str), str2);
    }

    /* renamed from: b */
    public static JSONArray m16419b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (!(str == null || str2 == null)) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static C3748g m16391a(File file, CrashType crashType) {
        String str;
        C3742b j = m16431j(file);
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject = j.mo15252e().optJSONObject("header");
        if (optJSONObject.optString("unique_key", null) == null) {
            try {
                optJSONObject.put("unique_key", "android_" + C3774m.m15603d().mo15504a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        C3748g gVar = new C3748g();
        if (crashType == CrashType.LAUNCH) {
            str = CrashUploader.m16106d();
        } else {
            str = CrashUploader.m16100b();
        }
        gVar.mo15259a(CrashUploader.m16088a(str, optJSONObject));
        gVar.mo15261a(j.mo15252e());
        gVar.mo15262a(CrashUploader.m16090a());
        return gVar;
    }

    /* renamed from: b */
    public static int m16415b(C3742b bVar, File file) {
        int i = -1;
        for (int i2 = 0; i2 < C3735d.m15389a(); i2++) {
            File a = C3962t.m16484a(file, "." + i2);
            if (a.exists()) {
                try {
                    bVar.mo15247c(new JSONObject(m16421c(a.getAbsolutePath())));
                    bVar.mo15241a("succ_step", Integer.valueOf(i2));
                    i = i2;
                } catch (Throwable unused) {
                }
            }
        }
        bVar.mo15235a("succ_step", String.valueOf(i));
        return i;
    }

    /* renamed from: b */
    public static void m16420b(File file, File file2) {
        if (file.exists()) {
            if (file.isFile()) {
                if (file2.exists()) {
                    if (!file2.isDirectory()) {
                        file2.delete();
                    } else {
                        return;
                    }
                }
                m16400a(file, file2, Integer.MAX_VALUE);
                return;
            }
            if (!file2.exists()) {
                file2.mkdirs();
            } else if (file2.isFile()) {
                file2.delete();
            } else if (!file2.getName().equals(file.getName())) {
                return;
            }
            String[] list = file.list();
            for (String str : list) {
                m16420b(new File(file, str), new File(file2, str));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0117, code lost:
        if (r18 != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r18 != false) goto L_0x011b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.entity.C3742b m16390a(java.io.File r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C3949m.m16390a(java.io.File, boolean):com.bytedance.crash.entity.b");
    }

    /* renamed from: a */
    public static JSONArray m16397a(File file, long j) throws IOException {
        Throwable th;
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    C3954p.m16437a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    C3954p.m16437a(bufferedReader2);
                    return jSONArray;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            C3954p.m16437a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m16393a(File file, String str, long j) throws IOException {
        Throwable th;
        if (file == null || !file.exists()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    C3954p.m16437a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    if (!(sb.length() == 0 || str == null)) {
                        sb.append(str);
                    }
                    sb.append(readLine);
                } else {
                    C3954p.m16437a(bufferedReader2);
                    return sb.toString();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            C3954p.m16437a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m16395a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return m16394a(file, str, str2, jSONObject, null, z);
    }

    /* renamed from: a */
    private static String m16394a(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z);
            m16405a(file2, jSONObject2, false);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return file2.getAbsolutePath();
    }
}
