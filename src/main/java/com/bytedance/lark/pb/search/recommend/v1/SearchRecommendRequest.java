package com.bytedance.lark.pb.search.recommend.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SearchRecommendRequest extends Message<SearchRecommendRequest, C18775a> {
    public static final ProtoAdapter<SearchRecommendRequest> ADAPTER = new C18776b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.SearchRecommendRequest$b */
    private static final class C18776b extends ProtoAdapter<SearchRecommendRequest> {
        C18776b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchRecommendRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchRecommendRequest searchRecommendRequest) {
            return searchRecommendRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SearchRecommendRequest decode(ProtoReader protoReader) throws IOException {
            C18775a aVar = new C18775a();
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
        public void encode(ProtoWriter protoWriter, SearchRecommendRequest searchRecommendRequest) throws IOException {
            protoWriter.writeBytes(searchRecommendRequest.unknownFields());
        }
    }

    public SearchRecommendRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.SearchRecommendRequest$a */
    public static final class C18775a extends Message.Builder<SearchRecommendRequest, C18775a> {
        /* renamed from: a */
        public SearchRecommendRequest build() {
            return new SearchRecommendRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18775a newBuilder() {
        C18775a aVar = new C18775a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchRecommendRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SearchRecommendRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SearchRecommendRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
