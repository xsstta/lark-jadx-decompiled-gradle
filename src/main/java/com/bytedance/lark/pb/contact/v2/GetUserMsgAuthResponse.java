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

public final class GetUserMsgAuthResponse extends Message<GetUserMsgAuthResponse, C16486a> {
    public static final ProtoAdapter<GetUserMsgAuthResponse> ADAPTER = new C16487b();
    public static final MsgType DEFAULT_MSG_TYPE = MsgType.MSG_TYPE_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final MsgType msg_type;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserMsgAuthResponse$b */
    private static final class C16487b extends ProtoAdapter<GetUserMsgAuthResponse> {
        C16487b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserMsgAuthResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserMsgAuthResponse getUserMsgAuthResponse) {
            return MsgType.ADAPTER.encodedSizeWithTag(1, getUserMsgAuthResponse.msg_type) + getUserMsgAuthResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserMsgAuthResponse decode(ProtoReader protoReader) throws IOException {
            C16486a aVar = new C16486a();
            aVar.f42793a = MsgType.MSG_TYPE_UNKNOWN;
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
                        aVar.f42793a = MsgType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserMsgAuthResponse getUserMsgAuthResponse) throws IOException {
            MsgType.ADAPTER.encodeWithTag(protoWriter, 1, getUserMsgAuthResponse.msg_type);
            protoWriter.writeBytes(getUserMsgAuthResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserMsgAuthResponse$a */
    public static final class C16486a extends Message.Builder<GetUserMsgAuthResponse, C16486a> {

        /* renamed from: a */
        public MsgType f42793a;

        /* renamed from: a */
        public GetUserMsgAuthResponse build() {
            MsgType msgType = this.f42793a;
            if (msgType != null) {
                return new GetUserMsgAuthResponse(msgType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(msgType, "msg_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C16486a newBuilder() {
        C16486a aVar = new C16486a();
        aVar.f42793a = this.msg_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserMsgAuthResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", msg_type=");
        sb.append(this.msg_type);
        StringBuilder replace = sb.replace(0, 2, "GetUserMsgAuthResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserMsgAuthResponse(MsgType msgType) {
        this(msgType, ByteString.EMPTY);
    }

    public GetUserMsgAuthResponse(MsgType msgType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg_type = msgType;
    }
}
