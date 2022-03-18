package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class StopE2EEVoiceCallPollingRequest extends Message<StopE2EEVoiceCallPollingRequest, C51102a> {
    public static final ProtoAdapter<StopE2EEVoiceCallPollingRequest> ADAPTER = new C51103b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StopE2EEVoiceCallPollingRequest$b */
    private static final class C51103b extends ProtoAdapter<StopE2EEVoiceCallPollingRequest> {
        C51103b() {
            super(FieldEncoding.LENGTH_DELIMITED, StopE2EEVoiceCallPollingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(StopE2EEVoiceCallPollingRequest stopE2EEVoiceCallPollingRequest) {
            return stopE2EEVoiceCallPollingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public StopE2EEVoiceCallPollingRequest decode(ProtoReader protoReader) throws IOException {
            C51102a aVar = new C51102a();
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
        public void encode(ProtoWriter protoWriter, StopE2EEVoiceCallPollingRequest stopE2EEVoiceCallPollingRequest) throws IOException {
            protoWriter.writeBytes(stopE2EEVoiceCallPollingRequest.unknownFields());
        }
    }

    public StopE2EEVoiceCallPollingRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StopE2EEVoiceCallPollingRequest$a */
    public static final class C51102a extends Message.Builder<StopE2EEVoiceCallPollingRequest, C51102a> {
        /* renamed from: a */
        public StopE2EEVoiceCallPollingRequest build() {
            return new StopE2EEVoiceCallPollingRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51102a newBuilder() {
        C51102a aVar = new C51102a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "StopE2EEVoiceCallPollingRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "StopE2EEVoiceCallPollingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public StopE2EEVoiceCallPollingRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
