package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class FileContent extends Message<FileContent, C49704a> {
    public static final ProtoAdapter<FileContent> ADAPTER = new C49705b();
    public static final Long DEFAULT_SIZE = 0L;
    private static final long serialVersionUID = 0;
    public final String mfs_unit;
    public final String mkey;
    public final LANTransExtra mlan_trans_extra;
    public final String mmime;
    public final String mname;
    public final String mname_space;
    public final Long msize;
    public final Source msource;
    public final TransExtra mtrans_extra;

    public static final class LANTransExtra extends Message<LANTransExtra, C49702a> {
        public static final ProtoAdapter<LANTransExtra> ADAPTER = new C49703b();
        private static final long serialVersionUID = 0;
        public final TransStatus mstatus;

        public enum TransStatus implements WireEnum {
            PENDING(0),
            ACCEPT(1),
            REFUSE(2),
            CANCEL(3),
            ABORT_BY_SENDER(4),
            ABORT_BY_RECEIVER(5),
            DONE(6),
            OFFLINE_MODE(7);
            
            public static final ProtoAdapter<TransStatus> ADAPTER = ProtoAdapter.newEnumAdapter(TransStatus.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static TransStatus fromValue(int i) {
                switch (i) {
                    case 0:
                        return PENDING;
                    case 1:
                        return ACCEPT;
                    case 2:
                        return REFUSE;
                    case 3:
                        return CANCEL;
                    case 4:
                        return ABORT_BY_SENDER;
                    case 5:
                        return ABORT_BY_RECEIVER;
                    case 6:
                        return DONE;
                    case 7:
                        return OFFLINE_MODE;
                    default:
                        return null;
                }
            }

            private TransStatus(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.FileContent$LANTransExtra$b */
        private static final class C49703b extends ProtoAdapter<LANTransExtra> {
            C49703b() {
                super(FieldEncoding.LENGTH_DELIMITED, LANTransExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(LANTransExtra lANTransExtra) {
                int i;
                if (lANTransExtra.mstatus != null) {
                    i = TransStatus.ADAPTER.encodedSizeWithTag(1, lANTransExtra.mstatus);
                } else {
                    i = 0;
                }
                return i + lANTransExtra.unknownFields().size();
            }

            /* renamed from: a */
            public LANTransExtra decode(ProtoReader protoReader) throws IOException {
                C49702a aVar = new C49702a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f124434a = TransStatus.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LANTransExtra lANTransExtra) throws IOException {
                if (lANTransExtra.mstatus != null) {
                    TransStatus.ADAPTER.encodeWithTag(protoWriter, 1, lANTransExtra.mstatus);
                }
                protoWriter.writeBytes(lANTransExtra.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.FileContent$LANTransExtra$a */
        public static final class C49702a extends Message.Builder<LANTransExtra, C49702a> {

            /* renamed from: a */
            public TransStatus f124434a;

            /* renamed from: a */
            public LANTransExtra build() {
                return new LANTransExtra(this.f124434a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49702a newBuilder() {
            C49702a aVar = new C49702a();
            aVar.f124434a = this.mstatus;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mstatus != null) {
                sb.append(", status=");
                sb.append(this.mstatus);
            }
            StringBuilder replace = sb.replace(0, 2, "LANTransExtra{");
            replace.append('}');
            return replace.toString();
        }

        public LANTransExtra(TransStatus transStatus) {
            this(transStatus, ByteString.EMPTY);
        }

        public LANTransExtra(TransStatus transStatus, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mstatus = transStatus;
        }
    }

    public enum Source implements WireEnum {
        UNKNOWN(0),
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

    /* renamed from: com.ss.android.lark.pb.entities.FileContent$b */
    private static final class C49705b extends ProtoAdapter<FileContent> {
        C49705b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileContent.class);
        }

        /* renamed from: a */
        public int encodedSize(FileContent fileContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (fileContent.mkey != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, fileContent.mkey);
            } else {
                i = 0;
            }
            if (fileContent.mname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, fileContent.mname);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (fileContent.msize != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, fileContent.msize);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (fileContent.mmime != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, fileContent.mmime);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (fileContent.msource != null) {
                i5 = Source.ADAPTER.encodedSizeWithTag(5, fileContent.msource);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (fileContent.mname_space != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, fileContent.mname_space);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (fileContent.mfs_unit != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, fileContent.mfs_unit);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (fileContent.mlan_trans_extra != null) {
                i8 = LANTransExtra.ADAPTER.encodedSizeWithTag(8, fileContent.mlan_trans_extra);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (fileContent.mtrans_extra != null) {
                i9 = TransExtra.ADAPTER.encodedSizeWithTag(9, fileContent.mtrans_extra);
            }
            return i16 + i9 + fileContent.unknownFields().size();
        }

        /* renamed from: a */
        public FileContent decode(ProtoReader protoReader) throws IOException {
            C49704a aVar = new C49704a();
            aVar.f124435a = "";
            aVar.f124436b = "";
            aVar.f124437c = 0L;
            aVar.f124438d = "";
            aVar.f124440f = "";
            aVar.f124441g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124435a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124436b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124437c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124438d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f124439e = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f124440f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124441g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124442h = LANTransExtra.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124443i = TransExtra.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, FileContent fileContent) throws IOException {
            if (fileContent.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileContent.mkey);
            }
            if (fileContent.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fileContent.mname);
            }
            if (fileContent.msize != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, fileContent.msize);
            }
            if (fileContent.mmime != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, fileContent.mmime);
            }
            if (fileContent.msource != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 5, fileContent.msource);
            }
            if (fileContent.mname_space != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, fileContent.mname_space);
            }
            if (fileContent.mfs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, fileContent.mfs_unit);
            }
            if (fileContent.mlan_trans_extra != null) {
                LANTransExtra.ADAPTER.encodeWithTag(protoWriter, 8, fileContent.mlan_trans_extra);
            }
            if (fileContent.mtrans_extra != null) {
                TransExtra.ADAPTER.encodeWithTag(protoWriter, 9, fileContent.mtrans_extra);
            }
            protoWriter.writeBytes(fileContent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.FileContent$a */
    public static final class C49704a extends Message.Builder<FileContent, C49704a> {

        /* renamed from: a */
        public String f124435a;

        /* renamed from: b */
        public String f124436b;

        /* renamed from: c */
        public Long f124437c;

        /* renamed from: d */
        public String f124438d;

        /* renamed from: e */
        public Source f124439e;

        /* renamed from: f */
        public String f124440f;

        /* renamed from: g */
        public String f124441g;

        /* renamed from: h */
        public LANTransExtra f124442h;

        /* renamed from: i */
        public TransExtra f124443i;

        /* renamed from: a */
        public FileContent build() {
            return new FileContent(this.f124435a, this.f124436b, this.f124437c, this.f124438d, this.f124439e, this.f124440f, this.f124441g, this.f124442h, this.f124443i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49704a newBuilder() {
        C49704a aVar = new C49704a();
        aVar.f124435a = this.mkey;
        aVar.f124436b = this.mname;
        aVar.f124437c = this.msize;
        aVar.f124438d = this.mmime;
        aVar.f124439e = this.msource;
        aVar.f124440f = this.mname_space;
        aVar.f124441g = this.mfs_unit;
        aVar.f124442h = this.mlan_trans_extra;
        aVar.f124443i = this.mtrans_extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.msize != null) {
            sb.append(", size=");
            sb.append(this.msize);
        }
        if (this.mmime != null) {
            sb.append(", mime=");
            sb.append(this.mmime);
        }
        if (this.msource != null) {
            sb.append(", source=");
            sb.append(this.msource);
        }
        if (this.mname_space != null) {
            sb.append(", name_space=");
            sb.append(this.mname_space);
        }
        if (this.mfs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.mfs_unit);
        }
        if (this.mlan_trans_extra != null) {
            sb.append(", lan_trans_extra=");
            sb.append(this.mlan_trans_extra);
        }
        if (this.mtrans_extra != null) {
            sb.append(", trans_extra=");
            sb.append(this.mtrans_extra);
        }
        StringBuilder replace = sb.replace(0, 2, "FileContent{");
        replace.append('}');
        return replace.toString();
    }

    public FileContent(String str, String str2, Long l, String str3, Source source, String str4, String str5, LANTransExtra lANTransExtra, TransExtra transExtra) {
        this(str, str2, l, str3, source, str4, str5, lANTransExtra, transExtra, ByteString.EMPTY);
    }

    public FileContent(String str, String str2, Long l, String str3, Source source, String str4, String str5, LANTransExtra lANTransExtra, TransExtra transExtra, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mkey = str;
        this.mname = str2;
        this.msize = l;
        this.mmime = str3;
        this.msource = source;
        this.mname_space = str4;
        this.mfs_unit = str5;
        this.mlan_trans_extra = lANTransExtra;
        this.mtrans_extra = transExtra;
    }
}
