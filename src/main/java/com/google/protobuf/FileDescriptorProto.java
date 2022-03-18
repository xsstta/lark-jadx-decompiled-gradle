package com.google.protobuf;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class FileDescriptorProto extends Message<FileDescriptorProto, C23061a> {
    public static final ProtoAdapter<FileDescriptorProto> ADAPTER = new C23062b();
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PACKAGE_ = "";
    public static final String DEFAULT_SYNTAX = "";
    private static final long serialVersionUID = 0;
    public final List<String> dependency;
    public final List<EnumDescriptorProto> enum_type;
    public final List<FieldDescriptorProto> extension;
    public final List<DescriptorProto> message_type;
    public final String name;
    public final FileOptions options;
    public final String package_;
    public final List<Integer> public_dependency;
    public final List<ServiceDescriptorProto> service;
    public final SourceCodeInfo source_code_info;
    public final String syntax;
    public final List<Integer> weak_dependency;

    /* renamed from: com.google.protobuf.FileDescriptorProto$b */
    private static final class C23062b extends ProtoAdapter<FileDescriptorProto> {
        C23062b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(FileDescriptorProto fileDescriptorProto) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (fileDescriptorProto.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, fileDescriptorProto.name);
            } else {
                i = 0;
            }
            if (fileDescriptorProto.package_ != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, fileDescriptorProto.package_);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, fileDescriptorProto.dependency) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(10, fileDescriptorProto.public_dependency) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(11, fileDescriptorProto.weak_dependency) + DescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(4, fileDescriptorProto.message_type) + EnumDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(5, fileDescriptorProto.enum_type) + ServiceDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(6, fileDescriptorProto.service) + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(7, fileDescriptorProto.extension);
            if (fileDescriptorProto.options != null) {
                i3 = FileOptions.ADAPTER.encodedSizeWithTag(8, fileDescriptorProto.options);
            } else {
                i3 = 0;
            }
            int i6 = encodedSizeWithTag + i3;
            if (fileDescriptorProto.source_code_info != null) {
                i4 = SourceCodeInfo.ADAPTER.encodedSizeWithTag(9, fileDescriptorProto.source_code_info);
            } else {
                i4 = 0;
            }
            int i7 = i6 + i4;
            if (fileDescriptorProto.syntax != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(12, fileDescriptorProto.syntax);
            }
            return i7 + i5 + fileDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public FileDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23061a aVar = new C23061a();
            aVar.f56952a = "";
            aVar.f56953b = "";
            aVar.f56963l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f56952a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f56953b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f56954c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f56957f.add(DescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f56958g.add(EnumDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f56959h.add(ServiceDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f56960i.add(FieldDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.f56961j = FileOptions.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f56962k = SourceCodeInfo.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f56955d.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            aVar.f56956e.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f56963l = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, FileDescriptorProto fileDescriptorProto) throws IOException {
            if (fileDescriptorProto.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileDescriptorProto.name);
            }
            if (fileDescriptorProto.package_ != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fileDescriptorProto.package_);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, fileDescriptorProto.dependency);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 10, fileDescriptorProto.public_dependency);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 11, fileDescriptorProto.weak_dependency);
            DescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, fileDescriptorProto.message_type);
            EnumDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, fileDescriptorProto.enum_type);
            ServiceDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, fileDescriptorProto.service);
            FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, fileDescriptorProto.extension);
            if (fileDescriptorProto.options != null) {
                FileOptions.ADAPTER.encodeWithTag(protoWriter, 8, fileDescriptorProto.options);
            }
            if (fileDescriptorProto.source_code_info != null) {
                SourceCodeInfo.ADAPTER.encodeWithTag(protoWriter, 9, fileDescriptorProto.source_code_info);
            }
            if (fileDescriptorProto.syntax != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, fileDescriptorProto.syntax);
            }
            protoWriter.writeBytes(fileDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.FileDescriptorProto$a */
    public static final class C23061a extends Message.Builder<FileDescriptorProto, C23061a> {

        /* renamed from: a */
        public String f56952a;

        /* renamed from: b */
        public String f56953b;

        /* renamed from: c */
        public List<String> f56954c = Internal.newMutableList();

        /* renamed from: d */
        public List<Integer> f56955d = Internal.newMutableList();

        /* renamed from: e */
        public List<Integer> f56956e = Internal.newMutableList();

        /* renamed from: f */
        public List<DescriptorProto> f56957f = Internal.newMutableList();

        /* renamed from: g */
        public List<EnumDescriptorProto> f56958g = Internal.newMutableList();

        /* renamed from: h */
        public List<ServiceDescriptorProto> f56959h = Internal.newMutableList();

        /* renamed from: i */
        public List<FieldDescriptorProto> f56960i = Internal.newMutableList();

        /* renamed from: j */
        public FileOptions f56961j;

        /* renamed from: k */
        public SourceCodeInfo f56962k;

        /* renamed from: l */
        public String f56963l;

        /* renamed from: a */
        public FileDescriptorProto build() {
            return new FileDescriptorProto(this.f56952a, this.f56953b, this.f56954c, this.f56955d, this.f56956e, this.f56957f, this.f56958g, this.f56959h, this.f56960i, this.f56961j, this.f56962k, this.f56963l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23061a newBuilder() {
        C23061a aVar = new C23061a();
        aVar.f56952a = this.name;
        aVar.f56953b = this.package_;
        aVar.f56954c = Internal.copyOf("dependency", this.dependency);
        aVar.f56955d = Internal.copyOf("public_dependency", this.public_dependency);
        aVar.f56956e = Internal.copyOf("weak_dependency", this.weak_dependency);
        aVar.f56957f = Internal.copyOf("message_type", this.message_type);
        aVar.f56958g = Internal.copyOf("enum_type", this.enum_type);
        aVar.f56959h = Internal.copyOf("service", this.service);
        aVar.f56960i = Internal.copyOf("extension", this.extension);
        aVar.f56961j = this.options;
        aVar.f56962k = this.source_code_info;
        aVar.f56963l = this.syntax;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "FileDescriptorProto");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.package_ != null) {
            sb.append(", package=");
            sb.append(this.package_);
        }
        if (!this.dependency.isEmpty()) {
            sb.append(", dependency=");
            sb.append(this.dependency);
        }
        if (!this.public_dependency.isEmpty()) {
            sb.append(", public_dependency=");
            sb.append(this.public_dependency);
        }
        if (!this.weak_dependency.isEmpty()) {
            sb.append(", weak_dependency=");
            sb.append(this.weak_dependency);
        }
        if (!this.message_type.isEmpty()) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (!this.enum_type.isEmpty()) {
            sb.append(", enum_type=");
            sb.append(this.enum_type);
        }
        if (!this.service.isEmpty()) {
            sb.append(", service=");
            sb.append(this.service);
        }
        if (!this.extension.isEmpty()) {
            sb.append(", extension=");
            sb.append(this.extension);
        }
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        if (this.source_code_info != null) {
            sb.append(", source_code_info=");
            sb.append(this.source_code_info);
        }
        if (this.syntax != null) {
            sb.append(", syntax=");
            sb.append(this.syntax);
        }
        StringBuilder replace = sb.replace(0, 2, "FileDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public FileDescriptorProto(String str, String str2, List<String> list, List<Integer> list2, List<Integer> list3, List<DescriptorProto> list4, List<EnumDescriptorProto> list5, List<ServiceDescriptorProto> list6, List<FieldDescriptorProto> list7, FileOptions fileOptions, SourceCodeInfo sourceCodeInfo, String str3) {
        this(str, str2, list, list2, list3, list4, list5, list6, list7, fileOptions, sourceCodeInfo, str3, ByteString.EMPTY);
    }

    public FileDescriptorProto(String str, String str2, List<String> list, List<Integer> list2, List<Integer> list3, List<DescriptorProto> list4, List<EnumDescriptorProto> list5, List<ServiceDescriptorProto> list6, List<FieldDescriptorProto> list7, FileOptions fileOptions, SourceCodeInfo sourceCodeInfo, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.package_ = str2;
        this.dependency = Internal.immutableCopyOf("dependency", list);
        this.public_dependency = Internal.immutableCopyOf("public_dependency", list2);
        this.weak_dependency = Internal.immutableCopyOf("weak_dependency", list3);
        this.message_type = Internal.immutableCopyOf("message_type", list4);
        this.enum_type = Internal.immutableCopyOf("enum_type", list5);
        this.service = Internal.immutableCopyOf("service", list6);
        this.extension = Internal.immutableCopyOf("extension", list7);
        this.options = fileOptions;
        this.source_code_info = sourceCodeInfo;
        this.syntax = str3;
    }
}
