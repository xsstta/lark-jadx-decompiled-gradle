package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.lark.android.passport.biz.widget.picker.C65329b;
import java.io.Serializable;
import java.util.List;

public class DetailInfo extends BaseStepInfo implements C65329b.AbstractC65337b, Serializable {
    private String detailCode;
    private String detailInfo;

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public List<C65329b.AbstractC65337b> getPickDatas() {
        return null;
    }

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public String getContent() {
        return this.detailInfo;
    }

    public String getDetailCode() {
        return this.detailCode;
    }

    public String getDetailInfo() {
        return this.detailInfo;
    }

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public String getKey() {
        return this.detailCode;
    }

    public DetailInfo(String str, String str2) {
        this.detailInfo = str;
        this.detailCode = str2;
    }
}
