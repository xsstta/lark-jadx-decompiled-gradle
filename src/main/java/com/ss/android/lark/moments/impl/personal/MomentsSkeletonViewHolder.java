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
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsSkeletonViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "Landroid/view/View;", "itemView", "loadingType", "", "(Landroid/view/View;I)V", "mIsShowLoading", "", "mSkeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "mSkeletonRunnable", "Ljava/lang/Runnable;", "hideLoading", "", "onBind", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onViewRecycled", "showLoading", "showTopRound", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.m */
public final class MomentsSkeletonViewHolder extends AbstractC58967a<IMomentsItemBase, View> {

    /* renamed from: d */
    public static final Companion f120592d = new Companion(null);

    /* renamed from: a */
    public boolean f120593a;

    /* renamed from: b */
    public C2057g f120594b;

    /* renamed from: c */
    public final int f120595c;

    /* renamed from: e */
    private Runnable f120596e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsSkeletonViewHolder$Companion;", "", "()V", "LOADING_TYPE_NEW_PROFILE_INFO", "", "LOADING_TYPE_NEW_PROFILE_POST", "LOADING_TYPE_PROFILE_POST", "create", "Lcom/ss/android/lark/moments/impl/personal/MomentsSkeletonViewHolder;", "parent", "Landroid/view/ViewGroup;", "loadingType", "createNewProfileInfo", "createNewProfilePost", "createProfilePost", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.m$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsSkeletonViewHolder mo167743a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            return m189130a(viewGroup, 0);
        }

        /* renamed from: b */
        public final MomentsSkeletonViewHolder mo167744b(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            return m189130a(viewGroup, 2);
        }

        /* renamed from: c */
        public final MomentsSkeletonViewHolder mo167745c(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            return m189130a(viewGroup, 1);
        }

        /* renamed from: a */
        private final MomentsSkeletonViewHolder m189130a(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_profile_post_loading, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsSkeletonViewHolder(inflate, i);
        }
    }

    /* renamed from: a */
    public final void mo167741a() {
        m189126b();
    }

    /* renamed from: b */
    private final void m189126b() {
        Runnable runnable = this.f120596e;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
            this.f120596e = null;
            return;
        }
        C2057g gVar = this.f120594b;
        if (gVar != null) {
            if (gVar != null) {
                gVar.mo10130b();
            }
            this.f120593a = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.m$b */
    public static final class RunnableC47879b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsSkeletonViewHolder f120597a;

        /* renamed from: b */
        final /* synthetic */ boolean f120598b;

        RunnableC47879b(MomentsSkeletonViewHolder mVar, boolean z) {
            this.f120597a = mVar;
            this.f120598b = z;
        }

        public final void run() {
            int i;
            if (this.f120597a.f120595c == 2) {
                i = R.layout.moments_skeleton_profile_info_item;
            } else if (this.f120597a.f120595c == 1) {
                i = R.layout.moments_skeleton_profile_post_item;
            } else if (this.f120598b) {
                i = R.layout.moments_item_skeleton_top_round_feed;
            } else {
                i = R.layout.moments_item_skeleton_profile_post;
            }
            MomentsSkeletonViewHolder mVar = this.f120597a;
            View view = mVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            mVar.f120594b = C2052c.m8961a((FrameLayout) view.findViewById(R.id.skeleton_container)).mo10151a(i).mo10152a(UIUtils.canShowSkeleton()).mo10156d(20).mo10154b(R.color.skeleton_shine).mo10155c(1000).mo10153a();
            this.f120597a.f120593a = true;
        }
    }

    /* renamed from: a */
    private final void m189125a(boolean z) {
        if (!this.f120593a) {
            RunnableC47879b bVar = new RunnableC47879b(this, z);
            this.f120596e = bVar;
            UICallbackExecutor.executeDelayed(bVar, 100);
        }
    }

    /* renamed from: a */
    public void mo165944a(IMomentsItemBase iMomentsItemBase) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!(iMomentsItemBase instanceof MomentsPostLoadingItem) || !((MomentsPostLoadingItem) iMomentsItemBase).mo167657b()) {
            z = false;
        } else {
            z = true;
        }
        m189125a(z);
        if ((iMomentsItemBase instanceof MomentsProfilePostLoadingItem) && ((MomentsProfilePostLoadingItem) iMomentsItemBase).mo167717b()) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            view.setPadding(view.getPaddingLeft(), UIUtils.dp2px(view2.getContext(), 12.0f), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsSkeletonViewHolder(View view, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f120595c = i;
    }
}
