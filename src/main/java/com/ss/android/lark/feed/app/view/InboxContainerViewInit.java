package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPoint;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPointNew;
import com.ss.android.lark.feed.app.view.C37985g;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import com.ss.android.lark.feed.app.view.InboxContainerView;
import com.ss.android.lark.feed.p1847a.C37266b;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1873d.C38077b;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\u0000J\u0006\u0010\u001f\u001a\u00020 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/feed/app/view/InboxContainerViewInit;", "", "context", "Landroid/content/Context;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/ss/android/lark/feed/app/view/LarkFeedInBoxListAdapter;", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/lark/feed/app/view/LarkFeedInBoxListAdapter;)V", "wrappedAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/lark/feed/app/view/LarkFeedInBoxListAdapter;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "getAdapter", "()Lcom/ss/android/lark/feed/app/view/LarkFeedInBoxListAdapter;", "getContext", "()Landroid/content/Context;", "feedPreBinder", "Lcom/ss/android/lark/feed/optimization/FeedPreBinder;", "mInboxContainerListener", "Lcom/ss/android/lark/feed/app/view/InboxContainerView$InboxContainerListener;", "mLayoutManager", "Lcom/larksuite/framework/ui/StableLinearLayoutManager;", "getMLayoutManager", "()Lcom/larksuite/framework/ui/StableLinearLayoutManager;", "mShortcutStatusListener", "Lcom/ss/android/lark/feed/app/shortcut/ShortCutStausManager$ShortCutStatusListener;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "initListener", "inboxContainerListener", "initViewContainer", "unInit", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.view.d */
public final class InboxContainerViewInit {

    /* renamed from: a */
    public InboxContainerView.AbstractC37958c f97494a;

    /* renamed from: b */
    private final StableLinearLayoutManager f97495b;

    /* renamed from: c */
    private final ShortCutStausManager.AbstractC37801b f97496c;

    /* renamed from: d */
    private final C38077b f97497d;

    /* renamed from: e */
    private final Context f97498e;

    /* renamed from: f */
    private final RecyclerView f97499f;

    /* renamed from: g */
    private final C37985g f97500g;

    /* renamed from: h */
    private RecyclerView.Adapter<?> f97501h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/feed/app/view/InboxContainerViewInit$initListener$9", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeChanged", "positionStart", "", "itemCount", "payload", "", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$i */
    public static final class C37979i extends RecyclerView.AdapterDataObserver {
        C37979i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            super.onItemRangeChanged(i, i2);
            C37268c.m146766b().mo139190i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            C37268c.m146766b().mo139190i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            C37268c.m146766b().mo139190i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            super.onItemRangeChanged(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            super.onItemRangeMoved(i, i2, i3);
            C37268c.m146766b().mo139190i();
        }
    }

    /* renamed from: a */
    public final StableLinearLayoutManager mo139040a() {
        return this.f97495b;
    }

    /* renamed from: d */
    public final RecyclerView mo139044d() {
        return this.f97499f;
    }

