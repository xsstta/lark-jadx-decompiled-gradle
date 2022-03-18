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

public final class UpdateChatTabOrdersRequest extends Message<UpdateChatTabOrdersRequest, C18141a> {
    public static final ProtoAdapter<UpdateChatTabOrdersRequest> ADAPTER = new C18142b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final List<Long> re_ordered_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatTabOrdersRequest$b */
    private static final class C18142b extends ProtoAdapter<UpdateChatTabOrdersRequest> {
        C18142b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatTabOrdersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatTabOrdersRequest updateChatTabOrdersRequest) {
            int i;
            if (updateChatTabOrdersRequest.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, updateChatTabOrdersRequest.chat_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, updateChatTabOrdersRequest.re_ordered_ids) + updateChatTabOrdersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatTabOrdersRequest decode(ProtoReader protoReader) throws IOException {
            C18141a aVar = new C18141a();
            aVar.f45336a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45336a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45337b.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatTabOrdersRequest updateChatTabOrdersRequest) throws IOException {
            if (updateChatTabOrdersRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, updateChatTabOrdersRequest.chat_id);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, updateChatTabOrdersRequest.re_ordered_ids);
            protoWriter.writeBytes(updateChatTabOrdersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatTabOrdersRequest$a */
    public static final class C18141a extends Message.Builder<UpdateChatTabOrdersRequest, C18141a> {

        /* renamed from: a */
        public Long f45336a;

        /* renamed from: b */
        public List<Long> f45337b = Internal.newMutableList();

        /* renamed from: a */
        public UpdateChatTabOrdersRequest build() {
            return new UpdateChatTabOrdersRequest(this.f45336a, this.f45337b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18141a mo62932a(Long l) {
            this.f45336a = l;
            return this;
        }

        /* renamed from: a */
        public C18141a mo62933a(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.f45337b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18141a newBuilder() {
        C18141a aVar = new C18141a();
        aVar.f45336a = this.chat_id;
        aVar.f45337b = Internal.copyOf("re_ordered_ids", this.re_ordered_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateChatTabOrdersRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (!this.re_ordered_ids.isEmpty()) {
            sb.append(", re_ordered_ids=");
            sb.append(this.re_ordered_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateChatTabOrdersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatTabOrdersRequest(Long l, List<Long> list) {
        this(l, list, ByteString.EMPTY);
    }

    public UpdateChatTabOrdersRequest(Long l, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.re_ordered_ids = Internal.immutableCopyOf("re_ordered_ids", list);
    }
}
