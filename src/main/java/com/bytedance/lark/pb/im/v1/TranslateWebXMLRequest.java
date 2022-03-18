package com.bytedance.lark.pb.im.v1;

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

public final class TranslateWebXMLRequest extends Message<TranslateWebXMLRequest, C18109a> {
    public static final ProtoAdapter<TranslateWebXMLRequest> ADAPTER = new C18110b();
    public static final ContentType DEFAULT_CONTENT_TYPE = ContentType.UNKNOWN_CONTENT_TYPE;
    private static final long serialVersionUID = 0;
    public final ContentType content_type;
    public final List<String> src_contents;
    public final String src_language;
    public final String trg_language;

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateWebXMLRequest$b */
    private static final class C18110b extends ProtoAdapter<TranslateWebXMLRequest> {
        C18110b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateWebXMLRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateWebXMLRequest translateWebXMLRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, translateWebXMLRequest.src_contents) + ProtoAdapter.STRING.encodedSizeWithTag(2, translateWebXMLRequest.src_language) + ProtoAdapter.STRING.encodedSizeWithTag(3, translateWebXMLRequest.trg_language);
            if (translateWebXMLRequest.content_type != null) {
                i = ContentType.ADAPTER.encodedSizeWithTag(4, translateWebXMLRequest.content_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + translateWebXMLRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateWebXMLRequest decode(ProtoReader protoReader) throws IOException {
            C18109a aVar = new C18109a();
            aVar.f45260b = "";
            aVar.f45261c = "";
            aVar.f45262d = ContentType.UNKNOWN_CONTENT_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45259a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45260b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45261c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45262d = ContentType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateWebXMLRequest translateWebXMLRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, translateWebXMLRequest.src_contents);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, translateWebXMLRequest.src_language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, translateWebXMLRequest.trg_language);
            if (translateWebXMLRequest.content_type != null) {
                ContentType.ADAPTER.encodeWithTag(protoWriter, 4, translateWebXMLRequest.content_type);
            }
            protoWriter.writeBytes(translateWebXMLRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateWebXMLRequest$a */
    public static final class C18109a extends Message.Builder<TranslateWebXMLRequest, C18109a> {

        /* renamed from: a */
        public List<String> f45259a = Internal.newMutableList();

        /* renamed from: b */
        public String f45260b;

        /* renamed from: c */
        public String f45261c;

        /* renamed from: d */
        public ContentType f45262d;

        /* renamed from: a */
        public TranslateWebXMLRequest build() {
            String str;
            String str2 = this.f45260b;
            if (str2 != null && (str = this.f45261c) != null) {
                return new TranslateWebXMLRequest(this.f45259a, str2, str, this.f45262d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "src_language", this.f45261c, "trg_language");
        }

        /* renamed from: a */
        public C18109a mo62817a(ContentType contentType) {
            this.f45262d = contentType;
            return this;
        }

        /* renamed from: b */
        public C18109a mo62821b(String str) {
            this.f45261c = str;
            return this;
        }

        /* renamed from: a */
        public C18109a mo62818a(String str) {
            this.f45260b = str;
            return this;
        }

        /* renamed from: a */
        public C18109a mo62819a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45259a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18109a newBuilder() {
        C18109a aVar = new C18109a();
        aVar.f45259a = Internal.copyOf("src_contents", this.src_contents);
        aVar.f45260b = this.src_language;
        aVar.f45261c = this.trg_language;
        aVar.f45262d = this.content_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TranslateWebXMLRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.src_contents.isEmpty()) {
            sb.append(", src_contents=");
            sb.append(this.src_contents);
        }
        sb.append(", src_language=");
        sb.append(this.src_language);
        sb.append(", trg_language=");
        sb.append(this.trg_language);
        if (this.content_type != null) {
            sb.append(", content_type=");
            sb.append(this.content_type);
        }
        StringBuilder replace = sb.replace(0, 2, "TranslateWebXMLRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateWebXMLRequest(List<String> list, String str, String str2, ContentType contentType) {
        this(list, str, str2, contentType, ByteString.EMPTY);
    }

    public TranslateWebXMLRequest(List<String> list, String str, String str2, ContentType contentType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.src_contents = Internal.immutableCopyOf("src_contents", list);
        this.src_language = str;
        this.trg_language = str2;
        this.content_type = contentType;
    }
}
