package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import java.io.Serializable;
import java.util.LinkedHashMap;

public class CountryListManifest implements Serializable {
    private LinkedHashMap<String, CountryInfo> data;
    @JSONField(name = "default_country")
    private String defaultCountry;
    @JSONField(name = "lark_data")
    private LinkedHashMap<String, CountryInfo> larkData;
    @JSONField(name = "normal_list")
    private String[] normalList;
    @JSONField(name = "top_list")
    private String[] topList;

    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    public LinkedHashMap<String, CountryInfo> getLarkData() {
        return this.larkData;
    }

    public String[] getTopList() {
        return this.topList;
    }

    public String toJson() {
        return JSONObject.toJSONString(this);
    }

    public LinkedHashMap<String, CountryInfo> getData() {
        CountryInfo countryInfo;
        for (String str : this.data.keySet()) {
            this.data.get(str).setKey(str);
            if (!(this.larkData == null || !VideoChatModuleDependency.getAppEnvDependency().mo196333c() || (countryInfo = this.larkData.get(str)) == null)) {
                countryInfo.setKey(str);
                this.data.put(str, countryInfo);
            }
        }
        return this.data;
    }

    public void setData(LinkedHashMap<String, CountryInfo> linkedHashMap) {
        this.data = linkedHashMap;
    }

    public void setDefaultCountry(String str) {
        this.defaultCountry = str;
    }

    public void setLarkData(LinkedHashMap<String, CountryInfo> linkedHashMap) {
        this.larkData = linkedHashMap;
    }

    public void setNormalList(String[] strArr) {
        this.normalList = strArr;
    }

    public void setTopList(String[] strArr) {
        this.topList = strArr;
    }

    public static CountryListManifest fromJson(String str) {
        return (CountryListManifest) JSON.parseObject(str, CountryListManifest.class, Feature.OrderedField);
    }
}
