package com.bytedance.lark.pb.search.recommend.v1;

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

public final class SearchRecommendResponse extends Message<SearchRecommendResponse, C18777a> {
    public static final ProtoAdapter<SearchRecommendResponse> ADAPTER = new C18778b();
    private static final long serialVersionUID = 0;
    public final List<RecommendSection> recommend_sections;

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.SearchRecommendResponse$b */
    private static final class C18778b extends ProtoAdapter<SearchRecommendResponse> {
        C18778b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchRecommendResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchRecommendResponse searchRecommendResponse) {
            return RecommendSection.ADAPTER.asRepeated().encodedSizeWithTag(1, searchRecommendResponse.recommend_sections) + searchRecommendResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SearchRecommendResponse decode(ProtoReader protoReader) throws IOException {
            C18777a aVar = new C18777a();
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
                    aVar.f46333a.add(RecommendSection.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchRecommendResponse searchRecommendResponse) throws IOException {
            RecommendSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchRecommendResponse.recommend_sections);
            protoWriter.writeBytes(searchRecommendResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.SearchRecommendResponse$a */
    public static final class C18777a extends Message.Builder<SearchRecommendResponse, C18777a> {

        /* renamed from: a */
        public List<RecommendSection> f46333a = Internal.newMutableList();

        /* renamed from: a */
        public SearchRecommendResponse build() {
            return new SearchRecommendResponse(this.f46333a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18777a newBuilder() {
        C18777a aVar = new C18777a();
        aVar.f46333a = Internal.copyOf("recommend_sections", this.recommend_sections);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchRecommendResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.recommend_sections.isEmpty()) {
            sb.append(", recommend_sections=");
            sb.append(this.recommend_sections);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchRecommendResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SearchRecommendResponse(List<RecommendSection> list) {
        this(list, ByteString.EMPTY);
    }

    public SearchRecommendResponse(List<RecommendSection> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.recommend_sections = Internal.immutableCopyOf("recommend_sections", list);
    }
}
