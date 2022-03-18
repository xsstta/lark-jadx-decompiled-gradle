package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetInitSettingsResponse extends Message<GetInitSettingsResponse, C14967a> {
    public static final ProtoAdapter<GetInitSettingsResponse> ADAPTER = new C14968b();
    private static final long serialVersionUID = 0;
    public final DomainSettings domain_settings;
    public final FeatureSwitches feature_switches;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetInitSettingsResponse$b */
    private static final class C14968b extends ProtoAdapter<GetInitSettingsResponse> {
        C14968b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInitSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInitSettingsResponse getInitSettingsResponse) {
            int i;
            int i2 = 0;
            if (getInitSettingsResponse.domain_settings != null) {
                i = DomainSettings.ADAPTER.encodedSizeWithTag(1, getInitSettingsResponse.domain_settings);
            } else {
                i = 0;
            }
            if (getInitSettingsResponse.feature_switches != null) {
                i2 = FeatureSwitches.ADAPTER.encodedSizeWithTag(2, getInitSettingsResponse.feature_switches);
            }
            return i + i2 + getInitSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetInitSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C14967a aVar = new C14967a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39621a = DomainSettings.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39622b = FeatureSwitches.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetInitSettingsResponse getInitSettingsResponse) throws IOException {
            if (getInitSettingsResponse.domain_settings != null) {
                DomainSettings.ADAPTER.encodeWithTag(protoWriter, 1, getInitSettingsResponse.domain_settings);
            }
            if (getInitSettingsResponse.feature_switches != null) {
                FeatureSwitches.ADAPTER.encodeWithTag(protoWriter, 2, getInitSettingsResponse.feature_switches);
            }
            protoWriter.writeBytes(getInitSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetInitSettingsResponse$a */
    public static final class C14967a extends Message.Builder<GetInitSettingsResponse, C14967a> {

        /* renamed from: a */
        public DomainSettings f39621a;

        /* renamed from: b */
        public FeatureSwitches f39622b;

        /* renamed from: a */
        public GetInitSettingsResponse build() {
            return new GetInitSettingsResponse(this.f39621a, this.f39622b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14967a mo54741a(DomainSettings domainSettings) {
            this.f39621a = domainSettings;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14967a newBuilder() {
        C14967a aVar = new C14967a();
        aVar.f39621a = this.domain_settings;
        aVar.f39622b = this.feature_switches;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetInitSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.domain_settings != null) {
            sb.append(", domain_settings=");
            sb.append(this.domain_settings);
        }
        if (this.feature_switches != null) {
            sb.append(", feature_switches=");
            sb.append(this.feature_switches);
        }
        StringBuilder replace = sb.replace(0, 2, "GetInitSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetInitSettingsResponse(DomainSettings domainSettings, FeatureSwitches featureSwitches) {
        this(domainSettings, featureSwitches, ByteString.EMPTY);
    }

    public GetInitSettingsResponse(DomainSettings domainSettings, FeatureSwitches featureSwitches, ByteString byteString) {
        super(ADAPTER, byteString);
        this.domain_settings = domainSettings;
        this.feature_switches = featureSwitches;
    }
}
