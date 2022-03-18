package com.ss.android.lark.calendar.impl.features.calendarview.room.levelfilter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.LevelFilterViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget.DragShrinkDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiLevelModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelTree;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020\u000bH\u0002J\b\u0010#\u001a\u00020\u000bH\u0002J\b\u0010$\u001a\u00020\u000bH\u0002J\b\u0010%\u001a\u00020\u000bH\u0002J\b\u0010&\u001a\u00020\u000bH\u0016J\u0006\u0010'\u001a\u00020\u000bJ\b\u0010(\u001a\u00020\u000bH\u0002J\u000e\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u001aJ\b\u0010+\u001a\u00020\u000bH\u0016J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.H\u0002R,\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R1\u0010\u0012\u001a\"\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013j\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014`\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/levelfilter/LevelFilterDialog;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "confirmListener", "Lkotlin/Function1;", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "", "getConfirmListener", "()Lkotlin/jvm/functions/Function1;", "setConfirmListener", "(Lkotlin/jvm/functions/Function1;)V", "confirmTextView", "Landroid/widget/TextView;", "getCurrentLevelItemModel", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "getGetCurrentLevelItemModel", "()Ljava/util/ArrayList;", "levelFilterViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/LevelFilterViewData;", "resourceLevelAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "getResourceLevelAdapter", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "resourceLevelAdapter$delegate", "Lkotlin/Lazy;", "initBusinessView", "initDragLayout", "initLevelRv", "initTitleBar", "initUDBreadcrumb", "onBackPressed", "refreshAllView", "refreshConfirmTextView", "setViewData", "viewData", "show", "updateSelectState", "levelNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a */
public final class LevelFilterDialog extends DragShrinkDialog {

    /* renamed from: b */
    public static final Companion f78145b = new Companion(null);

    /* renamed from: a */
    public LevelFilterViewData f78146a;

    /* renamed from: c */
    private Function1<? super List<CalendarResource>, Unit> f78147c;

    /* renamed from: d */
    private final Lazy f78148d;

    /* renamed from: e */
    private TextView f78149e;

    /* renamed from: b */
    public final BuildingAdapter mo112225b() {
        return (BuildingAdapter) this.f78148d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/levelfilter/LevelFilterDialog$Companion;", "", "()V", "LEVEL_DIALOG_TOP_MARGIN", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.util.List<com.bytedance.lark.pb.calendar.v1.CalendarResource>, kotlin.Unit>, kotlin.jvm.functions.Function1<java.util.List<com.bytedance.lark.pb.calendar.v1.CalendarResource>, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<List<CalendarResource>, Unit> mo112221a() {
        return this.f78147c;
    }

