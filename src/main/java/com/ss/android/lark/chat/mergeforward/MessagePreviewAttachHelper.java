package com.ss.android.lark.chat.mergeforward;

import com.ss.android.lark.chat.api.service.impl.PreviewService;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.export.entity.message.Content;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/mergeforward/MessagePreviewAttachHelper;", "", "()V", "completeMessages", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "messages", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.mergeforward.f */
public final class MessagePreviewAttachHelper {

    /* renamed from: a */
    public static final MessagePreviewAttachHelper f88072a = new MessagePreviewAttachHelper();

    private MessagePreviewAttachHelper() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.message.Message> */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: a */
    public static final List<Message> m132219a(List<? extends Message> list) {
        Map<String, UrlPreviewEntity> map;
        Map<String, UrlPreviewEntity> map2;
        boolean z;
        boolean z2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (list != 0) {
            ArrayList<Message> arrayList = new ArrayList();
            for (Object obj : list) {
                Message message = (Message) obj;
                if (message.getType() == Message.Type.TEXT || message.getType() == Message.Type.POST) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            for (Message message2 : arrayList) {
                ArrayList arrayList2 = new ArrayList();
                if (message2.getType() == Message.Type.TEXT) {
                    Content content = message2.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content, "it.getContent<TextContent>()");
                    for (Map.Entry<String, PreviewHangPoint> entry : ((TextContent) content).getPreviewHangPoints().entrySet()) {
                        String previewId = entry.getValue().getPreviewId();
                        if (previewId != null) {
                            arrayList2.add(previewId);
                        }
                    }
                } else if (message2.getType() == Message.Type.POST) {
                    Content content2 = message2.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content2, "it.getContent<PostContent>()");
                    for (Map.Entry<String, PreviewHangPoint> entry2 : ((PostContent) content2).getPreviewHangPoints().entrySet()) {
                        String previewId2 = entry2.getValue().getPreviewId();
                        if (previewId2 != null) {
                            arrayList2.add(previewId2);
                        }
                    }
                }
                String id = message2.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "it.id");
                concurrentHashMap.put(id, arrayList2);
            }
        }
        Map<String, Map<String, UrlPreviewEntity>> a = PreviewService.f84464b.mo121338a().mo121334a(concurrentHashMap);
        if (list != 0) {
            ArrayList<Message> arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                Message message3 = (Message) obj2;
                if (message3.getType() == Message.Type.TEXT || message3.getType() == Message.Type.POST) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList3.add(obj2);
                }
            }
            for (Message message4 : arrayList3) {
                String id2 = message4.getId();
                if (message4.getType() == Message.Type.TEXT) {
                    Content content3 = message4.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content3, "it.getContent<TextContent>()");
                    for (Map.Entry<String, PreviewHangPoint> entry3 : ((TextContent) content3).getPreviewHangPoints().entrySet()) {
                        PreviewHangPoint value = entry3.getValue();
                        value.setUrlPreviewEntity((a == null || (map2 = a.get(id2)) == null) ? null : map2.get(value.getPreviewId()));
                    }
                } else if (message4.getType() == Message.Type.POST) {
                    Content content4 = message4.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content4, "it.getContent<PostContent>()");
                    for (Map.Entry<String, PreviewHangPoint> entry4 : ((PostContent) content4).getPreviewHangPoints().entrySet()) {
                        PreviewHangPoint value2 = entry4.getValue();
                        value2.setUrlPreviewEntity((a == null || (map = a.get(id2)) == null) ? null : map.get(value2.getPreviewId()));
                    }
                }
            }
        }
        return list;
    }
}
