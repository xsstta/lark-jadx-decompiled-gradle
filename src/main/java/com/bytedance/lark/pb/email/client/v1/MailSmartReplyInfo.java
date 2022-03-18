package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailSmartReplyInfo extends Message<MailSmartReplyInfo, C16904a> {
    public static final ProtoAdapter<MailSmartReplyInfo> ADAPTER = new C16905b();
    public static final Integer DEFAULT_ID = 0;
    public static final MailSmartReplyType DEFAULT_TYPE = MailSmartReplyType.TEXT;
    private static final long serialVersionUID = 0;
    public final Integer id;
    public final String reply_text;
    public final MailSmartReplyType type;

    public enum MailSmartReplyType implements WireEnum {
        TEXT(0),
        ATTACHMENT(1),
        GIF(2);
        
        public static final ProtoAdapter<MailSmartReplyType> ADAPTER = ProtoAdapter.newEnumAdapter(MailSmartReplyType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MailSmartReplyType fromValue(int i) {
            if (i == 0) {
                return TEXT;
            }
            if (i == 1) {
                return ATTACHMENT;
            }
            if (i != 2) {
                return null;
            }
            return GIF;
        }

        private MailSmartReplyType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSmartReplyInfo$b */
    private static final class C16905b extends ProtoAdapter<MailSmartReplyInfo> {
        C16905b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSmartReplyInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSmartReplyInfo mailSmartReplyInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (mailSmartReplyInfo.id != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, mailSmartReplyInfo.id);
            } else {
                i = 0;
            }
            if (mailSmartReplyInfo.reply_text != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailSmartReplyInfo.reply_text);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailSmartReplyInfo.type != null) {
                i3 = MailSmartReplyType.ADAPTER.encodedSizeWithTag(3, mailSmartReplyInfo.type);
            }
            return i4 + i3 + mailSmartReplyInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MailSmartReplyInfo decode(ProtoReader protoReader) throws IOException {
            C16904a aVar = new C16904a();
            aVar.f43390a = 0;
            aVar.f43391b = "";
            aVar.f43392c = MailSmartReplyType.TEXT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43390a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43391b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43392c = MailSmartReplyType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSmartReplyInfo mailSmartReplyInfo) throws IOException {
            if (mailSmartReplyInfo.id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mailSmartReplyInfo.id);
            }
            if (mailSmartReplyInfo.reply_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailSmartReplyInfo.reply_text);
            }
            if (mailSmartReplyInfo.type != null) {
                MailSmartReplyType.ADAPTER.encodeWithTag(protoWriter, 3, mailSmartReplyInfo.type);
            }
            protoWriter.writeBytes(mailSmartReplyInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSmartReplyInfo$a */
    public static final class C16904a extends Message.Builder<MailSmartReplyInfo, C16904a> {

        /* renamed from: a */
        public Integer f43390a;

        /* renamed from: b */
        public String f43391b;

        /* renamed from: c */
        public MailSmartReplyType f43392c;

        /* renamed from: a */
        public MailSmartReplyInfo build() {
            return new MailSmartReplyInfo(this.f43390a, this.f43391b, this.f43392c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16904a newBuilder() {
        C16904a aVar = new C16904a();
        aVar.f43390a = this.id;
        aVar.f43391b = this.reply_text;
        aVar.f43392c = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSmartReplyInfo");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.reply_text != null) {
            sb.append(", reply_text=");
            sb.append(this.reply_text);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSmartReplyInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MailSmartReplyInfo(Integer num, String str, MailSmartReplyType mailSmartReplyType) {
        this(num, str, mailSmartReplyType, ByteString.EMPTY);
    }

    public MailSmartReplyInfo(Integer num, String str, MailSmartReplyType mailSmartReplyType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = num;
        this.reply_text = str;
        this.type = mailSmartReplyType;
    }
}
