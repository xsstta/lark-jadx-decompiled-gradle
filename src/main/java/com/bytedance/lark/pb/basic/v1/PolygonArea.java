package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PolygonArea extends Message<PolygonArea, C15117a> {
    public static final ProtoAdapter<PolygonArea> ADAPTER = new C15118b();
    private static final long serialVersionUID = 0;
    public final List<Coordinate> points;

    /* renamed from: com.bytedance.lark.pb.basic.v1.PolygonArea$b */
    private static final class C15118b extends ProtoAdapter<PolygonArea> {
        C15118b() {
            super(FieldEncoding.LENGTH_DELIMITED, PolygonArea.class);
        }

        /* renamed from: a */
        public int encodedSize(PolygonArea polygonArea) {
            return Coordinate.ADAPTER.asRepeated().encodedSizeWithTag(1, polygonArea.points) + polygonArea.unknownFields().size();
        }

        /* renamed from: a */
        public PolygonArea decode(ProtoReader protoReader) throws IOException {
            C15117a aVar = new C15117a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40081a.add(Coordinate.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PolygonArea polygonArea) throws IOException {
            Coordinate.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, polygonArea.points);
            protoWriter.writeBytes(polygonArea.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PolygonArea$a */
    public static final class C15117a extends Message.Builder<PolygonArea, C15117a> {

        /* renamed from: a */
        public List<Coordinate> f40081a = Internal.newMutableList();

        /* renamed from: a */
        public PolygonArea build() {
            return new PolygonArea(this.f40081a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15117a newBuilder() {
        C15117a aVar = new C15117a();
        aVar.f40081a = Internal.copyOf("points", this.points);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PolygonArea");
        StringBuilder sb = new StringBuilder();
        if (!this.points.isEmpty()) {
            sb.append(", points=");
            sb.append(this.points);
        }
        StringBuilder replace = sb.replace(0, 2, "PolygonArea{");
        replace.append('}');
        return replace.toString();
    }

    public PolygonArea(List<Coordinate> list) {
        this(list, ByteString.EMPTY);
    }

    public PolygonArea(List<Coordinate> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.points = Internal.immutableCopyOf("points", list);
    }
}
