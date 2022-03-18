package com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.basic.v1.SpecialURL;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.ss.android.lark.todo.impl.features.detail.b.a.b */
public class C56473b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.b.a.b$3 */
    public static /* synthetic */ class C564763 {

        /* renamed from: a */
        static final /* synthetic */ int[] f139695a;

        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 433
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b.C564763.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static RichText.RichTextElements m220116a(Map<String, RichTextElement> map) {
        RichText.RichTextElements richTextElements = new RichText.RichTextElements();
        if (map == null) {
            return richTextElements;
        }
        richTextElements.setDictionary(m220122b(map));
        return richTextElements;
    }

    /* renamed from: b */
    private static Map<String, com.ss.android.lark.widget.richtext.RichTextElement> m220122b(Map<String, RichTextElement> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<RichTextElement, com.ss.android.lark.widget.richtext.RichTextElement>() {
            /* class com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b.C564741 */

            /* renamed from: a */
            public com.ss.android.lark.widget.richtext.RichTextElement get(RichTextElement richTextElement) {
                return C56473b.m220119a(richTextElement);
            }
        });
    }

    /* renamed from: c */
    private static Map<String, RichTextElement> m220124c(Map<String, com.ss.android.lark.widget.richtext.RichTextElement> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.ss.android.lark.widget.richtext.RichTextElement, RichTextElement>() {
            /* class com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b.C564752 */

            /* renamed from: a */
            public RichTextElement get(com.ss.android.lark.widget.richtext.RichTextElement richTextElement) {
                return C56473b.m220115a(richTextElement);
            }
        });
    }

    /* renamed from: a */
    public static RichTextElement m220115a(com.ss.android.lark.widget.richtext.RichTextElement richTextElement) {
        return new RichTextElement.C15249a().mo55514a(RichTextElement.Tag.fromValue(richTextElement.getTag().getNumber())).mo55516a(richTextElement.getStyle()).mo55515a(richTextElement.getChildIds()).mo55513a(m220121b(richTextElement)).build();
    }

    /* renamed from: b */
    public static boolean m220123b(RichText richText) {
        if (C59035h.m229210a(richText)) {
            return false;
        }
        for (com.ss.android.lark.widget.richtext.RichTextElement richTextElement : richText.getElements().getDictionary().values()) {
            if (richTextElement.getTag() == RichTextElement.RichTextTag.TEXT) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static RichText m220117a(com.bytedance.lark.pb.basic.v1.RichText richText) {
        RichText richText2 = new RichText();
        if (richText == null) {
            return richText2;
        }
        richText2.setElementIds(richText.element_ids);
        richText2.setInnerText(richText.inner_text);
        richText2.setElements(m220116a(richText.elements));
        richText2.setImageIds(richText.image_ids);
        richText2.setAtIds(richText.at_ids);
        richText2.setAnchorIds(richText.anchor_ids);
        richText2.setMediaIds(richText.media_ids);
        richText2.setDocsIds(richText.docs_ids);
        richText2.setUrls(C59031e.m229187e(richText2));
        return richText2;
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.basic.v1.RichText m220114a(RichText richText) {
        List<String> list;
        String str;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        if (C59035h.m229210a(richText)) {
            return null;
        }
        RichText.C15159a aVar = new RichText.C15159a();
        if (richText.getElementIds() == null) {
            list = new ArrayList<>();
        } else {
            list = richText.getElementIds();
        }
        RichText.C15159a a = aVar.mo55262a(list);
        if (richText.getInnerText() == null) {
            str = "";
        } else {
            str = richText.getInnerText();
        }
        RichText.C15159a a2 = a.mo55261a(str).mo55263a(m220124c(richText.getElements().getDictionary()));
        if (richText.getImageIds() == null) {
            list2 = new ArrayList<>();
        } else {
            list2 = richText.getImageIds();
        }
        RichText.C15159a b = a2.mo55265b(list2);
        if (richText.getAtIds() == null) {
            list3 = new ArrayList<>();
        } else {
            list3 = richText.getAtIds();
        }
        RichText.C15159a c = b.mo55266c(list3);
        if (richText.getAnchorIds() == null) {
            list4 = new ArrayList<>();
        } else {
            list4 = richText.getAnchorIds();
        }
        RichText.C15159a d = c.mo55267d(list4);
        if (richText.getMediaIds() == null) {
            list5 = new ArrayList<>();
        } else {
            list5 = richText.getMediaIds();
        }
        return d.mo55268e(list5).build();
    }

    /* renamed from: a */
    public static com.ss.android.lark.widget.richtext.RichTextElement m220119a(com.bytedance.lark.pb.basic.v1.RichTextElement richTextElement) {
        com.ss.android.lark.widget.richtext.RichTextElement richTextElement2 = new com.ss.android.lark.widget.richtext.RichTextElement();
        if (richTextElement == null) {
            return richTextElement2;
        }
        richTextElement2.setStyle(richTextElement.style);
        richTextElement2.setStyleKeys(richTextElement.style_keys);
        if (richTextElement.tag != null) {
            richTextElement2.setTag(RichTextElement.RichTextTag.valueOf(richTextElement.tag.getValue()));
        } else {
            richTextElement2.setTag(RichTextElement.RichTextTag.UNKNOWN_TAG);
        }
        richTextElement2.setProperty(m220118a(richTextElement2, richTextElement.property));
        richTextElement2.setChildIds(richTextElement.child_ids);
        return richTextElement2;
    }

    /* renamed from: b */
    private static RichTextElement.PropertySet m220121b(com.ss.android.lark.widget.richtext.RichTextElement richTextElement) {
        String str;
        String str2;
        RichTextElement.PropertySet.C15225a aVar = new RichTextElement.PropertySet.C15225a();
        try {
            int i = C564763.f139695a[richTextElement.getTag().ordinal()];
            switch (i) {
                case 1:
                    return aVar.mo55455a(new RichTextElement.TextProperty.C15235a().mo55480a(((RichTextElement.TextProperty) richTextElement.getProperty()).getContent()).mo55482b("").mo55479a((Integer) 0).build()).build();
                case 2:
                    RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) richTextElement.getProperty();
                    RichTextElement.ImageProperty.C15201a d = new RichTextElement.ImageProperty.C15201a().mo55374a(imageProperty.getToken()).mo55379c(imageProperty.getMiddleKey()).mo55378b(imageProperty.getOriginKey()).mo55380d(imageProperty.getThumbKey());
                    if (!CollectionUtils.isEmpty(imageProperty.getUrls())) {
                        d.mo55375a(imageProperty.getUrls());
                        d.mo55377b(Integer.valueOf(imageProperty.getOriginHeight()));
                        d.mo55372a(Integer.valueOf(imageProperty.getOriginWidth()));
                    }
                    return aVar.mo55448a(d.build()).build();
                case 3:
                    RichTextElement.ParagraphProperty paragraphProperty = (RichTextElement.ParagraphProperty) richTextElement.getProperty();
                    return aVar.mo55453a(new RichTextElement.ParagraphProperty.C15221a().build()).build();
                case 4:
                    RichTextElement.FigureProperty figureProperty = (RichTextElement.FigureProperty) richTextElement.getProperty();
                    return aVar.mo55447a(new RichTextElement.FigureProperty.C15191a().build()).build();
                case 5:
                    RichTextElement.AtProperty atProperty = (RichTextElement.AtProperty) richTextElement.getProperty();
                    String atContent = atProperty.getAtContent();
                    if (atContent != null && atContent.startsWith("@")) {
                        atContent = atContent.substring(1);
                    }
                    return aVar.mo55441a(new RichTextElement.AtProperty.C15163a().mo55285a(atProperty.getUserId()).mo55284a(Boolean.valueOf(atProperty.isOutChatUser())).mo55288b(atContent).mo55287b(Boolean.valueOf(atProperty.isAnonymous())).build()).build();
                case 6:
                    RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) richTextElement.getProperty();
                    RichTextElement.AnchorProperty.C15161a a = new RichTextElement.AnchorProperty.C15161a().mo55273a(anchorProperty.getHref());
                    if (TextUtils.isEmpty(anchorProperty.getContent())) {
                        str = anchorProperty.getHref();
                    } else {
                        str = anchorProperty.getContent();
                    }
                    RichTextElement.AnchorProperty.C15161a b = a.mo55275b(str);
                    if (TextUtils.isEmpty(anchorProperty.getContent())) {
                        str2 = anchorProperty.getHref();
                    } else {
                        str2 = anchorProperty.getContent();
                    }
                    return aVar.mo55440a(b.mo55276c(str2).mo55279f("").mo55277d("").mo55278e("").mo55280g("").mo55272a(SpecialURL.UNKNOWN_URL).build()).build();
                case 7:
                    return aVar.mo55442a(new RichTextElement.BoldProperty.C15165a().mo55292a(((RichTextElement.BoldProperty) richTextElement.getProperty()).getContent()).build()).build();
                case 8:
                    return aVar.mo55449a(new RichTextElement.ItalicProperty.C15203a().mo55384a(((RichTextElement.ItalicProperty) richTextElement.getProperty()).getContent()).build()).build();
                case 9:
                    return aVar.mo55457a(new RichTextElement.UnderlineProperty.C15245a().mo55504a(((RichTextElement.UnderlineProperty) richTextElement.getProperty()).getContent()).build()).build();
                case 10:
                    return aVar.mo55446a(new RichTextElement.EmotionProperty.C15189a().mo55346a(((RichTextElement.EmotionProperty) richTextElement.getProperty()).getKey()).build()).build();
                case 11:
                    return aVar.mo55443a(new RichTextElement.ButtonProperty.C15171a().mo55305a(((RichTextElement.ButtonProperty) richTextElement.getProperty()).getActionId()).build()).build();
                default:
                    switch (i) {
                        case 18:
                            RichTextElement.MediaProperty mediaProperty = (RichTextElement.MediaProperty) richTextElement.getProperty();
                            RichTextElement.MediaProperty.C15209a a2 = new RichTextElement.MediaProperty.C15209a().mo55405c(mediaProperty.getOriginPath()).mo55403b(mediaProperty.getCompressPath()).mo55399a(mediaProperty.getMime()).mo55397a(Integer.valueOf(mediaProperty.getDuration())).mo55398a(Long.valueOf(mediaProperty.getSize()));
                            String coverPath = mediaProperty.getCoverPath();
                            if (!TextUtils.isEmpty(coverPath)) {
                                a2.mo55400a(ByteString.of(C26311p.m95276a(coverPath)));
                                a2.mo55402b(Integer.valueOf(mediaProperty.getWidth()));
                                a2.mo55404c(Integer.valueOf(mediaProperty.getHeight()));
                            }
                            return aVar.mo55450a(a2.build()).build();
                        case 19:
                            return aVar.mo55454a(new RichTextElement.SelectMenuProperty.C15231a().mo55470a(((RichTextElement.SelectMenuProperty) richTextElement.getProperty()).getActionId()).build()).build();
                        case 20:
                            return aVar.mo55452a(new RichTextElement.OverflowMenuProperty.C15219a().mo55427a(((RichTextElement.OverflowMenuProperty) richTextElement.getProperty()).getActionId()).build()).build();
                        case 21:
                            RichTextElement.DatePickerProperty datePickerProperty = (RichTextElement.DatePickerProperty) richTextElement.getProperty();
                            return aVar.mo55444a(new RichTextElement.DatePickerProperty.C15181a().mo55326a(datePickerProperty.getActionId()).mo55328b(datePickerProperty.getInitialDate()).build()).build();
                        default:
                            switch (i) {
                                case 33:
                                    RichTextElement.TimePickerProperty timePickerProperty = (RichTextElement.TimePickerProperty) richTextElement.getProperty();
                                    return aVar.mo55456a(new RichTextElement.TimePickerProperty.C15239a().mo55490a(timePickerProperty.getActionId()).mo55492b(timePickerProperty.getInitialTime()).build()).build();
                                case 34:
                                    RichTextElement.DateTimePickerProperty dateTimePickerProperty = (RichTextElement.DateTimePickerProperty) richTextElement.getProperty();
                                    return aVar.mo55445a(new RichTextElement.DatetimePickerProperty.C15183a().mo55332a(dateTimePickerProperty.getActionId()).mo55334b(dateTimePickerProperty.getInitialDateTime()).build()).build();
                                case 35:
                                    RichTextElement.MentionProperty mentionProperty = (RichTextElement.MentionProperty) richTextElement.getProperty();
                                    return aVar.mo55451a(new RichTextElement.MentionProperty.C15213a().mo55414a(mentionProperty.getContent()).mo55413a(new RichTextElement.MentionItem(mentionProperty.getMentionItem().getId(), RichTextElement.MentionItem.MentionType.fromValue(mentionProperty.getMentionItem().getType().getNumber()))).build()).build();
                                default:
                                    return aVar.build();
                            }
                    }
            }
        } catch (Exception unused) {
            return aVar.build();
        }
    }

    /* renamed from: a */
    private static RichTextElement.RichTextProperty m220118a(com.ss.android.lark.widget.richtext.RichTextElement richTextElement, RichTextElement.PropertySet propertySet) {
        try {
            switch (C564763.f139695a[richTextElement.getTag().ordinal()]) {
                case 1:
                    return C56477c.m220159a(propertySet.text);
                case 2:
                    return C56477c.m220145a(propertySet.image);
                case 3:
                    return C56477c.m220154a(propertySet.paragraph);
                case 4:
                    return C56477c.m220140a(propertySet.figure);
                case 5:
                    return C56477c.m220130a(propertySet.at);
                case 6:
                    return C56477c.m220129a(propertySet.anchor);
                case 7:
                    return C56477c.m220131a(propertySet.bold);
                case 8:
                    return C56477c.m220146a(propertySet.italic);
                case 9:
                    return C56477c.m220164a(propertySet.underline);
                case 10:
                    return C56477c.m220139a(propertySet.emotion);
                case 11:
                    return C56477c.m220132a(propertySet.button);
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return C56477c.m220158a(propertySet.select);
                case 13:
                    return C56477c.m220155a(propertySet.progress);
                case 14:
                    return C56477c.m220137a(propertySet.div);
                case 15:
                    return C56477c.m220160a(propertySet.textable_area);
                case 16:
                    return C56477c.m220162a(propertySet.time);
                case 17:
                    return C56477c.m220148a(propertySet.link);
                case 18:
                    return C56477c.m220149a(propertySet.media);
                case 19:
                    return C56477c.m220157a(propertySet.select_menu);
                case 20:
                    return C56477c.m220152a(propertySet.overflow_menu);
                case 21:
                    return C56477c.m220135a(propertySet.date_picker);
                case 22:
                    return C56477c.m220138a(propertySet.docs);
                case 23:
                    return C56477c.m220141a(propertySet.h1);
                case 24:
                    return C56477c.m220142a(propertySet.h2);
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    return C56477c.m220143a(propertySet.h3);
                case 26:
                    return C56477c.m220163a(propertySet.ul);
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    return C56477c.m220151a(propertySet.ol);
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    return C56477c.m220147a(propertySet.li);
                case 29:
                    return C56477c.m220156a(propertySet.quote);
                case 30:
                    return C56477c.m220134a(propertySet.code);
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    return C56477c.m220133a(propertySet.code_block);
                case 32:
                    return C56477c.m220144a(propertySet.hr);
                case 33:
                    return C56477c.m220161a(propertySet.time_picker);
                case 34:
                    return C56477c.m220136a(propertySet.datetime_picker);
                case 35:
                    return C56477c.m220150a(propertySet.mention);
                default:
                    return C56477c.m220153a();
            }
        } catch (Exception unused) {
            return C56477c.m220153a();
        }
    }

    /* renamed from: a */
    public static boolean m220120a(com.ss.android.lark.widget.richtext.RichText richText, Map<String, Doc> map) {
        if (!C59035h.m229210a(richText) && !CollectionUtils.isEmpty(map)) {
            for (com.ss.android.lark.widget.richtext.RichTextElement richTextElement : richText.getElements().getDictionary().values()) {
                if (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty) {
                    for (Doc doc : map.values()) {
                        if (TextUtils.equals(doc.getUrl(), ((RichTextElement.AnchorProperty) richTextElement.getProperty()).getHref())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
