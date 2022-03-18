package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.widget.time.CalendarDate;
import com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment;
import com.ss.android.lark.mail.impl.widget.time.TimeData;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract;
import com.ss.android.lark.mail.impl.widget.time.mvp.BasePresenterCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u001c\u001a\u00020\u0014R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimePresenter;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/BasePresenterCalendar;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeModelApi;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewApi;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "view", "model", "mFragmentDependency", "Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$EventTimeFragmentAction;", "timeData", "Lcom/ss/android/lark/mail/impl/widget/time/TimeData;", ShareHitPoint.f121869d, "", "(Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewApi;Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeModelApi;Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$EventTimeFragmentAction;Lcom/ss/android/lark/mail/impl/widget/time/TimeData;I)V", "getMFragmentDependency", "()Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$EventTimeFragmentAction;", "setMFragmentDependency", "(Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$EventTimeFragmentAction;)V", "create", "", "getIntervalTime", "", "timeSeconds", "getViewAction", "initPresenter", "refreshDataFromFragment", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "refreshOnTimeFormatChange", "EditMultiTimeViewAction", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.d */
public final class EditMultiTimePresenter extends BasePresenterCalendar<EditMultiTimeContract.IEditMultiTimeModelApi, EditMultiTimeContract.IEditMultiTimeViewApi, EditMultiTimeContract.IEditMultiTimeViewData, EditMultiTimeContract.IEditMultiTimeViewAction> {

    /* renamed from: a */
    private EditMultiTimeFragment.EventTimeFragmentAction f112013a;

    /* renamed from: c */
    public final EditMultiTimeFragment.EventTimeFragmentAction mo157015c() {
        return this.f112013a;
    }

