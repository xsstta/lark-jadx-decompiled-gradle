package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetupUserMsgAuthRequest extends Message<SetupUserMsgAuthRequest, C16564a> {
    public static final ProtoAdapter<SetupUserMsgAuthRequest> ADAPTER = new C16565b();
    public static final MsgType DEFAULT_MSG_TYPE = MsgType.MSG_TYPE_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final MsgType msg_type;

    /* renamed from: com.bytedance.lark.pb.contact.v2.SetupUserMsgAuthRequest$b */
    private static final class C16565b extends ProtoAdapter<SetupUserMsgAuthRequest> {
        C16565b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetupUserMsgAuthRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetupUserMsgAuthRequest setupUserMsgAuthRequest) {
            return MsgType.ADAPTER.encodedSizeWithTag(1, setupUserMsgAuthRequest.msg_type) + setupUserMsgAuthRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetupUserMsgAuthRequest decode(ProtoReader protoReader) throws IOException {
            C16564a aVar = new C16564a();
            aVar.f42931a = MsgType.MSG_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42931a = MsgType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetupUserMsgAuthRequest setupUserMsgAuthRequest) throws IOException {
            MsgType.ADAPTER.encodeWithTag(protoWriter, 1, setupUserMsgAuthRequest.msg_type);
            protoWriter.writeBytes(setupUserMsgAuthRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.SetupUserMsgAuthRequest$a */
    public static final class C16564a extends Message.Builder<SetupUserMsgAuthRequest, C16564a> {

        /* renamed from: a */
        public MsgType f42931a;

        /* renamed from: a */
        public SetupUserMsgAuthRequest build() {
            MsgType msgType = this.f42931a;
            if (msgType != null) {
                return new SetupUserMsgAuthRequest(msgType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(msgType, "msg_type");
        }

        /* renamed from: a */
        public C16564a mo58955a(MsgType msgType) {
            this.f42931a = msgType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16564a newBuilder() {
        C16564a aVar = new C16564a();
        aVar.f42931a = this.msg_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetupUserMsgAuthRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", msg_type=");
        sb.append(this.msg_type);
        StringBuilder replace = sb.replace(0, 2, "SetupUserMsgAuthRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetupUserMsgAuthRequest(MsgType msgType) {
        this(msgType, ByteString.EMPTY);
    }

    public SetupUserMsgAuthRequest(MsgType msgType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg_type = msgType;
    }
}
