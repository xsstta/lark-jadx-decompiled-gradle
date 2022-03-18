package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.legacy.widget.Space;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.settings.widget.C32477a;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SkinColor;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseColorFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseColorFragment$ColorFragmentAction;", "displayColor", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseColorFragment$ColorFragmentAction;I)V", "itemSize", "mChosenColor", "mColorFragmentAction", "mColors", "", "", "[[I", "mIsFromLocalRecover", "", "buildColorViews", "", "initColorData", "initTitleBar", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateData", "ColorFragmentAction", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChooseColorFragment extends View$OnClickListenerC31538b {

    /* renamed from: f */
    public static final int f80276f = 2;

    /* renamed from: g */
    public static final int f80277g = 6;

    /* renamed from: h */
    public static final Companion f80278h = new Companion(null);

    /* renamed from: k */
    private static final int[][] f80279k = {new int[]{C32634ae.m125178a(R.color.red_e848a2), C32634ae.m125178a(R.color.red_ed4e4e), C32634ae.m125178a(R.color.yellow_f48754), C32634ae.m125178a(R.color.yellow_ff9c00), C32634ae.m125178a(R.color.green_7cbf2b), C32634ae.m125178a(R.color.blue_3ebeff)}, new int[]{C32634ae.m125178a(R.color.blue_69a9ff), C32634ae.m125178a(R.color.blue_6976eb), C32634ae.m125178a(R.color.purple_8570eb), C32634ae.m125178a(R.color.purple_9751df), C32634ae.m125178a(R.color.purple_af3eca), C32634ae.m125178a(R.color.black_455272)}};

    /* renamed from: a */
    public ColorFragmentAction f80280a;

    /* renamed from: b */
    public int f80281b;

    /* renamed from: e */
    public final int[][] f80282e;

    /* renamed from: i */
    private boolean f80283i;

    /* renamed from: j */
    private final int f80284j;

    /* renamed from: l */
    private HashMap f80285l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseColorFragment$ColorFragmentAction;", "Ljava/io/Serializable;", "onBackPressed", "", "onSavePressed", "chosenColor", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface ColorFragmentAction extends Serializable {
        void onBackPressed();

        void onSavePressed(int i);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80285l == null) {
            this.f80285l = new HashMap();
        }
        View view = (View) this.f80285l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80285l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80285l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseColorFragment$Companion;", "", "()V", "NUM_COLOR_LINE", "", "getNUM_COLOR_LINE", "()I", "NUM_COLOR_PER_LINE", "getNUM_COLOR_PER_LINE", "mOldColor", "", "", "[[I", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseColorFragment$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo115150a() {
            return ChooseColorFragment.f80276f;
        }

        /* renamed from: b */
        public final int mo115151b() {
            return ChooseColorFragment.f80277g;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    private final void m119445c() {
        m119446d();
        mo115148b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        ColorFragmentAction colorFragmentAction = this.f80280a;
        if (colorFragmentAction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mColorFragmentAction");
        }
        colorFragmentAction.onBackPressed();
        return true;
    }

    public ChooseColorFragment() {
        int i = f80276f;
        int[][] iArr = new int[i][];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = new int[f80277g];
        }
        this.f80282e = iArr;
        this.f80284j = C32659l.m125335a((Number) 42);
        this.f80283i = true;
    }

    /* renamed from: d */
    private final void m119446d() {
        ((CommonTitleBar) mo109250a(R.id.choose_color_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.choose_color_title_bar)).setTitle(R.string.Calendar_Edit_ChooseEventColor);
        ((CommonTitleBar) mo109250a(R.id.choose_color_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) mo109250a(R.id.choose_color_title_bar)).setLeftClickListener(new C31629d(this));
    }

    /* renamed from: f */
    private final void m119447f() {
        int i = 0;
        while (i < f80276f && i < 2) {
            int i2 = 0;
            while (i2 < f80277g && i2 < 6) {
                this.f80282e[i][i2] = f80279k[i][i2];
                i2++;
            }
            i++;
        }
        C30022a.f74884c.mo108450a(new C31628c(this));
    }

    /* renamed from: b */
    public final void mo115148b() {
        boolean z;
        boolean z2;
        ((LinearLayout) mo109250a(R.id.ll_root_container)).removeAllViews();
        int i = this.f80284j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        int length = this.f80282e.length;
        for (int i2 = 0; i2 < length; i2++) {
            int[][] iArr = this.f80282e;
            if (iArr[i2] != null) {
                if (iArr[i2].length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    int length2 = this.f80282e[i2].length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        Context context = getContext();
                        if (context == null) {
                            Intrinsics.throwNpe();
                        }
                        C32477a aVar = new C32477a(context);
                        C32477a a = aVar.mo118617a(this.f80282e[i2][i3]);
                        if (this.f80281b == this.f80282e[i2][i3]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a.mo118618a(z2).setOnClickListener(new View$OnClickListenerC31627b(this, i2, i3));
                        linearLayout.addView(aVar, layoutParams);
                        if (i3 != this.f80282e[i2].length - 1) {
                            Context context2 = getContext();
                            if (context2 == null) {
                                Intrinsics.throwNpe();
                            }
                            linearLayout.addView(new Space(context2), new LinearLayout.LayoutParams(0, 1, 1.0f));
                        }
                    }
                    if (i2 != this.f80282e.length - 1) {
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        Context context3 = getContext();
                        if (context3 == null) {
                            Intrinsics.throwNpe();
                        }
                        layoutParams2.setMargins(0, 0, 0, UIUtils.dp2px(context3, 18.0f));
                        ((LinearLayout) mo109250a(R.id.ll_root_container)).addView(linearLayout, layoutParams2);
                    } else {
                        ((LinearLayout) mo109250a(R.id.ll_root_container)).addView(linearLayout);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseColorFragment$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseColorFragment$d */
    public static final class C31629d extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseColorFragment f80290a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31629d(ChooseColorFragment chooseColorFragment) {
            this.f80290a = chooseColorFragment;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80290a.mo113714e();
        }
    }

    /* renamed from: b */
    public final void mo115149b(int i) {
        this.f80281b = i;
        mo115148b();
    }

    /* renamed from: a */
    public static final /* synthetic */ ColorFragmentAction m119444a(ChooseColorFragment chooseColorFragment) {
        ColorFragmentAction colorFragmentAction = chooseColorFragment.f80280a;
        if (colorFragmentAction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mColorFragmentAction");
        }
        return colorFragmentAction;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseColorFragment$b */
    public static final class View$OnClickListenerC31627b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseColorFragment f80286a;

        /* renamed from: b */
        final /* synthetic */ int f80287b;

        /* renamed from: c */
        final /* synthetic */ int f80288c;

        View$OnClickListenerC31627b(ChooseColorFragment chooseColorFragment, int i, int i2) {
            this.f80286a = chooseColorFragment;
            this.f80287b = i;
            this.f80288c = i2;
        }

        public final void onClick(View view) {
            if (this.f80286a.f80281b != this.f80286a.f80282e[this.f80287b][this.f80288c]) {
                ChooseColorFragment chooseColorFragment = this.f80286a;
                chooseColorFragment.f80281b = chooseColorFragment.f80282e[this.f80287b][this.f80288c];
                ChooseColorFragment.m119444a(this.f80286a).onSavePressed(this.f80286a.f80281b);
                this.f80286a.mo115148b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseColorFragment$c */
    public static final class C31628c implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ ChooseColorFragment f80289a;

        C31628c(ChooseColorFragment chooseColorFragment) {
            this.f80289a = chooseColorFragment;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "setting");
            for (Map.Entry<String, SkinColor> entry : CalendarSkinColorTool.m124923a(calendarSetting.getSkinType()).entrySet()) {
                String key = entry.getKey();
                SkinColor value = entry.getValue();
                try {
                    int parseInt = Integer.parseInt(key);
                    if (parseInt < 0 || parseInt >= ChooseColorFragment.f80278h.mo115150a() * ChooseColorFragment.f80278h.mo115151b()) {
                        C3474b.m14691a("colorId=" + parseInt);
                    } else {
                        this.f80289a.f80282e[parseInt / ChooseColorFragment.f80278h.mo115151b()][parseInt % ChooseColorFragment.f80278h.mo115151b()] = value.getSelectColor();
                    }
                } catch (Exception e) {
                    C3474b.m14692a(e);
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80283i) {
            m119447f();
            m119445c();
        }
    }

    public ChooseColorFragment(ColorFragmentAction colorFragmentAction, int i) {
        Intrinsics.checkParameterIsNotNull(colorFragmentAction, "action");
        int i2 = f80276f;
        int[][] iArr = new int[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = new int[f80277g];
        }
        this.f80282e = iArr;
        this.f80284j = C32659l.m125335a((Number) 42);
        this.f80280a = colorFragmentAction;
        this.f80281b = i;
        this.f80283i = false;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_color, (ViewGroup) null);
    }
}
