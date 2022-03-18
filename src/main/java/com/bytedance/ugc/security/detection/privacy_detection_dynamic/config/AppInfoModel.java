package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/AppInfoModel;", "", "application", "Landroid/app/Application;", "channel", "", "(Landroid/app/Application;Ljava/lang/String;)V", "getApplication", "()Landroid/app/Application;", "getChannel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AppInfoModel {
    private final Application application;
    private final String channel;

    public static /* synthetic */ AppInfoModel copy$default(AppInfoModel appInfoModel, Application application2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            application2 = appInfoModel.application;
        }
        if ((i & 2) != 0) {
            str = appInfoModel.channel;
        }
        return appInfoModel.copy(application2, str);
    }

    public final Application component1() {
        return this.application;
    }

    public final String component2() {
        return this.channel;
    }

    public final AppInfoModel copy(Application application2, String str) {
        Intrinsics.checkParameterIsNotNull(application2, "application");
        Intrinsics.checkParameterIsNotNull(str, "channel");
        return new AppInfoModel(application2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfoModel)) {
            return false;
        }
        AppInfoModel appInfoModel = (AppInfoModel) obj;
        return Intrinsics.areEqual(this.application, appInfoModel.application) && Intrinsics.areEqual(this.channel, appInfoModel.channel);
    }

    public int hashCode() {
        Application application2 = this.application;
        int i = 0;
        int hashCode = (application2 != null ? application2.hashCode() : 0) * 31;
        String str = this.channel;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppInfoModel(application=" + this.application + ", channel=" + this.channel + ")";
    }

    public final Application getApplication() {
        return this.application;
    }

    public final String getChannel() {
        return this.channel;
    }

    public AppInfoModel(Application application2, String str) {
        Intrinsics.checkParameterIsNotNull(application2, "application");
        Intrinsics.checkParameterIsNotNull(str, "channel");
        this.application = application2;
        this.channel = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppInfoModel(Application application2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application2, (i & 2) != 0 ? "" : str);
    }
}
