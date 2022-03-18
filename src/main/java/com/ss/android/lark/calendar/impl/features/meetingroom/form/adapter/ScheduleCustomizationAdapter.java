package com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter.viewholder.CommonOptionVH;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter.viewholder.InputCustomizationVH;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter.viewholder.OptionLabelVH;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.data.ResourceFormUIData;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.listener.IOptionListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0014\u0010\u0019\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/ScheduleCustomizationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;)V", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "dataList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a */
public final class ScheduleCustomizationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private C1356d<ResourceFormUIData> f81991a = new C1356d<>(this, new C1374g.AbstractC1378c<ResourceFormUIData>() {
        /* class com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter.ScheduleCustomizationAdapter.C320731 */

        /* renamed from: a */
        public boolean areItemsTheSame(ResourceFormUIData resourceFormUIData, ResourceFormUIData resourceFormUIData2) {
            Intrinsics.checkParameterIsNotNull(resourceFormUIData, "oldItem");
            Intrinsics.checkParameterIsNotNull(resourceFormUIData2, "newItem");
            return C26247a.m94980a((AbstractC26248b) resourceFormUIData, (AbstractC26248b) resourceFormUIData2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(ResourceFormUIData resourceFormUIData, ResourceFormUIData resourceFormUIData2) {
            Intrinsics.checkParameterIsNotNull(resourceFormUIData, "oldItem");
            Intrinsics.checkParameterIsNotNull(resourceFormUIData2, "newItem");
            return C26247a.m94983b(resourceFormUIData, resourceFormUIData2);
        }

        /* renamed from: c */
        public Object getChangePayload(ResourceFormUIData resourceFormUIData, ResourceFormUIData resourceFormUIData2) {
            boolean z;
            Boolean bool;
            Intrinsics.checkParameterIsNotNull(resourceFormUIData, "oldItem");
            Intrinsics.checkParameterIsNotNull(resourceFormUIData2, "newItem");
            if (!resourceFormUIData.mo117123c() || !resourceFormUIData2.mo117123c()) {
                z = false;
            } else {
                z = true;
            }
            if (z && resourceFormUIData.mo117124c(resourceFormUIData2)) {
                SchemaExtraData.CustomizationOption g = resourceFormUIData.mo117129g();
                Boolean bool2 = null;
                if (g != null) {
                    bool = g.is_selected;
                } else {
                    bool = null;
                }
                SchemaExtraData.CustomizationOption g2 = resourceFormUIData2.mo117129g();
                if (g2 != null) {
                    bool2 = g2.is_selected;
                }
                if (!Intrinsics.areEqual(bool, bool2)) {
                    return true;
                }
            }
            return super.getChangePayload(resourceFormUIData, resourceFormUIData2);
        }
    });

    /* renamed from: b */
    private final IOptionListener f81992b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81991a.mo7374a().size();
    }

    /* renamed from: a */
    public final void mo117042a(List<ResourceFormUIData> list) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        this.f81991a.mo7376a(list);
    }

    public ScheduleCustomizationAdapter(IOptionListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f81992b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f81991a.mo7374a().get(i).mo117128f().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        ResourceFormUIData resourceFormUIData = this.f81991a.mo7374a().get(i);
        if (viewHolder instanceof OptionLabelVH) {
            Intrinsics.checkExpressionValueIsNotNull(resourceFormUIData, "itemData");
            ((OptionLabelVH) viewHolder).mo117061a(resourceFormUIData);
        } else if (viewHolder instanceof CommonOptionVH) {
            Intrinsics.checkExpressionValueIsNotNull(resourceFormUIData, "itemData");
            CommonOptionVH.m122003a((CommonOptionVH) viewHolder, resourceFormUIData, false, 2, null);
        } else if (viewHolder instanceof InputCustomizationVH) {
            Intrinsics.checkExpressionValueIsNotNull(resourceFormUIData, "itemData");
            ((InputCustomizationVH) viewHolder).mo117056a(resourceFormUIData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == ResourceFormUIData.FormType.OptionLabel.getValue()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mtroom_form_option_label, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new OptionLabelVH(inflate);
        } else if (i == ResourceFormUIData.FormType.MultipleOption.getValue() || i == ResourceFormUIData.FormType.SingleOption.getValue()) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mtroom_form_common_option_layout, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "itemView");
            return new CommonOptionVH(inflate2, this.f81992b);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mtroom_schedule_input, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "view");
            return new InputCustomizationVH(inflate3, this.f81992b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list, "payloads");
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        Object obj = list.get(0);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        if (Intrinsics.areEqual((Object) ((Boolean) obj), (Object) true) && (viewHolder instanceof CommonOptionVH)) {
            ResourceFormUIData resourceFormUIData = this.f81991a.mo7374a().get(i);
            Intrinsics.checkExpressionValueIsNotNull(resourceFormUIData, "itemData");
            ((CommonOptionVH) viewHolder).mo117047a(resourceFormUIData, false);
        }
    }
}
