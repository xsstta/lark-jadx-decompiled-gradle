package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PSTNInfo extends Message<PSTNInfo, C50896a> {
    public static final ProtoAdapter<PSTNInfo> ADAPTER = new C50897b();
    public static final BindType DEFAULT_BIND_TYPE = BindType.UNKNOWN;
    public static final ParticipantType DEFAULT_PARTICIPANT_TYPE = ParticipantType.UNKNOW;
    private static final long serialVersionUID = 0;
    public final String bind_id;
    public final BindType bind_type;
    public final String display_name;
    public final String main_address;
    public final ParticipantType participant_type;
    public final String sub_address;

    public enum BindType implements WireEnum {
        UNKNOWN(0),
        LARK(1);
        
        public static final ProtoAdapter<BindType> ADAPTER = ProtoAdapter.newEnumAdapter(BindType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static BindType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return LARK;
        }

        private BindType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PSTNInfo$b */
    private static final class C50897b extends ProtoAdapter<PSTNInfo> {
        C50897b() {
            super(FieldEncoding.LENGTH_DELIMITED, PSTNInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(PSTNInfo pSTNInfo) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pSTNInfo.main_address);
            int i4 = 0;
            if (pSTNInfo.sub_address != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, pSTNInfo.sub_address);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ParticipantType.ADAPTER.encodedSizeWithTag(3, pSTNInfo.participant_type);
            if (pSTNInfo.display_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, pSTNInfo.display_name);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag2 + i2;
            if (pSTNInfo.bind_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, pSTNInfo.bind_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pSTNInfo.bind_type != null) {
                i4 = BindType.ADAPTER.encodedSizeWithTag(6, pSTNInfo.bind_type);
            }
            return i6 + i4 + pSTNInfo.unknownFields().size();
        }

        /* renamed from: a */
        public PSTNInfo decode(ProtoReader protoReader) throws IOException {
            C50896a aVar = new C50896a();
            aVar.f126827a = "";
            aVar.f126828b = "";
            aVar.f126829c = ParticipantType.UNKNOW;
            aVar.f126830d = "";
            aVar.f126831e = "";
            aVar.f126832f = BindType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126827a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126828b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f126829c = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f126830d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126831e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f126832f = BindType.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PSTNInfo pSTNInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pSTNInfo.main_address);
            if (pSTNInfo.sub_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pSTNInfo.sub_address);
            }
            ParticipantType.ADAPTER.encodeWithTag(protoWriter, 3, pSTNInfo.participant_type);
            if (pSTNInfo.display_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pSTNInfo.display_name);
            }
            if (pSTNInfo.bind_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pSTNInfo.bind_id);
            }
            if (pSTNInfo.bind_type != null) {
                BindType.ADAPTER.encodeWithTag(protoWriter, 6, pSTNInfo.bind_type);
            }
            protoWriter.writeBytes(pSTNInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PSTNInfo$a */
    public static final class C50896a extends Message.Builder<PSTNInfo, C50896a> {

        /* renamed from: a */
        public String f126827a;

        /* renamed from: b */
        public String f126828b;

        /* renamed from: c */
        public ParticipantType f126829c;

        /* renamed from: d */
        public String f126830d;

        /* renamed from: e */
        public String f126831e;

        /* renamed from: f */
        public BindType f126832f;

        /* renamed from: a */
        public PSTNInfo build() {
            ParticipantType participantType;
            String str = this.f126827a;
            if (str != null && (participantType = this.f126829c) != null) {
                return new PSTNInfo(str, this.f126828b, participantType, this.f126830d, this.f126831e, this.f126832f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "main_address", this.f126829c, "participant_type");
        }

        /* renamed from: a */
        public C50896a mo175835a(ParticipantType participantType) {
            this.f126829c = participantType;
            return this;
        }

        /* renamed from: b */
        public C50896a mo175838b(String str) {
            this.f126828b = str;
            return this;
        }

        /* renamed from: c */
        public C50896a mo175839c(String str) {
            this.f126830d = str;
            return this;
        }

        /* renamed from: a */
        public C50896a mo175836a(String str) {
            this.f126827a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50896a newBuilder() {
        C50896a aVar = new C50896a();
        aVar.f126827a = this.main_address;
        aVar.f126828b = this.sub_address;
        aVar.f126829c = this.participant_type;
        aVar.f126830d = this.display_name;
        aVar.f126831e = this.bind_id;
        aVar.f126832f = this.bind_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PSTNInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", main_address=");
        sb.append(this.main_address);
        if (this.sub_address != null) {
            sb.append(", sub_address=");
            sb.append(this.sub_address);
        }
        sb.append(", participant_type=");
        sb.append(this.participant_type);
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        if (this.bind_id != null) {
            sb.append(", bind_id=");
            sb.append(this.bind_id);
        }
        if (this.bind_type != null) {
            sb.append(", bind_type=");
            sb.append(this.bind_type);
        }
        StringBuilder replace = sb.replace(0, 2, "PSTNInfo{");
        replace.append('}');
        return replace.toString();
    }

    public PSTNInfo(String str, String str2, ParticipantType participantType, String str3, String str4, BindType bindType) {
        this(str, str2, participantType, str3, str4, bindType, ByteString.EMPTY);
    }

    public PSTNInfo(String str, String str2, ParticipantType participantType, String str3, String str4, BindType bindType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.main_address = str;
        this.sub_address = str2;
        this.participant_type = participantType;
        this.display_name = str3;
        this.bind_id = str4;
        this.bind_type = bindType;
    }
}
