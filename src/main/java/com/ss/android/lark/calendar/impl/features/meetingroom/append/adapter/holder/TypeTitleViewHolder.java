package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.TypeTitleModel;
import com.ss.android.lark.calendar.impl.p1436a.C30071e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/TypeTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomTitleBinding;", "(Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomTitleBinding;)V", "bindData", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/TypeTitleModel;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.j */
public final class TypeTitleViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f81817a = new Companion(null);

    /* renamed from: b */
    private final C30071e f81818b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/TypeTitleViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/TypeTitleViewHolder;", "parent", "Landroid/view/ViewGroup;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TypeTitleViewHolder mo116754a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            C30071e a = C30071e.m111276a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(a, "ItemEventMeetingRoomTitl….context), parent, false)");
            return new TypeTitleViewHolder(a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeTitleViewHolder(C30071e eVar) {
        super(eVar.mo108417a());
        Intrinsics.checkParameterIsNotNull(eVar, "binding");
        this.f81818b = eVar;
    }

    /* renamed from: a */
    public final void mo116753a(TypeTitleModel iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "model");
        this.f81818b.f74958a.setImageResource(iVar.mo116815b());
        TextView textView = this.f81818b.f74959b;
        Intrinsics.checkExpressionValueIsNotNull(textView, "binding.meetingRoomTypeTitle");
        textView.setText(iVar.mo116817c());
    }
}
