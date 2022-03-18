package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PatchUserSettingRequest extends Message<PatchUserSettingRequest, C18486a> {
    public static final ProtoAdapter<PatchUserSettingRequest> ADAPTER = new C18487b();
    private static final long serialVersionUID = 0;
    public final List<UpdateField> update_fields;
    public final UserSetting user_setting;

    public enum UpdateField implements WireEnum {
        Unknown(0),
        MuteRedDotNotify(1);
        
        public static final ProtoAdapter<UpdateField> ADAPTER = ProtoAdapter.newEnumAdapter(UpdateField.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UpdateField fromValue(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i != 1) {
                return null;
            }
            return MuteRedDotNotify;
        }

        private UpdateField(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PatchUserSettingRequest$b */
    private static final class C18487b extends ProtoAdapter<PatchUserSettingRequest> {
        C18487b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchUserSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchUserSettingRequest patchUserSettingRequest) {
            int i;
            int encodedSizeWithTag = UpdateField.ADAPTER.asRepeated().encodedSizeWithTag(1, patchUserSettingRequest.update_fields);
            if (patchUserSettingRequest.user_setting != null) {
                i = UserSetting.ADAPTER.encodedSizeWithTag(2, patchUserSettingRequest.user_setting);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + patchUserSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchUserSettingRequest decode(ProtoReader protoReader) throws IOException {
            C18486a aVar = new C18486a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45916a.add(UpdateField.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45917b = UserSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchUserSettingRequest patchUserSettingRequest) throws IOException {
            UpdateField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, patchUserSettingRequest.update_fields);
            if (patchUserSettingRequest.user_setting != null) {
                UserSetting.ADAPTER.encodeWithTag(protoWriter, 2, patchUserSettingRequest.user_setting);
            }
            protoWriter.writeBytes(patchUserSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PatchUserSettingRequest$a */
    public static final class C18486a extends Message.Builder<PatchUserSettingRequest, C18486a> {

        /* renamed from: a */
        public List<UpdateField> f45916a = Internal.newMutableList();

        /* renamed from: b */
        public UserSetting f45917b;

        /* renamed from: a */
        public PatchUserSettingRequest build() {
            return new PatchUserSettingRequest(this.f45916a, this.f45917b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18486a mo63835a(UserSetting userSetting) {
            this.f45917b = userSetting;
            return this;
        }

        /* renamed from: a */
        public C18486a mo63836a(List<UpdateField> list) {
            Internal.checkElementsNotNull(list);
            this.f45916a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18486a newBuilder() {
        C18486a aVar = new C18486a();
        aVar.f45916a = Internal.copyOf("update_fields", this.update_fields);
        aVar.f45917b = this.user_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PatchUserSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.update_fields.isEmpty()) {
            sb.append(", update_fields=");
            sb.append(this.update_fields);
        }
        if (this.user_setting != null) {
            sb.append(", user_setting=");
            sb.append(this.user_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchUserSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchUserSettingRequest(List<UpdateField> list, UserSetting userSetting) {
        this(list, userSetting, ByteString.EMPTY);
    }

    public PatchUserSettingRequest(List<UpdateField> list, UserSetting userSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.update_fields = Internal.immutableCopyOf("update_fields", list);
        this.user_setting = userSetting;
    }
}
