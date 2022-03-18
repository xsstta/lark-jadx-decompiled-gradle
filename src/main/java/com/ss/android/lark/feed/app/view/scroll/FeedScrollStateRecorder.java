package com.ss.android.lark.feed.app.view.scroll;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\bH\u0002J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0007J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0006j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/feed/app/view/scroll/FeedScrollStateRecorder;", "", "inboxRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mCache", "Ljava/util/HashMap;", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "Lcom/ss/android/lark/feed/app/view/scroll/FeedScrollStateRecorder$FeedScrollState;", "Lkotlin/collections/HashMap;", "mCurType", "getMCurType", "()Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "setMCurType", "(Lcom/ss/android/lark/feed/app/entity/FeedFilter;)V", "mDispatchStateMap", "", "", "mIsRecoverChange", "", "mScrollTopIntercept", "mTargetType", "afterDispatchDiff", "", "record", "Lcom/ss/android/lark/feed/app/model/common/UpdateRecord;", "beforeDispatchDiff", "findFirstVisiblePosition", "getFeedScrollState", "recordState", ShareHitPoint.f121869d, "recoverState", "scrollToTop", "filter", "Companion", "FeedScrollState", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.view.scroll.b */
public final class FeedScrollStateRecorder {

    /* renamed from: b */
    public static final Companion f97600b = new Companion(null);

    /* renamed from: a */
    public boolean f97601a;

    /* renamed from: c */
    private final HashMap<FeedFilter, FeedScrollState> f97602c = new HashMap<>();

    /* renamed from: d */
    private FeedFilter f97603d = FeedFilter.INBOX;

    /* renamed from: e */
    private FeedFilter f97604e = FeedFilter.INBOX;

    /* renamed from: f */
    private HashMap<Long, Integer> f97605f = new HashMap<>();

    /* renamed from: g */
    private boolean f97606g;

    /* renamed from: h */
    private final RecyclerView f97607h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/view/scroll/FeedScrollStateRecorder$Companion;", "", "()V", "TAG", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.scroll.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/feed/app/view/scroll/FeedScrollStateRecorder$FeedScrollState;", "", "firstPosition", "", "offset", "(II)V", "getFirstPosition", "()I", "getOffset", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.scroll.b$b */
    public static final class FeedScrollState {

        /* renamed from: a */
        private final int f97608a;

        /* renamed from: b */
        private final int f97609b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedScrollState)) {
                return false;
            }
            FeedScrollState bVar = (FeedScrollState) obj;
            return this.f97608a == bVar.f97608a && this.f97609b == bVar.f97609b;
        }

        public int hashCode() {
            return (this.f97608a * 31) + this.f97609b;
        }

        public String toString() {
            return "FeedScrollState(firstPosition=" + this.f97608a + ", offset=" + this.f97609b + ")";
        }

        /* renamed from: a */
        public final int mo139088a() {
            return this.f97608a;
        }

        /* renamed from: b */
        public final int mo139089b() {
            return this.f97609b;
        }

        public FeedScrollState(int i, int i2) {
            this.f97608a = i;
            this.f97609b = i2;
        }
    }

    /* renamed from: a */
    public final FeedFilter mo139082a() {
        return this.f97603d;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.scroll.b$c */
    public static final class RunnableC38009c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedScrollStateRecorder f97610a;

        /* renamed from: b */
        final /* synthetic */ UpdateRecord f97611b;

        RunnableC38009c(FeedScrollStateRecorder bVar, UpdateRecord updateRecord) {
            this.f97610a = bVar;
            this.f97611b = updateRecord;
        }

        public final void run() {
            this.f97610a.mo139086b(this.f97611b);
            this.f97610a.f97601a = false;
        }
    }

    /* renamed from: c */
    private final FeedScrollState m149466c() {
        RecyclerView.LayoutManager layoutManager = this.f97607h.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (findFirstVisibleItemPosition == -1) {
                return new FeedScrollState(0, 0);
            }
            View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
            if (findViewByPosition == null) {
                return new FeedScrollState(0, 0);
            }
            return new FeedScrollState(findFirstVisibleItemPosition, findViewByPosition.getTop());
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* renamed from: b */
    private final void m149465b() {
        RecyclerView.LayoutManager layoutManager = this.f97607h.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (this.f97606g) {
                linearLayoutManager.scrollToPosition(0);
                this.f97606g = false;
                return;
            }
            FeedScrollState bVar = this.f97602c.get(this.f97604e);
            if (bVar != null) {
                Log.m165379d("FeedScrollStateRecorder", "type: " + this.f97604e + " recover to position " + bVar.mo139088a() + ", offset: " + bVar.mo139089b());
                linearLayoutManager.scrollToPositionWithOffset(bVar.mo139088a(), bVar.mo139089b());
                this.f97601a = true;
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* renamed from: a */
    public final void mo139084a(UpdateRecord updateRecord) {
        Intrinsics.checkParameterIsNotNull(updateRecord, "record");
        if (!FeedFgUtils.m146773b()) {
            return;
        }
        if (this.f97601a) {
            this.f97607h.post(new RunnableC38009c(this, updateRecord));
        } else {
            mo139086b(updateRecord);
        }
    }

    public FeedScrollStateRecorder(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "inboxRecyclerView");
        this.f97607h = recyclerView;
    }

    /* renamed from: b */
    public final void mo139085b(FeedFilter feedFilter) {
        Intrinsics.checkParameterIsNotNull(feedFilter, "filter");
        if (feedFilter == this.f97603d) {
            RecyclerView.LayoutManager layoutManager = this.f97607h.getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).scrollToPosition(0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        this.f97606g = true;
    }

    /* renamed from: a */
    public final void mo139083a(FeedFilter feedFilter) {
        Intrinsics.checkParameterIsNotNull(feedFilter, ShareHitPoint.f121869d);
        if (this.f97603d != feedFilter) {
            this.f97604e = feedFilter;
            FeedScrollState c = m149466c();
            this.f97602c.put(this.f97603d, c);
            Log.m165379d("FeedScrollStateRecorder", "type: " + this.f97603d + " save to position " + c.mo139088a() + ", offset: " + c.mo139089b());
        }
    }

    /* renamed from: c */
    public final void mo139087c(UpdateRecord updateRecord) {
        Intrinsics.checkParameterIsNotNull(updateRecord, "record");
        if (FeedFgUtils.m146773b()) {
            Integer num = this.f97605f.get(Long.valueOf(updateRecord.mo138365a()));
            if (num != null && num.intValue() == 0 && this.f97604e == this.f97603d) {
                this.f97607h.scrollToPosition(0);
                Log.m165379d("FeedScrollStateRecorder", "move to first position");
                return;
            }
            FeedFilter feedFilter = this.f97604e;
            if (feedFilter != this.f97603d) {
                this.f97603d = feedFilter;
                m149465b();
            }
        }
    }

    /* renamed from: b */
    public final void mo139086b(UpdateRecord updateRecord) {
        RecyclerView.LayoutManager layoutManager = this.f97607h.getLayoutManager();
        if (layoutManager != null) {
            int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            Log.m165379d("FeedScrollStateRecorder", "first visible position = " + findFirstCompletelyVisibleItemPosition);
            this.f97605f.put(Long.valueOf(updateRecord.mo138365a()), Integer.valueOf(findFirstCompletelyVisibleItemPosition));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }
}
