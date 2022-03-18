package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class PSTNPhone extends Message<PSTNPhone, C50898a> {
    public static final ProtoAdapter<PSTNPhone> ADAPTER = new C50899b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String country;
    public final String number;
    public final String number_display;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        FREE(1),
        CHARGE(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FREE;
            }
            if (i != 2) {
                return null;
            }
            return CHARGE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PSTNPhone$b */
    private static final class C50899b extends ProtoAdapter<PSTNPhone> {
        C50899b() {
            super(FieldEncoding.LENGTH_DELIMITED, PSTNPhone.class);
        }

        /* renamed from: a */
        public int encodedSize(PSTNPhone pSTNPhone) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pSTNPhone.country) + Type.ADAPTER.encodedSizeWithTag(2, pSTNPhone.type) + ProtoAdapter.STRING.encodedSizeWithTag(3, pSTNPhone.number);
            if (pSTNPhone.number_display != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, pSTNPhone.number_display);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pSTNPhone.unknownFields().size();
        }

        /* renamed from: a */
        public PSTNPhone decode(ProtoReader protoReader) throws IOException {
            C50898a aVar = new C50898a();
            aVar.f126833a = "";
            aVar.f126834b = Type.UNKNOWN;
            aVar.f126835c = "";
            aVar.f126836d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126833a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126834b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f126835c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126836d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PSTNPhone pSTNPhone) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pSTNPhone.country);
            Type.ADAPTER.encodeWithTag(protoWriter, 2, pSTNPhone.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pSTNPhone.number);
            if (pSTNPhone.number_display != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pSTNPhone.number_display);
            }
            protoWriter.writeBytes(pSTNPhone.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50898a newBuilder() {
        C50898a aVar = new C50898a();
        aVar.f126833a = this.country;
        aVar.f126834b = this.type;
        aVar.f126835c = this.number;
        aVar.f126836d = this.number_display;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PSTNPhone$a */
    public static final class C50898a extends Message.Builder<PSTNPhone, C50898a> {

        /* renamed from: a */
        public String f126833a;

        /* renamed from: b */
        public Type f126834b;

        /* renamed from: c */
        public String f126835c;

        /* renamed from: d */
        public String f126836d;

        /* renamed from: a */
        public PSTNPhone build() {
            Type type;
            String str;
            String str2 = this.f126833a;
            if (str2 != null && (type = this.f126834b) != null && (str = this.f126835c) != null) {
                return new PSTNPhone(str2, type, str, this.f126836d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "country", this.f126834b, ShareHitPoint.f121869d, this.f126835c, "number");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PSTNPhone");
        StringBuilder sb = new StringBuilder();
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", number=");
        sb.append(this.number);
        if (this.number_display != null) {
            sb.append(", number_display=");
            sb.append(this.number_display);
        }
        StringBuilder replace = sb.replace(0, 2, "PSTNPhone{");
        replace.append('}');
        return replace.toString();
    }

    public PSTNPhone(String str, Type type2, String str2, String str3) {
        this(str, type2, str2, str3, ByteString.EMPTY);
    }

    public PSTNPhone(String str, Type type2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.country = str;
        this.type = type2;
        this.number = str2;
        this.number_display = str3;
    }
}
