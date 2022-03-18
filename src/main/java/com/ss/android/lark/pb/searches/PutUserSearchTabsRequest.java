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

public final class PutUserSearchTabsRequest extends Message<PutUserSearchTabsRequest, C50036a> {
    public static final ProtoAdapter<PutUserSearchTabsRequest> ADAPTER = new C50037b();
    private static final long serialVersionUID = 0;
    public final List<SearchTab> msearch_tabs;

    /* renamed from: com.ss.android.lark.pb.searches.PutUserSearchTabsRequest$b */
    private static final class C50037b extends ProtoAdapter<PutUserSearchTabsRequest> {
        C50037b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutUserSearchTabsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutUserSearchTabsRequest putUserSearchTabsRequest) {
            return SearchTab.ADAPTER.asRepeated().encodedSizeWithTag(1, putUserSearchTabsRequest.msearch_tabs) + putUserSearchTabsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutUserSearchTabsRequest decode(ProtoReader protoReader) throws IOException {
            C50036a aVar = new C50036a();
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
                    aVar.f125137a.add(SearchTab.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutUserSearchTabsRequest putUserSearchTabsRequest) throws IOException {
            SearchTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, putUserSearchTabsRequest.msearch_tabs);
            protoWriter.writeBytes(putUserSearchTabsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.PutUserSearchTabsRequest$a */
    public static final class C50036a extends Message.Builder<PutUserSearchTabsRequest, C50036a> {

        /* renamed from: a */
        public List<SearchTab> f125137a = Internal.newMutableList();

        /* renamed from: a */
        public PutUserSearchTabsRequest build() {
            return new PutUserSearchTabsRequest(this.f125137a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50036a mo173873a(List<SearchTab> list) {
            Internal.checkElementsNotNull(list);
            this.f125137a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50036a newBuilder() {
        C50036a aVar = new C50036a();
        aVar.f125137a = Internal.copyOf("msearch_tabs", this.msearch_tabs);
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
        StringBuilder replace = sb.replace(0, 2, "PutUserSearchTabsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutUserSearchTabsRequest(List<SearchTab> list) {
        this(list, ByteString.EMPTY);
    }

    public PutUserSearchTabsRequest(List<SearchTab> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msearch_tabs = Internal.immutableCopyOf("msearch_tabs", list);
    }
}
