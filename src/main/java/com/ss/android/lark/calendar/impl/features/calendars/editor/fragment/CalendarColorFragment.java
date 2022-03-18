package com.ss.android.lark.calendar.impl.features.calendars.editor.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.settings.widget.C32477a;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SkinColor;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarCreatorBaseFragment;", "originalColor", "", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment$Delegate;", "(ILcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment$Delegate;)V", "NUM_COLOR_LINE", "NUM_COLOR_PER_LINE", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment$Delegate;", "isEdited", "", "itemSize", "mColors", "", "", "[[I", "buildColorViews", "", "initColorData", "initTitleBar", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateData", "chosenColor", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.a */
public final class CalendarColorFragment extends CalendarCreatorBaseFragment {

    /* renamed from: a */
    public final int f75842a = 2;

    /* renamed from: b */
    public final int f75843b = 6;

    /* renamed from: c */
    public boolean f75844c;

    /* renamed from: d */
    public final int[][] f75845d;

    /* renamed from: e */
    public int f75846e;

    /* renamed from: f */
    private final int f75847f;

    /* renamed from: g */
    private final Delegate f75848g;

    /* renamed from: h */
    private HashMap f75849h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment$Delegate;", "", "onBackPressed", "", "isEdited", "", "chosenColor", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.a$a */
    public interface Delegate {
        /* renamed from: a */
        void mo109410a(boolean z, int i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f75849h == null) {
            this.f75849h = new HashMap();
        }
        View view = (View) this.f75849h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75849h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f75849h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: d */
    private final void m112534d() {
        m112535e();
        mo109407b();
    }

    /* renamed from: f */
    private final void m112536f() {
        C30022a.f74884c.mo108450a(new C30285c(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment
    /* renamed from: c */
    public void mo109409c() {
        this.f75848g.mo109410a(this.f75844c, this.f75846e);
    }

    /* renamed from: e */
    private final void m112535e() {
        ((CommonTitleBar) mo109250a(R.id.colorTitleBar)).setTitle(R.string.Calendar_Setting_CalendarColor);
        ((CommonTitleBar) mo109250a(R.id.colorTitleBar)).setMainTitleSize(17.0f);
        ((CommonTitleBar) mo109250a(R.id.colorTitleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) mo109250a(R.id.colorTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.colorTitleBar)).setLeftClickListener(new View$OnClickListenerC30286d(this));
    }

    /* renamed from: b */
    public final void mo109407b() {
        boolean z;
        boolean z2;
        ((LinearLayout) mo109250a(R.id.mColorContainer)).removeAllViews();
        int i = this.f75847f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        int length = this.f75845d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f75845d[i2].length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                int length2 = this.f75845d[i2].length;
                for (int i3 = 0; i3 < length2; i3++) {
                    Context context = getContext();
                    if (context == null) {
                        Intrinsics.throwNpe();
                    }
                    C32477a aVar = new C32477a(context);
                    C32477a a = aVar.mo118617a(this.f75845d[i2][i3]);
                    if (this.f75846e == this.f75845d[i2][i3]) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a.mo118618a(z2).setOnClickListener(new View$OnClickListenerC30284b(this, i2, i3));
                    linearLayout.addView(aVar, layoutParams);
                    if (i3 != this.f75845d[i2].length - 1) {
                        Context context2 = getContext();
                        if (context2 == null) {
                            Intrinsics.throwNpe();
                        }
                        linearLayout.addView(new Space(context2), new LinearLayout.LayoutParams(0, 1, 1.0f));
                    }
                }
                if (i2 != this.f75845d.length - 1) {
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    Context context3 = getContext();
                    if (context3 == null) {
                        Intrinsics.throwNpe();
                    }
                    layoutParams2.setMargins(0, 0, 0, UIUtils.dp2px(context3, 20.0f));
                    ((LinearLayout) mo109250a(R.id.mColorContainer)).addView(linearLayout, layoutParams2);
                } else {
                    ((LinearLayout) mo109250a(R.id.mColorContainer)).addView(linearLayout);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.a$d */
    public static final class View$OnClickListenerC30286d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarColorFragment f75854a;

        View$OnClickListenerC30286d(CalendarColorFragment aVar) {
            this.f75854a = aVar;
        }

        public final void onClick(View view) {
            this.f75854a.mo109409c();
        }
    }

    /* renamed from: b */
    public final void mo109408b(int i) {
        this.f75846e = i;
        mo109407b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.a$b */
    public static final class View$OnClickListenerC30284b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarColorFragment f75850a;

        /* renamed from: b */
        final /* synthetic */ int f75851b;

        /* renamed from: c */
        final /* synthetic */ int f75852c;

        View$OnClickListenerC30284b(CalendarColorFragment aVar, int i, int i2) {
            this.f75850a = aVar;
            this.f75851b = i;
            this.f75852c = i2;
        }

        public final void onClick(View view) {
            boolean z;
            CalendarColorFragment aVar = this.f75850a;
            if (aVar.f75846e != this.f75850a.f75845d[this.f75851b][this.f75852c]) {
                z = true;
            } else {
                z = false;
            }
            aVar.f75844c = z;
            CalendarColorFragment aVar2 = this.f75850a;
            aVar2.f75846e = aVar2.f75845d[this.f75851b][this.f75852c];
            this.f75850a.mo109407b();
            this.f75850a.mo109409c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.a$c */
    public static final class C30285c implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ CalendarColorFragment f75853a;

        C30285c(CalendarColorFragment aVar) {
            this.f75853a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "setting");
            for (Map.Entry<String, SkinColor> entry : CalendarSkinColorTool.m124923a(calendarSetting.getSkinType()).entrySet()) {
                if (entry != null) {
                    Map.Entry<String, SkinColor> entry2 = entry;
                    String key = entry2.getKey();
                    SkinColor value = entry2.getValue();
                    try {
                        int parseInt = Integer.parseInt(key);
                        if (parseInt < 0 || parseInt >= this.f75853a.f75842a * this.f75853a.f75843b) {
                            C3474b.m14691a("colorId=" + parseInt);
                        } else {
                            Intrinsics.checkExpressionValueIsNotNull(value, "color");
                            this.f75853a.f75845d[parseInt / this.f75853a.f75843b][parseInt % this.f75853a.f75843b] = value.getSelectColor();
                        }
                    } catch (Exception e) {
                        C3474b.m14692a(e);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.util.Map.Entry<kotlin.String, com.ss.android.lark.calendar.impl.rustadapter.doentity.SkinColor>");
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m112536f();
        m112534d();
    }

    public CalendarColorFragment(int i, Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f75846e = i;
        this.f75848g = aVar;
        int[][] iArr = new int[2][];
        for (int i2 = 0; i2 < 2; i2++) {
            iArr[i2] = new int[this.f75843b];
        }
        this.f75845d = iArr;
        this.f75847f = C32659l.m125335a((Number) 42);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_creator_color_fragment, (ViewGroup) null);
    }
}
