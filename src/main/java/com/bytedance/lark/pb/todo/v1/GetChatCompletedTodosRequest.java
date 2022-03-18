package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatCompletedTodosRequest extends Message<GetChatCompletedTodosRequest, C19509a> {
    public static final ProtoAdapter<GetChatCompletedTodosRequest> ADAPTER = new C19510b();
    public static final Long DEFAULT_LAST_OFFSET = 0L;
    public static final Integer DEFAULT_PAGE_COUNT = 20;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long last_offset;
    public final Integer page_count;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetChatCompletedTodosRequest$b */
    private static final class C19510b extends ProtoAdapter<GetChatCompletedTodosRequest> {
        C19510b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatCompletedTodosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatCompletedTodosRequest getChatCompletedTodosRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getChatCompletedTodosRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatCompletedTodosRequest.chat_id);
            } else {
                i = 0;
            }
            if (getChatCompletedTodosRequest.page_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getChatCompletedTodosRequest.page_count);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getChatCompletedTodosRequest.last_offset != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getChatCompletedTodosRequest.last_offset);
            }
            return i4 + i3 + getChatCompletedTodosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatCompletedTodosRequest decode(ProtoReader protoReader) throws IOException {
            C19509a aVar = new C19509a();
            aVar.f47860a = "";
            aVar.f47861b = 20;
            aVar.f47862c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47860a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47861b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47862c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatCompletedTodosRequest getChatCompletedTodosRequest) throws IOException {
            if (getChatCompletedTodosRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatCompletedTodosRequest.chat_id);
            }
            if (getChatCompletedTodosRequest.page_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getChatCompletedTodosRequest.page_count);
            }
            if (getChatCompletedTodosRequest.last_offset != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getChatCompletedTodosRequest.last_offset);
            }
            protoWriter.writeBytes(getChatCompletedTodosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetChatCompletedTodosRequest$a */
    public static final class C19509a extends Message.Builder<GetChatCompletedTodosRequest, C19509a> {

        /* renamed from: a */
        public String f47860a;

        /* renamed from: b */
        public Integer f47861b;

        /* renamed from: c */
        public Long f47862c;

        /* renamed from: a */
        public GetChatCompletedTodosRequest build() {
            return new GetChatCompletedTodosRequest(this.f47860a, this.f47861b, this.f47862c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19509a mo66317a(Integer num) {
            this.f47861b = num;
            return this;
        }

        /* renamed from: a */
        public C19509a mo66318a(Long l) {
            this.f47862c = l;
            return this;
        }

        /* renamed from: a */
        public C19509a mo66319a(String str) {
            this.f47860a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19509a newBuilder() {
        C19509a aVar = new C19509a();
        aVar.f47860a = this.chat_id;
        aVar.f47861b = this.page_count;
        aVar.f47862c = this.last_offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetChatCompletedTodosRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.page_count != null) {
            sb.append(", page_count=");
            sb.append(this.page_count);
        }
        if (this.last_offset != null) {
            sb.append(", last_offset=");
            sb.append(this.last_offset);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatCompletedTodosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatCompletedTodosRequest(String str, Integer num, Long l) {
        this(str, num, l, ByteString.EMPTY);
    }

    public GetChatCompletedTodosRequest(String str, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.page_count = num;
        this.last_offset = l;
    }
}
