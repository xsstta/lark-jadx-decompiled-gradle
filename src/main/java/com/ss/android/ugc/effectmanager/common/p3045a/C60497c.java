package com.ss.android.ugc.effectmanager.common.p3045a;

import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3046b.p3047a.C60506c;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.c */
public class C60497c {

    /* renamed from: a */
    private final File f151236a;

    /* renamed from: b */
    private final File f151237b;

    /* renamed from: c */
    private final File f151238c;

    /* renamed from: d */
    private Writer f151239d;

    /* renamed from: e */
    private int f151240e;

    /* renamed from: f */
    private final LinkedHashMap<String, String> f151241f = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: a */
    private void m235082a() throws IOException {
        if (this.f151239d == null) {
            throw new IllegalStateException("map file is closed");
        } else if (!this.f151236a.exists()) {
            m235087c();
        }
    }

    /* renamed from: b */
    private void m235085b() throws IOException {
        C60506c cVar = new C60506c(new FileInputStream(this.f151236a), FileUtils.f151342a.mo207246a());
        try {
            String a = cVar.mo207183a();
            String a2 = cVar.mo207183a();
            String a3 = cVar.mo207183a();
            if (!"id.to.effectid".equals(a) || !"1".equals(a2) || !"".equals(a3)) {
                throw new IOException("unexpected Map header: [" + a + ", " + a2 + ", " + a3 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m235086b(cVar.mo207183a());
                    i++;
                } catch (EOFException unused) {
                    this.f151240e = i;
                    if (cVar.mo207184b()) {
                        m235087c();
                    } else {
                        this.f151239d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f151236a, true), FileUtils.f151342a.mo207246a()));
                    }
                    return;
                }
            }
        } finally {
            FileUtils.f151342a.mo207247a(cVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private synchronized void m235087c() throws IOException {
        Writer writer = this.f151239d;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f151237b), FileUtils.f151342a.mo207246a()));
        try {
            bufferedWriter.write("id.to.effectid");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            this.f151240e = 0;
            for (Map.Entry<String, String> entry : this.f151241f.entrySet()) {
                bufferedWriter.write(entry.getKey() + ' ' + entry.getValue() + '\n');
                this.f151240e = this.f151240e + 1;
            }
            bufferedWriter.close();
            if (this.f151236a.exists()) {
                m235084a(this.f151236a, this.f151238c, true);
            }
            m235084a(this.f151237b, this.f151236a, false);
            this.f151238c.delete();
            this.f151239d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f151236a, true), FileUtils.f151342a.mo207246a()));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    public String mo207135a(String str) {
        return this.f151241f.get(str);
    }

    /* renamed from: a */
    private static void m235083a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: b */
    private void m235086b(String str) throws IOException {
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            this.f151241f.put(str.substring(0, indexOf), str.substring(indexOf + 1));
            return;
        }
        throw new IOException("unexpected Map line: " + str);
    }

    public C60497c(File file) {
        File file2 = new File(file, "effectidmap");
        this.f151236a = file2;
        this.f151237b = new File(file, "effectidmap.tmp");
        File file3 = new File(file, "effectidmap.bak");
        this.f151238c = file3;
        try {
            if (file3.exists()) {
                if (file2.exists()) {
                    file3.delete();
                } else {
                    m235084a(file3, file2, false);
                }
            }
            if (file2.exists()) {
                m235085b();
            } else {
                m235087c();
            }
        } catch (IOException e) {
            PrintStream printStream = System.out;
            printStream.println("EffectIdMapFile " + file + " is corrupt: " + e.getMessage() + ", removing");
            this.f151236a.delete();
        }
    }

    /* renamed from: a */
    public void mo207136a(String str, String str2) {
        if (!this.f151241f.containsKey(str)) {
            this.f151241f.put(str, str2);
            try {
                m235082a();
                Writer writer = this.f151239d;
                writer.write(str + ' ' + str2 + '\n');
                this.f151239d.flush();
            } catch (Exception e) {
                EPLog.m235180c("EffectIdMapFile", "EffectIdMapFile write failed by " + e.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m235084a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m235083a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
