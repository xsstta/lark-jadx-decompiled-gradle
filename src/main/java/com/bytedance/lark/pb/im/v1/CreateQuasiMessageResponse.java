package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Trace;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreateQuasiMessageResponse extends Message<CreateQuasiMessageResponse, C17376a> {
    public static final ProtoAdapter<CreateQuasiMessageResponse> ADAPTER = new C17377b();
    private static final long serialVersionUID = 0;
    public final String cid;
    public final C14928Entity entity;
    public final Trace trace;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateQuasiMessageResponse$b */
    private static final class C17377b extends ProtoAdapter<CreateQuasiMessageResponse> {
        C17377b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateQuasiMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateQuasiMessageResponse createQuasiMessageResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createQuasiMessageResponse.cid) + C14928Entity.ADAPTER.encodedSizeWithTag(2, createQuasiMessageResponse.entity);
            if (createQuasiMessageResponse.trace != null) {
                i = Trace.ADAPTER.encodedSizeWithTag(3, createQuasiMessageResponse.trace);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + createQuasiMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateQuasiMessageResponse decode(ProtoReader protoReader) throws IOException {
            C17376a aVar = new C17376a();
            aVar.f44270a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44270a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44271b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44272c = Trace.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateQuasiMessageResponse createQuasiMessageResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createQuasiMessageResponse.cid);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, createQuasiMessageResponse.entity);
            if (createQuasiMessageResponse.trace != null) {
                Trace.ADAPTER.encodeWithTag(protoWriter, 3, createQuasiMessageResponse.trace);
            }
            protoWriter.writeBytes(createQuasiMessageResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17376a newBuilder() {
        C17376a aVar = new C17376a();
        aVar.f44270a = this.cid;
        aVar.f44271b = this.entity;
        aVar.f44272c = this.trace;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateQuasiMessageResponse$a */
    public static final class C17376a extends Message.Builder<CreateQuasiMessageResponse, C17376a> {

        /* renamed from: a */
        public String f44270a;

        /* renamed from: b */
        public C14928Entity f44271b;

        /* renamed from: c */
        public Trace f44272c;

        /* renamed from: a */
        public CreateQuasiMessageResponse build() {
            C14928Entity entity;
            String str = this.f44270a;
            if (str != null && (entity = this.f44271b) != null) {
                return new CreateQuasiMessageResponse(str, entity, this.f44272c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cid", this.f44271b, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateQuasiMessageResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", cid=");
        sb.append(this.cid);
        sb.append(", entity=");
        sb.append(this.entity);
        if (this.trace != null) {
            sb.append(", trace=");
            sb.append(this.trace);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateQuasiMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateQuasiMessageResponse(String str, C14928Entity entity2, Trace trace2) {
        this(str, entity2, trace2, ByteString.EMPTY);
    }

    public CreateQuasiMessageResponse(String str, C14928Entity entity2, Trace trace2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
        this.entity = entity2;
        this.trace = trace2;
    }
}
