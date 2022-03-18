package com.ss.android.appcenter.business.net.pupups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.business.tab.business.popups.content.PopupsContentType;
import com.ss.android.appcenter.common.util.C28183g;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/appcenter/business/net/pupups/PopupsNotification;", "Ljava/io/Serializable;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "contentObj", "Lkotlin/Lazy;", "Lcom/ss/android/appcenter/business/net/pupups/PopupsContent;", "kotlin.jvm.PlatformType", "getContentObj", "()Lkotlin/Lazy;", "setContentObj", "(Lkotlin/Lazy;)V", "id", "getId", "setId", "contentConfig", "Lcom/ss/android/appcenter/business/net/pupups/PopupsConfig;", "contentElement", "Lcom/ss/android/appcenter/business/net/pupups/PopupsElement;", "contentType", "Lcom/ss/android/appcenter/business/tab/business/popups/content/PopupsContentType;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PopupsNotification implements Serializable {
    @SerializedName("content")
    private String content;
    @Expose(deserialize = false, serialize = false)
    private Lazy<PopupsContent> contentObj = LazyKt.lazy(new C27740a(this));
    @SerializedName("id")
    private String id;

    public final String getContent() {
        return this.content;
    }

    public final Lazy<PopupsContent> getContentObj() {
        return this.contentObj;
    }

    public final String getId() {
        return this.id;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/appcenter/business/net/pupups/PopupsContent;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.net.pupups.PopupsNotification$a */
    static final class C27740a extends Lambda implements Function0<PopupsContent> {
        final /* synthetic */ PopupsNotification this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27740a(PopupsNotification popupsNotification) {
            super(0);
            this.this$0 = popupsNotification;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PopupsContent invoke() {
            return (PopupsContent) C27579g.f68797a.fromJson(this.this$0.getContent(), PopupsContent.class);
        }
    }

    public final PopupsConfig contentConfig() {
        PopupsContent value = this.contentObj.getValue();
        if (value != null) {
            return value.getConfig();
        }
        return null;
    }

    public final PopupsElement contentElement() {
        Map<String, List<PopupsElement>> i18nElements;
        List<PopupsElement> list;
        PopupsContent value = this.contentObj.getValue();
        if (value == null || (i18nElements = value.getI18nElements()) == null || (list = i18nElements.get(C28183g.m103240a())) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public final PopupsContentType contentType() {
        PopupsElement contentElement = contentElement();
        if (contentElement == null) {
            return PopupsContentType.Unknown;
        }
        String tag = contentElement.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != 104387) {
                if (hashCode == 107980 && tag.equals("med")) {
                    return PopupsContentType.Video;
                }
            } else if (tag.equals("img")) {
                return PopupsContentType.Image;
            }
        }
        return PopupsContentType.Unknown;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setContentObj(Lazy<PopupsContent> lazy) {
        Intrinsics.checkParameterIsNotNull(lazy, "<set-?>");
        this.contentObj = lazy;
    }
}
