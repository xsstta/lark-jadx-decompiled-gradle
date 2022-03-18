package com.ss.android.lark.moments.impl.categoryedit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"isCurrentCategory", "", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryState;", "isMyCategory", "im_moments-wrapper_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categoryedit.c */
public final class C47274c {
    /* renamed from: a */
    public static final boolean m187199a(CategoryState categoryState) {
        Intrinsics.checkParameterIsNotNull(categoryState, "$this$isMyCategory");
        if (categoryState == CategoryState.CURRENT_CATEGORY_IN_MY || categoryState == CategoryState.MY_CATEGORY) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m187200b(CategoryState categoryState) {
        Intrinsics.checkParameterIsNotNull(categoryState, "$this$isCurrentCategory");
        if (categoryState == CategoryState.CURRENT_CATEGORY_IN_MY || categoryState == CategoryState.CURRENT_CATEGORY_IN_MORE) {
            return true;
        }
        return false;
    }
}
