package com.bytedance.lark.pb.contact.v1;

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

public final class SendUserInvitationRequest extends Message<SendUserInvitationRequest, C16376a> {
    public static final ProtoAdapter<SendUserInvitationRequest> ADAPTER = new C16377b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String contact_content;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        MOBILE(1),
        EMAIL(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MOBILE;
            }
            if (i != 2) {
                return null;
            }
            return EMAIL;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendUserInvitationRequest$b */
    private static final class C16377b extends ProtoAdapter<SendUserInvitationRequest> {
        C16377b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendUserInvitationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendUserInvitationRequest sendUserInvitationRequest) {
            return Type.ADAPTER.encodedSizeWithTag(1, sendUserInvitationRequest.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, sendUserInvitationRequest.contact_content) + sendUserInvitationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendUserInvitationRequest decode(ProtoReader protoReader) throws IOException {
            C16376a aVar = new C16376a();
            aVar.f42633a = Type.UNKNOWN;
            aVar.f42634b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42633a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42634b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendUserInvitationRequest sendUserInvitationRequest) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, sendUserInvitationRequest.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendUserInvitationRequest.contact_content);
            protoWriter.writeBytes(sendUserInvitationRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16376a newBuilder() {
        C16376a aVar = new C16376a();
        aVar.f42633a = this.type;
        aVar.f42634b = this.contact_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendUserInvitationRequest$a */
    public static final class C16376a extends Message.Builder<SendUserInvitationRequest, C16376a> {

        /* renamed from: a */
        public Type f42633a;

        /* renamed from: b */
        public String f42634b;

        /* renamed from: a */
        public SendUserInvitationRequest build() {
            String str;
            Type type = this.f42633a;
            if (type != null && (str = this.f42634b) != null) {
                return new SendUserInvitationRequest(type, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f42634b, "contact_content");
        }

        /* renamed from: a */
        public C16376a mo58491a(Type type) {
            this.f42633a = type;
            return this;
        }

        /* renamed from: a */
        public C16376a mo58492a(String str) {
            this.f42634b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SendUserInvitationRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", contact_content=");
        sb.append(this.contact_content);
        StringBuilder replace = sb.replace(0, 2, "SendUserInvitationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendUserInvitationRequest(Type type2, String str) {
        this(type2, str, ByteString.EMPTY);
    }

    public SendUserInvitationRequest(Type type2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.contact_content = str;
    }
}
