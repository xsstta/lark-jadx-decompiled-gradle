package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullManagedSchoolNodeRequest extends Message<PullManagedSchoolNodeRequest, C16342a> {
    public static final ProtoAdapter<PullManagedSchoolNodeRequest> ADAPTER = new C16343b();
    public static final Boolean DEFAULT_GET_INACTIVE_PARENTS = false;
    public static final Boolean DEFAULT_IS_FROM_SERVER = true;
    private static final long serialVersionUID = 0;
    public final Boolean get_inactive_parents;
    public final Boolean is_from_server;

    /* renamed from: com.bytedance.lark.pb.contact.v1.PullManagedSchoolNodeRequest$b */
    private static final class C16343b extends ProtoAdapter<PullManagedSchoolNodeRequest> {
        C16343b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullManagedSchoolNodeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullManagedSchoolNodeRequest pullManagedSchoolNodeRequest) {
            int i;
            int i2 = 0;
            if (pullManagedSchoolNodeRequest.get_inactive_parents != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pullManagedSchoolNodeRequest.get_inactive_parents);
            } else {
                i = 0;
            }
            if (pullManagedSchoolNodeRequest.is_from_server != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, pullManagedSchoolNodeRequest.is_from_server);
            }
            return i + i2 + pullManagedSchoolNodeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullManagedSchoolNodeRequest decode(ProtoReader protoReader) throws IOException {
            C16342a aVar = new C16342a();
            aVar.f42585a = false;
            aVar.f42586b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42585a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42586b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullManagedSchoolNodeRequest pullManagedSchoolNodeRequest) throws IOException {
            if (pullManagedSchoolNodeRequest.get_inactive_parents != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pullManagedSchoolNodeRequest.get_inactive_parents);
            }
            if (pullManagedSchoolNodeRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullManagedSchoolNodeRequest.is_from_server);
            }
            protoWriter.writeBytes(pullManagedSchoolNodeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.PullManagedSchoolNodeRequest$a */
    public static final class C16342a extends Message.Builder<PullManagedSchoolNodeRequest, C16342a> {

        /* renamed from: a */
        public Boolean f42585a;

        /* renamed from: b */
        public Boolean f42586b;

        /* renamed from: a */
        public PullManagedSchoolNodeRequest build() {
            return new PullManagedSchoolNodeRequest(this.f42585a, this.f42586b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16342a mo58411a(Boolean bool) {
            this.f42585a = bool;
            return this;
        }

        /* renamed from: b */
        public C16342a mo58413b(Boolean bool) {
            this.f42586b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16342a newBuilder() {
        C16342a aVar = new C16342a();
        aVar.f42585a = this.get_inactive_parents;
        aVar.f42586b = this.is_from_server;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PullManagedSchoolNodeRequest");
        StringBuilder sb = new StringBuilder();
        if (this.get_inactive_parents != null) {
            sb.append(", get_inactive_parents=");
            sb.append(this.get_inactive_parents);
        }
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        StringBuilder replace = sb.replace(0, 2, "PullManagedSchoolNodeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullManagedSchoolNodeRequest(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public PullManagedSchoolNodeRequest(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.get_inactive_parents = bool;
        this.is_from_server = bool2;
    }
}
