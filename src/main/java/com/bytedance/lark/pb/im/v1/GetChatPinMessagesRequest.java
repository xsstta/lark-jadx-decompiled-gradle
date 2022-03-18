package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatPinMessagesRequest extends Message<GetChatPinMessagesRequest, C17534a> {
    public static final ProtoAdapter<GetChatPinMessagesRequest> ADAPTER = new C17535b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Boolean DEFAULT_IS_FROM_SERVER = true;
    public static final Long DEFAULT_TIMESTAMP_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer count;
    public final Boolean is_from_server;
    public final Long timestamp_cursor;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatPinMessagesRequest$b */
    private static final class C17535b extends ProtoAdapter<GetChatPinMessagesRequest> {
        C17535b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatPinMessagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatPinMessagesRequest getChatPinMessagesRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getChatPinMessagesRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatPinMessagesRequest.chat_id);
            } else {
                i = 0;
            }
            if (getChatPinMessagesRequest.is_from_server != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getChatPinMessagesRequest.is_from_server);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getChatPinMessagesRequest.timestamp_cursor != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getChatPinMessagesRequest.timestamp_cursor);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getChatPinMessagesRequest.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, getChatPinMessagesRequest.count);
            }
            return i6 + i4 + getChatPinMessagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatPinMessagesRequest decode(ProtoReader protoReader) throws IOException {
            C17534a aVar = new C17534a();
            aVar.f44484a = "";
            aVar.f44485b = true;
            aVar.f44486c = 0L;
            aVar.f44487d = 20;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44484a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44485b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44486c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44487d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatPinMessagesRequest getChatPinMessagesRequest) throws IOException {
            if (getChatPinMessagesRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatPinMessagesRequest.chat_id);
            }
            if (getChatPinMessagesRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getChatPinMessagesRequest.is_from_server);
            }
            if (getChatPinMessagesRequest.timestamp_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getChatPinMessagesRequest.timestamp_cursor);
            }
            if (getChatPinMessagesRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getChatPinMessagesRequest.count);
            }
            protoWriter.writeBytes(getChatPinMessagesRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17534a newBuilder() {
        C17534a aVar = new C17534a();
        aVar.f44484a = this.chat_id;
        aVar.f44485b = this.is_from_server;
        aVar.f44486c = this.timestamp_cursor;
        aVar.f44487d = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatPinMessagesRequest$a */
    public static final class C17534a extends Message.Builder<GetChatPinMessagesRequest, C17534a> {

        /* renamed from: a */
        public String f44484a;

        /* renamed from: b */
        public Boolean f44485b;

        /* renamed from: c */
        public Long f44486c;

        /* renamed from: d */
        public Integer f44487d;

        /* renamed from: a */
        public GetChatPinMessagesRequest build() {
            return new GetChatPinMessagesRequest(this.f44484a, this.f44485b, this.f44486c, this.f44487d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17534a mo61407a(Boolean bool) {
            this.f44485b = bool;
            return this;
        }

        /* renamed from: a */
        public C17534a mo61408a(Integer num) {
            this.f44487d = num;
            return this;
        }

        /* renamed from: a */
        public C17534a mo61409a(Long l) {
            this.f44486c = l;
            return this;
        }

        /* renamed from: a */
        public C17534a mo61410a(String str) {
            this.f44484a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatPinMessagesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        if (this.timestamp_cursor != null) {
            sb.append(", timestamp_cursor=");
            sb.append(this.timestamp_cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatPinMessagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatPinMessagesRequest(String str, Boolean bool, Long l, Integer num) {
        this(str, bool, l, num, ByteString.EMPTY);
    }

    public GetChatPinMessagesRequest(String str, Boolean bool, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.is_from_server = bool;
        this.timestamp_cursor = l;
        this.count = num;
    }
}
