package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

public class RequestLoadingDialog extends BaseDialog {

    /* renamed from: a */
    View f78458a;

    /* renamed from: b */
    Handler f78459b = new Handler(Looper.getMainLooper());
    @BindView(9673)
    ImageView imgBotReply;
    @BindView(9674)
    LottieAnimationView imgBotReplying;
    @BindView(11199)
    TextView replyText;

    /* renamed from: a */
    public void mo112584a() {
        this.imgBotReplying.setVisibility(0);
        this.imgBotReplying.playAnimation();
        this.imgBotReply.setVisibility(8);
        this.replyText.setText(R.string.Calendar_Toast_ReplyingMobile);
        show();
    }

    /* renamed from: b */
    public void mo112590b() {
        int b = ((int) (((double) C25655d.m91902a(getContext()).mo89314b()) * 0.191904047976012d)) - C25655d.m91903b(getContext());
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = b;
            attributes.gravity = 80;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    public void mo112587a(boolean z) {
        mo112589a(z, 0, false);
    }

    /* renamed from: c */
    public void mo112592c(int i) {
        m116035b(0, i);
    }

    /* renamed from: d */
    public void mo112593d(int i) {
        m116035b(0, i);
    }

    /* renamed from: f */
    private void m116036f(int i) {
        this.f78459b.postDelayed(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog.RunnableC310871 */

            public void run() {
                try {
                    RequestLoadingDialog.this.dismiss();
                } catch (Exception unused) {
                }
            }
        }, (long) i);
    }

    /* renamed from: e */
    public void mo112594e(int i) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = UIUtils.dp2px(getContext(), (float) i);
            attributes.gravity = 80;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    public void mo112585a(int i) {
        this.imgBotReplying.setVisibility(0);
        this.imgBotReplying.playAnimation();
        this.imgBotReply.setVisibility(8);
        this.replyText.setText(i);
        show();
    }

    public RequestLoadingDialog(Activity activity) {
        super(activity, R.style.CalendarBotDialog);
        this.f78458a = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.calendar_view_bot_reply, (ViewGroup) null);
        getWindow().getAttributes().flags = 48;
        getWindow().setWindowAnimations(R.style.CalendarBotReplyWindow);
        setContentView(this.f78458a);
        setCanceledOnTouchOutside(false);
        ButterKnife.bind(this, this.f78458a);
        this.imgBotReplying.cancelAnimation();
    }

    /* renamed from: b */
    public void mo112591b(int i) {
        this.imgBotReplying.cancelAnimation();
        this.imgBotReplying.setVisibility(8);
        this.imgBotReply.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.replyText.getLayoutParams();
        layoutParams.leftMargin = 0;
        this.replyText.setLayoutParams(layoutParams);
        this.replyText.setText(i);
        show();
        m116036f(2000);
    }

    /* renamed from: a */
    public void mo112588a(boolean z, int i) {
        mo112589a(z, i, false);
    }

    /* renamed from: b */
    private void m116035b(int i, int i2) {
        this.imgBotReplying.cancelAnimation();
        this.imgBotReplying.setVisibility(8);
        int i3 = 0;
        this.imgBotReply.setVisibility(0);
        if (i != 0 || i2 == 0) {
            if (i == 0 && i2 != 0) {
                this.replyText.setText(i2);
                this.imgBotReply.setImageResource(R.drawable.ud_icon_more_close_outlined);
            } else if (i != 0 || i2 == 0) {
                this.replyText.setText("");
                this.imgBotReply.setImageResource(R.drawable.ud_icon_more_close_outlined);
            } else {
                this.replyText.setText(i2);
                this.imgBotReply.setImageResource(R.drawable.ud_icon_warning_outlined);
            }
            i3 = 2000;
        } else {
            i3 = ParticipantRepo.f117150c;
            this.replyText.setText(i2);
            this.imgBotReply.setImageResource(R.drawable.ud_icon_yes_outlined);
        }
        m116036f(i3);
    }

    /* renamed from: a */
    public void mo112586a(int i, int i2) {
        this.imgBotReplying.cancelAnimation();
        this.imgBotReplying.setVisibility(8);
        this.imgBotReply.setVisibility(8);
        ((LinearLayout.LayoutParams) this.replyText.getLayoutParams()).setMargins(0, 0, 0, 0);
        this.replyText.setText(i);
        m116036f(i2);
    }

    /* renamed from: a */
    public void mo112589a(boolean z, int i, boolean z2) {
        this.imgBotReplying.cancelAnimation();
        this.imgBotReplying.setVisibility(8);
        this.imgBotReply.setVisibility(0);
        if (z) {
            this.replyText.setText(R.string.Calendar_Detail_ResponseSuccessed);
            this.imgBotReply.setImageResource(R.drawable.ud_icon_yes_outlined);
        } else {
            if (i == 10000) {
                this.replyText.setText(R.string.Calendar_Common_EventHasBeenDeleteTip);
            } else {
                this.replyText.setText(R.string.Calendar_Detail_ResponseFailed);
            }
            this.imgBotReply.setImageResource(R.drawable.ud_icon_more_close_outlined);
        }
        if (z2 && !isShowing()) {
            show();
        }
        m116036f(ParticipantRepo.f117150c);
    }
}
