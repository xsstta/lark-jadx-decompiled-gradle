package com.ss.android.lark.chat.chatwindow.chat.v2.model.operation;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\nB'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002R(\u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/PreviewUpdater;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "previews", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "(Ljava/util/Map;)V", "invoke", "chatMessage", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.i */
public final class PreviewUpdater implements Function1<AbstractC34006a, AbstractC34006a> {

    /* renamed from: a */
    public static final Companion f86185a = new Companion(null);

    /* renamed from: b */
    private final Map<String, Map<String, UrlPreviewEntity>> f86186b;

    @JvmStatic
    /* renamed from: a */
    public static final Message m129594a(Message message, Map<String, ? extends UrlPreviewEntity> map) {
        return f86185a.mo123046a(message, map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007J2\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\t2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0003J(\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/PreviewUpdater$Companion;", "", "()V", "TAG", "", "mergePreview", "Lcom/ss/android/lark/chat/entity/message/Message;", "message", "previewMap", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "updatePreviewHangPoints", "", "hangPoints", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "updateRichTextPreviews", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "previews", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Message mo123046a(Message message, Map<String, ? extends UrlPreviewEntity> map) {
            Intrinsics.checkParameterIsNotNull(message, "message");
            if (message.getType() == Message.Type.TEXT) {
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<TextContent>()");
                TextContent textContent = (TextContent) content;
                Companion aVar = this;
                aVar.mo123048a(textContent.getPreviewHangPoints(), map);
                aVar.mo123047a(textContent.getRichText(), textContent.getPreviewHangPoints());
            } else if (message.getType() == Message.Type.POST) {
                Content content2 = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<PostContent>()");
                PostContent postContent = (PostContent) content2;
                Companion aVar2 = this;
                aVar2.mo123048a(postContent.getPreviewHangPoints(), map);
                aVar2.mo123047a(postContent.getRichText(), postContent.getPreviewHangPoints());
            }
            return message;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo123047a(RichText richText, Map<String, PreviewHangPoint> map) {
            if (!(richText == null || map == null || CollectionUtils.isEmpty(map))) {
                for (String str : map.keySet()) {
                    RichText.RichTextElements elements = richText.getElements();
                    Intrinsics.checkExpressionValueIsNotNull(elements, "richText.elements");
                    RichTextElement richTextElement = elements.getDictionary().get(str);
                    if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty)) {
                        PreviewHangPoint previewHangPoint = map.get(str);
                        String str2 = null;
                        UrlPreviewEntity urlPreviewEntity = previewHangPoint != null ? previewHangPoint.getUrlPreviewEntity() : null;
                        if (!(urlPreviewEntity instanceof NetUrlPreviewEntity)) {
                            urlPreviewEntity = null;
                        }
                        NetUrlPreviewEntity netUrlPreviewEntity = (NetUrlPreviewEntity) urlPreviewEntity;
                        if (netUrlPreviewEntity != null) {
                            NetUrlPreviewEntity netUrlPreviewEntity2 = netUrlPreviewEntity;
                            RichTextElement.RichTextProperty property = richTextElement.getProperty();
                            if (property != null) {
                                RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) property;
                                if (netUrlPreviewEntity2 != null) {
                                    NetUrlPreviewEntity netUrlPreviewEntity3 = netUrlPreviewEntity2;
                                    anchorProperty.setDisplayTitle(netUrlPreviewEntity3.getNetTitle());
                                    Url url = netUrlPreviewEntity2.getUrl();
                                    if (TextUtils.isEmpty(url != null ? url.getAndroidUrl() : null)) {
                                        Url url2 = netUrlPreviewEntity2.getUrl();
                                        if (url2 != null) {
                                            str2 = url2.getUrl();
                                        }
                                        anchorProperty.setHref(str2);
                                    } else {
                                        Url url3 = netUrlPreviewEntity2.getUrl();
                                        if (url3 != null) {
                                            str2 = url3.getAndroidUrl();
                                        }
                                        anchorProperty.setHref(str2);
                                    }
                                    anchorProperty.setIconKey(netUrlPreviewEntity3.getNetIconKey());
                                    anchorProperty.setUrlPreview(true);
                                    anchorProperty.setVersion(netUrlPreviewEntity3.getVersion());
                                    anchorProperty.setLocalIconRes(R.drawable.ic_icon_link_copy_outlined);
                                    richTextElement.setProperty(anchorProperty);
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity");
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.richtext.RichTextElement.AnchorProperty");
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo123048a(Map<String, PreviewHangPoint> map, Map<String, ? extends UrlPreviewEntity> map2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, PreviewHangPoint> entry : map.entrySet()) {
                String previewId = entry.getValue().getPreviewId();
                if (previewId != null) {
                    PreviewHangPoint previewHangPoint = (PreviewHangPoint) linkedHashMap.put(previewId, entry.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, ? extends UrlPreviewEntity> entry2 : map2.entrySet()) {
                    String key = entry2.getKey();
                    UrlPreviewEntity urlPreviewEntity = (UrlPreviewEntity) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        if (Intrinsics.areEqual(((PreviewHangPoint) entry3.getValue()).getPreviewId(), key)) {
                            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    PreviewHangPoint previewHangPoint2 = (PreviewHangPoint) linkedHashMap2.get(key);
                    if (previewHangPoint2 != null) {
                        if (previewHangPoint2.getUrlPreviewEntity() == null) {
                            previewHangPoint2.setUrlPreviewEntity(urlPreviewEntity);
                        } else {
                            UrlPreviewEntity urlPreviewEntity2 = previewHangPoint2.getUrlPreviewEntity();
                            if (urlPreviewEntity2 == null) {
                                Intrinsics.throwNpe();
                            }
                            if (urlPreviewEntity.compareTo(urlPreviewEntity2) >= 0) {
                                previewHangPoint2.setUrlPreviewEntity(urlPreviewEntity);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends com.ss.android.lark.chat.entity.preview.UrlPreviewEntity>> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewUpdater(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        this.f86186b = map;
    }

    /* renamed from: a */
    public AbstractC34006a invoke(AbstractC34006a aVar) {
        if (aVar == null) {
            return null;
        }
        AbstractC34006a clone = aVar.clone();
        Intrinsics.checkExpressionValueIsNotNull(clone, "this.clone()");
        Map<String, Map<String, UrlPreviewEntity>> map = this.f86186b;
        if (map != null) {
            Message message = clone.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "cloneItem.getMessage()");
            f86185a.mo123046a(message, map.get(aVar.getId()));
        }
        return clone;
    }
}
