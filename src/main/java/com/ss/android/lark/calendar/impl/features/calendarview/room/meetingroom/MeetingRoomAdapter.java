package com.ss.android.lark.calendar.impl.features.calendarview.room.meetingroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneRoomInstance;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneRoomItemData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomViewData;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomAdapter$ItemClickListener;", "getItemClickListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomAdapter$ItemClickListener;", "setItemClickListener", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomAdapter$ItemClickListener;)V", "meetingRoomData", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData;", "getMeetingRoomData", "()Ljava/util/List;", "meetingRoomData$delegate", "Lkotlin/Lazy;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshInstanceData", "instanceViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewData;", "refreshRoomData", "roomData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomViewData;", "Companion", "ItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.b.a */
public final class MeetingRoomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final Companion f78156a = new Companion(null);

    /* renamed from: b */
    private ItemClickListener f78157b;

    /* renamed from: c */
    private final Lazy f78158c = LazyKt.lazy(C31010c.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomAdapter$ItemClickListener;", "", "onClickItem", "", "roomData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.b.a$b */
    public interface ItemClickListener {
        /* renamed from: a */
        void mo112239a(OneRoomItemData kVar);
    }

    /* renamed from: b */
    private final List<OneRoomItemData> m115676b() {
        return (List) this.f78158c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomAdapter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final ItemClickListener mo112235a() {
        return this.f78157b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.b.a$c */
    static final class C31010c extends Lambda implements Function0<List<OneRoomItemData>> {
        public static final C31010c INSTANCE = new C31010c();

        C31010c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<OneRoomItemData> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return m115676b().size();
    }

    /* renamed from: a */
    public final void mo112236a(ItemClickListener bVar) {
        this.f78157b = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.b.a$d */
    static final class View$OnClickListenerC31011d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomAdapter f78159a;

        /* renamed from: b */
        final /* synthetic */ OneRoomItemData f78160b;

        View$OnClickListenerC31011d(MeetingRoomAdapter aVar, OneRoomItemData kVar) {
            this.f78159a = aVar;
            this.f78160b = kVar;
        }

        public final void onClick(View view) {
            ItemClickListener a = this.f78159a.mo112235a();
            if (a != null) {
                a.mo112239a(this.f78160b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return m115676b().get(i).mo112413h();
    }

    /* renamed from: a */
    public final void mo112238a(RoomViewData oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "roomData");
        m115676b().clear();
        m115676b().addAll(oVar.mo112427b());
        m115676b().add(OneRoomItemData.f78285a.mo112418a());
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo112237a(RoomInstanceViewData mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "instanceViewData");
        List<OneRoomInstance> c = mVar.mo112422c();
        if (!c.isEmpty()) {
            int b = mVar.mo112421b().mo112363b();
            int c2 = mVar.mo112421b().mo112364c();
            if (b <= c2) {
                int i = b;
                while (true) {
                    if (i >= 0 && i < m115676b().size()) {
                        int i2 = i - b;
                        if (i2 >= 0 && i2 < c.size()) {
                            String b2 = m115676b().get(i).mo112406b();
                            OneRoomInstance jVar = c.get(i2);
                            if (!Intrinsics.areEqual(jVar.mo112396a(), b2)) {
                                Log.m165383e("MeetingRoomAdapter", C32673y.m125378d("not match"));
                            } else {
                                m115676b().get(i).mo112403a(jVar.mo112397b());
                                m115676b().get(i).mo112405a(jVar.mo112398c());
                            }
                        }
                    }
                    if (i == c2) {
                        break;
                    }
                    i++;
                }
            }
            notifyItemRangeChanged(b, c.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        OneRoomItemData kVar = m115676b().get(i);
        if (viewHolder instanceof MeetingRoomViewHolder) {
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC31011d(this, kVar));
            ((MeetingRoomViewHolder) viewHolder).mo112241a(kVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        if (i == 0) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.calendar_view_room_placeholder_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new PlaceholderViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.calendar_view_meeting_room_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
        return new MeetingRoomViewHolder(inflate2);
    }
}
