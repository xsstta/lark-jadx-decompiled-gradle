package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Point extends Message<Point, C49499a> {
    public static final ProtoAdapter<Point> ADAPTER = new C49500b();
    public static final Double DEFAULT_X;
    public static final Double DEFAULT_Y;
    private static final long serialVersionUID = 0;
    public final Double mx;
    public final Double my;

    /* renamed from: com.ss.android.lark.pb.ai.Point$b */
    private static final class C49500b extends ProtoAdapter<Point> {
        C49500b() {
            super(FieldEncoding.LENGTH_DELIMITED, Point.class);
        }

        /* renamed from: a */
        public int encodedSize(Point point) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, point.mx) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, point.my) + point.unknownFields().size();
        }

        /* renamed from: a */
        public Point decode(ProtoReader protoReader) throws IOException {
            C49499a aVar = new C49499a();
            Double valueOf = Double.valueOf(0.0d);
            aVar.f124097a = valueOf;
            aVar.f124098b = valueOf;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124097a = ProtoAdapter.DOUBLE.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124098b = ProtoAdapter.DOUBLE.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Point point) throws IOException {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, point.mx);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, point.my);
            protoWriter.writeBytes(point.unknownFields());
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_X = valueOf;
        DEFAULT_Y = valueOf;
    }

    @Override // com.squareup.wire.Message
    public C49499a newBuilder() {
        C49499a aVar = new C49499a();
        aVar.f124097a = this.mx;
        aVar.f124098b = this.my;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.Point$a */
    public static final class C49499a extends Message.Builder<Point, C49499a> {

        /* renamed from: a */
        public Double f124097a;

        /* renamed from: b */
        public Double f124098b;

        /* renamed from: a */
        public Point build() {
            Double d;
            Double d2 = this.f124097a;
            if (d2 != null && (d = this.f124098b) != null) {
                return new Point(d2, d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(d2, "mx", this.f124098b, "my");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", x=");
        sb.append(this.mx);
        sb.append(", y=");
        sb.append(this.my);
        StringBuilder replace = sb.replace(0, 2, "Point{");
        replace.append('}');
        return replace.toString();
    }

    public Point(Double d, Double d2) {
        this(d, d2, ByteString.EMPTY);
    }

    public Point(Double d, Double d2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mx = d;
        this.my = d2;
    }
}
