package com.ss.android.lark.team.page.member;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.team.page.member.SelectionPreviewAdapter;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002\u0005\b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001fH\u0016J\b\u0010*\u001a\u00020\u001fH\u0016J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020(H\u0016J\u001c\u0010.\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020100\u0012\u0004\u0012\u0002010/H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberPreviewPiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "Lcom/ss/android/lark/team/page/member/TeamMemberPreviewExport;", "()V", "actionTypeObserver", "com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$actionTypeObserver$1", "Lcom/ss/android/lark/team/page/member/TeamMemberPreviewPiece$actionTypeObserver$1;", "adapterDependency", "com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$adapterDependency$1", "Lcom/ss/android/lark/team/page/member/TeamMemberPreviewPiece$adapterDependency$1;", "collapseAnimator", "Landroid/animation/ValueAnimator;", "expandAnimator", "lastSelectedCount", "", "memberViewModel", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "getMemberViewModel", "()Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "memberViewModel$delegate", "Lkotlin/Lazy;", "previewHeight", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "selectionObserver", "Landroidx/lifecycle/Observer;", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "selectionPreviewAdapter", "Lcom/ss/android/lark/team/page/member/SelectionPreviewAdapter;", "collapsePreview", "", "expandPreview", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "needShowPreview", "", "onCreate", "onDestroy", "onSelectionChanged", "chatter", "isSelected", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public class TeamMemberPreviewPiece extends LifecycleOwnerPiece<TeamMemberPreviewPiece> implements TeamMemberPreviewExport {

    /* renamed from: a */
    public final SelectionPreviewAdapter f137089a;

    /* renamed from: b */
    public int f137090b;

    /* renamed from: g */
    public ValueAnimator f137091g;

    /* renamed from: h */
    public ValueAnimator f137092h;

    /* renamed from: i */
    public RecyclerView f137093i;

    /* renamed from: j */
    private final Lazy f137094j = LazyKt.lazy(new C55558h(this));

    /* renamed from: k */
    private final C55552b f137095k;

    /* renamed from: l */
    private final int f137096l;

    /* renamed from: m */
    private final AbstractC1178x<List<TeamMemberVO>> f137097m;

    /* renamed from: n */
    private final C55551a f137098n;

    /* renamed from: a */
    public BaseMemberViewModel mo189413a() {
        return (BaseMemberViewModel) this.f137094j.getValue();
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(TeamMemberPreviewExport.class, this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamMemberViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$h */
    static final class C55558h extends Lambda implements Function0<TeamMemberViewModel> {
        final /* synthetic */ TeamMemberPreviewPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55558h(TeamMemberPreviewPiece teamMemberPreviewPiece) {
            super(0);
            this.this$0 = teamMemberPreviewPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TeamMemberViewModel invoke() {
            return (TeamMemberViewModel) this.this$0.mo177183a(TeamMemberViewModel.class);
        }
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo189413a().getSelectedMemberLiveData().mo5923a(this, this.f137097m);
        mo177190a(MemberActionType.class, this.f137098n);
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onDestroy() {
        ValueAnimator valueAnimator = this.f137091g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f137092h;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        super.onDestroy();
    }

    public TeamMemberPreviewPiece() {
        C55552b bVar = new C55552b(this);
        this.f137095k = bVar;
        this.f137089a = new SelectionPreviewAdapter(bVar);
        this.f137096l = C51468a.m199486a(50);
        this.f137097m = new C55559i(this);
        this.f137098n = new C55551a(this, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.MemberActionType) != false) goto L_0x001c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo189453e() {
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
            r1 = 1
            if (r0 != 0) goto L_0x0022
            goto L_0x002f
        L_0x0022:
            int[] r2 = com.ss.android.lark.team.page.member.C55594q.f137160a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0030
            r2 = 2
            if (r0 == r2) goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece.mo189453e():boolean");
    }

    /* renamed from: b */
    public final void mo189451b() {
        ValueAnimator valueAnimator = this.f137091g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f137092h;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f137096l);
        ofInt.addListener(new C55555e(this));
        ofInt.addUpdateListener(new C55556f(this));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
        ofInt.setRepeatCount(0);
        ofInt.setDuration(300L);
        ofInt.start();
        this.f137091g = ofInt;
    }

    /* renamed from: d */
    public final void mo189452d() {
        ValueAnimator valueAnimator = this.f137091g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f137092h;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f137096l, 0);
        ofInt.addListener(new C55553c(this));
        ofInt.addUpdateListener(new C55554d(this));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
        ofInt.setRepeatCount(0);
        ofInt.setDuration(300L);
        ofInt.start();
        this.f137092h = ofInt;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$adapterDependency$1", "Lcom/ss/android/lark/team/page/member/SelectionPreviewAdapter$Dependency;", "removeSelection", "", "chatter", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$b */
    public static final class C55552b implements SelectionPreviewAdapter.Dependency {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPreviewPiece f137100a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55552b(TeamMemberPreviewPiece teamMemberPreviewPiece) {
            this.f137100a = teamMemberPreviewPiece;
        }

        @Override // com.ss.android.lark.team.page.member.SelectionPreviewAdapter.Dependency
        /* renamed from: a */
        public void mo189455a(TeamMemberVO dVar) {
            IPieceExport aVar;
            Intrinsics.checkParameterIsNotNull(dVar, "chatter");
            this.f137100a.mo189413a().onSelectionChanged(dVar, false);
            PieceContext r = this.f137100a.mo177204r();
            IPieceExport aVar2 = null;
            if (r != null) {
                aVar = r.mo177222a(BaseMemberListExport.class);
            } else {
                aVar = null;
            }
            BaseMemberListExport aVar3 = (BaseMemberListExport) aVar;
            if (aVar3 != null) {
                aVar3.mo189335a(dVar, false);
            }
            PieceContext r2 = this.f137100a.mo177204r();
            if (r2 != null) {
                aVar2 = r2.mo177222a(TeamMemberSearchListExport.class);
            }
            TeamMemberSearchListExport tVar = (TeamMemberSearchListExport) aVar2;
            if (tVar != null) {
                tVar.mo189470a(dVar, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$collapsePreview$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "isReverse", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$c */
    public static final class C55553c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPreviewPiece f137101a;

        C55553c(TeamMemberPreviewPiece teamMemberPreviewPiece) {
            this.f137101a = teamMemberPreviewPiece;
        }

        public void onAnimationEnd(Animator animator, boolean z) {
            ViewGroup.LayoutParams layoutParams = TeamMemberPreviewPiece.m215399a(this.f137101a).getLayoutParams();
            layoutParams.height = 0;
            TeamMemberPreviewPiece.m215399a(this.f137101a).setLayoutParams(layoutParams);
            this.f137101a.mo177194b(8);
            this.f137101a.f137089a.mo189510a();
            this.f137101a.f137090b = 0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$expandPreview$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$e */
    public static final class C55555e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPreviewPiece f137103a;

        C55555e(TeamMemberPreviewPiece teamMemberPreviewPiece) {
            this.f137103a = teamMemberPreviewPiece;
        }

        public void onAnimationStart(Animator animator) {
            this.f137103a.mo177194b(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$getView$1$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$g */
    public static final class C55557g extends RecyclerView.AbstractC1335d {

        /* renamed from: a */
        final /* synthetic */ int f137105a;

        C55557g(int i) {
            this.f137105a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter ?: return");
                if (recyclerView.getChildAdapterPosition(view) != adapter.getItemCount() - 1) {
                    rect.set(0, 0, this.f137105a, 0);
                } else {
                    rect.set(0, 0, 0, 0);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m215399a(TeamMemberPreviewPiece teamMemberPreviewPiece) {
        RecyclerView recyclerView = teamMemberPreviewPiece.f137093i;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        return recyclerView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$actionTypeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/MemberActionType;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$a */
    public static final class C55551a extends DataObserver<MemberActionType> {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPreviewPiece f137099a;

        /* renamed from: a */
        public void mo127664a(MemberActionType memberActionType) {
            if (memberActionType != null && !this.f137099a.mo189453e()) {
                this.f137099a.mo177194b(8);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55551a(TeamMemberPreviewPiece teamMemberPreviewPiece, boolean z) {
            super(z);
            this.f137099a = teamMemberPreviewPiece;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$collapsePreview$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$d */
    public static final class C55554d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPreviewPiece f137102a;

        C55554d(TeamMemberPreviewPiece teamMemberPreviewPiece) {
            this.f137102a = teamMemberPreviewPiece;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = TeamMemberPreviewPiece.m215399a(this.f137102a).getLayoutParams();
                layoutParams.height = intValue;
                TeamMemberPreviewPiece.m215399a(this.f137102a).setLayoutParams(layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/team/page/member/TeamMemberPreviewPiece$expandPreview$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$f */
    public static final class C55556f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPreviewPiece f137104a;

        C55556f(TeamMemberPreviewPiece teamMemberPreviewPiece) {
            this.f137104a = teamMemberPreviewPiece;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = TeamMemberPreviewPiece.m215399a(this.f137104a).getLayoutParams();
                layoutParams.height = intValue;
                TeamMemberPreviewPiece.m215399a(this.f137104a).setLayoutParams(layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberPreviewPiece$i */
    static final class C55559i<T> implements AbstractC1178x<List<? extends TeamMemberVO>> {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPreviewPiece f137106a;

        C55559i(TeamMemberPreviewPiece teamMemberPreviewPiece) {
            this.f137106a = teamMemberPreviewPiece;
        }

        /* renamed from: a */
        public final void onChanged(List<TeamMemberVO> list) {
            ValueAnimator valueAnimator;
            int i = 0;
            if (!this.f137106a.mo189453e()) {
                this.f137106a.f137089a.mo189510a();
                this.f137106a.f137090b = 0;
                return;
            }
            if (list != null) {
                i = list.size();
            }
            if (this.f137106a.f137090b < 1 && i >= 1) {
                ValueAnimator valueAnimator2 = this.f137106a.f137091g;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    this.f137106a.mo189451b();
                }
            } else if (this.f137106a.f137090b >= 1 && i < 1 && ((valueAnimator = this.f137106a.f137092h) == null || !valueAnimator.isRunning())) {
                this.f137106a.mo189452d();
            }
            this.f137106a.f137090b = i;
        }
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberPreviewExport
    /* renamed from: a */
    public void mo189450a(TeamMemberVO dVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatter");
        if (z) {
            this.f137089a.mo189513b(dVar);
        } else {
            this.f137089a.mo189511a(dVar);
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        marginLayoutParams.height = this.f137096l;
        RecyclerView recyclerView = new RecyclerView(context);
        this.f137093i = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setPadding(C51468a.m199486a(16), C51468a.m199486a(10), C51468a.m199486a(16), C51468a.m199486a(10));
        recyclerView.setAdapter(this.f137089a);
        recyclerView.addItemDecoration(new C55557g(C51468a.m199486a(10)));
        return recyclerView;
    }
}
