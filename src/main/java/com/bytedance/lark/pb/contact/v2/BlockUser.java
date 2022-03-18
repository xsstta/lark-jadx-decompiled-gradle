package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BlockUser extends Message<BlockUser, C16424a> {
    public static final ProtoAdapter<BlockUser> ADAPTER = new C16425b();
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String tenant_name;
    public final String user_id;
    public final String user_name;

    /* renamed from: com.bytedance.lark.pb.contact.v2.BlockUser$b */
    private static final class C16425b extends ProtoAdapter<BlockUser> {
        C16425b() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockUser.class);
        }

        /* renamed from: a */
        public int encodedSize(BlockUser blockUser) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (blockUser.avatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, blockUser.avatar_key);
            } else {
                i = 0;
            }
            if (blockUser.user_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, blockUser.user_name);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (blockUser.user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, blockUser.user_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (blockUser.tenant_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, blockUser.tenant_name);
            }
            return i6 + i4 + blockUser.unknownFields().size();
        }

        /* renamed from: a */
        public BlockUser decode(ProtoReader protoReader) throws IOException {
            C16424a aVar = new C16424a();
            aVar.f42719a = "";
            aVar.f42720b = "";
            aVar.f42721c = "";
            aVar.f42722d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42719a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42720b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42721c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42722d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BlockUser blockUser) throws IOException {
            if (blockUser.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockUser.avatar_key);
            }
            if (blockUser.user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, blockUser.user_name);
            }
            if (blockUser.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, blockUser.user_id);
            }
            if (blockUser.tenant_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, blockUser.tenant_name);
            }
            protoWriter.writeBytes(blockUser.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.BlockUser$a */
    public static final class C16424a extends Message.Builder<BlockUser, C16424a> {

        /* renamed from: a */
        public String f42719a;

        /* renamed from: b */
        public String f42720b;

        /* renamed from: c */
        public String f42721c;

        /* renamed from: d */
        public String f42722d;

        /* renamed from: a */
        public BlockUser build() {
            return new BlockUser(this.f42719a, this.f42720b, this.f42721c, this.f42722d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16424a newBuilder() {
        C16424a aVar = new C16424a();
        aVar.f42719a = this.avatar_key;
        aVar.f42720b = this.user_name;
        aVar.f42721c = this.user_id;
        aVar.f42722d = this.tenant_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "BlockUser");
        StringBuilder sb = new StringBuilder();
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.user_name != null) {
            sb.append(", user_name=");
            sb.append(this.user_name);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.tenant_name != null) {
            sb.append(", tenant_name=");
            sb.append(this.tenant_name);
        }
        StringBuilder replace = sb.replace(0, 2, "BlockUser{");
        replace.append('}');
        return replace.toString();
    }

    public BlockUser(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public BlockUser(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatar_key = str;
        this.user_name = str2;
        this.user_id = str3;
        this.tenant_name = str4;
    }
}
