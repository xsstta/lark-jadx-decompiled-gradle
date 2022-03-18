package com.ss.android.lark.calendar.impl.features.calendars.share.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarSaveInfo;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.data.RequestState;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareHelper;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u001a\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J(\u0010!\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0002J(\u0010&\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020\u0013H\u0002J\b\u0010)\u001a\u00020\u0013H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020,H\u0002J\u000e\u0010-\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\b\u0010.\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "()V", "callback", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment$EditShareOptionCallback;", "editShareOptionRequestState", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/data/RequestState;", "mRequestLoadingDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "selectCrossTenant", "", "shareOptionFragmentData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionFragmentData;", "getShareOptionString", "", "kotlin.jvm.PlatformType", "shareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$ShareOption;", "initView", "", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSelectShareOption", "newShareOption", "onViewCreated", "view", "refreshAccessRoleDisable", "roleContainer", "roleTitleTv", "Landroid/widget/TextView;", "roleDesTv", "refreshAccessRoleValid", "refreshCrossTopAccessRole", "refreshSelectShareOption", "refreshTitleBar", "refreshView", "sendPatchCalendarShareOptionRequest", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "setData", "showLoadingDialog", "Companion", "EditShareOptionCallback", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c */
public final class CalendarEditShareOptionFragment extends CalendarBaseFragment {

    /* renamed from: f */
    public static final Companion f76257f = new Companion(null);

    /* renamed from: a */
    public boolean f76258a;

    /* renamed from: b */
    public EditShareOptionCallback f76259b;

    /* renamed from: c */
    public IShareOptionFragmentData f76260c;

    /* renamed from: d */
    public RequestLoadingDialog f76261d;

    /* renamed from: e */
    public RequestState f76262e;

    /* renamed from: g */
    private HashMap f76263g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment$EditShareOptionCallback;", "", "hideFragment", "", "onEditCalendarShareOptions", "newShareOptions", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$b */
    public interface EditShareOptionCallback {
        /* renamed from: a */
        void mo109974a();

        /* renamed from: a */
        void mo109975a(Calendar.CalendarShareOptions calendarShareOptions);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f76263g == null) {
            this.f76263g = new HashMap();
        }
        View view = (View) this.f76263g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76263g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f76263g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment;", "shareOptionFragmentData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionFragmentData;", "selectCrossTenant", "", "callback", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment$EditShareOptionCallback;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CalendarEditShareOptionFragment mo109973a(IShareOptionFragmentData dVar, boolean z, EditShareOptionCallback bVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "shareOptionFragmentData");
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            CalendarEditShareOptionFragment cVar = new CalendarEditShareOptionFragment();
            cVar.f76260c = dVar;
            cVar.f76258a = z;
            cVar.f76259b = bVar;
            return cVar;
        }
    }

    /* renamed from: d */
    public final void mo109972d() {
        EditShareOptionCallback bVar = this.f76259b;
        if (bVar != null) {
            bVar.mo109974a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$k */
    public static final class RunnableC30483k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76274a;

        RunnableC30483k(CalendarEditShareOptionFragment cVar) {
            this.f76274a = cVar;
        }

        public final void run() {
            if (this.f76274a.f76262e == RequestState.LOADING) {
                this.f76274a.mo109971c();
            }
        }
    }

    /* renamed from: b */
    public final void mo109970b() {
        m113263h();
        m113262g();
        m113261f();
    }

    /* renamed from: g */
    private final void m113262g() {
        int i;
        if (this.f76258a) {
            i = R.string.Calendar_Share_ExternalPermissionTitle;
        } else {
            i = R.string.Calendar_Share_InternalPermissionTitle;
        }
        ((CommonTitleBar) mo109250a(R.id.tenantShareTitleBar)).setTitle(C32634ae.m125182b(i));
    }

    /* renamed from: c */
    public final void mo109971c() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
            RequestLoadingDialog requestLoadingDialog = this.f76261d;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112585a(R.string.Calendar_Share_Modifying);
                return;
            }
            RequestLoadingDialog requestLoadingDialog2 = new RequestLoadingDialog(activity);
            requestLoadingDialog2.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
            requestLoadingDialog2.mo112585a(R.string.Calendar_Share_Modifying);
            this.f76261d = requestLoadingDialog2;
        }
    }

    /* renamed from: e */
    private final void m113260e() {
        ((RelativeLayout) mo109250a(R.id.writeContainer)).setOnClickListener(new View$OnClickListenerC30475c(this));
        ((RelativeLayout) mo109250a(R.id.ownerContainer)).setOnClickListener(new View$OnClickListenerC30476d(this));
        ((RelativeLayout) mo109250a(R.id.privateContainer)).setOnClickListener(new View$OnClickListenerC30477e(this));
        ((RelativeLayout) mo109250a(R.id.freeBusyContainer)).setOnClickListener(new View$OnClickListenerC30478f(this));
        ((RelativeLayout) mo109250a(R.id.readContainer)).setOnClickListener(new View$OnClickListenerC30479g(this));
        ((CommonTitleBar) mo109250a(R.id.tenantShareTitleBar)).setLeftClickListener(new View$OnClickListenerC30480h(this));
        mo109970b();
    }

    /* renamed from: f */
    private final void m113261f() {
        Calendar.CalendarShareOptions b;
        Calendar.ShareOption shareOption;
        if (!this.f76258a) {
            Calendar.ShareOption shareOption2 = Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER;
            RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.freeBusyContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "freeBusyContainer");
            TextView textView = (TextView) mo109250a(R.id.freeBusyTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "freeBusyTitle");
            TextView textView2 = (TextView) mo109250a(R.id.freeBusyInfoTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "freeBusyInfoTv");
            m113258a(shareOption2, relativeLayout, textView, textView2);
            Calendar.ShareOption shareOption3 = Calendar.ShareOption.SHARE_OPT_READER;
            RelativeLayout relativeLayout2 = (RelativeLayout) mo109250a(R.id.readContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "readContainer");
            TextView textView3 = (TextView) mo109250a(R.id.readTitleTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "readTitleTv");
            TextView textView4 = (TextView) mo109250a(R.id.readInfoTv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "readInfoTv");
            m113258a(shareOption3, relativeLayout2, textView3, textView4);
            return;
        }
        IShareOptionFragmentData dVar = this.f76260c;
        if (dVar != null && (b = dVar.mo109361b()) != null && (shareOption = b.cross_top_share_option) != null) {
            int i = C30485d.f76277a[shareOption.ordinal()];
            if (i == 1) {
                Calendar.ShareOption shareOption4 = Calendar.ShareOption.SHARE_OPT_READER;
                RelativeLayout relativeLayout3 = (RelativeLayout) mo109250a(R.id.readContainer);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "readContainer");
                TextView textView5 = (TextView) mo109250a(R.id.readTitleTv);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "readTitleTv");
                TextView textView6 = (TextView) mo109250a(R.id.readInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "readInfoTv");
                m113259b(shareOption4, relativeLayout3, textView5, textView6);
            } else if (i == 2) {
                Calendar.ShareOption shareOption5 = Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER;
                RelativeLayout relativeLayout4 = (RelativeLayout) mo109250a(R.id.freeBusyContainer);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "freeBusyContainer");
                TextView textView7 = (TextView) mo109250a(R.id.freeBusyTitle);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "freeBusyTitle");
                TextView textView8 = (TextView) mo109250a(R.id.freeBusyInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "freeBusyInfoTv");
                m113259b(shareOption5, relativeLayout4, textView7, textView8);
                Calendar.ShareOption shareOption6 = Calendar.ShareOption.SHARE_OPT_READER;
                RelativeLayout relativeLayout5 = (RelativeLayout) mo109250a(R.id.readContainer);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout5, "readContainer");
                TextView textView9 = (TextView) mo109250a(R.id.readTitleTv);
                Intrinsics.checkExpressionValueIsNotNull(textView9, "readTitleTv");
                TextView textView10 = (TextView) mo109250a(R.id.readInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView10, "readInfoTv");
                m113259b(shareOption6, relativeLayout5, textView9, textView10);
            }
        }
    }

    /* renamed from: h */
    private final void m113263h() {
        Calendar.CalendarShareOptions b;
        Calendar.ShareOption shareOption;
        IShareOptionFragmentData dVar = this.f76260c;
        if (dVar != null && (b = dVar.mo109361b()) != null) {
            UDCheckBox uDCheckBox = (UDCheckBox) mo109250a(R.id.privateCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "privateCheck");
            uDCheckBox.setChecked(false);
            UDCheckBox uDCheckBox2 = (UDCheckBox) mo109250a(R.id.freeBusyCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "freeBusyCheck");
            uDCheckBox2.setChecked(false);
            UDCheckBox uDCheckBox3 = (UDCheckBox) mo109250a(R.id.readCheckBox);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "readCheckBox");
            uDCheckBox3.setChecked(false);
            if (this.f76258a) {
                shareOption = b.cross_default_share_option;
            } else {
                shareOption = b.default_share_option;
            }
            if (shareOption != null) {
                int i = C30485d.f76279c[shareOption.ordinal()];
                if (i == 1) {
                    UDCheckBox uDCheckBox4 = (UDCheckBox) mo109250a(R.id.privateCheck);
                    Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "privateCheck");
                    uDCheckBox4.setChecked(true);
                } else if (i == 2) {
                    UDCheckBox uDCheckBox5 = (UDCheckBox) mo109250a(R.id.freeBusyCheck);
                    Intrinsics.checkExpressionValueIsNotNull(uDCheckBox5, "freeBusyCheck");
                    uDCheckBox5.setChecked(true);
                } else if (i == 3) {
                    UDCheckBox uDCheckBox6 = (UDCheckBox) mo109250a(R.id.readCheckBox);
                    Intrinsics.checkExpressionValueIsNotNull(uDCheckBox6, "readCheckBox");
                    uDCheckBox6.setChecked(true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$e */
    public static final class View$OnClickListenerC30477e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76266a;

        View$OnClickListenerC30477e(CalendarEditShareOptionFragment cVar) {
            this.f76266a = cVar;
        }

        public final void onClick(View view) {
            this.f76266a.mo109967a(Calendar.ShareOption.SHARE_OPT_PRIVATE);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$f */
    public static final class View$OnClickListenerC30478f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76267a;

        View$OnClickListenerC30478f(CalendarEditShareOptionFragment cVar) {
            this.f76267a = cVar;
        }

        public final void onClick(View view) {
            this.f76267a.mo109967a(Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$g */
    public static final class View$OnClickListenerC30479g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76268a;

        View$OnClickListenerC30479g(CalendarEditShareOptionFragment cVar) {
            this.f76268a = cVar;
        }

        public final void onClick(View view) {
            this.f76268a.mo109967a(Calendar.ShareOption.SHARE_OPT_READER);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$h */
    public static final class View$OnClickListenerC30480h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76269a;

        View$OnClickListenerC30480h(CalendarEditShareOptionFragment cVar) {
            this.f76269a = cVar;
        }

        public final void onClick(View view) {
            this.f76269a.mo109972d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$j */
    public static final class View$OnClickListenerC30482j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76272a;

        /* renamed from: b */
        final /* synthetic */ Calendar.ShareOption f76273b;

        View$OnClickListenerC30482j(CalendarEditShareOptionFragment cVar, Calendar.ShareOption shareOption) {
            this.f76272a = cVar;
            this.f76273b = shareOption;
        }

        public final void onClick(View view) {
            this.f76272a.mo109967a(this.f76273b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$c */
    public static final class View$OnClickListenerC30475c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76264a;

        View$OnClickListenerC30475c(CalendarEditShareOptionFragment cVar) {
            this.f76264a = cVar;
        }

        public final void onClick(View view) {
            CalendarShareHelper.f76321a.mo110029a(this.f76264a.getContext(), R.string.Calendar_Share_UnableSetDefault);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$d */
    public static final class View$OnClickListenerC30476d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76265a;

        View$OnClickListenerC30476d(CalendarEditShareOptionFragment cVar) {
            this.f76265a = cVar;
        }

        public final void onClick(View view) {
            CalendarShareHelper.f76321a.mo110029a(this.f76265a.getContext(), R.string.Calendar_Share_UnableSetDefault);
        }
    }

    /* renamed from: a */
    public final void mo109968a(boolean z) {
        this.f76258a = z;
        mo109970b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$i */
    public static final class View$OnClickListenerC30481i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76270a;

        /* renamed from: b */
        final /* synthetic */ Calendar.ShareOption f76271b;

        View$OnClickListenerC30481i(CalendarEditShareOptionFragment cVar, Calendar.ShareOption shareOption) {
            this.f76270a = cVar;
            this.f76271b = shareOption;
        }

        public final void onClick(View view) {
            String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Share_MaxPermissionSetAs, "MaxPermission", this.f76270a.mo109969b(this.f76271b));
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            Intrinsics.checkExpressionValueIsNotNull(a, "tipStr");
            UDToast.show(context, a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment$sendPatchCalendarShareOptionRequest$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.c$l */
    public static final class C30484l implements IGetDataCallback<Object> {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareOptionFragment f76275a;

        /* renamed from: b */
        final /* synthetic */ Calendar.CalendarShareOptions f76276b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            RequestLoadingDialog requestLoadingDialog;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76275a.f76262e = RequestState.FAILED;
            RequestLoadingDialog requestLoadingDialog2 = this.f76275a.f76261d;
            if (requestLoadingDialog2 != null && requestLoadingDialog2.isShowing() && (requestLoadingDialog = this.f76275a.f76261d) != null) {
                requestLoadingDialog.mo112592c(R.string.Calendar_Share_UnableToModify);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(Object obj) {
            RequestLoadingDialog requestLoadingDialog;
            this.f76275a.f76262e = RequestState.SUCCESS;
            RequestLoadingDialog requestLoadingDialog2 = this.f76275a.f76261d;
            if (!(requestLoadingDialog2 == null || !requestLoadingDialog2.isShowing() || (requestLoadingDialog = this.f76275a.f76261d) == null)) {
                requestLoadingDialog.mo112593d(R.string.Calendar_Share_Modified);
            }
            EditShareOptionCallback bVar = this.f76275a.f76259b;
            if (bVar != null) {
                bVar.mo109975a(this.f76276b);
            }
            this.f76275a.mo109970b();
            this.f76275a.mo109972d();
        }

        C30484l(CalendarEditShareOptionFragment cVar, Calendar.CalendarShareOptions calendarShareOptions) {
            this.f76275a = cVar;
            this.f76276b = calendarShareOptions;
        }
    }

    /* renamed from: a */
    private final void m113257a(Calendar.CalendarShareOptions calendarShareOptions) {
        String str;
        this.f76262e = RequestState.LOADING;
        UICallbackExecutor.executeDelayed(new RunnableC30483k(this), 300);
        CalendarSaveInfo.C15558a aVar = new CalendarSaveInfo.C15558a();
        IShareOptionFragmentData dVar = this.f76260c;
        if (dVar == null || (str = dVar.mo109360a()) == null) {
            str = "";
        }
        CalendarSaveInfo a = aVar.mo56439a(str).mo56436a(calendarShareOptions).build();
        C30484l lVar = new C30484l(this, calendarShareOptions);
        CalendarSDKService.Companion aVar2 = CalendarSDKService.f83473a;
        Intrinsics.checkExpressionValueIsNotNull(a, "calendarSaveInfo");
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(lVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar2.mo118926a(a, wrapAndAddGetDataCallback);
    }

    /* renamed from: b */
    public final String mo109969b(Calendar.ShareOption shareOption) {
        int i = C30485d.f76278b[shareOption.ordinal()];
        if (i == 1) {
            return C32634ae.m125182b(R.string.Calendar_Share_Private_Option);
        }
        if (i == 2) {
            return C32634ae.m125182b(R.string.Calendar_Share_Guest_Option);
        }
        if (i == 3) {
            return C32634ae.m125182b(R.string.Calendar_Share_Follower_Option);
        }
        if (i == 4) {
            return C32634ae.m125182b(R.string.Calendar_Share_Editor_Option);
        }
        if (i != 5) {
            return "";
        }
        return C32634ae.m125182b(R.string.Calendar_Share_Administrator_Option);
    }

    /* renamed from: a */
    public final void mo109967a(Calendar.ShareOption shareOption) {
        Calendar.CalendarShareOptions b;
        IShareOptionFragmentData dVar = this.f76260c;
        if (dVar != null && (b = dVar.mo109361b()) != null) {
            Calendar.CalendarShareOptions.C15506a newBuilder = b.newBuilder();
            if (this.f76258a) {
                newBuilder.f40972b = shareOption;
            } else {
                newBuilder.f40971a = shareOption;
            }
            Calendar.CalendarShareOptions a = newBuilder.build();
            IShareOptionFragmentData dVar2 = this.f76260c;
            if (dVar2 == null || !dVar2.mo109363d()) {
                Intrinsics.checkExpressionValueIsNotNull(a, "newShareOptionBuilder");
                m113257a(a);
                return;
            }
            EditShareOptionCallback bVar = this.f76259b;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "newShareOptionBuilder");
                bVar.mo109975a(a);
            }
            mo109970b();
            mo109972d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f76260c != null) {
            m113260e();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_tenant_share_authority, (ViewGroup) null);
    }

    /* renamed from: a */
    private final void m113258a(Calendar.ShareOption shareOption, ViewGroup viewGroup, TextView textView, TextView textView2) {
        textView.setTextColor(C32634ae.m125178a(R.color.text_title));
        textView2.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
        viewGroup.setOnClickListener(new View$OnClickListenerC30482j(this, shareOption));
    }

    /* renamed from: b */
    private final void m113259b(Calendar.ShareOption shareOption, ViewGroup viewGroup, TextView textView, TextView textView2) {
        textView.setTextColor(C32634ae.m125178a(R.color.text_disable));
        textView2.setTextColor(C32634ae.m125178a(R.color.text_disable));
        viewGroup.setOnClickListener(new View$OnClickListenerC30481i(this, shareOption));
    }
}
