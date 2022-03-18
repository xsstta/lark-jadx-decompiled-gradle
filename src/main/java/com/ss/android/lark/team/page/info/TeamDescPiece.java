package com.ss.android.lark.team.page.info;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.common.piece.SettingBasePiece;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\bJ\b\u0010\u001a\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/team/page/info/TeamDescPiece;", "Lcom/ss/android/lark/team/common/piece/SettingBasePiece;", "()V", "arrowVisible", "", "rightArrow", "Landroid/widget/ImageView;", "subtitleStr", "", "subtitleView", "Landroid/widget/TextView;", "teamChangeObserver", "com/ss/android/lark/team/page/info/TeamDescPiece$teamChangeObserver$1", "Lcom/ss/android/lark/team/page/info/TeamDescPiece$teamChangeObserver$1;", "titleStr", "titleView", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onCreate", "", "subtitle", "title", "updateTitleView", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public class TeamDescPiece extends SettingBasePiece<TeamDescPiece> {

    /* renamed from: b */
    private TextView f137009b;

    /* renamed from: g */
    private TextView f137010g;

    /* renamed from: h */
    private ImageView f137011h;

    /* renamed from: i */
    private String f137012i;

    /* renamed from: j */
    private String f137013j;

    /* renamed from: k */
    private boolean f137014k = true;

    /* renamed from: l */
    private final C55492a f137015l = new C55492a(this, true);

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("intent_team", this.f137015l);
    }

    /* renamed from: a */
    private final void m215283a() {
        boolean z;
        int a = C57582a.m223600a(16);
        TextView textView = this.f137009b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
        }
        layoutParams2.setMarginStart(a);
        layoutParams2.setMarginEnd(C51468a.m199486a(8));
        layoutParams2.f2833y = a;
        layoutParams2.f2816h = 0;
        layoutParams2.f2825q = 0;
        layoutParams2.f2826r = R.id.setting_jump_hint;
        String str = this.f137013j;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            layoutParams2.topMargin = 0;
            layoutParams2.f2819k = 0;
        } else {
            layoutParams2.topMargin = a;
            layoutParams2.f2819k = -1;
        }
        textView.setLayoutParams(layoutParams2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/info/TeamDescPiece$teamChangeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/Team;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.info.TeamDescPiece$a */
    public static final class C55492a extends DataObserver<Team> {

        /* renamed from: a */
        final /* synthetic */ TeamDescPiece f137016a;

        /* renamed from: a */
        public void mo127664a(Team team) {
            if (team != null) {
                TeamDescPiece teamDescPiece = this.f137016a;
                String description = team.getDescription();
                Intrinsics.checkExpressionValueIsNotNull(description, "it.description");
                teamDescPiece.mo189330b(description);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55492a(TeamDescPiece teamDescPiece, boolean z) {
            super(z);
            this.f137016a = teamDescPiece;
        }
    }

    /* renamed from: a */
    public final TeamDescPiece mo189329a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        TeamDescPiece teamDescPiece = this;
        teamDescPiece.f137012i = str;
        if (teamDescPiece.mo177206t()) {
            TextView textView = teamDescPiece.f137009b;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            textView.setText(teamDescPiece.f137012i);
        }
        return teamDescPiece;
    }

    /* renamed from: b */
    public final TeamDescPiece mo189330b(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "subtitle");
        TeamDescPiece teamDescPiece = this;
        teamDescPiece.f137013j = str;
        if (teamDescPiece.mo177206t()) {
            TextView textView = teamDescPiece.f137010g;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subtitleView");
            }
            textView.setText(teamDescPiece.f137013j);
            TextView textView2 = teamDescPiece.f137010g;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subtitleView");
            }
            String str2 = teamDescPiece.f137013j;
            int i = 0;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            textView2.setVisibility(i);
            teamDescPiece.m215283a();
        }
        return teamDescPiece;
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View a = super.mo127619a(context, marginLayoutParams);
        if (a != null) {
            ViewGroup viewGroup = (ViewGroup) a;
            marginLayoutParams.height = -2;
            int a2 = C51468a.m199486a(16);
            TextView textView = new TextView(viewGroup.getContext());
            int i2 = 0;
            textView.setLayoutParams(new ConstraintLayout.LayoutParams(0, -2));
            textView.setTextSize(16.0f);
            textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
            textView.setText(this.f137012i);
            textView.setGravity(8388611);
            textView.setSingleLine();
            boolean z = true;
            textView.setMaxLines(1);
            textView.setLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setId(R.id.setting_jump_title);
            this.f137009b = textView;
            viewGroup.addView(textView);
            m215283a();
            TextView textView2 = new TextView(viewGroup.getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
            layoutParams.setMarginStart(a2);
            layoutParams.setMarginEnd(a2);
            layoutParams.f2817i = R.id.setting_jump_title;
            layoutParams.f2825q = 0;
            layoutParams.f2827s = 0;
            layoutParams.topMargin = C51468a.m199486a(4);
            textView2.setLayoutParams(layoutParams);
            textView2.setTextSize(14.0f);
            textView2.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
            textView2.setText(this.f137013j);
            textView2.setMinLines(1);
            String str = this.f137013j;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
            textView2.setId(R.id.setting_jump_subtitle);
            this.f137010g = textView2;
            viewGroup.addView(textView2);
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, C51468a.m199486a(17));
            layoutParams2.f2825q = 0;
            layoutParams2.f2827s = 0;
            layoutParams2.f2817i = R.id.setting_jump_subtitle;
            viewGroup.addView(new Space(context), layoutParams2);
            ImageView imageView = new ImageView(viewGroup.getContext());
            ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(a2, a2);
            layoutParams3.setMarginEnd(a2);
            layoutParams3.f2816h = R.id.setting_jump_title;
            layoutParams3.f2819k = R.id.setting_jump_title;
            layoutParams3.f2827s = 0;
            imageView.setLayoutParams(layoutParams3);
            imageView.setImageDrawable(C51468a.m199489a((int) R.drawable.ud_icon_right_outlined, context, (int) R.color.icon_n3));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setId(R.id.setting_jump_arrow);
            if (!this.f137014k) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            this.f137011h = imageView;
            viewGroup.addView(imageView);
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
