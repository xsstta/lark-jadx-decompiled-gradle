package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatPinMessagesResponse extends Message<GetChatPinMessagesResponse, C17536a> {
    public static final ProtoAdapter<GetChatPinMessagesResponse> ADAPTER = new C17537b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_LAST_READ_TIME = 0L;
    public static final Integer DEFAULT_PIN_TOTAL_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final Boolean has_more;
    public final Long last_read_time;
    public final List<String> ordered_message_ids;
    public final Integer pin_total_count;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatPinMessagesResponse$b */
    private static final class C17537b extends ProtoAdapter<GetChatPinMessagesResponse> {
        C17537b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatPinMessagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatPinMessagesResponse getChatPinMessagesResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getChatPinMessagesResponse.ordered_message_ids);
            int i3 = 0;
            if (getChatPinMessagesResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getChatPinMessagesResponse.has_more);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + C14928Entity.ADAPTER.encodedSizeWithTag(3, getChatPinMessagesResponse.entity);
            if (getChatPinMessagesResponse.pin_total_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, getChatPinMessagesResponse.pin_total_count);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag2 + i2;
            if (getChatPinMessagesResponse.last_read_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(5, getChatPinMessagesResponse.last_read_time);
            }
            return i4 + i3 + getChatPinMessagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatPinMessagesResponse decode(ProtoReader protoReader) throws IOException {
            C17536a aVar = new C17536a();
            aVar.f44489b = false;
            aVar.f44491d = 0;
            aVar.f44492e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44488a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44489b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44490c = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44491d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44492e = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatPinMessagesResponse getChatPinMessagesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getChatPinMessagesResponse.ordered_message_ids);
            if (getChatPinMessagesResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getChatPinMessagesResponse.has_more);
            }
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, getChatPinMessagesResponse.entity);
            if (getChatPinMessagesResponse.pin_total_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getChatPinMessagesResponse.pin_total_count);
            }
            if (getChatPinMessagesResponse.last_read_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, getChatPinMessagesResponse.last_read_time);
            }
            protoWriter.writeBytes(getChatPinMessagesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatPinMessagesResponse$a */
    public static final class C17536a extends Message.Builder<GetChatPinMessagesResponse, C17536a> {

        /* renamed from: a */
        public List<String> f44488a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44489b;

        /* renamed from: c */
        public C14928Entity f44490c;

        /* renamed from: d */
        public Integer f44491d;

        /* renamed from: e */
        public Long f44492e;

        /* renamed from: a */
        public GetChatPinMessagesResponse build() {
            C14928Entity entity = this.f44490c;
            if (entity != null) {
                return new GetChatPinMessagesResponse(this.f44488a, this.f44489b, entity, this.f44491d, this.f44492e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17536a newBuilder() {
        C17536a aVar = new C17536a();
        aVar.f44488a = Internal.copyOf("ordered_message_ids", this.ordered_message_ids);
        aVar.f44489b = this.has_more;
        aVar.f44490c = this.entity;
        aVar.f44491d = this.pin_total_count;
        aVar.f44492e = this.last_read_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatPinMessagesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.ordered_message_ids.isEmpty()) {
            sb.append(", ordered_message_ids=");
            sb.append(this.ordered_message_ids);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        if (this.pin_total_count != null) {
            sb.append(", pin_total_count=");
            sb.append(this.pin_total_count);
        }
        if (this.last_read_time != null) {
            sb.append(", last_read_time=");
            sb.append(this.last_read_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatPinMessagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatPinMessagesResponse(List<String> list, Boolean bool, C14928Entity entity2, Integer num, Long l) {
        this(list, bool, entity2, num, l, ByteString.EMPTY);
    }

    public GetChatPinMessagesResponse(List<String> list, Boolean bool, C14928Entity entity2, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ordered_message_ids = Internal.immutableCopyOf("ordered_message_ids", list);
        this.has_more = bool;
        this.entity = entity2;
        this.pin_total_count = num;
        this.last_read_time = l;
    }
}
