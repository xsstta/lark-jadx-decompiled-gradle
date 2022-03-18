package com.ss.android.appcenter.business.dto;

import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;

public enum NameTag {
    RECOMMEND(R.string.OpenPlatform_AppCenter_AdminRecTitle, UDTagsDrawable.TagColorSet.ORANGE),
    WIDGET(R.string.OpenPlatform_AppCenter_WidgetBadge, UDTagsDrawable.TagColorSet.BLUE),
    BOOKMARK(R.string.OpenPlatform_AppCenter_BkmrkBadge, UDTagsDrawable.TagColorSet.GREEN),
    BOT(R.string.AppDetail_Card_Bot, UDTagsDrawable.TagColorSet.YELLOW);
    
    private UDTagsDrawable.TagColorSet mColorSet;
    private int mTextResId;

    public UDTagsDrawable.TagColorSet getColorSet() {
        return this.mColorSet;
    }

    public int getTextResId() {
        return this.mTextResId;
    }

    private NameTag(int i, UDTagsDrawable.TagColorSet tagColorSet) {
        this.mTextResId = i;
        this.mColorSet = tagColorSet;
    }
}
