package com.bytedance.ee.bear.doc.resupdate;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.n */
public class C5483n {
    /* renamed from: a */
    private static void m22261a(List<File> list) {
        if (!(list == null || list.isEmpty())) {
            C13479a.m54764b("ResUtil", "clearRedundancyFiles(): size == " + list.size());
            ArrayList arrayList = new ArrayList();
            for (File file : list) {
                File file2 = new File(file.getAbsolutePath() + "_del");
                if (file.renameTo(file2)) {
                    arrayList.add(file2);
                } else {
                    C13479a.m54775e("ResUtil", "getLatestResourceVersion: rename failed origin file = " + file);
                }
            }
            m22271c(arrayList);
        }
    }

    /* renamed from: a */
    private static void m22258a(Context context, File[] fileArr, List<File> list, List<File> list2) {
        for (File file : fileArr) {
            if (m22262a(file.getName())) {
                list.add(file);
            } else if (!file.getName().contains("_sim") && !file.getName().contains("_temp") && !file.getName().contains(context.getString(R.string.config_gecko_channel)) && !file.getName().contains("gray") && !file.getName().contains("specific")) {
                list2.add(file);
            }
        }
    }

    /* renamed from: a */
    private static void m22259a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C13479a.m54761a("ResUtil", e);
            }
        }
    }

    /* renamed from: b */
    public static File m22264b(Context context) throws IOException {
        return m22270c(new File(m22254a(context), "space_downloadX"));
    }

    /* renamed from: a */
    public static boolean m22262a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches("^\\d+\\.\\d+\\.\\d+\\.\\d+$", str);
    }

    /* renamed from: c */
    private static void m22271c(final List<File> list) {
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.doc.resupdate.C5483n.C54852 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                for (File file : list) {
                    C13479a.m54764b("ResUtil", "deleteExtraResource(): del = " + file);
                    C13675f.m55527d(file);
                }
            }
        }, $$Lambda$n$5ebwUlIOqaK4HB9N4V77zA6eTlU.INSTANCE);
    }

    /* renamed from: b */
    private static String m22266b(BufferedReader bufferedReader) {
        if (bufferedReader == null) {
            return null;
        }
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.startsWith(HiAnalyticsConstant.HaKey.BI_KEY_VERSION)) {
                    String[] split = readLine.split(":");
                    if (split.length == 2) {
                        String str = split[1];
                        m22259a((Closeable) bufferedReader);
                        return str;
                    }
                }
            } catch (IOException e) {
                C13479a.m54761a("ResUtil", e);
            } catch (Throwable th) {
                m22259a((Closeable) bufferedReader);
                throw th;
            }
        }
        m22259a((Closeable) bufferedReader);
        return null;
    }

    /* renamed from: b */
    public static C5487q m22263b(File file) {
        try {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if ("current_revision".equals(file2.getName())) {
                    return m22253a(new BufferedReader(new InputStreamReader(new FileInputStream(file2))));
                }
            }
            return new C5487q();
        } catch (FileNotFoundException e) {
            C13479a.m54759a("ResUtil", "getResourceRevision fail", e);
            return new C5487q();
        }
    }

    /* renamed from: c */
    public static C5487q m22268c(Context context) {
        Throwable th;
        Exception e;
        ZipInputStream zipInputStream = null;
        try {
            ZipInputStream zipInputStream2 = new ZipInputStream(context.getAssets().open("eesz.zip"));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry == null) {
                        m22259a(zipInputStream2);
                        break;
                    } else if (!nextEntry.isDirectory()) {
                        if (!TextUtils.isEmpty(nextEntry.getName()) && nextEntry.getName().contains("../")) {
                            C13479a.m54758a("ResUtil", "getOfflineResAssetInfo: zip name inValid, cause contains ../");
                            C5487q qVar = new C5487q();
                            m22259a(zipInputStream2);
                            return qVar;
                        } else if (TextUtils.equals("current_revision", nextEntry.getName())) {
                            C5487q a = m22253a(new BufferedReader(new InputStreamReader(zipInputStream2)));
                            m22259a(zipInputStream2);
                            return a;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    zipInputStream = zipInputStream2;
                    try {
                        C13479a.m54761a("ResUtil", e);
                        m22259a(zipInputStream);
                        return new C5487q();
                    } catch (Throwable th2) {
                        th = th2;
                        m22259a(zipInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zipInputStream = zipInputStream2;
                    m22259a(zipInputStream);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            C13479a.m54761a("ResUtil", e);
            m22259a(zipInputStream);
            return new C5487q();
        }
        return new C5487q();
    }

    /* renamed from: a */
    private static C5487q m22253a(BufferedReader bufferedReader) {
        C5487q qVar = new C5487q();
        if (bufferedReader != null) {
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith(HiAnalyticsConstant.HaKey.BI_KEY_VERSION)) {
                        String[] split = readLine.split(":");
                        if (split.length == 2) {
                            qVar.mo21920b(split[1]);
                        }
                    }
                    if (readLine.startsWith("revision")) {
                        String[] split2 = readLine.split(":");
                        if (split2.length == 2) {
                            qVar.mo21918a(split2[1]);
                        }
                    }
                    if (readLine.startsWith("is_slim")) {
                        String[] split3 = readLine.split(":");
                        if (split3.length == 2) {
                            qVar.mo21919a("1".equals(split3[1]));
                        }
                    }
                    if (readLine.startsWith("full_pkg_scm_version")) {
                        String[] split4 = readLine.split(":");
                        if (split4.length == 2) {
                            qVar.mo21927e(split4[1]);
                        }
                    }
                    if (readLine.startsWith("full_pkg_url_home")) {
                        qVar.mo21923c(readLine.substring(readLine.indexOf(":") + 1));
                    }
                    if (readLine.startsWith("full_pkg_url_oversea")) {
                        qVar.mo21925d(readLine.substring(readLine.indexOf(":") + 1));
                    }
                } catch (IOException e) {
                    C13479a.m54761a("ResUtil", e);
                } catch (Throwable th) {
                    m22259a((Closeable) bufferedReader);
                    throw th;
                }
            }
            m22259a((Closeable) bufferedReader);
        }
        return qVar;
    }

    /* renamed from: b */
    private static void m22267b(List<File> list) {
        Collections.sort(list, new Comparator<File>() {
            /* class com.bytedance.ee.bear.doc.resupdate.C5483n.C54841 */

            /* renamed from: a */
            public int compare(File file, File file2) {
                return C5483n.m22252a(file2.getName(), file.getName());
            }
        });
    }

    /* renamed from: c */
    private static File m22270c(File file) throws IOException {
        if (file.exists()) {
            if (file.isFile()) {
                boolean delete = file.delete();
                C13479a.m54764b("ResUtil", "getResourceRootDir(): delete file result = " + delete + ",file = " + file);
                if (delete && !file.mkdir()) {
                    throw new IOException("spaceRes mkdir() false " + file);
                }
            }
        } else if (!file.mkdir()) {
            throw new IOException("spaceRes mkdir() false file = " + file);
        }
        return file;
    }

    /* renamed from: a */
    static File m22254a(Context context) {
        File file;
        if (((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("offline_support_change_resource", Boolean.FALSE)).booleanValue()) {
            file = new File(CCMStorage.m21716c(context, Biz.DYNAMIC));
        } else {
            file = new File(CCMStorage.m21714b(context, Biz.DYNAMIC));
        }
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            }
            file.mkdirs();
        } else {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static String m22257a(File file) {
        File file2 = new File(file, "current_revision");
        if (!file2.isFile() || !file2.exists()) {
            return "";
        }
        try {
            return m22266b(new BufferedReader(new FileReader(file2)));
        } catch (FileNotFoundException e) {
            C13479a.m54761a("ResUtil", e);
            return "";
        }
    }

    /* renamed from: d */
    static String m22272d(Context context, String str) {
        return m22256a(context, str, false);
    }

    /* renamed from: c */
    public static File m22269c(Context context, String str) throws IOException {
        return m22270c(new File(m22255a(context, str), "specific"));
    }

    /* renamed from: b */
    public static File m22265b(Context context, String str) throws IOException {
        return m22270c(new File(m22255a(context, str), "gray"));
    }

    /* renamed from: a */
    public static File m22255a(Context context, String str) throws IOException {
        File c = m22270c(new File(m22254a(context), "space_res"));
        if (!TextUtils.isEmpty(str)) {
            return m22270c(new File(c, str));
        }
        C13479a.m54764b("ResUtil", "getResourceRootDir(): channel is empty,return folder spaceRes");
        return c;
    }

    /* renamed from: a */
    static int m22252a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return -2;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.equals(str2)) {
            return 0;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        int i2 = 0;
        while (i < min) {
            i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            if (i2 != 0) {
                break;
            }
            i++;
        }
        if (i2 == 0) {
            for (int i3 = i; i3 < split.length; i3++) {
                if (Integer.parseInt(split[i3]) > 0) {
                    return 1;
                }
            }
            while (i < split2.length) {
                if (Integer.parseInt(split2[i]) > 0) {
                    return -1;
                }
                i++;
            }
            return 0;
        } else if (i2 > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: e */
    static boolean m22273e(Context context, String str) {
        try {
            File[] listFiles = m22255a(context, str).listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file : listFiles) {
                        if (m22262a(file.getName())) {
                            C13479a.m54764b("ResUtil", "hasFullResource(): version is = " + file.getName());
                            return true;
                        }
                    }
                    return false;
                }
            }
            C13479a.m54764b("ResUtil", "hasFullResource(): resourceRootDir is empty");
            return false;
        } catch (IOException e) {
            C13479a.m54759a("ResUtil", "hasFullResource(): failed ", e);
        }
    }

    /* renamed from: a */
    static String m22256a(Context context, String str, boolean z) {
        try {
            File[] listFiles = m22255a(context, str).listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    m22258a(context, listFiles, arrayList, arrayList2);
                    m22267b(arrayList);
                    File file = null;
                    if (arrayList.size() > 0) {
                        file = (File) arrayList.remove(0);
                    }
                    arrayList2.addAll(arrayList);
                    if (z) {
                        m22261a(arrayList2);
                    }
                    if (file == null) {
                        return "";
                    }
                    return file.getName();
                }
            }
            C13479a.m54764b("ResUtil", "getLatestResourceVersion(): resourceRootDir is empty");
            return "";
        } catch (IOException e) {
            C13479a.m54759a("ResUtil", "getLatestResourceVersion(): failed ", e);
            return "";
        }
    }
}
