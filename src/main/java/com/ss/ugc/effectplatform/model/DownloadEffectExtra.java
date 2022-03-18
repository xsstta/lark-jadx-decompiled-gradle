package com.ss.ugc.effectplatform.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;", "", "panel", "", "(Ljava/lang/String;)V", "getPanel", "()Ljava/lang/String;", "setPanel", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.a */
public class DownloadEffectExtra {
    private String panel;

    public DownloadEffectExtra() {
        this(null, 1, null);
    }

    public String getPanel() {
        return this.panel;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public DownloadEffectExtra(String str) {
        this.panel = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadEffectExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
