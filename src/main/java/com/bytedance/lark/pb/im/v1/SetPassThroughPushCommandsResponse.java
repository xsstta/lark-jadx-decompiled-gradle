package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetPassThroughPushCommandsResponse extends Message<SetPassThroughPushCommandsResponse, C18043a> {
    public static final ProtoAdapter<SetPassThroughPushCommandsResponse> ADAPTER = new C18044b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.SetPassThroughPushCommandsResponse$b */
    private static final class C18044b extends ProtoAdapter<SetPassThroughPushCommandsResponse> {
        C18044b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetPassThroughPushCommandsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetPassThroughPushCommandsResponse setPassThroughPushCommandsResponse) {
            return setPassThroughPushCommandsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetPassThroughPushCommandsResponse decode(ProtoReader protoReader) throws IOException {
            C18043a aVar = new C18043a();
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
        public void encode(ProtoWriter protoWriter, SetPassThroughPushCommandsResponse setPassThroughPushCommandsResponse) throws IOException {
            protoWriter.writeBytes(setPassThroughPushCommandsResponse.unknownFields());
        }
    }

    public SetPassThroughPushCommandsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SetPassThroughPushCommandsResponse$a */
    public static final class C18043a extends Message.Builder<SetPassThroughPushCommandsResponse, C18043a> {
        /* renamed from: a */
        public SetPassThroughPushCommandsResponse build() {
            return new SetPassThroughPushCommandsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18043a newBuilder() {
        C18043a aVar = new C18043a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SetPassThroughPushCommandsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetPassThroughPushCommandsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetPassThroughPushCommandsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
