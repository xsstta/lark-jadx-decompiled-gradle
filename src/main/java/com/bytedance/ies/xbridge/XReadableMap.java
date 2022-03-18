package com.bytedance.ies.xbridge;

import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0015H&J\u0016\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H&¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ies/xbridge/XReadableMap;", "", "get", "Lcom/bytedance/ies/xbridge/XDynamic;", "name", "", "getArray", "Lcom/bytedance/ies/xbridge/XReadableArray;", "getBoolean", "", "getDouble", "", "getInt", "", "getMap", "getString", "getType", "Lcom/bytedance/ies/xbridge/XReadableType;", "hasKey", "isNull", "keyIterator", "Lcom/bytedance/ies/xbridge/XKeyIterator;", "toMap", "", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.h */
public interface XReadableMap {
    /* renamed from: a */
    XKeyIterator mo53100a();

    /* renamed from: a */
    boolean mo53101a(String str);

    /* renamed from: b */
    Map<String, Object> mo53102b();

    /* renamed from: b */
    boolean mo53103b(String str);

    /* renamed from: c */
    boolean mo53104c(String str);

    /* renamed from: d */
    double mo53105d(String str);

    /* renamed from: e */
    int mo53106e(String str);

    /* renamed from: f */
    String mo53107f(String str);

    /* renamed from: g */
    XReadableArray mo53108g(String str);

    /* renamed from: h */
    XReadableMap mo53109h(String str);

    /* renamed from: i */
    XDynamic mo53110i(String str);

    /* renamed from: j */
    XReadableType mo53111j(String str);
}
