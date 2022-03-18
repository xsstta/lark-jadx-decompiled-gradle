package com.ss.android.lark.applink;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import java.util.List;
import kotlin.Metadata;

@AppConfig(key = "key_open_app_link_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/applink/AppLinkPathSetting;", "", "()V", "paths", "", "", "getPaths", "()Ljava/util/List;", "setPaths", "(Ljava/util/List;)V", "lib_applink_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AppLinkPathSetting {
    @SerializedName("paths")

    /* renamed from: a */
    private List<String> f73031a;

    /* renamed from: a */
    public final List<String> mo103446a() {
        return this.f73031a;
    }
}
