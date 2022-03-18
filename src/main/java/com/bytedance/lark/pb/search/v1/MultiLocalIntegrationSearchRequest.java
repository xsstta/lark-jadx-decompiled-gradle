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

public final class MultiLocalIntegrationSearchRequest extends Message<MultiLocalIntegrationSearchRequest, C18847a> {
    public static final ProtoAdapter<MultiLocalIntegrationSearchRequest> ADAPTER = new C18848b();
    private static final long serialVersionUID = 0;
    public final List<LocalIntegrationSearchRequest> requests;

    /* renamed from: com.bytedance.lark.pb.search.v1.MultiLocalIntegrationSearchRequest$b */
    private static final class C18848b extends ProtoAdapter<MultiLocalIntegrationSearchRequest> {
        C18848b() {
            super(FieldEncoding.LENGTH_DELIMITED, MultiLocalIntegrationSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MultiLocalIntegrationSearchRequest multiLocalIntegrationSearchRequest) {
            return LocalIntegrationSearchRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, multiLocalIntegrationSearchRequest.requests) + multiLocalIntegrationSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MultiLocalIntegrationSearchRequest decode(ProtoReader protoReader) throws IOException {
            C18847a aVar = new C18847a();
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
                    aVar.f46527a.add(LocalIntegrationSearchRequest.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MultiLocalIntegrationSearchRequest multiLocalIntegrationSearchRequest) throws IOException {
            LocalIntegrationSearchRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, multiLocalIntegrationSearchRequest.requests);
            protoWriter.writeBytes(multiLocalIntegrationSearchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.MultiLocalIntegrationSearchRequest$a */
    public static final class C18847a extends Message.Builder<MultiLocalIntegrationSearchRequest, C18847a> {

        /* renamed from: a */
        public List<LocalIntegrationSearchRequest> f46527a = Internal.newMutableList();

        /* renamed from: a */
        public MultiLocalIntegrationSearchRequest build() {
            return new MultiLocalIntegrationSearchRequest(this.f46527a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18847a mo64707a(List<LocalIntegrationSearchRequest> list) {
            Internal.checkElementsNotNull(list);
            this.f46527a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18847a newBuilder() {
        C18847a aVar = new C18847a();
        aVar.f46527a = Internal.copyOf("requests", this.requests);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "MultiLocalIntegrationSearchRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.requests.isEmpty()) {
            sb.append(", requests=");
            sb.append(this.requests);
        }
        StringBuilder replace = sb.replace(0, 2, "MultiLocalIntegrationSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MultiLocalIntegrationSearchRequest(List<LocalIntegrationSearchRequest> list) {
        this(list, ByteString.EMPTY);
    }

    public MultiLocalIntegrationSearchRequest(List<LocalIntegrationSearchRequest> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.requests = Internal.immutableCopyOf("requests", list);
    }
}
