package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetNotificationSettingsRequest extends Message<MailGetNotificationSettingsRequest, C16754a> {
    public static final ProtoAdapter<MailGetNotificationSettingsRequest> ADAPTER = new C16755b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetNotificationSettingsRequest$b */
    private static final class C16755b extends ProtoAdapter<MailGetNotificationSettingsRequest> {
        C16755b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetNotificationSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetNotificationSettingsRequest mailGetNotificationSettingsRequest) {
            return mailGetNotificationSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetNotificationSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C16754a aVar = new C16754a();
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
        public void encode(ProtoWriter protoWriter, MailGetNotificationSettingsRequest mailGetNotificationSettingsRequest) throws IOException {
            protoWriter.writeBytes(mailGetNotificationSettingsRequest.unknownFields());
        }
    }

    public MailGetNotificationSettingsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetNotificationSettingsRequest$a */
    public static final class C16754a extends Message.Builder<MailGetNotificationSettingsRequest, C16754a> {
        /* renamed from: a */
        public MailGetNotificationSettingsRequest build() {
            return new MailGetNotificationSettingsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16754a newBuilder() {
        C16754a aVar = new C16754a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetNotificationSettingsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailGetNotificationSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetNotificationSettingsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
