package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0004J%\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mViews", "Landroid/util/SparseArray;", "findView", "resId", "", "setUpView", "", "model", "position", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "(Ljava/lang/Object;ILcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.a */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final SparseArray<View> f80677a = new SparseArray<>();

    /* renamed from: b */
    private final View f80678b;

    /* renamed from: a */
    public abstract void mo115682a(T t, int i, BuildingAdapter cVar);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "mItemView");
        this.f80678b = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo115681a(int i) {
        View view = this.f80677a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f80678b.findViewById(i);
        this.f80677a.put(i, findViewById);
        return findViewById;
    }
}
