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

public final class GetChatAdminUsersResponse extends Message<GetChatAdminUsersResponse, C17484a> {
    public static final ProtoAdapter<GetChatAdminUsersResponse> ADAPTER = new C17485b();
    private static final long serialVersionUID = 0;
    public final List<String> admin_users;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatAdminUsersResponse$b */
    private static final class C17485b extends ProtoAdapter<GetChatAdminUsersResponse> {
        C17485b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatAdminUsersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatAdminUsersResponse getChatAdminUsersResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getChatAdminUsersResponse.admin_users) + C14928Entity.ADAPTER.encodedSizeWithTag(2, getChatAdminUsersResponse.entity) + getChatAdminUsersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatAdminUsersResponse decode(ProtoReader protoReader) throws IOException {
            C17484a aVar = new C17484a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44390a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44391b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatAdminUsersResponse getChatAdminUsersResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getChatAdminUsersResponse.admin_users);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, getChatAdminUsersResponse.entity);
            protoWriter.writeBytes(getChatAdminUsersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatAdminUsersResponse$a */
    public static final class C17484a extends Message.Builder<GetChatAdminUsersResponse, C17484a> {

        /* renamed from: a */
        public List<String> f44390a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f44391b;

        /* renamed from: a */
        public GetChatAdminUsersResponse build() {
            C14928Entity entity = this.f44391b;
            if (entity != null) {
                return new GetChatAdminUsersResponse(this.f44390a, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17484a newBuilder() {
        C17484a aVar = new C17484a();
        aVar.f44390a = Internal.copyOf("admin_users", this.admin_users);
        aVar.f44391b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatAdminUsersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.admin_users.isEmpty()) {
            sb.append(", admin_users=");
            sb.append(this.admin_users);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "GetChatAdminUsersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatAdminUsersResponse(List<String> list, C14928Entity entity2) {
        this(list, entity2, ByteString.EMPTY);
    }

    public GetChatAdminUsersResponse(List<String> list, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.admin_users = Internal.immutableCopyOf("admin_users", list);
        this.entity = entity2;
    }
}
