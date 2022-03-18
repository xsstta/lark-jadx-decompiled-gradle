package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailLastVersionNewUserFlagRequest extends Message<MailLastVersionNewUserFlagRequest, C16820a> {
    public static final ProtoAdapter<MailLastVersionNewUserFlagRequest> ADAPTER = new C16821b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailLastVersionNewUserFlagRequest$b */
    private static final class C16821b extends ProtoAdapter<MailLastVersionNewUserFlagRequest> {
        C16821b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailLastVersionNewUserFlagRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailLastVersionNewUserFlagRequest mailLastVersionNewUserFlagRequest) {
            return mailLastVersionNewUserFlagRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailLastVersionNewUserFlagRequest decode(ProtoReader protoReader) throws IOException {
            C16820a aVar = new C16820a();
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
        public void encode(ProtoWriter protoWriter, MailLastVersionNewUserFlagRequest mailLastVersionNewUserFlagRequest) throws IOException {
            protoWriter.writeBytes(mailLastVersionNewUserFlagRequest.unknownFields());
        }
    }

    public MailLastVersionNewUserFlagRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailLastVersionNewUserFlagRequest$a */
    public static final class C16820a extends Message.Builder<MailLastVersionNewUserFlagRequest, C16820a> {
        /* renamed from: a */
        public MailLastVersionNewUserFlagRequest build() {
            return new MailLastVersionNewUserFlagRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16820a newBuilder() {
        C16820a aVar = new C16820a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailLastVersionNewUserFlagRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailLastVersionNewUserFlagRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailLastVersionNewUserFlagRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
