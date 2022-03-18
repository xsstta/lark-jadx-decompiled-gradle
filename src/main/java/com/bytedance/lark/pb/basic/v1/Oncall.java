package com.bytedance.lark.pb.basic.v1;

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

public final class Oncall extends Message<Oncall, C15105a> {
    public static final ProtoAdapter<Oncall> ADAPTER = new C15106b();
    public static final Boolean DEFAULT_REPORT_LOCATION = false;
    private static final long serialVersionUID = 0;
    public final ImageSet avatar;
    public final String avatar_key;
    public final String avatar_path;
    public final String chat_id;
    public final String description;
    public final String id;
    public final String name;
    public final String phone_number;
    public final Boolean report_location;
    public final List<Tag> tags;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Oncall$b */
    private static final class C15106b extends ProtoAdapter<Oncall> {
        C15106b() {
            super(FieldEncoding.LENGTH_DELIMITED, Oncall.class);
        }

        /* renamed from: a */
        public int encodedSize(Oncall oncall) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, oncall.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, oncall.name);
            int i7 = 0;
            if (oncall.description != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, oncall.description);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (oncall.avatar != null) {
                i2 = ImageSet.ADAPTER.encodedSizeWithTag(4, oncall.avatar);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (oncall.chat_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, oncall.chat_id);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (oncall.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, oncall.avatar_key);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (oncall.phone_number != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, oncall.phone_number);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (oncall.report_location != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(8, oncall.report_location);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (oncall.avatar_path != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, oncall.avatar_path);
            }
            return i13 + i7 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(10, oncall.tags) + oncall.unknownFields().size();
        }

        /* renamed from: a */
        public Oncall decode(ProtoReader protoReader) throws IOException {
            C15105a aVar = new C15105a();
            aVar.f40031a = "";
            aVar.f40032b = "";
            aVar.f40033c = "";
            aVar.f40035e = "";
            aVar.f40036f = "";
            aVar.f40037g = "";
            aVar.f40038h = false;
            aVar.f40039i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40031a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40032b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40033c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40034d = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40035e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40036f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40037g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40038h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40039i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f40040j.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Oncall oncall) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oncall.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, oncall.name);
            if (oncall.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, oncall.description);
            }
            if (oncall.avatar != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 4, oncall.avatar);
            }
            if (oncall.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, oncall.chat_id);
            }
            if (oncall.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, oncall.avatar_key);
            }
            if (oncall.phone_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, oncall.phone_number);
            }
            if (oncall.report_location != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, oncall.report_location);
            }
            if (oncall.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, oncall.avatar_path);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, oncall.tags);
            protoWriter.writeBytes(oncall.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Oncall$a */
    public static final class C15105a extends Message.Builder<Oncall, C15105a> {

        /* renamed from: a */
        public String f40031a;

        /* renamed from: b */
        public String f40032b;

        /* renamed from: c */
        public String f40033c;

        /* renamed from: d */
        public ImageSet f40034d;

        /* renamed from: e */
        public String f40035e;

        /* renamed from: f */
        public String f40036f;

        /* renamed from: g */
        public String f40037g;

        /* renamed from: h */
        public Boolean f40038h;

        /* renamed from: i */
        public String f40039i;

        /* renamed from: j */
        public List<Tag> f40040j = Internal.newMutableList();

        /* renamed from: a */
        public Oncall build() {
            String str;
            String str2 = this.f40031a;
            if (str2 != null && (str = this.f40032b) != null) {
                return new Oncall(str2, str, this.f40033c, this.f40034d, this.f40035e, this.f40036f, this.f40037g, this.f40038h, this.f40039i, this.f40040j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f40032b, "name");
        }
    }

    @Override // com.squareup.wire.Message
    public C15105a newBuilder() {
        C15105a aVar = new C15105a();
        aVar.f40031a = this.id;
        aVar.f40032b = this.name;
        aVar.f40033c = this.description;
        aVar.f40034d = this.avatar;
        aVar.f40035e = this.chat_id;
        aVar.f40036f = this.avatar_key;
        aVar.f40037g = this.phone_number;
        aVar.f40038h = this.report_location;
        aVar.f40039i = this.avatar_path;
        aVar.f40040j = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Oncall");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.phone_number != null) {
            sb.append(", phone_number=");
            sb.append(this.phone_number);
        }
        if (this.report_location != null) {
            sb.append(", report_location=");
            sb.append(this.report_location);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "Oncall{");
        replace.append('}');
        return replace.toString();
    }

    public Oncall(String str, String str2, String str3, ImageSet imageSet, String str4, String str5, String str6, Boolean bool, String str7, List<Tag> list) {
        this(str, str2, str3, imageSet, str4, str5, str6, bool, str7, list, ByteString.EMPTY);
    }

    public Oncall(String str, String str2, String str3, ImageSet imageSet, String str4, String str5, String str6, Boolean bool, String str7, List<Tag> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.avatar = imageSet;
        this.chat_id = str4;
        this.avatar_key = str5;
        this.phone_number = str6;
        this.report_location = bool;
        this.avatar_path = str7;
        this.tags = Internal.immutableCopyOf("tags", list);
    }
}
