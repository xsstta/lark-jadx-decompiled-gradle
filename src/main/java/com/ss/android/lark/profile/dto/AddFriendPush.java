package com.ss.android.lark.profile.dto;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.biz.core.api.IPushAddFriendListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/dto/AddFriendPush;", "", "()V", "addFriendListeners", "", "Lcom/ss/android/lark/biz/core/api/IPushAddFriendListener;", "push", "", BottomDialog.f17198f, "", "registerListener", "listener", "unregisterListener", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.dto.a */
public final class AddFriendPush {

    /* renamed from: a */
    public static final AddFriendPush f129608a = new AddFriendPush();

    /* renamed from: b */
    private static final List<IPushAddFriendListener> f129609b = new ArrayList();

    private AddFriendPush() {
    }

    /* renamed from: a */
    public final void mo178906a(IPushAddFriendListener afVar) {
        Intrinsics.checkParameterIsNotNull(afVar, "listener");
        f129609b.add(afVar);
    }

    /* renamed from: b */
    public final void mo178908b(IPushAddFriendListener afVar) {
        Intrinsics.checkParameterIsNotNull(afVar, "listener");
        f129609b.remove(afVar);
    }

    /* renamed from: a */
    public final void mo178907a(String str) {
        if (str != null) {
            Iterator<T> it = f129609b.iterator();
            while (it.hasNext()) {
                it.next().onAddFriend(str);
            }
        }
    }
}
