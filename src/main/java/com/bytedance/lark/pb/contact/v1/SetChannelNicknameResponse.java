package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetChannelNicknameResponse extends Message<SetChannelNicknameResponse, C16392a> {
    public static final ProtoAdapter<SetChannelNicknameResponse> ADAPTER = new C16393b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetChannelNicknameResponse$b */
    private static final class C16393b extends ProtoAdapter<SetChannelNicknameResponse> {
        C16393b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetChannelNicknameResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetChannelNicknameResponse setChannelNicknameResponse) {
            return setChannelNicknameResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetChannelNicknameResponse decode(ProtoReader protoReader) throws IOException {
            C16392a aVar = new C16392a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetChannelNicknameResponse setChannelNicknameResponse) throws IOException {
            protoWriter.writeBytes(setChannelNicknameResponse.unknownFields());
        }
    }

    public SetChannelNicknameResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetChannelNicknameResponse$a */
    public static final class C16392a extends Message.Builder<SetChannelNicknameResponse, C16392a> {
        /* renamed from: a */
        public SetChannelNicknameResponse build() {
            return new SetChannelNicknameResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16392a newBuilder() {
        C16392a aVar = new C16392a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetChannelNicknameResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetChannelNicknameResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetChannelNicknameResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
