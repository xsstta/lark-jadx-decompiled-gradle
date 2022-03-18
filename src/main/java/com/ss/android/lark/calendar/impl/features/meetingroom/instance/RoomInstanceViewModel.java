package com.ss.android.lark.calendar.impl.features.meetingroom.instance;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.GetRoomViewInstancesResponse;
import com.bytedance.lark.pb.calendar.v1.PushRoomViewInstanceChangeNotification;
import com.bytedance.lark.pb.calendar.v1.RoomViewInstance;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32068f;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.util.InstanceTimeUtil;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.InstanceViewData;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.InstanceViewDataImpl;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.OneInstanceViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.rustadapter.service.SdkResponse;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\b2\u0010\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u000100H\u0002J\b\u00101\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u00020\bH\u0016J\b\u00103\u001a\u00020\u0011H\u0016J\n\u00104\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u00105\u001a\u00020\bH\u0016J\n\u00106\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u00107\u001a\u00020\u0004H\u0016J\u0016\u00108\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:\u0018\u000109H\u0016J0\u0010;\u001a\u00020-2\u0006\u0010.\u001a\u00020\b2\u001e\b\u0002\u0010<\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001700\u0012\u0004\u0012\u00020-\u0018\u00010=H\u0002J\b\u0010>\u001a\u00020-H\u0014J\u0010\u0010?\u001a\u00020-2\u0006\u0010.\u001a\u00020\bH\u0016J\u0010\u0010@\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010A\u001a\u00020-H\u0016J\u0018\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020:H\u0016J\u0010\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020GH\u0002J\u0018\u0010H\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\u00162\u0006\u0010J\u001a\u00020GH\u0002J\u0018\u0010K\u001a\u00020-2\u0006\u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020:H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R1\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u00158BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/IRoomInstanceViewModel;", "buildingName", "", "roomResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "selectDay", "", "(Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;I)V", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "isUpdateSelectTime", "", "mCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mInstanceCache", "", "Ljava/util/ArrayList;", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "Lkotlin/collections/ArrayList;", "getMInstanceCache", "()[Ljava/util/ArrayList;", "mInstanceCache$delegate", "mRoomViewInstanceChangeListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "getMRoomViewInstanceChangeListener", "()Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "mRoomViewInstanceChangeListener$delegate", "mSelectDate", "mSelectEndMinute", "mSelectStartMinute", "mSelectTimeTip", "roomInstanceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/InstanceViewData;", "getRoomInstanceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "saveEventFinish", "getSaveEventFinish", "cacheInstance", "", "layerDay", "pbRoomInstances", "", "getBuildingName", "getCurrentDay", "getIsUpdateSelectTime", "getRoomResource", "getSelectDay", "getSelectTimeTip", "getTitleViewData", "getUpdateSelectDuration", "Lkotlin/Pair;", "", "handleLoadLayerData", "nextAction", "Lkotlin/Function1;", "onCleared", "onLoadLayerData", "onSelectDayChange", "onSelectTimeCancel", "onSelectTimeChanged", "startTime", "endTime", "sortAndMatchInstanceLayout2Instance", "instance", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/InstanceViewDataImpl;", "syncGetInstanceLayout", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DayInstancesLayout;", "instanceViewData", "updateStartTime", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.c */
public final class RoomInstanceViewModel extends AbstractC1142af implements IRoomInstanceViewModel {
    public static final Companion Companion = new Companion(null);
    public final String buildingName;
    private final Lazy dispatcher$delegate = LazyKt.lazy(C32120b.INSTANCE);
    private boolean isUpdateSelectTime;
    private final CalendarDate mCurrentDate;
    private final Lazy mInstanceCache$delegate;
    private final Lazy mRoomViewInstanceChangeListener$delegate;
    public final CalendarDate mSelectDate;
    private int mSelectEndMinute;
    private int mSelectStartMinute;
    private String mSelectTimeTip;
    private final C1177w<InstanceViewData> roomInstanceLiveData;
    public final CalendarResource roomResource;
    private final C1177w<Boolean> saveEventFinish;
    private final int selectDay;

    private final ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    private final ArrayList<RoomViewInstance>[] getMInstanceCache() {
        return (ArrayList[]) this.mInstanceCache$delegate.getValue();
    }

