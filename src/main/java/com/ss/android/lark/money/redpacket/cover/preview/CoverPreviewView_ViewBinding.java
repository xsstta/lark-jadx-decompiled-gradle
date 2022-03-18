package com.ss.android.lark.money.redpacket.cover.preview;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollView;
import com.ss.android.lark.ui.CommonTitleBar;

public final class CoverPreviewView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CoverPreviewView f121008a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CoverPreviewView coverPreviewView = this.f121008a;
        if (coverPreviewView != null) {
            this.f121008a = null;
            coverPreviewView.titleBar = null;
            coverPreviewView.currentItemName = null;
            coverPreviewView.confirmBtn = null;
            coverPreviewView.smoothScrollBtn = null;
            coverPreviewView.itemPicker = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CoverPreviewView_ViewBinding(CoverPreviewView coverPreviewView, View view) {
        this.f121008a = coverPreviewView;
        coverPreviewView.titleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'titleBar'", CommonTitleBar.class);
        coverPreviewView.currentItemName = (TextView) Utils.findRequiredViewAsType(view, R.id.item_name, "field 'currentItemName'", TextView.class);
        coverPreviewView.confirmBtn = (UDButton) Utils.findRequiredViewAsType(view, R.id.confirm_btn, "field 'confirmBtn'", UDButton.class);
        coverPreviewView.smoothScrollBtn = Utils.findRequiredView(view, R.id.btn_smooth_scroll, "field 'smoothScrollBtn'");
        coverPreviewView.itemPicker = (DiscreteScrollView) Utils.findRequiredViewAsType(view, R.id.item_picker, "field 'itemPicker'", DiscreteScrollView.class);
    }
}
