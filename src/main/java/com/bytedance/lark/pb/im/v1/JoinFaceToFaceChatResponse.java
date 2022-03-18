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

public final class JoinFaceToFaceChatResponse extends Message<JoinFaceToFaceChatResponse, C17791a> {
    public static final ProtoAdapter<JoinFaceToFaceChatResponse> ADAPTER = new C17792b();
    public static final Boolean DEFAULT_IS_CREATE_CHAT = false;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;
    public final Boolean is_create_chat;

    /* renamed from: com.bytedance.lark.pb.im.v1.JoinFaceToFaceChatResponse$b */
    private static final class C17792b extends ProtoAdapter<JoinFaceToFaceChatResponse> {
        C17792b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinFaceToFaceChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinFaceToFaceChatResponse joinFaceToFaceChatResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (joinFaceToFaceChatResponse.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, joinFaceToFaceChatResponse.chat_id);
            } else {
                i = 0;
            }
            if (joinFaceToFaceChatResponse.entity != null) {
                i2 = C14928Entity.ADAPTER.encodedSizeWithTag(2, joinFaceToFaceChatResponse.entity);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (joinFaceToFaceChatResponse.is_create_chat != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, joinFaceToFaceChatResponse.is_create_chat);
            }
            return i4 + i3 + joinFaceToFaceChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JoinFaceToFaceChatResponse decode(ProtoReader protoReader) throws IOException {
            C17791a aVar = new C17791a();
            aVar.f44833a = "";
            aVar.f44835c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44833a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44834b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44835c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinFaceToFaceChatResponse joinFaceToFaceChatResponse) throws IOException {
            if (joinFaceToFaceChatResponse.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, joinFaceToFaceChatResponse.chat_id);
            }
            if (joinFaceToFaceChatResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, joinFaceToFaceChatResponse.entity);
            }
            if (joinFaceToFaceChatResponse.is_create_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, joinFaceToFaceChatResponse.is_create_chat);
            }
            protoWriter.writeBytes(joinFaceToFaceChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.JoinFaceToFaceChatResponse$a */
    public static final class C17791a extends Message.Builder<JoinFaceToFaceChatResponse, C17791a> {

        /* renamed from: a */
        public String f44833a;

        /* renamed from: b */
        public C14928Entity f44834b;

        /* renamed from: c */
        public Boolean f44835c;

        /* renamed from: a */
        public JoinFaceToFaceChatResponse build() {
            return new JoinFaceToFaceChatResponse(this.f44833a, this.f44834b, this.f44835c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17791a newBuilder() {
        C17791a aVar = new C17791a();
        aVar.f44833a = this.chat_id;
        aVar.f44834b = this.entity;
        aVar.f44835c = this.is_create_chat;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "JoinFaceToFaceChatResponse");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.is_create_chat != null) {
            sb.append(", is_create_chat=");
            sb.append(this.is_create_chat);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinFaceToFaceChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JoinFaceToFaceChatResponse(String str, C14928Entity entity2, Boolean bool) {
        this(str, entity2, bool, ByteString.EMPTY);
    }

    public JoinFaceToFaceChatResponse(String str, C14928Entity entity2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.entity = entity2;
        this.is_create_chat = bool;
    }
}
