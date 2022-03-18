package com.ss.android.lark.feed.app.view.title;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u001e\u0018\u00002\u00020\u0001:\u00010B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020\u0015H\u0002J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020'H\u0002J\b\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020!H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00061"}, d2 = {"Lcom/ss/android/lark/feed/app/view/title/FeedTitleScrollHelperV2;", "Lcom/ss/android/lark/feed/app/view/title/ITitleScrollHelper;", "feedType", "Lcom/ss/android/lark/biz/im/api/FeedCard$FeedType;", "title", "Lcom/ss/android/lark/feed/app/view/title/ITitle;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "appbarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "mDataAdapter", "Lcom/ss/android/lark/feed/app/view/FeedListAdapter;", "mHeaderAdapter", "mListener", "Lcom/ss/android/lark/feed/app/view/title/OnTitleScrollListener;", "(Lcom/ss/android/lark/biz/im/api/FeedCard$FeedType;Lcom/ss/android/lark/feed/app/view/title/ITitle;Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/appbar/AppBarLayout;Lcom/ss/android/lark/feed/app/view/FeedListAdapter;Lcom/ss/android/lark/feed/app/view/FeedListAdapter;Lcom/ss/android/lark/feed/app/view/title/OnTitleScrollListener;)V", "getAppbarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "getFeedType", "()Lcom/ss/android/lark/biz/im/api/FeedCard$FeedType;", "mAppBarPrev", "", "getMDataAdapter", "()Lcom/ss/android/lark/feed/app/view/FeedListAdapter;", "getMHeaderAdapter", "getMListener", "()Lcom/ss/android/lark/feed/app/view/title/OnTitleScrollListener;", "mOnAppbarLayoutOffsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "mOnScrollListener", "com/ss/android/lark/feed/app/view/title/FeedTitleScrollHelperV2$mOnScrollListener$1", "Lcom/ss/android/lark/feed/app/view/title/FeedTitleScrollHelperV2$mOnScrollListener$1;", "mShowTitle", "", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "getTitle", "()Lcom/ss/android/lark/feed/app/view/title/ITitle;", "checkNeedShowTitleBar", "", "destroy", "getTitleScrollOffset", "initAppbarLayout", "initRecyclerView", "recoverTitleBarScrollState", "resetTitleBarStatus", "updateScrollState", "showTitle", "ScrollDirection", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedTitleScrollHelperV2 implements ITitleScrollHelper {

    /* renamed from: a */
    public int f97634a;

    /* renamed from: b */
    private boolean f97635b = true;

    /* renamed from: c */
    private final AppBarLayout.AbstractC22134b f97636c = new C38021a(this);

    /* renamed from: d */
    private final C38022b f97637d = new C38022b(this);

    /* renamed from: e */
    private final FeedCard.FeedType f97638e;

    /* renamed from: f */
    private final AbstractC38026b f97639f;

    /* renamed from: g */
    private final RecyclerView f97640g;

    /* renamed from: h */
    private final AppBarLayout f97641h;

    /* renamed from: i */
    private final FeedListAdapter f97642i;

    /* renamed from: j */
    private final FeedListAdapter f97643j;

    /* renamed from: k */
    private final AbstractC38027d f97644k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/app/view/title/FeedTitleScrollHelperV2$ScrollDirection;", "", "(Ljava/lang/String;I)V", "UP", "DOWN", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ScrollDirection {
        UP,
        DOWN;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/feed/app/view/title/FeedTitleScrollHelperV2$ScrollDirection$Companion;", "", "()V", "resolve", "Lcom/ss/android/lark/feed/app/view/title/FeedTitleScrollHelperV2$ScrollDirection;", "current", "", "prev", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.view.title.FeedTitleScrollHelperV2$ScrollDirection$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ScrollDirection mo139143a(int i, int i2) {
                if (i > i2) {
                    return ScrollDirection.DOWN;
                }
                return ScrollDirection.UP;
            }
        }
    }

    /* renamed from: e */
    public final FeedCard.FeedType mo139139e() {
        return this.f97638e;
    }

    /* renamed from: f */
    public final AbstractC38026b mo139140f() {
        return this.f97639f;
    }

    /* renamed from: g */
    public final FeedListAdapter mo139141g() {
        return this.f97642i;
    }

    /* renamed from: h */
    public final FeedListAdapter mo139142h() {
        return this.f97643j;
    }

    /* renamed from: i */
    private final void m149503i() {
        this.f97641h.addOnOffsetChangedListener(this.f97636c);
    }

    @Override // com.ss.android.lark.feed.app.view.title.ITitleScrollHelper
    /* renamed from: a */
    public void mo139134a() {
        mo139135a(this.f97635b);
    }

    @Override // com.ss.android.lark.feed.app.view.title.ITitleScrollHelper
    /* renamed from: c */
    public void mo139137c() {
        mo139135a(true);
    }

    /* renamed from: j */
    private final void m149504j() {
        this.f97640g.addOnScrollListener(this.f97637d);
    }

    @Override // com.ss.android.lark.feed.app.view.title.ITitleScrollHelper
    /* renamed from: b */
    public void mo139136b() {
        int k = m149505k();
        boolean z = this.f97635b;
        if (k <= this.f97639f.mo139094a(this.f97638e)) {
            z = true;
        }
        mo139135a(z);
    }

    @Override // com.ss.android.lark.feed.app.view.title.ITitleScrollHelper
    /* renamed from: d */
    public void mo139138d() {
        this.f97641h.removeOnOffsetChangedListener(this.f97636c);
        this.f97640g.removeOnScrollListener(this.f97637d);
    }

    /* renamed from: k */
    private final int m149505k() {
        int totalScrollRange = this.f97641h.getTotalScrollRange();
        int i = this.f97634a;
        if (i < totalScrollRange) {
            return Math.abs(i);
        }
        RecyclerView.LayoutManager layoutManager = this.f97640g.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int a = this.f97639f.mo139094a(this.f97638e) + 1;
            if (findFirstVisibleItemPosition == 0) {
                View findViewByPosition = linearLayoutManager.findViewByPosition(0);
                if (findViewByPosition == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(findViewByPosition, "linearLayoutManager.findViewByPosition(0)!!");
                a = Math.abs(findViewByPosition.getTop());
            }
            return a + totalScrollRange;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/feed/app/view/title/FeedTitleScrollHelperV2$mOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.title.FeedTitleScrollHelperV2$b */
    public static final class C38022b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ FeedTitleScrollHelperV2 f97646a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38022b(FeedTitleScrollHelperV2 feedTitleScrollHelperV2) {
            this.f97646a = feedTitleScrollHelperV2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f97646a.mo139141g().mo138943m();
                FeedListAdapter h = this.f97646a.mo139142h();
                if (h != null) {
                    h.mo138943m();
                }
            } else if (i == 1 || i == 2) {
                this.f97646a.mo139141g().mo138942l();
                FeedListAdapter h2 = this.f97646a.mo139142h();
                if (h2 != null) {
                    h2.mo138942l();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i2 != 0) {
                if (i2 < 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f97646a.mo139135a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo139135a(boolean z) {
        if (this.f97635b != z) {
            this.f97635b = z;
            this.f97644k.mo137044a(z, 0, this.f97638e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "appbarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "kotlin.jvm.PlatformType", "offset", "", "onOffsetChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.title.FeedTitleScrollHelperV2$a */
    static final class C38021a implements AppBarLayout.AbstractC22134b {

        /* renamed from: a */
        final /* synthetic */ FeedTitleScrollHelperV2 f97645a;

        C38021a(FeedTitleScrollHelperV2 feedTitleScrollHelperV2) {
            this.f97645a = feedTitleScrollHelperV2;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            Intrinsics.checkExpressionValueIsNotNull(appBarLayout, "appbarLayout");
            if (abs < appBarLayout.getTotalScrollRange() && this.f97645a.f97634a != i) {
                boolean z = true;
                if (ScrollDirection.Companion.mo139143a(i, this.f97645a.f97634a) != ScrollDirection.DOWN && Math.abs(i) > this.f97645a.mo139140f().mo139094a(this.f97645a.mo139139e())) {
                    z = false;
                }
                this.f97645a.f97634a = i;
                this.f97645a.mo139135a(z);
            }
        }
    }

    public FeedTitleScrollHelperV2(FeedCard.FeedType feedType, AbstractC38026b bVar, RecyclerView recyclerView, AppBarLayout appBarLayout, FeedListAdapter feedListAdapter, FeedListAdapter feedListAdapter2, AbstractC38027d dVar) {
        Intrinsics.checkParameterIsNotNull(feedType, "feedType");
        Intrinsics.checkParameterIsNotNull(bVar, "title");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(appBarLayout, "appbarLayout");
        Intrinsics.checkParameterIsNotNull(feedListAdapter, "mDataAdapter");
        Intrinsics.checkParameterIsNotNull(dVar, "mListener");
        this.f97638e = feedType;
        this.f97639f = bVar;
        this.f97640g = recyclerView;
        this.f97641h = appBarLayout;
        this.f97642i = feedListAdapter;
        this.f97643j = feedListAdapter2;
        this.f97644k = dVar;
        m149503i();
        m149504j();
    }
}
