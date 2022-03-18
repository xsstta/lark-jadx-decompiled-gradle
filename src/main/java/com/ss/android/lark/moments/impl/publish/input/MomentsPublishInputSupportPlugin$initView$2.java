package com.ss.android.lark.moments.impl.publish.input;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$initView$2", "Landroidx/recyclerview/widget/GridLayoutManager;", "canScrollHorizontally", "", "canScrollVertically", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsPublishInputSupportPlugin$initView$2 extends GridLayoutManager {

    /* renamed from: i */
    final /* synthetic */ MomentsPublishInputSupportPlugin f120803i;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MomentsPublishInputSupportPlugin$initView$2(MomentsPublishInputSupportPlugin bVar, Context context, int i) {
        super(context, i);
        this.f120803i = bVar;
    }
}
