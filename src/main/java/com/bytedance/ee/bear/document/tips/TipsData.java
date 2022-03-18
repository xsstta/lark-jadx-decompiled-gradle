package com.bytedance.ee.bear.document.tips;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/document/tips/TipsData;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "items", "", "Lcom/bytedance/ee/bear/document/tips/TipsItem;", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.tips.b */
public final class TipsData {

    /* renamed from: a */
    private final List<TipsItem> f17217a = new ArrayList();

    /* renamed from: b */
    private final String f17218b;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TipsData) && Intrinsics.areEqual(this.f17218b, ((TipsData) obj).f17218b);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f17218b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TipsData(data=" + this.f17218b + ")";
    }

    /* renamed from: a */
    public final List<TipsItem> mo24945a() {
        return this.f17217a;
    }

    public TipsData(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f17218b = str;
        JSONArray optJSONArray = new JSONObject(str).optJSONArray("items");
        int length = optJSONArray.length() - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                Intrinsics.checkExpressionValueIsNotNull(jSONObject, "itemList.getJSONObject(i)");
                TipsItem cVar = new TipsItem(jSONObject);
                cVar.mo24950a(i);
                ((ArrayList) this.f17217a).add(cVar);
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
