package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Emoji extends Message<Emoji, C17454a> {
    public static final ProtoAdapter<Emoji> ADAPTER = new C17455b();
    public static final Boolean DEFAULT_IS_DELETED = false;
    private static final long serialVersionUID = 0;
    public final String image_key;
    public final Boolean is_deleted;
    public final String key;
    public final String text;

    /* renamed from: com.bytedance.lark.pb.im.v1.Emoji$b */
    private static final class C17455b extends ProtoAdapter<Emoji> {
        C17455b() {
            super(FieldEncoding.LENGTH_DELIMITED, Emoji.class);
        }

        /* renamed from: a */
        public int encodedSize(Emoji emoji) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (emoji.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, emoji.key);
            } else {
                i = 0;
            }
            if (emoji.text != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, emoji.text);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (emoji.image_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, emoji.image_key);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (emoji.is_deleted != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, emoji.is_deleted);
            }
            return i6 + i4 + emoji.unknownFields().size();
        }

        /* renamed from: a */
        public Emoji decode(ProtoReader protoReader) throws IOException {
            C17454a aVar = new C17454a();
            aVar.f44343a = "";
            aVar.f44344b = "";
            aVar.f44345c = "";
            aVar.f44346d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44343a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44344b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44345c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44346d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Emoji emoji) throws IOException {
            if (emoji.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, emoji.key);
            }
            if (emoji.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, emoji.text);
            }
            if (emoji.image_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, emoji.image_key);
            }
            if (emoji.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, emoji.is_deleted);
            }
            protoWriter.writeBytes(emoji.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.Emoji$a */
    public static final class C17454a extends Message.Builder<Emoji, C17454a> {

        /* renamed from: a */
        public String f44343a;

        /* renamed from: b */
        public String f44344b;

        /* renamed from: c */
        public String f44345c;

        /* renamed from: d */
        public Boolean f44346d;

        /* renamed from: a */
        public Emoji build() {
            return new Emoji(this.f44343a, this.f44344b, this.f44345c, this.f44346d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17454a newBuilder() {
        C17454a aVar = new C17454a();
        aVar.f44343a = this.key;
        aVar.f44344b = this.text;
        aVar.f44345c = this.image_key;
        aVar.f44346d = this.is_deleted;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "Emoji");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.image_key != null) {
            sb.append(", image_key=");
            sb.append(this.image_key);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
        }
        StringBuilder replace = sb.replace(0, 2, "Emoji{");
        replace.append('}');
        return replace.toString();
    }

    public Emoji(String str, String str2, String str3, Boolean bool) {
        this(str, str2, str3, bool, ByteString.EMPTY);
    }

    public Emoji(String str, String str2, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.text = str2;
        this.image_key = str3;
        this.is_deleted = bool;
    }
}
