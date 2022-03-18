package com.ss.android.lark.widget.richtext;

import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.g */
public class C59033g {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.richtext.g$1 */
    public static /* synthetic */ class C590341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f146311a;

        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 265
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext.C59033g.C590341.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m229196a(RichText richText, AbstractC59028b bVar) {
        if (richText == null || C59035h.m229210a(richText)) {
            Log.m165378d("empty richText data");
            return;
        }
        List<String> elementIds = richText.getElementIds();
        Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
        bVar.mo146968a(richText);
        for (String str : elementIds) {
            RichTextElement richTextElement = dictionary.get(str);
            if (richTextElement != null) {
                m229198a(richTextElement, dictionary, bVar);
            } else {
                Log.m165382e("error richText struct");
            }
        }
        bVar.mo146990b(richText);
    }

    /* renamed from: b */
    public static void m229199b(RichText richText, AbstractC59028b bVar) {
        if (richText == null || C59035h.m229210a(richText)) {
            Log.m165378d("Empyt richtext data");
            return;
        }
        List<String> elementIds = richText.getElementIds();
        Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
        bVar.mo146968a(richText);
        for (String str : elementIds) {
            RichTextElement richTextElement = dictionary.get(str);
            if (richTextElement != null) {
                m229200b(richTextElement, dictionary, bVar);
            } else {
                Log.m165382e("error richText struct");
            }
        }
        bVar.mo146990b(richText);
    }

    /* renamed from: a */
    private static void m229197a(RichTextElement richTextElement, AbstractC59028b bVar) {
        switch (C590341.f146311a[richTextElement.getTag().ordinal()]) {
            case 1:
                if (richTextElement.getProperty() instanceof RichTextElement.AtProperty) {
                    bVar.mo146970a((RichTextElement.AtProperty) richTextElement.getProperty(), richTextElement.getStyle());
                    return;
                }
                return;
            case 2:
                if (richTextElement.getProperty() instanceof RichTextElement.MentionProperty) {
                    bVar.mo146984a((RichTextElement.MentionProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 3:
                if (richTextElement.getProperty() instanceof RichTextElement.TextProperty) {
                    bVar.mo146988a((RichTextElement.TextProperty) richTextElement.getProperty(), richTextElement.getStyle());
                    return;
                }
                return;
            case 4:
                if (richTextElement.getProperty() instanceof RichTextElement.ImageProperty) {
                    bVar.mo146980a((RichTextElement.ImageProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 5:
                if (richTextElement.getProperty() instanceof RichTextElement.BoldProperty) {
                    bVar.mo146971a((RichTextElement.BoldProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 6:
                if (richTextElement.getProperty() instanceof RichTextElement.ItalicProperty) {
                    bVar.mo146981a((RichTextElement.ItalicProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 7:
                if (richTextElement.getProperty() instanceof RichTextElement.UnderlineProperty) {
                    bVar.mo146989a((RichTextElement.UnderlineProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 8:
                if (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty) {
                    bVar.mo146969a((RichTextElement.AnchorProperty) richTextElement.getProperty(), richTextElement.getStyle());
                    return;
                }
                return;
            case 9:
                if (richTextElement.getProperty() instanceof RichTextElement.ParagraphProperty) {
                    bVar.mo146985a((RichTextElement.ParagraphProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 10:
                if (richTextElement.getProperty() instanceof RichTextElement.FigureProperty) {
                    bVar.mo146976a((RichTextElement.FigureProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 11:
                if (richTextElement.getProperty() instanceof RichTextElement.EmotionProperty) {
                    bVar.mo146975a((RichTextElement.EmotionProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                if (richTextElement.getProperty() instanceof RichTextElement.ButtonProperty) {
                    bVar.mo146972a((RichTextElement.ButtonProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 13:
                if (richTextElement.getProperty() instanceof RichTextElement.SelectProperty) {
                    bVar.mo146987a((RichTextElement.SelectProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 14:
                if (richTextElement.getProperty() instanceof RichTextElement.ProgressSelectOptionProperty) {
                    bVar.mo146986a((RichTextElement.ProgressSelectOptionProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 15:
                if (richTextElement.getProperty() instanceof RichTextElement.MediaProperty) {
                    bVar.mo146983a((RichTextElement.MediaProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 16:
                if (richTextElement.getProperty() instanceof RichTextElement.DocsProperty) {
                    bVar.mo146974a((RichTextElement.DocsProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 17:
                if (richTextElement.getProperty() instanceof RichTextElement.H1Property) {
                    bVar.mo146977a((RichTextElement.H1Property) richTextElement.getProperty());
                    return;
                }
                return;
            case 18:
                if (richTextElement.getProperty() instanceof RichTextElement.H2Property) {
                    bVar.mo146978a((RichTextElement.H2Property) richTextElement.getProperty());
                    return;
                }
                return;
            case 19:
                if (richTextElement.getProperty() instanceof RichTextElement.H3Property) {
                    bVar.mo146979a((RichTextElement.H3Property) richTextElement.getProperty());
                    return;
                }
                return;
            case 20:
                if (richTextElement.getProperty() instanceof RichTextElement.LIProperty) {
                    bVar.mo146982a((RichTextElement.LIProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 21:
                if (richTextElement.getProperty() instanceof RichTextElement.CodeBlockProperty) {
                    bVar.mo146973a((RichTextElement.CodeBlockProperty) richTextElement.getProperty());
                    return;
                }
                return;
            default:
                Log.m165382e("Received an unknown tag!");
                bVar.mo146967a();
                return;
        }
    }

    /* renamed from: a */
    private static void m229198a(RichTextElement richTextElement, Map<String, RichTextElement> map, AbstractC59028b bVar) {
        RichTextElement.RichTextTag tag = richTextElement.getTag();
        if (RichTextElement.RichTextTag.TEXT == tag || RichTextElement.RichTextTag.AT == tag || RichTextElement.RichTextTag.MENTION == tag || RichTextElement.RichTextTag.IMG == tag) {
            m229197a(richTextElement, bVar);
            return;
        }
        m229197a(richTextElement, bVar);
        List<String> childIds = richTextElement.getChildIds();
        if (!CollectionUtils.isEmpty(childIds)) {
            for (String str : childIds) {
                RichTextElement richTextElement2 = map.get(str);
                if (richTextElement2 != null) {
                    m229198a(richTextElement2, map, bVar);
                } else {
                    Log.m165382e("ChildElement id not exists, id is:" + str);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m229200b(RichTextElement richTextElement, Map<String, RichTextElement> map, AbstractC59028b bVar) {
        RichTextElement.RichTextTag tag = richTextElement.getTag();
        if (RichTextElement.RichTextTag.TEXT == tag || RichTextElement.RichTextTag.AT == tag || RichTextElement.RichTextTag.IMG == tag) {
            m229197a(richTextElement, bVar);
            return;
        }
        List<String> childIds = richTextElement.getChildIds();
        if (!CollectionUtils.isEmpty(childIds)) {
            for (String str : childIds) {
                RichTextElement richTextElement2 = map.get(str);
                if (richTextElement2 != null) {
                    m229200b(richTextElement2, map, bVar);
                } else {
                    Log.m165382e("ChildElement id not exists, id is:" + str);
                }
            }
        }
        m229197a(richTextElement, bVar);
    }
}
