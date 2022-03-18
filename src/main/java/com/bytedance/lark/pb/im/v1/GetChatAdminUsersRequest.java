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
import okio.ByteString;

public final class GetChatAdminUsersRequest extends Message<GetChatAdminUsersRequest, C17482a> {
    public static final ProtoAdapter<GetChatAdminUsersRequest> ADAPTER = new C17483b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.LOCAL;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatAdminUsersRequest$b */
    private static final class C17483b extends ProtoAdapter<GetChatAdminUsersRequest> {
        C17483b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatAdminUsersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatAdminUsersRequest getChatAdminUsersRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatAdminUsersRequest.chat_id) + SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getChatAdminUsersRequest.sync_data_strategy) + getChatAdminUsersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatAdminUsersRequest decode(ProtoReader protoReader) throws IOException {
            C17482a aVar = new C17482a();
            aVar.f44388a = "";
            aVar.f44389b = SyncDataStrategy.LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44388a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44389b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatAdminUsersRequest getChatAdminUsersRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatAdminUsersRequest.chat_id);
            SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getChatAdminUsersRequest.sync_data_strategy);
            protoWriter.writeBytes(getChatAdminUsersRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17482a newBuilder() {
        C17482a aVar = new C17482a();
        aVar.f44388a = this.chat_id;
        aVar.f44389b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatAdminUsersRequest$a */
    public static final class C17482a extends Message.Builder<GetChatAdminUsersRequest, C17482a> {

        /* renamed from: a */
        public String f44388a;

        /* renamed from: b */
        public SyncDataStrategy f44389b;

        /* renamed from: a */
        public GetChatAdminUsersRequest build() {
            SyncDataStrategy syncDataStrategy;
            String str = this.f44388a;
            if (str != null && (syncDataStrategy = this.f44389b) != null) {
                return new GetChatAdminUsersRequest(str, syncDataStrategy, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f44389b, "sync_data_strategy");
        }

        /* renamed from: a */
        public C17482a mo61266a(SyncDataStrategy syncDataStrategy) {
            this.f44389b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17482a mo61267a(String str) {
            this.f44388a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatAdminUsersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", sync_data_strategy=");
        sb.append(this.sync_data_strategy);
        StringBuilder replace = sb.replace(0, 2, "GetChatAdminUsersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatAdminUsersRequest(String str, SyncDataStrategy syncDataStrategy) {
        this(str, syncDataStrategy, ByteString.EMPTY);
    }

    public GetChatAdminUsersRequest(String str, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.sync_data_strategy = syncDataStrategy;
    }
}
