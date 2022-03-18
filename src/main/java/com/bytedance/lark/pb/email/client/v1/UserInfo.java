package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UserInfo extends Message<UserInfo, C16998a> {
    public static final ProtoAdapter<UserInfo> ADAPTER = new C16999b();
    public static final PermissionCode DEFAULT_CODE = PermissionCode.NONE;
    public static final CollaboratorType DEFAULT_COLLABORATOR_TYPE = CollaboratorType.USER;
    private static final long serialVersionUID = 0;
    public final String avatar;
    public final String chat_id;
    public final String cn_name;
    public final PermissionCode code;
    public final CollaboratorType collaborator_type;
    public final String department;
    public final String email_address;
    public final String en_name;
    public final List<PermissionCode> permission_action;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.UserInfo$b */
    private static final class C16999b extends ProtoAdapter<UserInfo> {
        C16999b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UserInfo userInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (userInfo.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, userInfo.user_id);
            } else {
                i = 0;
            }
            if (userInfo.cn_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, userInfo.cn_name);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (userInfo.en_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, userInfo.en_name);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (userInfo.email_address != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, userInfo.email_address);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (userInfo.department != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, userInfo.department);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (userInfo.avatar != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, userInfo.avatar);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (userInfo.code != null) {
                i7 = PermissionCode.ADAPTER.encodedSizeWithTag(7, userInfo.code);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (userInfo.collaborator_type != null) {
                i8 = CollaboratorType.ADAPTER.encodedSizeWithTag(8, userInfo.collaborator_type);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag = i15 + i8 + PermissionCode.ADAPTER.asRepeated().encodedSizeWithTag(9, userInfo.permission_action);
            if (userInfo.chat_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, userInfo.chat_id);
            }
            return encodedSizeWithTag + i9 + userInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UserInfo decode(ProtoReader protoReader) throws IOException {
            C16998a aVar = new C16998a();
            aVar.f43627a = "";
            aVar.f43628b = "";
            aVar.f43629c = "";
            aVar.f43630d = "";
            aVar.f43631e = "";
            aVar.f43632f = "";
            aVar.f43633g = PermissionCode.NONE;
            aVar.f43634h = CollaboratorType.USER;
            aVar.f43636j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43627a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43628b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43629c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43630d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43631e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43632f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f43633g = PermissionCode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 8:
                            try {
                                aVar.f43634h = CollaboratorType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            try {
                                aVar.f43635i.add(PermissionCode.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 10:
                            aVar.f43636j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserInfo userInfo) throws IOException {
            if (userInfo.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userInfo.user_id);
            }
            if (userInfo.cn_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userInfo.cn_name);
            }
            if (userInfo.en_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userInfo.en_name);
            }
            if (userInfo.email_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userInfo.email_address);
            }
            if (userInfo.department != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, userInfo.department);
            }
            if (userInfo.avatar != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, userInfo.avatar);
            }
            if (userInfo.code != null) {
                PermissionCode.ADAPTER.encodeWithTag(protoWriter, 7, userInfo.code);
            }
            if (userInfo.collaborator_type != null) {
                CollaboratorType.ADAPTER.encodeWithTag(protoWriter, 8, userInfo.collaborator_type);
            }
            PermissionCode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, userInfo.permission_action);
            if (userInfo.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, userInfo.chat_id);
            }
            protoWriter.writeBytes(userInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.UserInfo$a */
    public static final class C16998a extends Message.Builder<UserInfo, C16998a> {

        /* renamed from: a */
        public String f43627a;

        /* renamed from: b */
        public String f43628b;

        /* renamed from: c */
        public String f43629c;

        /* renamed from: d */
        public String f43630d;

        /* renamed from: e */
        public String f43631e;

        /* renamed from: f */
        public String f43632f;

        /* renamed from: g */
        public PermissionCode f43633g;

        /* renamed from: h */
        public CollaboratorType f43634h;

        /* renamed from: i */
        public List<PermissionCode> f43635i = Internal.newMutableList();

        /* renamed from: j */
        public String f43636j;

        /* renamed from: a */
        public UserInfo build() {
            return new UserInfo(this.f43627a, this.f43628b, this.f43629c, this.f43630d, this.f43631e, this.f43632f, this.f43633g, this.f43634h, this.f43635i, this.f43636j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16998a newBuilder() {
        C16998a aVar = new C16998a();
        aVar.f43627a = this.user_id;
        aVar.f43628b = this.cn_name;
        aVar.f43629c = this.en_name;
        aVar.f43630d = this.email_address;
        aVar.f43631e = this.department;
        aVar.f43632f = this.avatar;
        aVar.f43633g = this.code;
        aVar.f43634h = this.collaborator_type;
        aVar.f43635i = Internal.copyOf("permission_action", this.permission_action);
        aVar.f43636j = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "UserInfo");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.cn_name != null) {
            sb.append(", cn_name=");
            sb.append(this.cn_name);
        }
        if (this.en_name != null) {
            sb.append(", en_name=");
            sb.append(this.en_name);
        }
        if (this.email_address != null) {
            sb.append(", email_address=");
            sb.append(this.email_address);
        }
        if (this.department != null) {
            sb.append(", department=");
            sb.append(this.department);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.collaborator_type != null) {
            sb.append(", collaborator_type=");
            sb.append(this.collaborator_type);
        }
        if (!this.permission_action.isEmpty()) {
            sb.append(", permission_action=");
            sb.append(this.permission_action);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "UserInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UserInfo(String str, String str2, String str3, String str4, String str5, String str6, PermissionCode permissionCode, CollaboratorType collaboratorType, List<PermissionCode> list, String str7) {
        this(str, str2, str3, str4, str5, str6, permissionCode, collaboratorType, list, str7, ByteString.EMPTY);
    }

    public UserInfo(String str, String str2, String str3, String str4, String str5, String str6, PermissionCode permissionCode, CollaboratorType collaboratorType, List<PermissionCode> list, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.cn_name = str2;
        this.en_name = str3;
        this.email_address = str4;
        this.department = str5;
        this.avatar = str6;
        this.code = permissionCode;
        this.collaborator_type = collaboratorType;
        this.permission_action = Internal.immutableCopyOf("permission_action", list);
        this.chat_id = str7;
    }
}
