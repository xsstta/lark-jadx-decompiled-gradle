package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Coordinate extends Message<Coordinate, C14858a> {
    public static final ProtoAdapter<Coordinate> ADAPTER = new C14859b();
    public static final Float DEFAULT_LATITUDE;
    public static final Float DEFAULT_LONGITUDE;
    private static final long serialVersionUID = 0;
    public final Float latitude;
    public final Float longitude;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Coordinate$b */
    private static final class C14859b extends ProtoAdapter<Coordinate> {
        C14859b() {
            super(FieldEncoding.LENGTH_DELIMITED, Coordinate.class);
        }

        /* renamed from: a */
        public int encodedSize(Coordinate coordinate) {
            int i;
            int i2 = 0;
            if (coordinate.longitude != null) {
                i = ProtoAdapter.FLOAT.encodedSizeWithTag(1, coordinate.longitude);
            } else {
                i = 0;
            }
            if (coordinate.latitude != null) {
                i2 = ProtoAdapter.FLOAT.encodedSizeWithTag(2, coordinate.latitude);
            }
            return i + i2 + coordinate.unknownFields().size();
        }

        /* renamed from: a */
        public Coordinate decode(ProtoReader protoReader) throws IOException {
            C14858a aVar = new C14858a();
            Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            aVar.f39289a = valueOf;
            aVar.f39290b = valueOf;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39289a = ProtoAdapter.FLOAT.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39290b = ProtoAdapter.FLOAT.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Coordinate coordinate) throws IOException {
            if (coordinate.longitude != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, coordinate.longitude);
            }
            if (coordinate.latitude != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, coordinate.latitude);
            }
            protoWriter.writeBytes(coordinate.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Coordinate$a */
    public static final class C14858a extends Message.Builder<Coordinate, C14858a> {

        /* renamed from: a */
        public Float f39289a;

        /* renamed from: b */
        public Float f39290b;

        /* renamed from: a */
        public Coordinate build() {
            return new Coordinate(this.f39289a, this.f39290b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14858a mo54495a(Float f) {
            this.f39289a = f;
            return this;
        }

        /* renamed from: b */
        public C14858a mo54497b(Float f) {
            this.f39290b = f;
            return this;
        }
    }

    static {
        Float valueOf = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        DEFAULT_LONGITUDE = valueOf;
        DEFAULT_LATITUDE = valueOf;
    }

    @Override // com.squareup.wire.Message
    public C14858a newBuilder() {
        C14858a aVar = new C14858a();
        aVar.f39289a = this.longitude;
        aVar.f39290b = this.latitude;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Coordinate");
        StringBuilder sb = new StringBuilder();
        if (this.longitude != null) {
            sb.append(", longitude=");
            sb.append(this.longitude);
        }
        if (this.latitude != null) {
            sb.append(", latitude=");
            sb.append(this.latitude);
        }
        StringBuilder replace = sb.replace(0, 2, "Coordinate{");
        replace.append('}');
        return replace.toString();
    }

    public Coordinate(Float f, Float f2) {
        this(f, f2, ByteString.EMPTY);
    }

    public Coordinate(Float f, Float f2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.longitude = f;
        this.latitude = f2;
    }
}
