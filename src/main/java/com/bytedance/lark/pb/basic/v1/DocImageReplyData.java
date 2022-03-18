package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DocImageReplyData extends Message<DocImageReplyData, C14878a> {
    public static final ProtoAdapter<DocImageReplyData> ADAPTER = new C14879b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long create_time;
    public final String doc_image_reply_body;

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocImageReplyData$b */
    private static final class C14879b extends ProtoAdapter<DocImageReplyData> {
        C14879b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocImageReplyData.class);
        }

        /* renamed from: a */
        public int encodedSize(DocImageReplyData docImageReplyData) {
            int i;
            int i2 = 0;
            if (docImageReplyData.create_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, docImageReplyData.create_time);
            } else {
                i = 0;
            }
            if (docImageReplyData.doc_image_reply_body != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, docImageReplyData.doc_image_reply_body);
            }
            return i + i2 + docImageReplyData.unknownFields().size();
        }

        /* renamed from: a */
        public DocImageReplyData decode(ProtoReader protoReader) throws IOException {
            C14878a aVar = new C14878a();
            aVar.f39356a = 0L;
            aVar.f39357b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39356a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39357b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocImageReplyData docImageReplyData) throws IOException {
            if (docImageReplyData.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, docImageReplyData.create_time);
            }
            if (docImageReplyData.doc_image_reply_body != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docImageReplyData.doc_image_reply_body);
            }
            protoWriter.writeBytes(docImageReplyData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocImageReplyData$a */
    public static final class C14878a extends Message.Builder<DocImageReplyData, C14878a> {

        /* renamed from: a */
        public Long f39356a;

        /* renamed from: b */
        public String f39357b;

        /* renamed from: a */
        public DocImageReplyData build() {
            return new DocImageReplyData(this.f39356a, this.f39357b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14878a newBuilder() {
        C14878a aVar = new C14878a();
        aVar.f39356a = this.create_time;
        aVar.f39357b = this.doc_image_reply_body;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DocImageReplyData");
        StringBuilder sb = new StringBuilder();
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.doc_image_reply_body != null) {
            sb.append(", doc_image_reply_body=");
            sb.append(this.doc_image_reply_body);
        }
        StringBuilder replace = sb.replace(0, 2, "DocImageReplyData{");
        replace.append('}');
        return replace.toString();
    }

    public DocImageReplyData(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public DocImageReplyData(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.create_time = l;
        this.doc_image_reply_body = str;
    }
}