    /* renamed from: a */
    public EditMultiTimeContract.IEditMultiTimeViewAction mo156852b() {
        return new EditMultiTimeViewAction();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.mvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m174798f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimePresenter$EditMultiTimeViewAction;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "(Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimePresenter;)V", "onBackBtnPressed", "", "onChooseEndTime", "onChooseStartTime", "onClickSaveBtn", "onTimeZoneChanged", "timeZoneId", "", "onToggleToAllDay", "onToggleToNormalDay", "onWheelViewDataChange", "calendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.d$a */
    public final class EditMultiTimeViewAction implements EditMultiTimeContract.IEditMultiTimeViewAction {
        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: b */
        public void mo156982b() {
            EditMultiTimePresenter.this.mo157015c().mo150641a();
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: e */
        public void mo156985e() {
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156954a(0);
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156996i();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156994g();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156990c();
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: f */
        public void mo156986f() {
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156954a(1);
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156996i();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156994g();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156991d();
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: c */
        public void mo156983c() {
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156959a(true);
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156975l();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156993f();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156994g();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156989b();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156992e();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156995h();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156997j();
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: d */
        public void mo156984d() {
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156959a(false);
            ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156976m();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156993f();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156994g();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156989b();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156992e();
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156995h();
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: a */
        public void mo156979a() {
            long j;
            CalendarDate calendarDate;
            int i;
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156998k();
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156970g()) {
                EditMultiTimeContract.IEditMultiTimeViewApi cVar = (EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d();
                if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156974k() == 2) {
                    i = R.string.Mail_SendLater_TimeInvalid;
                } else if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156969f()) {
                    i = R.string.Calendar_Edit_InvalidEndTime;
                } else {
                    i = R.string.Mail_Calendar_Edit_InvalidEndTime;
                }
                String a = C43819s.m173684a(i);
                Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(\n …                        )");
                cVar.mo156988a(a);
                if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156974k() == 2) {
                    C42209j.m168612a("schedule_send_time_invalid", "alert");
                    return;
                }
                return;
            }
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156960a()) {
                j = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156961b().getTimeInSeconds();
            } else {
                j = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156964c().getTimeInSeconds();
            }
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156960a()) {
                calendarDate = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156968e();
            } else {
                calendarDate = ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156966d();
            }
            EditMultiTimePresenter.this.mo157015c().mo150642a(j, calendarDate.getTimeInSeconds(), ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156960a(), ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156971h());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public EditMultiTimeViewAction() {
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: a */
        public void mo156981a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            if (!TextUtils.isEmpty(str)) {
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156958a(str);
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156977n();
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156978o();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156995h();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156989b();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156994g();
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156992e();
            }
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewAction
        /* renamed from: a */
        public void mo156980a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156974k() == 0) {
                if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156960a()) {
                    CalendarDate moveToDayStart = calendarDate.moveToDayStart();
                    Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "newAllDayStartCalendar");
                    ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156956a(moveToDayStart);
                    if (moveToDayStart.getJulianDay() > ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156968e().getJulianDay()) {
                        CalendarDate calendarDate2 = new CalendarDate();
                        calendarDate2.setJulianDay(moveToDayStart.getJulianDay());
                        CalendarDate moveToDayEnd = calendarDate2.moveToDayEnd();
                        Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "newAllDayEndCalendar.moveToDayEnd()");
                        ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156963b(moveToDayEnd);
                    }
                    ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156989b();
                } else {
                    ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156965c(calendarDate);
                    long timeInSeconds = calendarDate.getTimeInSeconds() + ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156973j();
                    CalendarDate calendarDate3 = new CalendarDate(((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156972i());
                    calendarDate3.setTimeInSeconds(timeInSeconds);
                    ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156967d(calendarDate3);
                    ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156989b();
                    ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156995h();
                }
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156990c();
                return;
            }
            if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156960a()) {
                CalendarDate calendarDate4 = new CalendarDate();
                if (((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156961b().getJulianDay() < calendarDate4.getJulianDay()) {
                    CalendarDate moveToDayStart2 = calendarDate4.moveToDayStart();
                    Intrinsics.checkExpressionValueIsNotNull(moveToDayStart2, "newAllDayStartCalendar");
                    ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156956a(moveToDayStart2);
                }
                CalendarDate moveToDayEnd2 = calendarDate.moveToDayEnd();
                EditMultiTimePresenter dVar = EditMultiTimePresenter.this;
                Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd2, "allDayEndCalendar");
                long a = dVar.mo157012a(moveToDayEnd2.getTimeInSeconds());
                EditMultiTimePresenter dVar2 = EditMultiTimePresenter.this;
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156955a(a - dVar2.mo157012a(((EditMultiTimeContract.IEditMultiTimeModelApi) dVar2.mo156854e()).mo156961b().getTimeInSeconds()));
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156963b(moveToDayEnd2);
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156989b();
            } else {
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156967d(calendarDate);
                long a2 = EditMultiTimePresenter.this.mo157012a(calendarDate.getTimeInSeconds());
                EditMultiTimePresenter dVar3 = EditMultiTimePresenter.this;
                ((EditMultiTimeContract.IEditMultiTimeModelApi) EditMultiTimePresenter.this.mo156854e()).mo156962b(a2 - dVar3.mo157012a(((EditMultiTimeContract.IEditMultiTimeModelApi) dVar3.mo156854e()).mo156964c().getTimeInSeconds()));
                ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156989b();
            }
            ((EditMultiTimeContract.IEditMultiTimeViewApi) EditMultiTimePresenter.this.mo156853d()).mo156991d();
        }
    }

    /* renamed from: f */
    private final void m174798f() {
        ((EditMultiTimeContract.IEditMultiTimeViewApi) mo156853d()).mo156987a();
    }

    /* renamed from: a */
    public final long mo157012a(long j) {
        return (long) (Math.ceil((((double) j) / ((double) 60)) / ((double) 5)) * ((double) LocationRequest.PRIORITY_INDOOR));
    }

    /* renamed from: a */
    public final void mo157014a(TimeData timeData, int i) {
        Intrinsics.checkParameterIsNotNull(timeData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ((EditMultiTimeContract.IEditMultiTimeModelApi) mo156854e()).mo156954a(i);
        ((EditMultiTimeContract.IEditMultiTimeModelApi) mo156854e()).mo156957a(timeData);
        ((EditMultiTimeContract.IEditMultiTimeViewApi) mo156853d()).mo156987a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditMultiTimePresenter(EditMultiTimeContract.IEditMultiTimeViewApi cVar, EditMultiTimeContract.IEditMultiTimeModelApi aVar, EditMultiTimeFragment.EventTimeFragmentAction cVar2, TimeData timeData, int i) {
        super(cVar, aVar);
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar2, "mFragmentDependency");
        Intrinsics.checkParameterIsNotNull(timeData, "timeData");
        this.f112013a = cVar2;
        aVar.mo156957a(timeData);
        aVar.mo156954a(i);
    }
}
