package com.ss.android.lark.calendar.impl.features.calendars.edit.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarMemberInfo;
import com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditInfo;
import com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditViewModel;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarShareOptionFragment;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionDelegate;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerEntrance;
import com.ss.android.lark.calendar.impl.features.picture.SelectOnePictureActivity;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.framework.fragment.C32496d;
import com.ss.android.lark.calendar.impl.framework.fragment.FragmentStack;
import com.ss.android.lark.calendar.impl.framework.fragment.HandleBackPress;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32500a;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.framework.viewmodel.StatusData;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SkinColor;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010%\u001a\u00020\u0012H\u0002J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0012H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "Lcom/ss/android/lark/calendar/impl/framework/fragment/HandleBackPress;", "()V", "calendarEditView", "Lcom/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditView;", "calendarShareOptionFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareOptionFragment;", "editViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/edit/viewmodel/CalendarEditViewModel;", "doAction", "", ShareHitPoint.f121869d, "", "payload", "", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "openDetailAndShare", "selectColor", "currentColor", "showShareSettings", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a */
public final class CalendarEditFragment extends CalendarBaseFragment implements HandleBackPress, ActionDispatcher {

    /* renamed from: c */
    public static final Companion f75779c = new Companion(null);

    /* renamed from: a */
    public CalendarEditViewModel f75780a;

    /* renamed from: b */
    public CalendarEditView f75781b;

    /* renamed from: d */
    private CalendarShareOptionFragment f75782d;

