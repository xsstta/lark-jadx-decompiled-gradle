package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ContactSource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SourceInfo extends Message<SourceInfo, C16566a> {
    public static final ProtoAdapter<SourceInfo> ADAPTER = new C16567b();
    public static final ContactSource DEFAULT_SOURCE = ContactSource.UNKNOWN_SOURCE;
    private static final long serialVersionUID = 0;
    public final String sender;
    public final String sender_id;
    public final ContactSource source;
    public final String source_id;
    public final String source_name;
    public final String sub_source_type;

    /* renamed from: com.bytedance.lark.pb.contact.v2.SourceInfo$b */
    private static final class C16567b extends ProtoAdapter<SourceInfo> {
        C16567b() {
            super(FieldEncoding.LENGTH_DELIMITED, SourceInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SourceInfo sourceInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (sourceInfo.sender != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sourceInfo.sender);
            } else {
                i = 0;
            }
            if (sourceInfo.source != null) {
                i2 = ContactSource.ADAPTER.encodedSizeWithTag(2, sourceInfo.source);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (sourceInfo.source_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sourceInfo.source_name);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (sourceInfo.sender_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, sourceInfo.sender_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (sourceInfo.source_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, sourceInfo.source_id);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (sourceInfo.sub_source_type != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, sourceInfo.sub_source_type);
            }
            return i10 + i6 + sourceInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SourceInfo decode(ProtoReader protoReader) throws IOException {
            C16566a aVar = new C16566a();
            aVar.f42932a = "";
            aVar.f42933b = ContactSource.UNKNOWN_SOURCE;
            aVar.f42934c = "";
            aVar.f42935d = "";
            aVar.f42936e = "";
            aVar.f42937f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42932a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f42933b = ContactSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f42934c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42935d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42936e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42937f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SourceInfo sourceInfo) throws IOException {
            if (sourceInfo.sender != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sourceInfo.sender);
            }
            if (sourceInfo.source != null) {
                ContactSource.ADAPTER.encodeWithTag(protoWriter, 2, sourceInfo.source);
            }
            if (sourceInfo.source_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sourceInfo.source_name);
            }
            if (sourceInfo.sender_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sourceInfo.sender_id);
            }
            if (sourceInfo.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, sourceInfo.source_id);
            }
            if (sourceInfo.sub_source_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sourceInfo.sub_source_type);
            }
            protoWriter.writeBytes(sourceInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.SourceInfo$a */
    public static final class C16566a extends Message.Builder<SourceInfo, C16566a> {

        /* renamed from: a */
        public String f42932a;

        /* renamed from: b */
        public ContactSource f42933b;

        /* renamed from: c */
        public String f42934c;

        /* renamed from: d */
        public String f42935d;

        /* renamed from: e */
        public String f42936e;

        /* renamed from: f */
        public String f42937f;

        /* renamed from: a */
        public SourceInfo build() {
            return new SourceInfo(this.f42932a, this.f42933b, this.f42934c, this.f42935d, this.f42936e, this.f42937f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16566a mo58960a(ContactSource contactSource) {
            this.f42933b = contactSource;
            return this;
        }

        /* renamed from: b */
        public C16566a mo58963b(String str) {
            this.f42934c = str;
            return this;
        }

        /* renamed from: c */
        public C16566a mo58964c(String str) {
            this.f42935d = str;
            return this;
        }

        /* renamed from: d */
        public C16566a mo58965d(String str) {
            this.f42936e = str;
            return this;
        }

        /* renamed from: e */
        public C16566a mo58966e(String str) {
            this.f42937f = str;
            return this;
        }

        /* renamed from: a */
        public C16566a mo58961a(String str) {
            this.f42932a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16566a newBuilder() {
        C16566a aVar = new C16566a();
        aVar.f42932a = this.sender;
        aVar.f42933b = this.source;
        aVar.f42934c = this.source_name;
        aVar.f42935d = this.sender_id;
        aVar.f42936e = this.source_id;
        aVar.f42937f = this.sub_source_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SourceInfo");
        StringBuilder sb = new StringBuilder();
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.source_name != null) {
            sb.append(", source_name=");
            sb.append(this.source_name);
        }
        if (this.sender_id != null) {
            sb.append(", sender_id=");
            sb.append(this.sender_id);
        }
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.sub_source_type != null) {
            sb.append(", sub_source_type=");
            sb.append(this.sub_source_type);
        }
        StringBuilder replace = sb.replace(0, 2, "SourceInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SourceInfo(String str, ContactSource contactSource, String str2, String str3, String str4, String str5) {
        this(str, contactSource, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public SourceInfo(String str, ContactSource contactSource, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sender = str;
        this.source = contactSource;
        this.source_name = str2;
        this.sender_id = str3;
        this.source_id = str4;
        this.sub_source_type = str5;
    }
}
