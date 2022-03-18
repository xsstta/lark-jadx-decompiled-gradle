package com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter;

import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneRoomFilterViewData;
import com.ss.android.lark.calendar.impl.features.search.filter.SearchFilterView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "endPlaceholder", "getEndPlaceholder", "()Landroid/view/View;", "setEndPlaceholder", "searchFilterView", "Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterView;", "getSearchFilterView", "()Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterView;", "setSearchFilterView", "(Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterView;)V", "startPlaceholder", "getStartPlaceholder", "setStartPlaceholder", "bind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomFilterViewData;", "isBegin", "", "isEnd", "handlePlaceHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.e */
public final class RoomFilterViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private SearchFilterView f78210a;

    /* renamed from: b */
    private View f78211b;

    /* renamed from: c */
    private View f78212c;

    /* renamed from: a */
    public final SearchFilterView mo112317a() {
        return this.f78210a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomFilterViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        SearchFilterView searchFilterView = (SearchFilterView) view.findViewById(R.id.searchFilterView);
        Intrinsics.checkExpressionValueIsNotNull(searchFilterView, "rootView.searchFilterView");
        this.f78210a = searchFilterView;
        View findViewById = view.findViewById(R.id.startPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.startPlaceholder");
        this.f78211b = findViewById;
        View findViewById2 = view.findViewById(R.id.endPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.endPlaceholder");
        this.f78212c = findViewById2;
    }

    /* renamed from: a */
    private final void m115758a(boolean z, boolean z2) {
        if (z) {
            this.f78211b.setVisibility(0);
            this.f78212c.setVisibility(8);
        } else if (z2) {
            this.f78211b.setVisibility(8);
            this.f78212c.setVisibility(0);
        } else {
            this.f78211b.setVisibility(8);
            this.f78212c.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo112318a(OneRoomFilterViewData iVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(iVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (iVar.mo112395d()) {
            this.f78210a.mo118189a(iVar.mo112394c(), (List<Bitmap>) null);
        } else {
            this.f78210a.setUnSelectedText(iVar.mo112394c());
        }
        this.f78210a.setLogoIcon(iVar.mo112393b());
        m115758a(z, z2);
    }
}
