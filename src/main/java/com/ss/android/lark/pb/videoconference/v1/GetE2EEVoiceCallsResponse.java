package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetE2EEVoiceCallsResponse extends Message<GetE2EEVoiceCallsResponse, C50637a> {
    public static final ProtoAdapter<GetE2EEVoiceCallsResponse> ADAPTER = new C50638b();
    private static final long serialVersionUID = 0;
    public final List<E2EEVoiceCall> calls;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetE2EEVoiceCallsResponse$b */
    private static final class C50638b extends ProtoAdapter<GetE2EEVoiceCallsResponse> {
        C50638b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetE2EEVoiceCallsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetE2EEVoiceCallsResponse getE2EEVoiceCallsResponse) {
            return E2EEVoiceCall.ADAPTER.asRepeated().encodedSizeWithTag(1, getE2EEVoiceCallsResponse.calls) + getE2EEVoiceCallsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetE2EEVoiceCallsResponse decode(ProtoReader protoReader) throws IOException {
            C50637a aVar = new C50637a();
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
                    aVar.f126374a.add(E2EEVoiceCall.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetE2EEVoiceCallsResponse getE2EEVoiceCallsResponse) throws IOException {
            E2EEVoiceCall.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getE2EEVoiceCallsResponse.calls);
            protoWriter.writeBytes(getE2EEVoiceCallsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetE2EEVoiceCallsResponse$a */
    public static final class C50637a extends Message.Builder<GetE2EEVoiceCallsResponse, C50637a> {

        /* renamed from: a */
        public List<E2EEVoiceCall> f126374a = Internal.newMutableList();

        /* renamed from: a */
        public GetE2EEVoiceCallsResponse build() {
            return new GetE2EEVoiceCallsResponse(this.f126374a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50637a newBuilder() {
        C50637a aVar = new C50637a();
        aVar.f126374a = Internal.copyOf("calls", this.calls);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetE2EEVoiceCallsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calls.isEmpty()) {
            sb.append(", calls=");
            sb.append(this.calls);
        }
        StringBuilder replace = sb.replace(0, 2, "GetE2EEVoiceCallsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetE2EEVoiceCallsResponse(List<E2EEVoiceCall> list) {
        this(list, ByteString.EMPTY);
    }

    public GetE2EEVoiceCallsResponse(List<E2EEVoiceCall> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calls = Internal.immutableCopyOf("calls", list);
    }
}
