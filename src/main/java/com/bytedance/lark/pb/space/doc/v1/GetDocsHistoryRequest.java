package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetDocsHistoryRequest extends Message<GetDocsHistoryRequest, C19255a> {
    public static final ProtoAdapter<GetDocsHistoryRequest> ADAPTER = new C19256b();
    public static final Long DEFAULT_BEGIN_TIME = 0L;
    public static final Long DEFAULT_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Long begin_time;
    public final Long count;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryRequest$b */
    private static final class C19256b extends ProtoAdapter<GetDocsHistoryRequest> {
        C19256b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDocsHistoryRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDocsHistoryRequest getDocsHistoryRequest) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getDocsHistoryRequest.begin_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, getDocsHistoryRequest.count) + getDocsHistoryRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDocsHistoryRequest decode(ProtoReader protoReader) throws IOException {
            C19255a aVar = new C19255a();
            aVar.f47444a = 0L;
            aVar.f47445b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47444a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47445b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDocsHistoryRequest getDocsHistoryRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getDocsHistoryRequest.begin_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getDocsHistoryRequest.count);
            protoWriter.writeBytes(getDocsHistoryRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19255a newBuilder() {
        C19255a aVar = new C19255a();
        aVar.f47444a = this.begin_time;
        aVar.f47445b = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryRequest$a */
    public static final class C19255a extends Message.Builder<GetDocsHistoryRequest, C19255a> {

        /* renamed from: a */
        public Long f47444a;

        /* renamed from: b */
        public Long f47445b;

        /* renamed from: a */
        public GetDocsHistoryRequest build() {
            Long l;
            Long l2 = this.f47444a;
            if (l2 != null && (l = this.f47445b) != null) {
                return new GetDocsHistoryRequest(l2, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "begin_time", this.f47445b, "count");
        }

        /* renamed from: a */
        public C19255a mo65706a(Long l) {
            this.f47444a = l;
            return this;
        }

        /* renamed from: b */
        public C19255a mo65708b(Long l) {
            this.f47445b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetDocsHistoryRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", begin_time=");
        sb.append(this.begin_time);
        sb.append(", count=");
        sb.append(this.count);
        StringBuilder replace = sb.replace(0, 2, "GetDocsHistoryRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDocsHistoryRequest(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public GetDocsHistoryRequest(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.begin_time = l;
        this.count = l2;
    }
}
