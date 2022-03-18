package com.ss.android.lark.pb.videochat;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videochat.FollowAction;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ParticipantSettings extends Message<ParticipantSettings, C50399a> {
    public static final ProtoAdapter<ParticipantSettings> ADAPTER = new C50400b();
    public static final Boolean DEFAULT_ENABLE_SUBTITLE_RECORD = false;
    public static final Boolean DEFAULT_FOLLOWING_STATUS = false;
    public static final Boolean DEFAULT_IS_CAMERA_MUTED = false;
    public static final Boolean DEFAULT_IS_MICROPHONE_MUTED = false;
    public static final Boolean DEFAULT_IS_TRANSLATION_ON = false;
    public static final Boolean DEFAULT_PLAY_ENTER_EXIT_CHIMES = false;
    private static final long serialVersionUID = 0;
    public final String mapplied_spoken_language;
    public final EquipmentStatus mcamera_status;
    public final Boolean menable_subtitle_record;
    public final List<FollowAction.Type> mfollow_types;
    public final Boolean mfollowing_status;
    public final HandsStatus mhands_status;
    public final InterpreterSetting minterpreter_setting;
    public final Boolean mis_camera_muted;
    public final Boolean mis_microphone_muted;
    public final Boolean mis_translation_on;
    public final EquipmentStatus mmicrophone_status;
    public final String mnickname;
    public final Boolean mplay_enter_exit_chimes;
    public final RtcMode mrtc_mode;
    public final String mspoken_language;
    public final String msubtitle_language;

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
        REJECT(4),
        NO_NEED_PUT_UP(5);
        
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
            if (i == 4) {
                return REJECT;
            }
            if (i != 5) {
                return null;
            }
            return NO_NEED_PUT_UP;
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

    /* renamed from: com.ss.android.lark.pb.videochat.ParticipantSettings$b */
    private static final class C50400b extends ProtoAdapter<ParticipantSettings> {
        C50400b() {
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
            if (participantSettings.mis_microphone_muted != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, participantSettings.mis_microphone_muted);
            } else {
                i = 0;
            }
            if (participantSettings.mis_camera_muted != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, participantSettings.mis_camera_muted);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (participantSettings.mmicrophone_status != null) {
                i3 = EquipmentStatus.ADAPTER.encodedSizeWithTag(3, participantSettings.mmicrophone_status);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (participantSettings.mcamera_status != null) {
                i4 = EquipmentStatus.ADAPTER.encodedSizeWithTag(4, participantSettings.mcamera_status);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (participantSettings.mrtc_mode != null) {
                i5 = RtcMode.ADAPTER.encodedSizeWithTag(15, participantSettings.mrtc_mode);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (participantSettings.mplay_enter_exit_chimes != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(5, participantSettings.mplay_enter_exit_chimes);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (participantSettings.mfollowing_status != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(6, participantSettings.mfollowing_status);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag = i20 + i7 + FollowAction.Type.ADAPTER.asRepeated().encodedSizeWithTag(7, participantSettings.mfollow_types);
            if (participantSettings.mis_translation_on != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, participantSettings.mis_translation_on);
            } else {
                i8 = 0;
            }
            int i21 = encodedSizeWithTag + i8;
            if (participantSettings.msubtitle_language != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, participantSettings.msubtitle_language);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (participantSettings.mspoken_language != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, participantSettings.mspoken_language);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (participantSettings.mnickname != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, participantSettings.mnickname);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (participantSettings.menable_subtitle_record != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(12, participantSettings.menable_subtitle_record);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (participantSettings.mapplied_spoken_language != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, participantSettings.mapplied_spoken_language);
            } else {
                i13 = 0;
            }
            int i26 = i25 + i13;
            if (participantSettings.mhands_status != null) {
                i14 = HandsStatus.ADAPTER.encodedSizeWithTag(14, participantSettings.mhands_status);
            } else {
                i14 = 0;
            }
            int i27 = i26 + i14;
            if (participantSettings.minterpreter_setting != null) {
                i15 = InterpreterSetting.ADAPTER.encodedSizeWithTag(16, participantSettings.minterpreter_setting);
            }
            return i27 + i15 + participantSettings.unknownFields().size();
        }

        /* renamed from: a */
        public ParticipantSettings decode(ProtoReader protoReader) throws IOException {
            C50399a aVar = new C50399a();
            aVar.f125856a = false;
            aVar.f125857b = false;
            aVar.f125861f = false;
            aVar.f125862g = false;
            aVar.f125864i = false;
            aVar.f125865j = "";
            aVar.f125866k = "";
            aVar.f125867l = "";
            aVar.f125868m = false;
            aVar.f125869n = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125856a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125857b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f125858c = EquipmentStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f125859d = EquipmentStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f125861f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125862g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f125863h.add(FollowAction.Type.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 8:
                            aVar.f125864i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125865j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125866k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125867l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125868m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f125869n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f125870o = HandsStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 15:
                            try {
                                aVar.f125860e = RtcMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 16:
                            aVar.f125871p = InterpreterSetting.ADAPTER.decode(protoReader);
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
            if (participantSettings.mis_microphone_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, participantSettings.mis_microphone_muted);
            }
            if (participantSettings.mis_camera_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, participantSettings.mis_camera_muted);
            }
            if (participantSettings.mmicrophone_status != null) {
                EquipmentStatus.ADAPTER.encodeWithTag(protoWriter, 3, participantSettings.mmicrophone_status);
            }
            if (participantSettings.mcamera_status != null) {
                EquipmentStatus.ADAPTER.encodeWithTag(protoWriter, 4, participantSettings.mcamera_status);
            }
            if (participantSettings.mrtc_mode != null) {
                RtcMode.ADAPTER.encodeWithTag(protoWriter, 15, participantSettings.mrtc_mode);
            }
            if (participantSettings.mplay_enter_exit_chimes != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, participantSettings.mplay_enter_exit_chimes);
            }
            if (participantSettings.mfollowing_status != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, participantSettings.mfollowing_status);
            }
            FollowAction.Type.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, participantSettings.mfollow_types);
            if (participantSettings.mis_translation_on != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, participantSettings.mis_translation_on);
            }
            if (participantSettings.msubtitle_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, participantSettings.msubtitle_language);
            }
            if (participantSettings.mspoken_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, participantSettings.mspoken_language);
            }
            if (participantSettings.mnickname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, participantSettings.mnickname);
            }
            if (participantSettings.menable_subtitle_record != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, participantSettings.menable_subtitle_record);
            }
            if (participantSettings.mapplied_spoken_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, participantSettings.mapplied_spoken_language);
            }
            if (participantSettings.mhands_status != null) {
                HandsStatus.ADAPTER.encodeWithTag(protoWriter, 14, participantSettings.mhands_status);
            }
            if (participantSettings.minterpreter_setting != null) {
                InterpreterSetting.ADAPTER.encodeWithTag(protoWriter, 16, participantSettings.minterpreter_setting);
            }
            protoWriter.writeBytes(participantSettings.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.ParticipantSettings$a */
    public static final class C50399a extends Message.Builder<ParticipantSettings, C50399a> {

        /* renamed from: a */
        public Boolean f125856a;

        /* renamed from: b */
        public Boolean f125857b;

        /* renamed from: c */
        public EquipmentStatus f125858c;

        /* renamed from: d */
        public EquipmentStatus f125859d;

        /* renamed from: e */
        public RtcMode f125860e;

        /* renamed from: f */
        public Boolean f125861f;

        /* renamed from: g */
        public Boolean f125862g;

        /* renamed from: h */
        public List<FollowAction.Type> f125863h = Internal.newMutableList();

        /* renamed from: i */
        public Boolean f125864i;

        /* renamed from: j */
        public String f125865j;

        /* renamed from: k */
        public String f125866k;

        /* renamed from: l */
        public String f125867l;

        /* renamed from: m */
        public Boolean f125868m;

        /* renamed from: n */
        public String f125869n;

        /* renamed from: o */
        public HandsStatus f125870o;

        /* renamed from: p */
        public InterpreterSetting f125871p;

        /* renamed from: a */
        public ParticipantSettings build() {
            return new ParticipantSettings(this.f125856a, this.f125857b, this.f125858c, this.f125859d, this.f125860e, this.f125861f, this.f125862g, this.f125863h, this.f125864i, this.f125865j, this.f125866k, this.f125867l, this.f125868m, this.f125869n, this.f125870o, this.f125871p, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50399a newBuilder() {
        C50399a aVar = new C50399a();
        aVar.f125856a = this.mis_microphone_muted;
        aVar.f125857b = this.mis_camera_muted;
        aVar.f125858c = this.mmicrophone_status;
        aVar.f125859d = this.mcamera_status;
        aVar.f125860e = this.mrtc_mode;
        aVar.f125861f = this.mplay_enter_exit_chimes;
        aVar.f125862g = this.mfollowing_status;
        aVar.f125863h = Internal.copyOf("mfollow_types", this.mfollow_types);
        aVar.f125864i = this.mis_translation_on;
        aVar.f125865j = this.msubtitle_language;
        aVar.f125866k = this.mspoken_language;
        aVar.f125867l = this.mnickname;
        aVar.f125868m = this.menable_subtitle_record;
        aVar.f125869n = this.mapplied_spoken_language;
        aVar.f125870o = this.mhands_status;
        aVar.f125871p = this.minterpreter_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mis_microphone_muted != null) {
            sb.append(", is_microphone_muted=");
            sb.append(this.mis_microphone_muted);
        }
        if (this.mis_camera_muted != null) {
            sb.append(", is_camera_muted=");
            sb.append(this.mis_camera_muted);
        }
        if (this.mmicrophone_status != null) {
            sb.append(", microphone_status=");
            sb.append(this.mmicrophone_status);
        }
        if (this.mcamera_status != null) {
            sb.append(", camera_status=");
            sb.append(this.mcamera_status);
        }
        if (this.mrtc_mode != null) {
            sb.append(", rtc_mode=");
            sb.append(this.mrtc_mode);
        }
        if (this.mplay_enter_exit_chimes != null) {
            sb.append(", play_enter_exit_chimes=");
            sb.append(this.mplay_enter_exit_chimes);
        }
        if (this.mfollowing_status != null) {
            sb.append(", following_status=");
            sb.append(this.mfollowing_status);
        }
        if (!this.mfollow_types.isEmpty()) {
            sb.append(", follow_types=");
            sb.append(this.mfollow_types);
        }
        if (this.mis_translation_on != null) {
            sb.append(", is_translation_on=");
            sb.append(this.mis_translation_on);
        }
        if (this.msubtitle_language != null) {
            sb.append(", subtitle_language=");
            sb.append(this.msubtitle_language);
        }
        if (this.mspoken_language != null) {
            sb.append(", spoken_language=");
            sb.append(this.mspoken_language);
        }
        if (this.mnickname != null) {
            sb.append(", nickname=");
            sb.append(this.mnickname);
        }
        if (this.menable_subtitle_record != null) {
            sb.append(", enable_subtitle_record=");
            sb.append(this.menable_subtitle_record);
        }
        if (this.mapplied_spoken_language != null) {
            sb.append(", applied_spoken_language=");
            sb.append(this.mapplied_spoken_language);
        }
        if (this.mhands_status != null) {
            sb.append(", hands_status=");
            sb.append(this.mhands_status);
        }
        if (this.minterpreter_setting != null) {
            sb.append(", interpreter_setting=");
            sb.append(this.minterpreter_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "ParticipantSettings{");
        replace.append('}');
        return replace.toString();
    }

    public ParticipantSettings(Boolean bool, Boolean bool2, EquipmentStatus equipmentStatus, EquipmentStatus equipmentStatus2, RtcMode rtcMode, Boolean bool3, Boolean bool4, List<FollowAction.Type> list, Boolean bool5, String str, String str2, String str3, Boolean bool6, String str4, HandsStatus handsStatus, InterpreterSetting interpreterSetting) {
        this(bool, bool2, equipmentStatus, equipmentStatus2, rtcMode, bool3, bool4, list, bool5, str, str2, str3, bool6, str4, handsStatus, interpreterSetting, ByteString.EMPTY);
    }

    public ParticipantSettings(Boolean bool, Boolean bool2, EquipmentStatus equipmentStatus, EquipmentStatus equipmentStatus2, RtcMode rtcMode, Boolean bool3, Boolean bool4, List<FollowAction.Type> list, Boolean bool5, String str, String str2, String str3, Boolean bool6, String str4, HandsStatus handsStatus, InterpreterSetting interpreterSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mis_microphone_muted = bool;
        this.mis_camera_muted = bool2;
        this.mmicrophone_status = equipmentStatus;
        this.mcamera_status = equipmentStatus2;
        this.mrtc_mode = rtcMode;
        this.mplay_enter_exit_chimes = bool3;
        this.mfollowing_status = bool4;
        this.mfollow_types = Internal.immutableCopyOf("mfollow_types", list);
        this.mis_translation_on = bool5;
        this.msubtitle_language = str;
        this.mspoken_language = str2;
        this.mnickname = str3;
        this.menable_subtitle_record = bool6;
        this.mapplied_spoken_language = str4;
        this.mhands_status = handsStatus;
        this.minterpreter_setting = interpreterSetting;
    }
}
