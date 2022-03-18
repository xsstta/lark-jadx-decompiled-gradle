package com.ss.android.vc.meeting.module.reaction.livewidget;

import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.f */
public class C62845f {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.f$1 */
    public static /* synthetic */ class C628461 {

        /* renamed from: a */
        static final /* synthetic */ int[] f158227a;

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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.reaction.livewidget.C62845f.C628461.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m246018a(RichText richText, AbstractC62843d dVar) {
        if (richText == null || C59035h.m229210a(richText)) {
            Log.m165378d("empty richText data");
            return;
        }
        List<String> elementIds = richText.getElementIds();
        Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
        dVar.mo217099a(richText);
        for (String str : elementIds) {
            RichTextElement richTextElement = dictionary.get(str);
            if (richTextElement != null) {
                m246020a(richTextElement, dictionary, dVar);
            } else {
                Log.m165382e("error richText struct");
            }
        }
        dVar.mo217121b(richText);
    }

    /* renamed from: a */
    private static void m246019a(RichTextElement richTextElement, AbstractC62843d dVar) {
        switch (C628461.f158227a[richTextElement.getTag().ordinal()]) {
            case 1:
                if (richTextElement.getProperty() instanceof RichTextElement.AtProperty) {
                    dVar.mo217101a((RichTextElement.AtProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 2:
                if (richTextElement.getProperty() instanceof RichTextElement.MentionProperty) {
                    dVar.mo217115a((RichTextElement.MentionProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 3:
                if (richTextElement.getProperty() instanceof RichTextElement.TextProperty) {
                    dVar.mo217119a((RichTextElement.TextProperty) richTextElement.getProperty(), richTextElement.getStyle());
                    return;
                }
                return;
            case 4:
                if (richTextElement.getProperty() instanceof RichTextElement.ImageProperty) {
                    dVar.mo217111a((RichTextElement.ImageProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 5:
                if (richTextElement.getProperty() instanceof RichTextElement.BoldProperty) {
                    dVar.mo217102a((RichTextElement.BoldProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 6:
                if (richTextElement.getProperty() instanceof RichTextElement.ItalicProperty) {
                    dVar.mo217112a((RichTextElement.ItalicProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 7:
                if (richTextElement.getProperty() instanceof RichTextElement.UnderlineProperty) {
                    dVar.mo217120a((RichTextElement.UnderlineProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 8:
                if (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty) {
                    dVar.mo217100a((RichTextElement.AnchorProperty) richTextElement.getProperty(), richTextElement.getStyle());
                    return;
                }
                return;
            case 9:
                if (richTextElement.getProperty() instanceof RichTextElement.ParagraphProperty) {
                    dVar.mo217116a((RichTextElement.ParagraphProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 10:
                if (richTextElement.getProperty() instanceof RichTextElement.FigureProperty) {
                    dVar.mo217107a((RichTextElement.FigureProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 11:
                if (richTextElement.getProperty() instanceof RichTextElement.EmotionProperty) {
                    dVar.mo217106a((RichTextElement.EmotionProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                if (richTextElement.getProperty() instanceof RichTextElement.ButtonProperty) {
                    dVar.mo217103a((RichTextElement.ButtonProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 13:
                if (richTextElement.getProperty() instanceof RichTextElement.SelectProperty) {
                    dVar.mo217118a((RichTextElement.SelectProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 14:
                if (richTextElement.getProperty() instanceof RichTextElement.ProgressSelectOptionProperty) {
                    dVar.mo217117a((RichTextElement.ProgressSelectOptionProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 15:
                if (richTextElement.getProperty() instanceof RichTextElement.MediaProperty) {
                    dVar.mo217114a((RichTextElement.MediaProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 16:
                if (richTextElement.getProperty() instanceof RichTextElement.DocsProperty) {
                    dVar.mo217105a((RichTextElement.DocsProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 17:
                if (richTextElement.getProperty() instanceof RichTextElement.H1Property) {
                    dVar.mo217108a((RichTextElement.H1Property) richTextElement.getProperty());
                    return;
                }
                return;
            case 18:
                if (richTextElement.getProperty() instanceof RichTextElement.H2Property) {
                    dVar.mo217109a((RichTextElement.H2Property) richTextElement.getProperty());
                    return;
                }
                return;
            case 19:
                if (richTextElement.getProperty() instanceof RichTextElement.H3Property) {
                    dVar.mo217110a((RichTextElement.H3Property) richTextElement.getProperty());
                    return;
                }
                return;
            case 20:
                if (richTextElement.getProperty() instanceof RichTextElement.LIProperty) {
                    dVar.mo217113a((RichTextElement.LIProperty) richTextElement.getProperty());
                    return;
                }
                return;
            case 21:
                if (richTextElement.getProperty() instanceof RichTextElement.CodeBlockProperty) {
                    dVar.mo217104a((RichTextElement.CodeBlockProperty) richTextElement.getProperty());
                    return;
                }
                return;
            default:
                Log.m165382e("Received an unknown tag!");
                dVar.mo217098a();
                return;
        }
    }

    /* renamed from: a */
    private static void m246020a(RichTextElement richTextElement, Map<String, RichTextElement> map, AbstractC62843d dVar) {
        RichTextElement.RichTextTag tag = richTextElement.getTag();
        if (RichTextElement.RichTextTag.TEXT == tag || RichTextElement.RichTextTag.AT == tag || RichTextElement.RichTextTag.MENTION == tag || RichTextElement.RichTextTag.IMG == tag) {
            m246019a(richTextElement, dVar);
            return;
        }
        m246019a(richTextElement, dVar);
        List<String> childIds = richTextElement.getChildIds();
        if (!CollectionUtils.isEmpty(childIds)) {
            for (String str : childIds) {
                RichTextElement richTextElement2 = map.get(str);
                if (richTextElement2 != null) {
                    m246020a(richTextElement2, map, dVar);
                } else {
                    Log.m165382e("ChildElement id not exists, id is:" + str);
                }
            }
        }
    }
}
