package com.bytedance.lark.pb.im.v1;

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

public final class BatchTransmitRequest extends Message<BatchTransmitRequest, C17296a> {
    public static final ProtoAdapter<BatchTransmitRequest> ADAPTER = new C17297b();
    private static final long serialVersionUID = 0;
    public final List<String> message_ids;
    public final String origin_merge_forward_id;
    public final List<TransmitTarget> targets;

    /* renamed from: com.bytedance.lark.pb.im.v1.BatchTransmitRequest$b */
    private static final class C17297b extends ProtoAdapter<BatchTransmitRequest> {
        C17297b() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchTransmitRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(BatchTransmitRequest batchTransmitRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, batchTransmitRequest.message_ids) + TransmitTarget.ADAPTER.asRepeated().encodedSizeWithTag(2, batchTransmitRequest.targets);
            if (batchTransmitRequest.origin_merge_forward_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, batchTransmitRequest.origin_merge_forward_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + batchTransmitRequest.unknownFields().size();
        }

        /* renamed from: a */
        public BatchTransmitRequest decode(ProtoReader protoReader) throws IOException {
            C17296a aVar = new C17296a();
            aVar.f44140c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44138a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44139b.add(TransmitTarget.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44140c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BatchTransmitRequest batchTransmitRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, batchTransmitRequest.message_ids);
            TransmitTarget.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, batchTransmitRequest.targets);
            if (batchTransmitRequest.origin_merge_forward_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, batchTransmitRequest.origin_merge_forward_id);
            }
            protoWriter.writeBytes(batchTransmitRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.BatchTransmitRequest$a */
    public static final class C17296a extends Message.Builder<BatchTransmitRequest, C17296a> {

        /* renamed from: a */
        public List<String> f44138a = Internal.newMutableList();

        /* renamed from: b */
        public List<TransmitTarget> f44139b = Internal.newMutableList();

        /* renamed from: c */
        public String f44140c;

        /* renamed from: a */
        public BatchTransmitRequest build() {
            return new BatchTransmitRequest(this.f44138a, this.f44139b, this.f44140c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17296a mo60769a(String str) {
            this.f44140c = str;
            return this;
        }

        /* renamed from: a */
        public C17296a mo60770a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44138a = list;
            return this;
        }

        /* renamed from: b */
        public C17296a mo60772b(List<TransmitTarget> list) {
            Internal.checkElementsNotNull(list);
            this.f44139b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17296a newBuilder() {
        C17296a aVar = new C17296a();
        aVar.f44138a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f44139b = Internal.copyOf("targets", this.targets);
        aVar.f44140c = this.origin_merge_forward_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "BatchTransmitRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (!this.targets.isEmpty()) {
            sb.append(", targets=");
            sb.append(this.targets);
        }
        if (this.origin_merge_forward_id != null) {
            sb.append(", origin_merge_forward_id=");
            sb.append(this.origin_merge_forward_id);
        }
        StringBuilder replace = sb.replace(0, 2, "BatchTransmitRequest{");
        replace.append('}');
        return replace.toString();
    }

    public BatchTransmitRequest(List<String> list, List<TransmitTarget> list2, String str) {
        this(list, list2, str, ByteString.EMPTY);
    }

    public BatchTransmitRequest(List<String> list, List<TransmitTarget> list2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
        this.targets = Internal.immutableCopyOf("targets", list2);
        this.origin_merge_forward_id = str;
    }
}
