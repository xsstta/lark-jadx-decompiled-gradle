package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class StartE2EEVoiceCallPollingRequest extends Message<StartE2EEVoiceCallPollingRequest, C51094a> {
    public static final ProtoAdapter<StartE2EEVoiceCallPollingRequest> ADAPTER = new C51095b();
    private static final long serialVersionUID = 0;
    public final String call_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StartE2EEVoiceCallPollingRequest$b */
    private static final class C51095b extends ProtoAdapter<StartE2EEVoiceCallPollingRequest> {
        C51095b() {
            super(FieldEncoding.LENGTH_DELIMITED, StartE2EEVoiceCallPollingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(StartE2EEVoiceCallPollingRequest startE2EEVoiceCallPollingRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, startE2EEVoiceCallPollingRequest.call_id) + startE2EEVoiceCallPollingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public StartE2EEVoiceCallPollingRequest decode(ProtoReader protoReader) throws IOException {
            C51094a aVar = new C51094a();
            aVar.f127216a = "";
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
                    aVar.f127216a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, StartE2EEVoiceCallPollingRequest startE2EEVoiceCallPollingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, startE2EEVoiceCallPollingRequest.call_id);
            protoWriter.writeBytes(startE2EEVoiceCallPollingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StartE2EEVoiceCallPollingRequest$a */
    public static final class C51094a extends Message.Builder<StartE2EEVoiceCallPollingRequest, C51094a> {

        /* renamed from: a */
        public String f127216a;

        /* renamed from: a */
        public StartE2EEVoiceCallPollingRequest build() {
            String str = this.f127216a;
            if (str != null) {
                return new StartE2EEVoiceCallPollingRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "call_id");
        }

        /* renamed from: a */
        public C51094a mo176340a(String str) {
            this.f127216a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51094a newBuilder() {
        C51094a aVar = new C51094a();
        aVar.f127216a = this.call_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "StartE2EEVoiceCallPollingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", call_id=");
        sb.append(this.call_id);
        StringBuilder replace = sb.replace(0, 2, "StartE2EEVoiceCallPollingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public StartE2EEVoiceCallPollingRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public StartE2EEVoiceCallPollingRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.call_id = str;
    }
}
