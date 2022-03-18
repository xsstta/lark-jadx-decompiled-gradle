package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetAddressBookContactListRequest extends Message<GetAddressBookContactListRequest, C16432a> {
    public static final ProtoAdapter<GetAddressBookContactListRequest> ADAPTER = new C16433b();
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    public static final Long DEFAULT_TIMELINE_MARK = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> contact_points;
    public final SyncDataStrategy strategy;
    public final Long timeline_mark;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetAddressBookContactListRequest$b */
    private static final class C16433b extends ProtoAdapter<GetAddressBookContactListRequest> {
        C16433b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAddressBookContactListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAddressBookContactListRequest getAddressBookContactListRequest) {
            int i;
            int i2 = 0;
            if (getAddressBookContactListRequest.timeline_mark != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getAddressBookContactListRequest.timeline_mark);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getAddressBookContactListRequest.contact_points);
            if (getAddressBookContactListRequest.strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, getAddressBookContactListRequest.strategy);
            }
            return encodedSizeWithTag + i2 + getAddressBookContactListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAddressBookContactListRequest decode(ProtoReader protoReader) throws IOException {
            C16432a aVar = new C16432a();
            aVar.f42730a = 0L;
            aVar.f42732c = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42730a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42731b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42732c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAddressBookContactListRequest getAddressBookContactListRequest) throws IOException {
            if (getAddressBookContactListRequest.timeline_mark != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getAddressBookContactListRequest.timeline_mark);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getAddressBookContactListRequest.contact_points);
            if (getAddressBookContactListRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, getAddressBookContactListRequest.strategy);
            }
            protoWriter.writeBytes(getAddressBookContactListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetAddressBookContactListRequest$a */
    public static final class C16432a extends Message.Builder<GetAddressBookContactListRequest, C16432a> {

        /* renamed from: a */
        public Long f42730a;

        /* renamed from: b */
        public List<String> f42731b = Internal.newMutableList();

        /* renamed from: c */
        public SyncDataStrategy f42732c;

        /* renamed from: a */
        public GetAddressBookContactListRequest build() {
            return new GetAddressBookContactListRequest(this.f42730a, this.f42731b, this.f42732c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16432a mo58636a(SyncDataStrategy syncDataStrategy) {
            this.f42732c = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C16432a mo58637a(Long l) {
            this.f42730a = l;
            return this;
        }

        /* renamed from: a */
        public C16432a mo58638a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42731b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16432a newBuilder() {
        C16432a aVar = new C16432a();
        aVar.f42730a = this.timeline_mark;
        aVar.f42731b = Internal.copyOf("contact_points", this.contact_points);
        aVar.f42732c = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetAddressBookContactListRequest");
        StringBuilder sb = new StringBuilder();
        if (this.timeline_mark != null) {
            sb.append(", timeline_mark=");
            sb.append(this.timeline_mark);
        }
        if (!this.contact_points.isEmpty()) {
            sb.append(", contact_points=");
            sb.append(this.contact_points);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAddressBookContactListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAddressBookContactListRequest(Long l, List<String> list, SyncDataStrategy syncDataStrategy) {
        this(l, list, syncDataStrategy, ByteString.EMPTY);
    }

    public GetAddressBookContactListRequest(Long l, List<String> list, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timeline_mark = l;
        this.contact_points = Internal.immutableCopyOf("contact_points", list);
        this.strategy = syncDataStrategy;
    }
}
