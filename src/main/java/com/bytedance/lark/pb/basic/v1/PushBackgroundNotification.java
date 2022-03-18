package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushBackgroundNotification extends Message<PushBackgroundNotification, C15127a> {
    public static final ProtoAdapter<PushBackgroundNotification> ADAPTER = new C15128b();
    private static final long serialVersionUID = 0;
    public final String collapse_id;
    public final String content;
    public final String extra;
    public final String msg_type;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushBackgroundNotification$b */
    private static final class C15128b extends ProtoAdapter<PushBackgroundNotification> {
        C15128b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushBackgroundNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushBackgroundNotification pushBackgroundNotification) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (pushBackgroundNotification.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushBackgroundNotification.title);
            } else {
                i = 0;
            }
            if (pushBackgroundNotification.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushBackgroundNotification.content);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (pushBackgroundNotification.extra != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushBackgroundNotification.extra);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (pushBackgroundNotification.collapse_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushBackgroundNotification.collapse_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (pushBackgroundNotification.msg_type != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, pushBackgroundNotification.msg_type);
            }
            return i8 + i5 + pushBackgroundNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushBackgroundNotification decode(ProtoReader protoReader) throws IOException {
            C15127a aVar = new C15127a();
            aVar.f40100a = "";
            aVar.f40101b = "";
            aVar.f40102c = "";
            aVar.f40103d = "";
            aVar.f40104e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40100a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40101b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40102c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f40103d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40104e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushBackgroundNotification pushBackgroundNotification) throws IOException {
            if (pushBackgroundNotification.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushBackgroundNotification.title);
            }
            if (pushBackgroundNotification.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushBackgroundNotification.content);
            }
            if (pushBackgroundNotification.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushBackgroundNotification.extra);
            }
            if (pushBackgroundNotification.collapse_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushBackgroundNotification.collapse_id);
            }
            if (pushBackgroundNotification.msg_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pushBackgroundNotification.msg_type);
            }
            protoWriter.writeBytes(pushBackgroundNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushBackgroundNotification$a */
    public static final class C15127a extends Message.Builder<PushBackgroundNotification, C15127a> {

        /* renamed from: a */
        public String f40100a;

        /* renamed from: b */
        public String f40101b;

        /* renamed from: c */
        public String f40102c;

        /* renamed from: d */
        public String f40103d;

        /* renamed from: e */
        public String f40104e;

        /* renamed from: a */
        public PushBackgroundNotification build() {
            return new PushBackgroundNotification(this.f40100a, this.f40101b, this.f40102c, this.f40103d, this.f40104e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15127a newBuilder() {
        C15127a aVar = new C15127a();
        aVar.f40100a = this.title;
        aVar.f40101b = this.content;
        aVar.f40102c = this.extra;
        aVar.f40103d = this.collapse_id;
        aVar.f40104e = this.msg_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PushBackgroundNotification");
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.collapse_id != null) {
            sb.append(", collapse_id=");
            sb.append(this.collapse_id);
        }
        if (this.msg_type != null) {
            sb.append(", msg_type=");
            sb.append(this.msg_type);
        }
        StringBuilder replace = sb.replace(0, 2, "PushBackgroundNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushBackgroundNotification(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public PushBackgroundNotification(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.content = str2;
        this.extra = str3;
        this.collapse_id = str4;
        this.msg_type = str5;
    }
}
