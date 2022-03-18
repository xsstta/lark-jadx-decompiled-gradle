package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatTabsRequest extends Message<GetChatTabsRequest, C17550a> {
    public static final ProtoAdapter<GetChatTabsRequest> ADAPTER = new C17551b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final SyncStrategy DEFAULT_STRATEGY = SyncStrategy.Sync;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final SyncStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatTabsRequest$b */
    private static final class C17551b extends ProtoAdapter<GetChatTabsRequest> {
        C17551b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatTabsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatTabsRequest getChatTabsRequest) {
            int i;
            int i2 = 0;
            if (getChatTabsRequest.strategy != null) {
                i = SyncStrategy.ADAPTER.encodedSizeWithTag(1, getChatTabsRequest.strategy);
            } else {
                i = 0;
            }
            if (getChatTabsRequest.chat_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getChatTabsRequest.chat_id);
            }
            return i + i2 + getChatTabsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatTabsRequest decode(ProtoReader protoReader) throws IOException {
            C17550a aVar = new C17550a();
            aVar.f44512a = SyncStrategy.Sync;
            aVar.f44513b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44512a = SyncStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44513b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatTabsRequest getChatTabsRequest) throws IOException {
            if (getChatTabsRequest.strategy != null) {
                SyncStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getChatTabsRequest.strategy);
            }
            if (getChatTabsRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getChatTabsRequest.chat_id);
            }
            protoWriter.writeBytes(getChatTabsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatTabsRequest$a */
    public static final class C17550a extends Message.Builder<GetChatTabsRequest, C17550a> {

        /* renamed from: a */
        public SyncStrategy f44512a;

        /* renamed from: b */
        public Long f44513b;

        /* renamed from: a */
        public GetChatTabsRequest build() {
            return new GetChatTabsRequest(this.f44512a, this.f44513b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17550a mo61447a(SyncStrategy syncStrategy) {
            this.f44512a = syncStrategy;
            return this;
        }

        /* renamed from: a */
        public C17550a mo61448a(Long l) {
            this.f44513b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17550a newBuilder() {
        C17550a aVar = new C17550a();
        aVar.f44512a = this.strategy;
        aVar.f44513b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatTabsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatTabsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatTabsRequest(SyncStrategy syncStrategy, Long l) {
        this(syncStrategy, l, ByteString.EMPTY);
    }

    public GetChatTabsRequest(SyncStrategy syncStrategy, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.strategy = syncStrategy;
        this.chat_id = l;
    }
}
