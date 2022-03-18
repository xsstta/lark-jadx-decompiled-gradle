package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetDocByURLsResponse extends Message<GetDocByURLsResponse, C19253a> {
    public static final ProtoAdapter<GetDocByURLsResponse> ADAPTER = new C19254b();
    private static final long serialVersionUID = 0;
    public final Map<String, Doc> docs;
    public final List<String> invalid_urls;
    public final List<String> no_perm_urls;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetDocByURLsResponse$a */
    public static final class C19253a extends Message.Builder<GetDocByURLsResponse, C19253a> {

        /* renamed from: a */
        public Map<String, Doc> f47440a = Internal.newMutableMap();

        /* renamed from: b */
        public List<String> f47441b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f47442c = Internal.newMutableList();

        /* renamed from: a */
        public GetDocByURLsResponse build() {
            return new GetDocByURLsResponse(this.f47440a, this.f47441b, this.f47442c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetDocByURLsResponse$b */
    private static final class C19254b extends ProtoAdapter<GetDocByURLsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Doc>> f47443a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Doc.ADAPTER);

        C19254b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDocByURLsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDocByURLsResponse getDocByURLsResponse) {
            return this.f47443a.encodedSizeWithTag(1, getDocByURLsResponse.docs) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getDocByURLsResponse.invalid_urls) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, getDocByURLsResponse.no_perm_urls) + getDocByURLsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDocByURLsResponse decode(ProtoReader protoReader) throws IOException {
            C19253a aVar = new C19253a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47440a.putAll(this.f47443a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47441b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47442c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDocByURLsResponse getDocByURLsResponse) throws IOException {
            this.f47443a.encodeWithTag(protoWriter, 1, getDocByURLsResponse.docs);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getDocByURLsResponse.invalid_urls);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, getDocByURLsResponse.no_perm_urls);
            protoWriter.writeBytes(getDocByURLsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19253a newBuilder() {
        C19253a aVar = new C19253a();
        aVar.f47440a = Internal.copyOf("docs", this.docs);
        aVar.f47441b = Internal.copyOf("invalid_urls", this.invalid_urls);
        aVar.f47442c = Internal.copyOf("no_perm_urls", this.no_perm_urls);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetDocByURLsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.docs.isEmpty()) {
            sb.append(", docs=");
            sb.append(this.docs);
        }
        if (!this.invalid_urls.isEmpty()) {
            sb.append(", invalid_urls=");
            sb.append(this.invalid_urls);
        }
        if (!this.no_perm_urls.isEmpty()) {
            sb.append(", no_perm_urls=");
            sb.append(this.no_perm_urls);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDocByURLsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDocByURLsResponse(Map<String, Doc> map, List<String> list, List<String> list2) {
        this(map, list, list2, ByteString.EMPTY);
    }

    public GetDocByURLsResponse(Map<String, Doc> map, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.docs = Internal.immutableCopyOf("docs", map);
        this.invalid_urls = Internal.immutableCopyOf("invalid_urls", list);
        this.no_perm_urls = Internal.immutableCopyOf("no_perm_urls", list2);
    }
}
