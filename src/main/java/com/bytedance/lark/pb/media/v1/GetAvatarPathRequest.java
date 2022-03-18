package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetAvatarPathRequest extends Message<GetAvatarPathRequest, C18220a> {
    public static final ProtoAdapter<GetAvatarPathRequest> ADAPTER = new C18221b();
    public static final Float DEFAULT_DPR = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
    public static final Integer DEFAULT_DP_SIZE = 0;
    private static final long serialVersionUID = 0;
    public final Integer dp_size;
    public final Float dpr;
    public final String entity_id;
    public final String format;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetAvatarPathRequest$b */
    private static final class C18221b extends ProtoAdapter<GetAvatarPathRequest> {
        C18221b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAvatarPathRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAvatarPathRequest getAvatarPathRequest) {
            int i;
            int i2 = 0;
            if (getAvatarPathRequest.entity_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAvatarPathRequest.entity_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.encodedSizeWithTag(2, getAvatarPathRequest.key) + ProtoAdapter.INT32.encodedSizeWithTag(3, getAvatarPathRequest.dp_size) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, getAvatarPathRequest.dpr);
            if (getAvatarPathRequest.format != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, getAvatarPathRequest.format);
            }
            return encodedSizeWithTag + i2 + getAvatarPathRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAvatarPathRequest decode(ProtoReader protoReader) throws IOException {
            C18220a aVar = new C18220a();
            aVar.f45454a = "";
            aVar.f45455b = "";
            aVar.f45456c = 0;
            aVar.f45457d = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            aVar.f45458e = "webp";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45454a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45455b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45456c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45457d = ProtoAdapter.FLOAT.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45458e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAvatarPathRequest getAvatarPathRequest) throws IOException {
            if (getAvatarPathRequest.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAvatarPathRequest.entity_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getAvatarPathRequest.key);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getAvatarPathRequest.dp_size);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, getAvatarPathRequest.dpr);
            if (getAvatarPathRequest.format != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getAvatarPathRequest.format);
            }
            protoWriter.writeBytes(getAvatarPathRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetAvatarPathRequest$a */
    public static final class C18220a extends Message.Builder<GetAvatarPathRequest, C18220a> {

        /* renamed from: a */
        public String f45454a;

        /* renamed from: b */
        public String f45455b;

        /* renamed from: c */
        public Integer f45456c;

        /* renamed from: d */
        public Float f45457d;

        /* renamed from: e */
        public String f45458e;

        /* renamed from: a */
        public GetAvatarPathRequest build() {
            Integer num;
            Float f;
            String str = this.f45455b;
            if (str != null && (num = this.f45456c) != null && (f = this.f45457d) != null) {
                return new GetAvatarPathRequest(this.f45454a, str, num, f, this.f45458e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key", this.f45456c, "dp_size", this.f45457d, "dpr");
        }

        /* renamed from: a */
        public C18220a mo63156a(Float f) {
            this.f45457d = f;
            return this;
        }

        /* renamed from: b */
        public C18220a mo63160b(String str) {
            this.f45455b = str;
            return this;
        }

        /* renamed from: a */
        public C18220a mo63157a(Integer num) {
            this.f45456c = num;
            return this;
        }

        /* renamed from: a */
        public C18220a mo63158a(String str) {
            this.f45454a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18220a newBuilder() {
        C18220a aVar = new C18220a();
        aVar.f45454a = this.entity_id;
        aVar.f45455b = this.key;
        aVar.f45456c = this.dp_size;
        aVar.f45457d = this.dpr;
        aVar.f45458e = this.format;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetAvatarPathRequest");
        StringBuilder sb = new StringBuilder();
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", dp_size=");
        sb.append(this.dp_size);
        sb.append(", dpr=");
        sb.append(this.dpr);
        if (this.format != null) {
            sb.append(", format=");
            sb.append(this.format);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAvatarPathRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAvatarPathRequest(String str, String str2, Integer num, Float f, String str3) {
        this(str, str2, num, f, str3, ByteString.EMPTY);
    }

    public GetAvatarPathRequest(String str, String str2, Integer num, Float f, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_id = str;
        this.key = str2;
        this.dp_size = num;
        this.dpr = f;
        this.format = str3;
    }
}
