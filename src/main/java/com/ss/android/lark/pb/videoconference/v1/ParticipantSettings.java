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
import com.ss.android.lark.pb.videoconference.v1.FollowAction;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ParticipantSettings extends Message<ParticipantSettings, C50910a> {
    public static final ProtoAdapter<ParticipantSettings> ADAPTER = new C50911b();
    public static final EquipmentStatus DEFAULT_CAMERA_STATUS = EquipmentStatus.UNKNOWN;
    public static final Boolean DEFAULT_ENABLE_SUBTITLE_RECORD = false;
    public static final Boolean DEFAULT_FOLLOWING_STATUS = false;
    public static final HandsStatus DEFAULT_HANDS_STATUS = HandsStatus.UNKNOWN_HANDS_STATUS;
    public static final Boolean DEFAULT_IS_CAMERA_MUTED = false;
    public static final Boolean DEFAULT_IS_MICROPHONE_MUTED = false;
    public static final Boolean DEFAULT_IS_TRANSLATION_ON = false;
    public static final EquipmentStatus DEFAULT_MICROPHONE_STATUS = EquipmentStatus.UNKNOWN;
    public static final Boolean DEFAULT_PLAY_ENTER_EXIT_CHIMES = false;
    public static final RtcMode DEFAULT_RTC_MODE = RtcMode.RTCMODE_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String applied_spoken_language;
    public final EquipmentStatus camera_status;
    public final Boolean enable_subtitle_record;
    public final List<FollowAction.Type> follow_types;
    public final Boolean following_status;
    public final HandsStatus hands_status;
    public final InterpreterSetting interpreter_setting;
    public final Boolean is_camera_muted;
    public final Boolean is_microphone_muted;
    public final Boolean is_translation_on;
    public final EquipmentStatus microphone_status;
    public final String nickname;
    public final Boolean play_enter_exit_chimes;
    public final RtcMode rtc_mode;
    public final String spoken_language;
    public final String subtitle_language;

    public enum EquipmentStatus implements WireEnum {
        UNKNOWN(0),
        NOT_EXIST(1),
        NO_PERMISSION(2),
        UNAVAILABLE(3),
        NORMAL(4);
        
        public static final ProtoAdapter<EquipmentStatus> ADAPTER = ProtoAdapter.newEnumAdapter(EquipmentStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EquipmentStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return NOT_EXIST;
            }
            if (i == 2) {
                return NO_PERMISSION;
            }
            if (i == 3) {
                return UNAVAILABLE;
            }
            if (i != 4) {
                return null;
            }
            return NORMAL;
        }

        private EquipmentStatus(int i) {
            this.value = i;
        }
    }

    public enum HandsStatus implements WireEnum {
        UNKNOWN_HANDS_STATUS(0),
        PUT_UP(1),
        PUT_DOWN(2),
        APPROVED(3),
        REJECT(4);
        
        public static final ProtoAdapter<HandsStatus> ADAPTER = ProtoAdapter.newEnumAdapter(HandsStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static HandsStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_HANDS_STATUS;
            }
            if (i == 1) {
                return PUT_UP;
            }
            if (i == 2) {
                return PUT_DOWN;
            }
            if (i == 3) {
                return APPROVED;
            }
            if (i != 4) {
                return null;
            }
            return REJECT;
        }

        private HandsStatus(int i) {
            this.value = i;
        }
    }

    public enum RtcMode implements WireEnum {
        RTCMODE_UNKNOWN(0),
        RTCMODE_NORMAL(1),
        RTCMODE_AUDIENCE(2);
        
        public static final ProtoAdapter<RtcMode> ADAPTER = ProtoAdapter.newEnumAdapter(RtcMode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RtcMode fromValue(int i) {
            if (i == 0) {
                return RTCMODE_UNKNOWN;
            }
            if (i == 1) {
                return RTCMODE_NORMAL;
            }
            if (i != 2) {
                return null;
            }
            return RTCMODE_AUDIENCE;
        }

        private RtcMode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ParticipantSettings$b */
    private static final class C50911b extends ProtoAdapter<ParticipantSettings> {
        C50911b() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantSettings.class);
        }

        /* renamed from: a */
        public int encodedSize(ParticipantSettings participantSettings) {
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
            int i15 = 0;
            if (participantSettings.is_microphone_muted != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, participantSettings.is_microphone_muted);
            } else {
                i = 0;
            }
            if (participantSettings.is_camera_muted != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, participantSettings.is_camera_muted);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (participantSettings.microphone_status != null) {
                i3 = EquipmentStatus.ADAPTER.encodedSizeWithTag(3, participantSettings.microphone_status);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (participantSettings.camera_status != null) {
                i4 = EquipmentStatus.ADAPTER.encodedSizeWithTag(4, participantSettings.camera_status);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (participantSettings.play_enter_exit_chimes != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, participantSettings.play_enter_exit_chimes);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (participantSettings.following_status != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, participantSettings.following_status);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag = i19 + i6 + FollowAction.Type.ADAPTER.asRepeated().encodedSizeWithTag(7, participantSettings.follow_types);
            if (participantSettings.is_translation_on != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, participantSettings.is_translation_on);
            } else {
                i7 = 0;
            }
            int i20 = encodedSizeWithTag + i7;
            if (participantSettings.subtitle_language != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, participantSettings.subtitle_language);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (participantSettings.spoken_language != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, participantSettings.spoken_language);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (participantSettings.nickname != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, participantSettings.nickname);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (participantSettings.enable_subtitle_record != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, participantSettings.enable_subtitle_record);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (participantSettings.applied_spoken_language != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, participantSettings.applied_spoken_language);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (participantSettings.hands_status != null) {
                i13 = HandsStatus.ADAPTER.encodedSizeWithTag(14, participantSettings.hands_status);
            } else {
                i13 = 0;
            }
            int i26 = i25 + i13;
            if (participantSettings.rtc_mode != null) {
                i14 = RtcMode.ADAPTER.encodedSizeWithTag(15, participantSettings.rtc_mode);
            } else {
                i14 = 0;
            }
            int i27 = i26 + i14;
            if (participantSettings.interpreter_setting != null) {
                i15 = InterpreterSetting.ADAPTER.encodedSizeWithTag(16, participantSettings.interpreter_setting);
            }
            return i27 + i15 + participantSettings.unknownFields().size();
        }

        /* renamed from: a */
        public ParticipantSettings decode(ProtoReader protoReader) throws IOException {
            C50910a aVar = new C50910a();
            aVar.f126888a = false;
            aVar.f126889b = false;
            aVar.f126890c = EquipmentStatus.UNKNOWN;
            aVar.f126891d = EquipmentStatus.UNKNOWN;
            aVar.f126892e = false;
            aVar.f126893f = false;
            aVar.f126895h = false;
            aVar.f126896i = "";
            aVar.f126897j = "";
            aVar.f126898k = "";
            aVar.f126899l = false;
            aVar.f126900m = "";
            aVar.f126901n = HandsStatus.UNKNOWN_HANDS_STATUS;
            aVar.f126902o = RtcMode.RTCMODE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126888a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126889b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f126890c = EquipmentStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f126891d = EquipmentStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f126892e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126893f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f126894g.add(FollowAction.Type.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 8:
                            aVar.f126895h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126896i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126897j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f126898k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126899l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f126900m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f126901n = HandsStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 15:
                            try {
                                aVar.f126902o = RtcMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 16:
                            aVar.f126903p = InterpreterSetting.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ParticipantSettings participantSettings) throws IOException {
            if (participantSettings.is_microphone_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, participantSettings.is_microphone_muted);
            }
            if (participantSettings.is_camera_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, participantSettings.is_camera_muted);
            }
            if (participantSettings.microphone_status != null) {
                EquipmentStatus.ADAPTER.encodeWithTag(protoWriter, 3, participantSettings.microphone_status);
            }
            if (participantSettings.camera_status != null) {
                EquipmentStatus.ADAPTER.encodeWithTag(protoWriter, 4, participantSettings.camera_status);
            }
            if (participantSettings.play_enter_exit_chimes != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, participantSettings.play_enter_exit_chimes);
            }
            if (participantSettings.following_status != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, participantSettings.following_status);
            }
            FollowAction.Type.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, participantSettings.follow_types);
            if (participantSettings.is_translation_on != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, participantSettings.is_translation_on);
            }
            if (participantSettings.subtitle_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, participantSettings.subtitle_language);
            }
            if (participantSettings.spoken_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, participantSettings.spoken_language);
            }
            if (participantSettings.nickname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, participantSettings.nickname);
            }
            if (participantSettings.enable_subtitle_record != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, participantSettings.enable_subtitle_record);
            }
            if (participantSettings.applied_spoken_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, participantSettings.applied_spoken_language);
            }
            if (participantSettings.hands_status != null) {
                HandsStatus.ADAPTER.encodeWithTag(protoWriter, 14, participantSettings.hands_status);
            }
            if (participantSettings.rtc_mode != null) {
                RtcMode.ADAPTER.encodeWithTag(protoWriter, 15, participantSettings.rtc_mode);
            }
            if (participantSettings.interpreter_setting != null) {
                InterpreterSetting.ADAPTER.encodeWithTag(protoWriter, 16, participantSettings.interpreter_setting);
            }
            protoWriter.writeBytes(participantSettings.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ParticipantSettings$a */
    public static final class C50910a extends Message.Builder<ParticipantSettings, C50910a> {

        /* renamed from: a */
        public Boolean f126888a;

        /* renamed from: b */
        public Boolean f126889b;

        /* renamed from: c */
        public EquipmentStatus f126890c;

        /* renamed from: d */
        public EquipmentStatus f126891d;

        /* renamed from: e */
        public Boolean f126892e;

        /* renamed from: f */
        public Boolean f126893f;

        /* renamed from: g */
        public List<FollowAction.Type> f126894g = Internal.newMutableList();

        /* renamed from: h */
        public Boolean f126895h;

        /* renamed from: i */
        public String f126896i;

        /* renamed from: j */
        public String f126897j;

        /* renamed from: k */
        public String f126898k;

        /* renamed from: l */
        public Boolean f126899l;

        /* renamed from: m */
        public String f126900m;

        /* renamed from: n */
        public HandsStatus f126901n;

        /* renamed from: o */
        public RtcMode f126902o;

        /* renamed from: p */
        public InterpreterSetting f126903p;

        /* renamed from: a */
        public ParticipantSettings build() {
            return new ParticipantSettings(this.f126888a, this.f126889b, this.f126890c, this.f126891d, this.f126892e, this.f126893f, this.f126894g, this.f126895h, this.f126896i, this.f126897j, this.f126898k, this.f126899l, this.f126900m, this.f126901n, this.f126902o, this.f126903p, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50910a mo175871a(InterpreterSetting interpreterSetting) {
            this.f126903p = interpreterSetting;
            return this;
        }

        /* renamed from: b */
        public C50910a mo175877b(EquipmentStatus equipmentStatus) {
            this.f126891d = equipmentStatus;
            return this;
        }

        /* renamed from: c */
        public C50910a mo175880c(Boolean bool) {
            this.f126893f = bool;
            return this;
        }

        /* renamed from: d */
        public C50910a mo175882d(Boolean bool) {
            this.f126895h = bool;
            return this;
        }

        /* renamed from: e */
        public C50910a mo175883e(Boolean bool) {
            this.f126899l = bool;
            return this;
        }

        /* renamed from: a */
        public C50910a mo175872a(EquipmentStatus equipmentStatus) {
            this.f126890c = equipmentStatus;
            return this;
        }

        /* renamed from: b */
        public C50910a mo175878b(Boolean bool) {
            this.f126889b = bool;
            return this;
        }

        /* renamed from: c */
        public C50910a mo175881c(String str) {
            this.f126898k = str;
            return this;
        }

        /* renamed from: a */
        public C50910a mo175873a(HandsStatus handsStatus) {
            this.f126901n = handsStatus;
            return this;
        }

        /* renamed from: b */
        public C50910a mo175879b(String str) {
            this.f126897j = str;
            return this;
        }

        /* renamed from: a */
        public C50910a mo175874a(Boolean bool) {
            this.f126888a = bool;
            return this;
        }

        /* renamed from: a */
        public C50910a mo175875a(String str) {
            this.f126896i = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50910a newBuilder() {
        C50910a aVar = new C50910a();
        aVar.f126888a = this.is_microphone_muted;
        aVar.f126889b = this.is_camera_muted;
        aVar.f126890c = this.microphone_status;
        aVar.f126891d = this.camera_status;
        aVar.f126892e = this.play_enter_exit_chimes;
        aVar.f126893f = this.following_status;
        aVar.f126894g = Internal.copyOf("follow_types", this.follow_types);
        aVar.f126895h = this.is_translation_on;
        aVar.f126896i = this.subtitle_language;
        aVar.f126897j = this.spoken_language;
        aVar.f126898k = this.nickname;
        aVar.f126899l = this.enable_subtitle_record;
        aVar.f126900m = this.applied_spoken_language;
        aVar.f126901n = this.hands_status;
        aVar.f126902o = this.rtc_mode;
        aVar.f126903p = this.interpreter_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ParticipantSettings");
        StringBuilder sb = new StringBuilder();
        if (this.is_microphone_muted != null) {
            sb.append(", is_microphone_muted=");
            sb.append(this.is_microphone_muted);
        }
        if (this.is_camera_muted != null) {
            sb.append(", is_camera_muted=");
            sb.append(this.is_camera_muted);
        }
        if (this.microphone_status != null) {
            sb.append(", microphone_status=");
            sb.append(this.microphone_status);
        }
        if (this.camera_status != null) {
            sb.append(", camera_status=");
            sb.append(this.camera_status);
        }
        if (this.play_enter_exit_chimes != null) {
            sb.append(", play_enter_exit_chimes=");
            sb.append(this.play_enter_exit_chimes);
        }
        if (this.following_status != null) {
            sb.append(", following_status=");
            sb.append(this.following_status);
        }
        if (!this.follow_types.isEmpty()) {
            sb.append(", follow_types=");
            sb.append(this.follow_types);
        }
        if (this.is_translation_on != null) {
            sb.append(", is_translation_on=");
            sb.append(this.is_translation_on);
        }
        if (this.subtitle_language != null) {
            sb.append(", subtitle_language=");
            sb.append(this.subtitle_language);
        }
        if (this.spoken_language != null) {
            sb.append(", spoken_language=");
            sb.append(this.spoken_language);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.enable_subtitle_record != null) {
            sb.append(", enable_subtitle_record=");
            sb.append(this.enable_subtitle_record);
        }
        if (this.applied_spoken_language != null) {
            sb.append(", applied_spoken_language=");
            sb.append(this.applied_spoken_language);
        }
        if (this.hands_status != null) {
            sb.append(", hands_status=");
            sb.append(this.hands_status);
        }
        if (this.rtc_mode != null) {
            sb.append(", rtc_mode=");
            sb.append(this.rtc_mode);
        }
        if (this.interpreter_setting != null) {
            sb.append(", interpreter_setting=");
            sb.append(this.interpreter_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "ParticipantSettings{");
        replace.append('}');
        return replace.toString();
    }

    public ParticipantSettings(Boolean bool, Boolean bool2, EquipmentStatus equipmentStatus, EquipmentStatus equipmentStatus2, Boolean bool3, Boolean bool4, List<FollowAction.Type> list, Boolean bool5, String str, String str2, String str3, Boolean bool6, String str4, HandsStatus handsStatus, RtcMode rtcMode, InterpreterSetting interpreterSetting) {
        this(bool, bool2, equipmentStatus, equipmentStatus2, bool3, bool4, list, bool5, str, str2, str3, bool6, str4, handsStatus, rtcMode, interpreterSetting, ByteString.EMPTY);
    }

    public ParticipantSettings(Boolean bool, Boolean bool2, EquipmentStatus equipmentStatus, EquipmentStatus equipmentStatus2, Boolean bool3, Boolean bool4, List<FollowAction.Type> list, Boolean bool5, String str, String str2, String str3, Boolean bool6, String str4, HandsStatus handsStatus, RtcMode rtcMode, InterpreterSetting interpreterSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_microphone_muted = bool;
        this.is_camera_muted = bool2;
        this.microphone_status = equipmentStatus;
        this.camera_status = equipmentStatus2;
        this.play_enter_exit_chimes = bool3;
        this.following_status = bool4;
        this.follow_types = Internal.immutableCopyOf("follow_types", list);
        this.is_translation_on = bool5;
        this.subtitle_language = str;
        this.spoken_language = str2;
        this.nickname = str3;
        this.enable_subtitle_record = bool6;
        this.applied_spoken_language = str4;
        this.hands_status = handsStatus;
        this.rtc_mode = rtcMode;
        this.interpreter_setting = interpreterSetting;
    }
}
