package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget.DragShrinkDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u0015\u0010\u0007\u001a\u00060\bR\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$DeviceSelectAdapter;", "getAdapter", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$DeviceSelectAdapter;", "deviceListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$OnEquipmentChangedListener;", "getDeviceListener", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$OnEquipmentChangedListener;", "setDeviceListener", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$OnEquipmentChangedListener;)V", "initDragLayout", "", "initEquipmentSetRv", "initTitle", "show", "DeviceItemViewHolder", "DeviceSelectAdapter", "OnEquipmentChangedListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.c */
public final class EquipmentSelectDialog extends DragShrinkDialog {

    /* renamed from: a */
    private final DeviceSelectAdapter f81088a;

    /* renamed from: b */
    private OnEquipmentChangedListener f81089b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$OnEquipmentChangedListener;", "", "onClearAll", "", "onSelectChanged", "equipment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.c$c */
    public interface OnEquipmentChangedListener {
        /* renamed from: a */
        void mo112334a();

        /* renamed from: a */
        void mo112335a(EquipmentData bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J1\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\t0\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$DeviceItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "(Landroid/view/View;)V", "getMView$calendar_impl_release", "()Landroid/view/View;", "setMView$calendar_impl_release", "bindItem", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.c$a */
    public static final class DeviceItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private View f81090a;

        /* renamed from: a */
        public final View mo116068a() {
            return this.f81090a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeviceItemViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "mView");
            this.f81090a = view;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.c$a$a */
        public static final class View$OnClickListenerC31835a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ DeviceItemViewHolder f81091a;

            /* renamed from: b */
            final /* synthetic */ EquipmentData f81092b;

            /* renamed from: c */
            final /* synthetic */ Function1 f81093c;

            View$OnClickListenerC31835a(DeviceItemViewHolder aVar, EquipmentData bVar, Function1 function1) {
                this.f81091a = aVar;
                this.f81092b = bVar;
                this.f81093c = function1;
            }

            public final void onClick(View view) {
                boolean z = !this.f81092b.mo116063d();
                UDCheckBox uDCheckBox = (UDCheckBox) this.f81091a.mo116068a().findViewById(R.id.deviceCB);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "mView.deviceCB");
                uDCheckBox.setChecked(z);
                this.f81092b.mo116060a(z);
                this.f81093c.invoke(this.f81092b);
            }
        }

        /* renamed from: a */
        public final void mo116069a(EquipmentData bVar, Function1<? super EquipmentData, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkParameterIsNotNull(function1, "listener");
            TextView textView = (TextView) this.f81090a.findViewById(R.id.deviceNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mView.deviceNameTV");
            textView.setText(bVar.mo116061b());
            UDCheckBox uDCheckBox = (UDCheckBox) this.f81090a.findViewById(R.id.deviceCB);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "mView.deviceCB");
            uDCheckBox.setChecked(bVar.mo116063d());
            this.f81090a.setOnClickListener(new View$OnClickListenerC31835a(this, bVar, function1));
        }
    }

    /* renamed from: a */
    public final DeviceSelectAdapter mo112221a() {
        return this.f81088a;
    }

    /* renamed from: b */
    public final OnEquipmentChangedListener mo112225b() {
        return this.f81089b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0014\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J\u0006\u0010\u0015\u001a\u00020\u000bR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$DeviceSelectAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog$DeviceItemViewHolder;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentSelectDialog;)V", "mData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "unSelectAll", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.c$b */
    public final class DeviceSelectAdapter extends RecyclerView.Adapter<DeviceItemViewHolder> {

        /* renamed from: b */
        private final ArrayList<EquipmentData> f81095b = new ArrayList<>();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f81095b.size();
        }

        /* renamed from: a */
        public final void mo116072a() {
            Iterator<T> it = this.f81095b.iterator();
            while (it.hasNext()) {
                it.next().mo116060a(false);
            }
            notifyDataSetChanged();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.c$b$a */
        public static final class C31836a extends Lambda implements Function1<EquipmentData, Unit> {
            final /* synthetic */ DeviceSelectAdapter this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31836a(DeviceSelectAdapter bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EquipmentData bVar) {
                invoke(bVar);
                return Unit.INSTANCE;
            }

            public final void invoke(EquipmentData bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "it");
                OnEquipmentChangedListener b = EquipmentSelectDialog.this.mo112225b();
                if (b != null) {
                    b.mo112335a(bVar);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DeviceSelectAdapter() {
        }

        /* renamed from: a */
        public final void mo116074a(List<EquipmentData> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f81095b.clear();
            this.f81095b.addAll(list);
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public DeviceItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_meeting_room_filter_select_device, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new DeviceItemViewHolder(inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(DeviceItemViewHolder aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "holder");
            if (i < this.f81095b.size()) {
                EquipmentData bVar = this.f81095b.get(i);
                Intrinsics.checkExpressionValueIsNotNull(bVar, "mData[position]");
                aVar.mo116069a(bVar, new C31836a(this));
            }
        }
    }

    /* renamed from: d */
    private final void m120830d() {
        ((TextView) findViewById(R.id.clearEquipment)).setOnClickListener(new View$OnClickListenerC31837d(this));
    }

    /* renamed from: k */
    private final void m120832k() {
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115977c();
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115978d();
    }

    /* renamed from: j */
    private final void m120831j() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.deviceSetRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "deviceSetRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.deviceSetRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "deviceSetRv");
        recyclerView2.setAdapter(this.f81088a);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget.DragShrinkDialog, com.larksuite.framework.ui.BaseDialog
    public void show() {
        View findViewById = findViewById(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
        findViewById.setBackground(new ColorDrawable(UIHelper.getColor(R.color.lkui_N900)));
        super.show();
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a((float) DeviceUtils.getScreenHeight(getContext()), BitmapDescriptorFactory.HUE_RED, mo112527e());
    }

    /* renamed from: a */
    public final void mo116067a(OnEquipmentChangedListener cVar) {
        this.f81089b = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.c$d */
    public static final class View$OnClickListenerC31837d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EquipmentSelectDialog f81096a;

        View$OnClickListenerC31837d(EquipmentSelectDialog cVar) {
            this.f81096a = cVar;
        }

        public final void onClick(View view) {
            this.f81096a.mo112221a().mo116072a();
            OnEquipmentChangedListener b = this.f81096a.mo112225b();
            if (b != null) {
                b.mo112334a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EquipmentSelectDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f81088a = new DeviceSelectAdapter();
        mo112524a(UIHelper.dp2px(292.0f));
        mo112526b(R.layout.dialog_meeting_room_device_filter);
        m120830d();
        m120831j();
        m120832k();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EquipmentSelectDialog(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.style.CalendarTransparentDialog : i);
    }
}
