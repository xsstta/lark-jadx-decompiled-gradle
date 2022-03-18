package com.ss.android.lark.message.card.view.richtext;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.C58475b;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.message.card.view.richtext.b */
public class C45345b {
    /* renamed from: a */
    private static void m180072a(NodeParams nodeParams, RichTextElement richTextElement, Map<String, RichTextElement> map, RichText richText, int i) {
        List<String> childIds = richTextElement.getChildIds();
        if (!CollectionUtils.isEmpty(childIds)) {
            for (String str : childIds) {
                NodeParams nodeParams2 = new NodeParams(i);
                nodeParams.mChildParams.add(nodeParams2);
                nodeParams2.mParents = nodeParams;
                RichTextElement richTextElement2 = map.get(str);
                if (richTextElement2 != null) {
                    nodeParams2.mRichTextProperty = richTextElement2.getProperty();
                    nodeParams2.mRichTextTag = richTextElement2.getTag();
                    nodeParams2.mStyleKeys = richTextElement2.getStyleKeys();
                    C45375h.m180203a(richText, i, nodeParams2);
                    nodeParams2.mYogaProperty = m180069a(richTextElement2.getStyle());
                    m180073a(nodeParams2, richTextElement2.getStyle(), i);
                    m180072a(nodeParams2, richTextElement2, map, richText, i);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m180071a(NodeParams nodeParams) {
        Context a = C45294c.m179871a().mo143887a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (nodeParams != null && nodeParams.mRichTextTag != null) {
            switch (C453461.f114832a[nodeParams.mRichTextTag.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C45348d.m180110a(a, arrayList, arrayList2, arrayList3, arrayList4, sb, nodeParams);
                    nodeParams.mSpannableString = C58475b.m226783a().mo198109a(a, sb.toString(), new RecogniseSpansResult.C59147a().mo201044b(arrayList).mo201042a(arrayList2).mo201047e(arrayList3).mo201056n(arrayList4).mo201043a().getAllSpanInfos(), new SpannableStringExtraParams.Builder(a).mo198079b(true).mo198071a(UIUtils.dp2px(a, nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED ? nodeParams.mTextSize : 14.0f)).mo198072a(C45294c.m179871a().mo143901b()).mo198082c(false).mo198086e(UIHelper.getColor(R.color.lkui_B500)).mo198084d(UIHelper.getColor(R.color.lkui_N00)).mo198107v());
                    return;
                case 8:
                    List<NodeParams> list = nodeParams.mChildParams;
                    if (CollectionUtils.isNotEmpty(list)) {
                        for (NodeParams nodeParams2 : list) {
                            C45348d.m180110a(a, arrayList, arrayList2, arrayList3, arrayList4, sb, nodeParams2);
                        }
                        nodeParams.mSpannableString = C58475b.m226783a().mo198109a(a, sb.toString(), new RecogniseSpansResult.C59147a().mo201044b(arrayList).mo201042a(arrayList2).mo201047e(arrayList3).mo201056n(arrayList4).mo201043a().getAllSpanInfos(), new SpannableStringExtraParams.Builder(a).mo198079b(true).mo198071a(UIUtils.dp2px(a, nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED ? nodeParams.mTextSize : 14.0f)).mo198072a(C45294c.m179871a().mo143901b()).mo198082c(false).mo198086e(UIHelper.getColor(R.color.lkui_B500)).mo198084d(UIHelper.getColor(R.color.lkui_N00)).mo198107v());
                        return;
                    }
                    return;
                default:
                    for (NodeParams nodeParams3 : nodeParams.mChildParams) {
                        m180071a(nodeParams3);
                    }
                    return;
            }
        } else if (nodeParams != null) {
            for (NodeParams nodeParams4 : nodeParams.mChildParams) {
                m180071a(nodeParams4);
            }
        }
    }

    /* renamed from: a */
    private static void m180073a(NodeParams nodeParams, Map<String, String> map, int i) {
        if (!CollectionUtils.isEmpty(map)) {
            nodeParams.mBgColor = m180065a(map, "backgroundColor");
            nodeParams.mTextColor = m180065a(map, "color");
            nodeParams.mFontStyleAndWeight = m180076b(map.get("fontWeight"), map.get("fontStyle"));
            nodeParams.mTextSize = m180077c(map.get("fontSize"));
            C45375h.m180201a(nodeParams, i);
            int i2 = C453461.f114832a[nodeParams.mRichTextTag.ordinal()];
            if (i2 != 1) {
                switch (i2) {
                    case 7:
                    case 8:
                        break;
                    case 9:
                        if (map.get("borderRadius") != null) {
                            if (nodeParams.mExtraProperties == null) {
                                nodeParams.mExtraProperties = new HashMap(1);
                            }
                            nodeParams.mExtraProperties.put("borderRadius", map.get("borderRadius"));
                            return;
                        }
                        return;
                    case 10:
                    case 11:
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                    case 13:
                    case 14:
                    case 15:
                        if (nodeParams.mExtraProperties == null) {
                            nodeParams.mExtraProperties = new HashMap(RichTextStyle.f114821a.length);
                        }
                        String[] strArr = RichTextStyle.f114821a;
                        for (String str : strArr) {
                            if (map.get(str) != null) {
                                nodeParams.mExtraProperties.put(str, map.get(str));
                            }
                        }
                        return;
                    default:
                        return;
                }
            }
            if (nodeParams.mExtraProperties == null) {
                nodeParams.mExtraProperties = new HashMap(2);
            }
            if (map.get("textDecoration") != null) {
                nodeParams.mExtraProperties.put("textDecoration", map.get("textDecoration"));
            }
            if (map.get("textAlign") != null) {
                nodeParams.mExtraProperties.put("textAlign", map.get("textAlign"));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.message.card.view.richtext.b$1 */
    public static /* synthetic */ class C453461 {

        /* renamed from: a */
        static final /* synthetic */ int[] f114832a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.view.richtext.C45345b.C453461.<clinit>():void");
        }
    }

    /* renamed from: p */
    private static float m180090p(String str) {
        return m180074b(str, 1.0E21f);
    }

    /* renamed from: f */
    private static float m180080f(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 1.0E21f;
        }
    }

    /* renamed from: g */
    private static float m180081g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* renamed from: h */
    private static float m180082h(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 1.0f;
        }
    }

    /* renamed from: r */
    private static float m180092r(String str) {
        return (float) UIHelper.dp2px(m180074b(str, (float) BitmapDescriptorFactory.HUE_RED));
    }

    /* renamed from: c */
    private static float m180077c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1.0f;
        }
    }

    /* renamed from: o */
    private static float m180089o(String str) {
        float b = m180074b(str, 1.0E21f);
        if (Float.compare(b, 1.0E21f) == 0) {
            return b;
        }
        return (float) UIHelper.dp2px(b);
    }

    /* renamed from: s */
    private static String m180093s(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || -1 == (indexOf = str.indexOf("%"))) {
            return "";
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: b */
    static int m180075b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Color.parseColor(str.trim());
        } catch (Exception e) {
            int color = UIHelper.getColor(R.color.lkui_N900);
            Log.m165384e("CardRichTextParser", "parse color error", e);
            return color;
        }
    }

    /* renamed from: m */
    private static YogaDisplay m180087m(String str) {
        YogaDisplay yogaDisplay = YogaDisplay.FLEX;
        if (TextUtils.isEmpty(str)) {
            return yogaDisplay;
        }
        if (str.trim().equals("flex")) {
            return YogaDisplay.FLEX;
        }
        if (str.trim().equals("none")) {
            return YogaDisplay.NONE;
        }
        return YogaDisplay.FLEX;
    }

    /* renamed from: n */
    private static YogaPositionType m180088n(String str) {
        YogaPositionType yogaPositionType = YogaPositionType.RELATIVE;
        if (TextUtils.isEmpty(str)) {
            return yogaPositionType;
        }
        if (str.trim().equals("relative")) {
            return YogaPositionType.RELATIVE;
        }
        if (str.trim().equals("absolute")) {
            return YogaPositionType.ABSOLUTE;
        }
        return yogaPositionType;
    }

    /* renamed from: q */
    private static float[] m180091q(String str) {
        float[] fArr = new float[4];
        if (TextUtils.isEmpty(str)) {
            return fArr;
        }
        String[] split = str.trim().split(" ");
        for (int i = 0; i < split.length; i++) {
            float b = m180074b(split[i], (float) BitmapDescriptorFactory.HUE_RED);
            if (i < 4) {
                fArr[i] = (float) UIHelper.dp2px(b);
            }
        }
        return fArr;
    }

    /* renamed from: a */
    public static int m180064a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split("\\|")) == null || split.length <= 0) {
            return 3;
        }
        int i = 0;
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2.toLowerCase();
            }
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case -1364013995:
                    if (str2.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        c = 1;
                        break;
                    }
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i |= 1;
                    break;
                case 1:
                    i |= 3;
                    break;
                case 2:
                    i |= 5;
                    break;
            }
        }
        if (i != 0) {
            return i;
        }
        return 3;
    }

    /* renamed from: d */
    private static YogaFlexDirection m180078d(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1354837162:
                if (str.equals("column")) {
                    c = 0;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c = 1;
                    break;
                }
                break;
            case 13846440:
                if (str.equals("rowReverse")) {
                    c = 2;
                    break;
                }
                break;
            case 1902758572:
                if (str.equals("columnReverse")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return YogaFlexDirection.COLUMN;
            case 1:
                return YogaFlexDirection.ROW;
            case 2:
                return YogaFlexDirection.ROW_REVERSE;
            case 3:
                return YogaFlexDirection.COLUMN_REVERSE;
            default:
                return YogaFlexDirection.ROW;
        }
    }

    /* renamed from: e */
    private static YogaWrap m180079e(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1040545365:
                if (str.equals("noWrap")) {
                    c = 0;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 1;
                    break;
                }
                break;
            case 1144787768:
                if (str.equals("wrapReverse")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return YogaWrap.NO_WRAP;
            case 1:
                return YogaWrap.WRAP;
            case 2:
                return YogaWrap.WRAP_REVERSE;
            default:
                return YogaWrap.NO_WRAP;
        }
    }

    /* renamed from: i */
    private static YogaJustify m180083i(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1767512087:
                if (str.equals("flexStart")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -783548382:
                if (str.equals("spaceBetween")) {
                    c = 2;
                    break;
                }
                break;
            case -775036382:
                if (str.equals("flexEnd")) {
                    c = 3;
                    break;
                }
                break;
            case 1897612915:
                if (str.equals("spaceAround")) {
                    c = 4;
                    break;
                }
                break;
            case 2015518925:
                if (str.equals("spaceEvenly")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return YogaJustify.FLEX_START;
            case 1:
                return YogaJustify.CENTER;
            case 2:
                return YogaJustify.SPACE_BETWEEN;
            case 3:
                return YogaJustify.FLEX_END;
            case 4:
                return YogaJustify.SPACE_AROUND;
            case 5:
                return YogaJustify.SPACE_EVENLY;
            default:
                return YogaJustify.FLEX_START;
        }
    }

    /* renamed from: j */
    private static YogaAlign m180084j(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 0;
                    break;
                }
                break;
            case -1767512087:
                if (str.equals("flexStart")) {
                    c = 1;
                    break;
                }
                break;
            case -1721738651:
                if (str.equals("baseLine")) {
                    c = 2;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 3;
                    break;
                }
                break;
            case -783548382:
                if (str.equals("spaceBetween")) {
                    c = 4;
                    break;
                }
                break;
            case -775036382:
                if (str.equals("flexEnd")) {
                    c = 5;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 6;
                    break;
                }
                break;
            case 1897612915:
                if (str.equals("spaceAround")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return YogaAlign.STRETCH;
            case 1:
                return YogaAlign.FLEX_START;
            case 2:
                return YogaAlign.BASELINE;
            case 3:
                return YogaAlign.CENTER;
            case 4:
                return YogaAlign.SPACE_BETWEEN;
            case 5:
                return YogaAlign.FLEX_END;
            case 6:
                return YogaAlign.AUTO;
            case 7:
                return YogaAlign.SPACE_AROUND;
            default:
                return YogaAlign.AUTO;
        }
    }

    /* renamed from: k */
    private static YogaAlign m180085k(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 0;
                    break;
                }
                break;
            case -1767512087:
                if (str.equals("flexStart")) {
                    c = 1;
                    break;
                }
                break;
            case -1721738651:
                if (str.equals("baseLine")) {
                    c = 2;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 3;
                    break;
                }
                break;
            case -783548382:
                if (str.equals("spaceBetween")) {
                    c = 4;
                    break;
                }
                break;
            case -775036382:
                if (str.equals("flexEnd")) {
                    c = 5;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 6;
                    break;
                }
                break;
            case 1897612915:
                if (str.equals("spaceAround")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return YogaAlign.STRETCH;
            case 1:
                return YogaAlign.FLEX_START;
            case 2:
                return YogaAlign.BASELINE;
            case 3:
                return YogaAlign.CENTER;
            case 4:
                return YogaAlign.SPACE_BETWEEN;
            case 5:
                return YogaAlign.FLEX_END;
            case 6:
                return YogaAlign.AUTO;
            case 7:
                return YogaAlign.SPACE_AROUND;
            default:
                return YogaAlign.AUTO;
        }
    }

    /* renamed from: l */
    private static YogaAlign m180086l(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 0;
                    break;
                }
                break;
            case -1767512087:
                if (str.equals("flexStart")) {
                    c = 1;
                    break;
                }
                break;
            case -1721738651:
                if (str.equals("baseLine")) {
                    c = 2;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 3;
                    break;
                }
                break;
            case -783548382:
                if (str.equals("spaceBetween")) {
                    c = 4;
                    break;
                }
                break;
            case -775036382:
                if (str.equals("flexEnd")) {
                    c = 5;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 6;
                    break;
                }
                break;
            case 1897612915:
                if (str.equals("spaceAround")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return YogaAlign.STRETCH;
            case 1:
                return YogaAlign.FLEX_START;
            case 2:
                return YogaAlign.BASELINE;
            case 3:
                return YogaAlign.CENTER;
            case 4:
                return YogaAlign.SPACE_BETWEEN;
            case 5:
                return YogaAlign.FLEX_END;
            case 6:
                return YogaAlign.AUTO;
            case 7:
                return YogaAlign.SPACE_AROUND;
            default:
                return YogaAlign.STRETCH;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static YogaProperty m180069a(Map<String, String> map) {
        char c;
        YogaProperty yogaProperty = new YogaProperty();
        if (CollectionUtils.isEmpty(map)) {
            return yogaProperty;
        }
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            String s = m180093s(str2);
            str.hashCode();
            switch (str.hashCode()) {
                case -1783760955:
                    if (str.equals("flexBasis")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375815020:
                    if (str.equals("minWidth")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1063257157:
                    if (str.equals("alignItems")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -975171706:
                    if (str.equals("flexDirection")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -906066005:
                    if (str.equals("maxHeight")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -752601676:
                    if (str.equals("alignContent")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -133587431:
                    if (str.equals("minHeight")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 400381634:
                    if (str.equals("maxWidth")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 1031115618:
                    if (str.equals("flexShrink")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 1092174483:
                    if (str.equals("aspectRatio")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 1671764162:
                    if (str.equals(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 1743739820:
                    if (str.equals("flexGrow")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1744216035:
                    if (str.equals("flexWrap")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 1767100401:
                    if (str.equals("alignSelf")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1860657097:
                    if (str.equals("justifyContent")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    yogaProperty.flexBasis = m180080f(str2);
                    break;
                case 1:
                    yogaProperty.paddingLeft = m180092r(str2);
                    break;
                case 2:
                    yogaProperty.bottom = m180063a(str2, 1.0E21f);
                    break;
                case 3:
                    if (!TextUtils.isEmpty(str2)) {
                        int indexOf = str2.indexOf("%");
                        if (-1 == indexOf) {
                            yogaProperty.minWidth = m180089o(str2);
                            break;
                        } else {
                            yogaProperty.minWidthPercent = m180074b(str2.substring(0, indexOf), 1.0E21f);
                            break;
                        }
                    } else {
                        break;
                    }
                case 4:
                    if (!TextUtils.isEmpty(str2)) {
                        int indexOf2 = str2.indexOf("%");
                        if (-1 == indexOf2) {
                            yogaProperty.height = m180089o(str2);
                            break;
                        } else {
                            yogaProperty.heightPercent = m180074b(str2.substring(0, indexOf2), 1.0E21f);
                            break;
                        }
                    } else {
                        break;
                    }
                case 5:
                    float[] q = m180091q(str2);
                    yogaProperty.marginTop = q[0];
                    yogaProperty.marginRight = q[1];
                    yogaProperty.marginBottom = q[2];
                    yogaProperty.marginLeft = q[3];
                    break;
                case 6:
                    yogaProperty.alignItems = m180086l(str2).intValue();
                    break;
                case 7:
                    if (TextUtils.isEmpty(s)) {
                        yogaProperty.marginTop = m180092r(str2);
                        break;
                    } else {
                        yogaProperty.marginTopPercent = m180074b(s, 1.0E21f);
                        break;
                    }
                case '\b':
                    yogaProperty.flexDirection = m180078d(str2).intValue();
                    break;
                case '\t':
                    if (!TextUtils.isEmpty(str2)) {
                        int indexOf3 = str2.indexOf("%");
                        if (-1 == indexOf3) {
                            yogaProperty.maxHeight = m180089o(str2);
                            break;
                        } else {
                            yogaProperty.maxHeightPercent = m180074b(str2.substring(0, indexOf3), 1.0E21f);
                            break;
                        }
                    } else {
                        break;
                    }
                case '\n':
                    float[] q2 = m180091q(str2);
                    yogaProperty.paddingTop = q2[0];
                    yogaProperty.paddingRight = q2[1];
                    yogaProperty.paddingBottom = q2[2];
                    yogaProperty.paddingLeft = q2[3];
                    break;
                case 11:
                    yogaProperty.alignContent = m180084j(str2).intValue();
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    if (TextUtils.isEmpty(s)) {
                        yogaProperty.marginBottom = m180092r(str2);
                        break;
                    } else {
                        yogaProperty.marginBottomPercent = m180074b(s, 1.0E21f);
                        break;
                    }
                case '\r':
                    if (!TextUtils.isEmpty(str2)) {
                        int indexOf4 = str2.indexOf("%");
                        if (-1 == indexOf4) {
                            yogaProperty.minHeight = m180089o(str2);
                            break;
                        } else {
                            yogaProperty.minHeightPercent = m180074b(str2.substring(0, indexOf4), 1.0E21f);
                            break;
                        }
                    } else {
                        break;
                    }
                case 14:
                    yogaProperty.top = m180063a(str2, 1.0E21f);
                    break;
                case 15:
                    yogaProperty.left = m180063a(str2, 1.0E21f);
                    break;
                case 16:
                    yogaProperty.paddingTop = m180092r(str2);
                    break;
                case 17:
                    yogaProperty.right = m180063a(str2, 1.0E21f);
                    break;
                case 18:
                    if (!TextUtils.isEmpty(str2)) {
                        int indexOf5 = str2.indexOf("%");
                        if (-1 == indexOf5) {
                            yogaProperty.width = m180089o(str2);
                            break;
                        } else {
                            yogaProperty.widthPercent = m180074b(str2.substring(0, indexOf5), 1.0E21f);
                            break;
                        }
                    } else {
                        break;
                    }
                case 19:
                    yogaProperty.paddingBottom = m180092r(str2);
                    break;
                case 20:
                    if (!TextUtils.isEmpty(str2)) {
                        int indexOf6 = str2.indexOf("%");
                        if (-1 == indexOf6) {
                            yogaProperty.maxWidth = m180089o(str2);
                            break;
                        } else {
                            yogaProperty.maxWidthPercent = m180074b(str2.substring(0, indexOf6), 1.0E21f);
                            break;
                        }
                    } else {
                        break;
                    }
                case 21:
                    yogaProperty.paddingRight = m180092r(str2);
                    break;
                case 22:
                    yogaProperty.position = m180088n(str2).intValue();
                    break;
                case 23:
                    if (TextUtils.isEmpty(s)) {
                        yogaProperty.marginRight = m180092r(str2);
                        break;
                    } else {
                        yogaProperty.marginRightPercent = m180074b(s, 1.0E21f);
                        break;
                    }
                case 24:
                    yogaProperty.flexShrink = m180082h(str2);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    yogaProperty.aspectRatio = m180090p(str2);
                    break;
                case 26:
                    yogaProperty.display = m180087m(str2).intValue();
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    yogaProperty.flexGrow = m180081g(str2);
                    break;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    yogaProperty.flexWrap = m180079e(str2).intValue();
                    break;
                case 29:
                    yogaProperty.alignSelf = m180085k(str2).intValue();
                    break;
                case 30:
                    yogaProperty.justifyContent = m180083i(str2).intValue();
                    break;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    if (TextUtils.isEmpty(s)) {
                        yogaProperty.marginLeft = m180092r(str2);
                        break;
                    } else {
                        yogaProperty.marginLeftPercent = m180074b(s, 1.0E21f);
                        break;
                    }
            }
        }
        return yogaProperty;
    }

    /* renamed from: a */
    private static float m180063a(String str, float f) {
        float b = m180074b(str, 1.0E21f);
        if (Float.compare(b, 1.0E21f) == 0) {
            return b;
        }
        return (float) UIHelper.dp2px(b);
    }

    /* renamed from: b */
    private static float m180074b(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return f;
        }
    }

    /* renamed from: a */
    public static long m180066a(String str, String str2) {
        try {
            return new SimpleDateFormat(str2 + " Z").parse(str).getTime();
        } catch (Exception e) {
            Log.m165384e("msg_card", e.getMessage(), e);
            try {
                return new SimpleDateFormat(str2).parse(str).getTime();
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1;
            }
        }
    }

    /* renamed from: b */
    private static int m180076b(String str, String str2) {
        int i;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str) || !str.trim().equals("bold")) {
            i = 0;
        } else {
            i = 1;
        }
        if (!TextUtils.isEmpty(str2) && str2.trim().equals("italic")) {
            i += 2;
        }
        if (i == 1) {
            return 1;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                return 0;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static int m180065a(Map<String, String> map, String str) {
        Context a = C45294c.m179871a().mo143887a();
        if (!map.containsKey(str)) {
            Log.m165397w("CardRichTextParser", "style do not contain " + str);
        }
        int b = m180075b(map.get(str));
        String format = String.format("%sToken", str);
        String format2 = String.format("%sDarkMode", str);
        String str2 = map.get(format);
        if (!TextUtils.isEmpty(str2)) {
            int colorIdByToken = UDColorUtils.getColorIdByToken(a, str2);
            if (colorIdByToken > 0) {
                return UDColorUtils.getColor(a, colorIdByToken);
            }
            Log.m165397w("CardRichTextParser", "token color id is invalid colorTokenKey=" + format + " colorTokenValue=" + str2);
        } else {
            Log.m165397w("CardRichTextParser", "token color value is empty colorTokenKey=" + format);
        }
        String str3 = map.get(format2);
        if (!TextUtils.isEmpty(str3)) {
            int b2 = m180075b(str3);
            if (UDUiModeUtils.m93319a(a)) {
                return b2;
            }
        } else {
            Log.m165397w("CardRichTextParser", "dark color value is empty colorDarkKey=" + format2);
        }
        return b;
    }

    /* renamed from: a */
    public static NodeParams m180068a(RichText richText, int i) {
        if (richText == null) {
            Log.m165378d("RichText is null");
            return null;
        }
        NodeParams nodeParams = new NodeParams(i);
        m180067a(nodeParams, richText, i);
        if (C45294c.m179871a().mo143899a("lark.card.message.lightview")) {
            m180071a(nodeParams);
        }
        C45375h.m180202a(richText, i);
        return nodeParams;
    }

    /* renamed from: a */
    public static String m180070a(String str, long j) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static NodeParams m180067a(NodeParams nodeParams, RichText richText, int i) {
        List<String> elementIds = richText.getElementIds();
        Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
        Log.m165389i("CardRichTextParser", "cardVersion:" + i + ", zoom level" + LKUIDisplayManager.m91870a());
        for (int i2 = 0; i2 < elementIds.size(); i2++) {
            RichTextElement richTextElement = dictionary.get(elementIds.get(i2));
            if (richTextElement != null) {
                NodeParams nodeParams2 = new NodeParams(i);
                nodeParams2.mParents = nodeParams;
                nodeParams2.mRichTextProperty = richTextElement.getProperty();
                nodeParams2.mRichTextTag = richTextElement.getTag();
                nodeParams2.mStyleKeys = richTextElement.getStyleKeys();
                C45375h.m180203a(richText, i, nodeParams2);
                nodeParams2.mYogaProperty = m180069a(richTextElement.getStyle());
                m180073a(nodeParams2, richTextElement.getStyle(), i);
                nodeParams.mChildParams.add(nodeParams2);
                m180072a(nodeParams2, richTextElement, dictionary, richText, i);
            } else {
                Log.m165382e("Wrong rich text data structure");
            }
        }
        return nodeParams;
    }
}
