package com.ss.android.lark.calendar.impl.features.calendars.subscribe.sharecalendars;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeBaseData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.OwnerCalendarUnsubscribeDialog;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.SubscribeButton;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32503j;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "calendarSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;)V", "getCalendarSubscribeView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "appendList", "", "list", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NoMoreItemViewHolder", "PublicCalendarViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c.a */
public final class ShareCalendarSubscribeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private List<SubscribeBaseData> f76614a = new ArrayList();

    /* renamed from: b */
    private final CalendarSubscribeView f76615b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeAdapter$PublicCalendarViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindData", "", "content", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "checkMode", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton$ButtonMode;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c.a$b */
    public final class PublicCalendarViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ShareCalendarSubscribeAdapter f76618a;

        /* renamed from: b */
        private final View f76619b;

        /* renamed from: a */
        public final View mo110478a() {
            return this.f76619b;
        }

        /* renamed from: b */
        public final SubscribeButton.ButtonMode mo110480b(SubscribeBaseData bVar) {
            if (bVar.mo110444h()) {
                return SubscribeButton.ButtonMode.PRIVATE;
            }
            if (bVar.mo110434b()) {
                return SubscribeButton.ButtonMode.LOADING;
            }
            if (bVar.mo110432a()) {
                return SubscribeButton.ButtonMode.UNSUBSCRIBE;
            }
            return SubscribeButton.ButtonMode.SUBSCRIBE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c.a$b$a */
        public static final class View$OnClickListenerC30613a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ PublicCalendarViewHolder f76620a;

            /* renamed from: b */
            final /* synthetic */ SubscribeBaseData f76621b;

            View$OnClickListenerC30613a(PublicCalendarViewHolder bVar, SubscribeBaseData bVar2) {
                this.f76620a = bVar;
                this.f76621b = bVar2;
            }

            public final void onClick(View view) {
                String str;
                int i = C30615b.f76623a[this.f76620a.mo110480b(this.f76621b).ordinal()];
                if (i == 1) {
                    str = "subscribe_public_cal";
                } else if (i != 2) {
                    str = null;
                } else {
                    str = "unsubscribe_public_cal";
                }
                C32503j.m124387a(str, this.f76621b.mo110445i());
                if (!this.f76621b.mo110436c() || !this.f76621b.mo110432a()) {
                    this.f76620a.f76618a.mo110475a().mo110507a(this.f76621b);
                    return;
                }
                OwnerCalendarUnsubscribeDialog.Companion aVar = OwnerCalendarUnsubscribeDialog.f76772a;
                Context context = this.f76620a.mo110478a().getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                OwnerCalendarUnsubscribeDialog.Companion.m113936a(aVar, context, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.sharecalendars.ShareCalendarSubscribeAdapter.PublicCalendarViewHolder.View$OnClickListenerC30613a.DialogInterface$OnClickListenerC306141 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC30613a f76622a;

                    {
                        this.f76622a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f76622a.f76620a.f76618a.mo110475a().mo110507a(this.f76622a.f76621b);
                    }
                }, null, 4, null);
            }
        }

        /* renamed from: a */
        public final void mo110479a(SubscribeBaseData bVar) {
            int i;
            Intrinsics.checkParameterIsNotNull(bVar, "content");
            TextView textView = (TextView) this.f76619b.findViewById(R.id.calendarTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.calendarTitle");
            textView.setText(bVar.mo110446j());
            TextView textView2 = (TextView) this.f76619b.findViewById(R.id.calendarSubTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.calendarSubTitle");
            textView2.setText(bVar.mo110447k());
            ((SubscribeButton) this.f76619b.findViewById(R.id.btSubscribe)).mo110607a(mo110480b(bVar));
            TextView textView3 = (TextView) this.f76619b.findViewById(R.id.resignedLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "view.resignedLabel");
            if (bVar.mo110440e()) {
                i = 0;
            } else {
                i = 8;
            }
            textView3.setVisibility(i);
            if (CalendarShareDataHelper.f76316a.mo110025a(bVar.mo110443g(), Boolean.valueOf(bVar.mo110442f()), Calendar.Type.OTHER)) {
                TextView textView4 = (TextView) this.f76619b.findViewById(R.id.externalLabelTv);
                LarkNameTag.Companion fVar = LarkNameTag.f62897a;
                Context context = textView4.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                LarkNameTag e = fVar.mo90057f(context).mo90029a(true).mo90027e();
                Intrinsics.checkExpressionValueIsNotNull(textView4, "this");
                e.mo90004a(textView4);
                textView4.setVisibility(0);
            } else {
                TextView textView5 = (TextView) this.f76619b.findViewById(R.id.externalLabelTv);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "view.externalLabelTv");
                textView5.setVisibility(8);
            }
            ((SubscribeButton) this.f76619b.findViewById(R.id.btSubscribe)).setOnClickListener(new View$OnClickListenerC30613a(this, bVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PublicCalendarViewHolder(ShareCalendarSubscribeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76618a = aVar;
            this.f76619b = view;
        }
    }

    /* renamed from: a */
    public final CalendarSubscribeView mo110475a() {
        return this.f76615b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76614a.size();
    }

    /* renamed from: a */
    public final void mo110476a(List<SubscribeBaseData> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f76614a = list;
    }

    /* renamed from: b */
    public final void mo110477b(List<? extends SubscribeBaseData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f76614a.addAll(list);
    }

    public ShareCalendarSubscribeAdapter(CalendarSubscribeView gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "calendarSubscribeView");
        this.f76615b = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f76614a.get(i).mo110438d()) {
            return R.layout.calendar_public_calendar_recycle_view_item;
        }
        return R.layout.calendar_subscribe_no_more_item;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeAdapter$NoMoreItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c.a$a */
    public final class NoMoreItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ShareCalendarSubscribeAdapter f76616a;

        /* renamed from: b */
        private final View f76617b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NoMoreItemViewHolder(ShareCalendarSubscribeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76616a = aVar;
            this.f76617b = view;
            TextView textView = (TextView) view.findViewById(R.id.remindText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.remindText");
            textView.setText(C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_NoMoreCal));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (this.f76614a.get(i).mo110438d()) {
            ((PublicCalendarViewHolder) viewHolder).mo110479a(this.f76614a.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == R.layout.calendar_public_calendar_recycle_view_item) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_public_calendar_recycle_view_item, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…r_recycle_view_item,null)");
            return new PublicCalendarViewHolder(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_subscribe_no_more_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…o_more_item,parent,false)");
        return new NoMoreItemViewHolder(this, inflate2);
    }
}
