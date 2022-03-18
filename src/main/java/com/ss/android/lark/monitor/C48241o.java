package com.ss.android.lark.monitor;

import android.text.TextUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/* renamed from: com.ss.android.lark.monitor.o */
public class C48241o {

    /* renamed from: a */
    private String f121451a;

    /* renamed from: b */
    private String f121452b;

    /* renamed from: c */
    private long f121453c;

    /* renamed from: d */
    private String f121454d;

    /* renamed from: e */
    private SimpleDateFormat f121455e;

    /* renamed from: a */
    private String m190366a() {
        if (System.currentTimeMillis() > this.f121453c || TextUtils.isEmpty(this.f121454d)) {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            instance.add(5, 1);
            this.f121453c = instance.getTimeInMillis();
            if (this.f121455e == null) {
                this.f121455e = new SimpleDateFormat("yyyy-MM-dd");
            }
            String str = this.f121451a + File.separator + this.f121455e.format(new Date()) + "-" + this.f121452b + ".txt";
            File file = new File(this.f121451a);
            if (!file.exists()) {
                file.mkdirs();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 15) {
                List asList = Arrays.asList(listFiles);
                Collections.sort(asList, new Comparator<File>() {
                    /* class com.ss.android.lark.monitor.C48241o.C482421 */

                    /* renamed from: a */
                    public int compare(File file, File file2) {
                        return file.getName().compareTo(file2.getName());
                    }
                });
                ((File) asList.get(0)).delete();
            }
            this.f121454d = str;
        }
        return this.f121454d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[SYNTHETIC, Splitter:B:20:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo168798a(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.m190366a()     // Catch:{ Exception -> 0x001f }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ Exception -> 0x001f }
            r3 = 1
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x001f }
            r2.write(r5)     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            java.lang.String r5 = "\n"
            r2.write(r5)     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            r2.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x002d
        L_0x0017:
            r5 = move-exception
            r0 = r2
            goto L_0x002e
        L_0x001a:
            r5 = move-exception
            r0 = r2
            goto L_0x0020
        L_0x001d:
            r5 = move-exception
            goto L_0x002e
        L_0x001f:
            r5 = move-exception
        L_0x0020:
            r5.printStackTrace()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x002d
            r0.close()
            goto L_0x002d
        L_0x0029:
            r5 = move-exception
            r5.printStackTrace()
        L_0x002d:
            return
        L_0x002e:
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0038:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.monitor.C48241o.mo168798a(java.lang.String):void");
    }

    public C48241o(String str, String str2) {
        this.f121451a = str;
        this.f121452b = str2;
    }
}
