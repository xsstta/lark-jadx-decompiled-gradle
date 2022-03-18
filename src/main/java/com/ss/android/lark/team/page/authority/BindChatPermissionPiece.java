package com.ss.android.lark.team.page.authority;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.entity.TeamSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/team/page/authority/BindChatPermissionPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "mHintView", "Landroid/widget/TextView;", "mObserver", "com/ss/android/lark/team/page/authority/BindChatPermissionPiece$mObserver$1", "Lcom/ss/android/lark/team/page/authority/BindChatPermissionPiece$mObserver$1;", "mOnCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mSwitchView", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "enableState", "isEnabled", "", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "hasAddMemberPermission", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/team/entity/Team;", "hasPermission", "onCheck", "listener", "onCreate", "", "setCheckStateWithoutNotifyListeners", "isChecked", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BindChatPermissionPiece extends Piece<BindChatPermissionPiece> {

    /* renamed from: a */
    public UDSwitch f136933a;

    /* renamed from: b */
    public CompoundButton.OnCheckedChangeListener f136934b;

    /* renamed from: g */
    private TextView f136935g;

    /* renamed from: h */
    private final C55467b f136936h = new C55467b(this, true);

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("intent_team", this.f136936h);
    }

    /* renamed from: a */
    public final BindChatPermissionPiece mo189268a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        BindChatPermissionPiece bindChatPermissionPiece = this;
        bindChatPermissionPiece.f136934b = onCheckedChangeListener;
        return bindChatPermissionPiece;
    }

    /* renamed from: a */
    public final boolean mo189270a(Team team) {
        TeamSetting.AddMemberPermission addMemberPermission;
        TeamSetting teamSetting;
        TeamSetting.AddMemberPermission addMemberPermission2 = TeamSetting.AddMemberPermission.ALL_MEMBERS;
        if (team == null || (teamSetting = team.getTeamSetting()) == null) {
            addMemberPermission = null;
        } else {
            addMemberPermission = teamSetting.getAddMemberPermission();
        }
        if (addMemberPermission2 == addMemberPermission) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo189271b(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f136934b;
        this.f136934b = null;
        UDSwitch uDSwitch = this.f136933a;
        if (uDSwitch != null) {
            uDSwitch.setChecked(z);
        }
        this.f136934b = onCheckedChangeListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/authority/BindChatPermissionPiece$mObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/Team;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.authority.BindChatPermissionPiece$b */
    public static final class C55467b extends DataObserver<Team> {

        /* renamed from: a */
        final /* synthetic */ BindChatPermissionPiece f136942a;

        /* renamed from: a */
        public void mo127664a(Team team) {
            boolean z;
            BindChatPermissionPiece bindChatPermissionPiece = this.f136942a;
            bindChatPermissionPiece.mo189269a(bindChatPermissionPiece.mo189270a(team));
            UDSwitch uDSwitch = this.f136942a.f136933a;
            if (uDSwitch != null) {
                if (uDSwitch.isEnabled()) {
                    z = this.f136942a.mo189272b(team);
                } else {
                    z = false;
                }
                this.f136942a.mo189271b(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55467b(BindChatPermissionPiece bindChatPermissionPiece, boolean z) {
            super(z);
            this.f136942a = bindChatPermissionPiece;
        }
    }

    /* renamed from: b */
    public final boolean mo189272b(Team team) {
        TeamSetting.BindTeamChatPermission bindTeamChatPermission;
        TeamSetting teamSetting;
        TeamSetting.BindTeamChatPermission bindTeamChatPermission2 = TeamSetting.BindTeamChatPermission.ALL_MEMBERS;
        if (team == null || (teamSetting = team.getTeamSetting()) == null) {
            bindTeamChatPermission = null;
        } else {
            bindTeamChatPermission = teamSetting.getBindTeamChatPermission();
        }
        if (bindTeamChatPermission2 == bindTeamChatPermission) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if ((r1 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.team.page.authority.BindChatPermissionPiece mo189269a(boolean r6) {
        /*
            r5 = this;
            r0 = r5
            com.ss.android.lark.team.page.authority.BindChatPermissionPiece r0 = (com.ss.android.lark.team.page.authority.BindChatPermissionPiece) r0
            com.larksuite.component.universe_design.udswitch.UDSwitch r1 = r0.f136933a
            r2 = 0
            if (r1 == 0) goto L_0x0036
            r1.setEnabled(r6)
            if (r6 == 0) goto L_0x0033
            com.ss.android.lark.piece.a.c r1 = r0.mo177203q()
            java.util.concurrent.ConcurrentHashMap r1 = r1.mo177165a()
            java.lang.String r3 = "intent_team"
            java.lang.Object r1 = r1.get(r3)
            r3 = 0
            if (r1 == 0) goto L_0x0028
            java.lang.String r4 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            boolean r4 = r1 instanceof com.ss.android.lark.team.entity.Team
            if (r4 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            com.ss.android.lark.team.entity.Team r1 = (com.ss.android.lark.team.entity.Team) r1
            boolean r1 = r0.mo189272b(r1)
            r0.mo189271b(r1)
            goto L_0x0036
        L_0x0033:
            r0.mo189271b(r2)
        L_0x0036:
            android.widget.TextView r1 = r0.f136935g
            if (r1 == 0) goto L_0x0041
            if (r6 == 0) goto L_0x003e
            r2 = 8
        L_0x003e:
            r1.setVisibility(r2)
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.authority.BindChatPermissionPiece.mo189269a(boolean):com.ss.android.lark.team.page.authority.BindChatPermissionPiece");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "com/ss/android/lark/team/page/authority/BindChatPermissionPiece$getView$1$3$2", "com/ss/android/lark/team/page/authority/BindChatPermissionPiece$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.authority.BindChatPermissionPiece$a */
    static final class C55466a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ UDSwitch f136937a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout f136938b;

        /* renamed from: c */
        final /* synthetic */ int f136939c;

        /* renamed from: d */
        final /* synthetic */ BindChatPermissionPiece f136940d;

        /* renamed from: e */
        final /* synthetic */ Context f136941e;

        C55466a(UDSwitch uDSwitch, ConstraintLayout constraintLayout, int i, BindChatPermissionPiece bindChatPermissionPiece, Context context) {
            this.f136937a = uDSwitch;
            this.f136938b = constraintLayout;
            this.f136939c = i;
            this.f136940d = bindChatPermissionPiece;
            this.f136941e = context;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
            if (this.f136937a.isEnabled() && (onCheckedChangeListener = this.f136940d.f136934b) != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
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
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackground(C51468a.m199492b(R.drawable.item_bg_selector_c11, context));
        int a = C51468a.m199485a(0.5f, context);
        int a2 = C51468a.m199487a((int) R.color.line_divider_default, context);
        int a3 = C51468a.m199486a(16);
        ConstraintLayout constraintLayout2 = constraintLayout;
        View view = new View(constraintLayout2.getContext());
        view.setId(R.id.top_divider);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, a);
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        layoutParams.f2816h = 0;
        layoutParams.setMarginStart(a3);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(a2);
        constraintLayout2.addView(view);
        Guideline guideline = new Guideline(context);
        guideline.setId(R.id.guideline);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.f2809a = C51468a.m199486a(53);
        layoutParams2.f2801S = 0;
        constraintLayout.addView(guideline, layoutParams2);
        UDSwitch uDSwitch = new UDSwitch(context);
        uDSwitch.setId(R.id.switch_button);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.f2817i = R.id.top_divider;
        layoutParams3.f2818j = R.id.guideline;
        layoutParams3.f2827s = 0;
        layoutParams3.setMarginEnd(a3);
        uDSwitch.setLayoutParams(layoutParams3);
        uDSwitch.setOnCheckedChangeListener(new C55466a(uDSwitch, constraintLayout, a3, this, context));
        constraintLayout.addView(uDSwitch);
        this.f136933a = uDSwitch;
        TextView textView = new TextView(constraintLayout2.getContext());
        textView.setId(R.id.title);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams4.f2817i = R.id.top_divider;
        layoutParams4.f2818j = R.id.guideline;
        layoutParams4.f2825q = 0;
        layoutParams4.f2826r = R.id.switch_button;
        layoutParams4.setMarginStart(a3);
        layoutParams4.setMarginEnd(a3);
        textView.setLayoutParams(layoutParams4);
        textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
        textView.setTextSize(16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setText(R.string.Project_MV_TeamMembersAddExisting);
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(constraintLayout2.getContext());
        textView2.setId(R.id.hint);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams5.f2817i = R.id.title;
        layoutParams5.f2825q = R.id.title;
        layoutParams5.f2827s = R.id.title;
        layoutParams5.topMargin = C51468a.m199486a(2);
        textView2.setLayoutParams(layoutParams5);
        textView2.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
        textView2.setTextSize(14.0f);
        textView2.setText(R.string.Project_MV_AlreadyAddedToGroup);
        textView2.setVisibility(8);
        this.f136935g = textView2;
        constraintLayout2.addView(textView2);
        View view2 = new View(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(0, a);
        layoutParams6.f2825q = 0;
        layoutParams6.f2827s = 0;
        layoutParams6.f2817i = R.id.hint;
        layoutParams6.topMargin = C51468a.m199486a(15);
        layoutParams6.setMarginStart(a3);
        view2.setLayoutParams(layoutParams6);
        view2.setBackgroundColor(a2);
        constraintLayout2.addView(view2);
        return constraintLayout;
    }
}
