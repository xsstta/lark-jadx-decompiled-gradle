package com.ss.android.lark.moments.impl.personal.p2361new.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileDisableFollowInfoViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/personal/new/viewholder/IMomentsProfileDisableFollowInfo;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "mData", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.new.a.d */
public final class MomentsProfileDisableFollowInfoViewHolder extends AbstractC58967a<IMomentsProfileDisableFollowInfo, View> {

    /* renamed from: a */
    public static final Companion f120624a = new Companion(null);

    /* renamed from: b */
    private IMomentsProfileDisableFollowInfo f120625b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileDisableFollowInfoViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileDisableFollowInfoViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsProfileDisableFollowInfoViewHolder mo167774a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_profile_disable_follow_info_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsProfileDisableFollowInfoViewHolder(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsProfileDisableFollowInfoViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(IMomentsProfileDisableFollowInfo aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) aVar);
        this.f120625b = aVar;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/DINAlternateBold.ttf");
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        TextView textView = (TextView) view2.findViewById(R.id.post_count);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.post_count");
        textView.setTypeface(createFromAsset);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        TextView textView2 = (TextView) view3.findViewById(R.id.post_count);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.post_count");
        textView2.setText(String.valueOf(aVar.mo167763c()));
        String quantityString = UIHelper.getQuantityString(R.plurals.Lark_Community_Dynamic, aVar.mo167763c());
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        TextView textView3 = (TextView) view4.findViewById(R.id.post_count_label);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.post_count_label");
        textView3.setText(quantityString);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        TextView textView4 = (TextView) view5.findViewById(R.id.reaction_count);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.reaction_count");
        textView4.setTypeface(createFromAsset);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        TextView textView5 = (TextView) view6.findViewById(R.id.reaction_count);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.reaction_count");
        textView5.setText(String.valueOf(aVar.mo167764d()));
        View view7 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
        TextView textView6 = (TextView) view7.findViewById(R.id.reaction_count_label);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.reaction_count_label");
        textView6.setText(UIHelper.getQuantityString(R.plurals.Lark_ProfilePage_ReationgNumber, aVar.mo167763c()));
    }
}
