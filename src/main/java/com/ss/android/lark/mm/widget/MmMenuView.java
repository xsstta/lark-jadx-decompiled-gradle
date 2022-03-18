package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.detail.menu.MmMenu;
import com.ss.android.lark.mm.module.detail.menu.OnInitMenuListener;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\"\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\t¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmMenuView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bindData", "", "menu", "Lcom/ss/android/lark/mm/module/detail/menu/MmMenu;", "isLastPosition", "", ShareHitPoint.f121868c, "", "init", "setSubTitle", "resId", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmMenuView extends RelativeLayout {

    /* renamed from: a */
    public static final Companion f118752a = new Companion(null);

    /* renamed from: b */
    private HashMap f118753b;

    /* renamed from: a */
    public View mo165616a(int i) {
        if (this.f118753b == null) {
            this.f118753b = new HashMap();
        }
        View view = (View) this.f118753b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118753b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmMenuView$Companion;", "", "()V", "DETAIL_MENU", "", "RECORD_MENU", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmMenuView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmMenuView$c */
    static final class View$OnClickListenerC47136c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmMenuView f118756a;

        /* renamed from: b */
        final /* synthetic */ MmMenu f118757b;

        View$OnClickListenerC47136c(MmMenuView mmMenuView, MmMenu cVar) {
            this.f118756a = mmMenuView;
            this.f118757b = cVar;
        }

        public final void onClick(View view) {
            this.f118757b.mo162001h().invoke(this.f118756a, null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmMenuView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setSubTitle(int i) {
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo165616a(R.id.tvSubTitle);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "tvSubTitle");
        lineHeightTextView.setVisibility(0);
        ((LineHeightTextView) mo165616a(R.id.tvSubTitle)).setText(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmMenuView$b */
    static final class View$OnClickListenerC47135b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmMenuView f118754a;

        /* renamed from: b */
        final /* synthetic */ MmMenu f118755b;

        View$OnClickListenerC47135b(MmMenuView mmMenuView, MmMenu cVar) {
            this.f118754a = mmMenuView;
            this.f118755b = cVar;
        }

        public final void onClick(View view) {
            C45855f.m181664c("MmMenuView", "click ivSwitch");
            Function2<MmMenuView, Boolean, Unit> h = this.f118755b.mo162001h();
            MmMenuView mmMenuView = this.f118754a;
            UDSwitch uDSwitch = (UDSwitch) mmMenuView.mo165616a(R.id.ivSwitch);
            Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "ivSwitch");
            h.invoke(mmMenuView, Boolean.valueOf(uDSwitch.isChecked()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186654a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_more_menu, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmMenuView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165617a(MmMenu cVar, boolean z, String str) {
        int i;
        Drawable drawable;
        int i2;
        Intrinsics.checkParameterIsNotNull(cVar, "menu");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo165616a(R.id.tvSubTitle);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "tvSubTitle");
        int i3 = 8;
        lineHeightTextView.setVisibility(8);
        OnInitMenuListener f = cVar.mo161999f();
        if (f != null) {
            f.mo161966a(this);
        }
        if (cVar.mo161996d()) {
            OnInitMenuListener f2 = cVar.mo161999f();
            if (f2 != null) {
                f2.mo161966a(this);
            }
            UDSwitch uDSwitch = (UDSwitch) mo165616a(R.id.ivSwitch);
            Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "ivSwitch");
            uDSwitch.setChecked(cVar.mo161997e());
            ((UDSwitch) mo165616a(R.id.ivSwitch)).setOnClickListener(new View$OnClickListenerC47135b(this, cVar));
        } else {
            setOnClickListener(new View$OnClickListenerC47136c(this, cVar));
        }
        LineHeightTextView lineHeightTextView2 = (LineHeightTextView) mo165616a(R.id.tvTitle);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (!cVar.mo162000g()) {
            i = R.color.text_title;
        } else {
            i = R.color.text_disable;
        }
        lineHeightTextView2.setTextColor(UDColorUtils.getColor(context, i));
        if (Intrinsics.areEqual(str, "detail_menu")) {
            View a = mo165616a(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(a, "divider");
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            a.setVisibility(i2);
        } else if (Intrinsics.areEqual(str, "record_menu")) {
            View a2 = mo165616a(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(a2, "divider");
            a2.setVisibility(8);
        }
        setEnabled(!cVar.mo162000g());
        if (cVar.mo161995c() != 0) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            drawable = UDIconUtils.getIconDrawable(context2, cVar.mo161994b(), ContextCompat.getColor(getContext(), cVar.mo161995c()));
        } else {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            drawable = UDIconUtils.getIconDrawable(context3, cVar.mo161994b());
        }
        ((ImageView) mo165616a(R.id.ivIcon)).setImageDrawable(drawable);
        LineHeightTextView lineHeightTextView3 = (LineHeightTextView) mo165616a(R.id.tvTitle);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView3, "tvTitle");
        lineHeightTextView3.setText(getResources().getString(cVar.mo161993a()));
        UDSwitch uDSwitch2 = (UDSwitch) mo165616a(R.id.ivSwitch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "ivSwitch");
        if (cVar.mo161996d()) {
            i3 = 0;
        }
        uDSwitch2.setVisibility(i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmMenuView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186654a(attributeSet, i, i2);
    }
}
