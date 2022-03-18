package com.ss.android.lark.mail.impl.message.send.state;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;

public class SendStatusDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SendStatusDetailView f109517a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SendStatusDetailView sendStatusDetailView = this.f109517a;
        if (sendStatusDetailView != null) {
            this.f109517a = null;
            sendStatusDetailView.mRecyclerView = null;
            sendStatusDetailView.mLoadingView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SendStatusDetailView_ViewBinding(SendStatusDetailView sendStatusDetailView, View view) {
        this.f109517a = sendStatusDetailView;
        sendStatusDetailView.mRecyclerView = (HeaderFooterRecyclerView) Utils.findRequiredViewAsType(view, R.id.mail_recall_detail_list, "field 'mRecyclerView'", HeaderFooterRecyclerView.class);
        sendStatusDetailView.mLoadingView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.mail_recall_loading, "field 'mLoadingView'", ViewGroup.class);
    }
}
