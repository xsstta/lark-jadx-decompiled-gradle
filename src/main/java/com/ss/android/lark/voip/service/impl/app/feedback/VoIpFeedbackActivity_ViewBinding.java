package com.ss.android.lark.voip.service.impl.app.feedback;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class VoIpFeedbackActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VoIpFeedbackActivity f142793a;

    /* renamed from: b */
    private View f142794b;

    /* renamed from: c */
    private View f142795c;

    /* renamed from: d */
    private View f142796d;

    /* renamed from: e */
    private View f142797e;

    /* renamed from: f */
    private View f142798f;

    /* renamed from: g */
    private View f142799g;

    /* renamed from: h */
    private View f142800h;

    /* renamed from: i */
    private View f142801i;

    /* renamed from: j */
    private View f142802j;

    @Override // butterknife.Unbinder
    public void unbind() {
        VoIpFeedbackActivity voIpFeedbackActivity = this.f142793a;
        if (voIpFeedbackActivity != null) {
            this.f142793a = null;
            voIpFeedbackActivity.mFeedBackAwesome = null;
            voIpFeedbackActivity.mFeedBackBad = null;
            voIpFeedbackActivity.mFeedBackBottom = null;
            voIpFeedbackActivity.mFeedBack = null;
            voIpFeedbackActivity.mTagContainer = null;
            voIpFeedbackActivity.mFeedBackHint = null;
            voIpFeedbackActivity.mFeedBackBody = null;
            voIpFeedbackActivity.mComment = null;
            voIpFeedbackActivity.feedbackPartingLine = null;
            voIpFeedbackActivity.feedbackContainer = null;
            voIpFeedbackActivity.negativeReasons = null;
            this.f142794b.setOnClickListener(null);
            this.f142794b = null;
            this.f142795c.setOnClickListener(null);
            this.f142795c = null;
            this.f142796d.setOnClickListener(null);
            this.f142796d = null;
            this.f142797e.setOnClickListener(null);
            this.f142797e = null;
            this.f142798f.setOnClickListener(null);
            this.f142798f = null;
            this.f142799g.setOnClickListener(null);
            this.f142799g = null;
            this.f142800h.setOnClickListener(null);
            this.f142800h = null;
            this.f142801i.setOnClickListener(null);
            this.f142801i = null;
            this.f142802j.setOnClickListener(null);
            this.f142802j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VoIpFeedbackActivity_ViewBinding(final VoIpFeedbackActivity voIpFeedbackActivity, View view) {
        this.f142793a = voIpFeedbackActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.feed_back_awesome, "field 'mFeedBackAwesome' and method 'onClickAwesome'");
        voIpFeedbackActivity.mFeedBackAwesome = (TextView) Utils.castView(findRequiredView, R.id.feed_back_awesome, "field 'mFeedBackAwesome'", TextView.class);
        this.f142794b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580541 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickAwesome();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.feed_back_bad, "field 'mFeedBackBad' and method 'onClickBad'");
        voIpFeedbackActivity.mFeedBackBad = (TextView) Utils.castView(findRequiredView2, R.id.feed_back_bad, "field 'mFeedBackBad'", TextView.class);
        this.f142795c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580552 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickBad();
            }
        });
        voIpFeedbackActivity.mFeedBackBottom = Utils.findRequiredView(view, R.id.feed_back_bottom, "field 'mFeedBackBottom'");
        View findRequiredView3 = Utils.findRequiredView(view, R.id.feed_back, "field 'mFeedBack' and method 'onClickFeedBack'");
        voIpFeedbackActivity.mFeedBack = findRequiredView3;
        this.f142796d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580563 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickFeedBack();
            }
        });
        voIpFeedbackActivity.mTagContainer = Utils.findRequiredView(view, R.id.feed_back_tag_container, "field 'mTagContainer'");
        voIpFeedbackActivity.mFeedBackHint = Utils.findRequiredView(view, R.id.feed_back_hint, "field 'mFeedBackHint'");
        voIpFeedbackActivity.mFeedBackBody = Utils.findRequiredView(view, R.id.feed_back_body, "field 'mFeedBackBody'");
        voIpFeedbackActivity.mComment = (TextView) Utils.findRequiredViewAsType(view, R.id.comment, "field 'mComment'", TextView.class);
        voIpFeedbackActivity.feedbackPartingLine = Utils.findRequiredView(view, R.id.feed_back_parting_line, "field 'feedbackPartingLine'");
        voIpFeedbackActivity.feedbackContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.feed_back_container, "field 'feedbackContainer'", LinearLayout.class);
        voIpFeedbackActivity.negativeReasons = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.negative_feedback_reasons, "field 'negativeReasons'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.feed_back_close, "method 'onClickClose'");
        this.f142797e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580574 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickClose();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.feed_back_tag_hung_up_unexpectedly, "method 'onClickHungUp'");
        this.f142798f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580585 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickHungUp((TextView) Utils.castParam(view, "doClick", 0, "onClickHungUp", 0, TextView.class));
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.feed_back_tag_not_clear_and_noisy, "method 'onClickNoise'");
        this.f142799g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580596 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickNoise((TextView) Utils.castParam(view, "doClick", 0, "onClickNoise", 0, TextView.class));
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, R.id.feed_back_tag_goes_on_and_off, "method 'onClickGoesOff'");
        this.f142800h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580607 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickGoesOff((TextView) Utils.castParam(view, "doClick", 0, "onClickGoesOff", 0, TextView.class));
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.feed_back_tag_cannot_hear, "method 'onClickSilence'");
        this.f142801i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580618 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickSilence((TextView) Utils.castParam(view, "doClick", 0, "onClickSilence", 0, TextView.class));
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, R.id.confirm_feed_back, "method 'onClickConfirm'");
        this.f142802j = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity_ViewBinding.C580629 */

            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View view) {
                voIpFeedbackActivity.onClickConfirm();
            }
        });
    }
}
