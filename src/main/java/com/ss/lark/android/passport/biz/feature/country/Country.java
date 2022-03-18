package com.ss.lark.android.passport.biz.feature.country;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import java.io.Serializable;
import java.util.LinkedHashMap;

public class Country implements Serializable {
    private LinkedHashMap<String, CountryBean> data;
    @JSONField(name = "default_country")
    private String defaultCountry;
    @JSONField(name = "lark_data")
    private LinkedHashMap<String, CountryBean> larkData;
    @JSONField(name = "normal_list")
    private String[] normalList;
    @JSONField(name = "top_list")
    private String[] topList;

    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    public LinkedHashMap<String, CountryBean> getLarkData() {
        return this.larkData;
    }

    public String[] getTopList() {
        return this.topList;
    }

    public synchronized LinkedHashMap<String, CountryBean> getData() {
        CountryBean countryBean;
        for (String str : this.data.keySet()) {
            this.data.get(str).setKey(str);
            if (!(this.larkData == null || !ServiceFinder.m193748c().isLarkPackage() || (countryBean = this.larkData.get(str)) == null)) {
                countryBean.setKey(str);
                this.data.put(str, countryBean);
            }
        }
        return new LinkedHashMap<>(this.data);
    }

    public void setDefaultCountry(String str) {
        this.defaultCountry = str;
    }

    public void setLarkData(LinkedHashMap<String, CountryBean> linkedHashMap) {
        this.larkData = linkedHashMap;
    }

    public void setNormalList(String[] strArr) {
        this.normalList = strArr;
    }

    public void setTopList(String[] strArr) {
        this.topList = strArr;
    }

    public synchronized void setData(LinkedHashMap<String, CountryBean> linkedHashMap) {
        this.data = linkedHashMap;
    }
}
