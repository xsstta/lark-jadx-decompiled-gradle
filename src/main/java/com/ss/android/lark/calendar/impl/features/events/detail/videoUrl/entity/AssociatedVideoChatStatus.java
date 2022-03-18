package com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVCMeetingAbbrInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedVideoChatStatus;", "Ljava/io/Serializable;", "id", "", "idType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedIdType;", "meetingInfo", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVCMeetingAbbrInfo;", "(Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedIdType;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVCMeetingAbbrInfo;)V", "getId", "()Ljava/lang/String;", "getIdType", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedIdType;", "getMeetingInfo", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVCMeetingAbbrInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AssociatedVideoChatStatus implements Serializable {
    private final String id;
    private final AssociatedIdType idType;
    private final DoVCMeetingAbbrInfo meetingInfo;

    public static /* synthetic */ AssociatedVideoChatStatus copy$default(AssociatedVideoChatStatus associatedVideoChatStatus, String str, AssociatedIdType associatedIdType, DoVCMeetingAbbrInfo doVCMeetingAbbrInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = associatedVideoChatStatus.id;
        }
        if ((i & 2) != 0) {
            associatedIdType = associatedVideoChatStatus.idType;
        }
        if ((i & 4) != 0) {
            doVCMeetingAbbrInfo = associatedVideoChatStatus.meetingInfo;
        }
        return associatedVideoChatStatus.copy(str, associatedIdType, doVCMeetingAbbrInfo);
    }

    public final String component1() {
        return this.id;
    }

    public final AssociatedIdType component2() {
        return this.idType;
    }

    public final DoVCMeetingAbbrInfo component3() {
        return this.meetingInfo;
    }

    public final AssociatedVideoChatStatus copy(String str, AssociatedIdType associatedIdType, DoVCMeetingAbbrInfo doVCMeetingAbbrInfo) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(associatedIdType, "idType");
        Intrinsics.checkParameterIsNotNull(doVCMeetingAbbrInfo, "meetingInfo");
        return new AssociatedVideoChatStatus(str, associatedIdType, doVCMeetingAbbrInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssociatedVideoChatStatus)) {
            return false;
        }
        AssociatedVideoChatStatus associatedVideoChatStatus = (AssociatedVideoChatStatus) obj;
        return Intrinsics.areEqual(this.id, associatedVideoChatStatus.id) && Intrinsics.areEqual(this.idType, associatedVideoChatStatus.idType) && Intrinsics.areEqual(this.meetingInfo, associatedVideoChatStatus.meetingInfo);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AssociatedIdType associatedIdType = this.idType;
        int hashCode2 = (hashCode + (associatedIdType != null ? associatedIdType.hashCode() : 0)) * 31;
        DoVCMeetingAbbrInfo doVCMeetingAbbrInfo = this.meetingInfo;
        if (doVCMeetingAbbrInfo != null) {
            i = doVCMeetingAbbrInfo.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AssociatedVideoChatStatus(id=" + this.id + ", idType=" + this.idType + ", meetingInfo=" + this.meetingInfo + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final AssociatedIdType getIdType() {
        return this.idType;
    }

    public final DoVCMeetingAbbrInfo getMeetingInfo() {
        return this.meetingInfo;
    }

    public AssociatedVideoChatStatus(String str, AssociatedIdType associatedIdType, DoVCMeetingAbbrInfo doVCMeetingAbbrInfo) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(associatedIdType, "idType");
        Intrinsics.checkParameterIsNotNull(doVCMeetingAbbrInfo, "meetingInfo");
        this.id = str;
        this.idType = associatedIdType;
        this.meetingInfo = doVCMeetingAbbrInfo;
    }
}
