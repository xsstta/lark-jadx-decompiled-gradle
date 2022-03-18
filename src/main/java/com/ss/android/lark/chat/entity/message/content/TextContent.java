package com.ss.android.lark.chat.entity.message.content;

import com.alibaba.fastjson.annotation.JSONType;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/TextContent;", "Lcom/ss/android/lark/chat/entity/message/content/BaseTextContent;", "()V", "docEntityMap", "", "", "Lcom/ss/android/lark/doc/entity/Doc;", "getDocEntityMap", "()Ljava/util/Map;", "setDocEntityMap", "(Ljava/util/Map;)V", "docResult", "Lcom/ss/android/lark/doc/entity/DocResult;", "getDocResult", "()Lcom/ss/android/lark/doc/entity/DocResult;", "setDocResult", "(Lcom/ss/android/lark/doc/entity/DocResult;)V", "urlPreviewList", "", "Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "getUrlPreviewList", "()Ljava/util/List;", "setUrlPreviewList", "(Ljava/util/List;)V", "equals", "", "obj", "", "hashCode", "", "isContentSame", "diffable", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "TextContent")
public final class TextContent extends BaseTextContent<TextContent> {
    private Map<String, ? extends Doc> docEntityMap;
    private DocResult docResult;
    private List<? extends MessageUrlPreview> urlPreviewList;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends com.ss.android.lark.doc.entity.Doc>, java.util.Map<java.lang.String, com.ss.android.lark.doc.entity.Doc> */
    public final Map<String, Doc> getDocEntityMap() {
        return this.docEntityMap;
    }

    public final DocResult getDocResult() {
        return this.docResult;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.chat.entity.message.MessageUrlPreview>, java.util.List<com.ss.android.lark.chat.entity.message.MessageUrlPreview> */
    public final List<MessageUrlPreview> getUrlPreviewList() {
        return this.urlPreviewList;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final void setDocEntityMap(Map<String, ? extends Doc> map) {
        this.docEntityMap = map;
    }

    public final void setDocResult(DocResult docResult2) {
        this.docResult = docResult2;
    }

    public final void setUrlPreviewList(List<? extends MessageUrlPreview> list) {
        this.urlPreviewList = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContent) || !super.isContentSame((Content) ((TextContent) obj))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.message.content.BaseTextContent, com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        if (!super.isContentSame(content) || !(content instanceof TextContent) || !C26247a.m94983b(this.docResult, ((TextContent) content).docResult)) {
            return false;
        }
        return true;
    }
}
