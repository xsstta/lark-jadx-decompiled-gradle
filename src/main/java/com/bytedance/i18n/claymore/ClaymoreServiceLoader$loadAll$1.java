package com.bytedance.i18n.claymore;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00028\u0000X.¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"com/bytedance/i18n/claymore/ClaymoreServiceLoader$loadAll$1", "", "cacheIndex", "", "cacheInstance", "Ljava/lang/Object;", "index", "hasNext", "", "next", "()Ljava/lang/Object;", "core"}, mo238835k = 1, mv = {1, 4, 0})
public final class ClaymoreServiceLoader$loadAll$1 implements Iterator<T>, KMappedMarker {
    final /* synthetic */ Class $c;
    private int cacheIndex = -1;
    private T cacheInstance;
    private int index;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public T next() {
        T t;
        int i = this.cacheIndex;
        int i2 = this.index;
        this.index = i2 + 1;
        if (i == i2) {
            t = this.cacheInstance;
            if (t == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cacheInstance");
            }
        } else {
            ClaymoreServiceLoader claymoreServiceLoader = ClaymoreServiceLoader.INSTANCE;
            Class cls = this.$c;
            int i3 = this.index;
            this.index = i3 + 1;
            t = (T) claymoreServiceLoader.getCacheOrCreate(cls, i3);
            if (t == null) {
                Intrinsics.throwNpe();
            }
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026 A[Catch:{ NoClassDefFoundError -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.i18n.claymore.ClaymoreServiceLoader$loadAll$1.hasNext():boolean");
    }

    ClaymoreServiceLoader$loadAll$1(Class cls) {
        this.$c = cls;
    }
}
