package com.ss.android.lark.team.page.setting;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2737f.C55443e;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0010\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\nJ\b\u0010#\u001a\u00020$H\u0016J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u001a\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/team/page/setting/TeamInfoPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "avatar", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "bottomDivider", "Landroid/view/View;", "bottomDividerType", "Lcom/ss/android/lark/team/common/DividerType;", "contentViewClickListener", "Landroid/view/View$OnClickListener;", "desc", "Landroid/widget/TextView;", "name", "rightArrow", "teamChangeObserver", "com/ss/android/lark/team/page/setting/TeamInfoPiece$teamChangeObserver$1", "Lcom/ss/android/lark/team/page/setting/TeamInfoPiece$teamChangeObserver$1;", "topDivider", "topDividerType", "arrowVisible", "visible", "", ShareHitPoint.f121869d, "getDescText", "", "team", "Lcom/ss/android/lark/team/entity/Team;", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onClick", "onClickListener", "onCreate", "", "updateDividerType", "dividerView", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamInfoPiece extends Piece<TeamInfoPiece> {

    /* renamed from: i */
    public static final int f137215i = C57582a.m223600a(48);

    /* renamed from: j */
    public static final Companion f137216j = new Companion(null);

    /* renamed from: a */
    public LKUIRoundedImageView2 f137217a;

    /* renamed from: b */
    public TextView f137218b;

    /* renamed from: g */
    public TextView f137219g;

    /* renamed from: h */
    public View.OnClickListener f137220h;

    /* renamed from: k */
    private View f137221k;

    /* renamed from: l */
    private View f137222l;

    /* renamed from: m */
    private View f137223m;

    /* renamed from: n */
    private DividerType f137224n = DividerType.HIDDEN;

    /* renamed from: o */
    private DividerType f137225o = DividerType.HIDDEN;

    /* renamed from: p */
    private final C55623d f137226p = new C55623d(this, true);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/setting/TeamInfoPiece$Companion;", "", "()V", "SIZE_AVATAR", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamInfoPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("intent_team", this.f137226p);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/setting/TeamInfoPiece$getDescText$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamInfoPiece$b */
    public static final class C55621b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ int f137227a;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
        }

        C55621b(int i) {
            this.f137227a = i;
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            textPaint.setColor(this.f137227a);
        }
    }

    /* renamed from: a */
    public final TeamInfoPiece mo189568a(View.OnClickListener onClickListener) {
        TeamInfoPiece teamInfoPiece = this;
        teamInfoPiece.f137220h = onClickListener;
        return teamInfoPiece;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/team/page/setting/TeamInfoPiece$getView$1$7"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamInfoPiece$c */
    static final class View$OnClickListenerC55622c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamInfoPiece f137228a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f137229b;

        /* renamed from: c */
        final /* synthetic */ Context f137230c;

        View$OnClickListenerC55622c(TeamInfoPiece teamInfoPiece, ViewGroup.MarginLayoutParams marginLayoutParams, Context context) {
            this.f137228a = teamInfoPiece;
            this.f137229b = marginLayoutParams;
            this.f137230c = context;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f137228a.f137220h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m215525a(TeamInfoPiece teamInfoPiece) {
        TextView textView = teamInfoPiece.f137218b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m215527b(TeamInfoPiece teamInfoPiece) {
        TextView textView = teamInfoPiece.f137219g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("desc");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ LKUIRoundedImageView2 m215528c(TeamInfoPiece teamInfoPiece) {
        LKUIRoundedImageView2 lKUIRoundedImageView2 = teamInfoPiece.f137217a;
        if (lKUIRoundedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
        }
        return lKUIRoundedImageView2;
    }

    /* renamed from: a */
    public final TeamInfoPiece mo189569a(DividerType dividerType) {
        Intrinsics.checkParameterIsNotNull(dividerType, ShareHitPoint.f121869d);
        TeamInfoPiece teamInfoPiece = this;
        teamInfoPiece.f137224n = dividerType;
        if (teamInfoPiece.mo177206t()) {
            View view = teamInfoPiece.f137221k;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topDivider");
            }
            teamInfoPiece.m215526a(view, dividerType);
        }
        return teamInfoPiece;
    }

    /* renamed from: b */
    public final TeamInfoPiece mo189572b(DividerType dividerType) {
        Intrinsics.checkParameterIsNotNull(dividerType, ShareHitPoint.f121869d);
        TeamInfoPiece teamInfoPiece = this;
        teamInfoPiece.f137225o = dividerType;
        if (teamInfoPiece.mo177206t()) {
            View view = teamInfoPiece.f137222l;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomDivider");
            }
            teamInfoPiece.m215526a(view, dividerType);
        }
        return teamInfoPiece;
    }

    /* renamed from: a */
    public final TeamInfoPiece mo189570a(boolean z) {
        int i;
        TeamInfoPiece teamInfoPiece = this;
        if (teamInfoPiece.mo177206t()) {
            View view = teamInfoPiece.f137223m;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rightArrow");
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        return teamInfoPiece;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/setting/TeamInfoPiece$teamChangeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/Team;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamInfoPiece$d */
    public static final class C55623d extends DataObserver<Team> {

        /* renamed from: a */
        final /* synthetic */ TeamInfoPiece f137231a;

        /* renamed from: a */
        public void mo127664a(Team team) {
            int i;
            if (team != null) {
                TeamInfoPiece.m215525a(this.f137231a).setText(team.getName());
                CharSequence a = this.f137231a.mo189571a(team);
                TeamInfoPiece.m215527b(this.f137231a).setText(a);
                TextView b = TeamInfoPiece.m215527b(this.f137231a);
                if (StringsKt.isBlank(a)) {
                    i = 8;
                } else {
                    i = 0;
                }
                b.setVisibility(i);
                ITeamModuleDependency.IImageDependency a2 = C55356a.m214819a().mo144121a();
                Context context = TeamInfoPiece.m215528c(this.f137231a).getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "avatar.context");
                String avatarKey = team.getAvatarKey();
                Intrinsics.checkExpressionValueIsNotNull(avatarKey, "it.avatarKey");
                a2.mo144129a(context, avatarKey, String.valueOf(team.getId()), TeamInfoPiece.m215528c(this.f137231a), TeamInfoPiece.f137215i, TeamInfoPiece.f137215i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55623d(TeamInfoPiece teamInfoPiece, boolean z) {
            super(z);
            this.f137231a = teamInfoPiece;
        }
    }

    /* renamed from: a */
    public final CharSequence mo189571a(Team team) {
        String description = team.getDescription();
        if (description != null) {
            String str = description;
            if (!StringsKt.isBlank(str)) {
                return str;
            }
        }
        if (!C55443e.m215116a(team)) {
            return "";
        }
        int a = C51468a.m199487a((int) R.color.text_link_normal, mo177180C());
        SpannableString spannableString = new SpannableString(C51468a.m199493c(R.string.Project_MV_EditTeamInfo, mo177180C()));
        spannableString.setSpan(new C55621b(a), 0, spannableString.length(), 17);
        return spannableString;
    }

    /* renamed from: a */
    private final void m215526a(View view, DividerType dividerType) {
        if (view != null) {
            int i = C55635a.f137252a[dividerType.ordinal()];
            if (i != 1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = null;
                if (i == 2) {
                    view.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = layoutParams;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.setMarginStart(0);
                        view.setLayoutParams(marginLayoutParams2);
                    }
                } else if (i == 3) {
                    view.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = layoutParams2;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) marginLayoutParams;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.setMarginStart(C57582a.m223600a(16));
                        view.setLayoutParams(marginLayoutParams3);
                    }
                }
            } else {
                view.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        marginLayoutParams.width = -1;
        marginLayoutParams.height = C51468a.m199486a(80);
        constraintLayout.setBackground(C51468a.m199492b(R.drawable.item_bg_selector_c11, context));
        int a = C51468a.m199485a(0.5f, context);
        int a2 = C51468a.m199487a((int) R.color.line_divider_default, context);
        ConstraintLayout constraintLayout2 = constraintLayout;
        View view = new View(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, a);
        layoutParams.f2816h = 0;
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(a2);
        m215526a(view, this.f137224n);
        this.f137221k = view;
        constraintLayout2.addView(view);
        View view2 = new View(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, a);
        layoutParams2.f2819k = 0;
        layoutParams2.f2825q = 0;
        layoutParams2.f2827s = 0;
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(a2);
        m215526a(view2, this.f137225o);
        this.f137222l = view2;
        constraintLayout2.addView(view2);
        int a3 = C51468a.m199486a(16);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(context, null, 0, 6, null);
        lKUIRoundedImageView2.setId(R.id.avatar);
        int a4 = C51468a.m199486a(48);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(a4, a4);
        layoutParams3.f2816h = 0;
        layoutParams3.f2819k = 0;
        layoutParams3.f2825q = 0;
        layoutParams3.setMarginStart(a3);
        lKUIRoundedImageView2.setLayoutParams(layoutParams3);
        lKUIRoundedImageView2.setOval(true);
        lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        constraintLayout.addView(lKUIRoundedImageView2);
        this.f137217a = lKUIRoundedImageView2;
        TextView textView = new TextView(constraintLayout2.getContext());
        textView.setId(R.id.team_name);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams4.f2824p = R.id.avatar;
        layoutParams4.f2826r = R.id.right_arrow;
        layoutParams4.f2816h = R.id.avatar;
        layoutParams4.f2818j = R.id.team_desc;
        layoutParams4.setMarginEnd(C51468a.m199486a(8));
        layoutParams4.setMarginStart(C51468a.m199486a(10));
        layoutParams4.f2790H = 2;
        textView.setLayoutParams(layoutParams4);
        textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
        textView.setTextSize(17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f137218b = textView;
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(constraintLayout2.getContext());
        textView2.setId(R.id.team_desc);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams5.f2825q = R.id.team_name;
        layoutParams5.f2827s = R.id.team_name;
        layoutParams5.f2817i = R.id.team_name;
        layoutParams5.f2819k = R.id.avatar;
        textView2.setLayoutParams(layoutParams5);
        textView2.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
        textView2.setTextSize(14.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        this.f137219g = textView2;
        constraintLayout2.addView(textView2);
        ImageView imageView = new ImageView(constraintLayout2.getContext());
        imageView.setId(R.id.right_arrow);
        int a5 = C51468a.m199486a(16);
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(a5, a5);
        layoutParams6.f2816h = 0;
        layoutParams6.f2819k = 0;
        layoutParams6.f2827s = 0;
        layoutParams6.setMarginEnd(a3);
        imageView.setLayoutParams(layoutParams6);
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_right_outlined, C51468a.m199487a((int) R.color.icon_n3, context)));
        ImageView imageView2 = imageView;
        this.f137223m = imageView2;
        constraintLayout2.addView(imageView2);
        constraintLayout.setOnClickListener(new View$OnClickListenerC55622c(this, marginLayoutParams, context));
        return constraintLayout;
    }
}
