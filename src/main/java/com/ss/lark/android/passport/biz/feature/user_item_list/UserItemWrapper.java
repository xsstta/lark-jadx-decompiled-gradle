package com.ss.lark.android.passport.biz.feature.user_item_list;

import com.ss.lark.android.passport.biz.entity.UserItem;
import java.io.Serializable;

public class UserItemWrapper implements Serializable {
    public int itemType;
    public String subTitle;
    public UserItem userItem;

    public UserItemWrapper(String str, UserItem userItem2, int i) {
        this.subTitle = str;
        this.userItem = userItem2;
        this.itemType = i;
    }
}
