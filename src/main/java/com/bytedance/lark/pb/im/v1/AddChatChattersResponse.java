package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AddChatChattersResponse extends Message<AddChatChattersResponse, C17284a> {
    public static final ProtoAdapter<AddChatChattersResponse> ADAPTER = new C17285b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;
    public final String join_group_application_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.AddChatChattersResponse$b */
    private static final class C17285b extends ProtoAdapter<AddChatChattersResponse> {
        C17285b() {
            super(FieldEncoding.LENGTH_DELIMITED, AddChatChattersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(AddChatChattersResponse addChatChattersResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (addChatChattersResponse.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, addChatChattersResponse.chat_id);
            } else {
                i = 0;
            }
            if (addChatChattersResponse.entity != null) {
                i2 = C14928Entity.ADAPTER.encodedSizeWithTag(2, addChatChattersResponse.entity);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (addChatChattersResponse.join_group_application_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, addChatChattersResponse.join_group_application_id);
            }
            return i4 + i3 + addChatChattersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public AddChatChattersResponse decode(ProtoReader protoReader) throws IOException {
            C17284a aVar = new C17284a();
            aVar.f44116a = "";
            aVar.f44118c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44116a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44117b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44118c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AddChatChattersResponse addChatChattersResponse) throws IOException {
            if (addChatChattersResponse.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, addChatChattersResponse.chat_id);
            }
            if (addChatChattersResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, addChatChattersResponse.entity);
            }
            if (addChatChattersResponse.join_group_application_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, addChatChattersResponse.join_group_application_id);
            }
            protoWriter.writeBytes(addChatChattersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.AddChatChattersResponse$a */
    public static final class C17284a extends Message.Builder<AddChatChattersResponse, C17284a> {

        /* renamed from: a */
        public String f44116a;

        /* renamed from: b */
        public C14928Entity f44117b;

        /* renamed from: c */
        public String f44118c;

        /* renamed from: a */
        public AddChatChattersResponse build() {
            return new AddChatChattersResponse(this.f44116a, this.f44117b, this.f44118c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17284a newBuilder() {
        C17284a aVar = new C17284a();
        aVar.f44116a = this.chat_id;
        aVar.f44117b = this.entity;
        aVar.f44118c = this.join_group_application_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "AddChatChattersResponse");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.join_group_application_id != null) {
            sb.append(", join_group_application_id=");
            sb.append(this.join_group_application_id);
        }
        StringBuilder replace = sb.replace(0, 2, "AddChatChattersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public AddChatChattersResponse(String str, C14928Entity entity2, String str2) {
        this(str, entity2, str2, ByteString.EMPTY);
    }

    public AddChatChattersResponse(String str, C14928Entity entity2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.entity = entity2;
        this.join_group_application_id = str2;
    }
}
