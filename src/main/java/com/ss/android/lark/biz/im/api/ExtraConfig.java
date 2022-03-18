package com.ss.android.lark.biz.im.api;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ExtraConfig implements Serializable {
    @SerializedName("can_apply_visibility")
    private boolean canApplyVisibility = true;

    public boolean isCanApplyVisibility() {
        return this.canApplyVisibility;
    }
}
