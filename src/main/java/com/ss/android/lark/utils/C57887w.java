package com.ss.android.lark.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26266d;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.ar;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.ZipOutputStream;

/* renamed from: com.ss.android.lark.utils.w */
public class C57887w {

    /* renamed from: a */
    private static List<String> f142507a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.w$a */
    public static class C57889a {

        /* renamed from: a */
        private File f142508a;

        /* renamed from: b */
        private File f142509b;

        /* renamed from: a */
        public File mo196225a() {
            return this.f142508a;
        }

        /* renamed from: b */
        public File mo196226b() {
            return this.f142509b;
        }

        public C57889a(File file, File file2) {
            this.f142508a = file;
            this.f142509b = file2;
        }
    }

    /* renamed from: a */
    public static void m224670a() {
        Log.flushDiskLog();
    }

    /* renamed from: a */
    private static void m224672a(List<C57889a> list, List<File> list2, int i) {
        if (list2 != null) {
            for (File file : list2) {
                m224671a(list, file, i);
            }
        }
    }

    /* renamed from: a */
    private static boolean m224673a(List<C57889a> list, File file) {
        Throwable th;
        IOException e;
        Exception e2;
        Log.m165389i("JournalUtils", "start doZip");
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file));
            try {
                ar.C26262a aVar = new ar.C26262a();
                for (C57889a aVar2 : list) {
                    if (aVar2.mo196225a().isDirectory()) {
                        aVar.mo93370a(aVar2.mo196225a(), aVar2.mo196226b(), zipOutputStream2, f142507a);
                    } else {
                        aVar.mo93371b(aVar2.mo196225a(), aVar2.mo196226b(), zipOutputStream2, f142507a);
                    }
                }
                C26266d.m95082a(zipOutputStream2);
                return true;
            } catch (IOException e3) {
                e = e3;
                zipOutputStream = zipOutputStream2;
                Log.m165398w("JournalUtils", "IOException when doZip", e);
                C26266d.m95082a(zipOutputStream);
                return false;
            } catch (Exception e4) {
                e2 = e4;
                zipOutputStream = zipOutputStream2;
                try {
                    Log.m165398w("JournalUtils", "Exception when doZip", e2);
                    C26266d.m95082a(zipOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    C26266d.m95082a(zipOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                zipOutputStream = zipOutputStream2;
                C26266d.m95082a(zipOutputStream);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            Log.m165398w("JournalUtils", "IOException when doZip", e);
            C26266d.m95082a(zipOutputStream);
            return false;
        } catch (Exception e6) {
            e2 = e6;
            Log.m165398w("JournalUtils", "Exception when doZip", e2);
            C26266d.m95082a(zipOutputStream);
            return false;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f142507a = arrayList;
        arrayList.add("mmap2");
    }

    /* renamed from: a */
    private static File m224664a(Context context) {
        ArrayList arrayList = new ArrayList(C57890x.m224680a(3000, 3));
        File file = new File(C57881t.m224612K(context) + "recent_logcat.log");
        C57890x.m224682a(arrayList, file);
        return file;
    }

    /* renamed from: a */
    private static List<File> m224669a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C57881t.m224619a(new File(C57881t.m224617a(context, str)), "log"));
        return arrayList;
    }

    /* renamed from: b */
    private static List<File> m224674b(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        List<File> a = C57881t.m224619a(new File(C57881t.m224624b(context, str)), "log");
        Collections.sort(a, new Comparator<File>() {
            /* class com.ss.android.lark.utils.C57887w.C578881 */

            /* renamed from: a */
            public int compare(File file, File file2) {
                boolean z;
                boolean z2;
                if (file == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (file2 == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    return 0;
                }
                if (z) {
                    return -1;
                }
                if (z2) {
                    return 1;
                }
                return file2.getName().compareTo(file.getName());
            }
        });
        if (a.size() > 3) {
            a = a.subList(0, 3);
        }
        arrayList.addAll(a);
        return arrayList;
    }

    /* renamed from: c */
    private static File m224675c(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("device_info", 0).edit();
        edit.putString("device_id", str);
        edit.putString("device_name", RomUtils.m94957l());
        edit.putString("device_os", RomUtils.m94958m());
        edit.putString("channel_name", PackageChannelManager.getBuildPackageChannel(context));
        edit.commit();
        return new File(C57881t.m224650v(context) + "device_info" + ".xml");
    }

    /* renamed from: a */
    private static File m224665a(Context context, String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String a = C57824f.m224459a(context);
        String a2 = C26279i.m95152a("yyyyMMddHHmmss");
        return new File(str + String.format("%1s_Android_%2s_%3s.zip", str2, a, a2));
    }

    /* renamed from: a */
    private static String m224668a(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str)) {
            str4 = str.substring(0, str.indexOf("@"));
        } else {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4;
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        if (TextUtils.isEmpty(str2)) {
            return "Lark";
        }
        return str2;
    }

    /* renamed from: a */
    private static void m224671a(List<C57889a> list, File file, int i) {
        if (file != null && file.exists()) {
            if (file.isFile() && i <= 0) {
                i = 1;
            }
            int i2 = 0;
            File file2 = file;
            while (i2 < i) {
                File parentFile = file2.getParentFile();
                if (parentFile == null) {
                    break;
                }
                i2++;
                file2 = parentFile;
            }
            list.add(new C57889a(file, file2));
        }
    }

    /* renamed from: a */
    private static File m224667a(Context context, List<C57889a> list, String str, String str2, boolean z) {
        Log.m165389i("JournalUtils", "start tryZip. needRetry = " + z);
        File a = m224665a(context, str, str2);
        if (!m224673a(list, a) && z) {
            return m224667a(context, list, str, str2, false);
        }
        return a;
    }

    /* renamed from: a */
    public static File m224666a(Context context, String str, String str2, String str3, String str4, String str5) {
        Log.m165389i("JournalUtils", "start zip");
        ArrayList arrayList = new ArrayList();
        m224671a(arrayList, new File(C57881t.m224616a(context)), 0);
        m224671a(arrayList, new File(C26308n.m95257c(context) + "/rhea/"), 1);
        m224672a(arrayList, m224674b(context, str5), 4);
        m224672a(arrayList, m224669a(context, str5), 3);
        m224671a(arrayList, m224675c(context, str3), 1);
        m224671a(arrayList, m224664a(context), 1);
        return m224667a(context, arrayList, C57881t.m224640l(context), m224668a(str, str2, str4), true);
    }
}
