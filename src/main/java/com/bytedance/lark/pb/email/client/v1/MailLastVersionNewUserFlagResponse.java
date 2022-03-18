package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailLastVersionNewUserFlagResponse extends Message<MailLastVersionNewUserFlagResponse, C16822a> {
    public static final ProtoAdapter<MailLastVersionNewUserFlagResponse> ADAPTER = new C16823b();
    public static final Boolean DEFAULT_NEW_USER_FLAG = false;
    private static final long serialVersionUID = 0;
    public final Boolean new_user_flag;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailLastVersionNewUserFlagResponse$b */
    private static final class C16823b extends ProtoAdapter<MailLastVersionNewUserFlagResponse> {
        C16823b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailLastVersionNewUserFlagResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailLastVersionNewUserFlagResponse mailLastVersionNewUserFlagResponse) {
            int i;
            if (mailLastVersionNewUserFlagResponse.new_user_flag != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailLastVersionNewUserFlagResponse.new_user_flag);
            } else {
                i = 0;
            }
            return i + mailLastVersionNewUserFlagResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailLastVersionNewUserFlagResponse decode(ProtoReader protoReader) throws IOException {
            C16822a aVar = new C16822a();
            aVar.f43290a = false;
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
                    aVar.f43290a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailLastVersionNewUserFlagResponse mailLastVersionNewUserFlagResponse) throws IOException {
            if (mailLastVersionNewUserFlagResponse.new_user_flag != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailLastVersionNewUserFlagResponse.new_user_flag);
            }
            protoWriter.writeBytes(mailLastVersionNewUserFlagResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailLastVersionNewUserFlagResponse$a */
    public static final class C16822a extends Message.Builder<MailLastVersionNewUserFlagResponse, C16822a> {

        /* renamed from: a */
        public Boolean f43290a;

        /* renamed from: a */
        public MailLastVersionNewUserFlagResponse build() {
            return new MailLastVersionNewUserFlagResponse(this.f43290a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16822a newBuilder() {
        C16822a aVar = new C16822a();
        aVar.f43290a = this.new_user_flag;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailLastVersionNewUserFlagResponse");
        StringBuilder sb = new StringBuilder();
        if (this.new_user_flag != null) {
            sb.append(", new_user_flag=");
            sb.append(this.new_user_flag);
        }
        StringBuilder replace = sb.replace(0, 2, "MailLastVersionNewUserFlagResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailLastVersionNewUserFlagResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MailLastVersionNewUserFlagResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.new_user_flag = bool;
    }
}
