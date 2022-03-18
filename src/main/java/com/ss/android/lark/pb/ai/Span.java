package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Span extends Message<Span, C49527a> {
    public static final ProtoAdapter<Span> ADAPTER = new C49528b();
    public static final Integer DEFAULT_END = 0;
    public static final Integer DEFAULT_START = 0;
    private static final long serialVersionUID = 0;
    public final Integer mEnd;
    public final Integer mStart;

    /* renamed from: com.ss.android.lark.pb.ai.Span$b */
    private static final class C49528b extends ProtoAdapter<Span> {
        C49528b() {
            super(FieldEncoding.LENGTH_DELIMITED, Span.class);
        }

        /* renamed from: a */
        public int encodedSize(Span span) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, span.mStart) + ProtoAdapter.INT32.encodedSizeWithTag(2, span.mEnd) + span.unknownFields().size();
        }

        /* renamed from: a */
        public Span decode(ProtoReader protoReader) throws IOException {
            C49527a aVar = new C49527a();
            aVar.f124124a = 0;
            aVar.f124125b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124124a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124125b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Span span) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, span.mStart);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, span.mEnd);
            protoWriter.writeBytes(span.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49527a newBuilder() {
        C49527a aVar = new C49527a();
        aVar.f124124a = this.mStart;
        aVar.f124125b = this.mEnd;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.Span$a */
    public static final class C49527a extends Message.Builder<Span, C49527a> {

        /* renamed from: a */
        public Integer f124124a;

        /* renamed from: b */
        public Integer f124125b;

        /* renamed from: a */
        public Span build() {
            Integer num;
            Integer num2 = this.f124124a;
            if (num2 != null && (num = this.f124125b) != null) {
                return new Span(num2, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "mStart", this.f124125b, "mEnd");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", Start=");
        sb.append(this.mStart);
        sb.append(", End=");
        sb.append(this.mEnd);
        StringBuilder replace = sb.replace(0, 2, "Span{");
        replace.append('}');
        return replace.toString();
    }

    public Span(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public Span(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mStart = num;
        this.mEnd = num2;
    }
}
