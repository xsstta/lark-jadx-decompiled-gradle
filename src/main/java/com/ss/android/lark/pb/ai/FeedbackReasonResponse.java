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

public final class FeedbackReasonResponse extends Message<FeedbackReasonResponse, C49465a> {
    public static final ProtoAdapter<FeedbackReasonResponse> ADAPTER = new C49466b();
    private static final long serialVersionUID = 0;
    public final List<FeedbackReasonItem> mreason_items;

    /* renamed from: com.ss.android.lark.pb.ai.FeedbackReasonResponse$b */
    private static final class C49466b extends ProtoAdapter<FeedbackReasonResponse> {
        C49466b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackReasonResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackReasonResponse feedbackReasonResponse) {
            return FeedbackReasonItem.ADAPTER.asRepeated().encodedSizeWithTag(1, feedbackReasonResponse.mreason_items) + feedbackReasonResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackReasonResponse decode(ProtoReader protoReader) throws IOException {
            C49465a aVar = new C49465a();
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
                    aVar.f124059a.add(FeedbackReasonItem.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedbackReasonResponse feedbackReasonResponse) throws IOException {
            FeedbackReasonItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, feedbackReasonResponse.mreason_items);
            protoWriter.writeBytes(feedbackReasonResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.FeedbackReasonResponse$a */
    public static final class C49465a extends Message.Builder<FeedbackReasonResponse, C49465a> {

        /* renamed from: a */
        public List<FeedbackReasonItem> f124059a = Internal.newMutableList();

        /* renamed from: a */
        public FeedbackReasonResponse build() {
            return new FeedbackReasonResponse(this.f124059a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49465a newBuilder() {
        C49465a aVar = new C49465a();
        aVar.f124059a = Internal.copyOf("mreason_items", this.mreason_items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mreason_items.isEmpty()) {
            sb.append(", reason_items=");
            sb.append(this.mreason_items);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedbackReasonResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackReasonResponse(List<FeedbackReasonItem> list) {
        this(list, ByteString.EMPTY);
    }

    public FeedbackReasonResponse(List<FeedbackReasonItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mreason_items = Internal.immutableCopyOf("mreason_items", list);
    }
}
