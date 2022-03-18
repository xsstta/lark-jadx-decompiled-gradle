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

public final class GetChatJoinLeaveHistoryRequest extends Message<GetChatJoinLeaveHistoryRequest, C17512a> {
    public static final ProtoAdapter<GetChatJoinLeaveHistoryRequest> ADAPTER = new C17513b();
    public static final Integer DEFAULT_COUNT = 20;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer count;
    public final String cursor;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatJoinLeaveHistoryRequest$b */
    private static final class C17513b extends ProtoAdapter<GetChatJoinLeaveHistoryRequest> {
        C17513b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatJoinLeaveHistoryRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatJoinLeaveHistoryRequest getChatJoinLeaveHistoryRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatJoinLeaveHistoryRequest.chat_id);
            int i2 = 0;
            if (getChatJoinLeaveHistoryRequest.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getChatJoinLeaveHistoryRequest.cursor);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getChatJoinLeaveHistoryRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getChatJoinLeaveHistoryRequest.count);
            }
            return i3 + i2 + getChatJoinLeaveHistoryRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatJoinLeaveHistoryRequest decode(ProtoReader protoReader) throws IOException {
            C17512a aVar = new C17512a();
            aVar.f44437a = "";
            aVar.f44438b = "";
            aVar.f44439c = 20;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44437a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44438b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44439c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatJoinLeaveHistoryRequest getChatJoinLeaveHistoryRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatJoinLeaveHistoryRequest.chat_id);
            if (getChatJoinLeaveHistoryRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getChatJoinLeaveHistoryRequest.cursor);
            }
            if (getChatJoinLeaveHistoryRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getChatJoinLeaveHistoryRequest.count);
            }
            protoWriter.writeBytes(getChatJoinLeaveHistoryRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17512a newBuilder() {
        C17512a aVar = new C17512a();
        aVar.f44437a = this.chat_id;
        aVar.f44438b = this.cursor;
        aVar.f44439c = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatJoinLeaveHistoryRequest$a */
    public static final class C17512a extends Message.Builder<GetChatJoinLeaveHistoryRequest, C17512a> {

        /* renamed from: a */
        public String f44437a;

        /* renamed from: b */
        public String f44438b;

        /* renamed from: c */
        public Integer f44439c;

        /* renamed from: a */
        public GetChatJoinLeaveHistoryRequest build() {
            String str = this.f44437a;
            if (str != null) {
                return new GetChatJoinLeaveHistoryRequest(str, this.f44438b, this.f44439c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17512a mo61346a(Integer num) {
            this.f44439c = num;
            return this;
        }

        /* renamed from: b */
        public C17512a mo61349b(String str) {
            this.f44438b = str;
            return this;
        }

        /* renamed from: a */
        public C17512a mo61347a(String str) {
            this.f44437a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatJoinLeaveHistoryRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatJoinLeaveHistoryRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatJoinLeaveHistoryRequest(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public GetChatJoinLeaveHistoryRequest(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.cursor = str2;
        this.count = num;
    }
}
