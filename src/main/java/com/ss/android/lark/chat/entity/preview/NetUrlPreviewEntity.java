package com.ss.android.lark.chat.entity.preview;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0001H\u0002J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0007H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "netIconKey", "", "netTitle", "netUrlTag", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "previewBody", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewBody;", "sourceId", "previewId", "url", "Lcom/ss/android/lark/chat/entity/preview/Url;", "actions", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/ss/android/lark/chat/entity/preview/UrlPreviewBody;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/preview/Url;Ljava/util/Map;)V", "getNetIconKey", "()Ljava/lang/String;", "getNetTitle", "getNetUrlTag", "getPreviewBody", "()Lcom/ss/android/lark/chat/entity/preview/UrlPreviewBody;", "getVersion", "()I", "compareTo", "other", "equals", "", "", "hashCode", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NetUrlPreviewEntity extends UrlPreviewEntity {
    private final String netIconKey;
    private final String netTitle;
    private final String netUrlTag;
    private final UrlPreviewBody previewBody;
    private final int version;

    public final String getNetIconKey() {
        return this.netIconKey;
    }

    public final String getNetTitle() {
        return this.netTitle;
    }

    public final String getNetUrlTag() {
        return this.netUrlTag;
    }

    public final UrlPreviewBody getPreviewBody() {
        return this.previewBody;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // com.ss.android.lark.chat.entity.preview.UrlPreviewEntity
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = super.hashCode() * 31;
        String str = this.netIconKey;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        String str2 = this.netTitle;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.netUrlTag;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.version) * 31;
        UrlPreviewBody urlPreviewBody = this.previewBody;
        if (urlPreviewBody != null) {
            i4 = urlPreviewBody.hashCode();
        }
        return i7 + i4;
    }

    @Override // com.ss.android.lark.chat.entity.preview.UrlPreviewEntity
    public int compareTo(UrlPreviewEntity urlPreviewEntity) {
        Intrinsics.checkParameterIsNotNull(urlPreviewEntity, "other");
        boolean z = urlPreviewEntity instanceof NetUrlPreviewEntity;
        if (z) {
            return this.version - ((NetUrlPreviewEntity) urlPreviewEntity).version;
        }
        if (!z) {
            return 1;
        }
        return super.compareTo(urlPreviewEntity);
    }

    @Override // com.ss.android.lark.chat.entity.preview.UrlPreviewEntity
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetUrlPreviewEntity) || !super.equals(obj)) {
            return false;
        }
        NetUrlPreviewEntity netUrlPreviewEntity = (NetUrlPreviewEntity) obj;
        if (!(!Intrinsics.areEqual(this.netIconKey, netUrlPreviewEntity.netIconKey)) && !(!Intrinsics.areEqual(this.netTitle, netUrlPreviewEntity.netTitle)) && !(!Intrinsics.areEqual(this.netUrlTag, netUrlPreviewEntity.netUrlTag)) && this.version == netUrlPreviewEntity.version && !(!Intrinsics.areEqual(this.previewBody, netUrlPreviewEntity.previewBody))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetUrlPreviewEntity(String str, String str2, String str3, int i, UrlPreviewBody urlPreviewBody, String str4, String str5, Url url, Map<String, UrlPreviewAction> map) {
        super(str4, str5, url, map);
        Intrinsics.checkParameterIsNotNull(str4, "sourceId");
        Intrinsics.checkParameterIsNotNull(str5, "previewId");
        Intrinsics.checkParameterIsNotNull(map, "actions");
        this.netIconKey = str;
        this.netTitle = str2;
        this.netUrlTag = str3;
        this.version = i;
        this.previewBody = urlPreviewBody;
    }
}
