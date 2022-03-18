package com.ss.android.lark.calendar.impl.features.common.widget.attachment;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "", "fileToken", "", "fileSize", "name", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "localPath", "uploaderUserId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;Ljava/lang/String;Ljava/lang/String;)V", "getFileSize", "()Ljava/lang/String;", "getFileToken", "getLocalPath", "getName", "getType", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "getUploaderUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.attachment.a */
public final class AttachmentItemData {

    /* renamed from: a */
    private final String f78750a;

    /* renamed from: b */
    private final String f78751b;

    /* renamed from: c */
    private final String f78752c;

    /* renamed from: d */
    private final CalendarEventAttachment.Type f78753d;

    /* renamed from: e */
    private final String f78754e;

    /* renamed from: f */
    private final String f78755f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentItemData)) {
            return false;
        }
        AttachmentItemData aVar = (AttachmentItemData) obj;
        return Intrinsics.areEqual(this.f78750a, aVar.f78750a) && Intrinsics.areEqual(this.f78751b, aVar.f78751b) && Intrinsics.areEqual(this.f78752c, aVar.f78752c) && Intrinsics.areEqual(this.f78753d, aVar.f78753d) && Intrinsics.areEqual(this.f78754e, aVar.f78754e) && Intrinsics.areEqual(this.f78755f, aVar.f78755f);
    }

    public int hashCode() {
        String str = this.f78750a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f78751b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f78752c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        CalendarEventAttachment.Type type = this.f78753d;
        int hashCode4 = (hashCode3 + (type != null ? type.hashCode() : 0)) * 31;
        String str4 = this.f78754e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f78755f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "AttachmentItemData(fileToken=" + this.f78750a + ", fileSize=" + this.f78751b + ", name=" + this.f78752c + ", type=" + this.f78753d + ", localPath=" + this.f78754e + ", uploaderUserId=" + this.f78755f + ")";
    }

    /* renamed from: a */
    public final String mo112888a() {
        return this.f78750a;
    }

    /* renamed from: b */
    public final String mo112889b() {
        return this.f78751b;
    }

    /* renamed from: c */
    public final String mo112890c() {
        return this.f78752c;
    }

    /* renamed from: d */
    public final CalendarEventAttachment.Type mo112891d() {
        return this.f78753d;
    }

    public AttachmentItemData(String str, String str2, String str3, CalendarEventAttachment.Type type, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "fileToken");
        Intrinsics.checkParameterIsNotNull(str2, "fileSize");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str4, "localPath");
        Intrinsics.checkParameterIsNotNull(str5, "uploaderUserId");
        this.f78750a = str;
        this.f78751b = str2;
        this.f78752c = str3;
        this.f78753d = type;
        this.f78754e = str4;
        this.f78755f = str5;
    }
}
