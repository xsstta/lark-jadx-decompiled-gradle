package com.google.protobuf;

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

public final class FileDescriptorSet extends Message<FileDescriptorSet, C23063a> {
    public static final ProtoAdapter<FileDescriptorSet> ADAPTER = new C23064b();
    private static final long serialVersionUID = 0;
    public final List<FileDescriptorProto> file;

    /* renamed from: com.google.protobuf.FileDescriptorSet$b */
    private static final class C23064b extends ProtoAdapter<FileDescriptorSet> {
        C23064b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileDescriptorSet.class);
        }

        /* renamed from: a */
        public int encodedSize(FileDescriptorSet fileDescriptorSet) {
            return FileDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(1, fileDescriptorSet.file) + fileDescriptorSet.unknownFields().size();
        }

        /* renamed from: a */
        public FileDescriptorSet decode(ProtoReader protoReader) throws IOException {
            C23063a aVar = new C23063a();
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
                    aVar.f56964a.add(FileDescriptorProto.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileDescriptorSet fileDescriptorSet) throws IOException {
            FileDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, fileDescriptorSet.file);
            protoWriter.writeBytes(fileDescriptorSet.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.FileDescriptorSet$a */
    public static final class C23063a extends Message.Builder<FileDescriptorSet, C23063a> {

        /* renamed from: a */
        public List<FileDescriptorProto> f56964a = Internal.newMutableList();

        /* renamed from: a */
        public FileDescriptorSet build() {
            return new FileDescriptorSet(this.f56964a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23063a newBuilder() {
        C23063a aVar = new C23063a();
        aVar.f56964a = Internal.copyOf("file", this.file);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "FileDescriptorSet");
        StringBuilder sb = new StringBuilder();
        if (!this.file.isEmpty()) {
            sb.append(", file=");
            sb.append(this.file);
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
        this.file = Internal.immutableCopyOf("file", list);
    }
}
