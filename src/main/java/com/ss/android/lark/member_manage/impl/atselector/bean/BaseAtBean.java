package com.ss.android.lark.member_manage.impl.atselector.bean;

import android.content.Context;
import android.widget.ImageView;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class BaseAtBean implements Serializable {
    protected String id;
    protected boolean isSelected;
    int mType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TYPE {
    }

    public abstract String getDisplayName();

    public abstract String getId();

    public abstract char getPinyin();

    public String getStatusIconKey() {
        return null;
    }

    public abstract int getType();

    public abstract void showAvatar(Context context, ImageView imageView, int i, int i2);

    public boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return getDisplayName();
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }
}
