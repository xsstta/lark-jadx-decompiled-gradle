package kotlin.reflect.jvm.internal.impl.platform;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C69116e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public class TargetPlatform implements Collection<SimplePlatform>, KMappedMarker {
    private final Set<SimplePlatform> componentPlatforms;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* synthetic */ boolean add(SimplePlatform simplePlatform) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends SimplePlatform> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(SimplePlatform simplePlatform) {
        Intrinsics.checkParameterIsNotNull(simplePlatform, "element");
        return this.componentPlatforms.contains(simplePlatform);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        return this.componentPlatforms.containsAll(collection);
    }

    public int getSize() {
        return this.componentPlatforms.size();
    }

    public boolean isEmpty() {
        return this.componentPlatforms.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<SimplePlatform> iterator() {
        return this.componentPlatforms.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C69116e.m265964a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C69116e.m265965a(this, tArr);
    }

    public final Set<SimplePlatform> getComponentPlatforms() {
        return this.componentPlatforms;
    }

    public int hashCode() {
        return this.componentPlatforms.hashCode();
    }

    public final int size() {
        return getSize();
    }

    public String toString() {
        return PlatformUtilKt.getPresentableDescription(this);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SimplePlatform) {
            return contains((SimplePlatform) obj);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TargetPlatform) && !(!Intrinsics.areEqual(this.componentPlatforms, ((TargetPlatform) obj).componentPlatforms))) {
            return true;
        }
        return false;
    }
}
