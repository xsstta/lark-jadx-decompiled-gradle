package com.ss.android.lark.calendar.impl.features.arrange.arrangetime;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.data.ArrangeMeetingData;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.util.ArrangeUtil;
import com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.HitPointUtil;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarFreeBusyHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30049m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0004()*+B\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J \u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010%\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020\u0010H\u0002J\b\u0010'\u001a\u00020\u0010H\u0002R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView$ViewDelegate;", "model", "view", "context", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$fragmentDependency;", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$fragmentDependency;)V", "mFragmentDependency", "mTimeFormatChangeListener", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "mUIHandler", "Landroid/os/Handler;", "create", "", "createFromAppend", "createFromChatAI", "createFromChatSetting", "createFromMeetingSignIn", "createModelDelegate", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel$ModelDelegate;", "createViewDelegate", "destroy", "fetchArrageTime", "fetchAttendeeList", "fetchDayEventChipData", "fetchFreeBusyResult", "fetchTimeZone", "fetchTitleBar", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "registerTimeFormatChangePush", "unRegisterTimeFormatChangePush", "updateOriginViewBySource", "Companion", "ModelDelegate", "PresenterViewDelegate", "fragmentDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d */
public final class ArrangePresenter extends BasePresenter<ArrangeContract.IArrangeModel, ArrangeContract.IArrangeView, ArrangeContract.IArrangeView.ViewDelegate> {

    /* renamed from: c */
    public static final Companion f75403c = new Companion(null);

    /* renamed from: a */
    public final fragmentDependency f75404a;

