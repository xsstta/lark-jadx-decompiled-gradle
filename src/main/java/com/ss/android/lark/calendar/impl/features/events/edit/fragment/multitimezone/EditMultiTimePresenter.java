package com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditMultiTimeFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceEditTimeProcess;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.OriginalEventData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0012J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimePresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeModelApi;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewApi;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "view", "model", "mFragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment$EventTimeFragmentAction;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewApi;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeModelApi;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment$EventTimeFragmentAction;)V", "getMFragmentDependency", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment$EventTimeFragmentAction;", "setMFragmentDependency", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditMultiTimeFragment$EventTimeFragmentAction;)V", "resourceEditTimeProcess", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditTimeProcess;", "create", "", "destroy", "getIntervalTime", "", "timeSeconds", "getViewAction", "initPresenter", "refreshDataFromFragment", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "isChosenStartTime", "", "refreshOnTimeFormatChange", "setDataAndRefreshView", "EditMultiTimeViewAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.c */
public final class EditMultiTimePresenter extends BasePresenterCalendar<EditMultiTimeContract.IEditMultiTimeModelApi, EditMultiTimeContract.IEditMultiTimeViewApi, EditMultiTimeContract.IEditMultiTimeViewData, EditMultiTimeContract.IEditMultiTimeViewAction> {

    /* renamed from: a */
    public ResourceEditTimeProcess f80544a;

    /* renamed from: b */
    private EditMultiTimeFragment.EventTimeFragmentAction f80545b;

    /* renamed from: d */
    public final EditMultiTimeFragment.EventTimeFragmentAction mo115469d() {
        return this.f80545b;
    }

