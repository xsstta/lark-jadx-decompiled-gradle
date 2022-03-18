package com.ss.android.lark.moments.impl.categoryedit;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/OnClickTabItemListener;", "", "onActionClick", "", "view", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryItemView;", "onClickMoreTab", "id", "", "name", "iconKey", "onClickMyTab", "onEditClicked", "onLongClick", "", "v", "Landroid/view/View;", "isEditing", "enableDrag", "setMoreSubTitleVisible", "visibility", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categoryedit.g */
public interface OnClickTabItemListener {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.g$a */
    public static final class C47278a {
        /* renamed from: a */
        public static void m187213a(OnClickTabItemListener gVar) {
        }

        /* renamed from: a */
        public static void m187214a(OnClickTabItemListener gVar, CategoryItemView aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "view");
        }

        /* renamed from: a */
        public static boolean m187215a(OnClickTabItemListener gVar, View view, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            return false;
        }
    }

    /* renamed from: a */
    void mo166108a();

    /* renamed from: a */
    void mo166109a(int i);

    /* renamed from: a */
    void mo166110a(CategoryItemView aVar);

    /* renamed from: a */
    void mo166111a(String str);

    /* renamed from: a */
    void mo166112a(String str, String str2, String str3);

    /* renamed from: a */
    boolean mo166113a(View view, boolean z, boolean z2);
}
