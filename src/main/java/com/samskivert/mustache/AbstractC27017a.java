package com.samskivert.mustache;

import com.samskivert.mustache.C27035d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: com.samskivert.mustache.a */
public abstract class AbstractC27017a implements C27035d.AbstractC27042c {

    /* renamed from: a */
    protected static final C27035d.AbstractC27057r f67131a = new C27035d.AbstractC27057r() {
        /* class com.samskivert.mustache.AbstractC27017a.C270247 */

        public String toString() {
            return "MAP_FETCHER";
        }

        @Override // com.samskivert.mustache.C27035d.AbstractC27057r
        /* renamed from: a */
        public Object mo96158a(Object obj, String str) throws Exception {
            Map map = (Map) obj;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            if (str == "entrySet") {
                return map.entrySet();
            }
            return C27059e.f67208a;
        }
    };

    /* renamed from: b */
    protected static final C27035d.AbstractC27057r f67132b = new C27035d.AbstractC27057r() {
        /* class com.samskivert.mustache.AbstractC27017a.C270258 */

        public String toString() {
            return "LIST_FETCHER";
        }

        @Override // com.samskivert.mustache.C27035d.AbstractC27057r
        /* renamed from: a */
        public Object mo96158a(Object obj, String str) throws Exception {
            try {
                return ((List) obj).get(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return C27059e.f67208a;
            } catch (IndexOutOfBoundsException unused2) {
                return C27059e.f67208a;
            }
        }
    };

    /* renamed from: c */
    protected static final C27035d.AbstractC27057r f67133c = new C27035d.AbstractC27057r() {
        /* class com.samskivert.mustache.AbstractC27017a.C270269 */

        public String toString() {
            return "ITER_FETCHER";
        }

        @Override // com.samskivert.mustache.C27035d.AbstractC27057r
        /* renamed from: a */
        public Object mo96158a(Object obj, String str) throws Exception {
            try {
                Iterator it = (Iterator) obj;
                int parseInt = Integer.parseInt(str);
                for (int i = 0; i < parseInt; i++) {
                    it.next();
                }
                return it.next();
            } catch (NumberFormatException unused) {
                return C27059e.f67208a;
            } catch (NoSuchElementException unused2) {
                return C27059e.f67208a;
            }
        }
    };

    /* renamed from: d */
    protected static final C27035d.AbstractC27057r f67134d = new C27035d.AbstractC27057r() {
        /* class com.samskivert.mustache.AbstractC27017a.AnonymousClass10 */

        @Override // com.samskivert.mustache.C27035d.AbstractC27057r
        /* renamed from: a */
        public Object mo96158a(Object obj, String str) throws Exception {
            return obj;
        }

        public String toString() {
            return "THIS_FETCHER";
        }
    };

    /* renamed from: e */
    protected static final AbstractC27027a f67135e = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.AnonymousClass11 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((Object[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return ((Object[]) obj)[i];
        }
    };

    /* renamed from: f */
    protected static final AbstractC27027a f67136f = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.AnonymousClass12 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((boolean[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return Boolean.valueOf(((boolean[]) obj)[i]);
        }
    };

    /* renamed from: g */
    protected static final AbstractC27027a f67137g = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.AnonymousClass13 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((byte[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return Byte.valueOf(((byte[]) obj)[i]);
        }
    };

    /* renamed from: h */
    protected static final AbstractC27027a f67138h = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.AnonymousClass14 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((char[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return Character.valueOf(((char[]) obj)[i]);
        }
    };

    /* renamed from: i */
    protected static final AbstractC27027a f67139i = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.C270192 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((short[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return Short.valueOf(((short[]) obj)[i]);
        }
    };

    /* renamed from: j */
    protected static final AbstractC27027a f67140j = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.C270203 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((int[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return Integer.valueOf(((int[]) obj)[i]);
        }
    };

    /* renamed from: k */
    protected static final AbstractC27027a f67141k = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.C270214 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((long[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return Long.valueOf(((long[]) obj)[i]);
        }
    };

    /* renamed from: l */
    protected static final AbstractC27027a f67142l = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.C270225 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((float[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return Float.valueOf(((float[]) obj)[i]);
        }
    };

    /* renamed from: m */
    protected static final AbstractC27027a f67143m = new AbstractC27027a() {
        /* class com.samskivert.mustache.AbstractC27017a.C270236 */

        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public int mo96160a(Object obj) {
            return ((double[]) obj).length;
        }

        /* access modifiers changed from: protected */
        @Override // com.samskivert.mustache.AbstractC27017a.AbstractC27027a
        /* renamed from: a */
        public Object mo96161a(Object obj, int i) {
            return Double.valueOf(((double[]) obj)[i]);
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.a$a */
    public static abstract class AbstractC27027a implements C27035d.AbstractC27057r {
        /* renamed from: a */
        public abstract int mo96160a(Object obj);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Object mo96161a(Object obj, int i);

        protected AbstractC27027a() {
        }

        @Override // com.samskivert.mustache.C27035d.AbstractC27057r
        /* renamed from: a */
        public Object mo96158a(Object obj, String str) throws Exception {
            try {
                return mo96161a(obj, Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return C27059e.f67208a;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return C27059e.f67208a;
            }
        }
    }

    /* renamed from: b */
    protected static AbstractC27027a m98228b(Object obj) {
        if (obj instanceof Object[]) {
            return f67135e;
        }
        if (obj instanceof boolean[]) {
            return f67136f;
        }
        if (obj instanceof byte[]) {
            return f67137g;
        }
        if (obj instanceof char[]) {
            return f67138h;
        }
        if (obj instanceof short[]) {
            return f67139i;
        }
        if (obj instanceof int[]) {
            return f67140j;
        }
        if (obj instanceof long[]) {
            return f67141k;
        }
        if (obj instanceof float[]) {
            return f67142l;
        }
        if (obj instanceof double[]) {
            return f67143m;
        }
        return null;
    }

    @Override // com.samskivert.mustache.C27035d.AbstractC27042c
    /* renamed from: a */
    public Iterator<?> mo96154a(Object obj) {
        if (obj instanceof Iterable) {
            return ((Iterable) obj).iterator();
        }
        if (obj instanceof Iterator) {
            return (Iterator) obj;
        }
        if (obj.getClass().isArray()) {
            return new Iterator<Object>(m98228b(obj), obj) {
                /* class com.samskivert.mustache.AbstractC27017a.C270181 */

                /* renamed from: a */
                final /* synthetic */ AbstractC27027a f67144a;

                /* renamed from: b */
                final /* synthetic */ Object f67145b;

                /* renamed from: d */
                private int f67147d;

                /* renamed from: e */
                private int f67148e;

                public void remove() {
                    throw new UnsupportedOperationException();
                }

                public boolean hasNext() {
                    if (this.f67148e < this.f67147d) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Iterator
                public Object next() {
                    AbstractC27027a aVar = this.f67144a;
                    Object obj = this.f67145b;
                    int i = this.f67148e;
                    this.f67148e = i + 1;
                    return aVar.mo96161a(obj, i);
                }

                {
                    this.f67144a = r2;
                    this.f67145b = r3;
                    this.f67147d = r2.mo96160a(r3);
                }
            };
        }
        return null;
    }

    @Override // com.samskivert.mustache.C27035d.AbstractC27042c
    /* renamed from: a */
    public C27035d.AbstractC27057r mo96153a(Object obj, String str) {
        if (str == C27059e.f67209e || str == C27059e.f67210f) {
            return f67134d;
        }
        if (obj instanceof Map) {
            return f67131a;
        }
        char charAt = str.charAt(0);
        if (charAt < '0' || charAt > '9') {
            return null;
        }
        if (obj instanceof List) {
            return f67132b;
        }
        if (obj instanceof Iterator) {
            return f67133c;
        }
        if (obj.getClass().isArray()) {
            return m98228b(obj);
        }
        return null;
    }
}
