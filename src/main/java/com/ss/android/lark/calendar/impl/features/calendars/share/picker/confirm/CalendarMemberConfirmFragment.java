package com.ss.android.lark.calendar.impl.features.calendars.share.picker.confirm;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarEditShareMemberFragment;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarMemberPickerData;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarShareExtraParam;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.vesdk.C64034n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n*\u0002\b&\u0018\u0000 E2\u00020\u0001:\u0002EFB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0017\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0002\u0010$J\r\u0010%\u001a\u00020&H\u0002¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u001eH\u0002J\u0012\u0010)\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0002J\u0006\u0010.\u001a\u00020\rJ&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00109\u001a\u00020\u001eH\u0002J>\u0010:\u001a\u00020\u001e2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00172\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u0016H\u0002J\u0012\u0010A\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010B\u001a\u00020\u001eH\u0002J\u0010\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020#H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006G"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "()V", "calendarPickerParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "calendarShareParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "editShareMemberFragmentDelete", "com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$editShareMemberFragmentDelete$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$editShareMemberFragmentDelete$1;", "fragmentAction", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$MemberConfirmAction;", "isCalendarEditShareFragmentShow", "", "mCalendarEditShareMemberFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareMemberFragment;", "mMemberAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter;", "mRequestLoadingDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "selectedChatters", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "selectedGroupIds", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarShareMemberViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarShareMemberViewModel;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "checkFinishSelect", "newMemberSize", "", "(Ljava/lang/Integer;)V", "getEditMemberFragmentData", "com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$getEditMemberFragmentData$1", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$getEditMemberFragmentData$1;", "hideCalendarEditShareMemberFragment", "hideFragment", "initLiveData", "initMVVM", "initRecycleView", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "quitFragment", "setData", "showCalendarEditShareMemberFragment", "calendarMember", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "showErrTipDialog", "showErrorDialog", "errorMessage", "showFragment", "showLoadingDialog", "updateSelectCount", "memberCount", "Companion", "MemberConfirmAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a */
public final class CalendarMemberConfirmFragment extends CalendarBaseFragment {

    /* renamed from: h */
    public static final Companion f76341h = new Companion(null);

    /* renamed from: a */
    public CalendarMemberPickerData f76342a;

    /* renamed from: b */
    public CalendarShareExtraParam f76343b;

    /* renamed from: c */
    public ArrayList<String> f76344c;

    /* renamed from: d */
    public ArrayList<String> f76345d;

    /* renamed from: e */
    public MemberConfirmAction f76346e;

    /* renamed from: f */
    public RequestLoadingDialog f76347f;

    /* renamed from: g */
    public CalendarShareMemberAdapter f76348g;

    /* renamed from: i */
    private CalendarEditShareMemberFragment f76349i;

    /* renamed from: j */
    private boolean f76350j;

    /* renamed from: k */
    private final C30517c f76351k = new C30517c(this);

    /* renamed from: l */
    private HashMap f76352l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$MemberConfirmAction;", "", "onBackPressed", "", "curUserIds", "", "", "curGroupIds", "onShareSuccess", "sharedMember", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$b */
    public interface MemberConfirmAction {
        /* renamed from: a */
        void mo110062a(List<CalendarMember.C15546a> list);

