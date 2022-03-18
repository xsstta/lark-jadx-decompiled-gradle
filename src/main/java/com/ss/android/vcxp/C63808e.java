package com.ss.android.vcxp;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.p3186c.C63803b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* renamed from: com.ss.android.vcxp.e */
public class C63808e {

    /* renamed from: a */
    public static boolean f161019a;

    /* renamed from: b */
    private static FileLock f161020b;

    /* renamed from: c */
    private static FileInputStream f161021c;

    /* renamed from: d */
    private static FileOutputStream f161022d;

    /* renamed from: c */
    private static void m250522c() {
        try {
            FileInputStream fileInputStream = f161021c;
            if (fileInputStream != null) {
                fileInputStream.close();
                f161021c = null;
            }
            FileLock fileLock = f161020b;
            if (fileLock != null) {
                fileLock.release();
                f161020b = null;
            }
            FileOutputStream fileOutputStream = f161022d;
            if (fileOutputStream != null) {
                fileOutputStream.close();
                f161022d = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m250521b() {
        try {
            File file = new File(LarkContext.getApplication().getFilesDir() + "/" + "XRunningMode");
            if (file.exists()) {
                f161021c = new FileInputStream(file);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            f161022d = fileOutputStream;
            f161020b = fileOutputStream.getChannel().lock();
        } catch (Exception e) {
            m250522c();
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Boolean m250518a() {
        String str;
        String str2;
        String str3;
        m250521b();
        if (f161021c == null) {
            C60700b.m235854c("XRunningMode", "[getEnabled]", "fis=null");
            return null;
        }
        try {
            Properties properties = new Properties();
            properties.load(f161021c);
            String a = C63803b.m250505a(LarkContext.getApplication());
            C60700b.m235854c("XRunningMode", "[getEnabled2]", "currentProcessName=" + a);
            if (XProcess.Main.value().equals(a)) {
                str = XProcess.VC.value();
            } else {
                str = XProcess.Main.value();
            }
            C60700b.m235854c("XRunningMode", "[getEnabled3]", "theOtherProcessName=" + str);
            String property = properties.getProperty(str + "VCInfo");
            C60700b.m235854c("XRunningMode", "[getEnabled4]", "vcInfo=" + property);
            if (TextUtils.isEmpty(property)) {
                C60700b.m235854c("XRunningMode", "[getEnabled5]", "empty");
                return null;
            }
            String[] split = property.split(",");
            if (split == null || split.length <= 0) {
                str2 = "";
            } else {
                str2 = split[0];
            }
            if (split == null || split.length <= 1) {
                str3 = "false";
            } else {
                str3 = split[1];
            }
            Boolean a2 = m250519a(str2);
            if (a2 == null) {
                C60700b.m235854c("XRunningMode", "[getEnabled6]", "unknown=" + str2);
                return false;
            } else if (a2.booleanValue()) {
                Boolean valueOf = Boolean.valueOf("true".equals(str3));
                if (valueOf.booleanValue() && XProcess.Main.value().equals(a)) {
                    f161019a = true;
                }
                C60700b.m235854c("XRunningMode", "[getEnabled7]", valueOf + ContainerUtils.KEY_VALUE_DELIMITER + str2);
                return valueOf;
            } else {
                C60700b.m235854c("XRunningMode", "[getEnabled8]", "dead=" + str2);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C60700b.m235854c("XRunningMode", "[getEnabled9]", "failed");
            return null;
        }
    }

    /* renamed from: a */
    public static void m250520a(Boolean bool) {
        if (f161022d == null) {
            m250521b();
        }
        try {
            String a = C63803b.m250505a(LarkContext.getApplication());
            C60700b.m235854c("XRunningMode", "[setEnabled]", "currentProcessName=" + a);
            Properties properties = new Properties();
            int myPid = Process.myPid();
            properties.setProperty(a + "VCInfo", myPid + "," + bool);
            C60700b.m235854c("XRunningMode", "[setEnabled2", bool + ContainerUtils.KEY_VALUE_DELIMITER + myPid);
            properties.store(f161022d, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        m250522c();
    }

    /* renamed from: a */
    private static Boolean m250519a(String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) LarkContext.getApplication().getSystemService("activity");
            if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.size() <= 0)) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (it.hasNext()) {
                    if ((it.next().pid + "").equals(str)) {
                        C60700b.m235854c("XRunningMode", "[isProcessAlive]", "true=" + str);
                        return true;
                    }
                }
                C60700b.m235854c("XRunningMode", "[isProcessAlive2]", "false=" + str);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C60700b.m235854c("XRunningMode", "[isProcessAlive3]", "failed");
        return null;
    }
}
