package com.bytedance.lark.pb.space.doc.v1;

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

public final class GetDocByURLsRequest extends Message<GetDocByURLsRequest, C19251a> {
    public static final ProtoAdapter<GetDocByURLsRequest> ADAPTER = new C19252b();
    private static final long serialVersionUID = 0;
    public final List<String> urls;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetDocByURLsRequest$b */
    private static final class C19252b extends ProtoAdapter<GetDocByURLsRequest> {
        C19252b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDocByURLsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDocByURLsRequest getDocByURLsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getDocByURLsRequest.urls) + getDocByURLsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDocByURLsRequest decode(ProtoReader protoReader) throws IOException {
            C19251a aVar = new C19251a();
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
                    aVar.f47439a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDocByURLsRequest getDocByURLsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getDocByURLsRequest.urls);
            protoWriter.writeBytes(getDocByURLsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetDocByURLsRequest$a */
    public static final class C19251a extends Message.Builder<GetDocByURLsRequest, C19251a> {

        /* renamed from: a */
        public List<String> f47439a = Internal.newMutableList();

        /* renamed from: a */
        public GetDocByURLsRequest build() {
            return new GetDocByURLsRequest(this.f47439a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19251a mo65697a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47439a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19251a newBuilder() {
        C19251a aVar = new C19251a();
        aVar.f47439a = Internal.copyOf("urls", this.urls);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetDocByURLsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.urls.isEmpty()) {
            sb.append(", urls=");
            sb.append(this.urls);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDocByURLsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDocByURLsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetDocByURLsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.urls = Internal.immutableCopyOf("urls", list);
    }
}
