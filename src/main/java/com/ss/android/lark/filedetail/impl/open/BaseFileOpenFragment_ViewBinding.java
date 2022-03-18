package com.ss.android.lark.filedetail.impl.open;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class BaseFileOpenFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseFileOpenFragment f98288a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseFileOpenFragment baseFileOpenFragment = this.f98288a;
        if (baseFileOpenFragment != null) {
            this.f98288a = null;
            baseFileOpenFragment.mContentContainer = null;
            baseFileOpenFragment.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseFileOpenFragment_ViewBinding(BaseFileOpenFragment baseFileOpenFragment, View view) {
        this.f98288a = baseFileOpenFragment;
        baseFileOpenFragment.mContentContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.content_container, "field 'mContentContainer'", FrameLayout.class);
        baseFileOpenFragment.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
    }
}
