package com.ss.android.lark.calendar.impl.features.events.edit.fragment.videomeeting;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.larksuite.component.ui.button.LKUIRadioButton;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingView;", "", "rootView", "Landroid/view/View;", "fragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment;", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment;Landroidx/lifecycle/ViewModelProvider;)V", "getFragment", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment;", "getRootView", "()Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingViewModel;", "getViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "create", "", "initGlobalViewModel", "initOtherObserve", "initOtherVideoContent", "initTitleBar", "initVideoSwitch", "initVideoType", "initView", "refreshVideoTypeVisibility", "visibility", "", "showOtherConfigUrlCheckDialog", "showVideoTypeChangeDialog", "context", "Landroid/content/Context;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b */
public final class EventVideoMeetingView {

    /* renamed from: a */
    private final View f80582a;

    /* renamed from: b */
    private final EventVideoMeetingFragment f80583b;

    /* renamed from: c */
    private final C1144ai f80584c;

    /* renamed from: d */
    public final View mo115487d() {
        return this.f80582a;
    }

    /* renamed from: e */
    public final EventVideoMeetingFragment mo115488e() {
        return this.f80583b;
    }

    /* renamed from: b */
    public final void mo115485b() {
        m120001g();
        m120000f();
    }

    /* renamed from: g */
    private final void m120001g() {
        m120002h();
        m120003i();
        m120004j();
        m120005k();
    }

    /* renamed from: a */
    public final EventVideoMeetingViewModel mo115482a() {
        AbstractC1142af a = this.f80584c.mo6005a(EventVideoMeetingViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "viewModelProvider.get(Ev…ingViewModel::class.java)");
        return (EventVideoMeetingViewModel) a;
    }

    /* renamed from: f */
    private final void m120000f() {
        mo115482a().getShowOtherConfigUrlCheckDialog().mo5923a(this.f80583b, new C31694a(this));
        mo115482a().getQuitFragment().mo5923a(this.f80583b, new C31695b(this));
    }

    /* renamed from: i */
    private final void m120003i() {
        mo115482a().isOpenVideoMeeting().mo5923a(this.f80583b, new C31705l(this));
        ((LKUISwitchButton) this.f80582a.findViewById(R.id.eventVideoSwitchButton)).setOnCheckedChangeListener(new C31706m(this));
    }

    /* renamed from: h */
    private final void m120002h() {
        ((CommonTitleBar) this.f80582a.findViewById(R.id.eventVideoTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) this.f80582a.findViewById(R.id.eventVideoTitleBar)).addAction(new C31703j(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500));
        ((CommonTitleBar) this.f80582a.findViewById(R.id.eventVideoTitleBar)).setLeftClickListener(new C31704k(this));
        ((CommonTitleBar) this.f80582a.findViewById(R.id.eventVideoTitleBar)).setLeftImageDrawable(null);
        ((CommonTitleBar) this.f80582a.findViewById(R.id.eventVideoTitleBar)).setLeftText(R.string.Calendar_Common_Cancel);
    }

