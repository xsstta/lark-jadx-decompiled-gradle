package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class EmailMember extends Message<EmailMember, C14924a> {
    public static final ProtoAdapter<EmailMember> ADAPTER = new C14925b();
    public static final Long DEFAULT_JOIN_TIME = 0L;
    public static final Type DEFAULT_TYPE = Type.CHATTER;
    private static final long serialVersionUID = 0;
    public final String id;
    public final String inviter_id;
    public final Long join_time;
    public final Type type;

    public enum Type implements WireEnum {
        CHATTER(1),
        CHAT(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return CHATTER;
            }
            if (i != 2) {
                return null;
            }
            return CHAT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.EmailMember$b */
    private static final class C14925b extends ProtoAdapter<EmailMember> {
        C14925b() {
            super(FieldEncoding.LENGTH_DELIMITED, EmailMember.class);
        }

        /* renamed from: a */
        public int encodedSize(EmailMember emailMember) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, emailMember.id) + Type.ADAPTER.encodedSizeWithTag(2, emailMember.type);
            int i2 = 0;
            if (emailMember.inviter_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, emailMember.inviter_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (emailMember.join_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, emailMember.join_time);
            }
            return i3 + i2 + emailMember.unknownFields().size();
        }

        /* renamed from: a */
        public EmailMember decode(ProtoReader protoReader) throws IOException {
            C14924a aVar = new C14924a();
            aVar.f39478a = "";
            aVar.f39479b = Type.CHATTER;
            aVar.f39480c = "";
            aVar.f39481d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39478a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f39479b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f39480c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39481d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EmailMember emailMember) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, emailMember.id);
            Type.ADAPTER.encodeWithTag(protoWriter, 2, emailMember.type);
            if (emailMember.inviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, emailMember.inviter_id);
            }
            if (emailMember.join_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, emailMember.join_time);
            }
            protoWriter.writeBytes(emailMember.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14924a newBuilder() {
        C14924a aVar = new C14924a();
        aVar.f39478a = this.id;
        aVar.f39479b = this.type;
        aVar.f39480c = this.inviter_id;
        aVar.f39481d = this.join_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.EmailMember$a */
    public static final class C14924a extends Message.Builder<EmailMember, C14924a> {

        /* renamed from: a */
        public String f39478a;

        /* renamed from: b */
        public Type f39479b;

        /* renamed from: c */
        public String f39480c;

        /* renamed from: d */
        public Long f39481d;

        /* renamed from: a */
        public EmailMember build() {
            Type type;
            String str = this.f39478a;
            if (str != null && (type = this.f39479b) != null) {
                return new EmailMember(str, type, this.f39480c, this.f39481d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f39479b, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "EmailMember");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        if (this.inviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.inviter_id);
        }
        if (this.join_time != null) {
            sb.append(", join_time=");
            sb.append(this.join_time);
        }
        StringBuilder replace = sb.replace(0, 2, "EmailMember{");
        replace.append('}');
        return replace.toString();
    }

    public EmailMember(String str, Type type2, String str2, Long l) {
        this(str, type2, str2, l, ByteString.EMPTY);
    }

    public EmailMember(String str, Type type2, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.inviter_id = str2;
        this.join_time = l;
    }
}
