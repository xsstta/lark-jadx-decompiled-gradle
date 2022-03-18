package com.ss.android.lark.pb.videochat;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Participant extends Message<Participant, C50397a> {
    public static final ProtoAdapter<Participant> ADAPTER = new C50398b();
    public static final Long DEFAULT_GLOBAL_SEQ_ID = 0L;
    public static final Long DEFAULT_HANDS_UP_TIME = 0L;
    public static final Boolean DEFAULT_IS_HOST = false;
    public static final Boolean DEFAULT_IS_LARK_GUEST = false;
    public static final Long DEFAULT_JOIN_TIME = 0L;
    public static final Boolean DEFAULT_RINGING_RECEIVED = false;
    public static final Long DEFAULT_SEQ_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String mbreakout_room_id;
    public final VideoChatCapabilities mcapabilities;
    public final String mdevice_id;
    public final DeviceType mdevice_type;
    public final Long mglobal_seq_id;
    public final Long mhands_up_time;
    public final String mid;
    public final String minteractive_id;
    public final String minviter_device_id;
    public final String minviter_id;
    public final ParticipantType minviter_type;
    public final Boolean mis_host;
    public final Boolean mis_lark_guest;
    public final Long mjoin_time;
    public final OfflineReason moffline_reason;
    public final String mongoing_meeting_id;
    public final String mongoing_meeting_interactive_id;
    public final ParticipantRoleSettings mparticipant_role_settings;
    public final PSTNInfo mpstn_info;
    public final Boolean mringing_received;
    public final ParticipantRole mrole;
    public final String mrtc_join_id;
    public final Long mseq_id;
    public final ParticipantSettings msettings;
    public final Status mstatus;
    public final TenantTag mtenant_tag;
    public final ParticipantType mtype;
    public final String muser_tenant_id;

    public enum DeviceType implements WireEnum {
        UNKNOWN_DEVICE_TYPE(0),
        DESKTOP(1),
        MOBILE(2),
        WEB(3);
        
        public static final ProtoAdapter<DeviceType> ADAPTER = ProtoAdapter.newEnumAdapter(DeviceType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DeviceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_DEVICE_TYPE;
            }
            if (i == 1) {
                return DESKTOP;
            }
            if (i == 2) {
                return MOBILE;
            }
            if (i != 3) {
                return null;
            }
            return WEB;
        }

        private DeviceType(int i) {
            this.value = i;
        }
    }

    public enum OfflineReason implements WireEnum {
        UNKNOWN_OFFLINE_REASON(0),
        BUSY(1),
        REFUSE(2),
        RING_TIMEOUT(3),
        KICK_OUT(4),
        LEAVE(5),
        END(6),
        CANCEL(7),
        OVERTIME(8),
        ACCEPT_OTHER(9),
        FORBIDDEN_TARGET(12),
        JOIN_LOBBY(13),
        CALL_EXCEPTION(14),
        AUTO_END(15);
        
        public static final ProtoAdapter<OfflineReason> ADAPTER = ProtoAdapter.newEnumAdapter(OfflineReason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OfflineReason fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_OFFLINE_REASON;
                case 1:
                    return BUSY;
                case 2:
                    return REFUSE;
                case 3:
                    return RING_TIMEOUT;
                case 4:
                    return KICK_OUT;
                case 5:
                    return LEAVE;
                case 6:
                    return END;
                case 7:
                    return CANCEL;
                case 8:
                    return OVERTIME;
                case 9:
                    return ACCEPT_OTHER;
                case 10:
                case 11:
                default:
                    return null;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return FORBIDDEN_TARGET;
                case 13:
                    return JOIN_LOBBY;
                case 14:
                    return CALL_EXCEPTION;
                case 15:
                    return AUTO_END;
            }
        }

        private OfflineReason(int i) {
            this.value = i;
        }
    }

    public enum ParticipantMeetingRole implements WireEnum {
        PARTICIPANT(0),
        HOST(1),
        CO_HOST(2);
        
        public static final ProtoAdapter<ParticipantMeetingRole> ADAPTER = ProtoAdapter.newEnumAdapter(ParticipantMeetingRole.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ParticipantMeetingRole fromValue(int i) {
            if (i == 0) {
                return PARTICIPANT;
            }
            if (i == 1) {
                return HOST;
            }
            if (i != 2) {
                return null;
            }
            return CO_HOST;
        }

        private ParticipantMeetingRole(int i) {
            this.value = i;
        }
    }

    public enum Status implements WireEnum {
        UNKNOWN(0),
        CALLING(1),
        ON_THE_CALL(2),
        RINGING(3),
        IDLE(4);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CALLING;
            }
            if (i == 2) {
                return ON_THE_CALL;
            }
            if (i == 3) {
                return RINGING;
            }
            if (i != 4) {
                return null;
            }
            return IDLE;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public static final class ParticipantRoleSettings extends Message<ParticipantRoleSettings, C50393a> {
        public static final ProtoAdapter<ParticipantRoleSettings> ADAPTER = new C50394b();
        public static final Boolean DEFAULT_IS_MEETING_OWNER = false;
        private static final long serialVersionUID = 0;
        public final Boolean mis_meeting_owner;
        public final ParticipantMeetingRole mmeeting_role;

        /* renamed from: com.ss.android.lark.pb.videochat.Participant$ParticipantRoleSettings$b */
        private static final class C50394b extends ProtoAdapter<ParticipantRoleSettings> {
            C50394b() {
                super(FieldEncoding.LENGTH_DELIMITED, ParticipantRoleSettings.class);
            }

            /* renamed from: a */
            public int encodedSize(ParticipantRoleSettings participantRoleSettings) {
                int i;
                int i2 = 0;
                if (participantRoleSettings.mmeeting_role != null) {
                    i = ParticipantMeetingRole.ADAPTER.encodedSizeWithTag(1, participantRoleSettings.mmeeting_role);
                } else {
                    i = 0;
                }
                if (participantRoleSettings.mis_meeting_owner != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, participantRoleSettings.mis_meeting_owner);
                }
                return i + i2 + participantRoleSettings.unknownFields().size();
            }

            /* renamed from: a */
            public ParticipantRoleSettings decode(ProtoReader protoReader) throws IOException {
                C50393a aVar = new C50393a();
                aVar.f125813b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f125812a = ParticipantMeetingRole.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125813b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ParticipantRoleSettings participantRoleSettings) throws IOException {
                if (participantRoleSettings.mmeeting_role != null) {
                    ParticipantMeetingRole.ADAPTER.encodeWithTag(protoWriter, 1, participantRoleSettings.mmeeting_role);
                }
                if (participantRoleSettings.mis_meeting_owner != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, participantRoleSettings.mis_meeting_owner);
                }
                protoWriter.writeBytes(participantRoleSettings.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.Participant$ParticipantRoleSettings$a */
        public static final class C50393a extends Message.Builder<ParticipantRoleSettings, C50393a> {

            /* renamed from: a */
            public ParticipantMeetingRole f125812a;

            /* renamed from: b */
            public Boolean f125813b;

            /* renamed from: a */
            public ParticipantRoleSettings build() {
                return new ParticipantRoleSettings(this.f125812a, this.f125813b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50393a newBuilder() {
            C50393a aVar = new C50393a();
            aVar.f125812a = this.mmeeting_role;
            aVar.f125813b = this.mis_meeting_owner;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mmeeting_role != null) {
                sb.append(", meeting_role=");
                sb.append(this.mmeeting_role);
            }
            if (this.mis_meeting_owner != null) {
                sb.append(", is_meeting_owner=");
                sb.append(this.mis_meeting_owner);
            }
            StringBuilder replace = sb.replace(0, 2, "ParticipantRoleSettings{");
            replace.append('}');
            return replace.toString();
        }

        public ParticipantRoleSettings(ParticipantMeetingRole participantMeetingRole, Boolean bool) {
            this(participantMeetingRole, bool, ByteString.EMPTY);
        }

        public ParticipantRoleSettings(ParticipantMeetingRole participantMeetingRole, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mmeeting_role = participantMeetingRole;
            this.mis_meeting_owner = bool;
        }
    }

    public static final class VideoChatCapabilities extends Message<VideoChatCapabilities, C50395a> {
        public static final ProtoAdapter<VideoChatCapabilities> ADAPTER = new C50396b();
        public static final Boolean DEFAULT_BECOME_INTERPRETER = false;
        public static final Boolean DEFAULT_CAN_BE_CO_HOST = false;
        public static final Boolean DEFAULT_CAN_BE_HOST = false;
        public static final Boolean DEFAULT_CAN_MOVE_TO_BREAKOUT_ROOM_ID = false;
        public static final Boolean DEFAULT_EARLY_JOIN = false;
        public static final Boolean DEFAULT_FOLLOW = false;
        public static final Boolean DEFAULT_FOLLOW_PRESENTER = false;
        public static final Boolean DEFAULT_JOIN_LOBBY = false;
        public static final Boolean DEFAULT_REMOTE_CONTROL = false;
        public static final Boolean DEFAULT_SHARE_SCREEN = false;
        public static final Boolean DEFAULT_SUPPORT_HANDS_UP = false;
        public static final Boolean DEFAULT_UPGRADE_MEETING = false;
        private static final long serialVersionUID = 0;
        public final Boolean mbecome_interpreter;
        public final Boolean mcan_be_co_host;
        public final Boolean mcan_be_host;
        public final Boolean mcan_move_to_breakout_room_id;
        public final Boolean mearly_join;
        public final Boolean mfollow;
        public final List<String> mfollow_consume_strategy_ids;
        public final Boolean mfollow_presenter;
        public final List<String> mfollow_produce_strategy_ids;
        public final Boolean mjoin_lobby;
        public final Boolean mremote_control;
        public final Boolean mshare_screen;
        public final Boolean msupport_hands_up;
        public final Boolean mupgrade_meeting;

        /* renamed from: com.ss.android.lark.pb.videochat.Participant$VideoChatCapabilities$b */
        private static final class C50396b extends ProtoAdapter<VideoChatCapabilities> {
            C50396b() {
                super(FieldEncoding.LENGTH_DELIMITED, VideoChatCapabilities.class);
            }

            /* renamed from: a */
            public int encodedSize(VideoChatCapabilities videoChatCapabilities) {
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
                if (videoChatCapabilities.mshare_screen != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, videoChatCapabilities.mshare_screen);
                } else {
                    i = 0;
                }
                if (videoChatCapabilities.mupgrade_meeting != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, videoChatCapabilities.mupgrade_meeting);
                } else {
                    i2 = 0;
                }
                int i13 = i + i2;
                if (videoChatCapabilities.mfollow != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, videoChatCapabilities.mfollow);
                } else {
                    i3 = 0;
                }
                int i14 = i13 + i3;
                if (videoChatCapabilities.mearly_join != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, videoChatCapabilities.mearly_join);
                } else {
                    i4 = 0;
                }
                int i15 = i14 + i4;
                if (videoChatCapabilities.mfollow_presenter != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, videoChatCapabilities.mfollow_presenter);
                } else {
                    i5 = 0;
                }
                int i16 = i15 + i5;
                if (videoChatCapabilities.mremote_control != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, videoChatCapabilities.mremote_control);
                } else {
                    i6 = 0;
                }
                int encodedSizeWithTag = i16 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, videoChatCapabilities.mfollow_consume_strategy_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, videoChatCapabilities.mfollow_produce_strategy_ids);
                if (videoChatCapabilities.mjoin_lobby != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, videoChatCapabilities.mjoin_lobby);
                } else {
                    i7 = 0;
                }
                int i17 = encodedSizeWithTag + i7;
                if (videoChatCapabilities.msupport_hands_up != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(10, videoChatCapabilities.msupport_hands_up);
                } else {
                    i8 = 0;
                }
                int i18 = i17 + i8;
                if (videoChatCapabilities.mbecome_interpreter != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(11, videoChatCapabilities.mbecome_interpreter);
                } else {
                    i9 = 0;
                }
                int i19 = i18 + i9;
                if (videoChatCapabilities.mcan_move_to_breakout_room_id != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(12, videoChatCapabilities.mcan_move_to_breakout_room_id);
                } else {
                    i10 = 0;
                }
                int i20 = i19 + i10;
                if (videoChatCapabilities.mcan_be_host != null) {
                    i11 = ProtoAdapter.BOOL.encodedSizeWithTag(13, videoChatCapabilities.mcan_be_host);
                } else {
                    i11 = 0;
                }
                int i21 = i20 + i11;
                if (videoChatCapabilities.mcan_be_co_host != null) {
                    i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, videoChatCapabilities.mcan_be_co_host);
                }
                return i21 + i12 + videoChatCapabilities.unknownFields().size();
            }

            /* renamed from: a */
            public VideoChatCapabilities decode(ProtoReader protoReader) throws IOException {
                C50395a aVar = new C50395a();
                aVar.f125814a = false;
                aVar.f125815b = false;
                aVar.f125816c = false;
                aVar.f125817d = false;
                aVar.f125818e = false;
                aVar.f125819f = false;
                aVar.f125822i = false;
                aVar.f125823j = false;
                aVar.f125824k = false;
                aVar.f125825l = false;
                aVar.f125826m = false;
                aVar.f125827n = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f125814a = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 2:
                                aVar.f125815b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                aVar.f125816c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f125817d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f125818e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f125819f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f125820g.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 8:
                                aVar.f125821h.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 9:
                                aVar.f125822i = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 10:
                                aVar.f125823j = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f125824k = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                aVar.f125825l = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 13:
                                aVar.f125826m = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 14:
                                aVar.f125827n = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, VideoChatCapabilities videoChatCapabilities) throws IOException {
                if (videoChatCapabilities.mshare_screen != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, videoChatCapabilities.mshare_screen);
                }
                if (videoChatCapabilities.mupgrade_meeting != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, videoChatCapabilities.mupgrade_meeting);
                }
                if (videoChatCapabilities.mfollow != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, videoChatCapabilities.mfollow);
                }
                if (videoChatCapabilities.mearly_join != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, videoChatCapabilities.mearly_join);
                }
                if (videoChatCapabilities.mfollow_presenter != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, videoChatCapabilities.mfollow_presenter);
                }
                if (videoChatCapabilities.mremote_control != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, videoChatCapabilities.mremote_control);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, videoChatCapabilities.mfollow_consume_strategy_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, videoChatCapabilities.mfollow_produce_strategy_ids);
                if (videoChatCapabilities.mjoin_lobby != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, videoChatCapabilities.mjoin_lobby);
                }
                if (videoChatCapabilities.msupport_hands_up != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, videoChatCapabilities.msupport_hands_up);
                }
                if (videoChatCapabilities.mbecome_interpreter != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, videoChatCapabilities.mbecome_interpreter);
                }
                if (videoChatCapabilities.mcan_move_to_breakout_room_id != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, videoChatCapabilities.mcan_move_to_breakout_room_id);
                }
                if (videoChatCapabilities.mcan_be_host != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, videoChatCapabilities.mcan_be_host);
                }
                if (videoChatCapabilities.mcan_be_co_host != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, videoChatCapabilities.mcan_be_co_host);
                }
                protoWriter.writeBytes(videoChatCapabilities.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.Participant$VideoChatCapabilities$a */
        public static final class C50395a extends Message.Builder<VideoChatCapabilities, C50395a> {

            /* renamed from: a */
            public Boolean f125814a;

            /* renamed from: b */
            public Boolean f125815b;

            /* renamed from: c */
            public Boolean f125816c;

            /* renamed from: d */
            public Boolean f125817d;

            /* renamed from: e */
            public Boolean f125818e;

            /* renamed from: f */
            public Boolean f125819f;

            /* renamed from: g */
            public List<String> f125820g = Internal.newMutableList();

            /* renamed from: h */
            public List<String> f125821h = Internal.newMutableList();

            /* renamed from: i */
            public Boolean f125822i;

            /* renamed from: j */
            public Boolean f125823j;

            /* renamed from: k */
            public Boolean f125824k;

            /* renamed from: l */
            public Boolean f125825l;

            /* renamed from: m */
            public Boolean f125826m;

            /* renamed from: n */
            public Boolean f125827n;

            /* renamed from: a */
            public VideoChatCapabilities build() {
                return new VideoChatCapabilities(this.f125814a, this.f125815b, this.f125816c, this.f125817d, this.f125818e, this.f125819f, this.f125820g, this.f125821h, this.f125822i, this.f125823j, this.f125824k, this.f125825l, this.f125826m, this.f125827n, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50395a newBuilder() {
            C50395a aVar = new C50395a();
            aVar.f125814a = this.mshare_screen;
            aVar.f125815b = this.mupgrade_meeting;
            aVar.f125816c = this.mfollow;
            aVar.f125817d = this.mearly_join;
            aVar.f125818e = this.mfollow_presenter;
            aVar.f125819f = this.mremote_control;
            aVar.f125820g = Internal.copyOf("mfollow_consume_strategy_ids", this.mfollow_consume_strategy_ids);
            aVar.f125821h = Internal.copyOf("mfollow_produce_strategy_ids", this.mfollow_produce_strategy_ids);
            aVar.f125822i = this.mjoin_lobby;
            aVar.f125823j = this.msupport_hands_up;
            aVar.f125824k = this.mbecome_interpreter;
            aVar.f125825l = this.mcan_move_to_breakout_room_id;
            aVar.f125826m = this.mcan_be_host;
            aVar.f125827n = this.mcan_be_co_host;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mshare_screen != null) {
                sb.append(", share_screen=");
                sb.append(this.mshare_screen);
            }
            if (this.mupgrade_meeting != null) {
                sb.append(", upgrade_meeting=");
                sb.append(this.mupgrade_meeting);
            }
            if (this.mfollow != null) {
                sb.append(", follow=");
                sb.append(this.mfollow);
            }
            if (this.mearly_join != null) {
                sb.append(", early_join=");
                sb.append(this.mearly_join);
            }
            if (this.mfollow_presenter != null) {
                sb.append(", follow_presenter=");
                sb.append(this.mfollow_presenter);
            }
            if (this.mremote_control != null) {
                sb.append(", remote_control=");
                sb.append(this.mremote_control);
            }
            if (!this.mfollow_consume_strategy_ids.isEmpty()) {
                sb.append(", follow_consume_strategy_ids=");
                sb.append(this.mfollow_consume_strategy_ids);
            }
            if (!this.mfollow_produce_strategy_ids.isEmpty()) {
                sb.append(", follow_produce_strategy_ids=");
                sb.append(this.mfollow_produce_strategy_ids);
            }
            if (this.mjoin_lobby != null) {
                sb.append(", join_lobby=");
                sb.append(this.mjoin_lobby);
            }
            if (this.msupport_hands_up != null) {
                sb.append(", support_hands_up=");
                sb.append(this.msupport_hands_up);
            }
            if (this.mbecome_interpreter != null) {
                sb.append(", become_interpreter=");
                sb.append(this.mbecome_interpreter);
            }
            if (this.mcan_move_to_breakout_room_id != null) {
                sb.append(", can_move_to_breakout_room_id=");
                sb.append(this.mcan_move_to_breakout_room_id);
            }
            if (this.mcan_be_host != null) {
                sb.append(", can_be_host=");
                sb.append(this.mcan_be_host);
            }
            if (this.mcan_be_co_host != null) {
                sb.append(", can_be_co_host=");
                sb.append(this.mcan_be_co_host);
            }
            StringBuilder replace = sb.replace(0, 2, "VideoChatCapabilities{");
            replace.append('}');
            return replace.toString();
        }

        public VideoChatCapabilities(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<String> list, List<String> list2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12) {
            this(bool, bool2, bool3, bool4, bool5, bool6, list, list2, bool7, bool8, bool9, bool10, bool11, bool12, ByteString.EMPTY);
        }

        public VideoChatCapabilities(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<String> list, List<String> list2, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mshare_screen = bool;
            this.mupgrade_meeting = bool2;
            this.mfollow = bool3;
            this.mearly_join = bool4;
            this.mfollow_presenter = bool5;
            this.mremote_control = bool6;
            this.mfollow_consume_strategy_ids = Internal.immutableCopyOf("mfollow_consume_strategy_ids", list);
            this.mfollow_produce_strategy_ids = Internal.immutableCopyOf("mfollow_produce_strategy_ids", list2);
            this.mjoin_lobby = bool7;
            this.msupport_hands_up = bool8;
            this.mbecome_interpreter = bool9;
            this.mcan_move_to_breakout_room_id = bool10;
            this.mcan_be_host = bool11;
            this.mcan_be_co_host = bool12;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.Participant$b */
    private static final class C50398b extends ProtoAdapter<Participant> {
        C50398b() {
            super(FieldEncoding.LENGTH_DELIMITED, Participant.class);
        }

        /* renamed from: a */
        public int encodedSize(Participant participant) {
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
            int i22;
            int i23;
            int i24;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, participant.mid) + Status.ADAPTER.encodedSizeWithTag(2, participant.mstatus) + ProtoAdapter.BOOL.encodedSizeWithTag(3, participant.mis_host);
            int i25 = 0;
            if (participant.mringing_received != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, participant.mringing_received);
            } else {
                i = 0;
            }
            int i26 = encodedSizeWithTag + i;
            if (participant.moffline_reason != null) {
                i2 = OfflineReason.ADAPTER.encodedSizeWithTag(5, participant.moffline_reason);
            } else {
                i2 = 0;
            }
            int i27 = i26 + i2;
            if (participant.mdevice_type != null) {
                i3 = DeviceType.ADAPTER.encodedSizeWithTag(6, participant.mdevice_type);
            } else {
                i3 = 0;
            }
            int i28 = i27 + i3;
            if (participant.msettings != null) {
                i4 = ParticipantSettings.ADAPTER.encodedSizeWithTag(7, participant.msettings);
            } else {
                i4 = 0;
            }
            int i29 = i28 + i4;
            if (participant.mjoin_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(8, participant.mjoin_time);
            } else {
                i5 = 0;
            }
            int i30 = i29 + i5;
            if (participant.minteractive_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, participant.minteractive_id);
            } else {
                i6 = 0;
            }
            int i31 = i30 + i6;
            if (participant.mtype != null) {
                i7 = ParticipantType.ADAPTER.encodedSizeWithTag(10, participant.mtype);
            } else {
                i7 = 0;
            }
            int i32 = i31 + i7;
            if (participant.mcapabilities != null) {
                i8 = VideoChatCapabilities.ADAPTER.encodedSizeWithTag(11, participant.mcapabilities);
            } else {
                i8 = 0;
            }
            int i33 = i32 + i8;
            if (participant.minviter_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, participant.minviter_id);
            } else {
                i9 = 0;
            }
            int i34 = i33 + i9;
            if (participant.minviter_type != null) {
                i10 = ParticipantType.ADAPTER.encodedSizeWithTag(13, participant.minviter_type);
            } else {
                i10 = 0;
            }
            int i35 = i34 + i10;
            if (participant.mdevice_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(14, participant.mdevice_id);
            } else {
                i11 = 0;
            }
            int i36 = i35 + i11;
            if (participant.minviter_device_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(15, participant.minviter_device_id);
            } else {
                i12 = 0;
            }
            int i37 = i36 + i12;
            if (participant.mongoing_meeting_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(16, participant.mongoing_meeting_id);
            } else {
                i13 = 0;
            }
            int i38 = i37 + i13;
            if (participant.mongoing_meeting_interactive_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(17, participant.mongoing_meeting_interactive_id);
            } else {
                i14 = 0;
            }
            int i39 = i38 + i14;
            if (participant.mrole != null) {
                i15 = ParticipantRole.ADAPTER.encodedSizeWithTag(18, participant.mrole);
            } else {
                i15 = 0;
            }
            int i40 = i39 + i15;
            if (participant.mseq_id != null) {
                i16 = ProtoAdapter.INT64.encodedSizeWithTag(19, participant.mseq_id);
            } else {
                i16 = 0;
            }
            int i41 = i40 + i16;
            if (participant.mpstn_info != null) {
                i17 = PSTNInfo.ADAPTER.encodedSizeWithTag(21, participant.mpstn_info);
            } else {
                i17 = 0;
            }
            int i42 = i41 + i17;
            if (participant.mis_lark_guest != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(22, participant.mis_lark_guest);
            } else {
                i18 = 0;
            }
            int i43 = i42 + i18;
            if (participant.mparticipant_role_settings != null) {
                i19 = ParticipantRoleSettings.ADAPTER.encodedSizeWithTag(23, participant.mparticipant_role_settings);
            } else {
                i19 = 0;
            }
            int i44 = i43 + i19;
            if (participant.mhands_up_time != null) {
                i20 = ProtoAdapter.INT64.encodedSizeWithTag(24, participant.mhands_up_time);
            } else {
                i20 = 0;
            }
            int i45 = i44 + i20;
            if (participant.muser_tenant_id != null) {
                i21 = ProtoAdapter.STRING.encodedSizeWithTag(25, participant.muser_tenant_id);
            } else {
                i21 = 0;
            }
            int i46 = i45 + i21;
            if (participant.mtenant_tag != null) {
                i22 = TenantTag.ADAPTER.encodedSizeWithTag(26, participant.mtenant_tag);
            } else {
                i22 = 0;
            }
            int i47 = i46 + i22;
            if (participant.mglobal_seq_id != null) {
                i23 = ProtoAdapter.INT64.encodedSizeWithTag(27, participant.mglobal_seq_id);
            } else {
                i23 = 0;
            }
            int i48 = i47 + i23;
            if (participant.mrtc_join_id != null) {
                i24 = ProtoAdapter.STRING.encodedSizeWithTag(28, participant.mrtc_join_id);
            } else {
                i24 = 0;
            }
            int i49 = i48 + i24;
            if (participant.mbreakout_room_id != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(29, participant.mbreakout_room_id);
            }
            return i49 + i25 + participant.unknownFields().size();
        }

        /* renamed from: a */
        public Participant decode(ProtoReader protoReader) throws IOException {
            C50397a aVar = new C50397a();
            aVar.f125830a = "";
            aVar.f125832c = false;
            aVar.f125833d = false;
            aVar.f125837h = 0L;
            aVar.f125838i = "";
            aVar.f125841l = "";
            aVar.f125843n = "";
            aVar.f125844o = "";
            aVar.f125845p = "";
            aVar.f125846q = "";
            aVar.f125848s = 0L;
            aVar.f125850u = false;
            aVar.f125852w = 0L;
            aVar.f125853x = "";
            aVar.f125855z = 0L;
            aVar.f125828A = "";
            aVar.f125829B = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125830a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125831b = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125832c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125833d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f125834e = OfflineReason.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f125835f = DeviceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 7:
                            aVar.f125836g = ParticipantSettings.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125837h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125838i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f125839j = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 11:
                            aVar.f125840k = VideoChatCapabilities.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125841l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f125842m = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 14:
                            aVar.f125843n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f125844o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f125845p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f125846q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            try {
                                aVar.f125847r = ParticipantRole.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 19:
                            aVar.f125848s = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 20:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 21:
                            aVar.f125849t = PSTNInfo.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            aVar.f125850u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f125851v = ParticipantRoleSettings.ADAPTER.decode(protoReader);
                            break;
                        case 24:
                            aVar.f125852w = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f125853x = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            try {
                                aVar.f125854y = TenantTag.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                break;
                            }
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f125855z = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f125828A = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            aVar.f125829B = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Participant participant) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, participant.mid);
            Status.ADAPTER.encodeWithTag(protoWriter, 2, participant.mstatus);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, participant.mis_host);
            if (participant.mringing_received != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, participant.mringing_received);
            }
            if (participant.moffline_reason != null) {
                OfflineReason.ADAPTER.encodeWithTag(protoWriter, 5, participant.moffline_reason);
            }
            if (participant.mdevice_type != null) {
                DeviceType.ADAPTER.encodeWithTag(protoWriter, 6, participant.mdevice_type);
            }
            if (participant.msettings != null) {
                ParticipantSettings.ADAPTER.encodeWithTag(protoWriter, 7, participant.msettings);
            }
            if (participant.mjoin_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, participant.mjoin_time);
            }
            if (participant.minteractive_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, participant.minteractive_id);
            }
            if (participant.mtype != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 10, participant.mtype);
            }
            if (participant.mcapabilities != null) {
                VideoChatCapabilities.ADAPTER.encodeWithTag(protoWriter, 11, participant.mcapabilities);
            }
            if (participant.minviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, participant.minviter_id);
            }
            if (participant.minviter_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 13, participant.minviter_type);
            }
            if (participant.mdevice_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, participant.mdevice_id);
            }
            if (participant.minviter_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, participant.minviter_device_id);
            }
            if (participant.mongoing_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, participant.mongoing_meeting_id);
            }
            if (participant.mongoing_meeting_interactive_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, participant.mongoing_meeting_interactive_id);
            }
            if (participant.mrole != null) {
                ParticipantRole.ADAPTER.encodeWithTag(protoWriter, 18, participant.mrole);
            }
            if (participant.mseq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, participant.mseq_id);
            }
            if (participant.mpstn_info != null) {
                PSTNInfo.ADAPTER.encodeWithTag(protoWriter, 21, participant.mpstn_info);
            }
            if (participant.mis_lark_guest != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, participant.mis_lark_guest);
            }
            if (participant.mparticipant_role_settings != null) {
                ParticipantRoleSettings.ADAPTER.encodeWithTag(protoWriter, 23, participant.mparticipant_role_settings);
            }
            if (participant.mhands_up_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 24, participant.mhands_up_time);
            }
            if (participant.muser_tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, participant.muser_tenant_id);
            }
            if (participant.mtenant_tag != null) {
                TenantTag.ADAPTER.encodeWithTag(protoWriter, 26, participant.mtenant_tag);
            }
            if (participant.mglobal_seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 27, participant.mglobal_seq_id);
            }
            if (participant.mrtc_join_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, participant.mrtc_join_id);
            }
            if (participant.mbreakout_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 29, participant.mbreakout_room_id);
            }
            protoWriter.writeBytes(participant.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50397a newBuilder() {
        C50397a aVar = new C50397a();
        aVar.f125830a = this.mid;
        aVar.f125831b = this.mstatus;
        aVar.f125832c = this.mis_host;
        aVar.f125833d = this.mringing_received;
        aVar.f125834e = this.moffline_reason;
        aVar.f125835f = this.mdevice_type;
        aVar.f125836g = this.msettings;
        aVar.f125837h = this.mjoin_time;
        aVar.f125838i = this.minteractive_id;
        aVar.f125839j = this.mtype;
        aVar.f125840k = this.mcapabilities;
        aVar.f125841l = this.minviter_id;
        aVar.f125842m = this.minviter_type;
        aVar.f125843n = this.mdevice_id;
        aVar.f125844o = this.minviter_device_id;
        aVar.f125845p = this.mongoing_meeting_id;
        aVar.f125846q = this.mongoing_meeting_interactive_id;
        aVar.f125847r = this.mrole;
        aVar.f125848s = this.mseq_id;
        aVar.f125849t = this.mpstn_info;
        aVar.f125850u = this.mis_lark_guest;
        aVar.f125851v = this.mparticipant_role_settings;
        aVar.f125852w = this.mhands_up_time;
        aVar.f125853x = this.muser_tenant_id;
        aVar.f125854y = this.mtenant_tag;
        aVar.f125855z = this.mglobal_seq_id;
        aVar.f125828A = this.mrtc_join_id;
        aVar.f125829B = this.mbreakout_room_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.Participant$a */
    public static final class C50397a extends Message.Builder<Participant, C50397a> {

        /* renamed from: A */
        public String f125828A;

        /* renamed from: B */
        public String f125829B;

        /* renamed from: a */
        public String f125830a;

        /* renamed from: b */
        public Status f125831b;

        /* renamed from: c */
        public Boolean f125832c;

        /* renamed from: d */
        public Boolean f125833d;

        /* renamed from: e */
        public OfflineReason f125834e;

        /* renamed from: f */
        public DeviceType f125835f;

        /* renamed from: g */
        public ParticipantSettings f125836g;

        /* renamed from: h */
        public Long f125837h;

        /* renamed from: i */
        public String f125838i;

        /* renamed from: j */
        public ParticipantType f125839j;

        /* renamed from: k */
        public VideoChatCapabilities f125840k;

        /* renamed from: l */
        public String f125841l;

        /* renamed from: m */
        public ParticipantType f125842m;

        /* renamed from: n */
        public String f125843n;

        /* renamed from: o */
        public String f125844o;

        /* renamed from: p */
        public String f125845p;

        /* renamed from: q */
        public String f125846q;

        /* renamed from: r */
        public ParticipantRole f125847r;

        /* renamed from: s */
        public Long f125848s;

        /* renamed from: t */
        public PSTNInfo f125849t;

        /* renamed from: u */
        public Boolean f125850u;

        /* renamed from: v */
        public ParticipantRoleSettings f125851v;

        /* renamed from: w */
        public Long f125852w;

        /* renamed from: x */
        public String f125853x;

        /* renamed from: y */
        public TenantTag f125854y;

        /* renamed from: z */
        public Long f125855z;

        /* renamed from: a */
        public Participant build() {
            Status status;
            Boolean bool;
            String str = this.f125830a;
            if (str != null && (status = this.f125831b) != null && (bool = this.f125832c) != null) {
                return new Participant(str, status, bool, this.f125833d, this.f125834e, this.f125835f, this.f125836g, this.f125837h, this.f125838i, this.f125839j, this.f125840k, this.f125841l, this.f125842m, this.f125843n, this.f125844o, this.f125845p, this.f125846q, this.f125847r, this.f125848s, this.f125849t, this.f125850u, this.f125851v, this.f125852w, this.f125853x, this.f125854y, this.f125855z, this.f125828A, this.f125829B, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid", this.f125831b, "mstatus", this.f125832c, "mis_host");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        sb.append(", status=");
        sb.append(this.mstatus);
        sb.append(", is_host=");
        sb.append(this.mis_host);
        if (this.mringing_received != null) {
            sb.append(", ringing_received=");
            sb.append(this.mringing_received);
        }
        if (this.moffline_reason != null) {
            sb.append(", offline_reason=");
            sb.append(this.moffline_reason);
        }
        if (this.mdevice_type != null) {
            sb.append(", device_type=");
            sb.append(this.mdevice_type);
        }
        if (this.msettings != null) {
            sb.append(", settings=");
            sb.append(this.msettings);
        }
        if (this.mjoin_time != null) {
            sb.append(", join_time=");
            sb.append(this.mjoin_time);
        }
        if (this.minteractive_id != null) {
            sb.append(", interactive_id=");
            sb.append(this.minteractive_id);
        }
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mcapabilities != null) {
            sb.append(", capabilities=");
            sb.append(this.mcapabilities);
        }
        if (this.minviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.minviter_id);
        }
        if (this.minviter_type != null) {
            sb.append(", inviter_type=");
            sb.append(this.minviter_type);
        }
        if (this.mdevice_id != null) {
            sb.append(", device_id=");
            sb.append(this.mdevice_id);
        }
        if (this.minviter_device_id != null) {
            sb.append(", inviter_device_id=");
            sb.append(this.minviter_device_id);
        }
        if (this.mongoing_meeting_id != null) {
            sb.append(", ongoing_meeting_id=");
            sb.append(this.mongoing_meeting_id);
        }
        if (this.mongoing_meeting_interactive_id != null) {
            sb.append(", ongoing_meeting_interactive_id=");
            sb.append(this.mongoing_meeting_interactive_id);
        }
        if (this.mrole != null) {
            sb.append(", role=");
            sb.append(this.mrole);
        }
        if (this.mseq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.mseq_id);
        }
        if (this.mpstn_info != null) {
            sb.append(", pstn_info=");
            sb.append(this.mpstn_info);
        }
        if (this.mis_lark_guest != null) {
            sb.append(", is_lark_guest=");
            sb.append(this.mis_lark_guest);
        }
        if (this.mparticipant_role_settings != null) {
            sb.append(", participant_role_settings=");
            sb.append(this.mparticipant_role_settings);
        }
        if (this.mhands_up_time != null) {
            sb.append(", hands_up_time=");
            sb.append(this.mhands_up_time);
        }
        if (this.muser_tenant_id != null) {
            sb.append(", user_tenant_id=");
            sb.append(this.muser_tenant_id);
        }
        if (this.mtenant_tag != null) {
            sb.append(", tenant_tag=");
            sb.append(this.mtenant_tag);
        }
        if (this.mglobal_seq_id != null) {
            sb.append(", global_seq_id=");
            sb.append(this.mglobal_seq_id);
        }
        if (this.mrtc_join_id != null) {
            sb.append(", rtc_join_id=");
            sb.append(this.mrtc_join_id);
        }
        if (this.mbreakout_room_id != null) {
            sb.append(", breakout_room_id=");
            sb.append(this.mbreakout_room_id);
        }
        StringBuilder replace = sb.replace(0, 2, "Participant{");
        replace.append('}');
        return replace.toString();
    }

    public Participant(String str, Status status, Boolean bool, Boolean bool2, OfflineReason offlineReason, DeviceType deviceType, ParticipantSettings participantSettings, Long l, String str2, ParticipantType participantType, VideoChatCapabilities videoChatCapabilities, String str3, ParticipantType participantType2, String str4, String str5, String str6, String str7, ParticipantRole participantRole, Long l2, PSTNInfo pSTNInfo, Boolean bool3, ParticipantRoleSettings participantRoleSettings, Long l3, String str8, TenantTag tenantTag, Long l4, String str9, String str10) {
        this(str, status, bool, bool2, offlineReason, deviceType, participantSettings, l, str2, participantType, videoChatCapabilities, str3, participantType2, str4, str5, str6, str7, participantRole, l2, pSTNInfo, bool3, participantRoleSettings, l3, str8, tenantTag, l4, str9, str10, ByteString.EMPTY);
    }

    public Participant(String str, Status status, Boolean bool, Boolean bool2, OfflineReason offlineReason, DeviceType deviceType, ParticipantSettings participantSettings, Long l, String str2, ParticipantType participantType, VideoChatCapabilities videoChatCapabilities, String str3, ParticipantType participantType2, String str4, String str5, String str6, String str7, ParticipantRole participantRole, Long l2, PSTNInfo pSTNInfo, Boolean bool3, ParticipantRoleSettings participantRoleSettings, Long l3, String str8, TenantTag tenantTag, Long l4, String str9, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mstatus = status;
        this.mis_host = bool;
        this.mringing_received = bool2;
        this.moffline_reason = offlineReason;
        this.mdevice_type = deviceType;
        this.msettings = participantSettings;
        this.mjoin_time = l;
        this.minteractive_id = str2;
        this.mtype = participantType;
        this.mcapabilities = videoChatCapabilities;
        this.minviter_id = str3;
        this.minviter_type = participantType2;
        this.mdevice_id = str4;
        this.minviter_device_id = str5;
        this.mongoing_meeting_id = str6;
        this.mongoing_meeting_interactive_id = str7;
        this.mrole = participantRole;
        this.mseq_id = l2;
        this.mpstn_info = pSTNInfo;
        this.mis_lark_guest = bool3;
        this.mparticipant_role_settings = participantRoleSettings;
        this.mhands_up_time = l3;
        this.muser_tenant_id = str8;
        this.mtenant_tag = tenantTag;
        this.mglobal_seq_id = l4;
        this.mrtc_join_id = str9;
        this.mbreakout_room_id = str10;
    }
}
