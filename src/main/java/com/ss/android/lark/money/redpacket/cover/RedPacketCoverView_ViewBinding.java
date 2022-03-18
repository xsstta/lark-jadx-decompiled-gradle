package com.ss.android.lark.money.redpacket.cover;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.loading.LKUILoadingView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public final class RedPacketCoverView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RedPacketCoverView f120973a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RedPacketCoverView redPacketCoverView = this.f120973a;
        if (redPacketCoverView != null) {
            this.f120973a = null;
            redPacketCoverView.titleBar = null;
            redPacketCoverView.loadingView = null;
            redPacketCoverView.coverThemeRv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RedPacketCoverView_ViewBinding(RedPacketCoverView redPacketCoverView, View view) {
        this.f120973a = redPacketCoverView;
        redPacketCoverView.titleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'titleBar'", CommonTitleBar.class);
        redPacketCoverView.loadingView = (LKUILoadingView) Utils.findRequiredViewAsType(view, R.id.loading_view, "field 'loadingView'", LKUILoadingView.class);
        redPacketCoverView.coverThemeRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cover_theme_rv, "field 'coverThemeRv'", RecyclerView.class);
    }
}
