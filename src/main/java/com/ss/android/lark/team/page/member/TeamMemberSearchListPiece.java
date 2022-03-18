package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import java.util.List;
import java.util.Locale;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69373by;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u001c\u0010&\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020)0(\u0012\u0004\u0012\u00020)0'H\u0016J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0007H\u0016J\u001e\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016J\u0018\u00102\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0006\u00103\u001a\u000204H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138VX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001b\u0010\u001c¨\u00065"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberSearchListPiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "Lcom/ss/android/lark/team/page/member/TeamMemberSearchListExport;", "()V", "adapterDependency", "Lcom/ss/android/lark/team/page/member/TeamMemberAdapterDependency;", "chatId", "", "getChatId", "()Ljava/lang/String;", "chatId$delegate", "Lkotlin/Lazy;", "emptyTipView", "Landroid/widget/TextView;", "emptyView", "Landroid/view/View;", "listView", "Landroidx/recyclerview/widget/RecyclerView;", "memberViewModel", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "getMemberViewModel", "()Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "memberViewModel$delegate", "searchJob", "Lkotlinx/coroutines/Job;", "teamMemberAdapter", "Lcom/ss/android/lark/team/page/member/TeamMemberAdapter;", "getTeamMemberAdapter", "()Lcom/ss/android/lark/team/page/member/TeamMemberAdapter;", "teamMemberAdapter$delegate", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "hide", "", "onCreate", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "search", "key", "updateMemberTagInfoList", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "tagInfoList", "", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "updateSelection", "selected", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public class TeamMemberSearchListPiece extends LifecycleOwnerPiece<TeamMemberSearchListPiece> implements TeamMemberSearchListExport {

    /* renamed from: a */
    public final TeamMemberAdapterDependency f137114a = new C55564a(this);

    /* renamed from: b */
    public View f137115b;

    /* renamed from: g */
    public TextView f137116g;

    /* renamed from: h */
    private final Lazy f137117h = LazyKt.lazy(new C55567d(this));

    /* renamed from: i */
    private RecyclerView f137118i;

    /* renamed from: j */
    private final Lazy f137119j = LazyKt.lazy(new C55570f(this));

    /* renamed from: k */
    private final Lazy f137120k = LazyKt.lazy(new C55565b(this));

    /* renamed from: l */
    private Job f137121l;

    /* renamed from: a */
    public BaseMemberViewModel mo189414a() {
        return (BaseMemberViewModel) this.f137117h.getValue();
    }

    /* renamed from: d */
    public final TeamMemberAdapter mo189473d() {
        return (TeamMemberAdapter) this.f137119j.getValue();
    }

    /* renamed from: e */
    public final String mo189474e() {
        return (String) this.f137120k.getValue();
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(TeamMemberSearchListExport.class, this);
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberSearchListExport
    /* renamed from: b */
    public void mo189472b() {
        mo189471a("");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchListPiece$b */
    static final class C55565b extends Lambda implements Function0<String> {
        final /* synthetic */ TeamMemberSearchListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55565b(TeamMemberSearchListPiece teamMemberSearchListPiece) {
            super(0);
            this.this$0 = teamMemberSearchListPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.this$0.mo189414a().getChatIdForLoadMember();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamMemberViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchListPiece$d */
    static final class C55567d extends Lambda implements Function0<TeamMemberViewModel> {
        final /* synthetic */ TeamMemberSearchListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55567d(TeamMemberSearchListPiece teamMemberSearchListPiece) {
            super(0);
            this.this$0 = teamMemberSearchListPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamMemberViewModel invoke() {
            return (TeamMemberViewModel) this.this$0.mo177183a(TeamMemberViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamMemberAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchListPiece$f */
    static final class C55570f extends Lambda implements Function0<TeamMemberAdapter> {
        final /* synthetic */ TeamMemberSearchListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55570f(TeamMemberSearchListPiece teamMemberSearchListPiece) {
            super(0);
            this.this$0 = teamMemberSearchListPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamMemberAdapter invoke() {
            return new TeamMemberAdapter(this.this$0.f137114a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberSearchListPiece$adapterDependency$1", "Lcom/ss/android/lark/team/page/member/TeamMemberAdapterDependency;", "canChangeSelection", "", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "isInSelectionMode", "isSelectable", "isSelected", "onClick", "", "view", "Landroid/view/View;", "onLongClick", "onSelectionChanged", "selected", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchListPiece$a */
    public static final class C55564a implements TeamMemberAdapterDependency {

        /* renamed from: a */
        final /* synthetic */ TeamMemberSearchListPiece f137122a;

        @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
        /* renamed from: g */
        public boolean mo189347g() {
            IPieceExport aVar;
            PieceContext r = this.f137122a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(BaseMemberListExport.class);
            } else {
                aVar = null;
            }
            BaseMemberListExport aVar2 = (BaseMemberListExport) aVar;
            if (aVar2 != null) {
                return aVar2.mo189347g();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55564a(TeamMemberSearchListPiece teamMemberSearchListPiece) {
            this.f137122a = teamMemberSearchListPiece;
        }

        @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
        /* renamed from: c */
        public boolean mo189343c(TeamMemberVO dVar) {
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(dVar, "member");
            PieceContext r = this.f137122a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(BaseMemberListExport.class);
            } else {
                aVar = null;
            }
            BaseMemberListExport aVar2 = (BaseMemberListExport) aVar;
            if (aVar2 != null) {
                return aVar2.mo189343c(dVar);
            }
            return true;
        }

        @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
        /* renamed from: a */
        public boolean mo189338a(TeamMemberVO dVar) {
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(dVar, "member");
            PieceContext r = this.f137122a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(BaseMemberListExport.class);
            } else {
                aVar = null;
            }
            BaseMemberListExport aVar2 = (BaseMemberListExport) aVar;
            if (aVar2 != null) {
                return aVar2.mo189338a(dVar);
            }
            return true;
        }

        @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
        /* renamed from: b */
        public boolean mo189342b(TeamMemberVO dVar) {
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(dVar, "member");
            PieceContext r = this.f137122a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(BaseMemberListExport.class);
            } else {
                aVar = null;
            }
            BaseMemberListExport aVar2 = (BaseMemberListExport) aVar;
            if (aVar2 != null) {
                return aVar2.mo189342b(dVar);
            }
            return false;
        }

        @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
        /* renamed from: a */
        public void mo189334a(View view, TeamMemberVO dVar) {
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(dVar, "member");
            PieceContext r = this.f137122a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(BaseMemberListExport.class);
            } else {
                aVar = null;
            }
            BaseMemberListExport aVar2 = (BaseMemberListExport) aVar;
            if (aVar2 != null) {
                aVar2.mo189334a(view, dVar);
            }
        }

        @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
        /* renamed from: b */
        public void mo189340b(View view, TeamMemberVO dVar) {
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(dVar, "member");
            PieceContext r = this.f137122a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(BaseMemberListExport.class);
            } else {
                aVar = null;
            }
            BaseMemberListExport aVar2 = (BaseMemberListExport) aVar;
            if (aVar2 != null) {
                aVar2.mo189340b(view, dVar);
            }
        }

        @Override // com.ss.android.lark.team.page.member.TeamMemberViewDependency
        /* renamed from: b */
        public void mo189341b(TeamMemberVO dVar, boolean z) {
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(dVar, "member");
            PieceContext r = this.f137122a.mo177204r();
            IPieceExport aVar2 = null;
            if (r != null) {
                aVar = r.mo177222a(BaseMemberListExport.class);
            } else {
                aVar = null;
            }
            BaseMemberListExport aVar3 = (BaseMemberListExport) aVar;
            if (aVar3 != null) {
                aVar3.mo189341b(dVar, z);
            }
            PieceContext r2 = this.f137122a.mo177204r();
            if (r2 != null) {
                aVar2 = r2.mo177222a(BaseMemberListExport.class);
            }
            BaseMemberListExport aVar4 = (BaseMemberListExport) aVar2;
            if (aVar4 != null) {
                aVar4.mo189335a(dVar, z);
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        RecyclerView recyclerView = this.f137118i;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listView");
        }
        recyclerView.setAdapter(mo189473d());
    }

    /* renamed from: a */
    public static final /* synthetic */ View m215420a(TeamMemberSearchListPiece teamMemberSearchListPiece) {
        View view = teamMemberSearchListPiece.f137115b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyView");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m215421b(TeamMemberSearchListPiece teamMemberSearchListPiece) {
        TextView textView = teamMemberSearchListPiece.f137116g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyTipView");
        }
        return textView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamMemberSearchListPiece$search$2", mo239173f = "TeamMemberSearchListPiece.kt", mo239174i = {0}, mo239175l = {131}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchListPiece$e */
    public static final class C55568e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $finalKey;
        final /* synthetic */ String $key;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TeamMemberSearchListPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55568e(TeamMemberSearchListPiece teamMemberSearchListPiece, String str, String str2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = teamMemberSearchListPiece;
            this.$finalKey = str;
            this.$key = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C55568e eVar = new C55568e(this.this$0, this.$finalKey, this.$key, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C55568e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                obj = C69388e.m266829a(Dispatchers.m266326d(), new Function2<CoroutineScope, Continuation<? super List<? extends TeamMemberVO>>, Object>(this, null) {
                    /* class com.ss.android.lark.team.page.member.TeamMemberSearchListPiece.C55568e.C555691 */
                    Object L$0;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C55568e this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C555691 r0 = 

                        @Override // com.ss.android.lark.team.page.member.TeamMemberSearchListExport
                        /* renamed from: a */
                        public void mo189471a(String str) {
                            boolean z;
                            String str2;
                            Intrinsics.checkParameterIsNotNull(str, "key");
                            Job btVar = this.f137121l;
                            boolean z2 = true;
                            if (btVar != null && btVar.mo242631a()) {
                                if (str.length() == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    str2 = "cancelled by hide search";
                                } else {
                                    str2 = "cancelled by another search";
                                }
                                C69373by.m266421a(btVar, str2, null, 2, null);
                            }
                            mo189473d().mo189520a();
                            if (str.length() != 0) {
                                z2 = false;
                            }
                            if (z2) {
                                mo177194b(8);
                                return;
                            }
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                            String lowerCase = str.toLowerCase(locale);
                            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            this.f137121l = C69553g.m266944a(this, null, null, new C55568e(this, lowerCase, str, null), 3, null);
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\t"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberSearchListPiece$getView$1$1$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "im_team_team_release", "com/ss/android/lark/team/page/member/TeamMemberSearchListPiece$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.team.page.member.TeamMemberSearchListPiece$c */
                        public static final class C55566c extends RecyclerView.OnScrollListener {

                            /* renamed from: a */
                            final /* synthetic */ TeamMemberSearchListPiece f137123a;

                            /* renamed from: b */
                            final /* synthetic */ Context f137124b;

                            C55566c(TeamMemberSearchListPiece teamMemberSearchListPiece, Context context) {
                                this.f137123a = teamMemberSearchListPiece;
                                this.f137124b = context;
                            }

                            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                                IPieceExport aVar;
                                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                                if (i == 1) {
                                    PieceContext r = this.f137123a.mo177204r();
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
                        }

                        @Override // com.ss.android.lark.team.page.member.TeamMemberSearchListExport
                        /* renamed from: a */
                        public void mo189469a(TeamMemberVO dVar, List<TagInfo> list) {
                            Intrinsics.checkParameterIsNotNull(dVar, "member");
                            Intrinsics.checkParameterIsNotNull(list, "tagInfoList");
                            mo189473d().mo189521a(dVar, list);
                        }

                        @Override // com.ss.android.lark.team.page.member.TeamMemberSearchListExport
                        /* renamed from: a */
                        public void mo189470a(TeamMemberVO dVar, boolean z) {
                            Intrinsics.checkParameterIsNotNull(dVar, "member");
                            mo189473d().mo189522a(dVar, z);
                        }

                        @Override // com.ss.android.lark.piece.core.Piece
                        /* renamed from: a */
                        public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
                            Intrinsics.checkParameterIsNotNull(context, "context");
                            Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
                            FrameLayout frameLayout = new FrameLayout(context);
                            RecyclerView recyclerView = new RecyclerView(context);
                            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                            recyclerView.setBackgroundColor(C51468a.m199487a((int) R.color.bg_body, context));
                            recyclerView.addOnScrollListener(new C55566c(this, context));
                            this.f137118i = recyclerView;
                            if (recyclerView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("listView");
                            }
                            frameLayout.addView(recyclerView);
                            View inflate = LayoutInflater.from(context).inflate(R.layout.activity_common_load_empty, (ViewGroup) frameLayout, false);
                            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…mpty, frameLayout, false)");
                            this.f137115b = inflate;
                            if (inflate == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("emptyView");
                            }
                            inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            View view = this.f137115b;
                            if (view == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("emptyView");
                            }
                            View findViewById = view.findViewById(R.id.text_empty_tip);
                            Intrinsics.checkExpressionValueIsNotNull(findViewById, "emptyView.findViewById(R.id.text_empty_tip)");
                            this.f137116g = (TextView) findViewById;
                            View view2 = this.f137115b;
                            if (view2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("emptyView");
                            }
                            view2.setVisibility(8);
                            View view3 = this.f137115b;
                            if (view3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("emptyView");
                            }
                            frameLayout.addView(view3);
                            return frameLayout;
                        }
                    }
