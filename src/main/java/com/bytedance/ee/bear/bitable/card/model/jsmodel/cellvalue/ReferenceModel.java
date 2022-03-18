package com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.enums.ESegmentType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.TableDataModel;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4756c;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4769e;
import com.bytedance.ee.util.io.NonProguard;

public class ReferenceModel implements NonProguard {
    private String payload;
    private int proxyType;

    public ReferenceModel() {
    }

    public String getPayload() {
        return this.payload;
    }

    public int getProxyType() {
        return this.proxyType;
    }

    public boolean isReferenceType() {
        if (EFieldType.valueOf(this.proxyType) != EFieldType.NOT_SUPPORT) {
            return true;
        }
        return false;
    }

    public TableDataModel.RecordsBean.ContentBean parseToContentBean() {
        ParserConfig parserConfig = new ParserConfig();
        parserConfig.putDeserializer(ESegmentType.class, new C4769e());
        return (TableDataModel.RecordsBean.ContentBean) JSON.parseObject(this.payload, TableDataModel.RecordsBean.ContentBean.class, parserConfig, new C4756c(), JSON.DEFAULT_PARSER_FEATURE, new Feature[0]);
    }

    public void setPayload(String str) {
        this.payload = str;
    }

    public void setProxyType(int i) {
        this.proxyType = i;
    }

    public ReferenceModel(int i, String str) {
        this.proxyType = i;
        this.payload = str;
    }
}
