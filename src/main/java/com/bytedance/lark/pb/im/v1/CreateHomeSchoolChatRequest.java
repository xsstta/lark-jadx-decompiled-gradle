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
import okio.ByteString;

public final class CreateHomeSchoolChatRequest extends Message<CreateHomeSchoolChatRequest, C17360a> {
    public static final ProtoAdapter<CreateHomeSchoolChatRequest> ADAPTER = new C17361b();
    private static final long serialVersionUID = 0;
    public final AvatarMeta avatar_meta;
    public final String class_id;
    public final String icon_key;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateHomeSchoolChatRequest$b */
    private static final class C17361b extends ProtoAdapter<CreateHomeSchoolChatRequest> {
        C17361b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateHomeSchoolChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateHomeSchoolChatRequest createHomeSchoolChatRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createHomeSchoolChatRequest.class_id);
            int i3 = 0;
            if (createHomeSchoolChatRequest.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, createHomeSchoolChatRequest.name);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (createHomeSchoolChatRequest.icon_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, createHomeSchoolChatRequest.icon_key);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (createHomeSchoolChatRequest.avatar_meta != null) {
                i3 = AvatarMeta.ADAPTER.encodedSizeWithTag(4, createHomeSchoolChatRequest.avatar_meta);
            }
            return i5 + i3 + createHomeSchoolChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateHomeSchoolChatRequest decode(ProtoReader protoReader) throws IOException {
            C17360a aVar = new C17360a();
            aVar.f44240a = "";
            aVar.f44241b = "";
            aVar.f44242c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44240a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44241b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44242c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44243d = AvatarMeta.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateHomeSchoolChatRequest createHomeSchoolChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createHomeSchoolChatRequest.class_id);
            if (createHomeSchoolChatRequest.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createHomeSchoolChatRequest.name);
            }
            if (createHomeSchoolChatRequest.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createHomeSchoolChatRequest.icon_key);
            }
            if (createHomeSchoolChatRequest.avatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 4, createHomeSchoolChatRequest.avatar_meta);
            }
            protoWriter.writeBytes(createHomeSchoolChatRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17360a newBuilder() {
        C17360a aVar = new C17360a();
        aVar.f44240a = this.class_id;
        aVar.f44241b = this.name;
        aVar.f44242c = this.icon_key;
        aVar.f44243d = this.avatar_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateHomeSchoolChatRequest$a */
    public static final class C17360a extends Message.Builder<CreateHomeSchoolChatRequest, C17360a> {

        /* renamed from: a */
        public String f44240a;

        /* renamed from: b */
        public String f44241b;

        /* renamed from: c */
        public String f44242c;

        /* renamed from: d */
        public AvatarMeta f44243d;

        /* renamed from: a */
        public CreateHomeSchoolChatRequest build() {
            String str = this.f44240a;
            if (str != null) {
                return new CreateHomeSchoolChatRequest(str, this.f44241b, this.f44242c, this.f44243d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "class_id");
        }

        /* renamed from: a */
        public C17360a mo60941a(String str) {
            this.f44240a = str;
            return this;
        }

        /* renamed from: b */
        public C17360a mo60943b(String str) {
            this.f44241b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateHomeSchoolChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", class_id=");
        sb.append(this.class_id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.avatar_meta != null) {
            sb.append(", avatar_meta=");
            sb.append(this.avatar_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateHomeSchoolChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateHomeSchoolChatRequest(String str, String str2, String str3, AvatarMeta avatarMeta) {
        this(str, str2, str3, avatarMeta, ByteString.EMPTY);
    }

    public CreateHomeSchoolChatRequest(String str, String str2, String str3, AvatarMeta avatarMeta, ByteString byteString) {
        super(ADAPTER, byteString);
        this.class_id = str;
        this.name = str2;
        this.icon_key = str3;
        this.avatar_meta = avatarMeta;
    }
}
