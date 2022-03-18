package com.ss.android.lark.chat.core.model;

import android.os.Looper;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ObservableMappedArrayList<K, T> extends ArrayList<T> implements AbstractC33964i<T> {
    private C33946a mAccessTracker;
    private AbstractC33947b<K, T> mItemKey;
    private transient AbstractC33964i.AbstractC33965a mListener;
    private Map<K, Integer> mPositionMap;
    private ReentrantReadWriteLock mReadWriteLock;

    /* renamed from: com.ss.android.lark.chat.core.model.ObservableMappedArrayList$b */
    public interface AbstractC33947b<K, T> {
        /* renamed from: a */
        K mo124044a(T t);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.core.model.ObservableMappedArrayList$a */
    public static class C33946a {

        /* renamed from: a */
        String f87521a;

        /* renamed from: b */
        Thread f87522b;

        /* renamed from: c */
        long f87523c;

        /* renamed from: d */
        boolean f87524d;

        /* renamed from: e */
        long f87525e;

        /* renamed from: f */
        int f87526f;

        /* renamed from: g */
        String f87527g;

        /* renamed from: h */
        long f87528h;

        /* renamed from: i */
        long f87529i;

        /* renamed from: a */
        private float m131370a(long j) {
            return (((float) j) * 1.0f) / 1000000.0f;
        }

        /* renamed from: b */
        private void m131371b() {
            this.f87525e = 0;
            this.f87526f = 0;
            this.f87527g = null;
            this.f87528h = 0;
            this.f87529i = System.currentTimeMillis();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo124042a() {
            if (this.f87524d && Thread.currentThread() == this.f87522b && Looper.getMainLooper().getThread() == this.f87522b) {
                long nanoTime = System.nanoTime() - this.f87523c;
                this.f87525e += nanoTime;
                this.f87526f++;
                if (nanoTime > this.f87528h) {
                    this.f87528h = nanoTime;
                    this.f87527g = this.f87521a;
                }
                if (System.currentTimeMillis() - this.f87529i > 30000) {
                    Log.m165397w("ObservableList", String.format("avg: %.3fms, count: %d, max: %.3fms, scense: %s", Float.valueOf(m131370a(this.f87525e / ((long) this.f87526f))), Integer.valueOf(this.f87526f), Float.valueOf(m131370a(this.f87528h)), this.f87527g));
                    m131371b();
                }
            }
        }

        public C33946a(boolean z) {
            this.f87524d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo124043a(String str) {
            if (this.f87524d) {
                this.f87523c = System.nanoTime();
                this.f87521a = str;
                this.f87522b = Thread.currentThread();
            }
        }
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i
    public void acquireReadAccess() {
        if (this.mReadWriteLock != null) {
            this.mAccessTracker.mo124043a("acquireReadAccess");
            this.mReadWriteLock.readLock().lock();
        }
    }

    public void beginUpdate() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.mReadWriteLock;
        if (reentrantReadWriteLock != null) {
            reentrantReadWriteLock.writeLock().lock();
        }
        AbstractC33964i.AbstractC33965a aVar = this.mListener;
        if (aVar != null) {
            aVar.mo124069a(this);
        }
    }

    public void clear() {
        int size = size();
        super.clear();
        this.mPositionMap.clear();
        if (size != 0) {
            notifyRemove(0, size);
        }
    }

    public void finishUpdate() {
        try {
            AbstractC33964i.AbstractC33965a aVar = this.mListener;
            if (aVar != null) {
                aVar.mo124072b(this);
            }
        } finally {
            ReentrantReadWriteLock reentrantReadWriteLock = this.mReadWriteLock;
            if (reentrantReadWriteLock != null) {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i
    public void releaseReadAccess() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.mReadWriteLock;
        if (reentrantReadWriteLock != null) {
            reentrantReadWriteLock.readLock().unlock();
            this.mAccessTracker.mo124042a();
        }
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i
    public void addOnListUpdateCallback(AbstractC33964i.AbstractC33965a aVar) {
        this.mListener = aVar;
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractC33964i
    public void removeOnListUpdateCallback(AbstractC33964i.AbstractC33965a aVar) {
        this.mListener = null;
    }

    public ObservableMappedArrayList(AbstractC33947b<K, T> bVar) {
        this(bVar, false, false);
    }

    public T getItemByKey(K... kArr) {
        return (T) threadSafeAccess("getItemByKey", new Callable(kArr) {
            /* class com.ss.android.lark.chat.core.model.$$Lambda$ObservableMappedArrayList$JNm5I0KrjrZAZw8hQc01ZOxqBU0 */
            public final /* synthetic */ Object[] f$1;

            {
                this.f$1 = r2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ObservableMappedArrayList.this.lambda$getItemByKey$1$ObservableMappedArrayList(this.f$1);
            }
        });
    }

    @Override // java.util.List, java.util.ArrayList
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.util.ArrayList
    public boolean add(T t) {
        super.add(t);
        int size = size() - 1;
        this.mPositionMap.put(this.mItemKey.mo124044a(t), Integer.valueOf(size));
        notifyAdd(size, 1);
        return true;
    }

    public boolean containsKey(K... kArr) {
        return ((Boolean) threadSafeAccess("containsKey", new Callable(kArr) {
            /* class com.ss.android.lark.chat.core.model.$$Lambda$ObservableMappedArrayList$JyizB_3sKtAGyUJ_G6GOQNzcJ0 */
            public final /* synthetic */ Object[] f$1;

            {
                this.f$1 = r2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ObservableMappedArrayList.this.lambda$containsKey$0$ObservableMappedArrayList(this.f$1);
            }
        })).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.chat.core.model.ObservableMappedArrayList<K, T> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsValue(T t) {
        return containsKey(this.mItemKey.mo124044a(t));
    }

    public int getItemPosByKey(K... kArr) {
        return ((Integer) threadSafeAccess("getItemPosByKey", new Callable(kArr) {
            /* class com.ss.android.lark.chat.core.model.$$Lambda$ObservableMappedArrayList$9_UpOsFx6bzvqo7qAf3H6jXvhYE */
            public final /* synthetic */ Object[] f$1;

            {
                this.f$1 = r2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ObservableMappedArrayList.this.lambda$getItemPosByKey$3$ObservableMappedArrayList(this.f$1);
            }
        })).intValue();
    }

    public List<T> getItemsByKey(Collection<K> collection) {
        ArrayList arrayList = new ArrayList();
        if (collection == null || collection.isEmpty()) {
            return arrayList;
        }
        return (List) threadSafeAccess("getItemsByKey", new Callable(collection, arrayList) {
            /* class com.ss.android.lark.chat.core.model.$$Lambda$ObservableMappedArrayList$7J2Ka9YxiFNujZ6DbbjkdmpEGO0 */
            public final /* synthetic */ Collection f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ObservableMappedArrayList.this.lambda$getItemsByKey$2$ObservableMappedArrayList(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ Boolean lambda$containsKey$0$ObservableMappedArrayList(Object[] objArr) throws Exception {
        int length = objArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            if (obj != null && this.mPositionMap.containsKey(obj)) {
                z = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ Object lambda$getItemByKey$1$ObservableMappedArrayList(Object[] objArr) throws Exception {
        for (Object obj : objArr) {
            if (obj != null && this.mPositionMap.containsKey(obj)) {
                return get(this.mPositionMap.get(obj).intValue());
            }
        }
        return null;
    }

    public /* synthetic */ Integer lambda$getItemPosByKey$3$ObservableMappedArrayList(Object[] objArr) throws Exception {
        int i;
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = -1;
                break;
            }
            Object obj = objArr[i2];
            if (obj != null && this.mPositionMap.containsKey(obj)) {
                i = this.mPositionMap.get(obj).intValue();
                break;
            }
            i2++;
        }
        return Integer.valueOf(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Collection<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.core.model.ObservableMappedArrayList$b<K, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            for (int i = size; i < size(); i++) {
                this.mPositionMap.put(this.mItemKey.mo124044a(get(i)), Integer.valueOf(i));
            }
            notifyAdd(size, size() - size);
        }
        return addAll;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.core.model.ObservableMappedArrayList$b<K, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public T remove(int i) {
        int i2;
        T t = (T) super.remove(i);
        this.mPositionMap.remove(this.mItemKey.mo124044a(t));
        if (this.mPositionMap.size() != size()) {
            i2 = 0;
            this.mPositionMap.clear();
        } else {
            i2 = i;
        }
        while (i2 < size()) {
            this.mPositionMap.put(this.mItemKey.mo124044a(get(i2)), Integer.valueOf(i2));
            i2++;
        }
        notifyRemove(i, 1);
        return t;
    }

    private void notifyAdd(int i, int i2) {
        AbstractC33964i.AbstractC33965a aVar = this.mListener;
        if (aVar != null) {
            aVar.mo124073b(this, i, i2);
        }
    }

    private void notifyChange(int i, int i2) {
        AbstractC33964i.AbstractC33965a aVar = this.mListener;
        if (aVar != null) {
            aVar.mo124070a(this, i, i2);
        }
    }

    private void notifyRemove(int i, int i2) {
        AbstractC33964i.AbstractC33965a aVar = this.mListener;
        if (aVar != null) {
            aVar.mo124074c(this, i, i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.chat.core.model.ObservableMappedArrayList$b<K, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public void add(int i, T t) {
        super.add(i, t);
        for (int i2 = i; i2 < size(); i2++) {
            this.mPositionMap.put(this.mItemKey.mo124044a(get(i2)), Integer.valueOf(i2));
        }
        notifyAdd(i, 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.Collection<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.core.model.ObservableMappedArrayList$b<K, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            for (int i2 = i; i2 < size(); i2++) {
                this.mPositionMap.put(this.mItemKey.mo124044a(get(i2)), Integer.valueOf(i2));
            }
            notifyAdd(i, collection.size());
        }
        return addAll;
    }

    public /* synthetic */ List lambda$getItemsByKey$2$ObservableMappedArrayList(Collection collection, List list) throws Exception {
        for (Object obj : collection) {
            if (this.mPositionMap.containsKey(obj)) {
                list.add(get(this.mPositionMap.get(obj).intValue()));
            }
        }
        return list;
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public T set(int i, T t) {
        T t2 = (T) super.set(i, t);
        this.mPositionMap.remove(this.mItemKey.mo124044a(t2));
        this.mPositionMap.put(this.mItemKey.mo124044a(t), Integer.valueOf(i));
        notifyChange(i, 1);
        return t2;
    }

    private <R> R threadSafeAccess(String str, Callable<R> callable) {
        if (this.mReadWriteLock != null) {
            this.mAccessTracker.mo124043a(str);
            this.mReadWriteLock.readLock().lock();
        }
        try {
            R call = callable.call();
            ReentrantReadWriteLock reentrantReadWriteLock = this.mReadWriteLock;
            if (reentrantReadWriteLock != null) {
                reentrantReadWriteLock.readLock().unlock();
                this.mAccessTracker.mo124042a();
            }
            return call;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            ReentrantReadWriteLock reentrantReadWriteLock2 = this.mReadWriteLock;
            if (reentrantReadWriteLock2 != null) {
                reentrantReadWriteLock2.readLock().unlock();
                this.mAccessTracker.mo124042a();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.chat.core.model.ObservableMappedArrayList$b<K, T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void removeRange(int i, int i2) {
        for (E e : subList(i, i2)) {
            this.mPositionMap.remove(this.mItemKey.mo124044a(e));
        }
        super.removeRange(i, i2);
        for (int i3 = i; i3 < size(); i3++) {
            this.mPositionMap.put(this.mItemKey.mo124044a(get(i3)), Integer.valueOf(i3));
        }
        notifyRemove(i, i2 - i);
    }

    public ObservableMappedArrayList(AbstractC33947b<K, T> bVar, boolean z, boolean z2) {
        this.mPositionMap = new HashMap();
        this.mItemKey = bVar;
        if (z) {
            this.mReadWriteLock = new ReentrantReadWriteLock(true);
        }
        this.mAccessTracker = new C33946a(z2);
    }
}
