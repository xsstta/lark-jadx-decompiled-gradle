package com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ReminderFragmentData;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J$\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010!\u001a\u00020\u00102\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000eH\u0002J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/ReminderAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "reminderStrList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "mChosenIndexs", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "mIsCheckStateSingle", "", "adjustReminderCheckState", "", "viewHolder", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/ReminderAdapter$ViewHolder;", "position", "getCount", "getItem", "", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "refreshData", "reminderData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ReminderFragmentData;", "setChosenIndexs", "chosenIndexs", "setIsCheckStateSingle", "isCheckStateSingle", "setReminderData", "ViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.f */
public final class ReminderAdapter extends BaseAdapter {

    /* renamed from: a */
    private HashSet<Integer> f80387a = new HashSet<>();

    /* renamed from: b */
    private boolean f80388b;

    /* renamed from: c */
    private final Context f80389c;

    /* renamed from: d */
    private final ArrayList<String> f80390d;

    public long getItemId(int i) {
        return (long) i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/ReminderAdapter$ViewHolder;", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/ReminderAdapter;)V", "ivReminderCheckState", "Landroid/widget/ImageView;", "getIvReminderCheckState$calendar_impl_release", "()Landroid/widget/ImageView;", "setIvReminderCheckState$calendar_impl_release", "(Landroid/widget/ImageView;)V", "tvReminderDesc", "Landroid/widget/TextView;", "getTvReminderDesc$calendar_impl_release", "()Landroid/widget/TextView;", "setTvReminderDesc$calendar_impl_release", "(Landroid/widget/TextView;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.f$a */
    public final class ViewHolder {

        /* renamed from: b */
        private TextView f80392b;

        /* renamed from: c */
        private ImageView f80393c;

        /* renamed from: a */
        public final TextView mo115270a() {
            return this.f80392b;
        }

        /* renamed from: b */
        public final ImageView mo115273b() {
            return this.f80393c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewHolder() {
        }

        /* renamed from: a */
        public final void mo115271a(ImageView imageView) {
            this.f80393c = imageView;
        }

        /* renamed from: a */
        public final void mo115272a(TextView textView) {
            this.f80392b = textView;
        }
    }

    public int getCount() {
        return this.f80390d.size();
    }

    /* renamed from: a */
    private final void m119616a(boolean z) {
        this.f80388b = z;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo115263a(ReminderFragmentData eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "reminderData");
        mo115264a(eVar.mo115094b());
        m119616a(eVar.mo115095c());
    }

    /* renamed from: b */
    public final void mo115265b(ReminderFragmentData eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "reminderData");
        this.f80390d.clear();
        this.f80390d.addAll(eVar.mo115093a());
        mo115263a(eVar);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo115264a(HashSet<Integer> hashSet) {
        Intrinsics.checkParameterIsNotNull(hashSet, "chosenIndexs");
        this.f80387a.clear();
        this.f80387a.addAll(hashSet);
    }

    public ReminderAdapter(Context context, ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(arrayList, "reminderStrList");
        this.f80389c = context;
        this.f80390d = arrayList;
    }

    /* renamed from: a */
    private final void m119615a(ViewHolder aVar, int i) {
        if (!this.f80388b) {
            if (this.f80387a.contains(Integer.valueOf(i))) {
                ImageView b = aVar.mo115273b();
                if (b != null) {
                    Context context = this.f80389c;
                    b.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_yes_filled, UDColorUtils.getColor(context, R.color.primary_pri_500)));
                }
            } else {
                ImageView b2 = aVar.mo115273b();
                if (b2 != null) {
                    Context context2 = this.f80389c;
                    b2.setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_ellipse_outlined, UDColorUtils.getColor(context2, R.color.icon_n3)));
                }
            }
            ImageView b3 = aVar.mo115273b();
            if (b3 != null) {
                b3.setVisibility(0);
            }
        } else if (this.f80387a.contains(Integer.valueOf(i))) {
            ImageView b4 = aVar.mo115273b();
            if (b4 != null) {
                b4.setImageResource(R.drawable.ud_icon_list_check_outlined);
            }
            ImageView b5 = aVar.mo115273b();
            if (b5 != null) {
                b5.setColorFilter(C57582a.m223616d(this.f80389c, R.color.primary_pri_500));
            }
            ImageView b6 = aVar.mo115273b();
            if (b6 != null) {
                b6.setVisibility(0);
            }
        } else {
            ImageView b7 = aVar.mo115273b();
            if (b7 != null) {
                b7.setVisibility(8);
            }
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder aVar;
        TextView textView;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (view == null) {
            ImageView imageView = null;
            view = LayoutInflater.from(this.f80389c).inflate(R.layout.item_event_reminder_desc, (ViewGroup) null, true);
            aVar = new ViewHolder();
            if (view != null) {
                textView = (TextView) view.findViewById(R.id.tv_reminder_desc);
            } else {
                textView = null;
            }
            aVar.mo115272a(textView);
            if (view != null) {
                imageView = (ImageView) view.findViewById(R.id.iv_reminder_check_state);
            }
            aVar.mo115271a(imageView);
            Intrinsics.checkExpressionValueIsNotNull(view, "convertView");
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                aVar = (ViewHolder) tag;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.ReminderAdapter.ViewHolder");
            }
        }
        TextView a = aVar.mo115270a();
        if (a != null) {
            a.setText(this.f80390d.get(i));
        }
        m119615a(aVar, i);
        return view;
    }
}
