package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetTabAndSettingStatusRequest extends Message<MailGetTabAndSettingStatusRequest, C16788a> {
    public static final ProtoAdapter<MailGetTabAndSettingStatusRequest> ADAPTER = new C16789b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTabAndSettingStatusRequest$b */
    private static final class C16789b extends ProtoAdapter<MailGetTabAndSettingStatusRequest> {
        C16789b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetTabAndSettingStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetTabAndSettingStatusRequest mailGetTabAndSettingStatusRequest) {
            return mailGetTabAndSettingStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetTabAndSettingStatusRequest decode(ProtoReader protoReader) throws IOException {
            C16788a aVar = new C16788a();
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
        public void encode(ProtoWriter protoWriter, MailGetTabAndSettingStatusRequest mailGetTabAndSettingStatusRequest) throws IOException {
            protoWriter.writeBytes(mailGetTabAndSettingStatusRequest.unknownFields());
        }
    }

    public MailGetTabAndSettingStatusRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTabAndSettingStatusRequest$a */
    public static final class C16788a extends Message.Builder<MailGetTabAndSettingStatusRequest, C16788a> {
        /* renamed from: a */
        public MailGetTabAndSettingStatusRequest build() {
            return new MailGetTabAndSettingStatusRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16788a newBuilder() {
        C16788a aVar = new C16788a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetTabAndSettingStatusRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailGetTabAndSettingStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetTabAndSettingStatusRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
