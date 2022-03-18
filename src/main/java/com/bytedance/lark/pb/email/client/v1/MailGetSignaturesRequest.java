package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MailGetSignaturesRequest extends Message<MailGetSignaturesRequest, C16778a> {
    public static final ProtoAdapter<MailGetSignaturesRequest> ADAPTER = new C16779b();
    public static final Boolean DEFAULT_FROM_SETTING = false;
    private static final long serialVersionUID = 0;
    public final String account_id;
    public final Boolean from_setting;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSignaturesRequest$b */
    private static final class C16779b extends ProtoAdapter<MailGetSignaturesRequest> {
        C16779b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetSignaturesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetSignaturesRequest mailGetSignaturesRequest) {
            int i;
            if (mailGetSignaturesRequest.from_setting != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailGetSignaturesRequest.from_setting);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.encodedSizeWithTag(2, mailGetSignaturesRequest.account_id) + mailGetSignaturesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetSignaturesRequest decode(ProtoReader protoReader) throws IOException {
            C16778a aVar = new C16778a();
            aVar.f43251a = false;
            aVar.f43252b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43251a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43252b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetSignaturesRequest mailGetSignaturesRequest) throws IOException {
            if (mailGetSignaturesRequest.from_setting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailGetSignaturesRequest.from_setting);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailGetSignaturesRequest.account_id);
            protoWriter.writeBytes(mailGetSignaturesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSignaturesRequest$a */
    public static final class C16778a extends Message.Builder<MailGetSignaturesRequest, C16778a> {

        /* renamed from: a */
        public Boolean f43251a;

        /* renamed from: b */
        public String f43252b;

        /* renamed from: a */
        public MailGetSignaturesRequest build() {
            String str = this.f43252b;
            if (str != null) {
                return new MailGetSignaturesRequest(this.f43251a, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "account_id");
        }

        /* renamed from: a */
        public C16778a mo59496a(Boolean bool) {
            this.f43251a = bool;
            return this;
        }

        /* renamed from: a */
        public C16778a mo59497a(String str) {
            this.f43252b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16778a newBuilder() {
        C16778a aVar = new C16778a();
        aVar.f43251a = this.from_setting;
        aVar.f43252b = this.account_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetSignaturesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.from_setting != null) {
            sb.append(", from_setting=");
            sb.append(this.from_setting);
        }
        sb.append(", account_id=");
        sb.append(this.account_id);
        StringBuilder replace = sb.replace(0, 2, "MailGetSignaturesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetSignaturesRequest(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public MailGetSignaturesRequest(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.from_setting = bool;
        this.account_id = str;
    }
}
