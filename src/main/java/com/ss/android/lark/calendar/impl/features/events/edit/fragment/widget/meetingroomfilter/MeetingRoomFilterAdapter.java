package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.filter.SearchFilterView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0014\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomFilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomFilterAdapter$MeetingRoomFilterViewHolder;", "()V", "mData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomFilterData;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "handlePlaceHolder", "", "holder", "position", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/util/SparseArray;", "MeetingRoomFilterViewHolder", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.d */
public final class MeetingRoomFilterAdapter extends RecyclerView.Adapter<MeetingRoomFilterViewHolder> {

    /* renamed from: a */
    private final ArrayList<MeetingRoomFilterData> f81097a = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomFilterAdapter$MeetingRoomFilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "endPlaceholder", "getEndPlaceholder", "()Landroid/view/View;", "setEndPlaceholder", "searchFilterView", "Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterView;", "getSearchFilterView", "()Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterView;", "setSearchFilterView", "(Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterView;)V", "startPlaceholder", "getStartPlaceholder", "setStartPlaceholder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.d$a */
    public static final class MeetingRoomFilterViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private SearchFilterView f81098a;

        /* renamed from: b */
        private View f81099b;

        /* renamed from: c */
        private View f81100c;

        /* renamed from: a */
        public final SearchFilterView mo116080a() {
            return this.f81098a;
        }

        /* renamed from: b */
        public final View mo116081b() {
            return this.f81099b;
        }

        /* renamed from: c */
        public final View mo116082c() {
            return this.f81100c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MeetingRoomFilterViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            SearchFilterView searchFilterView = (SearchFilterView) view.findViewById(R.id.searchFilterView);
            Intrinsics.checkExpressionValueIsNotNull(searchFilterView, "rootView.searchFilterView");
            this.f81098a = searchFilterView;
            View findViewById = view.findViewById(R.id.startPlaceholder);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.startPlaceholder");
            this.f81099b = findViewById;
            View findViewById2 = view.findViewById(R.id.endPlaceholder);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.endPlaceholder");
            this.f81100c = findViewById2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81097a.size();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.d$b */
    public static final class View$OnClickListenerC31838b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFilterData f81101a;

        View$OnClickListenerC31838b(MeetingRoomFilterData eVar) {
            this.f81101a = eVar;
        }

        public final void onClick(View view) {
            this.f81101a.mo116090d().invoke();
        }
    }

    /* renamed from: a */
    public final void mo116078a(SparseArray<MeetingRoomFilterData> sparseArray) {
        Intrinsics.checkParameterIsNotNull(sparseArray, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f81097a.clear();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            this.f81097a.add(sparseArray.valueAt(i));
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public MeetingRoomFilterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_meeting_room_search_filter, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new MeetingRoomFilterViewHolder(inflate);
    }

    /* renamed from: b */
    private final void m120844b(MeetingRoomFilterViewHolder aVar, int i) {
        if (i == 0) {
            aVar.mo116081b().setVisibility(0);
            aVar.mo116082c().setVisibility(8);
        } else if (i == getItemCount() - 1) {
            aVar.mo116081b().setVisibility(8);
            aVar.mo116082c().setVisibility(0);
        } else {
            aVar.mo116081b().setVisibility(8);
            aVar.mo116082c().setVisibility(8);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(MeetingRoomFilterViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        MeetingRoomFilterData eVar = this.f81097a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(eVar, "mData[position]");
        MeetingRoomFilterData eVar2 = eVar;
        aVar.mo116080a().setOnClickListener(new View$OnClickListenerC31838b(eVar2));
        if (eVar2.mo116089c()) {
            aVar.mo116080a().mo118189a(eVar2.mo116088b(), (List<Bitmap>) null);
        } else {
            aVar.mo116080a().setUnSelectedText(eVar2.mo116088b());
        }
        aVar.mo116080a().setLogoIcon(eVar2.mo116084a());
        m120844b(aVar, i);
    }
}
