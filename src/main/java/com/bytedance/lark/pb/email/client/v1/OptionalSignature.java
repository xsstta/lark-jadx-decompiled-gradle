package com.bytedance.lark.pb.email.client.v1;

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

public final class OptionalSignature extends Message<OptionalSignature, C16974a> {
    public static final ProtoAdapter<OptionalSignature> ADAPTER = new C16975b();
    public static final Boolean DEFAULT_IS_FORCE_APPLY = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_force_apply;
    public final List<String> signature_ids;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.OptionalSignature$b */
    private static final class C16975b extends ProtoAdapter<OptionalSignature> {
        C16975b() {
            super(FieldEncoding.LENGTH_DELIMITED, OptionalSignature.class);
        }

        /* renamed from: a */
        public int encodedSize(OptionalSignature optionalSignature) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, optionalSignature.signature_ids);
            if (optionalSignature.is_force_apply != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, optionalSignature.is_force_apply);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + optionalSignature.unknownFields().size();
        }

        /* renamed from: a */
        public OptionalSignature decode(ProtoReader protoReader) throws IOException {
            C16974a aVar = new C16974a();
            aVar.f43535b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43534a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43535b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OptionalSignature optionalSignature) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, optionalSignature.signature_ids);
            if (optionalSignature.is_force_apply != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, optionalSignature.is_force_apply);
            }
            protoWriter.writeBytes(optionalSignature.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.OptionalSignature$a */
    public static final class C16974a extends Message.Builder<OptionalSignature, C16974a> {

        /* renamed from: a */
        public List<String> f43534a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f43535b;

        /* renamed from: a */
        public OptionalSignature build() {
            return new OptionalSignature(this.f43534a, this.f43535b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16974a newBuilder() {
        C16974a aVar = new C16974a();
        aVar.f43534a = Internal.copyOf("signature_ids", this.signature_ids);
        aVar.f43535b = this.is_force_apply;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "OptionalSignature");
        StringBuilder sb = new StringBuilder();
        if (!this.signature_ids.isEmpty()) {
            sb.append(", signature_ids=");
            sb.append(this.signature_ids);
        }
        if (this.is_force_apply != null) {
            sb.append(", is_force_apply=");
            sb.append(this.is_force_apply);
        }
        StringBuilder replace = sb.replace(0, 2, "OptionalSignature{");
        replace.append('}');
        return replace.toString();
    }

    public OptionalSignature(List<String> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public OptionalSignature(List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.signature_ids = Internal.immutableCopyOf("signature_ids", list);
        this.is_force_apply = bool;
    }
}
