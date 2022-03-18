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

public final class GetMentionChatChattersRequest extends Message<GetMentionChatChattersRequest, C17605a> {
    public static final ProtoAdapter<GetMentionChatChattersRequest> ADAPTER = new C17606b();
    public static final Boolean DEFAULT_IS_FROM_SERVER = true;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Boolean is_from_server;
    public final String query;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMentionChatChattersRequest$b */
    private static final class C17606b extends ProtoAdapter<GetMentionChatChattersRequest> {
        C17606b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMentionChatChattersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMentionChatChattersRequest getMentionChatChattersRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getMentionChatChattersRequest.chat_id);
            int i2 = 0;
            if (getMentionChatChattersRequest.is_from_server != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getMentionChatChattersRequest.is_from_server);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getMentionChatChattersRequest.query != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getMentionChatChattersRequest.query);
            }
            return i3 + i2 + getMentionChatChattersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMentionChatChattersRequest decode(ProtoReader protoReader) throws IOException {
            C17605a aVar = new C17605a();
            aVar.f44592a = "";
            aVar.f44593b = true;
            aVar.f44594c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44592a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44593b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44594c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMentionChatChattersRequest getMentionChatChattersRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMentionChatChattersRequest.chat_id);
            if (getMentionChatChattersRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getMentionChatChattersRequest.is_from_server);
            }
            if (getMentionChatChattersRequest.query != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getMentionChatChattersRequest.query);
            }
            protoWriter.writeBytes(getMentionChatChattersRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17605a newBuilder() {
        C17605a aVar = new C17605a();
        aVar.f44592a = this.chat_id;
        aVar.f44593b = this.is_from_server;
        aVar.f44594c = this.query;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMentionChatChattersRequest$a */
    public static final class C17605a extends Message.Builder<GetMentionChatChattersRequest, C17605a> {

        /* renamed from: a */
        public String f44592a;

        /* renamed from: b */
        public Boolean f44593b;

        /* renamed from: c */
        public String f44594c;

        /* renamed from: a */
        public GetMentionChatChattersRequest build() {
            String str = this.f44592a;
            if (str != null) {
                return new GetMentionChatChattersRequest(str, this.f44593b, this.f44594c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17605a mo61589a(Boolean bool) {
            this.f44593b = bool;
            return this;
        }

        /* renamed from: b */
        public C17605a mo61592b(String str) {
            this.f44594c = str;
            return this;
        }

        /* renamed from: a */
        public C17605a mo61590a(String str) {
            this.f44592a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMentionChatChattersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        if (this.query != null) {
            sb.append(", query=");
            sb.append(this.query);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMentionChatChattersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMentionChatChattersRequest(String str, Boolean bool, String str2) {
        this(str, bool, str2, ByteString.EMPTY);
    }

    public GetMentionChatChattersRequest(String str, Boolean bool, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.is_from_server = bool;
        this.query = str2;
    }
}
