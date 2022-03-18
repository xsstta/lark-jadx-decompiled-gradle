package com.ss.android.appcenter.business.net.templatedata;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.workplacehome.TagChild;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.net.templatedata.d */
public class C27761d {
    @SerializedName("children")

    /* renamed from: a */
    public List<TagChild> f69355a;
    @SerializedName("itemInfos")

    /* renamed from: b */
    public Map<String, ItemInfo> f69356b;

    public String toString() {
        return String.format("CommonAndRecommendData{children=%s}", this.f69355a);
    }
}
