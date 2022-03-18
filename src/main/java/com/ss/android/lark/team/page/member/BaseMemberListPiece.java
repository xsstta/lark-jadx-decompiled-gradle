package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0005\b&\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001FB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020\u0017H\u0016J\u0010\u00100\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0010\u00101\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u000203H&J\b\u00104\u001a\u00020-H\u0002J\u0010\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020%H\u0016J\u0018\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020-H\u0016J\u0018\u0010:\u001a\u00020-2\u0006\u00108\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0016\u0010;\u001a\u00020-2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020#0\u000fH\u0016J\u0018\u0010=\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u0017H\u0016J\u001e\u0010?\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020B0A\u0012\u0004\u0012\u00020B\u0018\u00010@H\u0016J\u0006\u0010C\u001a\u00020-J\b\u0010D\u001a\u00020\u0017H&J\u0018\u0010E\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u0017H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001d\u0010\u001e¨\u0006G"}, d2 = {"Lcom/ss/android/lark/team/page/member/BaseMemberListPiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "Lcom/ss/android/lark/team/page/member/BaseMemberListExport;", "()V", "actionTypeObserver", "com/ss/android/lark/team/page/member/BaseMemberListPiece$actionTypeObserver$1", "Lcom/ss/android/lark/team/page/member/BaseMemberListPiece$actionTypeObserver$1;", "adapter", "Lcom/ss/android/lark/team/page/member/TeamMemberAdapter;", "getAdapter", "()Lcom/ss/android/lark/team/page/member/TeamMemberAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "firstPageObserver", "Landroidx/lifecycle/Observer;", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "listView", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "getListView", "()Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "listView$delegate", "loadFailedObserver", "", "loadMoreObserver", "needSearchObserver", "noMoreObserver", "pullToRefreshLayout", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "getPullToRefreshLayout", "()Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "pullToRefreshLayout$delegate", "canChangeSelection", "member", "getChatIdForLoadMember", "", "getCurrentActionType", "Lcom/ss/android/lark/team/entity/MemberActionType;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "initListView", "", "initPullToRefreshLayout", "isInSelectionMode", "isSelectable", "isSelected", "memberViewModel", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "observeData", "onActionTypeChanged", "actionType", "onClick", "view", "onCreate", "onLongClick", "onMemberRemoved", "ids", "onSelectionChanged", "selected", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "refreshPage", "supportSelection", "updateSelection", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseMemberListPiece extends LifecycleOwnerPiece<BaseMemberListPiece> implements BaseMemberListExport {

    /* renamed from: a */
    public static final Companion f137019a = new Companion(null);

    /* renamed from: b */
    private final Lazy f137020b = LazyKt.lazy(new C55504l(this));

    /* renamed from: g */
    private final Lazy f137021g = LazyKt.lazy(new C55499g(this));

    /* renamed from: h */
    private final AbstractC1178x<List<TeamMemberVO>> f137022h = new C55496d(this);

    /* renamed from: i */
    private final AbstractC1178x<List<TeamMemberVO>> f137023i = new C55501i(this);

    /* renamed from: j */
    private final AbstractC1178x<Boolean> f137024j = new C55503k(this);

    /* renamed from: k */
    private final AbstractC1178x<Boolean> f137025k = new C55502j(this);

    /* renamed from: l */
    private final AbstractC1178x<Boolean> f137026l = new C55500h(this);

    /* renamed from: m */
    private final Lazy f137027m = LazyKt.lazy(new C55495c(this));

    /* renamed from: n */
    private final C55494b f137028n = new C55494b(this);

    /* renamed from: a */
    public final LKUIPtrClassicFrameLayout mo189333a() {
        return (LKUIPtrClassicFrameLayout) this.f137020b.getValue();
    }

    /* renamed from: b */
    public final CommonRecyclerView mo189339b() {
        return (CommonRecyclerView) this.f137021g.getValue();
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
    /* renamed from: b */
    public void mo189340b(View view, TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "member");
    }

    /* renamed from: d */
    public final TeamMemberAdapter mo189344d() {
        return (TeamMemberAdapter) this.f137027m.getValue();
    }

    /* renamed from: e */
    public abstract BaseMemberViewModel mo189345e();

    /* renamed from: f */
    public abstract boolean mo189346f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/team/page/member/BaseMemberListPiece$Companion;", "", "()V", "MIN_PRE_LOAD_DISTANCE_THRESHOLD", "", "PRE_LOAD_THRESHOLD", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(BaseMemberListExport.class, this);
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
    /* renamed from: g */
    public boolean mo189347g() {
        return mo189346f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamMemberAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$c */
    static final class C55495c extends Lambda implements Function0<TeamMemberAdapter> {
        final /* synthetic */ BaseMemberListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55495c(BaseMemberListPiece baseMemberListPiece) {
            super(0);
            this.this$0 = baseMemberListPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamMemberAdapter invoke() {
            return new TeamMemberAdapter(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$g */
    static final class C55499g extends Lambda implements Function0<CommonRecyclerView> {
        final /* synthetic */ BaseMemberListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55499g(BaseMemberListPiece baseMemberListPiece) {
            super(0);
            this.this$0 = baseMemberListPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CommonRecyclerView invoke() {
            return (CommonRecyclerView) this.this$0.mo177201f(R.id.full_list);
        }
    }

    /* renamed from: i */
    public final void mo189349i() {
        mo177203q().mo177168a(MemberActionType.class, mo189348h());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$l */
    static final class C55504l extends Lambda implements Function0<LKUIPtrClassicFrameLayout> {
        final /* synthetic */ BaseMemberListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55504l(BaseMemberListPiece baseMemberListPiece) {
            super(0);
            this.this$0 = baseMemberListPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LKUIPtrClassicFrameLayout invoke() {
            View s = this.this$0.mo177205s();
            if (s != null) {
                return (LKUIPtrClassicFrameLayout) s;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout");
        }
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo189380j();
        mo189381k();
        m215294l();
        mo189345e().setup();
    }

    /* renamed from: j */
    private final void mo189380j() {
        LKUIPtrClassicFrameLayout a = mo189333a();
        a.setKeepHeaderWhenRefresh(true);
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(mo177180C());
        a.setFooterView(chatWindowPtrLoadingHeader);
        a.addPtrUIHandler(chatWindowPtrLoadingHeader);
        a.setForceBackWhenComplete(true);
        a.disableWhenHorizontalMove(true);
        a.setPtrHandler(new C55498f(this));
    }

    /* renamed from: k */
    private final void mo189381k() {
        mo189339b().setLayoutManager(new LinearLayoutManager(mo177180C(), 1, false));
        mo189339b().setAdapter(mo189344d());
        mo189339b().addOnScrollListener(new C55497e(this));
    }

    /* renamed from: l */
    private final void m215294l() {
        BaseMemberViewModel e = mo189345e();
        BaseMemberListPiece baseMemberListPiece = this;
        e.getFirstPageLiveData().mo5923a(baseMemberListPiece, this.f137022h);
        e.getLoadMoreLiveData().mo5923a(baseMemberListPiece, this.f137023i);
        e.getNeedSearchLiveData().mo5923a(baseMemberListPiece, this.f137025k);
        e.getNoMoreLiveData().mo5923a(baseMemberListPiece, this.f137024j);
        e.getLoadFailedLiveData().mo5923a(baseMemberListPiece, this.f137026l);
        mo177190a(MemberActionType.class, this.f137028n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.MemberActionType) != false) goto L_0x001c;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.team.entity.MemberActionType mo189348h() {
        /*
            r3 = this;
            com.ss.android.lark.piece.a.c r0 = r3.mo177203q()
            java.lang.Class<com.ss.android.lark.team.entity.MemberActionType> r1 = com.ss.android.lark.team.entity.MemberActionType.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.MemberActionType
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.team.entity.MemberActionType r0 = (com.ss.android.lark.team.entity.MemberActionType) r0
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            com.ss.android.lark.team.entity.MemberActionType r0 = com.ss.android.lark.team.entity.MemberActionType.BROWSE_LIST
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.BaseMemberListPiece.mo189348h():com.ss.android.lark.team.entity.MemberActionType");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/member/BaseMemberListPiece$actionTypeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/MemberActionType;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$b */
    public static final class C55494b extends DataObserver<MemberActionType> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberListPiece f137029a;

        /* renamed from: a */
        public void mo127664a(MemberActionType memberActionType) {
            if (memberActionType != null) {
                this.f137029a.mo189336a(memberActionType);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55494b(BaseMemberListPiece baseMemberListPiece) {
            super(false, 1, null);
            this.f137029a = baseMemberListPiece;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/team/page/member/BaseMemberListPiece$initListView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$e */
    public static final class C55497e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ BaseMemberListPiece f137031a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55497e(BaseMemberListPiece baseMemberListPiece) {
            this.f137031a = baseMemberListPiece;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 1) {
                PieceContext r = this.f137031a.mo177204r();
                if (r != null) {
                    aVar = r.mo177222a(TeamMemberSearchBarExport.class);
                } else {
                    aVar = null;
                }
                TeamMemberSearchBarExport rVar = (TeamMemberSearchBarExport) aVar;
                if (rVar != null) {
                    rVar.mo189461a();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = this.f137031a.mo189339b().getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (i2 > 8 && this.f137031a.mo189345e().canLoadMore() && linearLayoutManager.findLastVisibleItemPosition() + 1 == this.f137031a.mo189344d().getItemCount() - 3) {
                    this.f137031a.mo189333a().autoLoadMore();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/page/member/BaseMemberListPiece$initPullToRefreshLayout$1$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$f */
    public static final class C55498f extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ BaseMemberListPiece f137032a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        }

        C55498f(BaseMemberListPiece baseMemberListPiece) {
            this.f137032a = baseMemberListPiece;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            this.f137032a.mo189345e().loadMore();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            if (!this.f137032a.mo189345e().canLoadMore() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
    /* renamed from: c */
    public boolean mo189343c(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        return mo189345e().canChangeSelection(dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$i */
    static final class C55501i<T> implements AbstractC1178x<List<? extends TeamMemberVO>> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberListPiece f137034a;

        C55501i(BaseMemberListPiece baseMemberListPiece) {
            this.f137034a = baseMemberListPiece;
        }

        /* renamed from: a */
        public final void onChanged(List<TeamMemberVO> list) {
            this.f137034a.mo189333a().refreshComplete();
            TeamMemberAdapter d = this.f137034a.mo189344d();
            Intrinsics.checkExpressionValueIsNotNull(list, "it");
            d.mo189525b(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$j */
    static final class C55502j<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberListPiece f137035a;

        C55502j(BaseMemberListPiece baseMemberListPiece) {
            this.f137035a = baseMemberListPiece;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f137035a.mo189333a().refreshComplete();
                this.f137035a.mo189344d().mo189524b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$k */
    static final class C55503k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberListPiece f137036a;

        C55503k(BaseMemberListPiece baseMemberListPiece) {
            this.f137036a = baseMemberListPiece;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f137036a.mo189333a().refreshComplete();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$d */
    static final class C55496d<T> implements AbstractC1178x<List<? extends TeamMemberVO>> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberListPiece f137030a;

        C55496d(BaseMemberListPiece baseMemberListPiece) {
            this.f137030a = baseMemberListPiece;
        }

        /* renamed from: a */
        public final void onChanged(List<TeamMemberVO> list) {
            IPieceExport aVar;
            this.f137030a.mo189333a().refreshComplete();
            TeamMemberAdapter d = this.f137030a.mo189344d();
            Intrinsics.checkExpressionValueIsNotNull(list, "it");
            d.mo189523a(list);
            PieceContext r = this.f137030a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(TeamMemberFailedExport.class);
            } else {
                aVar = null;
            }
            TeamMemberFailedExport nVar = (TeamMemberFailedExport) aVar;
            if (nVar != null) {
                nVar.mo189429a(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberListPiece$h */
    static final class C55500h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberListPiece f137033a;

        C55500h(BaseMemberListPiece baseMemberListPiece) {
            this.f137033a = baseMemberListPiece;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            IPieceExport aVar;
            if (!(!Intrinsics.areEqual((Object) bool, (Object) true))) {
                this.f137033a.mo189333a().refreshComplete();
                if (this.f137033a.mo189344d().getItemCount() > 0) {
                    UDToast.show(this.f137033a.mo177180C(), (int) R.string.Lark_Legacy_NetError);
                    return;
                }
                PieceContext r = this.f137033a.mo177204r();
                if (r != null) {
                    aVar = r.mo177222a(TeamMemberFailedExport.class);
                } else {
                    aVar = null;
                }
                TeamMemberFailedExport nVar = (TeamMemberFailedExport) aVar;
                if (nVar != null) {
                    nVar.mo189429a(0);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo189336a(MemberActionType memberActionType) {
        Intrinsics.checkParameterIsNotNull(memberActionType, "actionType");
        mo189344d().notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
    /* renamed from: b */
    public boolean mo189342b(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        return mo189345e().isSelected(dVar);
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberListExport
    /* renamed from: a */
    public void mo189337a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        mo189344d().mo189526c(list);
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
    /* renamed from: a */
    public boolean mo189338a(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        return mo189345e().isSelectable(dVar);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        return C51468a.m199494d(R.layout.view_team_member_list, context);
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberListExport
    /* renamed from: a */
    public void mo189335a(TeamMemberVO dVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        mo189344d().mo189522a(dVar, z);
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
    /* renamed from: b */
    public void mo189341b(TeamMemberVO dVar, boolean z) {
        IPieceExport aVar;
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        mo189345e().onSelectionChanged(dVar, z);
        PieceContext r = mo177204r();
        if (r != null) {
            aVar = r.mo177222a(TeamMemberPreviewExport.class);
        } else {
            aVar = null;
        }
        TeamMemberPreviewExport pVar = (TeamMemberPreviewExport) aVar;
        if (pVar != null) {
            pVar.mo189450a(dVar, z);
        }
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
    /* renamed from: a */
    public void mo189334a(View view, TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        if (!dVar.mo188959i().isProfileEnable()) {
            Log.m165389i("MemberListPiece", "unsupported click, do nothing. member id: " + dVar.mo188945a());
            return;
        }
        ITeamModuleDependency.IProfileDependency d = C55356a.m214819a().mo144125d();
        if (dVar.mo188959i().isUser()) {
            Object obj = mo177203q().mo177165a().get(Chat.class);
            Chat chat = null;
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
                if (!(obj instanceof Chat)) {
                    obj = null;
                }
                chat = obj;
            }
            Chat chat2 = chat;
            if (chat2 != null) {
                Context C = mo177180C();
                String a = dVar.mo188945a();
                Intrinsics.checkExpressionValueIsNotNull(a, "member.id");
                String name = chat2.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "it.getName()");
                d.mo144149a(C, a, name);
                return;
            }
            d.mo144147a(mo177180C(), dVar.mo188959i());
        } else if (dVar.mo188959i().isBot()) {
            Context C2 = mo177180C();
            String a2 = dVar.mo188945a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "member.id");
            d.mo144148a(C2, a2);
        } else {
            Log.m165383e("MemberListPiece", "unsupported member type, do nothing. member id: " + dVar.mo188945a());
        }
    }
}
