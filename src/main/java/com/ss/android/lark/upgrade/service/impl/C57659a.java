package com.ss.android.lark.upgrade.service.impl;

import com.bytedance.lark.pb.basic.v1.UpdatePlan;
import com.ss.android.lark.upgrade.enity.UpgradePlan;
import com.ss.android.lark.upgrade.enity.VersionData;

/* renamed from: com.ss.android.lark.upgrade.service.impl.a */
public class C57659a {
    /* renamed from: a */
    public static UpgradePlan m223866a(UpdatePlan updatePlan) {
        if (updatePlan == null) {
            return null;
        }
        UpgradePlan upgradePlan = new UpgradePlan();
        upgradePlan.setNoticePlan(updatePlan.notice_plan.intValue());
        upgradePlan.setPopupPlan(updatePlan.popup_plan.intValue());
        upgradePlan.setSnoozePlan(updatePlan.snooze_plan.intValue());
        upgradePlan.setSkipPlan(updatePlan.skip_plan.intValue());
        return upgradePlan;
    }

    /* renamed from: a */
    public static VersionData m223867a(com.bytedance.lark.pb.basic.v1.VersionData versionData) {
        if (versionData == null) {
            return null;
        }
        VersionData versionData2 = new VersionData();
        versionData2.setVersion(versionData.version);
        versionData2.setDownloadUrl(versionData.download_url);
        versionData2.setDownloadMd5(versionData.download_md5);
        versionData2.setReleaseNotes(versionData.release_notes);
        versionData2.setReleaseTime(versionData.release_time);
        return versionData2;
    }
}
