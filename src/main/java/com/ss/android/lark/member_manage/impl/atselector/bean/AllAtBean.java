package com.ss.android.lark.member_manage.impl.atselector.bean;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;

public class AllAtBean extends BaseAtBean {
    private static final long serialVersionUID = -8614341601803028028L;
    int allSize;

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public char getPinyin() {
        return 0;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public int getType() {
        return 1;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getId() {
        return C57814c.m224347a();
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public String getDisplayName() {
        if (this.allSize <= 0) {
            return UIHelper.getString(R.string.Lark_Legacy_AllPeople);
        }
        return UIHelper.getString(R.string.Lark_Legacy_AllPeople) + "(" + this.allSize + ")";
    }

    public AllAtBean(int i) {
        this.allSize = i;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean
    public void showAvatar(Context context, ImageView imageView, int i, int i2) {
        imageView.getLayoutParams().width = i;
        imageView.getLayoutParams().height = i2;
        imageView.setImageResource(R.drawable.at_all);
    }
}
