package com.ss.android.lark.calendar.impl.features.calendars.share.picker;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.confirm.CalendarMemberConfirmFragment;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarMemberPickerData;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarShareExtraParam;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarDetailHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.CalendarChatterPicker;
import com.ss.android.lark.search.widget.params.CalendarChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001 \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\r\u0010\u001f\u001a\u00020 H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0014H\u0002J\u0010\u0010#\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\u001a\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0002J\b\u00100\u001a\u00020\u0014H\u0016J\u0012\u00101\u001a\u00020\u00142\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0010\u00104\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u00105\u001a\u00020\u0014H\u0002J\b\u00106\u001a\u00020\u0014H\u0002J\b\u00107\u001a\u00020\u0014H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mCurrentFragment", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "mMemberConfirmFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment;", "mRequestLoadingDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "memberConfirmAction", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$MemberConfirmAction;", "getMemberConfirmAction", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$MemberConfirmAction;", "pickerViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/ICalendarMemberPickerViewModel;", "getPickerViewModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/ICalendarMemberPickerViewModel;", "rightText", "Landroid/widget/TextView;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "filterSelectedSearchBean", "finishWithResult", "sharedMember", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "getPickerBusinessConsumeListener", "com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$getPickerBusinessConsumeListener$1", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$getPickerBusinessConsumeListener$1;", "hideCalendarMemberConfirmFragment", "hideFragment", "initChatterPicker", "initLiveData", "initSelectModel", "initTitleBar", "initView", "isDifferentTenantWithCalendar", "", "tenantId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isInterceptShareSelect", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showFragment", "showLoadingDialog", "showMemberConfirmFragment", "updateSelectedView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarMemberPickerActivity extends CalendarBaseActivity {

    /* renamed from: a */
    public RequestLoadingDialog f76322a;

    /* renamed from: b */
    private CalendarMemberConfirmFragment f76323b;

    /* renamed from: c */
    private CalendarBaseFragment f76324c;

    /* renamed from: d */
    private TextView f76325d;

    /* renamed from: e */
    private final CalendarMemberConfirmFragment.MemberConfirmAction f76326e = new C30514k(this);

    /* renamed from: f */
    private HashMap f76327f;

    /* renamed from: a */
    public Context mo110030a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f76327f == null) {
            this.f76327f = new HashMap();
        }
        View view = (View) this.f76327f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76327f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo110032a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m113353a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m113351a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo110044g() {
        return super.getResources();
    }

    public AssetManager getAssets() {
        return m113356c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m113352a(this);
    }

    /* renamed from: h */
    public void mo110046h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo110047i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m113355b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$initChatterPicker$viewDependency$1", "Lcom/ss/android/lark/search/widget/BasePicker$IViewDependency;", "getActivity", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$d */
    public static final class C30507d implements BasePicker.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76331a;

        /* renamed from: a */
        public CalendarMemberPickerActivity mo110056b() {
            return this.f76331a;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: c */
        public FragmentManager mo110057c() {
            return this.f76331a.getSupportFragmentManager();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30507d(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76331a = calendarMemberPickerActivity;
        }
    }

    /* renamed from: o */
    private final C30504a m113362o() {
        return new C30504a(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: j */
    private final void m113357j() {
        m113359l();
        m113360m();
        m113361n();
        m113358k();
    }

    /* renamed from: f */
    public final void mo110043f() {
        mo110039c(this.f76324c);
        this.f76324c = null;
    }

    /* renamed from: b */
    public final void mo110036b() {
        RequestLoadingDialog requestLoadingDialog = this.f76322a;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112585a(R.string.Calendar_Share_SharingToast);
            return;
        }
        RequestLoadingDialog requestLoadingDialog2 = new RequestLoadingDialog(this);
        requestLoadingDialog2.mo112585a(R.string.Calendar_Share_SharingToast);
        this.f76322a = requestLoadingDialog2;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        CalendarBaseFragment aVar = this.f76324c;
        if (aVar instanceof CalendarMemberConfirmFragment) {
            ((CalendarMemberConfirmFragment) aVar).mo110071d();
        } else if (((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).mo183501f()) {
            super.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$initChatterPicker$onPickerParamsLoader$1", "Lcom/ss/android/lark/search/widget/BasePicker$OnPickerParamsLoader;", "Lcom/ss/android/lark/search/widget/params/CalendarChatterPickerParams;", "onLoadPickerParams", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$c */
    public static final class C30506c implements BasePicker.OnPickerParamsLoader<CalendarChatterPickerParams> {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76330a;

        /* renamed from: a */
        public CalendarChatterPickerParams onLoadPickerParams() {
            return new CalendarChatterPickerParams.Builder().mo183664b(this.f76330a.mo110031a().getDisabledMemberIds()).mo183676h(true).mo183662b(true).mo183660a(false).mo183675g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30506c(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76330a = calendarMemberPickerActivity;
        }
    }

    /* renamed from: k */
    private final void m113358k() {
        CalendarMemberPickerActivity calendarMemberPickerActivity = this;
        mo110031a().getShowMemberConfirmFragment().mo5923a(calendarMemberPickerActivity, new C30508e(this));
        mo110031a().getSubscriberShareCalendarLiveData().mo5923a(calendarMemberPickerActivity, new C30509f(this));
        mo110031a().getShareStateLiveData().mo5923a(calendarMemberPickerActivity, new C30510g(this));
    }

    /* renamed from: m */
    private final void m113360m() {
        Calendar.AccessRole accessRole;
        String str;
        TextView textView = (TextView) mo108509a(R.id.nextActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "nextActionTv");
        CalendarShareExtraParam pickerCalendarData = mo110031a().getPickerCalendarData();
        if (pickerCalendarData != null) {
            accessRole = pickerCalendarData.getCalendarSelfAccessRole();
        } else {
            accessRole = null;
        }
        if (accessRole == Calendar.AccessRole.OWNER) {
            str = C32634ae.m125182b(R.string.Calendar_Share_NextStep);
        } else {
            str = C32634ae.m125182b(R.string.Calendar_Share_ShareButton);
        }
        textView.setText(str);
        ((TextView) mo108509a(R.id.nextActionTv)).setOnClickListener(new View$OnClickListenerC30511h(this));
        mo110042e();
    }

    /* renamed from: n */
    private final void m113361n() {
        ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).mo183570b(R.string.Calendar_Share_SearchMembersGroupsContacts);
        C30506c cVar = new C30506c(this);
        C30505b bVar = new C30505b(this);
        ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).mo183604p(true)).mo183496d(true)).mo183516l(false).mo183519o(true)).mo183518n(C30022a.f74883b.mo112717y())).mo183561a(cVar)).mo183559a(bVar)).mo183560a(new C30507d(this))).mo183565a(m113362o())).mo183624t(true)).mo183483a();
    }

    /* renamed from: c */
    public final void mo110038c() {
        boolean z;
        ArrayList<String> selectedChatters = mo110031a().getSelectedChatters();
        ArrayList<String> selectedGroups = mo110031a().getSelectedGroups();
        ArrayList arrayList = new ArrayList();
        for (T t : ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).getSelectedList()) {
            T t2 = t;
            if ((!(t2 instanceof SearchChatterInfo) || !selectedChatters.contains(t2.getId())) && (!(t2 instanceof SearchChatInfo) || !selectedGroups.contains(t2.getId()))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).mo183573b(CollectionsKt.toMutableList((Collection) arrayList));
    }

    /* renamed from: d */
    public final void mo110041d() {
        CalendarMemberConfirmFragment aVar = this.f76323b;
        if (aVar != null) {
            aVar.mo110066a(mo110031a().getSelectedChatters(), mo110031a().getSelectedGroups());
            mo110037b(this.f76323b);
        } else {
            CalendarMemberConfirmFragment a = CalendarMemberConfirmFragment.f76341h.mo110073a(mo110031a().getCalendarPickerParam(), mo110031a().getSelectedChatters(), mo110031a().getSelectedGroups(), this.f76326e);
            this.f76323b = a;
            mo110033a(a);
        }
        this.f76324c = this.f76323b;
    }

    /* renamed from: e */
    public final void mo110042e() {
        int i;
        String str;
        Drawable mutate;
        int size = ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).getSelectedList().size();
        if (size > 0) {
            i = R.color.primary_pri_500;
        } else {
            i = R.color.text_disable;
        }
        TextView textView = (TextView) mo108509a(R.id.nextActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "nextActionTv");
        Drawable background = textView.getBackground();
        if (!(background == null || (mutate = background.mutate()) == null)) {
            mutate.setTint(C32634ae.m125178a(i));
        }
        TextView textView2 = (TextView) mo108509a(R.id.selectedCountTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "selectedCountTv");
        textView2.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Share_NumPeopleSelected, "num", String.valueOf(size)));
        TextView textView3 = this.f76325d;
        if (textView3 != null) {
            Context context = textView3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            textView3.setTextColor(UDColorUtils.getColor(context, i));
            StringBuilder sb = new StringBuilder();
            sb.append(textView3.getContext().getString(R.string.Calendar_Share_NextStep));
            if (size <= 0) {
                str = "";
            } else if (size <= 99) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('(');
                sb2.append(size);
                sb2.append(')');
                str = sb2.toString();
            } else {
                str = "(99+)";
            }
            sb.append(str);
            textView3.setText(sb.toString());
        }
    }

    /* renamed from: l */
    private final void m113359l() {
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setLeftClickListener(new View$OnClickListenerC30512i(this));
        CalendarMemberPickerData calendarPickerParam = mo110031a().getCalendarPickerParam();
        if (calendarPickerParam == null || !calendarPickerParam.getShowLeftSkipIcon()) {
            ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setLeftImageResource(R.drawable.ic_svg_titlebar_close);
        } else {
            ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setLeftText(R.string.Calendar_Manage_Skip);
        }
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setTitle(CalendarMemberPickerData.Companion.mo110155a(mo110031a().getCalendarPickerParam()));
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo108509a(R.id.pickerTitleBar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "pickerTitleBar");
        Context context = commonTitleBar.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "pickerTitleBar.context");
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setSubTitleColor(UDColorUtils.getColor(context, R.color.text_caption));
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setSubTitleSize(10.0f);
        CalendarMemberPickerData calendarPickerParam2 = mo110031a().getCalendarPickerParam();
        if (calendarPickerParam2 != null && calendarPickerParam2.getShowLeftSkipIcon()) {
            ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setLeftText(R.string.Calendar_Manage_Skip);
            ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setLeftImageDrawable(null);
        }
        CalendarMemberPickerData calendarPickerParam3 = mo110031a().getCalendarPickerParam();
        if (calendarPickerParam3 != null && calendarPickerParam3.getShownNextActionAtTop()) {
            CommonTitleBar commonTitleBar2 = (CommonTitleBar) mo108509a(R.id.pickerTitleBar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar2, "pickerTitleBar");
            ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).addAction(new C30513j(this, commonTitleBar2.getContext().getString(R.string.Calendar_Share_NextStep), R.color.text_disable));
            this.f76325d = ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).getRightText(0);
            RelativeLayout relativeLayout = (RelativeLayout) mo108509a(R.id.bottomActionContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "bottomActionContainer");
            relativeLayout.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final ICalendarMemberPickerViewModel mo110031a() {
        AbstractC1142af a = new C1144ai(this, new C30515l(this)).mo6005a(CalendarMemberPickerViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(this, …kerViewModel::class.java)");
        return (ICalendarMemberPickerViewModel) a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$getPickerBusinessConsumeListener$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "onBusinessBindItemCheckBox", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$CheckBoxBindStatus;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onBusinessConsumeItemClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$a */
    public static final class C30504a implements SearchResultView.IOnBusinessConsumeItem {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76328a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30504a(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76328a = calendarMemberPickerActivity;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
        /* renamed from: a */
        public SearchResultView.CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if ((!(searchBaseInfo instanceof SearchChatterInfo) || !((SearchChatterInfo) searchBaseInfo).isBlockOrBeBlocked()) && !this.f76328a.mo110035a(searchBaseInfo)) {
                return new SearchResultView.CheckBoxBindStatus(false, false, false);
            }
            return new SearchResultView.CheckBoxBindStatus(true, false, false);
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
        /* renamed from: b */
        public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
            int i;
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (searchBaseInfo instanceof SearchChatterInfo) {
                SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
                if (searchChatterInfo.isBlockOrBeBlocked()) {
                    if (searchChatterInfo.isBeBlocked()) {
                        i = R.string.Calendar_NewContacts_CantInviteToEventsDueToBlockTip;
                    } else {
                        i = R.string.Calendar_NewContacts_CantInviteToEventsDueToBlockOthers;
                    }
                    UDToast.show(this.f76328a, i);
                    return true;
                }
            }
            if (!this.f76328a.mo110035a(searchBaseInfo)) {
                return false;
            }
            String b = C32634ae.m125182b(R.string.Calendar_Share_UnableShareDialogue);
            Intrinsics.checkExpressionValueIsNotNull(b, "message");
            UDToast.show(this.f76328a, b);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$initChatterPicker$onPickerNotify$1", "Lcom/ss/android/lark/search/widget/BasePicker$IOnPickNotify;", "onChanged", "", "ids", "", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onDeSelected", "id", "info", "onSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$b */
    public static final class C30505b extends BasePicker.IOnPickNotify {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76329a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            Intrinsics.checkParameterIsNotNull(list, "ids");
            Intrinsics.checkParameterIsNotNull(list2, "infoList");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30505b(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76329a = calendarMemberPickerActivity;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
            this.f76329a.mo110031a().addSelectChatter(str, searchBaseInfo);
            this.f76329a.mo110042e();
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: b */
        public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
            this.f76329a.mo110031a().deleteSelectChatter(str, searchBaseInfo);
            this.f76329a.mo110042e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$f */
    public static final class C30509f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76333a;

        C30509f(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76333a = calendarMemberPickerActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f76333a.mo110034a((List<CalendarMember.C15546a>) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$memberConfirmAction$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$MemberConfirmAction;", "onBackPressed", "", "curUserIds", "", "", "curGroupIds", "onShareSuccess", "sharedMember", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$k */
    public static final class C30514k implements CalendarMemberConfirmFragment.MemberConfirmAction {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76338a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30514k(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76338a = calendarMemberPickerActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.confirm.CalendarMemberConfirmFragment.MemberConfirmAction
        /* renamed from: a */
        public void mo110062a(List<CalendarMember.C15546a> list) {
            this.f76338a.mo110034a(list);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.confirm.CalendarMemberConfirmFragment.MemberConfirmAction
        /* renamed from: a */
        public void mo110063a(List<String> list, List<String> list2) {
            Intrinsics.checkParameterIsNotNull(list, "curUserIds");
            Intrinsics.checkParameterIsNotNull(list2, "curGroupIds");
            this.f76338a.mo110031a().updateSelectIds(list, list2);
            this.f76338a.mo110038c();
            this.f76338a.mo110043f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$pickerViewModel$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$l */
    public static final class C30515l implements C1144ai.AbstractC1146b {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76339a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30515l(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76339a = calendarMemberPickerActivity;
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Bundle bundle;
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            CalendarMemberPickerViewModel cVar = new CalendarMemberPickerViewModel();
            Intent intent = this.f76339a.getIntent();
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            cVar.init(bundle);
            return cVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$e */
    public static final class C30508e<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76332a;

        C30508e(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76332a = calendarMemberPickerActivity;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            KeyboardUtils.hideKeyboard(this.f76332a);
            this.f76332a.mo110041d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$h */
    public static final class View$OnClickListenerC30511h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76335a;

        View$OnClickListenerC30511h(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76335a = calendarMemberPickerActivity;
        }

        public final void onClick(View view) {
            this.f76335a.mo110031a().onNextActionClicked();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerActivity$initTitleBar$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$j */
    public static final class C30513j extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76337a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            this.f76337a.mo110031a().onNextActionClicked();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30513j(CalendarMemberPickerActivity calendarMemberPickerActivity, String str, int i) {
            super(str, i);
            this.f76337a = calendarMemberPickerActivity;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_calendar_member_picker);
        m113357j();
        m113358k();
    }

    /* renamed from: a */
    public static Resources m113352a(CalendarMemberPickerActivity calendarMemberPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarMemberPickerActivity);
        }
        return calendarMemberPickerActivity.mo110044g();
    }

    /* renamed from: c */
    public static AssetManager m113356c(CalendarMemberPickerActivity calendarMemberPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarMemberPickerActivity);
        }
        return calendarMemberPickerActivity.mo110047i();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$g */
    public static final class C30510g<T> implements AbstractC1178x<ShareState> {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76334a;

        C30510g(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76334a = calendarMemberPickerActivity;
        }

        /* renamed from: a */
        public final void onChanged(ShareState shareState) {
            RequestLoadingDialog requestLoadingDialog;
            int i = C30516a.f76340a[shareState.mo110170a().ordinal()];
            if (i == 1) {
                this.f76334a.mo110036b();
            } else if (i == 2) {
                RequestLoadingDialog requestLoadingDialog2 = this.f76334a.f76322a;
                if (requestLoadingDialog2 != null) {
                    requestLoadingDialog2.mo112593d(R.string.Calendar_Share_SharedToast);
                }
                this.f76334a.mo110034a((List<CalendarMember.C15546a>) null);
            } else if (i == 3 && (requestLoadingDialog = this.f76334a.f76322a) != null) {
                requestLoadingDialog.mo112592c(R.string.Calendar_Share_FaildTip);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity$i */
    public static final class View$OnClickListenerC30512i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerActivity f76336a;

        View$OnClickListenerC30512i(CalendarMemberPickerActivity calendarMemberPickerActivity) {
            this.f76336a = calendarMemberPickerActivity;
        }

        public final void onClick(View view) {
            String str;
            CalendarMemberPickerData calendarPickerParam = this.f76336a.mo110031a().getCalendarPickerParam();
            if (calendarPickerParam != null && calendarPickerParam.isFromCalendarCreate()) {
                CalendarDetailHitPoint bVar = CalendarDetailHitPoint.f83361a;
                CalendarShareExtraParam pickerCalendarData = this.f76336a.mo110031a().getPickerCalendarData();
                if (pickerCalendarData != null) {
                    str = pickerCalendarData.getCalendarId();
                } else {
                    str = null;
                }
                bVar.mo118751d(str, "skip");
            }
            this.f76336a.onBackPressed();
        }
    }

    /* renamed from: b */
    public static void m113355b(CalendarMemberPickerActivity calendarMemberPickerActivity) {
        calendarMemberPickerActivity.mo110046h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarMemberPickerActivity calendarMemberPickerActivity2 = calendarMemberPickerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarMemberPickerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo110039c(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void mo110037b(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo110033a(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(R.id.fragmentContainer, fragment, (String) null).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo110034a(List<CalendarMember.C15546a> list) {
        Intent intent = new Intent();
        if (list != null) {
            List<CalendarMember.C15546a> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().build());
            }
            intent.putExtra("key_param_calendar_member_list", new ArrayList(arrayList));
        }
        setResult(-1, intent);
        finish();
    }

    /* renamed from: a */
    public final boolean mo110035a(SearchBaseInfo searchBaseInfo) {
        Calendar.CalendarShareOptions calendarShareOptions;
        Calendar.AccessRole accessRole;
        boolean z;
        boolean z2;
        CalendarShareExtraParam pickerCalendarData = mo110031a().getPickerCalendarData();
        if (pickerCalendarData == null || (calendarShareOptions = pickerCalendarData.getCalendarShareOptions()) == null) {
            return false;
        }
        CalendarShareExtraParam pickerCalendarData2 = mo110031a().getPickerCalendarData();
        String str = null;
        if (pickerCalendarData2 != null) {
            accessRole = pickerCalendarData2.getCalendarSelfAccessRole();
        } else {
            accessRole = null;
        }
        if (accessRole == Calendar.AccessRole.OWNER) {
            return false;
        }
        if (calendarShareOptions.default_share_option == Calendar.ShareOption.SHARE_OPT_PRIVATE) {
            z = true;
        } else {
            z = false;
        }
        if (calendarShareOptions.cross_default_share_option == Calendar.ShareOption.SHARE_OPT_PRIVATE) {
            z2 = true;
        } else {
            z2 = false;
        }
        CalendarShareExtraParam pickerCalendarData3 = mo110031a().getPickerCalendarData();
        if (pickerCalendarData3 != null) {
            str = pickerCalendarData3.getCalendarTenantId();
        }
        boolean a = m113354a(str, searchBaseInfo);
        if ((!z || !z2) && ((a || !z) && (!a || !z2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m113353a(CalendarMemberPickerActivity calendarMemberPickerActivity, Context context) {
        calendarMemberPickerActivity.mo110032a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarMemberPickerActivity);
        }
    }

    /* renamed from: a */
    public static Context m113351a(CalendarMemberPickerActivity calendarMemberPickerActivity, Configuration configuration) {
        Context a = calendarMemberPickerActivity.mo110030a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m113354a(java.lang.String r5, com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo r6) {
        /*
            r4 = this;
            com.ss.android.lark.calendar.a.b r0 = com.ss.android.lark.calendar.p1430a.C30022a.f74882a
            com.ss.android.lark.calendar.a.a.s r0 = r0.loginDependency()
            java.lang.String r1 = "CalendarDependencyHolder…endency.loginDependency()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r0 = r0.mo108271c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            boolean r1 = r6 instanceof com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0038
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0027
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 != 0) goto L_0x0047
            com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo r6 = (com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo) r6
            java.lang.String r6 = r6.getTenantId()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0038:
            boolean r5 = r6 instanceof com.ss.android.lark.searchcommon.dto.info.SearchChatInfo
            if (r5 == 0) goto L_0x0047
            if (r0 == 0) goto L_0x0048
            com.ss.android.lark.searchcommon.dto.info.SearchChatInfo r6 = (com.ss.android.lark.searchcommon.dto.info.SearchChatInfo) r6
            boolean r5 = r6.isCrossTenant()
            if (r5 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerActivity.m113354a(java.lang.String, com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo):boolean");
    }
}
