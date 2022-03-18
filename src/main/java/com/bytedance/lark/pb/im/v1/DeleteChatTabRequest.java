package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteChatTabRequest extends Message<DeleteChatTabRequest, C17398a> {
    public static final ProtoAdapter<DeleteChatTabRequest> ADAPTER = new C17399b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_TAB_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final Long tab_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteChatTabRequest$b */
    private static final class C17399b extends ProtoAdapter<DeleteChatTabRequest> {
        C17399b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteChatTabRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteChatTabRequest deleteChatTabRequest) {
            int i;
            int i2 = 0;
            if (deleteChatTabRequest.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, deleteChatTabRequest.chat_id);
            } else {
                i = 0;
            }
            if (deleteChatTabRequest.tab_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, deleteChatTabRequest.tab_id);
            }
            return i + i2 + deleteChatTabRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteChatTabRequest decode(ProtoReader protoReader) throws IOException {
            C17398a aVar = new C17398a();
            aVar.f44308a = 0L;
            aVar.f44309b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44308a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44309b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteChatTabRequest deleteChatTabRequest) throws IOException {
            if (deleteChatTabRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteChatTabRequest.chat_id);
            }
            if (deleteChatTabRequest.tab_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteChatTabRequest.tab_id);
            }
            protoWriter.writeBytes(deleteChatTabRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteChatTabRequest$a */
    public static final class C17398a extends Message.Builder<DeleteChatTabRequest, C17398a> {

        /* renamed from: a */
        public Long f44308a;

        /* renamed from: b */
        public Long f44309b;

        /* renamed from: a */
        public DeleteChatTabRequest build() {
            return new DeleteChatTabRequest(this.f44308a, this.f44309b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17398a mo61061a(Long l) {
            this.f44308a = l;
            return this;
        }

        /* renamed from: b */
        public C17398a mo61063b(Long l) {
            this.f44309b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17398a newBuilder() {
        C17398a aVar = new C17398a();
        aVar.f44308a = this.chat_id;
        aVar.f44309b = this.tab_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteChatTabRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.tab_id != null) {
            sb.append(", tab_id=");
            sb.append(this.tab_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteChatTabRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteChatTabRequest(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public DeleteChatTabRequest(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.tab_id = l2;
    }
}
