package com.bytedance.lark.pb.contact.v2;

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

public final class MGetUserInfoByCpsRequest extends Message<MGetUserInfoByCpsRequest, C16540a> {
    public static final ProtoAdapter<MGetUserInfoByCpsRequest> ADAPTER = new C16541b();
    private static final long serialVersionUID = 0;
    public final List<String> contact_points;

    /* renamed from: com.bytedance.lark.pb.contact.v2.MGetUserInfoByCpsRequest$b */
    private static final class C16541b extends ProtoAdapter<MGetUserInfoByCpsRequest> {
        C16541b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetUserInfoByCpsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetUserInfoByCpsRequest mGetUserInfoByCpsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetUserInfoByCpsRequest.contact_points) + mGetUserInfoByCpsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetUserInfoByCpsRequest decode(ProtoReader protoReader) throws IOException {
            C16540a aVar = new C16540a();
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
                    aVar.f42901a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetUserInfoByCpsRequest mGetUserInfoByCpsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetUserInfoByCpsRequest.contact_points);
            protoWriter.writeBytes(mGetUserInfoByCpsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.MGetUserInfoByCpsRequest$a */
    public static final class C16540a extends Message.Builder<MGetUserInfoByCpsRequest, C16540a> {

        /* renamed from: a */
        public List<String> f42901a = Internal.newMutableList();

        /* renamed from: a */
        public MGetUserInfoByCpsRequest build() {
            return new MGetUserInfoByCpsRequest(this.f42901a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16540a mo58883a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42901a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16540a newBuilder() {
        C16540a aVar = new C16540a();
        aVar.f42901a = Internal.copyOf("contact_points", this.contact_points);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "MGetUserInfoByCpsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.contact_points.isEmpty()) {
            sb.append(", contact_points=");
            sb.append(this.contact_points);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetUserInfoByCpsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetUserInfoByCpsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetUserInfoByCpsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.contact_points = Internal.immutableCopyOf("contact_points", list);
    }
}
