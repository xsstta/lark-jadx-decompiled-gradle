package com.ss.android.lark.sticker.ui.view;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class StickerListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerListView f136317a;

    @Override // butterknife.Unbinder
    public void unbind() {
        StickerListView stickerListView = this.f136317a;
        if (stickerListView != null) {
            this.f136317a = null;
            stickerListView.mPinTV = null;
            stickerListView.mDeleteTV = null;
            stickerListView.mGridView = null;
            stickerListView.mTitleBar = null;
            stickerListView.mEmptyBgView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerListView_ViewBinding(StickerListView stickerListView, View view) {
        this.f136317a = stickerListView;
        stickerListView.mPinTV = (TextView) Utils.findRequiredViewAsType(view, R.id.pin, "field 'mPinTV'", TextView.class);
        stickerListView.mDeleteTV = (TextView) Utils.findRequiredViewAsType(view, R.id.delete, "field 'mDeleteTV'", TextView.class);
        stickerListView.mGridView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.grid, "field 'mGridView'", RecyclerView.class);
        stickerListView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        stickerListView.mEmptyBgView = Utils.findRequiredView(view, R.id.backgroundLinearLayout, "field 'mEmptyBgView'");
    }
}
