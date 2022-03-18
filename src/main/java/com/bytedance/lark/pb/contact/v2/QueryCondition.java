package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class QueryCondition extends Message<QueryCondition, C16556a> {
    public static final ProtoAdapter<QueryCondition> ADAPTER = new C16557b();
    private static final long serialVersionUID = 0;
    public final String email;
    public final String namecard_id;
    public final Phone phone;

    /* renamed from: com.bytedance.lark.pb.contact.v2.QueryCondition$b */
    private static final class C16557b extends ProtoAdapter<QueryCondition> {
        C16557b() {
            super(FieldEncoding.LENGTH_DELIMITED, QueryCondition.class);
        }

        /* renamed from: a */
        public int encodedSize(QueryCondition queryCondition) {
            int i;
            int i2;
            int i3 = 0;
            if (queryCondition.namecard_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, queryCondition.namecard_id);
            } else {
                i = 0;
            }
            if (queryCondition.email != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, queryCondition.email);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (queryCondition.phone != null) {
                i3 = Phone.ADAPTER.encodedSizeWithTag(3, queryCondition.phone);
            }
            return i4 + i3 + queryCondition.unknownFields().size();
        }

        /* renamed from: a */
        public QueryCondition decode(ProtoReader protoReader) throws IOException {
            C16556a aVar = new C16556a();
            aVar.mo58934a("");
            aVar.mo58936b("");
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.mo58934a(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.mo58936b(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo58933a(Phone.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QueryCondition queryCondition) throws IOException {
            if (queryCondition.namecard_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, queryCondition.namecard_id);
            }
            if (queryCondition.email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, queryCondition.email);
            }
            if (queryCondition.phone != null) {
                Phone.ADAPTER.encodeWithTag(protoWriter, 3, queryCondition.phone);
            }
            protoWriter.writeBytes(queryCondition.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.QueryCondition$a */
    public static final class C16556a extends Message.Builder<QueryCondition, C16556a> {

        /* renamed from: a */
        public String f42924a;

        /* renamed from: b */
        public String f42925b;

        /* renamed from: c */
        public Phone f42926c;

        /* renamed from: a */
        public QueryCondition build() {
            return new QueryCondition(this.f42924a, this.f42925b, this.f42926c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16556a mo58933a(Phone phone) {
            this.f42926c = phone;
            this.f42924a = null;
            this.f42925b = null;
            return this;
        }

        /* renamed from: b */
        public C16556a mo58936b(String str) {
            this.f42925b = str;
            this.f42924a = null;
            this.f42926c = null;
            return this;
        }

        /* renamed from: a */
        public C16556a mo58934a(String str) {
            this.f42924a = str;
            this.f42925b = null;
            this.f42926c = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16556a newBuilder() {
        C16556a aVar = new C16556a();
        aVar.f42924a = this.namecard_id;
        aVar.f42925b = this.email;
        aVar.f42926c = this.phone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "QueryCondition");
        StringBuilder sb = new StringBuilder();
        if (this.namecard_id != null) {
            sb.append(", namecard_id=");
            sb.append(this.namecard_id);
        }
        if (this.email != null) {
            sb.append(", email=");
            sb.append(this.email);
        }
        if (this.phone != null) {
            sb.append(", phone=");
            sb.append(this.phone);
        }
        StringBuilder replace = sb.replace(0, 2, "QueryCondition{");
        replace.append('}');
        return replace.toString();
    }

    public QueryCondition(String str, String str2, Phone phone2) {
        this(str, str2, phone2, ByteString.EMPTY);
    }

    public QueryCondition(String str, String str2, Phone phone2, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(str, str2, phone2) <= 1) {
            this.namecard_id = str;
            this.email = str2;
            this.phone = phone2;
            return;
        }
        throw new IllegalArgumentException("at most one of namecard_id, email, phone may be non-null");
    }
}
