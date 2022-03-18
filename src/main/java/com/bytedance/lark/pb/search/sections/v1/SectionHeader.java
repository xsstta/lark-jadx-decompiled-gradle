package com.bytedance.lark.pb.search.sections.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SectionHeader extends Message<SectionHeader, C18797a> {
    public static final ProtoAdapter<SectionHeader> ADAPTER = new C18798b();
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String avatar_url;
    public final String title;
    public final List<Modifier> title_modifiers;

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.SectionHeader$b */
    private static final class C18798b extends ProtoAdapter<SectionHeader> {
        C18798b() {
            super(FieldEncoding.LENGTH_DELIMITED, SectionHeader.class);
        }

        /* renamed from: a */
        public int encodedSize(SectionHeader sectionHeader) {
            int i;
            int i2;
            int i3 = 0;
            if (sectionHeader.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sectionHeader.title);
            } else {
                i = 0;
            }
            if (sectionHeader.avatar_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sectionHeader.avatar_key);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (sectionHeader.avatar_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sectionHeader.avatar_url);
            }
            return i4 + i3 + Modifier.ADAPTER.asRepeated().encodedSizeWithTag(4, sectionHeader.title_modifiers) + sectionHeader.unknownFields().size();
        }

        /* renamed from: a */
        public SectionHeader decode(ProtoReader protoReader) throws IOException {
            C18797a aVar = new C18797a();
            aVar.f46360a = "";
            aVar.f46361b = "";
            aVar.f46362c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46360a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46361b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46362c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46363d.add(Modifier.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SectionHeader sectionHeader) throws IOException {
            if (sectionHeader.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sectionHeader.title);
            }
            if (sectionHeader.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sectionHeader.avatar_key);
            }
            if (sectionHeader.avatar_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sectionHeader.avatar_url);
            }
            Modifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, sectionHeader.title_modifiers);
            protoWriter.writeBytes(sectionHeader.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.SectionHeader$a */
    public static final class C18797a extends Message.Builder<SectionHeader, C18797a> {

        /* renamed from: a */
        public String f46360a;

        /* renamed from: b */
        public String f46361b;

        /* renamed from: c */
        public String f46362c;

        /* renamed from: d */
        public List<Modifier> f46363d = Internal.newMutableList();

        /* renamed from: a */
        public SectionHeader build() {
            return new SectionHeader(this.f46360a, this.f46361b, this.f46362c, this.f46363d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18797a newBuilder() {
        C18797a aVar = new C18797a();
        aVar.f46360a = this.title;
        aVar.f46361b = this.avatar_key;
        aVar.f46362c = this.avatar_url;
        aVar.f46363d = Internal.copyOf("title_modifiers", this.title_modifiers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SectionHeader");
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        if (!this.title_modifiers.isEmpty()) {
            sb.append(", title_modifiers=");
            sb.append(this.title_modifiers);
        }
        StringBuilder replace = sb.replace(0, 2, "SectionHeader{");
        replace.append('}');
        return replace.toString();
    }

    public SectionHeader(String str, String str2, String str3, List<Modifier> list) {
        this(str, str2, str3, list, ByteString.EMPTY);
    }

    public SectionHeader(String str, String str2, String str3, List<Modifier> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.avatar_key = str2;
        this.avatar_url = str3;
        this.title_modifiers = Internal.immutableCopyOf("title_modifiers", list);
    }
}
