package com.ss.android.lark.widget.photo_picker.gallery.function;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class BottomFuncPanel_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BottomFuncPanel f145213a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BottomFuncPanel bottomFuncPanel = this.f145213a;
        if (bottomFuncPanel != null) {
            this.f145213a = null;
            bottomFuncPanel.mFuncRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BottomFuncPanel_ViewBinding(BottomFuncPanel bottomFuncPanel, View view) {
        this.f145213a = bottomFuncPanel;
        bottomFuncPanel.mFuncRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.func_list, "field 'mFuncRV'", RecyclerView.class);
    }
}
