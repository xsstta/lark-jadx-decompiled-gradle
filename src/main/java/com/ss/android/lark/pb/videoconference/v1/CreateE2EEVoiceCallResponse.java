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

public final class CreateE2EEVoiceCallResponse extends Message<CreateE2EEVoiceCallResponse, C50515a> {
    public static final ProtoAdapter<CreateE2EEVoiceCallResponse> ADAPTER = new C50516b();
    private static final long serialVersionUID = 0;
    public final E2EEVoiceCall call;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceCallResponse$b */
    private static final class C50516b extends ProtoAdapter<CreateE2EEVoiceCallResponse> {
        C50516b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateE2EEVoiceCallResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateE2EEVoiceCallResponse createE2EEVoiceCallResponse) {
            return E2EEVoiceCall.ADAPTER.encodedSizeWithTag(1, createE2EEVoiceCallResponse.call) + createE2EEVoiceCallResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateE2EEVoiceCallResponse decode(ProtoReader protoReader) throws IOException {
            C50515a aVar = new C50515a();
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
                    aVar.f126108a = E2EEVoiceCall.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateE2EEVoiceCallResponse createE2EEVoiceCallResponse) throws IOException {
            E2EEVoiceCall.ADAPTER.encodeWithTag(protoWriter, 1, createE2EEVoiceCallResponse.call);
            protoWriter.writeBytes(createE2EEVoiceCallResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceCallResponse$a */
    public static final class C50515a extends Message.Builder<CreateE2EEVoiceCallResponse, C50515a> {

        /* renamed from: a */
        public E2EEVoiceCall f126108a;

        /* renamed from: a */
        public CreateE2EEVoiceCallResponse build() {
            E2EEVoiceCall e2EEVoiceCall = this.f126108a;
            if (e2EEVoiceCall != null) {
                return new CreateE2EEVoiceCallResponse(e2EEVoiceCall, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(e2EEVoiceCall, "call");
        }
    }

    @Override // com.squareup.wire.Message
    public C50515a newBuilder() {
        C50515a aVar = new C50515a();
        aVar.f126108a = this.call;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CreateE2EEVoiceCallResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", call=");
        sb.append(this.call);
        StringBuilder replace = sb.replace(0, 2, "CreateE2EEVoiceCallResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateE2EEVoiceCallResponse(E2EEVoiceCall e2EEVoiceCall) {
        this(e2EEVoiceCall, ByteString.EMPTY);
    }

    public CreateE2EEVoiceCallResponse(E2EEVoiceCall e2EEVoiceCall, ByteString byteString) {
        super(ADAPTER, byteString);
        this.call = e2EEVoiceCall;
    }
}
