package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BorderRadius extends Message<BorderRadius, C16130a> {
    public static final ProtoAdapter<BorderRadius> ADAPTER = new C16131b();
    public static final Double DEFAULT_BOTTOM_LEFT;
    public static final Double DEFAULT_BOTTOM_RIGHT;
    public static final Double DEFAULT_TOP_LEFT;
    public static final Double DEFAULT_TOP_RIGHT;
    private static final long serialVersionUID = 0;
    public final Double bottom_left;
    public final Double bottom_right;
    public final Double top_left;
    public final Double top_right;

    /* renamed from: com.bytedance.lark.pb.contact.v1.BorderRadius$b */
    private static final class C16131b extends ProtoAdapter<BorderRadius> {
        C16131b() {
            super(FieldEncoding.LENGTH_DELIMITED, BorderRadius.class);
        }

        /* renamed from: a */
        public int encodedSize(BorderRadius borderRadius) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, borderRadius.top_left) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, borderRadius.top_right) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, borderRadius.bottom_left) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, borderRadius.bottom_right) + borderRadius.unknownFields().size();
        }

        /* renamed from: a */
        public BorderRadius decode(ProtoReader protoReader) throws IOException {
            C16130a aVar = new C16130a();
            Double valueOf = Double.valueOf(0.0d);
            aVar.f42242a = valueOf;
            aVar.f42243b = valueOf;
            aVar.f42244c = valueOf;
            aVar.f42245d = valueOf;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42242a = ProtoAdapter.DOUBLE.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42243b = ProtoAdapter.DOUBLE.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42244c = ProtoAdapter.DOUBLE.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42245d = ProtoAdapter.DOUBLE.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BorderRadius borderRadius) throws IOException {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, borderRadius.top_left);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, borderRadius.top_right);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, borderRadius.bottom_left);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, borderRadius.bottom_right);
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
    public C16130a newBuilder() {
        C16130a aVar = new C16130a();
        aVar.f42242a = this.top_left;
        aVar.f42243b = this.top_right;
        aVar.f42244c = this.bottom_left;
        aVar.f42245d = this.bottom_right;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.BorderRadius$a */
    public static final class C16130a extends Message.Builder<BorderRadius, C16130a> {

        /* renamed from: a */
        public Double f42242a;

        /* renamed from: b */
        public Double f42243b;

        /* renamed from: c */
        public Double f42244c;

        /* renamed from: d */
        public Double f42245d;

        /* renamed from: a */
        public BorderRadius build() {
            Double d;
            Double d2;
            Double d3;
            Double d4 = this.f42242a;
            if (d4 != null && (d = this.f42243b) != null && (d2 = this.f42244c) != null && (d3 = this.f42245d) != null) {
                return new BorderRadius(d4, d, d2, d3, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(d4, "top_left", this.f42243b, "top_right", this.f42244c, "bottom_left", this.f42245d, "bottom_right");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "BorderRadius");
        StringBuilder sb = new StringBuilder();
        sb.append(", top_left=");
        sb.append(this.top_left);
        sb.append(", top_right=");
        sb.append(this.top_right);
        sb.append(", bottom_left=");
        sb.append(this.bottom_left);
        sb.append(", bottom_right=");
        sb.append(this.bottom_right);
        StringBuilder replace = sb.replace(0, 2, "BorderRadius{");
        replace.append('}');
        return replace.toString();
    }

    public BorderRadius(Double d, Double d2, Double d3, Double d4) {
        this(d, d2, d3, d4, ByteString.EMPTY);
    }

    public BorderRadius(Double d, Double d2, Double d3, Double d4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.top_left = d;
        this.top_right = d2;
        this.bottom_left = d3;
        this.bottom_right = d4;
    }
}
