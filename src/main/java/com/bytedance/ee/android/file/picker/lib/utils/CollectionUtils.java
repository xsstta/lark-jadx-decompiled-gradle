package com.bytedance.ee.android.file.picker.lib.utils;

import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006J.\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0000\u0012\u0002H\t\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/CollectionUtils;", "", "()V", "isEmpty", "", "collection", "", "resetToList", "", "T", "opList", "", "origin", "", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.b */
public final class CollectionUtils {

    /* renamed from: a */
    public static final CollectionUtils f12469a = new CollectionUtils();

    private CollectionUtils() {
    }

    /* renamed from: a */
    public final boolean mo16095a(Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
