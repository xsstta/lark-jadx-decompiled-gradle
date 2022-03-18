package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAdminSettingsRequest extends Message<GetAdminSettingsRequest, C50593a> {
    public static final ProtoAdapter<GetAdminSettingsRequest> ADAPTER = new C50594b();
    public static final Long DEFAULT_TENANT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long tenant_id;
    public final String tenant_id_str;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsRequest$b */
    private static final class C50594b extends ProtoAdapter<GetAdminSettingsRequest> {
        C50594b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAdminSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAdminSettingsRequest getAdminSettingsRequest) {
            int i;
            int i2 = 0;
            if (getAdminSettingsRequest.tenant_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getAdminSettingsRequest.tenant_id);
            } else {
                i = 0;
            }
            if (getAdminSettingsRequest.tenant_id_str != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getAdminSettingsRequest.tenant_id_str);
            }
            return i + i2 + getAdminSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAdminSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C50593a aVar = new C50593a();
            aVar.f126291a = 0L;
            aVar.f126292b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126291a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126292b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAdminSettingsRequest getAdminSettingsRequest) throws IOException {
            if (getAdminSettingsRequest.tenant_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getAdminSettingsRequest.tenant_id);
            }
            if (getAdminSettingsRequest.tenant_id_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getAdminSettingsRequest.tenant_id_str);
            }
            protoWriter.writeBytes(getAdminSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsRequest$a */
    public static final class C50593a extends Message.Builder<GetAdminSettingsRequest, C50593a> {

        /* renamed from: a */
        public Long f126291a;

        /* renamed from: b */
        public String f126292b;

        /* renamed from: a */
        public GetAdminSettingsRequest build() {
            return new GetAdminSettingsRequest(this.f126291a, this.f126292b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50593a mo175151a(Long l) {
            this.f126291a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50593a newBuilder() {
        C50593a aVar = new C50593a();
        aVar.f126291a = this.tenant_id;
        aVar.f126292b = this.tenant_id_str;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetAdminSettingsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.tenant_id_str != null) {
            sb.append(", tenant_id_str=");
            sb.append(this.tenant_id_str);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAdminSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAdminSettingsRequest(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public GetAdminSettingsRequest(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenant_id = l;
        this.tenant_id_str = str;
    }
}
