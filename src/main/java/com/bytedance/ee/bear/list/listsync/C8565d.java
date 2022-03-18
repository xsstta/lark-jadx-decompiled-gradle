package com.bytedance.ee.bear.list.listsync;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.recent.RecentSort;
import com.bytedance.ee.bear.service.C10917c;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.listsync.d */
public class C8565d extends AbstractC8561a {
    public C8565d(C10917c cVar, AbstractC8564c cVar2) {
        super(cVar, 1, cVar2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.listsync.AbstractC8561a
    /* renamed from: a */
    public void mo33414a(JSONObject jSONObject, Document document) {
        if (jSONObject.has("open_time")) {
            document.mo32476p(jSONObject.optString("open_time"));
        }
        if (jSONObject.has("my_edit_time")) {
            document.mo32497z(jSONObject.optString("my_edit_time"));
        }
        if (jSONObject.has("activity_time")) {
            document.mo32374A(jSONObject.optString("activity_time"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.listsync.AbstractC8561a
    /* renamed from: a */
    public boolean mo33415a(Document document, Document document2) {
        if (this.f23231c == null || this.f23231c.mo31549b() == RecentSort.ALL.getRank()) {
            return !TextUtils.equals(document.mo32391J(), document2.mo32391J());
        }
        if (this.f23231c.mo31549b() == RecentSort.MODIFIED.getRank()) {
            return !TextUtils.equals(document.mo32389I(), document2.mo32389I());
        }
        if (this.f23231c.mo31549b() == RecentSort.CREATED.getRank()) {
            return !TextUtils.equals(document.mo32373A(), document2.mo32373A());
        }
        return !TextUtils.equals(document.mo32492x(), document2.mo32492x());
    }
}