    /* renamed from: b */
    public final Handler f75405b = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private AbstractC30037ag.AbstractC30038a f75406d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH&J0\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0012j\b\u0012\u0004\u0012\u00020\u000e`\u00132\u0006\u0010\f\u001a\u00020\bH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$fragmentDependency;", "", "finishPage", "", "getContext", "Landroid/content/Context;", "setActivityResult", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "startAppendActivity", "requestId", "chatType", "", "startGroupNumberActivity", "chatId", "selectedChatterIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$h */
    public interface fragmentDependency {
        /* renamed from: a */
        void mo108926a();

        /* renamed from: a */
        void mo108927a(int i, Intent intent);

        /* renamed from: a */
        void mo108928a(int i, String str);

        /* renamed from: a */
        void mo108929a(String str, ArrayList<String> arrayList, int i);

        /* renamed from: b */
        Context mo108930b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$Companion;", "", "()V", "REQUEST_CODE_ADD_ATTENDEE", "", "REQUEST_CODE_APPEND_EVENT", "TIME_BAR_UNIT_1", "TIME_BAR_UNIT_5", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0002¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$PresenterViewDelegate;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView$ViewDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter;)V", "getEndDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getIsLoadDataError", "", "getStartDate", "getTimeBarNormalUnit", "", "getViewTimeZone", "Ljava/util/TimeZone;", "isAddGroupAttendee", "arrangeData", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/data/ArrangeMeetingData;", "onChipHandleVisible", "", "onClickAppendChip", "onClickToLeft", "index", "onDateChanged", "selectDate", "onDayMinutesChanged", "startDayMinutes", "endDayMinutes", "onFinishClicked", "onSelectGroupNumberClick", "onViewTimeZoneChanged", "timeZoneId", "", "refreshEventChip", "startAppendActivityWithMeetingData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$c */
    public final class PresenterViewDelegate implements ArrangeContract.IArrangeView.ViewDelegate {
        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: d */
        public void mo108900d() {
            ArrangePresenter.this.mo108940c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: b */
        public CalendarDate mo108898b() {
            return ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108855e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: c */
        public CalendarDate mo108899c() {
            return ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108856f();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: e */
        public boolean mo108901e() {
            return ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108861k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: j */
        public TimeZone mo108906j() {
            return ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108852b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: h */
        public void mo108904h() {
            if (((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o() == 2) {
                GeneralHitPoint.m124241d(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108866p());
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: i */
        public int mo108905i() {
            if (((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o() == 3) {
                return 1;
            }
            return 5;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: a */
        public void mo108893a() {
            long c = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108853c();
            long d = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108854d();
            String id = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108852b().getID();
            Intent intent = new Intent();
            intent.putExtra("arrange_start_time", c);
            intent.putExtra("arrange_end_time", d);
            intent.putExtra("arrange_time_zone_id", id);
            ArrangePresenter.this.f75404a.mo108927a(-1, intent);
            ArrangePresenter.this.f75404a.mo108926a();
            GeneralHitPoint.m124218a(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108860j(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108859i(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108858h());
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: f */
        public void mo108902f() {
            ArrangePresenter.this.f75404a.mo108929a(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108867q(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108864n(), 1);
            if (((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o() == 2) {
                CalendarFreeBusyHitPoint.f83363a.mo118756a("change_member", ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108867q());
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: g */
        public void mo108903g() {
            if (((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o() == 3) {
                m112009k();
                return;
            }
            if (((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o() == 2) {
                CalendarFreeBusyHitPoint.f83363a.mo118756a("full_create_event", ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108867q());
            }
            GeneralHitPoint.m124181a(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108866p());
            ArrangePresenter.this.f75404a.mo108928a(2, HitPointUtil.m124311a(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108866p()));
        }

        /* renamed from: k */
        private final void m112009k() {
            ArrayList<String> arrayList;
            ArrayList<String> arrayList2;
            ArrayList<CalendarEventAttendee> arrayList3;
            Context b = ArrangePresenter.this.f75404a.mo108930b();
            if (b != null) {
                ArrangeMeetingData t = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108870t();
                if (m112008a(t)) {
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    arrayList4.add(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108867q());
                    arrayList = arrayList4;
                    arrayList3 = null;
                    arrayList2 = arrayList3;
                } else {
                    arrayList3 = ArrangeUtil.f75376a.mo108931a(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108842a());
                    arrayList = null;
                    arrayList2 = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108864n();
                }
                EditActivityEntrance.f79940a.mo114666a(b, ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108853c(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108854d(), arrayList3, arrayList2, ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108867q(), 2, t.mo108907a(), arrayList);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterViewDelegate() {
        }

        /* renamed from: a */
        private final boolean m112008a(ArrangeMeetingData aVar) {
            if (!aVar.mo108911b() || aVar.mo108912c()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: a */
        public void mo108894a(int i) {
            if (((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o() == 2) {
                CalendarFreeBusyHitPoint.f83363a.mo118756a("change_list", ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108867q());
            }
            ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108843a(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: a */
        public void mo108896a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            if (((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108865o() == 2) {
                CalendarFreeBusyHitPoint.f83363a.mo118756a("day_change", ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108867q());
            }
            ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108848a(calendarDate);
            long timeInSeconds = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108855e().getTimeInSeconds();
            String id = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108852b().getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "model.getViewTimeZone().id");
            ((ArrangeContract.IArrangeView) ArrangePresenter.this.getView()).mo108874a(timeInSeconds, id);
            ((ArrangeContract.IArrangeView) ArrangePresenter.this.getView()).mo108875a(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108853c(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108862l(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108852b());
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: a */
        public void mo108897a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108849a(str);
            long c = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108853c();
            String id = ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108852b().getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "model.getViewTimeZone().id");
            ((ArrangeContract.IArrangeView) ArrangePresenter.this.getView()).mo108874a(c, id);
            ArrangePresenter.this.mo108940c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeView.ViewDelegate
        /* renamed from: a */
        public void mo108895a(int i, int i2) {
            ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108844a(i, i2);
            ((ArrangeContract.IArrangeView) ArrangePresenter.this.getView()).mo108875a(((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108853c(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108862l(), ((ArrangeContract.IArrangeModel) ArrangePresenter.this.getModel()).mo108852b());
            ArrangePresenter.this.mo108942e();
        }
    }

    /* renamed from: h */
    private final ArrangeContract.IArrangeModel.ModelDelegate m111991h() {
        return new ModelDelegate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ArrangeContract.IArrangeView.ViewDelegate createViewDelegate() {
        return new PresenterViewDelegate();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTimeFormatChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$i */
    public static final class C30195i implements AbstractC30037ag.AbstractC30038a {

        /* renamed from: a */
        final /* synthetic */ ArrangePresenter f75415a;

        C30195i(ArrangePresenter dVar) {
            this.f75415a = dVar;
        }

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag.AbstractC30038a
        /* renamed from: a */
        public final void mo108191a() {
            ((ArrangeContract.IArrangeView) this.f75415a.getView()).mo108885c();
        }
    }

    /* renamed from: j */
    private final void m111993j() {
        mo108937a();
        m111996m();
        mo108939b();
        mo108940c();
        mo108943f();
    }

    /* renamed from: o */
    private final void m111998o() {
        if (this.f75406d != null) {
            C30022a.f74882a.timeFormatDependency().mo108190b(this.f75406d);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m111998o();
        EventBus.getDefault().unregister(this);
    }

    /* renamed from: i */
    private final void m111992i() {
        mo108937a();
        m111996m();
        ((ArrangeContract.IArrangeModel) getModel()).mo108845a(new C30190e(this));
    }

    /* renamed from: l */
    private final void m111995l() {
        mo108937a();
        m111996m();
        ((ArrangeContract.IArrangeModel) getModel()).mo108845a(new C30191f(this));
    }

    /* renamed from: m */
    private final void m111996m() {
        String id = ((ArrangeContract.IArrangeModel) getModel()).mo108852b().getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timeZoneId");
        ((ArrangeContract.IArrangeView) getView()).mo108877a(id);
    }

    /* renamed from: n */
    private final void m111997n() {
        this.f75406d = new C30195i(this);
        C30022a.f74882a.timeFormatDependency().mo108188a(this.f75406d);
    }

    /* renamed from: b */
    public final void mo108939b() {
        ((ArrangeContract.IArrangeView) getView()).mo108878a(((ArrangeContract.IArrangeModel) getModel()).mo108842a());
    }

    /* renamed from: c */
    public final void mo108940c() {
        ((ArrangeContract.IArrangeModel) getModel()).mo108846a(new C30192g(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016JB\u0010\u0006\u001a\u00020\u000328\u0010\u0007\u001a4\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bj\u001e\u0012\u0004\u0012\u00020\t\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\r`\fH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$fetchDayEventChipData$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "onLoadFailed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadSucceed", "eventInstances", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$g */
    public static final class C30192g implements OnLoadEventInstances {

