package com.google.protobuf.server;

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

public final class FileDescriptorProto extends Message<FileDescriptorProto, C23157a> {
    public static final ProtoAdapter<FileDescriptorProto> ADAPTER = new C23158b();
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PACKAGE_ = "";
    public static final String DEFAULT_SYNTAX = "";
    private static final long serialVersionUID = 0;
    public final List<String> mdependency;
    public final List<EnumDescriptorProto> menum_type;
    public final List<FieldDescriptorProto> mextension;
    public final List<DescriptorProto> mmessage_type;
    public final String mname;
    public final FileOptions moptions;
    public final String mpackage_;
    public final List<Integer> mpublic_dependency;
    public final List<ServiceDescriptorProto> mservice;
    public final SourceCodeInfo msource_code_info;
    public final String msyntax;
    public final List<Integer> mweak_dependency;

    /* renamed from: com.google.protobuf.server.FileDescriptorProto$b */
    private static final class C23158b extends ProtoAdapter<FileDescriptorProto> {
        C23158b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(FileDescriptorProto fileDescriptorProto) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (fileDescriptorProto.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, fileDescriptorProto.mname);
            } else {
                i = 0;
            }
            if (fileDescriptorProto.mpackage_ != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, fileDescriptorProto.mpackage_);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, fileDescriptorProto.mdependency) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(10, fileDescriptorProto.mpublic_dependency) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(11, fileDescriptorProto.mweak_dependency) + DescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(4, fileDescriptorProto.mmessage_type) + EnumDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(5, fileDescriptorProto.menum_type) + ServiceDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(6, fileDescriptorProto.mservice) + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(7, fileDescriptorProto.mextension);
            if (fileDescriptorProto.moptions != null) {
                i3 = FileOptions.ADAPTER.encodedSizeWithTag(8, fileDescriptorProto.moptions);
            } else {
                i3 = 0;
            }
            int i6 = encodedSizeWithTag + i3;
            if (fileDescriptorProto.msource_code_info != null) {
                i4 = SourceCodeInfo.ADAPTER.encodedSizeWithTag(9, fileDescriptorProto.msource_code_info);
            } else {
                i4 = 0;
            }
            int i7 = i6 + i4;
            if (fileDescriptorProto.msyntax != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(12, fileDescriptorProto.msyntax);
            }
            return i7 + i5 + fileDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public FileDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23157a aVar = new C23157a();
            aVar.f57132a = "";
            aVar.f57133b = "";
            aVar.f57143l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f57132a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f57133b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f57134c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f57137f.add(DescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f57138g.add(EnumDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f57139h.add(ServiceDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f57140i.add(FieldDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.f57141j = FileOptions.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f57142k = SourceCodeInfo.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f57135d.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            aVar.f57136e.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f57143l = ProtoAdapter.STRING.decode(protoReader);
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
            if (fileDescriptorProto.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileDescriptorProto.mname);
            }
            if (fileDescriptorProto.mpackage_ != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fileDescriptorProto.mpackage_);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, fileDescriptorProto.mdependency);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 10, fileDescriptorProto.mpublic_dependency);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 11, fileDescriptorProto.mweak_dependency);
            DescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, fileDescriptorProto.mmessage_type);
            EnumDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, fileDescriptorProto.menum_type);
            ServiceDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, fileDescriptorProto.mservice);
            FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, fileDescriptorProto.mextension);
            if (fileDescriptorProto.moptions != null) {
                FileOptions.ADAPTER.encodeWithTag(protoWriter, 8, fileDescriptorProto.moptions);
            }
            if (fileDescriptorProto.msource_code_info != null) {
                SourceCodeInfo.ADAPTER.encodeWithTag(protoWriter, 9, fileDescriptorProto.msource_code_info);
            }
            if (fileDescriptorProto.msyntax != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, fileDescriptorProto.msyntax);
            }
            protoWriter.writeBytes(fileDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.FileDescriptorProto$a */
    public static final class C23157a extends Message.Builder<FileDescriptorProto, C23157a> {

        /* renamed from: a */
        public String f57132a;

        /* renamed from: b */
        public String f57133b;

        /* renamed from: c */
        public List<String> f57134c = Internal.newMutableList();

        /* renamed from: d */
        public List<Integer> f57135d = Internal.newMutableList();

        /* renamed from: e */
        public List<Integer> f57136e = Internal.newMutableList();

        /* renamed from: f */
        public List<DescriptorProto> f57137f = Internal.newMutableList();

        /* renamed from: g */
        public List<EnumDescriptorProto> f57138g = Internal.newMutableList();

        /* renamed from: h */
        public List<ServiceDescriptorProto> f57139h = Internal.newMutableList();

        /* renamed from: i */
        public List<FieldDescriptorProto> f57140i = Internal.newMutableList();

        /* renamed from: j */
        public FileOptions f57141j;

        /* renamed from: k */
        public SourceCodeInfo f57142k;

        /* renamed from: l */
        public String f57143l;

        /* renamed from: a */
        public FileDescriptorProto build() {
            return new FileDescriptorProto(this.f57132a, this.f57133b, this.f57134c, this.f57135d, this.f57136e, this.f57137f, this.f57138g, this.f57139h, this.f57140i, this.f57141j, this.f57142k, this.f57143l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23157a newBuilder() {
        C23157a aVar = new C23157a();
        aVar.f57132a = this.mname;
        aVar.f57133b = this.mpackage_;
        aVar.f57134c = Internal.copyOf("mdependency", this.mdependency);
        aVar.f57135d = Internal.copyOf("mpublic_dependency", this.mpublic_dependency);
        aVar.f57136e = Internal.copyOf("mweak_dependency", this.mweak_dependency);
        aVar.f57137f = Internal.copyOf("mmessage_type", this.mmessage_type);
        aVar.f57138g = Internal.copyOf("menum_type", this.menum_type);
        aVar.f57139h = Internal.copyOf("mservice", this.mservice);
        aVar.f57140i = Internal.copyOf("mextension", this.mextension);
        aVar.f57141j = this.moptions;
        aVar.f57142k = this.msource_code_info;
        aVar.f57143l = this.msyntax;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mpackage_ != null) {
            sb.append(", package=");
            sb.append(this.mpackage_);
        }
        if (!this.mdependency.isEmpty()) {
            sb.append(", dependency=");
            sb.append(this.mdependency);
        }
        if (!this.mpublic_dependency.isEmpty()) {
            sb.append(", public_dependency=");
            sb.append(this.mpublic_dependency);
        }
        if (!this.mweak_dependency.isEmpty()) {
            sb.append(", weak_dependency=");
            sb.append(this.mweak_dependency);
        }
        if (!this.mmessage_type.isEmpty()) {
            sb.append(", message_type=");
            sb.append(this.mmessage_type);
        }
        if (!this.menum_type.isEmpty()) {
            sb.append(", enum_type=");
            sb.append(this.menum_type);
        }
        if (!this.mservice.isEmpty()) {
            sb.append(", service=");
            sb.append(this.mservice);
        }
        if (!this.mextension.isEmpty()) {
            sb.append(", extension=");
            sb.append(this.mextension);
        }
        if (this.moptions != null) {
            sb.append(", options=");
            sb.append(this.moptions);
        }
        if (this.msource_code_info != null) {
            sb.append(", source_code_info=");
            sb.append(this.msource_code_info);
        }
        if (this.msyntax != null) {
            sb.append(", syntax=");
            sb.append(this.msyntax);
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
        this.mname = str;
        this.mpackage_ = str2;
        this.mdependency = Internal.immutableCopyOf("mdependency", list);
        this.mpublic_dependency = Internal.immutableCopyOf("mpublic_dependency", list2);
        this.mweak_dependency = Internal.immutableCopyOf("mweak_dependency", list3);
        this.mmessage_type = Internal.immutableCopyOf("mmessage_type", list4);
        this.menum_type = Internal.immutableCopyOf("menum_type", list5);
        this.mservice = Internal.immutableCopyOf("mservice", list6);
        this.mextension = Internal.immutableCopyOf("mextension", list7);
        this.moptions = fileOptions;
        this.msource_code_info = sourceCodeInfo;
        this.msyntax = str3;
    }
}