    /* renamed from: e */
    public final C37985g mo139045e() {
        return this.f97500g;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDelayTipClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$f */
    public static final class C37976f implements FeedListAdapter.AbstractC37931f {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97509a;

        C37976f(InboxContainerViewInit dVar) {
            this.f97509a = dVar;
        }

        @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37931f
        /* renamed from: a */
        public final void mo138949a() {
            InboxContainerViewInit.m149374a(this.f97509a).mo137057a();
        }
    }

    /* renamed from: c */
    public final void mo139043c() {
        ShortCutStausManager.m148791a().mo138572b(this.f97496c);
    }

    /* renamed from: b */
    public final InboxContainerViewInit mo139042b() {
        RecyclerView recyclerView = this.f97499f;
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(1, 10);
        recyclerView.setRecycledViewPool(recycledViewPool);
        this.f97499f.setLayoutManager(this.f97495b);
        RecyclerView recyclerView2 = this.f97499f;
        C37985g gVar = this.f97501h;
        if (gVar == null) {
            gVar = this.f97500g;
        }
        recyclerView2.setAdapter(gVar);
        this.f97499f.setItemViewCacheSize(8);
        if (C37713d.f96680j) {
            this.f97497d.mo139376a(this.f97499f, this.f97500g);
            this.f97500g.mo139052a(this.f97497d);
        }
        C37266b.m146757a(this.f97499f);
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/feed/app/view/InboxContainerViewInit$initListener$1", "Lcom/ss/android/lark/feed/app/view/FeedListAdapter$ThrottleOnRecyclerViewItemClickListener;", "onItemThrottleClick", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Lcom/ss/android/lark/feed/app/entity/UIFeedCard;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$a */
    public static final class C37970a extends FeedListAdapter.AbstractC37936k {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97502a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37970a(InboxContainerViewInit dVar) {
            this.f97502a = dVar;
        }

        @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37936k
        /* renamed from: a */
        public void mo137381a(RecyclerView.ViewHolder viewHolder, UIFeedCard uIFeedCard) {
            Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
            Intrinsics.checkParameterIsNotNull(uIFeedCard, "item");
            Log.m165389i("FeedModule_InboxContainerView", "onItemClick:" + uIFeedCard.getId());
            String id = uIFeedCard.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "item.id");
            FeedHitPoint.m148862a(id);
            InboxContainerViewInit.m149374a(this.f97502a).mo137059a(viewHolder.itemView, uIFeedCard);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"com/ss/android/lark/feed/app/view/InboxContainerViewInit$initListener$2", "Lcom/ss/android/lark/feed/app/view/LarkFeedInBoxListAdapter$OnThrottleShortCutItemClickListener;", "onThrottleShortCutItemClick", "", "view", "Landroid/view/View;", "uiFeedCard", "Lcom/ss/android/lark/feed/app/entity/UIFeedCard;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$b */
    public static final class C37971b extends C37985g.AbstractC37991d {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97503a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37971b(InboxContainerViewInit dVar) {
            this.f97503a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37991d
        /* renamed from: a */
        public void mo139046a(View view, UIFeedCard uIFeedCard) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(uIFeedCard, "uiFeedCard");
            Log.m165389i("FeedModule_InboxContainerView", "onShortCutItemClick:" + uIFeedCard.getId());
            InboxContainerViewInit.m149374a(this.f97503a).mo137066b(view, uIFeedCard);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ InboxContainerView.AbstractC37958c m149374a(InboxContainerViewInit dVar) {
        InboxContainerView.AbstractC37958c cVar = dVar.f97494a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInboxContainerListener");
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/feed/app/entity/FeedPreview;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$d */
    public static final class C37973d implements FeedListAdapter.AbstractC37933h {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97505a;

        C37973d(InboxContainerViewInit dVar) {
            this.f97505a = dVar;
        }

        @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37933h
        /* renamed from: a */
        public final void mo137384a(final FeedPreview feedPreview) {
            Intrinsics.checkExpressionValueIsNotNull(feedPreview, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            feedPreview.setSwipedLeftPinned(false);
            this.f97505a.mo139045e().notifyItemChanged(feedPreview);
            UICallbackExecutor.executeDelayed(new Runnable(this) {
                /* class com.ss.android.lark.feed.app.view.InboxContainerViewInit.C37973d.RunnableC379741 */

                /* renamed from: a */
                final /* synthetic */ C37973d f97506a;

                {
                    this.f97506a = r1;
                }

                public final void run() {
                    InboxContainerView.AbstractC37958c a = InboxContainerViewInit.m149374a(this.f97506a.f97505a);
                    FeedPreview feedPreview = feedPreview;
                    Intrinsics.checkExpressionValueIsNotNull(feedPreview, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    a.mo137062a(feedPreview, !feedPreview.isDelayed());
                }
            }, 300);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/feed/app/entity/FeedPreview;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$e */
    public static final class C37975e implements FeedListAdapter.AbstractC37928c {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97508a;

        C37975e(InboxContainerViewInit dVar) {
            this.f97508a = dVar;
        }

        @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37928c
        /* renamed from: a */
        public final void mo137371a(FeedPreview feedPreview) {
            InboxContainerView.AbstractC37958c a = InboxContainerViewInit.m149374a(this.f97508a);
            Intrinsics.checkExpressionValueIsNotNull(feedPreview, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            a.mo137070c(feedPreview, !feedPreview.isInChatBox());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/feed/app/entity/FeedPreview;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$g */
    public static final class C37977g implements FeedListAdapter.AbstractC37935j {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97510a;

        C37977g(InboxContainerViewInit dVar) {
            this.f97510a = dVar;
        }

        @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37935j
        /* renamed from: a */
        public final void mo137372a(FeedPreview feedPreview) {
            InboxContainerView.AbstractC37958c a = InboxContainerViewInit.m149374a(this.f97510a);
            Intrinsics.checkExpressionValueIsNotNull(feedPreview, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            a.mo137067b(feedPreview, !feedPreview.isShortCut());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", UpdateKey.STATUS, "Lcom/ss/android/lark/feed/app/shortcut/ShortCutStausManager$ShortCutStatus;", "kotlin.jvm.PlatformType", "onStauschanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$j */
    static final class C37980j implements ShortCutStausManager.AbstractC37801b {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97512a;

        C37980j(InboxContainerViewInit dVar) {
            this.f97512a = dVar;
        }

        @Override // com.ss.android.lark.feed.app.shortcut.ShortCutStausManager.AbstractC37801b
        /* renamed from: a */
        public final void mo138582a(ShortCutStausManager.ShortCutStatus shortCutStatus) {
            if (shortCutStatus != null) {
                int i = C37981e.f97513a[shortCutStatus.ordinal()];
                if (i == 1) {
                    this.f97512a.mo139045e().mo138942l();
                    return;
                } else if (!(i == 2 || i == 3)) {
                    return;
                }
            }
            this.f97512a.mo139045e().mo138943m();
        }
    }

    /* renamed from: a */
    public final InboxContainerViewInit mo139041a(InboxContainerView.AbstractC37958c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "inboxContainerListener");
        this.f97494a = cVar;
        this.f97500g.mo138936a(new C37970a(this));
        this.f97500g.mo139050a(new C37971b(this));
        this.f97500g.mo139051a(new C37972c(this));
        this.f97500g.mo138935a(new C37973d(this));
        this.f97500g.mo138930a(new C37975e(this));
        this.f97500g.mo138933a(new C37976f(this));
        this.f97500g.mo138937a(new C37977g(this));
        this.f97500g.mo138934a(new C37978h(this));
        this.f97500g.registerAdapterDataObserver(new C37979i());
        ShortCutStausManager.m148791a().mo138569a(this.f97496c);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "uiFeedCard", "Lcom/ss/android/lark/feed/app/entity/UIFeedCard;", "kotlin.jvm.PlatformType", "targetPosition", "", "onShortCutItemMove"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$c */
    public static final class C37972c implements C37985g.AbstractC37990c {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97504a;

        C37972c(InboxContainerViewInit dVar) {
            this.f97504a = dVar;
        }

        @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37990c
        /* renamed from: a */
        public final void mo139047a(UIFeedCard uIFeedCard, int i) {
            InboxContainerViewInit.m149374a(this.f97504a).mo137063a(uIFeedCard, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InboxContainerViewInit(Context context, RecyclerView recyclerView, C37985g gVar) {
        this(context, recyclerView, gVar, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(gVar, "adapter");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "holder", "Lcom/ss/android/lark/feed/app/view/FeedViewHolder;", "kotlin.jvm.PlatformType", "removedItem", "Lcom/ss/android/lark/feed/app/entity/FeedPreview;", "fakeSwipe", "", "onSwipe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.d$h */
    public static final class C37978h implements FeedListAdapter.AbstractC37932g {

        /* renamed from: a */
        final /* synthetic */ InboxContainerViewInit f97511a;

        C37978h(InboxContainerViewInit dVar) {
            this.f97511a = dVar;
        }

        @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37932g
        /* renamed from: a */
        public final void mo138950a(C37968c cVar, FeedPreview feedPreview, boolean z) {
            String str;
            InboxContainerViewInit.m149374a(this.f97511a).mo137061a(feedPreview);
            Intrinsics.checkExpressionValueIsNotNull(feedPreview, "removedItem");
            this.f97511a.mo139045e().mo139056q().mo137500a(cVar, feedPreview, Intrinsics.areEqual(feedPreview.getId(), this.f97511a.mo139045e().mo138945o()), z);
            FeedHitPointNew.FeedMainClickParam feedMainClickParam = FeedHitPointNew.FeedMainClickParam.FEED_DONE_MOBILE;
            if (z) {
                str = "small";
            } else {
                str = "big";
            }
            FeedHitPointNew.m148850a(feedMainClickParam, MapsKt.mapOf(TuplesKt.to("rightslide_type", str)), null, 4, null);
        }
    }

    public InboxContainerViewInit(Context context, RecyclerView recyclerView, C37985g gVar, RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(gVar, "adapter");
        this.f97498e = context;
        this.f97499f = recyclerView;
        this.f97500g = gVar;
        this.f97501h = adapter;
        this.f97495b = new StableLinearLayoutManager(context, 1, false);
        this.f97496c = new C37980j(this);
        this.f97497d = new C38077b();
    }
}
