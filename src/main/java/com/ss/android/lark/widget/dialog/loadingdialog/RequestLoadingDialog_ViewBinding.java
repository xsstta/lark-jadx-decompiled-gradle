package com.ss.android.lark.widget.dialog.loadingdialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class RequestLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RequestLoadingDialog f143837a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RequestLoadingDialog requestLoadingDialog = this.f143837a;
        if (requestLoadingDialog != null) {
            this.f143837a = null;
            requestLoadingDialog.imgBotReply = null;
            requestLoadingDialog.imgBotReplying = null;
            requestLoadingDialog.replyText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RequestLoadingDialog_ViewBinding(RequestLoadingDialog requestLoadingDialog, View view) {
        this.f143837a = requestLoadingDialog;
        requestLoadingDialog.imgBotReply = (ImageView) Utils.findRequiredViewAsType(view, R.id.img_bot_reply, "field 'imgBotReply'", ImageView.class);
        requestLoadingDialog.imgBotReplying = (ImageView) Utils.findRequiredViewAsType(view, R.id.img_bot_replying, "field 'imgBotReplying'", ImageView.class);
        requestLoadingDialog.replyText = (TextView) Utils.findRequiredViewAsType(view, R.id.text_bot_reply, "field 'replyText'", TextView.class);
    }
}
