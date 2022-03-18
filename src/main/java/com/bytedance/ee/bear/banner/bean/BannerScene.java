package com.bytedance.ee.bear.banner.bean;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/banner/bean/BannerScene;", "", "reachId", "", "scenarioId", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getReachId", "()Ljava/lang/String;", "getScenarioId", CodePackage.COMMON, "TEMPLATE", "banner-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum BannerScene {
    COMMON("RP_CCM-HOME_TOP", "SCENE_COMMON"),
    TEMPLATE("RP_CCM_TEMPLATE", "SCENE_CCM_TEMPLATE");
    
    private final String reachId;
    private final String scenarioId;

    public final String getReachId() {
        return this.reachId;
    }

    public final String getScenarioId() {
        return this.scenarioId;
    }

    private BannerScene(String str, String str2) {
        this.reachId = str;
        this.scenarioId = str2;
    }
}
