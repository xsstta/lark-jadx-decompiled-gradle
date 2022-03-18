package com.ss.android.lark.tab.manager.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class TabOrderManagerView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TabOrderManagerView f136383a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TabOrderManagerView tabOrderManagerView = this.f136383a;
        if (tabOrderManagerView != null) {
            this.f136383a = null;
            tabOrderManagerView.tipView = null;
            tabOrderManagerView.funcButton = null;
            tabOrderManagerView.closeButton = null;
            tabOrderManagerView.tabListRecyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TabOrderManagerView_ViewBinding(TabOrderManagerView tabOrderManagerView, View view) {
        this.f136383a = tabOrderManagerView;
        tabOrderManagerView.tipView = (TextView) Utils.findRequiredViewAsType(view, R.id.manager_label_tip, "field 'tipView'", TextView.class);
        tabOrderManagerView.funcButton = (TextView) Utils.findRequiredViewAsType(view, R.id.manager_func, "field 'funcButton'", TextView.class);
        tabOrderManagerView.closeButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.image_close, "field 'closeButton'", ImageView.class);
        tabOrderManagerView.tabListRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.tab_list, "field 'tabListRecyclerView'", RecyclerView.class);
    }
}
