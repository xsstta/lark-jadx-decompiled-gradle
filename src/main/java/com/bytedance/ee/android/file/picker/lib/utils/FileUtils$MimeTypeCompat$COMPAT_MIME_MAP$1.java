package com.bytedance.ee.android.file.picker.lib.utils;

import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/bytedance/ee/android/file/picker/lib/utils/FileUtils$MimeTypeCompat$COMPAT_MIME_MAP$1", "Ljava/util/HashMap;", "", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FileUtils$MimeTypeCompat$COMPAT_MIME_MAP$1 extends HashMap<String, String> {
    final /* synthetic */ FileUtils.MimeTypeCompat this$0;

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<String, String>> entrySet() {
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

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<String> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Collection<String> values() {
        return getValues();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    public /* bridge */ String get(String str) {
        return (String) super.get((Object) str);
    }

    public /* bridge */ String remove(String str) {
        return (String) super.remove((Object) str);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ String get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ String remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    FileUtils$MimeTypeCompat$COMPAT_MIME_MAP$1(FileUtils.MimeTypeCompat aVar) {
        this.this$0 = aVar;
        FileUtils.MimeTypeCompat aVar2 = FileUtils.MimeTypeCompat.f12478a;
        int length = FileUtils.MimeTypeCompat.f12479b.length;
        for (int i = 0; i < length; i++) {
            FileUtils.MimeTypeCompat aVar3 = FileUtils.MimeTypeCompat.f12478a;
            String str = FileUtils.MimeTypeCompat.f12479b[i][0];
            FileUtils.MimeTypeCompat aVar4 = FileUtils.MimeTypeCompat.f12478a;
            put(str, FileUtils.MimeTypeCompat.f12479b[i][1]);
            FileUtils.MimeTypeCompat aVar5 = FileUtils.MimeTypeCompat.f12478a;
            String str2 = FileUtils.MimeTypeCompat.f12479b[i][1];
            FileUtils.MimeTypeCompat aVar6 = FileUtils.MimeTypeCompat.f12478a;
            put(str2, FileUtils.MimeTypeCompat.f12479b[i][0]);
        }
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault((Object) str, (Object) str2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Map, java.util.HashMap
    public final /* bridge */ String getOrDefault(Object obj, String str) {
        if (obj instanceof String) {
            return getOrDefault((String) obj, str);
        }
        return str;
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        return remove((String) obj, (String) obj2);
    }

    public /* bridge */ boolean remove(String str, String str2) {
        return super.remove((Object) str, (Object) str2);
    }
}
