package com.ss.android.lark.calendar.impl.features.events.edit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.api.entity.PoiInfo;
import com.ss.android.lark.calendar.dependency.idependency.IPoiPickDependency;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeActivity;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.helper.CalendarLogHelper;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.common.p1498d.C31129b;
import com.ss.android.lark.calendar.impl.features.common.screenshot.ScreenShotProcess;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalContact;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalDepartment;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerViewModel;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarPickerEntranceParams;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionSaveData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IDeleteProcessListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeActivity;
import com.ss.android.lark.calendar.impl.features.events.edit.operation.DeleteProcess;
import com.ss.android.lark.calendar.impl.features.events.edit.operation.SaveProcess;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditCalendarPart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.MeetingRoomLimitData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32489g;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetSettingsResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.PullEventIndividualAttendeesResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.rustadapter.service.MeetingRoomService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.calendar.impl.utils.ThirdPartAccountSPUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h */
public final class EditPresenter extends BasePresenterCalendar<IEditContract.IEditModelApi, IEditContract.IEditViewApi, IEditContract.IEditViewData, IEditContract.IEditViewAction> {

    /* renamed from: d */
    public static final Companion f81107d = new Companion(null);

    /* renamed from: a */
    public final ActivityDependency f81108a;

    /* renamed from: b */
    public DeleteProcess f81109b;

    /* renamed from: c */
    public SaveProcess f81110c;

    /* renamed from: e */
    private final AbstractC32595g f81111e;

    /* renamed from: f */
    private final AbstractC32594f f81112f;

    /* renamed from: g */
    private final AbstractC30054s f81113g = C30022a.f74882a.loginDependency();

    /* renamed from: h */
    private AbstractC30037ag.AbstractC30038a f81114h;

    /* renamed from: i */
    private final Lazy f81115i;

    /* renamed from: j */
    private final C31860v f81116j;

    /* renamed from: k */
    private final C31861w f81117k;

    /* renamed from: l */
    private boolean f81118l;

    /* renamed from: l */
    private final ScreenShotProcess m120875l() {
        return (ScreenShotProcess) this.f81115i.getValue();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r */
    private final void m120881r() {
        m120882v();
    }

    /* renamed from: a */
    public final void mo116099a(HashMap<String, Boolean> hashMap) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getAllCalendars", new String[0]));
        C30076a.m111290a().mo108432c(new UIGetDataCallback(new C31851m(this, valueOf, "getAllCalendars", hashMap)));
    }

