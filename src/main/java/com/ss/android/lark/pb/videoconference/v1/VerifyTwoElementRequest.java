package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VerifyTwoElementRequest extends Message<VerifyTwoElementRequest, C51220a> {
    public static final ProtoAdapter<VerifyTwoElementRequest> ADAPTER = new C51221b();
    public static final Integer DEFAULT_APP_ID = 0;
    public static final Integer DEFAULT_IDENTITY_TYPE = 0;
    private static final long serialVersionUID = 0;
    public final Integer app_id;
    public final String identity_code;
    public final String identity_name;
    public final Integer identity_type;
    public final String scene;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VerifyTwoElementRequest$b */
    private static final class C51221b extends ProtoAdapter<VerifyTwoElementRequest> {
        C51221b() {
            super(FieldEncoding.LENGTH_DELIMITED, VerifyTwoElementRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VerifyTwoElementRequest verifyTwoElementRequest) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, verifyTwoElementRequest.app_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, verifyTwoElementRequest.scene) + ProtoAdapter.STRING.encodedSizeWithTag(3, verifyTwoElementRequest.identity_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, verifyTwoElementRequest.identity_name) + ProtoAdapter.INT32.encodedSizeWithTag(5, verifyTwoElementRequest.identity_type) + verifyTwoElementRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VerifyTwoElementRequest decode(ProtoReader protoReader) throws IOException {
            C51220a aVar = new C51220a();
            aVar.f127512a = 0;
            aVar.f127513b = "";
            aVar.f127514c = "";
            aVar.f127515d = "";
            aVar.f127516e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127512a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127513b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127514c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f127515d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127516e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VerifyTwoElementRequest verifyTwoElementRequest) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, verifyTwoElementRequest.app_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, verifyTwoElementRequest.scene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, verifyTwoElementRequest.identity_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, verifyTwoElementRequest.identity_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, verifyTwoElementRequest.identity_type);
            protoWriter.writeBytes(verifyTwoElementRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51220a newBuilder() {
        C51220a aVar = new C51220a();
        aVar.f127512a = this.app_id;
        aVar.f127513b = this.scene;
        aVar.f127514c = this.identity_code;
        aVar.f127515d = this.identity_name;
        aVar.f127516e = this.identity_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VerifyTwoElementRequest$a */
    public static final class C51220a extends Message.Builder<VerifyTwoElementRequest, C51220a> {

        /* renamed from: a */
        public Integer f127512a;

        /* renamed from: b */
        public String f127513b;

        /* renamed from: c */
        public String f127514c;

        /* renamed from: d */
        public String f127515d;

        /* renamed from: e */
        public Integer f127516e;

        /* renamed from: a */
        public VerifyTwoElementRequest build() {
            String str;
            String str2;
            String str3;
            Integer num;
            Integer num2 = this.f127512a;
            if (num2 != null && (str = this.f127513b) != null && (str2 = this.f127514c) != null && (str3 = this.f127515d) != null && (num = this.f127516e) != null) {
                return new VerifyTwoElementRequest(num2, str, str2, str3, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "app_id", this.f127513b, "scene", this.f127514c, "identity_code", this.f127515d, "identity_name", this.f127516e, "identity_type");
        }

        /* renamed from: a */
        public C51220a mo176634a(Integer num) {
            this.f127512a = num;
            return this;
        }

        /* renamed from: b */
        public C51220a mo176637b(Integer num) {
            this.f127516e = num;
            return this;
        }

        /* renamed from: c */
        public C51220a mo176639c(String str) {
            this.f127515d = str;
            return this;
        }

        /* renamed from: a */
        public C51220a mo176635a(String str) {
            this.f127513b = str;
            return this;
        }

        /* renamed from: b */
        public C51220a mo176638b(String str) {
            this.f127514c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VerifyTwoElementRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", identity_code=");
        sb.append(this.identity_code);
        sb.append(", identity_name=");
        sb.append(this.identity_name);
        sb.append(", identity_type=");
        sb.append(this.identity_type);
        StringBuilder replace = sb.replace(0, 2, "VerifyTwoElementRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VerifyTwoElementRequest(Integer num, String str, String str2, String str3, Integer num2) {
        this(num, str, str2, str3, num2, ByteString.EMPTY);
    }

    public VerifyTwoElementRequest(Integer num, String str, String str2, String str3, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = num;
        this.scene = str;
        this.identity_code = str2;
        this.identity_name = str3;
        this.identity_type = num2;
    }
}
