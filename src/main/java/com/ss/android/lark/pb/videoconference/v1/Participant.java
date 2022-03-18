package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
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

public final class Participant extends Message<Participant, C50904a> {
    public static final ProtoAdapter<Participant> ADAPTER = new C50905b();
    public static final DeviceType DEFAULT_DEVICE_TYPE = DeviceType.UNKNOWN_DEVICE_TYPE;
    public static final Long DEFAULT_GLOBAL_SEQ_ID = 0L;
    public static final Long DEFAULT_HANDS_UP_TIME = 0L;
    public static final ParticipantType DEFAULT_INVITER_TYPE = ParticipantType.UNKNOW;
    public static final Boolean DEFAULT_IS_HOST = false;
    public static final Boolean DEFAULT_IS_LARK_GUEST = false;
    public static final Long DEFAULT_JOIN_TIME = 0L;
    public static final OfflineReason DEFAULT_OFFLINE_REASON = OfflineReason.UNKNOWN_OFFLINE_REASON;
    public static final Boolean DEFAULT_RINGING_RECEIVED = false;
    public static final ParticipantRole DEFAULT_ROLE = ParticipantRole.UNKNOW_ROLE;
    public static final Long DEFAULT_SEQ_ID = 0L;
    public static final Status DEFAULT_STATUS = Status.UNKNOWN;
    public static final TenantTag DEFAULT_TENANT_TAG = TenantTag.STANDARD;
    public static final ParticipantType DEFAULT_TYPE = ParticipantType.LARK_USER;
    private static final long serialVersionUID = 0;
    public final String breakout_room_id;
    public final VideoChatCapabilities capabilities;
    public final String device_id;
    public final DeviceType device_type;
    public final Long global_seq_id;
    public final Long hands_up_time;
    public final String id;
    public final String interactive_id;
    public final String inviter_device_id;
    public final String inviter_id;
    public final ParticipantType inviter_type;
    public final Boolean is_host;
    public final Boolean is_lark_guest;
    public final Long join_time;
    public final OfflineReason offline_reason;
    public final String ongoing_meeting_id;
    public final String ongoing_meeting_interactive_id;
    public final ParticipantRoleSettings participant_role_settings;
    public final PSTNInfo participant_type;
    public final PSTNInfo pstn_info;
    public final Boolean ringing_received;
    public final ParticipantRole role;
    public final String rtc_join_id;
    public final Long seq_id;
    public final ParticipantSettings settings;
    public final String sort_name;
    public final Status status;
    public final TenantTag tenant_tag;
    public final ParticipantType type;
    public final String user_tenant_id;

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

    public static final class ParticipantRoleSettings extends Message<ParticipantRoleSettings, C50900a> {
        public static final ProtoAdapter<ParticipantRoleSettings> ADAPTER = new C50901b();
        public static final Boolean DEFAULT_IS_MEETING_OWNER = false;
        public static final ParticipantMeetingRole DEFAULT_MEETING_ROLE = ParticipantMeetingRole.PARTICIPANT;
        private static final long serialVersionUID = 0;
        public final Boolean is_meeting_owner;
        public final ParticipantMeetingRole meeting_role;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.Participant$ParticipantRoleSettings$b */
        private static final class C50901b extends ProtoAdapter<ParticipantRoleSettings> {
            C50901b() {
                super(FieldEncoding.LENGTH_DELIMITED, ParticipantRoleSettings.class);
            }

            /* renamed from: a */
            public int encodedSize(ParticipantRoleSettings participantRoleSettings) {
                int i;
                int i2 = 0;
                if (participantRoleSettings.meeting_role != null) {
                    i = ParticipantMeetingRole.ADAPTER.encodedSizeWithTag(1, participantRoleSettings.meeting_role);
                } else {
                    i = 0;
                }
                if (participantRoleSettings.is_meeting_owner != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, participantRoleSettings.is_meeting_owner);
                }
                return i + i2 + participantRoleSettings.unknownFields().size();
            }

