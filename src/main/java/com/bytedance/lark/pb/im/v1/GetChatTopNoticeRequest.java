package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetChatTopNoticeRequest extends Message<GetChatTopNoticeRequest, C17554a> {
    public static final ProtoAdapter<GetChatTopNoticeRequest> ADAPTER = new C17555b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatTopNoticeRequest$b */
    private static final class C17555b extends ProtoAdapter<GetChatTopNoticeRequest> {
        C17555b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatTopNoticeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatTopNoticeRequest getChatTopNoticeRequest) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getChatTopNoticeRequest.chat_id) + getChatTopNoticeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatTopNoticeRequest decode(ProtoReader protoReader) throws IOException {
            C17554a aVar = new C17554a();
            aVar.f44516a = 0L;
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
                    aVar.f44516a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatTopNoticeRequest getChatTopNoticeRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getChatTopNoticeRequest.chat_id);
            protoWriter.writeBytes(getChatTopNoticeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatTopNoticeRequest$a */
    public static final class C17554a extends Message.Builder<GetChatTopNoticeRequest, C17554a> {

        /* renamed from: a */
        public Long f44516a;

        /* renamed from: a */
        public GetChatTopNoticeRequest build() {
            Long l = this.f44516a;
            if (l != null) {
                return new GetChatTopNoticeRequest(l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "chat_id");
        }

        /* renamed from: a */
        public C17554a mo61457a(Long l) {
            this.f44516a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17554a newBuilder() {
        C17554a aVar = new C17554a();
        aVar.f44516a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatTopNoticeRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "GetChatTopNoticeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatTopNoticeRequest(Long l) {
        this(l, ByteString.EMPTY);
    }

    public GetChatTopNoticeRequest(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
    }
}
