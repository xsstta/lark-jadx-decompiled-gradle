package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DocInfo extends Message<DocInfo, C19337a> {
    public static final ProtoAdapter<DocInfo> ADAPTER = new C19338b();
    public static final Integer DEFAULT_DOC_TYPE = 2;
    private static final long serialVersionUID = 0;
    public final String doc_token;
    public final Integer doc_type;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DocInfo$b */
    private static final class C19338b extends ProtoAdapter<DocInfo> {
        C19338b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(DocInfo docInfo) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, docInfo.doc_token);
            if (docInfo.doc_type != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, docInfo.doc_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + docInfo.unknownFields().size();
        }

        /* renamed from: a */
        public DocInfo decode(ProtoReader protoReader) throws IOException {
            C19337a aVar = new C19337a();
            aVar.f47529a = "";
            aVar.f47530b = 2;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47529a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47530b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocInfo docInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docInfo.doc_token);
            if (docInfo.doc_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, docInfo.doc_type);
            }
            protoWriter.writeBytes(docInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DocInfo$a */
    public static final class C19337a extends Message.Builder<DocInfo, C19337a> {

        /* renamed from: a */
        public String f47529a;

        /* renamed from: b */
        public Integer f47530b;

        /* renamed from: a */
        public DocInfo build() {
            String str = this.f47529a;
            if (str != null) {
                return new DocInfo(str, this.f47530b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "doc_token");
        }
    }

    @Override // com.squareup.wire.Message
    public C19337a newBuilder() {
        C19337a aVar = new C19337a();
        aVar.f47529a = this.doc_token;
        aVar.f47530b = this.doc_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DocInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", doc_token=");
        sb.append(this.doc_token);
        if (this.doc_type != null) {
            sb.append(", doc_type=");
            sb.append(this.doc_type);
        }
        StringBuilder replace = sb.replace(0, 2, "DocInfo{");
        replace.append('}');
        return replace.toString();
    }

    public DocInfo(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public DocInfo(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.doc_token = str;
        this.doc_type = num;
    }
}
