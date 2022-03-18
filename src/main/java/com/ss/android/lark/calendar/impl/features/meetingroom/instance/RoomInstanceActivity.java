package com.ss.android.lark.calendar.impl.features.meetingroom.instance;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.AbstractC30173d;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.AutoScroller;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.PiecesDragger;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.IOnAppendTimeSelected;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollViewListener;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.ITimeLayoutParam;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.TimeLineLayoutManager;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.TimeLinesLayer;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditDateHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.util.InstanceChipPool;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.InstanceViewData;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.InstanceChipView;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.InstanceChipsLayer;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.InstancesLayoutManager;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.content.ProfileContentFragment;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.data.MeetingRoomProfileBaseData;
import com.ss.android.lark.calendar.impl.framework.C32484a;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 82\u00020\u0001:\u00018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0002J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0002J\u0012\u00102\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020-H\u0014J\b\u00106\u001a\u00020-H\u0002J\b\u00107\u001a\u00020-H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010'\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b)\u0010*¨\u00069"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "mDragLayer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/draglayer/ChipsDragLayer;", "getMDragLayer", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/draglayer/ChipsDragLayer;", "mDragLayer$delegate", "Lkotlin/Lazy;", "mInstanceChipPool", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/util/InstanceChipPool;", "getMInstanceChipPool", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/util/InstanceChipPool;", "mInstanceChipPool$delegate", "mLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getMLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "mLifecycleOwner$delegate", "mLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getMLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "mLifecycleRegistry$delegate", "mRoomInstanceLayer", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipsLayer;", "getMRoomInstanceLayer", "()[Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipsLayer;", "mRoomInstanceLayer$delegate", "mRoomLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomLayoutParam;", "mRoomProfileFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentFragment;", "getMRoomProfileFragment", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentFragment;", "mRoomProfileFragment$delegate", "mTimeLinesLayer", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/TimeLinesLayer;", "mViewModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/IRoomInstanceViewModel;", "getMViewModel", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/IRoomInstanceViewModel;", "mViewModel$delegate", "initLifeCycle", "", "initLiveData", "initRoomProfileFragment", "initScrollView", "initTitleBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "refreshAllLayer", "smoothToCurrentTime", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RoomInstanceActivity extends CalendarBaseActivity {

    /* renamed from: c */
    public static final Companion f82047c = new Companion(null);

    /* renamed from: a */
    public final RoomLayoutParam f82048a;

    /* renamed from: b */
    public final TimeLinesLayer f82049b;

    /* renamed from: d */
    private final Lazy f82050d = LazyKt.lazy(new C32117s(this));

    /* renamed from: e */
    private final Lazy f82051e = LazyKt.lazy(new C32114p(this));

    /* renamed from: f */
    private final Lazy f82052f = LazyKt.lazy(new C32112o(this));

    /* renamed from: g */
    private final Lazy f82053g;

    /* renamed from: h */
    private final Lazy f82054h;

    /* renamed from: i */
    private final Lazy f82055i;

    /* renamed from: j */
    private final Lazy f82056j;

    /* renamed from: k */
    private HashMap f82057k;

    /* renamed from: k */
    private final LifecycleOwner m122068k() {
        return (LifecycleOwner) this.f82052f.getValue();
    }

    /* renamed from: l */
    private final ProfileContentFragment m122069l() {
        return (ProfileContentFragment) this.f82053g.getValue();
    }

    /* renamed from: a */
    public Context mo117133a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f82057k == null) {
            this.f82057k = new HashMap();
        }
        View view = (View) this.f82057k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82057k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final IRoomInstanceViewModel mo117134a() {
        return (IRoomInstanceViewModel) this.f82050d.getValue();
    }

    /* renamed from: a */
    public void mo117135a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m122065a(this, context);
    }

    /* renamed from: b */
    public final LifecycleRegistry mo117136b() {
        return (LifecycleRegistry) this.f82051e.getValue();
    }

    /* renamed from: c */
    public final InstanceChipPool mo117137c() {
        return (InstanceChipPool) this.f82054h.getValue();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m122063a(this, configuration);
    }

    /* renamed from: d */
    public final InstanceChipsLayer[] mo117139d() {
        return (InstanceChipsLayer[]) this.f82055i.getValue();
    }

    /* renamed from: e */
    public final C30745a mo117140e() {
        return (C30745a) this.f82056j.getValue();
    }

    public AssetManager getAssets() {
        return m122067c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m122064a(this);
    }

    /* renamed from: h */
    public Resources mo117144h() {
        return super.getResources();
    }

    /* renamed from: i */
    public void mo117145i() {
        super.onStop();
    }

    /* renamed from: j */
    public AssetManager mo117146j() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m122066b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceActivity$Companion;", "", "()V", "PROFILE_MAX_Y", "", "SHADOW_ELEVATION", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceActivity$initScrollView$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/dragdrop/IOnEventDrag;", "onEventDragEnd", "", "onEventDragStart", "onEventHandleDragMove", "index", "", "screenX", "screenY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$d */
    public static final class C32100d implements AbstractC30773d {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82060a;

        /* renamed from: b */
        final /* synthetic */ AutoScroller f82061b;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d
        /* renamed from: b */
        public void mo111122b() {
            this.f82061b.mo111140a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d
        /* renamed from: a */
        public void mo111120a() {
            SnapScrollView snapScrollView = (SnapScrollView) this.f82060a.mo108509a(R.id.roomInsScrollView);
            Intrinsics.checkExpressionValueIsNotNull(snapScrollView, "roomInsScrollView");
            int screenHeight = DeviceUtils.getScreenHeight(snapScrollView.getContext()) - UIHelper.dp2px(40.0f);
            SnapScrollView snapScrollView2 = (SnapScrollView) this.f82060a.mo108509a(R.id.roomInsScrollView);
            Intrinsics.checkExpressionValueIsNotNull(snapScrollView2, "roomInsScrollView");
            this.f82061b.mo111142a(new int[]{this.f82060a.f82048a.mo117189a(), 0, snapScrollView2.getWidth(), screenHeight});
        }

        C32100d(RoomInstanceActivity roomInstanceActivity, AutoScroller aVar) {
            this.f82060a = roomInstanceActivity;
            this.f82061b = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d
        /* renamed from: a */
        public void mo111121a(int i, int i2, int i3) {
            this.f82061b.mo111141a(i2, i3);
            if (!this.f82061b.mo111144b(i2)) {
                this.f82061b.mo111143a(i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleOwner;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$o */
    public static final class C32112o extends Lambda implements Function0<LifecycleOwner> {
        final /* synthetic */ RoomInstanceActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32112o(RoomInstanceActivity roomInstanceActivity) {
            super(0);
            this.this$0 = roomInstanceActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleOwner invoke() {
            return new LifecycleOwner(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity.C32112o.C321131 */

                /* renamed from: a */
                final /* synthetic */ C32112o f82071a;

                {
                    this.f82071a = r1;
                }

                /* renamed from: a */
                public final LifecycleRegistry getLifecycle() {
                    return this.f82071a.this$0.mo117136b();
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$r */
    static final class C32116r extends Lambda implements Function0<ProfileContentFragment> {
        public static final C32116r INSTANCE = new C32116r();

        C32116r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ProfileContentFragment invoke() {
            return new ProfileContentFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceActivity$initScrollView$4", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/dragdrop/IOnAppendTimeSelected;", "onSelectAppendTime", "", "startTime", "", "endTime", "onSelectCancel", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$g */
    public static final class C32103g implements IOnAppendTimeSelected {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82064a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.IOnAppendTimeSelected
        /* renamed from: a */
        public void mo111115a() {
            this.f82064a.mo117134a().onSelectTimeCancel();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32103g(RoomInstanceActivity roomInstanceActivity) {
            this.f82064a = roomInstanceActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.IOnAppendTimeSelected
        /* renamed from: a */
        public void mo111116a(long j, long j2) {
            this.f82064a.mo117134a().onSelectTimeChanged(j, j2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsGridLine;", "getGridLine"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$h */
    public static final class C32104h implements C30748b.AbstractC30754a {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82065a;

        C32104h(RoomInstanceActivity roomInstanceActivity) {
            this.f82065a = roomInstanceActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b.AbstractC30754a
        /* renamed from: a */
        public final C30167c mo111119a() {
            return this.f82065a.f82048a.mo117197h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceActivity$initScrollView$7", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysLayoutManager$ILayerManagerListener;", "onFirstLayoutFinished", "", "onLayerNeedBindData", "layerDay", "", "onSelectDayChanged", "leftLayerDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$j */
    public static final class C32106j implements AbsDaysLayoutManager.ILayerManagerListener {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82067a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager.ILayerManagerListener
        /* renamed from: a */
        public void mo113320a() {
            this.f82067a.mo117141f();
            this.f82067a.mo117142g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32106j(RoomInstanceActivity roomInstanceActivity) {
            this.f82067a = roomInstanceActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager.ILayerManagerListener
        /* renamed from: b */
        public void mo113322b(int i) {
            this.f82067a.mo117134a().onLoadLayerData(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysLayoutManager.ILayerManagerListener
        /* renamed from: a */
        public void mo113321a(int i) {
            String str;
            if (((SnapScrollView) this.f82067a.mo108509a(R.id.roomInsScrollView)).getScrollAnimApi().mo113250b() != 1) {
                this.f82067a.mo117140e().setDate(i);
                CalendarDate calendarDate = new CalendarDate();
                calendarDate.setJulianDay(i);
                this.f82067a.mo117134a().onSelectDayChange(i);
                ((TitleTimeBar) this.f82067a.mo108509a(R.id.titleCalendarBar)).setSelectDate(calendarDate);
                ((TitleTimeBar) this.f82067a.mo108509a(R.id.titleCalendarBar)).setTitleText(this.f82067a.mo117134a().getTitleViewData());
                GeneralHitPoint cVar = GeneralHitPoint.f83331a;
                CalendarResource roomResource = this.f82067a.mo117134a().getRoomResource();
                if (roomResource != null) {
                    str = roomResource.getCalendarId();
                } else {
                    str = null;
                }
                cVar.mo118721I(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/draglayer/ChipsDragLayer;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$m */
    static final class C32109m extends Lambda implements Function0<C30745a> {
        final /* synthetic */ RoomInstanceActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32109m(RoomInstanceActivity roomInstanceActivity) {
            super(0);
            this.this$0 = roomInstanceActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C30745a invoke() {
            C30745a aVar = new C30745a(this.this$0);
            aVar.setSupportMultiTimeZone(false);
            return aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/util/InstanceChipPool;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$n */
    public static final class C32110n extends Lambda implements Function0<InstanceChipPool> {
        final /* synthetic */ RoomInstanceActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32110n(RoomInstanceActivity roomInstanceActivity) {
            super(0);
            this.this$0 = roomInstanceActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InstanceChipPool invoke() {
            return new InstanceChipPool(new AbstractC30173d.AbstractC30174a<InstanceChipView>(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity.C32110n.C321111 */

                /* renamed from: a */
                final /* synthetic */ C32110n f82070a;

                @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.AbstractC30173d.AbstractC30174a
                /* renamed from: b */
                public int mo108749b() {
                    return 20;
                }

                /* renamed from: a */
                public InstanceChipView mo108750c() {
                    Context applicationContext = this.f82070a.this$0.getApplicationContext();
                    Intrinsics.checkExpressionValueIsNotNull(applicationContext, "applicationContext");
                    return new InstanceChipView(applicationContext, null, 0, 6, null);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f82070a = r1;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleRegistry;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$p */
    static final class C32114p extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ RoomInstanceActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32114p(RoomInstanceActivity roomInstanceActivity) {
            super(0);
            this.this$0 = roomInstanceActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        mo117136b().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$s */
    static final class C32117s extends Lambda implements Function0<RoomInstanceViewModel> {
        final /* synthetic */ RoomInstanceActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32117s(RoomInstanceActivity roomInstanceActivity) {
            super(0);
            this.this$0 = roomInstanceActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomInstanceViewModel invoke() {
            return (RoomInstanceViewModel) new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity.C32117s.C321181 */

                /* renamed from: a */
                final /* synthetic */ C32117s f82072a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f82072a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    String str;
                    Serializable serializable;
                    int i;
                    Bundle extras;
                    Bundle extras2;
                    Bundle extras3;
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    Intent intent = this.f82072a.this$0.getIntent();
                    if (intent == null || (extras3 = intent.getExtras()) == null || (str = extras3.getString("room_building_name")) == null) {
                        str = "";
                    }
                    Intrinsics.checkExpressionValueIsNotNull(str, "intent?.extras?. getStri…OOM_BUILDING_NAME ) ?: \"\"");
                    Intent intent2 = this.f82072a.this$0.getIntent();
                    CalendarResource calendarResource = null;
                    if (intent2 == null || (extras2 = intent2.getExtras()) == null) {
                        serializable = null;
                    } else {
                        serializable = extras2.getSerializable("room_calendar_resource");
                    }
                    if (serializable instanceof CalendarResource) {
                        calendarResource = serializable;
                    }
                    CalendarResource calendarResource2 = calendarResource;
                    Intent intent3 = this.f82072a.this$0.getIntent();
                    if (intent3 == null || (extras = intent3.getExtras()) == null) {
                        i = new CalendarDate().getJulianDay();
                    } else {
                        i = extras.getInt("room_select_day");
                    }
                    return new RoomInstanceViewModel(str, calendarResource2, i);
                }
            }).mo6005a(RoomInstanceViewModel.class);
        }
    }

    /* renamed from: o */
    private final void m122072o() {
        mo117136b().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        mo117136b().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceActivity$initScrollView$3", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/dragdrop/IOnEventSelected;", "onEventCancel", "", "onEventSelect", "index", "", "beginPosition", "endPosition", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$f */
    public static final class C32102f implements AbstractC30774e {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82063a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e
        /* renamed from: a */
        public void mo111125a() {
            ((SnapScrollView) this.f82063a.mo108509a(R.id.roomInsScrollView)).getScrollAnimApi().mo113249a(false);
            this.f82063a.f82049b.mo113307b();
            for (InstanceChipsLayer instanceChipsLayer : this.f82063a.mo117139d()) {
                instanceChipsLayer.bringToFront();
            }
            ((SnapScrollView) this.f82063a.mo108509a(R.id.roomInsScrollView)).invalidate();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32102f(RoomInstanceActivity roomInstanceActivity) {
            this.f82063a = roomInstanceActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e
        /* renamed from: a */
        public void mo111126a(int i, int i2, int i3) {
            ((SnapScrollView) this.f82063a.mo108509a(R.id.roomInsScrollView)).getScrollAnimApi().mo113249a(true);
            this.f82063a.f82049b.mo113305a(i2);
            this.f82063a.f82049b.mo113308b(i3);
            this.f82063a.mo117140e().bringToFront();
            ((SnapScrollView) this.f82063a.mo108509a(R.id.roomInsScrollView)).invalidate();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipsLayer;", "invoke", "()[Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipsLayer;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$q */
    static final class C32115q extends Lambda implements Function0<InstanceChipsLayer[]> {
        final /* synthetic */ RoomInstanceActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32115q(RoomInstanceActivity roomInstanceActivity) {
            super(0);
            this.this$0 = roomInstanceActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InstanceChipsLayer[] invoke() {
            int a = this.this$0.f82048a.mo117199j().mo113327e().mo113329a();
            InstanceChipsLayer[] instanceChipsLayerArr = new InstanceChipsLayer[a];
            for (int i = 0; i < a; i++) {
                Context applicationContext = this.this$0.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext, "applicationContext");
                InstanceChipsLayer instanceChipsLayer = new InstanceChipsLayer(applicationContext, null, 0, 6, null);
                instanceChipsLayer.setInstanceChipPool(this.this$0.mo117137c());
                instanceChipsLayerArr[i] = instanceChipsLayer;
            }
            return instanceChipsLayerArr;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$t */
    public static final class RunnableC32119t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82073a;

        /* renamed from: b */
        final /* synthetic */ List f82074b;

        RunnableC32119t(RoomInstanceActivity roomInstanceActivity, List list) {
            this.f82073a = roomInstanceActivity;
            this.f82074b = list;
        }

        public final void run() {
            for (InstanceChipsLayer instanceChipsLayer : this.f82074b) {
                this.f82073a.mo117134a().onLoadLayerData(instanceChipsLayer.getLayerDay());
            }
        }
    }

    /* renamed from: p */
    private final void m122073p() {
        mo117134a().getRoomInstanceLiveData().mo5923a(m122068k(), new C32098b(this));
        mo117134a().getSaveEventFinish().mo5923a(m122068k(), new C32099c(this));
    }

    /* renamed from: g */
    public final void mo117142g() {
        ((SnapScrollView) mo108509a(R.id.roomInsScrollView)).getScrollAnimApi().mo113251b((int) (((-this.f82048a.mo117192c()) * ((float) new CalendarDate().getDayMinutes())) + ((float) (this.f82048a.mo117194e() / 4))));
    }

    public RoomInstanceActivity() {
        RoomLayoutParam eVar = new RoomLayoutParam();
        this.f82048a = eVar;
        this.f82049b = new TimeLinesLayer(1, eVar.mo117200k());
        this.f82053g = LazyKt.lazy(C32116r.INSTANCE);
        this.f82054h = LazyKt.lazy(new C32110n(this));
        this.f82055i = LazyKt.lazy(new C32115q(this));
        this.f82056j = LazyKt.lazy(new C32109m(this));
    }

    /* renamed from: m */
    private final void m122070m() {
        ((TitleTimeBar) mo108509a(R.id.titleCalendarBar)).setDateChangeListener(new C32108l(this));
        ((TitleTimeBar) mo108509a(R.id.titleCalendarBar)).mo109104c();
        ((TitleTimeBar) mo108509a(R.id.titleCalendarBar)).setMonthViewTopMargin(BitmapDescriptorFactory.HUE_RED);
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setJulianDay(mo117134a().getSelectDay());
        ((TitleTimeBar) mo108509a(R.id.titleCalendarBar)).setSelectDate(calendarDate);
        ((TitleTimeBar) mo108509a(R.id.titleCalendarBar)).setTitleText(mo117134a().getTitleViewData());
    }

    /* renamed from: q */
    private final void m122074q() {
        CalendarResource roomResource = mo117134a().getRoomResource();
        if (roomResource != null) {
            String calendarId = roomResource.getCalendarId();
            Intrinsics.checkExpressionValueIsNotNull(calendarId, "it.calendarId");
            MeetingRoomProfileBaseData aVar = new MeetingRoomProfileBaseData(calendarId, 0, 0, false, null, null, 62, null);
            Bundle bundle = new Bundle();
            aVar.mo117291a(bundle);
            float dp2px = (float) UIHelper.dp2px(312.0f);
            ((VerticalDragLayout) mo108509a(R.id.dragLayout)).setMiddleTranslationY(dp2px);
            ((VerticalDragLayout) mo108509a(R.id.dragLayout)).setMaxTranslationY(dp2px);
            ((VerticalDragLayout) mo108509a(R.id.dragLayout)).setInitTranslationY(dp2px);
            VerticalDragLayout verticalDragLayout = (VerticalDragLayout) mo108509a(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(verticalDragLayout, "dragLayout");
            verticalDragLayout.setElevation((float) UIHelper.dp2px(15.0f));
            m122069l().setArguments(bundle);
            m122069l().mo117257f();
            FragmentTransaction customAnimations = getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out);
            FrameLayout frameLayout = (FrameLayout) mo108509a(R.id.fragmentContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "fragmentContainer");
            customAnimations.add(frameLayout.getId(), m122069l(), (String) null).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
            return;
        }
        Log.m165383e(this.TAG, C32673y.m125378d("room is null"));
    }

    /* renamed from: f */
    public final void mo117141f() {
        boolean z;
        InstanceChipsLayer[] d = mo117139d();
        ArrayList arrayList = new ArrayList();
        int length = d.length;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= length) {
                break;
            }
            InstanceChipsLayer instanceChipsLayer = d[i];
            if (instanceChipsLayer.getLayerDay() != mo117134a().getSelectDay()) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(instanceChipsLayer);
            }
            i++;
        }
        ArrayList<InstanceChipsLayer> arrayList2 = arrayList;
        InstanceChipsLayer[] d2 = mo117139d();
        ArrayList arrayList3 = new ArrayList();
        for (InstanceChipsLayer instanceChipsLayer2 : d2) {
            if (instanceChipsLayer2.getLayerDay() != mo117134a().getSelectDay()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(instanceChipsLayer2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        for (InstanceChipsLayer instanceChipsLayer3 : arrayList2) {
            mo117134a().onLoadLayerData(instanceChipsLayer3.getLayerDay());
        }
        UICallbackExecutor.executeDelayed(new RunnableC32119t(this, arrayList4), 150);
    }

    /* renamed from: n */
    private final void m122071n() {
        ((SnapScrollView) mo108509a(R.id.roomInsScrollView)).setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
        ITimeLayoutParam k = this.f82048a.mo117200k();
        SnapScrollView snapScrollView = (SnapScrollView) mo108509a(R.id.roomInsScrollView);
        Intrinsics.checkExpressionValueIsNotNull(snapScrollView, "roomInsScrollView");
        TimeLineLayoutManager bVar = new TimeLineLayoutManager(snapScrollView, k);
        bVar.mo113303a(this.f82049b);
        ((SnapScrollView) mo108509a(R.id.roomInsScrollView)).mo113224a(bVar);
        mo117140e().setEventDrag(new C32100d(this, new AutoScroller(((SnapScrollView) mo108509a(R.id.roomInsScrollView)).getCoordinateApi(), ((SnapScrollView) mo108509a(R.id.roomInsScrollView)).getScrollAnimApi())));
        mo117140e().setClickAppendViewListener(new C32101e(this));
        mo117140e().mo111149a(false);
        C30745a e = mo117140e();
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "this.window");
        e.setDragger(new PiecesDragger(window));
        mo117140e().setEventOnSelected(new C32102f(this));
        mo117140e().setAppendOnSelected(new C32103g(this));
        mo117140e().setLayoutComputer(new C32104h(this));
        C30022a.f74884c.mo108450a(new C32105i(this));
        mo117140e().setDate(mo117134a().getSelectDay());
        mo117140e().mo111150b();
        SnapScrollView snapScrollView2 = (SnapScrollView) mo108509a(R.id.roomInsScrollView);
        Intrinsics.checkExpressionValueIsNotNull(snapScrollView2, "roomInsScrollView");
        InstancesLayoutManager aVar = new InstancesLayoutManager(snapScrollView2, this.f82048a);
        aVar.mo113318a(new C32106j(this));
        aVar.mo117216a(mo117140e());
        aVar.mo113319a(mo117139d());
        ((SnapScrollView) mo108509a(R.id.roomInsScrollView)).mo113224a(aVar);
        ((SnapScrollView) mo108509a(R.id.roomInsScrollView)).setScrollListener(new C32107k(this));
        ((SnapScrollView) mo108509a(R.id.roomInsScrollView)).getScrollAnimApi().mo113253d(mo117134a().getSelectDay() - new CalendarDate().getJulianDay());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceActivity$initScrollView$8", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollViewListener;", "onMeasured", "", "width", "", "height", "onScrollX", "progress", "", "onSizeChanged", "oldWidth", "oldHeight", "updateLayoutParam", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$k */
    public static final class C32107k implements IScrollViewListener {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82068a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollViewListener
        /* renamed from: a */
        public void mo111111a(float f) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32107k(RoomInstanceActivity roomInstanceActivity) {
            this.f82068a = roomInstanceActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollViewListener
        /* renamed from: a */
        public void mo111112a(int i, int i2) {
            if (i != 0 && i2 != 0) {
                m122102b(i, i2);
            }
        }

        /* renamed from: b */
        private final void m122102b(int i, int i2) {
            this.f82068a.f82048a.mo117190a(i, i2);
            ((SnapScrollView) this.f82068a.mo108509a(R.id.roomInsScrollView)).mo113221a(this.f82068a.f82048a.mo117198i(), 0);
            for (InstanceChipsLayer instanceChipsLayer : this.f82068a.mo117139d()) {
                instanceChipsLayer.mo117205a(this.f82068a.f82048a.mo117195f(), this.f82068a.f82048a.mo117196g());
            }
            ((SnapScrollView) this.f82068a.mo108509a(R.id.roomInsScrollView)).setSnapWith(this.f82068a.f82048a.mo117195f());
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollViewListener
        /* renamed from: a */
        public void mo111113a(int i, int i2, int i3, int i4) {
            if (i != i3 && i3 != 0) {
                m122102b(i, i2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomInstanceActivity$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TitleTimeBar$OnTitleChangeListener;", "onAddAttendeeClick", "", "onDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$l */
    public static final class C32108l implements TitleTimeBar.OnTitleChangeListener {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82069a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar.OnTitleChangeListener
        /* renamed from: a */
        public void mo108573a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32108l(RoomInstanceActivity roomInstanceActivity) {
            this.f82069a = roomInstanceActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TitleTimeBar.OnTitleChangeListener
        /* renamed from: a */
        public void mo108574a(CalendarDate calendarDate) {
            String str;
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            int julianDay = calendarDate.getJulianDay();
            ((SnapScrollView) this.f82069a.mo108509a(R.id.roomInsScrollView)).getScrollAnimApi().mo113247a(julianDay - this.f82069a.mo117134a().getCurrentDay(), 1);
            this.f82069a.mo117134a().onSelectDayChange(julianDay);
            this.f82069a.mo117140e().setDate(julianDay);
            ((TitleTimeBar) this.f82069a.mo108509a(R.id.titleCalendarBar)).setTitleText(this.f82069a.mo117134a().getTitleViewData());
            GeneralHitPoint cVar = GeneralHitPoint.f83331a;
            CalendarResource roomResource = this.f82069a.mo117134a().getRoomResource();
            if (roomResource != null) {
                str = roomResource.getCalendarId();
            } else {
                str = null;
            }
            cVar.mo118721I(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isSaved", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$c */
    public static final class C32099c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82059a;

        C32099c(RoomInstanceActivity roomInstanceActivity) {
            this.f82059a = roomInstanceActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "isSaved");
            if (bool.booleanValue()) {
                this.f82059a.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$i */
    public static final class C32105i implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82066a;

        C32105i(RoomInstanceActivity roomInstanceActivity) {
            this.f82066a = roomInstanceActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            C30745a e = this.f82066a.mo117140e();
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            e.setDefaultEventDuration(calendarSetting.getDefaultEventDuration());
        }
    }

    /* renamed from: a */
    public static Resources m122064a(RoomInstanceActivity roomInstanceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(roomInstanceActivity);
        }
        return roomInstanceActivity.mo117144h();
    }

    /* renamed from: c */
    public static AssetManager m122067c(RoomInstanceActivity roomInstanceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(roomInstanceActivity);
        }
        return roomInstanceActivity.mo117146j();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/InstanceViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$b */
    public static final class C32098b<T> implements AbstractC1178x<InstanceViewData> {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82058a;

        C32098b(RoomInstanceActivity roomInstanceActivity) {
            this.f82058a = roomInstanceActivity;
        }

        /* renamed from: a */
        public final void onChanged(InstanceViewData aVar) {
            InstanceChipsLayer[] d = this.f82058a.mo117139d();
            for (InstanceChipsLayer instanceChipsLayer : d) {
                if (instanceChipsLayer.getLayerDay() == aVar.mo117168a()) {
                    instanceChipsLayer.mo117207a(aVar.mo117169b());
                }
            }
        }
    }

    /* renamed from: b */
    public static void m122066b(RoomInstanceActivity roomInstanceActivity) {
        roomInstanceActivity.mo117145i();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RoomInstanceActivity roomInstanceActivity2 = roomInstanceActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    roomInstanceActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.calendar_activity_room_page);
        m122070m();
        m122071n();
        m122073p();
        m122074q();
        m122072o();
        CalendarResource roomResource = mo117134a().getRoomResource();
        if (roomResource != null) {
            str = roomResource.getCalendarId();
        } else {
            str = null;
        }
        GeneralHitPoint.m124171F(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onClickAppendView"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.RoomInstanceActivity$e */
    public static final class C32101e implements C30745a.AbstractC30746a {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceActivity f82062a;

        C32101e(RoomInstanceActivity roomInstanceActivity) {
            this.f82062a = roomInstanceActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a.AbstractC30746a
        /* renamed from: a */
        public final void mo111124a(Intent intent) {
            String str;
            Log.m165389i(this.f82062a.TAG, C32673y.m125378d("onClickAppendView"));
            GeneralHitPoint cVar = GeneralHitPoint.f83331a;
            CalendarResource roomResource = this.f82062a.mo117134a().getRoomResource();
            if (roomResource != null) {
                str = roomResource.getCalendarId();
            } else {
                str = null;
            }
            cVar.mo118719G(str);
            String selectTimeTip = this.f82062a.mo117134a().getSelectTimeTip();
            if (TextUtils.isEmpty(selectTimeTip)) {
                Pair<Long, Long> updateSelectDuration = this.f82062a.mo117134a().getUpdateSelectDuration();
                if (updateSelectDuration != null) {
                    EditActivityEntrance.f79940a.mo114672a(intent, updateSelectDuration.getFirst().longValue(), updateSelectDuration.getSecond().longValue());
                }
                if (this.f82062a.mo117134a().getIsUpdateSelectTime()) {
                    Context a = new C32484a().mo118635a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CalendarContext().appContext");
                    UDToast.show(a, (int) R.string.Calendar_Rooms_EventTimeChanged);
                }
                this.f82062a.mo117140e().mo111147a();
                EventMeetingRoomData a2 = EditDateHelper.f79932a.mo114615a(this.f82062a.mo117134a().getRoomResource(), this.f82062a.mo117134a().getBuildingName());
                ArrayList arrayList = new ArrayList();
                if (a2 != null) {
                    arrayList.add(a2);
                }
                ArrayList arrayList2 = new ArrayList();
                AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
                Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
                arrayList2.add(loginDependency.mo108269a());
                intent.putExtra("calendar_attendee_chatter_ids", arrayList2);
                intent.putExtra("key_params_resource_list", arrayList);
                this.f82062a.startActivity(intent);
            } else if (selectTimeTip != null) {
                UDToast.show(this.f82062a, selectTimeTip);
            }
        }
    }

    /* renamed from: a */
    public static void m122065a(RoomInstanceActivity roomInstanceActivity, Context context) {
        roomInstanceActivity.mo117135a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(roomInstanceActivity);
        }
    }

    /* renamed from: a */
    public static Context m122063a(RoomInstanceActivity roomInstanceActivity, Configuration configuration) {
        Context a = roomInstanceActivity.mo117133a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
