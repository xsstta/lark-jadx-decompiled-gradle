package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.MailAccount;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailAccountPushResponse extends Message<MailAccountPushResponse, C17006a> {
    public static final ProtoAdapter<MailAccountPushResponse> ADAPTER = new C17007b();
    public static final Boolean DEFAULT_RUST_PUSH = false;
    private static final long serialVersionUID = 0;
    public final MailAccount account;
    public final Boolean rust_push;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailAccountPushResponse$b */
    private static final class C17007b extends ProtoAdapter<MailAccountPushResponse> {
        C17007b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAccountPushResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAccountPushResponse mailAccountPushResponse) {
            int i;
            int i2 = 0;
            if (mailAccountPushResponse.account != null) {
                i = MailAccount.ADAPTER.encodedSizeWithTag(1, mailAccountPushResponse.account);
            } else {
                i = 0;
            }
            if (mailAccountPushResponse.rust_push != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailAccountPushResponse.rust_push);
            }
            return i + i2 + mailAccountPushResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailAccountPushResponse decode(ProtoReader protoReader) throws IOException {
            C17006a aVar = new C17006a();
            aVar.f43643b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43642a = MailAccount.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43643b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAccountPushResponse mailAccountPushResponse) throws IOException {
            if (mailAccountPushResponse.account != null) {
                MailAccount.ADAPTER.encodeWithTag(protoWriter, 1, mailAccountPushResponse.account);
            }
            if (mailAccountPushResponse.rust_push != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailAccountPushResponse.rust_push);
            }
            protoWriter.writeBytes(mailAccountPushResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailAccountPushResponse$a */
    public static final class C17006a extends Message.Builder<MailAccountPushResponse, C17006a> {

        /* renamed from: a */
        public MailAccount f43642a;

        /* renamed from: b */
        public Boolean f43643b;

        /* renamed from: a */
        public MailAccountPushResponse build() {
            return new MailAccountPushResponse(this.f43642a, this.f43643b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17006a newBuilder() {
        C17006a aVar = new C17006a();
        aVar.f43642a = this.account;
        aVar.f43643b = this.rust_push;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAccountPushResponse");
        StringBuilder sb = new StringBuilder();
        if (this.account != null) {
            sb.append(", account=");
            sb.append(this.account);
        }
        if (this.rust_push != null) {
            sb.append(", rust_push=");
            sb.append(this.rust_push);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAccountPushResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailAccountPushResponse(MailAccount mailAccount, Boolean bool) {
        this(mailAccount, bool, ByteString.EMPTY);
    }

    public MailAccountPushResponse(MailAccount mailAccount, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.account = mailAccount;
        this.rust_push = bool;
    }
}
