package com.ss.android.lark.diskmanage.p1807a;

import com.ss.android.lark.diskmanage.p1807a.C36792e;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.diskmanage.a.b */
public class C36787b extends C36792e {

    /* renamed from: a */
    public final File f94520a;

    @Override // com.ss.android.lark.diskmanage.p1807a.C36792e, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.C36792e
    /* renamed from: a */
    public File mo135509a() {
        return this.f94520a;
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.C36792e
    /* renamed from: b */
    public void mo135512b() throws IOException {
        close();
        C36792e.C36801f.m145162a(this.f94520a);
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.C36792e
    /* renamed from: b */
    public synchronized C36792e.C36798d mo135511b(String str) throws IOException {
        return null;
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.C36792e
    /* renamed from: c */
    public synchronized boolean mo135513c(String str) throws IOException {
        return true;
    }

    /* renamed from: a */
    public synchronized File mo135510a(String str) throws IOException {
        File file;
        file = null;
        File file2 = new C36789a(str).f94521a[0];
        Log.m165389i("AvatarDiskLruCache", "getCacheFile, key is:" + str + ", file is:" + file2.getAbsolutePath() + ", file exist:" + file2.exists());
        if (file2.exists()) {
            file = file2;
        }
        return file;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.diskmanage.a.b$a */
    public final class C36789a {

        /* renamed from: a */
        File[] f94521a;

        /* renamed from: b */
        File[] f94522b;

        /* renamed from: c */
        Set<String> f94523c;

        /* renamed from: e */
        private final int f94525e;

        /* renamed from: f */
        private final long[] f94526f;

        private C36789a(String str) {
            int i;
            String str2;
            this.f94525e = 1;
            this.f94523c = new HashSet(Arrays.asList("_th", "_mid", "_hd"));
            this.f94526f = new long[1];
            this.f94521a = new File[1];
            this.f94522b = new File[1];
            StringBuilder sb = new StringBuilder(str);
            int length = sb.length();
            Iterator<String> it = this.f94523c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                String next = it.next();
                if (str.endsWith(next)) {
                    str2 = str.substring(0, str.length() - next.length());
                    break;
                }
            }
            str = str2 != null ? str2 : str;
            for (i = 0; i < 1; i++) {
                File file = new File(C36787b.this.f94520a, str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f94521a[i] = new File(file, sb.toString());
                sb.append(".tmp");
                this.f94522b[i] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }
    }

    C36787b(File file, int i, int i2, long j) {
        super(file, i, i2, j);
        this.f94520a = file;
    }

    /* renamed from: a */
    public static C36787b m145102a(File file, int i, int i2, long j) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
        }
        return new C36787b(file, i, i2, j);
    }
}
