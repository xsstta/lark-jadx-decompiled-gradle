package com.ss.android.lark.moments.impl.personal;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0017\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileHeaderLoadingViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "mIsShowLoading", "", "mSkeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "mSkeletonRunnable", "Ljava/lang/Runnable;", "hideLoading", "onBind", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "onViewRecycled", "showLoading", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.g */
public final class MomentsProfileHeaderLoadingViewHolder extends AbstractC58967a<Unit, View> {

    /* renamed from: c */
    public static final Companion f120561c = new Companion(null);

    /* renamed from: a */
    public boolean f120562a;

    /* renamed from: b */
    public C2057g f120563b;

    /* renamed from: d */
    private Runnable f120564d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileHeaderLoadingViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/personal/MomentsProfileHeaderLoadingViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsProfileHeaderLoadingViewHolder mo167710a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_profile_header_loading, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsProfileHeaderLoadingViewHolder(inflate);
        }
    }

    /* renamed from: a */
    public final void mo167708a() {
        m189094c();
    }

    /* renamed from: b */
    private final void m189093b() {
        if (!this.f120562a) {
            RunnableC47865b bVar = new RunnableC47865b(this);
            this.f120564d = bVar;
            UICallbackExecutor.executeDelayed(bVar, 100);
        }
    }

    /* renamed from: c */
    private final void m189094c() {
        Runnable runnable = this.f120564d;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
            this.f120564d = null;
            return;
        }
        C2057g gVar = this.f120563b;
        if (gVar != null) {
            if (gVar != null) {
                gVar.mo10130b();
            }
            this.f120562a = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.g$b */
    public static final class RunnableC47865b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileHeaderLoadingViewHolder f120565a;

        RunnableC47865b(MomentsProfileHeaderLoadingViewHolder gVar) {
            this.f120565a = gVar;
        }

        public final void run() {
            MomentsProfileHeaderLoadingViewHolder gVar = this.f120565a;
            View view = gVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            gVar.f120563b = C2052c.m8961a((FrameLayout) view.findViewById(R.id.skeleton_container)).mo10151a(R.layout.moments_item_skeleton_profile_header).mo10152a(UIUtils.canShowSkeleton()).mo10156d(20).mo10154b(R.color.skeleton_shine).mo10155c(1000).mo10153a();
            this.f120565a.f120562a = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsProfileHeaderLoadingViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(Unit unit) {
        m189093b();
    }
}
