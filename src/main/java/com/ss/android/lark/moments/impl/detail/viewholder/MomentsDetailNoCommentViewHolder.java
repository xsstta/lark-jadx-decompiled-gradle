package com.ss.android.lark.moments.impl.detail.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.common.utility.DeviceUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000f2\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailNoCommentViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "", "Landroid/view/View;", "itemView", "clickListener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "getClickListener", "()Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "hasReLayout", "", "onBind", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.a.f */
public final class MomentsDetailNoCommentViewHolder extends AbstractC58967a<Unit, View> {

    /* renamed from: a */
    public static final Companion f119551a = new Companion(null);

    /* renamed from: b */
    private boolean f119552b;

    /* renamed from: c */
    private final IMomentClickListener f119553c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailNoCommentViewHolder$Companion;", "", "()V", "KEY_BOARD_HEIGHT", "", "LINE_HEIGHT", "MIN_PADDING_TOP", "create", "Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailNoCommentViewHolder;", "parent", "Landroid/view/ViewGroup;", "clickListener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsDetailNoCommentViewHolder mo166537a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_no_comment, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsDetailNoCommentViewHolder(inflate, aVar);
        }
    }

    /* renamed from: a */
    public final IMomentClickListener mo166535a() {
        return this.f119553c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDraw"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.f$d */
    public static final class ViewTreeObserver$OnDrawListenerC47364d implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public static final ViewTreeObserver$OnDrawListenerC47364d f119557a = new ViewTreeObserver$OnDrawListenerC47364d();

        ViewTreeObserver$OnDrawListenerC47364d() {
        }

        public final void onDraw() {
            MomentsAppreciableHitPoint.f119684a.mo166725J();
            MomentsAppreciableHitPoint.f119684a.mo166726K();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.f$b */
    public static final class RunnableC47362b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailNoCommentViewHolder f119554a;

        /* renamed from: b */
        final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC47365e f119555b;

        RunnableC47362b(MomentsDetailNoCommentViewHolder fVar, ViewTreeObserver$OnGlobalLayoutListenerC47365e eVar) {
            this.f119554a = fVar;
            this.f119555b = eVar;
        }

        public final void run() {
            View view = this.f119554a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f119555b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailNoCommentViewHolder$onBind$listener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.f$e */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC47365e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailNoCommentViewHolder f119558a;

        public void onGlobalLayout() {
            View view = this.f119558a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int[] iArr = new int[2];
            this.f119558a.itemView.getLocationOnScreen(iArr);
            View view2 = this.f119558a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            int screenHeight = (((DeviceUtils.getScreenHeight(view2.getContext()) - iArr[1]) - UIHelper.dp2px(79.0f)) - UIHelper.dp2px(22.0f)) / 2;
            if (screenHeight > UIHelper.dp2px(32.0f)) {
                this.f119558a.itemView.setPadding(0, screenHeight, 0, 0);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC47365e(MomentsDetailNoCommentViewHolder fVar) {
            this.f119558a = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailNoCommentViewHolder$onBind$2", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.f$c */
    public static final class C47363c extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailNoCommentViewHolder f119556a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47363c(MomentsDetailNoCommentViewHolder fVar) {
            this.f119556a = fVar;
        }

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            this.f119556a.mo166535a().mo166622b();
        }
    }

    /* renamed from: a */
    public void mo165944a(Unit unit) {
        super.mo165944a((Object) unit);
        if (!this.f119552b) {
            this.f119552b = true;
            ViewTreeObserver$OnGlobalLayoutListenerC47365e eVar = new ViewTreeObserver$OnGlobalLayoutListenerC47365e(this);
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.getViewTreeObserver().addOnGlobalLayoutListener(eVar);
            this.itemView.postDelayed(new RunnableC47362b(this, eVar), 500);
            this.itemView.setOnClickListener(new C47363c(this));
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            view2.getViewTreeObserver().addOnDrawListener(ViewTreeObserver$OnDrawListenerC47364d.f119557a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsDetailNoCommentViewHolder(View view, IMomentClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f119553c = aVar;
    }
}
