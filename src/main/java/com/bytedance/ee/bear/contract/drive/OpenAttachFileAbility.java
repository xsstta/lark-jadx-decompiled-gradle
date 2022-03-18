package com.bytedance.ee.bear.contract.drive;

import com.bytedance.ee.bear.browser.plugin.PluginHostAbility;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceThirdPartyOpenEntity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/contract/drive/OpenAttachFileAbility;", "Lcom/bytedance/ee/bear/browser/plugin/PluginHostAbility;", "closeAttachFile", "", "entity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/SpaceThirdPartyOpenEntity;", "openAttachFile", "drive-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.contract.drive.d */
public interface OpenAttachFileAbility extends PluginHostAbility {
    void openAttachFile(SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity);
}
