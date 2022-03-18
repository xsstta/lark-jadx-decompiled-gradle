package pl.droidsonroids.relinker;

import android.content.Context;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import pl.droidsonroids.relinker.C70185b;
import pl.droidsonroids.relinker.p3532a.C70180f;

/* renamed from: pl.droidsonroids.relinker.c */
public class C70190c {

    /* renamed from: a */
    protected final Set<String> f175308a;

    /* renamed from: b */
    protected final C70185b.AbstractC70187b f175309b;

    /* renamed from: c */
    protected final C70185b.AbstractC70186a f175310c;

    /* renamed from: d */
    protected boolean f175311d;

    /* renamed from: e */
    protected boolean f175312e;

    /* renamed from: f */
    protected C70185b.AbstractC70189d f175313f;

    /* renamed from: a */
    public static Thread m268995a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    protected C70190c() {
        this(new C70193d(), new C70169a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo247345a(Context context) {
        return context.getDir("lib", 0);
    }

    /* renamed from: a */
    public void mo247349a(String str) {
        C70185b.AbstractC70189d dVar = this.f175313f;
        if (dVar != null) {
            dVar.mo247344a(str);
        }
    }

    /* renamed from: a */
    public void mo247346a(Context context, String str) {
        mo247348a(context, str, null, null);
    }

    protected C70190c(C70185b.AbstractC70187b bVar, C70185b.AbstractC70186a aVar) {
        this.f175308a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (aVar != null) {
            this.f175309b = bVar;
            this.f175310c = aVar;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }

    /* renamed from: a */
    public void mo247350a(String str, Object... objArr) {
        mo247349a(String.format(Locale.US, str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public File mo247351b(Context context, String str, String str2) {
        String c = this.f175309b.mo247340c(str);
        if (C70194e.m269009a(str2)) {
            return new File(mo247345a(context), c);
        }
        File a = mo247345a(context);
        return new File(a, c + "." + str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo247352c(Context context, String str, String str2) {
        File a = mo247345a(context);
        File b = mo247351b(context, str, str2);
        final String c = this.f175309b.mo247340c(str);
        File[] listFiles = a.listFiles(new FilenameFilter() {
            /* class pl.droidsonroids.relinker.C70190c.C701922 */

            public boolean accept(File file, String str) {
                return str.startsWith(c);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f175311d || !file.getAbsolutePath().equals(b.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo247347a(Context context, String str, String str2) {
        C70180f fVar;
        Throwable th;
        C70180f fVar2;
        if (!this.f175308a.contains(str) || this.f175311d) {
            try {
                this.f175309b.mo247337a(str);
                this.f175308a.add(str);
                mo247350a("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e) {
                mo247350a("Loading the library normally failed: %s", Log.getStackTraceString(e));
                mo247350a("%s (%s) was not loaded normally, re-linking...", str, str2);
                File b = mo247351b(context, str, str2);
                if (!b.exists() || this.f175311d) {
                    if (this.f175311d) {
                        mo247350a("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    mo247352c(context, str, str2);
                    this.f175310c.mo247324a(context, this.f175309b.mo247338a(), this.f175309b.mo247340c(str), b, this);
                }
                try {
                    if (this.f175312e) {
                        fVar = null;
                        fVar2 = new C70180f(b);
                        List<String> b2 = fVar2.mo247332b();
                        fVar2.close();
                        for (String str3 : b2) {
                            mo247346a(context, this.f175309b.mo247341d(str3));
                        }
                    }
                } catch (IOException unused) {
                }
                this.f175309b.mo247339b(b.getAbsolutePath());
                this.f175308a.add(str);
                mo247350a("%s (%s) was re-linked!", str, str2);
            } catch (Throwable th2) {
                th = th2;
                fVar = fVar2;
                fVar.close();
                throw th;
            }
        } else {
            mo247350a("%s already loaded previously!", str);
        }
    }

    /* renamed from: a */
    public void mo247348a(final Context context, final String str, final String str2, final C70185b.AbstractC70188c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C70194e.m269009a(str)) {
            mo247350a("Beginning load of %s...", str);
            if (cVar == null) {
                mo247347a(context, str, str2);
            } else {
                m268995a(new Thread(new Runnable() {
                    /* class pl.droidsonroids.relinker.C70190c.RunnableC701911 */

                    public void run() {
                        try {
                            C70190c.this.mo247347a(context, str, str2);
                            cVar.mo247342a();
                        } catch (UnsatisfiedLinkError e) {
                            cVar.mo247343a(e);
                        } catch (MissingLibraryException e2) {
                            cVar.mo247343a(e2);
                        }
                    }
                })).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }
}
