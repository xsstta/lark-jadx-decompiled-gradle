package com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.BuildingOrMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeCalendarBuildingData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.OwnerCalendarUnsubscribeDialog;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.SubscribeButton;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32503j;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-./B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016JF\u0010 \u001a\u00020\u000f2>\u0010!\u001a:\u0012\u0004\u0012\u00020#\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000b0\"j\"\u0012\u0004\u0012\u00020#\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020$\u0018\u0001`\r`%J\u0014\u0010&\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0015J\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;", "getItemClickListener", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;", "setItemClickListener", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;)V", "mDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/BuildingOrMeetingRoomData;", "Lkotlin/collections/ArrayList;", "addBuildingLoading", "", "buildingPosition", "", "clearAndLoadingExpandBuilding", "closeOneBuilding", "getExpandBuildings", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshBuildingMeetingRooms", "buildingsMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lkotlin/collections/HashMap;", "refreshBuildingsData", "calendarBuildings", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "refreshMeetingRoomSubscribe", "BuildingViewHolder", "LoadErrDataViewHolder", "LoadingDataViewHolder", "MeetingRoomViewHolder", "NoneDataViewHolder", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a */
public final class BuildingExpandRoomSubscribeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private ArrayList<BuildingOrMeetingRoomData> f76677a = new ArrayList<>();

    /* renamed from: b */
    private OnItemClickListener f76678b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;", "", "onBuildingItemClick", "", "chooseBuilding", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "onSubscribeMeetingRoomClick", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "position", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$f */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo110517a(SubscribeCalendarBuildingData cVar);

        /* renamed from: a */
        void mo110518a(SubscribeMeetingRoomData eVar, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$MeetingRoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindData", "", "content", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;", "position", "", "checkMode", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton$ButtonMode;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$d */
    public final class MeetingRoomViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ BuildingExpandRoomSubscribeAdapter f76690a;

        /* renamed from: b */
        private final View f76691b;

        /* renamed from: a */
        public final View mo110535a() {
            return this.f76691b;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$d$b */
        public static final class View$OnClickListenerC30634b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MeetingRoomViewHolder f76697a;

            /* renamed from: b */
            final /* synthetic */ SubscribeMeetingRoomData f76698b;

            View$OnClickListenerC30634b(MeetingRoomViewHolder dVar, SubscribeMeetingRoomData eVar) {
                this.f76697a = dVar;
                this.f76698b = eVar;
            }

            public final void onClick(View view) {
                MeetingRoomProfileActivityEntrance aVar = MeetingRoomProfileActivityEntrance.f82147a;
                Context context = this.f76697a.mo110535a().getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                aVar.mo117232a(context, this.f76698b.mo110445i());
            }
        }

        /* renamed from: a */
        public final SubscribeButton.ButtonMode mo110536a(SubscribeMeetingRoomData eVar) {
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
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$d$a */
        public static final class View$OnClickListenerC30632a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MeetingRoomViewHolder f76692a;

            /* renamed from: b */
            final /* synthetic */ SubscribeMeetingRoomData f76693b;

            /* renamed from: c */
            final /* synthetic */ OnItemClickListener f76694c;

            /* renamed from: d */
            final /* synthetic */ int f76695d;

            View$OnClickListenerC30632a(MeetingRoomViewHolder dVar, SubscribeMeetingRoomData eVar, OnItemClickListener fVar, int i) {
                this.f76692a = dVar;
                this.f76693b = eVar;
                this.f76694c = fVar;
                this.f76695d = i;
            }

            public final void onClick(View view) {
                String str;
                int i = C30635b.f76700a[this.f76692a.mo110536a(this.f76693b).ordinal()];
                if (i == 1) {
                    str = "subscribe_resource_cal";
                } else if (i != 2) {
                    str = null;
                } else {
                    str = "unsubscribe_resource_cal";
                }
                C32503j.m124387a(str, this.f76693b.mo110445i());
                if (!this.f76693b.mo110436c() || !this.f76693b.mo110432a()) {
                    OnItemClickListener fVar = this.f76694c;
                    if (fVar != null) {
                        fVar.mo110518a(this.f76693b, this.f76695d);
                        return;
                    }
                    return;
                }
                OwnerCalendarUnsubscribeDialog.Companion aVar = OwnerCalendarUnsubscribeDialog.f76772a;
                Context context = this.f76692a.mo110535a().getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                OwnerCalendarUnsubscribeDialog.Companion.m113936a(aVar, context, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.BuildingExpandRoomSubscribeAdapter.MeetingRoomViewHolder.View$OnClickListenerC30632a.DialogInterface$OnClickListenerC306331 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC30632a f76696a;

                    {
                        this.f76696a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        OnItemClickListener fVar = this.f76696a.f76694c;
                        if (fVar != null) {
                            fVar.mo110518a(this.f76696a.f76693b, this.f76696a.f76695d);
                        }
                    }
                }, null, 4, null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MeetingRoomViewHolder(BuildingExpandRoomSubscribeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76690a = aVar;
            this.f76691b = view;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.meeting_room_item_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.meeting_room_item_container");
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(UIHelper.dp2px(29.0f));
                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.meeting_room_item_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.meeting_room_item_container");
                relativeLayout2.setLayoutParams(marginLayoutParams);
                View findViewById = view.findViewById(R.id.split_line);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.split_line");
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (layoutParams2 != null) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    ImageView imageView = (ImageView) view.findViewById(R.id.iv_meeting_icon);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "view.iv_meeting_icon");
                    layoutParams3.addRule(5, imageView.getId());
                    View findViewById2 = view.findViewById(R.id.split_line);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.split_line");
                    findViewById2.setLayoutParams(layoutParams3);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }

        /* renamed from: a */
        public final void mo110537a(SubscribeMeetingRoomData eVar, OnItemClickListener fVar, int i) {
            Intrinsics.checkParameterIsNotNull(eVar, "content");
            SubscribeButton subscribeButton = (SubscribeButton) this.f76691b.findViewById(R.id.btSubscribe);
            Intrinsics.checkExpressionValueIsNotNull(subscribeButton, "view.btSubscribe");
            int i2 = 0;
            subscribeButton.setVisibility(0);
            ((TextView) this.f76691b.findViewById(R.id.tv_meeting_room_name)).setText(eVar.mo110446j(), TextView.BufferType.SPANNABLE);
            TextView textView = (TextView) this.f76691b.findViewById(R.id.tv_meeting_room_capacity);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_meeting_room_capacity");
            textView.setText(eVar.mo110462l());
            TextView textView2 = (TextView) this.f76691b.findViewById(R.id.tv_meeting_room_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_meeting_room_desc");
            textView2.setText(eVar.mo110447k());
            ImageView imageView = (ImageView) this.f76691b.findViewById(R.id.iv_meeting_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.iv_meeting_icon");
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_room_outlined);
            d.setTint(C32634ae.m125178a(R.color.icon_n3));
            imageView.setBackground(d);
            if (eVar.mo110463m()) {
                TextView textView3 = (TextView) this.f76691b.findViewById(R.id.tv_disabled_icon);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_disabled_icon");
                textView3.setVisibility(0);
            } else {
                TextView textView4 = (TextView) this.f76691b.findViewById(R.id.tv_disabled_icon);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_disabled_icon");
                textView4.setVisibility(8);
            }
            TextView textView5 = (TextView) this.f76691b.findViewById(R.id.tv_need_approval);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "view.tv_need_approval");
            if (!eVar.mo110464n()) {
                i2 = 8;
            }
            textView5.setVisibility(i2);
            ((SubscribeButton) this.f76691b.findViewById(R.id.btSubscribe)).mo110607a(mo110536a(eVar));
            ((SubscribeButton) this.f76691b.findViewById(R.id.btSubscribe)).setOnClickListener(new View$OnClickListenerC30632a(this, eVar, fVar, i));
            this.f76691b.setOnClickListener(new View$OnClickListenerC30634b(this, eVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76677a.size();
    }

    /* renamed from: b */
    public final List<SubscribeCalendarBuildingData> mo110530b() {
        SubscribeCalendarBuildingData b;
        ArrayList arrayList = new ArrayList();
        for (int size = this.f76677a.size() - 1; size >= 0; size--) {
            BuildingOrMeetingRoomData aVar = this.f76677a.get(size);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mDataList[idx]");
            BuildingOrMeetingRoomData aVar2 = aVar;
            if (aVar2.mo110429e() && (b = aVar2.mo110426b()) != null && b.mo110450b()) {
                arrayList.add(aVar2.mo110426b());
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    /* renamed from: a */
    public final void mo110525a() {
        for (int size = this.f76677a.size() - 1; size >= 0; size--) {
            BuildingOrMeetingRoomData aVar = this.f76677a.get(size);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mDataList[idx]");
            BuildingOrMeetingRoomData aVar2 = aVar;
            if (aVar2.mo110429e()) {
                SubscribeCalendarBuildingData b = aVar2.mo110426b();
                if (b != null && b.mo110450b()) {
                    BuildingOrMeetingRoomData aVar3 = new BuildingOrMeetingRoomData(1);
                    int i = size + 1;
                    if (i <= this.f76677a.size() && i > 0) {
                        this.f76677a.add(i, aVar3);
                    }
                }
            } else {
                Intrinsics.checkExpressionValueIsNotNull(this.f76677a.remove(size), "mDataList.removeAt(idx)");
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo110527a(OnItemClickListener fVar) {
        this.f76678b = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f76677a.get(i).mo110425a();
    }

    /* renamed from: a */
    public final void mo110526a(int i) {
        if (i < this.f76677a.size() && i >= 0 && this.f76677a.get(i).mo110428d()) {
            notifyItemChanged(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$BuildingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter;Landroid/view/View;)V", "buildingIcon", "Landroid/widget/ImageView;", "expandArrow", "itemViewRootView", "tvBuildingName", "Landroid/widget/TextView;", "bindData", "", "calendarBuilding", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;", "position", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$a */
    public final class BuildingViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ BuildingExpandRoomSubscribeAdapter f76679a;

        /* renamed from: b */
        private final TextView f76680b;

        /* renamed from: c */
        private final View f76681c;

        /* renamed from: d */
        private final ImageView f76682d;

        /* renamed from: e */
        private final ImageView f76683e;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$a$a */
        public static final class View$OnClickListenerC30631a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ BuildingViewHolder f76684a;

            /* renamed from: b */
            final /* synthetic */ SubscribeCalendarBuildingData f76685b;

            /* renamed from: c */
            final /* synthetic */ int f76686c;

            /* renamed from: d */
            final /* synthetic */ OnItemClickListener f76687d;

            View$OnClickListenerC30631a(BuildingViewHolder aVar, SubscribeCalendarBuildingData cVar, int i, OnItemClickListener fVar) {
                this.f76684a = aVar;
                this.f76685b = cVar;
                this.f76686c = i;
                this.f76687d = fVar;
            }

            public final void onClick(View view) {
                if (this.f76685b.mo110450b()) {
                    this.f76684a.f76679a.mo110532c(this.f76686c);
                    return;
                }
                this.f76684a.f76679a.mo110531b(this.f76686c);
                OnItemClickListener fVar = this.f76687d;
                if (fVar != null) {
                    fVar.mo110517a(this.f76685b);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BuildingViewHolder(BuildingExpandRoomSubscribeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76679a = aVar;
            TextView textView = (TextView) view.findViewById(R.id.tv_building_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_building_name");
            this.f76680b = textView;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.building_item_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.building_item_container");
            this.f76681c = relativeLayout;
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.icon");
            this.f76682d = imageView;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.enter_meeting_room_arrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.enter_meeting_room_arrow");
            this.f76683e = imageView2;
        }

        /* renamed from: a */
        public final void mo110533a(SubscribeCalendarBuildingData cVar, OnItemClickListener fVar, int i) {
            if (cVar != null) {
                TextView textView = this.f76680b;
                String name = cVar.mo110448a().getName();
                if (name == null) {
                    name = "";
                }
                textView.setText(name);
                this.f76682d.setImageResource(R.drawable.ud_icon_building_outlined);
                this.f76681c.setOnClickListener(new View$OnClickListenerC30631a(this, cVar, i, fVar));
                if (cVar.mo110450b()) {
                    ImageView imageView = this.f76683e;
                    Drawable d = C32634ae.m125184d(R.drawable.ud_icon_up_outlined);
                    d.setTint(C32634ae.m125178a(R.color.icon_n3));
                    imageView.setImageDrawable(d);
                    return;
                }
                ImageView imageView2 = this.f76683e;
                Drawable d2 = C32634ae.m125184d(R.drawable.ud_icon_down_outlined);
                d2.setTint(C32634ae.m125178a(R.color.icon_n3));
                imageView2.setImageDrawable(d2);
            }
        }
    }

    /* renamed from: a */
    public final void mo110529a(List<? extends CalendarBuilding> list) {
        Intrinsics.checkParameterIsNotNull(list, "calendarBuildings");
        this.f76677a.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f76677a.add(new BuildingOrMeetingRoomData(new SubscribeCalendarBuildingData(it.next(), false, 2, null)));
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo110531b(int i) {
        int i2 = i + 1;
        if (i2 <= this.f76677a.size() && i2 >= 0) {
            this.f76677a.add(i2, new BuildingOrMeetingRoomData(1));
            notifyItemInserted(i2);
            notifyItemRangeChanged(i2, this.f76677a.size() - i2);
        }
    }

    /* renamed from: c */
    public final void mo110532c(int i) {
        if (i < this.f76677a.size() && i >= 0) {
            SubscribeCalendarBuildingData b = this.f76677a.get(i).mo110426b();
            int i2 = 0;
            if (b != null) {
                b.mo110449a(false);
            }
            notifyItemChanged(i);
            int i3 = i + 1;
            int size = this.f76677a.size();
            for (int i4 = i3; i4 < size && !this.f76677a.get(i3).mo110429e(); i4++) {
                this.f76677a.remove(i3);
                i2++;
            }
            notifyItemRangeRemoved(i3, i2);
            notifyItemRangeChanged(i3, this.f76677a.size() - i3);
        }
    }

    /* renamed from: a */
    public final void mo110528a(HashMap<String, ArrayList<SubscribeMeetingRoomData>> hashMap) {
        SubscribeCalendarBuildingData b;
        CalendarBuilding a;
        String id;
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(hashMap, "buildingsMap");
        int i2 = 0;
        while (i2 < this.f76677a.size()) {
            BuildingOrMeetingRoomData aVar = this.f76677a.get(i2);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mDataList[index]");
            BuildingOrMeetingRoomData aVar2 = aVar;
            i2++;
            if (!(!aVar2.mo110429e() || (b = aVar2.mo110426b()) == null || (a = b.mo110448a()) == null || (id = a.getId()) == null)) {
                ArrayList<SubscribeMeetingRoomData> arrayList = hashMap.get(id);
                if (!hashMap.containsKey(id) || arrayList != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (arrayList != null || z) {
                    aVar2.mo110426b().mo110449a(true);
                    while (i2 < this.f76677a.size() && !this.f76677a.get(i2).mo110429e()) {
                        this.f76677a.remove(i2);
                    }
                    if (arrayList != null) {
                        i = arrayList.size();
                    } else {
                        i = 1;
                    }
                    ArrayList arrayList2 = new ArrayList(i);
                    if (z) {
                        arrayList2.add(new BuildingOrMeetingRoomData(4));
                    } else if (arrayList != null && arrayList.isEmpty()) {
                        arrayList2.add(new BuildingOrMeetingRoomData());
                    } else if (arrayList != null) {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new BuildingOrMeetingRoomData((SubscribeMeetingRoomData) it.next()));
                        }
                    }
                    this.f76677a.addAll(i2, arrayList2);
                    i2 += arrayList2.size();
                }
            }
        }
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$LoadErrDataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter;Landroid/view/View;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$b */
    public final class LoadErrDataViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ BuildingExpandRoomSubscribeAdapter f76688a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoadErrDataViewHolder(BuildingExpandRoomSubscribeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76688a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$LoadingDataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter;Landroid/view/View;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$c */
    public final class LoadingDataViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ BuildingExpandRoomSubscribeAdapter f76689a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoadingDataViewHolder(BuildingExpandRoomSubscribeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76689a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$NoneDataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter;Landroid/view/View;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.a$e */
    public final class NoneDataViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ BuildingExpandRoomSubscribeAdapter f76699a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NoneDataViewHolder(BuildingExpandRoomSubscribeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76699a = aVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SubscribeMeetingRoomData c;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof BuildingViewHolder) {
            SubscribeCalendarBuildingData b = this.f76677a.get(i).mo110426b();
            if (b != null) {
                ((BuildingViewHolder) viewHolder).mo110533a(b, this.f76678b, i);
            }
        } else if ((viewHolder instanceof MeetingRoomViewHolder) && (c = this.f76677a.get(i).mo110427c()) != null) {
            ((MeetingRoomViewHolder) viewHolder).mo110537a(c, this.f76678b, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_meeting_room_none_data, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new NoneDataViewHolder(this, inflate);
        } else if (i == 1) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_meeting_room_loading_data, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
            return new LoadingDataViewHolder(this, inflate2);
        } else if (i == 2) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_meeting_room, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "view");
            return new MeetingRoomViewHolder(this, inflate3);
        } else if (i != 4) {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_meeting_room_building, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate4, "view");
            return new BuildingViewHolder(this, inflate4);
        } else {
            View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_meeting_room_load_err, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate5, "view");
            return new LoadErrDataViewHolder(this, inflate5);
        }
    }
}
