package com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0003+,-B/\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J$\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0014\u0010\u001f\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001a\u0010!\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0002J\u001c\u0010&\u001a\u00020\u00132\n\u0010'\u001a\u00060(R\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter;", "Landroid/widget/BaseAdapter;", "mCalendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "mMeetingRooms", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "mContext", "Landroid/content/Context;", "mMeetingAdapterListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter$IMeetingRoomListener;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;Ljava/util/List;Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter$IMeetingRoomListener;)V", "mIsDisableApprovalMeetingRoom", "", "getMIsDisableApprovalMeetingRoom", "()Z", "setMIsDisableApprovalMeetingRoom", "(Z)V", "clearData", "", "getCount", "", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "setData", "resources", "updateMeetingContainerMargin", "meetingTextContainer", "Landroid/widget/LinearLayout;", "rightMarginDp", "", "updateMeetingInfo", "viewHolder", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter$BoardroomViewHolder;", "resourceCalendarId", "", "BoardroomViewHolder", "Companion", "IMeetingRoomListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.e */
public final class MeetingRoomAdapter extends BaseAdapter {

    /* renamed from: b */
    public static final Companion f80369b = new Companion(null);

    /* renamed from: a */
    public final IMeetingRoomListener f80370a;

    /* renamed from: c */
    private boolean f80371c;

    /* renamed from: d */
    private CalendarBuilding f80372d;

    /* renamed from: e */
    private List<CalendarResource> f80373e;

    /* renamed from: f */
    private Context f80374f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter$IMeetingRoomListener;", "", "onMeetingRoomInfoClicked", "", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.e$c */
    public interface IMeetingRoomListener {
        /* renamed from: a */
        void mo115261a(String str);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter$BoardroomViewHolder;", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter;)V", "divider", "Landroid/view/View;", "getDivider$calendar_impl_release", "()Landroid/view/View;", "setDivider$calendar_impl_release", "(Landroid/view/View;)V", "externalLabel", "Landroid/widget/TextView;", "getExternalLabel$calendar_impl_release", "()Landroid/widget/TextView;", "setExternalLabel$calendar_impl_release", "(Landroid/widget/TextView;)V", "meetingRoomCapacity", "getMeetingRoomCapacity$calendar_impl_release", "setMeetingRoomCapacity$calendar_impl_release", "meetingRoomCapacityIcon", "Landroid/widget/ImageView;", "getMeetingRoomCapacityIcon$calendar_impl_release", "()Landroid/widget/ImageView;", "setMeetingRoomCapacityIcon$calendar_impl_release", "(Landroid/widget/ImageView;)V", "meetingRoomDesc", "getMeetingRoomDesc$calendar_impl_release", "setMeetingRoomDesc$calendar_impl_release", "meetingRoomIcon", "getMeetingRoomIcon$calendar_impl_release", "setMeetingRoomIcon$calendar_impl_release", "meetingRoomInfoIv", "getMeetingRoomInfoIv$calendar_impl_release", "setMeetingRoomInfoIv$calendar_impl_release", "meetingRoomName", "getMeetingRoomName$calendar_impl_release", "setMeetingRoomName$calendar_impl_release", "meetingTextContainer", "Landroid/widget/LinearLayout;", "getMeetingTextContainer$calendar_impl_release", "()Landroid/widget/LinearLayout;", "setMeetingTextContainer$calendar_impl_release", "(Landroid/widget/LinearLayout;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.e$a */
    public final class BoardroomViewHolder {

        /* renamed from: b */
        private TextView f80376b;

        /* renamed from: c */
        private TextView f80377c;

        /* renamed from: d */
        private ImageView f80378d;

        /* renamed from: e */
        private TextView f80379e;

        /* renamed from: f */
        private ImageView f80380f;

        /* renamed from: g */
        private ImageView f80381g;

        /* renamed from: h */
        private View f80382h;

        /* renamed from: i */
        private TextView f80383i;

        /* renamed from: j */
        private LinearLayout f80384j;

        /* renamed from: a */
        public final TextView mo115243a() {
            return this.f80376b;
        }

        /* renamed from: b */
        public final TextView mo115248b() {
            return this.f80377c;
        }

        /* renamed from: c */
        public final ImageView mo115251c() {
            return this.f80378d;
        }

        /* renamed from: d */
        public final TextView mo115254d() {
            return this.f80379e;
        }

        /* renamed from: e */
        public final ImageView mo115256e() {
            return this.f80380f;
        }

        /* renamed from: f */
        public final ImageView mo115257f() {
            return this.f80381g;
        }

        /* renamed from: g */
        public final View mo115258g() {
            return this.f80382h;
        }

        /* renamed from: h */
        public final TextView mo115259h() {
            return this.f80383i;
        }

