package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SendChatterViaLinkRequest extends Message<SendChatterViaLinkRequest, C18013a> {
    public static final ProtoAdapter<SendChatterViaLinkRequest> ADAPTER = new C18014b();
    private static final long serialVersionUID = 0;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendChatterViaLinkRequest$b */
    private static final class C18014b extends ProtoAdapter<SendChatterViaLinkRequest> {
        C18014b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendChatterViaLinkRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendChatterViaLinkRequest sendChatterViaLinkRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendChatterViaLinkRequest.token) + sendChatterViaLinkRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendChatterViaLinkRequest decode(ProtoReader protoReader) throws IOException {
            C18013a aVar = new C18013a();
            aVar.f45119a = "";
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
                    aVar.f45119a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendChatterViaLinkRequest sendChatterViaLinkRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendChatterViaLinkRequest.token);
            protoWriter.writeBytes(sendChatterViaLinkRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendChatterViaLinkRequest$a */
    public static final class C18013a extends Message.Builder<SendChatterViaLinkRequest, C18013a> {

        /* renamed from: a */
        public String f45119a;

        /* renamed from: a */
        public SendChatterViaLinkRequest build() {
            String str = this.f45119a;
            if (str != null) {
                return new SendChatterViaLinkRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "token");
        }

        /* renamed from: a */
        public C18013a mo62567a(String str) {
            this.f45119a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18013a newBuilder() {
        C18013a aVar = new C18013a();
        aVar.f45119a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendChatterViaLinkRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.token);
        StringBuilder replace = sb.replace(0, 2, "SendChatterViaLinkRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendChatterViaLinkRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SendChatterViaLinkRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
    }
}
