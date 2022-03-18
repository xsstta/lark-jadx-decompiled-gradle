package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class CreateChatRequest extends Message<CreateChatRequest, C17340a> {
    public static final ProtoAdapter<CreateChatRequest> ADAPTER = new C17341b();
    public static final Chat.ChatMode DEFAULT_CHAT_MODE = Chat.ChatMode.UNKNOWN;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_CRYPTO = false;
    public static final Boolean DEFAULT_IS_PUBLIC = false;
    public static final Boolean DEFAULT_IS_PUBLIC_V2 = false;
    public static final Chat.Type DEFAULT_TYPE = Chat.Type.P2P;
    private static final long serialVersionUID = 0;
    public final AvatarMeta avatar_meta;
    public final Chat.ChatMode chat_mode;
    public final String chat_template_id;
    public final List<String> chatter_ids;
    public final CreateP2PChatSource create_p2p_chat_source;
    public final String department_id;
    public final String from_chat_id;
    public final String group_desc;
    public final String group_name;
    public final String icon_key;
    public final List<String> init_message_ids;
    public final Boolean is_cross_tenant;
    public final Boolean is_crypto;
    public final Boolean is_public;
    public final Boolean is_public_v2;
    public final Map<String, DocPermissions> message_doc_permissions;
    public final Map<String, DocPermission> message_id2permission;
    public final List<PickEntities> pick_entities;
    public final Chat.Type type;

    public enum DocPermission implements WireEnum {
        UNKNOWN(0),
        READ(1),
        EDIT(2);
        
        public static final ProtoAdapter<DocPermission> ADAPTER = ProtoAdapter.newEnumAdapter(DocPermission.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DocPermission fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return READ;
            }
            if (i != 2) {
                return null;
            }
            return EDIT;
        }

        private DocPermission(int i) {
            this.value = i;
        }
    }

    public static final class DocPermissions extends Message<DocPermissions, C17338a> {
        public static final ProtoAdapter<DocPermissions> ADAPTER = new C17339b();
        private static final long serialVersionUID = 0;
        public final Map<String, DocPermission> perms;

        /* renamed from: com.bytedance.lark.pb.im.v1.CreateChatRequest$DocPermissions$a */
        public static final class C17338a extends Message.Builder<DocPermissions, C17338a> {

            /* renamed from: a */
            public Map<String, DocPermission> f44193a = Internal.newMutableMap();

            /* renamed from: a */
            public DocPermissions build() {
                return new DocPermissions(this.f44193a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C17338a mo60872a(Map<String, DocPermission> map) {
                Internal.checkElementsNotNull(map);
                this.f44193a = map;
                return this;
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.CreateChatRequest$DocPermissions$b */
        private static final class C17339b extends ProtoAdapter<DocPermissions> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, DocPermission>> f44194a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermission.ADAPTER);

            C17339b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocPermissions.class);
            }

            /* renamed from: a */
            public int encodedSize(DocPermissions docPermissions) {
                return this.f44194a.encodedSizeWithTag(1, docPermissions.perms) + docPermissions.unknownFields().size();
            }

            /* renamed from: a */
            public DocPermissions decode(ProtoReader protoReader) throws IOException {
                C17338a aVar = new C17338a();
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
                        aVar.f44193a.putAll(this.f44194a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocPermissions docPermissions) throws IOException {
                this.f44194a.encodeWithTag(protoWriter, 1, docPermissions.perms);
                protoWriter.writeBytes(docPermissions.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17338a newBuilder() {
            C17338a aVar = new C17338a();
            aVar.f44193a = Internal.copyOf("perms", this.perms);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "DocPermissions");
            StringBuilder sb = new StringBuilder();
            if (!this.perms.isEmpty()) {
                sb.append(", perms=");
                sb.append(this.perms);
            }
            StringBuilder replace = sb.replace(0, 2, "DocPermissions{");
            replace.append('}');
            return replace.toString();
        }

        public DocPermissions(Map<String, DocPermission> map) {
            this(map, ByteString.EMPTY);
        }

        public DocPermissions(Map<String, DocPermission> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.perms = Internal.immutableCopyOf("perms", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateChatRequest$b */
    private static final class C17341b extends ProtoAdapter<CreateChatRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, DocPermission>> f44214a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermission.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, DocPermissions>> f44215b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermissions.ADAPTER);

        C17341b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateChatRequest createChatRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int encodedSizeWithTag = Chat.Type.ADAPTER.encodedSizeWithTag(1, createChatRequest.type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, createChatRequest.chatter_ids);
            int i13 = 0;
            if (createChatRequest.group_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, createChatRequest.group_name);
            } else {
                i = 0;
            }
            int i14 = encodedSizeWithTag + i;
            if (createChatRequest.group_desc != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, createChatRequest.group_desc);
            } else {
                i2 = 0;
            }
            int i15 = i14 + i2;
            if (createChatRequest.is_public != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, createChatRequest.is_public);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (createChatRequest.from_chat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, createChatRequest.from_chat_id);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i16 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, createChatRequest.init_message_ids);
            if (createChatRequest.icon_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, createChatRequest.icon_key);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i5 + this.f44214a.encodedSizeWithTag(9, createChatRequest.message_id2permission);
            if (createChatRequest.is_crypto != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(10, createChatRequest.is_crypto);
            } else {
                i6 = 0;
            }
            int i17 = encodedSizeWithTag3 + i6;
            if (createChatRequest.department_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(11, createChatRequest.department_id);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (createChatRequest.is_cross_tenant != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(12, createChatRequest.is_cross_tenant);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (createChatRequest.is_public_v2 != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(13, createChatRequest.is_public_v2);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (createChatRequest.chat_mode != null) {
                i10 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(14, createChatRequest.chat_mode);
            } else {
                i10 = 0;
            }
            int encodedSizeWithTag4 = i20 + i10 + this.f44215b.encodedSizeWithTag(15, createChatRequest.message_doc_permissions);
            if (createChatRequest.avatar_meta != null) {
                i11 = AvatarMeta.ADAPTER.encodedSizeWithTag(16, createChatRequest.avatar_meta);
            } else {
                i11 = 0;
            }
            int i21 = encodedSizeWithTag4 + i11;
            if (createChatRequest.create_p2p_chat_source != null) {
                i12 = CreateP2PChatSource.ADAPTER.encodedSizeWithTag(17, createChatRequest.create_p2p_chat_source);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag5 = i21 + i12 + PickEntities.ADAPTER.asRepeated().encodedSizeWithTag(19, createChatRequest.pick_entities);
            if (createChatRequest.chat_template_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(21, createChatRequest.chat_template_id);
            }
            return encodedSizeWithTag5 + i13 + createChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateChatRequest decode(ProtoReader protoReader) throws IOException {
            C17340a aVar = new C17340a();
            aVar.f44195a = Chat.Type.P2P;
            aVar.f44197c = "";
            aVar.f44198d = "";
            aVar.f44199e = false;
            aVar.f44200f = "";
            aVar.f44202h = "";
            aVar.f44204j = false;
            aVar.f44205k = "";
            aVar.f44206l = false;
            aVar.f44207m = false;
            aVar.f44208n = Chat.ChatMode.UNKNOWN;
            aVar.f44213s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f44195a = Chat.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f44196b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f44197c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44198d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44199e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44200f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44201g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f44202h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44203i.putAll(this.f44214a.decode(protoReader));
                            break;
                        case 10:
                            aVar.f44204j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f44205k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f44206l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f44207m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f44208n = Chat.ChatMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 15:
                            aVar.f44209o.putAll(this.f44215b.decode(protoReader));
                            break;
                        case 16:
                            aVar.f44210p = AvatarMeta.ADAPTER.decode(protoReader);
                            break;
                        case 17:
                            aVar.f44211q = CreateP2PChatSource.ADAPTER.decode(protoReader);
                            break;
                        case 18:
                        case 20:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 19:
                            aVar.f44212r.add(PickEntities.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            aVar.f44213s = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateChatRequest createChatRequest) throws IOException {
            Chat.Type.ADAPTER.encodeWithTag(protoWriter, 1, createChatRequest.type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, createChatRequest.chatter_ids);
            if (createChatRequest.group_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createChatRequest.group_name);
            }
            if (createChatRequest.group_desc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createChatRequest.group_desc);
            }
            if (createChatRequest.is_public != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, createChatRequest.is_public);
            }
            if (createChatRequest.from_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, createChatRequest.from_chat_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, createChatRequest.init_message_ids);
            if (createChatRequest.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, createChatRequest.icon_key);
            }
            this.f44214a.encodeWithTag(protoWriter, 9, createChatRequest.message_id2permission);
            if (createChatRequest.is_crypto != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, createChatRequest.is_crypto);
            }
            if (createChatRequest.department_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, createChatRequest.department_id);
            }
            if (createChatRequest.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, createChatRequest.is_cross_tenant);
            }
            if (createChatRequest.is_public_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, createChatRequest.is_public_v2);
            }
            if (createChatRequest.chat_mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 14, createChatRequest.chat_mode);
            }
            this.f44215b.encodeWithTag(protoWriter, 15, createChatRequest.message_doc_permissions);
            if (createChatRequest.avatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 16, createChatRequest.avatar_meta);
            }
            if (createChatRequest.create_p2p_chat_source != null) {
                CreateP2PChatSource.ADAPTER.encodeWithTag(protoWriter, 17, createChatRequest.create_p2p_chat_source);
            }
            PickEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 19, createChatRequest.pick_entities);
            if (createChatRequest.chat_template_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, createChatRequest.chat_template_id);
            }
            protoWriter.writeBytes(createChatRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17340a newBuilder() {
        C17340a aVar = new C17340a();
        aVar.f44195a = this.type;
        aVar.f44196b = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44197c = this.group_name;
        aVar.f44198d = this.group_desc;
        aVar.f44199e = this.is_public;
        aVar.f44200f = this.from_chat_id;
        aVar.f44201g = Internal.copyOf("init_message_ids", this.init_message_ids);
        aVar.f44202h = this.icon_key;
        aVar.f44203i = Internal.copyOf("message_id2permission", this.message_id2permission);
        aVar.f44204j = this.is_crypto;
        aVar.f44205k = this.department_id;
        aVar.f44206l = this.is_cross_tenant;
        aVar.f44207m = this.is_public_v2;
        aVar.f44208n = this.chat_mode;
        aVar.f44209o = Internal.copyOf("message_doc_permissions", this.message_doc_permissions);
        aVar.f44210p = this.avatar_meta;
        aVar.f44211q = this.create_p2p_chat_source;
        aVar.f44212r = Internal.copyOf("pick_entities", this.pick_entities);
        aVar.f44213s = this.chat_template_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateChatRequest$a */
    public static final class C17340a extends Message.Builder<CreateChatRequest, C17340a> {

        /* renamed from: a */
        public Chat.Type f44195a;

        /* renamed from: b */
        public List<String> f44196b = Internal.newMutableList();

        /* renamed from: c */
        public String f44197c;

        /* renamed from: d */
        public String f44198d;

        /* renamed from: e */
        public Boolean f44199e;

        /* renamed from: f */
        public String f44200f;

        /* renamed from: g */
        public List<String> f44201g = Internal.newMutableList();

        /* renamed from: h */
        public String f44202h;

        /* renamed from: i */
        public Map<String, DocPermission> f44203i = Internal.newMutableMap();

        /* renamed from: j */
        public Boolean f44204j;

        /* renamed from: k */
        public String f44205k;

        /* renamed from: l */
        public Boolean f44206l;

        /* renamed from: m */
        public Boolean f44207m;

        /* renamed from: n */
        public Chat.ChatMode f44208n;

        /* renamed from: o */
        public Map<String, DocPermissions> f44209o = Internal.newMutableMap();

        /* renamed from: p */
        public AvatarMeta f44210p;

        /* renamed from: q */
        public CreateP2PChatSource f44211q;

        /* renamed from: r */
        public List<PickEntities> f44212r = Internal.newMutableList();

        /* renamed from: s */
        public String f44213s;

        /* renamed from: a */
        public CreateChatRequest build() {
            Chat.Type type = this.f44195a;
            if (type != null) {
                return new CreateChatRequest(type, this.f44196b, this.f44197c, this.f44198d, this.f44199e, this.f44200f, this.f44201g, this.f44202h, this.f44203i, this.f44204j, this.f44205k, this.f44206l, this.f44207m, this.f44208n, this.f44209o, this.f44210p, this.f44211q, this.f44212r, this.f44213s, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C17340a mo60877a(Chat.ChatMode chatMode) {
            this.f44208n = chatMode;
            return this;
        }

        /* renamed from: b */
        public C17340a mo60885b(Boolean bool) {
            this.f44206l = bool;
            return this;
        }

        /* renamed from: c */
        public C17340a mo60888c(Boolean bool) {
            this.f44207m = bool;
            return this;
        }

        /* renamed from: a */
        public C17340a mo60878a(Chat.Type type) {
            this.f44195a = type;
            return this;
        }

        /* renamed from: b */
        public C17340a mo60886b(String str) {
            this.f44198d = str;
            return this;
        }

        /* renamed from: c */
        public C17340a mo60889c(String str) {
            this.f44200f = str;
            return this;
        }

        /* renamed from: a */
        public C17340a mo60879a(CreateP2PChatSource createP2PChatSource) {
            this.f44211q = createP2PChatSource;
            return this;
        }

        /* renamed from: b */
        public C17340a mo60887b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44201g = list;
            return this;
        }

        /* renamed from: c */
        public C17340a mo60890c(List<PickEntities> list) {
            Internal.checkElementsNotNull(list);
            this.f44212r = list;
            return this;
        }

        /* renamed from: a */
        public C17340a mo60880a(Boolean bool) {
            this.f44204j = bool;
            return this;
        }

        /* renamed from: a */
        public C17340a mo60881a(String str) {
            this.f44197c = str;
            return this;
        }

        /* renamed from: a */
        public C17340a mo60882a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44196b = list;
            return this;
        }

        /* renamed from: a */
        public C17340a mo60883a(Map<String, DocPermissions> map) {
            Internal.checkElementsNotNull(map);
            this.f44209o = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.group_name != null) {
            sb.append(", group_name=");
            sb.append(this.group_name);
        }
        if (this.group_desc != null) {
            sb.append(", group_desc=");
            sb.append(this.group_desc);
        }
        if (this.is_public != null) {
            sb.append(", is_public=");
            sb.append(this.is_public);
        }
        if (this.from_chat_id != null) {
            sb.append(", from_chat_id=");
            sb.append(this.from_chat_id);
        }
        if (!this.init_message_ids.isEmpty()) {
            sb.append(", init_message_ids=");
            sb.append(this.init_message_ids);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (!this.message_id2permission.isEmpty()) {
            sb.append(", message_id2permission=");
            sb.append(this.message_id2permission);
        }
        if (this.is_crypto != null) {
            sb.append(", is_crypto=");
            sb.append(this.is_crypto);
        }
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.is_public_v2 != null) {
            sb.append(", is_public_v2=");
            sb.append(this.is_public_v2);
        }
        if (this.chat_mode != null) {
            sb.append(", chat_mode=");
            sb.append(this.chat_mode);
        }
        if (!this.message_doc_permissions.isEmpty()) {
            sb.append(", message_doc_permissions=");
            sb.append(this.message_doc_permissions);
        }
        if (this.avatar_meta != null) {
            sb.append(", avatar_meta=");
            sb.append(this.avatar_meta);
        }
        if (this.create_p2p_chat_source != null) {
            sb.append(", create_p2p_chat_source=");
            sb.append(this.create_p2p_chat_source);
        }
        if (!this.pick_entities.isEmpty()) {
            sb.append(", pick_entities=");
            sb.append(this.pick_entities);
        }
        if (this.chat_template_id != null) {
            sb.append(", chat_template_id=");
            sb.append(this.chat_template_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateChatRequest(Chat.Type type2, List<String> list, String str, String str2, Boolean bool, String str3, List<String> list2, String str4, Map<String, DocPermission> map, Boolean bool2, String str5, Boolean bool3, Boolean bool4, Chat.ChatMode chatMode, Map<String, DocPermissions> map2, AvatarMeta avatarMeta, CreateP2PChatSource createP2PChatSource, List<PickEntities> list3, String str6) {
        this(type2, list, str, str2, bool, str3, list2, str4, map, bool2, str5, bool3, bool4, chatMode, map2, avatarMeta, createP2PChatSource, list3, str6, ByteString.EMPTY);
    }

    public CreateChatRequest(Chat.Type type2, List<String> list, String str, String str2, Boolean bool, String str3, List<String> list2, String str4, Map<String, DocPermission> map, Boolean bool2, String str5, Boolean bool3, Boolean bool4, Chat.ChatMode chatMode, Map<String, DocPermissions> map2, AvatarMeta avatarMeta, CreateP2PChatSource createP2PChatSource, List<PickEntities> list3, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.group_name = str;
        this.group_desc = str2;
        this.is_public = bool;
        this.from_chat_id = str3;
        this.init_message_ids = Internal.immutableCopyOf("init_message_ids", list2);
        this.icon_key = str4;
        this.message_id2permission = Internal.immutableCopyOf("message_id2permission", map);
        this.is_crypto = bool2;
        this.department_id = str5;
        this.is_cross_tenant = bool3;
        this.is_public_v2 = bool4;
        this.chat_mode = chatMode;
        this.message_doc_permissions = Internal.immutableCopyOf("message_doc_permissions", map2);
        this.avatar_meta = avatarMeta;
        this.create_p2p_chat_source = createP2PChatSource;
        this.pick_entities = Internal.immutableCopyOf("pick_entities", list3);
        this.chat_template_id = str6;
    }
}
