package com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.params.CalendarChatterPickerParams;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'2\u0006\u0010)\u001a\u00020*H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006-"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "fragmentAction", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$TransferFragmentAction;", "getFragmentAction", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$TransferFragmentAction;", "setFragmentAction", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$TransferFragmentAction;)V", "transferViewModel", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/ITransferChatterPickerViewModel;", "getTransferViewModel", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/ITransferChatterPickerViewModel;", "transferViewModel$delegate", "Lkotlin/Lazy;", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "getViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "viewModelProvider$delegate", "focusSearchInput", "", "initChatterPicker", "initLiveDate", "initTitleBar", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showQuitEventDialog", BottomDialog.f17198f, "", "showShareCalendarDialog", "info", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "Companion", "TransferFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b */
public final class TransferChatterPickerFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public static final Companion f79291a = new Companion(null);

    /* renamed from: b */
    private TransferFragmentAction f79292b;

    /* renamed from: e */
    private final Lazy f79293e = LazyKt.lazy(new C31330m(this));

    /* renamed from: f */
    private final Lazy f79294f = LazyKt.lazy(new C31329l(this));

    /* renamed from: g */
    private HashMap f79295g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$TransferFragmentAction;", "", "onFragmentFinish", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$b */
    public interface TransferFragmentAction {
        /* renamed from: a */
        void mo113830a();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f79295g == null) {
            this.f79295g = new HashMap();
        }
        View view = (View) this.f79295g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f79295g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f79295g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final C1144ai mo113826b() {
        return (C1144ai) this.f79293e.getValue();
    }

    /* renamed from: c */
    public final ITransferChatterPickerViewModel mo113827c() {
        return (ITransferChatterPickerViewModel) this.f79294f.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$Companion;", "", "()V", "PARAMS_TRANSFER_EVENT", "", "getInitArguments", "Landroid/os/Bundle;", "initData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo113829a(TransferEventData transferEventData) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("transfer_event_data", transferEventData);
            return bundle;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$initChatterPicker$onPickerParamsLoader$1", "Lcom/ss/android/lark/search/widget/BasePicker$OnPickerParamsLoader;", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "onLoadPickerParams", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$e */
    public static final class C31322e implements BasePicker.OnPickerParamsLoader<ChatterPickerParams> {
        C31322e() {
        }

        /* renamed from: a */
        public ChatterPickerParams onLoadPickerParams() {
            return new CalendarChatterPickerParams.Builder().mo183676h(false).mo183662b(true).mo183660a(false).mo183728s(false).mo183730t(false).mo183732u(false).mo183726r(false).mo183675g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$initChatterPicker$viewDependency$1", "Lcom/ss/android/lark/search/widget/BasePicker$IViewDependency;", "getActivity", "Landroid/app/Activity;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$f */
    public static final class C31323f implements BasePicker.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerFragment f79298a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: b */
        public Activity mo110056b() {
            return this.f79298a.getActivity();
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: c */
        public FragmentManager mo110057c() {
            FragmentActivity activity = this.f79298a.getActivity();
            if (activity != null) {
                return activity.getSupportFragmentManager();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31323f(TransferChatterPickerFragment bVar) {
            this.f79298a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$i */
    public static final class C31326i implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerFragment f79301a;

        /* renamed from: b */
        final /* synthetic */ String f79302b;

        C31326i(TransferChatterPickerFragment bVar, String str) {
            this.f79301a = bVar;
            this.f79302b = str;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            this.f79301a.mo113827c().onSelectedQuit(this.f79302b, false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$j */
    public static final class C31327j implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerFragment f79303a;

        /* renamed from: b */
        final /* synthetic */ String f79304b;

        C31327j(TransferChatterPickerFragment bVar, String str) {
            this.f79303a = bVar;
            this.f79304b = str;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            this.f79303a.mo113827c().onSelectedQuit(this.f79304b, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$l */
    static final class C31329l extends Lambda implements Function0<TransferChatterPickerViewModel> {
        final /* synthetic */ TransferChatterPickerFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31329l(TransferChatterPickerFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TransferChatterPickerViewModel invoke() {
            return (TransferChatterPickerViewModel) this.this$0.mo113826b().mo6005a(TransferChatterPickerViewModel.class);
        }
    }

    /* renamed from: d */
    public final void mo113828d() {
        ((ChatterPicker) mo109250a(R.id.transferChatterPicker)).mo183603n();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        TransferFragmentAction bVar = this.f79292b;
        if (bVar == null) {
            return true;
        }
        bVar.mo113830a();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$m */
    static final class C31330m extends Lambda implements Function0<C1144ai> {
        final /* synthetic */ TransferChatterPickerFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31330m(TransferChatterPickerFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1144ai invoke() {
            return new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.TransferChatterPickerFragment.C31330m.C313311 */

                /* renamed from: a */
                final /* synthetic */ C31330m f79307a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f79307a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Serializable serializable;
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    Bundle arguments = this.f79307a.this$0.getArguments();
                    TransferEventData transferEventData = null;
                    if (arguments != null) {
                        serializable = arguments.getSerializable("transfer_event_data");
                    } else {
                        serializable = null;
                    }
                    if (serializable instanceof TransferEventData) {
                        transferEventData = serializable;
                    }
                    TransferEventData transferEventData2 = transferEventData;
                    if (transferEventData2 == null) {
                        transferEventData2 = TransferEventData.Companion.mo113817a();
                    }
                    return new TransferChatterPickerViewModel(transferEventData2);
                }
            });
        }
    }

    /* renamed from: h */
    private final void m117721h() {
        mo113827c().getTransferResult().mo5923a(this, new C31324g(this));
    }

    /* renamed from: f */
    private final void m117719f() {
        View a = mo109250a(R.id.virtualStatusBar);
        Intrinsics.checkExpressionValueIsNotNull(a, "virtualStatusBar");
        a.getLayoutParams().height = StatusBarUtil.getStatusBarHeight(getContext());
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.transferChatterPickerTitleBar);
        commonTitleBar.setLeftImageDrawable(null);
        commonTitleBar.setLeftText(R.string.Calendar_Common_Cancel);
        commonTitleBar.setTitle(R.string.Calendar_Common_Search);
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC31325h(this));
    }

    /* renamed from: g */
    private final void m117720g() {
        ((ChatterPicker) mo109250a(R.id.transferChatterPicker)).mo183570b(R.string.Calendar_Common_Search);
        C31322e eVar = new C31322e();
        C31321d dVar = new C31321d(this);
        C31323f fVar = new C31323f(this);
        ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) mo109250a(R.id.transferChatterPicker)).mo183604p(false)).mo183561a(eVar)).mo183559a(dVar)).mo183496d(false)).mo183560a(fVar)).mo183565a(new C31320c(this))).mo183516l(false).mo183519o(true)).mo183518n(true)).mo183498e(false)).mo183483a();
        ((ChatterPicker) mo109250a(R.id.transferChatterPicker)).mo183567a(TransferChatterPickerHintFragment.f79308a.mo113836a());
    }

    /* renamed from: a */
    public final void mo113823a(TransferFragmentAction bVar) {
        this.f79292b = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$initChatterPicker$businessConsumeItem$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "isDisabled", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onBusinessBindItemCheckBox", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$CheckBoxBindStatus;", "onBusinessConsumeItemClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$c */
    public static final class C31320c implements SearchResultView.IOnBusinessConsumeItem {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerFragment f79296a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31320c(TransferChatterPickerFragment bVar) {
            this.f79296a = bVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
        /* renamed from: b */
        public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return m117733c(searchBaseInfo);
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
        /* renamed from: a */
        public SearchResultView.CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (m117733c(searchBaseInfo)) {
                return new SearchResultView.CheckBoxBindStatus(true, false, false);
            }
            return new SearchResultView.CheckBoxBindStatus(false, false, false);
        }

        /* renamed from: c */
        private final boolean m117733c(SearchBaseInfo searchBaseInfo) {
            boolean z;
            if ((searchBaseInfo instanceof SearchChatterInfo) && ((SearchChatterInfo) searchBaseInfo).isBlockOrBeBlocked()) {
                return true;
            }
            String organizerId = this.f79296a.mo113827c().getOrganizerId();
            if (organizerId != null) {
                if (organizerId.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !Intrinsics.areEqual(organizerId, searchBaseInfo.getId())) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$initChatterPicker$onPickerNotify$1", "Lcom/ss/android/lark/search/widget/BasePicker$IOnPickNotify;", "onChanged", "", "ids", "", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onDeSelected", "id", "info", "onSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$d */
    public static final class C31321d extends BasePicker.IOnPickNotify {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerFragment f79297a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            Intrinsics.checkParameterIsNotNull(list, "ids");
            Intrinsics.checkParameterIsNotNull(list2, "infoList");
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: b */
        public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31321d(TransferChatterPickerFragment bVar) {
            this.f79297a = bVar;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
            if (this.f79297a.mo113827c().isShareCalendarEvent()) {
                this.f79297a.mo113825a(str, searchBaseInfo);
            } else {
                this.f79297a.mo113824a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerFragment$initTitleBar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$h */
    public static final class View$OnClickListenerC31325h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerFragment f79300a;

        View$OnClickListenerC31325h(TransferChatterPickerFragment bVar) {
            this.f79300a = bVar;
        }

        public final void onClick(View view) {
            this.f79300a.mo113714e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$g */
    public static final class C31324g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerFragment f79299a;

        C31324g(TransferChatterPickerFragment bVar) {
            this.f79299a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Context context = this.f79299a.getContext();
            if (context != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return@Observer");
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    String string = UIHelper.getString(R.string.Calendar_Transfer_TransferSuccessed);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…ansfer_TransferSuccessed)");
                    UDToast.show(context, string);
                } else if (Intrinsics.areEqual((Object) bool, (Object) false)) {
                    String string2 = UIHelper.getString(R.string.Calendar_Transfer_TransferFailed);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(strin…_Transfer_TransferFailed)");
                    UDToast.show(context, string2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo113824a(String str) {
        ArrayList arrayList = new ArrayList(2);
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_Transfer_TransferAndQuitEvent, "name", mo113827c().getOrganizerName());
        arrayList.add(new C58339d.C58341a(UIHelper.getString(R.string.Calendar_Transfer_QuitEvent), new C31327j(this, str)));
        arrayList.add(new C58339d.C58341a(UIHelper.getString(R.string.Calendar_Transfer_NotQuit), new C31326i(this, str)));
        C58339d.C58344c a = new C58339d.C58344c(getActivity(), arrayList, mustacheFormat).mo197578a(true);
        Intrinsics.checkExpressionValueIsNotNull(a, "MenuUtils.ListDialogCont…setCancelVisibility(true)");
        Dialog a2 = a.mo197576a();
        C57810a.m224336a(getActivity(), a2);
        a2.show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.b$k */
    public static final class DialogInterface$OnClickListenerC31328k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerFragment f79305a;

        /* renamed from: b */
        final /* synthetic */ String f79306b;

        DialogInterface$OnClickListenerC31328k(TransferChatterPickerFragment bVar, String str) {
            this.f79305a = bVar;
            this.f79306b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f79305a.mo113827c().onSelectedQuit(this.f79306b, false);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m117719f();
        m117720g();
        m117721h();
    }

    /* renamed from: a */
    public final void mo113825a(String str, SearchBaseInfo searchBaseInfo) {
        DialogInterface$OnClickListenerC31328k kVar = new DialogInterface$OnClickListenerC31328k(this, str);
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "it");
            UDDialogBuilder eVar = new UDDialogBuilder(context);
            String string = UIUtils.getString(getContext(), R.string.Calendar_Transfer_Transfer);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex…lendar_Transfer_Transfer)");
            UDDialogBuilder eVar2 = (UDDialogBuilder) eVar.title(string);
            StringBuilder sb = new StringBuilder();
            sb.append(UIHelper.getString(R.string.Calendar_Transfer_TransferEventFromSharedCalendar));
            String title = searchBaseInfo.getTitle();
            if (title == null) {
                title = "";
            }
            sb.append(UIHelper.mustacheFormat((int) R.string.Calendar_Transfer_ConfirmTransfer, "name", title));
            String b = C32634ae.m125182b(R.string.Calendar_Common_Transfer);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…Calendar_Common_Transfer)");
            String b2 = C32634ae.m125182b(R.string.Calendar_Common_Cancel);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Common_Cancel)");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar2.message(sb.toString())).addActionButton(R.id.ud_dialog_btn_primary, b, kVar)).addActionButton(R.id.ud_dialog_btn_secondary, b2, (DialogInterface.OnClickListener) null)).show();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_fragment_transfer_chatter_picker, viewGroup, false);
    }
}
