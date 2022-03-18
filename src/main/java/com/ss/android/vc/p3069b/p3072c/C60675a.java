package com.ss.android.vc.p3069b.p3072c;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.vc.apm.VCApmSampleMemInfo;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.p3069b.AbstractC60659a;
import com.ss.android.vc.p3069b.p3073d.C60682b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.vc.b.c.a */
public class C60675a {

    /* renamed from: a */
    private volatile AbstractC60659a f151775a;

    /* renamed from: b */
    private volatile AbstractC60659a f151776b;

    /* renamed from: c */
    private volatile AbstractC60659a f151777c;

    /* renamed from: d */
    private volatile AbstractC60659a f151778d;

    /* renamed from: e */
    private volatile C60679c f151779e;

    /* renamed from: f */
    private final Handler f151780f;

    /* renamed from: g */
    private final Runnable f151781g;

    /* renamed from: h */
    private final List<C60678b> f151782h;

    /* renamed from: i */
    private int f151783i;

    /* renamed from: j */
    private String f151784j;

    /* renamed from: k */
    private final String f151785k;

    /* renamed from: l */
    private boolean f151786l;

    /* renamed from: m */
    private final boolean f151787m;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.b.c.a$a */
    public static class C60677a {

        /* renamed from: a */
        public static final C60675a f151790a = new C60675a(null);
    }

    /* renamed from: a */
    public void mo208234a() {
    }

    /* renamed from: b */
    public void mo208236b() {
    }

    /* renamed from: c */
    public synchronized void mo208237c() {
    }

    /* renamed from: d */
    public synchronized void mo208238d() {
    }

    /* renamed from: e */
    public static C60675a m235774e() {
        return C60677a.f151790a;
    }

    /* renamed from: com.ss.android.vc.b.c.a$1 */
    class RunnableC606761 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f151788a;

        /* renamed from: b */
        final /* synthetic */ C60675a f151789b;

        public void run() {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss", Locale.getDefault());
            File externalCacheDir = ar.m236694a().getExternalCacheDir();
            this.f151789b.mo208235a(new File(externalCacheDir, "apm_" + simpleDateFormat.format(date) + ".log"), this.f151788a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m235775f() {
        if (this.f151786l) {
            this.f151783i++;
            this.f151782h.add(new C60678b(this.f151775a.mo208203a(), (VCApmSampleMemInfo) this.f151776b.mo208203a(), this.f151777c.mo208203a(), (C60682b) this.f151778d.mo208203a()));
        }
    }

    private C60675a() {
        this.f151780f = new Handler(Looper.getMainLooper());
        this.f151781g = new Runnable() {
            /* class com.ss.android.vc.p3069b.p3072c.$$Lambda$a$FT4xSTP_8wkJ6U7Swp9sTdzD6TI */

            public final void run() {
                C60675a.lambda$FT4xSTP_8wkJ6U7Swp9sTdzD6TI(C60675a.this);
            }
        };
        this.f151782h = new LinkedList();
        this.f151783i = 0;
        this.f151786l = false;
        this.f151787m = C26284k.m95185a(ar.m236694a());
        this.f151779e = new C60679c();
        String a = C26246a.m94977a(ar.m236694a());
        this.f151784j = a;
        if (a.contains("-")) {
            String str = this.f151784j;
            this.f151784j = str.substring(0, str.indexOf("-"));
        }
        this.f151785k = C61237h.m238223a().mo210561s();
    }

    /* synthetic */ C60675a(RunnableC606761 r1) {
        this();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053 A[SYNTHETIC, Splitter:B:23:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo208235a(java.io.File r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0009
            r3.delete()
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[saveFile] path = "
            r0.append(r1)
            java.lang.String r1 = r3.getAbsolutePath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "OfflineApmCollector"
            com.ss.android.vc.p3069b.C60686i.m235797a(r1, r0)
            r0 = 0
            r3.createNewFile()     // Catch:{ Exception -> 0x0042 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0042 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0042 }
            byte[] r3 = r4.getBytes()     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r1.write(r3)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r1.flush()     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x003a:
            r3 = move-exception
            r0 = r1
            goto L_0x0051
        L_0x003d:
            r3 = move-exception
            r0 = r1
            goto L_0x0043
        L_0x0040:
            r3 = move-exception
            goto L_0x0051
        L_0x0042:
            r3 = move-exception
        L_0x0043:
            r3.printStackTrace()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0050
            r0.close()
            goto L_0x0050
        L_0x004c:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0050:
            return
        L_0x0051:
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r4 = move-exception
            r4.printStackTrace()
        L_0x005b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.p3069b.p3072c.C60675a.mo208235a(java.io.File, java.lang.String):void");
    }
}