            /* renamed from: a */
            public ParticipantRoleSettings decode(ProtoReader protoReader) throws IOException {
                C50900a aVar = new C50900a();
                aVar.f126837a = ParticipantMeetingRole.PARTICIPANT;
                aVar.f126838b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f126837a = ParticipantMeetingRole.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126838b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ParticipantRoleSettings participantRoleSettings) throws IOException {
                if (participantRoleSettings.meeting_role != null) {
                    ParticipantMeetingRole.ADAPTER.encodeWithTag(protoWriter, 1, participantRoleSettings.meeting_role);
                }
                if (participantRoleSettings.is_meeting_owner != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, participantRoleSettings.is_meeting_owner);
                }
                protoWriter.writeBytes(participantRoleSettings.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.Participant$ParticipantRoleSettings$a */
        public static final class C50900a extends Message.Builder<ParticipantRoleSettings, C50900a> {

            /* renamed from: a */
            public ParticipantMeetingRole f126837a;

            /* renamed from: b */
            public Boolean f126838b;

            /* renamed from: a */
            public ParticipantRoleSettings build() {
                return new ParticipantRoleSettings(this.f126837a, this.f126838b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50900a newBuilder() {
            C50900a aVar = new C50900a();
            aVar.f126837a = this.meeting_role;
            aVar.f126838b = this.is_meeting_owner;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ParticipantRoleSettings");
            StringBuilder sb = new StringBuilder();
            if (this.meeting_role != null) {
                sb.append(", meeting_role=");
                sb.append(this.meeting_role);
            }
            if (this.is_meeting_owner != null) {
                sb.append(", is_meeting_owner=");
                sb.append(this.is_meeting_owner);
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
            this.meeting_role = participantMeetingRole;
            this.is_meeting_owner = bool;
        }
    }

    public static final class VideoChatCapabilities extends Message<VideoChatCapabilities, C50902a> {
        public static final ProtoAdapter<VideoChatCapabilities> ADAPTER = new C50903b();
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
        public final Boolean become_interpreter;
        public final Boolean can_be_co_host;
        public final Boolean can_be_host;
        public final Boolean can_move_to_breakout_room_id;
        public final Boolean early_join;
        public final Boolean follow;
        public final List<String> follow_consume_strategy_ids;
        public final Boolean follow_presenter;
        public final List<String> follow_produce_strategy_ids;
        public final Boolean join_lobby;
        public final Boolean remote_control;
        public final Boolean share_screen;
        public final Boolean support_hands_up;
        public final Boolean upgrade_meeting;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.Participant$VideoChatCapabilities$b */
        private static final class C50903b extends ProtoAdapter<VideoChatCapabilities> {
            C50903b() {
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
                if (videoChatCapabilities.share_screen != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, videoChatCapabilities.share_screen);
                } else {
                    i = 0;
                }
                if (videoChatCapabilities.upgrade_meeting != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, videoChatCapabilities.upgrade_meeting);
                } else {
                    i2 = 0;
                }
                int i13 = i + i2;
                if (videoChatCapabilities.follow != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, videoChatCapabilities.follow);
                } else {
                    i3 = 0;
                }
                int i14 = i13 + i3;
                if (videoChatCapabilities.early_join != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, videoChatCapabilities.early_join);
                } else {
                    i4 = 0;
                }
                int i15 = i14 + i4;
                if (videoChatCapabilities.follow_presenter != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, videoChatCapabilities.follow_presenter);
                } else {
                    i5 = 0;
                }
                int i16 = i15 + i5;
                if (videoChatCapabilities.remote_control != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, videoChatCapabilities.remote_control);
                } else {
                    i6 = 0;
                }
                int encodedSizeWithTag = i16 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, videoChatCapabilities.follow_consume_strategy_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, videoChatCapabilities.follow_produce_strategy_ids);
                if (videoChatCapabilities.join_lobby != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, videoChatCapabilities.join_lobby);
                } else {
                    i7 = 0;
                }
                int i17 = encodedSizeWithTag + i7;
                if (videoChatCapabilities.support_hands_up != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(10, videoChatCapabilities.support_hands_up);
                } else {
                    i8 = 0;
                }
                int i18 = i17 + i8;
                if (videoChatCapabilities.become_interpreter != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(11, videoChatCapabilities.become_interpreter);
                } else {
                    i9 = 0;
                }
                int i19 = i18 + i9;
                if (videoChatCapabilities.can_move_to_breakout_room_id != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(12, videoChatCapabilities.can_move_to_breakout_room_id);
                } else {
                    i10 = 0;
                }
                int i20 = i19 + i10;
                if (videoChatCapabilities.can_be_host != null) {
                    i11 = ProtoAdapter.BOOL.encodedSizeWithTag(13, videoChatCapabilities.can_be_host);
                } else {
                    i11 = 0;
                }
                int i21 = i20 + i11;
                if (videoChatCapabilities.can_be_co_host != null) {
                    i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, videoChatCapabilities.can_be_co_host);
                }
                return i21 + i12 + videoChatCapabilities.unknownFields().size();
            }

            /* renamed from: a */
            public VideoChatCapabilities decode(ProtoReader protoReader) throws IOException {
                C50902a aVar = new C50902a();
                aVar.f126839a = false;
                aVar.f126840b = false;
                aVar.f126841c = false;
                aVar.f126842d = false;
                aVar.f126843e = false;
                aVar.f126844f = false;
                aVar.f126847i = false;
                aVar.f126848j = false;
                aVar.f126849k = false;
                aVar.f126850l = false;
                aVar.f126851m = false;
                aVar.f126852n = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f126839a = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 2:
                                aVar.f126840b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126841c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126842d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126843e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126844f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126845g.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 8:
                                aVar.f126846h.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 9:
                                aVar.f126847i = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 10:
                                aVar.f126848j = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f126849k = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                aVar.f126850l = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 13:
                                aVar.f126851m = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 14:
                                aVar.f126852n = ProtoAdapter.BOOL.decode(protoReader);
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
                if (videoChatCapabilities.share_screen != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, videoChatCapabilities.share_screen);
                }
                if (videoChatCapabilities.upgrade_meeting != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, videoChatCapabilities.upgrade_meeting);
                }
                if (videoChatCapabilities.follow != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, videoChatCapabilities.follow);
                }
                if (videoChatCapabilities.early_join != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, videoChatCapabilities.early_join);
                }
                if (videoChatCapabilities.follow_presenter != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, videoChatCapabilities.follow_presenter);
                }
                if (videoChatCapabilities.remote_control != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, videoChatCapabilities.remote_control);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, videoChatCapabilities.follow_consume_strategy_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, videoChatCapabilities.follow_produce_strategy_ids);
                if (videoChatCapabilities.join_lobby != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, videoChatCapabilities.join_lobby);
                }
                if (videoChatCapabilities.support_hands_up != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, videoChatCapabilities.support_hands_up);
                }
                if (videoChatCapabilities.become_interpreter != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, videoChatCapabilities.become_interpreter);
                }
                if (videoChatCapabilities.can_move_to_breakout_room_id != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, videoChatCapabilities.can_move_to_breakout_room_id);
                }
                if (videoChatCapabilities.can_be_host != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, videoChatCapabilities.can_be_host);
                }
                if (videoChatCapabilities.can_be_co_host != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, videoChatCapabilities.can_be_co_host);
                }
                protoWriter.writeBytes(videoChatCapabilities.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.Participant$VideoChatCapabilities$a */
        public static final class C50902a extends Message.Builder<VideoChatCapabilities, C50902a> {

            /* renamed from: a */
            public Boolean f126839a;

            /* renamed from: b */
            public Boolean f126840b;

            /* renamed from: c */
            public Boolean f126841c;

            /* renamed from: d */
            public Boolean f126842d;

            /* renamed from: e */
            public Boolean f126843e;

            /* renamed from: f */
            public Boolean f126844f;

            /* renamed from: g */
            public List<String> f126845g = Internal.newMutableList();

            /* renamed from: h */
            public List<String> f126846h = Internal.newMutableList();

            /* renamed from: i */
            public Boolean f126847i;

            /* renamed from: j */
            public Boolean f126848j;

            /* renamed from: k */
            public Boolean f126849k;

            /* renamed from: l */
            public Boolean f126850l;

            /* renamed from: m */
            public Boolean f126851m;

            /* renamed from: n */
            public Boolean f126852n;

            /* renamed from: a */
            public VideoChatCapabilities build() {
                return new VideoChatCapabilities(this.f126839a, this.f126840b, this.f126841c, this.f126842d, this.f126843e, this.f126844f, this.f126845g, this.f126846h, this.f126847i, this.f126848j, this.f126849k, this.f126850l, this.f126851m, this.f126852n, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50902a newBuilder() {
            C50902a aVar = new C50902a();
            aVar.f126839a = this.share_screen;
            aVar.f126840b = this.upgrade_meeting;
            aVar.f126841c = this.follow;
            aVar.f126842d = this.early_join;
            aVar.f126843e = this.follow_presenter;
            aVar.f126844f = this.remote_control;
            aVar.f126845g = Internal.copyOf("follow_consume_strategy_ids", this.follow_consume_strategy_ids);
            aVar.f126846h = Internal.copyOf("follow_produce_strategy_ids", this.follow_produce_strategy_ids);
            aVar.f126847i = this.join_lobby;
            aVar.f126848j = this.support_hands_up;
            aVar.f126849k = this.become_interpreter;
            aVar.f126850l = this.can_move_to_breakout_room_id;
            aVar.f126851m = this.can_be_host;
            aVar.f126852n = this.can_be_co_host;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "VideoChatCapabilities");
            StringBuilder sb = new StringBuilder();
            if (this.share_screen != null) {
                sb.append(", share_screen=");
                sb.append(this.share_screen);
            }
            if (this.upgrade_meeting != null) {
                sb.append(", upgrade_meeting=");
                sb.append(this.upgrade_meeting);
            }
            if (this.follow != null) {
                sb.append(", follow=");
                sb.append(this.follow);
            }
            if (this.early_join != null) {
                sb.append(", early_join=");
                sb.append(this.early_join);
            }
            if (this.follow_presenter != null) {
                sb.append(", follow_presenter=");
                sb.append(this.follow_presenter);
            }
            if (this.remote_control != null) {
                sb.append(", remote_control=");
                sb.append(this.remote_control);
            }
            if (!this.follow_consume_strategy_ids.isEmpty()) {
                sb.append(", follow_consume_strategy_ids=");
                sb.append(this.follow_consume_strategy_ids);
            }
            if (!this.follow_produce_strategy_ids.isEmpty()) {
                sb.append(", follow_produce_strategy_ids=");
                sb.append(this.follow_produce_strategy_ids);
            }
            if (this.join_lobby != null) {
                sb.append(", join_lobby=");
                sb.append(this.join_lobby);
            }
            if (this.support_hands_up != null) {
                sb.append(", support_hands_up=");
                sb.append(this.support_hands_up);
            }
            if (this.become_interpreter != null) {
                sb.append(", become_interpreter=");
                sb.append(this.become_interpreter);
            }
            if (this.can_move_to_breakout_room_id != null) {
                sb.append(", can_move_to_breakout_room_id=");
                sb.append(this.can_move_to_breakout_room_id);
            }
            if (this.can_be_host != null) {
                sb.append(", can_be_host=");
                sb.append(this.can_be_host);
            }
            if (this.can_be_co_host != null) {
                sb.append(", can_be_co_host=");
                sb.append(this.can_be_co_host);
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
            this.share_screen = bool;
            this.upgrade_meeting = bool2;
            this.follow = bool3;
            this.early_join = bool4;
            this.follow_presenter = bool5;
            this.remote_control = bool6;
            this.follow_consume_strategy_ids = Internal.immutableCopyOf("follow_consume_strategy_ids", list);
            this.follow_produce_strategy_ids = Internal.immutableCopyOf("follow_produce_strategy_ids", list2);
            this.join_lobby = bool7;
            this.support_hands_up = bool8;
            this.become_interpreter = bool9;
            this.can_move_to_breakout_room_id = bool10;
            this.can_be_host = bool11;
            this.can_be_co_host = bool12;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.Participant$b */
    private static final class C50905b extends ProtoAdapter<Participant> {
        C50905b() {
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
            int i25;
            int i26;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, participant.id) + Status.ADAPTER.encodedSizeWithTag(2, participant.status) + ProtoAdapter.BOOL.encodedSizeWithTag(3, participant.is_host);
            int i27 = 0;
            if (participant.ringing_received != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, participant.ringing_received);
            } else {
                i = 0;
            }
            int i28 = encodedSizeWithTag + i;
            if (participant.offline_reason != null) {
                i2 = OfflineReason.ADAPTER.encodedSizeWithTag(5, participant.offline_reason);
            } else {
                i2 = 0;
            }
            int i29 = i28 + i2;
            if (participant.device_type != null) {
                i3 = DeviceType.ADAPTER.encodedSizeWithTag(6, participant.device_type);
            } else {
                i3 = 0;
            }
            int i30 = i29 + i3;
            if (participant.settings != null) {
                i4 = ParticipantSettings.ADAPTER.encodedSizeWithTag(7, participant.settings);
            } else {
                i4 = 0;
            }
            int i31 = i30 + i4;
            if (participant.join_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(8, participant.join_time);
            } else {
                i5 = 0;
            }
            int i32 = i31 + i5;
            if (participant.interactive_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, participant.interactive_id);
            } else {
                i6 = 0;
            }
            int i33 = i32 + i6;
            if (participant.type != null) {
                i7 = ParticipantType.ADAPTER.encodedSizeWithTag(10, participant.type);
            } else {
                i7 = 0;
            }
            int i34 = i33 + i7;
            if (participant.capabilities != null) {
                i8 = VideoChatCapabilities.ADAPTER.encodedSizeWithTag(11, participant.capabilities);
            } else {
                i8 = 0;
            }
            int i35 = i34 + i8;
            if (participant.inviter_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, participant.inviter_id);
            } else {
                i9 = 0;
            }
            int i36 = i35 + i9;
            if (participant.inviter_type != null) {
                i10 = ParticipantType.ADAPTER.encodedSizeWithTag(13, participant.inviter_type);
            } else {
                i10 = 0;
            }
            int i37 = i36 + i10;
            if (participant.device_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(14, participant.device_id);
            } else {
                i11 = 0;
            }
            int i38 = i37 + i11;
            if (participant.inviter_device_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(15, participant.inviter_device_id);
            } else {
                i12 = 0;
            }
            int i39 = i38 + i12;
            if (participant.ongoing_meeting_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(16, participant.ongoing_meeting_id);
            } else {
                i13 = 0;
            }
            int i40 = i39 + i13;
            if (participant.ongoing_meeting_interactive_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(17, participant.ongoing_meeting_interactive_id);
            } else {
                i14 = 0;
            }
            int i41 = i40 + i14;
            if (participant.role != null) {
                i15 = ParticipantRole.ADAPTER.encodedSizeWithTag(18, participant.role);
            } else {
                i15 = 0;
            }
            int i42 = i41 + i15;
            if (participant.seq_id != null) {
                i16 = ProtoAdapter.INT64.encodedSizeWithTag(19, participant.seq_id);
            } else {
                i16 = 0;
            }
            int i43 = i42 + i16;
            if (participant.participant_type != null) {
                i17 = PSTNInfo.ADAPTER.encodedSizeWithTag(20, participant.participant_type);
            } else {
                i17 = 0;
            }
            int i44 = i43 + i17;
            if (participant.pstn_info != null) {
                i18 = PSTNInfo.ADAPTER.encodedSizeWithTag(21, participant.pstn_info);
            } else {
                i18 = 0;
            }
            int i45 = i44 + i18;
            if (participant.participant_role_settings != null) {
                i19 = ParticipantRoleSettings.ADAPTER.encodedSizeWithTag(23, participant.participant_role_settings);
            } else {
                i19 = 0;
            }
            int i46 = i45 + i19;
            if (participant.hands_up_time != null) {
                i20 = ProtoAdapter.INT64.encodedSizeWithTag(24, participant.hands_up_time);
            } else {
                i20 = 0;
            }
            int i47 = i46 + i20;
            if (participant.sort_name != null) {
                i21 = ProtoAdapter.STRING.encodedSizeWithTag(101, participant.sort_name);
            } else {
                i21 = 0;
            }
            int i48 = i47 + i21;
            if (participant.is_lark_guest != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(22, participant.is_lark_guest);
            } else {
                i22 = 0;
            }
            int i49 = i48 + i22;
            if (participant.user_tenant_id != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(25, participant.user_tenant_id);
            } else {
                i23 = 0;
            }
            int i50 = i49 + i23;
            if (participant.tenant_tag != null) {
                i24 = TenantTag.ADAPTER.encodedSizeWithTag(26, participant.tenant_tag);
            } else {
                i24 = 0;
            }
            int i51 = i50 + i24;
            if (participant.global_seq_id != null) {
                i25 = ProtoAdapter.INT64.encodedSizeWithTag(27, participant.global_seq_id);
            } else {
                i25 = 0;
            }
            int i52 = i51 + i25;
            if (participant.rtc_join_id != null) {
                i26 = ProtoAdapter.STRING.encodedSizeWithTag(28, participant.rtc_join_id);
            } else {
                i26 = 0;
            }
            int i53 = i52 + i26;
            if (participant.breakout_room_id != null) {
                i27 = ProtoAdapter.STRING.encodedSizeWithTag(29, participant.breakout_room_id);
            }
            return i53 + i27 + participant.unknownFields().size();
        }

        /* renamed from: a */
        public Participant decode(ProtoReader protoReader) throws IOException {
            C50904a aVar = new C50904a();
            aVar.f126857a = "";
            aVar.f126858b = Status.UNKNOWN;
            aVar.f126859c = false;
            aVar.f126860d = false;
            aVar.f126861e = OfflineReason.UNKNOWN_OFFLINE_REASON;
            aVar.f126862f = DeviceType.UNKNOWN_DEVICE_TYPE;
            aVar.f126864h = 0L;
            aVar.f126865i = "";
            aVar.f126866j = ParticipantType.LARK_USER;
            aVar.f126868l = "";
            aVar.f126869m = ParticipantType.UNKNOW;
            aVar.f126870n = "";
            aVar.f126871o = "";
            aVar.f126872p = "";
            aVar.f126873q = "";
            aVar.f126874r = ParticipantRole.UNKNOW_ROLE;
            aVar.f126875s = 0L;
            aVar.f126879w = 0L;
            aVar.f126880x = "";
            aVar.f126881y = false;
            aVar.f126882z = "";
            aVar.f126853A = TenantTag.STANDARD;
            aVar.f126854B = 0L;
            aVar.f126855C = "";
            aVar.f126856D = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 101) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126857a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f126858b = Status.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f126859c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f126860d = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 5:
                            try {
                                aVar.f126861e = OfflineReason.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f126862f = DeviceType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 7:
                            aVar.f126863g = ParticipantSettings.ADAPTER.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f126864h = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f126865i = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 10:
                            try {
                                aVar.f126866j = ParticipantType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 11:
                            aVar.f126867k = VideoChatCapabilities.ADAPTER.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126868l = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 13:
                            try {
                                aVar.f126869m = ParticipantType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 14:
                            aVar.f126870n = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 15:
                            aVar.f126871o = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 16:
                            aVar.f126872p = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 17:
                            aVar.f126873q = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 18:
                            try {
                                aVar.f126874r = ParticipantRole.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 19:
                            aVar.f126875s = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 20:
                            aVar.f126876t = PSTNInfo.ADAPTER.decode(protoReader);
                            continue;
                        case 21:
                            aVar.f126877u = PSTNInfo.ADAPTER.decode(protoReader);
                            continue;
                        case 22:
                            aVar.f126881y = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 23:
                            aVar.f126878v = ParticipantRoleSettings.ADAPTER.decode(protoReader);
                            continue;
                        case 24:
                            aVar.f126879w = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f126882z = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 26:
                            try {
                                aVar.f126853A = TenantTag.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                break;
                            }
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f126854B = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f126855C = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 29:
                            aVar.f126856D = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f126880x = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Participant participant) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, participant.id);
            Status.ADAPTER.encodeWithTag(protoWriter, 2, participant.status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, participant.is_host);
            if (participant.ringing_received != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, participant.ringing_received);
            }
            if (participant.offline_reason != null) {
                OfflineReason.ADAPTER.encodeWithTag(protoWriter, 5, participant.offline_reason);
            }
            if (participant.device_type != null) {
                DeviceType.ADAPTER.encodeWithTag(protoWriter, 6, participant.device_type);
            }
            if (participant.settings != null) {
                ParticipantSettings.ADAPTER.encodeWithTag(protoWriter, 7, participant.settings);
            }
            if (participant.join_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, participant.join_time);
            }
            if (participant.interactive_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, participant.interactive_id);
            }
            if (participant.type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 10, participant.type);
            }
            if (participant.capabilities != null) {
                VideoChatCapabilities.ADAPTER.encodeWithTag(protoWriter, 11, participant.capabilities);
            }
            if (participant.inviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, participant.inviter_id);
            }
            if (participant.inviter_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 13, participant.inviter_type);
            }
            if (participant.device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, participant.device_id);
            }
            if (participant.inviter_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, participant.inviter_device_id);
            }
            if (participant.ongoing_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, participant.ongoing_meeting_id);
            }
            if (participant.ongoing_meeting_interactive_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, participant.ongoing_meeting_interactive_id);
            }
            if (participant.role != null) {
                ParticipantRole.ADAPTER.encodeWithTag(protoWriter, 18, participant.role);
            }
            if (participant.seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, participant.seq_id);
            }
            if (participant.participant_type != null) {
                PSTNInfo.ADAPTER.encodeWithTag(protoWriter, 20, participant.participant_type);
            }
            if (participant.pstn_info != null) {
                PSTNInfo.ADAPTER.encodeWithTag(protoWriter, 21, participant.pstn_info);
            }
            if (participant.participant_role_settings != null) {
                ParticipantRoleSettings.ADAPTER.encodeWithTag(protoWriter, 23, participant.participant_role_settings);
            }
            if (participant.hands_up_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 24, participant.hands_up_time);
            }
            if (participant.sort_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 101, participant.sort_name);
            }
            if (participant.is_lark_guest != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, participant.is_lark_guest);
            }
            if (participant.user_tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, participant.user_tenant_id);
            }
            if (participant.tenant_tag != null) {
                TenantTag.ADAPTER.encodeWithTag(protoWriter, 26, participant.tenant_tag);
            }
            if (participant.global_seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 27, participant.global_seq_id);
            }
            if (participant.rtc_join_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, participant.rtc_join_id);
            }
            if (participant.breakout_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 29, participant.breakout_room_id);
            }
            protoWriter.writeBytes(participant.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.Participant$a */
    public static final class C50904a extends Message.Builder<Participant, C50904a> {

        /* renamed from: A */
        public TenantTag f126853A;

        /* renamed from: B */
        public Long f126854B;

        /* renamed from: C */
        public String f126855C;

        /* renamed from: D */
        public String f126856D;

        /* renamed from: a */
        public String f126857a;

        /* renamed from: b */
        public Status f126858b;

        /* renamed from: c */
        public Boolean f126859c;

        /* renamed from: d */
        public Boolean f126860d;

        /* renamed from: e */
        public OfflineReason f126861e;

        /* renamed from: f */
        public DeviceType f126862f;

        /* renamed from: g */
        public ParticipantSettings f126863g;

        /* renamed from: h */
        public Long f126864h;

        /* renamed from: i */
        public String f126865i;

        /* renamed from: j */
        public ParticipantType f126866j;

        /* renamed from: k */
        public VideoChatCapabilities f126867k;

        /* renamed from: l */
        public String f126868l;

        /* renamed from: m */
        public ParticipantType f126869m;

        /* renamed from: n */
        public String f126870n;

        /* renamed from: o */
        public String f126871o;

        /* renamed from: p */
        public String f126872p;

        /* renamed from: q */
        public String f126873q;

        /* renamed from: r */
        public ParticipantRole f126874r;

        /* renamed from: s */
        public Long f126875s;

        /* renamed from: t */
        public PSTNInfo f126876t;

        /* renamed from: u */
        public PSTNInfo f126877u;

        /* renamed from: v */
        public ParticipantRoleSettings f126878v;

        /* renamed from: w */
        public Long f126879w;

        /* renamed from: x */
        public String f126880x;

        /* renamed from: y */
        public Boolean f126881y;

        /* renamed from: z */
        public String f126882z;

        /* renamed from: a */
        public Participant build() {
            Status status;
            Boolean bool;
            String str = this.f126857a;
            if (str != null && (status = this.f126858b) != null && (bool = this.f126859c) != null) {
                return new Participant(str, status, bool, this.f126860d, this.f126861e, this.f126862f, this.f126863g, this.f126864h, this.f126865i, this.f126866j, this.f126867k, this.f126868l, this.f126869m, this.f126870n, this.f126871o, this.f126872p, this.f126873q, this.f126874r, this.f126875s, this.f126876t, this.f126877u, this.f126878v, this.f126879w, this.f126880x, this.f126881y, this.f126882z, this.f126853A, this.f126854B, this.f126855C, this.f126856D, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f126858b, UpdateKey.STATUS, this.f126859c, "is_host");
        }
    }

    @Override // com.squareup.wire.Message
    public C50904a newBuilder() {
        C50904a aVar = new C50904a();
        aVar.f126857a = this.id;
        aVar.f126858b = this.status;
        aVar.f126859c = this.is_host;
        aVar.f126860d = this.ringing_received;
        aVar.f126861e = this.offline_reason;
        aVar.f126862f = this.device_type;
        aVar.f126863g = this.settings;
        aVar.f126864h = this.join_time;
        aVar.f126865i = this.interactive_id;
        aVar.f126866j = this.type;
        aVar.f126867k = this.capabilities;
        aVar.f126868l = this.inviter_id;
        aVar.f126869m = this.inviter_type;
        aVar.f126870n = this.device_id;
        aVar.f126871o = this.inviter_device_id;
        aVar.f126872p = this.ongoing_meeting_id;
        aVar.f126873q = this.ongoing_meeting_interactive_id;
        aVar.f126874r = this.role;
        aVar.f126875s = this.seq_id;
        aVar.f126876t = this.participant_type;
        aVar.f126877u = this.pstn_info;
        aVar.f126878v = this.participant_role_settings;
        aVar.f126879w = this.hands_up_time;
        aVar.f126880x = this.sort_name;
        aVar.f126881y = this.is_lark_guest;
        aVar.f126882z = this.user_tenant_id;
        aVar.f126853A = this.tenant_tag;
        aVar.f126854B = this.global_seq_id;
        aVar.f126855C = this.rtc_join_id;
        aVar.f126856D = this.breakout_room_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "Participant");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", is_host=");
        sb.append(this.is_host);
        if (this.ringing_received != null) {
            sb.append(", ringing_received=");
            sb.append(this.ringing_received);
        }
        if (this.offline_reason != null) {
            sb.append(", offline_reason=");
            sb.append(this.offline_reason);
        }
        if (this.device_type != null) {
            sb.append(", device_type=");
            sb.append(this.device_type);
        }
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        if (this.join_time != null) {
            sb.append(", join_time=");
            sb.append(this.join_time);
        }
        if (this.interactive_id != null) {
            sb.append(", interactive_id=");
            sb.append(this.interactive_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.capabilities != null) {
            sb.append(", capabilities=");
            sb.append(this.capabilities);
        }
        if (this.inviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.inviter_id);
        }
        if (this.inviter_type != null) {
            sb.append(", inviter_type=");
            sb.append(this.inviter_type);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.inviter_device_id != null) {
            sb.append(", inviter_device_id=");
            sb.append(this.inviter_device_id);
        }
        if (this.ongoing_meeting_id != null) {
            sb.append(", ongoing_meeting_id=");
            sb.append(this.ongoing_meeting_id);
        }
        if (this.ongoing_meeting_interactive_id != null) {
            sb.append(", ongoing_meeting_interactive_id=");
            sb.append(this.ongoing_meeting_interactive_id);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.seq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.seq_id);
        }
        if (this.participant_type != null) {
            sb.append(", participant_type=");
            sb.append(this.participant_type);
        }
        if (this.pstn_info != null) {
            sb.append(", pstn_info=");
            sb.append(this.pstn_info);
        }
        if (this.participant_role_settings != null) {
            sb.append(", participant_role_settings=");
            sb.append(this.participant_role_settings);
        }
        if (this.hands_up_time != null) {
            sb.append(", hands_up_time=");
            sb.append(this.hands_up_time);
        }
        if (this.sort_name != null) {
            sb.append(", sort_name=");
            sb.append(this.sort_name);
        }
        if (this.is_lark_guest != null) {
            sb.append(", is_lark_guest=");
            sb.append(this.is_lark_guest);
        }
        if (this.user_tenant_id != null) {
            sb.append(", user_tenant_id=");
            sb.append(this.user_tenant_id);
        }
        if (this.tenant_tag != null) {
            sb.append(", tenant_tag=");
            sb.append(this.tenant_tag);
        }
        if (this.global_seq_id != null) {
            sb.append(", global_seq_id=");
            sb.append(this.global_seq_id);
        }
        if (this.rtc_join_id != null) {
            sb.append(", rtc_join_id=");
            sb.append(this.rtc_join_id);
        }
        if (this.breakout_room_id != null) {
            sb.append(", breakout_room_id=");
            sb.append(this.breakout_room_id);
        }
        StringBuilder replace = sb.replace(0, 2, "Participant{");
        replace.append('}');
        return replace.toString();
    }

    public Participant(String str, Status status2, Boolean bool, Boolean bool2, OfflineReason offlineReason, DeviceType deviceType, ParticipantSettings participantSettings, Long l, String str2, ParticipantType participantType, VideoChatCapabilities videoChatCapabilities, String str3, ParticipantType participantType2, String str4, String str5, String str6, String str7, ParticipantRole participantRole, Long l2, PSTNInfo pSTNInfo, PSTNInfo pSTNInfo2, ParticipantRoleSettings participantRoleSettings, Long l3, String str8, Boolean bool3, String str9, TenantTag tenantTag, Long l4, String str10, String str11) {
        this(str, status2, bool, bool2, offlineReason, deviceType, participantSettings, l, str2, participantType, videoChatCapabilities, str3, participantType2, str4, str5, str6, str7, participantRole, l2, pSTNInfo, pSTNInfo2, participantRoleSettings, l3, str8, bool3, str9, tenantTag, l4, str10, str11, ByteString.EMPTY);
    }

    public Participant(String str, Status status2, Boolean bool, Boolean bool2, OfflineReason offlineReason, DeviceType deviceType, ParticipantSettings participantSettings, Long l, String str2, ParticipantType participantType, VideoChatCapabilities videoChatCapabilities, String str3, ParticipantType participantType2, String str4, String str5, String str6, String str7, ParticipantRole participantRole, Long l2, PSTNInfo pSTNInfo, PSTNInfo pSTNInfo2, ParticipantRoleSettings participantRoleSettings, Long l3, String str8, Boolean bool3, String str9, TenantTag tenantTag, Long l4, String str10, String str11, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.status = status2;
        this.is_host = bool;
        this.ringing_received = bool2;
        this.offline_reason = offlineReason;
        this.device_type = deviceType;
        this.settings = participantSettings;
        this.join_time = l;
        this.interactive_id = str2;
        this.type = participantType;
        this.capabilities = videoChatCapabilities;
        this.inviter_id = str3;
        this.inviter_type = participantType2;
        this.device_id = str4;
        this.inviter_device_id = str5;
        this.ongoing_meeting_id = str6;
        this.ongoing_meeting_interactive_id = str7;
        this.role = participantRole;
        this.seq_id = l2;
        this.participant_type = pSTNInfo;
        this.pstn_info = pSTNInfo2;
        this.participant_role_settings = participantRoleSettings;
        this.hands_up_time = l3;
        this.sort_name = str8;
        this.is_lark_guest = bool3;
        this.user_tenant_id = str9;
        this.tenant_tag = tenantTag;
        this.global_seq_id = l4;
        this.rtc_join_id = str10;
        this.breakout_room_id = str11;
    }
}
