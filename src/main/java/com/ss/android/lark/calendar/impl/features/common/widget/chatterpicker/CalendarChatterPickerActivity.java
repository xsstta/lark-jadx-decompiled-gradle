package com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerViewModel;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.CalendarChatterPicker;
import com.ss.android.lark.search.widget.params.CalendarChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mViewModel", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/ICalendarChatterPickerViewModel;", "getMViewModel", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/ICalendarChatterPickerViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initChatterPicker", "", "initLiveData", "initTitleBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setResult", "showUnSubscribeDialog", "updateConfirmText", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarChatterPickerActivity extends CalendarBaseActivity {

    /* renamed from: a */
    public static final Companion f78852a = new Companion(null);

    /* renamed from: b */
    private final Lazy f78853b = LazyKt.lazy(new C31199h(this));

    /* renamed from: c */
    private HashMap f78854c;

    @JvmStatic
    /* renamed from: a */
    public static final void m116497a(Context context, CalendarPickerEntranceParams calendarPickerEntranceParams, int i) {
        f78852a.mo113054a(context, calendarPickerEntranceParams, i);
    }

    /* renamed from: a */
    public Context mo113043a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f78854c == null) {
            this.f78854c = new HashMap();
        }
        View view = (View) this.f78854c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78854c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ICalendarChatterPickerViewModel mo113044a() {
        return (ICalendarChatterPickerViewModel) this.f78853b.getValue();
    }

    /* renamed from: a */
    public void mo113045a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m116498a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m116495a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo113050e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo113051f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo113052g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m116500c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m116496a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m116499b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerActivity$Companion;", "", "()V", "PARAMS_CHATTER_PICKER_PARAMS", "", "PARAMS_PICKER_CHATTER_RESULT", "PARAMS_PICKER_DEPARTMENT_RESULT", "PARAMS_PICKER_EMAIL_RESULT", "PARAMS_PICKER_GROUP_RESULT", "PARAMS_PICKER_MEETING_CHAT_RESULT", "PARAMS_PICKER_NO_CONTACT_RESULT", "startChatterPickerActivity", "", "context", "Landroid/content/Context;", "entranceParams", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarPickerEntranceParams;", "requestCode", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113054a(Context context, CalendarPickerEntranceParams calendarPickerEntranceParams, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(calendarPickerEntranceParams, "entranceParams");
            C30022a.f74882a.appRouter().mo108210a(CalendarChatterPickerActivity.class).mo108152a("picker_entrance_params", calendarPickerEntranceParams).mo108155a(context, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerActivity$initChatterPicker$viewDependency$1", "Lcom/ss/android/lark/search/widget/BasePicker$IViewDependency;", "getActivity", "Landroid/app/Activity;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity$e */
    public static final class C31196e implements BasePicker.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ CalendarChatterPickerActivity f78858a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: b */
        public Activity mo110056b() {
            return this.f78858a;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: c */
        public FragmentManager mo110057c() {
            return this.f78858a.getSupportFragmentManager();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31196e(CalendarChatterPickerActivity calendarChatterPickerActivity) {
            this.f78858a = calendarChatterPickerActivity;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).mo183601l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity$h */
    static final class C31199h extends Lambda implements Function0<CalendarChatterPickerViewModel> {
        final /* synthetic */ CalendarChatterPickerActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31199h(CalendarChatterPickerActivity calendarChatterPickerActivity) {
            super(0);
            this.this$0 = calendarChatterPickerActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarChatterPickerViewModel invoke() {
            return (CalendarChatterPickerViewModel) new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity.C31199h.C312001 */

                /* renamed from: a */
                final /* synthetic */ C31199h f78861a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f78861a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Serializable serializable;
                    Bundle extras;
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    Intent intent = this.f78861a.this$0.getIntent();
                    CalendarPickerEntranceParams calendarPickerEntranceParams = null;
                    if (intent == null || (extras = intent.getExtras()) == null) {
                        serializable = null;
                    } else {
                        serializable = extras.getSerializable("picker_entrance_params");
                    }
                    if (serializable instanceof CalendarPickerEntranceParams) {
                        calendarPickerEntranceParams = serializable;
                    }
                    return new CalendarChatterPickerViewModel(calendarPickerEntranceParams);
                }
            }).mo6005a(CalendarChatterPickerViewModel.class);
        }
    }

    /* renamed from: j */
    private final void m116503j() {
        mo113044a().getShowToast().mo5923a(this, new C31197f(this));
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (mo113044a().getActivityOpenDirection() == CalendarChatterPickerViewModel.ActivityOpenDirection.HORIZONTAL) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (mo113044a().getActivityOpenDirection() == CalendarChatterPickerViewModel.ActivityOpenDirection.HORIZONTAL) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_OUT);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: d */
    public final void mo113049d() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this).title(R.string.Calendar_Event_UnableToAdd)).message(R.string.Calendar_Event_CantInviteExternalContactsDesc)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Event_GotIt, (DialogInterface.OnClickListener) null)).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerActivity$initChatterPicker$onPickerParamsLoader$1", "Lcom/ss/android/lark/search/widget/BasePicker$OnPickerParamsLoader;", "Lcom/ss/android/lark/search/widget/params/CalendarChatterPickerParams;", "onLoadPickerParams", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity$d */
    public static final class C31195d implements BasePicker.OnPickerParamsLoader<CalendarChatterPickerParams> {

        /* renamed from: a */
        final /* synthetic */ CalendarChatterPickerActivity f78857a;

        /* renamed from: a */
        public CalendarChatterPickerParams onLoadPickerParams() {
            return new CalendarChatterPickerParams.Builder().mo183664b(this.f78857a.mo113044a().getDisabledMemberIds()).mo183676h(this.f78857a.mo113044a().isSearchOuterUser()).mo183662b(this.f78857a.mo113044a().isCheckPermission()).mo183660a(this.f78857a.mo113044a().isAddMail()).mo183675g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31195d(CalendarChatterPickerActivity calendarChatterPickerActivity) {
            this.f78857a = calendarChatterPickerActivity;
        }
    }

    /* renamed from: h */
    private final void m116501h() {
        int chatterPickerTitleResId = mo113044a().getChatterPickerTitleResId();
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setLeftImageDrawable(null);
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setLeftText(R.string.Calendar_Common_Cancel);
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setTitle(C32634ae.m125182b(chatterPickerTitleResId));
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).addAction(new C31198g(this, ""));
    }

    /* renamed from: b */
    public final void mo113046b() {
        Intent intent = new Intent();
        intent.putExtra("picker_selected_chatter_result", mo113044a().getSelectedChatters());
        intent.putExtra("picker_selected_group_result", mo113044a().getSelectedGroups());
        intent.putExtra("picker_selected_email_result", mo113044a().getSelectedEmails());
        intent.putExtra("picker_selected_meeting_chat_result", mo113044a().getSelectedMeetingChats());
        intent.putExtra("picker_selected_no_contact_result", mo113044a().getNotContacts());
        intent.putExtra("picker_selected_department_result", mo113044a().getSelectedDepartments());
        setResult(-1, intent);
    }

    /* renamed from: c */
    public final void mo113047c() {
        int selectSize = mo113044a().getSelectSize();
        ((CommonTitleBar) mo108509a(R.id.pickerTitleBar)).setRightText(0, UIHelper.getString(R.string.Calendar_Common_Confirm).toString() + "(" + selectSize + ")", ContextCompat.getColor(getBaseContext(), R.color.lkui_B500));
    }

    /* renamed from: i */
    private final void m116502i() {
        boolean z;
        ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).mo183570b(mo113044a().getSearchHintTextResId());
        C31195d dVar = new C31195d(this);
        C31194c cVar = new C31194c(this);
        C31196e eVar = new C31196e(this);
        C31193b bVar = new C31193b(this);
        CalendarChatterPicker calendarChatterPicker = (CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).mo183604p(true)).mo183561a(dVar)).mo183559a(cVar);
        if (!mo113044a().isSearchOuterUser() || !mo113044a().isAddOuterUser()) {
            z = false;
        } else {
            z = true;
        }
        ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) ((CalendarChatterPicker) calendarChatterPicker.mo183496d(z)).mo183560a(eVar)).mo183565a(bVar)).mo183516l(mo113044a().getSupportAddDepartment()).mo183519o(true)).mo183518n(true)).mo183483a();
        ((CalendarChatterPicker) mo108509a(R.id.chatterPicker)).mo183577d(mo113044a().getPreSelectBeanInfos());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerActivity$initChatterPicker$businessConsumeItem$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "onBusinessBindItemCheckBox", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$CheckBoxBindStatus;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onBusinessConsumeItemClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity$b */
    public static final class C31193b implements SearchResultView.IOnBusinessConsumeItem {

        /* renamed from: a */
        final /* synthetic */ CalendarChatterPickerActivity f78855a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31193b(CalendarChatterPickerActivity calendarChatterPickerActivity) {
            this.f78855a = calendarChatterPickerActivity;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
        /* renamed from: a */
        public SearchResultView.CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (searchBaseInfo.isCrossTenant() && !this.f78855a.mo113044a().isAddOuterUser()) {
                return new SearchResultView.CheckBoxBindStatus(true, false, false);
            }
            if (!(searchBaseInfo instanceof SearchChatterInfo) || !((SearchChatterInfo) searchBaseInfo).isBlockOrBeBlocked()) {
                return new SearchResultView.CheckBoxBindStatus(false, false, false);
            }
            return new SearchResultView.CheckBoxBindStatus(true, false, false);
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
        /* renamed from: b */
        public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
            int i;
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (searchBaseInfo.isCrossTenant() && !this.f78855a.mo113044a().isAddOuterUser()) {
                this.f78855a.mo113049d();
                return true;
            } else if (!(searchBaseInfo instanceof SearchChatterInfo)) {
                return false;
            } else {
                SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
                if (!searchChatterInfo.isBlockOrBeBlocked()) {
                    return false;
                }
                if (searchChatterInfo.isBeBlocked()) {
                    i = R.string.Calendar_NewContacts_CantInviteToEventsDueToBlockTip;
                } else {
                    i = R.string.Calendar_NewContacts_CantInviteToEventsDueToBlockOthers;
                }
                LKUIToast.show(this.f78855a.getBaseContext(), i);
                return true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerActivity$initChatterPicker$onPickerNotify$1", "Lcom/ss/android/lark/search/widget/BasePicker$IOnPickNotify;", "onChanged", "", "ids", "", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onDeSelected", "id", "info", "onSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity$c */
    public static final class C31194c extends BasePicker.IOnPickNotify {

        /* renamed from: a */
        final /* synthetic */ CalendarChatterPickerActivity f78856a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            Intrinsics.checkParameterIsNotNull(list, "ids");
            Intrinsics.checkParameterIsNotNull(list2, "infoList");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31194c(CalendarChatterPickerActivity calendarChatterPickerActivity) {
            this.f78856a = calendarChatterPickerActivity;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
            this.f78856a.mo113044a().addSelectChatter(str, searchBaseInfo);
            this.f78856a.mo113047c();
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: b */
        public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
            this.f78856a.mo113044a().deleteSelectChatter(str, searchBaseInfo);
            this.f78856a.mo113047c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerActivity$initTitleBar$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity$g */
    public static final class C31198g extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ CalendarChatterPickerActivity f78860a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            KeyboardUtils.hideKeyboard(this.f78860a);
            this.f78860a.mo113046b();
            this.f78860a.finish();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31198g(CalendarChatterPickerActivity calendarChatterPickerActivity, String str) {
            super(str);
            this.f78860a = calendarChatterPickerActivity;
        }
    }

    /* renamed from: a */
    public static Resources m116496a(CalendarChatterPickerActivity calendarChatterPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarChatterPickerActivity);
        }
        return calendarChatterPickerActivity.mo113050e();
    }

    /* renamed from: c */
    public static AssetManager m116500c(CalendarChatterPickerActivity calendarChatterPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarChatterPickerActivity);
        }
        return calendarChatterPickerActivity.mo113052g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.calendar_activity_chatter_picker);
        m116501h();
        m116502i();
        mo113047c();
        m116503j();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "tipIdAndTime", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity$f */
    public static final class C31197f<T> implements AbstractC1178x<Pair<? extends Integer, ? extends Long>> {

        /* renamed from: a */
        final /* synthetic */ CalendarChatterPickerActivity f78859a;

        C31197f(CalendarChatterPickerActivity calendarChatterPickerActivity) {
            this.f78859a = calendarChatterPickerActivity;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Integer, Long> pair) {
            Integer first;
            if (pair != null && (first = pair.getFirst()) != null) {
                int intValue = first.intValue();
                Long second = pair.getSecond();
                if (second != null) {
                    long longValue = second.longValue();
                    if (longValue > 0) {
                        LKUIToast.show(this.f78859a.getBaseContext(), intValue, longValue);
                    } else {
                        LKUIToast.show(this.f78859a.getBaseContext(), intValue);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m116499b(CalendarChatterPickerActivity calendarChatterPickerActivity) {
        calendarChatterPickerActivity.mo113051f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarChatterPickerActivity calendarChatterPickerActivity2 = calendarChatterPickerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarChatterPickerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m116498a(CalendarChatterPickerActivity calendarChatterPickerActivity, Context context) {
        calendarChatterPickerActivity.mo113045a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarChatterPickerActivity);
        }
    }

    /* renamed from: a */
    public static Context m116495a(CalendarChatterPickerActivity calendarChatterPickerActivity, Configuration configuration) {
        Context a = calendarChatterPickerActivity.mo113043a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
