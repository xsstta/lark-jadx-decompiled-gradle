package com.ss.android.lark.widget.richtext.preprocess.p2966a;

import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.ElementExtra;
import com.ss.android.lark.widget.richtext2.span.p2975c.C59076b;
import com.ss.android.lark.widget.span.PrefixSpan;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.a.c */
public class C59041c {
    /* renamed from: a */
    public static PrefixSpan m229235a(ElementExtra.FloorInfo floorInfo) {
        float f;
        RichTextElement.RichTextProperty floorProperty = floorInfo.getFloorProperty();
        PrefixSpan.Type a = C59076b.m229456a(floorProperty);
        if (a == null) {
            return null;
        }
        float a2 = C59076b.m229453a(floorInfo.floor);
        float b = C59076b.m229458b(a);
        float c = C59076b.m229460c(a);
        PrefixSpan.C59145a a3 = new PrefixSpan.C59145a(a).mo201015a(floorInfo.isNeedDrawPrefix).mo201012a(a2).mo201017b(b).mo201019d(c).mo201013a(UIHelper.getColor(R.color.lkui_B500));
        if (a == PrefixSpan.Type.LIST_NUM) {
            RichTextElement.OLProperty oLProperty = (RichTextElement.OLProperty) floorProperty;
            a3.mo201014a(C59076b.m229459b(oLProperty, floorInfo.index));
            f = C59076b.m229454a(oLProperty, floorInfo.index);
        } else {
            f = C59076b.m229455a(a);
        }
        return a3.mo201018c(f).mo201016a();
    }

    /* renamed from: a */
    public static boolean m229238a(String str, Map<String, RichTextElement> map) {
        RichTextElement richTextElement = map.get(str);
        if (richTextElement == null || richTextElement.getTag() != RichTextElement.RichTextTag.UL) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m229239b(String str, Map<String, RichTextElement> map) {
        RichTextElement richTextElement = map.get(str);
        if (richTextElement == null || richTextElement.getTag() != RichTextElement.RichTextTag.OL) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m229240c(String str, Map<String, RichTextElement> map) {
        RichTextElement richTextElement = map.get(str);
        if (richTextElement == null || richTextElement.getTag() != RichTextElement.RichTextTag.LI) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m229237a(ElementExtra elementExtra, Map<String, RichTextElement> map) {
        RichTextElement richTextElement = map.get(elementExtra.getParentId());
        if (richTextElement == null) {
            return false;
        }
        if (richTextElement.getTag() == RichTextElement.RichTextTag.LI) {
            return true;
        }
        return m229237a(richTextElement.getElementExtra(), map);
    }

    /* renamed from: a */
    public static void m229236a(RichTextElement richTextElement, Map<String, RichTextElement> map) {
        RichTextElement.RichTextProperty property = richTextElement.getProperty();
        if ((property instanceof RichTextElement.ULProperty) || (property instanceof RichTextElement.OLProperty)) {
            List<String> childIds = richTextElement.getChildIds();
            ElementExtra.FloorInfo floorInfo = richTextElement.getElementExtra().getFloorInfo();
            if (childIds != null) {
                int i = -1;
                for (String str : childIds) {
                    RichTextElement richTextElement2 = map.get(str);
                    if (richTextElement2 != null) {
                        ElementExtra elementExtra = richTextElement2.getElementExtra();
                        boolean c = m229240c(str, map);
                        if (!c && !m229238a(str, map)) {
                            m229239b(str, map);
                        }
                        ElementExtra.FloorInfo floorInfo2 = elementExtra.getFloorInfo();
                        floorInfo2.floor = floorInfo.floor + 1;
                        if (c) {
                            i++;
                            floorInfo2.index = i;
                            floorInfo2.setFloorProperty(property);
                        } else {
                            int i2 = floorInfo2.floor;
                        }
                    }
                }
            }
        }
    }
}
