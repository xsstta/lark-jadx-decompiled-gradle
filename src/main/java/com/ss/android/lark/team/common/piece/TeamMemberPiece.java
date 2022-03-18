package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.bean.AbsTeamMember;
import com.ss.android.lark.team.bean.ChatterTeamMember;
import com.ss.android.lark.team.bean.FakeFunctionTeamMember;
import com.ss.android.lark.team.common.vm.TeamMemberViewModel;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u0000 1*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u00011B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH$J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010&H&J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020!H\u0014J\u0018\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0016H\u0014J\u0010\u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020!H\u0014J\u0010\u0010-\u001a\u00020(2\u0006\u0010)\u001a\u00020!H\u0014J\b\u0010.\u001a\u00020(H\u0016J\u0016\u0010/\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0004\u0018\u00018\u0001X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00062"}, d2 = {"Lcom/ss/android/lark/team/common/piece/TeamMemberPiece;", "T", "VM", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "()V", "addMemberClickListener", "Landroid/view/View$OnClickListener;", "avatarContainerView", "Landroid/widget/LinearLayout;", "avatarDividerWidth", "", "maxHoldCount", "memberCountObserver", "Landroidx/lifecycle/Observer;", "Lkotlin/Triple;", "memberCountView", "Landroid/widget/TextView;", "onMemberAvatarClickListener", "removeMemberClickListener", "teamMemberListObserver", "", "Lcom/ss/android/lark/team/bean/AbsTeamMember;", "viewMemberClickListener", "viewModel", "getViewModel", "()Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "setViewModel", "(Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;)V", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "getItemName", "", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "Ljava/lang/Class;", "onClickAddMember", "", "view", "onClickMember", "member", "onClickRemoveMember", "onClickViewMember", "onCreate", "updateMemberAvatarList", "list", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class TeamMemberPiece<T, VM extends TeamMemberViewModel> extends LifecycleOwnerPiece<T> {

    /* renamed from: b */
    public static final Companion f136766b = new Companion(null);

    /* renamed from: q */
    private static final int f136767q = C57582a.m223600a(32);

    /* renamed from: r */
    private static final int f136768r = C57582a.m223600a(12);

    /* renamed from: a */
    public TextView f136769a;

    /* renamed from: g */
    private VM f136770g;

    /* renamed from: h */
    private LinearLayout f136771h;

    /* renamed from: i */
    private int f136772i;

    /* renamed from: j */
    private int f136773j;

    /* renamed from: k */
    private final AbstractC1178x<Triple<Integer, Integer, Integer>> f136774k = new C55387c(this);

    /* renamed from: l */
    private final AbstractC1178x<List<AbsTeamMember>> f136775l = new C55390f(this);

    /* renamed from: m */
    private final View.OnClickListener f136776m = new View$OnClickListenerC55391g(this);

    /* renamed from: n */
    private final View.OnClickListener f136777n = new View$OnClickListenerC55386b(this);

    /* renamed from: o */
    private final View.OnClickListener f136778o = new View$OnClickListenerC55389e(this);

    /* renamed from: p */
    private final View.OnClickListener f136779p = new View$OnClickListenerC55388d(this);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo189020a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    /* renamed from: b */
    public abstract Class<VM> mo189023b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo189024b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo189025c(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo189026d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/team/common/piece/TeamMemberPiece$Companion;", "", "()V", "SIZE_AVATAR", "", "SIZE_AVATAR_MIN_MARGIN", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamMemberPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final VM mo189019a() {
        return this.f136770g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.lark.team.common.piece.TeamMemberPiece<T, VM extends com.ss.android.lark.team.common.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        View s = mo177205s();
        View findViewById = s.findViewById(R.id.member_count);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentV.findViewById(R.id.member_count)");
        this.f136769a = (TextView) findViewById;
        View findViewById2 = s.findViewById(R.id.avatar_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentV.findViewById(R.id.avatar_container)");
        this.f136771h = (LinearLayout) findViewById2;
        TextView textView = this.f136769a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("memberCountView");
        }
        textView.setOnClickListener(this.f136776m);
        s.setOnClickListener(this.f136776m);
        VM vm = (VM) ((TeamMemberViewModel) mo177183a(mo189023b()));
        TeamMemberPiece<T, VM> teamMemberPiece = this;
        vm.getMemberCount().mo5923a(teamMemberPiece, this.f136774k);
        vm.getMemberList().mo5923a(teamMemberPiece, this.f136775l);
        vm.setup();
        this.f136770g = vm;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "VM", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamMemberPiece$b */
    static final class View$OnClickListenerC55386b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPiece f136780a;

        View$OnClickListenerC55386b(TeamMemberPiece teamMemberPiece) {
            this.f136780a = teamMemberPiece;
        }

        public final void onClick(View view) {
            TeamMemberPiece teamMemberPiece = this.f136780a;
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            teamMemberPiece.mo189020a(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "VM", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamMemberPiece$e */
    static final class View$OnClickListenerC55389e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPiece f136783a;

        View$OnClickListenerC55389e(TeamMemberPiece teamMemberPiece) {
            this.f136783a = teamMemberPiece;
        }

        public final void onClick(View view) {
            TeamMemberPiece teamMemberPiece = this.f136783a;
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            teamMemberPiece.mo189024b(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "T", "VM", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "t", "", "Lcom/ss/android/lark/team/bean/AbsTeamMember;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamMemberPiece$f */
    static final class C55390f<T> implements AbstractC1178x<List<? extends AbsTeamMember>> {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPiece f136784a;

        C55390f(TeamMemberPiece teamMemberPiece) {
            this.f136784a = teamMemberPiece;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends AbsTeamMember> list) {
            TeamMemberPiece teamMemberPiece = this.f136784a;
            Intrinsics.checkExpressionValueIsNotNull(list, "t");
            teamMemberPiece.mo189022a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "VM", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamMemberPiece$g */
    static final class View$OnClickListenerC55391g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPiece f136785a;

        View$OnClickListenerC55391g(TeamMemberPiece teamMemberPiece) {
            this.f136785a = teamMemberPiece;
        }

        public final void onClick(View view) {
            TeamMemberPiece teamMemberPiece = this.f136785a;
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            teamMemberPiece.mo189025c(view);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m214968a(TeamMemberPiece teamMemberPiece) {
        TextView textView = teamMemberPiece.f136769a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("memberCountView");
        }
        return textView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "VM", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamMemberPiece$d */
    static final class View$OnClickListenerC55388d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPiece f136782a;

        View$OnClickListenerC55388d(TeamMemberPiece teamMemberPiece) {
            this.f136782a = teamMemberPiece;
        }

        public final void onClick(View view) {
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            Object tag = view.getTag();
            if (!(tag instanceof AbsTeamMember)) {
                tag = null;
            }
            AbsTeamMember aVar = (AbsTeamMember) tag;
            if (aVar != null) {
                this.f136782a.mo189021a(view, aVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u000422\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007 \b*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "T", "VM", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "t", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamMemberPiece$c */
    static final class C55387c<T> implements AbstractC1178x<Triple<? extends Integer, ? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ TeamMemberPiece f136781a;

        C55387c(TeamMemberPiece teamMemberPiece) {
            this.f136781a = teamMemberPiece;
        }

        /* renamed from: a */
        public final void onChanged(Triple<Integer, Integer, Integer> triple) {
            String str;
            String str2;
            boolean z;
            String str3 = "";
            if (triple.getFirst().intValue() > 0) {
                str = UIHelper.getQuantityString(R.plurals.Lark_Groups_MobileSelectedCountMembers, triple.getFirst().intValue());
            } else {
                str = str3;
            }
            if (triple.getSecond().intValue() > 0) {
                str2 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberChatsICU, triple.getSecond().intValue());
            } else {
                str2 = str3;
            }
            if (triple.getThird().intValue() > 0) {
                str3 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberOrganizations, triple.getThird().intValue());
            }
            String str4 = str + str2 + str3;
            TextView a = TeamMemberPiece.m214968a(this.f136781a);
            String str5 = str4;
            int i = 0;
            if (str5.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 4;
            }
            a.setVisibility(i);
            TeamMemberPiece.m214968a(this.f136781a).setText(str5);
        }
    }

    /* renamed from: a */
    public final void mo189022a(List<? extends AbsTeamMember> list) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        LinearLayout linearLayout = this.f136771h;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarContainerView");
        }
        linearLayout.removeAllViews();
        if (this.f136772i <= 0) {
            int width = linearLayout.getWidth();
            do {
                i2 = this.f136772i + 1;
                this.f136772i = i2;
                i3 = f136767q;
                i4 = f136768r;
            } while ((i2 * i3) + ((i2 - 1) * i4) <= width);
            this.f136772i = i2 - 1;
            if (linearLayout.getWidth() > 0) {
                int width2 = linearLayout.getWidth();
                int i5 = this.f136772i;
                i4 = (width2 - (i3 * i5)) / (i5 - 1);
            }
            this.f136773j = i4;
        }
        ArrayList arrayList = new ArrayList();
        VM vm = this.f136770g;
        if (vm == null || !vm.supportAddMember()) {
            i = 0;
        } else {
            Context context = linearLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            arrayList.add(new FakeFunctionTeamMember("id_add_member", UDIconUtils.getIconDrawable(context, (int) R.drawable.icon_add_team_member, C57582a.m223616d(linearLayout.getContext(), R.color.icon_n3))));
            i = 1;
        }
        VM vm2 = this.f136770g;
        if (vm2 != null && vm2.supportRemoveMember()) {
            i++;
            Context context2 = linearLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "it.context");
            Context context3 = linearLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "it.context");
            arrayList.add(new FakeFunctionTeamMember("id_remove_member", UDIconUtils.getIconDrawable(context2, (int) R.drawable.icon_remove_team_member, C51468a.m199487a((int) R.color.icon_n3, context3))));
        }
        List<? extends AbsTeamMember> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int min = Math.min(this.f136772i - i, list.size());
            if (min < 1) {
                min = 1;
            }
            arrayList.addAll(0, list.subList(0, min));
        }
        int size = arrayList.size();
        if (1 <= size) {
            int i6 = 1;
            while (true) {
                Context context4 = linearLayout.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "it.context");
                LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(context4, null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C51468a.m199486a(32), C51468a.m199486a(32));
                if (i6 != arrayList.size()) {
                    marginLayoutParams.setMarginEnd(this.f136773j);
                }
                lKUIRoundedImageView2.setLayoutParams(marginLayoutParams);
                lKUIRoundedImageView2.setOval(true);
                AbsTeamMember aVar = (AbsTeamMember) arrayList.get(i6 - 1);
                lKUIRoundedImageView2.setTag(aVar);
                if (!(aVar instanceof FakeFunctionTeamMember)) {
                    lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                    if (aVar.getAvatarDrawable() != null) {
                        lKUIRoundedImageView2.setImageDrawable(aVar.getAvatarDrawable());
                    } else {
                        String avatarKey = aVar.getAvatarKey();
                        if (avatarKey != null) {
                            if (avatarKey.length() > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                ITeamModuleDependency.IImageDependency a = C55356a.m214819a().mo144121a();
                                Context context5 = linearLayout.getContext();
                                Intrinsics.checkExpressionValueIsNotNull(context5, "it.context");
                                String avatarKey2 = aVar.getAvatarKey();
                                if (avatarKey2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                int i7 = f136767q;
                                a.mo144129a(context5, avatarKey2, aVar.getId(), lKUIRoundedImageView2, i7, i7);
                            }
                        }
                        lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        Context context6 = linearLayout.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context6, "it.context");
                        lKUIRoundedImageView2.setImageDrawable(UDIconUtils.getIconDrawable(context6, (int) R.drawable.icon_team_member, C57582a.m223616d(linearLayout.getContext(), R.color.icon_n3)));
                    }
                    lKUIRoundedImageView2.setOnClickListener(this.f136779p);
                } else if (Intrinsics.areEqual(aVar.getId(), "id_add_member")) {
                    lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    lKUIRoundedImageView2.setImageDrawable(((FakeFunctionTeamMember) aVar).getAvatarDrawable());
                    lKUIRoundedImageView2.setOnClickListener(this.f136777n);
                } else if (Intrinsics.areEqual(aVar.getId(), "id_remove_member")) {
                    lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    lKUIRoundedImageView2.setImageDrawable(((FakeFunctionTeamMember) aVar).getAvatarDrawable());
                    lKUIRoundedImageView2.setOnClickListener(this.f136778o);
                }
                linearLayout.addView(lKUIRoundedImageView2);
                if (i6 != size) {
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_team_member, (ViewGroup) null, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…team_member, null, false)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo189021a(View view, AbsTeamMember aVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "member");
        if (aVar instanceof ChatterTeamMember) {
            ChatChatter a = ((ChatterTeamMember) aVar).mo188944a();
            if (a.isProfileEnable() && !a.isAnonymous()) {
                if (a.isUser()) {
                    ITeamModuleDependency.IProfileDependency d = C55356a.m214819a().mo144125d();
                    Context context = view.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                    d.mo144149a(context, aVar.getId(), mo189026d());
                } else if (a.isBot()) {
                    ITeamModuleDependency.IProfileDependency d2 = C55356a.m214819a().mo144125d();
                    Context context2 = view.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                    d2.mo144148a(context2, aVar.getId());
                }
            }
        }
    }
}
