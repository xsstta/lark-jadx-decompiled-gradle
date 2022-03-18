package com.ss.android.appcenter.business.net.pupups;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/appcenter/business/net/pupups/PopupsConfig;", "Ljava/io/Serializable;", "()V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "width", "getWidth", "setWidth", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PopupsConfig implements Serializable {
    @SerializedName("height")
    private int height;
    @SerializedName("width")
    private int width;

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
