package com.ss.android.lark.feed.app.team.feed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.ao;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.statistics.team.FeedTeamHitPoint;
import com.ss.android.lark.feed.app.team.LargeDataHolder;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.entity.C37878g;
import com.ss.android.lark.feed.app.team.entity.ChatVisibilityUpdateResult;
import com.ss.android.lark.feed.app.team.entity.TeamLoadStatus;
import com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity;
import com.ss.android.lark.feed.app.team.widget.TeamListLoadEmptyView;
import com.ss.android.lark.feed.interfaces.AbstractC38087ab;
import com.ss.android.lark.feed.p1847a.C37266b;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u00022>\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u000205H\u0002J\u0012\u0010O\u001a\u00020L2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J$\u0010R\u001a\u0002002\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010V2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010W\u001a\u00020LH\u0016J\b\u0010X\u001a\u00020LH\u0016J\u001a\u0010Y\u001a\u00020L2\u0006\u0010Z\u001a\u0002002\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0010\u0010[\u001a\u00020L2\u0006\u0010\\\u001a\u00020\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R&\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b0\nX\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0004¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR#\u0010 \u001a\n \u0016*\u0004\u0018\u00010!0!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010\b\u001a\u0004\b,\u0010-R\u000e\u0010/\u001a\u000200X.¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u000202X\u0004¢\u0006\u0004\n\u0002\u00103R \u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002060\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\r0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090\nX\u0004¢\u0006\u0002\n\u0000R \u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002060\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u0002050\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u00020>X\u0004¢\u0006\u0004\n\u0002\u0010?R\u001b\u0010@\u001a\u00020A8BX\u0002¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bB\u0010CR;\u0010E\u001a\"\u0012\f\u0012\n \u0016*\u0004\u0018\u00010G0G \u0016*\u000b\u0012\u0002\b\u0003\u0018\u00010F¨\u0006\u00010F¨\u0006\u00018BX\u0002¢\u0006\f\n\u0004\bJ\u0010\b\u001a\u0004\bH\u0010I¨\u0006^"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/TeamFeedFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "adapter", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedAdapter;", "getAdapter", "()Lcom/ss/android/lark/feed/app/team/feed/TeamFeedAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "chatListObserver", "Landroidx/lifecycle/Observer;", "Lkotlin/Pair;", "", "", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "chatRemoveObserver", "", "chatUpdateObserver", "chatVisibilityUpdateResultObserver", "Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult;", "emptyView", "Lcom/ss/android/lark/feed/app/team/widget/TeamListLoadEmptyView;", "kotlin.jvm.PlatformType", "getEmptyView", "()Lcom/ss/android/lark/feed/app/team/widget/TeamListLoadEmptyView;", "emptyView$delegate", "inboxRecyclerViewTouchListener", "Landroid/view/View$OnTouchListener;", "getInboxRecyclerViewTouchListener", "()Landroid/view/View$OnTouchListener;", "setInboxRecyclerViewTouchListener", "(Landroid/view/View$OnTouchListener;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "recyclerViewExpandableManager", "Lcom/h6ah4i/android/widget/advrecyclerview/expandable/RecyclerViewExpandableItemManager;", "getRecyclerViewExpandableManager", "()Lcom/h6ah4i/android/widget/advrecyclerview/expandable/RecyclerViewExpandableItemManager;", "recyclerViewExpandableManager$delegate", "recyclerViewSwipeManager", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "getRecyclerViewSwipeManager", "()Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "recyclerViewSwipeManager$delegate", "rootView", "Landroid/view/View;", "teamActionHandler", "com/ss/android/lark/feed/app/team/feed/TeamFeedFragment$teamActionHandler$1", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedFragment$teamActionHandler$1;", "teamAddObserver", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "", "teamListObserver", "teamLoadStatusObserver", "Lcom/ss/android/lark/feed/app/team/entity/TeamLoadStatus;", "teamPositionUpdateObserver", "teamRemoveObserver", "teamUpdateObserver", "userSettingObserver", "com/ss/android/lark/feed/app/team/feed/TeamFeedFragment$userSettingObserver$1", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedFragment$userSettingObserver$1;", "viewModel", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedViewModel;", "getViewModel", "()Lcom/ss/android/lark/feed/app/team/feed/TeamFeedViewModel;", "viewModel$delegate", "wrappedAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getWrappedAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "wrappedAdapter$delegate", "initRecyclerView", "", "onClickTeam", "team", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPause", "onViewCreated", "view", "openChat", "chat", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.a.c */
public final class TeamFeedFragment extends BaseFragment {

    /* renamed from: b */
    public static final Companion f97045b = new Companion(null);

    /* renamed from: a */
    public View f97046a;

    /* renamed from: c */
    private final Lazy f97047c = LazyKt.lazy(new C37826i(this));

    /* renamed from: d */
    private final Lazy f97048d = LazyKt.lazy(new C37824g(this));

    /* renamed from: e */
    private final Lazy f97049e = LazyKt.lazy(C37828k.INSTANCE);

    /* renamed from: f */
    private final Lazy f97050f = LazyKt.lazy(C37827j.INSTANCE);

    /* renamed from: g */
    private final Lazy f97051g = LazyKt.lazy(new C37819b(this));

    /* renamed from: h */
    private final Lazy f97052h = LazyKt.lazy(new C37839u(this));

    /* renamed from: i */
    private View.OnTouchListener f97053i;

    /* renamed from: j */
    private final C37836s f97054j = new C37836s(this);

    /* renamed from: k */
    private final C37829l f97055k = new C37829l(this);

    /* renamed from: l */
    private final Lazy f97056l = LazyKt.lazy(new C37838t(this));

    /* renamed from: m */
    private final AbstractC1178x<TeamLoadStatus> f97057m = new C37832o(this);

    /* renamed from: n */
    private final AbstractC1178x<List<C37878g>> f97058n = new C37831n(this);

    /* renamed from: o */
    private final AbstractC1178x<Pair<Long, List<C37874d>>> f97059o = new C37820c(this);

    /* renamed from: p */
    private final AbstractC1178x<C37878g> f97060p = new C37835r(this);

    /* renamed from: q */
    private final AbstractC1178x<C37874d> f97061q = new C37822e(this);

    /* renamed from: r */
    private final AbstractC1178x<Pair<C37878g, Integer>> f97062r = new C37830m(this);

    /* renamed from: s */
    private final AbstractC1178x<Long> f97063s = new C37834q(this);

    /* renamed from: t */
    private final AbstractC1178x<Pair<Integer, Integer>> f97064t = new C37833p(this);

    /* renamed from: u */
    private final AbstractC1178x<Pair<Long, String>> f97065u = new C37821d(this);

    /* renamed from: v */
    private final AbstractC1178x<ChatVisibilityUpdateResult> f97066v = new C37823f(this);

    /* renamed from: g */
    private final RecyclerView.Adapter<RecyclerView.ViewHolder> m148936g() {
        return (RecyclerView.Adapter) this.f97052h.getValue();
    }

    /* renamed from: a */
    public final RecyclerView mo138645a() {
        return (RecyclerView) this.f97047c.getValue();
    }

    /* renamed from: b */
    public final TeamListLoadEmptyView mo138649b() {
        return (TeamListLoadEmptyView) this.f97048d.getValue();
    }

    /* renamed from: c */
    public final C23289c mo138650c() {
        return (C23289c) this.f97049e.getValue();
    }

    /* renamed from: d */
    public final RecyclerViewExpandableItemManager mo138651d() {
        return (RecyclerViewExpandableItemManager) this.f97050f.getValue();
    }

    /* renamed from: e */
    public final TeamFeedAdapter mo138652e() {
        return (TeamFeedAdapter) this.f97051g.getValue();
    }

    /* renamed from: f */
    public final TeamFeedViewModel mo138653f() {
        return (TeamFeedViewModel) this.f97056l.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/TeamFeedFragment$Companion;", "", "()V", "LOG_TAG", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/h6ah4i/android/widget/advrecyclerview/expandable/RecyclerViewExpandableItemManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$j */
    static final class C37827j extends Lambda implements Function0<RecyclerViewExpandableItemManager> {
        public static final C37827j INSTANCE = new C37827j();

        C37827j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerViewExpandableItemManager invoke() {
            return new RecyclerViewExpandableItemManager(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$k */
    static final class C37828k extends Lambda implements Function0<C23289c> {
        public static final C37828k INSTANCE = new C37828k();

        C37828k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C23289c invoke() {
            return new C23289c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/feed/app/team/feed/TeamFeedFragment$userSettingObserver$1", "Lcom/ss/android/lark/feed/interfaces/IUserSettingObserver;", "onBadgeStyleChanged", "", "onNavMuteBadgeShowStateChanged", "isShow", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$s */
    public static final class C37836s implements AbstractC38087ab {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97079a;

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137283a(boolean z) {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.team.a.c$s$a */
        static final class RunnableC37837a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C37836s f97080a;

            RunnableC37837a(C37836s sVar) {
                this.f97080a = sVar;
            }

            public final void run() {
                this.f97080a.f97079a.mo138652e().notifyDataSetChanged();
            }
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137282a() {
            UICallbackExecutor.execute(new RunnableC37837a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37836s(TeamFeedFragment cVar) {
            this.f97079a = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$b */
    static final class C37819b extends Lambda implements Function0<TeamFeedAdapter> {
        final /* synthetic */ TeamFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37819b(TeamFeedFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamFeedAdapter invoke() {
            return new TeamFeedAdapter(this.this$0.mo138651d());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/widget/TeamListLoadEmptyView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$g */
    static final class C37824g extends Lambda implements Function0<TeamListLoadEmptyView> {
        final /* synthetic */ TeamFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37824g(TeamFeedFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamListLoadEmptyView invoke() {
            return (TeamListLoadEmptyView) TeamFeedFragment.m148935a(this.this$0).findViewById(R.id.load_empty_container);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$i */
    static final class C37826i extends Lambda implements Function0<RecyclerView> {
        final /* synthetic */ TeamFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37826i(TeamFeedFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView invoke() {
            return (RecyclerView) TeamFeedFragment.m148935a(this.this$0).findViewById(R.id.team_list_rv);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        mo138653f().saveTeamExpandSnapshot();
        super.onPause();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$t */
    static final class C37838t extends Lambda implements Function0<TeamFeedViewModel> {
        final /* synthetic */ TeamFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37838t(TeamFeedFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamFeedViewModel invoke() {
            return (TeamFeedViewModel) new C1144ai(this.this$0).mo6005a(TeamFeedViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0001¨\u0006\u00010\u0001¨\u0006\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$u */
    static final class C37839u extends Lambda implements Function0<RecyclerView.Adapter<RecyclerView.ViewHolder>> {
        final /* synthetic */ TeamFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37839u(TeamFeedFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView.Adapter<RecyclerView.ViewHolder> invoke() {
            return this.this$0.mo138650c().mo80800a(this.this$0.mo138651d().mo80686a(this.this$0.mo138652e()));
        }
    }

    /* renamed from: h */
    private final void m148937h() {
        mo138645a().setHasFixedSize(true);
        mo138645a().setBackgroundColor(C57582a.m223616d(getActivity(), R.color.bg_body));
        RecyclerView a = mo138645a();
        Intrinsics.checkExpressionValueIsNotNull(a, "recyclerView");
        RecyclerView a2 = mo138645a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "recyclerView");
        a.setLayoutManager(new LinearLayoutManager(a2.getContext()));
        RecyclerView a3 = mo138645a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "recyclerView");
        a3.setAdapter(m148936g());
        mo138651d().mo80690a(mo138645a());
        mo138650c().mo80804a(mo138645a());
        View.OnTouchListener onTouchListener = this.f97053i;
        if (onTouchListener != null) {
            mo138645a().setOnTouchListener(onTouchListener);
        }
        mo138652e().mo138625a(this.f97055k);
        C37266b.m146757a(mo138645a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C37268c.m146767c().mo139343b(this.f97054j);
        TeamFeedViewModel f = mo138653f();
        f.getTeamLoadStatusLiveData().mo5928b(this.f97057m);
        f.getTeamListLiveData().mo5928b(this.f97058n);
        f.getChatListLiveData().mo5928b(this.f97059o);
        f.getTeamUpdateLiveData().mo5928b(this.f97060p);
        f.getChatUpdateLiveData().mo5928b(this.f97061q);
        f.getTeamAddLiveData().mo5928b(this.f97062r);
        f.getTeamRemoveLiveData().mo5928b(this.f97063s);
        f.getTeamPositionUpdateLiveData().mo5928b(this.f97064t);
        f.getChatRemoveLiveData().mo5928b(this.f97065u);
        f.getChatVisibilityUpdateLiveData().mo5928b(this.f97066v);
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo138646a(View.OnTouchListener onTouchListener) {
        this.f97053i = onTouchListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/feed/app/team/feed/TeamFeedFragment$teamActionHandler$1", "Lcom/ss/android/lark/feed/app/team/feed/ITeamFeedActionHandler;", "onClickChat", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "onClickHiddenChat", "", "onClickTeam", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "onClickTeamMoreAction", "team", "Lcom/ss/android/lark/team/entity/Team;", "onUpdateChatVisibility", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "hideChat", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$l */
    public static final class C37829l implements ITeamFeedActionHandler {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97072a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37829l(TeamFeedFragment cVar) {
            this.f97072a = cVar;
        }

        @Override // com.ss.android.lark.feed.app.team.feed.ITeamFeedActionHandler
        /* renamed from: a */
        public void mo138616a(C37874d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f97072a.mo138647a(dVar);
        }

        @Override // com.ss.android.lark.feed.app.team.feed.ITeamFeedActionHandler
        /* renamed from: a */
        public void mo138617a(C37878g gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f97072a.mo138648a(gVar);
        }

        @Override // com.ss.android.lark.feed.app.team.feed.ITeamFeedActionHandler
        /* renamed from: a */
        public void mo138618a(Team team) {
            Intrinsics.checkParameterIsNotNull(team, "team");
            AbstractC38037a b = C37268c.m146766b();
            Intrinsics.checkExpressionValueIsNotNull(b, "FeedContext.getDependency()");
            b.mo139157D().mo139305a(this.f97072a.requireActivity(), team);
        }

        @Override // com.ss.android.lark.feed.app.team.feed.ITeamFeedActionHandler
        /* renamed from: a */
        public void mo138619a(List<? extends C37874d> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String uuid = ao.m95038a().toString();
            Intrinsics.checkExpressionValueIsNotNull(uuid, "UUIDUtil.randomUUID().toString()");
            LargeDataHolder.f97028a.mo138614a(uuid, list);
            Intent intent = new Intent(this.f97072a.requireContext(), HiddenChatListActivity.class);
            intent.putExtra("intent_chat_list_key", uuid);
            this.f97072a.startActivity(intent);
        }

        @Override // com.ss.android.lark.feed.app.team.feed.ITeamFeedActionHandler
        /* renamed from: a */
        public void mo138615a(RecyclerView.ViewHolder viewHolder, C37874d dVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
            Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f97072a.mo138650c().mo80808a(viewHolder, 1);
            this.f97072a.mo138653f().updateChatVisibility(dVar, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$e */
    static final class C37822e<T> implements AbstractC1178x<C37874d> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97069a;

        C37822e(TeamFeedFragment cVar) {
            this.f97069a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(C37874d dVar) {
            if (dVar != null) {
                this.f97069a.mo138652e().mo138626a(dVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$q */
    static final class C37834q<T> implements AbstractC1178x<Long> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97077a;

        C37834q(TeamFeedFragment cVar) {
            this.f97077a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Long l) {
            if (l != null) {
                this.f97077a.mo138652e().mo138622a(l.longValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$r */
    static final class C37835r<T> implements AbstractC1178x<C37878g> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97078a;

        C37835r(TeamFeedFragment cVar) {
            this.f97078a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(C37878g gVar) {
            if (gVar != null) {
                this.f97078a.mo138652e().mo138627a(gVar);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m148935a(TeamFeedFragment cVar) {
        View view = cVar.f97046a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$c */
    static final class C37820c<T> implements AbstractC1178x<Pair<? extends Long, ? extends List<? extends C37874d>>> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97067a;

        C37820c(TeamFeedFragment cVar) {
            this.f97067a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Long, ? extends List<? extends C37874d>> pair) {
            Long first;
            if (pair != null && (first = pair.getFirst()) != null) {
                this.f97067a.mo138652e().mo138624a(first.longValue(), (List) pair.getSecond());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$d */
    static final class C37821d<T> implements AbstractC1178x<Pair<? extends Long, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97068a;

        C37821d(TeamFeedFragment cVar) {
            this.f97068a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Long, String> pair) {
            Long first;
            if (pair != null && (first = pair.getFirst()) != null) {
                this.f97068a.mo138652e().mo138623a(first.longValue(), pair.getSecond());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$h */
    static final class View$OnClickListenerC37825h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97071a;

        View$OnClickListenerC37825h(TeamFeedFragment cVar) {
            this.f97071a = cVar;
        }

        public final void onClick(View view) {
            FeedTeamHitPoint.m148840a();
            AbstractC38037a a = C37262a.m146726a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
            a.mo139157D().mo139306a(this.f97071a.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$m */
    static final class C37830m<T> implements AbstractC1178x<Pair<? extends C37878g, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97073a;

        C37830m(TeamFeedFragment cVar) {
            this.f97073a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<? extends C37878g, Integer> pair) {
            C37878g gVar;
            if (pair != null && (gVar = (C37878g) pair.getFirst()) != null) {
                this.f97073a.mo138652e().mo138628a(gVar, pair.getSecond().intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$n */
    static final class C37831n<T> implements AbstractC1178x<List<? extends C37878g>> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97074a;

        C37831n(TeamFeedFragment cVar) {
            this.f97074a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends C37878g> list) {
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            this.f97074a.mo138652e().mo138633a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$p */
    static final class C37833p<T> implements AbstractC1178x<Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97076a;

        C37833p(TeamFeedFragment cVar) {
            this.f97076a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Integer, Integer> pair) {
            Integer first;
            if (pair != null && (first = pair.getFirst()) != null) {
                this.f97076a.mo138652e().mo138641c(first.intValue(), pair.getSecond().intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo138647a(C37874d dVar) {
        AbstractC38037a b = C37268c.m146766b();
        Intrinsics.checkExpressionValueIsNotNull(b, "FeedContext.getDependency()");
        b.mo139154A().mo139236a(getActivity(), dVar.mo138742b(), dVar.mo138747d(), false, "feed", "feed", null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$f */
    static final class C37823f<T> implements AbstractC1178x<ChatVisibilityUpdateResult> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97070a;

        C37823f(TeamFeedFragment cVar) {
            this.f97070a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(ChatVisibilityUpdateResult aVar) {
            Context context;
            boolean z;
            String str;
            int i;
            if (aVar instanceof ChatVisibilityUpdateResult.Success) {
                if (((ChatVisibilityUpdateResult.Success) aVar).mo138717a().mo138753j()) {
                    i = R.string.Project_MV_GroupIsHidden;
                } else {
                    i = R.string.Project_MV_GroupIsShown;
                }
                Context requireContext = this.f97070a.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                UDToast.show(requireContext, i);
            } else if ((aVar instanceof ChatVisibilityUpdateResult.Error) && (context = this.f97070a.getContext()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return@Observer");
                ChatVisibilityUpdateResult.Error aVar2 = (ChatVisibilityUpdateResult.Error) aVar;
                String displayMsg = aVar2.mo138713a().getDisplayMsg();
                if (displayMsg == null || displayMsg.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = C57582a.m223604a(context, (int) R.string.Lark_Legacy_NetworkErrorRetry);
                } else {
                    str = aVar2.mo138713a().getDisplayMsg();
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "toastText");
                UDToast.show(context, str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/feed/app/team/entity/TeamLoadStatus;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.c$o */
    static final class C37832o<T> implements AbstractC1178x<TeamLoadStatus> {

        /* renamed from: a */
        final /* synthetic */ TeamFeedFragment f97075a;

        C37832o(TeamFeedFragment cVar) {
            this.f97075a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(TeamLoadStatus teamLoadStatus) {
            if (teamLoadStatus != null) {
                int i = C37840d.f97081a[teamLoadStatus.ordinal()];
                if (i == 1) {
                    this.f97075a.mo138649b().mo138817a();
                    RecyclerView a = this.f97075a.mo138645a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "recyclerView");
                    a.setVisibility(8);
                } else if (i == 2) {
                    this.f97075a.mo138649b().mo138819c();
                    RecyclerView a2 = this.f97075a.mo138645a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "recyclerView");
                    a2.setVisibility(8);
                } else if (i == 3) {
                    this.f97075a.mo138649b().mo138818b();
                    RecyclerView a3 = this.f97075a.mo138645a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "recyclerView");
                    a3.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo138648a(C37878g gVar) {
        int b = mo138652e().mo138635b(gVar.mo138776c());
        if (b >= 0) {
            boolean c = mo138651d().mo80701c(b);
            mo138653f().updateTeamExpandStatus(gVar.mo138774b(), !c);
            if (c) {
                mo138651d().mo80698b(b);
            } else {
                mo138651d().mo80692a(b);
            }
            gVar.mo138773a(!c);
            mo138651d().mo80702d(b);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C37268c.m146767c().mo139330a(this.f97054j);
        TeamFeedViewModel f = mo138653f();
        f.getTeamLoadStatusLiveData().mo5925a(this.f97057m);
        f.getTeamListLiveData().mo5925a(this.f97058n);
        f.getChatListLiveData().mo5925a(this.f97059o);
        f.getTeamUpdateLiveData().mo5925a(this.f97060p);
        f.getChatUpdateLiveData().mo5925a(this.f97061q);
        f.getTeamAddLiveData().mo5925a(this.f97062r);
        f.getTeamRemoveLiveData().mo5925a(this.f97063s);
        f.getTeamPositionUpdateLiveData().mo5925a(this.f97064t);
        f.getChatRemoveLiveData().mo5925a(this.f97065u);
        f.getChatVisibilityUpdateLiveData().mo5925a(this.f97066v);
        f.setup();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo138649b().setActionClickListener(new View$OnClickListenerC37825h(this));
        mo138649b().mo138819c();
        RecyclerView a = mo138645a();
        Intrinsics.checkExpressionValueIsNotNull(a, "recyclerView");
        a.setVisibility(8);
        m148937h();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.team_feed_list_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…layout, container, false)");
        this.f97046a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return inflate;
    }
}
