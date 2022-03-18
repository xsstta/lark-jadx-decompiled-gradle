package com.bytedance.lark.pb.tool.v1;

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

public final class CancelFetchRequest extends Message<CancelFetchRequest, C19685a> {
    public static final ProtoAdapter<CancelFetchRequest> ADAPTER = new C19686b();
    public static final Long DEFAULT_REQUEST_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long request_id;
    public final List<String> request_ids;

    /* renamed from: com.bytedance.lark.pb.tool.v1.CancelFetchRequest$b */
    private static final class C19686b extends ProtoAdapter<CancelFetchRequest> {
        C19686b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelFetchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelFetchRequest cancelFetchRequest) {
            int i;
            if (cancelFetchRequest.request_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, cancelFetchRequest.request_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, cancelFetchRequest.request_ids) + cancelFetchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelFetchRequest decode(ProtoReader protoReader) throws IOException {
            C19685a aVar = new C19685a();
            aVar.f48131a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48131a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48132b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelFetchRequest cancelFetchRequest) throws IOException {
            if (cancelFetchRequest.request_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cancelFetchRequest.request_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, cancelFetchRequest.request_ids);
            protoWriter.writeBytes(cancelFetchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.CancelFetchRequest$a */
    public static final class C19685a extends Message.Builder<CancelFetchRequest, C19685a> {

        /* renamed from: a */
        public Long f48131a;

        /* renamed from: b */
        public List<String> f48132b = Internal.newMutableList();

        /* renamed from: a */
        public CancelFetchRequest build() {
            return new CancelFetchRequest(this.f48131a, this.f48132b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19685a newBuilder() {
        C19685a aVar = new C19685a();
        aVar.f48131a = this.request_id;
        aVar.f48132b = Internal.copyOf("request_ids", this.request_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "CancelFetchRequest");
        StringBuilder sb = new StringBuilder();
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (!this.request_ids.isEmpty()) {
            sb.append(", request_ids=");
            sb.append(this.request_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CancelFetchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelFetchRequest(Long l, List<String> list) {
        this(l, list, ByteString.EMPTY);
    }

    public CancelFetchRequest(Long l, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.request_id = l;
        this.request_ids = Internal.immutableCopyOf("request_ids", list);
    }
}
