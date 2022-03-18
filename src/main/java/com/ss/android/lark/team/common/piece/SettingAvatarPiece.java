package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u000f\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\nJ\b\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u001a\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/team/common/piece/SettingAvatarPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "avatarView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "bottomDivider", "Landroid/view/View;", "bottomDividerType", "Lcom/ss/android/lark/team/common/DividerType;", "contentViewClickListener", "Landroid/view/View$OnClickListener;", "rightArrow", "showRightArrow", "", "teamChangeObserver", "com/ss/android/lark/team/common/piece/SettingAvatarPiece$teamChangeObserver$1", "Lcom/ss/android/lark/team/common/piece/SettingAvatarPiece$teamChangeObserver$1;", "titleContent", "", "titleView", "Landroid/widget/TextView;", "topDivider", "topDividerType", ShareHitPoint.f121869d, "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onClick", "listener", "onCreate", "", "show", "title", "updateDividerType", "dividerView", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingAvatarPiece extends Piece<SettingAvatarPiece> {

    /* renamed from: g */
    public static final int f136715g = C57582a.m223600a(48);

    /* renamed from: h */
    public static final Companion f136716h = new Companion(null);

    /* renamed from: a */
    public LKUIRoundedImageView2 f136717a;

    /* renamed from: b */
    public View.OnClickListener f136718b;

    /* renamed from: i */
    private View f136719i;

    /* renamed from: j */
    private View f136720j;

    /* renamed from: k */
    private TextView f136721k;

    /* renamed from: l */
    private View f136722l;

    /* renamed from: m */
    private String f136723m = "";

    /* renamed from: n */
    private DividerType f136724n = DividerType.HIDDEN;

    /* renamed from: o */
    private DividerType f136725o = DividerType.HIDDEN;

    /* renamed from: p */
    private boolean f136726p = true;

    /* renamed from: q */
    private final C55382c f136727q = new C55382c(this, true);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/common/piece/SettingAvatarPiece$Companion;", "", "()V", "SIZE_AVATAR", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.SettingAvatarPiece$a */
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
        mo177190a("intent_team", this.f136727q);
    }

    /* renamed from: a */
    public final SettingAvatarPiece mo188996a(View.OnClickListener onClickListener) {
        SettingAvatarPiece settingAvatarPiece = this;
        settingAvatarPiece.f136718b = onClickListener;
        return settingAvatarPiece;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/team/common/piece/SettingAvatarPiece$getView$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.SettingAvatarPiece$b */
    static final class View$OnClickListenerC55381b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingAvatarPiece f136728a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f136729b;

        /* renamed from: c */
        final /* synthetic */ Context f136730c;

        View$OnClickListenerC55381b(SettingAvatarPiece settingAvatarPiece, ViewGroup.MarginLayoutParams marginLayoutParams, Context context) {
            this.f136728a = settingAvatarPiece;
            this.f136729b = marginLayoutParams;
            this.f136730c = context;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f136728a.f136718b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LKUIRoundedImageView2 m214933a(SettingAvatarPiece settingAvatarPiece) {
        LKUIRoundedImageView2 lKUIRoundedImageView2 = settingAvatarPiece.f136717a;
        if (lKUIRoundedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        }
        return lKUIRoundedImageView2;
    }

    /* renamed from: a */
    public final SettingAvatarPiece mo188997a(DividerType dividerType) {
        Intrinsics.checkParameterIsNotNull(dividerType, ShareHitPoint.f121869d);
        SettingAvatarPiece settingAvatarPiece = this;
        settingAvatarPiece.f136724n = dividerType;
        if (settingAvatarPiece.mo177206t()) {
            View view = settingAvatarPiece.f136719i;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topDivider");
            }
            settingAvatarPiece.m214934a(view, dividerType);
        }
        return settingAvatarPiece;
    }

    /* renamed from: b */
    public final SettingAvatarPiece mo188999b(DividerType dividerType) {
        Intrinsics.checkParameterIsNotNull(dividerType, ShareHitPoint.f121869d);
        SettingAvatarPiece settingAvatarPiece = this;
        settingAvatarPiece.f136725o = dividerType;
        if (settingAvatarPiece.mo177206t()) {
            View view = settingAvatarPiece.f136720j;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomDivider");
            }
            settingAvatarPiece.m214934a(view, dividerType);
        }
        return settingAvatarPiece;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/common/piece/SettingAvatarPiece$teamChangeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/Team;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.SettingAvatarPiece$c */
    public static final class C55382c extends DataObserver<Team> {

        /* renamed from: a */
        final /* synthetic */ SettingAvatarPiece f136731a;

        /* renamed from: a */
        public void mo127664a(Team team) {
            if (team != null) {
                ITeamModuleDependency.IImageDependency a = C55356a.m214819a().mo144121a();
                Context context = SettingAvatarPiece.m214933a(this.f136731a).getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "avatarView.context");
                String avatarKey = team.getAvatarKey();
                Intrinsics.checkExpressionValueIsNotNull(avatarKey, "it.avatarKey");
                a.mo144129a(context, avatarKey, String.valueOf(team.getId()), SettingAvatarPiece.m214933a(this.f136731a), SettingAvatarPiece.f136715g, SettingAvatarPiece.f136715g);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55382c(SettingAvatarPiece settingAvatarPiece, boolean z) {
            super(z);
            this.f136731a = settingAvatarPiece;
        }
    }

    /* renamed from: a */
    public final SettingAvatarPiece mo188998a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        SettingAvatarPiece settingAvatarPiece = this;
        settingAvatarPiece.f136723m = str;
        if (settingAvatarPiece.mo177206t()) {
            TextView textView = settingAvatarPiece.f136721k;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            textView.setText(settingAvatarPiece.f136723m);
        }
        return settingAvatarPiece;
    }

    /* renamed from: a */
    private final void m214934a(View view, DividerType dividerType) {
        if (view != null) {
            int i = C55400c.f136807a[dividerType.ordinal()];
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
        int i;
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
        m214934a(view, this.f136724n);
        this.f136719i = view;
        constraintLayout2.addView(view);
        View view2 = new View(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, a);
        layoutParams2.f2819k = 0;
        layoutParams2.f2825q = 0;
        layoutParams2.f2827s = 0;
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(a2);
        m214934a(view2, this.f136725o);
        this.f136720j = view2;
        constraintLayout2.addView(view2);
        int a3 = C51468a.m199486a(16);
        ImageView imageView = new ImageView(constraintLayout2.getContext());
        imageView.setId(R.id.right_arrow);
        int a4 = C51468a.m199486a(16);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(a4, a4);
        layoutParams3.f2816h = 0;
        layoutParams3.f2819k = 0;
        layoutParams3.f2827s = 0;
        layoutParams3.setMarginEnd(a3);
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageDrawable(C51468a.m199489a((int) R.drawable.ud_icon_right_outlined, context, (int) R.color.icon_n3));
        if (this.f136726p) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = imageView;
        this.f136722l = imageView2;
        constraintLayout2.addView(imageView2);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(context, null, 0, 6, null);
        lKUIRoundedImageView2.setId(R.id.avatar);
        int a5 = C51468a.m199486a(48);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(a5, a5);
        layoutParams4.f2816h = 0;
        layoutParams4.f2819k = 0;
        layoutParams4.f2826r = R.id.right_arrow;
        layoutParams4.setMarginEnd(C51468a.m199486a(8));
        int i2 = layoutParams4.f2833y;
        lKUIRoundedImageView2.setLayoutParams(layoutParams4);
        lKUIRoundedImageView2.setOval(true);
        lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        constraintLayout.addView(lKUIRoundedImageView2);
        this.f136717a = lKUIRoundedImageView2;
        TextView textView = new TextView(constraintLayout2.getContext());
        textView.setId(R.id.title);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams5.f2816h = 0;
        layoutParams5.f2819k = 0;
        layoutParams5.f2825q = 0;
        layoutParams5.f2826r = R.id.avatar;
        layoutParams5.setMarginStart(a3);
        layoutParams5.setMarginEnd(a3);
        textView.setLayoutParams(layoutParams5);
        textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
        textView.setTextSize(16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(16);
        textView.setText(this.f136723m);
        this.f136721k = textView;
        constraintLayout2.addView(textView);
        constraintLayout.setOnClickListener(new View$OnClickListenerC55381b(this, marginLayoutParams, context));
        return constraintLayout;
    }
}
