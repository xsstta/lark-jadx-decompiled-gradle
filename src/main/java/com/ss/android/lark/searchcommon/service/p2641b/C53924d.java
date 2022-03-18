package com.ss.android.lark.searchcommon.service.p2641b;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.suite.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"COLOR", "", "COLOR_MAP", "", "", "Landroidx/annotation/ColorRes;", "getCOLOR_MAP", "()Ljava/util/Map;", "DEFAULT_COLOR", "GREY", "HIGHLIGHT_TAG", "INVALID_INDEX", "STYLE_TAG", "parserAttrs", "", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "supportTag", "", "tag", "search-common_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.d */
public final class C53924d {

    /* renamed from: a */
    private static final Map<String, Integer> f133242a;

    /* renamed from: a */
    public static final Map<String, Integer> m209007a() {
        return f133242a;
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("grey", Integer.valueOf((int) R.color.text_placeholder));
        f133242a = linkedHashMap;
    }

    /* renamed from: a */
    public static final boolean m209009a(String str) {
        if (Intrinsics.areEqual(str, C14002h.f36692e) || Intrinsics.areEqual(str, "di") || Intrinsics.areEqual(str, "asl-style")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final Map<String, String> m209008a(XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (attributeCount > 0) {
            attributeCount--;
            String attributeName = xmlPullParser.getAttributeName(attributeCount);
            Intrinsics.checkExpressionValueIsNotNull(attributeName, "parser.getAttributeName(attributeCount)");
            String attributeValue = xmlPullParser.getAttributeValue(attributeCount);
            Intrinsics.checkExpressionValueIsNotNull(attributeValue, "parser.getAttributeValue(attributeCount)");
            linkedHashMap.put(attributeName, attributeValue);
        }
        return linkedHashMap;
    }
}
