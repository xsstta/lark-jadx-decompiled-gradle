package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.NoneDataModel;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/NoneDataViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/NoneDataModel;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "searchFilterFG", "", "setUpView", "", "model", "position", "", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.m */
public final class NoneDataViewHolder extends BaseViewHolder<NoneDataModel> {

    /* renamed from: a */
    private final boolean f80714a = C30022a.f74883b.mo112706n();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoneDataViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo115682a(NoneDataModel lVar, int i, BuildingAdapter cVar) {
        View a;
        Intrinsics.checkParameterIsNotNull(lVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "adapter");
        if (!this.f80714a && (a = mo115681a(R.id.split_line)) != null) {
            a.setVisibility(8);
        }
    }
}
