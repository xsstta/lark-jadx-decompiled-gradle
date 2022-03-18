package com.ss.android.lark.moments.impl.detail.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.moments.v1.Category;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\""}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailPostViewHolder;", "Lcom/ss/android/lark/moments/impl/feed/MomentsPostViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "bindComment", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "bindContent", "bindFooter", "bindFrom", "bindHeader", "bindReaction", "getReactionWrapperMargin", "", "onClickCategoryFromLabel", "postId", "", "categoryId", "provideReactionList", "", "Lcom/ss/android/lark/reaction/widget/flowlayout/bean/ReactionFlowLayoutViewModel;", "reactionList", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "sendCLickMoreEvent", "sendClickReactionEvent", "sendClickUserEvent", "sendPostPressHitPoint", "sendReactionPressEvent", "setUpEllipsize", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.a.g */
public final class MomentsDetailPostViewHolder extends MomentsPostViewHolder {

    /* renamed from: a */
    public static final Companion f119559a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailPostViewHolder$Companion;", "", "()V", "REACTION_WRAPPER_LEFT_MARGIN", "", "REACTION_WRAPPER_RIGHT_MARGIN", "create", "Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailPostViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsDetailPostViewHolder mo166556a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_post, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsDetailPostViewHolder(inflate, aVar);
        }
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: a */
    public int mo166541a() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
        if (!(frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        return UIHelper.dp2px(60.0f) + UIHelper.dp2px(16.0f) + 0;
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: a */
    public List<C53061a> mo166542a(List<? extends ReactionDetailViewModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "reactionList");
        return ReactionUtils.f119254a.mo166213a(list);
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: e */
    public void mo166548e(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.show_more);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.show_more");
        textView.setVisibility(8);
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: d */
    public void mo166547d(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo166547d(bVar);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = UIHelper.dp2px(16.0f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: f */
    public void mo166549f(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo166549f(bVar);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.footer_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.footer_container");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = UIHelper.dp2px(6.0f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: g */
    public void mo166550g(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.comment_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.comment_container");
        constraintLayout.setVisibility(8);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.expose_comment_container);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.expose_comment_container");
        recyclerView.setVisibility(8);
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: h */
    public void mo166551h(IMomentsPost bVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
        String a = bVar.mo166379a();
        Category L = bVar.mo166427L();
        if (L != null) {
            str = L.category_id;
        } else {
            str = null;
        }
        MomentsHitPointNew.Companion.m188110a(aVar, a, "other_profile", "profile_main_view", str, (String) null, 16, (Object) null);
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: i */
    public void mo166552i(IMomentsPost bVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
        String a = bVar.mo166379a();
        Category L = bVar.mo166427L();
        if (L != null) {
            str = L.category_id;
        } else {
            str = null;
        }
        MomentsHitPointNew.Companion.m188110a(aVar, a, "reaction_press", "moments_msg_menu_view", str, (String) null, 16, (Object) null);
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: j */
    public void mo166553j(IMomentsPost bVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
        String a = bVar.mo166379a();
        Category L = bVar.mo166427L();
        if (L != null) {
            str = L.category_id;
        } else {
            str = null;
        }
        MomentsHitPointNew.Companion.m188110a(aVar, a, "reaction", "none", str, (String) null, 16, (Object) null);
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: k */
    public void mo166554k(IMomentsPost bVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
        String a = bVar.mo166379a();
        Category L = bVar.mo166427L();
        if (L != null) {
            str = L.category_id;
        } else {
            str = null;
        }
        MomentsHitPointNew.Companion.m188110a(aVar, a, "more", "moments_post_more_view", str, (String) null, 16, (Object) null);
        MomentsHitPointNew.Companion aVar2 = MomentsHitPointNew.f119721a;
        String str2 = bVar.mo166421F().id;
        Intrinsics.checkExpressionValueIsNotNull(str2, "data.post.id");
        aVar2.mo166852a(str2);
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: l */
    public void mo166555l(IMomentsPost bVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
        String a = bVar.mo166379a();
        Category L = bVar.mo166427L();
        if (L != null) {
            str = L.category_id;
        } else {
            str = null;
        }
        MomentsHitPointNew.Companion.m188110a(aVar, a, "post_press", "moments_msg_menu_view", str, (String) null, 16, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo166543a(com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost r6) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            super.mo166543a(r6)
            android.view.View r0 = r5.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131307531(0x7f092c0b, float:1.8233292E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.lark.moments.impl.common.widget.MomentsFollowButton r0 = (com.ss.android.lark.moments.impl.common.widget.MomentsFollowButton) r0
            java.lang.String r1 = "itemView.tv_follow"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.View r0 = (android.view.View) r0
            com.ss.android.lark.moments.impl.g.c.a r1 = com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager.f120180a
            boolean r1 = r1.mo167311i()
            r2 = 0
            if (r1 != 0) goto L_0x0050
            boolean r1 = r6.mo166464w()
            if (r1 != 0) goto L_0x0050
            com.ss.android.lark.moments.impl.commonvo.c r1 = r6.mo166423H()
            r3 = 0
            if (r1 == 0) goto L_0x003a
            com.bytedance.lark.pb.moments.v1.MomentUser$Type r1 = r1.mo166368g()
            goto L_0x003b
        L_0x003a:
            r1 = r3
        L_0x003b:
            com.bytedance.lark.pb.moments.v1.MomentUser$Type r4 = com.bytedance.lark.pb.moments.v1.MomentUser.Type.ANONYMOUS
            if (r1 == r4) goto L_0x0050
            com.ss.android.lark.moments.impl.commonvo.c r6 = r6.mo166423H()
            if (r6 == 0) goto L_0x0049
            com.bytedance.lark.pb.moments.v1.MomentUser$Type r3 = r6.mo166368g()
        L_0x0049:
            com.bytedance.lark.pb.moments.v1.MomentUser$Type r6 = com.bytedance.lark.pb.moments.v1.MomentUser.Type.NICKNAME
            if (r3 != r6) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r6 = 0
            goto L_0x0051
        L_0x0050:
            r6 = 1
        L_0x0051:
            if (r6 == 0) goto L_0x0055
            r2 = 8
        L_0x0055:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.detail.viewholder.MomentsDetailPostViewHolder.mo166543a(com.ss.android.lark.moments.impl.commonvo.item.b):void");
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: c */
    public void mo166546c(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo166546c(bVar);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.content_container");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = UIHelper.dp2px(16.0f);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            View findViewById = view2.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.divider");
            findViewById.setVisibility(8);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: b */
    public void mo166545b(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo166545b(bVar);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.time_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.time_label");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.f2816h = -1;
            layoutParams2.f2827s = -1;
            layoutParams2.f2817i = R.id.name;
            layoutParams2.f2825q = R.id.name;
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            CardView cardView = (CardView) view2.findViewById(R.id.from_label);
            Intrinsics.checkExpressionValueIsNotNull(cardView, "itemView.from_label");
            ViewGroup.LayoutParams layoutParams3 = cardView.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.f2817i = R.id.time_label;
                layoutParams4.f2825q = R.id.avatar;
                View view3 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                TextView textView2 = (TextView) view3.findViewById(R.id.name);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.name");
                ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
                if (layoutParams5 != null) {
                    ((ConstraintLayout.LayoutParams) layoutParams5).f2826r = R.id.tv_follow;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsDetailPostViewHolder(View view, IMomentClickListener aVar) {
        super(view, aVar);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: a */
    public void mo166544a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "postId");
        Intrinsics.checkParameterIsNotNull(str2, "categoryId");
        MomentsHitPointNew.Companion.m188110a(MomentsHitPointNew.f119721a, str, "category", "moments_feed_page_view", str2, (String) null, 16, (Object) null);
    }
}
