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

public final class PullSchoolNodeRequest extends Message<PullSchoolNodeRequest, C16346a> {
    public static final ProtoAdapter<PullSchoolNodeRequest> ADAPTER = new C16347b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Boolean DEFAULT_GET_INACTIVE_PARENTS = false;
    public static final Boolean DEFAULT_IS_FROM_SERVER = true;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Boolean get_inactive_parents;
    public final Boolean is_from_server;
    public final Integer offset;
    public final String school_node_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.PullSchoolNodeRequest$b */
    private static final class C16347b extends ProtoAdapter<PullSchoolNodeRequest> {
        C16347b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullSchoolNodeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullSchoolNodeRequest pullSchoolNodeRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pullSchoolNodeRequest.school_node_id);
            int i4 = 0;
            if (pullSchoolNodeRequest.offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pullSchoolNodeRequest.offset);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (pullSchoolNodeRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, pullSchoolNodeRequest.count);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (pullSchoolNodeRequest.get_inactive_parents != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pullSchoolNodeRequest.get_inactive_parents);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (pullSchoolNodeRequest.is_from_server != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, pullSchoolNodeRequest.is_from_server);
            }
            return i7 + i4 + pullSchoolNodeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullSchoolNodeRequest decode(ProtoReader protoReader) throws IOException {
            C16346a aVar = new C16346a();
            aVar.f42589a = "";
            aVar.f42590b = 0;
            aVar.f42591c = 0;
            aVar.f42592d = false;
            aVar.f42593e = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42589a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42590b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42591c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42592d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42593e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullSchoolNodeRequest pullSchoolNodeRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullSchoolNodeRequest.school_node_id);
            if (pullSchoolNodeRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullSchoolNodeRequest.offset);
            }
            if (pullSchoolNodeRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, pullSchoolNodeRequest.count);
            }
            if (pullSchoolNodeRequest.get_inactive_parents != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pullSchoolNodeRequest.get_inactive_parents);
            }
            if (pullSchoolNodeRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pullSchoolNodeRequest.is_from_server);
            }
            protoWriter.writeBytes(pullSchoolNodeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.PullSchoolNodeRequest$a */
    public static final class C16346a extends Message.Builder<PullSchoolNodeRequest, C16346a> {

        /* renamed from: a */
        public String f42589a;

        /* renamed from: b */
        public Integer f42590b;

        /* renamed from: c */
        public Integer f42591c;

        /* renamed from: d */
        public Boolean f42592d;

        /* renamed from: e */
        public Boolean f42593e;

        /* renamed from: a */
        public PullSchoolNodeRequest build() {
            String str = this.f42589a;
            if (str != null) {
                return new PullSchoolNodeRequest(str, this.f42590b, this.f42591c, this.f42592d, this.f42593e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "school_node_id");
        }

        /* renamed from: a */
        public C16346a mo58421a(Boolean bool) {
            this.f42592d = bool;
            return this;
        }

        /* renamed from: b */
        public C16346a mo58425b(Integer num) {
            this.f42591c = num;
            return this;
        }

        /* renamed from: a */
        public C16346a mo58422a(Integer num) {
            this.f42590b = num;
            return this;
        }

        /* renamed from: a */
        public C16346a mo58423a(String str) {
            this.f42589a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16346a newBuilder() {
        C16346a aVar = new C16346a();
        aVar.f42589a = this.school_node_id;
        aVar.f42590b = this.offset;
        aVar.f42591c = this.count;
        aVar.f42592d = this.get_inactive_parents;
        aVar.f42593e = this.is_from_server;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PullSchoolNodeRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", school_node_id=");
        sb.append(this.school_node_id);
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.get_inactive_parents != null) {
            sb.append(", get_inactive_parents=");
            sb.append(this.get_inactive_parents);
        }
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        StringBuilder replace = sb.replace(0, 2, "PullSchoolNodeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullSchoolNodeRequest(String str, Integer num, Integer num2, Boolean bool, Boolean bool2) {
        this(str, num, num2, bool, bool2, ByteString.EMPTY);
    }

    public PullSchoolNodeRequest(String str, Integer num, Integer num2, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.school_node_id = str;
        this.offset = num;
        this.count = num2;
        this.get_inactive_parents = bool;
        this.is_from_server = bool2;
    }
}
