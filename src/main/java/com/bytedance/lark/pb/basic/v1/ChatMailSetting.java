package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatMailSetting extends Message<ChatMailSetting, C14787a> {
    public static final ProtoAdapter<ChatMailSetting> ADAPTER = new C14788b();
    public static final Boolean DEFAULT_ALLOW_MAIL_SEND = true;
    public static final SendPermission DEFAULT_SEND_PERMISSION = SendPermission.GROUP_MEMBERS;
    private static final long serialVersionUID = 0;
    public final Boolean allow_mail_send;
    public final SendPermission send_permission;

    public enum SendPermission implements WireEnum {
        UNKNOWN(0),
        GROUP_ADMIN(1),
        GROUP_MEMBERS(2),
        ORGANIZATION_MEMBERS(3),
        ALL(4);
        
        public static final ProtoAdapter<SendPermission> ADAPTER = ProtoAdapter.newEnumAdapter(SendPermission.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SendPermission fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return GROUP_ADMIN;
            }
            if (i == 2) {
                return GROUP_MEMBERS;
            }
            if (i == 3) {
                return ORGANIZATION_MEMBERS;
            }
            if (i != 4) {
                return null;
            }
            return ALL;
        }

        private SendPermission(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatMailSetting$b */
    private static final class C14788b extends ProtoAdapter<ChatMailSetting> {
        C14788b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatMailSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatMailSetting chatMailSetting) {
            int i;
            int i2 = 0;
            if (chatMailSetting.send_permission != null) {
                i = SendPermission.ADAPTER.encodedSizeWithTag(1, chatMailSetting.send_permission);
            } else {
                i = 0;
            }
            if (chatMailSetting.allow_mail_send != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, chatMailSetting.allow_mail_send);
            }
            return i + i2 + chatMailSetting.unknownFields().size();
        }

        /* renamed from: a */
        public ChatMailSetting decode(ProtoReader protoReader) throws IOException {
            C14787a aVar = new C14787a();
            aVar.f39079a = SendPermission.GROUP_MEMBERS;
            aVar.f39080b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f39079a = SendPermission.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39080b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatMailSetting chatMailSetting) throws IOException {
            if (chatMailSetting.send_permission != null) {
                SendPermission.ADAPTER.encodeWithTag(protoWriter, 1, chatMailSetting.send_permission);
            }
            if (chatMailSetting.allow_mail_send != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, chatMailSetting.allow_mail_send);
            }
            protoWriter.writeBytes(chatMailSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatMailSetting$a */
    public static final class C14787a extends Message.Builder<ChatMailSetting, C14787a> {

        /* renamed from: a */
        public SendPermission f39079a;

        /* renamed from: b */
        public Boolean f39080b;

        /* renamed from: a */
        public ChatMailSetting build() {
            return new ChatMailSetting(this.f39079a, this.f39080b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14787a newBuilder() {
        C14787a aVar = new C14787a();
        aVar.f39079a = this.send_permission;
        aVar.f39080b = this.allow_mail_send;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ChatMailSetting");
        StringBuilder sb = new StringBuilder();
        if (this.send_permission != null) {
            sb.append(", send_permission=");
            sb.append(this.send_permission);
        }
        if (this.allow_mail_send != null) {
            sb.append(", allow_mail_send=");
            sb.append(this.allow_mail_send);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatMailSetting{");
        replace.append('}');
        return replace.toString();
    }

    public ChatMailSetting(SendPermission sendPermission, Boolean bool) {
        this(sendPermission, bool, ByteString.EMPTY);
    }

    public ChatMailSetting(SendPermission sendPermission, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_permission = sendPermission;
        this.allow_mail_send = bool;
    }
}
