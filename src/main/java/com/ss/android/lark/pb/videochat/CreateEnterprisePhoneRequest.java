package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreateEnterprisePhoneRequest extends Message<CreateEnterprisePhoneRequest, C50286a> {
    public static final ProtoAdapter<CreateEnterprisePhoneRequest> ADAPTER = new C50287b();
    private static final long serialVersionUID = 0;
    public final String mcallee_id;
    public final String mchat_id;
    public final String mphone_number;

    /* renamed from: com.ss.android.lark.pb.videochat.CreateEnterprisePhoneRequest$b */
    private static final class C50287b extends ProtoAdapter<CreateEnterprisePhoneRequest> {
        C50287b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateEnterprisePhoneRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateEnterprisePhoneRequest createEnterprisePhoneRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createEnterprisePhoneRequest.mcallee_id);
            int i2 = 0;
            if (createEnterprisePhoneRequest.mchat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, createEnterprisePhoneRequest.mchat_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (createEnterprisePhoneRequest.mphone_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, createEnterprisePhoneRequest.mphone_number);
            }
            return i3 + i2 + createEnterprisePhoneRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateEnterprisePhoneRequest decode(ProtoReader protoReader) throws IOException {
            C50286a aVar = new C50286a();
            aVar.f125648a = "";
            aVar.f125649b = "";
            aVar.f125650c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125648a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125649b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125650c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateEnterprisePhoneRequest createEnterprisePhoneRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createEnterprisePhoneRequest.mcallee_id);
            if (createEnterprisePhoneRequest.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createEnterprisePhoneRequest.mchat_id);
            }
            if (createEnterprisePhoneRequest.mphone_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createEnterprisePhoneRequest.mphone_number);
            }
            protoWriter.writeBytes(createEnterprisePhoneRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50286a newBuilder() {
        C50286a aVar = new C50286a();
        aVar.f125648a = this.mcallee_id;
        aVar.f125649b = this.mchat_id;
        aVar.f125650c = this.mphone_number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.CreateEnterprisePhoneRequest$a */
    public static final class C50286a extends Message.Builder<CreateEnterprisePhoneRequest, C50286a> {

        /* renamed from: a */
        public String f125648a;

        /* renamed from: b */
        public String f125649b;

        /* renamed from: c */
        public String f125650c;

        /* renamed from: a */
        public CreateEnterprisePhoneRequest build() {
            String str = this.f125648a;
            if (str != null) {
                return new CreateEnterprisePhoneRequest(str, this.f125649b, this.f125650c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mcallee_id");
        }

        /* renamed from: a */
        public C50286a mo174448a(String str) {
            this.f125648a = str;
            return this;
        }

        /* renamed from: b */
        public C50286a mo174450b(String str) {
            this.f125649b = str;
            return this;
        }

        /* renamed from: c */
        public C50286a mo174451c(String str) {
            this.f125650c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", callee_id=");
        sb.append(this.mcallee_id);
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mphone_number != null) {
            sb.append(", phone_number=");
            sb.append(this.mphone_number);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateEnterprisePhoneRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateEnterprisePhoneRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public CreateEnterprisePhoneRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcallee_id = str;
        this.mchat_id = str2;
        this.mphone_number = str3;
    }
}
