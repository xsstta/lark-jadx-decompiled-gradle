package com.ss.android.lark.chat.entity.message.content;

import android.text.Layout;
import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\fH\u0007J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/BaseTextContent;", "T", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "contentLayout", "Landroid/text/Layout;", "getContentLayout", "()Landroid/text/Layout;", "setContentLayout", "(Landroid/text/Layout;)V", "previewHangPoints", "", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "getPreviewHangPoints", "()Ljava/util/Map;", "setPreviewHangPoints", "(Ljava/util/Map;)V", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setRichText", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "textInMemory", "getTextInMemory", "()Ljava/lang/String;", "setTextInMemory", "(Ljava/lang/String;)V", "getText", "isContentSame", "", "diffable", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseTextContent<T extends BaseTextContent<T>> extends Content {
    private transient Layout contentLayout;
    private Map<String, PreviewHangPoint> previewHangPoints = new LinkedHashMap();
    private RichText richText;
    private String textInMemory = "";

    public final Layout getContentLayout() {
        return this.contentLayout;
    }

    public final Map<String, PreviewHangPoint> getPreviewHangPoints() {
        return this.previewHangPoints;
    }

    public final RichText getRichText() {
        return this.richText;
    }

    public final String getTextInMemory() {
        return this.textInMemory;
    }

    @Deprecated(message = "")
    public final String getText() {
        RichText richText2;
        if (TextUtils.isEmpty(this.textInMemory) && (richText2 = this.richText) != null) {
            this.textInMemory = C59035h.m229211b(richText2);
        }
        String str = this.textInMemory;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final void setContentLayout(Layout layout) {
        this.contentLayout = layout;
    }

    public final void setRichText(RichText richText2) {
        this.richText = richText2;
    }

    public final void setTextInMemory(String str) {
        this.textInMemory = str;
    }

    public final void setPreviewHangPoints(Map<String, PreviewHangPoint> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.previewHangPoints = map;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        boolean z = content instanceof BaseTextContent;
        if (z) {
            for (String str : this.previewHangPoints.keySet()) {
                if (!C26247a.m94983b(this.previewHangPoints.get(str), ((BaseTextContent) content).previewHangPoints.get(str))) {
                    return false;
                }
            }
        }
        if (content == null || !z || !Objects.equals(((BaseTextContent) content).richText, this.richText)) {
            return false;
        }
        return true;
    }
}
