package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.VideoChatI18nDefaultTopic;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.VcDocs;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VCMeetingAbbrInfo extends Message<VCMeetingAbbrInfo, C51162a> {
    public static final ProtoAdapter<VCMeetingAbbrInfo> ADAPTER = new C51163b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_FULL = false;
    public static final Boolean DEFAULT_IS_LIVE = false;
    public static final Boolean DEFAULT_IS_LOCKED = false;
    public static final Boolean DEFAULT_IS_NEED_REFRESH = false;
    public static final Boolean DEFAULT_IS_OPEN_LOBBY = false;
    public static final Boolean DEFAULT_IS_RECORDING = false;
    public static final Boolean DEFAULT_IS_TOPIC_MODIFIED = false;
    public static final VideoChatInfo.MeetingSource DEFAULT_MEETING_SOURCE = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
    public static final MeetingStatus DEFAULT_MEETING_STATUS = MeetingStatus.MEETING_UNKNOWN;
    public static final Long DEFAULT_SORT_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final UserAction DEFAULT_USER_ACTION = UserAction.ACTION_UNKNOWN;
    public static final VideoChatInfo.Type DEFAULT_VC_TYPE = VideoChatInfo.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final FollowStatus follow_status;
    public final String group_id;
    public final ByteviewUser host_user;
    public final VideoChatI18nDefaultTopic i18n_default_topic;
    public final Boolean is_full;
    public final Boolean is_live;
    public final Boolean is_locked;
    public final Boolean is_need_refresh;
    public final Boolean is_open_lobby;
    public final Boolean is_recording;
    public final Boolean is_topic_modified;
    public final String meeting_id;
    public final String meeting_no;
    public final VideoChatInfo.MeetingSource meeting_source;
    public final MeetingStatus meeting_status;
    public final List<VCParticipantAbbrInfo> participants;
    public final Long sort_time;
    public final ByteviewUser sponsor_user;
    public final Long start_time;
    public final String topic;
    public final Long update_time;
    public final UserAction user_action;
    public final VideoChatInfo.Type vc_type;

    public enum MeetingStatus implements WireEnum {
        MEETING_UNKNOWN(0),
        MEETING_CALLING(1),
        MEETING_ON_THE_CALL(2),
        MEETING_END(3);
        
        public static final ProtoAdapter<MeetingStatus> ADAPTER = ProtoAdapter.newEnumAdapter(MeetingStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MeetingStatus fromValue(int i) {
            if (i == 0) {
                return MEETING_UNKNOWN;
            }
            if (i == 1) {
                return MEETING_CALLING;
            }
            if (i == 2) {
                return MEETING_ON_THE_CALL;
            }
            if (i != 3) {
                return null;
            }
            return MEETING_END;
        }

        private MeetingStatus(int i) {
            this.value = i;
        }
    }

    public enum UserAction implements WireEnum {
        ACTION_UNKNOWN(0),
        USER_LEAVE(1),
        USER_NOTACCEPT(2),
        USER_REFUSE(3),
        USER_CANCEL(4),
        USER_NO_ANSWER(5);
        
        public static final ProtoAdapter<UserAction> ADAPTER = ProtoAdapter.newEnumAdapter(UserAction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UserAction fromValue(int i) {
            if (i == 0) {
                return ACTION_UNKNOWN;
            }
            if (i == 1) {
                return USER_LEAVE;
            }
            if (i == 2) {
                return USER_NOTACCEPT;
            }
            if (i == 3) {
                return USER_REFUSE;
            }
            if (i == 4) {
                return USER_CANCEL;
            }
            if (i != 5) {
                return null;
            }
            return USER_NO_ANSWER;
        }

        private UserAction(int i) {
            this.value = i;
        }
    }

    public static final class FollowStatus extends Message<FollowStatus, C51160a> {
        public static final ProtoAdapter<FollowStatus> ADAPTER = new C51161b();
        public static final VcDocs.DocType DEFAULT_DOC_TYPE = VcDocs.DocType.UNKNOWN_DOC_TYPE;
        private static final long serialVersionUID = 0;
        public final String doc_token;
        public final VcDocs.DocType doc_type;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCMeetingAbbrInfo$FollowStatus$b */
        private static final class C51161b extends ProtoAdapter<FollowStatus> {
            C51161b() {
                super(FieldEncoding.LENGTH_DELIMITED, FollowStatus.class);
            }

            /* renamed from: a */
            public int encodedSize(FollowStatus followStatus) {
                int i;
                int i2 = 0;
                if (followStatus.doc_token != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, followStatus.doc_token);
                } else {
                    i = 0;
                }
                if (followStatus.doc_type != null) {
                    i2 = VcDocs.DocType.ADAPTER.encodedSizeWithTag(2, followStatus.doc_type);
                }
                return i + i2 + followStatus.unknownFields().size();
            }

            /* renamed from: a */
            public FollowStatus decode(ProtoReader protoReader) throws IOException {
                C51160a aVar = new C51160a();
                aVar.f127311a = "";
                aVar.f127312b = VcDocs.DocType.UNKNOWN_DOC_TYPE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127311a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f127312b = VcDocs.DocType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FollowStatus followStatus) throws IOException {
                if (followStatus.doc_token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followStatus.doc_token);
                }
                if (followStatus.doc_type != null) {
                    VcDocs.DocType.ADAPTER.encodeWithTag(protoWriter, 2, followStatus.doc_type);
                }
                protoWriter.writeBytes(followStatus.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCMeetingAbbrInfo$FollowStatus$a */
        public static final class C51160a extends Message.Builder<FollowStatus, C51160a> {

            /* renamed from: a */
            public String f127311a;

            /* renamed from: b */
            public VcDocs.DocType f127312b;

            /* renamed from: a */
            public FollowStatus build() {
                return new FollowStatus(this.f127311a, this.f127312b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51160a newBuilder() {
            C51160a aVar = new C51160a();
            aVar.f127311a = this.doc_token;
            aVar.f127312b = this.doc_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "FollowStatus");
            StringBuilder sb = new StringBuilder();
            if (this.doc_token != null) {
                sb.append(", doc_token=");
                sb.append(this.doc_token);
            }
            if (this.doc_type != null) {
                sb.append(", doc_type=");
                sb.append(this.doc_type);
            }
            StringBuilder replace = sb.replace(0, 2, "FollowStatus{");
            replace.append('}');
            return replace.toString();
        }

        public FollowStatus(String str, VcDocs.DocType docType) {
            this(str, docType, ByteString.EMPTY);
        }

        public FollowStatus(String str, VcDocs.DocType docType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.doc_token = str;
            this.doc_type = docType;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCMeetingAbbrInfo$b */
    private static final class C51163b extends ProtoAdapter<VCMeetingAbbrInfo> {
        C51163b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCMeetingAbbrInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCMeetingAbbrInfo vCMeetingAbbrInfo) {
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
            int i18;
            int i19;
            int i20;
            int i21;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, vCMeetingAbbrInfo.meeting_id);
            int i22 = 0;
            if (vCMeetingAbbrInfo.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, vCMeetingAbbrInfo.topic);
            } else {
                i = 0;
            }
            int i23 = encodedSizeWithTag + i;
            if (vCMeetingAbbrInfo.start_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, vCMeetingAbbrInfo.start_time);
            } else {
                i2 = 0;
            }
            int i24 = i23 + i2;
            if (vCMeetingAbbrInfo.end_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, vCMeetingAbbrInfo.end_time);
            } else {
                i3 = 0;
            }
            int i25 = i24 + i3;
            if (vCMeetingAbbrInfo.host_user != null) {
                i4 = ByteviewUser.ADAPTER.encodedSizeWithTag(5, vCMeetingAbbrInfo.host_user);
            } else {
                i4 = 0;
            }
            int i26 = i25 + i4;
            if (vCMeetingAbbrInfo.meeting_source != null) {
                i5 = VideoChatInfo.MeetingSource.ADAPTER.encodedSizeWithTag(6, vCMeetingAbbrInfo.meeting_source);
            } else {
                i5 = 0;
            }
            int i27 = i26 + i5;
            if (vCMeetingAbbrInfo.vc_type != null) {
                i6 = VideoChatInfo.Type.ADAPTER.encodedSizeWithTag(7, vCMeetingAbbrInfo.vc_type);
            } else {
                i6 = 0;
            }
            int i28 = i27 + i6;
            if (vCMeetingAbbrInfo.meeting_status != null) {
                i7 = MeetingStatus.ADAPTER.encodedSizeWithTag(8, vCMeetingAbbrInfo.meeting_status);
            } else {
                i7 = 0;
            }
            int i29 = i28 + i7;
            if (vCMeetingAbbrInfo.meeting_no != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, vCMeetingAbbrInfo.meeting_no);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag2 = i29 + i8 + VCParticipantAbbrInfo.ADAPTER.asRepeated().encodedSizeWithTag(10, vCMeetingAbbrInfo.participants);
            if (vCMeetingAbbrInfo.user_action != null) {
                i9 = UserAction.ADAPTER.encodedSizeWithTag(11, vCMeetingAbbrInfo.user_action);
            } else {
                i9 = 0;
            }
            int i30 = encodedSizeWithTag2 + i9;
            if (vCMeetingAbbrInfo.update_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(12, vCMeetingAbbrInfo.update_time);
            } else {
                i10 = 0;
            }
            int i31 = i30 + i10;
            if (vCMeetingAbbrInfo.follow_status != null) {
                i11 = FollowStatus.ADAPTER.encodedSizeWithTag(13, vCMeetingAbbrInfo.follow_status);
            } else {
                i11 = 0;
            }
            int i32 = i31 + i11;
            if (vCMeetingAbbrInfo.is_need_refresh != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, vCMeetingAbbrInfo.is_need_refresh);
            } else {
                i12 = 0;
            }
            int i33 = i32 + i12;
            if (vCMeetingAbbrInfo.group_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(15, vCMeetingAbbrInfo.group_id);
            } else {
                i13 = 0;
            }
            int i34 = i33 + i13;
            if (vCMeetingAbbrInfo.sort_time != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(16, vCMeetingAbbrInfo.sort_time);
            } else {
                i14 = 0;
            }
            int i35 = i34 + i14;
            if (vCMeetingAbbrInfo.is_full != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(18, vCMeetingAbbrInfo.is_full);
            } else {
                i15 = 0;
            }
            int i36 = i35 + i15;
            if (vCMeetingAbbrInfo.is_locked != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(19, vCMeetingAbbrInfo.is_locked);
            } else {
                i16 = 0;
            }
            int i37 = i36 + i16;
            if (vCMeetingAbbrInfo.is_live != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(20, vCMeetingAbbrInfo.is_live);
            } else {
                i17 = 0;
            }
            int i38 = i37 + i17;
            if (vCMeetingAbbrInfo.is_recording != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(21, vCMeetingAbbrInfo.is_recording);
            } else {
                i18 = 0;
            }
            int i39 = i38 + i18;
            if (vCMeetingAbbrInfo.sponsor_user != null) {
                i19 = ByteviewUser.ADAPTER.encodedSizeWithTag(23, vCMeetingAbbrInfo.sponsor_user);
            } else {
                i19 = 0;
            }
            int i40 = i39 + i19;
            if (vCMeetingAbbrInfo.is_topic_modified != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(24, vCMeetingAbbrInfo.is_topic_modified);
            } else {
                i20 = 0;
            }
            int i41 = i40 + i20;
            if (vCMeetingAbbrInfo.i18n_default_topic != null) {
                i21 = VideoChatI18nDefaultTopic.ADAPTER.encodedSizeWithTag(26, vCMeetingAbbrInfo.i18n_default_topic);
            } else {
                i21 = 0;
            }
            int i42 = i41 + i21;
            if (vCMeetingAbbrInfo.is_open_lobby != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(27, vCMeetingAbbrInfo.is_open_lobby);
            }
            return i42 + i22 + vCMeetingAbbrInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCMeetingAbbrInfo decode(ProtoReader protoReader) throws IOException {
            C51162a aVar = new C51162a();
            aVar.f127313a = "";
            aVar.f127314b = "";
            aVar.f127315c = 0L;
            aVar.f127316d = 0L;
            aVar.f127318f = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
            aVar.f127319g = VideoChatInfo.Type.UNKNOWN;
            aVar.f127320h = MeetingStatus.MEETING_UNKNOWN;
            aVar.f127321i = "";
            aVar.f127323k = UserAction.ACTION_UNKNOWN;
            aVar.f127324l = 0L;
            aVar.f127326n = false;
            aVar.f127327o = "";
            aVar.f127328p = 0L;
            aVar.f127329q = false;
            aVar.f127330r = false;
            aVar.f127331s = false;
            aVar.f127332t = false;
            aVar.f127334v = false;
            aVar.f127336x = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127313a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127314b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127315c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127316d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127317e = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f127318f = VideoChatInfo.MeetingSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            try {
                                aVar.f127319g = VideoChatInfo.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 8:
                            try {
                                aVar.f127320h = MeetingStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 9:
                            aVar.f127321i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127322j.add(VCParticipantAbbrInfo.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            try {
                                aVar.f127323k = UserAction.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127324l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f127325m = FollowStatus.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            aVar.f127326n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f127327o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f127328p = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 17:
                        case 22:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 18:
                            aVar.f127329q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f127330r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f127331s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            aVar.f127332t = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f127333u = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 24:
                            aVar.f127334v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            aVar.f127335w = VideoChatI18nDefaultTopic.ADAPTER.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f127336x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCMeetingAbbrInfo vCMeetingAbbrInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCMeetingAbbrInfo.meeting_id);
            if (vCMeetingAbbrInfo.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, vCMeetingAbbrInfo.topic);
            }
            if (vCMeetingAbbrInfo.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, vCMeetingAbbrInfo.start_time);
            }
            if (vCMeetingAbbrInfo.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, vCMeetingAbbrInfo.end_time);
            }
            if (vCMeetingAbbrInfo.host_user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 5, vCMeetingAbbrInfo.host_user);
            }
            if (vCMeetingAbbrInfo.meeting_source != null) {
                VideoChatInfo.MeetingSource.ADAPTER.encodeWithTag(protoWriter, 6, vCMeetingAbbrInfo.meeting_source);
            }
            if (vCMeetingAbbrInfo.vc_type != null) {
                VideoChatInfo.Type.ADAPTER.encodeWithTag(protoWriter, 7, vCMeetingAbbrInfo.vc_type);
            }
            if (vCMeetingAbbrInfo.meeting_status != null) {
                MeetingStatus.ADAPTER.encodeWithTag(protoWriter, 8, vCMeetingAbbrInfo.meeting_status);
            }
            if (vCMeetingAbbrInfo.meeting_no != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, vCMeetingAbbrInfo.meeting_no);
            }
            VCParticipantAbbrInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, vCMeetingAbbrInfo.participants);
            if (vCMeetingAbbrInfo.user_action != null) {
                UserAction.ADAPTER.encodeWithTag(protoWriter, 11, vCMeetingAbbrInfo.user_action);
            }
            if (vCMeetingAbbrInfo.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, vCMeetingAbbrInfo.update_time);
            }
            if (vCMeetingAbbrInfo.follow_status != null) {
                FollowStatus.ADAPTER.encodeWithTag(protoWriter, 13, vCMeetingAbbrInfo.follow_status);
            }
            if (vCMeetingAbbrInfo.is_need_refresh != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, vCMeetingAbbrInfo.is_need_refresh);
            }
            if (vCMeetingAbbrInfo.group_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, vCMeetingAbbrInfo.group_id);
            }
            if (vCMeetingAbbrInfo.sort_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 16, vCMeetingAbbrInfo.sort_time);
            }
            if (vCMeetingAbbrInfo.is_full != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, vCMeetingAbbrInfo.is_full);
            }
            if (vCMeetingAbbrInfo.is_locked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, vCMeetingAbbrInfo.is_locked);
            }
            if (vCMeetingAbbrInfo.is_live != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, vCMeetingAbbrInfo.is_live);
            }
            if (vCMeetingAbbrInfo.is_recording != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, vCMeetingAbbrInfo.is_recording);
            }
            if (vCMeetingAbbrInfo.sponsor_user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 23, vCMeetingAbbrInfo.sponsor_user);
            }
            if (vCMeetingAbbrInfo.is_topic_modified != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, vCMeetingAbbrInfo.is_topic_modified);
            }
            if (vCMeetingAbbrInfo.i18n_default_topic != null) {
                VideoChatI18nDefaultTopic.ADAPTER.encodeWithTag(protoWriter, 26, vCMeetingAbbrInfo.i18n_default_topic);
            }
            if (vCMeetingAbbrInfo.is_open_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, vCMeetingAbbrInfo.is_open_lobby);
            }
            protoWriter.writeBytes(vCMeetingAbbrInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCMeetingAbbrInfo$a */
    public static final class C51162a extends Message.Builder<VCMeetingAbbrInfo, C51162a> {

        /* renamed from: a */
        public String f127313a;

        /* renamed from: b */
        public String f127314b;

        /* renamed from: c */
        public Long f127315c;

        /* renamed from: d */
        public Long f127316d;

        /* renamed from: e */
        public ByteviewUser f127317e;

        /* renamed from: f */
        public VideoChatInfo.MeetingSource f127318f;

        /* renamed from: g */
        public VideoChatInfo.Type f127319g;

        /* renamed from: h */
        public MeetingStatus f127320h;

        /* renamed from: i */
        public String f127321i;

        /* renamed from: j */
        public List<VCParticipantAbbrInfo> f127322j = Internal.newMutableList();

        /* renamed from: k */
        public UserAction f127323k;

        /* renamed from: l */
        public Long f127324l;

        /* renamed from: m */
        public FollowStatus f127325m;

        /* renamed from: n */
        public Boolean f127326n;

        /* renamed from: o */
        public String f127327o;

        /* renamed from: p */
        public Long f127328p;

        /* renamed from: q */
        public Boolean f127329q;

        /* renamed from: r */
        public Boolean f127330r;

        /* renamed from: s */
        public Boolean f127331s;

        /* renamed from: t */
        public Boolean f127332t;

        /* renamed from: u */
        public ByteviewUser f127333u;

        /* renamed from: v */
        public Boolean f127334v;

        /* renamed from: w */
        public VideoChatI18nDefaultTopic f127335w;

        /* renamed from: x */
        public Boolean f127336x;

        /* renamed from: a */
        public VCMeetingAbbrInfo build() {
            String str = this.f127313a;
            if (str != null) {
                return new VCMeetingAbbrInfo(str, this.f127314b, this.f127315c, this.f127316d, this.f127317e, this.f127318f, this.f127319g, this.f127320h, this.f127321i, this.f127322j, this.f127323k, this.f127324l, this.f127325m, this.f127326n, this.f127327o, this.f127328p, this.f127329q, this.f127330r, this.f127331s, this.f127332t, this.f127333u, this.f127334v, this.f127335w, this.f127336x, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C51162a newBuilder() {
        C51162a aVar = new C51162a();
        aVar.f127313a = this.meeting_id;
        aVar.f127314b = this.topic;
        aVar.f127315c = this.start_time;
        aVar.f127316d = this.end_time;
        aVar.f127317e = this.host_user;
        aVar.f127318f = this.meeting_source;
        aVar.f127319g = this.vc_type;
        aVar.f127320h = this.meeting_status;
        aVar.f127321i = this.meeting_no;
        aVar.f127322j = Internal.copyOf("participants", this.participants);
        aVar.f127323k = this.user_action;
        aVar.f127324l = this.update_time;
        aVar.f127325m = this.follow_status;
        aVar.f127326n = this.is_need_refresh;
        aVar.f127327o = this.group_id;
        aVar.f127328p = this.sort_time;
        aVar.f127329q = this.is_full;
        aVar.f127330r = this.is_locked;
        aVar.f127331s = this.is_live;
        aVar.f127332t = this.is_recording;
        aVar.f127333u = this.sponsor_user;
        aVar.f127334v = this.is_topic_modified;
        aVar.f127335w = this.i18n_default_topic;
        aVar.f127336x = this.is_open_lobby;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCMeetingAbbrInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
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
        if (this.meeting_source != null) {
            sb.append(", meeting_source=");
            sb.append(this.meeting_source);
        }
        if (this.vc_type != null) {
            sb.append(", vc_type=");
            sb.append(this.vc_type);
        }
        if (this.meeting_status != null) {
            sb.append(", meeting_status=");
            sb.append(this.meeting_status);
        }
        if (this.meeting_no != null) {
            sb.append(", meeting_no=");
            sb.append(this.meeting_no);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.user_action != null) {
            sb.append(", user_action=");
            sb.append(this.user_action);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.follow_status != null) {
            sb.append(", follow_status=");
            sb.append(this.follow_status);
        }
        if (this.is_need_refresh != null) {
            sb.append(", is_need_refresh=");
            sb.append(this.is_need_refresh);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.sort_time != null) {
            sb.append(", sort_time=");
            sb.append(this.sort_time);
        }
        if (this.is_full != null) {
            sb.append(", is_full=");
            sb.append(this.is_full);
        }
        if (this.is_locked != null) {
            sb.append(", is_locked=");
            sb.append(this.is_locked);
        }
        if (this.is_live != null) {
            sb.append(", is_live=");
            sb.append(this.is_live);
        }
        if (this.is_recording != null) {
            sb.append(", is_recording=");
            sb.append(this.is_recording);
        }
        if (this.sponsor_user != null) {
            sb.append(", sponsor_user=");
            sb.append(this.sponsor_user);
        }
        if (this.is_topic_modified != null) {
            sb.append(", is_topic_modified=");
            sb.append(this.is_topic_modified);
        }
        if (this.i18n_default_topic != null) {
            sb.append(", i18n_default_topic=");
            sb.append(this.i18n_default_topic);
        }
        if (this.is_open_lobby != null) {
            sb.append(", is_open_lobby=");
            sb.append(this.is_open_lobby);
        }
        StringBuilder replace = sb.replace(0, 2, "VCMeetingAbbrInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCMeetingAbbrInfo(String str, String str2, Long l, Long l2, ByteviewUser byteviewUser, VideoChatInfo.MeetingSource meetingSource, VideoChatInfo.Type type, MeetingStatus meetingStatus, String str3, List<VCParticipantAbbrInfo> list, UserAction userAction, Long l3, FollowStatus followStatus, Boolean bool, String str4, Long l4, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteviewUser byteviewUser2, Boolean bool6, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, Boolean bool7) {
        this(str, str2, l, l2, byteviewUser, meetingSource, type, meetingStatus, str3, list, userAction, l3, followStatus, bool, str4, l4, bool2, bool3, bool4, bool5, byteviewUser2, bool6, videoChatI18nDefaultTopic, bool7, ByteString.EMPTY);
    }

    public VCMeetingAbbrInfo(String str, String str2, Long l, Long l2, ByteviewUser byteviewUser, VideoChatInfo.MeetingSource meetingSource, VideoChatInfo.Type type, MeetingStatus meetingStatus, String str3, List<VCParticipantAbbrInfo> list, UserAction userAction, Long l3, FollowStatus followStatus, Boolean bool, String str4, Long l4, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteviewUser byteviewUser2, Boolean bool6, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, Boolean bool7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.topic = str2;
        this.start_time = l;
        this.end_time = l2;
        this.host_user = byteviewUser;
        this.meeting_source = meetingSource;
        this.vc_type = type;
        this.meeting_status = meetingStatus;
        this.meeting_no = str3;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.user_action = userAction;
        this.update_time = l3;
        this.follow_status = followStatus;
        this.is_need_refresh = bool;
        this.group_id = str4;
        this.sort_time = l4;
        this.is_full = bool2;
        this.is_locked = bool3;
        this.is_live = bool4;
        this.is_recording = bool5;
        this.sponsor_user = byteviewUser2;
        this.is_topic_modified = bool6;
        this.i18n_default_topic = videoChatI18nDefaultTopic;
        this.is_open_lobby = bool7;
    }
}
