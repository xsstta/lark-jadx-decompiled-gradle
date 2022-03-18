package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.SearchResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class SearchResultSummary extends Message<SearchResultSummary, C18913a> {
    public static final ProtoAdapter<SearchResultSummary> ADAPTER = new C18914b();
    public static final Boolean DEFAULT_HAVE_ERR = false;
    public static final Integer DEFAULT_RECALL_NUMS = 0;
    public static final SearchResult.Type DEFAULT_TYPE = SearchResult.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String err_msg;
    public final Boolean have_err;
    public final Integer recall_nums;
    public final SearchResult.Type type;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchResultSummary$b */
    private static final class C18914b extends ProtoAdapter<SearchResultSummary> {
        C18914b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchResultSummary.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchResultSummary searchResultSummary) {
            int i;
            int encodedSizeWithTag = SearchResult.Type.ADAPTER.encodedSizeWithTag(1, searchResultSummary.type);
            int i2 = 0;
            if (searchResultSummary.recall_nums != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, searchResultSummary.recall_nums);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.BOOL.encodedSizeWithTag(3, searchResultSummary.have_err);
            if (searchResultSummary.err_msg != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchResultSummary.err_msg);
            }
            return encodedSizeWithTag2 + i2 + searchResultSummary.unknownFields().size();
        }

        /* renamed from: a */
        public SearchResultSummary decode(ProtoReader protoReader) throws IOException {
            C18913a aVar = new C18913a();
            aVar.f46780a = SearchResult.Type.UNKNOWN;
            aVar.f46781b = 0;
            aVar.f46782c = false;
            aVar.f46783d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46780a = SearchResult.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46781b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46782c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46783d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchResultSummary searchResultSummary) throws IOException {
            SearchResult.Type.ADAPTER.encodeWithTag(protoWriter, 1, searchResultSummary.type);
            if (searchResultSummary.recall_nums != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchResultSummary.recall_nums);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, searchResultSummary.have_err);
            if (searchResultSummary.err_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchResultSummary.err_msg);
            }
            protoWriter.writeBytes(searchResultSummary.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18913a newBuilder() {
        C18913a aVar = new C18913a();
        aVar.f46780a = this.type;
        aVar.f46781b = this.recall_nums;
        aVar.f46782c = this.have_err;
        aVar.f46783d = this.err_msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchResultSummary$a */
    public static final class C18913a extends Message.Builder<SearchResultSummary, C18913a> {

        /* renamed from: a */
        public SearchResult.Type f46780a;

        /* renamed from: b */
        public Integer f46781b;

        /* renamed from: c */
        public Boolean f46782c;

        /* renamed from: d */
        public String f46783d;

        /* renamed from: a */
        public SearchResultSummary build() {
            Boolean bool;
            SearchResult.Type type = this.f46780a;
            if (type != null && (bool = this.f46782c) != null) {
                return new SearchResultSummary(type, this.f46781b, bool, this.f46783d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f46782c, "have_err");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchResultSummary");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.recall_nums != null) {
            sb.append(", recall_nums=");
            sb.append(this.recall_nums);
        }
        sb.append(", have_err=");
        sb.append(this.have_err);
        if (this.err_msg != null) {
            sb.append(", err_msg=");
            sb.append(this.err_msg);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchResultSummary{");
        replace.append('}');
        return replace.toString();
    }

    public SearchResultSummary(SearchResult.Type type2, Integer num, Boolean bool, String str) {
        this(type2, num, bool, str, ByteString.EMPTY);
    }

    public SearchResultSummary(SearchResult.Type type2, Integer num, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.recall_nums = num;
        this.have_err = bool;
        this.err_msg = str;
    }
}
