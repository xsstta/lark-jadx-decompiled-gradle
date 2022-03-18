package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

public class LazyField extends LazyFieldLite {
    private final MessageLite defaultInstance;

    /* access modifiers changed from: package-private */
    public static class LazyEntry<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, LazyField> entry;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField value = this.entry.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        private LazyEntry(Map.Entry<K, LazyField> entry2) {
            this.entry = entry2;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.entry.getValue().setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* access modifiers changed from: package-private */
    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> iterator;

        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        public void remove() {
            this.iterator.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.iterator.next();
            if (next.getValue() instanceof LazyField) {
                return new LazyEntry(next);
            }
            return next;
        }

        public LazyIterator(Iterator<Map.Entry<K, Object>> it) {
            this.iterator = it;
        }
    }

    public MessageLite getValue() {
        return getValue(this.defaultInstance);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }

    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }
}
