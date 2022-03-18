package com.ss.android.lark.widget.richtext.preprocess;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59041c;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59042d;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.f */
public class C59052f {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.richtext.preprocess.f$1 */
    public static /* synthetic */ class C590531 {

        /* renamed from: a */
        static final /* synthetic */ int[] f146395a;

        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(3:57|58|60)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 349
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext.preprocess.C59052f.C590531.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static AbstractC59043b m229399a(Context context, C59049d dVar) {
        return new C59045c(context, dVar);
    }

    /* renamed from: a */
    public static synchronized C59057h m229400a(Context context, RichText richText, C59049d dVar) {
        C59057h a;
        synchronized (C59052f.class) {
            AbstractC59043b a2 = m229399a(context, dVar);
            a2.mo200600a(richText);
            List<String> elementIds = richText.getElementIds();
            Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
            for (String str : elementIds) {
                RichTextElement richTextElement = dictionary.get(str);
                if (richTextElement != null) {
                    ElementExtra elementExtra = richTextElement.getElementExtra();
                    elementExtra.setElementId(str);
                    elementExtra.appendRemoteStyle(richTextElement.getStyle());
                    elementExtra.setNeedSpacing(true);
                    elementExtra.setFromMe(false);
                    try {
                        m229401a(richTextElement, dictionary, a2);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.m165383e("RichTextProcess2", "Parse tree exception, id is:" + str);
                    }
                } else {
                    Log.m165383e("RichTextProcess2", "Root element is not exists, id is:" + str);
                }
            }
            for (Map.Entry<String, RichTextElement> entry : dictionary.entrySet()) {
                entry.getValue().clearElementExtra();
            }
            a2.mo200625b(richText);
            a = a2.mo200599a();
        }
        return a;
    }

    /* renamed from: a */
    private static void m229401a(RichTextElement richTextElement, Map<String, RichTextElement> map, AbstractC59043b bVar) {
        boolean z;
        ElementExtra elementExtra = richTextElement.getElementExtra();
        if (elementExtra.isIgnore()) {
            Log.m165383e("RichTextProcess2", "Parsed element is ignored, id is:" + elementExtra.getElementId());
            return;
        }
        bVar.mo200623a(richTextElement);
        boolean b = m229402b(richTextElement, map, bVar);
        List<String> childIds = richTextElement.getChildIds();
        if (childIds != null && b) {
            for (String str : childIds) {
                RichTextElement richTextElement2 = map.get(str);
                if (richTextElement2 != null) {
                    ElementExtra elementExtra2 = richTextElement2.getElementExtra();
                    elementExtra2.setElementId(str);
                    elementExtra2.setParentId(elementExtra.getElementId());
                    boolean z2 = false;
                    if (richTextElement.getTag() == RichTextElement.RichTextTag.OL || richTextElement.getTag() == RichTextElement.RichTextTag.UL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    elementExtra2.setInList(z);
                    if (richTextElement.getTag() == RichTextElement.RichTextTag.DOCS) {
                        z2 = true;
                    }
                    elementExtra2.setNeedSpacing(z2);
                    elementExtra2.setFromMe(elementExtra.isFromMe());
                    elementExtra2.appendRemoteStyle(elementExtra.getRemoteStyle());
                    elementExtra2.appendLocalStyle(elementExtra.getLocalStyle());
                    elementExtra2.appendRemoteStyle(richTextElement2.getStyle());
                    m229401a(richTextElement2, map, bVar);
                } else {
                    Log.m165383e("RichTextProcess2", "Child element is not exists, id is:" + str);
                }
            }
        }
        bVar.mo200626b(richTextElement);
    }

    /* renamed from: b */
    private static boolean m229402b(RichTextElement richTextElement, Map<String, RichTextElement> map, AbstractC59043b bVar) {
        int i;
        ElementExtra elementExtra = richTextElement.getElementExtra();
        String elementId = elementExtra.getElementId();
        if (richTextElement.getTag() == null || richTextElement.getProperty() == null) {
            Log.m165383e("RichTextProcess2", "Parsed element is not complete, id is:" + elementId);
            return false;
        }
        bVar.mo200618a(richTextElement.getTag());
        RichTextElement.RichTextTag tag = richTextElement.getTag();
        RichTextElement.RichTextProperty property = richTextElement.getProperty();
        switch (C590531.f146395a[tag.ordinal()]) {
            case 1:
                if (!(property instanceof RichTextElement.TextProperty)) {
                    return true;
                }
                bVar.mo200620a((RichTextElement.TextProperty) property, elementExtra);
                return true;
            case 2:
                if (!(property instanceof RichTextElement.ImageProperty)) {
                    return true;
                }
                bVar.mo200612a((RichTextElement.ImageProperty) property, elementExtra);
                return true;
            case 3:
                if (!(property instanceof RichTextElement.ParagraphProperty)) {
                    return true;
                }
                bVar.mo200616a((RichTextElement.ParagraphProperty) property, elementExtra);
                return true;
            case 4:
                if (!(property instanceof RichTextElement.FigureProperty)) {
                    return true;
                }
                bVar.mo200610a((RichTextElement.FigureProperty) property, elementExtra);
                return true;
            case 5:
                if (!(property instanceof RichTextElement.AtProperty)) {
                    return true;
                }
                bVar.mo200602a((RichTextElement.AtProperty) property, elementExtra);
                return true;
            case 6:
                if (!(property instanceof RichTextElement.AnchorProperty)) {
                    return true;
                }
                bVar.mo200601a((RichTextElement.AnchorProperty) property, elementExtra);
                C59042d.m229243a(richTextElement, map);
                return true;
            case 7:
                if (!(property instanceof RichTextElement.BoldProperty)) {
                    return true;
                }
                elementExtra.appendLocalStyle("localFontWeight", R.string.local_font_weight_bold);
                bVar.mo200603a((RichTextElement.BoldProperty) property, elementExtra);
                return true;
            case 8:
                if (!(property instanceof RichTextElement.ItalicProperty)) {
                    return true;
                }
                elementExtra.appendLocalStyle("localFontStyle", R.string.local_font_style_italic);
                bVar.mo200613a((RichTextElement.ItalicProperty) property, elementExtra);
                return true;
            case 9:
                if (!(property instanceof RichTextElement.UnderlineProperty)) {
                    return true;
                }
                elementExtra.appendLocalStyle("localTextDecoration", R.string.local_text_decoration_underline);
                bVar.mo200622a((RichTextElement.UnderlineProperty) property, elementExtra);
                return true;
            case 10:
                if (!(property instanceof RichTextElement.EmotionProperty)) {
                    return true;
                }
                bVar.mo200609a((RichTextElement.EmotionProperty) property, elementExtra);
                return true;
            case 11:
                if (!(property instanceof RichTextElement.ButtonProperty)) {
                    return true;
                }
                bVar.mo200604a((RichTextElement.ButtonProperty) property, elementExtra);
                return true;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                if (!(property instanceof RichTextElement.SelectProperty)) {
                    return true;
                }
                bVar.mo200619a((RichTextElement.SelectProperty) property, elementExtra);
                return true;
            case 13:
                if (!(property instanceof RichTextElement.ProgressSelectOptionProperty)) {
                    return true;
                }
                bVar.mo200617a((RichTextElement.ProgressSelectOptionProperty) property, elementExtra);
                return true;
            case 14:
                if (!(property instanceof RichTextElement.DivProperty)) {
                    return true;
                }
                bVar.mo200607a((RichTextElement.DivProperty) property, elementExtra);
                return true;
            case 15:
                if (!(property instanceof RichTextElement.TextableAreaProperty)) {
                    return true;
                }
                bVar.mo200621a((RichTextElement.TextableAreaProperty) property, elementExtra);
                return true;
            case 16:
                if (!(property instanceof RichTextElement.MediaProperty)) {
                    return true;
                }
                bVar.mo200614a((RichTextElement.MediaProperty) property, elementExtra);
                return true;
            case 17:
                if (!(property instanceof RichTextElement.DocsProperty)) {
                    return true;
                }
                bVar.mo200608a((RichTextElement.DocsProperty) property, elementExtra);
                return true;
            case 18:
                if (!(property instanceof RichTextElement.H1Property)) {
                    return true;
                }
                elementExtra.appendLocalStyle("localFontSize", R.dimen.local_font_size_h1);
                elementExtra.appendLocalStyle("localFontWeight", R.string.local_font_weight_bold);
                return true;
            case 19:
                if (!(property instanceof RichTextElement.H2Property)) {
                    return true;
                }
                elementExtra.appendLocalStyle("localFontSize", R.dimen.local_font_size_h2);
                elementExtra.appendLocalStyle("localFontWeight", R.string.local_font_weight_bold);
                return true;
            case 20:
                if (!(property instanceof RichTextElement.H3Property)) {
                    return true;
                }
                elementExtra.appendLocalStyle("localFontSize", R.dimen.local_font_size_h3);
                elementExtra.appendLocalStyle("localFontWeight", R.string.local_font_weight_bold);
                return true;
            case 21:
            case 22:
            case 23:
                if (C59041c.m229237a(elementExtra, map)) {
                    Log.m165383e("RichTextProcess2", "UL, OL and LI element should not has LI element in parent chain, id is:" + elementId);
                    return false;
                } else if (tag == RichTextElement.RichTextTag.UL || tag == RichTextElement.RichTextTag.OL) {
                    C59041c.m229236a(richTextElement, map);
                    return true;
                } else {
                    String parentId = elementExtra.getParentId();
                    if (C59041c.m229238a(parentId, map) || C59041c.m229239b(parentId, map)) {
                        return true;
                    }
                    Log.m165383e("RichTextProcess2", "LI element should only has UL or OL element as parent, id is:" + elementId);
                    return false;
                }
            case 24:
                elementExtra.appendLocalStyle("localFontColor", R.color.text_placeholder);
                return true;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                if (!(property instanceof RichTextElement.CodeProperty)) {
                    return true;
                }
                if (elementExtra.isFromMe()) {
                    i = R.color.ud_N200;
                } else {
                    i = R.color.ud_N300;
                }
                elementExtra.appendLocalStyle("localFontBgColor", i);
                bVar.mo200606a((RichTextElement.CodeProperty) property, elementExtra);
                return true;
            case 26:
                if (!(property instanceof RichTextElement.CodeBlockProperty)) {
                    return true;
                }
                bVar.mo200605a((RichTextElement.CodeBlockProperty) property, elementExtra);
                return true;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                if (!(property instanceof RichTextElement.HRProperty)) {
                    return true;
                }
                bVar.mo200611a((RichTextElement.HRProperty) property, elementExtra);
                return true;
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                if (!(property instanceof RichTextElement.MentionProperty)) {
                    return true;
                }
                bVar.mo200615a((RichTextElement.MentionProperty) property, elementExtra);
                return true;
            default:
                Log.m165383e("RichTextProcess2", "Parsed element is unknown, id is:" + elementId);
                bVar.mo200624a(elementExtra);
                return true;
        }
    }
}
