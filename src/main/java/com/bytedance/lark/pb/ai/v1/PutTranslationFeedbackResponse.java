package com.bytedance.lark.pb.ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutTranslationFeedbackResponse extends Message<PutTranslationFeedbackResponse, C14631a> {
    public static final ProtoAdapter<PutTranslationFeedbackResponse> ADAPTER = new C14632b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.ai.v1.PutTranslationFeedbackResponse$b */
    private static final class C14632b extends ProtoAdapter<PutTranslationFeedbackResponse> {
        C14632b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutTranslationFeedbackResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutTranslationFeedbackResponse putTranslationFeedbackResponse) {
            return putTranslationFeedbackResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutTranslationFeedbackResponse decode(ProtoReader protoReader) throws IOException {
            C14631a aVar = new C14631a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutTranslationFeedbackResponse putTranslationFeedbackResponse) throws IOException {
            protoWriter.writeBytes(putTranslationFeedbackResponse.unknownFields());
        }
    }

    public PutTranslationFeedbackResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.PutTranslationFeedbackResponse$a */
    public static final class C14631a extends Message.Builder<PutTranslationFeedbackResponse, C14631a> {
        /* renamed from: a */
        public PutTranslationFeedbackResponse build() {
            return new PutTranslationFeedbackResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14631a newBuilder() {
        C14631a aVar = new C14631a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "PutTranslationFeedbackResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PutTranslationFeedbackResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutTranslationFeedbackResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
