package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class EntityCardSection extends Message<EntityCardSection, C49451a> {
    public static final ProtoAdapter<EntityCardSection> ADAPTER = new C49452b();
    private static final long serialVersionUID = 0;
    public final TitleAlignment malignment;
    public final List<EntityCardElement> melements;
    public final String mid;
    public final String mname;
    public final List<EntityCardSection> msections;
    public final String mtitle;

    public enum TitleAlignment implements WireEnum {
        LEFT(0),
        CENTER(1),
        RIGHT(2);
        
        public static final ProtoAdapter<TitleAlignment> ADAPTER = ProtoAdapter.newEnumAdapter(TitleAlignment.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TitleAlignment fromValue(int i) {
            if (i == 0) {
                return LEFT;
            }
            if (i == 1) {
                return CENTER;
            }
            if (i != 2) {
                return null;
            }
            return RIGHT;
        }

        private TitleAlignment(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.EntityCardSection$b */
    private static final class C49452b extends ProtoAdapter<EntityCardSection> {
        C49452b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityCardSection.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityCardSection entityCardSection) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (entityCardSection.mtitle != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, entityCardSection.mtitle);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + EntityCardElement.ADAPTER.asRepeated().encodedSizeWithTag(2, entityCardSection.melements) + EntityCardSection.ADAPTER.asRepeated().encodedSizeWithTag(3, entityCardSection.msections);
            if (entityCardSection.mname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, entityCardSection.mname);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (entityCardSection.malignment != null) {
                i3 = TitleAlignment.ADAPTER.encodedSizeWithTag(5, entityCardSection.malignment);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (entityCardSection.mid != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(255, entityCardSection.mid);
            }
            return i6 + i4 + entityCardSection.unknownFields().size();
        }

        /* renamed from: a */
        public EntityCardSection decode(ProtoReader protoReader) throws IOException {
            C49451a aVar = new C49451a();
            aVar.f124033a = "";
            aVar.f124036d = "";
            aVar.f124038f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124033a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124034b.add(EntityCardElement.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f124035c.add(EntityCardSection.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f124036d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    try {
                        aVar.f124037e = TitleAlignment.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 255) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124038f = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EntityCardSection entityCardSection) throws IOException {
            if (entityCardSection.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityCardSection.mtitle);
            }
            EntityCardElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, entityCardSection.melements);
            EntityCardSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, entityCardSection.msections);
            if (entityCardSection.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, entityCardSection.mname);
            }
            if (entityCardSection.malignment != null) {
                TitleAlignment.ADAPTER.encodeWithTag(protoWriter, 5, entityCardSection.malignment);
            }
            if (entityCardSection.mid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 255, entityCardSection.mid);
            }
            protoWriter.writeBytes(entityCardSection.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.EntityCardSection$a */
    public static final class C49451a extends Message.Builder<EntityCardSection, C49451a> {

        /* renamed from: a */
        public String f124033a;

        /* renamed from: b */
        public List<EntityCardElement> f124034b = Internal.newMutableList();

        /* renamed from: c */
        public List<EntityCardSection> f124035c = Internal.newMutableList();

        /* renamed from: d */
        public String f124036d;

        /* renamed from: e */
        public TitleAlignment f124037e;

        /* renamed from: f */
        public String f124038f;

        /* renamed from: a */
        public EntityCardSection build() {
            return new EntityCardSection(this.f124033a, this.f124034b, this.f124035c, this.f124036d, this.f124037e, this.f124038f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49451a newBuilder() {
        C49451a aVar = new C49451a();
        aVar.f124033a = this.mtitle;
        aVar.f124034b = Internal.copyOf("melements", this.melements);
        aVar.f124035c = Internal.copyOf("msections", this.msections);
        aVar.f124036d = this.mname;
        aVar.f124037e = this.malignment;
        aVar.f124038f = this.mid;
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
        if (!this.melements.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.melements);
        }
        if (!this.msections.isEmpty()) {
            sb.append(", sections=");
            sb.append(this.msections);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.malignment != null) {
            sb.append(", alignment=");
            sb.append(this.malignment);
        }
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityCardSection{");
        replace.append('}');
        return replace.toString();
    }

    public EntityCardSection(String str, List<EntityCardElement> list, List<EntityCardSection> list2, String str2, TitleAlignment titleAlignment, String str3) {
        this(str, list, list2, str2, titleAlignment, str3, ByteString.EMPTY);
    }

    public EntityCardSection(String str, List<EntityCardElement> list, List<EntityCardSection> list2, String str2, TitleAlignment titleAlignment, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtitle = str;
        this.melements = Internal.immutableCopyOf("melements", list);
        this.msections = Internal.immutableCopyOf("msections", list2);
        this.mname = str2;
        this.malignment = titleAlignment;
        this.mid = str3;
    }
}
