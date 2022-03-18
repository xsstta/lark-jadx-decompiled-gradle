package com.bytedance.ee.larkbrand.abtest.experiment;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import kotlin.Metadata;

@AppConfig(key = "process_arch_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/larkbrand/abtest/experiment/ProcessArchExperiment;", "", "()V", "enableReducing", "", "miniAppProcessCount", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ProcessArchExperiment {
    @SerializedName("miniAppProcessCount")

    /* renamed from: a */
    public int f34512a = 5;
}