    /* renamed from: a */
    public final void mo116100a(List<String> list, boolean z) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getAttendeesByChatterIds", "chatter_ids", CollectionUtils.isEmpty(list) ? "null" : list.get(0)));
        this.f81112f.mo118880b(list, mo118653u().wrapAndAddGetDataCallback(new C31850l(this, valueOf, "getAttendeesByChatterIds", z)));
    }

    /* renamed from: a */
    public final void mo116103a(boolean z, boolean z2, boolean z3, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, HashMap<String, CalendarEventAttendee> hashMap, Map<String, String> map) {
        if (z && z2 && z3) {
            ((IEditContract.IEditModelApi) mo118652t()).mo114448a(false);
            if (CollectionUtils.isEmpty(arrayList) && CollectionUtils.isEmpty(arrayList2) && CollectionUtils.isEmpty(arrayList3) && CollectionUtils.isEmpty(map)) {
                return;
            }
            if (m120873a(arrayList, arrayList2, CollectionsKt.toList(map.keySet()), hashMap)) {
                mo116108g();
                return;
            }
            m120871a(arrayList4, hashMap);
            ArrayList<String> a = m120867a(map, hashMap);
            if (((IEditContract.IEditModelApi) mo118652t()).mo114451a(arrayList, arrayList2, arrayList3, hashMap)) {
                ((IEditContract.IEditViewApi) mo118651s()).mo114330c(((IEditContract.IEditModelApi) mo118652t()).af());
            } else if (CollectionUtils.isNotEmpty(a)) {
                ((IEditContract.IEditViewApi) mo118651s()).mo114324a(a, ((IEditContract.IEditModelApi) mo118652t()).ag());
            }
            ((IEditContract.IEditViewApi) mo118651s()).mo114337i();
        }
    }

    /* renamed from: a */
    public final void mo116097a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            m120874b(i, i2, intent);
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$c */
    public final class editViewAction implements IEditContract.IEditViewAction {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114524a(ArrayList<CalendarEventAttendee> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "displayAttendees");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114474b(arrayList);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114525a(boolean z) {
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114490e(z);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114527a(Integer[] numArr) {
            Intrinsics.checkParameterIsNotNull(numArr, "chosenIndexArray");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114450a(numArr);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114521a(EventRecurrence eventRecurrence) {
            Intrinsics.checkParameterIsNotNull(eventRecurrence, "customRRule");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114440a(eventRecurrence);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114526a(boolean z, int i, int i2, int i3) {
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114449a(z, i, i2, i3);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114522a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "summary");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114441a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114520a(DoVideoMeeting doVideoMeeting) {
            Intrinsics.checkParameterIsNotNull(doVideoMeeting, "doVideoMeeting");
            DoVideoMeeting videoMeeting = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114483d().getVideoMeeting();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114439a(doVideoMeeting, (videoMeeting != null ? videoMeeting.getMeetingType() : null) != doVideoMeeting.getMeetingType());
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114523a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114323a(EditPresenter.this.f81108a, str, resourceCustomization);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: b */
        public void mo114528b() {
            EditPresenter.this.mo116110i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: d */
        public void mo114535d() {
            EditPresenter.this.f81108a.mo114281c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: h */
        public void mo114541h() {
            EditPresenter.this.mo116096a(12);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: k */
        public void mo114544k() {
            EditPresenter.this.f81108a.mo114273a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: c */
        public void mo114533c() {
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114328b(EditPresenter.this.f81108a);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: l */
        public void mo114545l() {
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114320a(EditPresenter.this.f81108a);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: j */
        public void mo114543j() {
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ak();
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: e */
        public void mo114537e() {
            EditPresenter.m120866a(EditPresenter.this).mo114680a(((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114478c(), ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114487e(), EditPresenter.this.mo118653u(), ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114333e());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: f */
        public void mo114539f() {
            if (((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114425S()) {
                CalendarEvent c = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114478c();
                if (c != null) {
                    EditPresenter.this.mo116098a(c);
                    return;
                }
                return;
            }
            GeneralHitPoint.m124244e(((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114503n());
            EditPresenter.this.f81108a.mo114273a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: g */
        public void mo114540g() {
            if (((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).aw()) {
                ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114327b(R.string.Calendar_Common_LoadAndWait);
            } else {
                EditPresenter.this.mo116096a(3);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114511a() {
            if (((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114414G() || ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114415H()) {
                ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114331d();
            } else {
                GeneralHitPoint.m124244e(((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114503n());
                if (((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114425S()) {
                    CalendarEvent c = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114478c();
                    if (c != null) {
                        EditPresenter.this.mo116098a(c);
                    }
                } else {
                    EditPresenter.this.f81108a.mo114273a();
                }
            }
            if (((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114509y()) {
                CalendarHitPoint.m124147l("close");
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: i */
        public void mo114542i() {
            long j;
            String str;
            CalendarEventInstance e = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114487e();
            String str2 = "null";
            if (e != null) {
                str2 = e.getKey();
                Intrinsics.checkExpressionValueIsNotNull(str2, "instance.key");
                str = e.getEventServerId();
                Intrinsics.checkExpressionValueIsNotNull(str, "instance.eventServerId");
                j = e.getOriginalTime();
            } else {
                j = -1;
                str = str2;
            }
            AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(ArrangeActivity.class).mo108152a("calendar_arrange_source", (Serializable) 1);
            ArrayList<AbstractC30095b> ai2 = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ai();
            if (ai2 != null) {
                a.mo108152a("calendar_append_arrange_attendee", ai2).mo108152a("event_start_time", Long.valueOf(((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114493g())).mo108152a("event_end_time", Long.valueOf(((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114496h())).mo108153a("organizer_calendar_id", ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).aj()).mo108153a("event_instance_key", str2).mo108153a("event_server_id", str).mo108152a("event_original_time", Long.valueOf(j)).mo108153a("arrange_time_zone_id", ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114498i()).mo108155a(((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114333e(), 2);
                GeneralHitPoint.m124180a(((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114505r(), -1, "full_event_editor", ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114506s());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.io.Serializable");
        }

        public editViewAction() {
            EditPresenter.this = r1;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114515a(Fragment fragment) {
            ActivityDependency.C31840a.m120917a(EditPresenter.this.f81108a, fragment, 0, 0, 6, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: b */
        public void mo114529b(int i) {
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114321a(EditPresenter.this.f81108a, i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114516a(MeetingRoomFragmentData meetingRoomFragmentData) {
            Intrinsics.checkParameterIsNotNull(meetingRoomFragmentData, "meetingRoomFragmentData");
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114322a(EditPresenter.this.f81108a, meetingRoomFragmentData);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: c */
        public void mo114534c(int i) {
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114491f(i);
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: d */
        public void mo114536d(int i) {
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114485d(i);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: b */
        public void mo114530b(String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            ActivityDependency aVar = EditPresenter.this.f81108a;
            long g = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114493g();
            long h = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114496h();
            String i = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114498i();
            String rRule = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114483d().getRRule();
            if (rRule == null) {
                rRule = "";
            }
            aVar.mo114278a(str, g, h, i, rRule);
            if (((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114503n()) {
                str2 = "edit";
            } else {
                str2 = "new";
            }
            GeneralHitPoint.m124236c("full_event_editor", str2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: e */
        public void mo114538e(int i) {
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114488e(i);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114512a(int i) {
            boolean z;
            EditCalendarPart.CHANGE_TYPE a = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114430a(i);
            if (a == EditCalendarPart.CHANGE_TYPE.LARK_TO_LARK || a == EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_GOOGLE || a == EditCalendarPart.CHANGE_TYPE.EXCHANGE_TO_EXCHANGE || a == EditCalendarPart.CHANGE_TYPE.EDIT_SWITCH_CALENDAR || a == EditCalendarPart.CHANGE_TYPE.EDIT_SWITCH_CALENDAR_NEED_ADD_OWNER) {
                EditPresenter hVar = EditPresenter.this;
                if (a == EditCalendarPart.CHANGE_TYPE.EDIT_SWITCH_CALENDAR_NEED_ADD_OWNER) {
                    z = true;
                } else {
                    z = false;
                }
                hVar.mo116101a(z);
                mo114513a(i, a);
                return;
            }
            boolean C = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114410C();
            boolean D = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114411D();
            boolean ab = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ab();
            boolean aa = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).aa();
            if (a == EditCalendarPart.CHANGE_TYPE.LARK_TO_GOOGLE || a == EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_LARK) {
                if (C || D) {
                    ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114316a(i, a, C, D, false, false);
                } else {
                    mo114513a(i, a);
                }
            } else if (a == EditCalendarPart.CHANGE_TYPE.LARK_TO_EXCHANGE || a == EditCalendarPart.CHANGE_TYPE.EXCHANGE_TO_LARK) {
                if (C || D || ab || aa) {
                    ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114316a(i, a, C, D, aa, ab);
                } else {
                    mo114513a(i, a);
                }
            } else if (a != EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_EXCHANGE && a != EditCalendarPart.CHANGE_TYPE.EXCHANGE_TO_GOOGLE) {
            } else {
                if (D || ab || aa) {
                    ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114316a(i, a, false, D, aa, ab);
                } else {
                    mo114513a(i, a);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: b */
        public void mo114532b(ArrayList<CalendarEventAttendee> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "meetingRoom");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114417K();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114481c(arrayList);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114517a(DescriptionSaveData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114435a(aVar);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114518a(CalendarEvent.Visibility visibility) {
            Intrinsics.checkParameterIsNotNull(visibility, "visibility");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114436a(visibility);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114519a(CalendarEventAttendee calendarEventAttendee) {
            Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRooms");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114480c(calendarEventAttendee);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: b */
        public void mo114531b(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114442a(str, resourceCustomization);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114329c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114513a(int i, EditCalendarPart.CHANGE_TYPE change_type) {
            String userId;
            boolean z;
            Intrinsics.checkParameterIsNotNull(change_type, "changeType");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114432a(i, change_type);
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            String str = null;
            if (((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114507t() || ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114508u() || change_type != EditCalendarPart.CHANGE_TYPE.EDIT_SWITCH_CALENDAR_NEED_ADD_OWNER) {
                if (((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114507t() || ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114508u()) {
                    ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114473b((CalendarEventAttendee) null);
                } else {
                    EditPresenter.this.mo116106e();
                }
                ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114315a(6);
                ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
                return;
            }
            Calendar l = ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114501l();
            if (!(l == null || (userId = l.getUserId()) == null)) {
                if (userId.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = userId;
                }
                if (str != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    EditPresenter.this.mo116100a((List<String>) arrayList, true);
                    return;
                }
            }
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114315a(6);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewAction
        /* renamed from: a */
        public void mo114514a(long j, long j2, boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).ac();
            ((IEditContract.IEditModelApi) EditPresenter.this.mo118652t()).mo114433a(j, j2, z, str);
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114337i();
            ((IEditContract.IEditViewApi) EditPresenter.this.mo118651s()).mo114315a(2);
        }
    }

    /* renamed from: a */
    public final void mo116096a(int i) {
        boolean z;
        this.f81108a.mo114281c();
        if (i == 3) {
            if (!((IEditContract.IEditModelApi) mo118652t()).mo114483d().isCrossTenant() && (CalendarEvent.Type.MEETING == ((IEditContract.IEditModelApi) mo118652t()).mo114483d().getType() || ((IEditContract.IEditModelApi) mo118652t()).mo114483d().hasMeetingMinute())) {
                z = false;
            } else {
                z = true;
            }
            if (((IEditContract.IEditModelApi) mo118652t()).mo114412E() || ((IEditContract.IEditModelApi) mo118652t()).mo114413F()) {
                m120863F();
            } else if (!((IEditContract.IEditModelApi) mo118652t()).mo114503n() || ((IEditContract.IEditModelApi) mo118652t()).mo114428W().isEmpty()) {
                mo116102a(true, z, (List<String>) new ArrayList(((IEditContract.IEditModelApi) mo118652t()).mo114426U()));
            } else {
                m120872a(true, z);
            }
            if (((IEditContract.IEditModelApi) mo118652t()).mo114509y()) {
                CalendarHitPoint.m124147l("addguest");
            }
        } else if (i == 12) {
            C30022a.f74882a.poiPickDependency().mo108291a(this.f81108a.mo114279b(), new C31863y(this));
        }
    }

    /* renamed from: a */
    public final void mo116098a(CalendarEvent calendarEvent) {
        Intent intent = new Intent();
        LargeCalendarTransmitHelper.m116181a(intent, calendarEvent);
        this.f81108a.mo114275a(3, intent);
        this.f81108a.mo114273a();
    }

    /* renamed from: a */
    public final void mo116102a(boolean z, boolean z2, List<String> list) {
        boolean j = C30022a.f74883b.mo112702j();
        CalendarChatterPickerActivity.f78852a.mo113054a(this.f81108a.mo114279b(), new CalendarPickerEntranceParams.Builder().mo113108b(j ? R.string.Calendar_Edit_SearchPlaceholder : R.string.Calendar_Edit_AddGuestPlaceholder).mo113114d(list).mo113112c(z).mo113115d(z2).mo113106a(true).mo113117e(true).mo113110b(true).mo113119f(true).mo113121g(j).mo113123h(true).mo113104a(CalendarChatterPickerViewModel.ActivityOpenDirection.VERTICAL).mo113132p(), 1);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$w */
    public static final class C31861w implements ISaveProcessListener {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81208a;

        /* renamed from: b */
        final /* synthetic */ IEditContract.IEditViewApi f81209b;

        /* renamed from: c */
        final /* synthetic */ IEditContract.IEditModelApi f81210c;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: b */
        public void mo114641b() {
            this.f81208a.f81108a.mo114273a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: c */
        public boolean mo114643c() {
            return this.f81210c.mo114416I();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: e */
        public long mo114645e() {
            return this.f81210c.mo114493g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: f */
        public String mo114646f() {
            return this.f81210c.mo114510z();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: g */
        public String mo114647g() {
            return this.f81210c.mo114408A();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: a */
        public void mo114636a() {
            this.f81209b.mo114317a(this.f81208a.f81108a.mo114279b());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: d */
        public CalendarDate mo114644d() {
            MeetingRoomLimitData at = this.f81210c.at();
            if (at != null) {
                return at.mo116397a();
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: h */
        public String mo114648h() {
            CalendarDate calendarDate;
            MeetingRoomLimitData at = this.f81210c.at();
            MeetingRoomStrategyHelper fVar = MeetingRoomStrategyHelper.f79934a;
            String str = null;
            if (at != null) {
                calendarDate = at.mo116397a();
            } else {
                calendarDate = null;
            }
            if (at != null) {
                str = at.mo116398b();
            }
            return fVar.mo114626a(calendarDate, str, this.f81210c.mo114505r());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: a */
        public void mo114638a(CalendarEvent calendarEvent) {
            this.f81208a.f81108a.mo114274a(-1);
            this.f81208a.f81108a.mo114273a();
            C31238b.m116865a(this.f81208a.f81108a.mo114279b(), calendarEvent);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: b */
        public void mo114642b(int i) {
            if (i != 10011) {
                this.f81209b.mo114327b(R.string.Calendar_Toast_FailedToSave);
            } else {
                this.f81209b.mo114327b(R.string.Calendar_Edit_SaveLimit);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: a */
        public void mo114637a(int i) {
            if (i == 10011) {
                this.f81209b.mo114327b(R.string.Calendar_Edit_SaveLimit);
            } else if (i != 100012) {
                this.f81209b.mo114327b(R.string.Calendar_Toast_FailedToSave);
            } else {
                EventBus.getDefault().trigger(new C32489g());
            }
        }

        C31861w(EditPresenter hVar, IEditContract.IEditViewApi dVar, IEditContract.IEditModelApi bVar) {
            this.f81208a = hVar;
            this.f81209b = dVar;
            this.f81210c = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: a */
        public void mo114639a(CalendarEvent calendarEvent, int i, long j, long j2) {
            Intrinsics.checkParameterIsNotNull(calendarEvent, "resultEvent");
            Intent intent = new Intent();
            LargeCalendarTransmitHelper.m116181a(intent, calendarEvent);
            intent.putExtra("edit_calendar_event_adjust_time", i);
            intent.putExtra("edit_calendar_event_adjust_time_start", j);
            intent.putExtra("edit_calendar_event_adjust_time_end", j2);
            this.f81208a.f81108a.mo114275a(3, intent);
            this.f81208a.f81108a.mo114273a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener
        /* renamed from: a */
        public void mo114640a(boolean z, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance) {
            if (!(calendarEvent == null || calendarEvent2 == null || calendarEventInstance == null)) {
                this.f81210c.mo114437a(calendarEvent, calendarEvent2, calendarEventInstance);
            }
            this.f81210c.mo114482c(z);
            this.f81209b.mo114325a(z);
        }
    }

    /* renamed from: a */
    public IEditContract.IEditViewAction mo109713b() {
        return new editViewAction();
    }

    /* renamed from: c */
    public final void mo116104c() {
        m120875l().mo112739b();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m120876m();
    }

    /* renamed from: d */
    public final void mo116105d() {
        m120875l().mo112738a();
    }

    /* renamed from: k */
    public final C31129b.AbstractC31130a mo116112k() {
        return new C31842e(this);
    }

    /* renamed from: q */
    private final void m120880q() {
        ((IEditContract.IEditViewApi) mo118651s()).mo114335g();
        this.f81108a.mo114282d();
    }

    /* renamed from: v */
    private final void m120882v() {
        if (this.f81114h != null) {
            C30022a.f74882a.timeFormatDependency().mo108190b(this.f81114h);
        }
    }

    /* renamed from: f */
    public final void mo116107f() {
        ((IEditContract.IEditViewApi) mo118651s()).mo114332d(R.string.Calendar_Toast_CalError);
    }

    /* renamed from: g */
    public final void mo116108g() {
        ((IEditContract.IEditViewApi) mo118651s()).mo114327b(R.string.Calendar_Toast_GuestError);
    }

    /* renamed from: h */
    public final void mo116109h() {
        ((IEditContract.IEditViewApi) mo118651s()).mo114334f();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$v */
    public static final class C31860v implements IDeleteProcessListener {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81206a;

        /* renamed from: b */
        final /* synthetic */ IEditContract.IEditViewApi f81207b;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IDeleteProcessListener
        /* renamed from: a */
        public void mo113884a() {
            CalendarHitPoint.m124141i("edit");
            this.f81206a.f81108a.mo114274a(2);
            this.f81206a.f81108a.mo114273a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IDeleteProcessListener
        /* renamed from: b */
        public void mo113885b() {
            CalendarHitPoint.m124141i("edit");
            this.f81207b.mo114327b(R.string.Calendar_Common_DeleteFailedTip);
            this.f81206a.f81108a.mo114273a();
        }

        C31860v(EditPresenter hVar, IEditContract.IEditViewApi dVar) {
            this.f81206a = hVar;
            this.f81207b = dVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$x */
    public static final class C31862x extends Lambda implements Function0<ScreenShotProcess> {
        final /* synthetic */ ActivityDependency $activityDependency;
        final /* synthetic */ EditPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31862x(EditPresenter hVar, ActivityDependency aVar) {
            super(0);
            this.this$0 = hVar;
            this.$activityDependency = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ScreenShotProcess invoke() {
            return new ScreenShotProcess(this.$activityDependency.mo114279b(), this.this$0.mo116112k());
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$z */
    public static final class C31864z implements AbstractC30037ag.AbstractC30038a {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81212a;

        C31864z(EditPresenter hVar) {
            this.f81212a = hVar;
        }

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag.AbstractC30038a
        /* renamed from: a */
        public final void mo108191a() {
            ((IEditContract.IEditViewApi) this.f81212a.mo118651s()).mo114337i();
            ((IEditContract.IEditViewApi) this.f81212a.mo118651s()).mo114336h();
        }
    }

    /* renamed from: C */
    private final void m120860C() {
        m120870a(((IEditContract.IEditModelApi) mo118652t()).am(), ((IEditContract.IEditModelApi) mo118652t()).an(), null, null, null);
    }

    /* renamed from: D */
    private final void m120861D() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) new HashMap();
        ThirdPartAccountSPUtil.m125202a(new C31857s(this, objectRef));
    }

    /* renamed from: E */
    private final void m120862E() {
        this.f81114h = new C31864z(this);
        C30022a.f74882a.timeFormatDependency().mo108188a(this.f81114h);
    }

    /* renamed from: m */
    private final void m120876m() {
        m120877n();
        m120878o();
        m120879p();
        CalendarEventHitPoint.m124334a();
        ((IEditContract.IEditViewApi) mo118651s()).mo114337i();
    }

    /* renamed from: n */
    private final void m120877n() {
        m120883w();
        m120886z();
        m120858A();
        m120859B();
        m120860C();
        m120861D();
        m120864G();
        m120865H();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        ((IEditContract.IEditViewApi) mo118651s()).destroy();
        EventBus.getDefault().unregister(this);
        m120881r();
        super.destroy();
    }

    /* renamed from: A */
    private final void m120858A() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getBuilding", new String[0]));
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31843f(this, valueOf, "getBuilding"));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        MeetingRoomService.m124891a(wrapAndAddGetDataCallback);
    }

    /* renamed from: F */
    private final void m120863F() {
        C30022a.f74882a.appRouter().mo108210a(AddMailAttendeeActivity.class).mo108152a("external_attendee_emails", new ArrayList(((IEditContract.IEditModelApi) mo118652t()).mo114427V())).mo108155a(((IEditContract.IEditViewApi) mo118651s()).mo114333e(), 3);
    }

    /* renamed from: o */
    private final void m120878o() {
        DeleteProcess aVar = new DeleteProcess(((IEditContract.IEditModelApi) mo118652t()).mo114478c());
        this.f81109b = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeleteProcess");
        }
        aVar.mo114675a(this.f81116j);
        SaveProcess eVar = new SaveProcess(((IEditContract.IEditModelApi) mo118652t()).mo114478c());
        this.f81110c = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcess");
        }
        eVar.mo114711a(this.f81117k);
    }

    /* renamed from: w */
    private final void m120883w() {
        CalendarEvent c = ((IEditContract.IEditModelApi) mo118652t()).mo114478c();
        if (c != null && c.getSource() != CalendarEvent.Source.ANDROID && c.getSource() != CalendarEvent.Source.UNKNOWN_SOURCE) {
            m120884x();
            if (c.getOriginalTime() != 0) {
                m120885y();
            }
        }
    }

    /* renamed from: x */
    private final void m120884x() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "loadExceptionalEventNumber", new String[0]));
        C31855q qVar = new C31855q(this, valueOf, "loadExceptionalEventNumber");
        CalendarEvent c = ((IEditContract.IEditModelApi) mo118652t()).mo114478c();
        if (c != null) {
            this.f81112f.mo118871a(c.getCalendarId(), c.getKey(), qVar);
        }
    }

    /* renamed from: y */
    private final void m120885y() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "loadExceptionalHasRepeat", new String[0]));
        C31856r rVar = new C31856r(this, valueOf, "loadExceptionalHasRepeat");
        CalendarEvent c = ((IEditContract.IEditModelApi) mo118652t()).mo114478c();
        if (c != null) {
            this.f81112f.mo118878b(c.getCalendarId(), c.getKey(), 0, rVar);
        }
    }

    /* renamed from: z */
    private final void m120886z() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "loadMaxAttendeeNumber", new String[0]));
        this.f81112f.mo118851a(new C31858t(this, valueOf, "loadMaxAttendeeNumber"));
    }

    /* renamed from: B */
    private final void m120859B() {
        ArrayList arrayList = new ArrayList();
        AbstractC30054s sVar = this.f81113g;
        Intrinsics.checkExpressionValueIsNotNull(sVar, "mLoginDependency");
        String a = sVar.mo108269a();
        arrayList.add(a);
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getAttendeesByChatterIds", "chatter_ids", a));
        this.f81112f.mo118880b(arrayList, mo118653u().wrapAndAddGetDataCallback(new C31854p(this, valueOf, "getAttendeesByChatterIds")));
    }

    /* renamed from: G */
    private final void m120864G() {
        CalendarEvent c;
        if (((IEditContract.IEditModelApi) mo118652t()).ar() && (c = ((IEditContract.IEditModelApi) mo118652t()).mo114478c()) != null) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getEventSimpleMembersRequest", new String[0]));
            this.f81112f.mo118887f(c.getCalendarId(), c.getKey(), c.getOriginalTime(), mo118653u().wrapAndAddGetDataCallback(new C31859u(this, valueOf, "getEventSimpleMembersRequest")));
        }
    }

    /* renamed from: H */
    private final void m120865H() {
        if (((IEditContract.IEditModelApi) mo118652t()).av()) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "pullEventIndividualAttendeesRequest", new String[0]));
            C31845g gVar = new C31845g(this, valueOf, "pullEventIndividualAttendeesRequest");
            CalendarEvent d = ((IEditContract.IEditModelApi) mo118652t()).mo114483d();
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            String m = ((IEditContract.IEditModelApi) mo118652t()).mo114502m();
            String key = d.getKey();
            if (key == null) {
                key = "";
            }
            long originalTime = d.getOriginalTime();
            String valueOf2 = String.valueOf(d.getVersion());
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(gVar);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
            aVar.mo118937a(m, key, originalTime, valueOf2, 0, "", true, (IGetDataCallback<PullEventIndividualAttendeesResponse>) wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: e */
    public final void mo116106e() {
        Calendar k = ((IEditContract.IEditModelApi) mo118652t()).mo114500k();
        if (k == null || (((IEditContract.IEditModelApi) mo118652t()).mo114503n() && !((IEditContract.IEditModelApi) mo118652t()).mo114424R())) {
            ((IEditContract.IEditModelApi) mo118652t()).mo114473b((CalendarEventAttendee) null);
            return;
        }
        String serverId = k.getServerId();
        ArrayList arrayList = new ArrayList();
        arrayList.add(serverId);
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getChattersByCalendarIds", "calendar_ids", serverId));
        this.f81111e.mo119042b(arrayList, mo118653u().wrapAndAddGetDataCallback(new C31852n(this, valueOf, "getChattersByCalendarIds")));
    }

    /* renamed from: j */
    public final void mo116111j() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getUserAttendeeBaseInfoRequest", new String[0]));
        List<SimpleMember> ap = ((IEditContract.IEditModelApi) mo118652t()).ap();
        if (ap != null) {
            List<SimpleMember> list = ap;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo120249a());
            }
            C31846h hVar = new C31846h(this, valueOf, "getUserAttendeeBaseInfoRequest");
            this.f81112f.mo118885d(arrayList, mo118653u().wrapAndAddGetDataCallback(hVar));
        }
    }

    /* renamed from: p */
    private final void m120879p() {
        if (((IEditContract.IEditModelApi) mo118652t()).mo114409B()) {
            ((IEditContract.IEditModelApi) mo118652t()).mo114422P();
            if (!((IEditContract.IEditModelApi) mo118652t()).mo114477b() && ((IEditContract.IEditModelApi) mo118652t()).mo114503n() && !((IEditContract.IEditModelApi) mo118652t()).mo114424R()) {
                m120868a(((IEditContract.IEditModelApi) mo118652t()).mo114502m());
            }
            if (((IEditContract.IEditModelApi) mo118652t()).mo114504p() && TextUtils.isEmpty(((IEditContract.IEditModelApi) mo118652t()).mo114499j())) {
                m120880q();
            }
        } else if (!((IEditContract.IEditModelApi) mo118652t()).mo114503n()) {
            ((IEditContract.IEditModelApi) mo118652t()).mo114420N();
            m120880q();
        } else {
            ((IEditContract.IEditModelApi) mo118652t()).mo114421O();
            if (!((IEditContract.IEditModelApi) mo118652t()).mo114477b() && !((IEditContract.IEditModelApi) mo118652t()).mo114424R()) {
                m120868a(((IEditContract.IEditModelApi) mo118652t()).mo114502m());
            }
            if (((IEditContract.IEditModelApi) mo118652t()).mo114504p() && TextUtils.isEmpty(((IEditContract.IEditModelApi) mo118652t()).mo114499j())) {
                m120880q();
            }
        }
    }

    /* renamed from: i */
    public final void mo116110i() {
        if (this.f81110c != null) {
            ((IEditContract.IEditModelApi) mo118652t()).mo114483d().setStartTime(((IEditContract.IEditModelApi) mo118652t()).mo114493g());
            ((IEditContract.IEditModelApi) mo118652t()).mo114483d().setEndTime(((IEditContract.IEditModelApi) mo118652t()).mo114496h());
            if (((IEditContract.IEditModelApi) mo118652t()).au()) {
                ((IEditContract.IEditViewApi) mo118651s()).mo114337i();
                return;
            }
            SaveProcess eVar = this.f81110c;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSaveProcess");
            }
            eVar.mo114720a(((IEditContract.IEditModelApi) mo118652t()).mo114503n(), ((IEditContract.IEditModelApi) mo118652t()).mo114478c(), ((IEditContract.IEditModelApi) mo118652t()).mo114483d(), ((IEditContract.IEditModelApi) mo118652t()).mo114487e(), ((IEditContract.IEditModelApi) mo118652t()).al(), mo118653u(), ((IEditContract.IEditViewApi) mo118651s()).mo114333e(), ((IEditContract.IEditModelApi) mo118652t()).aq(), this.f81118l, ((IEditContract.IEditModelApi) mo118652t()).mo114419M());
            if (((IEditContract.IEditModelApi) mo118652t()).mo114509y()) {
                CalendarHitPoint.m124147l("save");
            }
        }
    }

    /* renamed from: a */
    public final void mo116101a(boolean z) {
        this.f81118l = z;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$y */
    public static final class C31863y implements IPoiPickDependency.IPoiPickCallBack {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81211a;

        C31863y(EditPresenter hVar) {
            this.f81211a = hVar;
        }

        @Override // com.ss.android.lark.calendar.dependency.idependency.IPoiPickDependency.IPoiPickCallBack
        /* renamed from: a */
        public void mo108292a(PoiInfo cVar) {
            if (cVar != null) {
                ((IEditContract.IEditModelApi) this.f81211a.mo118652t()).ac();
                ((IEditContract.IEditModelApi) this.f81211a.mo118652t()).mo114443a(cVar.mo108406a(), cVar.mo108407b(), cVar.mo108409d(), cVar.mo108408c());
                ((IEditContract.IEditViewApi) this.f81211a.mo118651s()).mo114337i();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DeleteProcess m120866a(EditPresenter hVar) {
        DeleteProcess aVar = hVar.f81109b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeleteProcess");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$d */
    public static final class C31841d implements IGetDataCallback<Map<String, ? extends AbstractC30026d>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81120a;

        /* renamed from: b */
        final /* synthetic */ String f81121b;

        /* renamed from: c */
        final /* synthetic */ String f81122c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f81123d;

        /* renamed from: e */
        final /* synthetic */ boolean f81124e;

        /* renamed from: f */
        final /* synthetic */ boolean f81125f;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81121b, this.f81122c, errorResult));
            this.f81120a.mo116102a(this.f81124e, this.f81125f, this.f81123d);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends AbstractC30026d> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = "" + map.size();
            }
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81121b, this.f81122c, "chatters_size", str));
            if (map != null) {
                this.f81123d.addAll(map.keySet());
            }
            this.f81120a.mo116102a(this.f81124e, this.f81125f, this.f81123d);
        }

        C31841d(EditPresenter hVar, String str, String str2, ArrayList arrayList, boolean z, boolean z2) {
            this.f81120a = hVar;
            this.f81121b = str;
            this.f81122c = str2;
            this.f81123d = arrayList;
            this.f81124e = z;
            this.f81125f = z2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$h */
    public static final class C31846h implements IGetDataCallback<Map<String, UserAttendeeBaseInfo>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81134a;

        /* renamed from: b */
        final /* synthetic */ String f81135b;

        /* renamed from: c */
        final /* synthetic */ String f81136c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81135b, this.f81136c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(Map<String, UserAttendeeBaseInfo> map) {
            Intrinsics.checkParameterIsNotNull(map, "simpleMemberMap");
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81135b, this.f81136c, new String[0]));
            ((IEditContract.IEditModelApi) this.f81134a.mo118652t()).mo114475b(map);
            ((IEditContract.IEditViewApi) this.f81134a.mo118651s()).mo114337i();
        }

        C31846h(EditPresenter hVar, String str, String str2) {
            this.f81134a = hVar;
            this.f81135b = str;
            this.f81136c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$m */
    public static final class C31851m implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81179a;

        /* renamed from: b */
        final /* synthetic */ String f81180b;

        /* renamed from: c */
        final /* synthetic */ String f81181c;

        /* renamed from: d */
        final /* synthetic */ HashMap f81182d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81180b, this.f81181c, errorResult));
            this.f81179a.mo116107f();
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null) {
                str = "null";
            } else {
                str = "" + list.size();
            }
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81180b, this.f81181c, "calendars_size", str));
            if (list != null) {
                List<? extends Calendar> list2 = list;
                if (!list2.isEmpty()) {
                    ((IEditContract.IEditModelApi) this.f81179a.mo118652t()).mo114445a(new ArrayList<>(list2), this.f81182d);
                    ((IEditContract.IEditViewApi) this.f81179a.mo118651s()).mo114326b();
                    ((IEditContract.IEditViewApi) this.f81179a.mo118651s()).mo114337i();
                    this.f81179a.mo116106e();
                }
            }
        }

        C31851m(EditPresenter hVar, String str, String str2, HashMap hashMap) {
            this.f81179a = hVar;
            this.f81180b = str;
            this.f81181c = str2;
            this.f81182d = hashMap;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$o */
    public static final class C31853o implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81186a;

        /* renamed from: b */
        final /* synthetic */ String f81187b;

        /* renamed from: c */
        final /* synthetic */ String f81188c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81187b, this.f81188c, errorResult));
            this.f81186a.mo116107f();
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null) {
                str = "null";
            } else {
                str = "" + list.size();
            }
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81187b, this.f81188c, "calendars_size", str));
            if (list != null && CollectionUtils.isNotEmpty(list) && (list instanceof ArrayList)) {
                ((IEditContract.IEditModelApi) this.f81186a.mo118652t()).mo114444a((ArrayList) list);
                ((IEditContract.IEditViewApi) this.f81186a.mo118651s()).mo114337i();
            }
        }

        C31853o(EditPresenter hVar, String str, String str2) {
            this.f81186a = hVar;
            this.f81187b = str;
            this.f81188c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$p */
    public static final class C31854p implements IGetDataCallback<Map<String, ? extends CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81189a;

        /* renamed from: b */
        final /* synthetic */ String f81190b;

        /* renamed from: c */
        final /* synthetic */ String f81191c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81190b, this.f81191c, errorResult));
            this.f81189a.mo116108g();
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarEventAttendee> map) {
            String str;
            boolean z;
            if (map == null) {
                str = "null";
            } else {
                str = "" + map.size();
            }
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81190b, this.f81191c, "chatter_id_attendees_size", str));
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) new ArrayList(map.values()).get(0);
                if (calendarEventAttendee != null) {
                    calendarEventAttendee.setIsEditable(true);
                } else {
                    calendarEventAttendee = null;
                }
                ((IEditContract.IEditModelApi) this.f81189a.mo118652t()).mo114438a(calendarEventAttendee);
                ((IEditContract.IEditModelApi) this.f81189a.mo118652t()).mo114423Q();
            }
        }

        C31854p(EditPresenter hVar, String str, String str2) {
            this.f81189a = hVar;
            this.f81190b = str;
            this.f81191c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$q */
    public static final class C31855q implements IGetDataCallback<List<? extends CalendarEvent>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81192a;

        /* renamed from: b */
        final /* synthetic */ String f81193b;

        /* renamed from: c */
        final /* synthetic */ String f81194c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81193b, this.f81194c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarEvent> list) {
            int i;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            ((IEditContract.IEditModelApi) this.f81192a.mo118652t()).mo114472b(i);
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81193b, this.f81194c, "exceptional_event_number", String.valueOf(i)));
        }

        C31855q(EditPresenter hVar, String str, String str2) {
            this.f81192a = hVar;
            this.f81193b = str;
            this.f81194c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$r */
    public static final class C31856r implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81195a;

        /* renamed from: b */
        final /* synthetic */ String f81196b;

        /* renamed from: c */
        final /* synthetic */ String f81197c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IEditContract.IEditModelApi) this.f81195a.mo118652t()).mo114476b(false);
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81196b, this.f81197c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
            ((IEditContract.IEditModelApi) this.f81195a.mo118652t()).mo114476b(true);
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81196b, this.f81197c, "exceptional_event_has_repeat_event", "true"));
        }

        C31856r(EditPresenter hVar, String str, String str2) {
            this.f81195a = hVar;
            this.f81196b = str;
            this.f81197c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$s */
    public static final class C31857s implements IGetDataCallback<HashMap<String, Boolean>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81198a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f81199b;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap<java.lang.String, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void onSuccess(HashMap<String, Boolean> hashMap) {
            if (hashMap != 0) {
                this.f81199b.element = hashMap;
            }
            this.f81198a.mo116099a((HashMap<String, Boolean>) this.f81199b.element);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f81198a.mo116099a((HashMap<String, Boolean>) this.f81199b.element);
        }

        C31857s(EditPresenter hVar, Ref.ObjectRef objectRef) {
            this.f81198a = hVar;
            this.f81199b = objectRef;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$t */
    public static final class C31858t implements IGetDataCallback<GetSettingsResponse> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81200a;

        /* renamed from: b */
        final /* synthetic */ String f81201b;

        /* renamed from: c */
        final /* synthetic */ String f81202c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81201b, this.f81202c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(GetSettingsResponse kVar) {
            Integer c;
            Integer b;
            Integer a;
            if (!(kVar == null || (a = kVar.mo120112a()) == null)) {
                int intValue = a.intValue();
                String str = this.f81201b;
                String str2 = this.f81202c;
                Log.m165389i("EditPresenter", C32673y.m125373a(str, str2, "max_member_count", String.valueOf(intValue) + ""));
                ((IEditContract.IEditModelApi) this.f81200a.mo118652t()).mo114479c(intValue);
            }
            if (!(kVar == null || (b = kVar.mo120114b()) == null)) {
                ((IEditContract.IEditModelApi) this.f81200a.mo118652t()).mo114494g(b.intValue());
            }
            if (kVar != null && (c = kVar.mo120116c()) != null) {
                ((IEditContract.IEditModelApi) this.f81200a.mo118652t()).mo114497h(c.intValue());
            }
        }

        C31858t(EditPresenter hVar, String str, String str2) {
            this.f81200a = hVar;
            this.f81201b = str;
            this.f81202c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$u */
    public static final class C31859u implements IGetDataCallback<Map<String, ? extends List<? extends SimpleMember>>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81203a;

        /* renamed from: b */
        final /* synthetic */ String f81204b;

        /* renamed from: c */
        final /* synthetic */ String f81205c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81204b, this.f81205c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends List<SimpleMember>> map) {
            if (map != null) {
                Log.m165389i("EditPresenter", C32673y.m125373a(this.f81204b, this.f81205c, new String[0]));
                ((IEditContract.IEditModelApi) this.f81203a.mo118652t()).mo114447a(map);
                this.f81203a.mo116111j();
                ((IEditContract.IEditViewApi) this.f81203a.mo118651s()).mo114337i();
            }
        }

        C31859u(EditPresenter hVar, String str, String str2) {
            this.f81203a = hVar;
            this.f81204b = str;
            this.f81205c = str2;
        }
    }

    /* renamed from: a */
    public final Bundle mo116094a(Bundle bundle) {
        return ((IEditContract.IEditModelApi) mo118652t()).mo114429a(bundle);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$f */
    public static final class C31843f implements IGetDataCallback<Map<String, ? extends CalendarBuilding>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81127a;

        /* renamed from: b */
        final /* synthetic */ String f81128b;

        /* renamed from: c */
        final /* synthetic */ String f81129c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81128b, this.f81129c, errorResult));
            ((IEditContract.IEditModelApi) this.f81127a.mo118652t()).mo114434a(IEditContract.RequestBuildingResultType.FAILURE, new ArrayList<>());
        }

        /* renamed from: a */
        public void onSuccess(Map<String, CalendarBuilding> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = String.valueOf(map.size()) + "";
            }
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81128b, this.f81129c, "buildings_size", str));
            if (map == null || !(!map.isEmpty())) {
                ((IEditContract.IEditModelApi) this.f81127a.mo118652t()).mo114434a(IEditContract.RequestBuildingResultType.SUCCESS_NO_DATA, new ArrayList<>());
                return;
            }
            ArrayList<CalendarBuilding> arrayList = new ArrayList<>(map.values());
            CollectionsKt.sortWith(arrayList, C31844a.f81130a);
            ((IEditContract.IEditModelApi) this.f81127a.mo118652t()).mo114434a(IEditContract.RequestBuildingResultType.SUCCESS_WITH_DATA, arrayList);
        }

        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$f$a */
        public static final class C31844a<T> implements Comparator<CalendarBuilding> {

            /* renamed from: a */
            public static final C31844a f81130a = new C31844a();

            C31844a() {
            }

            /* renamed from: a */
            public final int compare(CalendarBuilding calendarBuilding, CalendarBuilding calendarBuilding2) {
                int intValue = calendarBuilding2.weight.intValue();
                Integer num = calendarBuilding.weight;
                Intrinsics.checkExpressionValueIsNotNull(num, "o1.weight");
                return intValue - num.intValue();
            }
        }

        C31843f(EditPresenter hVar, String str, String str2) {
            this.f81127a = hVar;
            this.f81128b = str;
            this.f81129c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$g */
    public static final class C31845g implements IGetDataCallback<PullEventIndividualAttendeesResponse> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81131a;

        /* renamed from: b */
        final /* synthetic */ String f81132b;

        /* renamed from: c */
        final /* synthetic */ String f81133c;

        /* renamed from: a */
        public void onSuccess(PullEventIndividualAttendeesResponse wVar) {
            Intrinsics.checkParameterIsNotNull(wVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81132b, this.f81133c, new String[0]));
            ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>();
            List<CalendarEventAttendee> c = wVar.mo120240c();
            if (c != null) {
                arrayList.addAll(c);
            }
            ((IEditContract.IEditModelApi) this.f81131a.mo118652t()).mo114446a(arrayList, true);
            ((IEditContract.IEditViewApi) this.f81131a.mo118651s()).mo114337i();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81132b, this.f81133c, errorResult));
            ((IEditContract.IEditModelApi) this.f81131a.mo118652t()).mo114446a(new ArrayList<>(), false);
        }

        C31845g(EditPresenter hVar, String str, String str2) {
            this.f81131a = hVar;
            this.f81132b = str;
            this.f81133c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$i */
    public static final class C31847i implements IGetDataCallback<Map<String, ? extends CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81137a;

        /* renamed from: b */
        final /* synthetic */ String f81138b;

        /* renamed from: c */
        final /* synthetic */ String f81139c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f81140d;

        /* renamed from: e */
        final /* synthetic */ LinkedHashMap f81141e;

        /* renamed from: f */
        final /* synthetic */ Ref.BooleanRef f81142f;

        /* renamed from: g */
        final /* synthetic */ Ref.BooleanRef f81143g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f81144h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f81145i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f81146j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f81147k;

        /* renamed from: l */
        final /* synthetic */ HashMap f81148l;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81138b, this.f81139c, errorResult));
            this.f81140d.element = true;
            this.f81137a.mo116103a(this.f81140d.element, this.f81142f.element, this.f81143g.element, this.f81144h, this.f81145i, this.f81146j, this.f81147k, this.f81141e, this.f81148l);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarEventAttendee> map) {
            boolean z = false;
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81138b, this.f81139c, "chatter_id_attendees_size", map == null ? "null" : "" + map.size()));
            this.f81140d.element = true;
            if (map == null || map.isEmpty()) {
                z = true;
            }
            if (!z) {
                for (CalendarEventAttendee calendarEventAttendee : map.values()) {
                    calendarEventAttendee.setIsEditable(true);
                }
                this.f81141e.putAll(map);
            }
            this.f81137a.mo116103a(this.f81140d.element, this.f81142f.element, this.f81143g.element, this.f81144h, this.f81145i, this.f81146j, this.f81147k, this.f81141e, this.f81148l);
        }

        C31847i(EditPresenter hVar, String str, String str2, Ref.BooleanRef booleanRef, LinkedHashMap linkedHashMap, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashMap hashMap) {
            this.f81137a = hVar;
            this.f81138b = str;
            this.f81139c = str2;
            this.f81140d = booleanRef;
            this.f81141e = linkedHashMap;
            this.f81142f = booleanRef2;
            this.f81143g = booleanRef3;
            this.f81144h = arrayList;
            this.f81145i = arrayList2;
            this.f81146j = arrayList3;
            this.f81147k = arrayList4;
            this.f81148l = hashMap;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$j */
    public static final class C31848j implements IGetDataCallback<Map<String, CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81149a;

        /* renamed from: b */
        final /* synthetic */ String f81150b;

        /* renamed from: c */
        final /* synthetic */ String f81151c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f81152d;

        /* renamed from: e */
        final /* synthetic */ LinkedHashMap f81153e;

        /* renamed from: f */
        final /* synthetic */ Ref.BooleanRef f81154f;

        /* renamed from: g */
        final /* synthetic */ Ref.BooleanRef f81155g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f81156h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f81157i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f81158j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f81159k;

        /* renamed from: l */
        final /* synthetic */ HashMap f81160l;

        /* renamed from: m */
        final /* synthetic */ String f81161m;

        /* renamed from: n */
        final /* synthetic */ String f81162n;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81161m, this.f81162n, errorResult));
            this.f81152d.element = true;
            this.f81149a.mo116103a(this.f81154f.element, this.f81155g.element, this.f81152d.element, this.f81156h, this.f81157i, this.f81158j, this.f81159k, this.f81153e, this.f81160l);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, CalendarEventAttendee> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = "" + map.size();
            }
            boolean z = false;
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81150b, this.f81151c, "departments_size", str));
            this.f81152d.element = true;
            if (map == null || map.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f81153e.putAll(map);
            }
            this.f81149a.mo116103a(this.f81154f.element, this.f81155g.element, this.f81152d.element, this.f81156h, this.f81157i, this.f81158j, this.f81159k, this.f81153e, this.f81160l);
        }

        C31848j(EditPresenter hVar, String str, String str2, Ref.BooleanRef booleanRef, LinkedHashMap linkedHashMap, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashMap hashMap, String str3, String str4) {
            this.f81149a = hVar;
            this.f81150b = str;
            this.f81151c = str2;
            this.f81152d = booleanRef;
            this.f81153e = linkedHashMap;
            this.f81154f = booleanRef2;
            this.f81155g = booleanRef3;
            this.f81156h = arrayList;
            this.f81157i = arrayList2;
            this.f81158j = arrayList3;
            this.f81159k = arrayList4;
            this.f81160l = hashMap;
            this.f81161m = str3;
            this.f81162n = str4;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$k */
    public static final class C31849k implements IGetDataCallback<Map<String, CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81163a;

        /* renamed from: b */
        final /* synthetic */ String f81164b;

        /* renamed from: c */
        final /* synthetic */ String f81165c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f81166d;

        /* renamed from: e */
        final /* synthetic */ LinkedHashMap f81167e;

        /* renamed from: f */
        final /* synthetic */ Ref.BooleanRef f81168f;

        /* renamed from: g */
        final /* synthetic */ Ref.BooleanRef f81169g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f81170h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f81171i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f81172j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f81173k;

        /* renamed from: l */
        final /* synthetic */ HashMap f81174l;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81164b, this.f81165c, errorResult));
            this.f81166d.element = true;
            this.f81163a.mo116103a(this.f81168f.element, this.f81166d.element, this.f81169g.element, this.f81170h, this.f81171i, this.f81172j, this.f81173k, this.f81167e, this.f81174l);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, CalendarEventAttendee> map) {
            boolean z = false;
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81164b, this.f81165c, "groups_size", map == null ? "null" : "" + map.size()));
            this.f81166d.element = true;
            if (map == null || map.isEmpty()) {
                z = true;
            }
            if (!z) {
                for (CalendarEventAttendee calendarEventAttendee : map.values()) {
                    calendarEventAttendee.setIsGroup(true);
                    calendarEventAttendee.setIsEditable(true);
                }
                this.f81167e.putAll(map);
            }
            this.f81163a.mo116103a(this.f81168f.element, this.f81166d.element, this.f81169g.element, this.f81170h, this.f81171i, this.f81172j, this.f81173k, this.f81167e, this.f81174l);
        }

        C31849k(EditPresenter hVar, String str, String str2, Ref.BooleanRef booleanRef, LinkedHashMap linkedHashMap, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashMap hashMap) {
            this.f81163a = hVar;
            this.f81164b = str;
            this.f81165c = str2;
            this.f81166d = booleanRef;
            this.f81167e = linkedHashMap;
            this.f81168f = booleanRef2;
            this.f81169g = booleanRef3;
            this.f81170h = arrayList;
            this.f81171i = arrayList2;
            this.f81172j = arrayList3;
            this.f81173k = arrayList4;
            this.f81174l = hashMap;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$l */
    public static final class C31850l implements IGetDataCallback<Map<String, ? extends CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81175a;

        /* renamed from: b */
        final /* synthetic */ String f81176b;

        /* renamed from: c */
        final /* synthetic */ String f81177c;

        /* renamed from: d */
        final /* synthetic */ boolean f81178d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81176b, this.f81177c, errorResult));
            this.f81175a.mo116108g();
            ((IEditContract.IEditModelApi) this.f81175a.mo118652t()).mo114473b((CalendarEventAttendee) null);
            ((IEditContract.IEditViewApi) this.f81175a.mo118651s()).mo114337i();
            if (this.f81178d) {
                ((IEditContract.IEditViewApi) this.f81175a.mo118651s()).mo114315a(6);
            }
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarEventAttendee> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = "" + map.size();
            }
            Log.m165389i("EditPresenter", C32673y.m125373a(this.f81176b, this.f81177c, "chatter_id_attendees_size", str));
            if (map != null && (!map.isEmpty())) {
                CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) new ArrayList(map.values()).get(0);
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "chosenCalendarAttendee");
                calendarEventAttendee.setLarkId((String) new ArrayList(map.keySet()).get(0));
                calendarEventAttendee.setIsEditable(true);
                ((IEditContract.IEditModelApi) this.f81175a.mo118652t()).mo114473b(calendarEventAttendee);
                if (this.f81178d) {
                    ((IEditContract.IEditModelApi) this.f81175a.mo118652t()).mo114418L();
                    ((IEditContract.IEditViewApi) this.f81175a.mo118651s()).mo114315a(6);
                    ((IEditContract.IEditViewApi) this.f81175a.mo118651s()).mo114337i();
                    return;
                }
                ((IEditContract.IEditViewApi) this.f81175a.mo118651s()).mo114337i();
            } else if (this.f81178d) {
                ((IEditContract.IEditViewApi) this.f81175a.mo118651s()).mo114315a(6);
                ((IEditContract.IEditViewApi) this.f81175a.mo118651s()).mo114337i();
            }
        }

        C31850l(EditPresenter hVar, String str, String str2, boolean z) {
            this.f81175a = hVar;
            this.f81176b = str;
            this.f81177c = str2;
            this.f81178d = z;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$n */
    public static final class C31852n implements IGetDataCallback<Map<String, ? extends AbstractC30026d>> {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81183a;

        /* renamed from: b */
        final /* synthetic */ String f81184b;

        /* renamed from: c */
        final /* synthetic */ String f81185c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditPresenter", C32673y.m125370a(this.f81184b, this.f81185c, errorResult));
            this.f81183a.mo116108g();
            ((IEditContract.IEditModelApi) this.f81183a.mo118652t()).mo114473b((CalendarEventAttendee) null);
            ((IEditContract.IEditViewApi) this.f81183a.mo118651s()).mo114337i();
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends AbstractC30026d> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = "" + map.size();
            }
            Log.m165389i("EditPresenter", C32673y.m125376b(this.f81184b, this.f81185c, "chatters_size", str));
            if (map != null && (!map.isEmpty())) {
                ArrayList arrayList = new ArrayList();
                Object obj = new ArrayList(map.values()).get(0);
                Intrinsics.checkExpressionValueIsNotNull(obj, "ArrayList(stringChatterMap.values)[0]");
                arrayList.add(((AbstractC30026d) obj).getId());
                this.f81183a.mo116100a((List<String>) arrayList, false);
            }
        }

        C31852n(EditPresenter hVar, String str, String str2) {
            this.f81183a = hVar;
            this.f81184b = str;
            this.f81185c = str2;
        }
    }

    /* renamed from: a */
    private final void m120868a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getEventCalendarDataByCalendarId", "calendar_ids", str));
        this.f81111e.mo119039a(arrayList, mo118653u().wrapAndAddGetDataCallback(new C31853o(this, valueOf, "getEventCalendarDataByCalendarId")));
    }

    /* renamed from: a */
    private final ArrayList<String> m120867a(Map<String, String> map, HashMap<String, CalendarEventAttendee> hashMap) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (CollectionUtils.isEmpty(map)) {
            return arrayList;
        }
        for (String str : map.keySet()) {
            if (hashMap.containsKey(str)) {
                hashMap.remove(str);
                String str2 = map.get(str);
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$e */
    public static final class C31842e implements C31129b.AbstractC31130a {

        /* renamed from: a */
        final /* synthetic */ EditPresenter f81126a;

        C31842e(EditPresenter hVar) {
            this.f81126a = hVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.p1498d.C31129b.AbstractC31130a
        /* renamed from: a */
        public final void mo112737a(String str, long j) {
            ArrayList<CalendarEventAttendee> as = ((IEditContract.IEditModelApi) this.f81126a.mo118652t()).as();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(as, 10));
            Iterator<T> it = as.iterator();
            while (it.hasNext()) {
                String attendeeCalendarId = it.next().getAttendeeCalendarId();
                if (attendeeCalendarId == null) {
                    attendeeCalendarId = "";
                }
                arrayList.add(attendeeCalendarId);
            }
            CalendarLogHelper.f78612a.mo112731a(((IEditContract.IEditModelApi) this.f81126a.mo118652t()).mo114483d(), arrayList, "edit_event");
        }
    }

    /* renamed from: a */
    private final void m120871a(ArrayList<String> arrayList, HashMap<String, CalendarEventAttendee> hashMap) {
        boolean z;
        if (!CollectionUtils.isEmpty(arrayList)) {
            ArrayList arrayList2 = new ArrayList(((IEditContract.IEditModelApi) mo118652t()).mo114428W());
            if (arrayList != null) {
                ArrayList<CalendarEventAttendee> arrayList3 = new ArrayList<>();
                Iterator<String> it = arrayList.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    String next = it.next();
                    if (hashMap.containsKey(next)) {
                        CalendarEventAttendee calendarEventAttendee = hashMap.get(next);
                        hashMap.remove(next);
                        if (calendarEventAttendee != null) {
                            if (!calendarEventAttendee.getOpenSecurity() || calendarEventAttendee.getValidMemberCount() <= calendarEventAttendee.getShowMemberLimit()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                arrayList3.add(calendarEventAttendee);
                                z2 = true;
                            } else {
                                for (CalendarEventAttendee calendarEventAttendee2 : calendarEventAttendee.getGroupMembers()) {
                                    if (calendarEventAttendee2 != null && !arrayList2.contains(calendarEventAttendee2)) {
                                        calendarEventAttendee2.setIsEditable(true);
                                        arrayList2.add(calendarEventAttendee2);
                                        String userId = calendarEventAttendee2.getUserId();
                                        Intrinsics.checkExpressionValueIsNotNull(userId, "item.userId");
                                        hashMap.put(userId, calendarEventAttendee2);
                                    }
                                }
                            }
                        }
                    }
                }
                if (z2) {
                    ((IEditContract.IEditModelApi) mo118652t()).mo114495g(arrayList3);
                    ((IEditContract.IEditViewApi) mo118651s()).mo114338j();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m120872a(boolean z, boolean z2) {
        ArrayList<CalendarEventAttendee> W = ((IEditContract.IEditModelApi) mo118652t()).mo114428W();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<CalendarEventAttendee> it = W.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
            if (next.isGroup()) {
                arrayList2.add(next.getGroupId());
            } else {
                arrayList.add(next.getAttendeeCalendarId());
            }
        }
        ArrayList arrayList3 = arrayList;
        if (CollectionUtils.isEmpty(arrayList3)) {
            mo116102a(z, z2, arrayList2);
            return;
        }
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getAttendeeLarkIds", new String[0]));
        this.f81111e.mo119042b(new ArrayList(arrayList3), mo118653u().wrapAndAddGetDataCallback(new C31841d(this, valueOf, "getAttendeeLarkIds", arrayList2, z, z2)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPresenter(IEditContract.IEditViewApi dVar, IEditContract.IEditModelApi bVar, ActivityDependency aVar) {
        super(dVar, bVar);
        Intrinsics.checkParameterIsNotNull(dVar, "view");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar, "activityDependency");
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f81111e = a;
        C32533b a2 = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarEventService.getInstance()");
        this.f81112f = a2;
        this.f81108a = aVar;
        this.f81115i = LazyKt.lazy(new C31862x(this, aVar));
        m120862E();
        this.f81116j = new C31860v(this, dVar);
        this.f81117k = new C31861w(this, dVar, bVar);
    }

    /* renamed from: a */
    private final void m120869a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<CalDepartment> arrayList3) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        ArrayList<String> arrayList4 = arrayList;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(!z);
        ArrayList<CalDepartment> arrayList5 = arrayList3;
        if (arrayList5 == null || arrayList5.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        CalendarEventHitPoint.m124339a("add_attendee_result", (String) null, (Boolean) null, valueOf, Boolean.valueOf(!z2), 6, (Object) null);
        if (!CollectionUtils.isEmpty(arrayList4)) {
            if (CollectionUtils.isNotEmpty(arrayList2)) {
                GeneralHitPoint.m124237c(true);
                if (arrayList != null) {
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                if (arrayList2 != null) {
                    i2 = arrayList2.size();
                } else {
                    i2 = 0;
                }
                if (i > i2) {
                    GeneralHitPoint.m124237c(false);
                    return;
                }
                return;
            }
            GeneralHitPoint.m124237c(false);
        }
    }

    /* renamed from: b */
    private final void m120874b(int i, int i2, Intent intent) {
        if (i == 1) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("picker_selected_chatter_result");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("picker_selected_group_result");
            ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("picker_selected_email_result");
            ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("picker_selected_meeting_chat_result");
            Serializable serializableExtra = intent.getSerializableExtra("picker_selected_department_result");
            ArrayList<CalContact> arrayList = null;
            if (!(serializableExtra instanceof ArrayList)) {
                serializableExtra = null;
            }
            ArrayList<CalDepartment> arrayList2 = (ArrayList) serializableExtra;
            if (CollectionUtils.isNotEmpty(stringArrayListExtra) || CollectionUtils.isNotEmpty(stringArrayListExtra2)) {
                ((IEditContract.IEditModelApi) mo118652t()).mo114448a(true);
                ((IEditContract.IEditViewApi) mo118651s()).mo114337i();
            }
            m120870a(stringArrayListExtra, stringArrayListExtra2, stringArrayListExtra3, stringArrayListExtra4, arrayList2);
            m120869a(stringArrayListExtra2, stringArrayListExtra4, arrayList2);
            Serializable serializableExtra2 = intent.getSerializableExtra("picker_selected_no_contact_result");
            if (serializableExtra2 instanceof ArrayList) {
                arrayList = serializableExtra2;
            }
            C30022a.f74882a.contactModuleDependency().mo108229a(((IEditContract.IEditViewApi) mo118651s()).mo114333e(), arrayList);
        } else if (i == 2) {
            long longExtra = intent.getLongExtra("arrange_start_time", 0);
            long longExtra2 = intent.getLongExtra("arrange_end_time", 0);
            String stringExtra = intent.getStringExtra("arrange_time_zone_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            Intrinsics.checkExpressionValueIsNotNull(stringExtra, "data.getStringExtra(KEY_…RANGE_TIME_ZONE_ID) ?: \"\"");
            ((IEditContract.IEditModelApi) mo118652t()).mo114433a(longExtra, longExtra2, false, stringExtra);
            ((IEditContract.IEditViewApi) mo118651s()).mo114337i();
        } else if (i == 3) {
            Serializable serializableExtra3 = intent.getSerializableExtra("add_external_emails");
            if (serializableExtra3 != null) {
                ArrayList<String> arrayList3 = (ArrayList) serializableExtra3;
                Serializable serializableExtra4 = intent.getSerializableExtra("delete_external_emails");
                if (serializableExtra4 != null) {
                    ArrayList<CalendarEventAttendee> d = ((IEditContract.IEditModelApi) mo118652t()).mo114484d(((IEditContract.IEditModelApi) mo118652t()).mo114492f(((IEditContract.IEditModelApi) mo118652t()).mo114431a(arrayList3, (ArrayList) serializableExtra4)));
                    if (((IEditContract.IEditModelApi) mo118652t()).mo114486d(d)) {
                        ((IEditContract.IEditViewApi) mo118651s()).mo114330c(((IEditContract.IEditModelApi) mo118652t()).af());
                        ((IEditContract.IEditModelApi) mo118652t()).ah();
                    } else {
                        ((IEditContract.IEditModelApi) mo118652t()).mo114489e(d);
                        ((IEditContract.IEditModelApi) mo118652t()).ah();
                    }
                    ((IEditContract.IEditViewApi) mo118651s()).mo114337i();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        }
    }

    /* renamed from: a */
    private final boolean m120873a(ArrayList<String> arrayList, ArrayList<String> arrayList2, List<String> list, HashMap<String, CalendarEventAttendee> hashMap) {
        boolean z;
        boolean z2;
        ArrayList<String> arrayList3 = arrayList;
        boolean z3 = true;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList<String> arrayList4 = arrayList2;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                List<String> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z3 = false;
                }
                if (z3) {
                    return false;
                }
            }
        }
        return CollectionUtils.isEmpty(hashMap);
    }

    /* renamed from: a */
    private final void m120870a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<CalDepartment> arrayList5) {
        String str;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        Ref.BooleanRef booleanRef3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
        ArrayList<String> arrayList6 = arrayList;
        booleanRef4.element = CollectionUtils.isEmpty(arrayList6);
        Ref.BooleanRef booleanRef5 = new Ref.BooleanRef();
        ArrayList<String> arrayList7 = arrayList2;
        booleanRef5.element = CollectionUtils.isEmpty(arrayList7);
        Ref.BooleanRef booleanRef6 = new Ref.BooleanRef();
        ArrayList<CalDepartment> arrayList8 = arrayList5;
        booleanRef6.element = CollectionUtils.isEmpty(arrayList8);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap();
        if (arrayList5 != null) {
            Iterator<CalDepartment> it = arrayList5.iterator();
            while (it.hasNext()) {
                CalDepartment next = it.next();
                hashMap.put(next.getDepartmentId(), next.getDepartmentName());
            }
        }
        if (!booleanRef4.element || !booleanRef5.element || !booleanRef6.element) {
            String valueOf = String.valueOf(new Date().getTime());
            String str7 = "null";
            if (arrayList == null) {
                str = str7;
            } else {
                str = "" + arrayList.size();
            }
            Log.m165389i("EditPresenter", C32673y.m125376b(valueOf, "getAttendeesByChatterIds", "chatter_ids_size", str));
            if (CollectionUtils.isNotEmpty(arrayList6)) {
                booleanRef3 = booleanRef4;
                str3 = "EditPresenter";
                booleanRef2 = booleanRef5;
                str2 = "";
                booleanRef = booleanRef6;
                this.f81112f.mo118880b(arrayList, mo118653u().wrapAndAddGetDataCallback(new C31847i(this, valueOf, "getAttendeesByChatterIds", booleanRef4, linkedHashMap, booleanRef5, booleanRef6, arrayList, arrayList2, arrayList3, arrayList4, hashMap)));
            } else {
                booleanRef = booleanRef6;
                booleanRef3 = booleanRef4;
                booleanRef2 = booleanRef5;
                str3 = "EditPresenter";
                str2 = "";
            }
            String valueOf2 = String.valueOf(new Date().getTime());
            if (arrayList2 == null) {
                str4 = str7;
            } else {
                str4 = str2 + arrayList2.size();
            }
            Log.m165389i(str3, C32673y.m125376b(valueOf2, "getGroupByChatterIds", "ids_size", str4));
            if (CollectionUtils.isNotEmpty(arrayList7)) {
                str6 = "getGroupByChatterIds";
                str5 = valueOf2;
                this.f81111e.mo119045c(arrayList2, mo118653u().wrapAndAddGetDataCallback(new C31849k(this, valueOf2, "getGroupByChatterIds", booleanRef2, linkedHashMap, booleanRef3, booleanRef, arrayList, arrayList2, arrayList3, arrayList4, hashMap)));
            } else {
                str6 = "getGroupByChatterIds";
                str5 = valueOf2;
            }
            String valueOf3 = String.valueOf(new Date().getTime());
            if (arrayList5 != null) {
                str7 = str2 + arrayList5.size();
            }
            Log.m165389i(str3, C32673y.m125376b(valueOf3, "PullAttendeesInDepartments", "departments_size", str7));
            if (CollectionUtils.isNotEmpty(arrayList8)) {
                UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C31848j(this, str5, str6, booleanRef, linkedHashMap, booleanRef3, booleanRef2, arrayList, arrayList2, arrayList3, arrayList4, hashMap, valueOf3, "PullAttendeesInDepartments"));
                AbstractC32595g gVar = this.f81111e;
                Set keySet = hashMap.keySet();
                Intrinsics.checkExpressionValueIsNotNull(keySet, "departmentsMap.keys");
                gVar.mo119047d(CollectionsKt.toList(keySet), wrapAndAddGetDataCallback);
                return;
            }
            return;
        }
        mo116103a(booleanRef4.element, booleanRef5.element, booleanRef6.element, arrayList, arrayList2, arrayList3, arrayList4, linkedHashMap, hashMap);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$a */
    public interface ActivityDependency {
        /* renamed from: a */
        void mo114273a();

        /* renamed from: a */
        void mo114274a(int i);

        /* renamed from: a */
        void mo114275a(int i, Intent intent);

        /* renamed from: a */
        void mo114276a(Fragment fragment, int i, int i2);

        /* renamed from: a */
        void mo114277a(Fragment fragment, int i, int i2, int i3);

        /* renamed from: a */
        void mo114278a(String str, long j, long j2, String str2, String str3);

        /* renamed from: b */
        Activity mo114279b();

        /* renamed from: b */
        void mo114280b(Fragment fragment, int i, int i2);

        /* renamed from: c */
        void mo114281c();

        /* renamed from: d */
        void mo114282d();

        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.h$a$a */
        public static final class C31840a {
            /* renamed from: a */
            public static /* synthetic */ void m120917a(ActivityDependency aVar, Fragment fragment, int i, int i2, int i3, Object obj) {
                if (obj == null) {
                    if ((i3 & 2) != 0) {
                        i = 0;
                    }
                    if ((i3 & 4) != 0) {
                        i2 = 0;
                    }
                    aVar.mo114280b(fragment, i, i2);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideFragment");
            }
        }
    }
}
