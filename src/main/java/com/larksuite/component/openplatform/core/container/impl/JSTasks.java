package com.larksuite.component.openplatform.core.container.impl;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/openplatform/core/container/impl/JSTasks;", "", "name", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getData", "()Lorg/json/JSONObject;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.container.impl.e */
public final class JSTasks {

    /* renamed from: a */
    private final String f60410a;

    /* renamed from: b */
    private final JSONObject f60411b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSTasks)) {
            return false;
        }
        JSTasks eVar = (JSTasks) obj;
        return Intrinsics.areEqual(this.f60410a, eVar.f60410a) && Intrinsics.areEqual(this.f60411b, eVar.f60411b);
    }

    public int hashCode() {
        String str = this.f60410a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f60411b;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "JSTasks(name=" + this.f60410a + ", data=" + this.f60411b + ")";
    }

    /* renamed from: a */
    public final String mo87349a() {
        return this.f60410a;
    }

    /* renamed from: b */
    public final JSONObject mo87350b() {
        return this.f60411b;
    }

    public JSTasks(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f60410a = str;
        this.f60411b = jSONObject;
    }
}
