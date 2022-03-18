package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullAvailableSearchTabsResponse extends Message<PullAvailableSearchTabsResponse, C50030a> {
    public static final ProtoAdapter<PullAvailableSearchTabsResponse> ADAPTER = new C50031b();
    private static final long serialVersionUID = 0;
    public final List<SearchTab> msearch_tabs;

    /* renamed from: com.ss.android.lark.pb.searches.PullAvailableSearchTabsResponse$b */
    private static final class C50031b extends ProtoAdapter<PullAvailableSearchTabsResponse> {
        C50031b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAvailableSearchTabsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAvailableSearchTabsResponse pullAvailableSearchTabsResponse) {
            return SearchTab.ADAPTER.asRepeated().encodedSizeWithTag(1, pullAvailableSearchTabsResponse.msearch_tabs) + pullAvailableSearchTabsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullAvailableSearchTabsResponse decode(ProtoReader protoReader) throws IOException {
            C50030a aVar = new C50030a();
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
                    aVar.f125135a.add(SearchTab.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAvailableSearchTabsResponse pullAvailableSearchTabsResponse) throws IOException {
            SearchTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullAvailableSearchTabsResponse.msearch_tabs);
            protoWriter.writeBytes(pullAvailableSearchTabsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.PullAvailableSearchTabsResponse$a */
    public static final class C50030a extends Message.Builder<PullAvailableSearchTabsResponse, C50030a> {

        /* renamed from: a */
        public List<SearchTab> f125135a = Internal.newMutableList();

        /* renamed from: a */
        public PullAvailableSearchTabsResponse build() {
            return new PullAvailableSearchTabsResponse(this.f125135a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50030a newBuilder() {
        C50030a aVar = new C50030a();
        aVar.f125135a = Internal.copyOf("msearch_tabs", this.msearch_tabs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.msearch_tabs.isEmpty()) {
            sb.append(", search_tabs=");
            sb.append(this.msearch_tabs);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAvailableSearchTabsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullAvailableSearchTabsResponse(List<SearchTab> list) {
        this(list, ByteString.EMPTY);
    }

    public PullAvailableSearchTabsResponse(List<SearchTab> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msearch_tabs = Internal.immutableCopyOf("msearch_tabs", list);
    }
}
