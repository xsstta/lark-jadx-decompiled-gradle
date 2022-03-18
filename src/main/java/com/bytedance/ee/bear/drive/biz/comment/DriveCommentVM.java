package com.bytedance.ee.bear.drive.biz.comment;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.comment.data.C6377b;
import com.bytedance.ee.util.p718t.C13749l;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0015\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u000e\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/comment/DriveCommentVM;", "Landroidx/lifecycle/ViewModel;", "()V", "COMMENT_PANEL_SHADOW_HEIGHT", "", "MAX_COMMENT_PANEL_DEFAULT_HEIGHT", "MIN_COMMENT_PANEL_DEFAULT_HEIGHT", "commentDataManger", "Lcom/bytedance/ee/bear/drive/biz/comment/data/DriveCommentDataManager;", "getCommentDataManger", "()Lcom/bytedance/ee/bear/drive/biz/comment/data/DriveCommentDataManager;", "commentPanelShowing", "Landroidx/lifecycle/MutableLiveData;", "", "getCommentPanelShowing", "()Landroidx/lifecycle/MutableLiveData;", "liveCommentCount", "getLiveCommentCount", "liveFeedSelectedComment", "Lcom/bytedance/ee/bear/drive/biz/comment/area/CommentRectF;", "getLiveFeedSelectedComment", "mCommentPanelDefaultHeight", "getCommentPanelDefaultHeight", "setCommentPanelDefaultHeight", "", "height", "(Ljava/lang/Integer;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.comment.g */
public final class DriveCommentVM extends AbstractC1142af {
    private final int COMMENT_PANEL_SHADOW_HEIGHT = C13749l.m55738a(18);
    private final int MAX_COMMENT_PANEL_DEFAULT_HEIGHT = ((int) (((float) (C13749l.m55748b() * 4)) / 5.0f));
    private final int MIN_COMMENT_PANEL_DEFAULT_HEIGHT = ((int) (((float) (C13749l.m55748b() * 2)) / 5.0f));
    private final C6377b commentDataManger = new C6377b(ar.f14811a);
    private final C1177w<Boolean> commentPanelShowing = new C1177w<>();
    private final C1177w<Integer> liveCommentCount = new C1177w<>();
    private final C1177w<CommentRectF> liveFeedSelectedComment = new C1177w<>();
    private int mCommentPanelDefaultHeight;

    public final C6377b getCommentDataManger() {
        return this.commentDataManger;
    }

    public final C1177w<Boolean> getCommentPanelShowing() {
        return this.commentPanelShowing;
    }

    public final C1177w<Integer> getLiveCommentCount() {
        return this.liveCommentCount;
    }

    public final C1177w<CommentRectF> getLiveFeedSelectedComment() {
        return this.liveFeedSelectedComment;
    }

    public final int getCommentPanelDefaultHeight() {
        int i = this.mCommentPanelDefaultHeight;
        if (i <= 0) {
            return C13749l.m55748b() / 2;
        }
        return i;
    }

    public final void setCommentPanelDefaultHeight(Integer num) {
        if (this.mCommentPanelDefaultHeight <= 0 && num != null && num.intValue() > this.MIN_COMMENT_PANEL_DEFAULT_HEIGHT && num.intValue() < this.MAX_COMMENT_PANEL_DEFAULT_HEIGHT) {
            this.mCommentPanelDefaultHeight = num.intValue() - this.COMMENT_PANEL_SHADOW_HEIGHT;
        }
    }
}
