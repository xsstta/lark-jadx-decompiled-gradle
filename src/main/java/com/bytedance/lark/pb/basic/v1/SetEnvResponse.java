package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetEnvResponse extends Message<SetEnvResponse, C15270a> {
    public static final ProtoAdapter<SetEnvResponse> ADAPTER = new C15271b();
    private static final long serialVersionUID = 0;
    public final DomainSettings domain_settings;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetEnvResponse$b */
    private static final class C15271b extends ProtoAdapter<SetEnvResponse> {
        C15271b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetEnvResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetEnvResponse setEnvResponse) {
            int i;
            if (setEnvResponse.domain_settings != null) {
                i = DomainSettings.ADAPTER.encodedSizeWithTag(1, setEnvResponse.domain_settings);
            } else {
                i = 0;
            }
            return i + setEnvResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetEnvResponse decode(ProtoReader protoReader) throws IOException {
            C15270a aVar = new C15270a();
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
                    aVar.f40471a = DomainSettings.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetEnvResponse setEnvResponse) throws IOException {
            if (setEnvResponse.domain_settings != null) {
                DomainSettings.ADAPTER.encodeWithTag(protoWriter, 1, setEnvResponse.domain_settings);
            }
            protoWriter.writeBytes(setEnvResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetEnvResponse$a */
    public static final class C15270a extends Message.Builder<SetEnvResponse, C15270a> {

        /* renamed from: a */
        public DomainSettings f40471a;

        /* renamed from: a */
        public SetEnvResponse build() {
            return new SetEnvResponse(this.f40471a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15270a newBuilder() {
        C15270a aVar = new C15270a();
        aVar.f40471a = this.domain_settings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetEnvResponse");
        StringBuilder sb = new StringBuilder();
        if (this.domain_settings != null) {
            sb.append(", domain_settings=");
            sb.append(this.domain_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "SetEnvResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetEnvResponse(DomainSettings domainSettings) {
        this(domainSettings, ByteString.EMPTY);
    }

    public SetEnvResponse(DomainSettings domainSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        this.domain_settings = domainSettings;
    }
}
