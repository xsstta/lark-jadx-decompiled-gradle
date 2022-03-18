package com.bytedance.lark.pb.im.v1;

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

public final class GetUrgentsAckStatusResponse extends Message<GetUrgentsAckStatusResponse, C17757a> {
    public static final ProtoAdapter<GetUrgentsAckStatusResponse> ADAPTER = new C17758b();
    private static final long serialVersionUID = 0;
    public final Map<String, PhoneStatus> phone_status;
    public final Map<String, UrgentStatus> urgent_status;

    public static final class PhoneStatus extends Message<PhoneStatus, C17753a> {
        public static final ProtoAdapter<PhoneStatus> ADAPTER = new C17754b();
        private static final long serialVersionUID = 0;
        public final List<String> failed_chatter_ids;
        public final List<String> success_chatter_ids;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusResponse$PhoneStatus$b */
        private static final class C17754b extends ProtoAdapter<PhoneStatus> {
            C17754b() {
                super(FieldEncoding.LENGTH_DELIMITED, PhoneStatus.class);
            }

            /* renamed from: a */
            public int encodedSize(PhoneStatus phoneStatus) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, phoneStatus.success_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, phoneStatus.failed_chatter_ids) + phoneStatus.unknownFields().size();
            }

            /* renamed from: a */
            public PhoneStatus decode(ProtoReader protoReader) throws IOException {
                C17753a aVar = new C17753a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44799a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f44800b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PhoneStatus phoneStatus) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, phoneStatus.success_chatter_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, phoneStatus.failed_chatter_ids);
                protoWriter.writeBytes(phoneStatus.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusResponse$PhoneStatus$a */
        public static final class C17753a extends Message.Builder<PhoneStatus, C17753a> {

            /* renamed from: a */
            public List<String> f44799a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f44800b = Internal.newMutableList();

            /* renamed from: a */
            public PhoneStatus build() {
                return new PhoneStatus(this.f44799a, this.f44800b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17753a newBuilder() {
            C17753a aVar = new C17753a();
            aVar.f44799a = Internal.copyOf("success_chatter_ids", this.success_chatter_ids);
            aVar.f44800b = Internal.copyOf("failed_chatter_ids", this.failed_chatter_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "PhoneStatus");
            StringBuilder sb = new StringBuilder();
            if (!this.success_chatter_ids.isEmpty()) {
                sb.append(", success_chatter_ids=");
                sb.append(this.success_chatter_ids);
            }
            if (!this.failed_chatter_ids.isEmpty()) {
                sb.append(", failed_chatter_ids=");
                sb.append(this.failed_chatter_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "PhoneStatus{");
            replace.append('}');
            return replace.toString();
        }

        public PhoneStatus(List<String> list, List<String> list2) {
            this(list, list2, ByteString.EMPTY);
        }

        public PhoneStatus(List<String> list, List<String> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.success_chatter_ids = Internal.immutableCopyOf("success_chatter_ids", list);
            this.failed_chatter_ids = Internal.immutableCopyOf("failed_chatter_ids", list2);
        }
    }

    public static final class UrgentStatus extends Message<UrgentStatus, C17755a> {
        public static final ProtoAdapter<UrgentStatus> ADAPTER = new C17756b();
        private static final long serialVersionUID = 0;
        public final List<String> ack_chatter_ids;
        public final List<String> init_chatter_ids;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusResponse$UrgentStatus$b */
        private static final class C17756b extends ProtoAdapter<UrgentStatus> {
            C17756b() {
                super(FieldEncoding.LENGTH_DELIMITED, UrgentStatus.class);
            }

            /* renamed from: a */
            public int encodedSize(UrgentStatus urgentStatus) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, urgentStatus.init_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, urgentStatus.ack_chatter_ids) + urgentStatus.unknownFields().size();
            }

            /* renamed from: a */
            public UrgentStatus decode(ProtoReader protoReader) throws IOException {
                C17755a aVar = new C17755a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44801a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f44802b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UrgentStatus urgentStatus) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, urgentStatus.init_chatter_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, urgentStatus.ack_chatter_ids);
                protoWriter.writeBytes(urgentStatus.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusResponse$UrgentStatus$a */
        public static final class C17755a extends Message.Builder<UrgentStatus, C17755a> {

            /* renamed from: a */
            public List<String> f44801a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f44802b = Internal.newMutableList();

            /* renamed from: a */
            public UrgentStatus build() {
                return new UrgentStatus(this.f44801a, this.f44802b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17755a newBuilder() {
            C17755a aVar = new C17755a();
            aVar.f44801a = Internal.copyOf("init_chatter_ids", this.init_chatter_ids);
            aVar.f44802b = Internal.copyOf("ack_chatter_ids", this.ack_chatter_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "UrgentStatus");
            StringBuilder sb = new StringBuilder();
            if (!this.init_chatter_ids.isEmpty()) {
                sb.append(", init_chatter_ids=");
                sb.append(this.init_chatter_ids);
            }
            if (!this.ack_chatter_ids.isEmpty()) {
                sb.append(", ack_chatter_ids=");
                sb.append(this.ack_chatter_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "UrgentStatus{");
            replace.append('}');
            return replace.toString();
        }

        public UrgentStatus(List<String> list, List<String> list2) {
            this(list, list2, ByteString.EMPTY);
        }

        public UrgentStatus(List<String> list, List<String> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.init_chatter_ids = Internal.immutableCopyOf("init_chatter_ids", list);
            this.ack_chatter_ids = Internal.immutableCopyOf("ack_chatter_ids", list2);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusResponse$a */
    public static final class C17757a extends Message.Builder<GetUrgentsAckStatusResponse, C17757a> {

        /* renamed from: a */
        public Map<String, UrgentStatus> f44803a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, PhoneStatus> f44804b = Internal.newMutableMap();

        /* renamed from: a */
        public GetUrgentsAckStatusResponse build() {
            return new GetUrgentsAckStatusResponse(this.f44803a, this.f44804b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusResponse$b */
    private static final class C17758b extends ProtoAdapter<GetUrgentsAckStatusResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UrgentStatus>> f44805a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrgentStatus.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, PhoneStatus>> f44806b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PhoneStatus.ADAPTER);

        C17758b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUrgentsAckStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUrgentsAckStatusResponse getUrgentsAckStatusResponse) {
            return this.f44805a.encodedSizeWithTag(1, getUrgentsAckStatusResponse.urgent_status) + this.f44806b.encodedSizeWithTag(2, getUrgentsAckStatusResponse.phone_status) + getUrgentsAckStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUrgentsAckStatusResponse decode(ProtoReader protoReader) throws IOException {
            C17757a aVar = new C17757a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44803a.putAll(this.f44805a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44804b.putAll(this.f44806b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUrgentsAckStatusResponse getUrgentsAckStatusResponse) throws IOException {
            this.f44805a.encodeWithTag(protoWriter, 1, getUrgentsAckStatusResponse.urgent_status);
            this.f44806b.encodeWithTag(protoWriter, 2, getUrgentsAckStatusResponse.phone_status);
            protoWriter.writeBytes(getUrgentsAckStatusResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17757a newBuilder() {
        C17757a aVar = new C17757a();
        aVar.f44803a = Internal.copyOf("urgent_status", this.urgent_status);
        aVar.f44804b = Internal.copyOf("phone_status", this.phone_status);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUrgentsAckStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.urgent_status.isEmpty()) {
            sb.append(", urgent_status=");
            sb.append(this.urgent_status);
        }
        if (!this.phone_status.isEmpty()) {
            sb.append(", phone_status=");
            sb.append(this.phone_status);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUrgentsAckStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUrgentsAckStatusResponse(Map<String, UrgentStatus> map, Map<String, PhoneStatus> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public GetUrgentsAckStatusResponse(Map<String, UrgentStatus> map, Map<String, PhoneStatus> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.urgent_status = Internal.immutableCopyOf("urgent_status", map);
        this.phone_status = Internal.immutableCopyOf("phone_status", map2);
    }
}
