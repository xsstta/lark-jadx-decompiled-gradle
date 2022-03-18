package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Class extends Message<Class, C17330a> {
    public static final ProtoAdapter<Class> ADAPTER = new C17331b();
    public static final Boolean DEFAULT_HAS_CHAT = false;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Boolean has_chat;
    public final String id;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.im.v1.Class$b */
    private static final class C17331b extends ProtoAdapter<Class> {
        C17331b() {
            super(FieldEncoding.LENGTH_DELIMITED, Class.class);
        }

        /* renamed from: a */
        public int encodedSize(Class r5) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, r5.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, r5.name) + ProtoAdapter.BOOL.encodedSizeWithTag(3, r5.has_chat);
            if (r5.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, r5.chat_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + r5.unknownFields().size();
        }

        /* renamed from: a */
        public Class decode(ProtoReader protoReader) throws IOException {
            C17330a aVar = new C17330a();
            aVar.f44180a = "";
            aVar.f44181b = "";
            aVar.f44182c = false;
            aVar.f44183d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44180a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44181b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44182c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44183d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Class r5) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, r5.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, r5.name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, r5.has_chat);
            if (r5.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, r5.chat_id);
            }
            protoWriter.writeBytes(r5.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17330a newBuilder() {
        C17330a aVar = new C17330a();
        aVar.f44180a = this.id;
        aVar.f44181b = this.name;
        aVar.f44182c = this.has_chat;
        aVar.f44183d = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.Class$a */
    public static final class C17330a extends Message.Builder<Class, C17330a> {

        /* renamed from: a */
        public String f44180a;

        /* renamed from: b */
        public String f44181b;

        /* renamed from: c */
        public Boolean f44182c;

        /* renamed from: d */
        public String f44183d;

        /* renamed from: a */
        public Class build() {
            String str;
            Boolean bool;
            String str2 = this.f44180a;
            if (str2 != null && (str = this.f44181b) != null && (bool = this.f44182c) != null) {
                return new Class(str2, str, bool, this.f44183d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f44181b, "name", this.f44182c, "has_chat");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "Class");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", has_chat=");
        sb.append(this.has_chat);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "Class{");
        replace.append('}');
        return replace.toString();
    }

    public Class(String str, String str2, Boolean bool, String str3) {
        this(str, str2, bool, str3, ByteString.EMPTY);
    }

    public Class(String str, String str2, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.has_chat = bool;
        this.chat_id = str3;
    }
}
