package com.ss.android.lark.pb.section;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.Image;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SectionHeader extends Message<SectionHeader, C50056a> {
    public static final ProtoAdapter<SectionHeader> ADAPTER = new C50057b();
    private static final long serialVersionUID = 0;
    public final Image mavatar;
    public final String mavatar_key;
    public final String mavatar_url;
    public final String mtitle;
    public final List<Modifier> mtitle_modifiers;

    /* renamed from: com.ss.android.lark.pb.section.SectionHeader$b */
    private static final class C50057b extends ProtoAdapter<SectionHeader> {
        C50057b() {
            super(FieldEncoding.LENGTH_DELIMITED, SectionHeader.class);
        }

        /* renamed from: a */
        public int encodedSize(SectionHeader sectionHeader) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (sectionHeader.mtitle != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sectionHeader.mtitle);
            } else {
                i = 0;
            }
            if (sectionHeader.mavatar_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sectionHeader.mavatar_key);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (sectionHeader.mavatar_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sectionHeader.mavatar_url);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (sectionHeader.mavatar != null) {
                i4 = Image.ADAPTER.encodedSizeWithTag(4, sectionHeader.mavatar);
            }
            return i6 + i4 + Modifier.ADAPTER.asRepeated().encodedSizeWithTag(5, sectionHeader.mtitle_modifiers) + sectionHeader.unknownFields().size();
        }

        /* renamed from: a */
        public SectionHeader decode(ProtoReader protoReader) throws IOException {
            C50056a aVar = new C50056a();
            aVar.f125175a = "";
            aVar.f125176b = "";
            aVar.f125177c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125175a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125176b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125177c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125178d = Image.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125179e.add(Modifier.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SectionHeader sectionHeader) throws IOException {
            if (sectionHeader.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sectionHeader.mtitle);
            }
            if (sectionHeader.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sectionHeader.mavatar_key);
            }
            if (sectionHeader.mavatar_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sectionHeader.mavatar_url);
            }
            if (sectionHeader.mavatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 4, sectionHeader.mavatar);
            }
            Modifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, sectionHeader.mtitle_modifiers);
            protoWriter.writeBytes(sectionHeader.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.section.SectionHeader$a */
    public static final class C50056a extends Message.Builder<SectionHeader, C50056a> {

        /* renamed from: a */
        public String f125175a;

        /* renamed from: b */
        public String f125176b;

        /* renamed from: c */
        public String f125177c;

        /* renamed from: d */
        public Image f125178d;

        /* renamed from: e */
        public List<Modifier> f125179e = Internal.newMutableList();

        /* renamed from: a */
        public SectionHeader build() {
            return new SectionHeader(this.f125175a, this.f125176b, this.f125177c, this.f125178d, this.f125179e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50056a newBuilder() {
        C50056a aVar = new C50056a();
        aVar.f125175a = this.mtitle;
        aVar.f125176b = this.mavatar_key;
        aVar.f125177c = this.mavatar_url;
        aVar.f125178d = this.mavatar;
        aVar.f125179e = Internal.copyOf("mtitle_modifiers", this.mtitle_modifiers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtitle != null) {
            sb.append(", title=");
            sb.append(this.mtitle);
        }
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        if (this.mavatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.mavatar_url);
        }
        if (this.mavatar != null) {
            sb.append(", avatar=");
            sb.append(this.mavatar);
        }
        if (!this.mtitle_modifiers.isEmpty()) {
            sb.append(", title_modifiers=");
            sb.append(this.mtitle_modifiers);
        }
        StringBuilder replace = sb.replace(0, 2, "SectionHeader{");
        replace.append('}');
        return replace.toString();
    }

    public SectionHeader(String str, String str2, String str3, Image image, List<Modifier> list) {
        this(str, str2, str3, image, list, ByteString.EMPTY);
    }

    public SectionHeader(String str, String str2, String str3, Image image, List<Modifier> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtitle = str;
        this.mavatar_key = str2;
        this.mavatar_url = str3;
        this.mavatar = image;
        this.mtitle_modifiers = Internal.immutableCopyOf("mtitle_modifiers", list);
    }
}
