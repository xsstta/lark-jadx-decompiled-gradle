package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateE2EEVoiceFeedbacksResponse extends Message<CreateE2EEVoiceFeedbacksResponse, C50519a> {
    public static final ProtoAdapter<CreateE2EEVoiceFeedbacksResponse> ADAPTER = new C50520b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceFeedbacksResponse$b */
    private static final class C50520b extends ProtoAdapter<CreateE2EEVoiceFeedbacksResponse> {
        C50520b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateE2EEVoiceFeedbacksResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateE2EEVoiceFeedbacksResponse createE2EEVoiceFeedbacksResponse) {
            return createE2EEVoiceFeedbacksResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateE2EEVoiceFeedbacksResponse decode(ProtoReader protoReader) throws IOException {
            C50519a aVar = new C50519a();
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
        public void encode(ProtoWriter protoWriter, CreateE2EEVoiceFeedbacksResponse createE2EEVoiceFeedbacksResponse) throws IOException {
            protoWriter.writeBytes(createE2EEVoiceFeedbacksResponse.unknownFields());
        }
    }

    public CreateE2EEVoiceFeedbacksResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceFeedbacksResponse$a */
    public static final class C50519a extends Message.Builder<CreateE2EEVoiceFeedbacksResponse, C50519a> {
        /* renamed from: a */
        public CreateE2EEVoiceFeedbacksResponse build() {
            return new CreateE2EEVoiceFeedbacksResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50519a newBuilder() {
        C50519a aVar = new C50519a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CreateE2EEVoiceFeedbacksResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "CreateE2EEVoiceFeedbacksResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateE2EEVoiceFeedbacksResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
