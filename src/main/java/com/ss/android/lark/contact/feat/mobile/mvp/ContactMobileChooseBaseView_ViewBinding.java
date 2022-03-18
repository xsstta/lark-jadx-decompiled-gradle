package com.ss.android.lark.contact.feat.mobile.mvp;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.feat.common.IndexBar;
import com.ss.android.lark.contact.feat.common.MaxLinesRecyclerView;
import com.ss.android.lark.ui.CommonTitleBar;

public class ContactMobileChooseBaseView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ContactMobileChooseBaseView f91758a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ContactMobileChooseBaseView contactMobileChooseBaseView = this.f91758a;
        if (contactMobileChooseBaseView != null) {
            this.f91758a = null;
            contactMobileChooseBaseView.searchLayout = null;
            contactMobileChooseBaseView.search = null;
            contactMobileChooseBaseView.commonTitleBar = null;
            contactMobileChooseBaseView.cmSelectedRv = null;
            contactMobileChooseBaseView.cmContactRv = null;
            contactMobileChooseBaseView.indexBar = null;
            contactMobileChooseBaseView.mSearchDelIv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ContactMobileChooseBaseView_ViewBinding(ContactMobileChooseBaseView contactMobileChooseBaseView, View view) {
        this.f91758a = contactMobileChooseBaseView;
        contactMobileChooseBaseView.searchLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.search_layout, "field 'searchLayout'", RelativeLayout.class);
        contactMobileChooseBaseView.search = (EditText) Utils.findRequiredViewAsType(view, R.id.search, "field 'search'", EditText.class);
        contactMobileChooseBaseView.commonTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.miTitleBar, "field 'commonTitleBar'", CommonTitleBar.class);
        contactMobileChooseBaseView.cmSelectedRv = (MaxLinesRecyclerView) Utils.findRequiredViewAsType(view, R.id.cmSelectedRv, "field 'cmSelectedRv'", MaxLinesRecyclerView.class);
        contactMobileChooseBaseView.cmContactRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cmContactRv, "field 'cmContactRv'", RecyclerView.class);
        contactMobileChooseBaseView.indexBar = (IndexBar) Utils.findRequiredViewAsType(view, R.id.share_add_contact_sidebar, "field 'indexBar'", IndexBar.class);
        contactMobileChooseBaseView.mSearchDelIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_del, "field 'mSearchDelIv'", ImageView.class);
    }
}
