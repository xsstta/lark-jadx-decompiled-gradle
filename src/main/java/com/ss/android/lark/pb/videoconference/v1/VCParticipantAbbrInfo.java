package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.PSTNInfo;
import com.ss.android.lark.pb.videoconference.v1.Participant;
import java.io.IOException;
import okio.ByteString;

public final class VCParticipantAbbrInfo extends Message<VCParticipantAbbrInfo, C51164a> {
    public static final ProtoAdapter<VCParticipantAbbrInfo> ADAPTER = new C51165b();
    public static final PSTNInfo.BindType DEFAULT_BIND_TYPE = PSTNInfo.BindType.UNKNOWN;
    public static final Participant.DeviceType DEFAULT_DEVICE_TYPE = Participant.DeviceType.UNKNOWN_DEVICE_TYPE;
    public static final Boolean DEFAULT_IS_LARK_GUEST = false;
    public static final Long DEFAULT_JOIN_TIME_MS = 0L;
    public static final Participant.Status DEFAULT_STATUS = Participant.Status.UNKNOWN;
    public static final Long DEFAULT_TENANT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String bind_id;
    public final PSTNInfo.BindType bind_type;
    public final Participant.DeviceType device_type;
    public final Boolean is_lark_guest;
    public final Long join_time_ms;
    public final Participant.Status status;
    public final Long tenant_id;
    public final ByteviewUser user;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCParticipantAbbrInfo$b */
    private static final class C51165b extends ProtoAdapter<VCParticipantAbbrInfo> {
        C51165b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCParticipantAbbrInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCParticipantAbbrInfo vCParticipantAbbrInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ByteviewUser.ADAPTER.encodedSizeWithTag(1, vCParticipantAbbrInfo.user) + Participant.Status.ADAPTER.encodedSizeWithTag(2, vCParticipantAbbrInfo.status);
            int i6 = 0;
            if (vCParticipantAbbrInfo.device_type != null) {
                i = Participant.DeviceType.ADAPTER.encodedSizeWithTag(3, vCParticipantAbbrInfo.device_type);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (vCParticipantAbbrInfo.join_time_ms != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, vCParticipantAbbrInfo.join_time_ms);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (vCParticipantAbbrInfo.tenant_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(5, vCParticipantAbbrInfo.tenant_id);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (vCParticipantAbbrInfo.is_lark_guest != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, vCParticipantAbbrInfo.is_lark_guest);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (vCParticipantAbbrInfo.bind_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(9, vCParticipantAbbrInfo.bind_id);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (vCParticipantAbbrInfo.bind_type != null) {
                i6 = PSTNInfo.BindType.ADAPTER.encodedSizeWithTag(10, vCParticipantAbbrInfo.bind_type);
            }
            return i11 + i6 + vCParticipantAbbrInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCParticipantAbbrInfo decode(ProtoReader protoReader) throws IOException {
            C51164a aVar = new C51164a();
            aVar.f127338b = Participant.Status.UNKNOWN;
            aVar.f127339c = Participant.DeviceType.UNKNOWN_DEVICE_TYPE;
            aVar.f127340d = 0L;
            aVar.f127341e = 0L;
            aVar.f127342f = false;
            aVar.f127343g = "";
            aVar.f127344h = PSTNInfo.BindType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127337a = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f127338b = Participant.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f127339c = Participant.DeviceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f127340d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127341e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127342f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                        case 8:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 9:
                            aVar.f127343g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f127344h = PSTNInfo.BindType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCParticipantAbbrInfo vCParticipantAbbrInfo) throws IOException {
            ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, vCParticipantAbbrInfo.user);
            Participant.Status.ADAPTER.encodeWithTag(protoWriter, 2, vCParticipantAbbrInfo.status);
            if (vCParticipantAbbrInfo.device_type != null) {
                Participant.DeviceType.ADAPTER.encodeWithTag(protoWriter, 3, vCParticipantAbbrInfo.device_type);
            }
            if (vCParticipantAbbrInfo.join_time_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, vCParticipantAbbrInfo.join_time_ms);
            }
            if (vCParticipantAbbrInfo.tenant_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, vCParticipantAbbrInfo.tenant_id);
            }
            if (vCParticipantAbbrInfo.is_lark_guest != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, vCParticipantAbbrInfo.is_lark_guest);
            }
            if (vCParticipantAbbrInfo.bind_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, vCParticipantAbbrInfo.bind_id);
            }
            if (vCParticipantAbbrInfo.bind_type != null) {
                PSTNInfo.BindType.ADAPTER.encodeWithTag(protoWriter, 10, vCParticipantAbbrInfo.bind_type);
            }
            protoWriter.writeBytes(vCParticipantAbbrInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCParticipantAbbrInfo$a */
    public static final class C51164a extends Message.Builder<VCParticipantAbbrInfo, C51164a> {

        /* renamed from: a */
        public ByteviewUser f127337a;

        /* renamed from: b */
        public Participant.Status f127338b;

        /* renamed from: c */
        public Participant.DeviceType f127339c;

        /* renamed from: d */
        public Long f127340d;

        /* renamed from: e */
        public Long f127341e;

        /* renamed from: f */
        public Boolean f127342f;

        /* renamed from: g */
        public String f127343g;

        /* renamed from: h */
        public PSTNInfo.BindType f127344h;

        /* renamed from: a */
        public VCParticipantAbbrInfo build() {
            Participant.Status status;
            ByteviewUser byteviewUser = this.f127337a;
            if (byteviewUser != null && (status = this.f127338b) != null) {
                return new VCParticipantAbbrInfo(byteviewUser, status, this.f127339c, this.f127340d, this.f127341e, this.f127342f, this.f127343g, this.f127344h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteviewUser, "user", this.f127338b, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public C51164a newBuilder() {
        C51164a aVar = new C51164a();
        aVar.f127337a = this.user;
        aVar.f127338b = this.status;
        aVar.f127339c = this.device_type;
        aVar.f127340d = this.join_time_ms;
        aVar.f127341e = this.tenant_id;
        aVar.f127342f = this.is_lark_guest;
        aVar.f127343g = this.bind_id;
        aVar.f127344h = this.bind_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCParticipantAbbrInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", status=");
        sb.append(this.status);
        if (this.device_type != null) {
            sb.append(", device_type=");
            sb.append(this.device_type);
        }
        if (this.join_time_ms != null) {
            sb.append(", join_time_ms=");
            sb.append(this.join_time_ms);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.is_lark_guest != null) {
            sb.append(", is_lark_guest=");
            sb.append(this.is_lark_guest);
        }
        if (this.bind_id != null) {
            sb.append(", bind_id=");
            sb.append(this.bind_id);
        }
        if (this.bind_type != null) {
            sb.append(", bind_type=");
            sb.append(this.bind_type);
        }
        StringBuilder replace = sb.replace(0, 2, "VCParticipantAbbrInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCParticipantAbbrInfo(ByteviewUser byteviewUser, Participant.Status status2, Participant.DeviceType deviceType, Long l, Long l2, Boolean bool, String str, PSTNInfo.BindType bindType) {
        this(byteviewUser, status2, deviceType, l, l2, bool, str, bindType, ByteString.EMPTY);
    }

    public VCParticipantAbbrInfo(ByteviewUser byteviewUser, Participant.Status status2, Participant.DeviceType deviceType, Long l, Long l2, Boolean bool, String str, PSTNInfo.BindType bindType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = byteviewUser;
        this.status = status2;
        this.device_type = deviceType;
        this.join_time_ms = l;
        this.tenant_id = l2;
        this.is_lark_guest = bool;
        this.bind_id = str;
        this.bind_type = bindType;
    }
}
