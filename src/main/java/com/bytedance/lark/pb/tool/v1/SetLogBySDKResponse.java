package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetLogBySDKResponse extends Message<SetLogBySDKResponse, C19757a> {
    public static final ProtoAdapter<SetLogBySDKResponse> ADAPTER = new C19758b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetLogBySDKResponse$b */
    private static final class C19758b extends ProtoAdapter<SetLogBySDKResponse> {
        C19758b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetLogBySDKResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetLogBySDKResponse setLogBySDKResponse) {
            return setLogBySDKResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetLogBySDKResponse decode(ProtoReader protoReader) throws IOException {
            C19757a aVar = new C19757a();
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
        public void encode(ProtoWriter protoWriter, SetLogBySDKResponse setLogBySDKResponse) throws IOException {
            protoWriter.writeBytes(setLogBySDKResponse.unknownFields());
        }
    }

    public SetLogBySDKResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetLogBySDKResponse$a */
    public static final class C19757a extends Message.Builder<SetLogBySDKResponse, C19757a> {
        /* renamed from: a */
        public SetLogBySDKResponse build() {
            return new SetLogBySDKResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19757a newBuilder() {
        C19757a aVar = new C19757a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "SetLogBySDKResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetLogBySDKResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetLogBySDKResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
