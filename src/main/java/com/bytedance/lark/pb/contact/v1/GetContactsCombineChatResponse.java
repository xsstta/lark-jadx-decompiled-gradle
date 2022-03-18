package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.ChattersAuthResult;
import com.bytedance.lark.pb.basic.v1.Contact;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetContactsCombineChatResponse extends Message<GetContactsCombineChatResponse, C16222a> {
    public static final ProtoAdapter<GetContactsCombineChatResponse> ADAPTER = new C16223b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final ChattersAuthResult auth_result;
    public final List<Contact> contacts;
    public final C14928Entity entity;
    public final Boolean has_more;
    public final List<String> in_chat_chatter_ids;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetContactsCombineChatResponse$b */
    private static final class C16223b extends ProtoAdapter<GetContactsCombineChatResponse> {
        C16223b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetContactsCombineChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetContactsCombineChatResponse getContactsCombineChatResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getContactsCombineChatResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getContactsCombineChatResponse.entity);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Contact.ADAPTER.asRepeated().encodedSizeWithTag(2, getContactsCombineChatResponse.contacts);
            if (getContactsCombineChatResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getContactsCombineChatResponse.has_more);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, getContactsCombineChatResponse.in_chat_chatter_ids);
            if (getContactsCombineChatResponse.auth_result != null) {
                i3 = ChattersAuthResult.ADAPTER.encodedSizeWithTag(5, getContactsCombineChatResponse.auth_result);
            }
            return encodedSizeWithTag2 + i3 + getContactsCombineChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetContactsCombineChatResponse decode(ProtoReader protoReader) throws IOException {
            C16222a aVar = new C16222a();
            aVar.f42399c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42397a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42398b.add(Contact.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f42399c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42400d.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42401e = ChattersAuthResult.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetContactsCombineChatResponse getContactsCombineChatResponse) throws IOException {
            if (getContactsCombineChatResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getContactsCombineChatResponse.entity);
            }
            Contact.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getContactsCombineChatResponse.contacts);
            if (getContactsCombineChatResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getContactsCombineChatResponse.has_more);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, getContactsCombineChatResponse.in_chat_chatter_ids);
            if (getContactsCombineChatResponse.auth_result != null) {
                ChattersAuthResult.ADAPTER.encodeWithTag(protoWriter, 5, getContactsCombineChatResponse.auth_result);
            }
            protoWriter.writeBytes(getContactsCombineChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetContactsCombineChatResponse$a */
    public static final class C16222a extends Message.Builder<GetContactsCombineChatResponse, C16222a> {

        /* renamed from: a */
        public C14928Entity f42397a;

        /* renamed from: b */
        public List<Contact> f42398b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f42399c;

        /* renamed from: d */
        public List<String> f42400d = Internal.newMutableList();

        /* renamed from: e */
        public ChattersAuthResult f42401e;

        /* renamed from: a */
        public GetContactsCombineChatResponse build() {
            return new GetContactsCombineChatResponse(this.f42397a, this.f42398b, this.f42399c, this.f42400d, this.f42401e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16222a newBuilder() {
        C16222a aVar = new C16222a();
        aVar.f42397a = this.entity;
        aVar.f42398b = Internal.copyOf("contacts", this.contacts);
        aVar.f42399c = this.has_more;
        aVar.f42400d = Internal.copyOf("in_chat_chatter_ids", this.in_chat_chatter_ids);
        aVar.f42401e = this.auth_result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetContactsCombineChatResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.contacts.isEmpty()) {
            sb.append(", contacts=");
            sb.append(this.contacts);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (!this.in_chat_chatter_ids.isEmpty()) {
            sb.append(", in_chat_chatter_ids=");
            sb.append(this.in_chat_chatter_ids);
        }
        if (this.auth_result != null) {
            sb.append(", auth_result=");
            sb.append(this.auth_result);
        }
        StringBuilder replace = sb.replace(0, 2, "GetContactsCombineChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetContactsCombineChatResponse(C14928Entity entity2, List<Contact> list, Boolean bool, List<String> list2, ChattersAuthResult chattersAuthResult) {
        this(entity2, list, bool, list2, chattersAuthResult, ByteString.EMPTY);
    }

    public GetContactsCombineChatResponse(C14928Entity entity2, List<Contact> list, Boolean bool, List<String> list2, ChattersAuthResult chattersAuthResult, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.contacts = Internal.immutableCopyOf("contacts", list);
        this.has_more = bool;
        this.in_chat_chatter_ids = Internal.immutableCopyOf("in_chat_chatter_ids", list2);
        this.auth_result = chattersAuthResult;
    }
}