        /* renamed from: a */
        void mo110063a(List<String> list, List<String> list2);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f76352l == null) {
            this.f76352l = new HashMap();
        }
        View view = (View) this.f76352l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76352l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f76352l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment;", "calendarPickerParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "selectedChatters", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "selectedGroupIds", "fragmentAction", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$MemberConfirmAction;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CalendarMemberConfirmFragment mo110073a(CalendarMemberPickerData calendarMemberPickerData, ArrayList<String> arrayList, ArrayList<String> arrayList2, MemberConfirmAction bVar) {
            CalendarShareExtraParam calendarShareExtraParam;
            CalendarMemberConfirmFragment aVar = new CalendarMemberConfirmFragment();
            aVar.f76342a = calendarMemberPickerData;
            if (calendarMemberPickerData != null) {
                calendarShareExtraParam = calendarMemberPickerData.getCalendarShareExtraParam();
            } else {
                calendarShareExtraParam = null;
            }
            aVar.f76343b = calendarShareExtraParam;
            aVar.f76344c = arrayList;
            aVar.f76345d = arrayList2;
            aVar.f76346e = bVar;
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$editShareMemberFragmentDelete$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentDelegate;", "onBackPressed", "", "onDeleteMember", "member", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "onEditMemberAccessRole", "newAccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$c */
    public static final class C30517c implements IEditMemberFragmentDelegate {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76353a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$c$a */
        static final class RunnableC30518a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30517c f76354a;

            RunnableC30518a(C30517c cVar) {
                this.f76354a = cVar;
            }

            public final void run() {
                this.f76354a.f76353a.mo110072e();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$c$b */
        static final class RunnableC30519b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30517c f76355a;

            RunnableC30519b(C30517c cVar) {
                this.f76355a = cVar;
            }

            public final void run() {
                this.f76355a.f76353a.mo110072e();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate
        /* renamed from: a */
        public void mo109964a() {
            this.f76353a.mo110072e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30517c(CalendarMemberConfirmFragment aVar) {
            this.f76353a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate
        /* renamed from: a */
        public void mo109965a(CalendarMember.C15546a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "member");
            this.f76353a.mo110068b().onDeleteMemberClicked(aVar);
            UICallbackExecutor.executeDelayed(new RunnableC30518a(this), 400);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate
        /* renamed from: a */
        public void mo109966a(CalendarMember.C15546a aVar, Calendar.AccessRole accessRole) {
            Intrinsics.checkParameterIsNotNull(aVar, "member");
            Intrinsics.checkParameterIsNotNull(accessRole, "newAccessRole");
            this.f76353a.mo110068b().onEditMemberAccessRole(aVar, accessRole);
            UICallbackExecutor.executeDelayed(new RunnableC30519b(this), 400);
        }
    }

    /* renamed from: k */
    private final C30520d m113402k() {
        return new C30520d(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$getEditMemberFragmentData$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentData;", "getCalendarId", "", "getCalendarShareOptions", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "getCalendarTenantId", "isLocalEdit", "", "needAdjustTopPadding", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$d */
    public static final class C30520d implements IEditMemberFragmentData {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76356a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: d */
        public boolean mo109962d() {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: e */
        public boolean mo109963e() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: a */
        public String mo109959a() {
            String calendarId;
            CalendarShareExtraParam calendarShareExtraParam = this.f76356a.f76343b;
            if (calendarShareExtraParam == null || (calendarId = calendarShareExtraParam.getCalendarId()) == null) {
                return "";
            }
            return calendarId;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: b */
        public Calendar.CalendarShareOptions mo109960b() {
            CalendarShareExtraParam calendarShareExtraParam = this.f76356a.f76343b;
            if (calendarShareExtraParam != null) {
                return calendarShareExtraParam.getCalendarShareOptions();
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: c */
        public String mo109961c() {
            String calendarTenantId;
            CalendarShareExtraParam calendarShareExtraParam = this.f76356a.f76343b;
            if (calendarShareExtraParam == null || (calendarTenantId = calendarShareExtraParam.getCalendarTenantId()) == null) {
                return "";
            }
            return calendarTenantId;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30520d(CalendarMemberConfirmFragment aVar) {
            this.f76356a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$initRecycleView$1$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter$MemberListener;", "getCalendarOwnerId", "", "onMemberContainerClicked", "", "calendarMember", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$g */
    public static final class C30523g implements CalendarShareMemberAdapter.MemberListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76359a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter.MemberListener
        /* renamed from: a */
        public String mo109903a() {
            CalendarShareExtraParam calendarShareExtraParam = this.f76359a.f76343b;
            if (calendarShareExtraParam != null) {
                return calendarShareExtraParam.getCalendarOwnerId();
            }
            return null;
        }

        C30523g(CalendarMemberConfirmFragment aVar) {
            this.f76359a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter.MemberListener
        /* renamed from: a */
        public void mo109904a(CalendarMember calendarMember) {
            String str;
            Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
            this.f76359a.mo110064a(calendarMember);
            CalendarShareExtraParam calendarShareExtraParam = this.f76359a.f76343b;
            if (calendarShareExtraParam != null) {
                str = calendarShareExtraParam.getCalendarId();
            } else {
                str = null;
            }
            C32502i.m124376a(str, "individual", false, false, 12, null);
        }
    }

    /* renamed from: e */
    public final void mo110072e() {
        m113396c(this.f76349i);
        this.f76350j = false;
    }

    /* renamed from: f */
    private final void m113397f() {
        m113399h();
        m113398g();
        mo110068b().create(this.f76342a, this.f76344c, this.f76345d);
    }

    /* renamed from: b */
    public final CalendarShareMemberViewModel mo110068b() {
        AbstractC1142af a = new C1144ai(this).mo6005a(CalendarShareMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(this).…berViewModel::class.java)");
        return (CalendarShareMemberViewModel) a;
    }

    /* renamed from: g */
    private final void m113398g() {
        mo110068b().getShowCalendarMembers().mo5923a(getViewLifecycleOwner(), new C30521e(this));
        mo110068b().getShareStateLiveData().mo5923a(getViewLifecycleOwner(), new C30522f(this));
    }

    /* renamed from: j */
    private final void m113401j() {
        if (this.f76350j) {
            mo110072e();
        }
        MemberConfirmAction bVar = this.f76346e;
        if (bVar != null) {
            bVar.mo110063a(mo110068b().getUserIds(), mo110068b().getChatIds());
        }
    }

    /* renamed from: d */
    public final boolean mo110071d() {
        if (this.f76350j) {
            mo110072e();
            return true;
        }
        MemberConfirmAction bVar = this.f76346e;
        if (bVar != null) {
            bVar.mo110063a(mo110068b().getUserIds(), mo110068b().getChatIds());
        }
        return true;
    }

    /* renamed from: i */
    private final void m113400i() {
        CalendarShareMemberAdapter bVar = new CalendarShareMemberAdapter();
        bVar.mo109901a(new C30523g(this));
        this.f76348g = bVar;
        RecyclerView recyclerView = (RecyclerView) mo109250a(R.id.sharedMemberRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "sharedMemberRv");
        recyclerView.setAdapter(this.f76348g);
        RecyclerView recyclerView2 = (RecyclerView) mo109250a(R.id.sharedMemberRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "sharedMemberRv");
        RecyclerView recyclerView3 = (RecyclerView) mo109250a(R.id.sharedMemberRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "sharedMemberRv");
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
        ((RecyclerView) mo109250a(R.id.sharedMemberRv)).addOnScrollListener(new C30524h(this));
    }

    /* renamed from: c */
    public final void mo110070c() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
            RequestLoadingDialog requestLoadingDialog = this.f76347f;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112585a(R.string.Calendar_Share_SharingToast);
                return;
            }
            RequestLoadingDialog requestLoadingDialog2 = new RequestLoadingDialog(activity);
            requestLoadingDialog2.mo112585a(R.string.Calendar_Share_SharingToast);
            this.f76347f = requestLoadingDialog2;
        }
    }

    /* renamed from: h */
    private final void m113399h() {
        m113400i();
        RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.shareActionContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "shareActionContainer");
        relativeLayout.setVisibility(0);
        ((TextView) mo109250a(R.id.shareActionTv)).setOnClickListener(new View$OnClickListenerC30525i(this));
        ((EditText) mo109250a(R.id.commentEditText)).addTextChangedListener(new C30526j(this));
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC30527k(this));
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setTitle(CalendarMemberPickerData.Companion.mo110155a(this.f76342a));
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.titleBar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "titleBar");
        Context context = commonTitleBar.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "titleBar.context");
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setSubTitleColor(UDColorUtils.getColor(context, R.color.text_caption));
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setSubTitleSize(10.0f);
        CalendarMemberPickerData calendarMemberPickerData = this.f76342a;
        if (calendarMemberPickerData != null && calendarMemberPickerData.getShownNextActionAtTop()) {
            CommonTitleBar commonTitleBar2 = (CommonTitleBar) mo109250a(R.id.titleBar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar2, "titleBar");
            ((CommonTitleBar) mo109250a(R.id.titleBar)).addAction(new C30528l(this, commonTitleBar2.getContext().getString(R.string.Calendar_Edit_Confirm), R.color.ud_B500));
            TextView textView = (TextView) mo109250a(R.id.selectedCountTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "selectedCountTv");
            textView.setVisibility(8);
            TextView textView2 = (TextView) mo109250a(R.id.shareActionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "shareActionTv");
            textView2.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$initRecycleView$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$h */
    public static final class C30524h extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76360a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30524h(CalendarMemberConfirmFragment aVar) {
            this.f76360a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                KeyboardUtils.hideKeyboard(this.f76360a.getContext());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$initView$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$j */
    public static final class C30526j implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76362a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30526j(CalendarMemberConfirmFragment aVar) {
            this.f76362a = aVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            CalendarShareMemberViewModel b = this.f76362a.mo110068b();
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            b.onEditComment(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$k */
    public static final class View$OnClickListenerC30527k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76363a;

        View$OnClickListenerC30527k(CalendarMemberConfirmFragment aVar) {
            this.f76363a = aVar;
        }

        public final void onClick(View view) {
            this.f76363a.mo110071d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$i */
    public static final class View$OnClickListenerC30525i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76361a;

        View$OnClickListenerC30525i(CalendarMemberConfirmFragment aVar) {
            this.f76361a = aVar;
        }

        public final void onClick(View view) {
            this.f76361a.mo110068b().onShareActionClicked();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/confirm/CalendarMemberConfirmFragment$initView$4", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$l */
    public static final class C30528l extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76364a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            this.f76364a.mo110068b().onShareActionClicked();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30528l(CalendarMemberConfirmFragment aVar, String str, int i) {
            super(str, i);
            this.f76364a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo110065a(Integer num) {
        if (num != null && num.intValue() == 0) {
            m113401j();
        }
    }

    /* renamed from: a */
    private final void m113394a(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(R.id.fragmentContainer, fragment, (String) null).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: b */
    private final void m113395b(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: c */
    private final void m113396c(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$e */
    public static final class C30521e<T> implements AbstractC1178x<List<CalendarMember.C15546a>> {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76357a;

        C30521e(CalendarMemberConfirmFragment aVar) {
            this.f76357a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(List<CalendarMember.C15546a> list) {
            Integer num;
            CalendarShareMemberAdapter bVar = this.f76357a.f76348g;
            int i = 0;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                List<CalendarMember.C15546a> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().build());
                }
                bVar.mo109902a(arrayList, false);
            }
            CalendarShareMemberAdapter bVar2 = this.f76357a.f76348g;
            if (bVar2 != null) {
                bVar2.notifyDataSetChanged();
            }
            CalendarMemberConfirmFragment aVar = this.f76357a;
            if (list != null) {
                i = list.size();
            }
            aVar.mo110069b(i);
            CalendarMemberConfirmFragment aVar2 = this.f76357a;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            aVar2.mo110065a(num);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.a.a$f */
    public static final class C30522f<T> implements AbstractC1178x<ShareState> {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberConfirmFragment f76358a;

        C30522f(CalendarMemberConfirmFragment aVar) {
            this.f76358a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ShareState shareState) {
            int i = C30529b.f76365a[shareState.mo110170a().ordinal()];
            if (i == 1) {
                this.f76358a.mo110070c();
            } else if (i == 2) {
                RequestLoadingDialog requestLoadingDialog = this.f76358a.f76347f;
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.mo112593d(R.string.Calendar_Share_SharedToast);
                }
                MemberConfirmAction bVar = this.f76358a.f76346e;
                if (bVar != null) {
                    bVar.mo110062a(this.f76358a.mo110068b().getShowCalendarMembers().mo5927b());
                }
            } else if (i == 3) {
                RequestLoadingDialog requestLoadingDialog2 = this.f76358a.f76347f;
                if (requestLoadingDialog2 != null) {
                    requestLoadingDialog2.hide();
                }
                CalendarMemberConfirmFragment aVar = this.f76358a;
                boolean c = shareState.mo110172c();
                String b = shareState.mo110171b();
                if (b == null) {
                    b = "";
                }
                aVar.mo110067a(c, b);
            }
        }
    }

    /* renamed from: b */
    public final void mo110069b(int i) {
        int i2;
        Drawable mutate;
        String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_ChatFindTime_Selected, C64034n.f161683a, String.valueOf(i));
        TextView textView = (TextView) mo109250a(R.id.selectedCountTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "selectedCountTv");
        textView.setText(a);
        if (i > 0) {
            i2 = R.color.primary_pri_500;
        } else {
            i2 = R.color.text_disable;
        }
        TextView textView2 = (TextView) mo109250a(R.id.shareActionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "shareActionTv");
        Drawable background = textView2.getBackground();
        if (background != null && (mutate = background.mutate()) != null) {
            mutate.setTint(C32634ae.m125178a(i2));
        }
    }

    /* renamed from: a */
    public final void mo110064a(CalendarMember calendarMember) {
        if (this.f76343b != null) {
            CalendarEditShareMemberFragment aVar = this.f76349i;
            if (aVar != null) {
                aVar.mo109937a(calendarMember);
                m113395b(aVar);
            } else {
                CalendarEditShareMemberFragment.Companion aVar2 = CalendarEditShareMemberFragment.f76231f;
                CalendarMember.C15546a newBuilder = calendarMember.newBuilder();
                Intrinsics.checkExpressionValueIsNotNull(newBuilder, "calendarMember.newBuilder()");
                CalendarEditShareMemberFragment a = aVar2.mo109948a(newBuilder, m113402k(), this.f76351k);
                this.f76349i = a;
                m113394a(a);
            }
            this.f76350j = true;
            KeyboardUtils.hideKeyboard(getContext());
        }
    }

    /* renamed from: a */
    public final void mo110066a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        mo110068b().create(this.f76342a, arrayList, arrayList2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m113397f();
        CalendarShareExtraParam calendarShareParam = mo110068b().getCalendarShareParam();
        if (calendarShareParam != null) {
            str = calendarShareParam.getCalendarId();
        } else {
            str = null;
        }
        C32502i.m124373a(str);
    }

    /* renamed from: a */
    public final void mo110067a(boolean z, String str) {
        if (!z) {
            RequestLoadingDialog requestLoadingDialog = this.f76347f;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112592c(R.string.Calendar_Share_UnableToShare);
                return;
            }
            return;
        }
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "this");
            ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).message(str)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null)).show();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_calendar_share_member, viewGroup, false);
    }
}
