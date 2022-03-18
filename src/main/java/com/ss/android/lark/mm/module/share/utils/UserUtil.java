package com.ss.android.lark.mm.module.share.utils;

import com.ss.android.lark.mm.module.share.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004J&\u0010\t\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/share/utils/UserUtil;", "", "()V", "findChanged", "", "", "left", "Lcom/ss/android/lark/mm/module/share/model/User;", "right", "isEqual", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.b.a */
public final class UserUtil {

    /* renamed from: a */
    public static final UserUtil f118275a = new UserUtil();

    private UserUtil() {
    }

    /* renamed from: a */
    public final boolean mo164967a(List<User> list, List<User> list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!Intrinsics.areEqual(t.getUserId(), list2.get(i).getUserId())) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: b */
    public final List<Integer> mo164968b(List<User> list, List<User> list2) {
        Intrinsics.checkParameterIsNotNull(list, "left");
        Intrinsics.checkParameterIsNotNull(list2, "right");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (Intrinsics.areEqual(t2.getUserId(), list2.get(i).getUserId()) && ((!Intrinsics.areEqual(t2.getPermissions(), list2.get(i).getPermissions())) || t2.isSelected() != list2.get(i).isSelected())) {
                t2.setPermissions(list2.get(i).getPermissions());
                t2.setSelected(list2.get(i).isSelected());
                arrayList.add(Integer.valueOf(i));
            }
            i = i2;
        }
        return arrayList;
    }
}
