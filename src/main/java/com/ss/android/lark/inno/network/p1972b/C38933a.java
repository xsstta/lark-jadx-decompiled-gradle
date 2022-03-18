package com.ss.android.lark.inno.network.p1972b;

import android.util.ArrayMap;
import com.larksuite.framework.http.request.HttpMethod;
import com.ss.android.lark.inno.network.p1971a.AbstractC38931c;
import java.util.Map;

/* renamed from: com.ss.android.lark.inno.network.b.a */
public class C38933a extends AbstractC38931c<String> {

    /* renamed from: b */
    private final String f100024b;

    @Override // com.larksuite.framework.http.request.C26010a, com.ss.android.lark.inno.network.p1971a.AbstractC38931c
    /* renamed from: b */
    public String mo92478b() {
        return "/live/cms_api/v2/decoration";
    }

    @Override // com.ss.android.lark.inno.network.p1971a.AbstractC38931c
    /* renamed from: o */
    public HttpMethod mo142530o() {
        return HttpMethod.GET;
    }

    @Override // com.ss.android.lark.inno.network.p1971a.AbstractC38931c
    /* renamed from: m */
    public Map<String, String> mo142528m() {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("live_id", this.f100024b);
        return arrayMap;
    }

    public C38933a(String str, String str2) {
        super(str);
        this.f100024b = str2;
    }
}
