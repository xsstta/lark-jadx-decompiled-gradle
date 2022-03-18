package androidx.core.util;

public final class Pools {

    /* renamed from: androidx.core.util.Pools$a */
    public interface AbstractC0839a<T> {
        T acquire();

        boolean release(T t);
    }

    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object mLock = new Object();

        @Override // androidx.core.util.Pools.AbstractC0839a, androidx.core.util.Pools.SimplePool
        public T acquire() {
            T t;
            synchronized (this.mLock) {
                t = (T) super.acquire();
            }
            return t;
        }

        public SynchronizedPool(int i) {
            super(i);
        }

        @Override // androidx.core.util.Pools.AbstractC0839a, androidx.core.util.Pools.SimplePool
        public boolean release(T t) {
            boolean release;
            synchronized (this.mLock) {
                release = super.release(t);
            }
            return release;
        }
    }

    public static class SimplePool<T> implements AbstractC0839a<T> {
        private final Object[] mPool;
        private int mPoolSize;

        @Override // androidx.core.util.Pools.AbstractC0839a
        public T acquire() {
            int i = this.mPoolSize;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.mPool;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.mPoolSize = i - 1;
            return t;
        }

        public SimplePool(int i) {
            if (i > 0) {
                this.mPool = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean isInPool(T t) {
            for (int i = 0; i < this.mPoolSize; i++) {
                if (this.mPool[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.AbstractC0839a
        public boolean release(T t) {
            if (!isInPool(t)) {
                int i = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.mPoolSize = i + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }
}
