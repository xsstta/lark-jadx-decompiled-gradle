package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CommonGadgetPushRequest extends Message<CommonGadgetPushRequest, C18645a> {
    public static final ProtoAdapter<CommonGadgetPushRequest> ADAPTER = new C18646b();
    public static final Boolean DEFAULT_IS_ONLINE = false;
    private static final long serialVersionUID = 0;
    public final String biz;
    public final String data;
    public final Boolean is_online;
    public final String timestamp;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.CommonGadgetPushRequest$b */
    private static final class C18646b extends ProtoAdapter<CommonGadgetPushRequest> {
        C18646b() {
            super(FieldEncoding.LENGTH_DELIMITED, CommonGadgetPushRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CommonGadgetPushRequest commonGadgetPushRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, commonGadgetPushRequest.is_online) + ProtoAdapter.STRING.encodedSizeWithTag(2, commonGadgetPushRequest.biz);
            int i2 = 0;
            if (commonGadgetPushRequest.timestamp != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, commonGadgetPushRequest.timestamp);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (commonGadgetPushRequest.data != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, commonGadgetPushRequest.data);
            }
            return i3 + i2 + commonGadgetPushRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CommonGadgetPushRequest decode(ProtoReader protoReader) throws IOException {
            C18645a aVar = new C18645a();
            aVar.f46167a = false;
            aVar.f46168b = "";
            aVar.f46169c = "";
            aVar.f46170d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46167a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46168b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46169c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46170d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CommonGadgetPushRequest commonGadgetPushRequest) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, commonGadgetPushRequest.is_online);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commonGadgetPushRequest.biz);
            if (commonGadgetPushRequest.timestamp != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commonGadgetPushRequest.timestamp);
            }
            if (commonGadgetPushRequest.data != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, commonGadgetPushRequest.data);
            }
            protoWriter.writeBytes(commonGadgetPushRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18645a newBuilder() {
        C18645a aVar = new C18645a();
        aVar.f46167a = this.is_online;
        aVar.f46168b = this.biz;
        aVar.f46169c = this.timestamp;
        aVar.f46170d = this.data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.CommonGadgetPushRequest$a */
    public static final class C18645a extends Message.Builder<CommonGadgetPushRequest, C18645a> {

        /* renamed from: a */
        public Boolean f46167a;

        /* renamed from: b */
        public String f46168b;

        /* renamed from: c */
        public String f46169c;

        /* renamed from: d */
        public String f46170d;

        /* renamed from: a */
        public CommonGadgetPushRequest build() {
            String str;
            Boolean bool = this.f46167a;
            if (bool != null && (str = this.f46168b) != null) {
                return new CommonGadgetPushRequest(bool, str, this.f46169c, this.f46170d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_online", this.f46168b, "biz");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "CommonGadgetPushRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_online=");
        sb.append(this.is_online);
        sb.append(", biz=");
        sb.append(this.biz);
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "CommonGadgetPushRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CommonGadgetPushRequest(Boolean bool, String str, String str2, String str3) {
        this(bool, str, str2, str3, ByteString.EMPTY);
    }

    public CommonGadgetPushRequest(Boolean bool, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_online = bool;
        this.biz = str;
        this.timestamp = str2;
        this.data = str3;
    }
}
