package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PatchChatAdminUsersRequest extends Message<PatchChatAdminUsersRequest, C17817a> {
    public static final ProtoAdapter<PatchChatAdminUsersRequest> ADAPTER = new C17818b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> to_add_user_ids;
    public final List<String> to_del_user_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchChatAdminUsersRequest$b */
    private static final class C17818b extends ProtoAdapter<PatchChatAdminUsersRequest> {
        C17818b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchChatAdminUsersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchChatAdminUsersRequest patchChatAdminUsersRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, patchChatAdminUsersRequest.chat_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, patchChatAdminUsersRequest.to_add_user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, patchChatAdminUsersRequest.to_del_user_ids) + patchChatAdminUsersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchChatAdminUsersRequest decode(ProtoReader protoReader) throws IOException {
            C17817a aVar = new C17817a();
            aVar.f44874a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44874a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44875b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44876c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchChatAdminUsersRequest patchChatAdminUsersRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, patchChatAdminUsersRequest.chat_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, patchChatAdminUsersRequest.to_add_user_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, patchChatAdminUsersRequest.to_del_user_ids);
            protoWriter.writeBytes(patchChatAdminUsersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchChatAdminUsersRequest$a */
    public static final class C17817a extends Message.Builder<PatchChatAdminUsersRequest, C17817a> {

        /* renamed from: a */
        public String f44874a;

        /* renamed from: b */
        public List<String> f44875b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f44876c = Internal.newMutableList();

        /* renamed from: a */
        public PatchChatAdminUsersRequest build() {
            String str = this.f44874a;
            if (str != null) {
                return new PatchChatAdminUsersRequest(str, this.f44875b, this.f44876c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17817a mo62111a(String str) {
            this.f44874a = str;
            return this;
        }

        /* renamed from: a */
        public C17817a mo62112a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44875b = list;
            return this;
        }

        /* renamed from: b */
        public C17817a mo62114b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44876c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17817a newBuilder() {
        C17817a aVar = new C17817a();
        aVar.f44874a = this.chat_id;
        aVar.f44875b = Internal.copyOf("to_add_user_ids", this.to_add_user_ids);
        aVar.f44876c = Internal.copyOf("to_del_user_ids", this.to_del_user_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchChatAdminUsersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (!this.to_add_user_ids.isEmpty()) {
            sb.append(", to_add_user_ids=");
            sb.append(this.to_add_user_ids);
        }
        if (!this.to_del_user_ids.isEmpty()) {
            sb.append(", to_del_user_ids=");
            sb.append(this.to_del_user_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchChatAdminUsersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchChatAdminUsersRequest(String str, List<String> list, List<String> list2) {
        this(str, list, list2, ByteString.EMPTY);
    }

    public PatchChatAdminUsersRequest(String str, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.to_add_user_ids = Internal.immutableCopyOf("to_add_user_ids", list);
        this.to_del_user_ids = Internal.immutableCopyOf("to_del_user_ids", list2);
    }
}
