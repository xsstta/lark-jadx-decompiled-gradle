package com.ss.android.vesdk.filterparam;

public class VEMultiComposerFilterParam extends VEComposerFilterParam {
    @Override // com.ss.android.vesdk.filterparam.VEComposerFilterParam
    public boolean isOverallComposer() {
        return false;
    }

    public VEMultiComposerFilterParam() {
        this.filterName = "multi composer filter";
    }
}
