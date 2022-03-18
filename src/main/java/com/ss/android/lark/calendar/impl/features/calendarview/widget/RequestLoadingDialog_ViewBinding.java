package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;

public class RequestLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RequestLoadingDialog f78461a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RequestLoadingDialog requestLoadingDialog = this.f78461a;
        if (requestLoadingDialog != null) {
            this.f78461a = null;
            requestLoadingDialog.imgBotReply = null;
            requestLoadingDialog.imgBotReplying = null;
            requestLoadingDialog.replyText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RequestLoadingDialog_ViewBinding(RequestLoadingDialog requestLoadingDialog, View view) {
        this.f78461a = requestLoadingDialog;
        requestLoadingDialog.imgBotReply = (ImageView) Utils.findRequiredViewAsType(view, R.id.img_bot_reply, "field 'imgBotReply'", ImageView.class);
        requestLoadingDialog.imgBotReplying = (LottieAnimationView) Utils.findRequiredViewAsType(view, R.id.img_bot_replying, "field 'imgBotReplying'", LottieAnimationView.class);
        requestLoadingDialog.replyText = (TextView) Utils.findRequiredViewAsType(view, R.id.text_bot_reply, "field 'replyText'", TextView.class);
    }
}
