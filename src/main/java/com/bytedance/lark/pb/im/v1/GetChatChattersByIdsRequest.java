package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatChattersByIdsRequest extends Message<GetChatChattersByIdsRequest, C17502a> {
    public static final ProtoAdapter<GetChatChattersByIdsRequest> ADAPTER = new C17503b();
    public static final Boolean DEFAULT_IGNORE_LOCAL = false;
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> chatter_ids;
    public final Boolean ignore_local;
    public final SyncDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersByIdsRequest$b */
    private static final class C17503b extends ProtoAdapter<GetChatChattersByIdsRequest> {
        C17503b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatChattersByIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatChattersByIdsRequest getChatChattersByIdsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatChattersByIdsRequest.chat_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getChatChattersByIdsRequest.chatter_ids);
            int i2 = 0;
            if (getChatChattersByIdsRequest.ignore_local != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(3, getChatChattersByIdsRequest.ignore_local);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getChatChattersByIdsRequest.strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(4, getChatChattersByIdsRequest.strategy);
            }
            return i3 + i2 + getChatChattersByIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatChattersByIdsRequest decode(ProtoReader protoReader) throws IOException {
            C17502a aVar = new C17502a();
            aVar.f44407a = "";
            aVar.f44409c = false;
            aVar.f44410d = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44407a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44408b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44409c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44410d = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatChattersByIdsRequest getChatChattersByIdsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatChattersByIdsRequest.chat_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getChatChattersByIdsRequest.chatter_ids);
            if (getChatChattersByIdsRequest.ignore_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getChatChattersByIdsRequest.ignore_local);
            }
            if (getChatChattersByIdsRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 4, getChatChattersByIdsRequest.strategy);
            }
            protoWriter.writeBytes(getChatChattersByIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersByIdsRequest$a */
    public static final class C17502a extends Message.Builder<GetChatChattersByIdsRequest, C17502a> {

        /* renamed from: a */
        public String f44407a;

        /* renamed from: b */
        public List<String> f44408b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f44409c;

        /* renamed from: d */
        public SyncDataStrategy f44410d;

        /* renamed from: a */
        public GetChatChattersByIdsRequest build() {
            String str = this.f44407a;
            if (str != null) {
                return new GetChatChattersByIdsRequest(str, this.f44408b, this.f44409c, this.f44410d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17502a mo61315a(SyncDataStrategy syncDataStrategy) {
            this.f44410d = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17502a mo61316a(String str) {
            this.f44407a = str;
            return this;
        }

        /* renamed from: a */
        public C17502a mo61317a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44408b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17502a newBuilder() {
        C17502a aVar = new C17502a();
        aVar.f44407a = this.chat_id;
        aVar.f44408b = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44409c = this.ignore_local;
        aVar.f44410d = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatChattersByIdsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.ignore_local != null) {
            sb.append(", ignore_local=");
            sb.append(this.ignore_local);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatChattersByIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatChattersByIdsRequest(String str, List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy) {
        this(str, list, bool, syncDataStrategy, ByteString.EMPTY);
    }

    public GetChatChattersByIdsRequest(String str, List<String> list, Boolean bool, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.ignore_local = bool;
        this.strategy = syncDataStrategy;
    }
}
