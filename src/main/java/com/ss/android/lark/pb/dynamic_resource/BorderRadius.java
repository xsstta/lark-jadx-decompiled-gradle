package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BorderRadius extends Message<BorderRadius, C49616a> {
    public static final ProtoAdapter<BorderRadius> ADAPTER = new C49617b();
    public static final Double DEFAULT_BOTTOM_LEFT;
    public static final Double DEFAULT_BOTTOM_RIGHT;
    public static final Double DEFAULT_TOP_LEFT;
    public static final Double DEFAULT_TOP_RIGHT;
    private static final long serialVersionUID = 0;
    public final Double mbottom_left;
    public final Double mbottom_right;
    public final Double mtop_left;
    public final Double mtop_right;

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.BorderRadius$b */
    private static final class C49617b extends ProtoAdapter<BorderRadius> {
        C49617b() {
            super(FieldEncoding.LENGTH_DELIMITED, BorderRadius.class);
        }

        /* renamed from: a */
        public int encodedSize(BorderRadius borderRadius) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, borderRadius.mtop_left) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, borderRadius.mtop_right) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, borderRadius.mbottom_left) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, borderRadius.mbottom_right) + borderRadius.unknownFields().size();
        }

        /* renamed from: a */
        public BorderRadius decode(ProtoReader protoReader) throws IOException {
            C49616a aVar = new C49616a();
            Double valueOf = Double.valueOf(0.0d);
            aVar.f124241a = valueOf;
            aVar.f124242b = valueOf;
            aVar.f124243c = valueOf;
            aVar.f124244d = valueOf;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124241a = ProtoAdapter.DOUBLE.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124242b = ProtoAdapter.DOUBLE.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124243c = ProtoAdapter.DOUBLE.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124244d = ProtoAdapter.DOUBLE.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BorderRadius borderRadius) throws IOException {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, borderRadius.mtop_left);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, borderRadius.mtop_right);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, borderRadius.mbottom_left);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, borderRadius.mbottom_right);
            protoWriter.writeBytes(borderRadius.unknownFields());
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_TOP_LEFT = valueOf;
        DEFAULT_TOP_RIGHT = valueOf;
        DEFAULT_BOTTOM_LEFT = valueOf;
        DEFAULT_BOTTOM_RIGHT = valueOf;
    }

    @Override // com.squareup.wire.Message
    public C49616a newBuilder() {
        C49616a aVar = new C49616a();
        aVar.f124241a = this.mtop_left;
        aVar.f124242b = this.mtop_right;
        aVar.f124243c = this.mbottom_left;
        aVar.f124244d = this.mbottom_right;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", top_left=");
        sb.append(this.mtop_left);
        sb.append(", top_right=");
        sb.append(this.mtop_right);
        sb.append(", bottom_left=");
        sb.append(this.mbottom_left);
        sb.append(", bottom_right=");
        sb.append(this.mbottom_right);
        StringBuilder replace = sb.replace(0, 2, "BorderRadius{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.BorderRadius$a */
    public static final class C49616a extends Message.Builder<BorderRadius, C49616a> {

        /* renamed from: a */
        public Double f124241a;

        /* renamed from: b */
        public Double f124242b;

        /* renamed from: c */
        public Double f124243c;

        /* renamed from: d */
        public Double f124244d;

        /* renamed from: a */
        public BorderRadius build() {
            Double d;
            Double d2;
            Double d3;
            Double d4 = this.f124241a;
            if (d4 != null && (d = this.f124242b) != null && (d2 = this.f124243c) != null && (d3 = this.f124244d) != null) {
                return new BorderRadius(d4, d, d2, d3, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(d4, "mtop_left", this.f124242b, "mtop_right", this.f124243c, "mbottom_left", this.f124244d, "mbottom_right");
        }
    }

    public BorderRadius(Double d, Double d2, Double d3, Double d4) {
        this(d, d2, d3, d4, ByteString.EMPTY);
    }

    public BorderRadius(Double d, Double d2, Double d3, Double d4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtop_left = d;
        this.mtop_right = d2;
        this.mbottom_left = d3;
        this.mbottom_right = d4;
    }
}
