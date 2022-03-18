package com.ss.android.lark.voip.service.impl.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonLoadingView;

public class VoIpCallView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VoIpCallView f142752a;

    /* renamed from: b */
    private View f142753b;

    @Override // butterknife.Unbinder
    public void unbind() {
        VoIpCallView voIpCallView = this.f142752a;
        if (voIpCallView != null) {
            this.f142752a = null;
            voIpCallView.mBlurBkg = null;
            voIpCallView.mBlurImageFg = null;
            voIpCallView.mStartLoadingView = null;
            voIpCallView.mVoIPContent = null;
            voIpCallView.mChatterAvatar = null;
            voIpCallView.mChatterName = null;
            voIpCallView.mCallStatus = null;
            voIpCallView.mConfirm = null;
            voIpCallView.mCancel = null;
            voIpCallView.mMuteTip = null;
            voIpCallView.mSpeakerTip = null;
            voIpCallView.mVoipCallContainer = null;
            voIpCallView.mHeadRipple = null;
            voIpCallView.mContract = null;
            voIpCallView.mStatusToast = null;
            this.f142753b.setOnClickListener(null);
            this.f142753b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VoIpCallView_ViewBinding(final VoIpCallView voIpCallView, View view) {
        this.f142752a = voIpCallView;
        voIpCallView.mBlurBkg = (ImageView) Utils.findRequiredViewAsType(view, R.id.blur_bkg, "field 'mBlurBkg'", ImageView.class);
        voIpCallView.mBlurImageFg = Utils.findRequiredView(view, R.id.blurImageFg, "field 'mBlurImageFg'");
        voIpCallView.mStartLoadingView = (CommonLoadingView) Utils.findRequiredViewAsType(view, R.id.start_loading, "field 'mStartLoadingView'", CommonLoadingView.class);
        voIpCallView.mVoIPContent = Utils.findRequiredView(view, R.id.layout_voip_content, "field 'mVoIPContent'");
        voIpCallView.mChatterAvatar = (ImageView) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mChatterAvatar'", ImageView.class);
        voIpCallView.mChatterName = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mChatterName'", TextView.class);
        voIpCallView.mCallStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.call_status, "field 'mCallStatus'", TextView.class);
        voIpCallView.mConfirm = (TextView) Utils.findRequiredViewAsType(view, R.id.confirm_btn, "field 'mConfirm'", TextView.class);
        voIpCallView.mCancel = (TextView) Utils.findRequiredViewAsType(view, R.id.cancel_btn, "field 'mCancel'", TextView.class);
        voIpCallView.mMuteTip = (TextView) Utils.findRequiredViewAsType(view, R.id.mute_tip, "field 'mMuteTip'", TextView.class);
        voIpCallView.mSpeakerTip = (TextView) Utils.findRequiredViewAsType(view, R.id.speaker_tip, "field 'mSpeakerTip'", TextView.class);
        voIpCallView.mVoipCallContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.voip_call_container, "field 'mVoipCallContainer'", ViewGroup.class);
        voIpCallView.mHeadRipple = (LKUILottieAnimationView) Utils.findRequiredViewAsType(view, R.id.head_ripple, "field 'mHeadRipple'", LKUILottieAnimationView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.contract_voice_call, "field 'mContract' and method 'onMinimizeVoIP'");
        voIpCallView.mContract = findRequiredView;
        this.f142753b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpCallView_ViewBinding.C580311 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpCallView.onMinimizeVoIP();
            }
        });
        voIpCallView.mStatusToast = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.voip_network_status_toast, "field 'mStatusToast'", FrameLayout.class);
    }
}
