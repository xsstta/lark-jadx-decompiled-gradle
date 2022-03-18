package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Urgent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateUrgentRequest extends Message<CreateUrgentRequest, C17390a> {
    public static final ProtoAdapter<CreateUrgentRequest> ADAPTER = new C17391b();
    public static final Boolean DEFAULT_STRICT_MODE = true;
    public static final Urgent.Type DEFAULT_URGENT_TYPE = Urgent.Type.APP;
    private static final long serialVersionUID = 0;
    public final List<String> chatter_ids;
    public final String message_id;
    public final Boolean strict_mode;
    public final List<UrgentChatterGroup> urgent_chatter_groups;
    public final String urgent_message;
    public final Urgent.Type urgent_type;

    public static final class UrgentChatterGroup extends Message<UrgentChatterGroup, C17388a> {
        public static final ProtoAdapter<UrgentChatterGroup> ADAPTER = new C17389b();
        public static final Urgent.Type DEFAULT_URGENT_TYPE = Urgent.Type.APP;
        private static final long serialVersionUID = 0;
        public final List<String> chatter_ids;
        public final Urgent.Type urgent_type;

        /* renamed from: com.bytedance.lark.pb.im.v1.CreateUrgentRequest$UrgentChatterGroup$b */
        private static final class C17389b extends ProtoAdapter<UrgentChatterGroup> {
            C17389b() {
                super(FieldEncoding.LENGTH_DELIMITED, UrgentChatterGroup.class);
            }

            /* renamed from: a */
            public int encodedSize(UrgentChatterGroup urgentChatterGroup) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, urgentChatterGroup.chatter_ids);
                if (urgentChatterGroup.urgent_type != null) {
                    i = Urgent.Type.ADAPTER.encodedSizeWithTag(2, urgentChatterGroup.urgent_type);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + urgentChatterGroup.unknownFields().size();
            }

            /* renamed from: a */
            public UrgentChatterGroup decode(ProtoReader protoReader) throws IOException {
                C17388a aVar = new C17388a();
                aVar.f44293b = Urgent.Type.APP;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44292a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f44293b = Urgent.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UrgentChatterGroup urgentChatterGroup) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, urgentChatterGroup.chatter_ids);
                if (urgentChatterGroup.urgent_type != null) {
                    Urgent.Type.ADAPTER.encodeWithTag(protoWriter, 2, urgentChatterGroup.urgent_type);
                }
                protoWriter.writeBytes(urgentChatterGroup.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.CreateUrgentRequest$UrgentChatterGroup$a */
        public static final class C17388a extends Message.Builder<UrgentChatterGroup, C17388a> {

            /* renamed from: a */
            public List<String> f44292a = Internal.newMutableList();

            /* renamed from: b */
            public Urgent.Type f44293b;

            /* renamed from: a */
            public UrgentChatterGroup build() {
                return new UrgentChatterGroup(this.f44292a, this.f44293b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C17388a mo61031a(Urgent.Type type) {
                this.f44293b = type;
                return this;
            }

            /* renamed from: a */
            public C17388a mo61032a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f44292a = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C17388a newBuilder() {
            C17388a aVar = new C17388a();
            aVar.f44292a = Internal.copyOf("chatter_ids", this.chatter_ids);
            aVar.f44293b = this.urgent_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "UrgentChatterGroup");
            StringBuilder sb = new StringBuilder();
            if (!this.chatter_ids.isEmpty()) {
                sb.append(", chatter_ids=");
                sb.append(this.chatter_ids);
            }
            if (this.urgent_type != null) {
                sb.append(", urgent_type=");
                sb.append(this.urgent_type);
            }
            StringBuilder replace = sb.replace(0, 2, "UrgentChatterGroup{");
            replace.append('}');
            return replace.toString();
        }

        public UrgentChatterGroup(List<String> list, Urgent.Type type) {
            this(list, type, ByteString.EMPTY);
        }

        public UrgentChatterGroup(List<String> list, Urgent.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
            this.urgent_type = type;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateUrgentRequest$b */
    private static final class C17391b extends ProtoAdapter<CreateUrgentRequest> {
        C17391b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateUrgentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateUrgentRequest createUrgentRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createUrgentRequest.message_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, createUrgentRequest.chatter_ids);
            int i3 = 0;
            if (createUrgentRequest.urgent_type != null) {
                i = Urgent.Type.ADAPTER.encodedSizeWithTag(3, createUrgentRequest.urgent_type);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (createUrgentRequest.strict_mode != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, createUrgentRequest.strict_mode);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i4 + i2 + UrgentChatterGroup.ADAPTER.asRepeated().encodedSizeWithTag(5, createUrgentRequest.urgent_chatter_groups);
            if (createUrgentRequest.urgent_message != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, createUrgentRequest.urgent_message);
            }
            return encodedSizeWithTag2 + i3 + createUrgentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateUrgentRequest decode(ProtoReader protoReader) throws IOException {
            C17390a aVar = new C17390a();
            aVar.f44294a = "";
            aVar.f44296c = Urgent.Type.APP;
            aVar.f44297d = true;
            aVar.f44299f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44294a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44295b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            try {
                                aVar.f44296c = Urgent.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f44297d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44298e.add(UrgentChatterGroup.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f44299f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateUrgentRequest createUrgentRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createUrgentRequest.message_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, createUrgentRequest.chatter_ids);
            if (createUrgentRequest.urgent_type != null) {
                Urgent.Type.ADAPTER.encodeWithTag(protoWriter, 3, createUrgentRequest.urgent_type);
            }
            if (createUrgentRequest.strict_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, createUrgentRequest.strict_mode);
            }
            UrgentChatterGroup.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, createUrgentRequest.urgent_chatter_groups);
            if (createUrgentRequest.urgent_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, createUrgentRequest.urgent_message);
            }
            protoWriter.writeBytes(createUrgentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateUrgentRequest$a */
    public static final class C17390a extends Message.Builder<CreateUrgentRequest, C17390a> {

        /* renamed from: a */
        public String f44294a;

        /* renamed from: b */
        public List<String> f44295b = Internal.newMutableList();

        /* renamed from: c */
        public Urgent.Type f44296c;

        /* renamed from: d */
        public Boolean f44297d;

        /* renamed from: e */
        public List<UrgentChatterGroup> f44298e = Internal.newMutableList();

        /* renamed from: f */
        public String f44299f;

        /* renamed from: a */
        public CreateUrgentRequest build() {
            String str = this.f44294a;
            if (str != null) {
                return new CreateUrgentRequest(str, this.f44295b, this.f44296c, this.f44297d, this.f44298e, this.f44299f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C17390a mo61037a(Boolean bool) {
            this.f44297d = bool;
            return this;
        }

        /* renamed from: a */
        public C17390a mo61038a(String str) {
            this.f44294a = str;
            return this;
        }

        /* renamed from: a */
        public C17390a mo61039a(List<UrgentChatterGroup> list) {
            Internal.checkElementsNotNull(list);
            this.f44298e = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17390a newBuilder() {
        C17390a aVar = new C17390a();
        aVar.f44294a = this.message_id;
        aVar.f44295b = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44296c = this.urgent_type;
        aVar.f44297d = this.strict_mode;
        aVar.f44298e = Internal.copyOf("urgent_chatter_groups", this.urgent_chatter_groups);
        aVar.f44299f = this.urgent_message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateUrgentRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.urgent_type != null) {
            sb.append(", urgent_type=");
            sb.append(this.urgent_type);
        }
        if (this.strict_mode != null) {
            sb.append(", strict_mode=");
            sb.append(this.strict_mode);
        }
        if (!this.urgent_chatter_groups.isEmpty()) {
            sb.append(", urgent_chatter_groups=");
            sb.append(this.urgent_chatter_groups);
        }
        if (this.urgent_message != null) {
            sb.append(", urgent_message=");
            sb.append(this.urgent_message);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateUrgentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateUrgentRequest(String str, List<String> list, Urgent.Type type, Boolean bool, List<UrgentChatterGroup> list2, String str2) {
        this(str, list, type, bool, list2, str2, ByteString.EMPTY);
    }

    public CreateUrgentRequest(String str, List<String> list, Urgent.Type type, Boolean bool, List<UrgentChatterGroup> list2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.urgent_type = type;
        this.strict_mode = bool;
        this.urgent_chatter_groups = Internal.immutableCopyOf("urgent_chatter_groups", list2);
        this.urgent_message = str2;
    }
}
