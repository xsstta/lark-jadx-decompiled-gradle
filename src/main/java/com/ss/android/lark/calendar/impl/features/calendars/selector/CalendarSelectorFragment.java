package com.ss.android.lark.calendar.impl.features.calendars.selector;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorActivity;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarActivity;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment;
import com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeActivity;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.features.settings.oneaccount.OneAccountManageFragment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.ThirdPartAccountSPUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\b\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001>B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020#J\u0012\u0010+\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u001eH\u0002J\"\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020&H\u0016J&\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020&H\u0016J\u001a\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u0002032\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010=\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001eH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fX\u0004¢\u0006\u0002\n\u0000R*\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!j\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#`$X\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/MainWindowParams;", "Lcom/ss/android/lark/eetroublecapture/ICaptureCallback;", "()V", "mExchangeLoginFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment;", "mOneAccountManageDelegate", "com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment$mOneAccountManageDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment$mOneAccountManageDelegate$1;", "mOneAccountManageFragment", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment;", "mSelectorModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorModel;", "getMSelectorModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorModel;", "mSelectorModel$delegate", "Lkotlin/Lazy;", "mSelectorPresenter", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter;", "getMSelectorPresenter", "()Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter;", "mSelectorPresenter$delegate", "mSelectorView", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorView;", "getMSelectorView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorView;", "mSelectorView$delegate", "showingFragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "addFragment", "", "fragment", "containerId", "", "handleBackPressed", "hideFragment", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCaptured", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "showFragment", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.c */
public final class CalendarSelectorFragment extends C36516a<MainWindowParams> implements AbstractC36982d {

    /* renamed from: d */
    public static final Companion f76126d = new Companion(null);

    /* renamed from: a */
    public OneAccountManageFragment f76127a;

    /* renamed from: b */
    public final HashMap<String, Boolean> f76128b = new HashMap<>();

    /* renamed from: c */
    public final C30408b f76129c;

    /* renamed from: e */
    private final Lazy f76130e = LazyKt.lazy(new C30412e(this));

    /* renamed from: f */
    private final Lazy f76131f = LazyKt.lazy(C30409c.INSTANCE);

    /* renamed from: g */
    private final ArrayList<Fragment> f76132g = new ArrayList<>();

    /* renamed from: h */
    private ExchangeLoginFragment f76133h;

    /* renamed from: i */
    private final Lazy f76134i;

    /* renamed from: j */
    private HashMap f76135j;

