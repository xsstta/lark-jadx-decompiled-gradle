package com.ss.android.lark.mail.impl.widget.time;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeModel;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimePresenter;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeView;
import com.ss.android.lark.mail.impl.widget.time.p2230a.C44074a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 12\u00020\u0001:\u0003012B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\nH\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0006\u0010,\u001a\u00020 J\u0016\u0010-\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010.\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\rR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment;", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$EventTimeFragmentAction;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mail/impl/widget/time/TimeData;", ShareHitPoint.f121869d, "", "isFromSearch", "", "(Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$EventTimeFragmentAction;Lcom/ss/android/lark/mail/impl/widget/time/TimeData;IZ)V", "mCheckInvalidTime", "Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$CheckInvalidTime;", "mEditModel", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeModel;", "getMEditModel", "()Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeModel;", "mEditModel$delegate", "Lkotlin/Lazy;", "mEditPresenter", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimePresenter;", "mEditView", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView;", "getMEditView", "()Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView;", "mEditView$delegate", "mFragmentAction", "mIsFromLocalRecover", "mIsFromSearch", "mTimeData", "initMVP", "", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshOnTimeFormatChange", "refreshViewData", "setCheckInvalidTime", "checkInvalidTime", "CheckInvalidTime", "Companion", "EventTimeFragmentAction", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.h */
public final class EditMultiTimeFragment extends View$OnClickListenerC44084d {

    /* renamed from: c */
    public static final Companion f111942c = new Companion(null);

    /* renamed from: d */
    private boolean f111943d;

    /* renamed from: e */
    private TimeData f111944e;

    /* renamed from: f */
    private EventTimeFragmentAction f111945f;

    /* renamed from: g */
    private int f111946g;

    /* renamed from: h */
    private final Lazy f111947h;

    /* renamed from: i */
    private final Lazy f111948i;

    /* renamed from: j */
    private EditMultiTimePresenter f111949j;

    /* renamed from: k */
    private CheckInvalidTime f111950k;

    /* renamed from: l */
    private boolean f111951l;

    /* renamed from: m */
    private HashMap f111952m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$CheckInvalidTime;", "", "getValidTime", "", "isTimeInvalid", "", "updateTime", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.h$a */
    public interface CheckInvalidTime {
        /* renamed from: a */
        long mo150686a();

        /* renamed from: a */
        boolean mo150687a(long j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$EventTimeFragmentAction;", "", "onBackPressed", "", "onSaveBtnPressed", "startTime", "", "endTime", "allDay", "", "timeZoneId", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.h$c */
    public interface EventTimeFragmentAction {
        /* renamed from: a */
        void mo150641a();

        /* renamed from: a */
        void mo150642a(long j, long j2, boolean z, String str);
    }

    /* renamed from: c */
    private final EditMultiTimeView m174638c() {
        return (EditMultiTimeView) this.f111947h.getValue();
    }

    /* renamed from: d */
    private final EditMultiTimeModel m174639d() {
        return (EditMultiTimeModel) this.f111948i.getValue();
    }

    /* renamed from: a */
    public View mo156893a(int i) {
        if (this.f111952m == null) {
            this.f111952m = new HashMap();
        }
        View view = (View) this.f111952m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f111952m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo156896b() {
        HashMap hashMap = this.f111952m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo156896b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$Companion;", "", "()V", "TIME_TYPE_ENDTIME", "", "TIME_TYPE_INDEPENDENT", "TIME_TYPE_STARTTIME", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.h$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.h$d */
    static final class C44091d extends Lambda implements Function0<EditMultiTimeModel> {
        public static final C44091d INSTANCE = new C44091d();

        C44091d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EditMultiTimeModel invoke() {
            return new EditMultiTimeModel();
        }
    }

    public EditMultiTimeFragment() {
        this.f111947h = LazyKt.lazy(new C44092e(this));
        this.f111948i = LazyKt.lazy(C44091d.INSTANCE);
        this.f111943d = true;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.View$OnClickListenerC44084d
    /* renamed from: a */
    public boolean mo156878a() {
        EventTimeFragmentAction cVar = this.f111945f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        cVar.mo150641a();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.h$e */
    static final class C44092e extends Lambda implements Function0<EditMultiTimeView> {
        final /* synthetic */ EditMultiTimeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44092e(EditMultiTimeFragment hVar) {
            super(0);
            this.this$0 = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final EditMultiTimeView invoke() {
            ListenableLinearLayout listenableLinearLayout = (ListenableLinearLayout) this.this$0.mo156893a(R.id.chooseTimeRootView);
            Intrinsics.checkExpressionValueIsNotNull(listenableLinearLayout, "chooseTimeRootView");
            C44074a.AbstractC44075a aVar = this.this$0.f111915b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mViewDependency");
            return new EditMultiTimeView(listenableLinearLayout, aVar);
        }
    }

    /* renamed from: e */
    private final void m174640e() {
        EditMultiTimeView c = m174638c();
        EditMultiTimeModel d = m174639d();
        EventTimeFragmentAction cVar = this.f111945f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        TimeData timeData = this.f111944e;
        if (timeData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeData");
        }
        EditMultiTimePresenter dVar = new EditMultiTimePresenter(c, d, cVar, timeData, this.f111946g);
        this.f111949j = dVar;
        if (dVar != null) {
            dVar.create();
        }
        m174639d().mo157010a(this.f111950k);
    }

    /* renamed from: a */
    public final void mo156895a(CheckInvalidTime aVar) {
        this.f111950k = aVar;
    }

    /* renamed from: a */
    public final void mo156894a(TimeData timeData, int i) {
        Intrinsics.checkParameterIsNotNull(timeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        EditMultiTimePresenter dVar = this.f111949j;
        if (dVar != null) {
            dVar.mo157014a(timeData, i);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mail.impl.widget.time.View$OnClickListenerC44084d
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f111943d) {
            m174640e();
            if (this.f111951l) {
                ((CommonTitleBar) mo156893a(R.id.editFragmentTitleBar)).setBackgroundColor(UIHelper.getColor(R.color.bg_base));
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment, com.ss.android.lark.mail.impl.widget.time.View$OnClickListenerC44084d
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mail_fragment_choose_time, viewGroup, false);
    }

    public EditMultiTimeFragment(EventTimeFragmentAction cVar, TimeData timeData, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(cVar, "action");
        Intrinsics.checkParameterIsNotNull(timeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f111947h = LazyKt.lazy(new C44092e(this));
        this.f111948i = LazyKt.lazy(C44091d.INSTANCE);
        this.f111945f = cVar;
        this.f111944e = timeData;
        this.f111946g = i;
        this.f111943d = false;
        this.f111951l = z;
    }
}
