package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.searches.SearchHistoryInfo;
import com.ss.android.lark.pb.usearch.QueryHistoryInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchHistories extends Message<SearchHistories, C49511a> {
    public static final ProtoAdapter<SearchHistories> ADAPTER = new C49512b();
    private static final long serialVersionUID = 0;
    public final List<QueryHistoryInfo> mquery_histories;
    public final List<SearchHistoryInfo> msearch_histories;

    /* renamed from: com.ss.android.lark.pb.ai.SearchHistories$b */
    private static final class C49512b extends ProtoAdapter<SearchHistories> {
        C49512b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchHistories.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchHistories searchHistories) {
            return SearchHistoryInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, searchHistories.msearch_histories) + QueryHistoryInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, searchHistories.mquery_histories) + searchHistories.unknownFields().size();
        }

        /* renamed from: a */
        public SearchHistories decode(ProtoReader protoReader) throws IOException {
            C49511a aVar = new C49511a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124112a.add(SearchHistoryInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124113b.add(QueryHistoryInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchHistories searchHistories) throws IOException {
            SearchHistoryInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchHistories.msearch_histories);
            QueryHistoryInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, searchHistories.mquery_histories);
            protoWriter.writeBytes(searchHistories.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.SearchHistories$a */
    public static final class C49511a extends Message.Builder<SearchHistories, C49511a> {

        /* renamed from: a */
        public List<SearchHistoryInfo> f124112a = Internal.newMutableList();

        /* renamed from: b */
        public List<QueryHistoryInfo> f124113b = Internal.newMutableList();

        /* renamed from: a */
        public SearchHistories build() {
            return new SearchHistories(this.f124112a, this.f124113b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49511a newBuilder() {
        C49511a aVar = new C49511a();
        aVar.f124112a = Internal.copyOf("msearch_histories", this.msearch_histories);
        aVar.f124113b = Internal.copyOf("mquery_histories", this.mquery_histories);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.msearch_histories.isEmpty()) {
            sb.append(", search_histories=");
            sb.append(this.msearch_histories);
        }
        if (!this.mquery_histories.isEmpty()) {
            sb.append(", query_histories=");
            sb.append(this.mquery_histories);
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
        this.msearch_histories = Internal.immutableCopyOf("msearch_histories", list);
        this.mquery_histories = Internal.immutableCopyOf("mquery_histories", list2);
    }
}
