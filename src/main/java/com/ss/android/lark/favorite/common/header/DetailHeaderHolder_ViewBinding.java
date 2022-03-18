package com.ss.android.lark.favorite.common.header;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;

public class DetailHeaderHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DetailHeaderHolder f95431a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailHeaderHolder detailHeaderHolder = this.f95431a;
        if (detailHeaderHolder != null) {
            this.f95431a = null;
            detailHeaderHolder.mUserAvatarIV = null;
            detailHeaderHolder.mSaveBoxUserNameTV = null;
            detailHeaderHolder.mSaveBoxSaveDateTV = null;
            detailHeaderHolder.mChatNameTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DetailHeaderHolder_ViewBinding(DetailHeaderHolder detailHeaderHolder, View view) {
        this.f95431a = detailHeaderHolder;
        detailHeaderHolder.mUserAvatarIV = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.savebox_user_avatar, "field 'mUserAvatarIV'", SelectableRoundedImageView.class);
        detailHeaderHolder.mSaveBoxUserNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.savebox_user_name, "field 'mSaveBoxUserNameTV'", TextView.class);
        detailHeaderHolder.mSaveBoxSaveDateTV = (TextView) Utils.findRequiredViewAsType(view, R.id.savebox_save_date, "field 'mSaveBoxSaveDateTV'", TextView.class);
        detailHeaderHolder.mChatNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.savebox_chat_name, "field 'mChatNameTV'", TextView.class);
    }
}
