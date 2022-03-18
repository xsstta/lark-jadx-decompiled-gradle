package com.larksuite.component.ui.display.manager;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/ui/display/manager/ZoomLevel4;", "", "level", "", "multiplier", "", "(Ljava/lang/String;IIF)V", "getLevel", "()I", "getMultiplier", "()F", "SMALL", "NORMAL", "LARGE1", "LARGE2", "LARGE3", "LARGE4", "display_manager_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum ZoomLevel4 {
    SMALL(-1, 0.92f),
    NORMAL(0, 1.0f),
    LARGE1(1, 1.08f),
    LARGE2(2, 1.08f),
    LARGE3(3, 1.17f),
    LARGE4(4, 1.17f);
    
    private final int level;
    private final float multiplier;

    public final int getLevel() {
        return this.level;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    private ZoomLevel4(int i, float f) {
        this.level = i;
        this.multiplier = f;
    }
}
