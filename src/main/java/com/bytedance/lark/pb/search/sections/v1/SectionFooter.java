package com.bytedance.lark.pb.search.sections.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SectionFooter extends Message<SectionFooter, C18795a> {
    public static final ProtoAdapter<SectionFooter> ADAPTER = new C18796b();
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String avatar_key;
    public final String text;

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.SectionFooter$b */
    private static final class C18796b extends ProtoAdapter<SectionFooter> {
        C18796b() {
            super(FieldEncoding.LENGTH_DELIMITED, SectionFooter.class);
        }

        /* renamed from: a */
        public int encodedSize(SectionFooter sectionFooter) {
            int i;
            int i2;
            int i3 = 0;
            if (sectionFooter.avatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sectionFooter.avatar_key);
            } else {
                i = 0;
            }
            if (sectionFooter.text != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sectionFooter.text);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (sectionFooter.action != null) {
                i3 = Action.ADAPTER.encodedSizeWithTag(3, sectionFooter.action);
            }
            return i4 + i3 + sectionFooter.unknownFields().size();
        }

        /* renamed from: a */
        public SectionFooter decode(ProtoReader protoReader) throws IOException {
            C18795a aVar = new C18795a();
            aVar.f46357a = "";
            aVar.f46358b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46357a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46358b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46359c = Action.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SectionFooter sectionFooter) throws IOException {
            if (sectionFooter.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sectionFooter.avatar_key);
            }
            if (sectionFooter.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sectionFooter.text);
            }
            if (sectionFooter.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 3, sectionFooter.action);
            }
            protoWriter.writeBytes(sectionFooter.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.SectionFooter$a */
    public static final class C18795a extends Message.Builder<SectionFooter, C18795a> {

        /* renamed from: a */
        public String f46357a;

        /* renamed from: b */
        public String f46358b;

        /* renamed from: c */
        public Action f46359c;

        /* renamed from: a */
        public SectionFooter build() {
            return new SectionFooter(this.f46357a, this.f46358b, this.f46359c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18795a newBuilder() {
        C18795a aVar = new C18795a();
        aVar.f46357a = this.avatar_key;
        aVar.f46358b = this.text;
        aVar.f46359c = this.action;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SectionFooter");
        StringBuilder sb = new StringBuilder();
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        StringBuilder replace = sb.replace(0, 2, "SectionFooter{");
        replace.append('}');
        return replace.toString();
    }

    public SectionFooter(String str, String str2, Action action2) {
        this(str, str2, action2, ByteString.EMPTY);
    }

    public SectionFooter(String str, String str2, Action action2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatar_key = str;
        this.text = str2;
        this.action = action2;
    }
}
