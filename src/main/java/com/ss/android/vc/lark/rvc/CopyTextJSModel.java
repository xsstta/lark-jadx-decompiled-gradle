package com.ss.android.vc.lark.rvc;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/lark/rvc/CopyTextJSModel;", "Lcom/ss/android/lark/openapi/jsapi/entity/BaseJSModel;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CopyTextJSModel implements BaseJSModel {
    private final String text;

    public final String getText() {
        return this.text;
    }

    public CopyTextJSModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.text = str;
    }
}
