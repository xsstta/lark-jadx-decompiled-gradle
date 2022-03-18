package com.ss.android.lark.chat.preview.entity;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\"B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010 \u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "Ljava/io/Serializable;", "Lcom/larksuite/framework/utils/diff/Diffable;", "sourceId", "", "sourceTextMD5", "sourceType", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries$UrlPreViewSourceType;", "entryList", "", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntry;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries$UrlPreViewSourceType;Ljava/util/List;)V", "getEntryList", "()Ljava/util/List;", "getSourceId", "()Ljava/lang/String;", "getSourceTextMD5", "getSourceType", "()Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries$UrlPreViewSourceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "isContentSame", "diffable", "isItemSame", "toString", "UrlPreViewSourceType", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UrlPreViewEntries implements AbstractC26248b<UrlPreViewEntries>, Serializable {
    private final List<UrlPreViewEntry> entryList;
    private final String sourceId;
    private final String sourceTextMD5;
    private final UrlPreViewSourceType sourceType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries$UrlPreViewSourceType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "CHAT_ANNOUNCEMENT", "PERSONAL_SIG", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum UrlPreViewSourceType {
        CHAT_ANNOUNCEMENT(1),
        PERSONAL_SIG(10);
        
        public static final Companion Companion = new Companion(null);
        private int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries$UrlPreViewSourceType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries$UrlPreViewSourceType;", "value", "", "valueOf", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.preview.entity.UrlPreViewEntries$UrlPreViewSourceType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: b */
            public final UrlPreViewSourceType mo126375b(int i) {
                return mo126374a(i);
            }

            /* renamed from: a */
            public UrlPreViewSourceType mo126374a(int i) {
                if (i == 1) {
                    return UrlPreViewSourceType.CHAT_ANNOUNCEMENT;
                }
                if (i != 10) {
                    return null;
                }
                return UrlPreViewSourceType.PERSONAL_SIG;
            }
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        private UrlPreViewSourceType(int i) {
            this.value = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.chat.preview.entity.UrlPreViewEntries */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UrlPreViewEntries copy$default(UrlPreViewEntries urlPreViewEntries, String str, String str2, UrlPreViewSourceType urlPreViewSourceType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlPreViewEntries.sourceId;
        }
        if ((i & 2) != 0) {
            str2 = urlPreViewEntries.sourceTextMD5;
        }
        if ((i & 4) != 0) {
            urlPreViewSourceType = urlPreViewEntries.sourceType;
        }
        if ((i & 8) != 0) {
            list = urlPreViewEntries.entryList;
        }
        return urlPreViewEntries.copy(str, str2, urlPreViewSourceType, list);
    }

    public final String component1() {
        return this.sourceId;
    }

    public final String component2() {
        return this.sourceTextMD5;
    }

    public final UrlPreViewSourceType component3() {
        return this.sourceType;
    }

    public final List<UrlPreViewEntry> component4() {
        return this.entryList;
    }

    public final UrlPreViewEntries copy(String str, String str2, UrlPreViewSourceType urlPreViewSourceType, List<UrlPreViewEntry> list) {
        Intrinsics.checkParameterIsNotNull(str2, "sourceTextMD5");
        Intrinsics.checkParameterIsNotNull(list, "entryList");
        return new UrlPreViewEntries(str, str2, urlPreViewSourceType, list);
    }

    public String toString() {
        return "UrlPreViewEntries(sourceId=" + this.sourceId + ", sourceTextMD5=" + this.sourceTextMD5 + ", sourceType=" + this.sourceType + ", entryList=" + this.entryList + ")";
    }

    public final List<UrlPreViewEntry> getEntryList() {
        return this.entryList;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceTextMD5() {
        return this.sourceTextMD5;
    }

    public final UrlPreViewSourceType getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        int i;
        String str = this.sourceId;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + this.sourceTextMD5.hashCode()) * 31;
        UrlPreViewSourceType urlPreViewSourceType = this.sourceType;
        if (urlPreViewSourceType != null) {
            i2 = urlPreViewSourceType.hashCode();
        }
        return ((hashCode + i2) * 31) + this.entryList.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlPreViewEntries)) {
            return false;
        }
        UrlPreViewEntries urlPreViewEntries = (UrlPreViewEntries) obj;
        if (!(!Intrinsics.areEqual(this.sourceId, urlPreViewEntries.sourceId)) && !(!Intrinsics.areEqual(this.sourceTextMD5, urlPreViewEntries.sourceTextMD5)) && this.sourceType == urlPreViewEntries.sourceType && !(!Intrinsics.areEqual(this.entryList, urlPreViewEntries.entryList))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r0.equals(r1) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isContentSame(com.ss.android.lark.chat.preview.entity.UrlPreViewEntries r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.sourceId
            r1 = 0
            if (r6 == 0) goto L_0x0008
            java.lang.String r2 = r6.sourceId
            goto L_0x0009
        L_0x0008:
            r2 = r1
        L_0x0009:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            r2 = 1
            r0 = r0 ^ r2
            r3 = 0
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = r5.sourceTextMD5
            if (r6 == 0) goto L_0x0019
            java.lang.String r4 = r6.sourceTextMD5
            goto L_0x001a
        L_0x0019:
            r4 = r1
        L_0x001a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x003c
            com.ss.android.lark.chat.preview.entity.UrlPreViewEntries$UrlPreViewSourceType r0 = r5.sourceType
            if (r0 == 0) goto L_0x0030
            if (r6 == 0) goto L_0x0029
            com.ss.android.lark.chat.preview.entity.UrlPreViewEntries$UrlPreViewSourceType r1 = r6.sourceType
        L_0x0029:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0030
            goto L_0x003c
        L_0x0030:
            java.util.List<com.ss.android.lark.chat.preview.entity.UrlPreViewEntry> r0 = r5.entryList
            java.util.List<com.ss.android.lark.chat.preview.entity.UrlPreViewEntry> r6 = r6.entryList
            boolean r6 = com.larksuite.framework.utils.p1203a.C26247a.m94982a(r0, r6)
            if (r6 != 0) goto L_0x003b
            return r3
        L_0x003b:
            return r2
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.preview.entity.UrlPreViewEntries.isContentSame(com.ss.android.lark.chat.preview.entity.UrlPreViewEntries):boolean");
    }

    public boolean isItemSame(UrlPreViewEntries urlPreViewEntries) {
        String str;
        UrlPreViewSourceType urlPreViewSourceType;
        String str2 = this.sourceId;
        String str3 = null;
        if (urlPreViewEntries != null) {
            str = urlPreViewEntries.sourceId;
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str2, str)) {
            return false;
        }
        String str4 = this.sourceTextMD5;
        if (urlPreViewEntries != null) {
            str3 = urlPreViewEntries.sourceTextMD5;
        }
        if (!Intrinsics.areEqual(str4, str3) || (urlPreViewSourceType = this.sourceType) == null || !urlPreViewSourceType.equals(urlPreViewEntries.sourceType)) {
            return false;
        }
        return true;
    }

    public UrlPreViewEntries(String str, String str2, UrlPreViewSourceType urlPreViewSourceType, List<UrlPreViewEntry> list) {
        Intrinsics.checkParameterIsNotNull(str2, "sourceTextMD5");
        Intrinsics.checkParameterIsNotNull(list, "entryList");
        this.sourceId = str;
        this.sourceTextMD5 = str2;
        this.sourceType = urlPreViewSourceType;
        this.entryList = list;
    }
}
