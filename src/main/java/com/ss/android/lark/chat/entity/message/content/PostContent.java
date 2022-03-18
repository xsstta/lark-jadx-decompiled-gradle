package com.ss.android.lark.chat.entity.message.content;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONType;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&J\u0012\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/PostContent;", "Lcom/ss/android/lark/chat/entity/message/content/BaseTextContent;", "()V", "docEntityMap", "", "", "Lcom/ss/android/lark/doc/entity/Doc;", "getDocEntityMap", "()Ljava/util/Map;", "setDocEntityMap", "(Ljava/util/Map;)V", "docResult", "Lcom/ss/android/lark/doc/entity/DocResult;", "getDocResult", "()Lcom/ss/android/lark/doc/entity/DocResult;", "setDocResult", "(Lcom/ss/android/lark/doc/entity/DocResult;)V", "isGroupAnnouncement", "", "()Z", "setGroupAnnouncement", "(Z)V", "isNotified", "setNotified", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "urlPreviewList", "", "Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "getUrlPreviewList", "()Ljava/util/List;", "setUrlPreviewList", "(Ljava/util/List;)V", "getTitleWithFilter", "context", "Landroid/content/Context;", "isContentSame", "diffable", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "PostContent")
public final class PostContent extends BaseTextContent<PostContent> {
    private Map<String, ? extends Doc> docEntityMap;
    private DocResult docResult;
    private boolean isGroupAnnouncement;
    private boolean isNotified;
    private String title;
    private List<? extends MessageUrlPreview> urlPreviewList;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends com.ss.android.lark.doc.entity.Doc>, java.util.Map<java.lang.String, com.ss.android.lark.doc.entity.Doc> */
    public final Map<String, Doc> getDocEntityMap() {
        return this.docEntityMap;
    }

    public final DocResult getDocResult() {
        return this.docResult;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.chat.entity.message.MessageUrlPreview>, java.util.List<com.ss.android.lark.chat.entity.message.MessageUrlPreview> */
    public final List<MessageUrlPreview> getUrlPreviewList() {
        return this.urlPreviewList;
    }

    public final boolean isGroupAnnouncement() {
        return this.isGroupAnnouncement;
    }

    public final boolean isNotified() {
        return this.isNotified;
    }

    public final void setDocEntityMap(Map<String, ? extends Doc> map) {
        this.docEntityMap = map;
    }

    public final void setDocResult(DocResult docResult2) {
        this.docResult = docResult2;
    }

    public final void setGroupAnnouncement(boolean z) {
        this.isGroupAnnouncement = z;
    }

    public final void setNotified(boolean z) {
        this.isNotified = z;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrlPreviewList(List<? extends MessageUrlPreview> list) {
        this.urlPreviewList = list;
    }

    public final String getTitleWithFilter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (TextUtils.isEmpty(this.title)) {
            return "";
        }
        for (String str : UIUtils.getStringArray(context, R.array.shielded_post_title)) {
            if (Intrinsics.areEqual(str, this.title)) {
                return "";
            }
        }
        String str2 = this.title;
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    @Override // com.ss.android.lark.chat.entity.message.content.BaseTextContent, com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        if (!(content instanceof PostContent)) {
            return false;
        }
        String str = this.title;
        if (str == null) {
            if (((PostContent) content).title != null) {
                return false;
            }
        } else if (!Intrinsics.areEqual(str, ((PostContent) content).title)) {
            return false;
        }
        if (!super.isContentSame(content) || !C26247a.m94983b(this.docResult, ((PostContent) content).docResult)) {
            return false;
        }
        return true;
    }
}
