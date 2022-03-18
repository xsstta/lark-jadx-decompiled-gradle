package com.ss.android.lark.notification.setting.impl.setting.view;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class MuteOnPCLoginView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MuteOnPCLoginView f122324a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MuteOnPCLoginView muteOnPCLoginView = this.f122324a;
        if (muteOnPCLoginView != null) {
            this.f122324a = null;
            muteOnPCLoginView.mMuteOptionView = null;
            muteOnPCLoginView.mMuteSwitcher = null;
            muteOnPCLoginView.mExtraOption = null;
            muteOnPCLoginView.mMuteDingSwitcher = null;
            muteOnPCLoginView.mMuteMentionSwitcher = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MuteOnPCLoginView_ViewBinding(MuteOnPCLoginView muteOnPCLoginView, View view) {
        this.f122324a = muteOnPCLoginView;
        muteOnPCLoginView.mMuteOptionView = Utils.findRequiredView(view, R.id.mute_option, "field 'mMuteOptionView'");
        muteOnPCLoginView.mMuteSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.mute_switcher, "field 'mMuteSwitcher'", SwitchButtonWithLoading.class);
        muteOnPCLoginView.mExtraOption = Utils.findRequiredView(view, R.id.extra_option, "field 'mExtraOption'");
        muteOnPCLoginView.mMuteDingSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.ding_switcher, "field 'mMuteDingSwitcher'", SwitchButtonWithLoading.class);
        muteOnPCLoginView.mMuteMentionSwitcher = (SwitchButtonWithLoading) Utils.findRequiredViewAsType(view, R.id.mention_switcher, "field 'mMuteMentionSwitcher'", SwitchButtonWithLoading.class);
    }
}
