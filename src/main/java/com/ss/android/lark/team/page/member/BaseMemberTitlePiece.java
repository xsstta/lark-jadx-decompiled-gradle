package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0006\u0010'\u001a\u00020&J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0006\u0010.\u001a\u00020\u0015J\b\u0010/\u001a\u00020\"H\u0016J\b\u00100\u001a\u000201H&J\b\u00102\u001a\u00020\"H&J\b\u00103\u001a\u00020\"H\u0016J\b\u00104\u001a\u00020\"H&J\u0010\u00105\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u0015H\u0016J\u001e\u00106\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020908\u0012\u0004\u0012\u000209\u0018\u000107H\u0016J\b\u0010:\u001a\u00020\"H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0012\u0010\nR\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001a0\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006;"}, d2 = {"Lcom/ss/android/lark/team/page/member/BaseMemberTitlePiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "Lcom/ss/android/lark/team/page/member/BaseMemberTitleExport;", "()V", "actionTypeObserver", "com/ss/android/lark/team/page/member/BaseMemberTitlePiece$actionTypeObserver$1", "Lcom/ss/android/lark/team/page/member/BaseMemberTitlePiece$actionTypeObserver$1;", "addMemberRightAction", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "getAddMemberRightAction", "()Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "addMemberRightAction$delegate", "Lkotlin/Lazy;", "loadedMemberObserver", "Landroidx/lifecycle/Observer;", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "moreRightAction", "getMoreRightAction", "moreRightAction$delegate", "needBackToNormalAfterAction", "", "removeMemberRightAction", "getRemoveMemberRightAction", "removeMemberRightAction$delegate", "selectedObserver", "", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "configBackLeftAction", "", "configCancelLeftAction", "configTitleBar", "actionType", "Lcom/ss/android/lark/team/entity/MemberActionType;", "getActionType", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "hasSelection", "logOnBackLeftActionClick", "memberViewModel", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "onAddMemberClick", "onCreate", "onRemoveMemberClick", "onSelectionChanged", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "refreshTitleBar", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseMemberTitlePiece extends LifecycleOwnerPiece<BaseMemberTitlePiece> implements BaseMemberTitleExport {

    /* renamed from: a */
    public CommonTitleBar f137037a;

    /* renamed from: b */
    public boolean f137038b;

    /* renamed from: g */
    private final Lazy f137039g = LazyKt.lazy(new C55506b(this));

    /* renamed from: h */
    private final Lazy f137040h = LazyKt.lazy(new C55515g(this));

    /* renamed from: i */
    private final Lazy f137041i = LazyKt.lazy(new C55511f(this));

    /* renamed from: j */
    private final C55505a f137042j = new C55505a(this, true);

    /* renamed from: k */
    private final AbstractC1178x<List<TeamMemberVO>> f137043k = new C55517h(this);

    /* renamed from: l */
    private final AbstractC1178x<List<TeamMemberVO>> f137044l = new C55510e(this);

    /* renamed from: d */
    public final IActionTitlebar.Action mo189360d() {
        return (IActionTitlebar.Action) this.f137039g.getValue();
    }

    /* renamed from: e */
    public final IActionTitlebar.Action mo189361e() {
        return (IActionTitlebar.Action) this.f137040h.getValue();
    }

    /* renamed from: f */
    public final IActionTitlebar.Action mo189362f() {
        return (IActionTitlebar.Action) this.f137041i.getValue();
    }

    /* renamed from: g */
    public abstract BaseMemberViewModel mo189363g();

    /* renamed from: i */
    public void mo189365i() {
    }

    /* renamed from: k */
    public abstract void mo189367k();

    /* renamed from: l */
    public abstract void mo189368l();

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(BaseMemberTitleExport.class, this);
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberTitleExport
    /* renamed from: a */
    public void mo189356a() {
        mo189357a(mo189370n());
    }

    /* renamed from: b */
    public final CommonTitleBar mo189359b() {
        CommonTitleBar commonTitleBar = this.f137037a;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        return commonTitleBar;
    }

    /* renamed from: m */
    public final boolean mo189369m() {
        if (mo189363g().selectedMemberCount() > 0) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/team/page/member/BaseMemberTitlePiece$addMemberRightAction$2$1", "invoke", "()Lcom/ss/android/lark/team/page/member/BaseMemberTitlePiece$addMemberRightAction$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$b */
    static final class C55506b extends Lambda implements Function0<C555071> {
        final /* synthetic */ BaseMemberTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55506b(BaseMemberTitlePiece baseMemberTitlePiece) {
            super(0);
            this.this$0 = baseMemberTitlePiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C555071 invoke() {
            return new IActionTitlebar.TextAction(this, C51468a.m199493c(R.string.Lark_Legacy_Add, this.this$0.mo177180C()), R.color.add_action) {
                /* class com.ss.android.lark.team.page.member.BaseMemberTitlePiece.C55506b.C555071 */

                /* renamed from: a */
                final /* synthetic */ C55506b f137046a;

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    this.f137046a.this$0.mo189367k();
                }

                {
                    this.f137046a = r1;
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/team/page/member/BaseMemberTitlePiece$moreRightAction$2$1", "invoke", "()Lcom/ss/android/lark/team/page/member/BaseMemberTitlePiece$moreRightAction$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$f */
    static final class C55511f extends Lambda implements Function0<C555121> {
        final /* synthetic */ BaseMemberTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55511f(BaseMemberTitlePiece baseMemberTitlePiece) {
            super(0);
            this.this$0 = baseMemberTitlePiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C555121 invoke() {
            Drawable a = C51468a.m199489a((int) R.drawable.ud_icon_more_outlined, this.this$0.mo177180C(), (int) R.color.icon_n1);
            if (a == null) {
                Intrinsics.throwNpe();
            }
            return new IActionTitlebar.C57573a(this, a, a) {
                /* class com.ss.android.lark.team.page.member.BaseMemberTitlePiece.C55511f.C555121 */

                /* renamed from: a */
                final /* synthetic */ C55511f f137050a;

                /* renamed from: b */
                final /* synthetic */ Drawable f137051b;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$f$1$a */
                static final class C55513a implements C58339d.AbstractC58343b {

                    /* renamed from: a */
                    final /* synthetic */ C555121 f137052a;

                    C55513a(C555121 r1) {
                        this.f137052a = r1;
                    }

                    @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                    public final void onMenuItemClick() {
                        this.f137052a.f137050a.this$0.mo189367k();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$f$1$b */
                static final class C55514b implements C58339d.AbstractC58343b {

                    /* renamed from: a */
                    final /* synthetic */ C555121 f137053a;

                    C55514b(C555121 r1) {
                        this.f137053a = r1;
                    }

                    @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                    public final void onMenuItemClick() {
                        this.f137053a.f137050a.this$0.f137038b = true;
                        this.f137053a.f137050a.this$0.mo177203q().mo177171b(MemberActionType.class, MemberActionType.REMOVE_MEMBER);
                    }
                }

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_Add), new C55513a(this)));
                    C58339d.C58341a a = new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_Remove), new C55514b(this)).mo197568a(R.color.function_danger_500);
                    Intrinsics.checkExpressionValueIsNotNull(a, "MenuUtils.DialogItem(UIH…olor.function_danger_500)");
                    arrayList.add(a);
                    C58339d.m226198b(this.f137050a.this$0.mo177180C(), arrayList, true);
                }

                {
                    this.f137050a = r1;
                    this.f137051b = r2;
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/team/page/member/BaseMemberTitlePiece$removeMemberRightAction$2$1", "invoke", "()Lcom/ss/android/lark/team/page/member/BaseMemberTitlePiece$removeMemberRightAction$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$g */
    static final class C55515g extends Lambda implements Function0<C555161> {
        final /* synthetic */ BaseMemberTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55515g(BaseMemberTitlePiece baseMemberTitlePiece) {
            super(0);
            this.this$0 = baseMemberTitlePiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C555161 invoke() {
            return new IActionTitlebar.TextAction(this, C51468a.m199493c(R.string.Lark_Legacy_Remove, this.this$0.mo177180C()), R.color.remove_action) {
                /* class com.ss.android.lark.team.page.member.BaseMemberTitlePiece.C55515g.C555161 */

                /* renamed from: a */
                final /* synthetic */ C55515g f137054a;

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    this.f137054a.this$0.mo189368l();
                }

                {
                    this.f137054a = r1;
                }
            };
        }
    }

    /* renamed from: h */
    public final void mo189364h() {
        CommonTitleBar commonTitleBar = this.f137037a;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftText("");
        CommonTitleBar commonTitleBar2 = this.f137037a;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        CommonTitleBar commonTitleBar3 = this.f137037a;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC55508c(this));
    }

    /* renamed from: j */
    public final void mo189366j() {
        CommonTitleBar commonTitleBar = this.f137037a;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftImageDrawable(null);
        CommonTitleBar commonTitleBar2 = this.f137037a;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.setLeftText(R.string.Lark_Group_Cancel);
        CommonTitleBar commonTitleBar3 = this.f137037a;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC55509d(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.MemberActionType) != false) goto L_0x001c;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.team.entity.MemberActionType mo189370n() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.BaseMemberTitlePiece.mo189370n():com.ss.android.lark.team.entity.MemberActionType");
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177203q().mo177167a(MemberActionType.class, (DataObserver<? extends Object>) this.f137042j);
        BaseMemberTitlePiece baseMemberTitlePiece = this;
        mo189363g().getSelectedMemberLiveData().mo5923a(baseMemberTitlePiece, this.f137043k);
        mo189363g().getMemberListLiveData().mo5923a(baseMemberTitlePiece, this.f137044l);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/member/BaseMemberTitlePiece$actionTypeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/MemberActionType;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$a */
    public static final class C55505a extends DataObserver<MemberActionType> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberTitlePiece f137045a;

        /* renamed from: a */
        public void mo127664a(MemberActionType memberActionType) {
            if (memberActionType != null) {
                this.f137045a.mo189357a(memberActionType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55505a(BaseMemberTitlePiece baseMemberTitlePiece, boolean z) {
            super(z);
            this.f137045a = baseMemberTitlePiece;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$c */
    static final class View$OnClickListenerC55508c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseMemberTitlePiece f137047a;

        View$OnClickListenerC55508c(BaseMemberTitlePiece baseMemberTitlePiece) {
            this.f137047a = baseMemberTitlePiece;
        }

        public final void onClick(View view) {
            this.f137047a.mo177212z();
            this.f137047a.mo189365i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$e */
    static final class C55510e<T> implements AbstractC1178x<List<TeamMemberVO>> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberTitlePiece f137049a;

        C55510e(BaseMemberTitlePiece baseMemberTitlePiece) {
            this.f137049a = baseMemberTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(List<TeamMemberVO> list) {
            if (list != null) {
                BaseMemberTitlePiece baseMemberTitlePiece = this.f137049a;
                baseMemberTitlePiece.mo189357a(baseMemberTitlePiece.mo189370n());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "t", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$h */
    static final class C55517h<T> implements AbstractC1178x<List<? extends TeamMemberVO>> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberTitlePiece f137055a;

        C55517h(BaseMemberTitlePiece baseMemberTitlePiece) {
            this.f137055a = baseMemberTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(List<TeamMemberVO> list) {
            boolean z;
            BaseMemberTitlePiece baseMemberTitlePiece = this.f137055a;
            List<TeamMemberVO> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            baseMemberTitlePiece.mo189358a(!z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.BaseMemberTitlePiece$d */
    static final class View$OnClickListenerC55509d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseMemberTitlePiece f137048a;

        View$OnClickListenerC55509d(BaseMemberTitlePiece baseMemberTitlePiece) {
            this.f137048a = baseMemberTitlePiece;
        }

        public final void onClick(View view) {
            if (this.f137048a.f137038b) {
                this.f137048a.mo189363g().clearSelection();
                this.f137048a.mo177203q().mo177171b(MemberActionType.class, MemberActionType.BROWSE_LIST);
                return;
            }
            this.f137048a.mo177212z();
        }
    }

    /* renamed from: a */
    public void mo189357a(MemberActionType memberActionType) {
        Intrinsics.checkParameterIsNotNull(memberActionType, "actionType");
        CommonTitleBar commonTitleBar = this.f137037a;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.removeAllActions();
        CommonTitleBar commonTitleBar2 = this.f137037a;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.setTitle("");
    }

    /* renamed from: a */
    public void mo189358a(boolean z) {
        CommonTitleBar commonTitleBar = this.f137037a;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        View viewByAction = commonTitleBar.getViewByAction(mo189361e());
        if (viewByAction != null) {
            viewByAction.setEnabled(z);
        }
        if (mo189370n() == MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT) {
            CommonTitleBar commonTitleBar2 = this.f137037a;
            if (commonTitleBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            View viewByAction2 = commonTitleBar2.getViewByAction(mo189360d());
            if (viewByAction2 != null) {
                viewByAction2.setEnabled(z);
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        CommonTitleBar commonTitleBar = new CommonTitleBar(context);
        this.f137037a = commonTitleBar;
        return commonTitleBar;
    }
}
