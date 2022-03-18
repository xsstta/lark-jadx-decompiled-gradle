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

public final class CircleArea extends Message<CircleArea, C14828a> {
    public static final ProtoAdapter<CircleArea> ADAPTER = new C14829b();
    public static final Float DEFAULT_RADIUS = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
    private static final long serialVersionUID = 0;
    public final Coordinate center;
    public final Float radius;

    /* renamed from: com.bytedance.lark.pb.basic.v1.CircleArea$b */
    private static final class C14829b extends ProtoAdapter<CircleArea> {
        C14829b() {
            super(FieldEncoding.LENGTH_DELIMITED, CircleArea.class);
        }

        /* renamed from: a */
        public int encodedSize(CircleArea circleArea) {
            int i;
            int i2 = 0;
            if (circleArea.center != null) {
                i = Coordinate.ADAPTER.encodedSizeWithTag(1, circleArea.center);
            } else {
                i = 0;
            }
            if (circleArea.radius != null) {
                i2 = ProtoAdapter.FLOAT.encodedSizeWithTag(2, circleArea.radius);
            }
            return i + i2 + circleArea.unknownFields().size();
        }

        /* renamed from: a */
        public CircleArea decode(ProtoReader protoReader) throws IOException {
            C14828a aVar = new C14828a();
            aVar.f39174b = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39173a = Coordinate.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39174b = ProtoAdapter.FLOAT.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CircleArea circleArea) throws IOException {
            if (circleArea.center != null) {
                Coordinate.ADAPTER.encodeWithTag(protoWriter, 1, circleArea.center);
            }
            if (circleArea.radius != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, circleArea.radius);
            }
            protoWriter.writeBytes(circleArea.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CircleArea$a */
    public static final class C14828a extends Message.Builder<CircleArea, C14828a> {

        /* renamed from: a */
        public Coordinate f39173a;

        /* renamed from: b */
        public Float f39174b;

        /* renamed from: a */
        public CircleArea build() {
            return new CircleArea(this.f39173a, this.f39174b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14828a newBuilder() {
        C14828a aVar = new C14828a();
        aVar.f39173a = this.center;
        aVar.f39174b = this.radius;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CircleArea");
        StringBuilder sb = new StringBuilder();
        if (this.center != null) {
            sb.append(", center=");
            sb.append(this.center);
        }
        if (this.radius != null) {
            sb.append(", radius=");
            sb.append(this.radius);
        }
        StringBuilder replace = sb.replace(0, 2, "CircleArea{");
        replace.append('}');
        return replace.toString();
    }

    public CircleArea(Coordinate coordinate, Float f) {
        this(coordinate, f, ByteString.EMPTY);
    }

    public CircleArea(Coordinate coordinate, Float f, ByteString byteString) {
        super(ADAPTER, byteString);
        this.center = coordinate;
        this.radius = f;
    }
}
