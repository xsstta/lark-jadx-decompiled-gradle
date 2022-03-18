package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateDepartmentChatRequest extends Message<CreateDepartmentChatRequest, C17348a> {
    public static final ProtoAdapter<CreateDepartmentChatRequest> ADAPTER = new C17349b();
    private static final long serialVersionUID = 0;
    public final AvatarMeta avatar_meta;
    public final List<String> chatter_ids;
    public final String department_id;
    public final String group_desc;
    public final String icon_key;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateDepartmentChatRequest$b */
    private static final class C17349b extends ProtoAdapter<CreateDepartmentChatRequest> {
        C17349b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateDepartmentChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateDepartmentChatRequest createDepartmentChatRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createDepartmentChatRequest.department_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, createDepartmentChatRequest.chatter_ids);
            int i3 = 0;
            if (createDepartmentChatRequest.group_desc != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, createDepartmentChatRequest.group_desc);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (createDepartmentChatRequest.icon_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, createDepartmentChatRequest.icon_key);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (createDepartmentChatRequest.avatar_meta != null) {
                i3 = AvatarMeta.ADAPTER.encodedSizeWithTag(5, createDepartmentChatRequest.avatar_meta);
            }
            return i5 + i3 + createDepartmentChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateDepartmentChatRequest decode(ProtoReader protoReader) throws IOException {
            C17348a aVar = new C17348a();
            aVar.f44225a = "";
            aVar.f44227c = "";
            aVar.f44228d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44225a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44226b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44227c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44228d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44229e = AvatarMeta.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateDepartmentChatRequest createDepartmentChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createDepartmentChatRequest.department_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, createDepartmentChatRequest.chatter_ids);
            if (createDepartmentChatRequest.group_desc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createDepartmentChatRequest.group_desc);
            }
            if (createDepartmentChatRequest.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createDepartmentChatRequest.icon_key);
            }
            if (createDepartmentChatRequest.avatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 5, createDepartmentChatRequest.avatar_meta);
            }
            protoWriter.writeBytes(createDepartmentChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateDepartmentChatRequest$a */
    public static final class C17348a extends Message.Builder<CreateDepartmentChatRequest, C17348a> {

        /* renamed from: a */
        public String f44225a;

        /* renamed from: b */
        public List<String> f44226b = Internal.newMutableList();

        /* renamed from: c */
        public String f44227c;

        /* renamed from: d */
        public String f44228d;

        /* renamed from: e */
        public AvatarMeta f44229e;

        /* renamed from: a */
        public CreateDepartmentChatRequest build() {
            String str = this.f44225a;
            if (str != null) {
                return new CreateDepartmentChatRequest(str, this.f44226b, this.f44227c, this.f44228d, this.f44229e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "department_id");
        }

        /* renamed from: a */
        public C17348a mo60910a(String str) {
            this.f44225a = str;
            return this;
        }

        /* renamed from: b */
        public C17348a mo60913b(String str) {
            this.f44227c = str;
            return this;
        }

        /* renamed from: c */
        public C17348a mo60914c(String str) {
            this.f44228d = str;
            return this;
        }

        /* renamed from: a */
        public C17348a mo60911a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44226b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17348a newBuilder() {
        C17348a aVar = new C17348a();
        aVar.f44225a = this.department_id;
        aVar.f44226b = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44227c = this.group_desc;
        aVar.f44228d = this.icon_key;
        aVar.f44229e = this.avatar_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateDepartmentChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", department_id=");
        sb.append(this.department_id);
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.group_desc != null) {
            sb.append(", group_desc=");
            sb.append(this.group_desc);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.avatar_meta != null) {
            sb.append(", avatar_meta=");
            sb.append(this.avatar_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateDepartmentChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateDepartmentChatRequest(String str, List<String> list, String str2, String str3, AvatarMeta avatarMeta) {
        this(str, list, str2, str3, avatarMeta, ByteString.EMPTY);
    }

    public CreateDepartmentChatRequest(String str, List<String> list, String str2, String str3, AvatarMeta avatarMeta, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_id = str;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.group_desc = str2;
        this.icon_key = str3;
        this.avatar_meta = avatarMeta;
    }
}
