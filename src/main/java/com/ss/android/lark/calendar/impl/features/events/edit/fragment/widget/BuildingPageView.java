package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.LoadingDataModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00160\bj\b\u0012\u0004\u0012\u00020\u0016`\nJ\u0006\u0010\u001a\u001a\u00020\u0012J:\u0010\u001b\u001a\u00020\u00142\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ@\u0010\u001e\u001a\u00020\u001428\u0010\u001f\u001a4\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0 j\u001e\u0012\u0004\u0012\u00020\t\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n`!J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0012J$\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\f2\b\u0010&\u001a\u0004\u0018\u00010\u00102\b\u0010'\u001a\u0004\u0018\u00010\u000eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/BuildingPageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildingAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "buildingItemModels", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "Lkotlin/collections/ArrayList;", "mOnBuildingItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "mOnDeleteBtnClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "mOnMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "pageIndex", "", "addBuildingLoadingStatus", "", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "clearAndLoadingExpandBuilding", "closeOneBuildingMeetingRooms", "getExpandBuildings", "getPageIndex", "initBuildingView", "selectRoomItem", "buildingItemsData", "refreshBuildingMeetingRooms", "buildingMeetingRoomsMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "setPageIndex", "pageIdx", "setViewHolderListener", "onBuildingItemClickedListener", "onMeetingRoomItemClickedListener", "onDeleteBtnClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.c */
public final class BuildingPageView extends FrameLayout {

    /* renamed from: a */
    private BuildingAdapter f81036a;

    /* renamed from: b */
    private ArrayList<ItemModel> f81037b = new ArrayList<>();

    /* renamed from: c */
    private MeetingRoomBuildingViewHolder.OnItemClickListener f81038c;

    /* renamed from: d */
    private MeetingRoomViewHolder.OnItemClickListener f81039d;

    /* renamed from: e */
    private ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener f81040e;

    /* renamed from: f */
    private int f81041f;

    /* renamed from: g */
    private HashMap f81042g;

