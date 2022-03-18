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
import okio.ByteString;

public final class VCLobbyParticipant extends Message<VCLobbyParticipant, C51146a> {
    public static final ProtoAdapter<VCLobbyParticipant> ADAPTER = new C51147b();
    public static final Boolean DEFAULT_IS_CAMERA_MUTED = false;
    public static final Boolean DEFAULT_IS_IN_APPROVAL = false;
    public static final Boolean DEFAULT_IS_MICROPHONE_MUTED = false;
    public static final Boolean DEFAULT_IS_STATUS_WAIT = false;
    public static final Long DEFAULT_JOIN_LOBBY_TIME = 0L;
    public static final LeaveReason DEFAULT_LEAVE_REASON = LeaveReason.UNKNOWN;
    public static final Long DEFAULT_SEQ_ID = 0L;
    public static final TenantTag DEFAULT_TENANT_TAG = TenantTag.STANDARD;
    private static final long serialVersionUID = 0;
    public final String interactive_id;
    public final Boolean is_camera_muted;
    public final Boolean is_in_approval;
    public final String is_lark_guest;
    public final Boolean is_microphone_muted;
    public final Boolean is_status_wait;
    public final Long join_lobby_time;
    public final LeaveReason leave_reason;
    public final String meeting_id;
    public final String nick_name;
    public final Long seq_id;
    public final TenantTag tenant_tag;
    public final ByteviewUser user;
    public final String user_tenant_id;

    public enum LeaveReason implements WireEnum {
        UNKNOWN(0),
        HEARBEAT_EXPIRE(1),
        EXIT(2),
        HOST_REJECT(3),
        MEETING_END(4),
        HOST_APPROVE(5),
        VC_NOT_SUPPORT_LOBBY(6);
        
        public static final ProtoAdapter<LeaveReason> ADAPTER = ProtoAdapter.newEnumAdapter(LeaveReason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LeaveReason fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return HEARBEAT_EXPIRE;
                case 2:
                    return EXIT;
                case 3:
                    return HOST_REJECT;
                case 4:
                    return MEETING_END;
                case 5:
                    return HOST_APPROVE;
                case 6:
                    return VC_NOT_SUPPORT_LOBBY;
                default:
                    return null;
            }
        }

