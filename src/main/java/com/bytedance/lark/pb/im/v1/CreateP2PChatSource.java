package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ContactSource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateP2PChatSource extends Message<CreateP2PChatSource, C17366a> {
    public static final ProtoAdapter<CreateP2PChatSource> ADAPTER = new C17367b();
    public static final Long DEFAULT_SENDER_ID = 0L;
    public static final ContactSource DEFAULT_SOURCE_TYPE = ContactSource.UNKNOWN_SOURCE;
    private static final long serialVersionUID = 0;
    public final Long sender_id;
    public final String sender_id_v2;
    public final String source_id;
    public final String source_name;
    public final ContactSource source_type;
    public final String sub_source_type;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateP2PChatSource$b */
    private static final class C17367b extends ProtoAdapter<CreateP2PChatSource> {
        C17367b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateP2PChatSource.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateP2PChatSource createP2PChatSource) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (createP2PChatSource.sender_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, createP2PChatSource.sender_id);
            } else {
                i = 0;
            }
            if (createP2PChatSource.source_type != null) {
                i2 = ContactSource.ADAPTER.encodedSizeWithTag(2, createP2PChatSource.source_type);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (createP2PChatSource.source_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, createP2PChatSource.source_id);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (createP2PChatSource.source_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, createP2PChatSource.source_name);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (createP2PChatSource.sender_id_v2 != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, createP2PChatSource.sender_id_v2);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (createP2PChatSource.sub_source_type != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, createP2PChatSource.sub_source_type);
            }
            return i10 + i6 + createP2PChatSource.unknownFields().size();
        }

        /* renamed from: a */
        public CreateP2PChatSource decode(ProtoReader protoReader) throws IOException {
            C17366a aVar = new C17366a();
            aVar.f44248a = 0L;
            aVar.f44249b = ContactSource.UNKNOWN_SOURCE;
            aVar.f44250c = "";
            aVar.f44251d = "";
            aVar.f44252e = "";
            aVar.f44253f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44248a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f44249b = ContactSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f44250c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44251d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44252e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44253f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CreateP2PChatSource createP2PChatSource) throws IOException {
            if (createP2PChatSource.sender_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, createP2PChatSource.sender_id);
            }
            if (createP2PChatSource.source_type != null) {
                ContactSource.ADAPTER.encodeWithTag(protoWriter, 2, createP2PChatSource.source_type);
            }
            if (createP2PChatSource.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createP2PChatSource.source_id);
            }
            if (createP2PChatSource.source_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createP2PChatSource.source_name);
            }
            if (createP2PChatSource.sender_id_v2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, createP2PChatSource.sender_id_v2);
            }
            if (createP2PChatSource.sub_source_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, createP2PChatSource.sub_source_type);
            }
            protoWriter.writeBytes(createP2PChatSource.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateP2PChatSource$a */
    public static final class C17366a extends Message.Builder<CreateP2PChatSource, C17366a> {

        /* renamed from: a */
        public Long f44248a;

        /* renamed from: b */
        public ContactSource f44249b;

        /* renamed from: c */
        public String f44250c;

        /* renamed from: d */
        public String f44251d;

        /* renamed from: e */
        public String f44252e;

        /* renamed from: f */
        public String f44253f;

        /* renamed from: a */
        public CreateP2PChatSource build() {
            return new CreateP2PChatSource(this.f44248a, this.f44249b, this.f44250c, this.f44251d, this.f44252e, this.f44253f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17366a mo60957a(ContactSource contactSource) {
            this.f44249b = contactSource;
            return this;
        }

        /* renamed from: b */
        public C17366a mo60960b(String str) {
            this.f44251d = str;
            return this;
        }

        /* renamed from: c */
        public C17366a mo60961c(String str) {
            this.f44252e = str;
            return this;
        }

        /* renamed from: a */
        public C17366a mo60958a(String str) {
            this.f44250c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17366a newBuilder() {
        C17366a aVar = new C17366a();
        aVar.f44248a = this.sender_id;
        aVar.f44249b = this.source_type;
        aVar.f44250c = this.source_id;
        aVar.f44251d = this.source_name;
        aVar.f44252e = this.sender_id_v2;
        aVar.f44253f = this.sub_source_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateP2PChatSource");
        StringBuilder sb = new StringBuilder();
        if (this.sender_id != null) {
            sb.append(", sender_id=");
            sb.append(this.sender_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_name != null) {
            sb.append(", source_name=");
            sb.append(this.source_name);
        }
        if (this.sender_id_v2 != null) {
            sb.append(", sender_id_v2=");
            sb.append(this.sender_id_v2);
        }
        if (this.sub_source_type != null) {
            sb.append(", sub_source_type=");
            sb.append(this.sub_source_type);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateP2PChatSource{");
        replace.append('}');
        return replace.toString();
    }

    public CreateP2PChatSource(Long l, ContactSource contactSource, String str, String str2, String str3, String str4) {
        this(l, contactSource, str, str2, str3, str4, ByteString.EMPTY);
    }

    public CreateP2PChatSource(Long l, ContactSource contactSource, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sender_id = l;
        this.source_type = contactSource;
        this.source_id = str;
        this.source_name = str2;
        this.sender_id_v2 = str3;
        this.sub_source_type = str4;
    }
}
