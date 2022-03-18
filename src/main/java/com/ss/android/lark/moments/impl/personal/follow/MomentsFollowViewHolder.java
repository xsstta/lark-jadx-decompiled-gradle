package com.ss.android.lark.moments.impl.personal.follow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.widget.MomentsFollowButton;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.personal.MomentsProfileActivity;
import com.ss.android.lark.moments.impl.personal.follow.viewmodel.FollowMomentUser;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/MomentsFollowViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/personal/follow/viewmodel/FollowMomentUser;", "Landroid/view/View;", "itemView", "listener", "Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsFollowClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsFollowClickListener;)V", "getListener", "()Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsFollowClickListener;", "mData", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.follow.d */
public final class MomentsFollowViewHolder extends AbstractC58967a<FollowMomentUser, View> {

    /* renamed from: b */
    public static final Companion f120550b = new Companion(null);

    /* renamed from: d */
    private static final int f120551d = UIHelper.dp2px(48.0f);

    /* renamed from: a */
    public FollowMomentUser f120552a;

    /* renamed from: c */
    private final IMomentsFollowClickListener f120553c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/follow/MomentsFollowViewHolder$Companion;", "", "()V", "AVATAR_SIZE", "", "create", "Lcom/ss/android/lark/moments/impl/personal/follow/MomentsFollowViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsFollowClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsFollowViewHolder mo167706a(ViewGroup viewGroup, IMomentsFollowClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_follow_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsFollowViewHolder(inflate, aVar);
        }
    }

    /* renamed from: a */
    public final IMomentsFollowClickListener mo167704a() {
        return this.f120553c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/follow/MomentsFollowViewHolder$onBind$3", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.d$d */
    public static final class C47863d extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowViewHolder f120558a;

        /* renamed from: b */
        final /* synthetic */ FollowMomentUser f120559b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.personal.follow.d$d$a */
        static final class RunnableC47864a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47863d f120560a;

            RunnableC47864a(C47863d dVar) {
                this.f120560a = dVar;
            }

            public final void run() {
                FollowMomentUser aVar = this.f120560a.f120558a.f120552a;
                if (aVar != null) {
                    View view = this.f120560a.f120558a.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    Boolean bool = aVar.mo167688a().is_current_user_following;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "it.user.is_current_user_following");
                    ((MomentsFollowButton) view.findViewById(R.id.btFollow)).mo166233a(bool.booleanValue(), aVar.mo167689b());
                }
            }
        }

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            this.f120558a.mo167704a().mo167682a(this.f120559b.mo167688a());
            this.f120558a.itemView.postDelayed(new RunnableC47864a(this), 500);
        }

        C47863d(MomentsFollowViewHolder dVar, FollowMomentUser aVar) {
            this.f120558a = dVar;
            this.f120559b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/follow/MomentsFollowViewHolder$onBind$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.d$b */
    public static final class C47861b extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowViewHolder f120554a;

        /* renamed from: b */
        final /* synthetic */ FollowMomentUser f120555b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            this.f120554a.mo167704a().mo167683b();
            MomentsHitPoint.f119720a.mo166849f("notification_page");
            MomentsProfileActivity.Companion aVar = MomentsProfileActivity.f120464g;
            String str = this.f120555b.mo167688a().user_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "data.user.user_id");
            View view2 = this.f120554a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            MomentsProfileActivity.Companion.m188998a(aVar, str, context, null, 4, null);
        }

        C47861b(MomentsFollowViewHolder dVar, FollowMomentUser aVar) {
            this.f120554a = dVar;
            this.f120555b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/follow/MomentsFollowViewHolder$onBind$2", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.follow.d$c */
    public static final class C47862c extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsFollowViewHolder f120556a;

        /* renamed from: b */
        final /* synthetic */ FollowMomentUser f120557b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            this.f120556a.mo167704a().mo167681a();
            IProfileModuleDependency profileModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency();
            View view2 = this.f120556a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            String str = this.f120557b.mo167688a().user_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "data.user.user_id");
            profileModuleDependency.mo144727a(context, str);
        }

        C47862c(MomentsFollowViewHolder dVar, FollowMomentUser aVar) {
            this.f120556a = dVar;
            this.f120557b = aVar;
        }
    }

    /* renamed from: a */
    public void mo165944a(FollowMomentUser aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) aVar);
        this.f120552a = aVar;
        String str = aVar.mo167688a().avatar_key;
        String str2 = aVar.mo167688a().user_id;
        int i = f120551d;
        AvatarImage build = AvatarImage.Builder.obtain(str, str2, i, i).build();
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        IRequestCreator override = ImageLoader.with(view.getContext()).load(build).placeholder(R.drawable.common_chat_window_image_item_holder).override(i, i);
        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(itemVie…AVATAR_SIZE, AVATAR_SIZE)");
        IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, i, i, false, null, 24, null);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        a.into((LKUIRoundedImageView2) view2.findViewById(R.id.avatar));
        this.itemView.setOnClickListener(new C47861b(this, aVar));
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view3.findViewById(R.id.avatar)).setOnClickListener(new C47862c(this, aVar));
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        TextView textView = (TextView) view4.findViewById(R.id.name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
        textView.setText(aVar.mo167688a().name);
        if (C57782ag.m224242a(MomentsDependencyHolder.f118998b.mo165899a().accountDependency().mo144688a(), aVar.mo167688a().user_id)) {
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            MomentsFollowButton momentsFollowButton = (MomentsFollowButton) view5.findViewById(R.id.btFollow);
            Intrinsics.checkExpressionValueIsNotNull(momentsFollowButton, "itemView.btFollow");
            momentsFollowButton.setVisibility(4);
            return;
        }
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        MomentsFollowButton momentsFollowButton2 = (MomentsFollowButton) view6.findViewById(R.id.btFollow);
        Intrinsics.checkExpressionValueIsNotNull(momentsFollowButton2, "itemView.btFollow");
        momentsFollowButton2.setVisibility(0);
        View view7 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
        Boolean bool = aVar.mo167688a().is_current_user_following;
        Intrinsics.checkExpressionValueIsNotNull(bool, "data.user.is_current_user_following");
        ((MomentsFollowButton) view7.findViewById(R.id.btFollow)).mo166233a(bool.booleanValue(), aVar.mo167689b());
        View view8 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
        ((MomentsFollowButton) view8.findViewById(R.id.btFollow)).setOnClickListener(new C47863d(this, aVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsFollowViewHolder(View view, IMomentsFollowClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f120553c = aVar;
    }
}