        /* renamed from: i */
        public final LinearLayout mo115260i() {
            return this.f80384j;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public BoardroomViewHolder() {
        }

        /* renamed from: a */
        public final void mo115244a(View view) {
            this.f80382h = view;
        }

        /* renamed from: b */
        public final void mo115249b(ImageView imageView) {
            this.f80380f = imageView;
        }

        /* renamed from: c */
        public final void mo115252c(ImageView imageView) {
            this.f80381g = imageView;
        }

        /* renamed from: d */
        public final void mo115255d(TextView textView) {
            this.f80383i = textView;
        }

        /* renamed from: a */
        public final void mo115245a(ImageView imageView) {
            this.f80378d = imageView;
        }

        /* renamed from: b */
        public final void mo115250b(TextView textView) {
            this.f80377c = textView;
        }

        /* renamed from: c */
        public final void mo115253c(TextView textView) {
            this.f80379e = textView;
        }

        /* renamed from: a */
        public final void mo115246a(LinearLayout linearLayout) {
            this.f80384j = linearLayout;
        }

        /* renamed from: a */
        public final void mo115247a(TextView textView) {
            this.f80376b = textView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.e$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo115237a() {
        this.f80373e.clear();
    }

    public int getCount() {
        return this.f80373e.size();
    }

    /* renamed from: a */
    public final void mo115238a(boolean z) {
        this.f80371c = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter$updateMeetingInfo$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.e$d */
    public static final class View$OnClickListenerC31643d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomAdapter f80385a;

        /* renamed from: b */
        final /* synthetic */ String f80386b;

        View$OnClickListenerC31643d(MeetingRoomAdapter eVar, String str) {
            this.f80385a = eVar;
            this.f80386b = str;
        }

        public final void onClick(View view) {
            this.f80385a.f80370a.mo115261a(this.f80386b);
        }
    }

    /* renamed from: a */
    public CalendarResource getItem(int i) {
        if (i < this.f80373e.size()) {
            return this.f80373e.get(i);
        }
        return null;
    }

    /* renamed from: a */
    private final void m119591a(LinearLayout linearLayout, float f) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (linearLayout != null) {
            layoutParams = linearLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = UIHelper.dp2px(f);
        }
    }

    /* renamed from: a */
    private final void m119592a(BoardroomViewHolder aVar, String str) {
        if (C30022a.f74883b.mo112709q()) {
            ImageView f = aVar.mo115257f();
            if (f != null) {
                f.setVisibility(0);
                f.setOnClickListener(new View$OnClickListenerC31643d(this, str));
                ao.m125223a((View) f, 10, 10);
            }
            m119591a(aVar.mo115260i(), 42.0f);
            return;
        }
        ImageView f2 = aVar.mo115257f();
        if (f2 != null) {
            f2.setVisibility(8);
        }
        ao.m125222a(aVar.mo115257f());
        m119591a(aVar.mo115260i(), 12.0f);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        BoardroomViewHolder aVar;
        View view2;
        TextView textView;
        ImageView imageView;
        TextView textView2;
        TextView textView3;
        ImageView imageView2;
        TextView textView4;
        ImageView imageView3;
        LinearLayout linearLayout;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        String str = null;
        if (view == null) {
            aVar = new BoardroomViewHolder();
            view2 = LayoutInflater.from(this.f80374f).inflate(R.layout.item_event_meeting_room, (ViewGroup) null, true);
            if (view2 != null) {
                textView = (TextView) view2.findViewById(R.id.tv_meeting_room_name);
            } else {
                textView = null;
            }
            aVar.mo115247a(textView);
            if (view2 != null) {
                imageView = (ImageView) view2.findViewById(R.id.iv_meeting_icon);
            } else {
                imageView = null;
            }
            aVar.mo115245a(imageView);
            if (view2 != null) {
                textView2 = (TextView) view2.findViewById(R.id.tv_meeting_room_desc);
            } else {
                textView2 = null;
            }
            aVar.mo115250b(textView2);
            if (view2 != null) {
                textView3 = (TextView) view2.findViewById(R.id.tv_meeting_room_capacity);
            } else {
                textView3 = null;
            }
            aVar.mo115253c(textView3);
            if (view2 != null) {
                imageView2 = (ImageView) view2.findViewById(R.id.iv_meeting_room_capacity);
            } else {
                imageView2 = null;
            }
            aVar.mo115249b(imageView2);
            aVar.mo115244a(view2.findViewById(R.id.divider_capacity_desc));
            if (view2 != null) {
                textView4 = (TextView) view2.findViewById(R.id.tv_need_approval);
            } else {
                textView4 = null;
            }
            aVar.mo115255d(textView4);
            if (view2 != null) {
                imageView3 = (ImageView) view2.findViewById(R.id.meetingRoomInfoIcon);
            } else {
                imageView3 = null;
            }
            aVar.mo115252c(imageView3);
            if (view2 != null) {
                linearLayout = (LinearLayout) view2.findViewById(R.id.text_group);
            } else {
                linearLayout = null;
            }
            aVar.mo115246a(linearLayout);
            Intrinsics.checkExpressionValueIsNotNull(view2, "convertView");
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                BoardroomViewHolder aVar2 = (BoardroomViewHolder) tag;
                view2 = view;
                aVar = aVar2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.MeetingRoomAdapter.BoardroomViewHolder");
            }
        }
        CalendarResource calendarResource = this.f80373e.get(i);
        if (calendarResource.getStatus() == CalendarResource.Status.FREE) {
            ImageView c = aVar.mo115251c();
            if (c != null) {
                Context context = this.f80374f;
                c.setBackground(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_room_outlined, UDColorUtils.getColor(context, R.color.icon_n3)));
            }
            TextView a = aVar.mo115243a();
            if (a != null) {
                a.setTextColor(C32634ae.m125178a(R.color.lkui_N900));
            }
            ImageView e = aVar.mo115256e();
            if (e != null) {
                Drawable d = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
                d.setTint(C32634ae.m125178a(R.color.icon_n3));
                e.setBackground(d);
            }
            TextView d2 = aVar.mo115254d();
            if (d2 != null) {
                d2.setTextColor(C32634ae.m125178a(R.color.lkui_N600));
            }
            TextView b = aVar.mo115248b();
            if (b != null) {
                b.setTextColor(C32634ae.m125178a(R.color.lkui_N600));
            }
            View g = aVar.mo115258g();
            if (g != null) {
                g.setBackgroundColor(C32634ae.m125178a(R.color.lkui_N600));
            }
        } else {
            ImageView c2 = aVar.mo115251c();
            if (c2 != null) {
                Context context2 = this.f80374f;
                c2.setBackground(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_room_unavailable_outlined, UDColorUtils.getColor(context2, R.color.icon_disable)));
            }
            TextView a2 = aVar.mo115243a();
            if (a2 != null) {
                a2.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
            }
            ImageView e2 = aVar.mo115256e();
            if (e2 != null) {
                Drawable d3 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
                d3.setTint(C32634ae.m125178a(R.color.ud_N400));
                e2.setBackground(d3);
            }
            TextView d4 = aVar.mo115254d();
            if (d4 != null) {
                d4.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
            }
            TextView b2 = aVar.mo115248b();
            if (b2 != null) {
                b2.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
            }
            View g2 = aVar.mo115258g();
            if (g2 != null) {
                g2.setBackgroundColor(C32634ae.m125178a(R.color.lkui_N400));
            }
        }
        if (SchemaHelper.f83746a.mo120312a(calendarResource.getResourceSchema())) {
            TextView h = aVar.mo115259h();
            if (h != null) {
                h.setVisibility(0);
            }
            if (this.f80371c) {
                ImageView c3 = aVar.mo115251c();
                if (c3 != null) {
                    Context context3 = this.f80374f;
                    c3.setBackground(UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_room_unavailable_outlined, UDColorUtils.getColor(context3, R.color.icon_disable)));
                }
                TextView a3 = aVar.mo115243a();
                if (a3 != null) {
                    a3.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
                }
                ImageView e3 = aVar.mo115256e();
                if (e3 != null) {
                    Drawable d5 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
                    d5.setTint(C32634ae.m125178a(R.color.ud_N400));
                    e3.setBackground(d5);
                }
                TextView d6 = aVar.mo115254d();
                if (d6 != null) {
                    d6.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
                }
                TextView b3 = aVar.mo115248b();
                if (b3 != null) {
                    b3.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
                }
                View g3 = aVar.mo115258g();
                if (g3 != null) {
                    g3.setBackgroundColor(C32634ae.m125178a(R.color.lkui_N400));
                }
            }
        } else {
            TextView h2 = aVar.mo115259h();
            if (h2 != null) {
                h2.setVisibility(8);
            }
        }
        StringBuilder sb = new StringBuilder();
        String floorName = calendarResource.getFloorName();
        if (!TextUtils.isEmpty(floorName)) {
            sb.append(floorName);
            sb.append("-");
        }
        sb.append(calendarResource.getName());
        TextView a4 = aVar.mo115243a();
        if (a4 != null) {
            a4.setText(sb.toString());
        }
        if (this.f80372d != null) {
            TextView b4 = aVar.mo115248b();
            if (b4 != null) {
                CalendarBuilding calendarBuilding = this.f80372d;
                if (calendarBuilding != null) {
                    str = calendarBuilding.getName();
                }
                b4.setText(str);
            }
        } else {
            C3474b.m14691a("mCalendarBuilding = null");
            Log.m165383e("MeetingRoomAdapter", C32673y.m125377c("mCalendarBuilding = null"));
        }
        TextView d7 = aVar.mo115254d();
        if (d7 != null) {
            d7.setText(String.valueOf(calendarResource.getCapacity()));
        }
        String calendarId = calendarResource.getCalendarId();
        if (calendarId == null) {
            calendarId = "";
        }
        m119592a(aVar, calendarId);
        return view2;
    }

    public MeetingRoomAdapter(CalendarBuilding calendarBuilding, List<CalendarResource> list, Context context, IMeetingRoomListener cVar) {
        Intrinsics.checkParameterIsNotNull(list, "mMeetingRooms");
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(cVar, "mMeetingAdapterListener");
        this.f80372d = calendarBuilding;
        this.f80373e = list;
        this.f80374f = context;
        this.f80370a = cVar;
    }
}
