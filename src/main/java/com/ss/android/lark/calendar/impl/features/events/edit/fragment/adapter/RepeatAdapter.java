package com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\"B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/RepeatAdapter;", "Landroid/widget/BaseAdapter;", "repeatTimes", "Ljava/util/ArrayList;", "", "chosenIndex", "", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;ILandroid/content/Context;)V", "getChosenIndex", "()I", "setChosenIndex", "(I)V", "getContext", "()Landroid/content/Context;", "getRepeatTimes", "()Ljava/util/ArrayList;", "setRepeatTimes", "(Ljava/util/ArrayList;)V", "getCount", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "refreshData", "", "repeatTimesStr", "index", "ViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.g */
public final class RepeatAdapter extends BaseAdapter {

    /* renamed from: a */
    private ArrayList<String> f80394a;

    /* renamed from: b */
    private int f80395b;

    /* renamed from: c */
    private final Context f80396c;

    public long getItemId(int i) {
        return (long) i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/RepeatAdapter$ViewHolder;", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/RepeatAdapter;)V", "ivChosen", "Landroid/widget/ImageView;", "getIvChosen$calendar_impl_release", "()Landroid/widget/ImageView;", "setIvChosen$calendar_impl_release", "(Landroid/widget/ImageView;)V", "tvRepeatDesc", "Landroid/widget/TextView;", "getTvRepeatDesc$calendar_impl_release", "()Landroid/widget/TextView;", "setTvRepeatDesc$calendar_impl_release", "(Landroid/widget/TextView;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.g$a */
    public final class ViewHolder {

        /* renamed from: b */
        private TextView f80398b;

        /* renamed from: c */
        private ImageView f80399c;

        /* renamed from: a */
        public final TextView mo115280a() {
            return this.f80398b;
        }

        /* renamed from: b */
        public final ImageView mo115283b() {
            return this.f80399c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewHolder() {
        }

        /* renamed from: a */
        public final void mo115281a(ImageView imageView) {
            this.f80399c = imageView;
        }

        /* renamed from: a */
        public final void mo115282a(TextView textView) {
            this.f80398b = textView;
        }
    }

    public int getCount() {
        return this.f80394a.size();
    }

    /* renamed from: a */
    public String getItem(int i) {
        String str = this.f80394a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(str, "repeatTimes[position]");
        return str;
    }

    /* renamed from: a */
    public final void mo115275a(ArrayList<String> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(arrayList, "repeatTimesStr");
        this.f80394a.clear();
        this.f80394a.addAll(arrayList);
        this.f80395b = i;
        notifyDataSetChanged();
    }

    public RepeatAdapter(ArrayList<String> arrayList, int i, Context context) {
        Intrinsics.checkParameterIsNotNull(arrayList, "repeatTimes");
        this.f80394a = arrayList;
        this.f80395b = i;
        this.f80396c = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        ViewHolder aVar;
        int i2;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (view == null) {
            aVar = new ViewHolder();
            view2 = LayoutInflater.from(this.f80396c).inflate(R.layout.item_event_repeat, (ViewGroup) null, true);
            aVar.mo115282a((TextView) view2.findViewById(R.id.tv_repeat_desc));
            aVar.mo115281a((ImageView) view2.findViewById(R.id.iv_repeat_check_state));
            Intrinsics.checkExpressionValueIsNotNull(view2, "convertView");
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                ViewHolder aVar2 = (ViewHolder) tag;
                view2 = view;
                aVar = aVar2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.RepeatAdapter.ViewHolder");
            }
        }
        TextView a = aVar.mo115280a();
        if (a != null) {
            a.setText(this.f80394a.get(i));
        }
        ImageView b = aVar.mo115283b();
        if (b != null) {
            if (this.f80395b == i) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b.setVisibility(i2);
        }
        return view2;
    }
}
