package com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0007J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SwitchView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lastSelectedIndex", "viewSelectListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SwitchView$IOnViewSelectListener;", "getViewSelectListener", "()Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SwitchView$IOnViewSelectListener;", "setViewSelectListener", "(Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SwitchView$IOnViewSelectListener;)V", "setDayViewStatus", "", "isSelected", "", "setListViewStatus", "setMonthViewStatus", "setSelectView", "selectIndex", "setThreeDayViewStatus", "Companion", "IOnViewSelectListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SwitchView extends LinearLayout {

    /* renamed from: b */
    public static final Companion f76480b = new Companion(null);

    /* renamed from: a */
    public int f76481a;

    /* renamed from: c */
    private IOnViewSelectListener f76482c;

    /* renamed from: d */
    private HashMap f76483d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SwitchView$IOnViewSelectListener;", "", "onSelected", "", "select", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SwitchView$b */
    public interface IOnViewSelectListener {
        /* renamed from: a */
        void mo109861a(int i);
    }

    public SwitchView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo110297a(int i) {
        if (this.f76483d == null) {
            this.f76483d = new HashMap();
        }
        View view = (View) this.f76483d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76483d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SwitchView$Companion;", "", "()V", "STATUS_DAY", "", "STATUS_LIST", "STATUS_MONTH", "STATUS_THREE_DAY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SwitchView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final IOnViewSelectListener getViewSelectListener() {
        return this.f76482c;
    }

    public final void setViewSelectListener(IOnViewSelectListener bVar) {
        this.f76482c = bVar;
    }

    public final void setSelectView(int i) {
        this.f76481a = i;
        if (i == 1) {
            setListViewStatus(false);
            setDayViewStatus(true);
            setThreeDayViewStatus(false);
            setMonthViewStatus(false);
        } else if (i == 2) {
            setListViewStatus(true);
            setDayViewStatus(false);
            setThreeDayViewStatus(false);
            setMonthViewStatus(false);
        } else if (i != 3) {
            setListViewStatus(false);
            setDayViewStatus(false);
            setThreeDayViewStatus(true);
            setMonthViewStatus(false);
        } else {
            setListViewStatus(false);
            setDayViewStatus(false);
            setThreeDayViewStatus(false);
            setMonthViewStatus(true);
        }
    }

    private final void setDayViewStatus(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo110297a(R.id.dayZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "dayZone");
            linearLayout.setBackground(UIHelper.getDrawable(R.drawable.bg_view_switcher_selected));
            ((ImageView) mo110297a(R.id.dayIv)).setColorFilter(UIHelper.getColor(R.color.primary_pri_500));
            ((TextView) mo110297a(R.id.dayTxt)).setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo110297a(R.id.dayZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "dayZone");
        linearLayout2.setBackground(null);
        ((ImageView) mo110297a(R.id.dayIv)).setColorFilter(UIHelper.getColor(R.color.icon_n2));
        ((TextView) mo110297a(R.id.dayTxt)).setTextColor(UIHelper.getColor(R.color.text_caption));
    }

    private final void setListViewStatus(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo110297a(R.id.listZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "listZone");
            linearLayout.setBackground(UIHelper.getDrawable(R.drawable.bg_view_switcher_selected));
            ((ImageView) mo110297a(R.id.listIv)).setColorFilter(UIHelper.getColor(R.color.primary_pri_500));
            ((TextView) mo110297a(R.id.listTxt)).setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo110297a(R.id.listZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "listZone");
        linearLayout2.setBackground(null);
        ((ImageView) mo110297a(R.id.listIv)).setColorFilter(UIHelper.getColor(R.color.icon_n2));
        ((TextView) mo110297a(R.id.listTxt)).setTextColor(UIHelper.getColor(R.color.text_caption));
    }

    private final void setMonthViewStatus(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo110297a(R.id.monthZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "monthZone");
            linearLayout.setBackground(UIHelper.getDrawable(R.drawable.bg_view_switcher_selected));
            ((ImageView) mo110297a(R.id.monthIv)).setColorFilter(UIHelper.getColor(R.color.primary_pri_500));
            ((TextView) mo110297a(R.id.monthTxt)).setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo110297a(R.id.monthZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "monthZone");
        linearLayout2.setBackground(null);
        ((ImageView) mo110297a(R.id.monthIv)).setColorFilter(UIHelper.getColor(R.color.icon_n2));
        ((TextView) mo110297a(R.id.monthTxt)).setTextColor(UIHelper.getColor(R.color.text_caption));
    }

    private final void setThreeDayViewStatus(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo110297a(R.id.threeDayZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "threeDayZone");
            linearLayout.setBackground(UIHelper.getDrawable(R.drawable.bg_view_switcher_selected));
            ((ImageView) mo110297a(R.id.threeDayIv)).setColorFilter(UIHelper.getColor(R.color.primary_pri_500));
            ((TextView) mo110297a(R.id.threeDayTxt)).setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo110297a(R.id.threeDayZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "threeDayZone");
        linearLayout2.setBackground(null);
        ((ImageView) mo110297a(R.id.threeDayIv)).setColorFilter(UIHelper.getColor(R.color.icon_n2));
        ((TextView) mo110297a(R.id.threeDayTxt)).setTextColor(UIHelper.getColor(R.color.text_caption));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.view_switcher, (ViewGroup) this, true);
        LinearLayout linearLayout = (LinearLayout) mo110297a(R.id.listZone);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SwitchView.View$OnClickListenerC305731 */

                /* renamed from: a */
                final /* synthetic */ SwitchView f76484a;

                {
                    this.f76484a = r1;
                }

                public final void onClick(View view) {
                    if (this.f76484a.f76481a != 2) {
                        this.f76484a.setSelectView(2);
                        C30667a.m114019a(2);
                        IOnViewSelectListener viewSelectListener = this.f76484a.getViewSelectListener();
                        if (viewSelectListener != null) {
                            viewSelectListener.mo109861a(2);
                        }
                    }
                }
            });
        }
        LinearLayout linearLayout2 = (LinearLayout) mo110297a(R.id.dayZone);
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SwitchView.View$OnClickListenerC305742 */

                /* renamed from: a */
                final /* synthetic */ SwitchView f76485a;

                {
                    this.f76485a = r1;
                }

                public final void onClick(View view) {
                    if (this.f76485a.f76481a != 1) {
                        this.f76485a.setSelectView(1);
                        C30667a.m114019a(1);
                        IOnViewSelectListener viewSelectListener = this.f76485a.getViewSelectListener();
                        if (viewSelectListener != null) {
                            viewSelectListener.mo109861a(1);
                        }
                    }
                }
            });
        }
        LinearLayout linearLayout3 = (LinearLayout) mo110297a(R.id.threeDayZone);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SwitchView.View$OnClickListenerC305753 */

                /* renamed from: a */
                final /* synthetic */ SwitchView f76486a;

                {
                    this.f76486a = r1;
                }

                public final void onClick(View view) {
                    if (this.f76486a.f76481a != 0) {
                        this.f76486a.setSelectView(0);
                        C30667a.m114019a(0);
                        IOnViewSelectListener viewSelectListener = this.f76486a.getViewSelectListener();
                        if (viewSelectListener != null) {
                            viewSelectListener.mo109861a(0);
                        }
                    }
                }
            });
        }
        LinearLayout linearLayout4 = (LinearLayout) mo110297a(R.id.monthZone);
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SwitchView.View$OnClickListenerC305764 */

                /* renamed from: a */
                final /* synthetic */ SwitchView f76487a;

                {
                    this.f76487a = r1;
                }

                public final void onClick(View view) {
                    if (this.f76487a.f76481a != 3) {
                        this.f76487a.setSelectView(3);
                        C30667a.m114019a(3);
                        IOnViewSelectListener viewSelectListener = this.f76487a.getViewSelectListener();
                        if (viewSelectListener != null) {
                            viewSelectListener.mo109861a(3);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
