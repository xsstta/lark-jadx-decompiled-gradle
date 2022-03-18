package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetMigrationDetailsRequest extends Message<MailGetMigrationDetailsRequest, C16746a> {
    public static final ProtoAdapter<MailGetMigrationDetailsRequest> ADAPTER = new C16747b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMigrationDetailsRequest$b */
    private static final class C16747b extends ProtoAdapter<MailGetMigrationDetailsRequest> {
        C16747b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMigrationDetailsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMigrationDetailsRequest mailGetMigrationDetailsRequest) {
            return mailGetMigrationDetailsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMigrationDetailsRequest decode(ProtoReader protoReader) throws IOException {
            C16746a aVar = new C16746a();
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
        public void encode(ProtoWriter protoWriter, MailGetMigrationDetailsRequest mailGetMigrationDetailsRequest) throws IOException {
            protoWriter.writeBytes(mailGetMigrationDetailsRequest.unknownFields());
        }
    }

    public MailGetMigrationDetailsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMigrationDetailsRequest$a */
    public static final class C16746a extends Message.Builder<MailGetMigrationDetailsRequest, C16746a> {
        /* renamed from: a */
        public MailGetMigrationDetailsRequest build() {
            return new MailGetMigrationDetailsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16746a newBuilder() {
        C16746a aVar = new C16746a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMigrationDetailsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailGetMigrationDetailsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMigrationDetailsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