    /* renamed from: j */
    private final void m120004j() {
        TextView textView = (TextView) this.f80582a.findViewById(R.id.vcChatNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.vcChatNameTv");
        textView.setText(UIHelper.mustacheFormat((int) R.string.Calendar_Edit_FeishuVC));
        ((RelativeLayout) this.f80582a.findViewById(R.id.vcVideoTypeRadioContainer)).setOnClickListener(new View$OnClickListenerC31707n(this));
        ((RelativeLayout) this.f80582a.findViewById(R.id.otherVideoTypeRadioContainer)).setOnClickListener(new View$OnClickListenerC31708o(this));
        mo115482a().getVideoMeetingTypeLiveData().mo5923a(this.f80583b, new C31709p(this));
    }

    /* renamed from: k */
    private final void m120005k() {
        ((EditText) this.f80582a.findViewById(R.id.otherVideoLabel)).addTextChangedListener(new C31700g(this));
        ((EditText) this.f80582a.findViewById(R.id.otherVideoUrlEt)).addTextChangedListener(new C31701h(this));
        ((RelativeLayout) this.f80582a.findViewById(R.id.otherVideoTypeContainer)).setOnClickListener(new View$OnClickListenerC31702i(this));
        m120006l();
    }

    /* renamed from: l */
    private final void m120006l() {
        mo115482a().getCustomVideoLabel().mo5923a(this.f80583b, new C31696c(this));
        mo115482a().getCustomVideoUrl().mo5923a(this.f80583b, new C31697d(this));
        mo115482a().getCustomVideoType().mo5923a(this.f80583b, new C31698e(this));
        mo115482a().getFocusOnVideoLabelLiveData().mo5923a(this.f80583b, new C31699f(this));
    }

    /* renamed from: c */
    public final void mo115486c() {
        FragmentActivity activity = this.f80583b.getActivity();
        if (!(activity instanceof Context)) {
            activity = null;
        }
        FragmentActivity fragmentActivity = activity;
        if (fragmentActivity != null) {
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(fragmentActivity).message(R.string.Calendar_Edit_NotFillInOtherVCLinksReturn)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Return, new DialogInterface$OnClickListenerC31710q(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Detail_BackToEdit, (DialogInterface.OnClickListener) null)).show();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$a */
    public static final class C31694a<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80585a;

        C31694a(EventVideoMeetingView bVar) {
            this.f80585a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            this.f80585a.mo115486c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingView$initOtherVideoContent$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$g */
    public static final class C31700g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80591a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31700g(EventVideoMeetingView bVar) {
            this.f80591a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            EventVideoMeetingViewModel a = this.f80591a.mo115482a();
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            a.onEditOtherMeetingLabel(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingView$initOtherVideoContent$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$h */
    public static final class C31701h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80592a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31701h(EventVideoMeetingView bVar) {
            this.f80592a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            EventVideoMeetingViewModel a = this.f80592a.mo115482a();
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            a.onEditOtherMeetingUrl(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingView$initTitleBar$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$k */
    public static final class C31704k extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80595a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31704k(EventVideoMeetingView bVar) {
            this.f80595a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80595a.mo115482a().onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingView$showVideoTypeChangeDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$r */
    public static final class C31711r implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80602a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31711r(EventVideoMeetingView bVar) {
            this.f80602a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                this.f80602a.mo115482a().onChangeOtherVideoType(EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.VIDEO_MEETING);
            } else if (i == 1) {
                this.f80602a.mo115482a().onChangeOtherVideoType(EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.LIVE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingView$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$j */
    public static final class C31703j extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80594a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            this.f80594a.mo115482a().onBackPressed();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31703j(EventVideoMeetingView bVar, String str, int i) {
            super(str, i);
            this.f80594a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$n */
    public static final class View$OnClickListenerC31707n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80598a;

        View$OnClickListenerC31707n(EventVideoMeetingView bVar) {
            this.f80598a = bVar;
        }

        public final void onClick(View view) {
            this.f80598a.mo115482a().onChangeMeetingType(VideoType.VCHAT);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$o */
    public static final class View$OnClickListenerC31708o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80599a;

        View$OnClickListenerC31708o(EventVideoMeetingView bVar) {
            this.f80599a = bVar;
        }

        public final void onClick(View view) {
            this.f80599a.mo115482a().onChangeMeetingType(VideoType.OTHER);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$b */
    public static final class C31695b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80586a;

        C31695b(EventVideoMeetingView bVar) {
            this.f80586a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f80586a.mo115488e().mo115481f().mo114378a(this.f80586a.mo115482a().getSaveVideoMeeting());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$c */
    public static final class C31696c<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80587a;

        C31696c(EventVideoMeetingView bVar) {
            this.f80587a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            ((EditText) this.f80587a.mo115487d().findViewById(R.id.otherVideoLabel)).setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$d */
    public static final class C31697d<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80588a;

        C31697d(EventVideoMeetingView bVar) {
            this.f80588a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            ((EditText) this.f80588a.mo115487d().findViewById(R.id.otherVideoUrlEt)).setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$i */
    public static final class View$OnClickListenerC31702i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80593a;

        View$OnClickListenerC31702i(EventVideoMeetingView bVar) {
            this.f80593a = bVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.f80593a.mo115488e().getActivity();
            if (!(activity instanceof Context)) {
                activity = null;
            }
            FragmentActivity fragmentActivity = activity;
            if (fragmentActivity != null) {
                this.f80593a.mo115484a(fragmentActivity);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$f */
    public static final class C31699f<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80590a;

        C31699f(EventVideoMeetingView bVar) {
            this.f80590a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            EditText editText = (EditText) this.f80590a.mo115487d().findViewById(R.id.otherVideoLabel);
            Intrinsics.checkExpressionValueIsNotNull(editText, "rootView.otherVideoLabel");
            Editable text = editText.getText();
            if (text != null) {
                ((EditText) this.f80590a.mo115487d().findViewById(R.id.otherVideoLabel)).setSelection(text.length());
                ((EditText) this.f80590a.mo115487d().findViewById(R.id.otherVideoLabel)).requestFocus();
            }
        }
    }

    /* renamed from: a */
    public final void mo115483a(int i) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f80582a.findViewById(R.id.vcVideoTypeRadioContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.vcVideoTypeRadioContainer");
        relativeLayout.setVisibility(i);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f80582a.findViewById(R.id.otherVideoTypeRadioContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.otherVideoTypeRadioContainer");
        relativeLayout2.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$l */
    public static final class C31705l<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80596a;

        C31705l(EventVideoMeetingView bVar) {
            this.f80596a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            ((LKUISwitchButton) this.f80596a.mo115487d().findViewById(R.id.eventVideoSwitchButton)).setCheckedImmediatelyNoEvent(bool.booleanValue());
            if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f80596a.mo115483a(8);
                RelativeLayout relativeLayout = (RelativeLayout) this.f80596a.mo115487d().findViewById(R.id.otherVideoGlobalContainer);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.otherVideoGlobalContainer");
                relativeLayout.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs$IconType;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$e */
    public static final class C31698e<T> implements AbstractC1178x<EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType> {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80589a;

        C31698e(EventVideoMeetingView bVar) {
            this.f80589a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType) {
            if (iconType != null && C31712c.f80604b[iconType.ordinal()] == 1) {
                Drawable mutate = C32634ae.m125184d(R.drawable.ud_icon_livestream_outlined).mutate();
                mutate.setTint(C32634ae.m125178a(R.color.lkui_N600));
                Intrinsics.checkExpressionValueIsNotNull(mutate, "ResUtil.getDrawable(R.dr…                        }");
                ((ImageView) this.f80589a.mo115487d().findViewById(R.id.customVideoIv)).setImageDrawable(mutate);
                EditText editText = (EditText) this.f80589a.mo115487d().findViewById(R.id.otherVideoLabel);
                Intrinsics.checkExpressionValueIsNotNull(editText, "rootView.otherVideoLabel");
                editText.setHint(C32634ae.m125182b(R.string.Calendar_Edit_JoinLivestream));
                return;
            }
            Drawable mutate2 = C32634ae.m125184d(R.drawable.ud_icon_video_outlined).mutate();
            mutate2.setTint(C32634ae.m125178a(R.color.lkui_N600));
            Intrinsics.checkExpressionValueIsNotNull(mutate2, "ResUtil.getDrawable(R.dr…                        }");
            ((ImageView) this.f80589a.mo115487d().findViewById(R.id.customVideoIv)).setImageDrawable(mutate2);
            EditText editText2 = (EditText) this.f80589a.mo115487d().findViewById(R.id.otherVideoLabel);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "rootView.otherVideoLabel");
            editText2.setHint(C32634ae.m125182b(R.string.Calendar_Edit_JoinVC));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$p */
    public static final class C31709p<T> implements AbstractC1178x<VideoType> {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80600a;

        C31709p(EventVideoMeetingView bVar) {
            this.f80600a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(VideoType videoType) {
            if (videoType != null) {
                int i = C31712c.f80603a[videoType.ordinal()];
                if (i == 1) {
                    LKUIRadioButton lKUIRadioButton = (LKUIRadioButton) this.f80600a.mo115487d().findViewById(R.id.vcChatRadioBt);
                    Intrinsics.checkExpressionValueIsNotNull(lKUIRadioButton, "rootView.vcChatRadioBt");
                    lKUIRadioButton.setChecked(true);
                    LKUIRadioButton lKUIRadioButton2 = (LKUIRadioButton) this.f80600a.mo115487d().findViewById(R.id.customChatRadioBt);
                    Intrinsics.checkExpressionValueIsNotNull(lKUIRadioButton2, "rootView.customChatRadioBt");
                    lKUIRadioButton2.setChecked(false);
                    RelativeLayout relativeLayout = (RelativeLayout) this.f80600a.mo115487d().findViewById(R.id.otherVideoGlobalContainer);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.otherVideoGlobalContainer");
                    relativeLayout.setVisibility(8);
                    this.f80600a.mo115483a(0);
                    return;
                } else if (i == 2) {
                    LKUIRadioButton lKUIRadioButton3 = (LKUIRadioButton) this.f80600a.mo115487d().findViewById(R.id.vcChatRadioBt);
                    Intrinsics.checkExpressionValueIsNotNull(lKUIRadioButton3, "rootView.vcChatRadioBt");
                    lKUIRadioButton3.setChecked(false);
                    LKUIRadioButton lKUIRadioButton4 = (LKUIRadioButton) this.f80600a.mo115487d().findViewById(R.id.customChatRadioBt);
                    Intrinsics.checkExpressionValueIsNotNull(lKUIRadioButton4, "rootView.customChatRadioBt");
                    lKUIRadioButton4.setChecked(true);
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f80600a.mo115487d().findViewById(R.id.otherVideoGlobalContainer);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.otherVideoGlobalContainer");
                    relativeLayout2.setVisibility(0);
                    this.f80600a.mo115483a(0);
                    return;
                }
            }
            this.f80600a.mo115483a(8);
            RelativeLayout relativeLayout3 = (RelativeLayout) this.f80600a.mo115487d().findViewById(R.id.otherVideoGlobalContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "rootView.otherVideoGlobalContainer");
            relativeLayout3.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo115484a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int a = (int) UDDimenUtils.m93308a(context, 16);
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_video_outlined, UDColorUtils.getColor(context, R.color.icon_n3));
        iconDrawable.setBounds(0, 0, a, a);
        Drawable iconDrawable2 = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_livestream_outlined, UDColorUtils.getColor(context, R.color.icon_n3));
        iconDrawable2.setBounds(0, 0, a, a);
        SpannableString spannableString = new SpannableString("drawable  " + C32634ae.m125182b(R.string.Calendar_Edit_JoinVC));
        spannableString.setSpan(new ImageSpan(iconDrawable, 1), 0, 8, 17);
        SpannableString spannableString2 = new SpannableString("drawable  " + C32634ae.m125182b(R.string.Calendar_Edit_JoinLivestream));
        spannableString2.setSpan(new ImageSpan(iconDrawable2, 1), 0, 8, 17);
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(CollectionsKt.listOf((Object[]) new SpannableString[]{spannableString, spannableString2}))).mo90869a(new C31711r(this))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$m */
    public static final class C31706m implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80597a;

        C31706m(EventVideoMeetingView bVar) {
            this.f80597a = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f80597a.mo115482a().onTurnVideoSwitch(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.b$q */
    public static final class DialogInterface$OnClickListenerC31710q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventVideoMeetingView f80601a;

        DialogInterface$OnClickListenerC31710q(EventVideoMeetingView bVar) {
            this.f80601a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f80601a.mo115482a().onBackWithVcChatClicked();
        }
    }

    public EventVideoMeetingView(View view, EventVideoMeetingFragment aVar, C1144ai aiVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        Intrinsics.checkParameterIsNotNull(aiVar, "viewModelProvider");
        this.f80582a = view;
        this.f80583b = aVar;
        this.f80584c = aiVar;
    }
}
