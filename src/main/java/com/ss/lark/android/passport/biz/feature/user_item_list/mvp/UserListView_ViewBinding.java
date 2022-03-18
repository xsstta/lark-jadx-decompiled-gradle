package com.ss.lark.android.passport.biz.feature.user_item_list.mvp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class UserListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UserListView f164004a;

    @Override // butterknife.Unbinder
    public void unbind() {
        UserListView userListView = this.f164004a;
        if (userListView != null) {
            this.f164004a = null;
            userListView.mTvTitle = null;
            userListView.rvUserList = null;
            userListView.mLlFooter = null;
            userListView.mTvButtonBottom = null;
            userListView.mTvTextBottom = null;
            userListView.mTvJoin = null;
            userListView.mTvRegister = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UserListView_ViewBinding(UserListView userListView, View view) {
        this.f164004a = userListView;
        userListView.mTvTitle = (TextView) Utils.findOptionalViewAsType(view, R.id.tvTitle, "field 'mTvTitle'", TextView.class);
        userListView.rvUserList = (RecyclerView) Utils.findOptionalViewAsType(view, R.id.rvTeamList, "field 'rvUserList'", RecyclerView.class);
        userListView.mLlFooter = (LinearLayout) Utils.findOptionalViewAsType(view, R.id.llFooter, "field 'mLlFooter'", LinearLayout.class);
        userListView.mTvButtonBottom = (TextView) Utils.findOptionalViewAsType(view, R.id.tvButtonBottom, "field 'mTvButtonBottom'", TextView.class);
        userListView.mTvTextBottom = (TextView) Utils.findOptionalViewAsType(view, R.id.tvTextBottom, "field 'mTvTextBottom'", TextView.class);
        userListView.mTvJoin = (AppCompatTextView) Utils.findOptionalViewAsType(view, R.id.tvJoin, "field 'mTvJoin'", AppCompatTextView.class);
        userListView.mTvRegister = (AppCompatTextView) Utils.findOptionalViewAsType(view, R.id.tvRegister, "field 'mTvRegister'", AppCompatTextView.class);
    }
}
