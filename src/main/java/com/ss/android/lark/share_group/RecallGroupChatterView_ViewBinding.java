package com.ss.android.lark.share_group;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class RecallGroupChatterView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecallGroupChatterView f135303a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RecallGroupChatterView recallGroupChatterView = this.f135303a;
        if (recallGroupChatterView != null) {
            this.f135303a = null;
            recallGroupChatterView.mRecallChatterRV = null;
            recallGroupChatterView.mRecallTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecallGroupChatterView_ViewBinding(RecallGroupChatterView recallGroupChatterView, View view) {
        this.f135303a = recallGroupChatterView;
        recallGroupChatterView.mRecallChatterRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.recall_chatter_rv, "field 'mRecallChatterRV'", RecyclerView.class);
        recallGroupChatterView.mRecallTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.recall_titlebar, "field 'mRecallTitleBar'", CommonTitleBar.class);
    }
}
