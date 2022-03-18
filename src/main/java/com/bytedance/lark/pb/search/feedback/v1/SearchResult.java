package com.bytedance.lark.pb.search.feedback.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class SearchResult extends Message<SearchResult, C18759a> {
    public static final ProtoAdapter<SearchResult> ADAPTER = new C18760b();
    public static final Integer DEFAULT_TYPE = 0;
    private static final long serialVersionUID = 0;
    public final String id;
    public final String name;
    public final Integer type;

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.SearchResult$b */
    private static final class C18760b extends ProtoAdapter<SearchResult> {
        C18760b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchResult.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchResult searchResult) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, searchResult.id) + ProtoAdapter.INT32.encodedSizeWithTag(2, searchResult.type) + ProtoAdapter.STRING.encodedSizeWithTag(3, searchResult.name) + searchResult.unknownFields().size();
        }

        /* renamed from: a */
        public SearchResult decode(ProtoReader protoReader) throws IOException {
            C18759a aVar = new C18759a();
            aVar.f46309a = "";
            aVar.f46310b = 0;
            aVar.f46311c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46309a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46310b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46311c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchResult searchResult) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchResult.id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchResult.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchResult.name);
            protoWriter.writeBytes(searchResult.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18759a newBuilder() {
        C18759a aVar = new C18759a();
        aVar.f46309a = this.id;
        aVar.f46310b = this.type;
        aVar.f46311c = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.SearchResult$a */
    public static final class C18759a extends Message.Builder<SearchResult, C18759a> {

        /* renamed from: a */
        public String f46309a;

        /* renamed from: b */
        public Integer f46310b;

        /* renamed from: c */
        public String f46311c;

        /* renamed from: a */
        public SearchResult build() {
            Integer num;
            String str;
            String str2 = this.f46309a;
            if (str2 != null && (num = this.f46310b) != null && (str = this.f46311c) != null) {
                return new SearchResult(str2, num, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f46310b, ShareHitPoint.f121869d, this.f46311c, "name");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchResult");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        StringBuilder replace = sb.replace(0, 2, "SearchResult{");
        replace.append('}');
        return replace.toString();
    }

    public SearchResult(String str, Integer num, String str2) {
        this(str, num, str2, ByteString.EMPTY);
    }

    public SearchResult(String str, Integer num, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = num;
        this.name = str2;
    }
}
