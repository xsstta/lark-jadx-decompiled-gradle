package com.ss.android.lark.calendar.impl.features.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.ui.CommonTitleBar;

public class SkinSettingFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public AbstractC32394a f82990a;

    /* renamed from: b */
    public CalendarSettingViewData f82991b;

    /* renamed from: e */
    View.OnClickListener f82992e = new View.OnClickListener() {
        /* class com.ss.android.lark.calendar.impl.features.settings.SkinSettingFragment.View$OnClickListenerC323932 */

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.settings.SkinSettingFragment.View$OnClickListenerC323932.onClick(android.view.View):void");
        }
    };
    @BindView(9683)
    ImageView imageViewDark;
    @BindView(9684)
    ImageView imageViewLight;
    @BindView(10077)
    ViewGroup layoutDark;
    @BindView(10078)
    ViewGroup layoutLight;
    @BindView(11297)
    CommonTitleBar mTitleBar;
    @BindView(11223)
    TextView textViewDark;
    @BindView(11224)
    TextView textViewLight;

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.SkinSettingFragment$a */
    public interface AbstractC32394a {
        /* renamed from: a */
        void mo118364a();

        /* renamed from: a */
        void mo118365a(CalendarSettingViewData calendarSettingViewData);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        this.f82990a.mo118364a();
        return true;
    }

    public SkinSettingFragment() {
    }

    /* renamed from: c */
    private void m123615c() {
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.setTitle(R.string.Calendar_NewSettings_EventColor);
        this.mTitleBar.setMainTitleTextStyle(1);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.SkinSettingFragment.View$OnClickListenerC323921 */

            public void onClick(View view) {
                SkinSettingFragment.this.mo113714e();
            }
        });
        this.layoutDark.setOnClickListener(this.f82992e);
        this.imageViewDark.setOnClickListener(this.f82992e);
        this.textViewDark.setOnClickListener(this.f82992e);
        this.layoutLight.setOnClickListener(this.f82992e);
        this.imageViewLight.setOnClickListener(this.f82992e);
        this.textViewLight.setOnClickListener(this.f82992e);
        mo118361b();
    }

    /* renamed from: b */
    public void mo118361b() {
        CalendarSettingViewData calendarSettingViewData = this.f82991b;
        if (calendarSettingViewData != null) {
            if (CalendarSkinColorTool.SkinType.DARK.equals(calendarSettingViewData.getSkinType())) {
                this.imageViewDark.setImageResource(R.drawable.bg_calendar_skin_img_chosen);
                this.imageViewLight.setImageResource(R.drawable.bg_calendar_skin_img);
                this.textViewDark.setBackgroundResource(R.drawable.bg_calendar_skin_text_chosen);
                this.textViewDark.setTextColor(-1);
                this.textViewLight.setBackgroundResource(R.drawable.bg_calendar_skin_text);
                this.textViewLight.setTextColor(getActivity().getResources().getColor(R.color.primary_pri_500));
                return;
            }
            this.imageViewLight.setImageResource(R.drawable.bg_calendar_skin_img_chosen);
            this.imageViewDark.setImageResource(R.drawable.bg_calendar_skin_img);
            this.textViewLight.setBackgroundResource(R.drawable.bg_calendar_skin_text_chosen);
            this.textViewLight.setTextColor(-1);
            this.textViewDark.setBackgroundResource(R.drawable.bg_calendar_skin_text);
            this.textViewDark.setTextColor(getActivity().getResources().getColor(R.color.primary_pri_500));
        }
    }

    /* renamed from: a */
    public void mo118360a(CalendarSettingViewData calendarSettingViewData) {
        this.f82991b = calendarSettingViewData;
        mo118361b();
    }

    public SkinSettingFragment(AbstractC32394a aVar, CalendarSettingViewData calendarSettingViewData) {
        this.f82990a = aVar;
        this.f82991b = calendarSettingViewData;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_calendar_skin_setting, (ViewGroup) null);
        ButterKnife.bind(this, inflate);
        m123615c();
        return inflate;
    }
}
