package com.huawei.hms.hatool;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.secure.android.common.p1021a.p1023b.AbstractC23805a;
import com.huawei.secure.android.common.p1021a.p1026d.C23808a;
import com.huawei.secure.android.common.p1021a.p1026d.C23809b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.io.IOException;

public class c0 {

    /* renamed from: a */
    public String f58180a = AbstractC23596b.m85619f().getFilesDir().getPath();

    /* renamed from: b */
    public static boolean m85646b(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    C23625y.m85977c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                m85646b(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: d */
    public static boolean m85647d() {
        return m85646b(new File(AbstractC23596b.m85619f().getFilesDir().getPath() + "/" + "hms"));
    }

    /* renamed from: a */
    public String mo82966a() {
        String str;
        String str2;
        String str3;
        String str4;
        String c = mo82973c();
        if (mo82972b()) {
            C23625y.m85977c("hmsSdk", "refresh components");
            str = C23808a.m87019b(SmActions.ACTION_ONTHECALL_EXIT);
            mo82968a("aprpap", str);
            str2 = C23808a.m87019b(SmActions.ACTION_ONTHECALL_EXIT);
            mo82968a("febdoc", str2);
            str3 = C23808a.m87019b(SmActions.ACTION_ONTHECALL_EXIT);
            mo82968a("marfil", str3);
            str4 = C23808a.m87019b(SmActions.ACTION_ONTHECALL_EXIT);
            mo82968a("maywnj", str4);
            g0.m85723b(AbstractC23596b.m85619f(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            str = mo82971b("aprpap");
            str2 = mo82971b("febdoc");
            str3 = mo82971b("marfil");
            str4 = mo82971b("maywnj");
        }
        return C23809b.m87022a(AbstractC23805a.m87006a(mo82970a(str, str2, str3, c), C23809b.m87023a(str4), HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 16));
    }

    /* renamed from: a */
    public final String mo82967a(String str) {
        return this.f58180a + "/hms/component/".replace("component", str);
    }

    /* renamed from: a */
    public final void mo82968a(String str, String str2) {
        File file = new File(mo82967a(str));
        String a = mo82967a(str);
        File file2 = new File(a, "hianalytics_" + str);
        if (!file.exists() && file.mkdirs()) {
            C23625y.m85977c("hmsSdk", "file directory is mkdirs");
        }
        if (mo82969a(file2)) {
            r0.m85906a(file2, str2);
        } else {
            C23625y.m85982f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    /* renamed from: a */
    public final boolean mo82969a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            C23625y.m85982f("hmsSdk", "create new file error!");
            return false;
        }
    }

    /* renamed from: a */
    public final char[] mo82970a(String str, String str2, String str3, String str4) {
        byte[] a = C23809b.m87023a(str);
        byte[] a2 = C23809b.m87023a(str2);
        byte[] a3 = C23809b.m87023a(str3);
        byte[] a4 = C23809b.m87023a(str4);
        int length = a.length;
        if (length > a2.length) {
            length = a2.length;
        }
        if (length > a3.length) {
            length = a3.length;
        }
        if (length > a4.length) {
            length = a4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((a[i] ^ a2[i]) ^ a3[i]) ^ a4[i]);
        }
        return cArr;
    }

    /* renamed from: b */
    public final String mo82971b(String str) {
        String a = mo82967a(str);
        File file = new File(a, "hianalytics_" + str);
        if (mo82969a(file)) {
            return r0.m85903a(file);
        }
        String b = C23808a.m87019b(SmActions.ACTION_ONTHECALL_EXIT);
        r0.m85906a(file, b);
        return b;
    }

    /* renamed from: b */
    public final boolean mo82972b() {
        long a = g0.m85718a(AbstractC23596b.m85619f(), "Privacy_MY", "assemblyFlash", -1);
        if (-1 != a) {
            return System.currentTimeMillis() - a > 31536000000L;
        }
        C23625y.m85977c("hmsSdk", "First init components");
        return true;
    }

    /* renamed from: c */
    public final String mo82973c() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }
}
