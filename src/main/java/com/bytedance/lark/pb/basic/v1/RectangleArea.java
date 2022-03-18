package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RectangleArea extends Message<RectangleArea, C15145a> {
    public static final ProtoAdapter<RectangleArea> ADAPTER = new C15146b();
    private static final long serialVersionUID = 0;
    public final Coordinate north_east;
    public final Coordinate south_west;

    /* renamed from: com.bytedance.lark.pb.basic.v1.RectangleArea$b */
    private static final class C15146b extends ProtoAdapter<RectangleArea> {
        C15146b() {
            super(FieldEncoding.LENGTH_DELIMITED, RectangleArea.class);
        }

        /* renamed from: a */
        public int encodedSize(RectangleArea rectangleArea) {
            int i;
            int i2 = 0;
            if (rectangleArea.north_east != null) {
                i = Coordinate.ADAPTER.encodedSizeWithTag(1, rectangleArea.north_east);
            } else {
                i = 0;
            }
            if (rectangleArea.south_west != null) {
                i2 = Coordinate.ADAPTER.encodedSizeWithTag(2, rectangleArea.south_west);
            }
            return i + i2 + rectangleArea.unknownFields().size();
        }

        /* renamed from: a */
        public RectangleArea decode(ProtoReader protoReader) throws IOException {
            C15145a aVar = new C15145a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40183a = Coordinate.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40184b = Coordinate.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RectangleArea rectangleArea) throws IOException {
            if (rectangleArea.north_east != null) {
                Coordinate.ADAPTER.encodeWithTag(protoWriter, 1, rectangleArea.north_east);
            }
            if (rectangleArea.south_west != null) {
                Coordinate.ADAPTER.encodeWithTag(protoWriter, 2, rectangleArea.south_west);
            }
            protoWriter.writeBytes(rectangleArea.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.RectangleArea$a */
    public static final class C15145a extends Message.Builder<RectangleArea, C15145a> {

        /* renamed from: a */
        public Coordinate f40183a;

        /* renamed from: b */
        public Coordinate f40184b;

        /* renamed from: a */
        public RectangleArea build() {
            return new RectangleArea(this.f40183a, this.f40184b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15145a newBuilder() {
        C15145a aVar = new C15145a();
        aVar.f40183a = this.north_east;
        aVar.f40184b = this.south_west;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "RectangleArea");
        StringBuilder sb = new StringBuilder();
        if (this.north_east != null) {
            sb.append(", north_east=");
            sb.append(this.north_east);
        }
        if (this.south_west != null) {
            sb.append(", south_west=");
            sb.append(this.south_west);
        }
        StringBuilder replace = sb.replace(0, 2, "RectangleArea{");
        replace.append('}');
        return replace.toString();
    }

    public RectangleArea(Coordinate coordinate, Coordinate coordinate2) {
        this(coordinate, coordinate2, ByteString.EMPTY);
    }

    public RectangleArea(Coordinate coordinate, Coordinate coordinate2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.north_east = coordinate;
        this.south_west = coordinate2;
    }
}
