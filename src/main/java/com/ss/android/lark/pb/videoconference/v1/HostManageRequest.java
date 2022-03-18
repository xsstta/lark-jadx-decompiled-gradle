package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class HostManageRequest extends Message<HostManageRequest, C50749a> {
    public static final ProtoAdapter<HostManageRequest> ADAPTER = new C50750b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN_ACTION;
    public static final Boolean DEFAULT_ALLOW_PARTI_UNMUTE = false;
    public static final Boolean DEFAULT_IS_LOCKED = false;
    public static final Boolean DEFAULT_IS_MUTED = false;
    public static final Boolean DEFAULT_IS_MUTE_ON_ENTRY = false;
    public static final Boolean DEFAULT_ONLY_HOST_CAN_REPLACE_SHARE = false;
    public static final Boolean DEFAULT_ONLY_HOST_CAN_SHARE = false;
    public static final Boolean DEFAULT_ONLY_PRESENTER_CAN_ANNOTATE = false;
    public static final ParticipantType DEFAULT_PARTICIPANT_TYPE = ParticipantType.LARK_USER;
    public static final SetCoHostAction DEFAULT_SET_CO_HOST_ACTION = SetCoHostAction.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final Boolean allow_parti_unmute;
    public final String breakout_room_id;
    public final BreakoutRoomManage breakout_room_manage_info;
    public final String global_spoken_language;
    public final InterpretationSetting interpretation_setting;
    public final Boolean is_locked;
    public final Boolean is_mute_on_entry;
    public final Boolean is_muted;
    public final MeetingBroadcastInfo meeting_broadcast_info;
    public final String meeting_id;
    public final Boolean only_host_can_replace_share;
    public final Boolean only_host_can_share;
    public final Boolean only_presenter_can_annotate;
    public final String participant_device_id;
    public final String participant_id;
    public final ParticipantType participant_type;
    public final VideoChatSecuritySetting security_setting;
    public final SetCoHostAction set_co_host_action;
    public final String topic;

    public enum Action implements WireEnum {
        UNKNOWN_ACTION(0),
        KICK_OUT_PARTICIPANT(1),
        TRANSFER_HOST(2),
        MUTE_MICROPHONE(3),
        MUTE_CAMERA(4),
        MUTE_ALL_MICROPHONE(5),
        LOCK_MEETING(6),
        CHANGE_TOPIC(7),
        MUTE_ON_ENTRY(8),
        SET_SECURITY_LEVEL(9),
        APPLY_GLOBAL_SPOKEN_LANGUAGE(10),
        ALLOW_PARTI_UNMUTE(11),
        SET_CO_HOST(12),
        SET_ONLY_HOST_CAN_SHARE(13),
        SET_ONLY_HOST_CAN_REPLACE_SHARE(14),
        STOP_CURRENT_SHARING(15),
        SET_INTERPRETATION_ACTION(16),
        SET_ONLY_PRESENTER_CAN_ANNOTATE(17),
        MANAGE_BREAKOUT_ROOM(18),
        MEETING_BROADCAST(19);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_ACTION;
                case 1:
                    return KICK_OUT_PARTICIPANT;
                case 2:
                    return TRANSFER_HOST;
                case 3:
                    return MUTE_MICROPHONE;
                case 4:
                    return MUTE_CAMERA;
                case 5:
                    return MUTE_ALL_MICROPHONE;
                case 6:
                    return LOCK_MEETING;
                case 7:
                    return CHANGE_TOPIC;
                case 8:
                    return MUTE_ON_ENTRY;
                case 9:
                    return SET_SECURITY_LEVEL;
                case 10:
                    return APPLY_GLOBAL_SPOKEN_LANGUAGE;
                case 11:
                    return ALLOW_PARTI_UNMUTE;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return SET_CO_HOST;
                case 13:
                    return SET_ONLY_HOST_CAN_SHARE;
                case 14:
                    return SET_ONLY_HOST_CAN_REPLACE_SHARE;
                case 15:
                    return STOP_CURRENT_SHARING;
                case 16:
                    return SET_INTERPRETATION_ACTION;
                case 17:
                    return SET_ONLY_PRESENTER_CAN_ANNOTATE;
                case 18:
                    return MANAGE_BREAKOUT_ROOM;
                case 19:
                    return MEETING_BROADCAST;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum SetCoHostAction implements WireEnum {
        UNKNOWN(0),
        SET(1),
        UNSET(2);
        
        public static final ProtoAdapter<SetCoHostAction> ADAPTER = ProtoAdapter.newEnumAdapter(SetCoHostAction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SetCoHostAction fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SET;
            }
            if (i != 2) {
                return null;
            }
            return UNSET;
        }

        private SetCoHostAction(int i) {
            this.value = i;
        }
    }

    public static final class InterpretationSetting extends Message<InterpretationSetting, C50743a> {
        public static final ProtoAdapter<InterpretationSetting> ADAPTER = new C50744b();
        public static final Boolean DEFAULT_IS_OPEN_INTERPRETATION = false;
        private static final long serialVersionUID = 0;
        public final List<SetInterpreter> interpreter_settings;
        public final Boolean is_open_interpretation;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageRequest$InterpretationSetting$b */
        private static final class C50744b extends ProtoAdapter<InterpretationSetting> {
            C50744b() {
                super(FieldEncoding.LENGTH_DELIMITED, InterpretationSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(InterpretationSetting interpretationSetting) {
                int i;
                if (interpretationSetting.is_open_interpretation != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, interpretationSetting.is_open_interpretation);
                } else {
                    i = 0;
                }
                return i + SetInterpreter.ADAPTER.asRepeated().encodedSizeWithTag(2, interpretationSetting.interpreter_settings) + interpretationSetting.unknownFields().size();
            }

            /* renamed from: a */
            public InterpretationSetting decode(ProtoReader protoReader) throws IOException {
                C50743a aVar = new C50743a();
                aVar.f126505a = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126505a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126506b.add(SetInterpreter.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, InterpretationSetting interpretationSetting) throws IOException {
                if (interpretationSetting.is_open_interpretation != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, interpretationSetting.is_open_interpretation);
                }
                SetInterpreter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, interpretationSetting.interpreter_settings);
                protoWriter.writeBytes(interpretationSetting.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageRequest$InterpretationSetting$a */
        public static final class C50743a extends Message.Builder<InterpretationSetting, C50743a> {

            /* renamed from: a */
            public Boolean f126505a;

            /* renamed from: b */
            public List<SetInterpreter> f126506b = Internal.newMutableList();

            /* renamed from: a */
            public InterpretationSetting build() {
                return new InterpretationSetting(this.f126505a, this.f126506b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50743a newBuilder() {
            C50743a aVar = new C50743a();
            aVar.f126505a = this.is_open_interpretation;
            aVar.f126506b = Internal.copyOf("interpreter_settings", this.interpreter_settings);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "InterpretationSetting");
            StringBuilder sb = new StringBuilder();
            if (this.is_open_interpretation != null) {
                sb.append(", is_open_interpretation=");
                sb.append(this.is_open_interpretation);
            }
            if (!this.interpreter_settings.isEmpty()) {
                sb.append(", interpreter_settings=");
                sb.append(this.interpreter_settings);
            }
            StringBuilder replace = sb.replace(0, 2, "InterpretationSetting{");
            replace.append('}');
            return replace.toString();
        }

        public InterpretationSetting(Boolean bool, List<SetInterpreter> list) {
            this(bool, list, ByteString.EMPTY);
        }

        public InterpretationSetting(Boolean bool, List<SetInterpreter> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_open_interpretation = bool;
            this.interpreter_settings = Internal.immutableCopyOf("interpreter_settings", list);
        }
    }

    public static final class MeetingBroadcastInfo extends Message<MeetingBroadcastInfo, C50745a> {
        public static final ProtoAdapter<MeetingBroadcastInfo> ADAPTER = new C50746b();
        private static final long serialVersionUID = 0;
        public final String broadcast_text;
        public final List<ByteviewUser> users;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageRequest$MeetingBroadcastInfo$b */
        private static final class C50746b extends ProtoAdapter<MeetingBroadcastInfo> {
            C50746b() {
                super(FieldEncoding.LENGTH_DELIMITED, MeetingBroadcastInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(MeetingBroadcastInfo meetingBroadcastInfo) {
                int i;
                if (meetingBroadcastInfo.broadcast_text != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingBroadcastInfo.broadcast_text);
                } else {
                    i = 0;
                }
                return i + ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(2, meetingBroadcastInfo.users) + meetingBroadcastInfo.unknownFields().size();
            }

            /* renamed from: a */
            public MeetingBroadcastInfo decode(ProtoReader protoReader) throws IOException {
                C50745a aVar = new C50745a();
                aVar.f126507a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126507a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126508b.add(ByteviewUser.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MeetingBroadcastInfo meetingBroadcastInfo) throws IOException {
                if (meetingBroadcastInfo.broadcast_text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingBroadcastInfo.broadcast_text);
                }
                ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, meetingBroadcastInfo.users);
                protoWriter.writeBytes(meetingBroadcastInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageRequest$MeetingBroadcastInfo$a */
        public static final class C50745a extends Message.Builder<MeetingBroadcastInfo, C50745a> {

            /* renamed from: a */
            public String f126507a;

            /* renamed from: b */
            public List<ByteviewUser> f126508b = Internal.newMutableList();

            /* renamed from: a */
            public MeetingBroadcastInfo build() {
                return new MeetingBroadcastInfo(this.f126507a, this.f126508b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50745a newBuilder() {
            C50745a aVar = new C50745a();
            aVar.f126507a = this.broadcast_text;
            aVar.f126508b = Internal.copyOf("users", this.users);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "MeetingBroadcastInfo");
            StringBuilder sb = new StringBuilder();
            if (this.broadcast_text != null) {
                sb.append(", broadcast_text=");
                sb.append(this.broadcast_text);
            }
            if (!this.users.isEmpty()) {
                sb.append(", users=");
                sb.append(this.users);
            }
            StringBuilder replace = sb.replace(0, 2, "MeetingBroadcastInfo{");
            replace.append('}');
            return replace.toString();
        }

        public MeetingBroadcastInfo(String str, List<ByteviewUser> list) {
            this(str, list, ByteString.EMPTY);
        }

        public MeetingBroadcastInfo(String str, List<ByteviewUser> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.broadcast_text = str;
            this.users = Internal.immutableCopyOf("users", list);
        }
    }

    public static final class SetInterpreter extends Message<SetInterpreter, C50747a> {
        public static final ProtoAdapter<SetInterpreter> ADAPTER = new C50748b();
        public static final Boolean DEFAULT_IS_DELETE_INTERPRETER = false;
        private static final long serialVersionUID = 0;
        public final InterpreterSetting interpreter_setting;
        public final Boolean is_delete_interpreter;
        public final ByteviewUser user;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageRequest$SetInterpreter$b */
        private static final class C50748b extends ProtoAdapter<SetInterpreter> {
            C50748b() {
                super(FieldEncoding.LENGTH_DELIMITED, SetInterpreter.class);
            }

            /* renamed from: a */
            public int encodedSize(SetInterpreter setInterpreter) {
                int i;
                int i2;
                int i3 = 0;
                if (setInterpreter.user != null) {
                    i = ByteviewUser.ADAPTER.encodedSizeWithTag(1, setInterpreter.user);
                } else {
                    i = 0;
                }
                if (setInterpreter.interpreter_setting != null) {
                    i2 = InterpreterSetting.ADAPTER.encodedSizeWithTag(2, setInterpreter.interpreter_setting);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (setInterpreter.is_delete_interpreter != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, setInterpreter.is_delete_interpreter);
                }
                return i4 + i3 + setInterpreter.unknownFields().size();
            }

            /* renamed from: a */
            public SetInterpreter decode(ProtoReader protoReader) throws IOException {
                C50747a aVar = new C50747a();
                aVar.f126511c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126509a = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126510b = InterpreterSetting.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126511c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SetInterpreter setInterpreter) throws IOException {
                if (setInterpreter.user != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, setInterpreter.user);
                }
                if (setInterpreter.interpreter_setting != null) {
                    InterpreterSetting.ADAPTER.encodeWithTag(protoWriter, 2, setInterpreter.interpreter_setting);
                }
                if (setInterpreter.is_delete_interpreter != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, setInterpreter.is_delete_interpreter);
                }
                protoWriter.writeBytes(setInterpreter.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageRequest$SetInterpreter$a */
        public static final class C50747a extends Message.Builder<SetInterpreter, C50747a> {

            /* renamed from: a */
            public ByteviewUser f126509a;

            /* renamed from: b */
            public InterpreterSetting f126510b;

            /* renamed from: c */
            public Boolean f126511c;

            /* renamed from: a */
            public SetInterpreter build() {
                return new SetInterpreter(this.f126509a, this.f126510b, this.f126511c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50747a newBuilder() {
            C50747a aVar = new C50747a();
            aVar.f126509a = this.user;
            aVar.f126510b = this.interpreter_setting;
            aVar.f126511c = this.is_delete_interpreter;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SetInterpreter");
            StringBuilder sb = new StringBuilder();
            if (this.user != null) {
                sb.append(", user=");
                sb.append(this.user);
            }
            if (this.interpreter_setting != null) {
                sb.append(", interpreter_setting=");
                sb.append(this.interpreter_setting);
            }
            if (this.is_delete_interpreter != null) {
                sb.append(", is_delete_interpreter=");
                sb.append(this.is_delete_interpreter);
            }
            StringBuilder replace = sb.replace(0, 2, "SetInterpreter{");
            replace.append('}');
            return replace.toString();
        }

        public SetInterpreter(ByteviewUser byteviewUser, InterpreterSetting interpreterSetting, Boolean bool) {
            this(byteviewUser, interpreterSetting, bool, ByteString.EMPTY);
        }

        public SetInterpreter(ByteviewUser byteviewUser, InterpreterSetting interpreterSetting, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user = byteviewUser;
            this.interpreter_setting = interpreterSetting;
            this.is_delete_interpreter = bool;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageRequest$b */
    private static final class C50750b extends ProtoAdapter<HostManageRequest> {
        C50750b() {
            super(FieldEncoding.LENGTH_DELIMITED, HostManageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(HostManageRequest hostManageRequest) {
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
            int encodedSizeWithTag = Action.ADAPTER.encodedSizeWithTag(1, hostManageRequest.action) + ProtoAdapter.STRING.encodedSizeWithTag(2, hostManageRequest.meeting_id);
            int i18 = 0;
            if (hostManageRequest.is_muted != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(3, hostManageRequest.is_muted);
            } else {
                i = 0;
            }
            int i19 = encodedSizeWithTag + i;
            if (hostManageRequest.participant_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, hostManageRequest.participant_id);
            } else {
                i2 = 0;
            }
            int i20 = i19 + i2;
            if (hostManageRequest.participant_type != null) {
                i3 = ParticipantType.ADAPTER.encodedSizeWithTag(5, hostManageRequest.participant_type);
            } else {
                i3 = 0;
            }
            int i21 = i20 + i3;
            if (hostManageRequest.participant_device_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, hostManageRequest.participant_device_id);
            } else {
                i4 = 0;
            }
            int i22 = i21 + i4;
            if (hostManageRequest.is_locked != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(7, hostManageRequest.is_locked);
            } else {
                i5 = 0;
            }
            int i23 = i22 + i5;
            if (hostManageRequest.topic != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, hostManageRequest.topic);
            } else {
                i6 = 0;
            }
            int i24 = i23 + i6;
            if (hostManageRequest.is_mute_on_entry != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, hostManageRequest.is_mute_on_entry);
            } else {
                i7 = 0;
            }
            int i25 = i24 + i7;
            if (hostManageRequest.security_setting != null) {
                i8 = VideoChatSecuritySetting.ADAPTER.encodedSizeWithTag(10, hostManageRequest.security_setting);
            } else {
                i8 = 0;
            }
            int i26 = i25 + i8;
            if (hostManageRequest.global_spoken_language != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(11, hostManageRequest.global_spoken_language);
            } else {
                i9 = 0;
            }
            int i27 = i26 + i9;
            if (hostManageRequest.allow_parti_unmute != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(12, hostManageRequest.allow_parti_unmute);
            } else {
                i10 = 0;
            }
            int i28 = i27 + i10;
            if (hostManageRequest.set_co_host_action != null) {
                i11 = SetCoHostAction.ADAPTER.encodedSizeWithTag(13, hostManageRequest.set_co_host_action);
            } else {
                i11 = 0;
            }
            int i29 = i28 + i11;
            if (hostManageRequest.only_host_can_share != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, hostManageRequest.only_host_can_share);
            } else {
                i12 = 0;
            }
            int i30 = i29 + i12;
            if (hostManageRequest.only_host_can_replace_share != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(15, hostManageRequest.only_host_can_replace_share);
            } else {
                i13 = 0;
            }
            int i31 = i30 + i13;
            if (hostManageRequest.interpretation_setting != null) {
                i14 = InterpretationSetting.ADAPTER.encodedSizeWithTag(16, hostManageRequest.interpretation_setting);
            } else {
                i14 = 0;
            }
            int i32 = i31 + i14;
            if (hostManageRequest.only_presenter_can_annotate != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(17, hostManageRequest.only_presenter_can_annotate);
            } else {
                i15 = 0;
            }
            int i33 = i32 + i15;
            if (hostManageRequest.breakout_room_manage_info != null) {
                i16 = BreakoutRoomManage.ADAPTER.encodedSizeWithTag(18, hostManageRequest.breakout_room_manage_info);
            } else {
                i16 = 0;
            }
            int i34 = i33 + i16;
            if (hostManageRequest.meeting_broadcast_info != null) {
                i17 = MeetingBroadcastInfo.ADAPTER.encodedSizeWithTag(19, hostManageRequest.meeting_broadcast_info);
            } else {
                i17 = 0;
            }
            int i35 = i34 + i17;
            if (hostManageRequest.breakout_room_id != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(20, hostManageRequest.breakout_room_id);
            }
            return i35 + i18 + hostManageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public HostManageRequest decode(ProtoReader protoReader) throws IOException {
            C50749a aVar = new C50749a();
            aVar.f126512a = Action.UNKNOWN_ACTION;
            aVar.f126513b = "";
            aVar.f126514c = false;
            aVar.f126515d = "";
            aVar.f126516e = ParticipantType.LARK_USER;
            aVar.f126517f = "";
            aVar.f126518g = false;
            aVar.f126519h = "";
            aVar.f126520i = false;
            aVar.f126522k = "";
            aVar.f126523l = false;
            aVar.f126524m = SetCoHostAction.UNKNOWN;
            aVar.f126525n = false;
            aVar.f126526o = false;
            aVar.f126528q = false;
            aVar.f126531t = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f126512a = Action.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f126513b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126514c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126515d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f126516e = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f126517f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126518g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126519h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126520i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126521j = VideoChatSecuritySetting.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f126522k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126523l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f126524m = SetCoHostAction.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 14:
                            aVar.f126525n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f126526o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f126527p = InterpretationSetting.ADAPTER.decode(protoReader);
                            break;
                        case 17:
                            aVar.f126528q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            aVar.f126529r = BreakoutRoomManage.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            aVar.f126530s = MeetingBroadcastInfo.ADAPTER.decode(protoReader);
                            break;
                        case 20:
                            aVar.f126531t = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, HostManageRequest hostManageRequest) throws IOException {
            Action.ADAPTER.encodeWithTag(protoWriter, 1, hostManageRequest.action);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hostManageRequest.meeting_id);
            if (hostManageRequest.is_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, hostManageRequest.is_muted);
            }
            if (hostManageRequest.participant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, hostManageRequest.participant_id);
            }
            if (hostManageRequest.participant_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 5, hostManageRequest.participant_type);
            }
            if (hostManageRequest.participant_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, hostManageRequest.participant_device_id);
            }
            if (hostManageRequest.is_locked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, hostManageRequest.is_locked);
            }
            if (hostManageRequest.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, hostManageRequest.topic);
            }
            if (hostManageRequest.is_mute_on_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, hostManageRequest.is_mute_on_entry);
            }
            if (hostManageRequest.security_setting != null) {
                VideoChatSecuritySetting.ADAPTER.encodeWithTag(protoWriter, 10, hostManageRequest.security_setting);
            }
            if (hostManageRequest.global_spoken_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, hostManageRequest.global_spoken_language);
            }
            if (hostManageRequest.allow_parti_unmute != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, hostManageRequest.allow_parti_unmute);
            }
            if (hostManageRequest.set_co_host_action != null) {
                SetCoHostAction.ADAPTER.encodeWithTag(protoWriter, 13, hostManageRequest.set_co_host_action);
            }
            if (hostManageRequest.only_host_can_share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, hostManageRequest.only_host_can_share);
            }
            if (hostManageRequest.only_host_can_replace_share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, hostManageRequest.only_host_can_replace_share);
            }
            if (hostManageRequest.interpretation_setting != null) {
                InterpretationSetting.ADAPTER.encodeWithTag(protoWriter, 16, hostManageRequest.interpretation_setting);
            }
            if (hostManageRequest.only_presenter_can_annotate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, hostManageRequest.only_presenter_can_annotate);
            }
            if (hostManageRequest.breakout_room_manage_info != null) {
                BreakoutRoomManage.ADAPTER.encodeWithTag(protoWriter, 18, hostManageRequest.breakout_room_manage_info);
            }
            if (hostManageRequest.meeting_broadcast_info != null) {
                MeetingBroadcastInfo.ADAPTER.encodeWithTag(protoWriter, 19, hostManageRequest.meeting_broadcast_info);
            }
            if (hostManageRequest.breakout_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, hostManageRequest.breakout_room_id);
            }
            protoWriter.writeBytes(hostManageRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50749a newBuilder() {
        C50749a aVar = new C50749a();
        aVar.f126512a = this.action;
        aVar.f126513b = this.meeting_id;
        aVar.f126514c = this.is_muted;
        aVar.f126515d = this.participant_id;
        aVar.f126516e = this.participant_type;
        aVar.f126517f = this.participant_device_id;
        aVar.f126518g = this.is_locked;
        aVar.f126519h = this.topic;
        aVar.f126520i = this.is_mute_on_entry;
        aVar.f126521j = this.security_setting;
        aVar.f126522k = this.global_spoken_language;
        aVar.f126523l = this.allow_parti_unmute;
        aVar.f126524m = this.set_co_host_action;
        aVar.f126525n = this.only_host_can_share;
        aVar.f126526o = this.only_host_can_replace_share;
        aVar.f126527p = this.interpretation_setting;
        aVar.f126528q = this.only_presenter_can_annotate;
        aVar.f126529r = this.breakout_room_manage_info;
        aVar.f126530s = this.meeting_broadcast_info;
        aVar.f126531t = this.breakout_room_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HostManageRequest$a */
    public static final class C50749a extends Message.Builder<HostManageRequest, C50749a> {

        /* renamed from: a */
        public Action f126512a;

        /* renamed from: b */
        public String f126513b;

        /* renamed from: c */
        public Boolean f126514c;

        /* renamed from: d */
        public String f126515d;

        /* renamed from: e */
        public ParticipantType f126516e;

        /* renamed from: f */
        public String f126517f;

        /* renamed from: g */
        public Boolean f126518g;

        /* renamed from: h */
        public String f126519h;

        /* renamed from: i */
        public Boolean f126520i;

        /* renamed from: j */
        public VideoChatSecuritySetting f126521j;

        /* renamed from: k */
        public String f126522k;

        /* renamed from: l */
        public Boolean f126523l;

        /* renamed from: m */
        public SetCoHostAction f126524m;

        /* renamed from: n */
        public Boolean f126525n;

        /* renamed from: o */
        public Boolean f126526o;

        /* renamed from: p */
        public InterpretationSetting f126527p;

        /* renamed from: q */
        public Boolean f126528q;

        /* renamed from: r */
        public BreakoutRoomManage f126529r;

        /* renamed from: s */
        public MeetingBroadcastInfo f126530s;

        /* renamed from: t */
        public String f126531t;

        /* renamed from: a */
        public HostManageRequest build() {
            String str;
            Action action = this.f126512a;
            if (action != null && (str = this.f126513b) != null) {
                return new HostManageRequest(action, str, this.f126514c, this.f126515d, this.f126516e, this.f126517f, this.f126518g, this.f126519h, this.f126520i, this.f126521j, this.f126522k, this.f126523l, this.f126524m, this.f126525n, this.f126526o, this.f126527p, this.f126528q, this.f126529r, this.f126530s, this.f126531t, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(action, "action", this.f126513b, "meeting_id");
        }

        /* renamed from: a */
        public C50749a mo175493a(BreakoutRoomManage breakoutRoomManage) {
            this.f126529r = breakoutRoomManage;
            return this;
        }

        /* renamed from: b */
        public C50749a mo175501b(Boolean bool) {
            this.f126520i = bool;
            return this;
        }

        /* renamed from: c */
        public C50749a mo175503c(Boolean bool) {
            this.f126523l = bool;
            return this;
        }

        /* renamed from: d */
        public C50749a mo175505d(Boolean bool) {
            this.f126525n = bool;
            return this;
        }

        /* renamed from: e */
        public C50749a mo175507e(Boolean bool) {
            this.f126526o = bool;
            return this;
        }

        /* renamed from: f */
        public C50749a mo175509f(Boolean bool) {
            this.f126528q = bool;
            return this;
        }

        /* renamed from: a */
        public C50749a mo175494a(Action action) {
            this.f126512a = action;
            return this;
        }

        /* renamed from: b */
        public C50749a mo175502b(String str) {
            this.f126515d = str;
            return this;
        }

        /* renamed from: c */
        public C50749a mo175504c(String str) {
            this.f126517f = str;
            return this;
        }

        /* renamed from: d */
        public C50749a mo175506d(String str) {
            this.f126519h = str;
            return this;
        }

        /* renamed from: e */
        public C50749a mo175508e(String str) {
            this.f126522k = str;
            return this;
        }

        /* renamed from: a */
        public C50749a mo175495a(SetCoHostAction setCoHostAction) {
            this.f126524m = setCoHostAction;
            return this;
        }

        /* renamed from: a */
        public C50749a mo175496a(ParticipantType participantType) {
            this.f126516e = participantType;
            return this;
        }

        /* renamed from: a */
        public C50749a mo175497a(VideoChatSecuritySetting videoChatSecuritySetting) {
            this.f126521j = videoChatSecuritySetting;
            return this;
        }

        /* renamed from: a */
        public C50749a mo175498a(Boolean bool) {
            this.f126514c = bool;
            return this;
        }

        /* renamed from: a */
        public C50749a mo175499a(String str) {
            this.f126513b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "HostManageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (this.is_muted != null) {
            sb.append(", is_muted=");
            sb.append(this.is_muted);
        }
        if (this.participant_id != null) {
            sb.append(", participant_id=");
            sb.append(this.participant_id);
        }
        if (this.participant_type != null) {
            sb.append(", participant_type=");
            sb.append(this.participant_type);
        }
        if (this.participant_device_id != null) {
            sb.append(", participant_device_id=");
            sb.append(this.participant_device_id);
        }
        if (this.is_locked != null) {
            sb.append(", is_locked=");
            sb.append(this.is_locked);
        }
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.is_mute_on_entry != null) {
            sb.append(", is_mute_on_entry=");
            sb.append(this.is_mute_on_entry);
        }
        if (this.security_setting != null) {
            sb.append(", security_setting=");
            sb.append(this.security_setting);
        }
        if (this.global_spoken_language != null) {
            sb.append(", global_spoken_language=");
            sb.append(this.global_spoken_language);
        }
        if (this.allow_parti_unmute != null) {
            sb.append(", allow_parti_unmute=");
            sb.append(this.allow_parti_unmute);
        }
        if (this.set_co_host_action != null) {
            sb.append(", set_co_host_action=");
            sb.append(this.set_co_host_action);
        }
        if (this.only_host_can_share != null) {
            sb.append(", only_host_can_share=");
            sb.append(this.only_host_can_share);
        }
        if (this.only_host_can_replace_share != null) {
            sb.append(", only_host_can_replace_share=");
            sb.append(this.only_host_can_replace_share);
        }
        if (this.interpretation_setting != null) {
            sb.append(", interpretation_setting=");
            sb.append(this.interpretation_setting);
        }
        if (this.only_presenter_can_annotate != null) {
            sb.append(", only_presenter_can_annotate=");
            sb.append(this.only_presenter_can_annotate);
        }
        if (this.breakout_room_manage_info != null) {
            sb.append(", breakout_room_manage_info=");
            sb.append(this.breakout_room_manage_info);
        }
        if (this.meeting_broadcast_info != null) {
            sb.append(", meeting_broadcast_info=");
            sb.append(this.meeting_broadcast_info);
        }
        if (this.breakout_room_id != null) {
            sb.append(", breakout_room_id=");
            sb.append(this.breakout_room_id);
        }
        StringBuilder replace = sb.replace(0, 2, "HostManageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public HostManageRequest(Action action2, String str, Boolean bool, String str2, ParticipantType participantType, String str3, Boolean bool2, String str4, Boolean bool3, VideoChatSecuritySetting videoChatSecuritySetting, String str5, Boolean bool4, SetCoHostAction setCoHostAction, Boolean bool5, Boolean bool6, InterpretationSetting interpretationSetting, Boolean bool7, BreakoutRoomManage breakoutRoomManage, MeetingBroadcastInfo meetingBroadcastInfo, String str6) {
        this(action2, str, bool, str2, participantType, str3, bool2, str4, bool3, videoChatSecuritySetting, str5, bool4, setCoHostAction, bool5, bool6, interpretationSetting, bool7, breakoutRoomManage, meetingBroadcastInfo, str6, ByteString.EMPTY);
    }

    public HostManageRequest(Action action2, String str, Boolean bool, String str2, ParticipantType participantType, String str3, Boolean bool2, String str4, Boolean bool3, VideoChatSecuritySetting videoChatSecuritySetting, String str5, Boolean bool4, SetCoHostAction setCoHostAction, Boolean bool5, Boolean bool6, InterpretationSetting interpretationSetting, Boolean bool7, BreakoutRoomManage breakoutRoomManage, MeetingBroadcastInfo meetingBroadcastInfo, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action = action2;
        this.meeting_id = str;
        this.is_muted = bool;
        this.participant_id = str2;
        this.participant_type = participantType;
        this.participant_device_id = str3;
        this.is_locked = bool2;
        this.topic = str4;
        this.is_mute_on_entry = bool3;
        this.security_setting = videoChatSecuritySetting;
        this.global_spoken_language = str5;
        this.allow_parti_unmute = bool4;
        this.set_co_host_action = setCoHostAction;
        this.only_host_can_share = bool5;
        this.only_host_can_replace_share = bool6;
        this.interpretation_setting = interpretationSetting;
        this.only_presenter_can_annotate = bool7;
        this.breakout_room_manage_info = breakoutRoomManage;
        this.meeting_broadcast_info = meetingBroadcastInfo;
        this.breakout_room_id = str6;
    }
}
