package com.bytedance.lark.pb.search.v1;

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

public final class MultiLocalIntegrationSearchResponse extends Message<MultiLocalIntegrationSearchResponse, C18849a> {
    public static final ProtoAdapter<MultiLocalIntegrationSearchResponse> ADAPTER = new C18850b();
    private static final long serialVersionUID = 0;
    public final List<LocalIntegrationSearchResponse> responses;

    /* renamed from: com.bytedance.lark.pb.search.v1.MultiLocalIntegrationSearchResponse$b */
    private static final class C18850b extends ProtoAdapter<MultiLocalIntegrationSearchResponse> {
        C18850b() {
            super(FieldEncoding.LENGTH_DELIMITED, MultiLocalIntegrationSearchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MultiLocalIntegrationSearchResponse multiLocalIntegrationSearchResponse) {
            return LocalIntegrationSearchResponse.ADAPTER.asRepeated().encodedSizeWithTag(1, multiLocalIntegrationSearchResponse.responses) + multiLocalIntegrationSearchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MultiLocalIntegrationSearchResponse decode(ProtoReader protoReader) throws IOException {
            C18849a aVar = new C18849a();
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
                    aVar.f46528a.add(LocalIntegrationSearchResponse.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MultiLocalIntegrationSearchResponse multiLocalIntegrationSearchResponse) throws IOException {
            LocalIntegrationSearchResponse.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, multiLocalIntegrationSearchResponse.responses);
            protoWriter.writeBytes(multiLocalIntegrationSearchResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.MultiLocalIntegrationSearchResponse$a */
    public static final class C18849a extends Message.Builder<MultiLocalIntegrationSearchResponse, C18849a> {

        /* renamed from: a */
        public List<LocalIntegrationSearchResponse> f46528a = Internal.newMutableList();

        /* renamed from: a */
        public MultiLocalIntegrationSearchResponse build() {
            return new MultiLocalIntegrationSearchResponse(this.f46528a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18849a newBuilder() {
        C18849a aVar = new C18849a();
        aVar.f46528a = Internal.copyOf("responses", this.responses);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "MultiLocalIntegrationSearchResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.responses.isEmpty()) {
            sb.append(", responses=");
            sb.append(this.responses);
        }
        StringBuilder replace = sb.replace(0, 2, "MultiLocalIntegrationSearchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MultiLocalIntegrationSearchResponse(List<LocalIntegrationSearchResponse> list) {
        this(list, ByteString.EMPTY);
    }

    public MultiLocalIntegrationSearchResponse(List<LocalIntegrationSearchResponse> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.responses = Internal.immutableCopyOf("responses", list);
    }
}
