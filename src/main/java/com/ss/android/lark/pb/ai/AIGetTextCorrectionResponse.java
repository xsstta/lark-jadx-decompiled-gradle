package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AIGetTextCorrectionResponse extends Message<AIGetTextCorrectionResponse, C49417a> {
    public static final ProtoAdapter<AIGetTextCorrectionResponse> ADAPTER = new C49418b();
    private static final long serialVersionUID = 0;
    public final List<AITextCorrectionResult> mdata;

    /* renamed from: com.ss.android.lark.pb.ai.AIGetTextCorrectionResponse$b */
    private static final class C49418b extends ProtoAdapter<AIGetTextCorrectionResponse> {
        C49418b() {
            super(FieldEncoding.LENGTH_DELIMITED, AIGetTextCorrectionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(AIGetTextCorrectionResponse aIGetTextCorrectionResponse) {
            return AITextCorrectionResult.ADAPTER.asRepeated().encodedSizeWithTag(1, aIGetTextCorrectionResponse.mdata) + aIGetTextCorrectionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public AIGetTextCorrectionResponse decode(ProtoReader protoReader) throws IOException {
            C49417a aVar = new C49417a();
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
                    aVar.f123952a.add(AITextCorrectionResult.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AIGetTextCorrectionResponse aIGetTextCorrectionResponse) throws IOException {
            AITextCorrectionResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, aIGetTextCorrectionResponse.mdata);
            protoWriter.writeBytes(aIGetTextCorrectionResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.AIGetTextCorrectionResponse$a */
    public static final class C49417a extends Message.Builder<AIGetTextCorrectionResponse, C49417a> {

        /* renamed from: a */
        public List<AITextCorrectionResult> f123952a = Internal.newMutableList();

        /* renamed from: a */
        public AIGetTextCorrectionResponse build() {
            return new AIGetTextCorrectionResponse(this.f123952a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49417a newBuilder() {
        C49417a aVar = new C49417a();
        aVar.f123952a = Internal.copyOf("mdata", this.mdata);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mdata.isEmpty()) {
            sb.append(", data=");
            sb.append(this.mdata);
        }
        StringBuilder replace = sb.replace(0, 2, "AIGetTextCorrectionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public AIGetTextCorrectionResponse(List<AITextCorrectionResult> list) {
        this(list, ByteString.EMPTY);
    }

    public AIGetTextCorrectionResponse(List<AITextCorrectionResult> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdata = Internal.immutableCopyOf("mdata", list);
    }
}
