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

public final class UpdateUniversalUserSettingRequest extends Message<UpdateUniversalUserSettingRequest, C19223a> {
    public static final ProtoAdapter<UpdateUniversalUserSettingRequest> ADAPTER = new C19224b();
    private static final long serialVersionUID = 0;
    public final List<UniversalUserSetting> settings;

    /* renamed from: com.bytedance.lark.pb.settings.v1.UpdateUniversalUserSettingRequest$b */
    private static final class C19224b extends ProtoAdapter<UpdateUniversalUserSettingRequest> {
        C19224b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUniversalUserSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateUniversalUserSettingRequest updateUniversalUserSettingRequest) {
            return UniversalUserSetting.ADAPTER.asRepeated().encodedSizeWithTag(1, updateUniversalUserSettingRequest.settings) + updateUniversalUserSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateUniversalUserSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19223a aVar = new C19223a();
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
                    aVar.f47395a.add(UniversalUserSetting.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateUniversalUserSettingRequest updateUniversalUserSettingRequest) throws IOException {
            UniversalUserSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateUniversalUserSettingRequest.settings);
            protoWriter.writeBytes(updateUniversalUserSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.UpdateUniversalUserSettingRequest$a */
    public static final class C19223a extends Message.Builder<UpdateUniversalUserSettingRequest, C19223a> {

        /* renamed from: a */
        public List<UniversalUserSetting> f47395a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateUniversalUserSettingRequest build() {
            return new UpdateUniversalUserSettingRequest(this.f47395a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19223a mo65629a(List<UniversalUserSetting> list) {
            Internal.checkElementsNotNull(list);
            this.f47395a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19223a newBuilder() {
        C19223a aVar = new C19223a();
        aVar.f47395a = Internal.copyOf("settings", this.settings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "UpdateUniversalUserSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.settings.isEmpty()) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUniversalUserSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateUniversalUserSettingRequest(List<UniversalUserSetting> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateUniversalUserSettingRequest(List<UniversalUserSetting> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.settings = Internal.immutableCopyOf("settings", list);
    }
}
