package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class CreateE2EEVoiceFeedbacksRequest extends Message<CreateE2EEVoiceFeedbacksRequest, C50517a> {
    public static final ProtoAdapter<CreateE2EEVoiceFeedbacksRequest> ADAPTER = new C50518b();
    private static final long serialVersionUID = 0;
    public final Map<String, E2EEVoiceFeedback> feedbacks;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceFeedbacksRequest$a */
    public static final class C50517a extends Message.Builder<CreateE2EEVoiceFeedbacksRequest, C50517a> {

        /* renamed from: a */
        public Map<String, E2EEVoiceFeedback> f126109a = Internal.newMutableMap();

        /* renamed from: a */
        public CreateE2EEVoiceFeedbacksRequest build() {
            return new CreateE2EEVoiceFeedbacksRequest(this.f126109a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50517a mo174957a(Map<String, E2EEVoiceFeedback> map) {
            Internal.checkElementsNotNull(map);
            this.f126109a = map;
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceFeedbacksRequest$b */
    private static final class C50518b extends ProtoAdapter<CreateE2EEVoiceFeedbacksRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, E2EEVoiceFeedback>> f126110a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, E2EEVoiceFeedback.ADAPTER);

        C50518b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateE2EEVoiceFeedbacksRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateE2EEVoiceFeedbacksRequest createE2EEVoiceFeedbacksRequest) {
            return this.f126110a.encodedSizeWithTag(1, createE2EEVoiceFeedbacksRequest.feedbacks) + createE2EEVoiceFeedbacksRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateE2EEVoiceFeedbacksRequest decode(ProtoReader protoReader) throws IOException {
            C50517a aVar = new C50517a();
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
                    aVar.f126109a.putAll(this.f126110a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateE2EEVoiceFeedbacksRequest createE2EEVoiceFeedbacksRequest) throws IOException {
            this.f126110a.encodeWithTag(protoWriter, 1, createE2EEVoiceFeedbacksRequest.feedbacks);
            protoWriter.writeBytes(createE2EEVoiceFeedbacksRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50517a newBuilder() {
        C50517a aVar = new C50517a();
        aVar.f126109a = Internal.copyOf("feedbacks", this.feedbacks);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CreateE2EEVoiceFeedbacksRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.feedbacks.isEmpty()) {
            sb.append(", feedbacks=");
            sb.append(this.feedbacks);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateE2EEVoiceFeedbacksRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateE2EEVoiceFeedbacksRequest(Map<String, E2EEVoiceFeedback> map) {
        this(map, ByteString.EMPTY);
    }

    public CreateE2EEVoiceFeedbacksRequest(Map<String, E2EEVoiceFeedback> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feedbacks = Internal.immutableCopyOf("feedbacks", map);
    }
}
