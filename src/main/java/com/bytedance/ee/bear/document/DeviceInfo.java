package com.bytedance.ee.bear.document;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/document/DeviceInfo;", "Lcom/bytedance/ee/util/io/NonProguard;", "statusBarHeight", "", "titleBarHeight", "(II)V", "getStatusBarHeight", "()I", "setStatusBarHeight", "(I)V", "getTitleBarHeight", "setTitleBarHeight", "toString", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DeviceInfo implements NonProguard {
    private int statusBarHeight;
    private int titleBarHeight;

    public DeviceInfo() {
        this(0, 0, 3, null);
    }

    public final int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public final int getTitleBarHeight() {
        return this.titleBarHeight;
    }

    public String toString() {
        return "DeviceInfo(statusBarHeight=" + this.statusBarHeight + ", titleBarHeight=" + this.titleBarHeight + ')';
    }

    public final void setStatusBarHeight(int i) {
        this.statusBarHeight = i;
    }

    public final void setTitleBarHeight(int i) {
        this.titleBarHeight = i;
    }

    public DeviceInfo(int i, int i2) {
        this.statusBarHeight = i;
        this.titleBarHeight = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeviceInfo(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
