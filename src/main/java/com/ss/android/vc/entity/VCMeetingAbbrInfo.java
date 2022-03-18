package com.ss.android.vc.entity;

import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.vc.entity.VideoChat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bd\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010#J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u0010g\u001a\u00020\u0016HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010l\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010m\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010n\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010.J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010q\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010r\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010u\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0002\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010{J\u0013\u0010|\u001a\u00020\u001a2\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010~\u001a\u00020HÖ\u0001J\u0007\u0010\u0001\u001a\u00020\u001aJ\n\u0010\u0001\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b\u001f\u0010.\"\u0004\b:\u00100R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b\u0019\u0010.\"\u0004\b;\u00100R\u001e\u0010 \u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b<\u0010.\"\u0004\b=\u00100R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00103\"\u0004\bC\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010!\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\bR\u0010%\"\u0004\bS\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00107\"\u0004\bU\u00109R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\bV\u0010%\"\u0004\bW\u0010'R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u00103\"\u0004\bY\u00105R\u001e\u0010\"\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\bZ\u0010.\"\u0004\b[\u00100R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006\u0001"}, d2 = {"Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;", "", "meetingId", "", ChatTypeStateKeeper.f135670e, "startTime", "", "endTime", "hostUser", "Lcom/ss/android/vc/entity/ByteviewUser;", "sponsorUser", "meetingSource", "Lcom/ss/android/vc/entity/VideoChat$MeetingSource;", "vcType", "Lcom/ss/android/vc/entity/VideoChat$Type;", "meetingStatus", "Lcom/ss/android/vc/entity/MeetingStatus;", "meetingNo", "participants", "", "Lcom/ss/android/vc/entity/VCParticipantAbbrInfo;", "userAction", "Lcom/ss/android/vc/entity/UserAction;", "followStatus", "Lcom/ss/android/vc/entity/FollowStatus;", "isNeedRefresh", "", "groupId", "sortTime", "full", "locked", "isLobbyOn", "live", "recording", "topicModified", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/vc/entity/ByteviewUser;Lcom/ss/android/vc/entity/ByteviewUser;Lcom/ss/android/vc/entity/VideoChat$MeetingSource;Lcom/ss/android/vc/entity/VideoChat$Type;Lcom/ss/android/vc/entity/MeetingStatus;Ljava/lang/String;Ljava/util/List;Lcom/ss/android/vc/entity/UserAction;Lcom/ss/android/vc/entity/FollowStatus;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEndTime", "()Ljava/lang/Long;", "setEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFollowStatus", "()Lcom/ss/android/vc/entity/FollowStatus;", "setFollowStatus", "(Lcom/ss/android/vc/entity/FollowStatus;)V", "getFull", "()Ljava/lang/Boolean;", "setFull", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "getHostUser", "()Lcom/ss/android/vc/entity/ByteviewUser;", "setHostUser", "(Lcom/ss/android/vc/entity/ByteviewUser;)V", "setLobbyOn", "setNeedRefresh", "getLive", "setLive", "getLocked", "setLocked", "getMeetingId", "setMeetingId", "getMeetingNo", "setMeetingNo", "getMeetingSource", "()Lcom/ss/android/vc/entity/VideoChat$MeetingSource;", "setMeetingSource", "(Lcom/ss/android/vc/entity/VideoChat$MeetingSource;)V", "getMeetingStatus", "()Lcom/ss/android/vc/entity/MeetingStatus;", "setMeetingStatus", "(Lcom/ss/android/vc/entity/MeetingStatus;)V", "getParticipants", "()Ljava/util/List;", "setParticipants", "(Ljava/util/List;)V", "getRecording", "setRecording", "getSortTime", "setSortTime", "getSponsorUser", "setSponsorUser", "getStartTime", "setStartTime", "getTopic", "setTopic", "getTopicModified", "setTopicModified", "getUserAction", "()Lcom/ss/android/vc/entity/UserAction;", "setUserAction", "(Lcom/ss/android/vc/entity/UserAction;)V", "getVcType", "()Lcom/ss/android/vc/entity/VideoChat$Type;", "setVcType", "(Lcom/ss/android/vc/entity/VideoChat$Type;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/vc/entity/ByteviewUser;Lcom/ss/android/vc/entity/ByteviewUser;Lcom/ss/android/vc/entity/VideoChat$MeetingSource;Lcom/ss/android/vc/entity/VideoChat$Type;Lcom/ss/android/vc/entity/MeetingStatus;Ljava/lang/String;Ljava/util/List;Lcom/ss/android/vc/entity/UserAction;Lcom/ss/android/vc/entity/FollowStatus;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ss/android/vc/entity/VCMeetingAbbrInfo;", "equals", "other", "hashCode", "", "isLocked", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.s */
public final class VCMeetingAbbrInfo {

