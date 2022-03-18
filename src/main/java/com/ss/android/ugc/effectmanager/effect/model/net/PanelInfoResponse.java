package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

public class PanelInfoResponse extends BaseNetResponse {
    private PanelInfoModel data;

    public PanelInfoModel getData() {
        return this.data;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public String getRecId() {
        PanelInfoModel panelInfoModel = this.data;
        if (panelInfoModel == null) {
            return null;
        }
        return panelInfoModel.getRecID();
    }

    public void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }
}
