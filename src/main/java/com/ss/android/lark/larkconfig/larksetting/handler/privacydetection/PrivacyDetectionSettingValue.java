package com.ss.android.lark.larkconfig.larksetting.handler.privacydetection;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@AppConfig(key = "privacy_detection_dynamic_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/privacydetection/PrivacyDetectionSettingValue;", "", "()V", "anchors", "", "Lcom/ss/android/lark/larkconfig/larksetting/handler/privacydetection/Anchor;", "getAnchors", "()Ljava/util/List;", "setAnchors", "(Ljava/util/List;)V", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacyDetectionSettingValue {
    @SerializedName("anchors")
    private List<Anchor> anchors = new ArrayList();

    public final List<Anchor> getAnchors() {
        return this.anchors;
    }

    public final void setAnchors(List<Anchor> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.anchors = list;
    }
}
