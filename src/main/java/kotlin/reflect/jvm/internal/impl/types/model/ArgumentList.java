package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;

public final class ArgumentList extends ArrayList<TypeArgumentMarker> implements TypeArgumentListMarker {
    public int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public ArgumentList(int i) {
        super(i);
    }

    public /* bridge */ boolean contains(TypeArgumentMarker typeArgumentMarker) {
        return super.contains((Object) typeArgumentMarker);
    }

    public /* bridge */ int indexOf(TypeArgumentMarker typeArgumentMarker) {
        return super.indexOf((Object) typeArgumentMarker);
    }

    public /* bridge */ int lastIndexOf(TypeArgumentMarker typeArgumentMarker) {
        return super.lastIndexOf((Object) typeArgumentMarker);
    }

    public /* bridge */ boolean remove(TypeArgumentMarker typeArgumentMarker) {
        return super.remove((Object) typeArgumentMarker);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return contains((TypeArgumentMarker) obj);
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return indexOf((TypeArgumentMarker) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return lastIndexOf((TypeArgumentMarker) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.ArrayList
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return remove((TypeArgumentMarker) obj);
        }
        return false;
    }
}
