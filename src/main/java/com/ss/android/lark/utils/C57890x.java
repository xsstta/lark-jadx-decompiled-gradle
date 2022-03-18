package com.ss.android.lark.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26266d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* renamed from: com.ss.android.lark.utils.x */
public class C57890x {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.x$b */
    public static class C57892b extends Thread {

        /* renamed from: a */
        private Process f142512a;

        /* renamed from: b */
        private long f142513b;

        public void run() {
            try {
                sleep(this.f142513b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Process process = this.f142512a;
            if (process != null) {
                process.destroy();
            }
        }

        public C57892b(Process process, long j) {
            this.f142512a = process;
            this.f142513b = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.x$a */
    public static class C57891a extends Thread {

        /* renamed from: a */
        private InputStream f142510a;

        /* renamed from: b */
        private List<String> f142511b;

        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f142510a));
            int i = 327680;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!readLine.startsWith("---------")) {
                        i -= readLine.getBytes("UTF-8").length;
                        if (i < 0) {
                            break;
                        }
                        this.f142511b.add(readLine);
                    }
                } catch (IOException unused) {
                    C26266d.m95082a(bufferedReader);
                    return;
                } catch (Throwable th) {
                    C26266d.m95082a(bufferedReader);
                    throw th;
                }
            }
            C26266d.m95082a(bufferedReader);
        }

        C57891a(InputStream inputStream, List<String> list) {
            this.f142510a = inputStream;
            this.f142511b = list;
        }
    }

    /* renamed from: a */
    private static String m224679a(int i) {
        String[] strArr = {"*:V", "*:D", "*:I", "*:W", "*:E", "*:F"};
        if (i < 0 || i >= 6) {
            return "*:V";
        }
        return strArr[i];
    }

    /* renamed from: a */
    public static void m224682a(List<String> list, File file) {
        m224681a(file, TextUtils.join("\n", list));
    }

    /* renamed from: a */
    private static void m224681a(File file, String str) {
        Throwable th;
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter2 = new FileWriter(file, false);
            try {
                fileWriter2.write(str);
                C26266d.m95082a(fileWriter2);
            } catch (IOException unused) {
                fileWriter = fileWriter2;
                C26266d.m95082a(fileWriter);
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter2;
                C26266d.m95082a(fileWriter);
                throw th;
            }
        } catch (IOException unused2) {
            C26266d.m95082a(fileWriter);
        } catch (Throwable th3) {
            th = th3;
            C26266d.m95082a(fileWriter);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        if (0 == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        r4.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005a, code lost:
        if (r4 != null) goto L_0x0063;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m224680a(int r4, int r5) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.utils.C57890x.m224680a(int, int):java.util.List");
    }
}
