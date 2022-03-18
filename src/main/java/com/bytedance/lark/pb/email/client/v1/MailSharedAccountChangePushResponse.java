package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSharedAccountChangePushResponse extends Message<MailSharedAccountChangePushResponse, C16894a> {
    public static final ProtoAdapter<MailSharedAccountChangePushResponse> ADAPTER = new C16895b();
    public static final Boolean DEFAULT_FETCH_ACCOUNT_LIST = false;
    public static final Boolean DEFAULT_IS_BIND = false;
    public static final Boolean DEFAULT_IS_CURRENT = false;
    private static final long serialVersionUID = 0;
    public final MailAccount account;
    public final Boolean fetch_account_list;
    public final Boolean is_bind;
    public final Boolean is_current;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSharedAccountChangePushResponse$b */
    private static final class C16895b extends ProtoAdapter<MailSharedAccountChangePushResponse> {
        C16895b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSharedAccountChangePushResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSharedAccountChangePushResponse mailSharedAccountChangePushResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailSharedAccountChangePushResponse.account != null) {
                i = MailAccount.ADAPTER.encodedSizeWithTag(1, mailSharedAccountChangePushResponse.account);
            } else {
                i = 0;
            }
            if (mailSharedAccountChangePushResponse.is_bind != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailSharedAccountChangePushResponse.is_bind);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailSharedAccountChangePushResponse.is_current != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailSharedAccountChangePushResponse.is_current);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailSharedAccountChangePushResponse.fetch_account_list != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailSharedAccountChangePushResponse.fetch_account_list);
            }
            return i6 + i4 + mailSharedAccountChangePushResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSharedAccountChangePushResponse decode(ProtoReader protoReader) throws IOException {
            C16894a aVar = new C16894a();
            aVar.f43368b = false;
            aVar.f43369c = false;
            aVar.f43370d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43367a = MailAccount.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43368b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43369c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43370d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSharedAccountChangePushResponse mailSharedAccountChangePushResponse) throws IOException {
            if (mailSharedAccountChangePushResponse.account != null) {
                MailAccount.ADAPTER.encodeWithTag(protoWriter, 1, mailSharedAccountChangePushResponse.account);
            }
            if (mailSharedAccountChangePushResponse.is_bind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailSharedAccountChangePushResponse.is_bind);
            }
            if (mailSharedAccountChangePushResponse.is_current != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailSharedAccountChangePushResponse.is_current);
            }
            if (mailSharedAccountChangePushResponse.fetch_account_list != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailSharedAccountChangePushResponse.fetch_account_list);
            }
            protoWriter.writeBytes(mailSharedAccountChangePushResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSharedAccountChangePushResponse$a */
    public static final class C16894a extends Message.Builder<MailSharedAccountChangePushResponse, C16894a> {

        /* renamed from: a */
        public MailAccount f43367a;

        /* renamed from: b */
        public Boolean f43368b;

        /* renamed from: c */
        public Boolean f43369c;

        /* renamed from: d */
        public Boolean f43370d;

        /* renamed from: a */
        public MailSharedAccountChangePushResponse build() {
            return new MailSharedAccountChangePushResponse(this.f43367a, this.f43368b, this.f43369c, this.f43370d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16894a newBuilder() {
        C16894a aVar = new C16894a();
        aVar.f43367a = this.account;
        aVar.f43368b = this.is_bind;
        aVar.f43369c = this.is_current;
        aVar.f43370d = this.fetch_account_list;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSharedAccountChangePushResponse");
        StringBuilder sb = new StringBuilder();
        if (this.account != null) {
            sb.append(", account=");
            sb.append(this.account);
        }
        if (this.is_bind != null) {
            sb.append(", is_bind=");
            sb.append(this.is_bind);
        }
        if (this.is_current != null) {
            sb.append(", is_current=");
            sb.append(this.is_current);
        }
        if (this.fetch_account_list != null) {
            sb.append(", fetch_account_list=");
            sb.append(this.fetch_account_list);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSharedAccountChangePushResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSharedAccountChangePushResponse(MailAccount mailAccount, Boolean bool, Boolean bool2, Boolean bool3) {
        this(mailAccount, bool, bool2, bool3, ByteString.EMPTY);
    }

    public MailSharedAccountChangePushResponse(MailAccount mailAccount, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.account = mailAccount;
        this.is_bind = bool;
        this.is_current = bool2;
        this.fetch_account_list = bool3;
    }
}
