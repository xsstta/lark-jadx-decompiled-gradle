package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetMyGroupChatsResponse extends Message<GetMyGroupChatsResponse, C17647a> {
    public static final ProtoAdapter<GetMyGroupChatsResponse> ADAPTER = new C17648b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_MIN_TIME = 0L;
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final List<Chat> chats;
    public final Boolean has_more;
    public final Long min_time;
    public final Integer total_count;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyGroupChatsResponse$b */
    private static final class C17648b extends ProtoAdapter<GetMyGroupChatsResponse> {
        C17648b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMyGroupChatsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMyGroupChatsResponse getMyGroupChatsResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = Chat.ADAPTER.asRepeated().encodedSizeWithTag(1, getMyGroupChatsResponse.chats);
            int i3 = 0;
            if (getMyGroupChatsResponse.min_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getMyGroupChatsResponse.min_time);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getMyGroupChatsResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getMyGroupChatsResponse.has_more);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getMyGroupChatsResponse.total_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, getMyGroupChatsResponse.total_count);
            }
            return i5 + i3 + getMyGroupChatsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMyGroupChatsResponse decode(ProtoReader protoReader) throws IOException {
            C17647a aVar = new C17647a();
            aVar.f44656b = 0L;
            aVar.f44657c = false;
            aVar.f44658d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44655a.add(Chat.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44656b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44657c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44658d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMyGroupChatsResponse getMyGroupChatsResponse) throws IOException {
            Chat.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMyGroupChatsResponse.chats);
            if (getMyGroupChatsResponse.min_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getMyGroupChatsResponse.min_time);
            }
            if (getMyGroupChatsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getMyGroupChatsResponse.has_more);
            }
            if (getMyGroupChatsResponse.total_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getMyGroupChatsResponse.total_count);
            }
            protoWriter.writeBytes(getMyGroupChatsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyGroupChatsResponse$a */
    public static final class C17647a extends Message.Builder<GetMyGroupChatsResponse, C17647a> {

        /* renamed from: a */
        public List<Chat> f44655a = Internal.newMutableList();

        /* renamed from: b */
        public Long f44656b;

        /* renamed from: c */
        public Boolean f44657c;

        /* renamed from: d */
        public Integer f44658d;

        /* renamed from: a */
        public GetMyGroupChatsResponse build() {
            return new GetMyGroupChatsResponse(this.f44655a, this.f44656b, this.f44657c, this.f44658d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17647a newBuilder() {
        C17647a aVar = new C17647a();
        aVar.f44655a = Internal.copyOf("chats", this.chats);
        aVar.f44656b = this.min_time;
        aVar.f44657c = this.has_more;
        aVar.f44658d = this.total_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMyGroupChatsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chats.isEmpty()) {
            sb.append(", chats=");
            sb.append(this.chats);
        }
        if (this.min_time != null) {
            sb.append(", min_time=");
            sb.append(this.min_time);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.total_count != null) {
            sb.append(", total_count=");
            sb.append(this.total_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMyGroupChatsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMyGroupChatsResponse(List<Chat> list, Long l, Boolean bool, Integer num) {
        this(list, l, bool, num, ByteString.EMPTY);
    }

    public GetMyGroupChatsResponse(List<Chat> list, Long l, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chats = Internal.immutableCopyOf("chats", list);
        this.min_time = l;
        this.has_more = bool;
        this.total_count = num;
    }
}