    public void onBackPressed() {
        mo112528f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a$h */
    static final class C31008h extends Lambda implements Function0<BuildingAdapter> {
        final /* synthetic */ LevelFilterDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31008h(LevelFilterDialog aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BuildingAdapter invoke() {
            return new BuildingAdapter(this.this$0.mo112226c());
        }
    }

    /* renamed from: k */
    private final void m115660k() {
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115978d();
    }

    /* renamed from: j */
    private final void m115659j() {
        m115663n();
        m115662m();
        m115661l();
        m115660k();
        ((EditSelectStateView) findViewById(R.id.selectAllBt)).setOnClickListener(new View$OnClickListenerC31003c(this));
    }

    /* renamed from: l */
    private final void m115661l() {
        ((LevelBreadcrumbsView) findViewById(R.id.breadCrumb)).setCallback(new C31007g(this));
    }

    /* renamed from: c */
    public final ArrayList<ItemModel> mo112226c() {
        ArrayList<ItemModel> a;
        LevelFilterViewData fVar = this.f78146a;
        if (fVar == null || (a = fVar.mo112368a()) == null) {
            return new ArrayList<>();
        }
        return a;
    }

    /* renamed from: m */
    private final void m115662m() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.levelRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "levelRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.levelRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "levelRv");
        recyclerView2.setAdapter(mo112225b());
        mo112225b().mo115212a(new C31004d(this));
    }

    /* renamed from: o */
    private final void m115664o() {
        int i;
        List<CalendarResource> c;
        LevelFilterViewData fVar = this.f78146a;
        boolean z = false;
        if (!(fVar == null || (c = fVar.mo112371c()) == null || c.size() <= 0)) {
            z = true;
        }
        if (z) {
            i = R.color.primary_pri_500;
        } else {
            i = R.color.text_placeholder;
        }
        TextView textView = this.f78149e;
        if (textView != null) {
            textView.setTextColor(C32634ae.m125178a(i));
        }
    }

    /* renamed from: n */
    private final void m115663n() {
        View addAction = ((CommonTitleBar) findViewById(R.id.titleBar)).addAction(new C31005e(this, C32634ae.m125182b(R.string.Calendar_Common_Confirm)));
        if (!(addAction instanceof TextView)) {
            addAction = null;
        }
        this.f78149e = (TextView) addAction;
        ((CommonTitleBar) findViewById(R.id.titleBar)).setTitle(R.string.Calendar_Rooms_SelectRoomsLevel);
        ((CommonTitleBar) findViewById(R.id.titleBar)).setLeftImageResource(R.drawable.ic_svg_titlebar_close);
        ((CommonTitleBar) findViewById(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC31006f(this));
    }

    /* renamed from: d */
    public final void mo112227d() {
        MultiLevelNode d;
        IBuildingContract.SelectState b;
        LevelFilterViewData fVar = this.f78146a;
        if (fVar != null) {
            BuildingAdapter b2 = mo112225b();
            b2.mo115214a(mo112226c());
            b2.notifyDataSetChanged();
            ((LevelBreadcrumbsView) findViewById(R.id.breadCrumb)).setMultiItems(fVar.mo112370b());
            MultiLevelTree d2 = fVar.mo112372d();
            if (!(d2 == null || (d = d2.mo115841d()) == null || (b = d.mo115823b()) == null)) {
                ((EditSelectStateView) findViewById(R.id.selectAllBt)).mo115963a(b);
            }
            m115664o();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget.DragShrinkDialog, com.larksuite.framework.ui.BaseDialog
    public void show() {
        View findViewById = findViewById(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
        ColorDrawable colorDrawable = new ColorDrawable(UIHelper.getColor(R.color.lkui_N900));
        colorDrawable.setAlpha((int) 178.5d);
        findViewById.setBackground(colorDrawable);
        super.show();
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a((float) DeviceUtils.getScreenHeight(getContext()), BitmapDescriptorFactory.HUE_RED, mo112527e());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a$b */
    static final class C31002b extends Lambda implements Function1<List<? extends CalendarResource>, Unit> {
        public static final C31002b INSTANCE = new C31002b();

        C31002b() {
            super(1);
        }

        public final void invoke(List<CalendarResource> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CalendarResource> list) {
            invoke((List<CalendarResource>) list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/levelfilter/LevelFilterDialog$initLevelRv$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "onArrowClick", "", "clickBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "onMultipleSelectClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a$d */
    public static final class C31004d implements MultiLevelViewHolder.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ LevelFilterDialog f78151a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31004d(LevelFilterDialog aVar) {
            this.f78151a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder.OnItemClickListener
        /* renamed from: b */
        public void mo112232b(MultiLevelModel jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "clickBuildingModel");
            this.f78151a.mo112223a(jVar.mo115797a());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo112231a(MultiLevelModel jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "clickBuildingModel");
            LevelFilterViewData fVar = this.f78151a.f78146a;
            if (fVar != null) {
                fVar.mo112369a(jVar.mo115797a());
            }
            this.f78151a.mo112227d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a$f */
    public static final class View$OnClickListenerC31006f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LevelFilterDialog f78153a;

        View$OnClickListenerC31006f(LevelFilterDialog aVar) {
            this.f78153a = aVar;
        }

        public final void onClick(View view) {
            this.f78153a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/levelfilter/LevelFilterDialog$initUDBreadcrumb$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$IBreadcrumbsListener;", "onItemClick", "", "item", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "position", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a$g */
    public static final class C31007g implements LevelBreadcrumbsView.IBreadcrumbsListener {

        /* renamed from: a */
        final /* synthetic */ LevelFilterDialog f78154a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31007g(LevelFilterDialog aVar) {
            this.f78154a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView.IBreadcrumbsListener
        /* renamed from: a */
        public void mo112234a(MultiLevelNode bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            LevelFilterViewData fVar = this.f78154a.f78146a;
            if (fVar != null) {
                fVar.mo112369a(bVar);
            }
            this.f78154a.mo112227d();
        }
    }

    /* renamed from: a */
    public final void mo112224a(Function1<? super List<CalendarResource>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f78147c = function1;
    }

    /* renamed from: a */
    public final void mo112222a(LevelFilterViewData fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewData");
        this.f78146a = fVar;
        mo112227d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a$c */
    public static final class View$OnClickListenerC31003c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LevelFilterDialog f78150a;

        View$OnClickListenerC31003c(LevelFilterDialog aVar) {
            this.f78150a = aVar;
        }

        public final void onClick(View view) {
            MultiLevelTree d;
            MultiLevelNode d2;
            LevelFilterViewData fVar = this.f78150a.f78146a;
            if (fVar != null && (d = fVar.mo112372d()) != null && (d2 = d.mo115841d()) != null) {
                this.f78150a.mo112223a(d2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/levelfilter/LevelFilterDialog$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.a.a$e */
    public static final class C31005e extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ LevelFilterDialog f78152a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            List<CalendarResource> c;
            LevelFilterViewData fVar = this.f78152a.f78146a;
            if (!(fVar == null || (c = fVar.mo112371c()) == null)) {
                this.f78152a.mo112221a().invoke(c);
            }
            this.f78152a.onBackPressed();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31005e(LevelFilterDialog aVar, String str) {
            super(str);
            this.f78152a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo112223a(MultiLevelNode bVar) {
        if (C31009b.f78155a[bVar.mo115823b().ordinal()] != 1) {
            bVar.mo115828e();
        } else {
            bVar.mo115827d();
        }
        mo112227d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LevelFilterDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78147c = C31002b.INSTANCE;
        this.f78148d = LazyKt.lazy(new C31008h(this));
        mo112524a(UIHelper.dp2px(88.0f));
        mo112526b(R.layout.dialog_level_filter_layout);
        m115659j();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LevelFilterDialog(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.style.CalendarTransparentDialog : i);
    }
}