    private final AbstractC32524a getMRoomViewInstanceChangeListener() {
        return (AbstractC32524a) this.mRoomViewInstanceChangeListener$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceViewModel$Companion;", "", "()V", "CACHE_SIZE", "", "INVALID_TIME", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public String getBuildingName() {
        return this.buildingName;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public boolean getIsUpdateSelectTime() {
        return this.isUpdateSelectTime;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public C1177w<InstanceViewData> getRoomInstanceLiveData() {
        return this.roomInstanceLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public CalendarResource getRoomResource() {
        return this.roomResource;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public C1177w<Boolean> getSaveEventFinish() {
        return this.saveEventFinish;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public String getSelectTimeTip() {
        return this.mSelectTimeTip;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.c$e */
    static final class C32124e extends Lambda implements Function0<AbstractC32524a> {
        final /* synthetic */ RoomInstanceViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32124e(RoomInstanceViewModel cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC32524a invoke() {
            return new AbstractC32524a(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceViewModel.C32124e.C321251 */

                /* renamed from: a */
                final /* synthetic */ C32124e f82099a;

                {
                    this.f82099a = r1;
                }

                @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
                public final void onPush(JSONObject jSONObject) {
                    String str;
                    List<String> list;
                    String str2;
                    Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    Log.m165389i("RoomInstanceViewModel", C32673y.m125374b("pushInstanceChange"));
                    Object obj = jSONObject.get("changed_resource");
                    if (!(obj instanceof PushRoomViewInstanceChangeNotification)) {
                        Log.m165383e("RoomInstanceViewModel", C32673y.m125374b("dataJson = " + jSONObject));
                        return;
                    }
                    CalendarResource calendarResource = this.f82099a.this$0.roomResource;
                    if (calendarResource != null) {
                        str = calendarResource.getCalendarId();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str) && (list = ((PushRoomViewInstanceChangeNotification) obj).resource_calendar_ids) != null) {
                        CalendarResource calendarResource2 = this.f82099a.this$0.roomResource;
                        if (calendarResource2 != null) {
                            str2 = calendarResource2.getCalendarId();
                        } else {
                            str2 = null;
                        }
                        if (list.contains(str2)) {
                            RoomInstanceViewModel.handleLoadLayerData$default(this.f82099a.this$0, this.f82099a.this$0.mSelectDate.getJulianDay(), null, 2, null);
                            RoomInstanceViewModel.handleLoadLayerData$default(this.f82099a.this$0, this.f82099a.this$0.mSelectDate.getJulianDay() - 1, null, 2, null);
                            RoomInstanceViewModel.handleLoadLayerData$default(this.f82099a.this$0, this.f82099a.this$0.mSelectDate.getJulianDay() + 1, null, 2, null);
                        }
                    }
                }
            };
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public int getCurrentDay() {
        return this.mCurrentDate.getJulianDay();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public int getSelectDay() {
        return this.mSelectDate.getJulianDay();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public void onSelectTimeCancel() {
        this.mSelectStartMinute = -1;
        this.mSelectEndMinute = -1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.c$b */
    static final class C32120b extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C32120b INSTANCE = new C32120b();

        C32120b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-room-detail");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…eadPool(\"lk-room-detail\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Ljava/util/ArrayList;", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "Lkotlin/collections/ArrayList;", "invoke", "()[Ljava/util/ArrayList;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.c$d */
    static final class C32123d extends Lambda implements Function0<ArrayList<RoomViewInstance>[]> {
        public static final C32123d INSTANCE = new C32123d();

        C32123d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<RoomViewInstance>[] invoke() {
            ArrayList<RoomViewInstance>[] arrayListArr = new ArrayList[3];
            for (int i = 0; i < 3; i++) {
                arrayListArr[i] = new ArrayList<>();
            }
            return arrayListArr;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public String getTitleViewData() {
        long timeInMilliSeconds = this.mSelectDate.getTimeInMilliSeconds();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String a = C32646c.m125252a(timeInMilliSeconds, timeZone.getID());
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDateTimeShowUtil…TimeZone.getDefault().id)");
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_ROOM_VIEW_INSTANCE_CHANGE_NOTIFICATION, getMRoomViewInstanceChangeListener());
        EventBus.getDefault().unregister(this);
        getDispatcher().close();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public Pair<Long, Long> getUpdateSelectDuration() {
        if (this.mSelectStartMinute == -1 || this.mSelectEndMinute == -1) {
            return null;
        }
        CalendarDate calendarDate = new CalendarDate(this.mSelectDate);
        calendarDate.setDayMinutes(this.mSelectStartMinute);
        long timeInSeconds = calendarDate.getTimeInSeconds();
        calendarDate.setDayMinutes(this.mSelectEndMinute);
        return new Pair<>(Long.valueOf(timeInSeconds), Long.valueOf(calendarDate.getTimeInSeconds()));
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public void onLoadLayerData(int i) {
        handleLoadLayerData$default(this, i, null, 2, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public void onSelectDayChange(int i) {
        this.mSelectDate.setJulianDay(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceViewModel$handleLoadLayerData$1", mo239173f = "RoomInstanceViewModel.kt", mo239174i = {0}, mo239175l = {SmEvents.EVENT_UA_SUCCESS}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.c$c */
    public static final class C32121c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ int $layerDay;
        final /* synthetic */ Function1 $nextAction;
        final /* synthetic */ String $roomId;
        final /* synthetic */ long $startTime;
        final /* synthetic */ String $timeZoneId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ RoomInstanceViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32121c(RoomInstanceViewModel cVar, String str, long j, long j2, String str2, int i, Function1 function1, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
            this.$roomId = str;
            this.$startTime = j;
            this.$endTime = j2;
            this.$timeZoneId = str2;
            this.$layerDay = i;
            this.$nextAction = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C32121c cVar2 = new C32121c(this.this$0, this.$roomId, this.$startTime, this.$endTime, this.$timeZoneId, this.$layerDay, this.$nextAction, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C32121c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<RoomViewInstance> list;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
                List<String> listOf = CollectionsKt.listOf(this.$roomId);
                long j = this.$startTime;
                long j2 = this.$endTime;
                String str = this.$timeZoneId;
                Intrinsics.checkExpressionValueIsNotNull(str, "timeZoneId");
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118921a(listOf, j, j2, str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final SdkResponse iVar = (SdkResponse) obj;
            int i2 = this.$layerDay;
            String str2 = this.this$0.buildingName;
            CalendarResource calendarResource = this.this$0.roomResource;
            GetRoomViewInstancesResponse getRoomViewInstancesResponse = (GetRoomViewInstancesResponse) iVar.mo119076a();
            if (getRoomViewInstancesResponse != null) {
                list = getRoomViewInstancesResponse.room_view_instances;
            } else {
                list = null;
            }
            final InstanceViewDataImpl bVar = new InstanceViewDataImpl(i2, str2, calendarResource, list);
            this.this$0.sortAndMatchInstanceLayout2Instance(bVar);
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceViewModel.C32121c.RunnableC321221 */

                /* renamed from: a */
                final /* synthetic */ C32121c f82096a;

                {
                    this.f82096a = r1;
                }

                public final void run() {
                    List<RoomViewInstance> list;
                    List<RoomViewInstance> list2;
                    RoomInstanceViewModel cVar = this.f82096a.this$0;
                    int i = this.f82096a.$layerDay;
                    GetRoomViewInstancesResponse getRoomViewInstancesResponse = (GetRoomViewInstancesResponse) iVar.mo119076a();
                    if (getRoomViewInstancesResponse != null) {
                        list = getRoomViewInstancesResponse.room_view_instances;
                    } else {
                        list = null;
                    }
                    cVar.cacheInstance(i, list);
                    Function1 function1 = this.f82096a.$nextAction;
                    if (function1 != null) {
                        GetRoomViewInstancesResponse getRoomViewInstancesResponse2 = (GetRoomViewInstancesResponse) iVar.mo119076a();
                        if (getRoomViewInstancesResponse2 == null || (list2 = getRoomViewInstancesResponse2.room_view_instances) == null) {
                            list2 = CollectionsKt.emptyList();
                        }
                        Unit unit = (Unit) function1.invoke(list2);
                    }
                    this.f82096a.this$0.getRoomInstanceLiveData().mo5929b(bVar);
                }
            });
            return Unit.INSTANCE;
        }
    }

    public final void sortAndMatchInstanceLayout2Instance(InstanceViewDataImpl bVar) {
        DayInstancesLayout dayInstancesLayout;
        ArrayList<DayInstancesLayout> syncGetInstanceLayout = syncGetInstanceLayout(bVar);
        if (!(syncGetInstanceLayout == null || (dayInstancesLayout = syncGetInstanceLayout.get(0)) == null)) {
            HashMap hashMap = new HashMap();
            for (T t : bVar.mo117169b()) {
                hashMap.put(t.mo117174c(), t);
            }
            HashMap hashMap2 = hashMap;
            ArrayList arrayList = new ArrayList();
            List<InstanceLayout> instanceLayouts = dayInstancesLayout.getInstanceLayouts();
            Intrinsics.checkExpressionValueIsNotNull(instanceLayouts, "instanceLayouts");
            for (T t2 : instanceLayouts) {
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                OneInstanceViewData cVar = (OneInstanceViewData) hashMap2.get(t2.getId());
                if (cVar != null) {
                    cVar.mo117171a(t2);
                    Intrinsics.checkExpressionValueIsNotNull(cVar, "this");
                    arrayList.add(cVar);
                }
            }
            bVar.mo117170a(arrayList);
        }
    }

    private final ArrayList<DayInstancesLayout> syncGetInstanceLayout(InstanceViewDataImpl bVar) {
        ArrayList arrayList = new ArrayList();
        DayInstancesSlotMetric dayInstancesSlotMetric = new DayInstancesSlotMetric();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = bVar.mo117169b().iterator();
        while (it.hasNext()) {
            RoomViewInstance i = it.next().mo117182i();
            if (i != null) {
                InstanceSlotMetric id = new InstanceSlotMetric().setId(i.event_key);
                Integer num = i.start_day;
                Intrinsics.checkExpressionValueIsNotNull(num, "it.start_day");
                InstanceSlotMetric startDay = id.setStartDay(num.intValue());
                Integer num2 = i.end_day;
                Intrinsics.checkExpressionValueIsNotNull(num2, "it.end_day");
                InstanceSlotMetric endDay = startDay.setEndDay(num2.intValue());
                Integer num3 = i.start_minute;
                Intrinsics.checkExpressionValueIsNotNull(num3, "it.start_minute");
                InstanceSlotMetric startMinute = endDay.setStartMinute(num3.intValue());
                Integer num4 = i.end_minute;
                Intrinsics.checkExpressionValueIsNotNull(num4, "it.end_minute");
                InstanceSlotMetric endMinute = startMinute.setEndMinute(num4.intValue());
                Long l = i.start_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "it.start_time");
                InstanceSlotMetric startTime = endMinute.setStartTime(l.longValue());
                Long l2 = i.end_time;
                Intrinsics.checkExpressionValueIsNotNull(l2, "it.end_time");
                arrayList.add(startTime.setEndTime(l2.longValue()));
            }
        }
        DayInstancesSlotMetric layoutDay = dayInstancesSlotMetric.setLayoutDay(bVar.mo117168a());
        Intrinsics.checkExpressionValueIsNotNull(layoutDay, "dayInstancesSM.setLayout…nstanceViewData.layerDay)");
        layoutDay.setInstanceSlotMetrics(arrayList);
        arrayList2.add(dayInstancesSlotMetric);
        return C32533b.m124620a().mo118849a(arrayList2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.IRoomInstanceViewModel
    public void onSelectTimeChanged(long j, long j2) {
        updateStartTime(j, j2);
    }

    public final void cacheInstance(int i, List<RoomViewInstance> list) {
        int julianDay = (i - this.mSelectDate.getJulianDay()) + 1;
        if (julianDay >= 0 && julianDay < 3) {
            getMInstanceCache()[julianDay].clear();
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        getMInstanceCache()[julianDay].add(t);
                    }
                }
            }
        }
    }

    private final void handleLoadLayerData(int i, Function1<? super List<RoomViewInstance>, Unit> function1) {
        String calendarId;
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setJulianDay(i);
        CalendarDate moveToDayStart = calendarDate.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "layerDate.moveToDayStart()");
        long timeInSeconds = moveToDayStart.getTimeInSeconds();
        CalendarDate moveToDayEnd = calendarDate.moveToDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "layerDate.moveToDayEnd()");
        long timeInSeconds2 = moveToDayEnd.getTimeInSeconds();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        CalendarResource calendarResource = this.roomResource;
        if (calendarResource == null || (calendarId = calendarResource.getCalendarId()) == null) {
            Log.m165383e("RoomInstanceViewModel", C32673y.m125378d("room = null, " + this.roomResource));
            return;
        }
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C32121c(this, calendarId, timeInSeconds, timeInSeconds2, id, i, function1, null), 2, null);
    }

    private final void updateStartTime(long j, long j2) {
        String str;
        SchemaExtraData.ResourceStrategy a;
        boolean z;
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setTimeInSeconds(j);
        int julianDay = (calendarDate.getJulianDay() - this.mSelectDate.getJulianDay()) + 1;
        if (julianDay < 0 || julianDay >= 3) {
            Log.m165383e("RoomInstanceViewModel", C32673y.m125378d("dataIndex = " + julianDay));
            return;
        }
        ArrayList<RoomViewInstance> arrayList = getMInstanceCache()[julianDay];
        CalendarDate calendarDate2 = new CalendarDate();
        CalendarDate calendarDate3 = new CalendarDate();
        calendarDate2.setTimeInSeconds(j);
        calendarDate3.setTimeInSeconds(j2);
        this.mSelectStartMinute = calendarDate2.getDayMinutes();
        this.mSelectEndMinute = calendarDate3.getDayMinutes();
        this.isUpdateSelectTime = false;
        this.mSelectTimeTip = null;
        RoomViewInstance roomViewInstance = null;
        Iterator<RoomViewInstance> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RoomViewInstance next = it.next();
            int julianDay2 = (this.mSelectDate.getJulianDay() + julianDay) - 1;
            Pair<Integer, Integer> a2 = InstanceTimeUtil.m122114a(Math.max(next.start_minute.intValue() + ((next.start_day.intValue() - julianDay2) * CalendarWorkHourUtil.f83805a), 0), Math.min(next.end_minute.intValue() + ((next.end_day.intValue() - julianDay2) * CalendarWorkHourUtil.f83805a), (int) CalendarWorkHourUtil.f83805a), this.mSelectStartMinute, this.mSelectEndMinute);
            if (a2 == null) {
                roomViewInstance = next;
                break;
            } else if (a2.getFirst().intValue() != this.mSelectStartMinute || a2.getSecond().intValue() != this.mSelectEndMinute) {
                this.isUpdateSelectTime = true;
                this.mSelectStartMinute = a2.getFirst().intValue();
                this.mSelectEndMinute = a2.getSecond().intValue();
            }
        }
        CalendarResource calendarResource = this.roomResource;
        if (!(calendarResource == null || (a = C32068f.m121959a(calendarResource)) == null)) {
            Integer num = a.single_max_duration;
            Intrinsics.checkExpressionValueIsNotNull(num, "maxDuration");
            if (Intrinsics.compare((this.mSelectEndMinute - this.mSelectStartMinute) * 60, num.intValue()) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.mSelectTimeTip = MeetingRoomStrategyHelper.f79934a.mo114625a(a, false);
                return;
            }
        }
        if (roomViewInstance != null) {
            CalendarEvent.Category category = roomViewInstance.category;
            if (category != null) {
                int i = C32126d.f82100a[category.ordinal()];
                if (i == 1) {
                    str = UIHelper.getString(R.string.Calendar_MeetingRoom_ReservationBanned);
                } else if (i == 2) {
                    str = UIHelper.getString(R.string.Calendar_MeetingRoom_UnableToReserve);
                }
                this.mSelectTimeTip = str;
            }
            str = UIHelper.getString(R.string.Calendar_MeetingRoom_SomeoneAlreadyReserved);
            this.mSelectTimeTip = str;
        }
    }

    public RoomInstanceViewModel(String str, CalendarResource calendarResource, int i) {
        Intrinsics.checkParameterIsNotNull(str, "buildingName");
        this.buildingName = str;
        this.roomResource = calendarResource;
        this.selectDay = i;
        CalendarDate calendarDate = new CalendarDate();
        this.mSelectDate = calendarDate;
        this.mCurrentDate = new CalendarDate();
        this.mSelectStartMinute = -1;
        this.mSelectEndMinute = -1;
        this.mInstanceCache$delegate = LazyKt.lazy(C32123d.INSTANCE);
        this.mRoomViewInstanceChangeListener$delegate = LazyKt.lazy(new C32124e(this));
        calendarDate.setJulianDay(i);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_ROOM_VIEW_INSTANCE_CHANGE_NOTIFICATION, getMRoomViewInstanceChangeListener());
        EventBus.getDefault().register(this);
        this.roomInstanceLiveData = new C1177w<>();
        this.saveEventFinish = new C1177w<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.meetingroom.instance.c */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void handleLoadLayerData$default(RoomInstanceViewModel cVar, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        cVar.handleLoadLayerData(i, function1);
    }
}
