package com.ss.android.lark.chatsetting.impl.group.ownership.quit;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class QuitGroupFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private QuitGroupFragment f89843a;

    @Override // butterknife.Unbinder
    public void unbind() {
        QuitGroupFragment quitGroupFragment = this.f89843a;
        if (quitGroupFragment != null) {
            this.f89843a = null;
            quitGroupFragment.mCommonTitleBar = null;
            quitGroupFragment.avatorIv = null;
            quitGroupFragment.groupNameTv = null;
            quitGroupFragment.quitBtn = null;
            quitGroupFragment.changeBtn = null;
            quitGroupFragment.quitDescTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public QuitGroupFragment_ViewBinding(QuitGroupFragment quitGroupFragment, View view) {
        this.f89843a = quitGroupFragment;
        quitGroupFragment.mCommonTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mCommonTitleBar'", CommonTitleBar.class);
        quitGroupFragment.avatorIv = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avator, "field 'avatorIv'", SelectableRoundedImageView.class);
        quitGroupFragment.groupNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.group_name, "field 'groupNameTv'", TextView.class);
        quitGroupFragment.quitBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.quit_group_btn, "field 'quitBtn'", TextView.class);
        quitGroupFragment.changeBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.change_owner_btn, "field 'changeBtn'", TextView.class);
        quitGroupFragment.quitDescTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_quit_desc, "field 'quitDescTv'", TextView.class);
    }
}
