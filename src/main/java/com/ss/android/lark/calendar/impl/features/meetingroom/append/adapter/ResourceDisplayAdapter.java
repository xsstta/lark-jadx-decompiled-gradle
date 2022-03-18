package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1353b;
import androidx.recyclerview.widget.C1354c;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.BuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.LoadErrViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.LoadMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.LoadingViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelContentViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.NoneDataViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.TypeTitleViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BuildingModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.ChosenMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.LoadMoreModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelContentModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.TypeTitleModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00022\u0006\u0010.\u001a\u00020,H\u0016J\u0018\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020,H\u0016J\u0014\u00106\u001a\u0002002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001808R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006:"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "baseActionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "getBaseActionListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "setBaseActionListener", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;)V", "buildingAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "getBuildingAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "setBuildingAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;)V", "deleteResourceAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;", "getDeleteResourceAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;", "setDeleteResourceAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;)V", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "meetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "getMeetingRoomAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "setMeetingRoomAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;)V", "multiLevelContentAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "getMultiLevelContentAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "setMultiLevelContentAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;)V", "multiLevelMeetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "getMultiLevelMeetingRoomAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "setMultiLevelMeetingRoomAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "dataList", "", "IBaseActionListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a */
public final class ResourceDisplayAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private MeetingRoomViewHolder.IActionListener f81767a;

    /* renamed from: b */
    private BuildingViewHolder.IActionListener f81768b;

    /* renamed from: c */
    private MultiLevelMeetingRoomViewHolder.IActionListener f81769c;

    /* renamed from: d */
    private MultiLevelContentViewHolder.IActionListener f81770d;

    /* renamed from: e */
    private IBaseActionListener f81771e;

    /* renamed from: f */
    private ChosenMeetingRoomViewHolder.IChosenResourceAction f81772f;

    /* renamed from: g */
    private C1356d<BaseModel> f81773g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "", "onItemClicked", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a$a */
    public interface IBaseActionListener {
        /* renamed from: a */
        void mo116707a(BaseModel baseModel);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$diffCallback$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a$b */
    public static final class C31990b extends C1374g.AbstractC1378c<BaseModel> {
        C31990b() {
        }

        /* renamed from: a */
        public boolean areItemsTheSame(BaseModel baseModel, BaseModel baseModel2) {
            Intrinsics.checkParameterIsNotNull(baseModel, "oldItem");
            Intrinsics.checkParameterIsNotNull(baseModel2, "newItem");
            return C26247a.m94980a((AbstractC26248b) baseModel, (AbstractC26248b) baseModel2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(BaseModel baseModel, BaseModel baseModel2) {
            Intrinsics.checkParameterIsNotNull(baseModel, "oldItem");
            Intrinsics.checkParameterIsNotNull(baseModel2, "newItem");
            return C26247a.m94983b(baseModel, baseModel2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81773g.mo7374a().size();
    }

    public ResourceDisplayAdapter() {
        C1354c.C1355a aVar = new C1354c.C1355a(new C31990b());
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        C1354c a = aVar.mo7372a(coreThreadPool.getFixedThreadPool()).mo7373a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AsyncDifferConfig.Builde…ool)\n            .build()");
        this.f81773g = new C1356d<>(new C1353b(this), a);
    }

    /* renamed from: a */
    public final void mo116709a(IBaseActionListener aVar) {
        this.f81771e = aVar;
    }

    /* renamed from: a */
    public final void mo116710a(BuildingViewHolder.IActionListener bVar) {
        this.f81768b = bVar;
    }

    /* renamed from: a */
    public final void mo116711a(ChosenMeetingRoomViewHolder.IChosenResourceAction bVar) {
        this.f81772f = bVar;
    }

    /* renamed from: a */
    public final void mo116712a(MeetingRoomViewHolder.IActionListener bVar) {
        this.f81767a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f81773g.mo7374a().get(i).mo116760a();
    }

    /* renamed from: a */
    public final void mo116713a(List<? extends BaseModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        this.f81773g.mo7376a((List<BaseModel>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        BaseModel baseModel = this.f81773g.mo7374a().get(i);
        if ((viewHolder instanceof MeetingRoomViewHolder) && (baseModel instanceof MeetingRoomModel)) {
            ((MeetingRoomViewHolder) viewHolder).mo116734a((MeetingRoomModel) baseModel);
        } else if ((viewHolder instanceof BuildingViewHolder) && (baseModel instanceof BuildingModel)) {
            ((BuildingViewHolder) viewHolder).mo116718a((BuildingModel) baseModel);
        } else if ((viewHolder instanceof MultiLevelMeetingRoomViewHolder) && (baseModel instanceof MultiLevelMeetingRoomModel)) {
            ((MultiLevelMeetingRoomViewHolder) viewHolder).mo116746a((MultiLevelMeetingRoomModel) baseModel);
        } else if ((viewHolder instanceof MultiLevelContentViewHolder) && (baseModel instanceof MultiLevelContentModel)) {
            ((MultiLevelContentViewHolder) viewHolder).mo116738a((MultiLevelContentModel) baseModel);
        } else if ((viewHolder instanceof LoadMoreViewHolder) && (baseModel instanceof LoadMoreModel)) {
            ((LoadMoreViewHolder) viewHolder).mo116728a(baseModel);
        } else if ((viewHolder instanceof TypeTitleViewHolder) && (baseModel instanceof TypeTitleModel)) {
            ((TypeTitleViewHolder) viewHolder).mo116753a((TypeTitleModel) baseModel);
        } else if ((viewHolder instanceof ChosenMeetingRoomViewHolder) && (baseModel instanceof ChosenMeetingRoomModel)) {
            ((ChosenMeetingRoomViewHolder) viewHolder).mo116724a((ChosenMeetingRoomModel) baseModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        switch (i) {
            case 0:
                return MeetingRoomViewHolder.f81795a.mo116735a(viewGroup, this.f81767a);
            case 1:
                return BuildingViewHolder.f81774a.mo116719a(viewGroup, this.f81768b);
            case 2:
                return ChosenMeetingRoomViewHolder.f81783a.mo116725a(viewGroup);
            case 3:
            default:
                return TypeTitleViewHolder.f81817a.mo116754a(viewGroup);
            case 4:
                return LoadingViewHolder.f81794a.mo116731a(viewGroup);
            case 5:
                return LoadErrViewHolder.f81788a.mo116727a(viewGroup);
            case 6:
                return NoneDataViewHolder.f81816a.mo116752a(viewGroup);
            case 7:
                return MultiLevelMeetingRoomViewHolder.f81809a.mo116747a(viewGroup, this.f81769c);
            case 8:
                return MultiLevelContentViewHolder.f81802b.mo116739a(viewGroup, this.f81770d);
            case 9:
                return LoadMoreViewHolder.f81789b.mo116729a(viewGroup, this.f81771e);
        }
    }
}
