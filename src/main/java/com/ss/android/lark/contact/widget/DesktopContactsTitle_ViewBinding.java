package com.ss.android.lark.contact.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class DesktopContactsTitle_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DesktopContactsTitle f93258a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DesktopContactsTitle desktopContactsTitle = this.f93258a;
        if (desktopContactsTitle != null) {
            this.f93258a = null;
            desktopContactsTitle.mTitle = null;
            desktopContactsTitle.mRightIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DesktopContactsTitle_ViewBinding(DesktopContactsTitle desktopContactsTitle, View view) {
        this.f93258a = desktopContactsTitle;
        desktopContactsTitle.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        desktopContactsTitle.mRightIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.icon, "field 'mRightIcon'", ImageView.class);
    }
}
