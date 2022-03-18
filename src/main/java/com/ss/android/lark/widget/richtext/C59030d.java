package com.ss.android.lark.widget.richtext;

import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.widget.richtext.d */
public class C59030d {
    /* renamed from: a */
    public static RichTextElement m229163a() {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.FIGURE);
        richTextElement.setProperty(new RichTextElement.FigureProperty());
        richTextElement.setChildIds(new ArrayList());
        richTextElement.setStyle(new HashMap());
        return richTextElement;
    }

    /* renamed from: b */
    public static RichTextElement m229172b(String str) {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.EMOTION);
        RichTextElement.EmotionProperty emotionProperty = new RichTextElement.EmotionProperty();
        emotionProperty.setKey(str);
        richTextElement.setProperty(emotionProperty);
        richTextElement.setStyle(new HashMap());
        richTextElement.setChildIds(new ArrayList());
        return richTextElement;
    }

    /* renamed from: a */
    public static RichTextElement m229164a(String str) {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.TEXT);
        RichTextElement.TextProperty textProperty = new RichTextElement.TextProperty();
        textProperty.setContent(str);
        richTextElement.setProperty(textProperty);
        richTextElement.setStyle(new HashMap());
        richTextElement.setChildIds(new ArrayList());
        return richTextElement;
    }

    /* renamed from: a */
    public static RichTextElement m229171a(boolean z) {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.PARAGRAPH);
        RichTextElement.ParagraphProperty paragraphProperty = new RichTextElement.ParagraphProperty();
        paragraphProperty.setIsNeedEnter(z);
        richTextElement.setProperty(paragraphProperty);
        richTextElement.setChildIds(new ArrayList());
        richTextElement.setStyle(new HashMap());
        return richTextElement;
    }

    /* renamed from: a */
    public static RichTextElement m229165a(String str, String str2) {
        return m229169a(str, str2, false);
    }

    /* renamed from: b */
    public static RichTextElement m229173b(String str, String str2) {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.ANCHOR);
        RichTextElement.AnchorProperty anchorProperty = new RichTextElement.AnchorProperty();
        anchorProperty.setHref(str2);
        anchorProperty.setContent(str);
        richTextElement.setProperty(anchorProperty);
        richTextElement.setStyle(new HashMap());
        richTextElement.setChildIds(new ArrayList());
        return richTextElement;
    }

    /* renamed from: a */
    public static RichTextElement m229169a(String str, String str2, boolean z) {
        return m229170a(str, str2, z, false);
    }

    /* renamed from: b */
    public static RichTextElement m229174b(String str, String str2, boolean z) {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.MENTION);
        RichTextElement.MentionProperty mentionProperty = new RichTextElement.MentionProperty();
        mentionProperty.setContent("#" + str2);
        RichTextElement.MentionItem mentionItem = new RichTextElement.MentionItem();
        mentionItem.setId(str);
        mentionItem.setType(RichTextElement.MentionItem.MentionType.HASH_TAG);
        mentionProperty.setMentionItem(mentionItem);
        mentionProperty.setAuthorized(z);
        richTextElement.setProperty(mentionProperty);
        richTextElement.setStyle(new HashMap());
        richTextElement.setChildIds(new ArrayList());
        return richTextElement;
    }

    /* renamed from: a */
    public static RichTextElement m229166a(String str, String str2, int i, int i2) {
        return m229167a(str, str2, i, i2, true);
    }

    /* renamed from: a */
    public static RichTextElement m229170a(String str, String str2, boolean z, boolean z2) {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.AT);
        RichTextElement.AtProperty atProperty = new RichTextElement.AtProperty();
        atProperty.setUserId(str);
        atProperty.setContent("@" + str2);
        atProperty.setOutChatUser(z);
        atProperty.setAnonymous(z2);
        richTextElement.setProperty(atProperty);
        richTextElement.setStyle(new HashMap());
        richTextElement.setChildIds(new ArrayList());
        return richTextElement;
    }

    /* renamed from: a */
    public static RichTextElement m229167a(String str, String str2, int i, int i2, boolean z) {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.IMG);
        RichTextElement.ImageProperty imageProperty = new RichTextElement.ImageProperty();
        imageProperty.setToken(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        imageProperty.setUrls(arrayList);
        imageProperty.setOriginWidth(i);
        imageProperty.setOriginHeight(i2);
        imageProperty.setOriginSource(z);
        richTextElement.setProperty(imageProperty);
        richTextElement.setStyle(new HashMap());
        richTextElement.setChildIds(new ArrayList());
        return richTextElement;
    }

    /* renamed from: a */
    public static RichTextElement m229168a(String str, String str2, String str3, int i, int i2, String str4, int i3, long j) {
        RichTextElement richTextElement = new RichTextElement();
        richTextElement.setTag(RichTextElement.RichTextTag.MEDIA);
        RichTextElement.MediaProperty mediaProperty = new RichTextElement.MediaProperty();
        mediaProperty.setOriginPath(str);
        mediaProperty.setCompressPath(str2);
        mediaProperty.setDuration(i3);
        mediaProperty.setSize(j);
        mediaProperty.setMime(str4);
        mediaProperty.setCoverPath(str3);
        mediaProperty.setWidth(i);
        mediaProperty.setHeight(i2);
        richTextElement.setProperty(mediaProperty);
        richTextElement.setStyle(new HashMap());
        richTextElement.setChildIds(new ArrayList());
        return richTextElement;
    }
}
