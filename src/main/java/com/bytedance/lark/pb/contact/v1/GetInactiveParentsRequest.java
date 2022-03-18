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

public final class GetInactiveParentsRequest extends Message<GetInactiveParentsRequest, C16248a> {
    public static final ProtoAdapter<GetInactiveParentsRequest> ADAPTER = new C16249b();
    public static final Integer DEFAULT_LIMIT = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String department_id;
    public final Integer limit;
    public final Integer offset;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetInactiveParentsRequest$b */
    private static final class C16249b extends ProtoAdapter<GetInactiveParentsRequest> {
        C16249b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInactiveParentsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInactiveParentsRequest getInactiveParentsRequest) {
            int i;
            int i2 = 0;
            if (getInactiveParentsRequest.department_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getInactiveParentsRequest.department_id);
            } else {
                i = 0;
            }
            if (getInactiveParentsRequest.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getInactiveParentsRequest.chat_id);
            }
            return i + i2 + ProtoAdapter.INT32.encodedSizeWithTag(3, getInactiveParentsRequest.limit) + ProtoAdapter.INT32.encodedSizeWithTag(4, getInactiveParentsRequest.offset) + getInactiveParentsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetInactiveParentsRequest decode(ProtoReader protoReader) throws IOException {
            C16248a aVar = new C16248a();
            aVar.f42443a = "";
            aVar.f42444b = "";
            aVar.f42445c = 0;
            aVar.f42446d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42443a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42444b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42445c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42446d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetInactiveParentsRequest getInactiveParentsRequest) throws IOException {
            if (getInactiveParentsRequest.department_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getInactiveParentsRequest.department_id);
            }
            if (getInactiveParentsRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getInactiveParentsRequest.chat_id);
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getInactiveParentsRequest.limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getInactiveParentsRequest.offset);
            protoWriter.writeBytes(getInactiveParentsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16248a newBuilder() {
        C16248a aVar = new C16248a();
        aVar.f42443a = this.department_id;
        aVar.f42444b = this.chat_id;
        aVar.f42445c = this.limit;
        aVar.f42446d = this.offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetInactiveParentsRequest$a */
    public static final class C16248a extends Message.Builder<GetInactiveParentsRequest, C16248a> {

        /* renamed from: a */
        public String f42443a;

        /* renamed from: b */
        public String f42444b;

        /* renamed from: c */
        public Integer f42445c;

        /* renamed from: d */
        public Integer f42446d;

        /* renamed from: a */
        public GetInactiveParentsRequest build() {
            Integer num;
            Integer num2 = this.f42445c;
            if (num2 != null && (num = this.f42446d) != null) {
                return new GetInactiveParentsRequest(this.f42443a, this.f42444b, num2, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "limit", this.f42446d, "offset");
        }

        /* renamed from: a */
        public C16248a mo58206a(Integer num) {
            this.f42445c = num;
            return this;
        }

        /* renamed from: b */
        public C16248a mo58209b(Integer num) {
            this.f42446d = num;
            return this;
        }

        /* renamed from: a */
        public C16248a mo58207a(String str) {
            this.f42443a = str;
            return this;
        }

        /* renamed from: b */
        public C16248a mo58210b(String str) {
            this.f42444b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetInactiveParentsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", offset=");
        sb.append(this.offset);
        StringBuilder replace = sb.replace(0, 2, "GetInactiveParentsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetInactiveParentsRequest(String str, String str2, Integer num, Integer num2) {
        this(str, str2, num, num2, ByteString.EMPTY);
    }

    public GetInactiveParentsRequest(String str, String str2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_id = str;
        this.chat_id = str2;
        this.limit = num;
        this.offset = num2;
    }
}
