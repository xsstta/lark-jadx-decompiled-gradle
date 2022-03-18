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

public final class SetBusinessInvitationRequest extends Message<SetBusinessInvitationRequest, C16386a> {
    public static final ProtoAdapter<SetBusinessInvitationRequest> ADAPTER = new C16387b();
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

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetBusinessInvitationRequest$b */
    private static final class C16387b extends ProtoAdapter<SetBusinessInvitationRequest> {
        C16387b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetBusinessInvitationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetBusinessInvitationRequest setBusinessInvitationRequest) {
            return Type.ADAPTER.encodedSizeWithTag(1, setBusinessInvitationRequest.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, setBusinessInvitationRequest.contact_content) + setBusinessInvitationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetBusinessInvitationRequest decode(ProtoReader protoReader) throws IOException {
            C16386a aVar = new C16386a();
            aVar.f42650a = Type.UNKNOWN;
            aVar.f42651b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42650a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42651b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetBusinessInvitationRequest setBusinessInvitationRequest) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, setBusinessInvitationRequest.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setBusinessInvitationRequest.contact_content);
            protoWriter.writeBytes(setBusinessInvitationRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16386a newBuilder() {
        C16386a aVar = new C16386a();
        aVar.f42650a = this.type;
        aVar.f42651b = this.contact_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetBusinessInvitationRequest$a */
    public static final class C16386a extends Message.Builder<SetBusinessInvitationRequest, C16386a> {

        /* renamed from: a */
        public Type f42650a;

        /* renamed from: b */
        public String f42651b;

        /* renamed from: a */
        public SetBusinessInvitationRequest build() {
            String str;
            Type type = this.f42650a;
            if (type != null && (str = this.f42651b) != null) {
                return new SetBusinessInvitationRequest(type, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f42651b, "contact_content");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetBusinessInvitationRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", contact_content=");
        sb.append(this.contact_content);
        StringBuilder replace = sb.replace(0, 2, "SetBusinessInvitationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetBusinessInvitationRequest(Type type2, String str) {
        this(type2, str, ByteString.EMPTY);
    }

    public SetBusinessInvitationRequest(Type type2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.contact_content = str;
    }
}
