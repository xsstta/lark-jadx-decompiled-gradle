package com.ss.android.lark.mm.module.detail.comment;

import androidx.recyclerview.widget.C1374g;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.i */
public final class MmParaCommentDiffCallback extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private final List<MmComment.MmCommentInfo.CommentDetail> f116059a;

    /* renamed from: b */
    private final List<MmComment.MmCommentInfo.CommentDetail> f116060b;

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        return this.f116059a.size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        return this.f116060b.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.mm.module.detail.comment.model.MmComment$MmCommentInfo$CommentDetail> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.mm.module.detail.comment.model.MmComment$MmCommentInfo$CommentDetail> */
    /* JADX WARN: Multi-variable type inference failed */
    public MmParaCommentDiffCallback(List<? extends MmComment.MmCommentInfo.CommentDetail> list, List<? extends MmComment.MmCommentInfo.CommentDetail> list2) {
        Intrinsics.checkParameterIsNotNull(list, "oldList");
        Intrinsics.checkParameterIsNotNull(list2, "newList");
        this.f116059a = list;
        this.f116060b = list2;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        return Intrinsics.areEqual(this.f116059a.get(i).getClass(), this.f116060b.get(i2).getClass());
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        MmComment.MmCommentInfo.CommentDetail commentDetail = this.f116059a.get(i);
        MmComment.MmCommentInfo.CommentDetail commentDetail2 = this.f116060b.get(i2);
        if (!Intrinsics.areEqual(commentDetail.getComment_id(), commentDetail2.getComment_id()) || !Intrinsics.areEqual(commentDetail.getQuote(), commentDetail2.getQuote()) || commentDetail.getComment_content_list().size() != commentDetail2.getComment_content_list().size()) {
            return false;
        }
        return true;
    }
}
