package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UpdateDocMeReadRequest extends Message<UpdateDocMeReadRequest, C19281a> {
    public static final ProtoAdapter<UpdateDocMeReadRequest> ADAPTER = new C19282b();
    public static final Doc.Type DEFAULT_DOC_TYPE = Doc.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Doc.Type doc_type;
    public final List<String> message_ids;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocMeReadRequest$b */
    private static final class C19282b extends ProtoAdapter<UpdateDocMeReadRequest> {
        C19282b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateDocMeReadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateDocMeReadRequest updateDocMeReadRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, updateDocMeReadRequest.message_ids);
            int i2 = 0;
            if (updateDocMeReadRequest.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, updateDocMeReadRequest.token);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (updateDocMeReadRequest.doc_type != null) {
                i2 = Doc.Type.ADAPTER.encodedSizeWithTag(3, updateDocMeReadRequest.doc_type);
            }
            return i3 + i2 + updateDocMeReadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateDocMeReadRequest decode(ProtoReader protoReader) throws IOException {
            C19281a aVar = new C19281a();
            aVar.f47471b = "";
            aVar.f47472c = Doc.Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47470a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47471b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47472c = Doc.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateDocMeReadRequest updateDocMeReadRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, updateDocMeReadRequest.message_ids);
            if (updateDocMeReadRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateDocMeReadRequest.token);
            }
            if (updateDocMeReadRequest.doc_type != null) {
                Doc.Type.ADAPTER.encodeWithTag(protoWriter, 3, updateDocMeReadRequest.doc_type);
            }
            protoWriter.writeBytes(updateDocMeReadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocMeReadRequest$a */
    public static final class C19281a extends Message.Builder<UpdateDocMeReadRequest, C19281a> {

        /* renamed from: a */
        public List<String> f47470a = Internal.newMutableList();

        /* renamed from: b */
        public String f47471b;

        /* renamed from: c */
        public Doc.Type f47472c;

        /* renamed from: a */
        public UpdateDocMeReadRequest build() {
            return new UpdateDocMeReadRequest(this.f47470a, this.f47471b, this.f47472c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19281a mo65765a(Doc.Type type) {
            this.f47472c = type;
            return this;
        }

        /* renamed from: a */
        public C19281a mo65766a(String str) {
            this.f47471b = str;
            return this;
        }

        /* renamed from: a */
        public C19281a mo65767a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47470a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19281a newBuilder() {
        C19281a aVar = new C19281a();
        aVar.f47470a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f47471b = this.token;
        aVar.f47472c = this.doc_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UpdateDocMeReadRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.doc_type != null) {
            sb.append(", doc_type=");
            sb.append(this.doc_type);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateDocMeReadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateDocMeReadRequest(List<String> list, String str, Doc.Type type) {
        this(list, str, type, ByteString.EMPTY);
    }

    public UpdateDocMeReadRequest(List<String> list, String str, Doc.Type type, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
        this.token = str;
        this.doc_type = type;
    }
}
