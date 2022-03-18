package com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.SubscribeButton;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32503j;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/SearchMeetingRoomSubscribedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/IMeetingRoomItemListener;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/IMeetingRoomItemListener;)V", "getItemListener", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/IMeetingRoomItemListener;", "setItemListener", "mSearchMeetingRoom", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lkotlin/collections/ArrayList;", "getMSearchMeetingRoom", "()Ljava/util/ArrayList;", "setMSearchMeetingRoom", "(Ljava/util/ArrayList;)V", "appendList", "", "list", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MeetingRoomViewHolder", "NoMoreItemViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.f */
public final class SearchMeetingRoomSubscribedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final float f76725a = 11.0f;

    /* renamed from: b */
    public static final Companion f76726b = new Companion(null);

    /* renamed from: c */
    private ArrayList<SubscribeMeetingRoomData> f76727c = new ArrayList<>();

    /* renamed from: d */
    private IMeetingRoomItemListener f76728d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/SearchMeetingRoomSubscribedAdapter$Companion;", "", "()V", "DESKTOP_MEETING_ROOM_CAPACITY_ICON_SIZE", "", "getDESKTOP_MEETING_ROOM_CAPACITY_ICON_SIZE", "()F", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final IMeetingRoomItemListener mo110577a() {
        return this.f76728d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76727c.size();
    }

    /* renamed from: a */
    public final void mo110578a(ArrayList<SubscribeMeetingRoomData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f76727c = arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/SearchMeetingRoomSubscribedAdapter$MeetingRoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/SearchMeetingRoomSubscribedAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindViewHolder", "", "dataItem", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "checkMode", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton$ButtonMode;", "content", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.f$b */
    public final class MeetingRoomViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ SearchMeetingRoomSubscribedAdapter f76729a;

        /* renamed from: b */
        private final View f76730b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.f$b$b */
        public static final class View$OnClickListenerC30643b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MeetingRoomViewHolder f76733a;

            /* renamed from: b */
            final /* synthetic */ SubscribeMeetingRoomData f76734b;

            View$OnClickListenerC30643b(MeetingRoomViewHolder bVar, SubscribeMeetingRoomData eVar) {
                this.f76733a = bVar;
                this.f76734b = eVar;
            }

            public final void onClick(View view) {
                this.f76733a.f76729a.mo110577a().mo110542a(this.f76734b.mo110445i());
            }
        }

        /* renamed from: b */
        public final SubscribeButton.ButtonMode mo110580b(SubscribeMeetingRoomData eVar) {
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
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.f$b$a */
        public static final class View$OnClickListenerC30642a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MeetingRoomViewHolder f76731a;

            /* renamed from: b */
            final /* synthetic */ SubscribeMeetingRoomData f76732b;

            View$OnClickListenerC30642a(MeetingRoomViewHolder bVar, SubscribeMeetingRoomData eVar) {
                this.f76731a = bVar;
                this.f76732b = eVar;
            }

            public final void onClick(View view) {
                String str;
                int i = C30644g.f76737a[this.f76731a.mo110580b(this.f76732b).ordinal()];
                if (i == 1) {
                    str = "subscribe_resource_cal";
                } else if (i != 2) {
                    str = null;
                } else {
                    str = "unsubscribe_resource_cal";
                }
                C32503j.m124387a(str, this.f76732b.mo110445i());
                this.f76731a.f76729a.mo110577a().mo110541a(this.f76732b);
            }
        }

        /* renamed from: a */
        public final void mo110579a(SubscribeMeetingRoomData eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "dataItem");
            SubscribeButton subscribeButton = (SubscribeButton) this.f76730b.findViewById(R.id.btSubscribe);
            Intrinsics.checkExpressionValueIsNotNull(subscribeButton, "view.btSubscribe");
            int i = 0;
            subscribeButton.setVisibility(0);
            ImageView imageView = (ImageView) this.f76730b.findViewById(R.id.meetingRoomInfoIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.meetingRoomInfoIcon");
            imageView.setVisibility(8);
            TextView textView = (TextView) this.f76730b.findViewById(R.id.tv_meeting_room_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_meeting_room_name");
            textView.setText(eVar.mo110446j());
            TextView textView2 = (TextView) this.f76730b.findViewById(R.id.tv_meeting_room_capacity);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_meeting_room_capacity");
            textView2.setText(eVar.mo110462l());
            TextView textView3 = (TextView) this.f76730b.findViewById(R.id.tv_meeting_room_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_meeting_room_desc");
            textView3.setText(eVar.mo110447k());
            ImageView imageView2 = (ImageView) this.f76730b.findViewById(R.id.iv_meeting_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.iv_meeting_icon");
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_room_outlined);
            d.setTint(C32634ae.m125178a(R.color.icon_n3));
            imageView2.setBackground(d);
            if (eVar.mo110463m()) {
                TextView textView4 = (TextView) this.f76730b.findViewById(R.id.tv_disabled_icon);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_disabled_icon");
                textView4.setVisibility(0);
            } else {
                TextView textView5 = (TextView) this.f76730b.findViewById(R.id.tv_disabled_icon);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "view.tv_disabled_icon");
                textView5.setVisibility(8);
            }
            TextView textView6 = (TextView) this.f76730b.findViewById(R.id.tv_need_approval);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "view.tv_need_approval");
            if (!eVar.mo110464n()) {
                i = 8;
            }
            textView6.setVisibility(i);
            ((SubscribeButton) this.f76730b.findViewById(R.id.btSubscribe)).mo110607a(mo110580b(eVar));
            ((SubscribeButton) this.f76730b.findViewById(R.id.btSubscribe)).setOnClickListener(new View$OnClickListenerC30642a(this, eVar));
            if (C30022a.f74883b.mo112709q()) {
                ((LinearLayout) this.f76730b.findViewById(R.id.text_group)).setOnClickListener(new View$OnClickListenerC30643b(this, eVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MeetingRoomViewHolder(SearchMeetingRoomSubscribedAdapter fVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76729a = fVar;
            this.f76730b = view;
        }
    }

    public SearchMeetingRoomSubscribedAdapter(IMeetingRoomItemListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "itemListener");
        this.f76728d = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f76727c.get(i).mo110438d()) {
            return R.layout.item_event_meeting_room;
        }
        return R.layout.calendar_subscribe_no_more_item;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/SearchMeetingRoomSubscribedAdapter$NoMoreItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/SearchMeetingRoomSubscribedAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.f$c */
    public final class NoMoreItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ SearchMeetingRoomSubscribedAdapter f76735a;

        /* renamed from: b */
        private final View f76736b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NoMoreItemViewHolder(SearchMeetingRoomSubscribedAdapter fVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76735a = fVar;
            this.f76736b = view;
            TextView textView = (TextView) view.findViewById(R.id.remindText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.remindText");
            textView.setText(C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_NoMoreCal));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (this.f76727c.get(i).mo110438d()) {
            SubscribeMeetingRoomData eVar = this.f76727c.get(i);
            Intrinsics.checkExpressionValueIsNotNull(eVar, "mSearchMeetingRoom[position]");
            ((MeetingRoomViewHolder) viewHolder).mo110579a(eVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == R.layout.item_event_meeting_room) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_meeting_room, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…eting_room, parent,false)");
            return new MeetingRoomViewHolder(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_subscribe_no_more_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…_more_item, parent,false)");
        return new NoMoreItemViewHolder(this, inflate2);
    }
}
