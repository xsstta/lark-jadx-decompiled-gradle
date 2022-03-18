package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.p1436a.C30074h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/LoadMoreViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/ItemMeetingRoomLoadMoreBinding;", "(Lcom/ss/android/lark/calendar/impl/databinding/ItemMeetingRoomLoadMoreBinding;)V", "actionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "getBinding", "()Lcom/ss/android/lark/calendar/impl/databinding/ItemMeetingRoomLoadMoreBinding;", "bindData", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.d */
public final class LoadMoreViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final Companion f81789b = new Companion(null);

    /* renamed from: a */
    public ResourceDisplayAdapter.IBaseActionListener f81790a;

    /* renamed from: c */
    private final C30074h f81791c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/LoadMoreViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/LoadMoreViewHolder;", "parent", "Landroid/view/ViewGroup;", "actionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LoadMoreViewHolder mo116729a(ViewGroup viewGroup, ResourceDisplayAdapter.IBaseActionListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            C30074h a = C30074h.m111285a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(a, "ItemMeetingRoomLoadMoreB…                   false)");
            LoadMoreViewHolder dVar = new LoadMoreViewHolder(a);
            dVar.f81790a = aVar;
            return dVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.d$b */
    public static final class View$OnClickListenerC31995b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoadMoreViewHolder f81792a;

        /* renamed from: b */
        final /* synthetic */ BaseModel f81793b;

        View$OnClickListenerC31995b(LoadMoreViewHolder dVar, BaseModel baseModel) {
            this.f81792a = dVar;
            this.f81793b = baseModel;
        }

        public final void onClick(View view) {
            ResourceDisplayAdapter.IBaseActionListener aVar = this.f81792a.f81790a;
            if (aVar != null) {
                aVar.mo116707a(this.f81793b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadMoreViewHolder(C30074h hVar) {
        super(hVar.mo108420a());
        Intrinsics.checkParameterIsNotNull(hVar, "binding");
        this.f81791c = hVar;
    }

    /* renamed from: a */
    public final void mo116728a(BaseModel baseModel) {
        Intrinsics.checkParameterIsNotNull(baseModel, "model");
        this.f81791c.mo108420a().setOnClickListener(new View$OnClickListenerC31995b(this, baseModel));
    }
}
