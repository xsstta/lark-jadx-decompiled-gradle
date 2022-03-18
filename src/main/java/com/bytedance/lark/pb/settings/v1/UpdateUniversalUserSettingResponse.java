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
import java.util.List;
import okio.ByteString;

public final class UpdateUniversalUserSettingResponse extends Message<UpdateUniversalUserSettingResponse, C19225a> {
    public static final ProtoAdapter<UpdateUniversalUserSettingResponse> ADAPTER = new C19226b();
    private static final long serialVersionUID = 0;
    public final List<UniversalUserSetting> settings;

    /* renamed from: com.bytedance.lark.pb.settings.v1.UpdateUniversalUserSettingResponse$b */
    private static final class C19226b extends ProtoAdapter<UpdateUniversalUserSettingResponse> {
        C19226b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUniversalUserSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateUniversalUserSettingResponse updateUniversalUserSettingResponse) {
            return UniversalUserSetting.ADAPTER.asRepeated().encodedSizeWithTag(1, updateUniversalUserSettingResponse.settings) + updateUniversalUserSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateUniversalUserSettingResponse decode(ProtoReader protoReader) throws IOException {
            C19225a aVar = new C19225a();
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
                    aVar.f47396a.add(UniversalUserSetting.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateUniversalUserSettingResponse updateUniversalUserSettingResponse) throws IOException {
            UniversalUserSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateUniversalUserSettingResponse.settings);
            protoWriter.writeBytes(updateUniversalUserSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.UpdateUniversalUserSettingResponse$a */
    public static final class C19225a extends Message.Builder<UpdateUniversalUserSettingResponse, C19225a> {

        /* renamed from: a */
        public List<UniversalUserSetting> f47396a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateUniversalUserSettingResponse build() {
            return new UpdateUniversalUserSettingResponse(this.f47396a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19225a newBuilder() {
        C19225a aVar = new C19225a();
        aVar.f47396a = Internal.copyOf("settings", this.settings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "UpdateUniversalUserSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.settings.isEmpty()) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUniversalUserSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateUniversalUserSettingResponse(List<UniversalUserSetting> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateUniversalUserSettingResponse(List<UniversalUserSetting> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.settings = Internal.immutableCopyOf("settings", list);
    }
}
