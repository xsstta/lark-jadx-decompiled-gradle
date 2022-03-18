package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.InMeetingData;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatInMeetingInfo extends Message<VideoChatInMeetingInfo, C51244a> {
    public static final ProtoAdapter<VideoChatInMeetingInfo> ADAPTER = new C51245b();
    public static final Boolean DEFAULT_HAS_RECORDED = false;
    public static final ParticipantType DEFAULT_HOST_TYPE = ParticipantType.LARK_USER;
    public static final Boolean DEFAULT_IS_RECORDING = false;
    public static final Boolean DEFAULT_IS_SUBTITLE_ON = false;
    public static final Boolean DEFAULT_SHOULD_PULL_SUGGESTED = false;
    public static final VideoChatInfo.Type DEFAULT_VC_TYPE = VideoChatInfo.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<BreakoutRoomInfo> breakout_room_infos;
    public final List<FollowAction> follow_actions;
    public final FollowInfo follow_info;
    public final Boolean has_recorded;
    public final String host_device_id;
    public final String host_id;
    public final ParticipantType host_type;
    public final String id;
    public final List<Participant> in_meeting_participants;
    public final InterviewCodingData interview_coding_data;
    public final Boolean is_recording;
    public final Boolean is_subtitle_on;
    public final InMeetingData.LiveMeetingData.LiveInfo live_info;
    public final VideoChatSettings meeting_settings;
    public final String meeting_url;
    public final MinutesStatusData minutes_status_data;
    public final List<Participant> others_participants;
    public final List<Participant> participants;
    public final InMeetingData.RecordMeetingData recording_data;
    public final I18nKeyInfo recording_hover;
    public final InMeetingData.ScreenSharedData share_screen_in_meeting_info;
    public final String share_screen_user_device_id;
    public final String share_screen_user_id;
    public final Boolean should_pull_suggested;
    public final VideoChatInfo.Type vc_type;
    public final String version;
    public final List<WhiteboardData> whiteboard_data;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatInMeetingInfo$b */
    private static final class C51245b extends ProtoAdapter<VideoChatInMeetingInfo> {
        C51245b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatInMeetingInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatInMeetingInfo videoChatInMeetingInfo) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatInMeetingInfo.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoChatInMeetingInfo.host_id);
            int i19 = 0;
            if (videoChatInMeetingInfo.version != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, videoChatInMeetingInfo.version);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + Participant.ADAPTER.asRepeated().encodedSizeWithTag(4, videoChatInMeetingInfo.participants);
            if (videoChatInMeetingInfo.meeting_settings != null) {
                i2 = VideoChatSettings.ADAPTER.encodedSizeWithTag(5, videoChatInMeetingInfo.meeting_settings);
            } else {
                i2 = 0;
            }
            int i20 = encodedSizeWithTag2 + i2;
            if (videoChatInMeetingInfo.share_screen_user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, videoChatInMeetingInfo.share_screen_user_id);
            } else {
                i3 = 0;
            }
            int i21 = i20 + i3;
            if (videoChatInMeetingInfo.host_type != null) {
                i4 = ParticipantType.ADAPTER.encodedSizeWithTag(7, videoChatInMeetingInfo.host_type);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag3 = i21 + i4 + Participant.ADAPTER.asRepeated().encodedSizeWithTag(8, videoChatInMeetingInfo.others_participants) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(9, videoChatInMeetingInfo.in_meeting_participants);
            if (videoChatInMeetingInfo.host_device_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(10, videoChatInMeetingInfo.host_device_id);
            } else {
                i5 = 0;
            }
            int i22 = encodedSizeWithTag3 + i5;
            if (videoChatInMeetingInfo.share_screen_user_device_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(11, videoChatInMeetingInfo.share_screen_user_device_id);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (videoChatInMeetingInfo.follow_info != null) {
                i7 = FollowInfo.ADAPTER.encodedSizeWithTag(12, videoChatInMeetingInfo.follow_info);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag4 = i23 + i7 + FollowAction.ADAPTER.asRepeated().encodedSizeWithTag(13, videoChatInMeetingInfo.follow_actions);
            if (videoChatInMeetingInfo.vc_type != null) {
                i8 = VideoChatInfo.Type.ADAPTER.encodedSizeWithTag(14, videoChatInMeetingInfo.vc_type);
            } else {
                i8 = 0;
            }
            int i24 = encodedSizeWithTag4 + i8;
            if (videoChatInMeetingInfo.is_recording != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(15, videoChatInMeetingInfo.is_recording);
            } else {
                i9 = 0;
            }
            int i25 = i24 + i9;
            if (videoChatInMeetingInfo.has_recorded != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(16, videoChatInMeetingInfo.has_recorded);
            } else {
                i10 = 0;
            }
            int i26 = i25 + i10;
            if (videoChatInMeetingInfo.share_screen_in_meeting_info != null) {
                i11 = InMeetingData.ScreenSharedData.ADAPTER.encodedSizeWithTag(17, videoChatInMeetingInfo.share_screen_in_meeting_info);
            } else {
                i11 = 0;
            }
            int i27 = i26 + i11;
            if (videoChatInMeetingInfo.live_info != null) {
                i12 = InMeetingData.LiveMeetingData.LiveInfo.ADAPTER.encodedSizeWithTag(18, videoChatInMeetingInfo.live_info);
            } else {
                i12 = 0;
            }
            int i28 = i27 + i12;
            if (videoChatInMeetingInfo.should_pull_suggested != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(19, videoChatInMeetingInfo.should_pull_suggested);
            } else {
                i13 = 0;
            }
            int encodedSizeWithTag5 = i28 + i13 + WhiteboardData.ADAPTER.asRepeated().encodedSizeWithTag(20, videoChatInMeetingInfo.whiteboard_data);
            if (videoChatInMeetingInfo.meeting_url != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(21, videoChatInMeetingInfo.meeting_url);
            } else {
                i14 = 0;
            }
            int i29 = encodedSizeWithTag5 + i14;
            if (videoChatInMeetingInfo.is_subtitle_on != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(23, videoChatInMeetingInfo.is_subtitle_on);
            } else {
                i15 = 0;
            }
            int i30 = i29 + i15;
            if (videoChatInMeetingInfo.recording_hover != null) {
                i16 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(24, videoChatInMeetingInfo.recording_hover);
            } else {
                i16 = 0;
            }
            int i31 = i30 + i16;
            if (videoChatInMeetingInfo.recording_data != null) {
                i17 = InMeetingData.RecordMeetingData.ADAPTER.encodedSizeWithTag(25, videoChatInMeetingInfo.recording_data);
            } else {
                i17 = 0;
            }
            int encodedSizeWithTag6 = i31 + i17 + BreakoutRoomInfo.ADAPTER.asRepeated().encodedSizeWithTag(40, videoChatInMeetingInfo.breakout_room_infos);
            if (videoChatInMeetingInfo.interview_coding_data != null) {
                i18 = InterviewCodingData.ADAPTER.encodedSizeWithTag(41, videoChatInMeetingInfo.interview_coding_data);
            } else {
                i18 = 0;
            }
            int i32 = encodedSizeWithTag6 + i18;
            if (videoChatInMeetingInfo.minutes_status_data != null) {
                i19 = MinutesStatusData.ADAPTER.encodedSizeWithTag(42, videoChatInMeetingInfo.minutes_status_data);
            }
            return i32 + i19 + videoChatInMeetingInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatInMeetingInfo decode(ProtoReader protoReader) throws IOException {
            C51244a aVar = new C51244a();
            aVar.f127563a = "";
            aVar.f127564b = "";
            aVar.f127565c = "";
            aVar.f127568f = "";
            aVar.f127569g = ParticipantType.LARK_USER;
            aVar.f127572j = "";
            aVar.f127573k = "";
            aVar.f127576n = VideoChatInfo.Type.UNKNOWN;
            aVar.f127577o = false;
            aVar.f127578p = false;
            aVar.f127581s = false;
            aVar.f127583u = "";
            aVar.f127584v = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127563a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127564b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127565c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127566d.add(Participant.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f127567e = VideoChatSettings.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127568f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f127569g = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 8:
                            aVar.f127570h.add(Participant.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f127571i.add(Participant.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f127572j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f127573k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127574l = FollowInfo.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f127575m.add(FollowAction.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            try {
                                aVar.f127576n = VideoChatInfo.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 15:
                            aVar.f127577o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f127578p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f127579q = InMeetingData.ScreenSharedData.ADAPTER.decode(protoReader);
                            break;
                        case 18:
                            aVar.f127580r = InMeetingData.LiveMeetingData.LiveInfo.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            aVar.f127581s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f127582t.add(WhiteboardData.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            aVar.f127583u = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            switch (nextTag) {
                                case 23:
                                    aVar.f127584v = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 24:
                                    aVar.f127585w = I18nKeyInfo.ADAPTER.decode(protoReader);
                                    continue;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                                    aVar.f127586x = InMeetingData.RecordMeetingData.ADAPTER.decode(protoReader);
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case 40:
                                            aVar.f127587y.add(BreakoutRoomInfo.ADAPTER.decode(protoReader));
                                            continue;
                                        case 41:
                                            aVar.f127588z = InterviewCodingData.ADAPTER.decode(protoReader);
                                            continue;
                                        case 42:
                                            aVar.f127562A = MinutesStatusData.ADAPTER.decode(protoReader);
                                            continue;
                                        default:
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            continue;
                                            continue;
                                    }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatInMeetingInfo videoChatInMeetingInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatInMeetingInfo.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoChatInMeetingInfo.host_id);
            if (videoChatInMeetingInfo.version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoChatInMeetingInfo.version);
            }
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, videoChatInMeetingInfo.participants);
            if (videoChatInMeetingInfo.meeting_settings != null) {
                VideoChatSettings.ADAPTER.encodeWithTag(protoWriter, 5, videoChatInMeetingInfo.meeting_settings);
            }
            if (videoChatInMeetingInfo.share_screen_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, videoChatInMeetingInfo.share_screen_user_id);
            }
            if (videoChatInMeetingInfo.host_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 7, videoChatInMeetingInfo.host_type);
            }
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, videoChatInMeetingInfo.others_participants);
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, videoChatInMeetingInfo.in_meeting_participants);
            if (videoChatInMeetingInfo.host_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, videoChatInMeetingInfo.host_device_id);
            }
            if (videoChatInMeetingInfo.share_screen_user_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, videoChatInMeetingInfo.share_screen_user_device_id);
            }
            if (videoChatInMeetingInfo.follow_info != null) {
                FollowInfo.ADAPTER.encodeWithTag(protoWriter, 12, videoChatInMeetingInfo.follow_info);
            }
            FollowAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, videoChatInMeetingInfo.follow_actions);
            if (videoChatInMeetingInfo.vc_type != null) {
                VideoChatInfo.Type.ADAPTER.encodeWithTag(protoWriter, 14, videoChatInMeetingInfo.vc_type);
            }
            if (videoChatInMeetingInfo.is_recording != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, videoChatInMeetingInfo.is_recording);
            }
            if (videoChatInMeetingInfo.has_recorded != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, videoChatInMeetingInfo.has_recorded);
            }
            if (videoChatInMeetingInfo.share_screen_in_meeting_info != null) {
                InMeetingData.ScreenSharedData.ADAPTER.encodeWithTag(protoWriter, 17, videoChatInMeetingInfo.share_screen_in_meeting_info);
            }
            if (videoChatInMeetingInfo.live_info != null) {
                InMeetingData.LiveMeetingData.LiveInfo.ADAPTER.encodeWithTag(protoWriter, 18, videoChatInMeetingInfo.live_info);
            }
            if (videoChatInMeetingInfo.should_pull_suggested != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, videoChatInMeetingInfo.should_pull_suggested);
            }
            WhiteboardData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, videoChatInMeetingInfo.whiteboard_data);
            if (videoChatInMeetingInfo.meeting_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, videoChatInMeetingInfo.meeting_url);
            }
            if (videoChatInMeetingInfo.is_subtitle_on != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, videoChatInMeetingInfo.is_subtitle_on);
            }
            if (videoChatInMeetingInfo.recording_hover != null) {
                I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 24, videoChatInMeetingInfo.recording_hover);
            }
            if (videoChatInMeetingInfo.recording_data != null) {
                InMeetingData.RecordMeetingData.ADAPTER.encodeWithTag(protoWriter, 25, videoChatInMeetingInfo.recording_data);
            }
            BreakoutRoomInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 40, videoChatInMeetingInfo.breakout_room_infos);
            if (videoChatInMeetingInfo.interview_coding_data != null) {
                InterviewCodingData.ADAPTER.encodeWithTag(protoWriter, 41, videoChatInMeetingInfo.interview_coding_data);
            }
            if (videoChatInMeetingInfo.minutes_status_data != null) {
                MinutesStatusData.ADAPTER.encodeWithTag(protoWriter, 42, videoChatInMeetingInfo.minutes_status_data);
            }
            protoWriter.writeBytes(videoChatInMeetingInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatInMeetingInfo$a */
    public static final class C51244a extends Message.Builder<VideoChatInMeetingInfo, C51244a> {

        /* renamed from: A */
        public MinutesStatusData f127562A;

        /* renamed from: a */
        public String f127563a;

        /* renamed from: b */
        public String f127564b;

        /* renamed from: c */
        public String f127565c;

        /* renamed from: d */
        public List<Participant> f127566d = Internal.newMutableList();

        /* renamed from: e */
        public VideoChatSettings f127567e;

        /* renamed from: f */
        public String f127568f;

        /* renamed from: g */
        public ParticipantType f127569g;

        /* renamed from: h */
        public List<Participant> f127570h = Internal.newMutableList();

        /* renamed from: i */
        public List<Participant> f127571i = Internal.newMutableList();

        /* renamed from: j */
        public String f127572j;

        /* renamed from: k */
        public String f127573k;

        /* renamed from: l */
        public FollowInfo f127574l;

        /* renamed from: m */
        public List<FollowAction> f127575m = Internal.newMutableList();

        /* renamed from: n */
        public VideoChatInfo.Type f127576n;

        /* renamed from: o */
        public Boolean f127577o;

        /* renamed from: p */
        public Boolean f127578p;

        /* renamed from: q */
        public InMeetingData.ScreenSharedData f127579q;

        /* renamed from: r */
        public InMeetingData.LiveMeetingData.LiveInfo f127580r;

        /* renamed from: s */
        public Boolean f127581s;

        /* renamed from: t */
        public List<WhiteboardData> f127582t = Internal.newMutableList();

        /* renamed from: u */
        public String f127583u;

        /* renamed from: v */
        public Boolean f127584v;

        /* renamed from: w */
        public I18nKeyInfo f127585w;

        /* renamed from: x */
        public InMeetingData.RecordMeetingData f127586x;

        /* renamed from: y */
        public List<BreakoutRoomInfo> f127587y = Internal.newMutableList();

        /* renamed from: z */
        public InterviewCodingData f127588z;

        /* renamed from: a */
        public VideoChatInMeetingInfo build() {
            String str;
            String str2 = this.f127563a;
            if (str2 != null && (str = this.f127564b) != null) {
                return new VideoChatInMeetingInfo(str2, str, this.f127565c, this.f127566d, this.f127567e, this.f127568f, this.f127569g, this.f127570h, this.f127571i, this.f127572j, this.f127573k, this.f127574l, this.f127575m, this.f127576n, this.f127577o, this.f127578p, this.f127579q, this.f127580r, this.f127581s, this.f127582t, this.f127583u, this.f127584v, this.f127585w, this.f127586x, this.f127587y, this.f127588z, this.f127562A, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f127564b, "host_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C51244a newBuilder() {
        C51244a aVar = new C51244a();
        aVar.f127563a = this.id;
        aVar.f127564b = this.host_id;
        aVar.f127565c = this.version;
        aVar.f127566d = Internal.copyOf("participants", this.participants);
        aVar.f127567e = this.meeting_settings;
        aVar.f127568f = this.share_screen_user_id;
        aVar.f127569g = this.host_type;
        aVar.f127570h = Internal.copyOf("others_participants", this.others_participants);
        aVar.f127571i = Internal.copyOf("in_meeting_participants", this.in_meeting_participants);
        aVar.f127572j = this.host_device_id;
        aVar.f127573k = this.share_screen_user_device_id;
        aVar.f127574l = this.follow_info;
        aVar.f127575m = Internal.copyOf("follow_actions", this.follow_actions);
        aVar.f127576n = this.vc_type;
        aVar.f127577o = this.is_recording;
        aVar.f127578p = this.has_recorded;
        aVar.f127579q = this.share_screen_in_meeting_info;
        aVar.f127580r = this.live_info;
        aVar.f127581s = this.should_pull_suggested;
        aVar.f127582t = Internal.copyOf("whiteboard_data", this.whiteboard_data);
        aVar.f127583u = this.meeting_url;
        aVar.f127584v = this.is_subtitle_on;
        aVar.f127585w = this.recording_hover;
        aVar.f127586x = this.recording_data;
        aVar.f127587y = Internal.copyOf("breakout_room_infos", this.breakout_room_infos);
        aVar.f127588z = this.interview_coding_data;
        aVar.f127562A = this.minutes_status_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatInMeetingInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", host_id=");
        sb.append(this.host_id);
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.meeting_settings != null) {
            sb.append(", meeting_settings=");
            sb.append(this.meeting_settings);
        }
        if (this.share_screen_user_id != null) {
            sb.append(", share_screen_user_id=");
            sb.append(this.share_screen_user_id);
        }
        if (this.host_type != null) {
            sb.append(", host_type=");
            sb.append(this.host_type);
        }
        if (!this.others_participants.isEmpty()) {
            sb.append(", others_participants=");
            sb.append(this.others_participants);
        }
        if (!this.in_meeting_participants.isEmpty()) {
            sb.append(", in_meeting_participants=");
            sb.append(this.in_meeting_participants);
        }
        if (this.host_device_id != null) {
            sb.append(", host_device_id=");
            sb.append(this.host_device_id);
        }
        if (this.share_screen_user_device_id != null) {
            sb.append(", share_screen_user_device_id=");
            sb.append(this.share_screen_user_device_id);
        }
        if (this.follow_info != null) {
            sb.append(", follow_info=");
            sb.append(this.follow_info);
        }
        if (!this.follow_actions.isEmpty()) {
            sb.append(", follow_actions=");
            sb.append(this.follow_actions);
        }
        if (this.vc_type != null) {
            sb.append(", vc_type=");
            sb.append(this.vc_type);
        }
        if (this.is_recording != null) {
            sb.append(", is_recording=");
            sb.append(this.is_recording);
        }
        if (this.has_recorded != null) {
            sb.append(", has_recorded=");
            sb.append(this.has_recorded);
        }
        if (this.share_screen_in_meeting_info != null) {
            sb.append(", share_screen_in_meeting_info=");
            sb.append(this.share_screen_in_meeting_info);
        }
        if (this.live_info != null) {
            sb.append(", live_info=");
            sb.append(this.live_info);
        }
        if (this.should_pull_suggested != null) {
            sb.append(", should_pull_suggested=");
            sb.append(this.should_pull_suggested);
        }
        if (!this.whiteboard_data.isEmpty()) {
            sb.append(", whiteboard_data=");
            sb.append(this.whiteboard_data);
        }
        if (this.meeting_url != null) {
            sb.append(", meeting_url=");
            sb.append(this.meeting_url);
        }
        if (this.is_subtitle_on != null) {
            sb.append(", is_subtitle_on=");
            sb.append(this.is_subtitle_on);
        }
        if (this.recording_hover != null) {
            sb.append(", recording_hover=");
            sb.append(this.recording_hover);
        }
        if (this.recording_data != null) {
            sb.append(", recording_data=");
            sb.append(this.recording_data);
        }
        if (!this.breakout_room_infos.isEmpty()) {
            sb.append(", breakout_room_infos=");
            sb.append(this.breakout_room_infos);
        }
        if (this.interview_coding_data != null) {
            sb.append(", interview_coding_data=");
            sb.append(this.interview_coding_data);
        }
        if (this.minutes_status_data != null) {
            sb.append(", minutes_status_data=");
            sb.append(this.minutes_status_data);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatInMeetingInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatInMeetingInfo(String str, String str2, String str3, List<Participant> list, VideoChatSettings videoChatSettings, String str4, ParticipantType participantType, List<Participant> list2, List<Participant> list3, String str5, String str6, FollowInfo followInfo, List<FollowAction> list4, VideoChatInfo.Type type, Boolean bool, Boolean bool2, InMeetingData.ScreenSharedData screenSharedData, InMeetingData.LiveMeetingData.LiveInfo liveInfo, Boolean bool3, List<WhiteboardData> list5, String str7, Boolean bool4, I18nKeyInfo i18nKeyInfo, InMeetingData.RecordMeetingData recordMeetingData, List<BreakoutRoomInfo> list6, InterviewCodingData interviewCodingData, MinutesStatusData minutesStatusData) {
        this(str, str2, str3, list, videoChatSettings, str4, participantType, list2, list3, str5, str6, followInfo, list4, type, bool, bool2, screenSharedData, liveInfo, bool3, list5, str7, bool4, i18nKeyInfo, recordMeetingData, list6, interviewCodingData, minutesStatusData, ByteString.EMPTY);
    }

    public VideoChatInMeetingInfo(String str, String str2, String str3, List<Participant> list, VideoChatSettings videoChatSettings, String str4, ParticipantType participantType, List<Participant> list2, List<Participant> list3, String str5, String str6, FollowInfo followInfo, List<FollowAction> list4, VideoChatInfo.Type type, Boolean bool, Boolean bool2, InMeetingData.ScreenSharedData screenSharedData, InMeetingData.LiveMeetingData.LiveInfo liveInfo, Boolean bool3, List<WhiteboardData> list5, String str7, Boolean bool4, I18nKeyInfo i18nKeyInfo, InMeetingData.RecordMeetingData recordMeetingData, List<BreakoutRoomInfo> list6, InterviewCodingData interviewCodingData, MinutesStatusData minutesStatusData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.host_id = str2;
        this.version = str3;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.meeting_settings = videoChatSettings;
        this.share_screen_user_id = str4;
        this.host_type = participantType;
        this.others_participants = Internal.immutableCopyOf("others_participants", list2);
        this.in_meeting_participants = Internal.immutableCopyOf("in_meeting_participants", list3);
        this.host_device_id = str5;
        this.share_screen_user_device_id = str6;
        this.follow_info = followInfo;
        this.follow_actions = Internal.immutableCopyOf("follow_actions", list4);
        this.vc_type = type;
        this.is_recording = bool;
        this.has_recorded = bool2;
        this.share_screen_in_meeting_info = screenSharedData;
        this.live_info = liveInfo;
        this.should_pull_suggested = bool3;
        this.whiteboard_data = Internal.immutableCopyOf("whiteboard_data", list5);
        this.meeting_url = str7;
        this.is_subtitle_on = bool4;
        this.recording_hover = i18nKeyInfo;
        this.recording_data = recordMeetingData;
        this.breakout_room_infos = Internal.immutableCopyOf("breakout_room_infos", list6);
        this.interview_coding_data = interviewCodingData;
        this.minutes_status_data = minutesStatusData;
    }
}
