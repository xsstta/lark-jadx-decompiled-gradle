package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.segment.a */
public class C11211a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.segment.a$1 */
    public static /* synthetic */ class C112121 {

        /* renamed from: a */
        static final /* synthetic */ int[] f30145a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType[] r0 = com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a.C112121.f30145a = r0
                com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType r1 = com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a.C112121.f30145a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType r1 = com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType.MENTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a.C112121.f30145a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType r1 = com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType.URL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a.C112121.f30145a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType r1 = com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType.EMBED_IMAGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a.C112121.f30145a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType r1 = com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType.PANO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a.C112121.f30145a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType r1 = com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentType.ATTACHMENT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a.C112121.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static List<BaseSegment> m46611a(String str) {
        ArrayList arrayList = new ArrayList();
        ParserConfig parserConfig = new ParserConfig();
        parserConfig.putDeserializer(SegmentType.class, new C11213b());
        JSONArray parseArray = JSONArray.parseArray(str);
        if (parseArray != null) {
            for (int i = 0; i < parseArray.size(); i++) {
                JSONObject jSONObject = parseArray.getJSONObject(i);
                switch (C112121.f30145a[SegmentType.parseSegmentType(jSONObject.getString(ShareHitPoint.f121869d)).ordinal()]) {
                    case 1:
                        arrayList.add(JSON.parseObject(jSONObject.toJSONString(), TextSegment.class, parserConfig, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]));
                        break;
                    case 2:
                        arrayList.add(JSON.parseObject(jSONObject.toJSONString(), MentionSegment.class, parserConfig, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]));
                        break;
                    case 3:
                        arrayList.add(JSON.parseObject(jSONObject.toJSONString(), HyperLinkSegment.class, parserConfig, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]));
                        break;
                    case 4:
                        arrayList.add(JSON.parseObject(jSONObject.toJSONString(), EmbedImageSegment.class, parserConfig, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]));
                        break;
                    case 5:
                        arrayList.add(JSON.parseObject(jSONObject.toJSONString(), PanoSegment.class, parserConfig, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]));
                        break;
                    case 6:
                        arrayList.add(JSON.parseObject(jSONObject.toJSONString(), AttachmentSegment.class, parserConfig, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]));
                        break;
                }
            }
        }
        return arrayList;
    }
}
