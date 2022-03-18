package com.bytedance.ee.bear.bitable.card.view.cell.attachment.view;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentGridView$init$1", "Landroidx/recyclerview/widget/GridLayoutManager;", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AttachmentGridView$init$1 extends GridLayoutManager {

    /* renamed from: i */
    final /* synthetic */ AttachmentGridView f13564i;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            C13479a.m54759a("AttachmentGridView", "meet an IndexOutOfBoundsException in RecyclerView", e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AttachmentGridView$init$1(AttachmentGridView attachmentGridView, Context context, int i) {
        super(context, i);
        this.f13564i = attachmentGridView;
    }
}
