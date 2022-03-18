package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BatchPutP2PChatMessageRequest extends Message<BatchPutP2PChatMessageRequest, C17292a> {
    public static final ProtoAdapter<BatchPutP2PChatMessageRequest> ADAPTER = new C17293b();
    public static final Message.Type DEFAULT_TYPE = Message.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Content content;
    public final List<String> to_user_ids;
    public final Message.Type type;

    /* renamed from: com.bytedance.lark.pb.im.v1.BatchPutP2PChatMessageRequest$b */
    private static final class C17293b extends ProtoAdapter<BatchPutP2PChatMessageRequest> {
        C17293b() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchPutP2PChatMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(BatchPutP2PChatMessageRequest batchPutP2PChatMessageRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, batchPutP2PChatMessageRequest.to_user_ids) + Content.ADAPTER.encodedSizeWithTag(2, batchPutP2PChatMessageRequest.content);
            if (batchPutP2PChatMessageRequest.type != null) {
                i = Message.Type.ADAPTER.encodedSizeWithTag(3, batchPutP2PChatMessageRequest.type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + batchPutP2PChatMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public BatchPutP2PChatMessageRequest decode(ProtoReader protoReader) throws IOException {
            C17292a aVar = new C17292a();
            aVar.f44137c = Message.Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44135a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44136b = Content.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44137c = Message.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BatchPutP2PChatMessageRequest batchPutP2PChatMessageRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, batchPutP2PChatMessageRequest.to_user_ids);
            Content.ADAPTER.encodeWithTag(protoWriter, 2, batchPutP2PChatMessageRequest.content);
            if (batchPutP2PChatMessageRequest.type != null) {
                Message.Type.ADAPTER.encodeWithTag(protoWriter, 3, batchPutP2PChatMessageRequest.type);
            }
            protoWriter.writeBytes(batchPutP2PChatMessageRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17292a newBuilder() {
        C17292a aVar = new C17292a();
        aVar.f44135a = Internal.copyOf("to_user_ids", this.to_user_ids);
        aVar.f44136b = this.content;
        aVar.f44137c = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.BatchPutP2PChatMessageRequest$a */
    public static final class C17292a extends Message.Builder<BatchPutP2PChatMessageRequest, C17292a> {

        /* renamed from: a */
        public List<String> f44135a = Internal.newMutableList();

        /* renamed from: b */
        public Content f44136b;

        /* renamed from: c */
        public Message.Type f44137c;

        /* renamed from: a */
        public BatchPutP2PChatMessageRequest build() {
            Content content = this.f44136b;
            if (content != null) {
                return new BatchPutP2PChatMessageRequest(this.f44135a, content, this.f44137c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(content, "content");
        }

        /* renamed from: a */
        public C17292a mo60758a(Content content) {
            this.f44136b = content;
            return this;
        }

        /* renamed from: a */
        public C17292a mo60759a(Message.Type type) {
            this.f44137c = type;
            return this;
        }

        /* renamed from: a */
        public C17292a mo60760a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44135a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "BatchPutP2PChatMessageRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.to_user_ids.isEmpty()) {
            sb.append(", to_user_ids=");
            sb.append(this.to_user_ids);
        }
        sb.append(", content=");
        sb.append(this.content);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "BatchPutP2PChatMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public BatchPutP2PChatMessageRequest(List<String> list, Content content2, Message.Type type2) {
        this(list, content2, type2, ByteString.EMPTY);
    }

    public BatchPutP2PChatMessageRequest(List<String> list, Content content2, Message.Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.to_user_ids = Internal.immutableCopyOf("to_user_ids", list);
        this.content = content2;
        this.type = type2;
    }
}
