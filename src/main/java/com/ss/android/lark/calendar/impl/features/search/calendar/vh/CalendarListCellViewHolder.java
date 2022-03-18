package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.api.ConnectionResult;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.ss.android.lark.calendar.impl.features.calendars.CalendarLauncher;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorActivity;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;

public class CalendarListCellViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    View f82795a;

    /* renamed from: b */
    DataListItem f82796b;

    /* renamed from: c */
    View.OnClickListener f82797c;
    @BindView(ConnectionResult.SERVICE_UPDATING)
    UDCheckBox mCheckBox;
    @BindView(11466)
    TextView mInactiveIcon;
    @BindView(9828)
    ImageView mIvGoogleMark;
    @BindView(9837)
    ImageView mIvLoadingCalendar;
    @BindView(10191)
    ImageView mManagerIcon;
    @BindView(11448)
    TextView mTvCalendarSummary;

    /* renamed from: b */
    public void mo118137b() {
        this.mCheckBox.setVisibility(0);
        this.mIvLoadingCalendar.setVisibility(8);
    }

    /* renamed from: a */
    public void mo118134a() {
        this.mIvLoadingCalendar.setVisibility(0);
        this.mCheckBox.setVisibility(8);
    }

    /* renamed from: a */
    private void m123428a(final Calendar calendar) {
        this.f82795a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListCellViewHolder.View$OnClickListenerC323452 */

            public void onClick(View view) {
                Calendar calendar;
                CalendarListCellViewHolder.this.mCheckBox.setChecked(!CalendarListCellViewHolder.this.mCheckBox.isChecked());
                GeneralHitPoint.m124221a(CalendarListCellViewHolder.this.mCheckBox.isChecked(), calendar.getType());
                if (!CalendarListCellViewHolder.this.mCheckBox.isChecked() || (calendar = calendar) == null || calendar.isActive()) {
                    CalendarListCellViewHolder.this.mo118137b();
                } else {
                    CalendarListCellViewHolder.this.f82796b.mo118150a(true);
                    CalendarListCellViewHolder.this.mo118134a();
                }
                CalendarListCellViewHolder.this.f82797c.onClick(view);
            }
        });
    }

    /* renamed from: a */
    public void mo118135a(DataListItem dataListItem) {
        int i;
        final Calendar a = dataListItem.mo118146a();
        if (a != null) {
            this.f82796b = dataListItem;
            this.mCheckBox.setChecked(a.isVisible());
            this.mCheckBox.setColor(a.getBackgroundColor());
            this.mIvLoadingCalendar.setColorFilter(a.getBackgroundColor());
            this.mTvCalendarSummary.setText(a.getNoteOrLocalizeSummary());
            this.mIvGoogleMark.setVisibility(8);
            TextView textView = this.mInactiveIcon;
            if (a.isDisabled()) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            if (dataListItem.mo118158h() || a.isLoading()) {
                mo118134a();
            } else {
                mo118137b();
            }
            m123428a(a);
            if (this.f82796b.mo118157g() || !(a.getType() == Calendar.Type.PRIMARY || a.getType() == Calendar.Type.OTHER || a.getType() == Calendar.Type.RESOURCES)) {
                ao.m125222a(this.mManagerIcon);
                this.mManagerIcon.setVisibility(8);
                return;
            }
            this.mManagerIcon.setVisibility(0);
            this.mManagerIcon.setOnClickListener(new AbstractView$OnClickListenerC32626b() {
                /* class com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListCellViewHolder.C323441 */

                @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
                /* renamed from: a */
                public void mo108751a(View view) {
                    if (C30022a.f74883b.mo112687A()) {
                        CalendarLauncher.m112282b(CalendarListCellViewHolder.this.mManagerIcon.getContext(), a.getServerId());
                        CalendarHitPoint.m124104F();
                        return;
                    }
                    AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(CalendarCreatorActivity.class).mo108153a("serializable_from_type", "manager_calendar_type");
                    LargeCalendarTransmitHelper.m116183a(a, CalendarListCellViewHolder.this.f82796b.mo118146a());
                    a.mo108156b(CalendarListCellViewHolder.this.mManagerIcon.getContext());
                    CalendarHitPoint.m124104F();
                }
            });
            ao.m125223a((View) this.mManagerIcon, 16, 14);
        }
    }

    public CalendarListCellViewHolder(View view, View.OnClickListener onClickListener) {
        super(view);
        ButterKnife.bind(this, view);
        this.f82795a = view;
        this.f82797c = onClickListener;
    }

    /* renamed from: a */
    public void mo118136a(DataListItem dataListItem, boolean z) {
        Calendar a = dataListItem.mo118146a();
        if (a != null) {
            this.f82796b = dataListItem;
            this.mCheckBox.setChecked(z);
            this.mCheckBox.setColor(a.getBackgroundColor());
            this.mIvLoadingCalendar.setColorFilter(a.getBackgroundColor());
            this.mTvCalendarSummary.setText(a.getNoteOrLocalizeSummary());
            this.mIvGoogleMark.setVisibility(8);
            this.mInactiveIcon.setVisibility(8);
            this.f82795a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListCellViewHolder.View$OnClickListenerC323463 */

                public void onClick(View view) {
                    CalendarListCellViewHolder.this.mCheckBox.setChecked(!CalendarListCellViewHolder.this.mCheckBox.isChecked());
                    CalendarListCellViewHolder.this.f82797c.onClick(view);
                }
            });
            this.mManagerIcon.setVisibility(8);
        }
    }
}