    /* renamed from: e */
    private HashMap f75783e;

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f75783e == null) {
            this.f75783e = new HashMap();
        }
        View view = (View) this.f75783e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75783e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f75783e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0011J!\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditFragment$Companion;", "", "()V", "ACTION_EXIT", "", "ACTION_OPEN_DETAIL", "ACTION_SELECT_COLOR", "ACTION_SELECT_COVER", "ACTION_SHOW_SHARE_SETTINGS", "KEY_CALENDAR_ID", "KEY_CALENDAR_SUMMARY", "KEY_IS_NEW_CREATE", "T", "buildCalendarEditBundle", "Landroid/os/Bundle;", "calServerId", "firstFragmentOpenAnim", "buildCalendarEditBundle$calendar_impl_release", "buildCreateCalendarBundle", "summary", "buildCreateCalendarBundle$calendar_impl_release", "selectColor", "", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "currentColor", "", "selectColor$calendar_impl_release", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo109352a(ActionDispatcher aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$selectColor");
            return aVar.doAction("ACTION_SELECT_COLOR", Integer.valueOf(i));
        }

        /* renamed from: a */
        public final Bundle mo109351a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str2, "firstFragmentOpenAnim");
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_NEW_CREATE", true);
            bundle.putString("KEY_CALENDAR_SUMMARY", str);
            int hashCode = str2.hashCode();
            if (hashCode != -75429425) {
                if (hashCode == 1708849213 && str2.equals("FIRST_FRAGMENT_OPEN_ANIM_HORIZONTAL")) {
                    FragmentStack.f83315a.mo118664a(bundle, R.anim.slide_right_in);
                    FragmentStack.f83315a.mo118666b(bundle, R.anim.slide_right_out);
                    return bundle;
                }
            } else if (str2.equals("FIRST_FRAGMENT_OPEN_ANIM_VERTICAL")) {
                FragmentStack.f83315a.mo118664a(bundle, R.anim.activity_enter_from_bottom);
                FragmentStack.f83315a.mo118666b(bundle, R.anim.activity_close_to_bottom);
                return bundle;
            }
            FragmentStack.f83315a.mo118664a(bundle, 0);
            FragmentStack.f83315a.mo118666b(bundle, 0);
            return bundle;
        }

        /* renamed from: b */
        public final Bundle mo109353b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "calServerId");
            Intrinsics.checkParameterIsNotNull(str2, "firstFragmentOpenAnim");
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_NEW_CREATE", false);
            bundle.putString("KEY_CALENDAR_ID", str);
            int hashCode = str2.hashCode();
            if (hashCode != -75429425) {
                if (hashCode == 1708849213 && str2.equals("FIRST_FRAGMENT_OPEN_ANIM_HORIZONTAL")) {
                    FragmentStack.f83315a.mo118664a(bundle, R.anim.slide_right_in);
                    FragmentStack.f83315a.mo118666b(bundle, R.anim.slide_right_out);
                    return bundle;
                }
            } else if (str2.equals("FIRST_FRAGMENT_OPEN_ANIM_VERTICAL")) {
                FragmentStack.f83315a.mo118664a(bundle, R.anim.activity_enter_from_bottom);
                FragmentStack.f83315a.mo118666b(bundle, R.anim.activity_close_to_bottom);
                return bundle;
            }
            FragmentStack.f83315a.mo118664a(bundle, 0);
            FragmentStack.f83315a.mo118666b(bundle, 0);
            return bundle;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditFragment$showShareSettings$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionFragmentData;", "getCalendarId", "", "getCalendarShareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "getCalendarTenantInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "isEditLocal", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$h */
    public static final class C30275h implements IShareOptionFragmentData {

        /* renamed from: a */
        final /* synthetic */ CalendarEditInfo f75791a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData
        /* renamed from: d */
        public boolean mo109363d() {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData
        /* renamed from: a */
        public String mo109360a() {
            return this.f75791a.mo109295a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData
        /* renamed from: b */
        public Calendar.CalendarShareOptions mo109361b() {
            return this.f75791a.mo109311k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData
        /* renamed from: c */
        public CalendarTenantInfo mo109362c() {
            return this.f75791a.mo109325x();
        }

        C30275h(CalendarEditInfo aVar) {
            this.f75791a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditFragment$showShareSettings$2", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionDelegate;", "onBackPressed", "", "onEditCalendarShareOptions", "newShareOptions", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$i */
    public static final class C30276i implements IShareOptionDelegate {

        /* renamed from: a */
        final /* synthetic */ CalendarEditFragment f75792a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionDelegate
        /* renamed from: a */
        public void mo109364a() {
            this.f75792a.mo109350b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30276i(CalendarEditFragment aVar) {
            this.f75792a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionDelegate
        /* renamed from: a */
        public void mo109365a(Calendar.CalendarShareOptions calendarShareOptions) {
            Intrinsics.checkParameterIsNotNull(calendarShareOptions, "newShareOptions");
            CalendarEditViewModel bVar = this.f75792a.f75780a;
            if (bVar != null) {
                CalendarEditViewModel.Companion.mo109337a(bVar, calendarShareOptions);
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f75781b = null;
        mo109251a();
    }

    /* renamed from: c */
    private final void m112468c() {
        CalendarEditInfo editInfo;
        CalendarEditView bVar;
        CalendarEditViewModel bVar2 = this.f75780a;
        if (bVar2 != null && (editInfo = bVar2.getEditInfo()) != null && (bVar = this.f75781b) != null) {
            an.m125214b(bVar.mo109366a());
            CalendarShareOptionFragment a = CalendarShareOptionFragment.f76294c.mo110001a(new C30275h(editInfo), new C30276i(this));
            this.f75782d = a;
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(bVar.mo109372b(), a, (String) null).commitAllowingStateLoss();
        }
    }

    /* renamed from: d */
    private final void m112469d() {
        CalendarEditInfo editInfo;
        Calendar v;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
            CalendarEditViewModel bVar = this.f75780a;
            if (bVar != null && (editInfo = bVar.getEditInfo()) != null && (v = editInfo.mo109323v()) != null) {
                FragmentStack a = C32496d.m124053a(this);
                if (a != null) {
                    String str = v.server_id;
                    if (str != null) {
                        a.mo118662a(CalendarDetailFragment.class, CalendarDetailFragment.Companion.m112394a(CalendarDetailFragment.f75662b, str, null, null, "FIRST_FRAGMENT_OPEN_ANIM_VERTICAL", 6, null));
                    }
                    a.mo118661a(this);
                }
                CalendarMemberPickerEntrance.f76372a.mo110104a(activity, v);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.fragment.HandleBackPress
    /* renamed from: b */
    public boolean mo109350b() {
        boolean z;
        CalendarEditInfo editInfo;
        CalendarShareOptionFragment fVar = this.f75782d;
        if (fVar != null) {
            if (!fVar.mo109999e()) {
                this.f75782d = null;
                getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).remove(fVar).commitAllowingStateLoss();
            }
            return true;
        }
        CalendarEditViewModel bVar = this.f75780a;
        if (bVar == null || (editInfo = bVar.getEditInfo()) == null || !editInfo.mo109319s()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Edit_UnSaveTip)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC30268b(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", "onChanged", "com/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditFragment$onViewCreated$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$c */
    static final class C30269c<T> implements AbstractC1178x<StatusData<String>> {

        /* renamed from: a */
        final /* synthetic */ CalendarEditFragment f75785a;

        C30269c(CalendarEditFragment aVar) {
            this.f75785a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(StatusData<String> gVar) {
            CalendarEditView bVar = this.f75785a.f75781b;
            if (bVar != null) {
                bVar.mo109370a(gVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendars/edit/viewmodel/CalendarEditInfo;", "onChanged", "com/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditFragment$onViewCreated$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$d */
    static final class C30270d<T> implements AbstractC1178x<CalendarEditInfo> {

        /* renamed from: a */
        final /* synthetic */ CalendarEditFragment f75786a;

        C30270d(CalendarEditFragment aVar) {
            this.f75786a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(CalendarEditInfo aVar) {
            CalendarEditView bVar = this.f75786a.f75781b;
            if (bVar != null) {
                bVar.mo109368a(aVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditFragment$onViewCreated$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$e */
    static final class C30271e<T> implements AbstractC1178x<CalendarMemberInfo> {

        /* renamed from: a */
        final /* synthetic */ CalendarEditFragment f75787a;

        C30271e(CalendarEditFragment aVar) {
            this.f75787a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(CalendarMemberInfo eVar) {
            CalendarEditView bVar = this.f75787a.f75781b;
            if (bVar != null) {
                bVar.mo109367a(eVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditFragment$onViewCreated$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$f */
    static final class C30272f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CalendarEditFragment f75788a;

        C30272f(CalendarEditFragment aVar) {
            this.f75788a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            CalendarEditView bVar = this.f75788a.f75781b;
            if (bVar != null) {
                bVar.mo109371a(bool);
            }
        }
    }

    /* renamed from: b */
    private final void m112467b(int i) {
        C30022a.f74884c.mo108450a(new C30273g(this, i));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$g */
    public static final class C30273g implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ CalendarEditFragment f75789a;

        /* renamed from: b */
        final /* synthetic */ int f75790b;

        C30273g(CalendarEditFragment aVar, int i) {
            this.f75789a = aVar;
            this.f75790b = i;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "setting");
            Map<String, SkinColor> a = CalendarSkinColorTool.m124923a(calendarSetting.getSkinType());
            ArrayList arrayList = new ArrayList();
            for (T t : a.values()) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                arrayList.add(Integer.valueOf(t.getSelectColor()));
            }
            ColorSelectFragment colorSelectFragment = new ColorSelectFragment();
            FragmentManager childFragmentManager = this.f75789a.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
            colorSelectFragment.mo109343a(childFragmentManager, arrayList, this.f75790b, new Function1<Integer, Unit>(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.CalendarEditFragment.C30273g.C302741 */
                final /* synthetic */ C30273g this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    CalendarEditViewModel bVar = this.this$0.f75789a.f75780a;
                    if (bVar != null) {
                        CalendarEditViewModel.Companion.mo109336a(bVar, i);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (arguments != null) {
            z = arguments.getBoolean("KEY_IS_NEW_CREATE");
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        String str2 = null;
        if (arguments2 != null) {
            str = arguments2.getString("KEY_CALENDAR_SUMMARY");
        } else {
            str = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("KEY_CALENDAR_ID");
        }
        Log.m165389i("CalendarEditFragment", "onCreate: " + z + ", ci=" + str2);
        AbstractC1142af a = new C1144ai(this).mo6005a(CalendarEditViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(this).…ditViewModel::class.java)");
        CalendarEditViewModel bVar = (CalendarEditViewModel) a;
        if (z) {
            bVar.initNewCreate(str);
        } else {
            if (str2 != null) {
                if (str2.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    bVar.initEdit(str2);
                }
            }
            Log.m165389i("CalendarEditFragment", "onCreate: illegal arguments, pop self");
            FragmentStack a2 = C32496d.m124053a(this);
            if (a2 != null) {
                a2.mo118661a(this);
                return;
            }
            return;
        }
        this.f75780a = bVar;
        if (z) {
            C32500a.m124322a();
        } else {
            CalendarSettingHitPoint.m124368a(str2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.a$b */
    public static final class DialogInterface$OnClickListenerC30268b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditFragment f75784a;

        DialogInterface$OnClickListenerC30268b(CalendarEditFragment aVar) {
            this.f75784a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            FragmentStack a = C32496d.m124053a(this.f75784a);
            if (a != null) {
                a.mo118661a(this.f75784a);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        CalendarEditViewModel bVar = this.f75780a;
        if (bVar != null) {
            bVar.getPageStatus().mo5923a(getViewLifecycleOwner(), new C30269c(this));
            bVar.getEditInfoData().mo5923a(getViewLifecycleOwner(), new C30270d(this));
            bVar.getSelfInfo().mo5923a(getViewLifecycleOwner(), new C30271e(this));
            bVar.getSaveStatus().mo5923a(getViewLifecycleOwner(), new C30272f(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean doAction(java.lang.String r5, java.lang.Object r6) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.CalendarEditFragment.doAction(java.lang.String, java.lang.Object):boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String a;
        CalendarEditViewModel bVar;
        if (i == 2324 && i2 == -1 && (a = SelectOnePictureActivity.f82404b.mo117783a(intent)) != null && (bVar = this.f75780a) != null) {
            CalendarEditViewModel.Companion.mo109339a((ActionDispatcher) bVar, a);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        CalendarEditView bVar = new CalendarEditView(layoutInflater, viewGroup, this);
        this.f75781b = bVar;
        return bVar.mo109366a();
    }
}
