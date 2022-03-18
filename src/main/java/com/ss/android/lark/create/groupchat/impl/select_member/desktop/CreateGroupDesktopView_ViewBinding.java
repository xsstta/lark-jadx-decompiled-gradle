package com.ss.android.lark.create.groupchat.impl.select_member.desktop;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.switch_button.SwitchButton;

public class CreateGroupDesktopView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateGroupDesktopView f93872a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CreateGroupDesktopView createGroupDesktopView = this.f93872a;
        if (createGroupDesktopView != null) {
            this.f93872a = null;
            createGroupDesktopView.mTypeSwitch = null;
            createGroupDesktopView.mTypeSwitchDesc = null;
            createGroupDesktopView.mMode = null;
            createGroupDesktopView.mChatCheckBox = null;
            createGroupDesktopView.mTopicCheckBox = null;
            createGroupDesktopView.mSecretCheckBox = null;
            createGroupDesktopView.mChatTextView = null;
            createGroupDesktopView.mTopicTextView = null;
            createGroupDesktopView.mSecretTextView = null;
            createGroupDesktopView.mViewPager = null;
            createGroupDesktopView.mNameEditText = null;
            createGroupDesktopView.mTitleClose = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CreateGroupDesktopView_ViewBinding(CreateGroupDesktopView createGroupDesktopView, View view) {
        this.f93872a = createGroupDesktopView;
        createGroupDesktopView.mTypeSwitch = (SwitchButton) Utils.findRequiredViewAsType(view, R.id.cg_type_switch, "field 'mTypeSwitch'", SwitchButton.class);
        createGroupDesktopView.mTypeSwitchDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.cg_type_switch_desc, "field 'mTypeSwitchDesc'", TextView.class);
        createGroupDesktopView.mMode = Utils.findRequiredView(view, R.id.cg_mode, "field 'mMode'");
        createGroupDesktopView.mChatCheckBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.cg_checkbox_chat, "field 'mChatCheckBox'", UDCheckBox.class);
        createGroupDesktopView.mTopicCheckBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.cg_checkbox_topic, "field 'mTopicCheckBox'", UDCheckBox.class);
        createGroupDesktopView.mSecretCheckBox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.cg_checkbox_secret, "field 'mSecretCheckBox'", UDCheckBox.class);
        createGroupDesktopView.mChatTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.cg_textview_chat, "field 'mChatTextView'", TextView.class);
        createGroupDesktopView.mTopicTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.cg_textview_topic, "field 'mTopicTextView'", TextView.class);
        createGroupDesktopView.mSecretTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.cg_textview_secret, "field 'mSecretTextView'", TextView.class);
        createGroupDesktopView.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.group_vp, "field 'mViewPager'", ViewPager.class);
        createGroupDesktopView.mNameEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.cg_edittext_name, "field 'mNameEditText'", EditText.class);
        createGroupDesktopView.mTitleClose = (ImageView) Utils.findRequiredViewAsType(view, R.id.cg_title_close, "field 'mTitleClose'", ImageView.class);
    }
}
