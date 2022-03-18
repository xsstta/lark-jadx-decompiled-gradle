package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Span extends Message<Span, C15286a> {
    public static final ProtoAdapter<Span> ADAPTER = new C15287b();
    public static final Integer DEFAULT_END = 0;
    public static final Integer DEFAULT_START = 0;
    private static final long serialVersionUID = 0;
    public final Integer end;
    public final Integer start;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Span$b */
    private static final class C15287b extends ProtoAdapter<Span> {
        C15287b() {
            super(FieldEncoding.LENGTH_DELIMITED, Span.class);
        }

        /* renamed from: a */
        public int encodedSize(Span span) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, span.start) + ProtoAdapter.INT32.encodedSizeWithTag(2, span.end) + span.unknownFields().size();
        }

        /* renamed from: a */
        public Span decode(ProtoReader protoReader) throws IOException {
            C15286a aVar = new C15286a();
            aVar.f40488a = 0;
            aVar.f40489b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40488a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40489b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Span span) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, span.start);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, span.end);
            protoWriter.writeBytes(span.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15286a newBuilder() {
        C15286a aVar = new C15286a();
        aVar.f40488a = this.start;
        aVar.f40489b = this.end;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Span$a */
    public static final class C15286a extends Message.Builder<Span, C15286a> {

        /* renamed from: a */
        public Integer f40488a;

        /* renamed from: b */
        public Integer f40489b;

        /* renamed from: a */
        public Span build() {
            Integer num;
            Integer num2 = this.f40488a;
            if (num2 != null && (num = this.f40489b) != null) {
                return new Span(num2, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "start", this.f40489b, "end");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Span");
        StringBuilder sb = new StringBuilder();
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        StringBuilder replace = sb.replace(0, 2, "Span{");
        replace.append('}');
        return replace.toString();
    }

    public Span(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public Span(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start = num;
        this.end = num2;
    }
}
