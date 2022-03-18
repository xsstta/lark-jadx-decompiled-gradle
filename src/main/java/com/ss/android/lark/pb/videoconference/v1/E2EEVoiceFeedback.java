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
import java.util.List;
import okio.ByteString;

public final class E2EEVoiceFeedback extends Message<E2EEVoiceFeedback, C50535a> {
    public static final ProtoAdapter<E2EEVoiceFeedback> ADAPTER = new C50536b();
    public static final Evaluation DEFAULT_EVALUATION = Evaluation.Evaluation_UNKNOWN;
    public static final NetworkType DEFAULT_NETWORK_TYPE = NetworkType.OTHERTYPE;
    private static final long serialVersionUID = 0;
    public final String carrier_name;
    public final String comment;
    public final String device_model;
    public final Evaluation evaluation;
    public final String lark_version;
    public final String manufacturer;
    public final NetworkType network_type;
    public final String rtc_provider;
    public final String sdk_version;
    public final List<Tag> tags;

    public enum Evaluation implements WireEnum {
        Evaluation_UNKNOWN(0),
        GOOD_CALL_QUALITY(1),
        POOR_CALL_QUALITY(2);
        
        public static final ProtoAdapter<Evaluation> ADAPTER = ProtoAdapter.newEnumAdapter(Evaluation.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Evaluation fromValue(int i) {
            if (i == 0) {
                return Evaluation_UNKNOWN;
            }
            if (i == 1) {
                return GOOD_CALL_QUALITY;
            }
            if (i != 2) {
                return null;
            }
            return POOR_CALL_QUALITY;
        }

        private Evaluation(int i) {
            this.value = i;
        }
    }

    public enum NetworkType implements WireEnum {
        OTHERTYPE(0),
        G3(1),
        G4(2),
        G5(3),
        WIFI(4),
        LAN(5);
        
        public static final ProtoAdapter<NetworkType> ADAPTER = ProtoAdapter.newEnumAdapter(NetworkType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static NetworkType fromValue(int i) {
            if (i == 0) {
                return OTHERTYPE;
            }
            if (i == 1) {
                return G3;
            }
            if (i == 2) {
                return G4;
            }
            if (i == 3) {
                return G5;
            }
            if (i == 4) {
                return WIFI;
            }
            if (i != 5) {
                return null;
            }
            return LAN;
        }

        private NetworkType(int i) {
            this.value = i;
        }
    }

    public enum Tag implements WireEnum {
        Tag_UNKNOWN(0),
        HUNG_UP_UNEXPECTEDLY(1),
        NOT_CLEAR_AND_NOISY(2),
        GOES_ON_AND_OFF(3),
        CANNOT_HEAR(4),
        OTHER(5);
        
        public static final ProtoAdapter<Tag> ADAPTER = ProtoAdapter.newEnumAdapter(Tag.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Tag fromValue(int i) {
            if (i == 0) {
                return Tag_UNKNOWN;
            }
            if (i == 1) {
                return HUNG_UP_UNEXPECTEDLY;
            }
            if (i == 2) {
                return NOT_CLEAR_AND_NOISY;
            }
            if (i == 3) {
                return GOES_ON_AND_OFF;
            }
            if (i == 4) {
                return CANNOT_HEAR;
            }
            if (i != 5) {
                return null;
            }
            return OTHER;
        }

        private Tag(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.E2EEVoiceFeedback$b */
    private static final class C50536b extends ProtoAdapter<E2EEVoiceFeedback> {
        C50536b() {
            super(FieldEncoding.LENGTH_DELIMITED, E2EEVoiceFeedback.class);
        }

        /* renamed from: a */
        public int encodedSize(E2EEVoiceFeedback e2EEVoiceFeedback) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (e2EEVoiceFeedback.comment != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, e2EEVoiceFeedback.comment);
            } else {
                i = 0;
            }
            if (e2EEVoiceFeedback.evaluation != null) {
                i2 = Evaluation.ADAPTER.encodedSizeWithTag(2, e2EEVoiceFeedback.evaluation);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(3, e2EEVoiceFeedback.tags);
            if (e2EEVoiceFeedback.sdk_version != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, e2EEVoiceFeedback.sdk_version);
            } else {
                i3 = 0;
            }
            int i10 = encodedSizeWithTag + i3;
            if (e2EEVoiceFeedback.lark_version != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, e2EEVoiceFeedback.lark_version);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (e2EEVoiceFeedback.manufacturer != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, e2EEVoiceFeedback.manufacturer);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (e2EEVoiceFeedback.device_model != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, e2EEVoiceFeedback.device_model);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (e2EEVoiceFeedback.network_type != null) {
                i7 = NetworkType.ADAPTER.encodedSizeWithTag(8, e2EEVoiceFeedback.network_type);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (e2EEVoiceFeedback.carrier_name != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, e2EEVoiceFeedback.carrier_name);
            } else {
                i8 = 0;
            }
            int i15 = i14 + i8;
            if (e2EEVoiceFeedback.rtc_provider != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, e2EEVoiceFeedback.rtc_provider);
            }
            return i15 + i9 + e2EEVoiceFeedback.unknownFields().size();
        }

