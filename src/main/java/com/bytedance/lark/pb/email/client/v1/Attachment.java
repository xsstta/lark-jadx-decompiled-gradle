package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Attachment extends Message<Attachment, C16602a> {
    public static final ProtoAdapter<Attachment> ADAPTER = new C16603b();
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    public static final Long DEFAULT_FILE_SIZE = 0L;
    public static final AttachmentPermission DEFAULT_LARGE_FILE_PERMISSION = AttachmentPermission.TenantReadable;
    public static final Boolean DEFAULT_NEED_CONVERT_TO_LARGE = false;
    public static final AttachmentType DEFAULT_TYPE = AttachmentType.SMALL;
    private static final long serialVersionUID = 0;
    public final Long expire_time;
    public final String file_name;
    public final Long file_size;
    public final String file_token;
    public final String file_url;
    public final AttachmentPermission large_file_permission;
    public final Boolean need_convert_to_large;
    public final AttachmentType type;

    public enum AttachmentPermission implements WireEnum {
        TenantReadable(0),
        AnyoneReadable(1);
        
        public static final ProtoAdapter<AttachmentPermission> ADAPTER = ProtoAdapter.newEnumAdapter(AttachmentPermission.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AttachmentPermission fromValue(int i) {
            if (i == 0) {
                return TenantReadable;
            }
            if (i != 1) {
                return null;
            }
            return AnyoneReadable;
        }

        private AttachmentPermission(int i) {
            this.value = i;
        }
    }

    public enum AttachmentType implements WireEnum {
        UNKNOWN(0),
        SMALL(1),
        LARGE(2);
        
        public static final ProtoAdapter<AttachmentType> ADAPTER = ProtoAdapter.newEnumAdapter(AttachmentType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AttachmentType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SMALL;
            }
            if (i != 2) {
                return null;
            }
            return LARGE;
        }

        private AttachmentType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Attachment$b */
    private static final class C16603b extends ProtoAdapter<Attachment> {
        C16603b() {
            super(FieldEncoding.LENGTH_DELIMITED, Attachment.class);
        }

        /* renamed from: a */
        public int encodedSize(Attachment attachment) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (attachment.file_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, attachment.file_name);
            } else {
                i = 0;
            }
            if (attachment.file_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, attachment.file_url);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (attachment.file_size != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, attachment.file_size);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (attachment.file_token != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, attachment.file_token);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (attachment.type != null) {
                i5 = AttachmentType.ADAPTER.encodedSizeWithTag(5, attachment.type);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (attachment.large_file_permission != null) {
                i6 = AttachmentPermission.ADAPTER.encodedSizeWithTag(6, attachment.large_file_permission);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (attachment.expire_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, attachment.expire_time);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (attachment.need_convert_to_large != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, attachment.need_convert_to_large);
            }
            return i14 + i8 + attachment.unknownFields().size();
        }

        /* renamed from: a */
        public Attachment decode(ProtoReader protoReader) throws IOException {
            C16602a aVar = new C16602a();
            aVar.f42976a = "";
            aVar.f42977b = "";
            aVar.f42978c = 0L;
            aVar.f42979d = "";
            aVar.f42980e = AttachmentType.SMALL;
            aVar.f42981f = AttachmentPermission.TenantReadable;
            aVar.f42982g = 0L;
            aVar.f42983h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42976a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42977b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42978c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42979d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f42980e = AttachmentType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f42981f = AttachmentPermission.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f42982g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42983h = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Attachment attachment) throws IOException {
            if (attachment.file_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, attachment.file_name);
            }
            if (attachment.file_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, attachment.file_url);
            }
            if (attachment.file_size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, attachment.file_size);
            }
            if (attachment.file_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, attachment.file_token);
            }
            if (attachment.type != null) {
                AttachmentType.ADAPTER.encodeWithTag(protoWriter, 5, attachment.type);
            }
            if (attachment.large_file_permission != null) {
                AttachmentPermission.ADAPTER.encodeWithTag(protoWriter, 6, attachment.large_file_permission);
            }
            if (attachment.expire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, attachment.expire_time);
            }
            if (attachment.need_convert_to_large != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, attachment.need_convert_to_large);
            }
            protoWriter.writeBytes(attachment.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16602a newBuilder() {
        C16602a aVar = new C16602a();
        aVar.f42976a = this.file_name;
        aVar.f42977b = this.file_url;
        aVar.f42978c = this.file_size;
        aVar.f42979d = this.file_token;
        aVar.f42980e = this.type;
        aVar.f42981f = this.large_file_permission;
        aVar.f42982g = this.expire_time;
        aVar.f42983h = this.need_convert_to_large;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Attachment$a */
    public static final class C16602a extends Message.Builder<Attachment, C16602a> {

        /* renamed from: a */
        public String f42976a;

        /* renamed from: b */
        public String f42977b;

        /* renamed from: c */
        public Long f42978c;

        /* renamed from: d */
        public String f42979d;

        /* renamed from: e */
        public AttachmentType f42980e;

        /* renamed from: f */
        public AttachmentPermission f42981f;

        /* renamed from: g */
        public Long f42982g;

        /* renamed from: h */
        public Boolean f42983h;

        /* renamed from: a */
        public Attachment build() {
            return new Attachment(this.f42976a, this.f42977b, this.f42978c, this.f42979d, this.f42980e, this.f42981f, this.f42982g, this.f42983h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16602a mo59057a(AttachmentPermission attachmentPermission) {
            this.f42981f = attachmentPermission;
            return this;
        }

        /* renamed from: b */
        public C16602a mo59063b(Long l) {
            this.f42982g = l;
            return this;
        }

        /* renamed from: c */
        public C16602a mo59065c(String str) {
            this.f42979d = str;
            return this;
        }

        /* renamed from: a */
        public C16602a mo59058a(AttachmentType attachmentType) {
            this.f42980e = attachmentType;
            return this;
        }

        /* renamed from: b */
        public C16602a mo59064b(String str) {
            this.f42977b = str;
            return this;
        }

        /* renamed from: a */
        public C16602a mo59059a(Boolean bool) {
            this.f42983h = bool;
            return this;
        }

        /* renamed from: a */
        public C16602a mo59060a(Long l) {
            this.f42978c = l;
            return this;
        }

        /* renamed from: a */
        public C16602a mo59061a(String str) {
            this.f42976a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "Attachment");
        StringBuilder sb = new StringBuilder();
        if (this.file_name != null) {
            sb.append(", file_name=");
            sb.append(this.file_name);
        }
        if (this.file_url != null) {
            sb.append(", file_url=");
            sb.append(this.file_url);
        }
        if (this.file_size != null) {
            sb.append(", file_size=");
            sb.append(this.file_size);
        }
        if (this.file_token != null) {
            sb.append(", file_token=");
            sb.append(this.file_token);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.large_file_permission != null) {
            sb.append(", large_file_permission=");
            sb.append(this.large_file_permission);
        }
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        if (this.need_convert_to_large != null) {
            sb.append(", need_convert_to_large=");
            sb.append(this.need_convert_to_large);
        }
        StringBuilder replace = sb.replace(0, 2, "Attachment{");
        replace.append('}');
        return replace.toString();
    }

    public Attachment(String str, String str2, Long l, String str3, AttachmentType attachmentType, AttachmentPermission attachmentPermission, Long l2, Boolean bool) {
        this(str, str2, l, str3, attachmentType, attachmentPermission, l2, bool, ByteString.EMPTY);
    }

    public Attachment(String str, String str2, Long l, String str3, AttachmentType attachmentType, AttachmentPermission attachmentPermission, Long l2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_name = str;
        this.file_url = str2;
        this.file_size = l;
        this.file_token = str3;
        this.type = attachmentType;
        this.large_file_permission = attachmentPermission;
        this.expire_time = l2;
        this.need_convert_to_large = bool;
    }
}
