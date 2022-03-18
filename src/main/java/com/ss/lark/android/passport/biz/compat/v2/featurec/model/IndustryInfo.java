package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.lark.android.passport.biz.widget.picker.C65329b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class IndustryInfo extends BaseStepInfo implements C65329b.AbstractC65337b, Serializable {
    private List<DetailInfo> detail;
    private String industry;
    private String industryCode;

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public String getContent() {
        return this.industry;
    }

    public List<DetailInfo> getDetail() {
        return this.detail;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getIndustryCode() {
        return this.industryCode;
    }

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public String getKey() {
        return this.industryCode;
    }

    @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
    public List<C65329b.AbstractC65337b> getPickDatas() {
        if (this.detail == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DetailInfo detailInfo : this.detail) {
            arrayList.add(detailInfo);
        }
        return arrayList;
    }

    public IndustryInfo(String str, String str2, List<DetailInfo> list) {
        this.industry = str;
        this.industryCode = str2;
        this.detail = list;
    }
}
