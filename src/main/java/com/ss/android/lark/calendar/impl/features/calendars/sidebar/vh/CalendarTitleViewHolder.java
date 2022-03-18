package com.ss.android.lark.calendar.impl.features.calendars.sidebar.vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.utils.an;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/vh/CalendarTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "calIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "calTitle", "Landroid/widget/TextView;", "divider", "bindItem", "", "item", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.a.b */
public final class CalendarTitleViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final int f76432a = DataListItem.TYPE.TITLE.getIntValue();

    /* renamed from: b */
    public static final int f76433b = R.layout.calendar_holder_sidebar_cal_title;

    /* renamed from: c */
    public static final Companion f76434c = new Companion(null);

    /* renamed from: d */
    private final View f76435d;

    /* renamed from: e */
    private final TextView f76436e;

    /* renamed from: f */
    private final ImageView f76437f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/vh/CalendarTitleViewHolder$Companion;", "", "()V", "layoutRes", "", "getLayoutRes", "()I", "viewType", "getViewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo110238a() {
            return CalendarTitleViewHolder.f76432a;
        }

        /* renamed from: b */
        public final int mo110239b() {
            return CalendarTitleViewHolder.f76433b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarTitleViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "v");
        this.f76435d = view.findViewById(R.id.divider);
        this.f76436e = (TextView) view.findViewById(R.id.cal_title);
        this.f76437f = (ImageView) view.findViewById(R.id.cal_icon);
    }

    /* renamed from: a */
    public final void mo110237a(DataListItem dataListItem) {
        Intrinsics.checkParameterIsNotNull(dataListItem, "item");
        View view = this.f76435d;
        Intrinsics.checkExpressionValueIsNotNull(view, "divider");
        an.m125213a(view, dataListItem.mo109835t());
        TextView textView = this.f76436e;
        Intrinsics.checkExpressionValueIsNotNull(textView, "calTitle");
        textView.setText(dataListItem.mo109834s());
        ImageView imageView = this.f76437f;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "calIcon");
        int i = 0;
        if (dataListItem.mo109838w()) {
            this.f76437f.setImageResource(R.drawable.ud_icon_google_colorful);
        } else if (dataListItem.mo109839x()) {
            this.f76437f.setImageResource(R.drawable.ud_icon_exchange_colorful);
        } else if (dataListItem.mo109836u()) {
            this.f76437f.setImageResource(R.drawable.ud_icon_phone_colorful);
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }
}
