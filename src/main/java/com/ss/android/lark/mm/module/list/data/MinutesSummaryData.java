package com.ss.android.lark.mm.module.list.data;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mm.base.IMmSerializable;
import com.ss.android.lark.mm.module.detail.baseinfo.MediaType;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001BÑ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010#J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010V\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010W\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010X\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010Y\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010Z\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010]\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010g\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010h\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010j\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010k\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0002\u0010p\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u00052\b\u0010s\u001a\u0004\u0018\u00010tHÖ\u0003J\t\u0010u\u001a\u00020\bHÖ\u0001J\u0006\u0010v\u001a\u00020\u0005J\u0006\u0010w\u001a\u00020\u0005J\u0006\u0010x\u001a\u00020\u0005J\u0010\u0010y\u001a\u00020\u00052\b\u0010s\u001a\u0004\u0018\u00010\u0000J\t\u0010z\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\"\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b'\u0010%\"\u0004\b(\u0010)R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b*\u0010%R\u001a\u0010\u001f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0006\u0010/R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0004\u0010/R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010,R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0016\u0010/R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00102\"\u0004\b5\u00106R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u001e\u0010!\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\b<\u00108\"\u0004\b=\u0010>R\u001e\u0010\"\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\b?\u00108\"\u0004\b@\u0010>R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\bE\u00108\"\u0004\bF\u0010>R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\bG\u0010%R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\bH\u0010/R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\bI\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\bJ\u00108\"\u0004\bK\u0010>R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\bL\u0010%R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\bM\u0010%\"\u0004\bN\u0010)R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00102\"\u0004\bP\u00106R\u0015\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00109\u001a\u0004\bQ\u00108R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00102¨\u0006{"}, d2 = {"Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "Lcom/ss/android/lark/mm/base/IMmSerializable;", "objectToken", "", "isLocalUnit", "", "isLocalTenant", UpdateKey.STATUS, "", "reviewStatus", "mediaType", "url", ChatTypeStateKeeper.f135670e, "videoCover", "startTime", "", "createTime", "stopTime", "duration", "shareTime", "expireTime", "showExternalTag", "isRecordingDevice", "objectType", "meetingId", "isOwner", "time", "ownerName", "ownerId", "recordingStatus", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "hasChanged", "uploadingProgress", "processingProgress", "processingStatus", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDuration", "setDuration", "(Ljava/lang/Long;)V", "getExpireTime", "getHasChanged", "()Z", "setHasChanged", "(Z)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMediaType", "()Ljava/lang/String;", "getMeetingId", "getObjectToken", "setObjectToken", "(Ljava/lang/String;)V", "getObjectType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOwnerId", "getOwnerName", "getProcessingProgress", "setProcessingProgress", "(Ljava/lang/Integer;)V", "getProcessingStatus", "setProcessingStatus", "getRecordingStatus", "()Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "setRecordingStatus", "(Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;)V", "getReviewStatus", "setReviewStatus", "getShareTime", "getShowExternalTag", "getStartTime", "getStatus", "setStatus", "getStopTime", "getTime", "setTime", "getTopic", "setTopic", "getUploadingProgress", "getUrl", "getVideoCover", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "equals", "other", "", "hashCode", "isRecordingType", "isUncompletedRecordingType", "isVideo", "same", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MinutesSummaryData implements IMmSerializable {
    @SerializedName("create_time")
    private final Long createTime;
    @SerializedName("duration")
    private Long duration;
    @SerializedName("expire_time")
    private final Long expireTime;
    private boolean hasChanged;
    @SerializedName("is_local_tenant")
    private final Boolean isLocalTenant;
    @SerializedName("is_local_unit")
    private final Boolean isLocalUnit;
    @SerializedName("is_owner")
    private final boolean isOwner;
    @SerializedName("is_recording_device")
    private final Boolean isRecordingDevice;
    @SerializedName("media_type")
    private final String mediaType;
    @SerializedName("meeting_id")
    private final String meetingId;
    @SerializedName("object_token")
    private String objectToken;
    @SerializedName("object_type")
    private final Integer objectType;
    @SerializedName("owner_id")
    private final String ownerId;
    @SerializedName("owner_name")
    private final String ownerName;
    private transient Integer processingProgress;
    private transient Integer processingStatus;
    private MmRecordManager.RecordState recordingStatus;
    @SerializedName("review_status")
    private Integer reviewStatus;
    @SerializedName("share_time")
    private final Long shareTime;
    @SerializedName("show_external_tag")
    private final Boolean showExternalTag;
    @SerializedName("start_time")
    private final Long startTime;
    @SerializedName(UpdateKey.STATUS)
    private Integer status;
    @SerializedName("stop_time")
    private final Long stopTime;
    @SerializedName("time")
    private Long time;
    @SerializedName(ChatTypeStateKeeper.f135670e)
    private String topic;
    private final Integer uploadingProgress;
    @SerializedName("url")
    private final String url;
    @SerializedName("video_cover")
    private final String videoCover;

    public MinutesSummaryData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435455, null);
    }

    public static /* synthetic */ MinutesSummaryData copy$default(MinutesSummaryData minutesSummaryData, String str, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Boolean bool3, Boolean bool4, Integer num3, String str6, boolean z, Long l7, String str7, String str8, MmRecordManager.RecordState recordState, boolean z2, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        return minutesSummaryData.copy((i & 1) != 0 ? minutesSummaryData.objectToken : str, (i & 2) != 0 ? minutesSummaryData.isLocalUnit : bool, (i & 4) != 0 ? minutesSummaryData.isLocalTenant : bool2, (i & 8) != 0 ? minutesSummaryData.status : num, (i & 16) != 0 ? minutesSummaryData.reviewStatus : num2, (i & 32) != 0 ? minutesSummaryData.mediaType : str2, (i & 64) != 0 ? minutesSummaryData.url : str3, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? minutesSummaryData.topic : str4, (i & DynamicModule.f58006b) != 0 ? minutesSummaryData.videoCover : str5, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? minutesSummaryData.startTime : l, (i & 1024) != 0 ? minutesSummaryData.createTime : l2, (i & 2048) != 0 ? minutesSummaryData.stopTime : l3, (i & 4096) != 0 ? minutesSummaryData.duration : l4, (i & 8192) != 0 ? minutesSummaryData.shareTime : l5, (i & 16384) != 0 ? minutesSummaryData.expireTime : l6, (i & 32768) != 0 ? minutesSummaryData.showExternalTag : bool3, (i & 65536) != 0 ? minutesSummaryData.isRecordingDevice : bool4, (i & 131072) != 0 ? minutesSummaryData.objectType : num3, (i & 262144) != 0 ? minutesSummaryData.meetingId : str6, (i & 524288) != 0 ? minutesSummaryData.isOwner : z, (i & 1048576) != 0 ? minutesSummaryData.time : l7, (i & 2097152) != 0 ? minutesSummaryData.ownerName : str7, (i & 4194304) != 0 ? minutesSummaryData.ownerId : str8, (i & 8388608) != 0 ? minutesSummaryData.recordingStatus : recordState, (i & 16777216) != 0 ? minutesSummaryData.hasChanged : z2, (i & 33554432) != 0 ? minutesSummaryData.uploadingProgress : num4, (i & 67108864) != 0 ? minutesSummaryData.processingProgress : num5, (i & 134217728) != 0 ? minutesSummaryData.processingStatus : num6);
    }

    public final String component1() {
        return this.objectToken;
    }

    public final Long component10() {
        return this.startTime;
    }

    public final Long component11() {
        return this.createTime;
    }

    public final Long component12() {
        return this.stopTime;
    }

    public final Long component13() {
        return this.duration;
    }

    public final Long component14() {
        return this.shareTime;
    }

    public final Long component15() {
        return this.expireTime;
    }

    public final Boolean component16() {
        return this.showExternalTag;
    }

    public final Boolean component17() {
        return this.isRecordingDevice;
    }

    public final Integer component18() {
        return this.objectType;
    }

    public final String component19() {
        return this.meetingId;
    }

    public final Boolean component2() {
        return this.isLocalUnit;
    }

    public final boolean component20() {
        return this.isOwner;
    }

    public final Long component21() {
        return this.time;
    }

    public final String component22() {
        return this.ownerName;
    }

    public final String component23() {
        return this.ownerId;
    }

    public final MmRecordManager.RecordState component24() {
        return this.recordingStatus;
    }

    public final boolean component25() {
        return this.hasChanged;
    }

    public final Integer component26() {
        return this.uploadingProgress;
    }

    public final Integer component27() {
        return this.processingProgress;
    }

    public final Integer component28() {
        return this.processingStatus;
    }

    public final Boolean component3() {
        return this.isLocalTenant;
    }

    public final Integer component4() {
        return this.status;
    }

    public final Integer component5() {
        return this.reviewStatus;
    }

    public final String component6() {
        return this.mediaType;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.topic;
    }

    public final String component9() {
        return this.videoCover;
    }

    public final MinutesSummaryData copy(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Boolean bool3, Boolean bool4, Integer num3, String str6, boolean z, Long l7, String str7, String str8, MmRecordManager.RecordState recordState, boolean z2, Integer num4, Integer num5, Integer num6) {
        return new MinutesSummaryData(str, bool, bool2, num, num2, str2, str3, str4, str5, l, l2, l3, l4, l5, l6, bool3, bool4, num3, str6, z, l7, str7, str8, recordState, z2, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinutesSummaryData)) {
            return false;
        }
        MinutesSummaryData minutesSummaryData = (MinutesSummaryData) obj;
        return Intrinsics.areEqual(this.objectToken, minutesSummaryData.objectToken) && Intrinsics.areEqual(this.isLocalUnit, minutesSummaryData.isLocalUnit) && Intrinsics.areEqual(this.isLocalTenant, minutesSummaryData.isLocalTenant) && Intrinsics.areEqual(this.status, minutesSummaryData.status) && Intrinsics.areEqual(this.reviewStatus, minutesSummaryData.reviewStatus) && Intrinsics.areEqual(this.mediaType, minutesSummaryData.mediaType) && Intrinsics.areEqual(this.url, minutesSummaryData.url) && Intrinsics.areEqual(this.topic, minutesSummaryData.topic) && Intrinsics.areEqual(this.videoCover, minutesSummaryData.videoCover) && Intrinsics.areEqual(this.startTime, minutesSummaryData.startTime) && Intrinsics.areEqual(this.createTime, minutesSummaryData.createTime) && Intrinsics.areEqual(this.stopTime, minutesSummaryData.stopTime) && Intrinsics.areEqual(this.duration, minutesSummaryData.duration) && Intrinsics.areEqual(this.shareTime, minutesSummaryData.shareTime) && Intrinsics.areEqual(this.expireTime, minutesSummaryData.expireTime) && Intrinsics.areEqual(this.showExternalTag, minutesSummaryData.showExternalTag) && Intrinsics.areEqual(this.isRecordingDevice, minutesSummaryData.isRecordingDevice) && Intrinsics.areEqual(this.objectType, minutesSummaryData.objectType) && Intrinsics.areEqual(this.meetingId, minutesSummaryData.meetingId) && this.isOwner == minutesSummaryData.isOwner && Intrinsics.areEqual(this.time, minutesSummaryData.time) && Intrinsics.areEqual(this.ownerName, minutesSummaryData.ownerName) && Intrinsics.areEqual(this.ownerId, minutesSummaryData.ownerId) && Intrinsics.areEqual(this.recordingStatus, minutesSummaryData.recordingStatus) && this.hasChanged == minutesSummaryData.hasChanged && Intrinsics.areEqual(this.uploadingProgress, minutesSummaryData.uploadingProgress) && Intrinsics.areEqual(this.processingProgress, minutesSummaryData.processingProgress) && Intrinsics.areEqual(this.processingStatus, minutesSummaryData.processingStatus);
    }

    public int hashCode() {
        String str = this.objectToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.isLocalUnit;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isLocalTenant;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.status;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.reviewStatus;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.mediaType;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.topic;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.videoCover;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Long l = this.startTime;
        int hashCode10 = (hashCode9 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.createTime;
        int hashCode11 = (hashCode10 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.stopTime;
        int hashCode12 = (hashCode11 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.duration;
        int hashCode13 = (hashCode12 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Long l5 = this.shareTime;
        int hashCode14 = (hashCode13 + (l5 != null ? l5.hashCode() : 0)) * 31;
        Long l6 = this.expireTime;
        int hashCode15 = (hashCode14 + (l6 != null ? l6.hashCode() : 0)) * 31;
        Boolean bool3 = this.showExternalTag;
        int hashCode16 = (hashCode15 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.isRecordingDevice;
        int hashCode17 = (hashCode16 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Integer num3 = this.objectType;
        int hashCode18 = (hashCode17 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str6 = this.meetingId;
        int hashCode19 = (hashCode18 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.isOwner;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode19 + i3) * 31;
        Long l7 = this.time;
        int hashCode20 = (i6 + (l7 != null ? l7.hashCode() : 0)) * 31;
        String str7 = this.ownerName;
        int hashCode21 = (hashCode20 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.ownerId;
        int hashCode22 = (hashCode21 + (str8 != null ? str8.hashCode() : 0)) * 31;
        MmRecordManager.RecordState recordState = this.recordingStatus;
        int hashCode23 = (hashCode22 + (recordState != null ? recordState.hashCode() : 0)) * 31;
        boolean z2 = this.hasChanged;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i7 = (hashCode23 + i2) * 31;
        Integer num4 = this.uploadingProgress;
        int hashCode24 = (i7 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.processingProgress;
        int hashCode25 = (hashCode24 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.processingStatus;
        if (num6 != null) {
            i = num6.hashCode();
        }
        return hashCode25 + i;
    }

    public String toString() {
        return "MinutesSummaryData(objectToken=" + this.objectToken + ", isLocalUnit=" + this.isLocalUnit + ", isLocalTenant=" + this.isLocalTenant + ", status=" + this.status + ", reviewStatus=" + this.reviewStatus + ", mediaType=" + this.mediaType + ", url=" + this.url + ", topic=" + this.topic + ", videoCover=" + this.videoCover + ", startTime=" + this.startTime + ", createTime=" + this.createTime + ", stopTime=" + this.stopTime + ", duration=" + this.duration + ", shareTime=" + this.shareTime + ", expireTime=" + this.expireTime + ", showExternalTag=" + this.showExternalTag + ", isRecordingDevice=" + this.isRecordingDevice + ", objectType=" + this.objectType + ", meetingId=" + this.meetingId + ", isOwner=" + this.isOwner + ", time=" + this.time + ", ownerName=" + this.ownerName + ", ownerId=" + this.ownerId + ", recordingStatus=" + this.recordingStatus + ", hasChanged=" + this.hasChanged + ", uploadingProgress=" + this.uploadingProgress + ", processingProgress=" + this.processingProgress + ", processingStatus=" + this.processingStatus + ")";
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Long getExpireTime() {
        return this.expireTime;
    }

    public final boolean getHasChanged() {
        return this.hasChanged;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public final String getObjectToken() {
        return this.objectToken;
    }

    public final Integer getObjectType() {
        return this.objectType;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final Integer getProcessingProgress() {
        return this.processingProgress;
    }

    public final Integer getProcessingStatus() {
        return this.processingStatus;
    }

    public final MmRecordManager.RecordState getRecordingStatus() {
        return this.recordingStatus;
    }

    public final Integer getReviewStatus() {
        return this.reviewStatus;
    }

    public final Long getShareTime() {
        return this.shareTime;
    }

    public final Boolean getShowExternalTag() {
        return this.showExternalTag;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Long getStopTime() {
        return this.stopTime;
    }

    public final Long getTime() {
        return this.time;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final Integer getUploadingProgress() {
        return this.uploadingProgress;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoCover() {
        return this.videoCover;
    }

    public final Boolean isLocalTenant() {
        return this.isLocalTenant;
    }

    public final Boolean isLocalUnit() {
        return this.isLocalUnit;
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    public final Boolean isRecordingDevice() {
        return this.isRecordingDevice;
    }

    public final boolean isVideo() {
        if (MediaType.Companion.mo161472a(this.mediaType) == MediaType.Video) {
            return true;
        }
        return false;
    }

    public final boolean isRecordingType() {
        Integer num = this.objectType;
        int i = MmBaseInfo.MMObjectType.RECORDING.value;
        if (num != null && num.intValue() == i) {
            return true;
        }
        return false;
    }

    public final boolean isUncompletedRecordingType() {
        Integer num = this.objectType;
        int i = MmBaseInfo.MMObjectType.RECORDING.value;
        if (num != null && num.intValue() == i) {
            Integer num2 = this.status;
            int value = ObjectStatus.Complete.getValue();
            if (num2 != null && num2.intValue() == value) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void setDuration(Long l) {
        this.duration = l;
    }

    public final void setHasChanged(boolean z) {
        this.hasChanged = z;
    }

    public final void setObjectToken(String str) {
        this.objectToken = str;
    }

    public final void setProcessingProgress(Integer num) {
        this.processingProgress = num;
    }

    public final void setProcessingStatus(Integer num) {
        this.processingStatus = num;
    }

    public final void setRecordingStatus(MmRecordManager.RecordState recordState) {
        this.recordingStatus = recordState;
    }

    public final void setReviewStatus(Integer num) {
        this.reviewStatus = num;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setTime(Long l) {
        this.time = l;
    }

    public final void setTopic(String str) {
        this.topic = str;
    }

    public final boolean same(MinutesSummaryData minutesSummaryData) {
        String str;
        String str2 = this.objectToken;
        if (minutesSummaryData != null) {
            str = minutesSummaryData.objectToken;
        } else {
            str = null;
        }
        return Intrinsics.areEqual(str2, str);
    }

    public MinutesSummaryData(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Boolean bool3, Boolean bool4, Integer num3, String str6, boolean z, Long l7, String str7, String str8, MmRecordManager.RecordState recordState, boolean z2, Integer num4, Integer num5, Integer num6) {
        this.objectToken = str;
        this.isLocalUnit = bool;
        this.isLocalTenant = bool2;
        this.status = num;
        this.reviewStatus = num2;
        this.mediaType = str2;
        this.url = str3;
        this.topic = str4;
        this.videoCover = str5;
        this.startTime = l;
        this.createTime = l2;
        this.stopTime = l3;
        this.duration = l4;
        this.shareTime = l5;
        this.expireTime = l6;
        this.showExternalTag = bool3;
        this.isRecordingDevice = bool4;
        this.objectType = num3;
        this.meetingId = str6;
        this.isOwner = z;
        this.time = l7;
        this.ownerName = str7;
        this.ownerId = str8;
        this.recordingStatus = recordState;
        this.hasChanged = z2;
        this.uploadingProgress = num4;
        this.processingProgress = num5;
        this.processingStatus = num6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MinutesSummaryData(java.lang.String r30, java.lang.Boolean r31, java.lang.Boolean r32, java.lang.Integer r33, java.lang.Integer r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.Long r39, java.lang.Long r40, java.lang.Long r41, java.lang.Long r42, java.lang.Long r43, java.lang.Long r44, java.lang.Boolean r45, java.lang.Boolean r46, java.lang.Integer r47, java.lang.String r48, boolean r49, java.lang.Long r50, java.lang.String r51, java.lang.String r52, com.ss.android.lark.mm.module.record.MmRecordManager.RecordState r53, boolean r54, java.lang.Integer r55, java.lang.Integer r56, java.lang.Integer r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.list.data.MinutesSummaryData.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, boolean, java.lang.Long, java.lang.String, java.lang.String, com.ss.android.lark.mm.module.record.MmRecordManager$RecordState, boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
