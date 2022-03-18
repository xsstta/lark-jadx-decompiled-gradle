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
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32065c;
import com.ss.android.lark.calendar.impl.p1436a.C30073g;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMultiMeetingRoomBinding;", "(Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMultiMeetingRoomBinding;)V", "actionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "getActionListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "setActionListener", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;)V", "bindData", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MultiLevelMeetingRoomModel;", "refreshInvalidItem", "refreshValidItem", "updateMeetingInfo", "meetingRoomInfoIv", "Landroid/view/View;", "Companion", "IActionListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.h */
public final class MultiLevelMeetingRoomViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f81809a = new Companion(null);

    /* renamed from: b */
    private IActionListener f81810b;

    /* renamed from: c */
    private final C30073g f81811c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "", "onItemClick", "", "roomModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MultiLevelMeetingRoomModel;", "onMeetingRoomInfoClicked", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.h$b */
    public interface IActionListener {
        /* renamed from: a */
        void mo116748a(MultiLevelMeetingRoomModel gVar);

        /* renamed from: a */
        void mo116749a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$Companion;", "", "()V", "MEETING_ROOM_INFO_EXPAND_DP", "", "create", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder;", "parent", "Landroid/view/ViewGroup;", "multiLevelMeetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MultiLevelMeetingRoomViewHolder mo116747a(ViewGroup viewGroup, IActionListener bVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            C30073g a = C30073g.m111282a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(a, "ItemEventMultiMeetingRoo….context), parent, false)");
            MultiLevelMeetingRoomViewHolder hVar = new MultiLevelMeetingRoomViewHolder(a);
            hVar.mo116745a(bVar);
            return hVar;
        }
    }

    /* renamed from: a */
    public final IActionListener mo116744a() {
        return this.f81810b;
    }

    /* renamed from: b */
    private final void m121748b() {
        ImageView imageView = this.f81811c.f74967b;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "binding.ivMeetingIcon");
        Drawable d = C32634ae.m125184d(R.drawable.ud_icon_room_outlined);
        d.setTint(C32634ae.m125178a(R.color.icon_n3));
        imageView.setBackground(d);
        this.f81811c.f74977l.setTextColor(C32634ae.m125178a(R.color.text_title));
        ImageView imageView2 = this.f81811c.f74968c;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "binding.ivMeetingRoomCapacity");
        Drawable d2 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
        d2.setTint(C32634ae.m125178a(R.color.icon_n3));
        imageView2.setBackground(d2);
        this.f81811c.f74975j.setTextColor(C32634ae.m125178a(R.color.text_caption));
        this.f81811c.f74976k.setTextColor(C32634ae.m125178a(R.color.text_caption));
        this.f81811c.f74966a.setBackgroundColor(C32634ae.m125178a(R.color.text_caption));
    }

    /* renamed from: c */
    private final void m121749c() {
        ImageView imageView = this.f81811c.f74967b;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "binding.ivMeetingIcon");
        Drawable d = C32634ae.m125184d(R.drawable.ud_icon_room_unavailable_outlined);
        d.setTint(C32634ae.m125178a(R.color.icon_disable));
        imageView.setBackground(d);
        this.f81811c.f74977l.setTextColor(C32634ae.m125178a(R.color.text_disable));
        ImageView imageView2 = this.f81811c.f74968c;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "binding.ivMeetingRoomCapacity");
        Drawable d2 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
        d2.setTint(C32634ae.m125178a(R.color.icon_disable));
        imageView2.setBackground(d2);
        this.f81811c.f74975j.setTextColor(C32634ae.m125178a(R.color.text_disable));
        this.f81811c.f74976k.setTextColor(C32634ae.m125178a(R.color.text_disable));
        this.f81811c.f74966a.setBackgroundColor(C32634ae.m125178a(R.color.text_disable));
    }

    /* renamed from: a */
    public final void mo116745a(IActionListener bVar) {
        this.f81810b = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.h$c */
    public static final class View$OnClickListenerC32000c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiLevelMeetingRoomViewHolder f81812a;

        /* renamed from: b */
        final /* synthetic */ MultiLevelMeetingRoomModel f81813b;

        View$OnClickListenerC32000c(MultiLevelMeetingRoomViewHolder hVar, MultiLevelMeetingRoomModel gVar) {
            this.f81812a = hVar;
            this.f81813b = gVar;
        }

        public final void onClick(View view) {
            IActionListener a = this.f81812a.mo116744a();
            if (a != null) {
                a.mo116748a(this.f81813b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.h$d */
    public static final class View$OnClickListenerC32001d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiLevelMeetingRoomViewHolder f81814a;

        /* renamed from: b */
        final /* synthetic */ MultiLevelMeetingRoomModel f81815b;

        View$OnClickListenerC32001d(MultiLevelMeetingRoomViewHolder hVar, MultiLevelMeetingRoomModel gVar) {
            this.f81814a = hVar;
            this.f81815b = gVar;
        }

        public final void onClick(View view) {
            IActionListener a = this.f81814a.mo116744a();
            if (a != null) {
                String str = this.f81815b.mo116807c().calendar_id;
                if (str == null) {
                    str = "";
                }
                a.mo116749a(str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLevelMeetingRoomViewHolder(C30073g gVar) {
        super(gVar.mo108419a());
        Intrinsics.checkParameterIsNotNull(gVar, "binding");
        this.f81811c = gVar;
    }

    /* renamed from: a */
    public final void mo116746a(MultiLevelMeetingRoomModel gVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(gVar, "model");
        TextView textView = this.f81811c.f74977l;
        Intrinsics.checkExpressionValueIsNotNull(textView, "binding.tvMeetingRoomName");
        textView.setText(gVar.mo116808d());
        TextView textView2 = this.f81811c.f74975j;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "binding.tvMeetingRoomCapacity");
        textView2.setText(gVar.mo116810f());
        String e = gVar.mo116809e();
        TextView textView3 = this.f81811c.f74976k;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "binding.tvMeetingRoomDesc");
        String str = e;
        textView3.setText(str);
        View view = this.f81811c.f74966a;
        Intrinsics.checkExpressionValueIsNotNull(view, "binding.dividerCapacityDesc");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        an.m125213a(view, z);
        if (gVar.mo116805b()) {
            m121748b();
            EditSelectStateView editSelectStateView = this.f81811c.f74971f;
            Intrinsics.checkExpressionValueIsNotNull(editSelectStateView, "binding.multipleSelectBt");
            editSelectStateView.setEnabled(true);
        } else {
            m121749c();
            EditSelectStateView editSelectStateView2 = this.f81811c.f74971f;
            Intrinsics.checkExpressionValueIsNotNull(editSelectStateView2, "binding.multipleSelectBt");
            editSelectStateView2.setEnabled(false);
        }
        TextView textView4 = this.f81811c.f74978m;
        Intrinsics.checkExpressionValueIsNotNull(textView4, "binding.tvNeedApproval");
        an.m125213a(textView4, C32065c.m121948a(gVar.mo116807c()));
        this.f81811c.mo108419a().setOnClickListener(new View$OnClickListenerC32000c(this, gVar));
        ImageView imageView = this.f81811c.f74969d;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "binding.meetingRoomInfoIcon");
        m121747a(imageView, gVar);
        this.f81811c.f74971f.mo115963a(gVar.mo116811g().mo115823b());
    }

    /* renamed from: a */
    private final void m121747a(View view, MultiLevelMeetingRoomModel gVar) {
        view.setOnClickListener(new View$OnClickListenerC32001d(this, gVar));
        ao.m125223a(view, 10, 10);
    }
}
