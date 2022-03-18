package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarVCSettings extends Message<CalendarVCSettings, C50497a> {
    public static final ProtoAdapter<CalendarVCSettings> ADAPTER = new C50498b();
    public static final Boolean DEFAULT_AUTO_RECORD = false;
    public static final Boolean DEFAULT_CAN_JOIN_MEETING_BEFORE_OWNER_JOINED = false;
    public static final Boolean DEFAULT_MUTE_MICROPHONE_WHEN_JOIN = false;
    public static final Boolean DEFAULT_PUT_NO_PERMISSION_USER_IN_LOBBY = false;
    public static final VCSecuritySetting DEFAULT_VC_SECURITY_SETTING = VCSecuritySetting.PUBLIC;
    private static final long serialVersionUID = 0;
    public final Boolean auto_record;
    public final Boolean can_join_meeting_before_owner_joined;
    public final Boolean mute_microphone_when_join;
    public final Boolean put_no_permission_user_in_lobby;
    public final VCSecuritySetting vc_security_setting;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CalendarVCSettings$b */
    private static final class C50498b extends ProtoAdapter<CalendarVCSettings> {
        C50498b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarVCSettings.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarVCSettings calendarVCSettings) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (calendarVCSettings.vc_security_setting != null) {
                i = VCSecuritySetting.ADAPTER.encodedSizeWithTag(1, calendarVCSettings.vc_security_setting);
            } else {
                i = 0;
            }
            if (calendarVCSettings.can_join_meeting_before_owner_joined != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, calendarVCSettings.can_join_meeting_before_owner_joined);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (calendarVCSettings.mute_microphone_when_join != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, calendarVCSettings.mute_microphone_when_join);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (calendarVCSettings.put_no_permission_user_in_lobby != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, calendarVCSettings.put_no_permission_user_in_lobby);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (calendarVCSettings.auto_record != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, calendarVCSettings.auto_record);
            }
            return i8 + i5 + calendarVCSettings.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarVCSettings decode(ProtoReader protoReader) throws IOException {
            C50497a aVar = new C50497a();
            aVar.f126084a = VCSecuritySetting.PUBLIC;
            aVar.f126085b = false;
            aVar.f126086c = false;
            aVar.f126087d = false;
            aVar.f126088e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126084a = VCSecuritySetting.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126085b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126086c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f126087d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126088e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarVCSettings calendarVCSettings) throws IOException {
            if (calendarVCSettings.vc_security_setting != null) {
                VCSecuritySetting.ADAPTER.encodeWithTag(protoWriter, 1, calendarVCSettings.vc_security_setting);
            }
            if (calendarVCSettings.can_join_meeting_before_owner_joined != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, calendarVCSettings.can_join_meeting_before_owner_joined);
            }
            if (calendarVCSettings.mute_microphone_when_join != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, calendarVCSettings.mute_microphone_when_join);
            }
            if (calendarVCSettings.put_no_permission_user_in_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, calendarVCSettings.put_no_permission_user_in_lobby);
            }
            if (calendarVCSettings.auto_record != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, calendarVCSettings.auto_record);
            }
            protoWriter.writeBytes(calendarVCSettings.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CalendarVCSettings$a */
    public static final class C50497a extends Message.Builder<CalendarVCSettings, C50497a> {

        /* renamed from: a */
        public VCSecuritySetting f126084a;

        /* renamed from: b */
        public Boolean f126085b;

        /* renamed from: c */
        public Boolean f126086c;

        /* renamed from: d */
        public Boolean f126087d;

        /* renamed from: e */
        public Boolean f126088e;

        /* renamed from: a */
        public CalendarVCSettings build() {
            return new CalendarVCSettings(this.f126084a, this.f126085b, this.f126086c, this.f126087d, this.f126088e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50497a newBuilder() {
        C50497a aVar = new C50497a();
        aVar.f126084a = this.vc_security_setting;
        aVar.f126085b = this.can_join_meeting_before_owner_joined;
        aVar.f126086c = this.mute_microphone_when_join;
        aVar.f126087d = this.put_no_permission_user_in_lobby;
        aVar.f126088e = this.auto_record;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CalendarVCSettings");
        StringBuilder sb = new StringBuilder();
        if (this.vc_security_setting != null) {
            sb.append(", vc_security_setting=");
            sb.append(this.vc_security_setting);
        }
        if (this.can_join_meeting_before_owner_joined != null) {
            sb.append(", can_join_meeting_before_owner_joined=");
            sb.append(this.can_join_meeting_before_owner_joined);
        }
        if (this.mute_microphone_when_join != null) {
            sb.append(", mute_microphone_when_join=");
            sb.append(this.mute_microphone_when_join);
        }
        if (this.put_no_permission_user_in_lobby != null) {
            sb.append(", put_no_permission_user_in_lobby=");
            sb.append(this.put_no_permission_user_in_lobby);
        }
        if (this.auto_record != null) {
            sb.append(", auto_record=");
            sb.append(this.auto_record);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarVCSettings{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarVCSettings(VCSecuritySetting vCSecuritySetting, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(vCSecuritySetting, bool, bool2, bool3, bool4, ByteString.EMPTY);
    }

    public CalendarVCSettings(VCSecuritySetting vCSecuritySetting, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.vc_security_setting = vCSecuritySetting;
        this.can_join_meeting_before_owner_joined = bool;
        this.mute_microphone_when_join = bool2;
        this.put_no_permission_user_in_lobby = bool3;
        this.auto_record = bool4;
    }
}
