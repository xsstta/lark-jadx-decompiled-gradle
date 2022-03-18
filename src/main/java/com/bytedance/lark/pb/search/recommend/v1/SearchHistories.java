package com.bytedance.lark.pb.search.recommend.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.SearchHistoryInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchHistories extends Message<SearchHistories, C18773a> {
    public static final ProtoAdapter<SearchHistories> ADAPTER = new C18774b();
    private static final long serialVersionUID = 0;
    public final List<SearchHistoryInfo> histories;
    public final List<QueryHistoryInfo> query_histories;

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.SearchHistories$b */
    private static final class C18774b extends ProtoAdapter<SearchHistories> {
        C18774b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchHistories.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchHistories searchHistories) {
            return SearchHistoryInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, searchHistories.histories) + QueryHistoryInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, searchHistories.query_histories) + searchHistories.unknownFields().size();
        }

        /* renamed from: a */
        public SearchHistories decode(ProtoReader protoReader) throws IOException {
            C18773a aVar = new C18773a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46331a.add(SearchHistoryInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46332b.add(QueryHistoryInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchHistories searchHistories) throws IOException {
            SearchHistoryInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchHistories.histories);
            QueryHistoryInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, searchHistories.query_histories);
            protoWriter.writeBytes(searchHistories.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.SearchHistories$a */
    public static final class C18773a extends Message.Builder<SearchHistories, C18773a> {

        /* renamed from: a */
        public List<SearchHistoryInfo> f46331a = Internal.newMutableList();

        /* renamed from: b */
        public List<QueryHistoryInfo> f46332b = Internal.newMutableList();

        /* renamed from: a */
        public SearchHistories build() {
            return new SearchHistories(this.f46331a, this.f46332b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18773a newBuilder() {
        C18773a aVar = new C18773a();
        aVar.f46331a = Internal.copyOf("histories", this.histories);
        aVar.f46332b = Internal.copyOf("query_histories", this.query_histories);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchHistories");
        StringBuilder sb = new StringBuilder();
        if (!this.histories.isEmpty()) {
            sb.append(", histories=");
            sb.append(this.histories);
        }
        if (!this.query_histories.isEmpty()) {
            sb.append(", query_histories=");
            sb.append(this.query_histories);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchHistories{");
        replace.append('}');
        return replace.toString();
    }

    public SearchHistories(List<SearchHistoryInfo> list, List<QueryHistoryInfo> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public SearchHistories(List<SearchHistoryInfo> list, List<QueryHistoryInfo> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.histories = Internal.immutableCopyOf("histories", list);
        this.query_histories = Internal.immutableCopyOf("query_histories", list2);
    }
}
