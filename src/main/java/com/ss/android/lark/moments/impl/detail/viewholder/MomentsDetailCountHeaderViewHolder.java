package com.ss.android.lark.moments.impl.detail.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailLabelItem;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCountHeaderViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.a.d */
public final class MomentsDetailCountHeaderViewHolder extends AbstractC58967a<MomentsDetailLabelItem, View> {

    /* renamed from: a */
    public static final Companion f119545a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCountHeaderViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCountHeaderViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsDetailCountHeaderViewHolder mo166530a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_reply_header, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsDetailCountHeaderViewHolder(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsDetailCountHeaderViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(MomentsDetailLabelItem fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) fVar);
        String str = "";
        String str2 = str;
        int a = fVar.mo166483c().mo166484a();
        if (fVar.mo166481b() == 0) {
            str2 = FakeBoldSpan.f119246a.mo166167a(UIHelper.mustacheFormat((int) R.string.Lark_Community_HotCommentsHotCommentNumber, "HotCommentNumber", String.valueOf(a)));
        } else if (fVar.mo166481b() == 1) {
            if (a > 0) {
                str = String.valueOf(a);
            }
            str2 = FakeBoldSpan.f119246a.mo166167a(UIHelper.mustacheFormat((int) R.string.Lark_Community_AllCommentsAllCommentNumber, "allCommentNumber", str));
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.reply_count);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.reply_count");
        textView.setText(str2);
    }
}
