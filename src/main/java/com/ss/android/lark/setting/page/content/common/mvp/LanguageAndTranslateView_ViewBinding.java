package com.ss.android.lark.setting.page.content.common.mvp;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class LanguageAndTranslateView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LanguageAndTranslateView f134588a;

    @Override // butterknife.Unbinder
    public void unbind() {
        LanguageAndTranslateView languageAndTranslateView = this.f134588a;
        if (languageAndTranslateView != null) {
            this.f134588a = null;
            languageAndTranslateView.mSettingWrittenLanguageLayout = null;
            languageAndTranslateView.mSettingTranslateLayout = null;
            languageAndTranslateView.mDisplayAppearanceLayout = null;
            languageAndTranslateView.mDisplayAppearanceModeTip = null;
            languageAndTranslateView.mDisplayLayout = null;
            languageAndTranslateView.mSwitchButton = null;
            languageAndTranslateView.mTranslateSettingTV = null;
            languageAndTranslateView.mTitleBar = null;
            languageAndTranslateView.mClearCacheLanguageTV = null;
            languageAndTranslateView.mDesktopTitleBar = null;
            languageAndTranslateView.mFontSettingLayout = null;
            languageAndTranslateView.mFontSizeTitleDesc = null;
            languageAndTranslateView.mChatBubbleAlignmentSettingLayout = null;
            languageAndTranslateView.mChatBubbleAlignmentTips = null;
            languageAndTranslateView.simpleConstraintLayout = null;
            languageAndTranslateView.simpleSwitchButton = null;
            languageAndTranslateView.simpleModeTitleDescView = null;
            languageAndTranslateView.mEnterSendLayout = null;
            languageAndTranslateView.mEnterSendSwitchButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LanguageAndTranslateView_ViewBinding(LanguageAndTranslateView languageAndTranslateView, View view) {
        this.f134588a = languageAndTranslateView;
        languageAndTranslateView.mSettingWrittenLanguageLayout = Utils.findRequiredView(view, R.id.setting_written_language_layout, "field 'mSettingWrittenLanguageLayout'");
        languageAndTranslateView.mSettingTranslateLayout = Utils.findRequiredView(view, R.id.setting_translate_layout, "field 'mSettingTranslateLayout'");
        languageAndTranslateView.mDisplayAppearanceLayout = Utils.findRequiredView(view, R.id.setting_display_appearance_layout, "field 'mDisplayAppearanceLayout'");
        languageAndTranslateView.mDisplayAppearanceModeTip = (TextView) Utils.findRequiredViewAsType(view, R.id.display_appearance_tip, "field 'mDisplayAppearanceModeTip'", TextView.class);
        languageAndTranslateView.mDisplayLayout = Utils.findRequiredView(view, R.id.display_layout, "field 'mDisplayLayout'");
        languageAndTranslateView.mSwitchButton = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.switch_button, "field 'mSwitchButton'", LKUISwitchButton.class);
        languageAndTranslateView.mTranslateSettingTV = (TextView) Utils.findRequiredViewAsType(view, R.id.text_setting_translate, "field 'mTranslateSettingTV'", TextView.class);
        languageAndTranslateView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        languageAndTranslateView.mClearCacheLanguageTV = (TextView) Utils.findRequiredViewAsType(view, R.id.clear_cache_language, "field 'mClearCacheLanguageTV'", TextView.class);
        languageAndTranslateView.mDesktopTitleBar = (TextView) Utils.findRequiredViewAsType(view, R.id.desktop_mine_title, "field 'mDesktopTitleBar'", TextView.class);
        languageAndTranslateView.mFontSettingLayout = Utils.findRequiredView(view, R.id.layout_font_setting, "field 'mFontSettingLayout'");
        languageAndTranslateView.mFontSizeTitleDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.font_size_title_desc, "field 'mFontSizeTitleDesc'", TextView.class);
        languageAndTranslateView.mChatBubbleAlignmentSettingLayout = Utils.findRequiredView(view, R.id.setting_chat_bubble_alignment, "field 'mChatBubbleAlignmentSettingLayout'");
        languageAndTranslateView.mChatBubbleAlignmentTips = (TextView) Utils.findRequiredViewAsType(view, R.id.bubble_alignment_tip, "field 'mChatBubbleAlignmentTips'", TextView.class);
        languageAndTranslateView.simpleConstraintLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.cl_simple_mode, "field 'simpleConstraintLayout'", ConstraintLayout.class);
        languageAndTranslateView.simpleSwitchButton = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.simple_switch, "field 'simpleSwitchButton'", LKUISwitchButton.class);
        languageAndTranslateView.simpleModeTitleDescView = (TextView) Utils.findRequiredViewAsType(view, R.id.simple_mode_title_desc, "field 'simpleModeTitleDescView'", TextView.class);
        languageAndTranslateView.mEnterSendLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.cl_enter_send, "field 'mEnterSendLayout'", ConstraintLayout.class);
        languageAndTranslateView.mEnterSendSwitchButton = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.enter_send_switch, "field 'mEnterSendSwitchButton'", LKUISwitchButton.class);
    }
}
