package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullSchoolNodeResponse extends Message<PullSchoolNodeResponse, C16348a> {
    public static final ProtoAdapter<PullSchoolNodeResponse> ADAPTER = new C16349b();
    private static final long serialVersionUID = 0;
    public final SchoolNode node;

    /* renamed from: com.bytedance.lark.pb.contact.v1.PullSchoolNodeResponse$b */
    private static final class C16349b extends ProtoAdapter<PullSchoolNodeResponse> {
        C16349b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullSchoolNodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullSchoolNodeResponse pullSchoolNodeResponse) {
            return SchoolNode.ADAPTER.encodedSizeWithTag(1, pullSchoolNodeResponse.node) + pullSchoolNodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullSchoolNodeResponse decode(ProtoReader protoReader) throws IOException {
            C16348a aVar = new C16348a();
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
                    aVar.f42594a = SchoolNode.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullSchoolNodeResponse pullSchoolNodeResponse) throws IOException {
            SchoolNode.ADAPTER.encodeWithTag(protoWriter, 1, pullSchoolNodeResponse.node);
            protoWriter.writeBytes(pullSchoolNodeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.PullSchoolNodeResponse$a */
    public static final class C16348a extends Message.Builder<PullSchoolNodeResponse, C16348a> {

        /* renamed from: a */
        public SchoolNode f42594a;

        /* renamed from: a */
        public PullSchoolNodeResponse build() {
            SchoolNode schoolNode = this.f42594a;
            if (schoolNode != null) {
                return new PullSchoolNodeResponse(schoolNode, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(schoolNode, "node");
        }
    }

    @Override // com.squareup.wire.Message
    public C16348a newBuilder() {
        C16348a aVar = new C16348a();
        aVar.f42594a = this.node;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PullSchoolNodeResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", node=");
        sb.append(this.node);
        StringBuilder replace = sb.replace(0, 2, "PullSchoolNodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullSchoolNodeResponse(SchoolNode schoolNode) {
        this(schoolNode, ByteString.EMPTY);
    }

    public PullSchoolNodeResponse(SchoolNode schoolNode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.node = schoolNode;
    }
}
