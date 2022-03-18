package com.ss.android.lark.chatsetting.impl.p2p;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;

public class P2pSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private P2pSettingView f90360a;

    @Override // butterknife.Unbinder
    public void unbind() {
        P2pSettingView p2pSettingView = this.f90360a;
        if (p2pSettingView != null) {
            this.f90360a = null;
            p2pSettingView.mRootLayout = null;
            p2pSettingView.mScrollView = null;
            p2pSettingView.mTitleBar = null;
            p2pSettingView.p2pChatSettingOptionWrapper = null;
            p2pSettingView.mP2pSettingOptionDivide = null;
            p2pSettingView.mMuteLayoutWrapper = null;
            p2pSettingView.remindSwitchButton = null;
            p2pSettingView.p2pChatSettingShortcut = null;
            p2pSettingView.shortcutSwitchButton = null;
            p2pSettingView.mMsgNotifyTV = null;
            p2pSettingView.mMoveToBoxSwitchButton = null;
            p2pSettingView.mMoveToBoxTitlt = null;
            p2pSettingView.mMoveToBoxSubtitle = null;
            p2pSettingView.mChatBoxLayout = null;
            p2pSettingView.mBoxSettingDivide = null;
            p2pSettingView.mAutoTranslateLayout = null;
            p2pSettingView.mAutoTranslateSwitch = null;
            p2pSettingView.mReportBtn = null;
            p2pSettingView.mQuickSwitcherTitle = null;
            p2pSettingView.mAutoTranslateLabelTv = null;
            p2pSettingView.mAutoTranslateTipsTv = null;
            p2pSettingView.closeSecretChatBtn = null;
            p2pSettingView.mChatFunctionView = null;
            p2pSettingView.mChatFunctionLayout = null;
            p2pSettingView.mChatterInfoView = null;
            p2pSettingView.mBotInfoView = null;
            p2pSettingView.mSearchChatLayout = null;
            p2pSettingView.mSearchChatTitleLayout = null;
            p2pSettingView.mSearchChatTypeRv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public P2pSettingView_ViewBinding(P2pSettingView p2pSettingView, View view) {
        this.f90360a = p2pSettingView;
        p2pSettingView.mRootLayout = Utils.findRequiredView(view, R.id.root_layout, "field 'mRootLayout'");
        p2pSettingView.mScrollView = (ScrollView) Utils.findRequiredViewAsType(view, R.id.scroll_view, "field 'mScrollView'", ScrollView.class);
        p2pSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        p2pSettingView.p2pChatSettingOptionWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.p2p_chat_setting_option_wrapper, "field 'p2pChatSettingOptionWrapper'", LinearLayout.class);
        p2pSettingView.mP2pSettingOptionDivide = Utils.findRequiredView(view, R.id.p2p_setting_option_divide, "field 'mP2pSettingOptionDivide'");
        p2pSettingView.mMuteLayoutWrapper = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.message_remind_wrapper, "field 'mMuteLayoutWrapper'", RelativeLayout.class);
        p2pSettingView.remindSwitchButton = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.switch_button, "field 'remindSwitchButton'", LKUISwitchButton.class);
        p2pSettingView.p2pChatSettingShortcut = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.p2p_chat_shortcut_switch, "field 'p2pChatSettingShortcut'", RelativeLayout.class);
        p2pSettingView.shortcutSwitchButton = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.shortcut_switch_button, "field 'shortcutSwitchButton'", LKUISwitchButton.class);
        p2pSettingView.mMsgNotifyTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_message_notify, "field 'mMsgNotifyTV'", TextView.class);
        p2pSettingView.mMoveToBoxSwitchButton = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.sb_move_to_box_switch, "field 'mMoveToBoxSwitchButton'", LKUISwitchButton.class);
        p2pSettingView.mMoveToBoxTitlt = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_move_to_box_title, "field 'mMoveToBoxTitlt'", TextView.class);
        p2pSettingView.mMoveToBoxSubtitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_move_to_box_subtitle, "field 'mMoveToBoxSubtitle'", TextView.class);
        p2pSettingView.mChatBoxLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.chat_box_layout_wrapper, "field 'mChatBoxLayout'", RelativeLayout.class);
        p2pSettingView.mBoxSettingDivide = Utils.findRequiredView(view, R.id.box_setting_divide, "field 'mBoxSettingDivide'");
        p2pSettingView.mAutoTranslateLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.rl_auto_translate_region, "field 'mAutoTranslateLayout'", RelativeLayout.class);
        p2pSettingView.mAutoTranslateSwitch = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.sb_auto_translate_switch, "field 'mAutoTranslateSwitch'", LKUISwitchButton.class);
        p2pSettingView.mReportBtn = Utils.findRequiredView(view, R.id.report_btn, "field 'mReportBtn'");
        p2pSettingView.mQuickSwitcherTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_quickswitcher_title, "field 'mQuickSwitcherTitle'", TextView.class);
        p2pSettingView.mAutoTranslateLabelTv = (TextView) Utils.findRequiredViewAsType(view, R.id.auto_translate_label, "field 'mAutoTranslateLabelTv'", TextView.class);
        p2pSettingView.mAutoTranslateTipsTv = (TextView) Utils.findRequiredViewAsType(view, R.id.auto_translate_tips, "field 'mAutoTranslateTipsTv'", TextView.class);
        p2pSettingView.closeSecretChatBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.close_secret_chat_button, "field 'closeSecretChatBtn'", TextView.class);
        p2pSettingView.mChatFunctionView = (ChatFunctionView) Utils.findRequiredViewAsType(view, R.id.chat_function_view, "field 'mChatFunctionView'", ChatFunctionView.class);
        p2pSettingView.mChatFunctionLayout = view.findViewById(R.id.setting_function_layout);
        p2pSettingView.mChatterInfoView = view.findViewById(R.id.chatter_info_view);
        p2pSettingView.mBotInfoView = view.findViewById(R.id.bot_info_view);
        p2pSettingView.mSearchChatLayout = view.findViewById(R.id.setting_search_layout);
        p2pSettingView.mSearchChatTitleLayout = view.findViewById(R.id.search_chat_title_layout);
        p2pSettingView.mSearchChatTypeRv = (RecyclerView) Utils.findOptionalViewAsType(view, R.id.search_chat_type, "field 'mSearchChatTypeRv'", RecyclerView.class);
    }
}
