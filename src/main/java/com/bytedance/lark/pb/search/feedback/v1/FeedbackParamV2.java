package com.bytedance.lark.pb.search.feedback.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v2.UniversalSearchRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class FeedbackParamV2 extends Message<FeedbackParamV2, C18747a> {
    public static final ProtoAdapter<FeedbackParamV2> ADAPTER = new C18748b();
    private static final long serialVersionUID = 0;
    public final List<SearchResult> results;
    public final UniversalSearchRequest search_request;

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackParamV2$b */
    private static final class C18748b extends ProtoAdapter<FeedbackParamV2> {
        C18748b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackParamV2.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackParamV2 feedbackParamV2) {
            return UniversalSearchRequest.ADAPTER.encodedSizeWithTag(1, feedbackParamV2.search_request) + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(2, feedbackParamV2.results) + feedbackParamV2.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackParamV2 decode(ProtoReader protoReader) throws IOException {
            C18747a aVar = new C18747a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46294a = UniversalSearchRequest.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46295b.add(SearchResult.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedbackParamV2 feedbackParamV2) throws IOException {
            UniversalSearchRequest.ADAPTER.encodeWithTag(protoWriter, 1, feedbackParamV2.search_request);
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, feedbackParamV2.results);
            protoWriter.writeBytes(feedbackParamV2.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.FeedbackParamV2$a */
    public static final class C18747a extends Message.Builder<FeedbackParamV2, C18747a> {

        /* renamed from: a */
        public UniversalSearchRequest f46294a;

        /* renamed from: b */
        public List<SearchResult> f46295b = Internal.newMutableList();

        /* renamed from: a */
        public FeedbackParamV2 build() {
            UniversalSearchRequest universalSearchRequest = this.f46294a;
            if (universalSearchRequest != null) {
                return new FeedbackParamV2(universalSearchRequest, this.f46295b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(universalSearchRequest, "search_request");
        }
    }

    @Override // com.squareup.wire.Message
    public C18747a newBuilder() {
        C18747a aVar = new C18747a();
        aVar.f46294a = this.search_request;
        aVar.f46295b = Internal.copyOf("results", this.results);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "FeedbackParamV2");
        StringBuilder sb = new StringBuilder();
        sb.append(", search_request=");
        sb.append(this.search_request);
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedbackParamV2{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackParamV2(UniversalSearchRequest universalSearchRequest, List<SearchResult> list) {
        this(universalSearchRequest, list, ByteString.EMPTY);
    }

    public FeedbackParamV2(UniversalSearchRequest universalSearchRequest, List<SearchResult> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_request = universalSearchRequest;
        this.results = Internal.immutableCopyOf("results", list);
    }
}
