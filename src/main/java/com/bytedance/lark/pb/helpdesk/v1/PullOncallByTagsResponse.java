package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Oncall;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullOncallByTagsResponse extends Message<PullOncallByTagsResponse, C17274a> {
    public static final ProtoAdapter<PullOncallByTagsResponse> ADAPTER = new C17275b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<Oncall> oncalls;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PullOncallByTagsResponse$b */
    private static final class C17275b extends ProtoAdapter<PullOncallByTagsResponse> {
        C17275b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullOncallByTagsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullOncallByTagsResponse pullOncallByTagsResponse) {
            int i;
            int encodedSizeWithTag = Oncall.ADAPTER.asRepeated().encodedSizeWithTag(1, pullOncallByTagsResponse.oncalls);
            if (pullOncallByTagsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, pullOncallByTagsResponse.has_more);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pullOncallByTagsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullOncallByTagsResponse decode(ProtoReader protoReader) throws IOException {
            C17274a aVar = new C17274a();
            aVar.f44104b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44103a.add(Oncall.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44104b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullOncallByTagsResponse pullOncallByTagsResponse) throws IOException {
            Oncall.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullOncallByTagsResponse.oncalls);
            if (pullOncallByTagsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullOncallByTagsResponse.has_more);
            }
            protoWriter.writeBytes(pullOncallByTagsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PullOncallByTagsResponse$a */
    public static final class C17274a extends Message.Builder<PullOncallByTagsResponse, C17274a> {

        /* renamed from: a */
        public List<Oncall> f44103a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44104b;

        /* renamed from: a */
        public PullOncallByTagsResponse build() {
            return new PullOncallByTagsResponse(this.f44103a, this.f44104b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17274a newBuilder() {
        C17274a aVar = new C17274a();
        aVar.f44103a = Internal.copyOf("oncalls", this.oncalls);
        aVar.f44104b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "PullOncallByTagsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.oncalls.isEmpty()) {
            sb.append(", oncalls=");
            sb.append(this.oncalls);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "PullOncallByTagsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullOncallByTagsResponse(List<Oncall> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public PullOncallByTagsResponse(List<Oncall> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.oncalls = Internal.immutableCopyOf("oncalls", list);
        this.has_more = bool;
    }
}
