package com.larksuite.component.ui.layout;

import android.graphics.Path;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0014¨\u0006\t"}, d2 = {"com/larksuite/component/ui/layout/LKUIRoundLinearLayout$Companion$sPathCache$1", "Ljava/util/LinkedHashMap;", "", "Landroid/graphics/Path;", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LKUIRoundLinearLayout$Companion$sPathCache$1 extends LinkedHashMap<String, Path> {
    LKUIRoundLinearLayout$Companion$sPathCache$1() {
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<String, Path>> entrySet() {
        return getEntries();
    }

    public Set getEntries() {
        return super.entrySet();
    }

    public Set getKeys() {
        return super.keySet();
    }

    public int getSize() {
        return super.size();
    }

    public Collection getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<String> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Collection<Path> values() {
        return getValues();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(Path path) {
        return super.containsValue((Object) path);
    }

    public /* bridge */ Path get(String str) {
        return (Path) super.get((Object) str);
    }

    public /* bridge */ Path remove(String str) {
        return (Path) super.remove((Object) str);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Path) {
            return containsValue((Path) obj);
        }
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ Path get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, Path> entry) {
        if (size() > 5) {
            return true;
        }
        return false;
    }

    public /* bridge */ Path getOrDefault(String str, Path path) {
        return (Path) super.getOrDefault((Object) str, (Object) path);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
    public final /* bridge */ Path getOrDefault(Object obj, Path path) {
        if (obj instanceof String) {
            return getOrDefault((String) obj, path);
        }
        return path;
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof Path)) {
            return false;
        }
        return remove((String) obj, (Path) obj2);
    }

    public /* bridge */ boolean remove(String str, Path path) {
        return super.remove((Object) str, (Object) path);
    }
}
