package com.ss.android.lark.widget.photo_picker.gallery.pageturner;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class PageTurner_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PageTurner f145376a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PageTurner pageTurner = this.f145376a;
        if (pageTurner != null) {
            this.f145376a = null;
            pageTurner.mArrow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PageTurner_ViewBinding(PageTurner pageTurner, View view) {
        this.f145376a = pageTurner;
        pageTurner.mArrow = (ImageView) Utils.findRequiredViewAsType(view, R.id.arrow, "field 'mArrow'", ImageView.class);
    }
}
