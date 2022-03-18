package com.bytedance.ee.bear.drive.biz.preview.configuration;

import android.content.res.Configuration;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/configuration/DriveConfigurationVM;", "Landroidx/lifecycle/ViewModel;", "()V", "liveConfiguration", "Landroidx/lifecycle/MutableLiveData;", "Landroid/content/res/Configuration;", "getLiveConfiguration", "()Landroidx/lifecycle/MutableLiveData;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.configuration.a */
public final class DriveConfigurationVM extends AbstractC1142af {
    private final C1177w<Configuration> liveConfiguration = new C1177w<>();

    public final C1177w<Configuration> getLiveConfiguration() {
        return this.liveConfiguration;
    }
}
