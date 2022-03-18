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

public final class PullUserSearchTabsResponse extends Message<PullUserSearchTabsResponse, C50034a> {
    public static final ProtoAdapter<PullUserSearchTabsResponse> ADAPTER = new C50035b();
    private static final long serialVersionUID = 0;
    public final List<SearchTab> msearch_tabs;

    /* renamed from: com.ss.android.lark.pb.searches.PullUserSearchTabsResponse$b */
    private static final class C50035b extends ProtoAdapter<PullUserSearchTabsResponse> {
        C50035b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullUserSearchTabsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullUserSearchTabsResponse pullUserSearchTabsResponse) {
            return SearchTab.ADAPTER.asRepeated().encodedSizeWithTag(1, pullUserSearchTabsResponse.msearch_tabs) + pullUserSearchTabsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullUserSearchTabsResponse decode(ProtoReader protoReader) throws IOException {
            C50034a aVar = new C50034a();
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
                    aVar.f125136a.add(SearchTab.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullUserSearchTabsResponse pullUserSearchTabsResponse) throws IOException {
            SearchTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullUserSearchTabsResponse.msearch_tabs);
            protoWriter.writeBytes(pullUserSearchTabsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.PullUserSearchTabsResponse$a */
    public static final class C50034a extends Message.Builder<PullUserSearchTabsResponse, C50034a> {

        /* renamed from: a */
        public List<SearchTab> f125136a = Internal.newMutableList();

        /* renamed from: a */
        public PullUserSearchTabsResponse build() {
            return new PullUserSearchTabsResponse(this.f125136a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50034a newBuilder() {
        C50034a aVar = new C50034a();
        aVar.f125136a = Internal.copyOf("msearch_tabs", this.msearch_tabs);
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
        StringBuilder replace = sb.replace(0, 2, "PullUserSearchTabsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullUserSearchTabsResponse(List<SearchTab> list) {
        this(list, ByteString.EMPTY);
    }

    public PullUserSearchTabsResponse(List<SearchTab> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msearch_tabs = Internal.immutableCopyOf("msearch_tabs", list);
    }
}
