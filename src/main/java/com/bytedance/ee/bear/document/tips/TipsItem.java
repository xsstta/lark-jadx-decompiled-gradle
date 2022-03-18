package com.bytedance.ee.bear.document.tips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0012HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\b¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/document/tips/TipsItem;", "", "jsonObj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "base64Image", "", "getBase64Image", "()Ljava/lang/String;", "ico", "Landroid/graphics/drawable/Drawable;", "getIco", "()Landroid/graphics/drawable/Drawable;", "setIco", "(Landroid/graphics/drawable/Drawable;)V", "id", "getId", "index", "", "getIndex", "()I", "setIndex", "(I)V", "getJsonObj", "()Lorg/json/JSONObject;", "text", "getText", "component1", "copy", "equals", "", "other", "hashCode", "toString", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.tips.c */
public final class TipsItem {

    /* renamed from: a */
    private final String f17219a;

    /* renamed from: b */
    private final String f17220b;

    /* renamed from: c */
    private final String f17221c;

    /* renamed from: d */
    private int f17222d;

    /* renamed from: e */
    private final JSONObject f17223e;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TipsItem) && Intrinsics.areEqual(this.f17223e, ((TipsItem) obj).f17223e);
        }
        return true;
    }

    public int hashCode() {
        JSONObject jSONObject = this.f17223e;
        if (jSONObject != null) {
            return jSONObject.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TipsItem(jsonObj=" + this.f17223e + ")";
    }

    /* renamed from: a */
    public final String mo24949a() {
        return this.f17219a;
    }

    /* renamed from: b */
    public final String mo24951b() {
        return this.f17221c;
    }

    /* renamed from: a */
    public final void mo24950a(int i) {
        this.f17222d = i;
    }

    public TipsItem(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObj");
        this.f17223e = jSONObject;
        String optString = jSONObject.optString("id");
        Intrinsics.checkExpressionValueIsNotNull(optString, "jsonObj.optString(\"id\")");
        this.f17219a = optString;
        String optString2 = jSONObject.optString("base64Image");
        Intrinsics.checkExpressionValueIsNotNull(optString2, "jsonObj.optString(\"base64Image\")");
        this.f17220b = optString2;
        String optString3 = jSONObject.optString("text");
        Intrinsics.checkExpressionValueIsNotNull(optString3, "jsonObj.optString(\"text\")");
        this.f17221c = optString3;
    }
}
