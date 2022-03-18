package com.ss.android.lark.p2851u.p2852a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.lark.pb.basic.v1.Abbreviation;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.DocEntity;
import com.bytedance.lark.pb.basic.v1.HashTagMentionEntity;
import com.bytedance.lark.pb.basic.v1.HongbaoContent;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.ImageTranslationAbility;
import com.bytedance.lark.pb.basic.v1.ImageTranslationInfo;
import com.bytedance.lark.pb.basic.v1.MentionAction;
import com.bytedance.lark.pb.basic.v1.MentionContent;
import com.bytedance.lark.pb.basic.v1.MergeForwardContent;
import com.bytedance.lark.pb.basic.v1.PreviewUrlContent;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.bytedance.lark.pb.basic.v1.TranslateInfo;
import com.bytedance.lark.pb.basic.v1.TranslatedImage;
import com.bytedance.lark.pb.basic.v1.URL;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aq;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.IChatService;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.PreviewVideo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.ImageTranslateProperty;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.entity.sticker.StickerInfo;
import com.ss.android.lark.chat.export.entity.message.content.ActionUrl;
import com.ss.android.lark.chat.export.entity.message.content.ContentValue;
import com.ss.android.lark.chat.export.entity.message.content.ContentValueType;
import com.ss.android.lark.chat.export.entity.message.content.InviteAtChatters;
import com.ss.android.lark.chat.export.entity.message.content.LarkCommand;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageAction;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageItemAction;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.p2951f.C58661j;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.lark.u.a.l */
public class C57326l {

    /* renamed from: a */
    private static final IChatService f141178a = C32821b.m126120a();

    /* renamed from: b */
    private static final AbstractC36450aa f141179b = C29990c.m110930b().mo134515N();

    /* renamed from: c */
    private static final AbstractC36498n f141180c = C29990c.m110930b().mo134513L();

    /* renamed from: d */
    private static final IStickerDependency f141181d = C29990c.m110930b().mo134502A();

    /* renamed from: e */
    private static final AbstractC36503q f141182e = C29990c.m110930b().mo134586n();

    /* renamed from: a */
    public static ImageContent m222142a(TranslateInfo translateInfo, Content content, Message message) {
        TranslatedImage a = m222136a(translateInfo, content.image, message);
        if (a == null) {
            return m222140a(content, message);
        }
        ImageContent imageContent = new ImageContent();
        imageContent.setImageSet(C57321j.m222115a(a.translated_image_set, message.getId()));
        return imageContent;
    }

    /* renamed from: a */
    private static void m222156a(Content content, Message message, ImageContent imageContent) {
        ImageTranslationAbility imageTranslationAbility;
        ImageTranslateProperty imageTranslateProperty = imageContent.getImageTranslateProperty();
        Map<String, ImageTranslationAbility> imageTranslationAbility2 = message.getImageTranslationAbility();
        if (imageTranslationAbility2 != null && !imageTranslationAbility2.isEmpty() && (imageTranslationAbility = (ImageTranslationAbility) m222151a(imageTranslationAbility2, content.image)) != null) {
            imageTranslateProperty.setCanTranslate(imageTranslationAbility.can_translate);
            imageTranslateProperty.setSrcLanguages(imageTranslationAbility.src_language == null ? Collections.emptyList() : imageTranslationAbility.src_language);
        }
    }

    /* renamed from: a */
    private static <T> T m222151a(Map<String, T> map, ImageSet imageSet) {
        Image image;
        if (imageSet == null || (image = imageSet.origin) == null) {
            return null;
        }
        return map.get(C58661j.m227533a(image.key));
    }

    /* renamed from: a */
    public static PostContent m222144a(Content content, String str, String str2, C14928Entity entity) throws Exception {
        PostContent postContent = new PostContent();
        postContent.setTitle(content.title);
        postContent.setRichText(C57337z.m222244a(content.rich_text));
        postContent.setGroupAnnouncement(content.is_group_announcement.booleanValue());
        postContent.setUrlPreviewList(m222153a(str2, content));
        Map<String, PreviewHangPoint> b = m222166b(str2, content);
        Map hashMap = new HashMap();
        if (entity != null) {
            hashMap = entity.preview_entities;
        }
        Map<String, PreviewHangPoint> a = ModelParserPreviewHangPoint.m222178a(str2, content.url_preview_hang_point_map, hashMap);
        a.putAll(b);
        postContent.setPreviewHangPoints(a);
        if (postContent.getRichText() != null) {
            Map<String, Doc> a2 = m222155a(postContent.getRichText().getElements(), content.doc_entity);
            postContent.setDocEntityMap(a2);
            m222161a(false, postContent.getRichText(), a2);
            m222160a(postContent.getRichText(), postContent.getPreviewHangPoints());
        }
        if (entity != null) {
            postContent.setDocResult(f141180c.mo134670a(str2, entity));
        }
        if (C34352r.m133228a()) {
            m222159a(postContent.getRichText(), str, str2, content.abbreviation, entity);
        }
        m222158a(postContent.getRichText(), entity);
        return postContent;
    }

