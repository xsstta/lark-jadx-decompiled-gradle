package com.ss.android.lark.member_manage.impl.atselector.bean;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class LabelAtBean extends BaseAtBean {
    private static final long serialVersionUID = -5399462310353446789L;
    private int bgColorResId = R.color.bg_base;
    private int height = UIHelper.dp2px(32.0f);
    String label;
    String subLabel;
    private int textSize = 14;

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public char getPinyin() {
        return 0;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public int getType() {
        return 3;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public void showAvatar(Context context, ImageView imageView, int i, int i2) {
    }

    public int getBgColorResId() {
        return this.bgColorResId;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getDisplayName() {
        return this.label;
    }

    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getId() {
        return this.label;
    }

    public String getSubLabel() {
        return this.subLabel;
    }

    public int getTextSize() {
        return this.textSize;
    }

    public void setBgColorResId(int i) {
        this.bgColorResId = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setTextSize(int i) {
        this.textSize = i;
    }

    public LabelAtBean(String str) {
        this.label = str;
    }

    public LabelAtBean(String str, String str2) {
        this.label = str;
        this.subLabel = str2;
    }
}
