package com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventCalendarData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001)B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J$\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u00020!2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010#\u001a\u00020\u0007J\u001c\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\n\u0010'\u001a\u00060(R\u00020\u0000H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/CalendarAdapter;", "Landroid/widget/BaseAdapter;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventCalendarData;", "Lkotlin/collections/ArrayList;", "currentIndex", "", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;ILandroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getCount", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "refreshData", "", "calendarList", "index", "refreshExternalLabel", "isCrossTenant", "", "viewHolder", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/CalendarAdapter$ViewHolder;", "ViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.d */
public final class CalendarAdapter extends BaseAdapter {

    /* renamed from: a */
    private ArrayList<EventCalendarData> f80357a;

    /* renamed from: b */
    private int f80358b;

    /* renamed from: c */
    private final Context f80359c;

    public long getItemId(int i) {
        return (long) i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/CalendarAdapter$ViewHolder;", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/CalendarAdapter;)V", "externalLabel", "Landroid/widget/TextView;", "getExternalLabel$calendar_impl_release", "()Landroid/widget/TextView;", "setExternalLabel$calendar_impl_release", "(Landroid/widget/TextView;)V", "ivCalendarColor", "Landroid/widget/ImageView;", "getIvCalendarColor$calendar_impl_release", "()Landroid/widget/ImageView;", "setIvCalendarColor$calendar_impl_release", "(Landroid/widget/ImageView;)V", "ivCalendarExchange", "getIvCalendarExchange$calendar_impl_release", "setIvCalendarExchange$calendar_impl_release", "ivCalendarGoogle", "getIvCalendarGoogle$calendar_impl_release", "setIvCalendarGoogle$calendar_impl_release", "ivCalendarSelect", "getIvCalendarSelect$calendar_impl_release", "setIvCalendarSelect$calendar_impl_release", "resignedLabel", "getResignedLabel$calendar_impl_release", "setResignedLabel$calendar_impl_release", "tvAccountName", "getTvAccountName$calendar_impl_release", "setTvAccountName$calendar_impl_release", "tvCalendarName", "getTvCalendarName$calendar_impl_release", "setTvCalendarName$calendar_impl_release", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.d$a */
    public final class ViewHolder {

        /* renamed from: b */
        private ImageView f80361b;

        /* renamed from: c */
        private TextView f80362c;

        /* renamed from: d */
        private ImageView f80363d;

        /* renamed from: e */
        private ImageView f80364e;

        /* renamed from: f */
        private ImageView f80365f;

        /* renamed from: g */
        private TextView f80366g;

        /* renamed from: h */
        private TextView f80367h;

        /* renamed from: i */
        private TextView f80368i;

        /* renamed from: a */
        public final ImageView mo115220a() {
            return this.f80361b;
        }

        /* renamed from: b */
        public final TextView mo115223b() {
            return this.f80362c;
        }

        /* renamed from: c */
        public final ImageView mo115226c() {
            return this.f80363d;
        }

        /* renamed from: d */
        public final ImageView mo115229d() {
            return this.f80364e;
        }

        /* renamed from: e */
        public final ImageView mo115232e() {
            return this.f80365f;
        }

        /* renamed from: f */
        public final TextView mo115233f() {
            return this.f80366g;
        }

        /* renamed from: g */
        public final TextView mo115234g() {
            return this.f80367h;
        }

        /* renamed from: h */
        public final TextView mo115235h() {
            return this.f80368i;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewHolder() {
        }

        /* renamed from: a */
        public final void mo115221a(ImageView imageView) {
            this.f80361b = imageView;
        }

        /* renamed from: b */
        public final void mo115224b(ImageView imageView) {
            this.f80363d = imageView;
        }

        /* renamed from: c */
        public final void mo115227c(ImageView imageView) {
            this.f80364e = imageView;
        }

        /* renamed from: d */
        public final void mo115230d(ImageView imageView) {
            this.f80365f = imageView;
        }

        /* renamed from: a */
        public final void mo115222a(TextView textView) {
            this.f80362c = textView;
        }

        /* renamed from: b */
        public final void mo115225b(TextView textView) {
            this.f80366g = textView;
        }

        /* renamed from: c */
        public final void mo115228c(TextView textView) {
            this.f80367h = textView;
        }

        /* renamed from: d */
        public final void mo115231d(TextView textView) {
            this.f80368i = textView;
        }
    }

    public int getCount() {
        return this.f80357a.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo115215a(ArrayList<EventCalendarData> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        this.f80357a.clear();
        this.f80357a.addAll(arrayList);
        this.f80358b = i;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private final void m119573a(boolean z, ViewHolder aVar) {
        if (z) {
            TextView h = aVar.mo115235h();
            if (h != null) {
                LarkNameTag.Companion fVar = LarkNameTag.f62897a;
                Context context = h.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                fVar.mo90057f(context).mo90029a(true).mo90027e().mo90004a(h);
                h.setVisibility(0);
                return;
            }
            return;
        }
        TextView h2 = aVar.mo115235h();
        if (h2 != null) {
            h2.setVisibility(8);
        }
    }

    public CalendarAdapter(ArrayList<EventCalendarData> arrayList, int i, Context context) {
        Intrinsics.checkParameterIsNotNull(arrayList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f80357a = arrayList;
        this.f80358b = i;
        this.f80359c = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder aVar;
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.f80359c).inflate(R.layout.item_event_calendar_desc, (ViewGroup) null, true);
            aVar = new ViewHolder();
            aVar.mo115221a((ImageView) view.findViewById(R.id.iv_calendar_color));
            aVar.mo115222a((TextView) view.findViewById(R.id.tv_calendar_name));
            aVar.mo115230d((ImageView) view.findViewById(R.id.iv_calendar_choose_state));
            aVar.mo115224b((ImageView) view.findViewById(R.id.iv_calendar_google));
            aVar.mo115227c((ImageView) view.findViewById(R.id.iv_calendar_exchange));
            aVar.mo115225b((TextView) view.findViewById(R.id.tv_account_name));
            aVar.mo115228c((TextView) view.findViewById(R.id.resigned_label));
            aVar.mo115231d((TextView) view.findViewById(R.id.calendarExternalLabelTv));
            Intrinsics.checkExpressionValueIsNotNull(view, "convertView");
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                aVar = (ViewHolder) tag;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.CalendarAdapter.ViewHolder");
            }
        }
        TextView b = aVar.mo115223b();
        if (b != null) {
            b.setText(this.f80357a.get(i).getCalendarName());
        }
        TextView b2 = aVar.mo115223b();
        if (b2 != null) {
            b2.requestLayout();
        }
        ImageView a = aVar.mo115220a();
        if (a != null) {
            a.setColorFilter(this.f80357a.get(i).getColor());
        }
        ImageView e = aVar.mo115232e();
        if (e != null) {
            if (i == this.f80358b) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            e.setVisibility(i3);
        }
        ImageView c = aVar.mo115226c();
        if (c != null) {
            if (this.f80357a.get(i).getCalendarType() == Calendar.Type.GOOGLE) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c.setVisibility(i2);
        }
        if (this.f80357a.get(i).getCalendarType() == Calendar.Type.EXCHANGE) {
            ImageView d = aVar.mo115229d();
            if (d != null) {
                d.setVisibility(0);
            }
            TextView f = aVar.mo115233f();
            if (f != null) {
                f.setVisibility(0);
            }
            TextView f2 = aVar.mo115233f();
            if (f2 != null) {
                f2.setText(this.f80357a.get(i).getAccountName());
            }
        } else {
            ImageView d2 = aVar.mo115229d();
            if (d2 != null) {
                d2.setVisibility(8);
            }
            TextView f3 = aVar.mo115233f();
            if (f3 != null) {
                f3.setVisibility(8);
            }
        }
        if (this.f80357a.get(i).isResigned()) {
            TextView g = aVar.mo115234g();
            if (g != null) {
                g.setVisibility(0);
            }
        } else {
            TextView g2 = aVar.mo115234g();
            if (g2 != null) {
                g2.setVisibility(8);
            }
        }
        m119573a(this.f80357a.get(i).isCrossTenant(), aVar);
        return view;
    }
}
