package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetInofflineModeResponse extends Message<SetInofflineModeResponse, C15274a> {
    public static final ProtoAdapter<SetInofflineModeResponse> ADAPTER = new C15275b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetInofflineModeResponse$b */
    private static final class C15275b extends ProtoAdapter<SetInofflineModeResponse> {
        C15275b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetInofflineModeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetInofflineModeResponse setInofflineModeResponse) {
            return setInofflineModeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetInofflineModeResponse decode(ProtoReader protoReader) throws IOException {
            C15274a aVar = new C15274a();
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
        public void encode(ProtoWriter protoWriter, SetInofflineModeResponse setInofflineModeResponse) throws IOException {
            protoWriter.writeBytes(setInofflineModeResponse.unknownFields());
        }
    }

    public SetInofflineModeResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetInofflineModeResponse$a */
    public static final class C15274a extends Message.Builder<SetInofflineModeResponse, C15274a> {
        /* renamed from: a */
        public SetInofflineModeResponse build() {
            return new SetInofflineModeResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15274a newBuilder() {
        C15274a aVar = new C15274a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetInofflineModeResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetInofflineModeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetInofflineModeResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
