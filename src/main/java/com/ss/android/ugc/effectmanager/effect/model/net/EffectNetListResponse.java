package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;

public class EffectNetListResponse extends BaseNetResponse {
    private EffectChannelModel data;

    public EffectChannelModel getData() {
        return this.data;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel == null || !effectChannelModel.checkValued()) {
            return false;
        }
        return true;
    }

    public void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }
}
