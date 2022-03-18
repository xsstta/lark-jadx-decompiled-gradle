package com.ss.android.lark.moments.impl.personal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.DeviceUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.personal.follow.IMomentsProfileEmpty;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileEmptyPostViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/personal/follow/IMomentsProfileEmpty;", "Landroid/view/View;", "itemView", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "getListener", "()Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.e */
public final class MomentsProfileEmptyPostViewHolder extends AbstractC58967a<IMomentsProfileEmpty, View> {

    /* renamed from: a */
    public static final Companion f120517a = new Companion(null);

    /* renamed from: b */
    private final IMomentClickListener f120518b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileEmptyPostViewHolder$Companion;", "", "()V", "miniPadding", "", "create", "Lcom/ss/android/lark/moments/impl/personal/MomentsProfileEmptyPostViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsProfileEmptyPostViewHolder mo167664a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_profile_empty_post_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsProfileEmptyPostViewHolder(inflate, aVar);
        }
    }

    /* renamed from: a */
    public final IMomentClickListener mo167662a() {
        return this.f120518b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDraw"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.e$d */
    public static final class ViewTreeObserver$OnDrawListenerC47847d implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public static final ViewTreeObserver$OnDrawListenerC47847d f120522a = new ViewTreeObserver$OnDrawListenerC47847d();

        ViewTreeObserver$OnDrawListenerC47847d() {
        }

        public final void onDraw() {
            MomentsAppreciableHitPoint.f119684a.mo166735T();
            MomentsAppreciableHitPoint.f119684a.mo166736U();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.e$b */
    public static final class RunnableC47845b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileEmptyPostViewHolder f120519a;

        /* renamed from: b */
        final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC47848e f120520b;

        RunnableC47845b(MomentsProfileEmptyPostViewHolder eVar, ViewTreeObserver$OnGlobalLayoutListenerC47848e eVar2) {
            this.f120519a = eVar;
            this.f120520b = eVar2;
        }

        public final void run() {
            View view = this.f120519a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f120520b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/personal/MomentsProfileEmptyPostViewHolder$onBind$fixHeightListener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.e$e */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC47848e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileEmptyPostViewHolder f120523a;

        /* renamed from: b */
        final /* synthetic */ IMomentsProfileEmpty f120524b;

        public void onGlobalLayout() {
            int i;
            int i2;
            View view = this.f120523a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            IMomentsProfileEmpty bVar = this.f120524b;
            if (bVar == null || !bVar.mo167660b()) {
                View view2 = this.f120523a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                ImageView imageView = (ImageView) view2.findViewById(R.id.ivEmpty);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.ivEmpty");
                i2 = imageView.getHeight() + UIHelper.dp2px(12.0f);
                View view3 = this.f120523a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                TextView textView = (TextView) view3.findViewById(R.id.tvEmpty);
                Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.tvEmpty");
                i = textView.getHeight();
            } else {
                View view4 = this.f120523a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                ImageView imageView2 = (ImageView) view4.findViewById(R.id.ivEmpty);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.ivEmpty");
                int height = imageView2.getHeight() + UIHelper.dp2px(12.0f);
                View view5 = this.f120523a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                TextView textView2 = (TextView) view5.findViewById(R.id.tvEmpty);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.tvEmpty");
                i2 = height + textView2.getHeight() + UIHelper.dp2px(16.0f);
                View view6 = this.f120523a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                TextView textView3 = (TextView) view6.findViewById(R.id.btPost);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.btPost");
                i = textView3.getHeight();
            }
            int[] iArr = new int[2];
            this.f120523a.itemView.getLocationOnScreen(iArr);
            View view7 = this.f120523a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            int screenHeight = ((DeviceUtils.getScreenHeight(view7.getContext()) - iArr[1]) - (i2 + i)) / 2;
            if (screenHeight > UIHelper.dp2px(40.0f)) {
                this.f120523a.itemView.setPadding(0, screenHeight, 0, 0);
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC47848e(MomentsProfileEmptyPostViewHolder eVar, IMomentsProfileEmpty bVar) {
            this.f120523a = eVar;
            this.f120524b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/MomentsProfileEmptyPostViewHolder$onBind$2", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.e$c */
    public static final class C47846c extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileEmptyPostViewHolder f120521a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47846c(MomentsProfileEmptyPostViewHolder eVar) {
            this.f120521a = eVar;
        }

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "post_edit", "moments_edit_page_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
            this.f120521a.mo167662a().mo166627e();
        }
    }

    /* renamed from: a */
    public void mo165944a(IMomentsProfileEmpty bVar) {
        super.mo165944a((Object) bVar);
        ViewTreeObserver$OnGlobalLayoutListenerC47848e eVar = new ViewTreeObserver$OnGlobalLayoutListenerC47848e(this, bVar);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        view.getViewTreeObserver().addOnGlobalLayoutListener(eVar);
        this.itemView.postDelayed(new RunnableC47845b(this, eVar), 500);
        int i = 0;
        boolean z = true;
        if (bVar == null || !bVar.mo167660b()) {
            z = false;
        }
        if (z) {
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(R.id.tvEmpty);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.tvEmpty");
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            textView.setText(C52990a.m205228a(view3.getContext(), (int) R.string.Lark_Community_MomentsEmptyState));
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            ((ImageView) view4.findViewById(R.id.ivEmpty)).setImageResource(R.drawable.illustration_empty_neutral_no_posts);
        } else {
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            TextView textView2 = (TextView) view5.findViewById(R.id.tvEmpty);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.tvEmpty");
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            textView2.setText(C52990a.m205228a(view6.getContext(), (int) R.string.Lark_Community_MomentsEmptyStateTheirs));
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            ((ImageView) view7.findViewById(R.id.ivEmpty)).setImageResource(R.drawable.illustration_empty_neutral_no_content);
        }
        View view8 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
        TextView textView3 = (TextView) view8.findViewById(R.id.btPost);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.btPost");
        if (!z) {
            i = 8;
        }
        textView3.setVisibility(i);
        View view9 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
        ((TextView) view9.findViewById(R.id.btPost)).setOnClickListener(new C47846c(this));
        View view10 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
        view10.getViewTreeObserver().addOnDrawListener(ViewTreeObserver$OnDrawListenerC47847d.f120522a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsProfileEmptyPostViewHolder(View view, IMomentClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f120518b = aVar;
    }
}
