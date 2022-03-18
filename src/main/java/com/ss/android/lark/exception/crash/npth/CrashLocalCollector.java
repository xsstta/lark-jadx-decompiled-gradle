package com.ss.android.lark.exception.crash.npth;

import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.component.metriclogger.C24343e;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.metriclogger.p1091a.AbstractC24335a;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.log.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CrashLocalCollector {

    /* renamed from: a */
    private static String f95126a = "CrashTreadName";

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* renamed from: com.ss.android.lark.exception.crash.npth.CrashLocalCollector$b */
    public static class C37019b {

        /* renamed from: a */
        public static final CrashLocalCollector f95132a = new CrashLocalCollector();
    }

    private CrashLocalCollector() {
    }

    /* renamed from: a */
    public static CrashLocalCollector m146053a() {
        return C37019b.f95132a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.exception.crash.npth.CrashLocalCollector$a */
    public class C37018a {

        /* renamed from: a */
        String f95127a;

        /* renamed from: b */
        String f95128b;

        /* renamed from: c */
        String f95129c;

        /* renamed from: d */
        int f95130d;

        /* renamed from: a */
        public void mo136545a() {
            CrashLocalCollector.this.mo136543a(this);
        }

        public C37018a(int i, String str, String str2) {
            String str3;
            this.f95130d = i;
            this.f95127a = str;
            this.f95128b = str2;
            long currentTimeMillis = System.currentTimeMillis();
            String a = C26279i.m95153a(new Date(), "yyyy-MM-dd HH:mm:ss");
            if (i == 1) {
                str3 = "nativeCrash-";
            } else if (i != 2) {
                str3 = "";
            } else {
                str3 = "javaCrash-";
            }
            this.f95129c = str3 + a + "-" + currentTimeMillis + ".log";
        }
    }

    /* renamed from: b */
    public void mo136544b() {
        AbstractC24335a a = C24343e.m88858a();
        if (a != null) {
            a.metric(C24341b.m88853a(4, -1, 0)).mo87079a();
        }
    }

    /* renamed from: a */
    private static void m146054a(Closeable... closeableArr) {
        if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th) {
                        Log.m165379d("CrashLocalCollector", th.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo136543a(C37018a aVar) {
        Throwable th;
        Exception e;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(aVar.f95128b);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(aVar.f95128b + aVar.f95129c);
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                fileOutputStream2.write(aVar.f95127a.getBytes());
                m146054a(fileOutputStream2);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.m165386e("an error occured while writing file...", e);
                    m146054a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    m146054a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                m146054a(fileOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Log.m165386e("an error occured while writing file...", e);
            m146054a(fileOutputStream);
        }
    }

    /* renamed from: a */
    public C37018a mo136541a(Context context, String str, String str2, String str3) {
        Log.m165383e("CrashLocalCollector", "native crash occurs! " + str);
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        hashMap.put("update_version_code", Integer.valueOf(C26246a.m94979c(context)));
        hashMap.put("version_code", Integer.valueOf(C26246a.m94978b(context)));
        hashMap.put("app_version", C26246a.m94977a(context));
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            sb.append((String) entry.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(value.toString());
            sb.append("\n");
        }
        sb.append(f95126a);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(str2);
        sb.append("\n");
        sb.append(str);
        sb.append("\n");
        mo136544b();
        return new C37018a(1, sb.toString(), str3);
    }

    /* renamed from: a */
    public C37018a mo136542a(Context context, Throwable th, String str, String str2) {
        Log.m165383e("CrashLocalCollector", "java crash occurs! " + th.getMessage());
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        hashMap.put("update_version_code", Integer.valueOf(C26246a.m94979c(context)));
        hashMap.put("version_code", Integer.valueOf(C26246a.m94978b(context)));
        hashMap.put("app_version", C26246a.m94977a(context));
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        sb.append(stringWriter.toString());
        sb.append(f95126a);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(str);
        sb.append("\n");
        sb.append(th);
        sb.append("\n");
        mo136544b();
        return new C37018a(2, sb.toString(), str2);
    }
}
