package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

public class EffectCheckUpdateResponse extends BaseNetResponse {
    private boolean updated;

    public boolean isUpdated() {
        return this.updated;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        return super.checkValue();
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }
}
