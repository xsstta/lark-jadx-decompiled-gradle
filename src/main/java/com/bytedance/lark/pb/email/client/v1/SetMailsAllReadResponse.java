package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetMailsAllReadResponse extends Message<SetMailsAllReadResponse, C16980a> {
    public static final ProtoAdapter<SetMailsAllReadResponse> ADAPTER = new C16981b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SetMailsAllReadResponse$b */
    private static final class C16981b extends ProtoAdapter<SetMailsAllReadResponse> {
        C16981b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetMailsAllReadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetMailsAllReadResponse setMailsAllReadResponse) {
            return setMailsAllReadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetMailsAllReadResponse decode(ProtoReader protoReader) throws IOException {
            C16980a aVar = new C16980a();
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
        public void encode(ProtoWriter protoWriter, SetMailsAllReadResponse setMailsAllReadResponse) throws IOException {
            protoWriter.writeBytes(setMailsAllReadResponse.unknownFields());
        }
    }

    public SetMailsAllReadResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SetMailsAllReadResponse$a */
    public static final class C16980a extends Message.Builder<SetMailsAllReadResponse, C16980a> {
        /* renamed from: a */
        public SetMailsAllReadResponse build() {
            return new SetMailsAllReadResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16980a newBuilder() {
        C16980a aVar = new C16980a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "SetMailsAllReadResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetMailsAllReadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetMailsAllReadResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