        /* renamed from: a */
        public E2EEVoiceFeedback decode(ProtoReader protoReader) throws IOException {
            C50535a aVar = new C50535a();
            aVar.f126158a = "";
            aVar.f126159b = Evaluation.Evaluation_UNKNOWN;
            aVar.f126161d = "";
            aVar.f126162e = "";
            aVar.f126163f = "";
            aVar.f126164g = "";
            aVar.f126165h = NetworkType.OTHERTYPE;
            aVar.f126166i = "";
            aVar.f126167j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126158a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f126159b = Evaluation.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f126160c.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f126161d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126162e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126163f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126164g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f126165h = NetworkType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 9:
                            aVar.f126166i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126167j = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, E2EEVoiceFeedback e2EEVoiceFeedback) throws IOException {
            if (e2EEVoiceFeedback.comment != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, e2EEVoiceFeedback.comment);
            }
            if (e2EEVoiceFeedback.evaluation != null) {
                Evaluation.ADAPTER.encodeWithTag(protoWriter, 2, e2EEVoiceFeedback.evaluation);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, e2EEVoiceFeedback.tags);
            if (e2EEVoiceFeedback.sdk_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, e2EEVoiceFeedback.sdk_version);
            }
            if (e2EEVoiceFeedback.lark_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, e2EEVoiceFeedback.lark_version);
            }
            if (e2EEVoiceFeedback.manufacturer != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, e2EEVoiceFeedback.manufacturer);
            }
            if (e2EEVoiceFeedback.device_model != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, e2EEVoiceFeedback.device_model);
            }
            if (e2EEVoiceFeedback.network_type != null) {
                NetworkType.ADAPTER.encodeWithTag(protoWriter, 8, e2EEVoiceFeedback.network_type);
            }
            if (e2EEVoiceFeedback.carrier_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, e2EEVoiceFeedback.carrier_name);
            }
            if (e2EEVoiceFeedback.rtc_provider != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, e2EEVoiceFeedback.rtc_provider);
            }
            protoWriter.writeBytes(e2EEVoiceFeedback.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.E2EEVoiceFeedback$a */
    public static final class C50535a extends Message.Builder<E2EEVoiceFeedback, C50535a> {

        /* renamed from: a */
        public String f126158a;

        /* renamed from: b */
        public Evaluation f126159b;

        /* renamed from: c */
        public List<Tag> f126160c = Internal.newMutableList();

        /* renamed from: d */
        public String f126161d;

        /* renamed from: e */
        public String f126162e;

        /* renamed from: f */
        public String f126163f;

        /* renamed from: g */
        public String f126164g;

        /* renamed from: h */
        public NetworkType f126165h;

        /* renamed from: i */
        public String f126166i;

        /* renamed from: j */
        public String f126167j;

        /* renamed from: a */
        public E2EEVoiceFeedback build() {
            return new E2EEVoiceFeedback(this.f126158a, this.f126159b, this.f126160c, this.f126161d, this.f126162e, this.f126163f, this.f126164g, this.f126165h, this.f126166i, this.f126167j, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50535a mo175006a(Evaluation evaluation) {
            this.f126159b = evaluation;
            return this;
        }

        /* renamed from: b */
        public C50535a mo175011b(String str) {
            this.f126161d = str;
            return this;
        }

        /* renamed from: c */
        public C50535a mo175012c(String str) {
            this.f126162e = str;
            return this;
        }

        /* renamed from: d */
        public C50535a mo175013d(String str) {
            this.f126163f = str;
            return this;
        }

        /* renamed from: e */
        public C50535a mo175014e(String str) {
            this.f126164g = str;
            return this;
        }

        /* renamed from: f */
        public C50535a mo175015f(String str) {
            this.f126166i = str;
            return this;
        }

        /* renamed from: g */
        public C50535a mo175016g(String str) {
            this.f126167j = str;
            return this;
        }

        /* renamed from: a */
        public C50535a mo175007a(NetworkType networkType) {
            this.f126165h = networkType;
            return this;
        }

        /* renamed from: a */
        public C50535a mo175008a(String str) {
            this.f126158a = str;
            return this;
        }

        /* renamed from: a */
        public C50535a mo175009a(List<Tag> list) {
            Internal.checkElementsNotNull(list);
            this.f126160c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50535a newBuilder() {
        C50535a aVar = new C50535a();
        aVar.f126158a = this.comment;
        aVar.f126159b = this.evaluation;
        aVar.f126160c = Internal.copyOf("tags", this.tags);
        aVar.f126161d = this.sdk_version;
        aVar.f126162e = this.lark_version;
        aVar.f126163f = this.manufacturer;
        aVar.f126164g = this.device_model;
        aVar.f126165h = this.network_type;
        aVar.f126166i = this.carrier_name;
        aVar.f126167j = this.rtc_provider;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "E2EEVoiceFeedback");
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (this.evaluation != null) {
            sb.append(", evaluation=");
            sb.append(this.evaluation);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.sdk_version != null) {
            sb.append(", sdk_version=");
            sb.append(this.sdk_version);
        }
        if (this.lark_version != null) {
            sb.append(", lark_version=");
            sb.append(this.lark_version);
        }
        if (this.manufacturer != null) {
            sb.append(", manufacturer=");
            sb.append(this.manufacturer);
        }
        if (this.device_model != null) {
            sb.append(", device_model=");
            sb.append(this.device_model);
        }
        if (this.network_type != null) {
            sb.append(", network_type=");
            sb.append(this.network_type);
        }
        if (this.carrier_name != null) {
            sb.append(", carrier_name=");
            sb.append(this.carrier_name);
        }
        if (this.rtc_provider != null) {
            sb.append(", rtc_provider=");
            sb.append(this.rtc_provider);
        }
        StringBuilder replace = sb.replace(0, 2, "E2EEVoiceFeedback{");
        replace.append('}');
        return replace.toString();
    }

    public E2EEVoiceFeedback(String str, Evaluation evaluation2, List<Tag> list, String str2, String str3, String str4, String str5, NetworkType networkType, String str6, String str7) {
        this(str, evaluation2, list, str2, str3, str4, str5, networkType, str6, str7, ByteString.EMPTY);
    }

    public E2EEVoiceFeedback(String str, Evaluation evaluation2, List<Tag> list, String str2, String str3, String str4, String str5, NetworkType networkType, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment = str;
        this.evaluation = evaluation2;
        this.tags = Internal.immutableCopyOf("tags", list);
        this.sdk_version = str2;
        this.lark_version = str3;
        this.manufacturer = str4;
        this.device_model = str5;
        this.network_type = networkType;
        this.carrier_name = str6;
        this.rtc_provider = str7;
    }
}
