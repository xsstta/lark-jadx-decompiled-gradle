package com.bytedance.lark.pb.search.feedback.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class IntegrationSearchParam extends Message<IntegrationSearchParam, C18755a> {
    public static final ProtoAdapter<IntegrationSearchParam> ADAPTER = new C18756b();
    private static final long serialVersionUID = 0;
    public final List<SearchResult> results;
    public final IntegrationSearchRequest search_request;

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.IntegrationSearchParam$b */
    private static final class C18756b extends ProtoAdapter<IntegrationSearchParam> {
        C18756b() {
            super(FieldEncoding.LENGTH_DELIMITED, IntegrationSearchParam.class);
        }

        /* renamed from: a */
        public int encodedSize(IntegrationSearchParam integrationSearchParam) {
            return IntegrationSearchRequest.ADAPTER.encodedSizeWithTag(1, integrationSearchParam.search_request) + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(2, integrationSearchParam.results) + integrationSearchParam.unknownFields().size();
        }

        /* renamed from: a */
        public IntegrationSearchParam decode(ProtoReader protoReader) throws IOException {
            C18755a aVar = new C18755a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46305a = IntegrationSearchRequest.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46306b.add(SearchResult.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, IntegrationSearchParam integrationSearchParam) throws IOException {
            IntegrationSearchRequest.ADAPTER.encodeWithTag(protoWriter, 1, integrationSearchParam.search_request);
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, integrationSearchParam.results);
            protoWriter.writeBytes(integrationSearchParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.IntegrationSearchParam$a */
    public static final class C18755a extends Message.Builder<IntegrationSearchParam, C18755a> {

        /* renamed from: a */
        public IntegrationSearchRequest f46305a;

        /* renamed from: b */
        public List<SearchResult> f46306b = Internal.newMutableList();

        /* renamed from: a */
        public IntegrationSearchParam build() {
            IntegrationSearchRequest integrationSearchRequest = this.f46305a;
            if (integrationSearchRequest != null) {
                return new IntegrationSearchParam(integrationSearchRequest, this.f46306b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(integrationSearchRequest, "search_request");
        }

        /* renamed from: a */
        public C18755a mo64469a(IntegrationSearchRequest integrationSearchRequest) {
            this.f46305a = integrationSearchRequest;
            return this;
        }

        /* renamed from: a */
        public C18755a mo64470a(List<SearchResult> list) {
            Internal.checkElementsNotNull(list);
            this.f46306b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18755a newBuilder() {
        C18755a aVar = new C18755a();
        aVar.f46305a = this.search_request;
        aVar.f46306b = Internal.copyOf("results", this.results);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "IntegrationSearchParam");
        StringBuilder sb = new StringBuilder();
        sb.append(", search_request=");
        sb.append(this.search_request);
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        StringBuilder replace = sb.replace(0, 2, "IntegrationSearchParam{");
        replace.append('}');
        return replace.toString();
    }

    public IntegrationSearchParam(IntegrationSearchRequest integrationSearchRequest, List<SearchResult> list) {
        this(integrationSearchRequest, list, ByteString.EMPTY);
    }

    public IntegrationSearchParam(IntegrationSearchRequest integrationSearchRequest, List<SearchResult> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_request = integrationSearchRequest;
        this.results = Internal.immutableCopyOf("results", list);
    }
}
