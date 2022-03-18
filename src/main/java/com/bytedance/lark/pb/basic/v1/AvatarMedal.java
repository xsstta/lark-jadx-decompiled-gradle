package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AvatarMedal extends Message<AvatarMedal, C14694a> {
    public static final ProtoAdapter<AvatarMedal> ADAPTER = new C14695b();
    private static final long serialVersionUID = 0;
    public final String key;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.basic.v1.AvatarMedal$b */
    private static final class C14695b extends ProtoAdapter<AvatarMedal> {
        C14695b() {
            super(FieldEncoding.LENGTH_DELIMITED, AvatarMedal.class);
        }

        /* renamed from: a */
        public int encodedSize(AvatarMedal avatarMedal) {
            int i;
            int i2 = 0;
            if (avatarMedal.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, avatarMedal.key);
            } else {
                i = 0;
            }
            if (avatarMedal.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, avatarMedal.name);
            }
            return i + i2 + avatarMedal.unknownFields().size();
        }

        /* renamed from: a */
        public AvatarMedal decode(ProtoReader protoReader) throws IOException {
            C14694a aVar = new C14694a();
            aVar.f38855a = "";
            aVar.f38856b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38855a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38856b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AvatarMedal avatarMedal) throws IOException {
            if (avatarMedal.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, avatarMedal.key);
            }
            if (avatarMedal.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, avatarMedal.name);
            }
            protoWriter.writeBytes(avatarMedal.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AvatarMedal$a */
    public static final class C14694a extends Message.Builder<AvatarMedal, C14694a> {

        /* renamed from: a */
        public String f38855a;

        /* renamed from: b */
        public String f38856b;

        /* renamed from: a */
        public AvatarMedal build() {
            return new AvatarMedal(this.f38855a, this.f38856b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14694a mo54109a(String str) {
            this.f38855a = str;
            return this;
        }

        /* renamed from: b */
        public C14694a mo54111b(String str) {
            this.f38856b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14694a newBuilder() {
        C14694a aVar = new C14694a();
        aVar.f38855a = this.key;
        aVar.f38856b = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AvatarMedal");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "AvatarMedal{");
        replace.append('}');
        return replace.toString();
    }

    public AvatarMedal(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public AvatarMedal(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.name = str2;
    }
}
