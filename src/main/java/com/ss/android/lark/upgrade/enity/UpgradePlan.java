package com.ss.android.lark.upgrade.enity;

import java.io.Serializable;

public class UpgradePlan implements Serializable {
    private int noticePlan;
    private int popupPlan;
    private int skipPlan;
    private int snoozePlan;

    public int getNoticePlan() {
        return this.noticePlan;
    }

    public int getPopupPlan() {
        return this.popupPlan;
    }

    public int getSkipPlan() {
        return this.skipPlan;
    }

    public int getSnoozePlan() {
        return this.snoozePlan;
    }

    public static UpgradePlan buildDefaultPlan() {
        UpgradePlan upgradePlan = new UpgradePlan();
        upgradePlan.setNoticePlan(1);
        upgradePlan.setPopupPlan(1);
        upgradePlan.setSnoozePlan(1);
        return upgradePlan;
    }

    public boolean enableSnooze() {
        if (getSnoozePlan() == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "" + this.noticePlan + this.popupPlan + this.snoozePlan + this.skipPlan;
    }

    public void setNoticePlan(int i) {
        this.noticePlan = i;
    }

    public void setPopupPlan(int i) {
        this.popupPlan = i;
    }

    public void setSkipPlan(int i) {
        this.skipPlan = i;
    }

    public void setSnoozePlan(int i) {
        this.snoozePlan = i;
    }
}
