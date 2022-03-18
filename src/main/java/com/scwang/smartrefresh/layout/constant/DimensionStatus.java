package com.scwang.smartrefresh.layout.constant;

public enum DimensionStatus {
    DefaultUnNotify(false),
    Default(true),
    XmlWrapUnNotify(false),
    XmlWrap(true),
    XmlExactUnNotify(false),
    XmlExact(true),
    XmlLayoutUnNotify(false),
    XmlLayout(true),
    CodeExactUnNotify(false),
    CodeExact(true),
    DeadLockUnNotify(false),
    DeadLock(true);
    
    public final boolean notifyed;

    public DimensionStatus notifyed() {
        if (!this.notifyed) {
            return values()[ordinal() + 1];
        }
        return this;
    }

    public DimensionStatus unNotify() {
        if (!this.notifyed) {
            return this;
        }
        DimensionStatus dimensionStatus = values()[ordinal() - 1];
        if (!dimensionStatus.notifyed) {
            return dimensionStatus;
        }
        return DefaultUnNotify;
    }

    public boolean gteReplaceWith(DimensionStatus dimensionStatus) {
        if (ordinal() >= dimensionStatus.ordinal()) {
            return true;
        }
        return false;
    }

    public boolean canReplaceWith(DimensionStatus dimensionStatus) {
        if (ordinal() < dimensionStatus.ordinal() || ((!this.notifyed || CodeExact == this) && ordinal() == dimensionStatus.ordinal())) {
            return true;
        }
        return false;
    }

    private DimensionStatus(boolean z) {
        this.notifyed = z;
    }
}
