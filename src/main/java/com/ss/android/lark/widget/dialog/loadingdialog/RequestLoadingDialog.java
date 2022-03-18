package com.ss.android.lark.widget.dialog.loadingdialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;

public class RequestLoadingDialog extends Dialog {

    /* renamed from: a */
    View f143835a;
    @BindView(5899)
    ImageView imgBotReply;
    @BindView(5900)
    ImageView imgBotReplying;
    @BindView(6320)
    TextView replyText;

    public void show() {
        Context context = getContext();
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            try {
                super.show();
            } catch (Exception e) {
                Log.m165386e("RequestLoadingDialog", e);
            }
        }
    }

    /* renamed from: a */
    private void m226517a() {
        Window window = getWindow();
        window.setGravity(81);
        Point point = new Point();
        window.getWindowManager().getDefaultDisplay().getSize(point);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = (int) (((float) point.y) * 0.23f);
        window.setAttributes(attributes);
    }

    /* renamed from: b */
    public void mo197804b(CharSequence charSequence) {
        mo197802a(0, false, charSequence, true);
    }

    /* renamed from: a */
    public void mo197803a(CharSequence charSequence) {
        this.imgBotReplying.setVisibility(0);
        this.imgBotReply.setVisibility(8);
        this.replyText.setText(charSequence);
        show();
    }

    public RequestLoadingDialog(Context context) {
        super(context, R.style.MessageCardLoadingDialog);
        this.f143835a = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.message_card_action_reply, (ViewGroup) null);
        getWindow().getAttributes().flags = 48;
        getWindow().setWindowAnimations(R.style.MessageCardLoadingReplyWindow);
        m226517a();
        setContentView(this.f143835a);
        setCanceledOnTouchOutside(false);
        ButterKnife.bind(this, this.f143835a);
    }

    /* renamed from: a */
    public void mo197802a(int i, boolean z, CharSequence charSequence, boolean z2) {
        this.imgBotReplying.setVisibility(8);
        this.replyText.setText(charSequence);
        if (i == 0) {
            this.imgBotReply.setVisibility(0);
            this.imgBotReply.setImageResource(R.drawable.icon_bot_reply_success);
        } else if (i == 1) {
            this.imgBotReply.setVisibility(8);
        } else {
            this.imgBotReply.setVisibility(0);
            this.imgBotReply.setImageResource(R.drawable.icon_bot_reply_fail);
        }
        if (z && !isShowing()) {
            show();
        }
        if (z2) {
            this.f143835a.postDelayed(new Runnable() {
                /* class com.ss.android.lark.widget.dialog.loadingdialog.RequestLoadingDialog.RunnableC584321 */

                public void run() {
                    try {
                        RequestLoadingDialog.this.dismiss();
                        Log.m165378d("dismiss loading dialog: " + this);
                    } catch (Exception e) {
                        Log.m165382e(e.getMessage());
                    }
                }
            }, 500);
        }
    }
}
