package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeedbackReasonRequest extends Message<FeedbackReasonRequest, C49463a> {
    public static final ProtoAdapter<FeedbackReasonRequest> ADAPTER = new C49464b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.ai.FeedbackReasonRequest$b */
    private static final class C49464b extends ProtoAdapter<FeedbackReasonRequest> {
        C49464b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackReasonRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackReasonRequest feedbackReasonRequest) {
            return feedbackReasonRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackReasonRequest decode(ProtoReader protoReader) throws IOException {
            C49463a aVar = new C49463a();
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
        public void encode(ProtoWriter protoWriter, FeedbackReasonRequest feedbackReasonRequest) throws IOException {
            protoWriter.writeBytes(feedbackReasonRequest.unknownFields());
        }
    }

    public FeedbackReasonRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.ai.FeedbackReasonRequest$a */
    public static final class C49463a extends Message.Builder<FeedbackReasonRequest, C49463a> {
        /* renamed from: a */
        public FeedbackReasonRequest build() {
            return new FeedbackReasonRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49463a newBuilder() {
        C49463a aVar = new C49463a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "FeedbackReasonRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackReasonRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
