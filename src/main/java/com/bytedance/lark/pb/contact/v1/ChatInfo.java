package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ChatInfo extends Message<ChatInfo, C16134a> {
    public static final ProtoAdapter<ChatInfo> ADAPTER = new C16135b();
    public static final Boolean DEFAULT_IS_MEMBER = false;
    public static final UserPermission DEFAULT_USER_PERM = UserPermission.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Chat chat;
    public final Boolean is_member;
    public final UserPermission user_perm;

    public enum UserPermission implements WireEnum {
        UNKNOWN(0),
        VISIBLE_AND_CREATE(1),
        VISIBLE_NOT_CREATE(2),
        INVISIBLE(3);
        
        public static final ProtoAdapter<UserPermission> ADAPTER = ProtoAdapter.newEnumAdapter(UserPermission.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UserPermission fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return VISIBLE_AND_CREATE;
            }
            if (i == 2) {
                return VISIBLE_NOT_CREATE;
            }
            if (i != 3) {
                return null;
            }
            return INVISIBLE;
        }

        private UserPermission(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ChatInfo$b */
    private static final class C16135b extends ProtoAdapter<ChatInfo> {
        C16135b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatInfo chatInfo) {
            int i;
            int encodedSizeWithTag = UserPermission.ADAPTER.encodedSizeWithTag(1, chatInfo.user_perm);
            int i2 = 0;
            if (chatInfo.chat != null) {
                i = Chat.ADAPTER.encodedSizeWithTag(2, chatInfo.chat);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (chatInfo.is_member != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, chatInfo.is_member);
            }
            return i3 + i2 + chatInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ChatInfo decode(ProtoReader protoReader) throws IOException {
            C16134a aVar = new C16134a();
            aVar.f42247a = UserPermission.UNKNOWN;
            aVar.f42249c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42247a = UserPermission.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f42248b = Chat.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42249c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatInfo chatInfo) throws IOException {
            UserPermission.ADAPTER.encodeWithTag(protoWriter, 1, chatInfo.user_perm);
            if (chatInfo.chat != null) {
                Chat.ADAPTER.encodeWithTag(protoWriter, 2, chatInfo.chat);
            }
            if (chatInfo.is_member != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, chatInfo.is_member);
            }
            protoWriter.writeBytes(chatInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16134a newBuilder() {
        C16134a aVar = new C16134a();
        aVar.f42247a = this.user_perm;
        aVar.f42248b = this.chat;
        aVar.f42249c = this.is_member;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ChatInfo$a */
    public static final class C16134a extends Message.Builder<ChatInfo, C16134a> {

        /* renamed from: a */
        public UserPermission f42247a;

        /* renamed from: b */
        public Chat f42248b;

        /* renamed from: c */
        public Boolean f42249c;

        /* renamed from: a */
        public ChatInfo build() {
            UserPermission userPermission = this.f42247a;
            if (userPermission != null) {
                return new ChatInfo(userPermission, this.f42248b, this.f42249c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userPermission, "user_perm");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ChatInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_perm=");
        sb.append(this.user_perm);
        if (this.chat != null) {
            sb.append(", chat=");
            sb.append(this.chat);
        }
        if (this.is_member != null) {
            sb.append(", is_member=");
            sb.append(this.is_member);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ChatInfo(UserPermission userPermission, Chat chat2, Boolean bool) {
        this(userPermission, chat2, bool, ByteString.EMPTY);
    }

    public ChatInfo(UserPermission userPermission, Chat chat2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_perm = userPermission;
        this.chat = chat2;
        this.is_member = bool;
    }
}
