package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetRepliesResponse extends Message<GetRepliesResponse, C17676a> {
    public static final ProtoAdapter<GetRepliesResponse> ADAPTER = new C17677b();
    private static final long serialVersionUID = 0;
    public final List<String> child_ids;
    public final List<String> child_quasi_ids;
    public final C14928Entity entity;
    public final String root_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetRepliesResponse$b */
    private static final class C17677b extends ProtoAdapter<GetRepliesResponse> {
        C17677b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRepliesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRepliesResponse getRepliesResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getRepliesResponse.root_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getRepliesResponse.child_ids) + C14928Entity.ADAPTER.encodedSizeWithTag(3, getRepliesResponse.entity) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, getRepliesResponse.child_quasi_ids) + getRepliesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRepliesResponse decode(ProtoReader protoReader) throws IOException {
            C17676a aVar = new C17676a();
            aVar.f44688a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44688a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44689b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44690c = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44691d.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRepliesResponse getRepliesResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getRepliesResponse.root_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getRepliesResponse.child_ids);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, getRepliesResponse.entity);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, getRepliesResponse.child_quasi_ids);
            protoWriter.writeBytes(getRepliesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetRepliesResponse$a */
    public static final class C17676a extends Message.Builder<GetRepliesResponse, C17676a> {

        /* renamed from: a */
        public String f44688a;

        /* renamed from: b */
        public List<String> f44689b = Internal.newMutableList();

        /* renamed from: c */
        public C14928Entity f44690c;

        /* renamed from: d */
        public List<String> f44691d = Internal.newMutableList();

        /* renamed from: a */
        public GetRepliesResponse build() {
            C14928Entity entity;
            String str = this.f44688a;
            if (str != null && (entity = this.f44690c) != null) {
                return new GetRepliesResponse(str, this.f44689b, entity, this.f44691d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "root_id", this.f44690c, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17676a newBuilder() {
        C17676a aVar = new C17676a();
        aVar.f44688a = this.root_id;
        aVar.f44689b = Internal.copyOf("child_ids", this.child_ids);
        aVar.f44690c = this.entity;
        aVar.f44691d = Internal.copyOf("child_quasi_ids", this.child_quasi_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetRepliesResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", root_id=");
        sb.append(this.root_id);
        if (!this.child_ids.isEmpty()) {
            sb.append(", child_ids=");
            sb.append(this.child_ids);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.child_quasi_ids.isEmpty()) {
            sb.append(", child_quasi_ids=");
            sb.append(this.child_quasi_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRepliesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRepliesResponse(String str, List<String> list, C14928Entity entity2, List<String> list2) {
        this(str, list, entity2, list2, ByteString.EMPTY);
    }

    public GetRepliesResponse(String str, List<String> list, C14928Entity entity2, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.root_id = str;
        this.child_ids = Internal.immutableCopyOf("child_ids", list);
        this.entity = entity2;
        this.child_quasi_ids = Internal.immutableCopyOf("child_quasi_ids", list2);
    }
}
