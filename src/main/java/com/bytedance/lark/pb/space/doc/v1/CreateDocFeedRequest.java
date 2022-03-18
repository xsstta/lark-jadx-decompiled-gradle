package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class CreateDocFeedRequest extends Message<CreateDocFeedRequest, C19235a> {
    public static final ProtoAdapter<CreateDocFeedRequest> ADAPTER = new C19236b();
    public static final Doc.Type DEFAULT_TYPE = Doc.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String key;
    public final Doc.Type type;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.CreateDocFeedRequest$b */
    private static final class C19236b extends ProtoAdapter<CreateDocFeedRequest> {
        C19236b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateDocFeedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateDocFeedRequest createDocFeedRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createDocFeedRequest.key) + Doc.Type.ADAPTER.encodedSizeWithTag(2, createDocFeedRequest.type) + createDocFeedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateDocFeedRequest decode(ProtoReader protoReader) throws IOException {
            C19235a aVar = new C19235a();
            aVar.f47409a = "";
            aVar.f47410b = Doc.Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47409a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47410b = Doc.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateDocFeedRequest createDocFeedRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createDocFeedRequest.key);
            Doc.Type.ADAPTER.encodeWithTag(protoWriter, 2, createDocFeedRequest.type);
            protoWriter.writeBytes(createDocFeedRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19235a newBuilder() {
        C19235a aVar = new C19235a();
        aVar.f47409a = this.key;
        aVar.f47410b = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.CreateDocFeedRequest$a */
    public static final class C19235a extends Message.Builder<CreateDocFeedRequest, C19235a> {

        /* renamed from: a */
        public String f47409a;

        /* renamed from: b */
        public Doc.Type f47410b;

        /* renamed from: a */
        public CreateDocFeedRequest build() {
            Doc.Type type;
            String str = this.f47409a;
            if (str != null && (type = this.f47410b) != null) {
                return new CreateDocFeedRequest(str, type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key", this.f47410b, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C19235a mo65656a(Doc.Type type) {
            this.f47410b = type;
            return this;
        }

        /* renamed from: a */
        public C19235a mo65657a(String str) {
            this.f47409a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CreateDocFeedRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", type=");
        sb.append(this.type);
        StringBuilder replace = sb.replace(0, 2, "CreateDocFeedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateDocFeedRequest(String str, Doc.Type type2) {
        this(str, type2, ByteString.EMPTY);
    }

    public CreateDocFeedRequest(String str, Doc.Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.type = type2;
    }
}
