package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\tH\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment$VisibilityFragmentAction;", "visibility", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment$VisibilityFragmentAction;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;)V", "mIsFromLocalRecover", "", "mVisibility", "mVisibilityFragmentAction", "chooseVisibilityDefault", "", "chooseVisibilityPrivate", "chooseVisibilityPublic", "initChooseItem", "initListener", "initTitle", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateData", "VisibilityFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.f */
public final class ChooseVisibilityFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public VisibilityFragmentAction f80605a;

    /* renamed from: b */
    public CalendarEvent.Visibility f80606b;

    /* renamed from: e */
    private boolean f80607e = true;

    /* renamed from: f */
    private HashMap f80608f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment$VisibilityFragmentAction;", "", "onBackPressed", "", "onSavePressed", "visibility", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.f$a */
    public interface VisibilityFragmentAction {
        /* renamed from: a */
        void mo114390a();

        /* renamed from: a */
        void mo114391a(CalendarEvent.Visibility visibility);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80608f == null) {
            this.f80608f = new HashMap();
        }
        View view = (View) this.f80608f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80608f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80608f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    public ChooseVisibilityFragment() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        VisibilityFragmentAction aVar = this.f80605a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVisibilityFragmentAction");
        }
        aVar.mo114390a();
        return true;
    }

    /* renamed from: f */
    private final void m120024f() {
        ((CommonTitleBar) mo109250a(R.id.choose_visibility_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.choose_visibility_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) mo109250a(R.id.choose_visibility_title_bar)).setTitle(R.string.Calendar_Bot_ChooseVisibility);
        ((CommonTitleBar) mo109250a(R.id.choose_visibility_title_bar)).setLeftClickListener(new C31716e(this));
    }

    /* renamed from: g */
    private final void m120025g() {
        CalendarEvent.Visibility visibility = this.f80606b;
        if (visibility == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVisibility");
        }
        int i = C31717g.f80613a[visibility.ordinal()];
        if (i == 1) {
            mo115524b();
        } else if (i == 2) {
            mo115525c();
        } else if (i == 3) {
            mo115526d();
        }
    }

    /* renamed from: b */
    public final void mo115524b() {
        ImageView imageView = (ImageView) mo109250a(R.id.iv_visibility_default);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_visibility_default");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) mo109250a(R.id.iv_visibility_private);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_visibility_private");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) mo109250a(R.id.iv_visibility_public);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "iv_visibility_public");
        imageView3.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo115525c() {
        ImageView imageView = (ImageView) mo109250a(R.id.iv_visibility_public);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_visibility_public");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) mo109250a(R.id.iv_visibility_private);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_visibility_private");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) mo109250a(R.id.iv_visibility_default);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "iv_visibility_default");
        imageView3.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo115526d() {
        ImageView imageView = (ImageView) mo109250a(R.id.iv_visibility_private);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_visibility_private");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) mo109250a(R.id.iv_visibility_default);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_visibility_default");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) mo109250a(R.id.iv_visibility_public);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "iv_visibility_public");
        imageView3.setVisibility(8);
    }

    /* renamed from: h */
    private final void m120026h() {
        ((LinearLayout) mo109250a(R.id.ll_visibility_default)).setOnClickListener(new C31713b(this));
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.ll_visibility_public);
        if (linearLayout == null) {
            Intrinsics.throwNpe();
        }
        linearLayout.setOnClickListener(new C31714c(this));
        LinearLayout linearLayout2 = (LinearLayout) mo109250a(R.id.ll_visibility_private);
        if (linearLayout2 == null) {
            Intrinsics.throwNpe();
        }
        linearLayout2.setOnClickListener(new C31715d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment$initListener$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.f$b */
    public static final class C31713b extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseVisibilityFragment f80609a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31713b(ChooseVisibilityFragment fVar) {
            this.f80609a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80609a.mo115524b();
            this.f80609a.f80606b = CalendarEvent.Visibility.DEFAULT;
            ChooseVisibilityFragment.m120022a(this.f80609a).mo114391a(ChooseVisibilityFragment.m120023b(this.f80609a));
            CalendarEventHitPoint.m124339a("edit_public_scale", (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 30, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment$initListener$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.f$c */
    public static final class C31714c extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseVisibilityFragment f80610a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31714c(ChooseVisibilityFragment fVar) {
            this.f80610a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80610a.mo115525c();
            this.f80610a.f80606b = CalendarEvent.Visibility.PUBLIC;
            ChooseVisibilityFragment.m120022a(this.f80610a).mo114391a(ChooseVisibilityFragment.m120023b(this.f80610a));
            CalendarEventHitPoint.m124339a("edit_public_scale", (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 30, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment$initListener$3", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.f$d */
    public static final class C31715d extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseVisibilityFragment f80611a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31715d(ChooseVisibilityFragment fVar) {
            this.f80611a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80611a.mo115526d();
            this.f80611a.f80606b = CalendarEvent.Visibility.PRIVATE;
            ChooseVisibilityFragment.m120022a(this.f80611a).mo114391a(ChooseVisibilityFragment.m120023b(this.f80611a));
            CalendarEventHitPoint.m124339a("edit_public_scale", (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 30, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseVisibilityFragment$initTitle$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.f$e */
    public static final class C31716e extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseVisibilityFragment f80612a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31716e(ChooseVisibilityFragment fVar) {
            this.f80612a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            ChooseVisibilityFragment.m120022a(this.f80612a).mo114390a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VisibilityFragmentAction m120022a(ChooseVisibilityFragment fVar) {
        VisibilityFragmentAction aVar = fVar.f80605a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVisibilityFragmentAction");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CalendarEvent.Visibility m120023b(ChooseVisibilityFragment fVar) {
        CalendarEvent.Visibility visibility = fVar.f80606b;
        if (visibility == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVisibility");
        }
        return visibility;
    }

    /* renamed from: a */
    public final void mo115523a(CalendarEvent.Visibility visibility) {
        Intrinsics.checkParameterIsNotNull(visibility, "visibility");
        this.f80606b = visibility;
        m120025g();
    }

    public ChooseVisibilityFragment(VisibilityFragmentAction aVar, CalendarEvent.Visibility visibility) {
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        Intrinsics.checkParameterIsNotNull(visibility, "visibility");
        this.f80605a = aVar;
        this.f80606b = visibility;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80607e) {
            m120024f();
            m120025g();
            m120026h();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_visibility, (ViewGroup) null);
    }
}
