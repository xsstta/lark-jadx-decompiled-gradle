package com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.FloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneBuildingFloorViewData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter$BuildingFloorViewHolder;", "()V", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter$OnItemClickListener;", "getItemClickListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter$OnItemClickListener;", "setItemClickListener", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter$OnItemClickListener;)V", "mBuildingFloorData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshFloorData", "buildingFloorData", "BuildingFloorViewHolder", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.c */
public final class BuildingFloorAdapter extends RecyclerView.Adapter<BuildingFloorViewHolder> {

    /* renamed from: a */
    public OneBuildingFloorViewData f78199a;

    /* renamed from: b */
    private OnItemClickListener f78200b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter$OnItemClickListener;", "", "onItemClick", "", "buildingFloorData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.c$b */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo112290a(OneBuildingFloorViewData gVar);
    }

    /* renamed from: a */
    public final OnItemClickListener mo112304a() {
        return this.f78200b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<FloorViewData> d;
        OneBuildingFloorViewData gVar = this.f78199a;
        if (gVar == null || (d = gVar.mo112382d()) == null) {
            return 0;
        }
        return d.size();
    }

    /* renamed from: a */
    public final void mo112306a(OnItemClickListener bVar) {
        this.f78200b = bVar;
    }

    /* renamed from: a */
    public final void mo112307a(OneBuildingFloorViewData gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildingFloorData");
        this.f78199a = gVar;
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter$BuildingFloorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter;Landroid/view/View;)V", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/FloorViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.c$a */
    public final class BuildingFloorViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final View f78201a;

        /* renamed from: b */
        final /* synthetic */ BuildingFloorAdapter f78202b;

        /* renamed from: a */
        public final void mo112308a(FloorViewData dVar) {
            int i;
            Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            TextView textView = (TextView) this.f78201a.findViewById(R.id.floorNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.floorNameTV");
            textView.setText(dVar.mo112355a());
            ImageView imageView = (ImageView) this.f78201a.findViewById(R.id.selectIV);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.selectIV");
            if (dVar.mo112358c()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            this.f78201a.setOnClickListener(new View$OnClickListenerC31023a(this, dVar));
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.c$a$a */
        public static final class View$OnClickListenerC31023a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ BuildingFloorViewHolder f78203a;

            /* renamed from: b */
            final /* synthetic */ FloorViewData f78204b;

            View$OnClickListenerC31023a(BuildingFloorViewHolder aVar, FloorViewData dVar) {
                this.f78203a = aVar;
                this.f78204b = dVar;
            }

            public final void onClick(View view) {
                int i;
                OnItemClickListener a;
                Boolean bool;
                List<FloorViewData> d;
                List<FloorViewData> d2;
                List<FloorViewData> d3;
                boolean z;
                boolean z2;
                List<FloorViewData> d4;
                FloorViewData dVar = this.f78204b;
                dVar.mo112356a(!dVar.mo112358c());
                ImageView imageView = (ImageView) this.f78203a.f78201a.findViewById(R.id.selectIV);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.selectIV");
                if (this.f78204b.mo112358c()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (this.f78204b.mo112357b()) {
                    OneBuildingFloorViewData gVar = this.f78203a.f78202b.f78199a;
                    if (!(gVar == null || (d4 = gVar.mo112382d()) == null)) {
                        for (T t : d4) {
                            t.mo112356a(t.mo112357b());
                        }
                    }
                } else {
                    OneBuildingFloorViewData gVar2 = this.f78203a.f78202b.f78199a;
                    if (gVar2 == null || (d3 = gVar2.mo112382d()) == null) {
                        bool = null;
                    } else {
                        List<FloorViewData> list = d3;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                if (!next.mo112358c() || next.mo112357b()) {
                                    z2 = false;
                                    continue;
                                } else {
                                    z2 = true;
                                    continue;
                                }
                                if (z2) {
                                    z = false;
                                    break;
                                }
                            }
                            bool = Boolean.valueOf(z);
                        }
                        z = true;
                        bool = Boolean.valueOf(z);
                    }
                    if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                        OneBuildingFloorViewData gVar3 = this.f78203a.f78202b.f78199a;
                        if (!(gVar3 == null || (d2 = gVar3.mo112382d()) == null)) {
                            ArrayList<FloorViewData> arrayList = new ArrayList();
                            for (T t2 : d2) {
                                if (t2.mo112357b()) {
                                    arrayList.add(t2);
                                }
                            }
                            for (FloorViewData dVar2 : arrayList) {
                                dVar2.mo112356a(true);
                            }
                        }
                    } else {
                        OneBuildingFloorViewData gVar4 = this.f78203a.f78202b.f78199a;
                        if (!(gVar4 == null || (d = gVar4.mo112382d()) == null)) {
                            ArrayList<FloorViewData> arrayList2 = new ArrayList();
                            for (T t3 : d) {
                                if (t3.mo112357b()) {
                                    arrayList2.add(t3);
                                }
                            }
                            for (FloorViewData dVar3 : arrayList2) {
                                dVar3.mo112356a(false);
                            }
                        }
                    }
                }
                this.f78203a.f78202b.notifyDataSetChanged();
                OneBuildingFloorViewData gVar5 = this.f78203a.f78202b.f78199a;
                if (!(gVar5 == null || (a = this.f78203a.f78202b.mo112304a()) == null)) {
                    a.mo112290a(gVar5);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BuildingFloorViewHolder(BuildingFloorAdapter cVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f78202b = cVar;
            this.f78201a = view;
        }
    }

    /* renamed from: a */
    public BuildingFloorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_room_view_floor_filter, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new BuildingFloorViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(BuildingFloorViewHolder aVar, int i) {
        List<FloorViewData> d;
        FloorViewData dVar;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        OneBuildingFloorViewData gVar = this.f78199a;
        if (gVar != null && (d = gVar.mo112382d()) != null && (dVar = d.get(i)) != null) {
            aVar.mo112308a(dVar);
        }
    }
}
