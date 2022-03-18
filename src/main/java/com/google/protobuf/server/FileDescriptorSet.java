package com.google.protobuf.server;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class FileDescriptorSet extends Message<FileDescriptorSet, C23159a> {
    public static final ProtoAdapter<FileDescriptorSet> ADAPTER = new C23160b();
    private static final long serialVersionUID = 0;
    public final List<FileDescriptorProto> mfile;

    /* renamed from: com.google.protobuf.server.FileDescriptorSet$b */
    private static final class C23160b extends ProtoAdapter<FileDescriptorSet> {
        C23160b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileDescriptorSet.class);
        }

        /* renamed from: a */
        public int encodedSize(FileDescriptorSet fileDescriptorSet) {
            return FileDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(1, fileDescriptorSet.mfile) + fileDescriptorSet.unknownFields().size();
        }

        /* renamed from: a */
        public FileDescriptorSet decode(ProtoReader protoReader) throws IOException {
            C23159a aVar = new C23159a();
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
                    aVar.f57144a.add(FileDescriptorProto.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileDescriptorSet fileDescriptorSet) throws IOException {
            FileDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, fileDescriptorSet.mfile);
            protoWriter.writeBytes(fileDescriptorSet.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.FileDescriptorSet$a */
    public static final class C23159a extends Message.Builder<FileDescriptorSet, C23159a> {

        /* renamed from: a */
        public List<FileDescriptorProto> f57144a = Internal.newMutableList();

        /* renamed from: a */
        public FileDescriptorSet build() {
            return new FileDescriptorSet(this.f57144a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23159a newBuilder() {
        C23159a aVar = new C23159a();
        aVar.f57144a = Internal.copyOf("mfile", this.mfile);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mfile.isEmpty()) {
            sb.append(", file=");
            sb.append(this.mfile);
        }
        StringBuilder replace = sb.replace(0, 2, "FileDescriptorSet{");
        replace.append('}');
        return replace.toString();
    }

    public FileDescriptorSet(List<FileDescriptorProto> list) {
        this(list, ByteString.EMPTY);
    }

    public FileDescriptorSet(List<FileDescriptorProto> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mfile = Internal.immutableCopyOf("mfile", list);
    }
}
