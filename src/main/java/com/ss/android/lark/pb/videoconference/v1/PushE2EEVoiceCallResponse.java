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

public final class PushE2EEVoiceCallResponse extends Message<PushE2EEVoiceCallResponse, C50946a> {
    public static final ProtoAdapter<PushE2EEVoiceCallResponse> ADAPTER = new C50947b();
    private static final long serialVersionUID = 0;
    public final E2EEVoiceCall call;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PushE2EEVoiceCallResponse$b */
    private static final class C50947b extends ProtoAdapter<PushE2EEVoiceCallResponse> {
        C50947b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushE2EEVoiceCallResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushE2EEVoiceCallResponse pushE2EEVoiceCallResponse) {
            return E2EEVoiceCall.ADAPTER.encodedSizeWithTag(1, pushE2EEVoiceCallResponse.call) + pushE2EEVoiceCallResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushE2EEVoiceCallResponse decode(ProtoReader protoReader) throws IOException {
            C50946a aVar = new C50946a();
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
                    aVar.f126967a = E2EEVoiceCall.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushE2EEVoiceCallResponse pushE2EEVoiceCallResponse) throws IOException {
            E2EEVoiceCall.ADAPTER.encodeWithTag(protoWriter, 1, pushE2EEVoiceCallResponse.call);
            protoWriter.writeBytes(pushE2EEVoiceCallResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PushE2EEVoiceCallResponse$a */
    public static final class C50946a extends Message.Builder<PushE2EEVoiceCallResponse, C50946a> {

        /* renamed from: a */
        public E2EEVoiceCall f126967a;

        /* renamed from: a */
        public PushE2EEVoiceCallResponse build() {
            E2EEVoiceCall e2EEVoiceCall = this.f126967a;
            if (e2EEVoiceCall != null) {
                return new PushE2EEVoiceCallResponse(e2EEVoiceCall, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(e2EEVoiceCall, "call");
        }
    }

    @Override // com.squareup.wire.Message
    public C50946a newBuilder() {
        C50946a aVar = new C50946a();
        aVar.f126967a = this.call;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PushE2EEVoiceCallResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", call=");
        sb.append(this.call);
        StringBuilder replace = sb.replace(0, 2, "PushE2EEVoiceCallResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushE2EEVoiceCallResponse(E2EEVoiceCall e2EEVoiceCall) {
        this(e2EEVoiceCall, ByteString.EMPTY);
    }

    public PushE2EEVoiceCallResponse(E2EEVoiceCall e2EEVoiceCall, ByteString byteString) {
        super(ADAPTER, byteString);
        this.call = e2EEVoiceCall;
    }
}
