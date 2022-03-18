package com.ss.android.lark.calendar.impl.features.calendars.importcalendar;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment;
import com.ss.android.lark.calendar.impl.features.local.C31934h;
import com.ss.android.lark.calendar.impl.features.settings.CalendarSettingViewData;
import com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.utils.C32650g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u0011\u0014\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\"#B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001b\u001a\u00020\u0004H\u0014J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView$ViewDelegate;", "calendarsManageModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel;", "calendarsManageView", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView;", "fragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$FragmentDependency;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel;Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView;Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$FragmentDependency;)V", "getFragmentDependency", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$FragmentDependency;", "isFromSideBar", "", "localCalDelegate", "com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$localCalDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$localCalDelegate$1;", "mExchangeLoginDelegate", "com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$mExchangeLoginDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$mExchangeLoginDelegate$1;", "mExchangeLoginFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment;", "mIsInFragment", "mLocalCalAccountFragment", "Lcom/ss/android/lark/calendar/impl/features/settings/LocalCalAccountFragment;", "createViewDelegate", "onBackPressed", "", "onNewIntent", "intent", "Landroid/content/Intent;", "setFrom", "FragmentDependency", "PresenterViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.d */
public final class ImportCalendarPresenter extends BasePresenter<ImportCalendarContract.IGoogleCalendarSettingModel, ImportCalendarContract.IGoogleCalendarSettingView, ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate> {

    /* renamed from: a */
    public LocalCalAccountFragment f76026a;

    /* renamed from: b */
    public ExchangeLoginFragment f76027b;

    /* renamed from: c */
    public boolean f76028c;

    /* renamed from: d */
    public final C30364c f76029d = new C30364c(this);

    /* renamed from: e */
    public C30365d f76030e = new C30365d(this);

    /* renamed from: f */
    private boolean f76031f;

    /* renamed from: g */
    private final FragmentDependency f76032g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$FragmentDependency;", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "getActivityContext", "Landroid/app/Activity;", "hideFragment", "isFromSetting", "", "onBackPressed", "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.d$a */
    public interface FragmentDependency {
        /* renamed from: a */
        Activity mo109621a();

        /* renamed from: a */
        void mo109622a(Fragment fragment);

        /* renamed from: a */
        void mo109623a(Fragment fragment, int i);

        /* renamed from: b */
        void mo109624b(Fragment fragment);

        /* renamed from: b */
        boolean mo109625b();
    }

    /* renamed from: c */
    public final FragmentDependency mo109658c() {
        return this.f76032g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$PresenterViewDelegate;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView$ViewDelegate;", "model", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingModel;", "view", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter;Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingModel;Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView;)V", "getModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingModel;", "getView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView;", "importedLocalCalendar", "", "isFromSetting", "onBackPressed", "", "onClickExchangeImport", "onClickGoogleImport", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onClickLocalImport", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.d$b */
    public final class PresenterViewDelegate implements ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarPresenter f76033a;

        /* renamed from: b */
        private final ImportCalendarContract.IGoogleCalendarSettingModel f76034b;