        /* renamed from: a */
        final /* synthetic */ ArrangePresenter f75412a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$g$a */
        static final class RunnableC30193a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30192g f75413a;

            RunnableC30193a(C30192g gVar) {
                this.f75413a = gVar;
            }

            public final void run() {
                ((ArrangeContract.IArrangeView) this.f75413a.f75412a.getView()).mo108883b();
                this.f75413a.f75412a.mo108941d();
                int o = ((ArrangeContract.IArrangeModel) this.f75413a.f75412a.getModel()).mo108865o();
                if (o == 1 || o == 3) {
                    this.f75413a.f75412a.mo108942e();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$g$b */
        static final class RunnableC30194b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30192g f75414a;

            RunnableC30194b(C30192g gVar) {
                this.f75414a = gVar;
            }

            public final void run() {
                ((ArrangeContract.IArrangeView) this.f75414a.f75412a.getView()).mo108875a(((ArrangeContract.IArrangeModel) this.f75414a.f75412a.getModel()).mo108853c(), ((ArrangeContract.IArrangeModel) this.f75414a.f75412a.getModel()).mo108862l(), ((ArrangeContract.IArrangeModel) this.f75414a.f75412a.getModel()).mo108852b());
                ((ArrangeContract.IArrangeView) this.f75414a.f75412a.getView()).mo108881a(((ArrangeContract.IArrangeModel) this.f75414a.f75412a.getModel()).mo108863m(), ((ArrangeContract.IArrangeModel) this.f75414a.f75412a.getModel()).mo108862l(), ((ArrangeContract.IArrangeModel) this.f75414a.f75412a.getModel()).mo108852b());
                int o = ((ArrangeContract.IArrangeModel) this.f75414a.f75412a.getModel()).mo108865o();
                if (o == 1 || o == 3) {
                    this.f75414a.f75412a.mo108942e();
                }
                this.f75414a.f75412a.mo108941d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30192g(ArrangePresenter dVar) {
            this.f75412a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances
        /* renamed from: a */
        public void mo108498a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CalendarPerfMonitor.m124417b("key_freebusy_view");
            ((ArrangeContract.IArrangeView) this.f75412a.getView()).mo108880a(new HashMap<>());
            this.f75412a.f75405b.post(new RunnableC30193a(this));
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances
        /* renamed from: a */
        public void mo108499a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(hashMap, "eventInstances");
            if (((ArrangeContract.IArrangeModel) this.f75412a.getModel()).mo108865o() == 2) {
                CalendarFreeBusyHitPoint dVar = CalendarFreeBusyHitPoint.f83363a;
                Collection<ArrayList<DayEventChipViewData>> values = hashMap.values();
                Intrinsics.checkExpressionValueIsNotNull(values, "eventInstances.values");
                if (com.ss.android.lark.calendar.impl.framework.hitpoint.event2.HitPointUtil.m124397a(values) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.mo118755a(Boolean.valueOf(z), ((ArrangeContract.IArrangeModel) this.f75412a.getModel()).mo108867q());
            }
            ((ArrangeContract.IArrangeView) this.f75412a.getView()).mo108880a(hashMap);
            this.f75412a.f75405b.post(new RunnableC30194b(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$ModelDelegate;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel$ModelDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter;)V", "onLoadAttendeeSuccess", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$b */
    public final class ModelDelegate implements ArrangeContract.IArrangeModel.ModelDelegate {
        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel.ModelDelegate
        /* renamed from: a */
        public void mo108871a() {
            ((ArrangeContract.IArrangeView) ArrangePresenter.this.getView()).mo108889g();
            ((ArrangeContract.IArrangeView) ArrangePresenter.this.getView()).mo108890h();
            ArrangePresenter.this.mo108937a();
            ArrangePresenter.this.mo108939b();
            ArrangePresenter.this.mo108940c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ModelDelegate() {
        }
    }

    /* renamed from: k */
    private final void m111994k() {
        ((ArrangeContract.IArrangeView) getView()).mo108884b(false);
        mo108937a();
        m111996m();
        ((ArrangeContract.IArrangeModel) getModel()).mo108851a(((ArrangeContract.IArrangeModel) getModel()).mo108864n(), new C30189d(this));
    }

    /* renamed from: a */
    public final void mo108937a() {
        long c = ((ArrangeContract.IArrangeModel) getModel()).mo108853c();
        String id = ((ArrangeContract.IArrangeModel) getModel()).mo108852b().getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "model.getViewTimeZone().id");
        ((ArrangeContract.IArrangeView) getView()).mo108874a(c, id);
        if (((ArrangeContract.IArrangeModel) getModel()).mo108865o() == 1) {
            ((ArrangeContract.IArrangeView) getView()).mo108872a();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        int o = ((ArrangeContract.IArrangeModel) getModel()).mo108865o();
        if (o == 2) {
            m111992i();
        } else if (o == 3) {
            m111994k();
        } else if (o != 4) {
            m111993j();
        } else {
            m111995l();
        }
    }

    /* renamed from: d */
    public final void mo108941d() {
        ((ArrangeContract.IArrangeView) getView()).mo108873a(((ArrangeContract.IArrangeModel) getModel()).mo108853c(), ((ArrangeContract.IArrangeModel) getModel()).mo108854d(), ((ArrangeContract.IArrangeModel) getModel()).mo108852b());
    }

    /* renamed from: e */
    public final void mo108942e() {
        ((ArrangeContract.IArrangeView) getView()).mo108876a(((ArrangeContract.IArrangeModel) getModel()).mo108857g());
        ((ArrangeContract.IArrangeView) getView()).mo108879a(((ArrangeContract.IArrangeModel) getModel()).mo108858h(), ((ArrangeContract.IArrangeModel) getModel()).mo108859i(), ((ArrangeContract.IArrangeModel) getModel()).mo108860j());
    }

    /* renamed from: f */
    public final void mo108943f() {
        int o = ((ArrangeContract.IArrangeModel) getModel()).mo108865o();
        boolean s = ((ArrangeContract.IArrangeModel) getModel()).mo108869s();
        if (o == 1) {
            ((ArrangeContract.IArrangeView) getView()).mo108886d();
            ((ArrangeContract.IArrangeView) getView()).mo108882a(s);
        } else if (o == 2 || o == 3) {
            ((ArrangeContract.IArrangeView) getView()).mo108887e();
            ((ArrangeContract.IArrangeView) getView()).mo108882a(s);
            ((ArrangeContract.IArrangeView) getView()).mo108892j();
            ((ArrangeContract.IArrangeView) getView()).mo108888f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$createFromChatAI$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$d */
    public static final class C30189d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ArrangePresenter f75409a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30189d(ArrangePresenter dVar) {
            this.f75409a = dVar;
        }

        /* renamed from: a */
        public void mo108945a(boolean z) {
            this.f75409a.mo108939b();
            this.f75409a.mo108940c();
            this.f75409a.mo108943f();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo108945a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ArrangeContract.IArrangeView) this.f75409a.getView()).mo108883b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$createFromChatSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$e */
    public static final class C30190e implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ArrangePresenter f75410a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30190e(ArrangePresenter dVar) {
            this.f75410a = dVar;
        }

        /* renamed from: a */
        public void mo108946a(boolean z) {
            this.f75410a.mo108939b();
            this.f75410a.mo108940c();
            this.f75410a.mo108943f();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo108946a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ArrangeContract.IArrangeView) this.f75410a.getView()).mo108883b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$createFromMeetingSignIn$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.d$f */
    public static final class C30191f implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ArrangePresenter f75411a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30191f(ArrangePresenter dVar) {
            this.f75411a = dVar;
        }

        /* renamed from: a */
        public void mo108947a(boolean z) {
            this.f75411a.mo108939b();
            this.f75411a.mo108940c();
            this.f75411a.mo108943f();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo108947a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ArrangeContract.IArrangeView) this.f75411a.getView()).mo108883b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArrangePresenter(ArrangeContract.IArrangeModel aVar, ArrangeContract.IArrangeView bVar, fragmentDependency hVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(hVar, "context");
        this.f75404a = hVar;
        EventBus.getDefault().register(this);
        m111997n();
        aVar.mo108847a(m111991h());
        CalendarFreeBusyHitPoint.f83363a.mo118754a();
    }

    /* renamed from: a */
    public final void mo108938a(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            if (intent != null) {
                AbstractC30049m groupMemberManageDependency = C30022a.f74882a.groupMemberManageDependency();
                Intrinsics.checkExpressionValueIsNotNull(groupMemberManageDependency, "CalendarDependencyHolder…pMemberManageDependency()");
                arrayList = intent.getStringArrayListExtra(groupMemberManageDependency.mo108239a());
            } else {
                arrayList = null;
            }
            int i3 = 0;
            if (CollectionUtils.isNotEmpty(arrayList)) {
                ((ArrangeContract.IArrangeModel) getModel()).mo108850a(arrayList);
                if (arrayList != null) {
                    i3 = arrayList.size();
                }
                GeneralHitPoint.m124179a(i3);
                return;
            }
            ((ArrangeContract.IArrangeView) getView()).mo108891i();
            ((ArrangeContract.IArrangeModel) getModel()).mo108868r();
            GeneralHitPoint.m124179a(0);
        } else if (i == 2) {
            this.f75404a.mo108926a();
        }
    }
}
