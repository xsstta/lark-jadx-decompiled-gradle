package com.ss.android.lark.feed.app.view.unread;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.view.p1870a.C37963a;
import com.ss.android.lark.feed.app.view.title.ITitleScrollHelper;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 )2\u00020\u0001:\u0001)BR\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0002\u0010\u0013J\b\u0010!\u001a\u00020\tH\u0016J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\u0012H\u0016J\b\u0010%\u001a\u00020\u0012H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R,\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/ss/android/lark/feed/app/view/unread/UnreadScrollListenerV2;", "Lcom/ss/android/lark/feed/app/view/unread/UnreadScrollHelper$OnUnreadScrollListener;", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "coordinateLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "targetView", "Landroid/view/View;", "titleOffset", "", "titleHelper", "Lcom/ss/android/lark/feed/app/view/title/ITitleScrollHelper;", "callback", "Lkotlin/Function1;", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "Lkotlin/ParameterName;", "name", "feedFilter", "", "(Lcom/google/android/material/appbar/AppBarLayout;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;ILcom/ss/android/lark/feed/app/view/title/ITitleScrollHelper;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getCoordinateLayout", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "mOffset", "mStateWatcher", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "getTargetView", "()Landroid/view/View;", "getTitleHelper", "()Lcom/ss/android/lark/feed/app/view/title/ITitleScrollHelper;", "getTitleOffset", "()I", "getOriginOffset", "getScrollOffset", "position", "gotoStartPosition", "resetTitleBarStatus", "unInit", "visitOtherFilterList", "target", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.view.a.c */
public final class UnreadScrollListenerV2 implements C37963a.AbstractC37964a {

    /* renamed from: c */
    public static final Companion f97445c = new Companion(null);

    /* renamed from: a */
    public int f97446a;

    /* renamed from: b */
    public final AppBarLayout f97447b;

    /* renamed from: d */
    private final AppBarLayout.AbstractC22134b f97448d;

    /* renamed from: e */
    private final CoordinatorLayout f97449e;

    /* renamed from: f */
    private final View f97450f;

    /* renamed from: g */
    private final int f97451g;

    /* renamed from: h */
    private final ITitleScrollHelper f97452h;

    /* renamed from: i */
    private final Function1<FeedFilter, Unit> f97453i;

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: a */
    public int mo138871a(int i) {
        return 0;
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: c */
    public int mo138875c() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/view/unread/UnreadScrollListenerV2$Companion;", "", "()V", "TAG", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    public final CoordinatorLayout mo139022e() {
        return this.f97449e;
    }

    /* renamed from: f */
    public final View mo139023f() {
        return this.f97450f;
    }

    /* renamed from: g */
    public final int mo139024g() {
        return this.f97451g;
    }

    /* renamed from: h */
    public final ITitleScrollHelper mo139025h() {
        return this.f97452h;
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: b */
    public void mo138874b() {
        ITitleScrollHelper cVar = this.f97452h;
        if (cVar != null) {
            cVar.mo139137c();
        }
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: d */
    public void mo138876d() {
        this.f97447b.removeOnOffsetChangedListener(this.f97448d);
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: a */
    public void mo138872a() {
        if (Math.abs(this.f97446a) < this.f97451g) {
            this.f97447b.setExpanded(false, false);
        }
        this.f97447b.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new C37965b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/feed/app/view/unread/UnreadScrollListenerV2$gotoStartPosition$1", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "onOffsetChanged", "", "appbarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "offset", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.a.c$b */
    public static final class C37965b implements AppBarLayout.AbstractC22134b {

        /* renamed from: a */
        final /* synthetic */ UnreadScrollListenerV2 f97454a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37965b(UnreadScrollListenerV2 cVar) {
            this.f97454a = cVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            Intrinsics.checkParameterIsNotNull(appBarLayout, "appbarLayout");
            try {
                ViewGroup.LayoutParams layoutParams = this.f97454a.f97447b.getLayoutParams();
                if (layoutParams != null) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                    if (behavior != null) {
                        behavior.onNestedPreScroll(this.f97454a.mo139022e(), this.f97454a.f97447b, this.f97454a.mo139023f(), 0, -this.f97454a.mo139024g(), new int[]{0, 0}, 1);
                    }
                    ITitleScrollHelper h = this.f97454a.mo139025h();
                    if (h != null) {
                        h.mo139137c();
                    }
                    appBarLayout.removeOnOffsetChangedListener((AppBarLayout.AbstractC22134b) this);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            } catch (Exception e) {
                Log.m165385e("UnreadScrollListenerV2", "appbar layout nest scroll fail " + e.getMessage(), e, true);
                appBarLayout.removeOnOffsetChangedListener((AppBarLayout.AbstractC22134b) this);
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: a */
    public void mo138873a(FeedFilter feedFilter) {
        Intrinsics.checkParameterIsNotNull(feedFilter, "target");
        this.f97453i.invoke(feedFilter);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/google/android/material/appbar/AppBarLayout;", "kotlin.jvm.PlatformType", "offset", "", "onOffsetChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.a.c$c */
    static final class C37966c implements AppBarLayout.AbstractC22134b {

        /* renamed from: a */
        final /* synthetic */ UnreadScrollListenerV2 f97455a;

        C37966c(UnreadScrollListenerV2 cVar) {
            this.f97455a = cVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f97455a.f97446a = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super com.ss.android.lark.feed.app.entity.FeedFilter, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public UnreadScrollListenerV2(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout, View view, int i, ITitleScrollHelper cVar, Function1<? super FeedFilter, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(appBarLayout, "appBarLayout");
        Intrinsics.checkParameterIsNotNull(coordinatorLayout, "coordinateLayout");
        Intrinsics.checkParameterIsNotNull(view, "targetView");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        this.f97447b = appBarLayout;
        this.f97449e = coordinatorLayout;
        this.f97450f = view;
        this.f97451g = i;
        this.f97452h = cVar;
        this.f97453i = function1;
        C37966c cVar2 = new C37966c(this);
        this.f97448d = cVar2;
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) cVar2);
    }
}
