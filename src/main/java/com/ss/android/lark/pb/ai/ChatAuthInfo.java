package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatAuthInfo extends Message<ChatAuthInfo, C49435a> {
    public static final ProtoAdapter<ChatAuthInfo> ADAPTER = new C49436b();
    public static final Boolean DEFAULT_IS_IN_CHAT = false;
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final ChatType mchat_type;
    public final Boolean mis_in_chat;
    public final String muser_id;

    public enum ChatType implements WireEnum {
        PUBLIC(0),
        PRIVATE(1);
        
        public static final ProtoAdapter<ChatType> ADAPTER = ProtoAdapter.newEnumAdapter(ChatType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChatType fromValue(int i) {
            if (i == 0) {
                return PUBLIC;
            }
            if (i != 1) {
                return null;
            }
            return PRIVATE;
        }

        private ChatType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.ChatAuthInfo$b */
    private static final class C49436b extends ProtoAdapter<ChatAuthInfo> {
        C49436b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatAuthInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatAuthInfo chatAuthInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (chatAuthInfo.mchat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatAuthInfo.mchat_id);
            } else {
                i = 0;
            }
            if (chatAuthInfo.mchat_type != null) {
                i2 = ChatType.ADAPTER.encodedSizeWithTag(2, chatAuthInfo.mchat_type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (chatAuthInfo.muser_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, chatAuthInfo.muser_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (chatAuthInfo.mis_in_chat != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, chatAuthInfo.mis_in_chat);
            }
            return i6 + i4 + chatAuthInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ChatAuthInfo decode(ProtoReader protoReader) throws IOException {
            C49435a aVar = new C49435a();
            aVar.f123983a = "";
            aVar.f123985c = "";
            aVar.f123986d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123983a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f123984b = ChatType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f123985c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123986d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatAuthInfo chatAuthInfo) throws IOException {
            if (chatAuthInfo.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatAuthInfo.mchat_id);
            }
            if (chatAuthInfo.mchat_type != null) {
                ChatType.ADAPTER.encodeWithTag(protoWriter, 2, chatAuthInfo.mchat_type);
            }
            if (chatAuthInfo.muser_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chatAuthInfo.muser_id);
            }
            if (chatAuthInfo.mis_in_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, chatAuthInfo.mis_in_chat);
            }
            protoWriter.writeBytes(chatAuthInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.ChatAuthInfo$a */
    public static final class C49435a extends Message.Builder<ChatAuthInfo, C49435a> {

        /* renamed from: a */
        public String f123983a;

        /* renamed from: b */
        public ChatType f123984b;

        /* renamed from: c */
        public String f123985c;

        /* renamed from: d */
        public Boolean f123986d;

        /* renamed from: a */
        public ChatAuthInfo build() {
            return new ChatAuthInfo(this.f123983a, this.f123984b, this.f123985c, this.f123986d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49435a newBuilder() {
        C49435a aVar = new C49435a();
        aVar.f123983a = this.mchat_id;
        aVar.f123984b = this.mchat_type;
        aVar.f123985c = this.muser_id;
        aVar.f123986d = this.mis_in_chat;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mchat_type != null) {
            sb.append(", chat_type=");
            sb.append(this.mchat_type);
        }
        if (this.muser_id != null) {
            sb.append(", user_id=");
            sb.append(this.muser_id);
        }
        if (this.mis_in_chat != null) {
            sb.append(", is_in_chat=");
            sb.append(this.mis_in_chat);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatAuthInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ChatAuthInfo(String str, ChatType chatType, String str2, Boolean bool) {
        this(str, chatType, str2, bool, ByteString.EMPTY);
    }

    public ChatAuthInfo(String str, ChatType chatType, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = str;
        this.mchat_type = chatType;
        this.muser_id = str2;
        this.mis_in_chat = bool;
    }
}
