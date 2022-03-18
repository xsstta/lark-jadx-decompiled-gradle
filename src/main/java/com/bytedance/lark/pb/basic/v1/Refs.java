package com.bytedance.lark.pb.basic.v1;

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

public final class Refs extends Message<Refs, C15149a> {
    public static final ProtoAdapter<Refs> ADAPTER = new C15150b();
    private static final long serialVersionUID = 0;
    public final List<Ref> refs;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Refs$b */
    private static final class C15150b extends ProtoAdapter<Refs> {
        C15150b() {
            super(FieldEncoding.LENGTH_DELIMITED, Refs.class);
        }

        /* renamed from: a */
        public int encodedSize(Refs refs) {
            return Ref.ADAPTER.asRepeated().encodedSizeWithTag(1, refs.refs) + refs.unknownFields().size();
        }

        /* renamed from: a */
        public Refs decode(ProtoReader protoReader) throws IOException {
            C15149a aVar = new C15149a();
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
                    aVar.f40190a.add(Ref.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Refs refs) throws IOException {
            Ref.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, refs.refs);
            protoWriter.writeBytes(refs.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Refs$a */
    public static final class C15149a extends Message.Builder<Refs, C15149a> {

        /* renamed from: a */
        public List<Ref> f40190a = Internal.newMutableList();

        /* renamed from: a */
        public Refs build() {
            return new Refs(this.f40190a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15149a newBuilder() {
        C15149a aVar = new C15149a();
        aVar.f40190a = Internal.copyOf("refs", this.refs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Refs");
        StringBuilder sb = new StringBuilder();
        if (!this.refs.isEmpty()) {
            sb.append(", refs=");
            sb.append(this.refs);
        }
        StringBuilder replace = sb.replace(0, 2, "Refs{");
        replace.append('}');
        return replace.toString();
    }

    public Refs(List<Ref> list) {
        this(list, ByteString.EMPTY);
    }

    public Refs(List<Ref> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.refs = Internal.immutableCopyOf("refs", list);
    }
}
