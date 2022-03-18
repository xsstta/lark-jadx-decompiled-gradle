package com.ss.android.lark.feed.app.team;

import com.ss.android.lark.feed.app.team.entity.C37874d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0005J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/feed/app/team/LargeDataHolder;", "", "()V", "chatListMap", "", "", "", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "getChatList", "key", "putChatList", "", "chatList", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.a */
public final class LargeDataHolder {

    /* renamed from: a */
    public static final LargeDataHolder f97028a = new LargeDataHolder();

    /* renamed from: b */
    private static final Map<String, List<C37874d>> f97029b = new LinkedHashMap();

    private LargeDataHolder() {
    }

    /* renamed from: a */
    public final List<C37874d> mo138613a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        List<C37874d> remove = f97029b.remove(str);
        if (remove != null) {
            return remove;
        }
        return CollectionsKt.emptyList();
    }

    /* renamed from: a */
    public final void mo138614a(String str, List<? extends C37874d> list) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(list, "chatList");
        f97029b.put(str, list);
    }
}
