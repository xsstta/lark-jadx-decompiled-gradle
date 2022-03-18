package com.bytedance.ee.bear.drive.biz.preview.configuration;

import android.content.res.Configuration;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/configuration/DriveConfigurationPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onConfigurationChanged", "", "newConfiguration", "Landroid/content/res/Configuration;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveConfigurationPlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((DriveConfigurationVM) viewModel(DriveConfigurationVM.class)).getLiveConfiguration().mo5926a(configuration);
    }
}
