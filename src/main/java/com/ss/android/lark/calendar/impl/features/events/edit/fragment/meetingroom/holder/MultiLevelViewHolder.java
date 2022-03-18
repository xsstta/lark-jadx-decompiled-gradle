package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiLevelModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mOnItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "setOnItemClickListener", "", "onItemClickListener", "setUpView", "model", "position", "", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.k */
public final class MultiLevelViewHolder extends BaseViewHolder<MultiLevelModel> {

    /* renamed from: a */
    public OnItemClickListener f80703a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "", "onArrowClick", "", "clickBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "onMultipleSelectClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.k$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo112231a(MultiLevelModel jVar);

        /* renamed from: b */
        void mo112232b(MultiLevelModel jVar);
    }

    /* renamed from: a */
    public final void mo115711a(OnItemClickListener aVar) {
        this.f80703a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.k$b */
    public static final class View$OnClickListenerC31753b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiLevelViewHolder f80704a;

        /* renamed from: b */
        final /* synthetic */ MultiLevelModel f80705b;

        View$OnClickListenerC31753b(MultiLevelViewHolder kVar, MultiLevelModel jVar) {
            this.f80704a = kVar;
            this.f80705b = jVar;
        }

        public final void onClick(View view) {
            OnItemClickListener aVar = this.f80704a.f80703a;
            if (aVar != null) {
                aVar.mo112232b(this.f80705b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.k$c */
    public static final class View$OnClickListenerC31754c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiLevelViewHolder f80706a;

        /* renamed from: b */
        final /* synthetic */ MultiLevelModel f80707b;

        View$OnClickListenerC31754c(MultiLevelViewHolder kVar, MultiLevelModel jVar) {
            this.f80706a = kVar;
            this.f80707b = jVar;
        }

        public final void onClick(View view) {
            OnItemClickListener aVar = this.f80706a.f80703a;
            if (aVar != null) {
                aVar.mo112231a(this.f80707b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLevelViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo115682a(MultiLevelModel jVar, int i, BuildingAdapter cVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "adapter");
        jVar.mo115798a(i);
        TextView textView = (TextView) mo115681a(R.id.tv_multi_level_name);
        View a = mo115681a(R.id.multipleSelectBt);
        if (!(a instanceof EditSelectStateView)) {
            a = null;
        }
        EditSelectStateView editSelectStateView = (EditSelectStateView) a;
        if (textView != null) {
            textView.setText(jVar.mo115797a().mo115830f().name);
        }
        ViewGroup viewGroup = (ViewGroup) mo115681a(R.id.multi_level_item_container);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View$OnClickListenerC31753b(this, jVar));
        }
        ImageView imageView = (ImageView) mo115681a(R.id.enter_next_level_arrow);
        ao.m125223a((View) imageView, 6, 6);
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC31754c(this, jVar));
        }
        if (editSelectStateView != null) {
            editSelectStateView.mo115963a(jVar.mo115797a().mo115823b());
        }
        if (editSelectStateView != null) {
            editSelectStateView.setVisibility(0);
        }
    }
}