    /* renamed from: c */
    public EditMultiTimeContract.IEditMultiTimeViewAction mo109713b() {
        return new EditMultiTimeViewAction();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m119926e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimePresenter$EditMultiTimeViewAction;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimePresenter;)V", "onBackBtnPressed", "", "onChooseEndTime", "onChooseStartTime", "onClickSaveBtn", "onTimeZoneChanged", "timeZoneId", "", "onToggleToAllDay", "onToggleToNormalDay", "onWheelViewDataChange", "calendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.c$a */
    public final class EditMultiTimeViewAction implements EditMultiTimeContract.IEditMultiTimeViewAction {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: b */
        public void mo115392b() {
            EditMultiTimePresenter.this.mo115469d().mo114382a();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimePresenter$EditMultiTimeViewAction$onClickSaveBtn$editTimeActionListener$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditTimeProcess$EditTimeActionListener;", "reverseTime", "", "saveTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.c$a$a */
        public static final class C31679a implements ResourceEditTimeProcess.EditTimeActionListener {

            /* renamed from: a */
            final /* synthetic */ EditMultiTimeViewAction f80547a;

            /* renamed from: b */
            final /* synthetic */ long f80548b;

            /* renamed from: c */
            final /* synthetic */ long f80549c;

            /* renamed from: d */
            final /* synthetic */ boolean f80550d;

            /* renamed from: e */
            final /* synthetic */ String f80551e;

            @Override // com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceEditTimeProcess.EditTimeActionListener
            /* renamed from: a */
            public void mo115470a() {
                EditMultiTimePresenter.this.mo115469d().mo114383a(this.f80548b, this.f80549c, this.f80550d, this.f80551e);
            }

            @Override // com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceEditTimeProcess.EditTimeActionListener
            /* renamed from: b */
            public void mo115471b() {
                EditMultiTimePresenter.this.mo115467b(((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115387u(), ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115388v());
            }

            C31679a(EditMultiTimeViewAction aVar, long j, long j2, boolean z, String str) {
                this.f80547a = aVar;
                this.f80548b = j;
                this.f80549c = j2;
                this.f80550d = z;
                this.f80551e = str;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: e */
        public void mo115395e() {
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115367b(true);
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115407k();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115405i();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115400d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: f */
        public void mo115396f() {
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115367b(false);
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115407k();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115405i();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115401e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: c */
        public void mo115393c() {
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115363a(true);
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115382p();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115404h();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115405i();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115399c();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115402f();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115406j();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115408l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: d */
        public void mo115394d() {
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115363a(false);
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115383q();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115404h();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115405i();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115399c();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115402f();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115398b();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115406j();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: a */
        public void mo115389a() {
            long j;
            CalendarDate calendarDate;
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115409m();
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115376j()) {
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115410n();
                return;
            }
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115371d()) {
                j = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115372e().getTimeInSeconds();
            } else {
                j = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115373g().getTimeInSeconds();
            }
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115371d()) {
                calendarDate = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115375i();
            } else {
                calendarDate = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115374h();
            }
            long timeInSeconds = calendarDate.getTimeInSeconds();
            boolean d = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115371d();
            String k = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115377k();
            C31679a aVar = new C31679a(this, j, timeInSeconds, d, k);
            EditMultiTimePresenter cVar = EditMultiTimePresenter.this;
            ResourceEditTimeProcess cVar2 = new ResourceEditTimeProcess(((EditMultiTimeContract.IEditMultiTimeViewApi) cVar.mo118651s()).mo115411o(), ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115386t());
            cVar2.mo117008a(aVar);
            cVar2.mo117007a(j, timeInSeconds, k, ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115364b(), ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115357a(), OriginalEventData.f81971a.mo117025a(((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115368c()));
            cVar.f80544a = cVar2;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public EditMultiTimeViewAction() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: a */
        public void mo115391a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            if (!TextUtils.isEmpty(str)) {
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115362a(str);
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115384r();
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115385s();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115406j();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115399c();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115405i();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115398b();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115402f();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: a */
        public void mo115390a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115381o()) {
                if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115371d()) {
                    CalendarDate moveToDayStart = calendarDate.moveToDayStart();
                    Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "newAllDayStartCalendar");
                    ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115359a(moveToDayStart);
                    CalendarDate calendarDate2 = new CalendarDate();
                    calendarDate2.setTimeInSeconds(moveToDayStart.getTimeInSeconds() + ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115379m());
                    CalendarDate moveToDayEnd = calendarDate2.moveToDayEnd();
                    Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "newAllDayEndCalendar.moveToDayEnd()");
                    ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115366b(moveToDayEnd);
                    ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115399c();
                } else {
                    ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115369c(calendarDate);
                    long timeInSeconds = calendarDate.getTimeInSeconds() + ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115380n();
                    CalendarDate calendarDate3 = new CalendarDate(((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115378l());
                    calendarDate3.setTimeInSeconds(timeInSeconds);
                    ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115370d(calendarDate3);
                    ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115399c();
                    ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115406j();
                    ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115398b();
                }
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115400d();
                return;
            }
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115371d()) {
                CalendarDate moveToDayEnd2 = calendarDate.moveToDayEnd();
                EditMultiTimePresenter cVar = EditMultiTimePresenter.this;
                Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd2, "allDayEndCalendar");
                long a = cVar.mo115464a(moveToDayEnd2.getTimeInSeconds());
                EditMultiTimePresenter cVar2 = EditMultiTimePresenter.this;
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115358a(a - cVar2.mo115464a(((EditMultiTimeContract.IEditMultiTimeModelApi) cVar2.mo118652t()).mo115372e().getTimeInSeconds()));
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115366b(moveToDayEnd2);
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115399c();
            } else {
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115370d(calendarDate);
                long a2 = EditMultiTimePresenter.this.mo115464a(calendarDate.getTimeInSeconds());
                EditMultiTimePresenter cVar3 = EditMultiTimePresenter.this;
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo118652t()).mo115365b(a2 - cVar3.mo115464a(((EditMultiTimeContract.IEditMultiTimeModelApi) cVar3.mo118652t()).mo115373g().getTimeInSeconds()));
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115399c();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115398b();
            }
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo118651s()).mo115401e();
        }
    }

    /* renamed from: e */
    private final void m119926e() {
        ((EditMultiTimeContract.IEditMultiTimeViewApi) mo118651s()).mo115397a();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        ResourceEditTimeProcess cVar = this.f80544a;
        if (cVar != null) {
            cVar.mo117009b();
        }
    }

    /* renamed from: a */
    public final void mo115465a() {
        ((EditMultiTimeContract.IEditMultiTimeViewApi) mo118651s()).mo115399c();
        ((EditMultiTimeContract.IEditMultiTimeViewApi) mo118651s()).mo115403g();
    }

    /* renamed from: a */
    public final long mo115464a(long j) {
        return (long) (Math.ceil((((double) j) / ((double) 60)) / ((double) 5)) * ((double) LocationRequest.PRIORITY_INDOOR));
    }

    /* renamed from: b */
    public final void mo115467b(TimeData timeData, boolean z) {
        ((EditMultiTimeContract.IEditMultiTimeModelApi) mo118652t()).mo115367b(z);
        ((EditMultiTimeContract.IEditMultiTimeModelApi) mo118652t()).mo115360a(timeData);
        ((EditMultiTimeContract.IEditMultiTimeViewApi) mo118651s()).mo115397a();
    }

    /* renamed from: a */
    public final void mo115466a(TimeData timeData, boolean z) {
        Intrinsics.checkParameterIsNotNull(timeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ((EditMultiTimeContract.IEditMultiTimeModelApi) mo118652t()).mo115361a(timeData, z);
        mo115467b(timeData, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditMultiTimePresenter(EditMultiTimeContract.IEditMultiTimeViewApi cVar, EditMultiTimeContract.IEditMultiTimeModelApi aVar, EditMultiTimeFragment.EventTimeFragmentAction aVar2) {
        super(cVar, aVar);
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar2, "mFragmentDependency");
        this.f80545b = aVar2;
    }
}
