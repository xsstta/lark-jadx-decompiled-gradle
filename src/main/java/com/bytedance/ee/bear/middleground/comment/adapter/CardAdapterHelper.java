package com.bytedance.ee.bear.middleground.comment.adapter;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapterHelper;", "", "()V", "getViewType", "", "position", "dates", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "getViewTypeForPartComment", "getViewTypeForWholeComment", "dataSize", "ItemType", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CardAdapterHelper {

    /* renamed from: a */
    public static final CardAdapterHelper f24333a = new CardAdapterHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapterHelper$ItemType;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;II)V", "getType", "()I", "PLACEHOLDER", "QUOTE", "PART_CONTENT", "WHOLE_TEXT", "WHOLE_CONTENT", "WHOLE_INPUT", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum ItemType {
        PLACEHOLDER(0),
        QUOTE(1),
        PART_CONTENT(2),
        WHOLE_TEXT(3),
        WHOLE_CONTENT(4),
        WHOLE_INPUT(5);
        
        private final int type;

        public final int getType() {
            return this.type;
        }

        private ItemType(int i) {
            this.type = i;
        }
    }

    private CardAdapterHelper() {
    }

    /* renamed from: a */
    private final int m37559a(int i) {
        if (i == 0) {
            return ItemType.PLACEHOLDER.getType();
        }
        if (i != 1) {
            return ItemType.PART_CONTENT.getType();
        }
        return ItemType.QUOTE.getType();
    }

    /* renamed from: a */
    private final int m37560a(int i, int i2) {
        if (i == 0) {
            if (i2 == 1) {
                return ItemType.WHOLE_INPUT.getType();
            }
            return ItemType.WHOLE_TEXT.getType();
        } else if (i == i2 - 1) {
            return ItemType.WHOLE_INPUT.getType();
        } else {
            return ItemType.WHOLE_CONTENT.getType();
        }
    }

    /* renamed from: a */
    public final int mo34548a(int i, List<? extends CommentBean.CommentDetail> list) {
        Intrinsics.checkParameterIsNotNull(list, "dates");
        if (((CommentBean.CommentDetail) list.get(i)).isWholeComment()) {
            return m37560a(i, list.size());
        }
        return m37559a(i);
    }
}
