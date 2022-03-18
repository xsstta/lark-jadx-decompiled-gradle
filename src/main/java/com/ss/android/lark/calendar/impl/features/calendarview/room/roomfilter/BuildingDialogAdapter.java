package com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneBuildingFloorViewData;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0014\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter$BuildingDialogViewHolder;", "()V", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter$OnItemClickListener;", "getItemClickListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter$OnItemClickListener;", "setItemClickListener", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter$OnItemClickListener;)V", "mBuildingsData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "Lkotlin/collections/ArrayList;", "clearAllSelectedData", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshData", "buildingsData", "", "BuildingDialogViewHolder", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.b */
public final class BuildingDialogAdapter extends RecyclerView.Adapter<BuildingDialogViewHolder> {

    /* renamed from: a */
    private final ArrayList<OneBuildingFloorViewData> f78193a = new ArrayList<>();

    /* renamed from: b */
    private OnItemClickListener f78194b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter$OnItemClickListener;", "", "onItemClick", "", "buildingFloorData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.b$b */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo112288a(OneBuildingFloorViewData gVar);
    }

    /* renamed from: a */
    public final OnItemClickListener mo112296a() {
        return this.f78194b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78193a.size();
    }

    /* renamed from: b */
    public final void mo112300b() {
        Iterator<T> it = this.f78193a.iterator();
        while (it.hasNext()) {
            it.next().mo112379a(false);
        }
    }

    /* renamed from: a */
    public final void mo112298a(OnItemClickListener bVar) {
        this.f78194b = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter$BuildingDialogViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter;Landroid/view/View;)V", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.b$a */
    public final class BuildingDialogViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ BuildingDialogAdapter f78195a;

        /* renamed from: b */
        private final View f78196b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.b$a$a */
        public static final class View$OnClickListenerC31022a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ BuildingDialogViewHolder f78197a;

            /* renamed from: b */
            final /* synthetic */ OneBuildingFloorViewData f78198b;

            View$OnClickListenerC31022a(BuildingDialogViewHolder aVar, OneBuildingFloorViewData gVar) {
                this.f78197a = aVar;
                this.f78198b = gVar;
            }

            public final void onClick(View view) {
                OnItemClickListener a = this.f78197a.f78195a.mo112296a();
                if (a != null) {
                    a.mo112288a(this.f78198b);
                }
            }
        }

        /* renamed from: a */
        public final void mo112301a(OneBuildingFloorViewData gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            TextView textView = (TextView) this.f78196b.findViewById(R.id.buildingNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.buildingNameTV");
            textView.setText(gVar.mo112380b());
            if (gVar.mo112381c()) {
                ((TextView) this.f78196b.findViewById(R.id.buildingNameTV)).setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            } else {
                ((TextView) this.f78196b.findViewById(R.id.buildingNameTV)).setTextColor(UIHelper.getColor(R.color.text_title));
            }
            this.f78196b.setOnClickListener(new View$OnClickListenerC31022a(this, gVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BuildingDialogViewHolder(BuildingDialogAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f78195a = bVar;
            this.f78196b = view;
        }
    }

    /* renamed from: a */
    public final void mo112299a(List<OneBuildingFloorViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "buildingsData");
        this.f78193a.clear();
        this.f78193a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public BuildingDialogViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_room_view_building_filter, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new BuildingDialogViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(BuildingDialogViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        OneBuildingFloorViewData gVar = this.f78193a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(gVar, "mBuildingsData[position]");
        aVar.mo112301a(gVar);
    }
}
