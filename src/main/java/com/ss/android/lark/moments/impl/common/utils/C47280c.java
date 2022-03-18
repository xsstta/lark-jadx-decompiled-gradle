package com.ss.android.lark.moments.impl.common.utils;

import com.bytedance.lark.pb.moments.v1.Broadcast;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"isContentSame", "", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "other", "", "im_moments-wrapper_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.c */
public final class C47280c {
    /* renamed from: a */
    public static final boolean m187230a(Broadcast broadcast, Broadcast broadcast2) {
        if (broadcast == null && broadcast2 == null) {
            return true;
        }
        if (broadcast == null || broadcast2 == null || !Intrinsics.areEqual(broadcast.post_id, broadcast2.post_id) || !Intrinsics.areEqual(broadcast.title, broadcast2.title) || !Intrinsics.areEqual(broadcast.end_time_sec, broadcast2.end_time_sec)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m187231a(List<Broadcast> list, List<Broadcast> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!m187230a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
