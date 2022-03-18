package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.VideoChatI18nDefaultTopic;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VCTabListItem extends Message<VCTabListItem, C51192a> {
    public static final ProtoAdapter<VCTabListItem> ADAPTER = new C51193b();
    public static final Boolean DEFAULT_CONTAINS_MULTIPLE_TENANT = false;
    public static final Boolean DEFAULT_IS_LOCKED = false;
    public static final VideoChatInfo.MeetingSource DEFAULT_MEETING_SOURCE = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
    public static final MeetingStatus DEFAULT_MEETING_STATUS = MeetingStatus.MEETING_UNKNOWN;
    public static final VideoChatInfo.Type DEFAULT_MEETING_TYPE = VideoChatInfo.Type.UNKNOWN;
    public static final PhoneType DEFAULT_PHONE_TYPE = PhoneType.VC;
    public static final Long DEFAULT_SORT_TIME = 0L;
    public static final Boolean DEFAULT_SUBSCRIBE_DETAIL_CHANGE = false;
    private static final long serialVersionUID = 0;
    public final Boolean contains_multiple_tenant;
    public final List<LogoType> content_logos;
    public final HistoryAbbrInfo history_abbr_info;
    public final String history_id;
    public final VideoChatI18nDefaultTopic i18n_default_topic;
    public final Boolean is_locked;
    public final String meeting_id;
    public final String meeting_number;
    public final VideoChatInfo.MeetingSource meeting_source;
    public final String meeting_start_time;
    public final MeetingStatus meeting_status;
    public final String meeting_topic;
    public final VideoChatInfo.Type meeting_type;
    public final String phone_number;
    public final PhoneType phone_type;
    public final String same_tenant_id;
    public final Long sort_time;
    public final Boolean subscribe_detail_change;
    public final String unique_id;

    public enum LogoType implements WireEnum {
        RECORD(1),
        MS_CCM(2),
        MS_URL(3),
        LARK_MINUTES(4);
        
        public static final ProtoAdapter<LogoType> ADAPTER = ProtoAdapter.newEnumAdapter(LogoType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LogoType fromValue(int i) {
            if (i == 1) {
                return RECORD;
            }
            if (i == 2) {
                return MS_CCM;
            }
            if (i == 3) {
                return MS_URL;
            }
            if (i != 4) {
                return null;
            }
            return LARK_MINUTES;
        }

        private LogoType(int i) {
            this.value = i;
        }
    }

    public enum PhoneType implements WireEnum {
        VC(0),
        OUTSIDE_ENTERPRISE_PHONE(1);
        
        public static final ProtoAdapter<PhoneType> ADAPTER = ProtoAdapter.newEnumAdapter(PhoneType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PhoneType fromValue(int i) {
            if (i == 0) {
                return VC;
            }
            if (i != 1) {
                return null;
            }
            return OUTSIDE_ENTERPRISE_PHONE;
        }

        private PhoneType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabListItem$b */
    private static final class C51193b extends ProtoAdapter<VCTabListItem> {
        C51193b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabListItem.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabListItem vCTabListItem) {
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
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18 = 0;
            if (vCTabListItem.history_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vCTabListItem.history_id);
            } else {
                i = 0;
            }
            if (vCTabListItem.meeting_topic != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, vCTabListItem.meeting_topic);
            } else {
                i2 = 0;
            }
            int i19 = i + i2;
            if (vCTabListItem.meeting_type != null) {
                i3 = VideoChatInfo.Type.ADAPTER.encodedSizeWithTag(3, vCTabListItem.meeting_type);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (vCTabListItem.meeting_source != null) {
                i4 = VideoChatInfo.MeetingSource.ADAPTER.encodedSizeWithTag(4, vCTabListItem.meeting_source);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (vCTabListItem.meeting_status != null) {
                i5 = MeetingStatus.ADAPTER.encodedSizeWithTag(5, vCTabListItem.meeting_status);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (vCTabListItem.is_locked != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, vCTabListItem.is_locked);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (vCTabListItem.history_abbr_info != null) {
                i7 = HistoryAbbrInfo.ADAPTER.encodedSizeWithTag(7, vCTabListItem.history_abbr_info);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (vCTabListItem.sort_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, vCTabListItem.sort_time);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (vCTabListItem.contains_multiple_tenant != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, vCTabListItem.contains_multiple_tenant);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (vCTabListItem.same_tenant_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, vCTabListItem.same_tenant_id);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (vCTabListItem.meeting_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, vCTabListItem.meeting_id);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (vCTabListItem.subscribe_detail_change != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(12, vCTabListItem.subscribe_detail_change);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (vCTabListItem.i18n_default_topic != null) {
                i13 = VideoChatI18nDefaultTopic.ADAPTER.encodedSizeWithTag(13, vCTabListItem.i18n_default_topic);
            } else {
                i13 = 0;
            }
            int encodedSizeWithTag = i29 + i13 + LogoType.ADAPTER.asRepeated().encodedSizeWithTag(14, vCTabListItem.content_logos);
            if (vCTabListItem.meeting_number != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, vCTabListItem.meeting_number);
            } else {
                i14 = 0;
            }
            int i30 = encodedSizeWithTag + i14;
            if (vCTabListItem.unique_id != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(16, vCTabListItem.unique_id);
            } else {
                i15 = 0;
            }
            int i31 = i30 + i15;
            if (vCTabListItem.meeting_start_time != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(17, vCTabListItem.meeting_start_time);
            } else {
                i16 = 0;
            }
            int i32 = i31 + i16;
            if (vCTabListItem.phone_type != null) {
                i17 = PhoneType.ADAPTER.encodedSizeWithTag(18, vCTabListItem.phone_type);
            } else {
                i17 = 0;
            }
            int i33 = i32 + i17;
            if (vCTabListItem.phone_number != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(19, vCTabListItem.phone_number);
            }
            return i33 + i18 + vCTabListItem.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabListItem decode(ProtoReader protoReader) throws IOException {
            C51192a aVar = new C51192a();
            aVar.f127422a = "";
            aVar.f127423b = "";
            aVar.f127424c = VideoChatInfo.Type.UNKNOWN;
            aVar.f127425d = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
            aVar.f127426e = MeetingStatus.MEETING_UNKNOWN;
            aVar.f127427f = false;
            aVar.f127429h = 0L;
            aVar.f127430i = false;
            aVar.f127431j = "";
            aVar.f127432k = "";
            aVar.f127433l = false;
            aVar.f127436o = "";
            aVar.f127437p = "";
            aVar.f127438q = "";
            aVar.f127439r = PhoneType.VC;
            aVar.f127440s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127422a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127423b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f127424c = VideoChatInfo.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f127425d = VideoChatInfo.MeetingSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f127426e = MeetingStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 6:
                            aVar.f127427f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127428g = HistoryAbbrInfo.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127429h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f127430i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127431j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f127432k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127433l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f127434m = VideoChatI18nDefaultTopic.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f127435n.add(LogoType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 15:
                            aVar.f127436o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f127437p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f127438q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            try {
                                aVar.f127439r = PhoneType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 19:
                            aVar.f127440s = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabListItem vCTabListItem) throws IOException {
            if (vCTabListItem.history_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCTabListItem.history_id);
            }
            if (vCTabListItem.meeting_topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, vCTabListItem.meeting_topic);
            }
            if (vCTabListItem.meeting_type != null) {
                VideoChatInfo.Type.ADAPTER.encodeWithTag(protoWriter, 3, vCTabListItem.meeting_type);
            }
            if (vCTabListItem.meeting_source != null) {
                VideoChatInfo.MeetingSource.ADAPTER.encodeWithTag(protoWriter, 4, vCTabListItem.meeting_source);
            }
            if (vCTabListItem.meeting_status != null) {
                MeetingStatus.ADAPTER.encodeWithTag(protoWriter, 5, vCTabListItem.meeting_status);
            }
            if (vCTabListItem.is_locked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, vCTabListItem.is_locked);
            }
            if (vCTabListItem.history_abbr_info != null) {
                HistoryAbbrInfo.ADAPTER.encodeWithTag(protoWriter, 7, vCTabListItem.history_abbr_info);
            }
            if (vCTabListItem.sort_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, vCTabListItem.sort_time);
            }
            if (vCTabListItem.contains_multiple_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, vCTabListItem.contains_multiple_tenant);
            }
            if (vCTabListItem.same_tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, vCTabListItem.same_tenant_id);
            }
            if (vCTabListItem.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, vCTabListItem.meeting_id);
            }
            if (vCTabListItem.subscribe_detail_change != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, vCTabListItem.subscribe_detail_change);
            }
            if (vCTabListItem.i18n_default_topic != null) {
                VideoChatI18nDefaultTopic.ADAPTER.encodeWithTag(protoWriter, 13, vCTabListItem.i18n_default_topic);
            }
            LogoType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, vCTabListItem.content_logos);
            if (vCTabListItem.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, vCTabListItem.meeting_number);
            }
            if (vCTabListItem.unique_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, vCTabListItem.unique_id);
            }
            if (vCTabListItem.meeting_start_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, vCTabListItem.meeting_start_time);
            }
            if (vCTabListItem.phone_type != null) {
                PhoneType.ADAPTER.encodeWithTag(protoWriter, 18, vCTabListItem.phone_type);
            }
            if (vCTabListItem.phone_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, vCTabListItem.phone_number);
            }
            protoWriter.writeBytes(vCTabListItem.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabListItem$a */
    public static final class C51192a extends Message.Builder<VCTabListItem, C51192a> {

        /* renamed from: a */
        public String f127422a;

        /* renamed from: b */
        public String f127423b;

        /* renamed from: c */
        public VideoChatInfo.Type f127424c;

        /* renamed from: d */
        public VideoChatInfo.MeetingSource f127425d;

        /* renamed from: e */
        public MeetingStatus f127426e;

        /* renamed from: f */
        public Boolean f127427f;

        /* renamed from: g */
        public HistoryAbbrInfo f127428g;

        /* renamed from: h */
        public Long f127429h;

        /* renamed from: i */
        public Boolean f127430i;

        /* renamed from: j */
        public String f127431j;

        /* renamed from: k */
        public String f127432k;

        /* renamed from: l */
        public Boolean f127433l;

        /* renamed from: m */
        public VideoChatI18nDefaultTopic f127434m;

        /* renamed from: n */
        public List<LogoType> f127435n = Internal.newMutableList();

        /* renamed from: o */
        public String f127436o;

        /* renamed from: p */
        public String f127437p;

        /* renamed from: q */
        public String f127438q;

        /* renamed from: r */
        public PhoneType f127439r;

        /* renamed from: s */
        public String f127440s;

        /* renamed from: a */
        public VCTabListItem build() {
            return new VCTabListItem(this.f127422a, this.f127423b, this.f127424c, this.f127425d, this.f127426e, this.f127427f, this.f127428g, this.f127429h, this.f127430i, this.f127431j, this.f127432k, this.f127433l, this.f127434m, this.f127435n, this.f127436o, this.f127437p, this.f127438q, this.f127439r, this.f127440s, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51192a newBuilder() {
        C51192a aVar = new C51192a();
        aVar.f127422a = this.history_id;
        aVar.f127423b = this.meeting_topic;
        aVar.f127424c = this.meeting_type;
        aVar.f127425d = this.meeting_source;
        aVar.f127426e = this.meeting_status;
        aVar.f127427f = this.is_locked;
        aVar.f127428g = this.history_abbr_info;
        aVar.f127429h = this.sort_time;
        aVar.f127430i = this.contains_multiple_tenant;
        aVar.f127431j = this.same_tenant_id;
        aVar.f127432k = this.meeting_id;
        aVar.f127433l = this.subscribe_detail_change;
        aVar.f127434m = this.i18n_default_topic;
        aVar.f127435n = Internal.copyOf("content_logos", this.content_logos);
        aVar.f127436o = this.meeting_number;
        aVar.f127437p = this.unique_id;
        aVar.f127438q = this.meeting_start_time;
        aVar.f127439r = this.phone_type;
        aVar.f127440s = this.phone_number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabListItem");
        StringBuilder sb = new StringBuilder();
        if (this.history_id != null) {
            sb.append(", history_id=");
            sb.append(this.history_id);
        }
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
        if (this.history_abbr_info != null) {
            sb.append(", history_abbr_info=");
            sb.append(this.history_abbr_info);
        }
        if (this.sort_time != null) {
            sb.append(", sort_time=");
            sb.append(this.sort_time);
        }
        if (this.contains_multiple_tenant != null) {
            sb.append(", contains_multiple_tenant=");
            sb.append(this.contains_multiple_tenant);
        }
        if (this.same_tenant_id != null) {
            sb.append(", same_tenant_id=");
            sb.append(this.same_tenant_id);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.subscribe_detail_change != null) {
            sb.append(", subscribe_detail_change=");
            sb.append(this.subscribe_detail_change);
        }
        if (this.i18n_default_topic != null) {
            sb.append(", i18n_default_topic=");
            sb.append(this.i18n_default_topic);
        }
        if (!this.content_logos.isEmpty()) {
            sb.append(", content_logos=");
            sb.append(this.content_logos);
        }
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        if (this.unique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.unique_id);
        }
        if (this.meeting_start_time != null) {
            sb.append(", meeting_start_time=");
            sb.append(this.meeting_start_time);
        }
        if (this.phone_type != null) {
            sb.append(", phone_type=");
            sb.append(this.phone_type);
        }
        if (this.phone_number != null) {
            sb.append(", phone_number=");
            sb.append(this.phone_number);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabListItem{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabListItem(String str, String str2, VideoChatInfo.Type type, VideoChatInfo.MeetingSource meetingSource, MeetingStatus meetingStatus, Boolean bool, HistoryAbbrInfo historyAbbrInfo, Long l, Boolean bool2, String str3, String str4, Boolean bool3, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, List<LogoType> list, String str5, String str6, String str7, PhoneType phoneType, String str8) {
        this(str, str2, type, meetingSource, meetingStatus, bool, historyAbbrInfo, l, bool2, str3, str4, bool3, videoChatI18nDefaultTopic, list, str5, str6, str7, phoneType, str8, ByteString.EMPTY);
    }

    public VCTabListItem(String str, String str2, VideoChatInfo.Type type, VideoChatInfo.MeetingSource meetingSource, MeetingStatus meetingStatus, Boolean bool, HistoryAbbrInfo historyAbbrInfo, Long l, Boolean bool2, String str3, String str4, Boolean bool3, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, List<LogoType> list, String str5, String str6, String str7, PhoneType phoneType, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_id = str;
        this.meeting_topic = str2;
        this.meeting_type = type;
        this.meeting_source = meetingSource;
        this.meeting_status = meetingStatus;
        this.is_locked = bool;
        this.history_abbr_info = historyAbbrInfo;
        this.sort_time = l;
        this.contains_multiple_tenant = bool2;
        this.same_tenant_id = str3;
        this.meeting_id = str4;
        this.subscribe_detail_change = bool3;
        this.i18n_default_topic = videoChatI18nDefaultTopic;
        this.content_logos = Internal.immutableCopyOf("content_logos", list);
        this.meeting_number = str5;
        this.unique_id = str6;
        this.meeting_start_time = str7;
        this.phone_type = phoneType;
        this.phone_number = str8;
    }
}
