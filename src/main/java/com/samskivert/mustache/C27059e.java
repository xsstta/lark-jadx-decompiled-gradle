package com.samskivert.mustache;

import com.samskivert.mustache.C27035d;
import com.samskivert.mustache.MustacheException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.samskivert.mustache.e */
public class C27059e {

    /* renamed from: a */
    public static final Object f67208a = new String("<no fetcher found>");

    /* renamed from: e */
    protected static final String f67209e = ".".intern();

    /* renamed from: f */
    protected static final String f67210f = "this".intern();

    /* renamed from: g */
    protected static final String f67211g = "-first".intern();

    /* renamed from: h */
    protected static final String f67212h = "-last".intern();

    /* renamed from: i */
    protected static final String f67213i = "-index".intern();

    /* renamed from: j */
    protected static C27035d.AbstractC27057r f67214j = new C27035d.AbstractC27057r() {
        /* class com.samskivert.mustache.C27059e.C270612 */

        @Override // com.samskivert.mustache.C27035d.AbstractC27057r
        /* renamed from: a */
        public Object mo96158a(Object obj, String str) throws Exception {
            return C27059e.f67208a;
        }
    };

    /* renamed from: b */
    protected final AbstractC27065d[] f67215b;

    /* renamed from: c */
    protected final C27035d.C27043d f67216c;

    /* renamed from: d */
    protected final Map<C27064c, C27035d.AbstractC27057r> f67217d;

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.e$d */
    public static abstract class AbstractC27065d {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo96192a(C27059e eVar, C27062a aVar, Writer writer);

        protected AbstractC27065d() {
        }

        /* renamed from: a */
        protected static void m98337a(Writer writer, String str) {
            try {
                writer.write(str);
            } catch (IOException e) {
                throw new MustacheException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.e$c */
    public static class C27064c {

        /* renamed from: a */
        public final Class<?> f67227a;

        /* renamed from: b */
        public final String f67228b;

        public int hashCode() {
            return (this.f67227a.hashCode() * 31) + this.f67228b.hashCode();
        }

        public String toString() {
            return this.f67227a.getName() + ":" + this.f67228b;
        }

        public boolean equals(Object obj) {
            C27064c cVar = (C27064c) obj;
            if (cVar.f67227a == this.f67227a && cVar.f67228b == this.f67228b) {
                return true;
            }
            return false;
        }

        public C27064c(Class<?> cls, String str) {
            this.f67227a = cls;
            this.f67228b = str;
        }
    }

    /* renamed from: com.samskivert.mustache.e$b */
    public abstract class AbstractC27063b {
        public AbstractC27063b() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.e$a */
    public static class C27062a {

        /* renamed from: a */
        public final Object f67221a;

        /* renamed from: b */
        public final C27062a f67222b;

        /* renamed from: c */
        public final int f67223c;

        /* renamed from: d */
        public final boolean f67224d;

        /* renamed from: e */
        public final boolean f67225e;

        /* renamed from: a */
        public C27062a mo96217a(Object obj) {
            return new C27062a(obj, this, this.f67223c, this.f67224d, this.f67225e);
        }

        /* renamed from: a */
        public C27062a mo96218a(Object obj, int i, boolean z, boolean z2) {
            return new C27062a(obj, this, i, z, z2);
        }

        public C27062a(Object obj, C27062a aVar, int i, boolean z, boolean z2) {
            this.f67221a = obj;
            this.f67222b = aVar;
            this.f67223c = i;
            this.f67224d = z;
            this.f67225e = z2;
        }
    }

    /* renamed from: a */
    public String mo96212a(Object obj) throws MustacheException {
        StringWriter stringWriter = new StringWriter();
        mo96214a(obj, stringWriter);
        return stringWriter.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC27063b mo96207a(final AbstractC27065d[] dVarArr, final C27062a aVar) {
        return new AbstractC27063b() {
            /* class com.samskivert.mustache.C27059e.C270601 */
        };
    }

    protected C27059e(AbstractC27065d[] dVarArr, C27035d.C27043d dVar) {
        this.f67215b = dVarArr;
        this.f67216c = dVar;
        this.f67217d = dVar.f67181j.mo96166a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96213a(C27062a aVar, Writer writer) throws MustacheException {
        for (AbstractC27065d dVar : this.f67215b) {
            dVar.mo96192a(this, aVar, writer);
        }
    }

    /* renamed from: a */
    public void mo96214a(Object obj, Writer writer) throws MustacheException {
        mo96213a(new C27062a(obj, null, 0, false, false), writer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo96208a(C27062a aVar, String str, int i) {
        Object a = mo96209a(aVar, str, i, !this.f67216c.f67173b);
        if (a == null) {
            return Collections.emptyList();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo96215b(C27062a aVar, String str, int i) {
        Object a = mo96209a(aVar, str, i, this.f67216c.f67175d);
        if (a == null) {
            return this.f67216c.mo96188b(str);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo96210a(Object obj, String str, int i) {
        C27035d.AbstractC27057r rVar;
        if (obj != null) {
            C27064c cVar = new C27064c(obj.getClass(), str);
            C27035d.AbstractC27057r rVar2 = this.f67217d.get(cVar);
            if (rVar2 != null) {
                try {
                    return rVar2.mo96158a(obj, str);
                } catch (Exception unused) {
                    rVar = this.f67216c.f67181j.mo96153a(obj, cVar.f67228b);
                }
            } else {
                rVar = this.f67216c.f67181j.mo96153a(obj, cVar.f67228b);
                if (rVar == null) {
                    rVar = f67214j;
                }
                try {
                    Object a = rVar.mo96158a(obj, str);
                    this.f67217d.put(cVar, rVar);
                    return a;
                } catch (Exception e) {
                    throw new MustacheException.Context("Failure fetching variable '" + str + "' on line " + i, str, i, e);
                }
            }
        } else {
            throw new NullPointerException("Null context for variable '" + str + "' on line " + i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo96211a(String str, int i, boolean z, Object obj) {
        if (obj != f67208a) {
            return obj;
        }
        if (z) {
            return null;
        }
        throw new MustacheException.Context("No method or field with name '" + str + "' on line " + i, str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo96209a(C27062a aVar, String str, int i, boolean z) {
        if (str == f67211g) {
            return Boolean.valueOf(aVar.f67224d);
        }
        if (str == f67212h) {
            return Boolean.valueOf(aVar.f67225e);
        }
        if (str == f67213i) {
            return Integer.valueOf(aVar.f67223c);
        }
        if (this.f67216c.f67172a) {
            return mo96211a(str, i, z, mo96210a(aVar.f67221a, str, i));
        }
        for (C27062a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f67222b) {
            Object a = mo96210a(aVar2.f67221a, str, i);
            if (a != f67208a) {
                return a;
            }
        }
        String str2 = f67209e;
        if (str == str2 || str.indexOf(str2) == -1) {
            return mo96211a(str, i, z, f67208a);
        }
        return mo96216b(aVar, str, i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo96216b(C27062a aVar, String str, int i, boolean z) {
        String[] split = str.split("\\.");
        Object a = mo96209a(aVar, split[0].intern(), i, z);
        for (int i2 = 1; i2 < split.length; i2++) {
            if (a == f67208a) {
                if (z) {
                    return null;
                }
                throw new MustacheException.Context("Missing context for compound variable '" + str + "' on line " + i + ". '" + split[i2 - 1] + "' was not found.", str, i);
            } else if (a == null) {
                return null;
            } else {
                a = mo96210a(a, split[i2].intern(), i);
            }
        }
        return mo96211a(str, i, z, a);
    }
}
