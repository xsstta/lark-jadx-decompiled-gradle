package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PutTrustedMailResponse extends Message<PutTrustedMailResponse, C18614a> {
    public static final ProtoAdapter<PutTrustedMailResponse> ADAPTER = new C18615b();
    public static final Boolean DEFAULT_IS_SUCCESS = false;
    public static final Integer DEFAULT_STATUS_CODE = 0;
    private static final long serialVersionUID = 0;
    public final Boolean is_success;
    public final Integer status_code;
    public final String status_message;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PutTrustedMailResponse$b */
    private static final class C18615b extends ProtoAdapter<PutTrustedMailResponse> {
        C18615b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutTrustedMailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutTrustedMailResponse putTrustedMailResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, putTrustedMailResponse.is_success);
            int i2 = 0;
            if (putTrustedMailResponse.status_code != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, putTrustedMailResponse.status_code);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (putTrustedMailResponse.status_message != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, putTrustedMailResponse.status_message);
            }
            return i3 + i2 + putTrustedMailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutTrustedMailResponse decode(ProtoReader protoReader) throws IOException {
            C18614a aVar = new C18614a();
            aVar.f46117a = false;
            aVar.f46118b = 0;
            aVar.f46119c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46117a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46118b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46119c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutTrustedMailResponse putTrustedMailResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, putTrustedMailResponse.is_success);
            if (putTrustedMailResponse.status_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, putTrustedMailResponse.status_code);
            }
            if (putTrustedMailResponse.status_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, putTrustedMailResponse.status_message);
            }
            protoWriter.writeBytes(putTrustedMailResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18614a newBuilder() {
        C18614a aVar = new C18614a();
        aVar.f46117a = this.is_success;
        aVar.f46118b = this.status_code;
        aVar.f46119c = this.status_message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PutTrustedMailResponse$a */
    public static final class C18614a extends Message.Builder<PutTrustedMailResponse, C18614a> {

        /* renamed from: a */
        public Boolean f46117a;

        /* renamed from: b */
        public Integer f46118b;

        /* renamed from: c */
        public String f46119c;

        /* renamed from: a */
        public PutTrustedMailResponse build() {
            Boolean bool = this.f46117a;
            if (bool != null) {
                return new PutTrustedMailResponse(bool, this.f46118b, this.f46119c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_success");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "PutTrustedMailResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_success=");
        sb.append(this.is_success);
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        if (this.status_message != null) {
            sb.append(", status_message=");
            sb.append(this.status_message);
        }
        StringBuilder replace = sb.replace(0, 2, "PutTrustedMailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutTrustedMailResponse(Boolean bool, Integer num, String str) {
        this(bool, num, str, ByteString.EMPTY);
    }

    public PutTrustedMailResponse(Boolean bool, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_success = bool;
        this.status_code = num;
        this.status_message = str;
    }
}
