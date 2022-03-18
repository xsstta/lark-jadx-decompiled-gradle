package com.ss.android.vc.lark.setting;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;

/* renamed from: com.ss.android.vc.lark.setting.d */
public class C61190d extends BaseFragment {

    /* renamed from: a */
    private View f153251a;

    /* renamed from: b */
    private C61198f f153252b;

    /* renamed from: c */
    private Activity f153253c;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C61198f fVar = this.f153252b;
        if (fVar != null) {
            fVar.destroy();
            this.f153252b = null;
        }
    }

    /* renamed from: b */
    private void m237980b() {
        C61198f fVar = new C61198f(new C61191e(), new C61207g(this.f153253c, this.f153251a));
        this.f153252b = fVar;
        fVar.create();
    }

    /* renamed from: a */
    private void m237979a() {
        if (DesktopUtil.m144307b()) {
            CommonTitleBar commonTitleBar = (CommonTitleBar) this.f153251a.findViewById(R.id.titlebar);
            commonTitleBar.setLeftText(R.string.View_G_CallsAndMeetings);
            commonTitleBar.setLeftTextPadding(20, 0, 0, 0);
            commonTitleBar.getLeftText().setCompoundDrawables(null, null, null, null);
            commonTitleBar.setLeftTextSize(17.0f);
            commonTitleBar.setBackgroundColor(0);
            commonTitleBar.setTitle("");
            if (Build.VERSION.SDK_INT >= 23) {
                TextView textView = (TextView) this.f153251a.findViewById(R.id.notification_label);
                textView.setTextAppearance(R.style.VcSettingLKPTextStyle);
                TextView textView2 = (TextView) this.f153251a.findViewById(R.id.notification_hint);
                textView2.setTextAppearance(R.style.VcSettingLKPHintStyle);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.topMargin = 10;
                layoutParams.bottomMargin = 2;
                textView.setLayoutParams(layoutParams);
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams2.bottomMargin = 10;
                textView2.setLayoutParams(layoutParams2);
                ((TextView) this.f153251a.findViewById(R.id.play_chimes_label)).setTextAppearance(R.style.VcSettingLKPTextStyle);
                TextView textView3 = (TextView) this.f153251a.findViewById(R.id.subtitle_title);
                textView3.setTextAppearance(R.style.VcSettingLKPHintStyle);
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) textView3.getLayoutParams();
                layoutParams3.leftMargin += 16;
                textView3.setLayoutParams(layoutParams3);
                ((TextView) this.f153251a.findViewById(R.id.subtitle_label)).setTextAppearance(R.style.VcSettingLKPTextStyle);
                TextView textView4 = (TextView) this.f153251a.findViewById(R.id.language_interpretation_title);
                textView4.setTextAppearance(R.style.VcSettingLKPHintStyle);
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) textView4.getLayoutParams();
                layoutParams4.leftMargin += 16;
                textView4.setLayoutParams(layoutParams4);
                ((TextView) this.f153251a.findViewById(R.id.language_interpretation_hint)).setTextAppearance(R.style.VcSettingLKPHintStyle);
                ((TextView) this.f153251a.findViewById(R.id.language_interpretation_label)).setTextAppearance(R.style.VcSettingLKPTextStyle);
                View findViewById = this.f153251a.findViewById(R.id.bottom_divider);
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams5.leftMargin = 16;
                layoutParams5.rightMargin = 16;
                findViewById.setLayoutParams(layoutParams5);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f153251a.findViewById(R.id.notification);
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams6.leftMargin = 16;
            layoutParams6.rightMargin = 16;
            constraintLayout.setLayoutParams(layoutParams6);
            constraintLayout.setBackgroundResource(R.drawable.bg_vc_setting_lkp_top_corner);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f153251a.findViewById(R.id.play_chimes);
            ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) constraintLayout2.getLayoutParams();
            layoutParams7.leftMargin = 16;
            layoutParams7.rightMargin = 16;
            constraintLayout2.setLayoutParams(layoutParams7);
            constraintLayout2.setBackgroundResource(R.drawable.bg_vc_setting_lkp_bottom_corner);
            ConstraintLayout constraintLayout3 = (ConstraintLayout) this.f153251a.findViewById(R.id.subtitle);
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) constraintLayout3.getLayoutParams();
            layoutParams8.leftMargin = 16;
            layoutParams8.rightMargin = 16;
            constraintLayout3.setLayoutParams(layoutParams8);
            constraintLayout3.setBackgroundResource(R.drawable.bg_vc_setting_lkp_all_corner);
            ConstraintLayout constraintLayout4 = (ConstraintLayout) this.f153251a.findViewById(R.id.language_interpretation);
            ConstraintLayout.LayoutParams layoutParams9 = (ConstraintLayout.LayoutParams) constraintLayout4.getLayoutParams();
            layoutParams9.leftMargin = 16;
            layoutParams9.rightMargin = 16;
            constraintLayout4.setLayoutParams(layoutParams9);
            constraintLayout4.setBackgroundResource(R.drawable.bg_vc_setting_lkp_all_corner);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m237980b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f153251a = layoutInflater.inflate(R.layout.activity_mine_setting_video_chat, viewGroup, false);
        m237979a();
        this.f153253c = getActivity();
        return this.f153251a;
    }
}
