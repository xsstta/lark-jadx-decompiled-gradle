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
import okio.ByteString;

public final class GetChatLinkInfoResponse extends Message<GetChatLinkInfoResponse, C17522a> {
    public static final ProtoAdapter<GetChatLinkInfoResponse> ADAPTER = new C17523b();
    public static final Boolean DEFAULT_ALREADY_IN_CHAT = false;
    public static final Boolean DEFAULT_IS_INVITER_CAN_INVITE_MEMBER = false;
    private static final long serialVersionUID = 0;
    public final Boolean already_in_chat;
    public final String chat_id;
    public final C14928Entity entity;
    public final String expire_time;
    public final String inviter_chatter_id;
    public final Boolean is_inviter_can_invite_member;
    public final String owner_chatter_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLinkInfoResponse$b */
    private static final class C17523b extends ProtoAdapter<GetChatLinkInfoResponse> {
        C17523b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatLinkInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatLinkInfoResponse getChatLinkInfoResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (getChatLinkInfoResponse.already_in_chat != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getChatLinkInfoResponse.already_in_chat);
            } else {
                i = 0;
            }
            if (getChatLinkInfoResponse.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getChatLinkInfoResponse.chat_id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (getChatLinkInfoResponse.owner_chatter_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getChatLinkInfoResponse.owner_chatter_id);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getChatLinkInfoResponse.inviter_chatter_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getChatLinkInfoResponse.inviter_chatter_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (getChatLinkInfoResponse.is_inviter_can_invite_member != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getChatLinkInfoResponse.is_inviter_can_invite_member);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i9 + i5 + C14928Entity.ADAPTER.encodedSizeWithTag(6, getChatLinkInfoResponse.entity);
            if (getChatLinkInfoResponse.expire_time != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, getChatLinkInfoResponse.expire_time);
            }
            return encodedSizeWithTag + i6 + getChatLinkInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatLinkInfoResponse decode(ProtoReader protoReader) throws IOException {
            C17522a aVar = new C17522a();
            aVar.f44448a = false;
            aVar.f44449b = "";
            aVar.f44450c = "";
            aVar.f44451d = "";
            aVar.f44452e = false;
            aVar.f44454g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44448a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44449b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44450c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44451d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44452e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44453f = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44454g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatLinkInfoResponse getChatLinkInfoResponse) throws IOException {
            if (getChatLinkInfoResponse.already_in_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getChatLinkInfoResponse.already_in_chat);
            }
            if (getChatLinkInfoResponse.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getChatLinkInfoResponse.chat_id);
            }
            if (getChatLinkInfoResponse.owner_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getChatLinkInfoResponse.owner_chatter_id);
            }
            if (getChatLinkInfoResponse.inviter_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getChatLinkInfoResponse.inviter_chatter_id);
            }
            if (getChatLinkInfoResponse.is_inviter_can_invite_member != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getChatLinkInfoResponse.is_inviter_can_invite_member);
            }
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 6, getChatLinkInfoResponse.entity);
            if (getChatLinkInfoResponse.expire_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getChatLinkInfoResponse.expire_time);
            }
            protoWriter.writeBytes(getChatLinkInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLinkInfoResponse$a */
    public static final class C17522a extends Message.Builder<GetChatLinkInfoResponse, C17522a> {

        /* renamed from: a */
        public Boolean f44448a;

        /* renamed from: b */
        public String f44449b;

        /* renamed from: c */
        public String f44450c;

        /* renamed from: d */
        public String f44451d;

        /* renamed from: e */
        public Boolean f44452e;

        /* renamed from: f */
        public C14928Entity f44453f;

        /* renamed from: g */
        public String f44454g;

        /* renamed from: a */
        public GetChatLinkInfoResponse build() {
            C14928Entity entity = this.f44453f;
            if (entity != null) {
                return new GetChatLinkInfoResponse(this.f44448a, this.f44449b, this.f44450c, this.f44451d, this.f44452e, entity, this.f44454g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17522a newBuilder() {
        C17522a aVar = new C17522a();
        aVar.f44448a = this.already_in_chat;
        aVar.f44449b = this.chat_id;
        aVar.f44450c = this.owner_chatter_id;
        aVar.f44451d = this.inviter_chatter_id;
        aVar.f44452e = this.is_inviter_can_invite_member;
        aVar.f44453f = this.entity;
        aVar.f44454g = this.expire_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatLinkInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.already_in_chat != null) {
            sb.append(", already_in_chat=");
            sb.append(this.already_in_chat);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.owner_chatter_id != null) {
            sb.append(", owner_chatter_id=");
            sb.append(this.owner_chatter_id);
        }
        if (this.inviter_chatter_id != null) {
            sb.append(", inviter_chatter_id=");
            sb.append(this.inviter_chatter_id);
        }
        if (this.is_inviter_can_invite_member != null) {
            sb.append(", is_inviter_can_invite_member=");
            sb.append(this.is_inviter_can_invite_member);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatLinkInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatLinkInfoResponse(Boolean bool, String str, String str2, String str3, Boolean bool2, C14928Entity entity2, String str4) {
        this(bool, str, str2, str3, bool2, entity2, str4, ByteString.EMPTY);
    }

    public GetChatLinkInfoResponse(Boolean bool, String str, String str2, String str3, Boolean bool2, C14928Entity entity2, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.already_in_chat = bool;
        this.chat_id = str;
        this.owner_chatter_id = str2;
        this.inviter_chatter_id = str3;
        this.is_inviter_can_invite_member = bool2;
        this.entity = entity2;
        this.expire_time = str4;
    }
}
