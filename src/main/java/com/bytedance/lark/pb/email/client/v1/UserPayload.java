package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserPayload extends Message<UserPayload, C17000a> {
    public static final ProtoAdapter<UserPayload> ADAPTER = new C17001b();
    public static final PermissionCode DEFAULT_CODE = PermissionCode.NONE;
    public static final CollaboratorType DEFAULT_COLLABORATOR_TYPE = CollaboratorType.USER;
    private static final long serialVersionUID = 0;
    public final PermissionCode code;
    public final CollaboratorType collaborator_type;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.UserPayload$b */
    private static final class C17001b extends ProtoAdapter<UserPayload> {
        C17001b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserPayload.class);
        }

        /* renamed from: a */
        public int encodedSize(UserPayload userPayload) {
            int i;
            int i2;
            int i3 = 0;
            if (userPayload.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, userPayload.user_id);
            } else {
                i = 0;
            }
            if (userPayload.code != null) {
                i2 = PermissionCode.ADAPTER.encodedSizeWithTag(2, userPayload.code);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (userPayload.collaborator_type != null) {
                i3 = CollaboratorType.ADAPTER.encodedSizeWithTag(3, userPayload.collaborator_type);
            }
            return i4 + i3 + userPayload.unknownFields().size();
        }

        /* renamed from: a */
        public UserPayload decode(ProtoReader protoReader) throws IOException {
            C17000a aVar = new C17000a();
            aVar.f43637a = "";
            aVar.f43638b = PermissionCode.NONE;
            aVar.f43639c = CollaboratorType.USER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43637a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f43638b = PermissionCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43639c = CollaboratorType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserPayload userPayload) throws IOException {
            if (userPayload.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userPayload.user_id);
            }
            if (userPayload.code != null) {
                PermissionCode.ADAPTER.encodeWithTag(protoWriter, 2, userPayload.code);
            }
            if (userPayload.collaborator_type != null) {
                CollaboratorType.ADAPTER.encodeWithTag(protoWriter, 3, userPayload.collaborator_type);
            }
            protoWriter.writeBytes(userPayload.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.UserPayload$a */
    public static final class C17000a extends Message.Builder<UserPayload, C17000a> {

        /* renamed from: a */
        public String f43637a;

        /* renamed from: b */
        public PermissionCode f43638b;

        /* renamed from: c */
        public CollaboratorType f43639c;

        /* renamed from: a */
        public UserPayload build() {
            return new UserPayload(this.f43637a, this.f43638b, this.f43639c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17000a newBuilder() {
        C17000a aVar = new C17000a();
        aVar.f43637a = this.user_id;
        aVar.f43638b = this.code;
        aVar.f43639c = this.collaborator_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "UserPayload");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.collaborator_type != null) {
            sb.append(", collaborator_type=");
            sb.append(this.collaborator_type);
        }
        StringBuilder replace = sb.replace(0, 2, "UserPayload{");
        replace.append('}');
        return replace.toString();
    }

    public UserPayload(String str, PermissionCode permissionCode, CollaboratorType collaboratorType) {
        this(str, permissionCode, collaboratorType, ByteString.EMPTY);
    }

    public UserPayload(String str, PermissionCode permissionCode, CollaboratorType collaboratorType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.code = permissionCode;
        this.collaborator_type = collaboratorType;
    }
}
