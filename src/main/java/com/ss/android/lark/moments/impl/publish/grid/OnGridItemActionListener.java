package com.ss.android.lark.moments.impl.publish.grid;

import android.view.View;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "", "onDeleteClickListener", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "onItemClickListener", "index", "", "onPreviewClickListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.h */
public interface OnGridItemActionListener {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.h$a */
    public static final class C47984a {
        /* renamed from: a */
        public static void m189430a(OnGridItemActionListener hVar, View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "view");
        }

        /* renamed from: a */
        public static void m189431a(OnGridItemActionListener hVar, View view, MediaData fVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }

        /* renamed from: b */
        public static void m189432b(OnGridItemActionListener hVar, View view, MediaData fVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
    }

    /* renamed from: a */
    void mo168089a(View view, int i);

    /* renamed from: a */
    void mo168090a(View view, MediaData fVar);

    /* renamed from: b */
    void mo168091b(View view, MediaData fVar);
}
