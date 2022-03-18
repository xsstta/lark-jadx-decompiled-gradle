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

public final class UpdateChatPostUsersRequest extends Message<UpdateChatPostUsersRequest, C18135a> {
    public static final ProtoAdapter<UpdateChatPostUsersRequest> ADAPTER = new C18136b();
    public static final Chat.PostType DEFAULT_POST_TYPE = Chat.PostType.UNKNOWN_POST_TYPE;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Chat.PostType post_type;
    public final List<String> to_add_user_ids;
    public final List<String> to_del_user_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatPostUsersRequest$b */
    private static final class C18136b extends ProtoAdapter<UpdateChatPostUsersRequest> {
        C18136b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatPostUsersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatPostUsersRequest updateChatPostUsersRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateChatPostUsersRequest.chat_id) + Chat.PostType.ADAPTER.encodedSizeWithTag(2, updateChatPostUsersRequest.post_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, updateChatPostUsersRequest.to_add_user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, updateChatPostUsersRequest.to_del_user_ids) + updateChatPostUsersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatPostUsersRequest decode(ProtoReader protoReader) throws IOException {
            C18135a aVar = new C18135a();
            aVar.f45294a = "";
            aVar.f45295b = Chat.PostType.UNKNOWN_POST_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45294a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f45295b = Chat.PostType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f45296c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45297d.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatPostUsersRequest updateChatPostUsersRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateChatPostUsersRequest.chat_id);
            Chat.PostType.ADAPTER.encodeWithTag(protoWriter, 2, updateChatPostUsersRequest.post_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, updateChatPostUsersRequest.to_add_user_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, updateChatPostUsersRequest.to_del_user_ids);
            protoWriter.writeBytes(updateChatPostUsersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatPostUsersRequest$a */
    public static final class C18135a extends Message.Builder<UpdateChatPostUsersRequest, C18135a> {

        /* renamed from: a */
        public String f45294a;

        /* renamed from: b */
        public Chat.PostType f45295b;

        /* renamed from: c */
        public List<String> f45296c = Internal.newMutableList();

        /* renamed from: d */
        public List<String> f45297d = Internal.newMutableList();

        /* renamed from: a */
        public UpdateChatPostUsersRequest build() {
            Chat.PostType postType;
            String str = this.f45294a;
            if (str != null && (postType = this.f45295b) != null) {
                return new UpdateChatPostUsersRequest(str, postType, this.f45296c, this.f45297d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f45295b, "post_type");
        }

        /* renamed from: a */
        public C18135a mo62888a(Chat.PostType postType) {
            this.f45295b = postType;
            return this;
        }

        /* renamed from: a */
        public C18135a mo62889a(String str) {
            this.f45294a = str;
            return this;
        }

        /* renamed from: b */
        public C18135a mo62892b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45297d = list;
            return this;
        }

        /* renamed from: a */
        public C18135a mo62890a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45296c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18135a newBuilder() {
        C18135a aVar = new C18135a();
        aVar.f45294a = this.chat_id;
        aVar.f45295b = this.post_type;
        aVar.f45296c = Internal.copyOf("to_add_user_ids", this.to_add_user_ids);
        aVar.f45297d = Internal.copyOf("to_del_user_ids", this.to_del_user_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateChatPostUsersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", post_type=");
        sb.append(this.post_type);
        if (!this.to_add_user_ids.isEmpty()) {
            sb.append(", to_add_user_ids=");
            sb.append(this.to_add_user_ids);
        }
        if (!this.to_del_user_ids.isEmpty()) {
            sb.append(", to_del_user_ids=");
            sb.append(this.to_del_user_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateChatPostUsersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatPostUsersRequest(String str, Chat.PostType postType, List<String> list, List<String> list2) {
        this(str, postType, list, list2, ByteString.EMPTY);
    }

    public UpdateChatPostUsersRequest(String str, Chat.PostType postType, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.post_type = postType;
        this.to_add_user_ids = Internal.immutableCopyOf("to_add_user_ids", list);
        this.to_del_user_ids = Internal.immutableCopyOf("to_del_user_ids", list2);
    }
}
