package com.bytedance.lark.pb.space.doc.v1;

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

public final class MGetDocFeedsRequest extends Message<MGetDocFeedsRequest, C19269a> {
    public static final ProtoAdapter<MGetDocFeedsRequest> ADAPTER = new C19270b();
    private static final long serialVersionUID = 0;
    public final List<String> ids;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsRequest$b */
    private static final class C19270b extends ProtoAdapter<MGetDocFeedsRequest> {
        C19270b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetDocFeedsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetDocFeedsRequest mGetDocFeedsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetDocFeedsRequest.ids) + mGetDocFeedsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetDocFeedsRequest decode(ProtoReader protoReader) throws IOException {
            C19269a aVar = new C19269a();
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
                    aVar.f47463a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetDocFeedsRequest mGetDocFeedsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetDocFeedsRequest.ids);
            protoWriter.writeBytes(mGetDocFeedsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsRequest$a */
    public static final class C19269a extends Message.Builder<MGetDocFeedsRequest, C19269a> {

        /* renamed from: a */
        public List<String> f47463a = Internal.newMutableList();

        /* renamed from: a */
        public MGetDocFeedsRequest build() {
            return new MGetDocFeedsRequest(this.f47463a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19269a mo65737a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47463a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19269a newBuilder() {
        C19269a aVar = new C19269a();
        aVar.f47463a = Internal.copyOf("ids", this.ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "MGetDocFeedsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetDocFeedsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetDocFeedsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetDocFeedsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ids = Internal.immutableCopyOf("ids", list);
    }
}
