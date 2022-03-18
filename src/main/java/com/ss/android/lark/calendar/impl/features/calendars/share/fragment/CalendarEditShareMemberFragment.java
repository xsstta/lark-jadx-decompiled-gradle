package com.ss.android.lark.calendar.impl.features.calendars.share.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarMemberCommit;
import com.bytedance.lark.pb.calendar.v1.CalendarMemberCommits;
import com.bytedance.lark.pb.calendar.v1.CalendarSaveInfo;
import com.google.firebase.messaging.Constants;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.editor.helper.CalendarEditorHelper;
import com.ss.android.lark.calendar.impl.features.calendars.share.data.RequestState;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30056v;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 F2\u00020\u0001:\u0001FB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010\u0017\u001a\n \u0018*\u0004\u0018\u00010\u00130\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J2\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u000101H\u0002J(\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u00162\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002J\b\u00104\u001a\u00020\u001cH\u0002J\b\u00105\u001a\u00020\u001cH\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u00108\u001a\u00020\u001cJ\u0010\u00109\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020\u001cH\u0002J\u0018\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000fH\u0002J\b\u0010?\u001a\u00020\u001cH\u0002J\u0010\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020BH\u0002J\u000e\u0010C\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020ER\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareMemberFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "()V", "editMemberFragmentData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentData;", "editMemberFragmentDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentDelegate;", "editMemberRequestState", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/data/RequestState;", "isLocalEdit", "", "()Z", "mRequestLoadingDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "memberData", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "getDeleteMemberSaveInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarSaveInfo;", "calendarId", "", "getEditMemberSaveInfo", "newAccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "getShareOptionString", "kotlin.jvm.PlatformType", "shareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$ShareOption;", "initListener", "", "initTitleBar", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEditMemberAccessRole", "onViewCreated", "view", "refreshAccessRoleDisable", "roleContainer", "roleTitleTv", "Landroid/widget/TextView;", "roleDesTv", "clickListener", "Lkotlin/Function0;", "refreshAccessRoleValid", "accessRole", "refreshCrossTenantTopRole", "refreshGroupMemberAccessRole", "refreshMemberNameContainer", "refreshSelectMemberAccessRole", "refreshView", "sendEditCalendarMemberRequest", "sendRemoveCalendarMemberRequest", "setMemberCommitTypeAndId", "memberCommitBuilder", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMemberCommit$Builder;", "member", "showLoadingDialog", "showToast", "strResID", "", "updateData", "calendarMember", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a */
public final class CalendarEditShareMemberFragment extends CalendarBaseFragment {

    /* renamed from: f */
    public static final Companion f76231f = new Companion(null);

    /* renamed from: a */
    public RequestLoadingDialog f76232a;

    /* renamed from: b */
    public IEditMemberFragmentData f76233b;

    /* renamed from: c */
    public IEditMemberFragmentDelegate f76234c;

    /* renamed from: d */
    public CalendarMember.C15546a f76235d;

    /* renamed from: e */
    public RequestState f76236e;

    /* renamed from: g */
    private HashMap f76237g;

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f76237g == null) {
            this.f76237g = new HashMap();
        }
        View view = (View) this.f76237g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76237g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f76237g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareMemberFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareMemberFragment;", "memberData", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "editMemberFragmentData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentData;", "editMemberFragmentDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentDelegate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CalendarEditShareMemberFragment mo109948a(CalendarMember.C15546a aVar, IEditMemberFragmentData aVar2, IEditMemberFragmentDelegate bVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "memberData");
            Intrinsics.checkParameterIsNotNull(aVar2, "editMemberFragmentData");
            Intrinsics.checkParameterIsNotNull(bVar, "editMemberFragmentDelegate");
            CalendarEditShareMemberFragment aVar3 = new CalendarEditShareMemberFragment();
            aVar3.f76235d = aVar;
            aVar3.f76233b = aVar2;
            aVar3.f76234c = bVar;
            return aVar3;
        }
    }

    /* renamed from: a */
    public final void mo109937a(CalendarMember calendarMember) {
        Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
        this.f76235d = calendarMember.newBuilder();
        mo109943e();
    }

    /* renamed from: g */
    public final void mo109945g() {
        IEditMemberFragmentDelegate bVar = this.f76234c;
        if (bVar != null) {
            bVar.mo109964a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$k */
    public static final class C30469k extends Lambda implements Function0<Unit> {
        final /* synthetic */ CalendarEditShareMemberFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30469k(CalendarEditShareMemberFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo109938b(R.string.Calendar_Share_UnableSetDefault);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$l */
    public static final class RunnableC30470l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76249a;

        RunnableC30470l(CalendarEditShareMemberFragment aVar) {
            this.f76249a = aVar;
        }

        public final void run() {
            if (this.f76249a.f76236e == RequestState.LOADING) {
                this.f76249a.mo109946h();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo109940b() {
        IEditMemberFragmentData aVar = this.f76233b;
        if (aVar == null || !aVar.mo109962d()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo109943e() {
        Calendar.AccessRole accessRole;
        m113223j();
        CalendarMember.C15546a aVar = this.f76235d;
        if (!(aVar == null || (accessRole = aVar.f41216d) == null)) {
            mo109939b(accessRole);
        }
        m113224k();
    }

    /* renamed from: c */
    public final void mo109941c() {
        IEditMemberFragmentData aVar = this.f76233b;
        if (aVar == null || !aVar.mo109963e()) {
            View a = mo109250a(R.id.titlePaddingView);
            Intrinsics.checkExpressionValueIsNotNull(a, "titlePaddingView");
            a.setVisibility(8);
        } else {
            View a2 = mo109250a(R.id.titlePaddingView);
            a2.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            View a3 = mo109250a(R.id.titlePaddingView);
            Intrinsics.checkExpressionValueIsNotNull(a3, "titlePaddingView");
            layoutParams.height = StatusBarUtil.getStatusBarHeight(a3.getContext());
        }
        mo109942d();
    }

    /* renamed from: d */
    public final void mo109942d() {
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setTitle(R.string.Calendar_Setting_SharingMembers);
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setMainTitleSize(17.0f);
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setLeftClickListener(new View$OnClickListenerC30466h(this));
    }

    /* renamed from: h */
    public final void mo109946h() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
            RequestLoadingDialog requestLoadingDialog = this.f76232a;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112585a(R.string.Calendar_Share_Modifying);
                return;
            }
            RequestLoadingDialog requestLoadingDialog2 = new RequestLoadingDialog(activity);
            requestLoadingDialog2.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
            requestLoadingDialog2.mo112585a(R.string.Calendar_Share_Modifying);
            this.f76232a = requestLoadingDialog2;
        }
    }

    /* renamed from: i */
    public final void mo109947i() {
        String a;
        boolean z;
        IEditMemberFragmentData aVar = this.f76233b;
        if (aVar != null && (a = aVar.mo109959a()) != null) {
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a = null;
            }
            if (a != null) {
                C30472n nVar = new C30472n(this);
                CalendarSDKService.Companion aVar2 = CalendarSDKService.f83473a;
                CalendarSaveInfo a2 = m113216a(a);
                UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(nVar);
                Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
                aVar2.mo118926a(a2, wrapAndAddGetDataCallback);
            }
        }
    }

    /* renamed from: f */
    public final void mo109944f() {
        ((RelativeLayout) mo109250a(R.id.ownerGroup)).setOnClickListener(new View$OnClickListenerC30460b(this));
        ((RelativeLayout) mo109250a(R.id.editorGroup)).setOnClickListener(new View$OnClickListenerC30461c(this));
        ((RelativeLayout) mo109250a(R.id.subscriberGroup)).setOnClickListener(new View$OnClickListenerC30462d(this));
        ((RelativeLayout) mo109250a(R.id.freeBusyContainer)).setOnClickListener(new View$OnClickListenerC30463e(this));
        ((TextView) mo109250a(R.id.deleteMember)).setOnClickListener(new View$OnClickListenerC30464f(this));
        ((SelectableRoundedImageView) mo109250a(R.id.memberAvatar)).setOnClickListener(new View$OnClickListenerC30465g(this));
    }

    /* renamed from: j */
    private final void m113223j() {
        CalendarMember.C15546a aVar = this.f76235d;
        if (aVar != null) {
            C30022a.f74882a.imageDependency().mo108246a(getContext(), aVar.f41220h, CalendarEditorHelper.f75910a.mo109490a(aVar), (SelectableRoundedImageView) mo109250a(R.id.memberAvatar), 48, 48);
            if (!TextUtils.isEmpty(aVar.f41221i)) {
                TextView textView = (TextView) mo109250a(R.id.memberName);
                Intrinsics.checkExpressionValueIsNotNull(textView, "memberName");
                textView.setText(aVar.f41221i);
            } else {
                TextView textView2 = (TextView) mo109250a(R.id.memberName);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "memberName");
                textView2.setText(aVar.f41218f);
            }
            Boolean bool = aVar.f41227o;
            Intrinsics.checkExpressionValueIsNotNull(bool, "memberData.is_cross_tenant");
            if (bool.booleanValue()) {
                TextView textView3 = (TextView) mo109250a(R.id.externalLabelTv);
                LarkNameTag.Companion fVar = LarkNameTag.f62897a;
                TextView textView4 = (TextView) mo109250a(R.id.externalLabelTv);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "externalLabelTv");
                Context context = textView4.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "externalLabelTv.context");
                LarkNameTag e = fVar.mo90057f(context).mo90029a(true).mo90027e();
                Intrinsics.checkExpressionValueIsNotNull(textView3, "this");
                e.mo90004a(textView3);
                TextView textView5 = (TextView) mo109250a(R.id.externalLabelTv);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "externalLabelTv");
                textView5.setVisibility(0);
                return;
            }
            TextView textView6 = (TextView) mo109250a(R.id.externalLabelTv);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "externalLabelTv");
            textView6.setVisibility(8);
        }
    }

    /* renamed from: l */
    private final void m113225l() {
        String str;
        CalendarMember.C15546a aVar = this.f76235d;
        if (aVar != null) {
            CalendarShareDataHelper aVar2 = CalendarShareDataHelper.f76316a;
            IEditMemberFragmentData aVar3 = this.f76233b;
            Calendar.CalendarShareOptions calendarShareOptions = null;
            if (aVar3 != null) {
                str = aVar3.mo109961c();
            } else {
                str = null;
            }
            boolean z = !aVar2.mo110024a(str, aVar);
            IEditMemberFragmentData aVar4 = this.f76233b;
            if (aVar4 != null) {
                calendarShareOptions = aVar4.mo109960b();
            }
            RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.ownerGroup);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "ownerGroup");
            TextView textView = (TextView) mo109250a(R.id.ownerTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ownerTv");
            TextView textView2 = (TextView) mo109250a(R.id.ownerInfoTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "ownerInfoTv");
            m113218a(relativeLayout, textView, textView2, new C30469k(this));
            if (!z || calendarShareOptions == null) {
                Calendar.AccessRole accessRole = Calendar.AccessRole.READER;
                RelativeLayout relativeLayout2 = (RelativeLayout) mo109250a(R.id.subscriberGroup);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "subscriberGroup");
                TextView textView3 = (TextView) mo109250a(R.id.subscriberTv);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "subscriberTv");
                TextView textView4 = (TextView) mo109250a(R.id.readerInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "readerInfoTv");
                m113219a(accessRole, relativeLayout2, textView3, textView4);
                Calendar.AccessRole accessRole2 = Calendar.AccessRole.WRITER;
                RelativeLayout relativeLayout3 = (RelativeLayout) mo109250a(R.id.editorGroup);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "editorGroup");
                TextView textView5 = (TextView) mo109250a(R.id.editorTv);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "editorTv");
                TextView textView6 = (TextView) mo109250a(R.id.editorInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "editorInfoTv");
                m113219a(accessRole2, relativeLayout3, textView5, textView6);
                return;
            }
            Calendar.ShareOption shareOption = calendarShareOptions.cross_top_share_option;
            if (shareOption != null) {
                int i = C30474b.f76254b[shareOption.ordinal()];
                if (i == 1) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) mo109250a(R.id.editorGroup);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "editorGroup");
                    TextView textView7 = (TextView) mo109250a(R.id.editorTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView7, "editorTv");
                    TextView textView8 = (TextView) mo109250a(R.id.editorInfoTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView8, "editorInfoTv");
                    m113221a(this, relativeLayout4, textView7, textView8, null, 8, null);
                } else if (i == 2 || i == 3) {
                    RelativeLayout relativeLayout5 = (RelativeLayout) mo109250a(R.id.editorGroup);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout5, "editorGroup");
                    TextView textView9 = (TextView) mo109250a(R.id.editorTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView9, "editorTv");
                    TextView textView10 = (TextView) mo109250a(R.id.editorInfoTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView10, "editorInfoTv");
                    m113221a(this, relativeLayout5, textView9, textView10, null, 8, null);
                    RelativeLayout relativeLayout6 = (RelativeLayout) mo109250a(R.id.subscriberGroup);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout6, "subscriberGroup");
                    TextView textView11 = (TextView) mo109250a(R.id.subscriberTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView11, "subscriberTv");
                    TextView textView12 = (TextView) mo109250a(R.id.readerInfoTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView12, "readerInfoTv");
                    m113221a(this, relativeLayout6, textView11, textView12, null, 8, null);
                }
            }
        }
    }

    /* renamed from: k */
    private final void m113224k() {
        String str;
        CalendarMember.C15546a aVar = this.f76235d;
        if (aVar == null) {
            return;
        }
        if (aVar.f41222j == CalendarMember.CalendarMemberType.GROUP) {
            m113225l();
            return;
        }
        CalendarShareDataHelper aVar2 = CalendarShareDataHelper.f76316a;
        IEditMemberFragmentData aVar3 = this.f76233b;
        Calendar.CalendarShareOptions calendarShareOptions = null;
        if (aVar3 != null) {
            str = aVar3.mo109961c();
        } else {
            str = null;
        }
        boolean z = !aVar2.mo110024a(str, aVar);
        IEditMemberFragmentData aVar4 = this.f76233b;
        if (aVar4 != null) {
            calendarShareOptions = aVar4.mo109960b();
        }
        if (!z || calendarShareOptions == null) {
            Calendar.AccessRole accessRole = Calendar.AccessRole.READER;
            RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.subscriberGroup);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "subscriberGroup");
            TextView textView = (TextView) mo109250a(R.id.subscriberTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "subscriberTv");
            TextView textView2 = (TextView) mo109250a(R.id.readerInfoTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "readerInfoTv");
            m113219a(accessRole, relativeLayout, textView, textView2);
            Calendar.AccessRole accessRole2 = Calendar.AccessRole.WRITER;
            RelativeLayout relativeLayout2 = (RelativeLayout) mo109250a(R.id.editorGroup);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "editorGroup");
            TextView textView3 = (TextView) mo109250a(R.id.editorTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "editorTv");
            TextView textView4 = (TextView) mo109250a(R.id.editorInfoTv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "editorInfoTv");
            m113219a(accessRole2, relativeLayout2, textView3, textView4);
            Calendar.AccessRole accessRole3 = Calendar.AccessRole.OWNER;
            RelativeLayout relativeLayout3 = (RelativeLayout) mo109250a(R.id.ownerGroup);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "ownerGroup");
            TextView textView5 = (TextView) mo109250a(R.id.ownerTv);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "ownerTv");
            TextView textView6 = (TextView) mo109250a(R.id.ownerInfoTv);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "ownerInfoTv");
            m113219a(accessRole3, relativeLayout3, textView5, textView6);
            return;
        }
        Calendar.ShareOption shareOption = calendarShareOptions.cross_top_share_option;
        if (shareOption != null) {
            int i = C30474b.f76253a[shareOption.ordinal()];
            if (i == 1) {
                RelativeLayout relativeLayout4 = (RelativeLayout) mo109250a(R.id.ownerGroup);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "ownerGroup");
                TextView textView7 = (TextView) mo109250a(R.id.ownerTv);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "ownerTv");
                TextView textView8 = (TextView) mo109250a(R.id.ownerInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "ownerInfoTv");
                m113221a(this, relativeLayout4, textView7, textView8, null, 8, null);
            } else if (i == 2) {
                RelativeLayout relativeLayout5 = (RelativeLayout) mo109250a(R.id.ownerGroup);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout5, "ownerGroup");
                TextView textView9 = (TextView) mo109250a(R.id.ownerTv);
                Intrinsics.checkExpressionValueIsNotNull(textView9, "ownerTv");
                TextView textView10 = (TextView) mo109250a(R.id.ownerInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView10, "ownerInfoTv");
                m113221a(this, relativeLayout5, textView9, textView10, null, 8, null);
                RelativeLayout relativeLayout6 = (RelativeLayout) mo109250a(R.id.editorGroup);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout6, "editorGroup");
                TextView textView11 = (TextView) mo109250a(R.id.editorTv);
                Intrinsics.checkExpressionValueIsNotNull(textView11, "editorTv");
                TextView textView12 = (TextView) mo109250a(R.id.editorInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView12, "editorInfoTv");
                m113221a(this, relativeLayout6, textView11, textView12, null, 8, null);
            } else if (i == 3 || i == 4) {
                RelativeLayout relativeLayout7 = (RelativeLayout) mo109250a(R.id.ownerGroup);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout7, "ownerGroup");
                TextView textView13 = (TextView) mo109250a(R.id.ownerTv);
                Intrinsics.checkExpressionValueIsNotNull(textView13, "ownerTv");
                TextView textView14 = (TextView) mo109250a(R.id.ownerInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView14, "ownerInfoTv");
                m113221a(this, relativeLayout7, textView13, textView14, null, 8, null);
                RelativeLayout relativeLayout8 = (RelativeLayout) mo109250a(R.id.editorGroup);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout8, "editorGroup");
                TextView textView15 = (TextView) mo109250a(R.id.editorTv);
                Intrinsics.checkExpressionValueIsNotNull(textView15, "editorTv");
                TextView textView16 = (TextView) mo109250a(R.id.editorInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView16, "editorInfoTv");
                m113221a(this, relativeLayout8, textView15, textView16, null, 8, null);
                RelativeLayout relativeLayout9 = (RelativeLayout) mo109250a(R.id.subscriberGroup);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout9, "subscriberGroup");
                TextView textView17 = (TextView) mo109250a(R.id.subscriberTv);
                Intrinsics.checkExpressionValueIsNotNull(textView17, "subscriberTv");
                TextView textView18 = (TextView) mo109250a(R.id.readerInfoTv);
                Intrinsics.checkExpressionValueIsNotNull(textView18, "readerInfoTv");
                m113221a(this, relativeLayout9, textView17, textView18, null, 8, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$b */
    public static final class View$OnClickListenerC30460b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76238a;

        View$OnClickListenerC30460b(CalendarEditShareMemberFragment aVar) {
            this.f76238a = aVar;
        }

        public final void onClick(View view) {
            this.f76238a.mo109936a(Calendar.AccessRole.OWNER);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$c */
    public static final class View$OnClickListenerC30461c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76239a;

        View$OnClickListenerC30461c(CalendarEditShareMemberFragment aVar) {
            this.f76239a = aVar;
        }

        public final void onClick(View view) {
            this.f76239a.mo109936a(Calendar.AccessRole.WRITER);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$d */
    public static final class View$OnClickListenerC30462d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76240a;

        View$OnClickListenerC30462d(CalendarEditShareMemberFragment aVar) {
            this.f76240a = aVar;
        }

        public final void onClick(View view) {
            this.f76240a.mo109936a(Calendar.AccessRole.READER);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$e */
    public static final class View$OnClickListenerC30463e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76241a;

        View$OnClickListenerC30463e(CalendarEditShareMemberFragment aVar) {
            this.f76241a = aVar;
        }

        public final void onClick(View view) {
            this.f76241a.mo109936a(Calendar.AccessRole.FREE_BUSY_READER);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$h */
    public static final class View$OnClickListenerC30466h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76244a;

        View$OnClickListenerC30466h(CalendarEditShareMemberFragment aVar) {
            this.f76244a = aVar;
        }

        public final void onClick(View view) {
            this.f76244a.mo109945g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$j */
    public static final class View$OnClickListenerC30468j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76247a;

        /* renamed from: b */
        final /* synthetic */ Calendar.AccessRole f76248b;

        View$OnClickListenerC30468j(CalendarEditShareMemberFragment aVar, Calendar.AccessRole accessRole) {
            this.f76247a = aVar;
            this.f76248b = accessRole;
        }

        public final void onClick(View view) {
            this.f76247a.mo109936a(this.f76248b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareMemberFragment$sendRemoveCalendarMemberRequest$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$n */
    public static final class C30472n implements IGetDataCallback<Object> {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76252a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30472n(CalendarEditShareMemberFragment aVar) {
            this.f76252a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76252a.mo109938b(R.string.Calendar_Share_UnableToRemove);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(Object obj) {
            IEditMemberFragmentDelegate bVar;
            CalendarMember.C15546a aVar = this.f76252a.f76235d;
            if (!(aVar == null || (bVar = this.f76252a.f76234c) == null)) {
                bVar.mo109965a(aVar);
            }
            this.f76252a.mo109945g();
            this.f76252a.mo109938b(R.string.Calendar_Share_Removed);
        }
    }

    /* renamed from: b */
    public final void mo109938b(int i) {
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "it");
            UDToast.show(context, i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$f */
    public static final class View$OnClickListenerC30464f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76242a;

        View$OnClickListenerC30464f(CalendarEditShareMemberFragment aVar) {
            this.f76242a = aVar;
        }

        public final void onClick(View view) {
            IEditMemberFragmentDelegate bVar;
            if (!this.f76242a.mo109940b()) {
                this.f76242a.mo109947i();
                return;
            }
            CalendarMember.C15546a aVar = this.f76242a.f76235d;
            if (aVar != null && (bVar = this.f76242a.f76234c) != null) {
                bVar.mo109965a(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$g */
    public static final class View$OnClickListenerC30465g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76243a;

        View$OnClickListenerC30465g(CalendarEditShareMemberFragment aVar) {
            this.f76243a = aVar;
        }

        public final void onClick(View view) {
            CalendarMember.CalendarMemberType calendarMemberType;
            String str;
            CalendarMember.C15546a aVar = this.f76243a.f76235d;
            if (aVar != null) {
                calendarMemberType = aVar.f41222j;
            } else {
                calendarMemberType = null;
            }
            if (calendarMemberType == CalendarMember.CalendarMemberType.INDIVIDUAL) {
                AbstractC30056v oldModuleDependency = C30022a.f74882a.oldModuleDependency();
                SelectableRoundedImageView selectableRoundedImageView = (SelectableRoundedImageView) this.f76243a.mo109250a(R.id.memberAvatar);
                Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView, "memberAvatar");
                Context context = selectableRoundedImageView.getContext();
                CalendarMember.C15546a aVar2 = this.f76243a.f76235d;
                if (aVar2 == null || (str = aVar2.f41215c) == null) {
                    str = "";
                }
                oldModuleDependency.mo108285a(context, str, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a */
    private final CalendarSaveInfo m113216a(String str) {
        CalendarMemberCommits.C15554a aVar = new CalendarMemberCommits.C15554a();
        CalendarMember.C15546a aVar2 = this.f76235d;
        if (aVar2 != null) {
            if (aVar2.f41222j == CalendarMember.CalendarMemberType.GROUP) {
                aVar.mo56427d(CollectionsKt.listOf(aVar2.f41223k));
            } else {
                aVar.mo56426c(CollectionsKt.listOf(aVar2.f41215c));
            }
        }
        CalendarSaveInfo a = new CalendarSaveInfo.C15558a().mo56439a(str).mo56437a(aVar.build()).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarSaveInfo.Builder…d())\n            .build()");
        return a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$i */
    public static final class View$OnClickListenerC30467i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76245a;

        /* renamed from: b */
        final /* synthetic */ Function0 f76246b;

        View$OnClickListenerC30467i(CalendarEditShareMemberFragment aVar, Function0 function0) {
            this.f76245a = aVar;
            this.f76246b = function0;
        }

        public final void onClick(View view) {
            Calendar.ShareOption shareOption;
            Calendar.CalendarShareOptions b;
            Function0 function0 = this.f76246b;
            if (function0 == null || ((Unit) function0.invoke()) == null) {
                AbstractC30039ah utilsDependency = C30022a.f74882a.utilsDependency();
                CalendarEditShareMemberFragment aVar = this.f76245a;
                IEditMemberFragmentData aVar2 = aVar.f76233b;
                if (aVar2 == null || (b = aVar2.mo109960b()) == null) {
                    shareOption = null;
                } else {
                    shareOption = b.cross_top_share_option;
                }
                String a = utilsDependency.mo108195a(R.string.Calendar_Share_MaxPermissionSetAs, "MaxPermission", aVar.mo109935a(shareOption));
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                Context context = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                Intrinsics.checkExpressionValueIsNotNull(a, "tipStr");
                UDToast.show(context, a);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareMemberFragment$sendEditCalendarMemberRequest$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a$m */
    public static final class C30471m implements IGetDataCallback<Object> {

        /* renamed from: a */
        final /* synthetic */ CalendarEditShareMemberFragment f76250a;

        /* renamed from: b */
        final /* synthetic */ Calendar.AccessRole f76251b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            RequestLoadingDialog requestLoadingDialog;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76250a.f76236e = RequestState.FAILED;
            if (errorResult.getErrorCode() == 8050) {
                RequestLoadingDialog requestLoadingDialog2 = this.f76250a.f76232a;
                if (requestLoadingDialog2 != null) {
                    requestLoadingDialog2.hide();
                }
                Context context = this.f76250a.getContext();
                if (context != null) {
                    Intrinsics.checkExpressionValueIsNotNull(context, "it");
                    UDDialogBuilder eVar = new UDDialogBuilder(context);
                    String displayMsg = errorResult.getDisplayMsg();
                    if (displayMsg == null) {
                        displayMsg = "";
                    }
                    ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(displayMsg)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null)).show();
                    return;
                }
            }
            RequestLoadingDialog requestLoadingDialog3 = this.f76250a.f76232a;
            if (requestLoadingDialog3 != null && requestLoadingDialog3.isShowing() && (requestLoadingDialog = this.f76250a.f76232a) != null) {
                requestLoadingDialog.mo112592c(R.string.Calendar_Share_UnableToModify);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(Object obj) {
            RequestLoadingDialog requestLoadingDialog;
            this.f76250a.f76236e = RequestState.SUCCESS;
            CalendarMember.C15546a aVar = this.f76250a.f76235d;
            if (aVar != null) {
                aVar.f41216d = this.f76251b;
                IEditMemberFragmentDelegate bVar = this.f76250a.f76234c;
                if (bVar != null) {
                    Calendar.AccessRole accessRole = aVar.f41216d;
                    Intrinsics.checkExpressionValueIsNotNull(accessRole, "it.access_role");
                    bVar.mo109966a(aVar, accessRole);
                }
            }
            this.f76250a.mo109939b(this.f76251b);
            RequestLoadingDialog requestLoadingDialog2 = this.f76250a.f76232a;
            if (!(requestLoadingDialog2 == null || !requestLoadingDialog2.isShowing() || (requestLoadingDialog = this.f76250a.f76232a) == null)) {
                requestLoadingDialog.mo112593d(R.string.Calendar_Share_Modified);
            }
            this.f76250a.mo109945g();
        }

        C30471m(CalendarEditShareMemberFragment aVar, Calendar.AccessRole accessRole) {
            this.f76250a = aVar;
            this.f76251b = accessRole;
        }
    }

    /* renamed from: c */
    private final void m113222c(Calendar.AccessRole accessRole) {
        String a;
        boolean z;
        IEditMemberFragmentData aVar = this.f76233b;
        if (aVar != null && (a = aVar.mo109959a()) != null) {
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a = null;
            }
            if (a != null) {
                this.f76236e = RequestState.LOADING;
                UICallbackExecutor.executeDelayed(new RunnableC30470l(this), 300);
                C30471m mVar = new C30471m(this, accessRole);
                CalendarSDKService.Companion aVar2 = CalendarSDKService.f83473a;
                CalendarSaveInfo a2 = m113217a(a, accessRole);
                UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(mVar);
                Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
                aVar2.mo118926a(a2, wrapAndAddGetDataCallback);
            }
        }
    }

    /* renamed from: b */
    public final void mo109939b(Calendar.AccessRole accessRole) {
        UDCheckBox uDCheckBox = (UDCheckBox) mo109250a(R.id.ownerImage);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ownerImage");
        uDCheckBox.setChecked(false);
        UDCheckBox uDCheckBox2 = (UDCheckBox) mo109250a(R.id.editorImage);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "editorImage");
        uDCheckBox2.setChecked(false);
        UDCheckBox uDCheckBox3 = (UDCheckBox) mo109250a(R.id.subscriberImage);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "subscriberImage");
        uDCheckBox3.setChecked(false);
        UDCheckBox uDCheckBox4 = (UDCheckBox) mo109250a(R.id.freeBusyImage);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "freeBusyImage");
        uDCheckBox4.setChecked(false);
        int i = C30474b.f76256d[accessRole.ordinal()];
        if (i == 1) {
            UDCheckBox uDCheckBox5 = (UDCheckBox) mo109250a(R.id.freeBusyImage);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox5, "freeBusyImage");
            uDCheckBox5.setChecked(true);
        } else if (i == 2) {
            UDCheckBox uDCheckBox6 = (UDCheckBox) mo109250a(R.id.subscriberImage);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox6, "subscriberImage");
            uDCheckBox6.setChecked(true);
        } else if (i == 3) {
            UDCheckBox uDCheckBox7 = (UDCheckBox) mo109250a(R.id.editorImage);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox7, "editorImage");
            uDCheckBox7.setChecked(true);
        } else if (i == 4) {
            UDCheckBox uDCheckBox8 = (UDCheckBox) mo109250a(R.id.ownerImage);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox8, "ownerImage");
            uDCheckBox8.setChecked(true);
        }
    }

    /* renamed from: a */
    public final String mo109935a(Calendar.ShareOption shareOption) {
        if (shareOption != null) {
            int i = C30474b.f76255c[shareOption.ordinal()];
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
            if (i == 5) {
                return C32634ae.m125182b(R.string.Calendar_Share_Administrator_Option);
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo109936a(Calendar.AccessRole accessRole) {
        CalendarMember.C15546a aVar = this.f76235d;
        if (aVar == null) {
            return;
        }
        if (!mo109940b()) {
            m113222c(accessRole);
            return;
        }
        aVar.f41216d = accessRole;
        mo109939b(accessRole);
        IEditMemberFragmentDelegate bVar = this.f76234c;
        if (bVar != null) {
            bVar.mo109966a(aVar, accessRole);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (this.f76233b != null) {
            mo109941c();
            mo109944f();
            mo109943e();
        }
    }

    /* renamed from: a */
    private final CalendarSaveInfo m113217a(String str, Calendar.AccessRole accessRole) {
        CalendarMemberCommit.C15552a aVar = new CalendarMemberCommit.C15552a();
        CalendarMember.C15546a aVar2 = this.f76235d;
        if (aVar2 != null) {
            m113220a(aVar, aVar2);
        }
        aVar.mo56414a(Calendar.AccessRole.fromValue(accessRole.getValue()));
        CalendarSaveInfo a = new CalendarSaveInfo.C15558a().mo56439a(str).mo56437a(new CalendarMemberCommits.C15554a().mo56425b(CollectionsKt.listOf(aVar.build())).build()).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarSaveInfo.Builder…ts(memberCommits).build()");
        return a;
    }

    /* renamed from: a */
    private final void m113220a(CalendarMemberCommit.C15552a aVar, CalendarMember.C15546a aVar2) {
        if (aVar2.f41222j == CalendarMember.CalendarMemberType.GROUP) {
            aVar.mo56416a(new CalendarMemberCommit.Group.C15548a().mo56404a(aVar2.f41223k).build());
            aVar.mo56415a(CalendarMemberCommit.CalendarMemberType.GROUP);
            return;
        }
        aVar.mo56417a(new CalendarMemberCommit.User.C15550a().mo56409a(aVar2.f41215c).build());
        aVar.mo56415a(CalendarMemberCommit.CalendarMemberType.INDIVIDUAL);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_edit_share_member_layout, (ViewGroup) null);
    }

    /* renamed from: a */
    private final void m113218a(ViewGroup viewGroup, TextView textView, TextView textView2, Function0<Unit> function0) {
        textView.setTextColor(C32634ae.m125178a(R.color.text_disable));
        textView2.setTextColor(C32634ae.m125178a(R.color.text_disable));
        viewGroup.setOnClickListener(new View$OnClickListenerC30467i(this, function0));
    }

    /* renamed from: a */
    private final void m113219a(Calendar.AccessRole accessRole, ViewGroup viewGroup, TextView textView, TextView textView2) {
        textView.setTextColor(C32634ae.m125178a(R.color.text_title));
        textView2.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
        viewGroup.setOnClickListener(new View$OnClickListenerC30468j(this, accessRole));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.calendars.share.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m113221a(CalendarEditShareMemberFragment aVar, ViewGroup viewGroup, TextView textView, TextView textView2, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        aVar.m113218a(viewGroup, textView, textView2, function0);
    }
}
