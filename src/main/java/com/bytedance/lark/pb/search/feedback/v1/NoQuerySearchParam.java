package com.bytedance.lark.pb.search.feedback.v1;

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

public final class NoQuerySearchParam extends Message<NoQuerySearchParam, C18757a> {
    public static final ProtoAdapter<NoQuerySearchParam> ADAPTER = new C18758b();
    private static final long serialVersionUID = 0;
    public final List<SearchResult> results;
    public final String session_id;

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.NoQuerySearchParam$b */
    private static final class C18758b extends ProtoAdapter<NoQuerySearchParam> {
        C18758b() {
            super(FieldEncoding.LENGTH_DELIMITED, NoQuerySearchParam.class);
        }

        /* renamed from: a */
        public int encodedSize(NoQuerySearchParam noQuerySearchParam) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, noQuerySearchParam.session_id) + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(2, noQuerySearchParam.results) + noQuerySearchParam.unknownFields().size();
        }

        /* renamed from: a */
        public NoQuerySearchParam decode(ProtoReader protoReader) throws IOException {
            C18757a aVar = new C18757a();
            aVar.f46307a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46307a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46308b.add(SearchResult.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NoQuerySearchParam noQuerySearchParam) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, noQuerySearchParam.session_id);
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, noQuerySearchParam.results);
            protoWriter.writeBytes(noQuerySearchParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.feedback.v1.NoQuerySearchParam$a */
    public static final class C18757a extends Message.Builder<NoQuerySearchParam, C18757a> {

        /* renamed from: a */
        public String f46307a;

        /* renamed from: b */
        public List<SearchResult> f46308b = Internal.newMutableList();

        /* renamed from: a */
        public NoQuerySearchParam build() {
            String str = this.f46307a;
            if (str != null) {
                return new NoQuerySearchParam(str, this.f46308b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "session_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18757a newBuilder() {
        C18757a aVar = new C18757a();
        aVar.f46307a = this.session_id;
        aVar.f46308b = Internal.copyOf("results", this.results);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "NoQuerySearchParam");
        StringBuilder sb = new StringBuilder();
        sb.append(", session_id=");
        sb.append(this.session_id);
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        StringBuilder replace = sb.replace(0, 2, "NoQuerySearchParam{");
        replace.append('}');
        return replace.toString();
    }

    public NoQuerySearchParam(String str, List<SearchResult> list) {
        this(str, list, ByteString.EMPTY);
    }

    public NoQuerySearchParam(String str, List<SearchResult> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.session_id = str;
        this.results = Internal.immutableCopyOf("results", list);
    }
}
