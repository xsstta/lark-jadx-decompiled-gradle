package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushTenantMiniprogramNeedUpdateRequest extends Message<PushTenantMiniprogramNeedUpdateRequest, C18699a> {
    public static final ProtoAdapter<PushTenantMiniprogramNeedUpdateRequest> ADAPTER = new C18700b();
    public static final Integer DEFAULT_LATENCY = 0;
    private static final long serialVersionUID = 0;
    public final String cli_id;
    public final String extra;
    public final Integer latency;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushTenantMiniprogramNeedUpdateRequest$b */
    private static final class C18700b extends ProtoAdapter<PushTenantMiniprogramNeedUpdateRequest> {
        C18700b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTenantMiniprogramNeedUpdateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTenantMiniprogramNeedUpdateRequest pushTenantMiniprogramNeedUpdateRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (pushTenantMiniprogramNeedUpdateRequest.cli_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushTenantMiniprogramNeedUpdateRequest.cli_id);
            } else {
                i = 0;
            }
            if (pushTenantMiniprogramNeedUpdateRequest.latency != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, pushTenantMiniprogramNeedUpdateRequest.latency);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (pushTenantMiniprogramNeedUpdateRequest.extra != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushTenantMiniprogramNeedUpdateRequest.extra);
            }
            return i4 + i3 + pushTenantMiniprogramNeedUpdateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushTenantMiniprogramNeedUpdateRequest decode(ProtoReader protoReader) throws IOException {
            C18699a aVar = new C18699a();
            aVar.f46241a = "";
            aVar.f46242b = 0;
            aVar.f46243c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46241a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46242b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46243c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTenantMiniprogramNeedUpdateRequest pushTenantMiniprogramNeedUpdateRequest) throws IOException {
            if (pushTenantMiniprogramNeedUpdateRequest.cli_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushTenantMiniprogramNeedUpdateRequest.cli_id);
            }
            if (pushTenantMiniprogramNeedUpdateRequest.latency != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushTenantMiniprogramNeedUpdateRequest.latency);
            }
            if (pushTenantMiniprogramNeedUpdateRequest.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushTenantMiniprogramNeedUpdateRequest.extra);
            }
            protoWriter.writeBytes(pushTenantMiniprogramNeedUpdateRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushTenantMiniprogramNeedUpdateRequest$a */
    public static final class C18699a extends Message.Builder<PushTenantMiniprogramNeedUpdateRequest, C18699a> {

        /* renamed from: a */
        public String f46241a;

        /* renamed from: b */
        public Integer f46242b;

        /* renamed from: c */
        public String f46243c;

        /* renamed from: a */
        public PushTenantMiniprogramNeedUpdateRequest build() {
            return new PushTenantMiniprogramNeedUpdateRequest(this.f46241a, this.f46242b, this.f46243c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18699a newBuilder() {
        C18699a aVar = new C18699a();
        aVar.f46241a = this.cli_id;
        aVar.f46242b = this.latency;
        aVar.f46243c = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "PushTenantMiniprogramNeedUpdateRequest");
        StringBuilder sb = new StringBuilder();
        if (this.cli_id != null) {
            sb.append(", cli_id=");
            sb.append(this.cli_id);
        }
        if (this.latency != null) {
            sb.append(", latency=");
            sb.append(this.latency);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTenantMiniprogramNeedUpdateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushTenantMiniprogramNeedUpdateRequest(String str, Integer num, String str2) {
        this(str, num, str2, ByteString.EMPTY);
    }

    public PushTenantMiniprogramNeedUpdateRequest(String str, Integer num, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cli_id = str;
        this.latency = num;
        this.extra = str2;
    }
}
