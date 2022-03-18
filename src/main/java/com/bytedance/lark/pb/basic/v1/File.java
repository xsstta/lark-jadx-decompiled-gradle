package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class File extends Message<File, C14951a> {
    public static final ProtoAdapter<File> ADAPTER = new C14952b();
    public static final Long DEFAULT_SIZE = 0L;
    private static final long serialVersionUID = 0;
    public final Extra extra;
    public final String key;
    public final String mime;
    public final String name;
    public final String path;
    public final Long size;

    public enum EntityType implements WireEnum {
        MESSAGE(1),
        EMAIL(2);
        
        public static final ProtoAdapter<EntityType> ADAPTER = ProtoAdapter.newEnumAdapter(EntityType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EntityType fromValue(int i) {
            if (i == 1) {
                return MESSAGE;
            }
            if (i != 2) {
                return null;
            }
            return EMAIL;
        }

        private EntityType(int i) {
            this.value = i;
        }
    }

    public enum Source implements WireEnum {
        UNKNOWN(0),
        LARK_SERVER(1),
        NUT_STORE(2),
        LAN_TRANS(3);
        
        public static final ProtoAdapter<Source> ADAPTER = ProtoAdapter.newEnumAdapter(Source.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Source fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return LARK_SERVER;
            }
            if (i == 2) {
                return NUT_STORE;
            }
            if (i != 3) {
                return null;
            }
            return LAN_TRANS;
        }

        private Source(int i) {
            this.value = i;
        }
    }

    public static final class Extra extends Message<Extra, C14949a> {
        public static final ProtoAdapter<Extra> ADAPTER = new C14950b();
        public static final Source DEFAULT_SOURCE = Source.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final Source source;
        public final Image thumbnail;

        /* renamed from: com.bytedance.lark.pb.basic.v1.File$Extra$b */
        private static final class C14950b extends ProtoAdapter<Extra> {
            C14950b() {
                super(FieldEncoding.LENGTH_DELIMITED, Extra.class);
            }

            /* renamed from: a */
            public int encodedSize(Extra extra) {
                int i;
                int i2 = 0;
                if (extra.thumbnail != null) {
                    i = Image.ADAPTER.encodedSizeWithTag(1, extra.thumbnail);
                } else {
                    i = 0;
                }
                if (extra.source != null) {
                    i2 = Source.ADAPTER.encodedSizeWithTag(2, extra.source);
                }
                return i + i2 + extra.unknownFields().size();
            }

            /* renamed from: a */
            public Extra decode(ProtoReader protoReader) throws IOException {
                C14949a aVar = new C14949a();
                aVar.f39598b = Source.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39597a = Image.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f39598b = Source.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Extra extra) throws IOException {
                if (extra.thumbnail != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter, 1, extra.thumbnail);
                }
                if (extra.source != null) {
                    Source.ADAPTER.encodeWithTag(protoWriter, 2, extra.source);
                }
                protoWriter.writeBytes(extra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.File$Extra$a */
        public static final class C14949a extends Message.Builder<Extra, C14949a> {

            /* renamed from: a */
            public Image f39597a;

            /* renamed from: b */
            public Source f39598b;

            /* renamed from: a */
            public Extra build() {
                return new Extra(this.f39597a, this.f39598b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14949a newBuilder() {
            C14949a aVar = new C14949a();
            aVar.f39597a = this.thumbnail;
            aVar.f39598b = this.source;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Extra");
            StringBuilder sb = new StringBuilder();
            if (this.thumbnail != null) {
                sb.append(", thumbnail=");
                sb.append(this.thumbnail);
            }
            if (this.source != null) {
                sb.append(", source=");
                sb.append(this.source);
            }
            StringBuilder replace = sb.replace(0, 2, "Extra{");
            replace.append('}');
            return replace.toString();
        }

        public Extra(Image image, Source source2) {
            this(image, source2, ByteString.EMPTY);
        }

        public Extra(Image image, Source source2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.thumbnail = image;
            this.source = source2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.File$b */
    private static final class C14952b extends ProtoAdapter<File> {
        C14952b() {
            super(FieldEncoding.LENGTH_DELIMITED, File.class);
        }

        /* renamed from: a */
        public int encodedSize(File file) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (file.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, file.key);
            } else {
                i = 0;
            }
            if (file.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, file.name);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (file.size != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, file.size);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (file.mime != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, file.mime);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (file.path != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, file.path);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (file.extra != null) {
                i6 = Extra.ADAPTER.encodedSizeWithTag(6, file.extra);
            }
            return i10 + i6 + file.unknownFields().size();
        }

        /* renamed from: a */
        public File decode(ProtoReader protoReader) throws IOException {
            C14951a aVar = new C14951a();
            aVar.f39599a = "";
            aVar.f39600b = "";
            aVar.f39601c = 0L;
            aVar.f39602d = "";
            aVar.f39603e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39599a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39600b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39601c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39602d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39603e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39604f = Extra.ADAPTER.decode(protoReader);
                            break;
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
        public void encode(ProtoWriter protoWriter, File file) throws IOException {
            if (file.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, file.key);
            }
            if (file.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, file.name);
            }
            if (file.size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, file.size);
            }
            if (file.mime != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, file.mime);
            }
            if (file.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, file.path);
            }
            if (file.extra != null) {
                Extra.ADAPTER.encodeWithTag(protoWriter, 6, file.extra);
            }
            protoWriter.writeBytes(file.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.File$a */
    public static final class C14951a extends Message.Builder<File, C14951a> {

        /* renamed from: a */
        public String f39599a;

        /* renamed from: b */
        public String f39600b;

        /* renamed from: c */
        public Long f39601c;

        /* renamed from: d */
        public String f39602d;

        /* renamed from: e */
        public String f39603e;

        /* renamed from: f */
        public Extra f39604f;

        /* renamed from: a */
        public File build() {
            return new File(this.f39599a, this.f39600b, this.f39601c, this.f39602d, this.f39603e, this.f39604f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14951a newBuilder() {
        C14951a aVar = new C14951a();
        aVar.f39599a = this.key;
        aVar.f39600b = this.name;
        aVar.f39601c = this.size;
        aVar.f39602d = this.mime;
        aVar.f39603e = this.path;
        aVar.f39604f = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "File");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        if (this.mime != null) {
            sb.append(", mime=");
            sb.append(this.mime);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "File{");
        replace.append('}');
        return replace.toString();
    }

    public File(String str, String str2, Long l, String str3, String str4, Extra extra2) {
        this(str, str2, l, str3, str4, extra2, ByteString.EMPTY);
    }

    public File(String str, String str2, Long l, String str3, String str4, Extra extra2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.name = str2;
        this.size = l;
        this.mime = str3;
        this.path = str4;
        this.extra = extra2;
    }
}
