package com.ss.android.lark.chat.export.ui.p1672b;

/* renamed from: com.ss.android.lark.chat.export.ui.b.b */
public class C34029b<T> {

    /* renamed from: a */
    public final int f87966a;

    /* renamed from: b */
    public final String f87967b;

    /* renamed from: c */
    public final int f87968c;

    /* renamed from: d */
    public final int f87969d;

    /* renamed from: e */
    public final int f87970e;

    /* renamed from: f */
    public final String f87971f;

    /* renamed from: g */
    public final T f87972g;

    /* renamed from: h */
    public boolean f87973h;

    /* renamed from: i */
    public final AbstractC34032b<T> f87974i;

    /* renamed from: j */
    public int f87975j;

    /* renamed from: com.ss.android.lark.chat.export.ui.b.b$b */
    public interface AbstractC34032b<T> {
        void onSelected(C34029b<T> bVar);
    }

    /* renamed from: a */
    public static <T> C34031a<T> m131930a() {
        return new C34031a<>();
    }

    /* renamed from: com.ss.android.lark.chat.export.ui.b.b$a */
    public static final class C34031a<T> {

        /* renamed from: a */
        public int f87976a;

        /* renamed from: b */
        public String f87977b;

        /* renamed from: c */
        public int f87978c;

        /* renamed from: d */
        public int f87979d;

        /* renamed from: e */
        public int f87980e = -1;

        /* renamed from: f */
        public String f87981f;

        /* renamed from: g */
        public T f87982g;

        /* renamed from: h */
        public boolean f87983h = true;

        /* renamed from: i */
        public AbstractC34032b<T> f87984i;

        /* renamed from: j */
        public int f87985j = -1;

        /* renamed from: a */
        public C34029b<T> mo126131a() {
            return new C34029b<>(this);
        }

        /* renamed from: a */
        public C34031a<T> mo126127a(int i) {
            this.f87976a = i;
            return this;
        }

        /* renamed from: b */
        public C34031a<T> mo126132b(int i) {
            this.f87979d = i;
            return this;
        }

        /* renamed from: c */
        public C34031a<T> mo126134c(int i) {
            this.f87980e = i;
            return this;
        }

        /* renamed from: d */
        public C34031a<T> mo126135d(int i) {
            this.f87978c = i;
            return this;
        }

        /* renamed from: e */
        public C34031a<T> mo126136e(int i) {
            this.f87985j = i;
            return this;
        }

        /* renamed from: a */
        public C34031a<T> mo126128a(AbstractC34032b<T> bVar) {
            this.f87984i = bVar;
            return this;
        }

        /* renamed from: b */
        public C34031a<T> mo126133b(String str) {
            this.f87981f = str;
            return this;
        }

        /* renamed from: a */
        public C34031a<T> mo126129a(String str) {
            this.f87977b = str;
            return this;
        }

        /* renamed from: a */
        public C34031a<T> mo126130a(boolean z) {
            this.f87983h = z;
            return this;
        }
    }

    private C34029b(C34031a<T> aVar) {
        this.f87975j = -1;
        this.f87966a = aVar.f87976a;
        this.f87968c = aVar.f87978c;
        this.f87971f = aVar.f87981f;
        this.f87969d = aVar.f87979d;
        this.f87970e = aVar.f87980e;
        this.f87967b = aVar.f87977b;
        this.f87972g = aVar.f87982g;
        this.f87973h = aVar.f87983h;
        this.f87974i = aVar.f87984i;
        this.f87975j = aVar.f87985j;
    }
}
