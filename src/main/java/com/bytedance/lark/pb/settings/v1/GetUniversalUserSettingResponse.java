package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetUniversalUserSettingResponse extends Message<GetUniversalUserSettingResponse, C19161a> {
    public static final ProtoAdapter<GetUniversalUserSettingResponse> ADAPTER = new C19162b();
    private static final long serialVersionUID = 0;
    public final Map<String, UniversalUserSetting> settings;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUniversalUserSettingResponse$a */
    public static final class C19161a extends Message.Builder<GetUniversalUserSettingResponse, C19161a> {

        /* renamed from: a */
        public Map<String, UniversalUserSetting> f47301a = Internal.newMutableMap();

        /* renamed from: a */
        public GetUniversalUserSettingResponse build() {
            return new GetUniversalUserSettingResponse(this.f47301a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUniversalUserSettingResponse$b */
    private static final class C19162b extends ProtoAdapter<GetUniversalUserSettingResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UniversalUserSetting>> f47302a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UniversalUserSetting.ADAPTER);

        C19162b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUniversalUserSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUniversalUserSettingResponse getUniversalUserSettingResponse) {
            return this.f47302a.encodedSizeWithTag(1, getUniversalUserSettingResponse.settings) + getUniversalUserSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUniversalUserSettingResponse decode(ProtoReader protoReader) throws IOException {
            C19161a aVar = new C19161a();
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
                    aVar.f47301a.putAll(this.f47302a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUniversalUserSettingResponse getUniversalUserSettingResponse) throws IOException {
            this.f47302a.encodeWithTag(protoWriter, 1, getUniversalUserSettingResponse.settings);
            protoWriter.writeBytes(getUniversalUserSettingResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19161a newBuilder() {
        C19161a aVar = new C19161a();
        aVar.f47301a = Internal.copyOf("settings", this.settings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetUniversalUserSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.settings.isEmpty()) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUniversalUserSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUniversalUserSettingResponse(Map<String, UniversalUserSetting> map) {
        this(map, ByteString.EMPTY);
    }

    public GetUniversalUserSettingResponse(Map<String, UniversalUserSetting> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.settings = Internal.immutableCopyOf("settings", map);
    }
}
