package com.ss.android.lark.moments.impl.detail.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0017\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentLoadingViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "mIsShowLoading", "", "mSkeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "mSkeletonRunnable", "Ljava/lang/Runnable;", "hideLoading", "onBind", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "onViewRecycled", "showLoading", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.a.a */
public final class MomentsDetailCommentLoadingViewHolder extends AbstractC58967a<Unit, View> {

    /* renamed from: c */
    public static final Companion f119495c = new Companion(null);

    /* renamed from: a */
    public boolean f119496a;

    /* renamed from: b */
    public C2057g f119497b;

    /* renamed from: d */
    private Runnable f119498d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentLoadingViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/detail/viewholder/MomentsDetailCommentLoadingViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsDetailCommentLoadingViewHolder mo166510a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_detail_comment_loading, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsDetailCommentLoadingViewHolder(inflate);
        }
    }

    /* renamed from: a */
    public final void mo166508a() {
        m187723c();
    }

    /* renamed from: b */
    private final void m187722b() {
        if (!this.f119496a) {
            RunnableC47334b bVar = new RunnableC47334b(this);
            this.f119498d = bVar;
            UICallbackExecutor.executeDelayed(bVar, 100);
        }
    }

    /* renamed from: c */
    private final void m187723c() {
        Runnable runnable = this.f119498d;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
            this.f119498d = null;
            return;
        }
        C2057g gVar = this.f119497b;
        if (gVar != null) {
            if (gVar != null) {
                gVar.mo10130b();
            }
            this.f119496a = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.a.a$b */
    public static final class RunnableC47334b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailCommentLoadingViewHolder f119499a;

        RunnableC47334b(MomentsDetailCommentLoadingViewHolder aVar) {
            this.f119499a = aVar;
        }

        public final void run() {
            MomentsDetailCommentLoadingViewHolder aVar = this.f119499a;
            View view = aVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            aVar.f119497b = C2052c.m8961a((FrameLayout) view.findViewById(R.id.skeleton_container)).mo10151a(R.layout.item_skeleton_moments_comment).mo10152a(UIUtils.canShowSkeleton()).mo10156d(20).mo10154b(R.color.skeleton_shine).mo10155c(1000).mo10153a();
            this.f119499a.f119496a = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsDetailCommentLoadingViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(Unit unit) {
        m187722b();
    }
}
