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

public final class GetChatQRCodeInfoResponse extends Message<GetChatQRCodeInfoResponse, C17544a> {
    public static final ProtoAdapter<GetChatQRCodeInfoResponse> ADAPTER = new C17545b();
    public static final Boolean DEFAULT_ALREADY_IN_CHAT = false;
    public static final Boolean DEFAULT_IS_INVITER_CAN_ADD_MEMBER = false;
    private static final long serialVersionUID = 0;
    public final Boolean already_in_chat;
    public final String chat_id;
    public final C14928Entity entity;
    public final String inviter_id;
    public final String inviter_url;
    public final Boolean is_inviter_can_add_member;
    public final String show_msg;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatQRCodeInfoResponse$b */
    private static final class C17545b extends ProtoAdapter<GetChatQRCodeInfoResponse> {
        C17545b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatQRCodeInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatQRCodeInfoResponse getChatQRCodeInfoResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (getChatQRCodeInfoResponse.already_in_chat != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getChatQRCodeInfoResponse.already_in_chat);
            } else {
                i = 0;
            }
            if (getChatQRCodeInfoResponse.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getChatQRCodeInfoResponse.chat_id);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (getChatQRCodeInfoResponse.entity != null) {
                i3 = C14928Entity.ADAPTER.encodedSizeWithTag(3, getChatQRCodeInfoResponse.entity);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (getChatQRCodeInfoResponse.inviter_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getChatQRCodeInfoResponse.inviter_id);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (getChatQRCodeInfoResponse.is_inviter_can_add_member != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getChatQRCodeInfoResponse.is_inviter_can_add_member);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (getChatQRCodeInfoResponse.show_msg != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, getChatQRCodeInfoResponse.show_msg);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (getChatQRCodeInfoResponse.inviter_url != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, getChatQRCodeInfoResponse.inviter_url);
            }
            return i12 + i7 + getChatQRCodeInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatQRCodeInfoResponse decode(ProtoReader protoReader) throws IOException {
            C17544a aVar = new C17544a();
            aVar.f44498a = false;
            aVar.f44499b = "";
            aVar.f44501d = "";
            aVar.f44502e = false;
            aVar.f44503f = "";
            aVar.f44504g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44498a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44499b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44500c = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44501d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44502e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44503f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44504g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetChatQRCodeInfoResponse getChatQRCodeInfoResponse) throws IOException {
            if (getChatQRCodeInfoResponse.already_in_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getChatQRCodeInfoResponse.already_in_chat);
            }
            if (getChatQRCodeInfoResponse.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getChatQRCodeInfoResponse.chat_id);
            }
            if (getChatQRCodeInfoResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, getChatQRCodeInfoResponse.entity);
            }
            if (getChatQRCodeInfoResponse.inviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getChatQRCodeInfoResponse.inviter_id);
            }
            if (getChatQRCodeInfoResponse.is_inviter_can_add_member != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getChatQRCodeInfoResponse.is_inviter_can_add_member);
            }
            if (getChatQRCodeInfoResponse.show_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getChatQRCodeInfoResponse.show_msg);
            }
            if (getChatQRCodeInfoResponse.inviter_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getChatQRCodeInfoResponse.inviter_url);
            }
            protoWriter.writeBytes(getChatQRCodeInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatQRCodeInfoResponse$a */
    public static final class C17544a extends Message.Builder<GetChatQRCodeInfoResponse, C17544a> {

        /* renamed from: a */
        public Boolean f44498a;

        /* renamed from: b */
        public String f44499b;

        /* renamed from: c */
        public C14928Entity f44500c;

        /* renamed from: d */
        public String f44501d;

        /* renamed from: e */
        public Boolean f44502e;

        /* renamed from: f */
        public String f44503f;

        /* renamed from: g */
        public String f44504g;

        /* renamed from: a */
        public GetChatQRCodeInfoResponse build() {
            return new GetChatQRCodeInfoResponse(this.f44498a, this.f44499b, this.f44500c, this.f44501d, this.f44502e, this.f44503f, this.f44504g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17544a newBuilder() {
        C17544a aVar = new C17544a();
        aVar.f44498a = this.already_in_chat;
        aVar.f44499b = this.chat_id;
        aVar.f44500c = this.entity;
        aVar.f44501d = this.inviter_id;
        aVar.f44502e = this.is_inviter_can_add_member;
        aVar.f44503f = this.show_msg;
        aVar.f44504g = this.inviter_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatQRCodeInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.already_in_chat != null) {
            sb.append(", already_in_chat=");
            sb.append(this.already_in_chat);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.inviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.inviter_id);
        }
        if (this.is_inviter_can_add_member != null) {
            sb.append(", is_inviter_can_add_member=");
            sb.append(this.is_inviter_can_add_member);
        }
        if (this.show_msg != null) {
            sb.append(", show_msg=");
            sb.append(this.show_msg);
        }
        if (this.inviter_url != null) {
            sb.append(", inviter_url=");
            sb.append(this.inviter_url);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatQRCodeInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatQRCodeInfoResponse(Boolean bool, String str, C14928Entity entity2, String str2, Boolean bool2, String str3, String str4) {
        this(bool, str, entity2, str2, bool2, str3, str4, ByteString.EMPTY);
    }

    public GetChatQRCodeInfoResponse(Boolean bool, String str, C14928Entity entity2, String str2, Boolean bool2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.already_in_chat = bool;
        this.chat_id = str;
        this.entity = entity2;
        this.inviter_id = str2;
        this.is_inviter_can_add_member = bool2;
        this.show_msg = str3;
        this.inviter_url = str4;
    }
}
