package com.ss.android.lark.diskmanage.clean.settings;

import com.ss.android.lark.diskmanage.NonProguard;

public class DeleteConfig implements NonProguard {
    private DeleteConfigItem deleteConfig = new DeleteConfigItem();
    private ExpiredConfigItem expiredConfig = new ExpiredConfigItem();
    private RustConfigItem mainRustConfig = new RustConfigItem();

    public DeleteConfigItem getDeleteConfig() {
        return this.deleteConfig;
    }

    public ExpiredConfigItem getExpiredConfig() {
        return this.expiredConfig;
    }

    public RustConfigItem getMainRustConfig() {
        return this.mainRustConfig;
    }

    public String toString() {
        return "DeleteConfig{deleteConfig=" + this.deleteConfig + ", expiredConfig=" + this.expiredConfig + ", mainRustConfig=" + this.mainRustConfig + '}';
    }

    public void setDeleteConfig(DeleteConfigItem deleteConfigItem) {
        this.deleteConfig = deleteConfigItem;
    }

    public void setExpiredConfig(ExpiredConfigItem expiredConfigItem) {
        this.expiredConfig = expiredConfigItem;
    }

    public void setMainRustConfig(RustConfigItem rustConfigItem) {
        this.mainRustConfig = rustConfigItem;
    }
}
