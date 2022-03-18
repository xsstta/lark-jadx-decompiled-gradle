package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.j */
public class C23119j extends C23123k {

    /* renamed from: b */
    private final AbstractC23125m f57066b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.j$a */
    public static class C23121a<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        private Map.Entry<K, C23119j> f57067a;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f57067a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C23119j value = this.f57067a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo80279a();
        }

        private C23121a(Map.Entry<K, C23119j> entry) {
            this.f57067a = entry;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof AbstractC23125m) {
                return this.f57067a.getValue().mo80292b((AbstractC23125m) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.google.protobuf.j$b */
    static class C23122b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Map.Entry<K, Object>> f57068a;

        public boolean hasNext() {
            return this.f57068a.hasNext();
        }

        public void remove() {
            this.f57068a.remove();
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f57068a.next();
            if (next.getValue() instanceof C23119j) {
                return new C23121a(next);
            }
            return next;
        }

        public C23122b(Iterator<Map.Entry<K, Object>> it) {
            this.f57068a = it;
        }
    }

    /* renamed from: a */
    public AbstractC23125m mo80279a() {
        return mo80290a(this.f57066b);
    }

    @Override // com.google.protobuf.C23123k
    public int hashCode() {
        return mo80279a().hashCode();
    }

    public String toString() {
        return mo80279a().toString();
    }

    @Override // com.google.protobuf.C23123k
    public boolean equals(Object obj) {
        return mo80279a().equals(obj);
    }
}