        private LeaveReason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCLobbyParticipant$b */
    private static final class C51147b extends ProtoAdapter<VCLobbyParticipant> {
        C51147b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCLobbyParticipant.class);
        }

        /* renamed from: a */
        public int encodedSize(VCLobbyParticipant vCLobbyParticipant) {
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
            int encodedSizeWithTag = ByteviewUser.ADAPTER.encodedSizeWithTag(1, vCLobbyParticipant.user);
            int i13 = 0;
            if (vCLobbyParticipant.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, vCLobbyParticipant.meeting_id);
            } else {
                i = 0;
            }
            int i14 = encodedSizeWithTag + i;
            if (vCLobbyParticipant.is_microphone_muted != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, vCLobbyParticipant.is_microphone_muted);
            } else {
                i2 = 0;
            }
            int i15 = i14 + i2;
            if (vCLobbyParticipant.is_camera_muted != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, vCLobbyParticipant.is_camera_muted);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (vCLobbyParticipant.is_status_wait != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, vCLobbyParticipant.is_status_wait);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (vCLobbyParticipant.seq_id != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(6, vCLobbyParticipant.seq_id);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (vCLobbyParticipant.is_in_approval != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, vCLobbyParticipant.is_in_approval);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (vCLobbyParticipant.join_lobby_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(8, vCLobbyParticipant.join_lobby_time);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (vCLobbyParticipant.nick_name != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, vCLobbyParticipant.nick_name);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (vCLobbyParticipant.interactive_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, vCLobbyParticipant.interactive_id);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (vCLobbyParticipant.is_lark_guest != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, vCLobbyParticipant.is_lark_guest);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (vCLobbyParticipant.leave_reason != null) {
                i11 = LeaveReason.ADAPTER.encodedSizeWithTag(12, vCLobbyParticipant.leave_reason);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (vCLobbyParticipant.user_tenant_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, vCLobbyParticipant.user_tenant_id);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (vCLobbyParticipant.tenant_tag != null) {
                i13 = TenantTag.ADAPTER.encodedSizeWithTag(14, vCLobbyParticipant.tenant_tag);
            }
            return i25 + i13 + vCLobbyParticipant.unknownFields().size();
        }

        /* renamed from: a */
        public VCLobbyParticipant decode(ProtoReader protoReader) throws IOException {
            C51146a aVar = new C51146a();
            aVar.f127276b = "";
            aVar.f127277c = false;
            aVar.f127278d = false;
            aVar.f127279e = false;
            aVar.f127280f = 0L;
            aVar.f127281g = false;
            aVar.f127282h = 0L;
            aVar.f127283i = "";
            aVar.f127284j = "";
            aVar.f127285k = "";
            aVar.f127286l = LeaveReason.UNKNOWN;
            aVar.f127287m = "";
            aVar.f127288n = TenantTag.STANDARD;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127275a = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127276b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127277c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127278d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127279e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127280f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127281g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127282h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f127283i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127284j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f127285k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            try {
                                aVar.f127286l = LeaveReason.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 13:
                            aVar.f127287m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f127288n = TenantTag.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, VCLobbyParticipant vCLobbyParticipant) throws IOException {
            ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, vCLobbyParticipant.user);
            if (vCLobbyParticipant.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, vCLobbyParticipant.meeting_id);
            }
            if (vCLobbyParticipant.is_microphone_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, vCLobbyParticipant.is_microphone_muted);
            }
            if (vCLobbyParticipant.is_camera_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, vCLobbyParticipant.is_camera_muted);
            }
            if (vCLobbyParticipant.is_status_wait != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, vCLobbyParticipant.is_status_wait);
            }
            if (vCLobbyParticipant.seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, vCLobbyParticipant.seq_id);
            }
            if (vCLobbyParticipant.is_in_approval != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, vCLobbyParticipant.is_in_approval);
            }
            if (vCLobbyParticipant.join_lobby_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, vCLobbyParticipant.join_lobby_time);
            }
            if (vCLobbyParticipant.nick_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, vCLobbyParticipant.nick_name);
            }
            if (vCLobbyParticipant.interactive_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, vCLobbyParticipant.interactive_id);
            }
            if (vCLobbyParticipant.is_lark_guest != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, vCLobbyParticipant.is_lark_guest);
            }
            if (vCLobbyParticipant.leave_reason != null) {
                LeaveReason.ADAPTER.encodeWithTag(protoWriter, 12, vCLobbyParticipant.leave_reason);
            }
            if (vCLobbyParticipant.user_tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, vCLobbyParticipant.user_tenant_id);
            }
            if (vCLobbyParticipant.tenant_tag != null) {
                TenantTag.ADAPTER.encodeWithTag(protoWriter, 14, vCLobbyParticipant.tenant_tag);
            }
            protoWriter.writeBytes(vCLobbyParticipant.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCLobbyParticipant$a */
    public static final class C51146a extends Message.Builder<VCLobbyParticipant, C51146a> {

        /* renamed from: a */
        public ByteviewUser f127275a;

        /* renamed from: b */
        public String f127276b;

        /* renamed from: c */
        public Boolean f127277c;

        /* renamed from: d */
        public Boolean f127278d;

        /* renamed from: e */
        public Boolean f127279e;

        /* renamed from: f */
        public Long f127280f;

        /* renamed from: g */
        public Boolean f127281g;

        /* renamed from: h */
        public Long f127282h;

        /* renamed from: i */
        public String f127283i;

        /* renamed from: j */
        public String f127284j;

        /* renamed from: k */
        public String f127285k;

        /* renamed from: l */
        public LeaveReason f127286l;

        /* renamed from: m */
        public String f127287m;

        /* renamed from: n */
        public TenantTag f127288n;

        /* renamed from: a */
        public VCLobbyParticipant build() {
            ByteviewUser byteviewUser = this.f127275a;
            if (byteviewUser != null) {
                return new VCLobbyParticipant(byteviewUser, this.f127276b, this.f127277c, this.f127278d, this.f127279e, this.f127280f, this.f127281g, this.f127282h, this.f127283i, this.f127284j, this.f127285k, this.f127286l, this.f127287m, this.f127288n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteviewUser, "user");
        }
    }

    @Override // com.squareup.wire.Message
    public C51146a newBuilder() {
        C51146a aVar = new C51146a();
        aVar.f127275a = this.user;
        aVar.f127276b = this.meeting_id;
        aVar.f127277c = this.is_microphone_muted;
        aVar.f127278d = this.is_camera_muted;
        aVar.f127279e = this.is_status_wait;
        aVar.f127280f = this.seq_id;
        aVar.f127281g = this.is_in_approval;
        aVar.f127282h = this.join_lobby_time;
        aVar.f127283i = this.nick_name;
        aVar.f127284j = this.interactive_id;
        aVar.f127285k = this.is_lark_guest;
        aVar.f127286l = this.leave_reason;
        aVar.f127287m = this.user_tenant_id;
        aVar.f127288n = this.tenant_tag;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCLobbyParticipant");
        StringBuilder sb = new StringBuilder();
        sb.append(", user=");
        sb.append(this.user);
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.is_microphone_muted != null) {
            sb.append(", is_microphone_muted=");
            sb.append(this.is_microphone_muted);
        }
        if (this.is_camera_muted != null) {
            sb.append(", is_camera_muted=");
            sb.append(this.is_camera_muted);
        }
        if (this.is_status_wait != null) {
            sb.append(", is_status_wait=");
            sb.append(this.is_status_wait);
        }
        if (this.seq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.seq_id);
        }
        if (this.is_in_approval != null) {
            sb.append(", is_in_approval=");
            sb.append(this.is_in_approval);
        }
        if (this.join_lobby_time != null) {
            sb.append(", join_lobby_time=");
            sb.append(this.join_lobby_time);
        }
        if (this.nick_name != null) {
            sb.append(", nick_name=");
            sb.append(this.nick_name);
        }
        if (this.interactive_id != null) {
            sb.append(", interactive_id=");
            sb.append(this.interactive_id);
        }
        if (this.is_lark_guest != null) {
            sb.append(", is_lark_guest=");
            sb.append(this.is_lark_guest);
        }
        if (this.leave_reason != null) {
            sb.append(", leave_reason=");
            sb.append(this.leave_reason);
        }
        if (this.user_tenant_id != null) {
            sb.append(", user_tenant_id=");
            sb.append(this.user_tenant_id);
        }
        if (this.tenant_tag != null) {
            sb.append(", tenant_tag=");
            sb.append(this.tenant_tag);
        }
        StringBuilder replace = sb.replace(0, 2, "VCLobbyParticipant{");
        replace.append('}');
        return replace.toString();
    }

    public VCLobbyParticipant(ByteviewUser byteviewUser, String str, Boolean bool, Boolean bool2, Boolean bool3, Long l, Boolean bool4, Long l2, String str2, String str3, String str4, LeaveReason leaveReason, String str5, TenantTag tenantTag) {
        this(byteviewUser, str, bool, bool2, bool3, l, bool4, l2, str2, str3, str4, leaveReason, str5, tenantTag, ByteString.EMPTY);
    }

    public VCLobbyParticipant(ByteviewUser byteviewUser, String str, Boolean bool, Boolean bool2, Boolean bool3, Long l, Boolean bool4, Long l2, String str2, String str3, String str4, LeaveReason leaveReason, String str5, TenantTag tenantTag, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = byteviewUser;
        this.meeting_id = str;
        this.is_microphone_muted = bool;
        this.is_camera_muted = bool2;
        this.is_status_wait = bool3;
        this.seq_id = l;
        this.is_in_approval = bool4;
        this.join_lobby_time = l2;
        this.nick_name = str2;
        this.interactive_id = str3;
        this.is_lark_guest = str4;
        this.leave_reason = leaveReason;
        this.user_tenant_id = str5;
        this.tenant_tag = tenantTag;
    }
}
