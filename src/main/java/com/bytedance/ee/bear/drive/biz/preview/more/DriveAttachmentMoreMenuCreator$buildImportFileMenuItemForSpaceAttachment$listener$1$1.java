package com.bytedance.ee.bear.drive.biz.preview.more;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/DriveAttachmentMoreMenuCreator$buildImportFileMenuItemForSpaceAttachment$listener$1$1", "Ljava/util/HashMap;", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveAttachmentMoreMenuCreator$buildImportFileMenuItemForSpaceAttachment$listener$1$1 extends HashMap<String, String> {
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

    DriveAttachmentMoreMenuCreator$buildImportFileMenuItemForSpaceAttachment$listener$1$1() {
        put("is_file_detail", String.valueOf(false));
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
        boolean z;
        if (obj != null) {
            z = obj instanceof String;
        } else {
            z = true;
        }
        if (z) {
            return containsKey((String) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof String;
        } else {
            z = true;
        }
        if (z) {
            return containsValue((String) obj);
        }
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ String get(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof String;
        } else {
            z = true;
        }
        if (z) {
            return get((String) obj);
        }
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ String remove(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof String;
        } else {
            z = true;
        }
        if (z) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault((Object) str, (Object) str2);
    }

    public /* bridge */ boolean remove(String str, String str2) {
        return super.remove((Object) str, (Object) str2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Map, java.util.HashMap
    public final /* bridge */ String getOrDefault(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = obj instanceof String;
        } else {
            z = true;
        }
        if (z) {
            return getOrDefault((String) obj, str);
        }
        return str;
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z;
        boolean z2 = true;
        if (obj != null) {
            z = obj instanceof String;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (obj2 != null) {
            z2 = obj2 instanceof String;
        }
        if (z2) {
            return remove((String) obj, (String) obj2);
        }
        return false;
    }
}
