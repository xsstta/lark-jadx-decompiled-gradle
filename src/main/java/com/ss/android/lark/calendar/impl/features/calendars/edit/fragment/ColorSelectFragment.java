package com.ss.android.lark.calendar.impl.features.calendars.edit.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.C22184b;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.RoundRectDrawable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\u001a\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016JG\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010%\u001a\u00020\u00062!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005R+\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/edit/fragment/ColorSelectFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/view/View$OnClickListener;", "()V", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "color", "", "colorList", "", "columnCount", "itemSize", "rowCount", "selectedIndex", "verticalSpace", "layoutViews", "container", "Landroid/widget/FrameLayout;", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "colors", "currentColor", "ColorSelectItemView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ColorSelectFragment extends C22184b implements View.OnClickListener {

    /* renamed from: c */
    private int f75766c;

    /* renamed from: d */
    private final int f75767d = 6;

    /* renamed from: e */
    private final int f75768e = C32659l.m125335a((Number) 42);

    /* renamed from: f */
    private final int f75769f = C32659l.m125335a((Number) 10);

    /* renamed from: g */
    private List<Integer> f75770g = CollectionsKt.emptyList();

    /* renamed from: h */
    private int f75771h = -1;

    /* renamed from: i */
    private Function1<? super Integer, Unit> f75772i;

    /* renamed from: j */
    private HashMap f75773j;

    /* renamed from: f */
    public void mo109344f() {
        HashMap hashMap = this.f75773j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109344f();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R&\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/edit/fragment/ColorSelectFragment$ColorSelectItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "color", "getColor", "()I", "setColor", "(I)V", "colorBlock", "Landroid/view/View;", "colorSelect", "setSelected", "", "selected", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ColorSelectItemView extends FrameLayout {

        /* renamed from: a */
        private final View f75774a;

        /* renamed from: b */
        private final View f75775b;

        /* renamed from: c */
        private int f75776c;

        public ColorSelectItemView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
        }

        /* renamed from: a */
        public final int mo109346a() {
            return this.f75776c;
        }

        public void setSelected(boolean z) {
            int i;
            super.setSelected(z);
            View view = this.f75775b;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
        }

        /* renamed from: a */
        public final void mo109347a(int i) {
            this.f75776c = i;
            this.f75774a.setBackground(new RoundRectDrawable(i, C32659l.m125335a((Number) 4), 0, 0, 0, false, 60, null));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ColorSelectItemView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Intrinsics.checkParameterIsNotNull(context, "context");
            LayoutInflater.from(context).inflate(R.layout.calendar_view_color_select_item, this);
            View findViewById = findViewById(R.id.color_block);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.color_block)");
            this.f75774a = findViewById;
            View findViewById2 = findViewById(R.id.color_select);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.color_select)");
            this.f75775b = findViewById2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ColorSelectItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.ColorSelectFragment$a */
    static final class RunnableC30267a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ColorSelectFragment f75777a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f75778b;

        RunnableC30267a(ColorSelectFragment colorSelectFragment, FrameLayout frameLayout) {
            this.f75777a = colorSelectFragment;
            this.f75778b = frameLayout;
        }

        public final void run() {
            ColorSelectFragment colorSelectFragment = this.f75777a;
            FrameLayout frameLayout = this.f75778b;
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "container");
            colorSelectFragment.mo109342a(frameLayout);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        View findViewById;
        super.onResume();
        Dialog v_ = v_();
        if (v_ != null && (findViewById = v_.findViewById(R.id.design_bottom_sheet)) != null) {
            Context context = findViewById.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            findViewById.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.bg_body), C32659l.m125335a((Number) 6), C32659l.m125335a((Number) 6), 0, 0, false, 32, null));
        }
    }

    public void onClick(View view) {
        if (view instanceof ColorSelectItemView) {
            mo5513b();
            Function1<? super Integer, Unit> function1 = this.f75772i;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(((ColorSelectItemView) view).mo109346a()));
            }
        }
    }

    /* renamed from: a */
    public final void mo109342a(FrameLayout frameLayout) {
        boolean z;
        int width = (frameLayout.getWidth() - frameLayout.getPaddingLeft()) - frameLayout.getPaddingRight();
        int i = this.f75768e;
        int i2 = this.f75767d;
        int i3 = (width - (i * i2)) / (i2 - 1);
        int size = this.f75770g.size();
        for (int i4 = 0; i4 < size; i4++) {
            Context context = frameLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            ColorSelectItemView colorSelectItemView = new ColorSelectItemView(context, null, 0, 6, null);
            colorSelectItemView.setOnClickListener(this);
            colorSelectItemView.mo109347a(this.f75770g.get(i4).intValue());
            if (i4 == this.f75771h) {
                z = true;
            } else {
                z = false;
            }
            colorSelectItemView.setSelected(z);
            colorSelectItemView.setTranslationX(((float) (i4 % this.f75767d)) * ((float) (this.f75768e + i3)));
            colorSelectItemView.setTranslationY(((float) (i4 / this.f75767d)) * ((float) (this.f75768e + this.f75769f)));
            int i5 = this.f75768e;
            frameLayout.addView(colorSelectItemView, new FrameLayout.LayoutParams(i5, i5));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.drag_tip_view);
        if (findViewById != null) {
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            findViewById.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.line_border_card), C32659l.m125335a((Number) 2), 0, 0, 0, false, 60, null));
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.color_view_container);
        int i = this.f75766c;
        int i2 = (this.f75768e * i) + ((i - 1) * this.f75769f);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "container");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i2;
        }
        frameLayout.requestLayout();
        frameLayout.post(new RunnableC30267a(this, frameLayout));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_fragment_color_select, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo109343a(FragmentManager fragmentManager, List<Integer> list, int i, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(list, "colors");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        if (!list.isEmpty()) {
            int size = list.size();
            int i2 = this.f75767d;
            this.f75766c = ((size + i2) - 1) / i2;
            this.f75770g = list;
            this.f75771h = list.indexOf(Integer.valueOf(i));
            this.f75772i = function1;
            mo5511a(fragmentManager, (String) null);
        }
    }
}
