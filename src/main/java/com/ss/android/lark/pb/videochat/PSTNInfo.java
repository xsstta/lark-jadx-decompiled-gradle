package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PSTNInfo extends Message<PSTNInfo, C50391a> {
    public static final ProtoAdapter<PSTNInfo> ADAPTER = new C50392b();
    private static final long serialVersionUID = 0;
    public final String mbind_id;
    public final BindType mbind_type;
    public final String mdisplay_name;
    public final String mmain_address;
    public final ParticipantType mparticipant_type;
    public final String msub_address;

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

    /* renamed from: com.ss.android.lark.pb.videochat.PSTNInfo$b */
    private static final class C50392b extends ProtoAdapter<PSTNInfo> {
        C50392b() {
            super(FieldEncoding.LENGTH_DELIMITED, PSTNInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(PSTNInfo pSTNInfo) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pSTNInfo.mmain_address);
            int i4 = 0;
            if (pSTNInfo.msub_address != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, pSTNInfo.msub_address);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ParticipantType.ADAPTER.encodedSizeWithTag(3, pSTNInfo.mparticipant_type);
            if (pSTNInfo.mdisplay_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, pSTNInfo.mdisplay_name);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag2 + i2;
            if (pSTNInfo.mbind_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, pSTNInfo.mbind_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pSTNInfo.mbind_type != null) {
                i4 = BindType.ADAPTER.encodedSizeWithTag(6, pSTNInfo.mbind_type);
            }
            return i6 + i4 + pSTNInfo.unknownFields().size();
        }

        /* renamed from: a */
        public PSTNInfo decode(ProtoReader protoReader) throws IOException {
            C50391a aVar = new C50391a();
            aVar.f125806a = "";
            aVar.f125807b = "";
            aVar.f125809d = "";
            aVar.f125810e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125806a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125807b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f125808c = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f125809d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125810e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f125811f = BindType.ADAPTER.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pSTNInfo.mmain_address);
            if (pSTNInfo.msub_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pSTNInfo.msub_address);
            }
            ParticipantType.ADAPTER.encodeWithTag(protoWriter, 3, pSTNInfo.mparticipant_type);
            if (pSTNInfo.mdisplay_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pSTNInfo.mdisplay_name);
            }
            if (pSTNInfo.mbind_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pSTNInfo.mbind_id);
            }
            if (pSTNInfo.mbind_type != null) {
                BindType.ADAPTER.encodeWithTag(protoWriter, 6, pSTNInfo.mbind_type);
            }
            protoWriter.writeBytes(pSTNInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.PSTNInfo$a */
    public static final class C50391a extends Message.Builder<PSTNInfo, C50391a> {

        /* renamed from: a */
        public String f125806a;

        /* renamed from: b */
        public String f125807b;

        /* renamed from: c */
        public ParticipantType f125808c;

        /* renamed from: d */
        public String f125809d;

        /* renamed from: e */
        public String f125810e;

        /* renamed from: f */
        public BindType f125811f;

        /* renamed from: a */
        public PSTNInfo build() {
            ParticipantType participantType;
            String str = this.f125806a;
            if (str != null && (participantType = this.f125808c) != null) {
                return new PSTNInfo(str, this.f125807b, participantType, this.f125809d, this.f125810e, this.f125811f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mmain_address", this.f125808c, "mparticipant_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C50391a newBuilder() {
        C50391a aVar = new C50391a();
        aVar.f125806a = this.mmain_address;
        aVar.f125807b = this.msub_address;
        aVar.f125808c = this.mparticipant_type;
        aVar.f125809d = this.mdisplay_name;
        aVar.f125810e = this.mbind_id;
        aVar.f125811f = this.mbind_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", main_address=");
        sb.append(this.mmain_address);
        if (this.msub_address != null) {
            sb.append(", sub_address=");
            sb.append(this.msub_address);
        }
        sb.append(", participant_type=");
        sb.append(this.mparticipant_type);
        if (this.mdisplay_name != null) {
            sb.append(", display_name=");
            sb.append(this.mdisplay_name);
        }
        if (this.mbind_id != null) {
            sb.append(", bind_id=");
            sb.append(this.mbind_id);
        }
        if (this.mbind_type != null) {
            sb.append(", bind_type=");
            sb.append(this.mbind_type);
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
        this.mmain_address = str;
        this.msub_address = str2;
        this.mparticipant_type = participantType;
        this.mdisplay_name = str3;
        this.mbind_id = str4;
        this.mbind_type = bindType;
    }
}
