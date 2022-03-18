package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.CapacitySelectDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentSelectDialog;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 12\u00020\u0001:\u000212B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0014J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\u000e\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u001cJ\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u001eR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \"*\u0004\u0018\u00010!0!X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "capacityData", "equipmentsData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "Lkotlin/collections/ArrayList;", "filterAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomFilterAdapter;", "filterItemList", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomFilterData;", "filterListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$OnSearchFilterListener;", "getFilterListener", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$OnSearchFilterListener;", "setFilterListener", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$OnSearchFilterListener;)V", "filterSource", "", "isEditEvent", "", "isResetStatus", "logoDrawable", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "loadEquipmentsData", "", "notifyResetStatus", "onDetachedFromWindow", "openCapacitySelectDialog", "openEquipmentSelectDialog", "refreshCapacityFilter", "refreshEquipmentFilter", "resetFilters", "setFilterAdapter", "setFilterSource", ShareHitPoint.f121868c, "setIsEditEvent", "isEdit", "Companion", "OnSearchFilterListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingRoomSearchFilters extends LinearLayout {

    /* renamed from: f */
    public static final Companion f81060f = new Companion(null);

    /* renamed from: a */
    public boolean f81061a;

    /* renamed from: b */
    public int f81062b;

    /* renamed from: c */
    public final ArrayList<EquipmentData> f81063c;

    /* renamed from: d */
    public String f81064d;

    /* renamed from: e */
    public boolean f81065e;

    /* renamed from: g */
    private OnSearchFilterListener f81066g;

    /* renamed from: h */
    private final SparseArray<MeetingRoomFilterData> f81067h;

    /* renamed from: i */
    private final MeetingRoomFilterAdapter f81068i;

    /* renamed from: j */
    private final Drawable f81069j;

    /* renamed from: k */
    private CallbackManager f81070k;

    /* renamed from: l */
    private HashMap f81071l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$OnSearchFilterListener;", "", "onCapacityChanged", "", "selectedCapacity", "", "onEquipmentsChanged", "selectedEquipments", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onResetStatusChanged", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters$b */
    public interface OnSearchFilterListener {
        /* renamed from: a */
        void mo110574a();

        /* renamed from: a */
        void mo110575a(int i);

        /* renamed from: a */
        void mo110576a(List<EquipmentData> list);
    }

    public MeetingRoomSearchFilters(Context context) {
        this(context, null, 0, 6, null);
    }

    public MeetingRoomSearchFilters(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo116038a(int i) {
        if (this.f81071l == null) {
            this.f81071l = new HashMap();
        }
        View view = (View) this.f81071l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81071l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$Companion;", "", "()V", "FILTER_CAPACITY", "", "FILTER_EQUIPMENT", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final OnSearchFilterListener getFilterListener() {
        return this.f81066g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f81070k.cancelCallbacks();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters$f */
    public static final class C31829f extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingRoomSearchFilters this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31829f(MeetingRoomSearchFilters meetingRoomSearchFilters) {
            super(0);
            this.this$0 = meetingRoomSearchFilters;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            GeneralHitPoint.m124214a(this.this$0.f81064d, this.this$0.f81065e);
            this.this$0.mo116041c();
            KeyboardUtils.hideKeyboard(this.this$0.getContext());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters$g */
    public static final class C31830g extends Lambda implements Function0<Unit> {
        final /* synthetic */ MeetingRoomSearchFilters this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31830g(MeetingRoomSearchFilters meetingRoomSearchFilters) {
            super(0);
            this.this$0 = meetingRoomSearchFilters;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            GeneralHitPoint.m124214a(this.this$0.f81064d, this.this$0.f81065e);
            this.this$0.mo116040b();
            KeyboardUtils.hideKeyboard(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$openEquipmentSelectDialog$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$OnEquipmentChangedListener;", "onClearAll", "", "onSelectChanged", "equipment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters$e */
    public static final class C31828e implements EquipmentSelectDialog.OnEquipmentChangedListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSearchFilters f81077a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentSelectDialog.OnEquipmentChangedListener
        /* renamed from: a */
        public void mo112334a() {
            Iterator<T> it = this.f81077a.f81063c.iterator();
            while (it.hasNext()) {
                it.next().mo116060a(false);
            }
            this.f81077a.mo116042d();
            OnSearchFilterListener filterListener = this.f81077a.getFilterListener();
            if (filterListener != null) {
                filterListener.mo110576a(CollectionsKt.emptyList());
            }
            this.f81077a.mo116044f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31828e(MeetingRoomSearchFilters meetingRoomSearchFilters) {
            this.f81077a = meetingRoomSearchFilters;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentSelectDialog.OnEquipmentChangedListener
        /* renamed from: a */
        public void mo112335a(EquipmentData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "equipment");
            ArrayList<EquipmentData> arrayList = new ArrayList();
            for (T t : this.f81077a.f81063c) {
                if (Intrinsics.areEqual(t.mo116059a(), bVar.mo116059a())) {
                    arrayList.add(t);
                }
            }
            for (EquipmentData bVar2 : arrayList) {
                bVar2.mo116060a(bVar.mo116063d());
            }
            this.f81077a.mo116042d();
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : this.f81077a.f81063c) {
                if (t2.mo116063d()) {
                    arrayList2.add(t2);
                }
            }
            ArrayList arrayList3 = arrayList2;
            OnSearchFilterListener filterListener = this.f81077a.getFilterListener();
            if (filterListener != null) {
                filterListener.mo110576a(arrayList3);
            }
            this.f81077a.mo116044f();
            GeneralHitPoint.m124212a(this.f81077a.f81064d, this.f81077a.f81063c, this.f81077a.f81062b);
        }
    }

    /* renamed from: h */
    private final void m120801h() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("MeetingRoomSearchFilters", C32673y.m125376b(valueOf, "loadEquipments", new String[0]));
        UIGetDataCallback wrapAndAddGetDataCallback = this.f81070k.wrapAndAddGetDataCallback(new C31826c(this, valueOf, "loadEquipments"));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        aVar.mo118964e(wrapAndAddGetDataCallback);
    }

    /* renamed from: b */
    public final void mo116040b() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        CapacitySelectDialog aVar = new CapacitySelectDialog(context, 0, 2, null);
        aVar.mo116055a(new C31827d(this));
        aVar.mo116054a(this.f81062b);
        aVar.show();
    }

    /* renamed from: c */
    public final void mo116041c() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        EquipmentSelectDialog cVar = new EquipmentSelectDialog(context, 0, 2, null);
        cVar.mo116067a(new C31828e(this));
        if (CollectionUtils.isNotEmpty(this.f81063c)) {
            cVar.mo112221a().mo116074a(this.f81063c);
            cVar.show();
        }
    }

    /* renamed from: a */
    public final void mo116039a() {
        this.f81067h.clear();
        if (!this.f81063c.isEmpty()) {
            SparseArray<MeetingRoomFilterData> sparseArray = this.f81067h;
            String b = C32634ae.m125182b(R.string.Calendar_Edit_Device);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.string.Calendar_Edit_Device)");
            sparseArray.put(0, new MeetingRoomFilterData(null, b, false, new C31829f(this), 4, null));
        }
        SparseArray<MeetingRoomFilterData> sparseArray2 = this.f81067h;
        String b2 = C32634ae.m125182b(R.string.Calendar_Edit_CapacityMobile);
        Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…ndar_Edit_CapacityMobile)");
        sparseArray2.put(1, new MeetingRoomFilterData(null, b2, false, new C31830g(this), 4, null));
        this.f81068i.mo116078a(this.f81067h);
    }

    /* renamed from: e */
    public final void mo116043e() {
        boolean z;
        if (this.f81062b > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MeetingRoomFilterData eVar = this.f81067h.get(1);
            if (eVar != null) {
                eVar.mo116085a(this.f81069j);
            }
            MeetingRoomFilterData eVar2 = this.f81067h.get(1);
            if (eVar2 != null) {
                eVar2.mo116086a(String.valueOf(this.f81062b));
            }
            MeetingRoomFilterData eVar3 = this.f81067h.get(1);
            if (eVar3 != null) {
                eVar3.mo116087a(true);
            }
        } else {
            MeetingRoomFilterData eVar4 = this.f81067h.get(1);
            if (eVar4 != null) {
                eVar4.mo116085a((Drawable) null);
            }
            MeetingRoomFilterData eVar5 = this.f81067h.get(1);
            if (eVar5 != null) {
                String b = C32634ae.m125182b(R.string.Calendar_Edit_CapacityMobile);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ndar_Edit_CapacityMobile)");
                eVar5.mo116086a(b);
            }
            MeetingRoomFilterData eVar6 = this.f81067h.get(1);
            if (eVar6 != null) {
                eVar6.mo116087a(false);
            }
        }
        this.f81068i.notifyDataSetChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116044f() {
        /*
            r4 = this;
            int r0 = r4.f81062b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0033
            java.util.ArrayList<com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.b> r0 = r4.f81063c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0019
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0019
        L_0x0017:
            r0 = 1
            goto L_0x0030
        L_0x0019:
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0017
            java.lang.Object r3 = r0.next()
            com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.b r3 = (com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData) r3
            boolean r3 = r3.mo116063d()
            if (r3 == 0) goto L_0x001d
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0033
            r1 = 1
        L_0x0033:
            boolean r0 = r4.f81061a
            if (r1 != r0) goto L_0x0038
            return
        L_0x0038:
            r4.f81061a = r1
            if (r1 == 0) goto L_0x0044
            r0 = 2131100963(0x7f060523, float:1.7814322E38)
            int r0 = com.ss.android.lark.calendar.impl.utils.C32634ae.m125178a(r0)
            goto L_0x004b
        L_0x0044:
            r0 = 2131100966(0x7f060526, float:1.7814328E38)
            int r0 = com.ss.android.lark.calendar.impl.utils.C32634ae.m125178a(r0)
        L_0x004b:
            r1 = 2131299451(0x7f090c7b, float:1.8216904E38)
            android.view.View r1 = r4.mo116038a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.mo116044f():void");
    }

    /* renamed from: d */
    public final void mo116042d() {
        ArrayList arrayList = new ArrayList();
        for (T t : this.f81063c) {
            if (t.mo116063d()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            StringBuilder sb = new StringBuilder(((EquipmentData) arrayList2.get(arrayList2.size() - 1)).mo116061b());
            for (int size = arrayList2.size() - 2; size >= 0; size--) {
                sb.append(C32634ae.m125182b(R.string.Calendar_Common_CommaPadSpace));
                sb.append(((EquipmentData) arrayList2.get(size)).mo116061b());
            }
            MeetingRoomFilterData eVar = this.f81067h.get(0);
            if (eVar != null) {
                eVar.mo116085a((Drawable) null);
            }
            MeetingRoomFilterData eVar2 = this.f81067h.get(0);
            if (eVar2 != null) {
                String sb2 = sb.toString();
                Intrinsics.checkExpressionValueIsNotNull(sb2, "equipmentNameSb.toString()");
                eVar2.mo116086a(sb2);
            }
            MeetingRoomFilterData eVar3 = this.f81067h.get(0);
            if (eVar3 != null) {
                eVar3.mo116087a(true);
            }
        } else {
            MeetingRoomFilterData eVar4 = this.f81067h.get(0);
            if (eVar4 != null) {
                eVar4.mo116085a((Drawable) null);
            }
            MeetingRoomFilterData eVar5 = this.f81067h.get(0);
            if (eVar5 != null) {
                String b = C32634ae.m125182b(R.string.Calendar_Edit_Device);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.string.Calendar_Edit_Device)");
                eVar5.mo116086a(b);
            }
            MeetingRoomFilterData eVar6 = this.f81067h.get(0);
            if (eVar6 != null) {
                eVar6.mo116087a(false);
            }
        }
        this.f81068i.notifyDataSetChanged();
    }

    /* renamed from: g */
    public final void mo116045g() {
        MeetingRoomFilterData eVar = this.f81067h.get(0);
        if (eVar != null) {
            eVar.mo116085a((Drawable) null);
        }
        MeetingRoomFilterData eVar2 = this.f81067h.get(0);
        if (eVar2 != null) {
            String b = C32634ae.m125182b(R.string.Calendar_Edit_Device);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.string.Calendar_Edit_Device)");
            eVar2.mo116086a(b);
        }
        MeetingRoomFilterData eVar3 = this.f81067h.get(0);
        if (eVar3 != null) {
            eVar3.mo116087a(false);
        }
        MeetingRoomFilterData eVar4 = this.f81067h.get(1);
        if (eVar4 != null) {
            eVar4.mo116085a((Drawable) null);
        }
        MeetingRoomFilterData eVar5 = this.f81067h.get(1);
        if (eVar5 != null) {
            String b2 = C32634ae.m125182b(R.string.Calendar_Edit_CapacityMobile);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…ndar_Edit_CapacityMobile)");
            eVar5.mo116086a(b2);
        }
        MeetingRoomFilterData eVar6 = this.f81067h.get(1);
        if (eVar6 != null) {
            eVar6.mo116087a(false);
        }
        this.f81062b = 0;
        Iterator<T> it = this.f81063c.iterator();
        while (it.hasNext()) {
            it.next().mo116060a(false);
        }
        this.f81061a = true;
        this.f81068i.notifyDataSetChanged();
    }

    public final void setFilterListener(OnSearchFilterListener bVar) {
        this.f81066g = bVar;
    }

    public final void setIsEditEvent(boolean z) {
        this.f81065e = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$openCapacitySelectDialog$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/CapacitySelectDialog$OnCapacityChangedListener;", "onSelectChanged", "", "capacity", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters$d */
    public static final class C31827d implements CapacitySelectDialog.OnCapacityChangedListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSearchFilters f81076a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31827d(MeetingRoomSearchFilters meetingRoomSearchFilters) {
            this.f81076a = meetingRoomSearchFilters;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.CapacitySelectDialog.OnCapacityChangedListener
        /* renamed from: a */
        public void mo112338a(int i) {
            this.f81076a.f81062b = i;
            OnSearchFilterListener filterListener = this.f81076a.getFilterListener();
            if (filterListener != null) {
                filterListener.mo110575a(i);
            }
            this.f81076a.mo116043e();
            this.f81076a.mo116044f();
            GeneralHitPoint.m124212a(this.f81076a.f81064d, this.f81076a.f81063c, this.f81076a.f81062b);
        }
    }

    public final void setFilterSource(String str) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        this.f81064d = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$loadEquipmentsData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "equipmentSdkData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters$c */
    public static final class C31826c implements IGetDataCallback<List<? extends EquipmentData>> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSearchFilters f81073a;

        /* renamed from: b */
        final /* synthetic */ String f81074b;

        /* renamed from: c */
        final /* synthetic */ String f81075c;

        /* renamed from: a */
        public void onSuccess(List<EquipmentData> list) {
            Integer num;
            String str = this.f81074b;
            String str2 = this.f81075c;
            String[] strArr = new String[2];
            strArr[0] = "equipment_size";
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            strArr[1] = String.valueOf(num);
            Log.m165389i("MeetingRoomSearchFilters", C32673y.m125373a(str, str2, strArr));
            this.f81073a.f81063c.clear();
            if (list != null) {
                this.f81073a.f81063c.addAll(list);
            }
            this.f81073a.mo116039a();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("MeetingRoomSearchFilters", C32673y.m125370a(this.f81074b, this.f81075c, errorResult));
            LKUIToast.show(this.f81073a.getContext(), C32634ae.m125182b(R.string.Calendar_Toast_LoadErrorToast));
            this.f81073a.f81063c.clear();
            this.f81073a.mo116039a();
        }

        C31826c(MeetingRoomSearchFilters meetingRoomSearchFilters, String str, String str2) {
            this.f81073a = meetingRoomSearchFilters;
            this.f81074b = str;
            this.f81075c = str2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomSearchFilters(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f81061a = true;
        this.f81063c = new ArrayList<>();
        this.f81067h = new SparseArray<>();
        MeetingRoomFilterAdapter dVar = new MeetingRoomFilterAdapter();
        this.f81068i = dVar;
        Drawable d = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
        d.setTint(C57582a.m223616d(context, R.color.static_white));
        this.f81069j = d;
        this.f81070k = new CallbackManager();
        this.f81064d = "full_event_editor";
        LayoutInflater.from(context).inflate(R.layout.view_meeting_room_search_filter, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) mo116038a(R.id.meetingRoomFilterRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "meetingRoomFilterRV");
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        RecyclerView recyclerView2 = (RecyclerView) mo116038a(R.id.meetingRoomFilterRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "meetingRoomFilterRV");
        recyclerView2.setAdapter(dVar);
        ((TextView) mo116038a(R.id.filterResetBtn)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.View$OnClickListenerC318251 */

            /* renamed from: a */
            final /* synthetic */ MeetingRoomSearchFilters f81072a;

            {
                this.f81072a = r1;
            }

            public final void onClick(View view) {
                OnSearchFilterListener filterListener;
                ((TextView) this.f81072a.mo116038a(R.id.filterResetBtn)).setTextColor(C32634ae.m125178a(R.color.primary_pri_300));
                if (!this.f81072a.f81061a && (filterListener = this.f81072a.getFilterListener()) != null) {
                    filterListener.mo110574a();
                }
                this.f81072a.mo116045g();
            }
        });
        m120801h();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeetingRoomSearchFilters(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
