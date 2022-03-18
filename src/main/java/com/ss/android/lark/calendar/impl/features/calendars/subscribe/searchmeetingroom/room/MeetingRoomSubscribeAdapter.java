package com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.OwnerCalendarUnsubscribeDialog;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.SubscribeButton;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeAdapter$MeetingRoomViewHolder;", "calendarSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$Delegate;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$Delegate;)V", "getCalendarSubscribeView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "setCalendarSubscribeView", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;)V", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$Delegate;", "setDelegate", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$Delegate;)V", "mMeeingRooms", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "getMMeeingRooms", "()Ljava/util/ArrayList;", "setMMeeingRooms", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MeetingRoomViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.a */
public final class MeetingRoomSubscribeAdapter extends RecyclerView.Adapter<MeetingRoomViewHolder> {

    /* renamed from: a */
    public static final float f76754a = 11.0f;

    /* renamed from: b */
    public static final Companion f76755b = new Companion(null);

    /* renamed from: c */
    private ArrayList<SubscribeMeetingRoomData> f76756c = new ArrayList<>();

    /* renamed from: d */
    private CalendarSubscribeView f76757d;

    /* renamed from: e */
    private MeetingRoomSubscribeFragment.Delegate f76758e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeAdapter$Companion;", "", "()V", "DESKTOP_MEETING_ROOM_CAPACITY_ICON_SIZE", "", "getDESKTOP_MEETING_ROOM_CAPACITY_ICON_SIZE", "()F", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeAdapter$MeetingRoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindData", "", "content", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "checkMode", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton$ButtonMode;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.a$b */
    public final class MeetingRoomViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSubscribeAdapter f76759a;

        /* renamed from: b */
        private final View f76760b;

        /* renamed from: a */
        public final View mo110601a() {
            return this.f76760b;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.a$b$b */
        public static final class View$OnClickListenerC30652b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MeetingRoomViewHolder f76764a;

            /* renamed from: b */
            final /* synthetic */ SubscribeMeetingRoomData f76765b;

            View$OnClickListenerC30652b(MeetingRoomViewHolder bVar, SubscribeMeetingRoomData eVar) {
                this.f76764a = bVar;
                this.f76765b = eVar;
            }

            public final void onClick(View view) {
                this.f76764a.f76759a.mo110600b().onMeetingRoomInfoClicked(this.f76765b.mo110445i());
            }
        }

