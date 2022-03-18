package com.ss.android.lark.pb.mailentities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Timestamp extends Message<Timestamp, C49827a> {
    public static final ProtoAdapter<Timestamp> ADAPTER = new C49828b();
    public static final Long DEFAULT_VALUE = 0L;
    private static final long serialVersionUID = 0;
    public final Unit munit;
    public final Long mvalue;

    public enum Unit implements WireEnum {
        UNKNOWN(0),
        S(1),
        MS(2),
        US(3),
        NS(4);
        
        public static final ProtoAdapter<Unit> ADAPTER = ProtoAdapter.newEnumAdapter(Unit.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Unit fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return S;
            }
            if (i == 2) {
                return MS;
            }
            if (i == 3) {
                return US;
            }
            if (i != 4) {
                return null;
            }
            return NS;
        }

        private Unit(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.mailentities.Timestamp$b */
    private static final class C49828b extends ProtoAdapter<Timestamp> {
        C49828b() {
            super(FieldEncoding.LENGTH_DELIMITED, Timestamp.class);
        }

        /* renamed from: a */
        public int encodedSize(Timestamp timestamp) {
            int i;
            int i2 = 0;
            if (timestamp.munit != null) {
                i = Unit.ADAPTER.encodedSizeWithTag(1, timestamp.munit);
            } else {
                i = 0;
            }
            if (timestamp.mvalue != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, timestamp.mvalue);
            }
            return i + i2 + timestamp.unknownFields().size();
        }

        /* renamed from: a */
        public Timestamp decode(ProtoReader protoReader) throws IOException {
            C49827a aVar = new C49827a();
            aVar.f124779b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124778a = Unit.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124779b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Timestamp timestamp) throws IOException {
            if (timestamp.munit != null) {
                Unit.ADAPTER.encodeWithTag(protoWriter, 1, timestamp.munit);
            }
            if (timestamp.mvalue != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, timestamp.mvalue);
            }
            protoWriter.writeBytes(timestamp.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.mailentities.Timestamp$a */
    public static final class C49827a extends Message.Builder<Timestamp, C49827a> {

        /* renamed from: a */
        public Unit f124778a;

        /* renamed from: b */
        public Long f124779b;

        /* renamed from: a */
        public Timestamp build() {
            return new Timestamp(this.f124778a, this.f124779b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49827a newBuilder() {
        C49827a aVar = new C49827a();
        aVar.f124778a = this.munit;
        aVar.f124779b = this.mvalue;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.munit != null) {
            sb.append(", unit=");
            sb.append(this.munit);
        }
        if (this.mvalue != null) {
            sb.append(", value=");
            sb.append(this.mvalue);
        }
        StringBuilder replace = sb.replace(0, 2, "Timestamp{");
        replace.append('}');
        return replace.toString();
    }

    public Timestamp(Unit unit, Long l) {
        this(unit, l, ByteString.EMPTY);
    }

    public Timestamp(Unit unit, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.munit = unit;
        this.mvalue = l;
    }
}