    /* renamed from: a */
    private String f152732a;

    /* renamed from: b */
    private String f152733b;

    /* renamed from: c */
    private Long f152734c;

    /* renamed from: d */
    private Long f152735d;

    /* renamed from: e */
    private ByteviewUser f152736e;

    /* renamed from: f */
    private ByteviewUser f152737f;

    /* renamed from: g */
    private VideoChat.MeetingSource f152738g;

    /* renamed from: h */
    private VideoChat.Type f152739h;

    /* renamed from: i */
    private MeetingStatus f152740i;

    /* renamed from: j */
    private String f152741j;

    /* renamed from: k */
    private List<VCParticipantAbbrInfo> f152742k;

    /* renamed from: l */
    private UserAction f152743l;

    /* renamed from: m */
    private FollowStatus f152744m;

    /* renamed from: n */
    private Boolean f152745n;

    /* renamed from: o */
    private String f152746o;

    /* renamed from: p */
    private Long f152747p;

    /* renamed from: q */
    private Boolean f152748q;

    /* renamed from: r */
    private Boolean f152749r;

    /* renamed from: s */
    private Boolean f152750s;

    /* renamed from: t */
    private Boolean f152751t;

    /* renamed from: u */
    private Boolean f152752u;

    /* renamed from: v */
    private Boolean f152753v;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VCMeetingAbbrInfo)) {
            return false;
        }
        VCMeetingAbbrInfo sVar = (VCMeetingAbbrInfo) obj;
        return Intrinsics.areEqual(this.f152732a, sVar.f152732a) && Intrinsics.areEqual(this.f152733b, sVar.f152733b) && Intrinsics.areEqual(this.f152734c, sVar.f152734c) && Intrinsics.areEqual(this.f152735d, sVar.f152735d) && Intrinsics.areEqual(this.f152736e, sVar.f152736e) && Intrinsics.areEqual(this.f152737f, sVar.f152737f) && Intrinsics.areEqual(this.f152738g, sVar.f152738g) && Intrinsics.areEqual(this.f152739h, sVar.f152739h) && Intrinsics.areEqual(this.f152740i, sVar.f152740i) && Intrinsics.areEqual(this.f152741j, sVar.f152741j) && Intrinsics.areEqual(this.f152742k, sVar.f152742k) && Intrinsics.areEqual(this.f152743l, sVar.f152743l) && Intrinsics.areEqual(this.f152744m, sVar.f152744m) && Intrinsics.areEqual(this.f152745n, sVar.f152745n) && Intrinsics.areEqual(this.f152746o, sVar.f152746o) && Intrinsics.areEqual(this.f152747p, sVar.f152747p) && Intrinsics.areEqual(this.f152748q, sVar.f152748q) && Intrinsics.areEqual(this.f152749r, sVar.f152749r) && Intrinsics.areEqual(this.f152750s, sVar.f152750s) && Intrinsics.areEqual(this.f152751t, sVar.f152751t) && Intrinsics.areEqual(this.f152752u, sVar.f152752u) && Intrinsics.areEqual(this.f152753v, sVar.f152753v);
    }

    public int hashCode() {
        String str = this.f152732a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f152733b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.f152734c;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f152735d;
        int hashCode4 = (hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        ByteviewUser byteviewUser = this.f152736e;
        int hashCode5 = (hashCode4 + (byteviewUser != null ? byteviewUser.hashCode() : 0)) * 31;
        ByteviewUser byteviewUser2 = this.f152737f;
        int hashCode6 = (hashCode5 + (byteviewUser2 != null ? byteviewUser2.hashCode() : 0)) * 31;
        VideoChat.MeetingSource meetingSource = this.f152738g;
        int hashCode7 = (hashCode6 + (meetingSource != null ? meetingSource.hashCode() : 0)) * 31;
        VideoChat.Type type = this.f152739h;
        int hashCode8 = (hashCode7 + (type != null ? type.hashCode() : 0)) * 31;
        MeetingStatus meetingStatus = this.f152740i;
        int hashCode9 = (hashCode8 + (meetingStatus != null ? meetingStatus.hashCode() : 0)) * 31;
        String str3 = this.f152741j;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<VCParticipantAbbrInfo> list = this.f152742k;
        int hashCode11 = (hashCode10 + (list != null ? list.hashCode() : 0)) * 31;
        UserAction userAction = this.f152743l;
        int hashCode12 = (hashCode11 + (userAction != null ? userAction.hashCode() : 0)) * 31;
        FollowStatus cVar = this.f152744m;
        int hashCode13 = (hashCode12 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Boolean bool = this.f152745n;
        int hashCode14 = (hashCode13 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f152746o;
        int hashCode15 = (hashCode14 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l3 = this.f152747p;
        int hashCode16 = (hashCode15 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Boolean bool2 = this.f152748q;
        int hashCode17 = (hashCode16 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f152749r;
        int hashCode18 = (hashCode17 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f152750s;
        int hashCode19 = (hashCode18 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f152751t;
        int hashCode20 = (hashCode19 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.f152752u;
        int hashCode21 = (hashCode20 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Boolean bool7 = this.f152753v;
        if (bool7 != null) {
            i = bool7.hashCode();
        }
        return hashCode21 + i;
    }

    public String toString() {
        return "VCMeetingAbbrInfo(meetingId=" + this.f152732a + ", topic=" + this.f152733b + ", startTime=" + this.f152734c + ", endTime=" + this.f152735d + ", hostUser=" + this.f152736e + ", sponsorUser=" + this.f152737f + ", meetingSource=" + this.f152738g + ", vcType=" + this.f152739h + ", meetingStatus=" + this.f152740i + ", meetingNo=" + this.f152741j + ", participants=" + this.f152742k + ", userAction=" + this.f152743l + ", followStatus=" + this.f152744m + ", isNeedRefresh=" + this.f152745n + ", groupId=" + this.f152746o + ", sortTime=" + this.f152747p + ", full=" + this.f152748q + ", locked=" + this.f152749r + ", isLobbyOn=" + this.f152750s + ", live=" + this.f152751t + ", recording=" + this.f152752u + ", topicModified=" + this.f152753v + ")";
    }

    /* renamed from: b */
    public final String mo210141b() {
        return this.f152732a;
    }

    /* renamed from: c */
    public final String mo210142c() {
        return this.f152733b;
    }

    /* renamed from: d */
    public final Long mo210143d() {
        return this.f152734c;
    }

    /* renamed from: e */
    public final ByteviewUser mo210144e() {
        return this.f152737f;
    }

    /* renamed from: f */
    public final String mo210146f() {
        return this.f152741j;
    }

    /* renamed from: g */
    public final List<VCParticipantAbbrInfo> mo210147g() {
        return this.f152742k;
    }

    /* renamed from: h */
    public final Boolean mo210148h() {
        return this.f152748q;
    }

    /* renamed from: i */
    public final Boolean mo210150i() {
        return this.f152751t;
    }

    /* renamed from: j */
    public final Boolean mo210151j() {
        return this.f152752u;
    }

    /* renamed from: k */
    public final Boolean mo210152k() {
        return this.f152753v;
    }

    /* renamed from: a */
    public final boolean mo210140a() {
        Boolean bool = this.f152750s;
        if (bool == null || this.f152749r == null) {
            return false;
        }
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        if (bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f152749r;
        if (bool2 == null) {
            Intrinsics.throwNpe();
        }
        if (bool2.booleanValue()) {
            return true;
        }
        return false;
    }

    public VCMeetingAbbrInfo(String str, String str2, Long l, Long l2, ByteviewUser byteviewUser, ByteviewUser byteviewUser2, VideoChat.MeetingSource meetingSource, VideoChat.Type type, MeetingStatus meetingStatus, String str3, List<VCParticipantAbbrInfo> list, UserAction userAction, FollowStatus cVar, Boolean bool, String str4, Long l3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        Intrinsics.checkParameterIsNotNull(str2, ChatTypeStateKeeper.f135670e);
        Intrinsics.checkParameterIsNotNull(list, "participants");
        Intrinsics.checkParameterIsNotNull(userAction, "userAction");
        this.f152732a = str;
        this.f152733b = str2;
        this.f152734c = l;
        this.f152735d = l2;
        this.f152736e = byteviewUser;
        this.f152737f = byteviewUser2;
        this.f152738g = meetingSource;
        this.f152739h = type;
        this.f152740i = meetingStatus;
        this.f152741j = str3;
        this.f152742k = list;
        this.f152743l = userAction;
        this.f152744m = cVar;
        this.f152745n = bool;
        this.f152746o = str4;
        this.f152747p = l3;
        this.f152748q = bool2;
        this.f152749r = bool3;
        this.f152750s = bool4;
        this.f152751t = bool5;
        this.f152752u = bool6;
        this.f152753v = bool7;
    }
}
