package com.bytedance.ee.bear.drive.ability;

import com.bytedance.ee.bear.browser.plugin.PluginHostAbility;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/ability/FileHostAbility;", "Lcom/bytedance/ee/bear/browser/plugin/PluginHostAbility;", "getFileSize", "", "()Ljava/lang/Long;", "drive-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.a.a */
public interface FileHostAbility extends PluginHostAbility {
    Long getFileSize();
}
