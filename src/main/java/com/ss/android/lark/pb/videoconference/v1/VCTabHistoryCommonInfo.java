package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.VideoChatI18nDefaultTopic;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import java.io.IOException;
import okio.ByteString;

public final class VCTabHistoryCommonInfo extends Message<VCTabHistoryCommonInfo, C51188a> {
    public static final ProtoAdapter<VCTabHistoryCommonInfo> ADAPTER = new C51189b();
    public static final Boolean DEFAULT_CONTAINS_MULTIPLE_TENANT = false;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_LOCKED = false;
    public static final Boolean DEFAULT_IS_RECORDED = false;
    public static final VideoChatInfo.MeetingSource DEFAULT_MEETING_SOURCE = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
    public static final MeetingStatus DEFAULT_MEETING_STATUS = MeetingStatus.MEETING_UNKNOWN;
    public static final VideoChatInfo.Type DEFAULT_MEETING_TYPE = VideoChatInfo.Type.UNKNOWN;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean contains_multiple_tenant;
    public final Long end_time;
    public final ByteviewUser host_user;
    public final VideoChatI18nDefaultTopic i18n_default_topic;
    public final Boolean is_locked;
    public final Boolean is_recorded;
    public final VideoChatInfo.MeetingSource meeting_source;
    public final MeetingStatus meeting_status;
    public final String meeting_topic;
    public final VideoChatInfo.Type meeting_type;
    public final String same_tenant_id;
    public final Long start_time;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabHistoryCommonInfo$b */
    private static final class C51189b extends ProtoAdapter<VCTabHistoryCommonInfo> {
        C51189b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabHistoryCommonInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabHistoryCommonInfo vCTabHistoryCommonInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = 0;
            if (vCTabHistoryCommonInfo.meeting_topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vCTabHistoryCommonInfo.meeting_topic);
            } else {
                i = 0;
            }
            if (vCTabHistoryCommonInfo.meeting_type != null) {
                i2 = VideoChatInfo.Type.ADAPTER.encodedSizeWithTag(2, vCTabHistoryCommonInfo.meeting_type);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (vCTabHistoryCommonInfo.meeting_source != null) {
                i3 = VideoChatInfo.MeetingSource.ADAPTER.encodedSizeWithTag(3, vCTabHistoryCommonInfo.meeting_source);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (vCTabHistoryCommonInfo.meeting_status != null) {
                i4 = MeetingStatus.ADAPTER.encodedSizeWithTag(4, vCTabHistoryCommonInfo.meeting_status);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (vCTabHistoryCommonInfo.is_locked != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, vCTabHistoryCommonInfo.is_locked);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (vCTabHistoryCommonInfo.contains_multiple_tenant != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, vCTabHistoryCommonInfo.contains_multiple_tenant);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (vCTabHistoryCommonInfo.same_tenant_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, vCTabHistoryCommonInfo.same_tenant_id);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (vCTabHistoryCommonInfo.start_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, vCTabHistoryCommonInfo.start_time);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (vCTabHistoryCommonInfo.end_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, vCTabHistoryCommonInfo.end_time);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (vCTabHistoryCommonInfo.host_user != null) {
                i10 = ByteviewUser.ADAPTER.encodedSizeWithTag(10, vCTabHistoryCommonInfo.host_user);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (vCTabHistoryCommonInfo.is_recorded != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, vCTabHistoryCommonInfo.is_recorded);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (vCTabHistoryCommonInfo.i18n_default_topic != null) {
                i12 = VideoChatI18nDefaultTopic.ADAPTER.encodedSizeWithTag(13, vCTabHistoryCommonInfo.i18n_default_topic);
            }
            return i22 + i12 + vCTabHistoryCommonInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabHistoryCommonInfo decode(ProtoReader protoReader) throws IOException {
            C51188a aVar = new C51188a();
            aVar.f127401a = "";
            aVar.f127402b = VideoChatInfo.Type.UNKNOWN;
            aVar.f127403c = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
            aVar.f127404d = MeetingStatus.MEETING_UNKNOWN;
            aVar.f127405e = false;
            aVar.f127406f = false;
            aVar.f127407g = "";
            aVar.f127408h = 0L;
            aVar.f127409i = 0L;
            aVar.f127411k = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127401a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f127402b = VideoChatInfo.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f127403c = VideoChatInfo.MeetingSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f127404d = MeetingStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 5:
                            aVar.f127405e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127406f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127407g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127408h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f127409i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127410j = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f127411k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 13:
                            aVar.f127412l = VideoChatI18nDefaultTopic.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabHistoryCommonInfo vCTabHistoryCommonInfo) throws IOException {
            if (vCTabHistoryCommonInfo.meeting_topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCTabHistoryCommonInfo.meeting_topic);
            }
            if (vCTabHistoryCommonInfo.meeting_type != null) {
                VideoChatInfo.Type.ADAPTER.encodeWithTag(protoWriter, 2, vCTabHistoryCommonInfo.meeting_type);
            }
            if (vCTabHistoryCommonInfo.meeting_source != null) {
                VideoChatInfo.MeetingSource.ADAPTER.encodeWithTag(protoWriter, 3, vCTabHistoryCommonInfo.meeting_source);
            }
            if (vCTabHistoryCommonInfo.meeting_status != null) {
                MeetingStatus.ADAPTER.encodeWithTag(protoWriter, 4, vCTabHistoryCommonInfo.meeting_status);
            }
            if (vCTabHistoryCommonInfo.is_locked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, vCTabHistoryCommonInfo.is_locked);
            }
            if (vCTabHistoryCommonInfo.contains_multiple_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, vCTabHistoryCommonInfo.contains_multiple_tenant);
            }
            if (vCTabHistoryCommonInfo.same_tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, vCTabHistoryCommonInfo.same_tenant_id);
            }
            if (vCTabHistoryCommonInfo.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, vCTabHistoryCommonInfo.start_time);
            }
            if (vCTabHistoryCommonInfo.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, vCTabHistoryCommonInfo.end_time);
            }
            if (vCTabHistoryCommonInfo.host_user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 10, vCTabHistoryCommonInfo.host_user);
            }
            if (vCTabHistoryCommonInfo.is_recorded != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, vCTabHistoryCommonInfo.is_recorded);
            }
            if (vCTabHistoryCommonInfo.i18n_default_topic != null) {
                VideoChatI18nDefaultTopic.ADAPTER.encodeWithTag(protoWriter, 13, vCTabHistoryCommonInfo.i18n_default_topic);
            }
            protoWriter.writeBytes(vCTabHistoryCommonInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabHistoryCommonInfo$a */
    public static final class C51188a extends Message.Builder<VCTabHistoryCommonInfo, C51188a> {

        /* renamed from: a */
        public String f127401a;

        /* renamed from: b */
        public VideoChatInfo.Type f127402b;

        /* renamed from: c */
        public VideoChatInfo.MeetingSource f127403c;

        /* renamed from: d */
        public MeetingStatus f127404d;

        /* renamed from: e */
        public Boolean f127405e;

        /* renamed from: f */
        public Boolean f127406f;

        /* renamed from: g */
        public String f127407g;

        /* renamed from: h */
        public Long f127408h;

        /* renamed from: i */
        public Long f127409i;

        /* renamed from: j */
        public ByteviewUser f127410j;

        /* renamed from: k */
        public Boolean f127411k;

        /* renamed from: l */
        public VideoChatI18nDefaultTopic f127412l;

        /* renamed from: a */
        public VCTabHistoryCommonInfo build() {
            return new VCTabHistoryCommonInfo(this.f127401a, this.f127402b, this.f127403c, this.f127404d, this.f127405e, this.f127406f, this.f127407g, this.f127408h, this.f127409i, this.f127410j, this.f127411k, this.f127412l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51188a newBuilder() {
        C51188a aVar = new C51188a();
        aVar.f127401a = this.meeting_topic;
        aVar.f127402b = this.meeting_type;
        aVar.f127403c = this.meeting_source;
        aVar.f127404d = this.meeting_status;
        aVar.f127405e = this.is_locked;
        aVar.f127406f = this.contains_multiple_tenant;
        aVar.f127407g = this.same_tenant_id;
        aVar.f127408h = this.start_time;
        aVar.f127409i = this.end_time;
        aVar.f127410j = this.host_user;
        aVar.f127411k = this.is_recorded;
        aVar.f127412l = this.i18n_default_topic;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabHistoryCommonInfo");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_topic != null) {
            sb.append(", meeting_topic=");
            sb.append(this.meeting_topic);
        }
        if (this.meeting_type != null) {
            sb.append(", meeting_type=");
            sb.append(this.meeting_type);
        }
        if (this.meeting_source != null) {
            sb.append(", meeting_source=");
            sb.append(this.meeting_source);
        }
        if (this.meeting_status != null) {
            sb.append(", meeting_status=");
            sb.append(this.meeting_status);
        }
        if (this.is_locked != null) {
            sb.append(", is_locked=");
            sb.append(this.is_locked);
        }
        if (this.contains_multiple_tenant != null) {
            sb.append(", contains_multiple_tenant=");
            sb.append(this.contains_multiple_tenant);
        }
        if (this.same_tenant_id != null) {
            sb.append(", same_tenant_id=");
            sb.append(this.same_tenant_id);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.host_user != null) {
            sb.append(", host_user=");
            sb.append(this.host_user);
        }
        if (this.is_recorded != null) {
            sb.append(", is_recorded=");
            sb.append(this.is_recorded);
        }
        if (this.i18n_default_topic != null) {
            sb.append(", i18n_default_topic=");
            sb.append(this.i18n_default_topic);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabHistoryCommonInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabHistoryCommonInfo(String str, VideoChatInfo.Type type, VideoChatInfo.MeetingSource meetingSource, MeetingStatus meetingStatus, Boolean bool, Boolean bool2, String str2, Long l, Long l2, ByteviewUser byteviewUser, Boolean bool3, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic) {
        this(str, type, meetingSource, meetingStatus, bool, bool2, str2, l, l2, byteviewUser, bool3, videoChatI18nDefaultTopic, ByteString.EMPTY);
    }

    public VCTabHistoryCommonInfo(String str, VideoChatInfo.Type type, VideoChatInfo.MeetingSource meetingSource, MeetingStatus meetingStatus, Boolean bool, Boolean bool2, String str2, Long l, Long l2, ByteviewUser byteviewUser, Boolean bool3, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_topic = str;
        this.meeting_type = type;
        this.meeting_source = meetingSource;
        this.meeting_status = meetingStatus;
        this.is_locked = bool;
        this.contains_multiple_tenant = bool2;
        this.same_tenant_id = str2;
        this.start_time = l;
        this.end_time = l2;
        this.host_user = byteviewUser;
        this.is_recorded = bool3;
        this.i18n_default_topic = videoChatI18nDefaultTopic;
    }
}
