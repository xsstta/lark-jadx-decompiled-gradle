package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BuildingModel;
import com.ss.android.lark.calendar.impl.p1436a.C30069c;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomBuildingBinding;", "(Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomBuildingBinding;)V", "actionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "getActionListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "setActionListener", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;)V", "bindData", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BuildingModel;", "Companion", "IActionListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.a */
public final class BuildingViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f81774a = new Companion(null);

    /* renamed from: b */
    private IActionListener f81775b;

    /* renamed from: c */
    private final C30069c f81776c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "", "onItemClick", "", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BuildingModel;", "isValidPage", "", "onMultiSelectExpandIconClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.a$b */
    public interface IActionListener {
        /* renamed from: a */
        void mo116702a(BuildingModel aVar, boolean z);

        /* renamed from: b */
        void mo116703b(BuildingModel aVar, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder;", "parent", "Landroid/view/ViewGroup;", "buildingAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BuildingViewHolder mo116719a(ViewGroup viewGroup, IActionListener bVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            C30069c a = C30069c.m111270a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(a, "ItemEventMeetingRoomBuil….context), parent, false)");
            BuildingViewHolder aVar = new BuildingViewHolder(a);
            aVar.mo116717a(bVar);
            return aVar;
        }
    }

    /* renamed from: a */
    public final IActionListener mo116716a() {
        return this.f81775b;
    }

    /* renamed from: a */
    public final void mo116717a(IActionListener bVar) {
        this.f81775b = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.a$c */
    public static final class View$OnClickListenerC31991c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingViewHolder f81777a;

        /* renamed from: b */
        final /* synthetic */ BuildingModel f81778b;

        View$OnClickListenerC31991c(BuildingViewHolder aVar, BuildingModel aVar2) {
            this.f81777a = aVar;
            this.f81778b = aVar2;
        }

        public final void onClick(View view) {
            boolean z;
            IActionListener a = this.f81777a.mo116716a();
            if (a != null) {
                BuildingModel aVar = this.f81778b;
                if (aVar.mo116784f() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                a.mo116702a(aVar, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.a$d */
    public static final class View$OnClickListenerC31992d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingViewHolder f81779a;

        /* renamed from: b */
        final /* synthetic */ BuildingModel f81780b;

        View$OnClickListenerC31992d(BuildingViewHolder aVar, BuildingModel aVar2) {
            this.f81779a = aVar;
            this.f81780b = aVar2;
        }

        public final void onClick(View view) {
            boolean z;
            IActionListener a = this.f81779a.mo116716a();
            if (a != null) {
                BuildingModel aVar = this.f81780b;
                if (aVar.mo116784f() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                a.mo116703b(aVar, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.a$e */
    public static final class View$OnClickListenerC31993e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingViewHolder f81781a;

        /* renamed from: b */
        final /* synthetic */ BuildingModel f81782b;

        View$OnClickListenerC31993e(BuildingViewHolder aVar, BuildingModel aVar2) {
            this.f81781a = aVar;
            this.f81782b = aVar2;
        }

        public final void onClick(View view) {
            boolean z;
            IActionListener a = this.f81781a.mo116716a();
            if (a != null) {
                BuildingModel aVar = this.f81782b;
                if (aVar.mo116784f() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                a.mo116702a(aVar, z);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuildingViewHolder(C30069c cVar) {
        super(cVar.mo108415a());
        Intrinsics.checkParameterIsNotNull(cVar, "binding");
        this.f81776c = cVar;
    }

    /* renamed from: a */
    public final void mo116718a(BuildingModel aVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        TextView textView = this.f81776c.f74950e;
        Intrinsics.checkExpressionValueIsNotNull(textView, "binding.tvBuildingName");
        textView.setText(aVar.mo116778b());
        ImageView imageView = this.f81776c.f74947b;
        if (aVar.mo116785g()) {
            i = R.drawable.ud_icon_up_outlined;
        } else {
            i = R.drawable.ud_icon_down_outlined;
        }
        Drawable d = C32634ae.m125184d(i);
        d.setTint(C32634ae.m125178a(R.color.icon_n3));
        imageView.setImageDrawable(d);
        this.f81776c.mo108415a().setOnClickListener(new View$OnClickListenerC31991c(this, aVar));
        EditSelectStateView editSelectStateView = this.f81776c.f74949d;
        Intrinsics.checkExpressionValueIsNotNull(editSelectStateView, "binding.multipleSelectBt");
        an.m125213a(editSelectStateView, aVar.mo116781d());
        if (aVar.mo116781d()) {
            this.f81776c.f74947b.setOnClickListener(new View$OnClickListenerC31992d(this, aVar));
            ao.m125223a((View) this.f81776c.f74947b, 6, 6);
            this.f81776c.f74949d.mo115963a(aVar.mo116786h());
            return;
        }
        this.f81776c.f74947b.setOnClickListener(new View$OnClickListenerC31993e(this, aVar));
        ao.m125222a(this.f81776c.f74947b);
    }
}
