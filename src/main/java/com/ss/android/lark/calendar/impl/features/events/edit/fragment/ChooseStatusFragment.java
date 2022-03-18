package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment$StatusFragmentAction;", "isFree", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment$StatusFragmentAction;Z)V", "mIsFree", "mIsFromLocalRecover", "mStatusFragmentAction", "initChooseItem", "", "initListener", "initTitle", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateData", "StatusFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e */
public final class ChooseStatusFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public StatusFragmentAction f80569a;

    /* renamed from: b */
    public boolean f80570b;

    /* renamed from: e */
    private boolean f80571e = true;

    /* renamed from: f */
    private HashMap f80572f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment$StatusFragmentAction;", "", "onBackPressed", "", "onSavePressed", "isFree", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e$a */
    public interface StatusFragmentAction {
        /* renamed from: a */
        void mo114388a();

        /* renamed from: a */
        void mo114389a(boolean z);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80572f == null) {
            this.f80572f = new HashMap();
        }
        View view = (View) this.f80572f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80572f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80572f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    public ChooseStatusFragment() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        StatusFragmentAction aVar = this.f80569a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusFragmentAction");
        }
        aVar.mo114388a();
        return true;
    }

    /* renamed from: b */
    private final void m119979b() {
        ((CommonTitleBar) mo109250a(R.id.choose_status_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.choose_status_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) mo109250a(R.id.choose_status_title_bar)).setTitle(R.string.Calendar_Edit_ChooseAvailability);
        ((CommonTitleBar) mo109250a(R.id.choose_status_title_bar)).setLeftClickListener(new C31690d(this));
    }

    /* renamed from: c */
    private final void m119980c() {
        if (this.f80570b) {
            ImageView imageView = (ImageView) mo109250a(R.id.iv_status_busy);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_status_busy");
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) mo109250a(R.id.iv_status_free);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_status_free");
        imageView2.setVisibility(8);
    }

    /* renamed from: d */
    private final void m119981d() {
        ((LinearLayout) mo109250a(R.id.ll_status_busy)).setOnClickListener(new C31688b(this));
        ((LinearLayout) mo109250a(R.id.ll_status_free)).setOnClickListener(new C31689c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment$initListener$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e$b */
    public static final class C31688b extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseStatusFragment f80573a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31688b(ChooseStatusFragment eVar) {
            this.f80573a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            ImageView imageView = (ImageView) this.f80573a.mo109250a(R.id.iv_status_busy);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_status_busy");
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) this.f80573a.mo109250a(R.id.iv_status_free);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_status_free");
            imageView2.setVisibility(8);
            this.f80573a.f80570b = false;
            ChooseStatusFragment.m119978a(this.f80573a).mo114389a(this.f80573a.f80570b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment$initListener$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e$c */
    public static final class C31689c extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseStatusFragment f80574a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31689c(ChooseStatusFragment eVar) {
            this.f80574a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            ImageView imageView = (ImageView) this.f80574a.mo109250a(R.id.iv_status_busy);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_status_busy");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.f80574a.mo109250a(R.id.iv_status_free);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_status_free");
            imageView2.setVisibility(0);
            this.f80574a.f80570b = true;
            ChooseStatusFragment.m119978a(this.f80574a).mo114389a(this.f80574a.f80570b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseStatusFragment$initTitle$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e$d */
    public static final class C31690d extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseStatusFragment f80575a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31690d(ChooseStatusFragment eVar) {
            this.f80575a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80575a.mo113714e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ StatusFragmentAction m119978a(ChooseStatusFragment eVar) {
        StatusFragmentAction aVar = eVar.f80569a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusFragmentAction");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo115476a(boolean z) {
        this.f80570b = z;
        m119980c();
    }

    public ChooseStatusFragment(StatusFragmentAction aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        this.f80569a = aVar;
        this.f80570b = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80571e) {
            m119979b();
            m119980c();
            m119981d();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_status, (ViewGroup) null);
    }
}
