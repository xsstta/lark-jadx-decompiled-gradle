package com.ss.android.lark.calendar.impl.features.calendarview.days;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate;
import com.ss.android.lark.calendar.impl.features.calendarview.base.BaseDiagramPresenter;
import com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 62\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u00016B\u0017\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J \u0010\"\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u000eH\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\b\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0016H\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u0012H\u0016J\b\u00105\u001a\u00020\u0012H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramPresenter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/base/BaseDiagramPresenter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramModelApi;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewApi;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewAction;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "mNumDay", "", "model", "(ILcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramModelApi;)V", "diagramDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramDelegate;", "mIsDestroyed", "", "viewDependency", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "changeAccount", "", "changeAlternateCalendar", "changeCurrentDay", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "changeFirstDayOfWeek", "changeTimeFormat", "clearAppendEvent", "create", "activity", "Landroid/app/Activity;", "destroy", "getDiagramView", "Landroid/view/View;", "getViewAction", "hideDiagramView", "initDiagramView", "dateLogicData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "moveBackForwardPage", "isBack", "moveToToday", "preLoadDiskInstance", "preLoadInstance", "selectDate", "refreshAllPage", "refreshCurrentTimeLine", "refreshEventMask", "refreshOnSettingChanged", "settingChangedEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "refreshViewTimeZone", "timeZoneId", "", "showDiagramGuide", "showDiagramView", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.b */
public final class DaysDiagramPresenter extends BaseDiagramPresenter<IDaysDiagramContract.IDaysDiagramModelApi, IDaysDiagramContract.IDaysDiagramViewApi, IDaysDiagramContract.IDaysDiagramViewData, IDaysDiagramContract.IDaysDiagramViewAction> implements IDiagramController {

    /* renamed from: c */
    public static final Companion f77048c = new Companion(null);

    /* renamed from: a */
    public IDiagramDelegate f77049a;

    /* renamed from: b */
    public CalendarDaysContract.AbstractC30658d f77050b;

    /* renamed from: d */
    private boolean f77051d;

