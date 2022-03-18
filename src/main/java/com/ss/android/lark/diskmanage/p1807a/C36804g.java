package com.ss.android.lark.diskmanage.p1807a;

import com.ss.android.lark.diskmanage.cipher.C36808a;
import java.io.File;

/* renamed from: com.ss.android.lark.diskmanage.a.g */
public class C36804g {

    /* renamed from: a */
    private final long f94572a;

    /* renamed from: b */
    private final int f94573b;

    /* renamed from: c */
    private final AbstractC36806a f94574c;

    /* renamed from: com.ss.android.lark.diskmanage.a.g$a */
    public interface AbstractC36806a {
        /* renamed from: a */
        File mo135558a();
    }

    /* renamed from: a */
    public AbstractC36802f mo135555a() {
        File a = this.f94574c.mo135558a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return new C36807h(a, this.f94573b, this.f94572a);
        }
        return null;
    }

    /* renamed from: b */
    public AbstractC36802f mo135556b() {
        File a = this.f94574c.mo135558a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return new C36790c(a, this.f94573b, this.f94572a);
        }
        return null;
    }

    /* renamed from: c */
    public AbstractC36802f mo135557c() {
        File a = this.f94574c.mo135558a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return new C36786a(a, this.f94573b, this.f94572a);
        }
        return null;
    }

    public C36804g(final String str, int i, long j) {
        this(new AbstractC36806a() {
            /* class com.ss.android.lark.diskmanage.p1807a.C36804g.C368051 */

            @Override // com.ss.android.lark.diskmanage.p1807a.C36804g.AbstractC36806a
            /* renamed from: a */
            public File mo135558a() {
                return new File(str);
            }
        }, i, j);
    }

    public C36804g(AbstractC36806a aVar, int i, long j) {
        C36808a.AbstractC36811b b = C36808a.m145209b();
        if (b != null ? b.mo102812a("small_disk_on", false) : false) {
            this.f94572a = (long) (((float) j) * b.mo102809a("disk_factor", 1.0f));
        } else {
            this.f94572a = j;
        }
        this.f94573b = i;
        this.f94574c = aVar;
    }
}