    /* renamed from: a */
    private static void m222157a(TranslateInfo translateInfo, Content content, Message message, PostContent postContent) {
        RichText richText;
        Map<String, RichTextElement> dictionary;
        if (C29990c.m110930b().mo134586n().mo134685a("translate.image.chat.menu.enable") && (richText = postContent.getRichText()) != null) {
            Map<String, TranslatedImage> a = m222154a(translateInfo);
            if (!a.isEmpty() && (dictionary = richText.getElements().getDictionary()) != null) {
                for (String str : richText.getImageIds()) {
                    RichTextElement richTextElement = dictionary.get(str);
                    if (richTextElement != null) {
                        RichTextElement.RichTextProperty property = richTextElement.getProperty();
                        if (property instanceof RichTextElement.ImageProperty) {
                            RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) property;
                            TranslatedImage translatedImage = a.get(C58661j.m227533a(imageProperty.getOriginKey()));
                            if (!(translatedImage == null || translatedImage.translated_image_set == null)) {
                                ImageSet imageSet = translatedImage.translated_image_set;
                                if (imageSet.origin != null) {
                                    imageProperty.setOriginKey(imageSet.origin.key);
                                }
                                if (imageSet.middle != null) {
                                    imageProperty.setMiddleKey(imageSet.middle.key);
                                }
                                if (imageSet.thumbnail_webp != null) {
                                    imageProperty.setThumbKey(imageSet.thumbnail_webp.key);
                                } else if (imageSet.thumbnail != null) {
                                    imageProperty.setThumbKey(imageSet.thumbnail.key);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static Map<String, TranslatedImage> m222154a(TranslateInfo translateInfo) {
        ImageTranslationInfo imageTranslationInfo;
        if (translateInfo == null || (imageTranslationInfo = translateInfo.image_translation_info) == null || imageTranslationInfo.translated_images == null) {
            return new HashMap();
        }
        return imageTranslationInfo.translated_images;
    }

    /* renamed from: a */
    public static com.ss.android.lark.chat.export.entity.message.Content m222150a(Content content) {
        RedPacketContent redPacketContent = new RedPacketContent();
        HongbaoContent hongbaoContent = content.hongbao_content;
        if (hongbaoContent != null) {
            redPacketContent.setRedPacketId(hongbaoContent.id);
            redPacketContent.setSubject(hongbaoContent.subject);
            redPacketContent.setType(RedPacketContent.Type.Companion.valueOf(hongbaoContent.type.getValue()));
            redPacketContent.setClicked(hongbaoContent.clicked.booleanValue());
            redPacketContent.setExpired(hongbaoContent.is_expired.booleanValue());
            redPacketContent.setGrabbed(hongbaoContent.grabbed.booleanValue());
            redPacketContent.setGrabbedFinish(hongbaoContent.grabbed_finish.booleanValue());
            redPacketContent.setCover(ModelParserRedPacket.m222186a(hongbaoContent.cover));
        }
        return redPacketContent;
    }

    /* renamed from: a */
    public static TextContent m222147a() throws Exception {
        TextContent textContent = new TextContent();
        textContent.setRichText(C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_UnknownMessageTypeTip)));
        return textContent;
    }

    /* renamed from: a */
    public static TextContent m222148a(boolean z, String str, String str2, Content content, C14928Entity entity) throws Exception {
        TextContent textContent = new TextContent();
        String str3 = content.title;
        textContent.setRichText(C57337z.m222244a(content.rich_text));
        textContent.setUrlPreviewList(m222153a(str2, content));
        textContent.setDocEntityMap(m222155a(textContent.getRichText().getElements(), content.doc_entity));
        Map<String, PreviewHangPoint> b = m222166b(str2, content);
        Map hashMap = new HashMap();
        if (entity != null) {
            hashMap = entity.preview_entities;
        }
        Map<String, PreviewHangPoint> a = ModelParserPreviewHangPoint.m222178a(str2, content.url_preview_hang_point_map, hashMap);
        a.putAll(b);
        textContent.setPreviewHangPoints(a);
        if (entity != null) {
            textContent.setDocResult(f141180c.mo134670a(str2, entity));
        }
        m222161a(z, textContent.getRichText(), textContent.getDocEntityMap());
        m222160a(textContent.getRichText(), textContent.getPreviewHangPoints());
        if (C34352r.m133228a()) {
            m222159a(textContent.getRichText(), str, str2, content.abbreviation, entity);
        }
        m222158a(textContent.getRichText(), entity);
        return textContent;
    }

    /* renamed from: a */
    public static Map<String, Doc> m222155a(RichText.RichTextElements richTextElements, DocEntity docEntity) {
        HashMap hashMap = new HashMap();
        if (!(docEntity == null || richTextElements == null)) {
            Map<String, RichTextElement> dictionary = richTextElements.getDictionary();
            Map<String, DocEntity.ElementEntity> map = docEntity.element_entity_ref;
            if (!CollectionUtils.isEmpty(dictionary) && !CollectionUtils.isEmpty(map)) {
                for (String str : map.keySet()) {
                    DocEntity.ElementEntity elementEntity = map.get(str);
                    RichTextElement richTextElement = dictionary.get(str);
                    if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty)) {
                        Doc doc = new Doc();
                        doc.setName(elementEntity.title);
                        doc.setUrl(((RichTextElement.AnchorProperty) richTextElement.getProperty()).getHref());
                        doc.setDocType(DocType.forNumber(elementEntity.doc_type.getValue()));
                        Icon icon = new Icon();
                        if (elementEntity.icon != null) {
                            icon.setType(elementEntity.icon.type.getValue());
                            icon.setValue(elementEntity.icon.value);
                        }
                        doc.setIcon(icon);
                        hashMap.put(str, doc);
                    }
                }
                return hashMap;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m222161a(boolean z, RichText richText, Map<String, Doc> map) {
        if (!(map == null || map.isEmpty() || richText == null)) {
            for (String str : map.keySet()) {
                RichTextElement richTextElement = richText.getElements().getDictionary().get(str);
                if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty)) {
                    Doc doc = map.get(str);
                    RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) richTextElement.getProperty();
                    anchorProperty.setDisplayTitle(doc.getName());
                    AbstractC36498n nVar = f141180c;
                    anchorProperty.setLocalIconRes(nVar.mo134667a(doc.getDocType()));
                    anchorProperty.setLocalGrayIconRes(nVar.mo134675b(doc.getDocType()));
                    if (doc.getIcon() != null) {
                        anchorProperty.setIconKey(doc.getIcon().getValue());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m222160a(RichText richText, Map<String, PreviewHangPoint> map) {
        if (!(richText == null || map == null || CollectionUtils.isEmpty(map))) {
            for (String str : map.keySet()) {
                RichTextElement richTextElement = richText.getElements().getDictionary().get(str);
                if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty)) {
                    UrlPreviewEntity urlPreviewEntity = map.get(str).getUrlPreviewEntity();
                    if (urlPreviewEntity instanceof NetUrlPreviewEntity) {
                        RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) richTextElement.getProperty();
                        NetUrlPreviewEntity netUrlPreviewEntity = (NetUrlPreviewEntity) urlPreviewEntity;
                        anchorProperty.setDisplayTitle(netUrlPreviewEntity.getNetTitle());
                        if (TextUtils.isEmpty(urlPreviewEntity.getUrl().getAndroidUrl())) {
                            anchorProperty.setHref(urlPreviewEntity.getUrl().getUrl());
                        } else {
                            anchorProperty.setHref(urlPreviewEntity.getUrl().getAndroidUrl());
                        }
                        anchorProperty.setIconKey(netUrlPreviewEntity.getNetIconKey());
                        anchorProperty.setVersion(netUrlPreviewEntity.getVersion());
                        anchorProperty.setLocalIconRes(R.drawable.ic_icon_link_copy_outlined);
                        anchorProperty.setUrlPreview(true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m222158a(RichText richText, C14928Entity entity) {
        if (!(entity == null || CollectionUtils.isEmpty(entity.mentions) || richText == null || richText.getElements() == null)) {
            Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
            for (String str : dictionary.keySet()) {
                RichTextElement richTextElement = dictionary.get(str);
                if (richTextElement.getProperty() instanceof RichTextElement.MentionProperty) {
                    RichTextElement.MentionProperty mentionProperty = (RichTextElement.MentionProperty) richTextElement.getProperty();
                    HashTagMentionEntity hashTagMentionEntity = entity.mentions.get(mentionProperty.getMentionItem().getId());
                    if (hashTagMentionEntity != null) {
                        MentionContent mentionContent = hashTagMentionEntity.name;
                        if (mentionContent != null) {
                            String str2 = mentionContent.default_content;
                            if (!TextUtils.isEmpty(str2)) {
                                mentionProperty.setContent(str2);
                            }
                            if (mentionContent.style != null) {
                                mentionProperty.setAuthorized(mentionContent.style.is_available.booleanValue());
                            }
                        }
                        MentionAction mentionAction = hashTagMentionEntity.click_action;
                        if (mentionAction != null && mentionAction.action_type == MentionAction.ActionType.redirect) {
                            mentionProperty.setRedirectUrl(mentionAction.redirect_url);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m222159a(RichText richText, String str, String str2, Abbreviation abbreviation, C14928Entity entity) {
        Map<String, Abbreviation.Abbrs> map;
        Abbreviation.Abbrs abbrs;
        if (!(richText == null || abbreviation == null || (map = abbreviation.abbr_element_ref) == null || map.isEmpty())) {
            Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
            for (String str3 : dictionary.keySet()) {
                RichTextElement richTextElement = dictionary.get(str3);
                if (!(richTextElement == null || (abbrs = map.get(str3)) == null)) {
                    List<Abbreviation.C14639entity> list = abbrs.abbrs;
                    if (!list.isEmpty()) {
                        Abbreviation.C14639entity entity2 = list.get(0);
                        if (!TextUtils.isEmpty(entity2.abbr_id)) {
                            RichTextElement.DashedProperty dashedProperty = new RichTextElement.DashedProperty();
                            dashedProperty.id = entity2.abbr_id;
                            dashedProperty.messageId = str2;
                            dashedProperty.chatId = str;
                            dashedProperty.intervalOn = C57582a.m223601a((Context) LarkContext.getApplication(), 1.5f);
                            dashedProperty.intervalOff = C57582a.m223601a((Context) LarkContext.getApplication(), 2.0f);
                            if (richTextElement.getProperty() instanceof RichTextElement.TextProperty) {
                                String content = ((RichTextElement.TextProperty) richTextElement.getProperty()).getContent();
                                dashedProperty.setContent(content);
                                dashedProperty.name = content;
                                richTextElement.setProperty(dashedProperty);
                            }
                        } else if (f141182e.mo134685a("suite.ai.one_click_dating.enable")) {
                            com.bytedance.lark.pb.basic.v1.Message message = entity.messages.get(str2);
                            Chat chat = entity.chats.get(str);
                            C14928Entity.ChatChatter chatChatter = entity.chat_chatters.get(str);
                            if (!(message == null || chat == null || chatChatter == null || entity2.datetime == null)) {
                                if ((entity2.datetime.start.longValue() == 0 || entity2.datetime.start.longValue() >= System.currentTimeMillis() / 1000) && (entity2.datetime.end.longValue() == 0 || entity2.datetime.end.longValue() >= System.currentTimeMillis() / 1000)) {
                                    RichTextElement.IntentionDashedProperty intentionDashedProperty = new RichTextElement.IntentionDashedProperty();
                                    String content2 = ((RichTextElement.TextProperty) richTextElement.getProperty()).getContent();
                                    intentionDashedProperty.setContent(content2);
                                    intentionDashedProperty.messageId = str2;
                                    intentionDashedProperty.chatId = str;
                                    intentionDashedProperty.startTime = entity2.datetime.start.longValue();
                                    intentionDashedProperty.endTime = entity2.datetime.end.longValue();
                                    intentionDashedProperty.duration = (long) entity2.datetime.duration.intValue();
                                    intentionDashedProperty.chatterIds = new ArrayList();
                                    intentionDashedProperty.isAtAll = message.is_at_all.booleanValue();
                                    intentionDashedProperty.isMetting = chat.is_meeting.booleanValue();
                                    intentionDashedProperty.chatterIds.add(f141179b.mo134394a());
                                    if (!intentionDashedProperty.isAtAll) {
                                        for (String str4 : richText.getAtIds()) {
                                            RichTextElement richTextElement2 = richText.getElements().getDictionary().get(str4);
                                            if (!(richTextElement2 == null || richTextElement2.getProperty() == null)) {
                                                RichTextElement.AtProperty atProperty = (RichTextElement.AtProperty) richTextElement2.getProperty();
                                                if (!intentionDashedProperty.chatterIds.contains(atProperty.getUserId())) {
                                                    intentionDashedProperty.chatterIds.add(atProperty.getUserId());
                                                }
                                            }
                                        }
                                    }
                                    intentionDashedProperty.setContent(content2);
                                    richTextElement.setProperty(intentionDashedProperty);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static List<MessageUrlPreview> m222153a(String str, Content content) {
        if (content.preview_urls.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (PreviewUrlContent previewUrlContent : content.preview_urls) {
            MessageUrlPreview messageUrlPreview = new MessageUrlPreview();
            messageUrlPreview.setMessageId(str);
            messageUrlPreview.setTitle(m222152a(previewUrlContent.title, (int) LocationRequest.PRIORITY_HD_ACCURACY));
            messageUrlPreview.setSequenceId(previewUrlContent.sequence_id.intValue());
            messageUrlPreview.setDescription(m222152a(previewUrlContent.summary, (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
            messageUrlPreview.setIcon(C57321j.m222115a(previewUrlContent.icon, str));
            messageUrlPreview.setUrl(previewUrlContent.url);
            messageUrlPreview.setDeleted(previewUrlContent.is_hidden.booleanValue());
            String str2 = "";
            String str3 = content.text != null ? content.text : str2;
            if (previewUrlContent.url != null) {
                str2 = previewUrlContent.url;
            }
            int indexOf = str3.indexOf(str2);
            messageUrlPreview.setCount(previewUrlContent.url != null ? previewUrlContent.url.length() : 0);
            messageUrlPreview.setOffset(indexOf);
            messageUrlPreview.setCoverImage(C57321j.m222115a(previewUrlContent.cover_image, str));
            messageUrlPreview.setPreviewVideo(m222137a(previewUrlContent.video_info));
            arrayList.add(messageUrlPreview);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static PreviewHangPoint m222149a(PreviewUrlContent previewUrlContent, String str) {
        UrlPreviewEntity.C15428a aVar = new UrlPreviewEntity.C15428a();
        aVar.f40833i = true;
        aVar.f40835k = previewUrlContent.title;
        aVar.f40836l = previewUrlContent.summary;
        if (!TextUtils.isEmpty(previewUrlContent.url)) {
            aVar.f40838n = aq.m95059b(previewUrlContent.url);
        }
        com.ss.android.lark.chat.entity.image.ImageSet a = C57321j.m222115a(previewUrlContent.icon, str);
        if (CollectionUtils.isNotEmpty(a.getOrigin().getUrls())) {
            aVar.f40837m = a.getOrigin().getUrls().get(0);
        }
        com.ss.android.lark.chat.entity.image.ImageSet a2 = C57321j.m222115a(previewUrlContent.cover_image, str);
        if (CollectionUtils.isNotEmpty(a2.getOrigin().getUrls())) {
            aVar.f40834j = a2.getOrigin().getUrls().get(0);
        }
        URL.C15366a aVar2 = new URL.C15366a();
        aVar2.f40680a = previewUrlContent.url;
        aVar.f40827c = aVar2.build();
        aVar.f40825a = str;
        aVar.f40831g = 0;
        aVar.f40826b = UUID.randomUUID().toString().substring(0, 20);
        return new PreviewHangPoint(previewUrlContent.url, UUID.randomUUID().toString().substring(0, 10), str, aVar.f40826b, true, ModelParserPreview.m222175a(aVar.build()));
    }

    /* renamed from: a */
    private static String m222152a(String str, int i) {
        return (str == null || i <= 0 || str.length() <= i) ? str : str.substring(0, i);
    }

    /* renamed from: a */
    public static ShareGroupChatContent m222146a(C14928Entity entity, Content content) throws Exception {
        ShareGroupChatContent shareGroupChatContent = new ShareGroupChatContent();
        shareGroupChatContent.setChat(C57310e.m222078a(entity.chats.get(content.share_chat_id)));
        shareGroupChatContent.setJoinToken(content.join_token);
        shareGroupChatContent.setExpireTime(content.expire_time.longValue());
        return shareGroupChatContent;
    }

    /* renamed from: a */
    public static MediaContent m222143a(Content content, String str) {
        MediaContent mediaContent = new MediaContent();
        com.bytedance.lark.pb.basic.v1.MediaContent mediaContent2 = content.media_content;
        if (mediaContent2 != null) {
            mediaContent.setKey(mediaContent2.key);
            mediaContent.setUrl(mediaContent2.url);
            mediaContent.setName(mediaContent2.name);
            mediaContent.setSize(mediaContent2.size.longValue());
            mediaContent.setMime(mediaContent2.mime);
            mediaContent.setSource(MediaContent.Source.Companion.mo125515a(mediaContent2.source.getValue()));
            mediaContent.setImageSet(C57321j.m222115a(mediaContent2.image, str));
            mediaContent.setProgress(0);
            mediaContent.setCompressPath(mediaContent2.compress_path);
            mediaContent.setOriginPath(mediaContent2.origin_path);
            mediaContent.setFilePath(content.file_path);
            mediaContent.setDuration((long) mediaContent2.duration.intValue());
        } else {
            mediaContent.setImageSet(C57321j.m222115a((ImageSet) null, str));
        }
        return mediaContent;
    }

    /* renamed from: a */
    public static ProfileContent m222145a(C14928Entity entity, String str, Content content) {
        Chatter chatter;
        ProfileContent profileContent = new ProfileContent();
        profileContent.setId(content.share_chatter_id);
        C14928Entity.ChatChatter chatChatter = entity.chat_chatters.get(str);
        if (chatChatter == null && entity.chat_chatters.size() > 0) {
            chatChatter = ((C14928Entity.ChatChatter[]) entity.chat_chatters.values().toArray(new C14928Entity.ChatChatter[0]))[0];
        }
        if (!(chatChatter == null || chatChatter.chatters == null || (chatter = chatChatter.chatters.get(content.share_chatter_id)) == null)) {
            profileContent.setAvatarKey(chatter.avatar_key);
            profileContent.setDisplayName(chatter.localized_name);
            profileContent.setChatterType(Chatter.ChatterType.forNumber(chatter.type.getValue()));
            profileContent.setTenantId(chatter.tenant_id);
        }
        return profileContent;
    }

    /* renamed from: a */
    private static PreviewVideo m222137a(com.bytedance.lark.pb.basic.v1.PreviewVideo previewVideo) {
        if (previewVideo == null) {
            return null;
        }
        return new PreviewVideo(PreviewVideo.Site.valueOf(previewVideo.site.name()), previewVideo.vid, previewVideo.iframe_url);
    }

    /* renamed from: c */
    public static StickerContent m222168c(Content content) throws Exception {
        boolean z;
        StickerContent stickerContent = new StickerContent();
        stickerContent.setHeight(content.height.intValue());
        stickerContent.setWidth(content.width.intValue());
        stickerContent.setKey(content.key);
        if (f141181d.mo134374a(content.key) != null) {
            z = true;
        } else {
            z = false;
        }
        stickerContent.setAdded(z);
        stickerContent.setStickerId(content.sticker_id);
        stickerContent.setStickerSetId(content.sticker_set_id);
        StickerInfo stickerInfo = new StickerInfo();
        Content.StickerInfo stickerInfo2 = content.sticker_info;
        if (stickerInfo2 != null) {
            stickerInfo.setTitle(stickerInfo2.title);
            stickerInfo.setDescription(stickerInfo2.description);
            stickerInfo.setHasPaid(stickerInfo2.is_paid.booleanValue());
        }
        stickerContent.setStickerInfo(stickerInfo);
        return stickerContent;
    }

    /* renamed from: a */
    private static Pair<Boolean, HashMap<String, List<ContentValue>>> m222135a(Map<String, Content.SystemContentValue> map) {
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (Map.Entry<String, Content.SystemContentValue> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            for (Content.SystemContentValue.ContentValue contentValue : entry.getValue().content_values) {
                ContentValue contentValue2 = new ContentValue();
                contentValue2.setId(contentValue.id);
                contentValue2.setValue(contentValue.value);
                contentValue2.setLink(contentValue.link);
                contentValue2.setContentValueType(ContentValueType.fromValue(contentValue.type.getValue()));
                contentValue2.setAction(new SystemMessageAction(SystemMessageAction.ActType.fromValue(contentValue.action_type.getValue())));
                contentValue2.setAnonymous(contentValue.is_anonymous);
                contentValue2.setActionId(contentValue.action_id.intValue());
                contentValue2.setClickable(contentValue.is_clickable.booleanValue());
                arrayList.add(contentValue2);
                if (z || contentValue.is_clickable.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            hashMap.put(entry.getKey(), arrayList);
        }
        return new Pair<>(Boolean.valueOf(z), hashMap);
    }

    /* renamed from: b */
    public static SystemContent m222165b(Content content) throws Exception {
        SystemContent systemContent = new SystemContent();
        systemContent.setMessageTemplate(content.template);
        systemContent.setType(SystemMessageType.forNumber(content.system_type.getValue()));
        systemContent.setContents(content.values);
        Pair<Boolean, HashMap<String, List<ContentValue>>> a = m222135a(content.system_content_values);
        systemContent.setSystemContents((Map) a.second);
        systemContent.setMsgClickable(((Boolean) a.first).booleanValue());
        systemContent.setItemActions(m222167b(content.item_actions));
        systemContent.setVersion(content.system_message_version.intValue());
        systemContent.setVoIPFromId(content.e2ee_from_id);
        systemContent.setVoIPToId(content.e2ee_to_id);
        systemContent.setVoIpTriggerId(content.trigger_id);
        systemContent.setVcFromId(content.vc_from_id);
        systemContent.setVcToId(content.vc_to_id);
        return systemContent;
    }

    /* renamed from: b */
    private static Map<Integer, SystemMessageItemAction> m222167b(Map<Integer, com.bytedance.lark.pb.basic.v1.SystemMessageItemAction> map) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(map)) {
            return hashMap;
        }
        for (Map.Entry<Integer, com.bytedance.lark.pb.basic.v1.SystemMessageItemAction> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                com.bytedance.lark.pb.basic.v1.SystemMessageItemAction value = entry.getValue();
                if (value.url != null) {
                    hashMap.put(entry.getKey(), new ActionUrl(value.url.f175429android, value.url.common));
                } else if (value.lark_command != null) {
                    hashMap.put(entry.getKey(), new LarkCommand(value.lark_command.cmd.intValue(), value.lark_command.payload));
                } else if (value.invite_at_chatters != null && CollectionUtils.isNotEmpty(value.invite_at_chatters.at_chatter_ids)) {
                    ArrayList arrayList = new ArrayList();
                    for (Long l : value.invite_at_chatters.at_chatter_ids) {
                        arrayList.add(String.valueOf(l));
                    }
                    hashMap.put(entry.getKey(), new InviteAtChatters(arrayList));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static FolderContent m222162b(Content content, boolean z) throws Exception {
        FolderContent folderContent = new FolderContent();
        folderContent.setKey(content.key);
        folderContent.setName(content.name);
        folderContent.setNameSpace(content.namespace);
        folderContent.setSize(content.size.longValue());
        folderContent.setInMyNutStore(content.is_in_my_nut_store.booleanValue());
        folderContent.setLanTransStatus(content.lan_trans_status.getValue());
        folderContent.setSource(content.file_source.getValue());
        folderContent.setSender(z);
        return folderContent;
    }

    /* renamed from: b */
    public static MergeForwardContent m222163b(C14928Entity entity, Content content) {
        Chat.Type type;
        List list;
        String str;
        String str2;
        String str3;
        Map map;
        Thread thread;
        com.ss.android.lark.chat.entity.chat.Chat chat;
        Map<String, ? extends com.ss.android.lark.chat.entity.chatter.Chatter> map2;
        MergeForwardContent mergeForwardContent = new MergeForwardContent();
        com.bytedance.lark.pb.basic.v1.MergeForwardContent mergeForwardContent2 = content.merge_forward_content;
        if (mergeForwardContent2 != null) {
            type = mergeForwardContent2.chat_type;
        } else {
            type = com.bytedance.lark.pb.basic.v1.MergeForwardContent.DEFAULT_CHAT_TYPE;
        }
        mergeForwardContent.setType(C57310e.m222077a(type));
        if (mergeForwardContent2 == null) {
            list = new ArrayList();
        } else {
            list = mergeForwardContent2.messages;
        }
        mergeForwardContent.setMessages(C57322k.m222125a(entity, list));
        String str4 = "";
        if (mergeForwardContent2 == null) {
            str = str4;
        } else {
            str = mergeForwardContent2.group_chat_name;
        }
        mergeForwardContent.setGroupChatName(str);
        if (mergeForwardContent2 == null) {
            str2 = str4;
        } else {
            str2 = mergeForwardContent2.p2p_creator_name;
        }
        mergeForwardContent.setP2pCreatorName(str2);
        if (mergeForwardContent2 == null) {
            str3 = str4;
        } else {
            str3 = mergeForwardContent2.p2p_partner_name;
        }
        mergeForwardContent.setP2pPartnerName(str3);
        if (mergeForwardContent2 != null) {
            str4 = mergeForwardContent2.quasi_title;
        }
        mergeForwardContent.setQuasiTitle(str4);
        if (mergeForwardContent2 == null) {
            map = new HashMap();
        } else {
            map = mergeForwardContent2.chatters;
        }
        mergeForwardContent.setChatters(C57317h.m222110a(map));
        Map<String, MergeForwardContent.MessageReaction> map3 = null;
        if (mergeForwardContent2 == null) {
            thread = null;
        } else {
            thread = mergeForwardContent2.thread;
        }
        if (thread != null) {
            mergeForwardContent.setThread(thread);
            mergeForwardContent.setSubtitle(thread.subtitle);
            mergeForwardContent.setFromPrivateTopic(true);
            if (mergeForwardContent2 == null) {
                chat = null;
            } else {
                chat = C57310e.m222078a(entity.chats.get(thread.channel.id));
            }
            mergeForwardContent.setOriginChat(chat);
            if (mergeForwardContent2 != null) {
                map3 = mergeForwardContent2.reaction_snapshots;
            }
            mergeForwardContent.setReactionMap(C57327p.m222183a(map3));
            if (mergeForwardContent2 == null) {
                map2 = new HashMap<>();
            } else {
                map2 = C57314g.m222104a(entity);
            }
            mergeForwardContent.setReactionChatterMap(map2);
        }
        return mergeForwardContent;
    }

    /* renamed from: a */
    public static FileContent m222139a(Content content, boolean z) throws Exception {
        FileContent fileContent = new FileContent();
        fileContent.setKey(content.key);
        fileContent.setName(content.name);
        fileContent.setNameSpace(content.namespace);
        fileContent.setSize(content.size.longValue());
        fileContent.setFilePath(content.file_path);
        fileContent.setInMyNutStore(content.is_in_my_nut_store.booleanValue());
        fileContent.setLanTransStatus(content.lan_trans_status.getValue());
        if (TextUtils.isEmpty(content.file_path) && !TextUtils.isEmpty(content.cache_file_path)) {
            fileContent.setFilePath(content.cache_file_path);
        }
        fileContent.setMime(content.mime);
        fileContent.setSource(content.file_source.getValue());
        fileContent.setSender(z);
        fileContent.setUriString(content.file_uri);
        return fileContent;
    }

    /* renamed from: a */
    public static ImageContent m222140a(Content content, Message message) {
        ImageSet imageSet;
        boolean z;
        long j;
        ImageContent imageContent = new ImageContent();
        if (content != null) {
            imageSet = content.image;
        } else {
            imageSet = null;
        }
        com.ss.android.lark.chat.entity.image.ImageSet a = C57321j.m222115a(imageSet, message.getId());
        if (content != null) {
            if (content.is_origin_source != null) {
                z = content.is_origin_source.booleanValue();
            } else {
                z = false;
            }
            a.setOriginSource(z);
            if (content.origin_size != null) {
                j = content.origin_size.longValue();
            } else {
                j = 0;
            }
            a.setOriginSize(j);
        }
        a.setFromMe(message.isFromMe());
        imageContent.setImageSet(a);
        return imageContent;
    }

    /* renamed from: b */
    private static Map<String, PreviewHangPoint> m222166b(String str, Content content) {
        if (content.preview_urls.size() == 0 || content.url_preview_hang_point_map.size() > 0) {
            return new HashMap();
        }
        ArrayList arrayList = new ArrayList();
        for (UrlPreviewHangPoint urlPreviewHangPoint : content.url_preview_hang_point_map.values()) {
            if (!TextUtils.isEmpty(urlPreviewHangPoint.url)) {
                arrayList.add(urlPreviewHangPoint.url);
            }
        }
        HashMap hashMap = new HashMap();
        for (PreviewUrlContent previewUrlContent : content.preview_urls) {
            if (!arrayList.contains(previewUrlContent.url) && !TextUtils.isEmpty(previewUrlContent.title)) {
                PreviewHangPoint a = m222149a(previewUrlContent, str);
                hashMap.put(a.getHangPointId(), a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static TranslatedImage m222136a(TranslateInfo translateInfo, ImageSet imageSet, Message message) {
        ImageTranslationInfo imageTranslationInfo;
        Map<String, TranslatedImage> map;
        if (translateInfo == null || (imageTranslationInfo = translateInfo.image_translation_info) == null || (map = imageTranslationInfo.translated_images) == null) {
            return null;
        }
        return (TranslatedImage) m222151a(map, imageSet);
    }

    /* renamed from: a */
    public static AudioContent m222138a(Message message, Content content, TranslateInfo translateInfo) throws Exception {
        String str;
        AudioContent audioContent = new AudioContent();
        if (!(!C29990c.m110930b().mo134586n().mo134685a("translate.asr-message.android") || translateInfo == null || translateInfo.content == null)) {
            content = translateInfo.content;
            AudioContent audioContent2 = (AudioContent) message.getContent();
            if (message.isTranslatedByDisplayRule() && audioContent2.isNeedHideText()) {
                audioContent2.setNeedHideText(false);
            }
        }
        if (TextUtils.isEmpty(content.key)) {
            str = content.local_upload_id;
        } else {
            str = content.key;
        }
        audioContent.setKey(str);
        audioContent.setSize(content.size.longValue());
        audioContent.setDuration(content.duration.intValue());
        audioContent.setRecognizedText(content.voice2text);
        audioContent.setNeedHideText(content.hide_voice2text.booleanValue());
        audioContent.setRecognizeFinished(content.is_audio_recognize_finish.booleanValue());
        audioContent.setAudio2TextStartTime((long) content.audio2text_start_time.intValue());
        audioContent.setAudioWithText(content.is_audio_with_text.booleanValue());
        return audioContent;
    }

    /* renamed from: b */
    public static PostContent m222164b(C14928Entity entity, Content content, Message message, TranslateInfo translateInfo) throws Exception {
        boolean a = C29990c.m110930b().mo134586n().mo134685a("translate.image.chat.menu.enable");
        PostContent a2 = m222144a(content, message.getChatId(), message.getId(), entity);
        if (a && translateInfo != null) {
            m222157a(translateInfo, content, message, a2);
        }
        return a2;
    }

    /* renamed from: a */
    public static ImageContent m222141a(C14928Entity entity, Content content, Message message, TranslateInfo translateInfo) throws Exception {
        ImageContent imageContent;
        if (!C29990c.m110930b().mo134586n().mo134685a("translate.image.chat.menu.enable") || translateInfo == null) {
            imageContent = m222140a(content, message);
        } else {
            imageContent = m222142a(translateInfo, content, message);
        }
        m222156a(content, message, imageContent);
        return imageContent;
    }
}