        /* renamed from: c */
        private final ImportCalendarContract.IGoogleCalendarSettingView f76035c;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate
        /* renamed from: d */
        public boolean mo109604d() {
            return this.f76033a.mo109658c().mo109625b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate
        /* renamed from: c */
        public boolean mo109603c() {
            if (!C32650g.m125312a(this.f76033a.mo109658c().mo109621a())) {
                return false;
            }
            return !this.f76034b.mo109597a().isEmpty();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate
        /* renamed from: a */
        public void mo109601a() {
            ExchangeLoginFragment aVar = this.f76033a.f76027b;
            if (aVar != null) {
                this.f76033a.mo109658c().mo109622a(aVar);
            } else {
                ImportCalendarPresenter dVar = this.f76033a;
                dVar.f76027b = new ExchangeLoginFragment("", dVar.f76030e);
                this.f76033a.mo109658c().mo109623a(this.f76033a.f76027b, this.f76035c.mo109598a().getId());
            }
            this.f76033a.f76028c = true;
            this.f76035c.mo109598a().setVisibility(0);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate
        /* renamed from: b */
        public void mo109602b() {
            CalendarSettingViewData calendarSettingViewData = new CalendarSettingViewData();
            calendarSettingViewData.setLocalCalAccSetting(this.f76034b.mo109597a());
            LocalCalAccountFragment localCalAccountFragment = this.f76033a.f76026a;
            if (localCalAccountFragment != null) {
                localCalAccountFragment.mo118344a(calendarSettingViewData);
                this.f76033a.mo109658c().mo109622a(localCalAccountFragment);
            } else {
                ImportCalendarPresenter dVar = this.f76033a;
                dVar.f76026a = new LocalCalAccountFragment(dVar.f76029d, calendarSettingViewData);
                this.f76033a.mo109658c().mo109623a(this.f76033a.f76026a, this.f76035c.mo109598a().getId());
            }
            this.f76033a.f76028c = true;
            this.f76035c.mo109598a().setVisibility(0);
        }

        public PresenterViewDelegate(ImportCalendarPresenter dVar, ImportCalendarContract.IGoogleCalendarSettingModel aVar, ImportCalendarContract.IGoogleCalendarSettingView bVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "model");
            Intrinsics.checkParameterIsNotNull(bVar, "view");
            this.f76033a = dVar;
            this.f76034b = aVar;
            this.f76035c = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$localCalDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/LocalCalAccountFragment$Delegate;", "onBackPressed", "", "onSavePressed", "accountName", "", "isVisible", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.d$c */
    public static final class C30364c implements LocalCalAccountFragment.AbstractC32383a {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarPresenter f76036a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment.AbstractC32383a
        /* renamed from: a */
        public void mo109659a() {
            this.f76036a.mo109658c().mo109624b(this.f76036a.f76026a);
            this.f76036a.f76028c = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30364c(ImportCalendarPresenter dVar) {
            this.f76036a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment.AbstractC32383a
        /* renamed from: a */
        public void mo109660a(String str, boolean z) {
            C31934h.m121506a().mo116559a(str, z);
            EventBus.getDefault().trigger(new C32493l());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate createViewDelegate() {
        ImportCalendarContract.IGoogleCalendarSettingModel aVar = (ImportCalendarContract.IGoogleCalendarSettingModel) getModel();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
        ImportCalendarContract.IGoogleCalendarSettingView bVar = (ImportCalendarContract.IGoogleCalendarSettingView) getView();
        Intrinsics.checkExpressionValueIsNotNull(bVar, "view");
        return new PresenterViewDelegate(this, aVar, bVar);
    }

    /* renamed from: a */
    public final void mo109654a() {
        if (this.f76028c) {
            this.f76032g.mo109624b(this.f76026a);
            this.f76032g.mo109624b(this.f76027b);
            this.f76028c = false;
            return;
        }
        ((ImportCalendarContract.IGoogleCalendarSettingView) getView()).mo109599a(false);
    }

    /* renamed from: a */
    public final void mo109656a(boolean z) {
        this.f76031f = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$mExchangeLoginDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$Delegate;", "onClickFragmentBack", "", "isImportSuc", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.d$d */
    public static final class C30365d implements ExchangeLoginFragment.Delegate {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarPresenter f76037a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30365d(ImportCalendarPresenter dVar) {
            this.f76037a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment.Delegate
        /* renamed from: a */
        public void mo109631a(boolean z) {
            this.f76037a.mo109658c().mo109624b(this.f76037a.f76027b);
            this.f76037a.f76028c = false;
            if (z) {
                ((ImportCalendarContract.IGoogleCalendarSettingView) this.f76037a.getView()).mo109599a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo109655a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (!intent.getBooleanExtra("fromweb", false)) {
            return;
        }
        if (intent.getBooleanExtra("binded", false)) {
            ((ImportCalendarContract.IGoogleCalendarSettingView) getView()).mo109599a(false);
        } else {
            ((ImportCalendarContract.IGoogleCalendarSettingView) getView()).mo109600b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImportCalendarPresenter(ImportCalendarModel cVar, ImportCalendarView eVar, FragmentDependency aVar) {
        super(cVar, eVar);
        Intrinsics.checkParameterIsNotNull(cVar, "calendarsManageModel");
        Intrinsics.checkParameterIsNotNull(eVar, "calendarsManageView");
        Intrinsics.checkParameterIsNotNull(aVar, "fragmentDependency");
        this.f76032g = aVar;
    }
}
