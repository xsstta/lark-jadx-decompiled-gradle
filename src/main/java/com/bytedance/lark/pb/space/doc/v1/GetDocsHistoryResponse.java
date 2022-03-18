package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetDocsHistoryResponse extends Message<GetDocsHistoryResponse, C19257a> {
    public static final ProtoAdapter<GetDocsHistoryResponse> ADAPTER = new C19258b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_TIME = 0L;
    public static final Long DEFAULT_TOTAL = 0L;
    private static final long serialVersionUID = 0;
    public final List<DocHistory> docs;
    public final C14928Entity entity;
    public final Boolean has_more;
    public final Long next_time;
    public final Long total;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryResponse$b */
    private static final class C19258b extends ProtoAdapter<GetDocsHistoryResponse> {
        C19258b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDocsHistoryResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDocsHistoryResponse getDocsHistoryResponse) {
            int i;
            int encodedSizeWithTag = DocHistory.ADAPTER.asRepeated().encodedSizeWithTag(1, getDocsHistoryResponse.docs) + ProtoAdapter.INT64.encodedSizeWithTag(2, getDocsHistoryResponse.total) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getDocsHistoryResponse.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(4, getDocsHistoryResponse.next_time);
            if (getDocsHistoryResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(5, getDocsHistoryResponse.entity);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getDocsHistoryResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDocsHistoryResponse decode(ProtoReader protoReader) throws IOException {
            C19257a aVar = new C19257a();
            aVar.f47447b = 0L;
            aVar.f47448c = false;
            aVar.f47449d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47446a.add(DocHistory.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47447b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47448c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f47449d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47450e = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDocsHistoryResponse getDocsHistoryResponse) throws IOException {
            DocHistory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getDocsHistoryResponse.docs);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getDocsHistoryResponse.total);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getDocsHistoryResponse.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getDocsHistoryResponse.next_time);
            if (getDocsHistoryResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 5, getDocsHistoryResponse.entity);
            }
            protoWriter.writeBytes(getDocsHistoryResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryResponse$a */
    public static final class C19257a extends Message.Builder<GetDocsHistoryResponse, C19257a> {

        /* renamed from: a */
        public List<DocHistory> f47446a = Internal.newMutableList();

        /* renamed from: b */
        public Long f47447b;

        /* renamed from: c */
        public Boolean f47448c;

        /* renamed from: d */
        public Long f47449d;

        /* renamed from: e */
        public C14928Entity f47450e;

        /* renamed from: a */
        public GetDocsHistoryResponse build() {
            Boolean bool;
            Long l;
            Long l2 = this.f47447b;
            if (l2 != null && (bool = this.f47448c) != null && (l = this.f47449d) != null) {
                return new GetDocsHistoryResponse(this.f47446a, l2, bool, l, this.f47450e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "total", this.f47448c, "has_more", this.f47449d, "next_time");
        }
    }

    @Override // com.squareup.wire.Message
    public C19257a newBuilder() {
        C19257a aVar = new C19257a();
        aVar.f47446a = Internal.copyOf("docs", this.docs);
        aVar.f47447b = this.total;
        aVar.f47448c = this.has_more;
        aVar.f47449d = this.next_time;
        aVar.f47450e = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetDocsHistoryResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.docs.isEmpty()) {
            sb.append(", docs=");
            sb.append(this.docs);
        }
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", has_more=");
        sb.append(this.has_more);
        sb.append(", next_time=");
        sb.append(this.next_time);
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDocsHistoryResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDocsHistoryResponse(List<DocHistory> list, Long l, Boolean bool, Long l2, C14928Entity entity2) {
        this(list, l, bool, l2, entity2, ByteString.EMPTY);
    }

    public GetDocsHistoryResponse(List<DocHistory> list, Long l, Boolean bool, Long l2, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.docs = Internal.immutableCopyOf("docs", list);
        this.total = l;
        this.has_more = bool;
        this.next_time = l2;
        this.entity = entity2;
    }
}