    /* renamed from: a */
    public View mo116013a(int i) {
        if (this.f81042g == null) {
            this.f81042g = new HashMap();
        }
        View view = (View) this.f81042g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81042g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getPageIndex() {
        return this.f81041f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.ArrayList<com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<MeetingRoomBuildingModel> getExpandBuildings() {
        ArrayList<MeetingRoomBuildingModel> arrayList = new ArrayList<>();
        Iterator<ItemModel> it = this.f81037b.iterator();
        while (it.hasNext()) {
            ItemModel next = it.next();
            if ((next instanceof MeetingRoomBuildingModel) && ((MeetingRoomBuildingModel) next).mo115772e()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo116014a() {
        for (int size = this.f81037b.size() - 1; size >= 0; size--) {
            ItemModel dVar = this.f81037b.get(size);
            Intrinsics.checkExpressionValueIsNotNull(dVar, "buildingItemModels[i]");
            ItemModel dVar2 = dVar;
            int i = size + 1;
            if (!(dVar2 instanceof MeetingRoomBuildingModel)) {
                Intrinsics.checkExpressionValueIsNotNull(this.f81037b.remove(size), "buildingItemModels.removeAt(i)");
            } else if (((MeetingRoomBuildingModel) dVar2).mo115772e() && i > 0 && i <= this.f81037b.size()) {
                this.f81037b.add(i, new LoadingDataModel());
            }
        }
        BuildingAdapter cVar = this.f81036a;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    public final void setPageIndex(int i) {
        this.f81041f = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuildingPageView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.calendar_building_page_view, (ViewGroup) this, true);
    }

    /* renamed from: b */
    public final void mo116019b(MeetingRoomBuildingModel hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "buildingModel");
        int g = hVar.mo115775g();
        if (g < this.f81037b.size() && g >= 0) {
            int i = 0;
            hVar.mo115765a(false);
            BuildingAdapter cVar = this.f81036a;
            if (cVar != null) {
                cVar.notifyItemChanged(g);
            }
            int i2 = g + 1;
            int size = this.f81037b.size();
            for (int i3 = i2; i3 < size && !(this.f81037b.get(i2) instanceof MeetingRoomBuildingModel); i3++) {
                this.f81037b.remove(i2);
                i++;
            }
            BuildingAdapter cVar2 = this.f81036a;
            if (cVar2 != null) {
                cVar2.notifyItemRangeRemoved(i2, i);
            }
            BuildingAdapter cVar3 = this.f81036a;
            if (cVar3 != null) {
                cVar3.notifyItemRangeChanged(i2, this.f81037b.size() - i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo116016a(MeetingRoomBuildingModel hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "buildingModel");
        int g = hVar.mo115775g() + 1;
        if (g <= this.f81037b.size() && g >= 0) {
            this.f81037b.add(g, new LoadingDataModel());
            BuildingAdapter cVar = this.f81036a;
            if (cVar != null) {
                cVar.notifyItemInserted(g);
            }
            BuildingAdapter cVar2 = this.f81036a;
            if (cVar2 != null) {
                cVar2.notifyItemRangeChanged(g, this.f81037b.size() - g);
            }
        }
    }

    /* renamed from: a */
    public final void mo116018a(HashMap<ItemModel, ArrayList<ItemModel>> hashMap) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(hashMap, "buildingMeetingRoomsMap");
        BuildingAdapter cVar = this.f81036a;
        if (cVar != null) {
            int i = 0;
            while (i < this.f81037b.size()) {
                ItemModel dVar = this.f81037b.get(i);
                Intrinsics.checkExpressionValueIsNotNull(dVar, "buildingItemModels[index]");
                ItemModel dVar2 = dVar;
                i++;
                if (dVar2 instanceof MeetingRoomBuildingModel) {
                    ArrayList<ItemModel> arrayList = hashMap.get(dVar2);
                    ArrayList<ItemModel> arrayList2 = arrayList;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        ((MeetingRoomBuildingModel) dVar2).mo115765a(true);
                        while (i < this.f81037b.size() && !(this.f81037b.get(i) instanceof MeetingRoomBuildingModel)) {
                            this.f81037b.remove(i);
                        }
                        this.f81037b.addAll(i, arrayList2);
                        i += arrayList.size();
                    }
                }
            }
            cVar.mo115214a(this.f81037b);
            cVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo116017a(ArrayList<ItemModel> arrayList, ArrayList<ItemModel> arrayList2) {
        Intrinsics.checkParameterIsNotNull(arrayList2, "buildingItemsData");
        this.f81037b.clear();
        if (arrayList != null) {
            this.f81037b.addAll(arrayList);
        }
        this.f81037b.addAll(arrayList2);
        for (T t : this.f81037b) {
            if (t instanceof MeetingRoomBuildingModel) {
                t.mo115762a(this.f81041f);
            }
        }
        BuildingAdapter cVar = this.f81036a;
        if (cVar == null) {
            this.f81036a = new BuildingAdapter(this.f81037b);
            RecyclerView recyclerView = (RecyclerView) mo116013a(R.id.buildingRecycleView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "buildingRecycleView");
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView2 = (RecyclerView) mo116013a(R.id.buildingRecycleView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "buildingRecycleView");
            recyclerView2.setAdapter(this.f81036a);
            BuildingAdapter cVar2 = this.f81036a;
            if (cVar2 != null) {
                cVar2.mo115210a(this.f81038c);
            }
            BuildingAdapter cVar3 = this.f81036a;
            if (cVar3 != null) {
                cVar3.mo115211a(this.f81039d);
            }
            BuildingAdapter cVar4 = this.f81036a;
            if (cVar4 != null) {
                cVar4.mo115208a(this.f81040e);
                return;
            }
            return;
        }
        if (cVar != null) {
            cVar.mo115214a(this.f81037b);
        }
        BuildingAdapter cVar5 = this.f81036a;
        if (cVar5 != null) {
            cVar5.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo116015a(MeetingRoomBuildingViewHolder.OnItemClickListener aVar, MeetingRoomViewHolder.OnItemClickListener aVar2, ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener aVar3) {
        this.f81038c = aVar;
        this.f81039d = aVar2;
        this.f81040e = aVar3;
    }
}
