package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;

public class ResourceListResponse extends BaseNetResponse {
    private ResourceListModel data;

    public ResourceListModel getData() {
        return this.data;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        ResourceListModel resourceListModel = this.data;
        if (resourceListModel == null || resourceListModel.getResourceList() == null) {
            return false;
        }
        return true;
    }

    public void setData(ResourceListModel resourceListModel) {
        this.data = resourceListModel;
    }
}
