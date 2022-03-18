package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAppConfigResponse extends Message<GetAppConfigResponse, C14961a> {
    public static final ProtoAdapter<GetAppConfigResponse> ADAPTER = new C14962b();
    private static final long serialVersionUID = 0;
    public final AppConfig app_config;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetAppConfigResponse$b */
    private static final class C14962b extends ProtoAdapter<GetAppConfigResponse> {
        C14962b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAppConfigResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAppConfigResponse getAppConfigResponse) {
            int i;
            if (getAppConfigResponse.app_config != null) {
                i = AppConfig.ADAPTER.encodedSizeWithTag(1, getAppConfigResponse.app_config);
            } else {
                i = 0;
            }
            return i + getAppConfigResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAppConfigResponse decode(ProtoReader protoReader) throws IOException {
            C14961a aVar = new C14961a();
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
                    aVar.f39615a = AppConfig.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAppConfigResponse getAppConfigResponse) throws IOException {
            if (getAppConfigResponse.app_config != null) {
                AppConfig.ADAPTER.encodeWithTag(protoWriter, 1, getAppConfigResponse.app_config);
            }
            protoWriter.writeBytes(getAppConfigResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetAppConfigResponse$a */
    public static final class C14961a extends Message.Builder<GetAppConfigResponse, C14961a> {

        /* renamed from: a */
        public AppConfig f39615a;

        /* renamed from: a */
        public GetAppConfigResponse build() {
            return new GetAppConfigResponse(this.f39615a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14961a newBuilder() {
        C14961a aVar = new C14961a();
        aVar.f39615a = this.app_config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetAppConfigResponse");
        StringBuilder sb = new StringBuilder();
        if (this.app_config != null) {
            sb.append(", app_config=");
            sb.append(this.app_config);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAppConfigResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAppConfigResponse(AppConfig appConfig) {
        this(appConfig, ByteString.EMPTY);
    }

    public GetAppConfigResponse(AppConfig appConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_config = appConfig;
    }
}
