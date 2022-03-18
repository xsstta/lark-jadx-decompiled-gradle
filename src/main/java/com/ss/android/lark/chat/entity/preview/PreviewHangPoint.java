package com.ss.android.lark.chat.entity.preview;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0006\u0010\"\u001a\u00020\tJ\b\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010(\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "Ljava/io/Serializable;", "Lcom/larksuite/framework/utils/diff/Diffable;", "url", "", "hangPointId", "messageId", "previewId", "needLocalPreview", "", "urlPreviewEntity", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;)V", "getHangPointId", "()Ljava/lang/String;", "getMessageId", "getNeedLocalPreview", "()Z", "getPreviewId", "getUrl", "getUrlPreviewEntity", "()Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "setUrlPreviewEntity", "(Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hasPreViewBodyAndUrl", "hashCode", "", "isContentSame", "diffable", "isItemSame", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewHangPoint implements AbstractC26248b<PreviewHangPoint>, Serializable {
    private final String hangPointId;
    private final String messageId;
    private final boolean needLocalPreview;
    private final String previewId;
    private final String url;
    private UrlPreviewEntity urlPreviewEntity;

    public static /* synthetic */ PreviewHangPoint copy$default(PreviewHangPoint previewHangPoint, String str, String str2, String str3, String str4, boolean z, UrlPreviewEntity urlPreviewEntity2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewHangPoint.url;
        }
        if ((i & 2) != 0) {
            str2 = previewHangPoint.hangPointId;
        }
        if ((i & 4) != 0) {
            str3 = previewHangPoint.messageId;
        }
        if ((i & 8) != 0) {
            str4 = previewHangPoint.previewId;
        }
        if ((i & 16) != 0) {
            z = previewHangPoint.needLocalPreview;
        }
        if ((i & 32) != 0) {
            urlPreviewEntity2 = previewHangPoint.urlPreviewEntity;
        }
        return previewHangPoint.copy(str, str2, str3, str4, z, urlPreviewEntity2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.hangPointId;
    }

    public final String component3() {
        return this.messageId;
    }

    public final String component4() {
        return this.previewId;
    }

    public final boolean component5() {
        return this.needLocalPreview;
    }

    public final UrlPreviewEntity component6() {
        return this.urlPreviewEntity;
    }

    public final PreviewHangPoint copy(String str, String str2, String str3, String str4, boolean z, UrlPreviewEntity urlPreviewEntity2) {
        return new PreviewHangPoint(str, str2, str3, str4, z, urlPreviewEntity2);
    }

    public String toString() {
        return "PreviewHangPoint(url=" + this.url + ", hangPointId=" + this.hangPointId + ", messageId=" + this.messageId + ", previewId=" + this.previewId + ", needLocalPreview=" + this.needLocalPreview + ", urlPreviewEntity=" + this.urlPreviewEntity + ")";
    }

    public final String getHangPointId() {
        return this.hangPointId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final boolean getNeedLocalPreview() {
        return this.needLocalPreview;
    }

    public final String getPreviewId() {
        return this.previewId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final UrlPreviewEntity getUrlPreviewEntity() {
        return this.urlPreviewEntity;
    }

    public final boolean hasPreViewBodyAndUrl() {
        boolean z;
        String str = this.url;
        if (str == null || str.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            UrlPreviewEntity urlPreviewEntity2 = this.urlPreviewEntity;
            if (urlPreviewEntity2 instanceof NetUrlPreviewEntity) {
                if (urlPreviewEntity2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity");
                } else if (((NetUrlPreviewEntity) urlPreviewEntity2).getPreviewBody() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.url;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.hangPointId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.messageId;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.previewId;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = (((i8 + i4) * 31) + Boolean.valueOf(this.needLocalPreview).hashCode()) * 31;
        UrlPreviewEntity urlPreviewEntity2 = this.urlPreviewEntity;
        if (urlPreviewEntity2 != null) {
            i5 = urlPreviewEntity2.hashCode();
        }
        return hashCode + i5;
    }

    public final void setUrlPreviewEntity(UrlPreviewEntity urlPreviewEntity2) {
        this.urlPreviewEntity = urlPreviewEntity2;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            PreviewHangPoint previewHangPoint = (PreviewHangPoint) obj;
            if (!(!Intrinsics.areEqual(this.url, previewHangPoint.url)) && !(!Intrinsics.areEqual(this.hangPointId, previewHangPoint.hangPointId)) && !(!Intrinsics.areEqual(this.messageId, previewHangPoint.messageId)) && !(!Intrinsics.areEqual(this.previewId, previewHangPoint.previewId)) && this.needLocalPreview == previewHangPoint.needLocalPreview && !(!Intrinsics.areEqual(this.urlPreviewEntity, previewHangPoint.urlPreviewEntity))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.PreviewHangPoint");
    }

    public boolean isContentSame(PreviewHangPoint previewHangPoint) {
        if (previewHangPoint != null && !(!Intrinsics.areEqual(this.url, previewHangPoint.url)) && !(!Intrinsics.areEqual(this.hangPointId, previewHangPoint.hangPointId)) && !(!Intrinsics.areEqual(this.messageId, previewHangPoint.messageId)) && !(!Intrinsics.areEqual(this.previewId, previewHangPoint.previewId)) && this.needLocalPreview == previewHangPoint.needLocalPreview && C26247a.m94983b(this.urlPreviewEntity, previewHangPoint.urlPreviewEntity)) {
            return true;
        }
        return false;
    }

    public boolean isItemSame(PreviewHangPoint previewHangPoint) {
        UrlPreviewEntity urlPreviewEntity2;
        UrlPreviewEntity urlPreviewEntity3 = this.urlPreviewEntity;
        UrlPreviewEntity urlPreviewEntity4 = null;
        if (urlPreviewEntity3 instanceof NetUrlPreviewEntity) {
            if (previewHangPoint != null) {
                urlPreviewEntity2 = previewHangPoint.urlPreviewEntity;
            } else {
                urlPreviewEntity2 = null;
            }
            if (urlPreviewEntity2 instanceof NetUrlPreviewEntity) {
                if (urlPreviewEntity3 != null) {
                    int version = ((NetUrlPreviewEntity) urlPreviewEntity3).getVersion();
                    UrlPreviewEntity urlPreviewEntity5 = previewHangPoint.urlPreviewEntity;
                    if (urlPreviewEntity5 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity");
                    } else if (version == ((NetUrlPreviewEntity) urlPreviewEntity5).getVersion()) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity");
                }
            }
        }
        if (urlPreviewEntity3 instanceof LocalUrlPreviewEntity) {
            if (previewHangPoint != null) {
                urlPreviewEntity4 = previewHangPoint.urlPreviewEntity;
            }
            if (urlPreviewEntity4 instanceof LocalUrlPreviewEntity) {
                if (urlPreviewEntity3 != null) {
                    return ((LocalUrlPreviewEntity) urlPreviewEntity3).equals(previewHangPoint.urlPreviewEntity);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.LocalUrlPreviewEntity");
            }
        }
        return false;
    }

    public PreviewHangPoint(String str, String str2, String str3, String str4, boolean z, UrlPreviewEntity urlPreviewEntity2) {
        this.url = str;
        this.hangPointId = str2;
        this.messageId = str3;
        this.previewId = str4;
        this.needLocalPreview = z;
        this.urlPreviewEntity = urlPreviewEntity2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PreviewHangPoint(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, com.ss.android.lark.chat.entity.preview.UrlPreviewEntity r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r14 = r14 & 16
            if (r14 == 0) goto L_0x0007
            r12 = 0
            r5 = 0
            goto L_0x0008
        L_0x0007:
            r5 = r12
        L_0x0008:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.entity.preview.PreviewHangPoint.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.ss.android.lark.chat.entity.preview.UrlPreviewEntity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
