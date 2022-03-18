package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

public class ProviderEffectListResponse extends BaseNetResponse {
    private ProviderEffectModel data;

    public ProviderEffectModel getData() {
        return this.data;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }
}
