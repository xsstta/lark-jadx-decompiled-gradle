package com.ss.android.lark.calendar.impl.features.settings;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class SkinSettingFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SkinSettingFragment f82995a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SkinSettingFragment skinSettingFragment = this.f82995a;
        if (skinSettingFragment != null) {
            this.f82995a = null;
            skinSettingFragment.mTitleBar = null;
            skinSettingFragment.layoutLight = null;
            skinSettingFragment.imageViewLight = null;
            skinSettingFragment.textViewLight = null;
            skinSettingFragment.layoutDark = null;
            skinSettingFragment.imageViewDark = null;
            skinSettingFragment.textViewDark = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SkinSettingFragment_ViewBinding(SkinSettingFragment skinSettingFragment, View view) {
        this.f82995a = skinSettingFragment;
        skinSettingFragment.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        skinSettingFragment.layoutLight = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_skin_setting_light, "field 'layoutLight'", ViewGroup.class);
        skinSettingFragment.imageViewLight = (ImageView) Utils.findRequiredViewAsType(view, R.id.img_skin_setting_light, "field 'imageViewLight'", ImageView.class);
        skinSettingFragment.textViewLight = (TextView) Utils.findRequiredViewAsType(view, R.id.text_skin_setting_light, "field 'textViewLight'", TextView.class);
        skinSettingFragment.layoutDark = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_skin_setting_dark, "field 'layoutDark'", ViewGroup.class);
        skinSettingFragment.imageViewDark = (ImageView) Utils.findRequiredViewAsType(view, R.id.img_skin_setting_dark, "field 'imageViewDark'", ImageView.class);
        skinSettingFragment.textViewDark = (TextView) Utils.findRequiredViewAsType(view, R.id.text_skin_setting_dark, "field 'textViewDark'", TextView.class);
    }
}