    /* renamed from: e */
    private final int f77052e;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: i */
    public void mo111003i() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramPresenter$Companion;", "", "()V", "TAG", "", "controller", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramPresenter;", "numDays", "", "oneDayController", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final DaysDiagramPresenter mo111010a() {
            return new DaysDiagramPresenter(1, new DaysDiagramModel(1), null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DaysDiagramPresenter mo111011a(int i) {
            DaysDiagramPresenter bVar;
            if (i == 1) {
                bVar = new DaysDiagramPresenter(1, new DaysDiagramModel(1), null);
            } else if (i != 3) {
                return null;
            } else {
                bVar = new DaysDiagramPresenter(3, new DaysDiagramModel(3), null);
            }
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH\u0016¨\u0006%"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramPresenter$getViewAction$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewAction;", "onAppendTimeCancel", "", "onAppendTimeSelect", "startTime", "", "endTime", "onBindAllDayLayer", "startDay", "", "endDay", "onBindDayLayer", "layerDay", "onClickChipView", "intent", "Landroid/content/Intent;", "onDragSaveEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "onRefreshLayout", "pageDayRange", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayRange;", "onSelectDateChanged", "selectDay", "isMoveToday", "", "onTabProgressChange", "process", "", "startEventDetailActivity", "activity", "Landroid/app/Activity;", "chipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "isOpenNearbyClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.b$b */
    public static final class C30707b implements IDaysDiagramContract.IDaysDiagramViewAction {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramPresenter f77053a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111021a(List<DayRange> list) {
            Intrinsics.checkParameterIsNotNull(list, "pageDayRange");
            ((IDaysDiagramContract.IDaysDiagramModelApi) this.f77053a.mo110711n()).mo110910a(list);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111012a() {
            IDiagramDelegate jVar = this.f77053a.f77049a;
            if (jVar != null) {
                jVar.mo111642h();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30707b(DaysDiagramPresenter bVar) {
            this.f77053a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111013a(float f) {
            IDiagramDelegate jVar = this.f77053a.f77049a;
            if (jVar != null) {
                jVar.mo111631a(-f);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111014a(int i) {
            ((IDaysDiagramContract.IDaysDiagramModelApi) this.f77053a.mo110711n()).mo110913b(i, i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111019a(Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            CalendarDaysContract.AbstractC30658d dVar = this.f77053a.f77050b;
            if (dVar != null) {
                dVar.mo108515a(intent, false);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111015a(int i, int i2) {
            ((IDaysDiagramContract.IDaysDiagramModelApi) this.f77053a.mo110711n()).mo110906a(i, i2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111016a(int i, boolean z) {
            CalendarDate calendarDate = new CalendarDate();
            calendarDate.setJulianDay(i);
            IDiagramDelegate jVar = this.f77053a.f77049a;
            if (jVar != null) {
                jVar.mo111634a(calendarDate);
            }
            IDiagramDelegate jVar2 = this.f77053a.f77049a;
            if (jVar2 != null) {
                jVar2.mo111636b(calendarDate);
            }
            ((IDaysDiagramContract.IDaysDiagramModelApi) this.f77053a.mo110711n()).mo110907a(i, z);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111017a(long j, long j2) {
            IDiagramDelegate jVar = this.f77053a.f77049a;
            if (jVar != null) {
                jVar.mo111633a(j, j2);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111018a(Activity activity, EventChipViewData eventChipViewData, boolean z) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(eventChipViewData, "chipViewData");
            C31238b.m116864a(activity, eventChipViewData, Boolean.valueOf(z));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewAction
        /* renamed from: a */
        public void mo111020a(CalendarEventInstance calendarEventInstance, long j, long j2) {
            Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
            IDiagramDelegate jVar = this.f77053a.f77049a;
            if (jVar != null) {
                jVar.mo111635a(calendarEventInstance, j, j2);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController, com.ss.android.lark.calendar.impl.features.calendarview.base.BaseDiagramPresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f77051d = true;
    }

    /* renamed from: p */
    public IDaysDiagramContract.IDaysDiagramViewAction mo110712o() {
        return new C30707b(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: l */
    public void mo111006l() {
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111037j();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110989a() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("preLoadDiskInstance"));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110912b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: e */
    public void mo110999e() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("showDiagramGuide"));
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111036i();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: f */
    public void mo111000f() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("refreshEventMask"));
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111035h();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: g */
    public void mo111001g() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("moveToToday"));
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111033f();
        }
        IDiagramDelegate jVar = this.f77049a;
        if (jVar != null) {
            jVar.mo111632a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: h */
    public void mo111002h() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("refreshAllPage"));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110919i();
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111031d();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: j */
    public void mo111004j() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("changeTimeFormat"));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110918h();
    }

    /* renamed from: q */
    public void mo111008q() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("changeAlternateCalendar"));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110915d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: b */
    public View mo110995b() {
        View view;
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            view = cVar.mo111030c();
        } else {
            view = null;
        }
        if (view == null) {
            Log.m165383e("DaysDiagramPresenter", C32673y.m125378d("showDiagramView view = " + ((IDaysDiagramContract.IDaysDiagramViewApi) mo110710m())));
        }
        return view;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: d */
    public void mo110998d() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("hideDiagramView mNumDay = " + this.f77052e));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110919i();
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111028a(false);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: k */
    public void mo111005k() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("changeAccount"));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110919i();
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111038k();
        }
        IDaysDiagramContract.IDaysDiagramViewApi cVar2 = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar2 != null) {
            cVar2.mo111031d();
        }
    }

    /* renamed from: r */
    public void mo111009r() {
        boolean z;
        if (this.f77052e == 3) {
            z = true;
        } else {
            z = false;
        }
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("changeFirstDayOfWeek needRefreshAllPage = " + z));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110911a(z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: c */
    public void mo110997c() {
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("showDiagramView mNumDay = " + this.f77052e + ", view = " + ((IDaysDiagramContract.IDaysDiagramViewApi) mo110710m())));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110914c();
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111032e();
        }
        IDaysDiagramContract.IDaysDiagramViewApi cVar2 = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar2 != null) {
            cVar2.mo111028a(true);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: b */
    public void mo110996b(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("changeCurrentDay"));
        IDaysDiagramContract.IDaysDiagramViewApi cVar = (IDaysDiagramContract.IDaysDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo111034g();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110990a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        DaysDiagramView cVar = new DaysDiagramView(activity, this.f77052e);
        mo110709a(cVar);
        cVar.create();
        super.create();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110991a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("preLoadInstance"));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110908a(calendarDate);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110993a(SettingChangedEvent mVar) {
        IDiagramDelegate jVar;
        Intrinsics.checkParameterIsNotNull(mVar, "settingChangedEvent");
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("refreshOnSettingChanged"));
        if (mVar.mo118647a() && (jVar = this.f77049a) != null) {
            jVar.mo111641g();
        }
        if (mVar.mo118649c()) {
            mo111008q();
        }
        if (mVar.mo118648b()) {
            mo111009r();
        }
        if (mVar.mo118650d()) {
            ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110917g();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110994a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("timeZoneId = " + str));
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110916e();
    }

    private DaysDiagramPresenter(int i, IDaysDiagramContract.IDaysDiagramModelApi aVar) {
        super(aVar);
        this.f77052e = i;
    }

    public /* synthetic */ DaysDiagramPresenter(int i, IDaysDiagramContract.IDaysDiagramModelApi aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110992a(IDiagramDelegate jVar, CalendarDaysContract.AbstractC30658d dVar, IDateLogicData hVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "diagramDelegate");
        Intrinsics.checkParameterIsNotNull(dVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(hVar, "dateLogicData");
        Log.m165389i("DaysDiagramPresenter", C32673y.m125378d("initDiagramView"));
        this.f77049a = jVar;
        this.f77050b = dVar;
        ((IDaysDiagramContract.IDaysDiagramModelApi) mo110711n()).mo110909a(hVar);
    }
}
