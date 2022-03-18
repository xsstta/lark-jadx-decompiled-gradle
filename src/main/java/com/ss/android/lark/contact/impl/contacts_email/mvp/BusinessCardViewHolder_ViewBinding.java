package com.ss.android.lark.contact.impl.contacts_email.mvp;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.blockit.hashtag.widget.SwipeLayout;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;

public final class BusinessCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BusinessCardViewHolder f91964a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BusinessCardViewHolder businessCardViewHolder = this.f91964a;
        if (businessCardViewHolder != null) {
            this.f91964a = null;
            businessCardViewHolder.slRoot = null;
            businessCardViewHolder.deleteView = null;
            businessCardViewHolder.cardWrapper = null;
            businessCardViewHolder.userAvatarView = null;
            businessCardViewHolder.userNameView = null;
            businessCardViewHolder.userSubTitleView = null;
            businessCardViewHolder.driver = null;
            businessCardViewHolder.checkBox = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BusinessCardViewHolder_ViewBinding(BusinessCardViewHolder businessCardViewHolder, View view) {
        this.f91964a = businessCardViewHolder;
        businessCardViewHolder.slRoot = (SwipeLayout) Utils.findOptionalViewAsType(view, R.id.sl_root, "field 'slRoot'", SwipeLayout.class);
        businessCardViewHolder.deleteView = (TextView) Utils.findOptionalViewAsType(view, R.id.tv_delete, "field 'deleteView'", TextView.class);
        businessCardViewHolder.cardWrapper = Utils.findRequiredView(view, R.id.cl_item_wrapper, "field 'cardWrapper'");
        businessCardViewHolder.userAvatarView = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.iv_user_avatar, "field 'userAvatarView'", LKUIRoundedImageView.class);
        businessCardViewHolder.userNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_user_name, "field 'userNameView'", TextView.class);
        businessCardViewHolder.userSubTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_sub_title, "field 'userSubTitleView'", TextView.class);
        businessCardViewHolder.driver = Utils.findRequiredView(view, R.id.card_divider, "field 'driver'");
        businessCardViewHolder.checkBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.select_box, "field 'checkBox'", UDCheckBox.class);
    }
}
