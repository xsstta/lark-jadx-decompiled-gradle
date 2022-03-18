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
import java.util.Map;
import okio.ByteString;

public final class MailGetDocsByUrlsResponse extends Message<MailGetDocsByUrlsResponse, C16710a> {
    public static final ProtoAdapter<MailGetDocsByUrlsResponse> ADAPTER = new C16711b();
    private static final long serialVersionUID = 0;
    public final Map<String, DocStruct> docs;
    public final List<String> invalid_urls;
    public final List<String> no_perm_urls;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsResponse$a */
    public static final class C16710a extends Message.Builder<MailGetDocsByUrlsResponse, C16710a> {

        /* renamed from: a */
        public Map<String, DocStruct> f43172a = Internal.newMutableMap();

        /* renamed from: b */
        public List<String> f43173b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f43174c = Internal.newMutableList();

        /* renamed from: a */
        public MailGetDocsByUrlsResponse build() {
            return new MailGetDocsByUrlsResponse(this.f43172a, this.f43173b, this.f43174c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsResponse$b */
    private static final class C16711b extends ProtoAdapter<MailGetDocsByUrlsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, DocStruct>> f43175a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocStruct.ADAPTER);

        C16711b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetDocsByUrlsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetDocsByUrlsResponse mailGetDocsByUrlsResponse) {
            return this.f43175a.encodedSizeWithTag(1, mailGetDocsByUrlsResponse.docs) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mailGetDocsByUrlsResponse.invalid_urls) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, mailGetDocsByUrlsResponse.no_perm_urls) + mailGetDocsByUrlsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetDocsByUrlsResponse decode(ProtoReader protoReader) throws IOException {
            C16710a aVar = new C16710a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43172a.putAll(this.f43175a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43173b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43174c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetDocsByUrlsResponse mailGetDocsByUrlsResponse) throws IOException {
            this.f43175a.encodeWithTag(protoWriter, 1, mailGetDocsByUrlsResponse.docs);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mailGetDocsByUrlsResponse.invalid_urls);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, mailGetDocsByUrlsResponse.no_perm_urls);
            protoWriter.writeBytes(mailGetDocsByUrlsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16710a newBuilder() {
        C16710a aVar = new C16710a();
        aVar.f43172a = Internal.copyOf("docs", this.docs);
        aVar.f43173b = Internal.copyOf("invalid_urls", this.invalid_urls);
        aVar.f43174c = Internal.copyOf("no_perm_urls", this.no_perm_urls);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetDocsByUrlsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.docs.isEmpty()) {
            sb.append(", docs=");
            sb.append(this.docs);
        }
        if (!this.invalid_urls.isEmpty()) {
            sb.append(", invalid_urls=");
            sb.append(this.invalid_urls);
        }
        if (!this.no_perm_urls.isEmpty()) {
            sb.append(", no_perm_urls=");
            sb.append(this.no_perm_urls);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetDocsByUrlsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetDocsByUrlsResponse(Map<String, DocStruct> map, List<String> list, List<String> list2) {
        this(map, list, list2, ByteString.EMPTY);
    }

    public MailGetDocsByUrlsResponse(Map<String, DocStruct> map, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.docs = Internal.immutableCopyOf("docs", map);
        this.invalid_urls = Internal.immutableCopyOf("invalid_urls", list);
        this.no_perm_urls = Internal.immutableCopyOf("no_perm_urls", list2);
    }
}
