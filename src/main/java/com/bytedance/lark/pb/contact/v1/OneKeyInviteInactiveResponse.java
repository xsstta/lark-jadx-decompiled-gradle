package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class OneKeyInviteInactiveResponse extends Message<OneKeyInviteInactiveResponse, C16336a> {
    public static final ProtoAdapter<OneKeyInviteInactiveResponse> ADAPTER = new C16337b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.OneKeyInviteInactiveResponse$b */
    private static final class C16337b extends ProtoAdapter<OneKeyInviteInactiveResponse> {
        C16337b() {
            super(FieldEncoding.LENGTH_DELIMITED, OneKeyInviteInactiveResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(OneKeyInviteInactiveResponse oneKeyInviteInactiveResponse) {
            return oneKeyInviteInactiveResponse.unknownFields().size();
        }

        /* renamed from: a */
        public OneKeyInviteInactiveResponse decode(ProtoReader protoReader) throws IOException {
            C16336a aVar = new C16336a();
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
        public void encode(ProtoWriter protoWriter, OneKeyInviteInactiveResponse oneKeyInviteInactiveResponse) throws IOException {
            protoWriter.writeBytes(oneKeyInviteInactiveResponse.unknownFields());
        }
    }

    public OneKeyInviteInactiveResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.OneKeyInviteInactiveResponse$a */
    public static final class C16336a extends Message.Builder<OneKeyInviteInactiveResponse, C16336a> {
        /* renamed from: a */
        public OneKeyInviteInactiveResponse build() {
            return new OneKeyInviteInactiveResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16336a newBuilder() {
        C16336a aVar = new C16336a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "OneKeyInviteInactiveResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "OneKeyInviteInactiveResponse{");
        replace.append('}');
        return replace.toString();
    }

    public OneKeyInviteInactiveResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
