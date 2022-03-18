package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Hashtag extends Message<Hashtag, C18404a> {
    public static final ProtoAdapter<Hashtag> ADAPTER = new C18405b();
    private static final long serialVersionUID = 0;
    public final String content;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Hashtag$b */
    private static final class C18405b extends ProtoAdapter<Hashtag> {
        C18405b() {
            super(FieldEncoding.LENGTH_DELIMITED, Hashtag.class);
        }

        /* renamed from: a */
        public int encodedSize(Hashtag hashtag) {
            int i;
            int i2 = 0;
            if (hashtag.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, hashtag.id);
            } else {
                i = 0;
            }
            if (hashtag.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, hashtag.content);
            }
            return i + i2 + hashtag.unknownFields().size();
        }

        /* renamed from: a */
        public Hashtag decode(ProtoReader protoReader) throws IOException {
            C18404a aVar = new C18404a();
            aVar.f45786a = "";
            aVar.f45787b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45786a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45787b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Hashtag hashtag) throws IOException {
            if (hashtag.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hashtag.id);
            }
            if (hashtag.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hashtag.content);
            }
            protoWriter.writeBytes(hashtag.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Hashtag$a */
    public static final class C18404a extends Message.Builder<Hashtag, C18404a> {

        /* renamed from: a */
        public String f45786a;

        /* renamed from: b */
        public String f45787b;

        /* renamed from: a */
        public Hashtag build() {
            return new Hashtag(this.f45786a, this.f45787b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18404a newBuilder() {
        C18404a aVar = new C18404a();
        aVar.f45786a = this.id;
        aVar.f45787b = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Hashtag");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "Hashtag{");
        replace.append('}');
        return replace.toString();
    }

    public Hashtag(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public Hashtag(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.content = str2;
    }
}