        /* renamed from: b */
        private final SubscribeButton.ButtonMode m113930b(SubscribeMeetingRoomData eVar) {
            if (eVar.mo110444h()) {
                return SubscribeButton.ButtonMode.PRIVATE;
            }
            if (eVar.mo110434b()) {
                return SubscribeButton.ButtonMode.LOADING;
            }
            if (eVar.mo110432a()) {
                return SubscribeButton.ButtonMode.UNSUBSCRIBE;
            }
            return SubscribeButton.ButtonMode.SUBSCRIBE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.a$b$a */
        public static final class View$OnClickListenerC30650a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MeetingRoomViewHolder f76761a;

            /* renamed from: b */
            final /* synthetic */ SubscribeMeetingRoomData f76762b;

            View$OnClickListenerC30650a(MeetingRoomViewHolder bVar, SubscribeMeetingRoomData eVar) {
                this.f76761a = bVar;
                this.f76762b = eVar;
            }

            public final void onClick(View view) {
                this.f76761a.f76759a.mo110600b().setCurrentView();
                if (!this.f76762b.mo110436c() || !this.f76762b.mo110432a()) {
                    this.f76761a.f76759a.mo110596a().mo110507a(this.f76762b);
                    return;
                }
                OwnerCalendarUnsubscribeDialog.Companion aVar = OwnerCalendarUnsubscribeDialog.f76772a;
                Context context = this.f76761a.mo110601a().getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                OwnerCalendarUnsubscribeDialog.Companion.m113936a(aVar, context, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeAdapter.MeetingRoomViewHolder.View$OnClickListenerC30650a.DialogInterface$OnClickListenerC306511 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC30650a f76763a;

                    {
                        this.f76763a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f76763a.f76761a.f76759a.mo110596a().mo110507a(this.f76763a.f76762b);
                    }
                }, null, 4, null);
            }
        }

        /* renamed from: a */
        public final void mo110602a(SubscribeMeetingRoomData eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "content");
            SubscribeButton subscribeButton = (SubscribeButton) this.f76760b.findViewById(R.id.btSubscribe);
            Intrinsics.checkExpressionValueIsNotNull(subscribeButton, "view.btSubscribe");
            int i = 0;
            subscribeButton.setVisibility(0);
            ImageView imageView = (ImageView) this.f76760b.findViewById(R.id.meetingRoomInfoIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.meetingRoomInfoIcon");
            imageView.setVisibility(8);
            ((TextView) this.f76760b.findViewById(R.id.tv_meeting_room_name)).setText(eVar.mo110446j(), TextView.BufferType.SPANNABLE);
            TextView textView = (TextView) this.f76760b.findViewById(R.id.tv_meeting_room_capacity);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_meeting_room_capacity");
            textView.setText(eVar.mo110462l());
            TextView textView2 = (TextView) this.f76760b.findViewById(R.id.tv_meeting_room_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_meeting_room_desc");
            textView2.setText(eVar.mo110447k());
            ImageView imageView2 = (ImageView) this.f76760b.findViewById(R.id.iv_meeting_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.iv_meeting_icon");
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_room_outlined);
            d.setTint(C32634ae.m125178a(R.color.icon_n3));
            imageView2.setBackground(d);
            if (eVar.mo110463m()) {
                TextView textView3 = (TextView) this.f76760b.findViewById(R.id.tv_disabled_icon);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_disabled_icon");
                textView3.setVisibility(0);
            } else {
                TextView textView4 = (TextView) this.f76760b.findViewById(R.id.tv_disabled_icon);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_disabled_icon");
                textView4.setVisibility(8);
            }
            TextView textView5 = (TextView) this.f76760b.findViewById(R.id.tv_need_approval);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "view.tv_need_approval");
            if (!eVar.mo110464n()) {
                i = 8;
            }
            textView5.setVisibility(i);
            ((SubscribeButton) this.f76760b.findViewById(R.id.btSubscribe)).mo110607a(m113930b(eVar));
            ((SubscribeButton) this.f76760b.findViewById(R.id.btSubscribe)).setOnClickListener(new View$OnClickListenerC30650a(this, eVar));
            ((LinearLayout) this.f76760b.findViewById(R.id.text_group)).setOnClickListener(new View$OnClickListenerC30652b(this, eVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MeetingRoomViewHolder(MeetingRoomSubscribeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76759a = aVar;
            this.f76760b = view;
        }
    }

    /* renamed from: a */
    public final CalendarSubscribeView mo110596a() {
        return this.f76757d;
    }

    /* renamed from: b */
    public final MeetingRoomSubscribeFragment.Delegate mo110600b() {
        return this.f76758e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76756c.size();
    }

    /* renamed from: a */
    public final void mo110599a(ArrayList<SubscribeMeetingRoomData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f76756c = arrayList;
    }

    public MeetingRoomSubscribeAdapter(CalendarSubscribeView gVar, MeetingRoomSubscribeFragment.Delegate delegate) {
        Intrinsics.checkParameterIsNotNull(gVar, "calendarSubscribeView");
        Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        this.f76757d = gVar;
        this.f76758e = delegate;
    }

    /* renamed from: a */
    public MeetingRoomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_meeting_room, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new MeetingRoomViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(MeetingRoomViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        SubscribeMeetingRoomData eVar = this.f76756c.get(i);
        Intrinsics.checkExpressionValueIsNotNull(eVar, "mMeeingRooms[position]");
        bVar.mo110602a(eVar);
    }
}
