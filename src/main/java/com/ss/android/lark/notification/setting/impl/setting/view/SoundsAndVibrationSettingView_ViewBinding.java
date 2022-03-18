package com.ss.android.lark.notification.setting.impl.setting.view;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class SoundsAndVibrationSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SoundsAndVibrationSettingView f122343a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SoundsAndVibrationSettingView soundsAndVibrationSettingView = this.f122343a;
        if (soundsAndVibrationSettingView != null) {
            this.f122343a = null;
            soundsAndVibrationSettingView.mDingSettingView = null;
            soundsAndVibrationSettingView.mMentionSettingView = null;
            soundsAndVibrationSettingView.mRegularSettingView = null;
            soundsAndVibrationSettingView.mDingOffWarnView = null;
            soundsAndVibrationSettingView.mRegularOffWarnView = null;
            soundsAndVibrationSettingView.mMentionOffWarnView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SoundsAndVibrationSettingView_ViewBinding(SoundsAndVibrationSettingView soundsAndVibrationSettingView, View view) {
        this.f122343a = soundsAndVibrationSettingView;
        soundsAndVibrationSettingView.mDingSettingView = Utils.findRequiredView(view, R.id.ding_setting, "field 'mDingSettingView'");
        soundsAndVibrationSettingView.mMentionSettingView = Utils.findRequiredView(view, R.id.mention_setting, "field 'mMentionSettingView'");
        soundsAndVibrationSettingView.mRegularSettingView = Utils.findRequiredView(view, R.id.regular_setting, "field 'mRegularSettingView'");
        soundsAndVibrationSettingView.mDingOffWarnView = Utils.findRequiredView(view, R.id.ding_setting_off, "field 'mDingOffWarnView'");
        soundsAndVibrationSettingView.mRegularOffWarnView = Utils.findRequiredView(view, R.id.regular_setting_off, "field 'mRegularOffWarnView'");
        soundsAndVibrationSettingView.mMentionOffWarnView = Utils.findRequiredView(view, R.id.mention_setting_off, "field 'mMentionOffWarnView'");
    }
}
