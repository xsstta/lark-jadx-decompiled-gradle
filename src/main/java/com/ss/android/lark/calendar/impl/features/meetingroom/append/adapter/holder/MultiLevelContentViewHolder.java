package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelContentModel;
import com.ss.android.lark.calendar.impl.p1436a.C30072f;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMultiLevelBinding;", "(Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMultiLevelBinding;)V", "actionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "bindData", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MultiLevelContentModel;", "Companion", "IActionListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.g */
public final class MultiLevelContentViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final Companion f81802b = new Companion(null);

    /* renamed from: a */
    public IActionListener f81803a;

    /* renamed from: c */
    private final C30072f f81804c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "", "onArrowClick", "", "clickBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MultiLevelContentModel;", "onMultipleSelectClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.g$b */
    public interface IActionListener {
        /* renamed from: a */
        void mo116740a(MultiLevelContentModel fVar);

        /* renamed from: b */
        void mo116741b(MultiLevelContentModel fVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder;", "parent", "Landroid/view/ViewGroup;", "multiLevelContentAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MultiLevelContentViewHolder mo116739a(ViewGroup viewGroup, IActionListener bVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            C30072f a = C30072f.m111279a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(a, "ItemEventMultiLevelBindi…                   false)");
            MultiLevelContentViewHolder gVar = new MultiLevelContentViewHolder(a);
            gVar.f81803a = bVar;
            return gVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$bindData$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.g$c */
    public static final class View$OnClickListenerC31998c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiLevelContentViewHolder f81805a;

        /* renamed from: b */
        final /* synthetic */ MultiLevelContentModel f81806b;

        View$OnClickListenerC31998c(MultiLevelContentViewHolder gVar, MultiLevelContentModel fVar) {
            this.f81805a = gVar;
            this.f81806b = fVar;
        }

        public final void onClick(View view) {
            IActionListener bVar = this.f81805a.f81803a;
            if (bVar != null) {
                bVar.mo116740a(this.f81806b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.g$d */
    public static final class View$OnClickListenerC31999d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiLevelContentViewHolder f81807a;

        /* renamed from: b */
        final /* synthetic */ MultiLevelContentModel f81808b;

        View$OnClickListenerC31999d(MultiLevelContentViewHolder gVar, MultiLevelContentModel fVar) {
            this.f81807a = gVar;
            this.f81808b = fVar;
        }

        public final void onClick(View view) {
            IActionListener bVar = this.f81807a.f81803a;
            if (bVar != null) {
                bVar.mo116741b(this.f81808b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLevelContentViewHolder(C30072f fVar) {
        super(fVar.mo108418a());
        Intrinsics.checkParameterIsNotNull(fVar, "binding");
        this.f81804c = fVar;
    }

    /* renamed from: a */
    public final void mo116738a(MultiLevelContentModel fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "model");
        TextView textView = this.f81804c.f74964d;
        Intrinsics.checkExpressionValueIsNotNull(textView, "binding.tvMultiLevelName");
        textView.setText(fVar.mo116802b().mo115830f().name);
        this.f81804c.mo108418a().setOnClickListener(new View$OnClickListenerC31999d(this, fVar));
        ImageView imageView = this.f81804c.f74961a;
        ao.m125223a((View) imageView, 6, 6);
        imageView.setOnClickListener(new View$OnClickListenerC31998c(this, fVar));
        this.f81804c.f74963c.mo115963a(fVar.mo116802b().mo115823b());
        EditSelectStateView editSelectStateView = this.f81804c.f74963c;
        Intrinsics.checkExpressionValueIsNotNull(editSelectStateView, "binding.multipleSelectBt");
        editSelectStateView.setVisibility(0);
    }
}
