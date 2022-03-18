package com.ss.android.lark.widget.dialog;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class BottomSheetListDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BottomSheetListDialog f143770a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BottomSheetListDialog bottomSheetListDialog = this.f143770a;
        if (bottomSheetListDialog != null) {
            this.f143770a = null;
            bottomSheetListDialog.mRecyclerView = null;
            bottomSheetListDialog.mPositiveBtn = null;
            bottomSheetListDialog.mNegativeBtn = null;
            bottomSheetListDialog.mTitleView = null;
            bottomSheetListDialog.mMessageView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BottomSheetListDialog_ViewBinding(BottomSheetListDialog bottomSheetListDialog, View view) {
        this.f143770a = bottomSheetListDialog;
        bottomSheetListDialog.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bottom_sheet_dialog_content_list, "field 'mRecyclerView'", RecyclerView.class);
        bottomSheetListDialog.mPositiveBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.float_selector_right_btn, "field 'mPositiveBtn'", TextView.class);
        bottomSheetListDialog.mNegativeBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.float_selector_left_btn, "field 'mNegativeBtn'", TextView.class);
        bottomSheetListDialog.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.bottom_sheet_dialog_title, "field 'mTitleView'", TextView.class);
        bottomSheetListDialog.mMessageView = (TextView) Utils.findRequiredViewAsType(view, R.id.bottom_sheet_dialog_message, "field 'mMessageView'", TextView.class);
    }
}
