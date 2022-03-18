package com.facebook.common.references;

import com.facebook.common.internal.Closeables;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public final class CloseableReference<T> implements Closeable, Cloneable {
    private static final ResourceReleaser<Closeable> DEFAULT_CLOSEABLE_RELEASER = new ResourceReleaser<Closeable>() {
        /* class com.facebook.common.references.CloseableReference.C210301 */

        /* renamed from: a */
        public void release(Closeable closeable) {
            try {
                Closeables.close(closeable, true);
            } catch (IOException unused) {
            }
        }
    };
    private static Class<CloseableReference> TAG = CloseableReference.class;
    private boolean mIsClosed;
    private final SharedReference<T> mSharedReference;

    public synchronized SharedReference<T> getUnderlyingReferenceTestOnly() {
        return this.mSharedReference;
    }

    @Override // java.lang.Object
    public synchronized CloseableReference<T> clone() {
        Preconditions.checkState(isValid());
        return new CloseableReference<>(this.mSharedReference);
    }

    @Nullable
    public synchronized CloseableReference<T> cloneOrNull() {
        if (!isValid()) {
            return null;
        }
        return clone();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.mIsClosed) {
                this.mIsClosed = true;
                this.mSharedReference.deleteReference();
            }
        }
    }

    public synchronized T get() {
        boolean z;
        if (!this.mIsClosed) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return this.mSharedReference.get();
    }

    public int getValueHash() {
        if (isValid()) {
            return System.identityHashCode(this.mSharedReference.get());
        }
        return 0;
    }

    public synchronized boolean isValid() {
        return !this.mIsClosed;
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.mIsClosed) {
                    FLog.m76612w(TAG, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.mSharedReference)), this.mSharedReference.get().getClass().getName());
                    close();
                    super.finalize();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public static void closeSafely(@Nullable CloseableReference<?> closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    private CloseableReference(SharedReference<T> sharedReference) {
        this.mSharedReference = (SharedReference) Preconditions.checkNotNull(sharedReference);
        sharedReference.addReference();
    }

    @Nullable
    public static <T> CloseableReference<T> cloneOrNull(@Nullable CloseableReference<T> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.cloneOrNull();
        }
        return null;
    }

    public static boolean isValid(@Nullable CloseableReference<?> closeableReference) {
        if (closeableReference == null || !closeableReference.isValid()) {
            return false;
        }
        return true;
    }

    public static <T extends Closeable> CloseableReference<T> of(T t) {
        if (t == null) {
            return null;
        }
        return new CloseableReference<>(t, DEFAULT_CLOSEABLE_RELEASER);
    }

    public static void closeSafely(@Nullable Iterable<? extends CloseableReference<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends CloseableReference<?>> it = iterable.iterator();
            while (it.hasNext()) {
                closeSafely((CloseableReference) it.next());
            }
        }
    }

    public static <T> List<CloseableReference<T>> cloneOrNull(Collection<CloseableReference<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (CloseableReference<T> closeableReference : collection) {
            arrayList.add(cloneOrNull(closeableReference));
        }
        return arrayList;
    }

    private CloseableReference(T t, ResourceReleaser<T> resourceReleaser) {
        this.mSharedReference = new SharedReference<>(t, resourceReleaser);
    }

    public static <T> CloseableReference<T> of(T t, ResourceReleaser<T> resourceReleaser) {
        if (t == null) {
            return null;
        }
        return new CloseableReference<>(t, resourceReleaser);
    }
}