    /* renamed from: a */
    public View mo109778a(int i) {
        if (this.f76135j == null) {
            this.f76135j = new HashMap();
        }
        View view = (View) this.f76135j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76135j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final CalendarSelectorView mo109779a() {
        return (CalendarSelectorView) this.f76130e.getValue();
    }

    /* renamed from: b */
    public final CalendarSelectorModel mo109782b() {
        return (CalendarSelectorModel) this.f76131f.getValue();
    }

    /* renamed from: c */
    public final CalendarSelectorPresenter mo109784c() {
        return (CalendarSelectorPresenter) this.f76134i.getValue();
    }

    /* renamed from: e */
    public void mo109786e() {
        HashMap hashMap = this.f76135j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109786e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment;", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.c$c */
    static final class C30409c extends Lambda implements Function0<CalendarSelectorModel> {
        public static final C30409c INSTANCE = new C30409c();

        C30409c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSelectorModel invoke() {
            return new CalendarSelectorModel();
        }
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        mo109779a().mo109800g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        mo109784c().destroy();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.c$d */
    public static final class C30410d extends Lambda implements Function0<CalendarSelectorPresenter> {
        final /* synthetic */ CalendarSelectorFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30410d(CalendarSelectorFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment$mSelectorPresenter$2$1$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IFragmentDependency;", "getContext", "Landroid/content/Context;", "onGotoAccountManagePage", "", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onStartCalendarCreator", "targetCal", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onStartImportActivity", "onStartNewCalendarActivity", "onStartSubscribeActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.c$d$a */
        public static final class C30411a implements CalendarSelectorContract.IFragmentDependency {

            /* renamed from: a */
            final /* synthetic */ C30410d f76138a;

            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IFragmentDependency
            /* renamed from: a */
            public void mo109771a() {
                Intent intent = new Intent(mo109789d(), CalendarCreatorActivity.class);
                intent.putExtra("serializable_from_type", "new_calendar_type");
                this.f76138a.this$0.startActivityForResult(intent, 1);
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IFragmentDependency
            /* renamed from: b */
            public void mo109774b() {
                this.f76138a.this$0.startActivityForResult(new Intent(mo109789d(), CalendarSubscribeActivity.class), 3);
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IFragmentDependency
            /* renamed from: c */
            public void mo109775c() {
                Intent intent = new Intent(mo109789d(), ImportCalendarActivity.class);
                intent.putExtra("sidebar", true);
                this.f76138a.this$0.startActivityForResult(intent, 4);
            }

            /* renamed from: d */
            public Context mo109789d() {
                LinearLayout linearLayout = (LinearLayout) this.f76138a.this$0.mo109778a(R.id.selectorRootView);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "selectorRootView");
                Context context = linearLayout.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "selectorRootView.context");
                return context;
            }

            C30411a(C30410d dVar) {
                this.f76138a = dVar;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IFragmentDependency
            /* renamed from: a */
            public void mo109773a(Calendar calendar) {
                Intrinsics.checkParameterIsNotNull(calendar, "targetCal");
                AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(CalendarCreatorActivity.class).mo108153a("serializable_from_type", "manager_calendar_type");
                Intrinsics.checkExpressionValueIsNotNull(a, "appRouterBuilder");
                LargeCalendarTransmitHelper.m116183a(a, calendar);
                a.mo108155a(mo109789d(), 2);
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IFragmentDependency
            /* renamed from: a */
            public void mo109772a(AccountDataListItem aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "accountItem");
                OneAccountManageFragment bVar = this.f76138a.this$0.f76127a;
                if (bVar != null) {
                    bVar.mo118529a(aVar);
                    this.f76138a.this$0.mo109780a(bVar);
                    return;
                }
                OneAccountManageFragment bVar2 = new OneAccountManageFragment(this.f76138a.this$0.f76129c, aVar, this.f76138a.this$0.f76128b, false, 8, null);
                this.f76138a.this$0.mo109781a(bVar2, 16908290);
                this.f76138a.this$0.f76127a = bVar2;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSelectorPresenter invoke() {
            CalendarSelectorPresenter calendarSelectorPresenter = new CalendarSelectorPresenter(this.this$0.mo109779a(), this.this$0.mo109782b());
            calendarSelectorPresenter.mo109712a(new C30411a(this));
            return calendarSelectorPresenter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorFragment$mOneAccountManageDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$Delegate;", "onClickFragmentBack", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.c$b */
    public static final class C30408b implements OneAccountManageFragment.Delegate {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorFragment f76137a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.OneAccountManageFragment.Delegate
        /* renamed from: a */
        public void mo109788a() {
            CalendarSelectorFragment cVar = this.f76137a;
            cVar.mo109783b(cVar.f76127a);
            this.f76137a.mo109784c().mo109714c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30408b(CalendarSelectorFragment cVar) {
            this.f76137a = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.c$e */
    static final class C30412e extends Lambda implements Function0<CalendarSelectorView> {
        final /* synthetic */ CalendarSelectorFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30412e(CalendarSelectorFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSelectorView invoke() {
            LinearLayout linearLayout = (LinearLayout) this.this$0.mo109778a(R.id.selectorRootView);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "selectorRootView");
            return new CalendarSelectorView(linearLayout);
        }
    }

    /* renamed from: d */
    public final boolean mo109785d() {
        OneAccountManageFragment bVar = this.f76127a;
        boolean z = true;
        if (bVar != null && bVar.mo113714e()) {
            return true;
        }
        boolean z2 = false;
        OneAccountManageFragment bVar2 = this.f76127a;
        if (bVar2 != null && this.f76132g.contains(bVar2)) {
            mo109783b(this.f76127a);
            mo109784c().mo109714c();
            z2 = true;
        }
        ExchangeLoginFragment aVar = this.f76133h;
        if (aVar == null) {
            return z2;
        }
        if (this.f76132g.contains(aVar)) {
            mo109783b(this.f76133h);
        } else {
            z = z2;
        }
        return z;
    }

    public CalendarSelectorFragment() {
        ThirdPartAccountSPUtil.m125202a(new IGetDataCallback<HashMap<String, Boolean>>(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorFragment.C304071 */

            /* renamed from: a */
            final /* synthetic */ CalendarSelectorFragment f76136a;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f76136a = r1;
            }

            /* renamed from: a */
            public void onSuccess(HashMap<String, Boolean> hashMap) {
                if (hashMap != null) {
                    Set<Map.Entry<String, Boolean>> entrySet = hashMap.entrySet();
                    Intrinsics.checkExpressionValueIsNotNull(entrySet, "settings.entries");
                    for (T t : entrySet) {
                        Object key = t.getKey();
                        Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                        Object value = t.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
                        this.f76136a.f76128b.put(key, value);
                    }
                }
            }
        });
        this.f76129c = new C30408b(this);
        this.f76134i = LazyKt.lazy(new C30410d(this));
    }

    /* renamed from: b */
    public final void mo109783b(Fragment fragment) {
        if (fragment != null) {
            this.f76132g.remove(fragment);
            getParentFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getParentFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo109780a(Fragment fragment) {
        if (!this.f76132g.contains(fragment)) {
            this.f76132g.add(fragment);
        }
        getParentFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
        getParentFragmentManager().executePendingTransactions();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intent intent;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        CalendarSelectorModel b = mo109782b();
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            str = null;
        } else {
            str = intent.getStringExtra("calendar_id");
        }
        b.mo109755a(str);
        mo109784c().create();
    }

    /* renamed from: a */
    public final void mo109781a(Fragment fragment, int i) {
        if (fragment != null) {
            if (!this.f76132g.contains(fragment)) {
                this.f76132g.add(fragment);
            }
            getParentFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
            getParentFragmentManager().executePendingTransactions();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        mo109784c().mo109711a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_calendar_selector, viewGroup, false);
    }
}
