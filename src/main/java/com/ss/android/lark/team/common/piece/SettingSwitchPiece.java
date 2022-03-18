package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\bJ\u001c\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\fJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/team/common/piece/SettingSwitchPiece;", "Lcom/ss/android/lark/team/common/piece/SettingBasePiece;", "Lcom/ss/android/lark/team/common/piece/SettingSwitchExport;", "()V", "isChecked", "", "isEnabled", "onCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "switchButton", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "titleContent", "", "titleView", "Landroid/widget/TextView;", "checkState", "enableState", "enable", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onCheck", "listener", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "title", "updateCheckState", "", "updateEnableState", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingSwitchPiece extends SettingBasePiece<SettingSwitchPiece> implements SettingSwitchExport {

    /* renamed from: b */
    public CompoundButton.OnCheckedChangeListener f136754b;

    /* renamed from: g */
    private TextView f136755g;

    /* renamed from: h */
    private UDSwitch f136756h;

    /* renamed from: i */
    private String f136757i = "";

    /* renamed from: j */
    private boolean f136758j;

    /* renamed from: k */
    private boolean f136759k = true;

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(SettingSwitchExport.class, this);
    }

    /* renamed from: b */
    public void mo189015b(boolean z) {
        mo189014a(z);
    }

    /* renamed from: a */
    public final SettingSwitchPiece mo189012a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        SettingSwitchPiece settingSwitchPiece = this;
        settingSwitchPiece.f136754b = onCheckedChangeListener;
        return settingSwitchPiece;
    }

    /* renamed from: a */
    public final SettingSwitchPiece mo189014a(boolean z) {
        SettingSwitchPiece settingSwitchPiece = this;
        settingSwitchPiece.f136758j = z;
        if (settingSwitchPiece.mo177206t()) {
            UDSwitch uDSwitch = settingSwitchPiece.f136756h;
            if (uDSwitch == null) {
                Intrinsics.throwUninitializedPropertyAccessException("switchButton");
            }
            uDSwitch.setChecked(z);
        }
        return settingSwitchPiece;
    }

    /* renamed from: a */
    public final SettingSwitchPiece mo189013a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        SettingSwitchPiece settingSwitchPiece = this;
        settingSwitchPiece.f136757i = str;
        if (settingSwitchPiece.mo177206t()) {
            TextView textView = settingSwitchPiece.f136755g;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            textView.setText(settingSwitchPiece.f136757i);
        }
        return settingSwitchPiece;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "com/ss/android/lark/team/common/piece/SettingSwitchPiece$getView$1$1$2", "com/ss/android/lark/team/common/piece/SettingSwitchPiece$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.SettingSwitchPiece$a */
    static final class C55384a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f136760a;

        /* renamed from: b */
        final /* synthetic */ int f136761b;

        /* renamed from: c */
        final /* synthetic */ SettingSwitchPiece f136762c;

        /* renamed from: d */
        final /* synthetic */ Context f136763d;

        C55384a(ViewGroup viewGroup, int i, SettingSwitchPiece settingSwitchPiece, Context context) {
            this.f136760a = viewGroup;
            this.f136761b = i;
            this.f136762c = settingSwitchPiece;
            this.f136763d = context;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f136762c.f136754b;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View a = super.mo127619a(context, marginLayoutParams);
        if (a != null) {
            ViewGroup viewGroup = (ViewGroup) a;
            int a2 = C51468a.m199486a(16);
            UDSwitch uDSwitch = new UDSwitch(context);
            uDSwitch.setId(R.id.switch_button);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2816h = 0;
            layoutParams.f2819k = 0;
            layoutParams.f2827s = 0;
            layoutParams.setMarginEnd(a2);
            uDSwitch.setLayoutParams(layoutParams);
            uDSwitch.setEnabled(this.f136759k);
            uDSwitch.setChecked(this.f136758j);
            uDSwitch.setOnCheckedChangeListener(new C55384a(viewGroup, a2, this, context));
            this.f136756h = uDSwitch;
            viewGroup.addView(uDSwitch);
            TextView textView = new TextView(viewGroup.getContext());
            textView.setId(R.id.title);
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, 0);
            layoutParams2.f2816h = 0;
            layoutParams2.f2819k = 0;
            layoutParams2.f2825q = 0;
            layoutParams2.f2826r = R.id.switch_button;
            layoutParams2.setMarginStart(a2);
            layoutParams2.setMarginEnd(a2);
            textView.setLayoutParams(layoutParams2);
            textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
            textView.setTextSize(16.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity(16);
            textView.setText(this.f136757i);
            this.f136755g = textView;
            viewGroup.addView(textView);
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
