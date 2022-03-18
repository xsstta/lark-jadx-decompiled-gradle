package com.bytedance.lark.pb.block.v1;

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

public final class PushBlockExtensionEntityChanged extends Message<PushBlockExtensionEntityChanged, C15486a> {
    public static final ProtoAdapter<PushBlockExtensionEntityChanged> ADAPTER = new C15487b();
    private static final long serialVersionUID = 0;
    public final String ext_type;
    public final List<String> ids;

    /* renamed from: com.bytedance.lark.pb.block.v1.PushBlockExtensionEntityChanged$b */
    private static final class C15487b extends ProtoAdapter<PushBlockExtensionEntityChanged> {
        C15487b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushBlockExtensionEntityChanged.class);
        }

        /* renamed from: a */
        public int encodedSize(PushBlockExtensionEntityChanged pushBlockExtensionEntityChanged) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushBlockExtensionEntityChanged.ext_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pushBlockExtensionEntityChanged.ids) + pushBlockExtensionEntityChanged.unknownFields().size();
        }

        /* renamed from: a */
        public PushBlockExtensionEntityChanged decode(ProtoReader protoReader) throws IOException {
            C15486a aVar = new C15486a();
            aVar.f40945a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40945a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40946b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushBlockExtensionEntityChanged pushBlockExtensionEntityChanged) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushBlockExtensionEntityChanged.ext_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pushBlockExtensionEntityChanged.ids);
            protoWriter.writeBytes(pushBlockExtensionEntityChanged.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.PushBlockExtensionEntityChanged$a */
    public static final class C15486a extends Message.Builder<PushBlockExtensionEntityChanged, C15486a> {

        /* renamed from: a */
        public String f40945a;

        /* renamed from: b */
        public List<String> f40946b = Internal.newMutableList();

        /* renamed from: a */
        public PushBlockExtensionEntityChanged build() {
            String str = this.f40945a;
            if (str != null) {
                return new PushBlockExtensionEntityChanged(str, this.f40946b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "ext_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C15486a newBuilder() {
        C15486a aVar = new C15486a();
        aVar.f40945a = this.ext_type;
        aVar.f40946b = Internal.copyOf("ids", this.ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "PushBlockExtensionEntityChanged");
        StringBuilder sb = new StringBuilder();
        sb.append(", ext_type=");
        sb.append(this.ext_type);
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushBlockExtensionEntityChanged{");
        replace.append('}');
        return replace.toString();
    }

    public PushBlockExtensionEntityChanged(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public PushBlockExtensionEntityChanged(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ext_type = str;
        this.ids = Internal.immutableCopyOf("ids", list);
    }
}
