package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetAccountRequest extends Message<MailGetAccountRequest, C16704a> {
    public static final ProtoAdapter<MailGetAccountRequest> ADAPTER = new C16705b();
    public static final Boolean DEFAULT_FETCH_CURRENT_ACCOUNT = false;
    public static final Boolean DEFAULT_FETCH_DB = true;
    private static final long serialVersionUID = 0;
    public final Boolean fetch_current_account;
    public final Boolean fetch_db;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetAccountRequest$b */
    private static final class C16705b extends ProtoAdapter<MailGetAccountRequest> {
        C16705b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetAccountRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetAccountRequest mailGetAccountRequest) {
            int i;
            int i2 = 0;
            if (mailGetAccountRequest.fetch_db != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailGetAccountRequest.fetch_db);
            } else {
                i = 0;
            }
            if (mailGetAccountRequest.fetch_current_account != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailGetAccountRequest.fetch_current_account);
            }
            return i + i2 + mailGetAccountRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetAccountRequest decode(ProtoReader protoReader) throws IOException {
            C16704a aVar = new C16704a();
            aVar.f43168a = true;
            aVar.f43169b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43168a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43169b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetAccountRequest mailGetAccountRequest) throws IOException {
            if (mailGetAccountRequest.fetch_db != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailGetAccountRequest.fetch_db);
            }
            if (mailGetAccountRequest.fetch_current_account != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailGetAccountRequest.fetch_current_account);
            }
            protoWriter.writeBytes(mailGetAccountRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetAccountRequest$a */
    public static final class C16704a extends Message.Builder<MailGetAccountRequest, C16704a> {

        /* renamed from: a */
        public Boolean f43168a;

        /* renamed from: b */
        public Boolean f43169b;

        /* renamed from: a */
        public MailGetAccountRequest build() {
            return new MailGetAccountRequest(this.f43168a, this.f43169b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16704a newBuilder() {
        C16704a aVar = new C16704a();
        aVar.f43168a = this.fetch_db;
        aVar.f43169b = this.fetch_current_account;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetAccountRequest");
        StringBuilder sb = new StringBuilder();
        if (this.fetch_db != null) {
            sb.append(", fetch_db=");
            sb.append(this.fetch_db);
        }
        if (this.fetch_current_account != null) {
            sb.append(", fetch_current_account=");
            sb.append(this.fetch_current_account);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetAccountRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetAccountRequest(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public MailGetAccountRequest(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fetch_db = bool;
        this.fetch_current_account = bool2;
    }
}
