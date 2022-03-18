package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ConfigTabsResponse extends Message<ConfigTabsResponse, C18344a> {
    public static final ProtoAdapter<ConfigTabsResponse> ADAPTER = new C18345b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ConfigTabsResponse$b */
    private static final class C18345b extends ProtoAdapter<ConfigTabsResponse> {
        C18345b() {
            super(FieldEncoding.LENGTH_DELIMITED, ConfigTabsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ConfigTabsResponse configTabsResponse) {
            return configTabsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ConfigTabsResponse decode(ProtoReader protoReader) throws IOException {
            C18344a aVar = new C18344a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ConfigTabsResponse configTabsResponse) throws IOException {
            protoWriter.writeBytes(configTabsResponse.unknownFields());
        }
    }

    public ConfigTabsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ConfigTabsResponse$a */
    public static final class C18344a extends Message.Builder<ConfigTabsResponse, C18344a> {
        /* renamed from: a */
        public ConfigTabsResponse build() {
            return new ConfigTabsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18344a newBuilder() {
        C18344a aVar = new C18344a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ConfigTabsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ConfigTabsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ConfigTabsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
