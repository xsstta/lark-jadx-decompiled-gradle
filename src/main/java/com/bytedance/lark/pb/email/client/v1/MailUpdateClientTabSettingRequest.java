package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateClientTabSettingRequest extends Message<MailUpdateClientTabSettingRequest, C16934a> {
    public static final ProtoAdapter<MailUpdateClientTabSettingRequest> ADAPTER = new C16935b();
    public static final Boolean DEFAULT_IS_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_enabled;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateClientTabSettingRequest$b */
    private static final class C16935b extends ProtoAdapter<MailUpdateClientTabSettingRequest> {
        C16935b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateClientTabSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateClientTabSettingRequest mailUpdateClientTabSettingRequest) {
            int i;
            if (mailUpdateClientTabSettingRequest.is_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailUpdateClientTabSettingRequest.is_enabled);
            } else {
                i = 0;
            }
            return i + mailUpdateClientTabSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateClientTabSettingRequest decode(ProtoReader protoReader) throws IOException {
            C16934a aVar = new C16934a();
            aVar.f43425a = false;
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
                    aVar.f43425a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateClientTabSettingRequest mailUpdateClientTabSettingRequest) throws IOException {
            if (mailUpdateClientTabSettingRequest.is_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailUpdateClientTabSettingRequest.is_enabled);
            }
            protoWriter.writeBytes(mailUpdateClientTabSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateClientTabSettingRequest$a */
    public static final class C16934a extends Message.Builder<MailUpdateClientTabSettingRequest, C16934a> {

        /* renamed from: a */
        public Boolean f43425a;

        /* renamed from: a */
        public MailUpdateClientTabSettingRequest build() {
            return new MailUpdateClientTabSettingRequest(this.f43425a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16934a mo59840a(Boolean bool) {
            this.f43425a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16934a newBuilder() {
        C16934a aVar = new C16934a();
        aVar.f43425a = this.is_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateClientTabSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.is_enabled != null) {
            sb.append(", is_enabled=");
            sb.append(this.is_enabled);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateClientTabSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateClientTabSettingRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MailUpdateClientTabSettingRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_enabled = bool;
    }
}
