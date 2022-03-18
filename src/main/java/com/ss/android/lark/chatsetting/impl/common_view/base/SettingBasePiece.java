package com.ss.android.lark.chatsetting.impl.common_view.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001DB\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u000fH\u0004J\n\u0010+\u001a\u0004\u0018\u00010\rH\u0002J\n\u0010,\u001a\u0004\u0018\u00010\u0013H\u0014J\u0006\u0010-\u001a\u00020 J\u0018\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0019H\u0014J\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010\u001f\u001a\u00020 H\u0014J\u0013\u0010\u001f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020 ¢\u0006\u0002\u00104J\u0015\u00105\u001a\u00028\u00002\b\u00105\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u00106J\b\u00107\u001a\u00020)H\u0016J\b\u00108\u001a\u00020)H\u0016J\b\u00109\u001a\u00020)H\u0014J\u0010\u0010:\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u00010\rJ\u0013\u0010\"\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0002\u0010'J\"\u0010<\u001a\u00020)2\b\u0010=\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u000fH\u0002J\u0010\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\u0019H\u0014J\u0018\u0010@\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0004J\u0010\u0010A\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u0019H\u0004J\u001a\u0010B\u001a\u00020)2\b\u0010C\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000b¨\u0006E"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece;", "T", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "bottomDivider", "Landroid/view/View;", "bottomDividerType", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/DividerType;", "getBottomDividerType", "()Lcom/ss/android/lark/chatsetting/impl/common_view/base/DividerType;", "setBottomDividerType", "(Lcom/ss/android/lark/chatsetting/impl/common_view/base/DividerType;)V", "callback", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece$Callback;", "containerHeightDp", "", "containerHeightType", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/ContainerHeightType;", "contentViewClickListener", "Landroid/view/View$OnClickListener;", "getContentViewClickListener", "()Landroid/view/View$OnClickListener;", "setContentViewClickListener", "(Landroid/view/View$OnClickListener;)V", "isEnable", "", "()Z", "setEnable", "(Z)V", "isFirstAddMask", "isVisible", "itemType", "", "mask", "topDivider", "topDividerType", "getTopDividerType", "setTopDividerType", ShareHitPoint.f121869d, "(Lcom/ss/android/lark/chatsetting/impl/common_view/base/DividerType;)Ljava/lang/Object;", "containerHeight", "", "newHeightDp", "getCallback", "getContentClickListener", "getItemType", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "isDefaultVisible", "(I)Ljava/lang/Object;", "onClickListener", "(Landroid/view/View$OnClickListener;)Ljava/lang/Object;", "onCreate", "onDestroy", "registerShareData", "setCallback", "cb", "updateContainerHeight", "containerView", "updateContentViewEnable", "isEnableState", "updateContentViewState", "updateContentViewVisible", "updateDividerType", "dividerView", "Callback", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class SettingBasePiece<T> extends Piece<T> {

    /* renamed from: a */
    private View f89142a;

    /* renamed from: b */
    private View f89143b;

    /* renamed from: g */
    private View f89144g;

    /* renamed from: h */
    private DividerType f89145h = DividerType.HIDDEN;

    /* renamed from: i */
    private DividerType f89146i = DividerType.HIDDEN;

    /* renamed from: j */
    private float f89147j = 54.0f;

    /* renamed from: k */
    private ContainerHeightType f89148k = ContainerHeightType.WRAP_HEIGHT;

    /* renamed from: l */
    private int f89149l = mo127635f();

    /* renamed from: m */
    private View.OnClickListener f89150m = mo127636g();

    /* renamed from: n */
    private Callback f89151n;

    /* renamed from: o */
    private boolean f89152o = true;

    /* renamed from: p */
    private boolean f89153p = mo127633d();

    /* renamed from: q */
    private boolean f89154q = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece$Callback;", "", "invalidateStyle", "", "piece", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece$a */
    public interface Callback {
        /* renamed from: a */
        void mo127641a(SettingBasePiece<?> settingBasePiece);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo127633d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo127634e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo127635f() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public View.OnClickListener mo127636g() {
        return null;
    }

    /* renamed from: j */
    private final Callback mo127642j() {
        return this.f89151n;
    }

    /* renamed from: a */
    public final DividerType mo127622a() {
        return this.f89145h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View.OnClickListener mo127629b() {
        return this.f89150m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo127632c() {
        return this.f89152o;
    }

    /* renamed from: h */
    public final int mo127637h() {
        return this.f89149l;
    }

    /* renamed from: i */
    public final boolean mo127638i() {
        return this.f89153p;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo127634e();
    }

    /* renamed from: a */
    public final T mo127623a(int i) {
        this.f89149l = i;
        return mo177210x();
    }

    /* renamed from: a */
    public final void mo127626a(Callback aVar) {
        this.f89151n = aVar;
    }

    /* renamed from: a */
    public final T mo127624a(DividerType dividerType) {
        Intrinsics.checkParameterIsNotNull(dividerType, ShareHitPoint.f121869d);
        this.f89145h = dividerType;
        if (mo177206t()) {
            m134115a(this.f89142a, dividerType);
        }
        return mo177210x();
    }

    /* renamed from: b */
    public final T mo127630b(DividerType dividerType) {
        Intrinsics.checkParameterIsNotNull(dividerType, ShareHitPoint.f121869d);
        this.f89146i = dividerType;
        if (mo177206t()) {
            m134115a(this.f89143b, dividerType);
        }
        return mo177210x();
    }

    /* renamed from: b */
    public final void mo127631b(boolean z) {
        int i;
        if (this.f89153p != z) {
            if (mo177206t() || this.f89153p == z) {
                this.f89153p = z;
                View s = mo177205s();
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                s.setVisibility(i);
                Callback j = mo127642j();
                if (j != null) {
                    j.mo127641a(this);
                    return;
                }
                return;
            }
            this.f89153p = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo127627a(boolean z) {
        if (this.f89152o != z) {
            if (z) {
                this.f89152o = z;
                View view = this.f89144g;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else if (!this.f89154q || !(mo177205s() instanceof ConstraintLayout) || this.f89144g == null) {
                this.f89152o = z;
                View view2 = this.f89144g;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            } else {
                this.f89152o = z;
                View s = mo177205s();
                if (s != null) {
                    ((ConstraintLayout) s).addView(this.f89144g);
                    this.f89154q = false;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo127625a(ContainerHeightType containerHeightType, float f) {
        Intrinsics.checkParameterIsNotNull(containerHeightType, ShareHitPoint.f121869d);
        this.f89148k = containerHeightType;
        this.f89147j = f;
        if (mo177206t()) {
            m134114a(mo177205s(), containerHeightType, f);
        }
    }

    /* renamed from: a */
    private final void m134115a(View view, DividerType dividerType) {
        if (view != null) {
            int i = C34532a.f89179a[dividerType.ordinal()];
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
                        marginLayoutParams3.setMarginStart(C51468a.m199486a(16));
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
        if (this.f89153p) {
            i = 0;
        } else {
            i = 8;
        }
        mo177194b(i);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        marginLayoutParams.width = -1;
        ConstraintLayout constraintLayout2 = constraintLayout;
        m134114a(constraintLayout2, this.f89148k, this.f89147j);
        int a = C51468a.m199485a(0.5f, context);
        int a2 = C51468a.m199487a((int) R.color.line_divider_default, context);
        ConstraintLayout constraintLayout3 = constraintLayout;
        View view = new View(constraintLayout3.getContext());
        view.setId(R.id.item_top_divider);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, a);
        layoutParams.f2816h = 0;
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(a2);
        m134115a(view, this.f89145h);
        this.f89142a = view;
        constraintLayout3.addView(view);
        View view2 = new View(constraintLayout3.getContext());
        view2.setId(R.id.item_bottom_divider);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, a);
        layoutParams2.f2819k = 0;
        layoutParams2.f2825q = 0;
        layoutParams2.f2827s = 0;
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(a2);
        m134115a(view2, this.f89146i);
        this.f89143b = view2;
        constraintLayout3.addView(view2);
        View view3 = new View(context);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, 0);
        layoutParams3.f2817i = R.id.item_top_divider;
        layoutParams3.f2818j = R.id.item_bottom_divider;
        layoutParams3.f2825q = 0;
        layoutParams3.f2827s = 0;
        view3.setLayoutParams(layoutParams3);
        view3.setBackgroundColor(C25653b.m91893a(C51468a.m199487a((int) R.color.bg_body, context), 0.5f));
        this.f89144g = view3;
        this.f89144g = view3;
        constraintLayout.setOnClickListener(this.f89150m);
        return constraintLayout2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo127628a(boolean z, boolean z2) {
        mo127631b(z);
        mo127627a(z2);
    }

    /* renamed from: a */
    private final void m134114a(View view, ContainerHeightType containerHeightType, float f) {
        if (view != null) {
            Context context = view.getContext();
            int i = C34532a.f89180b[containerHeightType.ordinal()];
            if (i == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    layoutParams.height = C51468a.m199485a(f, context);
                    view.setLayoutParams(layoutParams);
                }
            } else if (i == 2) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                }
                int i2 = (f > ((float) 0) ? 1 : (f == ((float) 0) ? 0 : -1));
                if (i2 > 0 && (view instanceof ConstraintLayout)) {
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    ((ConstraintLayout) view).setMinHeight(C51468a.m199485a(f, context));
                } else if (i2 > 0) {
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    view.setMinimumHeight(C51468a.m199485a(f, context));
                }
            }
        }
    }
}
