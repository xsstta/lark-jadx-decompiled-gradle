package com.ss.android.lark.chatsetting.impl.common_view.base;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.ttve.utils.C60275a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rJ\b\u0010\"\u001a\u00020\u0004H\u0014J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\rJ\b\u0010$\u001a\u00020\u0004H\u0014J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\rJ\b\u0010&\u001a\u00020\u0004H\u0014J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J6\u0010)\u001a\u00020(2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u000e\u0010\u0017\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingNavigationPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece;", "()V", "arrowSize", "", "arrowVisibility", "redDotSize", "redDotView", "Landroid/view/View;", "redDotVisibility", "rightArrow", "Landroid/widget/ImageView;", "statusStr", "", "getStatusStr", "()Ljava/lang/String;", "setStatusStr", "(Ljava/lang/String;)V", "statusView", "Landroid/widget/TextView;", "subtitleStr", "getSubtitleStr", "setSubtitleStr", "subtitleView", "titleStr", "titleView", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "redDotVisible", "visibility", UpdateKey.STATUS, "statusRes", "subtitle", "subtitleRes", "title", "titleRes", "updateViewLayout", "", "updateViewProperty", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SettingNavigationPiece extends SettingBasePiece<SettingNavigationPiece> {

    /* renamed from: a */
    private TextView f89155a;

    /* renamed from: b */
    private TextView f89156b;

    /* renamed from: g */
    private TextView f89157g;

    /* renamed from: h */
    private ImageView f89158h;

    /* renamed from: i */
    private View f89159i;

    /* renamed from: j */
    private String f89160j;

    /* renamed from: k */
    private String f89161k;

    /* renamed from: l */
    private String f89162l;

    /* renamed from: m */
    private int f89163m;

    /* renamed from: n */
    private int f89164n = 8;

    /* renamed from: o */
    private int f89165o;

    /* renamed from: p */
    private int f89166p;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo127642j() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo127645k() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo127646l() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chatsetting/impl/common_view/base/SettingNavigationPiece$getView$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece$a */
    static final class View$OnClickListenerC34529a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingNavigationPiece f89167a;

        /* renamed from: b */
        final /* synthetic */ Context f89168b;

        /* renamed from: c */
        final /* synthetic */ int f89169c;

        View$OnClickListenerC34529a(SettingNavigationPiece settingNavigationPiece, Context context, int i) {
            this.f89167a = settingNavigationPiece;
            this.f89168b = context;
            this.f89169c = i;
        }

        public final void onClick(View view) {
            View.OnClickListener b = this.f89167a.mo127629b();
            if (b != null) {
                b.onClick(view);
            }
        }
    }

    /* renamed from: a */
    private final void m134139a(Context context) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int a = C60275a.m234186a(context);
        int a2 = C51468a.m199486a(16);
        int a3 = C51468a.m199486a(4);
        int a4 = ((((a - a2) - a2) - this.f89165o) - C51468a.m199486a(6)) - C51468a.m199486a(8);
        TextView textView = this.f89155a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView.setText(this.f89160j);
        TextView textView2 = this.f89156b;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subtitleView");
        }
        String str = this.f89161k;
        boolean z7 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        textView2.setVisibility(i);
        TextView textView3 = this.f89156b;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subtitleView");
        }
        textView3.setText(this.f89161k);
        TextView textView4 = this.f89157g;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusView");
        }
        String str2 = this.f89162l;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView4.setVisibility(i2);
        TextView textView5 = this.f89157g;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusView");
        }
        textView5.setText(this.f89162l);
        View view = this.f89159i;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("redDotView");
        }
        view.setVisibility(this.f89164n);
        TextView textView6 = this.f89155a;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        ViewGroup.LayoutParams layoutParams = textView6.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = null;
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams3 == null) {
            layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        }
        layoutParams3.f2825q = 0;
        layoutParams3.f2816h = 0;
        layoutParams3.topMargin = a2;
        layoutParams3.setMarginStart(a2);
        String str3 = this.f89161k;
        if (str3 == null || str3.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            layoutParams3.f2819k = 0;
            layoutParams3.bottomMargin = a2;
        } else {
            layoutParams3.f2818j = R.id.item_jump_subtitle;
            layoutParams3.bottomMargin = 0;
        }
        TextView textView7 = this.f89157g;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusView");
        }
        ViewGroup.LayoutParams layoutParams4 = textView7.getLayoutParams();
        if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
            layoutParams2 = layoutParams4;
        }
        ConstraintLayout.LayoutParams layoutParams5 = layoutParams2;
        if (layoutParams5 == null) {
            layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
        }
        layoutParams5.f2816h = R.id.item_jump_arrow;
        layoutParams5.f2819k = R.id.item_jump_arrow;
        layoutParams5.f2826r = R.id.item_jump_arrow;
        layoutParams5.setMarginEnd(a3);
        String str4 = this.f89162l;
        if (str4 == null || str4.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || this.f89164n != 8) {
            String str5 = this.f89162l;
            if (str5 == null || str5.length() <= 0) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5 || this.f89164n != 8) {
                String str6 = this.f89162l;
                if (str6 == null || str6.length() == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6 || this.f89164n != 0) {
                    String str7 = this.f89162l;
                    if (str7 == null || str7.length() <= 0) {
                        z7 = false;
                    }
                    if (z7 && this.f89164n == 0) {
                        layoutParams3.width = -2;
                        layoutParams3.f2826r = -1;
                        TextView textView8 = this.f89155a;
                        if (textView8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("titleView");
                        }
                        if (this.f89163m == 8) {
                            TextView textView9 = this.f89157g;
                            if (textView9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("statusView");
                            }
                            i3 = textView9.getWidth();
                        } else {
                            a4 -= this.f89166p;
                            TextView textView10 = this.f89157g;
                            if (textView10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("statusView");
                            }
                            i3 = textView10.getWidth();
                        }
                        textView8.setMaxWidth((a4 - i3) - a3);
                        layoutParams5.f2824p = -1;
                        layoutParams5.width = -2;
                    }
                } else {
                    layoutParams3.width = -2;
                    layoutParams3.f2826r = -1;
                    TextView textView11 = this.f89155a;
                    if (textView11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleView");
                    }
                    if (this.f89163m != 8) {
                        a4 -= this.f89166p;
                    }
                    textView11.setMaxWidth(a4);
                }
            } else {
                layoutParams3.width = -2;
                layoutParams3.f2826r = -1;
                layoutParams3.setMarginEnd(0);
                String str8 = this.f89161k;
                if (!(str8 == null || str8.length() == 0)) {
                    z7 = false;
                }
                if (z7) {
                    layoutParams5.f2824p = R.id.item_jump_title;
                    layoutParams5.width = 0;
                } else {
                    layoutParams5.f2824p = -1;
                    layoutParams5.width = -2;
                }
                layoutParams5.setMarginStart(a3);
            }
        } else {
            layoutParams3.width = 0;
            layoutParams3.f2826r = R.id.item_jump_status;
            layoutParams3.setMarginEnd(a3);
        }
        TextView textView12 = this.f89155a;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView12.setLayoutParams(layoutParams3);
        TextView textView13 = this.f89157g;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusView");
        }
        textView13.setLayoutParams(layoutParams5);
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        String str4 = this.f89160j;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || mo127642j() == 0) {
            str = this.f89160j;
        } else {
            str = C51468a.m199493c(mo127642j(), context);
        }
        this.f89160j = str;
        String str5 = this.f89161k;
        if (str5 == null || str5.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || mo127645k() == 0) {
            str2 = this.f89161k;
        } else {
            str2 = C51468a.m199493c(mo127645k(), context);
        }
        this.f89161k = str2;
        String str6 = this.f89162l;
        if (str6 == null || str6.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || mo127646l() == 0) {
            str3 = this.f89162l;
        } else {
            str3 = C51468a.m199493c(mo127646l(), context);
        }
        this.f89162l = str3;
        int a = C51468a.m199486a(16);
        String str7 = this.f89161k;
        if (str7 == null || str7.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            mo127625a(ContainerHeightType.WRAP_HEIGHT, 54.0f);
        } else {
            mo127625a(ContainerHeightType.WRAP_HEIGHT, 76.0f);
        }
        View a2 = super.mo127619a(context, marginLayoutParams);
        if (a2 != null) {
            ViewGroup viewGroup = (ViewGroup) a2;
            viewGroup.setBackground(C51468a.m199492b(R.drawable.bg_setting_group_item_rectangle, context));
            TextView textView = new TextView(viewGroup.getContext());
            textView.setId(R.id.item_jump_title);
            textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
            textView.setTextSize(16.0f);
            textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
            textView.setText(this.f89160j);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f89155a = textView;
            viewGroup.addView(textView);
            View view = new View(viewGroup.getContext());
            view.setId(R.id.item_jump_red_dot);
            this.f89165o = C51468a.m199486a(8);
            int i = this.f89165o;
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(i, i);
            layoutParams.f2824p = R.id.item_jump_title;
            layoutParams.f2816h = R.id.item_jump_title;
            layoutParams.f2819k = R.id.item_jump_title;
            layoutParams.setMarginStart(C51468a.m199486a(6));
            layoutParams.setMarginEnd(C51468a.m199486a(8));
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(R.drawable.red_dot_bg);
            view.setVisibility(this.f89164n);
            this.f89159i = view;
            viewGroup.addView(view);
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setId(R.id.item_jump_status);
            textView2.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
            textView2.setTextSize(14.0f);
            textView2.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
            textView2.setText(this.f89162l);
            textView2.setGravity(8388613);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setMaxLines(1);
            this.f89157g = textView2;
            viewGroup.addView(textView2);
            ImageView imageView = new ImageView(viewGroup.getContext());
            this.f89166p = C51468a.m199486a(16);
            imageView.setId(R.id.item_jump_arrow);
            imageView.setImageDrawable(C51468a.m199489a((int) R.drawable.ud_icon_right_outlined, context, (int) R.color.icon_n3));
            int i2 = this.f89166p;
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(i2, i2);
            layoutParams2.f2816h = 0;
            layoutParams2.f2819k = 0;
            layoutParams2.f2827s = 0;
            layoutParams2.setMarginEnd(a);
            imageView.setLayoutParams(layoutParams2);
            imageView.setVisibility(this.f89163m);
            this.f89158h = imageView;
            viewGroup.addView(imageView);
            TextView textView3 = new TextView(viewGroup.getContext());
            textView3.setId(R.id.item_jump_subtitle);
            textView3.setText(this.f89161k);
            textView3.setTextSize(14.0f);
            textView3.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setMaxLines(3);
            ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, -2);
            layoutParams3.topMargin = C51468a.m199486a(2);
            layoutParams3.setMarginEnd(C51468a.m199486a(4));
            layoutParams3.setMarginStart(a);
            layoutParams3.bottomMargin = a;
            layoutParams3.f2825q = 0;
            layoutParams3.f2819k = 0;
            layoutParams3.f2826r = R.id.item_jump_status;
            textView3.setLayoutParams(layoutParams3);
            this.f89156b = textView3;
            viewGroup.addView(textView3);
            m134139a(context);
            viewGroup.setOnClickListener(new View$OnClickListenerC34529a(this, context, a));
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo127644a(String str, String str2, String str3, int i) {
        if (mo177206t()) {
            boolean z = false;
            boolean z2 = true;
            if (!Intrinsics.areEqual(str, this.f89160j)) {
                this.f89160j = str;
                z = true;
            }
            if (!Intrinsics.areEqual(str2, this.f89161k)) {
                this.f89161k = str2;
                z = true;
            }
            if (!Intrinsics.areEqual(str3, this.f89162l)) {
                this.f89162l = str3;
                z = true;
            }
            if (i != this.f89164n) {
                this.f89164n = i;
            } else {
                z2 = z;
            }
            if (mo177206t() && z2) {
                m134139a(mo177180C());
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m134140a(SettingNavigationPiece settingNavigationPiece, String str, String str2, String str3, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = settingNavigationPiece.f89160j;
            }
            if ((i2 & 2) != 0) {
                str2 = settingNavigationPiece.f89161k;
            }
            if ((i2 & 4) != 0) {
                str3 = settingNavigationPiece.f89162l;
            }
            if ((i2 & 8) != 0) {
                i = settingNavigationPiece.f89164n;
            }
            settingNavigationPiece.mo127644a(str, str2, str3, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateViewProperty");
    }
}
