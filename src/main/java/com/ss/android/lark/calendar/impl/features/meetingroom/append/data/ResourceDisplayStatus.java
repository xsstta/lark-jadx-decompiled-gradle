package com.ss.android.lark.calendar.impl.features.meetingroom.append.data;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "", "()V", "BuildingDisplayStatus", "LoadErrStatusData", "LoadingStatusData", "MultiLevelDisplayStatus", "SearchResultDisplayStatus", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$LoadingStatusData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$LoadErrStatusData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$BuildingDisplayStatus;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$MultiLevelDisplayStatus;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$SearchResultDisplayStatus;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.d */
public abstract class ResourceDisplayStatus {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$BuildingDisplayStatus;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "selectMode", "", "selectResourceSize", "buildingResourceViewData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/BuildingResourceViewData;", "(IILcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/BuildingResourceViewData;)V", "getBuildingResourceViewData", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/BuildingResourceViewData;", "getSelectMode", "()I", "getSelectResourceSize", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.d$a */
    public static final class BuildingDisplayStatus extends ResourceDisplayStatus {

        /* renamed from: a */
        private final int f81860a;

        /* renamed from: b */
        private final int f81861b;

        /* renamed from: c */
        private final BuildingResourceViewData f81862c;

        /* renamed from: a */
        public final int mo116896a() {
            return this.f81860a;
        }

        /* renamed from: b */
        public final int mo116897b() {
            return this.f81861b;
        }

        /* renamed from: c */
        public final BuildingResourceViewData mo116898c() {
            return this.f81862c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BuildingDisplayStatus(int i, int i2, BuildingResourceViewData cVar) {
            super(null);
            Intrinsics.checkParameterIsNotNull(cVar, "buildingResourceViewData");
            this.f81860a = i;
            this.f81861b = i2;
            this.f81862c = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BG\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$MultiLevelDisplayStatus;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "itemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "Lkotlin/collections/ArrayList;", "breadItem", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "selectResourceSize", "", "selectAllState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;ILcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;)V", "getBreadItem", "()Ljava/util/ArrayList;", "getItemList", "getSelectAllState", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "getSelectResourceSize", "()I", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.d$d */
    public static final class MultiLevelDisplayStatus extends ResourceDisplayStatus {

        /* renamed from: a */
        private final ArrayList<BaseModel> f81865a;

        /* renamed from: b */
        private final ArrayList<MultiLevelNode> f81866b;

        /* renamed from: c */
        private final int f81867c;

        /* renamed from: d */
        private final IBuildingContract.SelectState f81868d;

        /* renamed from: a */
        public final ArrayList<BaseModel> mo116899a() {
            return this.f81865a;
        }

        /* renamed from: b */
        public final ArrayList<MultiLevelNode> mo116900b() {
            return this.f81866b;
        }

        /* renamed from: c */
        public final int mo116901c() {
            return this.f81867c;
        }

        /* renamed from: d */
        public final IBuildingContract.SelectState mo116902d() {
            return this.f81868d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiLevelDisplayStatus(ArrayList<BaseModel> arrayList, ArrayList<MultiLevelNode> arrayList2, int i, IBuildingContract.SelectState selectState) {
            super(null);
            Intrinsics.checkParameterIsNotNull(arrayList, "itemList");
            Intrinsics.checkParameterIsNotNull(arrayList2, "breadItem");
            Intrinsics.checkParameterIsNotNull(selectState, "selectAllState");
            this.f81865a = arrayList;
            this.f81866b = arrayList2;
            this.f81867c = i;
            this.f81868d = selectState;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$SearchResultDisplayStatus;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "searchFreeItemModelList", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "searchItemModelList", "(Ljava/util/List;Ljava/util/List;)V", "getSearchFreeItemModelList", "()Ljava/util/List;", "getSearchItemModelList", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.d$e */
    public static final class SearchResultDisplayStatus extends ResourceDisplayStatus {

        /* renamed from: a */
        private final List<BaseModel> f81869a;

        /* renamed from: b */
        private final List<BaseModel> f81870b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchResultDisplayStatus)) {
                return false;
            }
            SearchResultDisplayStatus eVar = (SearchResultDisplayStatus) obj;
            return Intrinsics.areEqual(this.f81869a, eVar.f81869a) && Intrinsics.areEqual(this.f81870b, eVar.f81870b);
        }

        public int hashCode() {
            List<BaseModel> list = this.f81869a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<BaseModel> list2 = this.f81870b;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "SearchResultDisplayStatus(searchFreeItemModelList=" + this.f81869a + ", searchItemModelList=" + this.f81870b + ")";
        }

        /* renamed from: a */
        public final List<BaseModel> mo116903a() {
            return this.f81869a;
        }

        /* renamed from: b */
        public final List<BaseModel> mo116904b() {
            return this.f81870b;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SearchResultDisplayStatus(List<? extends BaseModel> list, List<? extends BaseModel> list2) {
            super(null);
            Intrinsics.checkParameterIsNotNull(list, "searchFreeItemModelList");
            Intrinsics.checkParameterIsNotNull(list2, "searchItemModelList");
            this.f81869a = list;
            this.f81870b = list2;
        }
    }

    private ResourceDisplayStatus() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$LoadErrStatusData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "()V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.d$b */
    public static final class LoadErrStatusData extends ResourceDisplayStatus {

        /* renamed from: a */
        public static final LoadErrStatusData f81863a = new LoadErrStatusData();

        private LoadErrStatusData() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$LoadingStatusData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "()V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.d$c */
    public static final class LoadingStatusData extends ResourceDisplayStatus {

        /* renamed from: a */
        public static final LoadingStatusData f81864a = new LoadingStatusData();

        private LoadingStatusData() {
            super(null);
        }
    }

    public /* synthetic */ ResourceDisplayStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
