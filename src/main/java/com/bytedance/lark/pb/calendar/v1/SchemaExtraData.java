package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SchemaExtraData extends Message<SchemaExtraData, C16016a> {
    public static final ProtoAdapter<SchemaExtraData> ADAPTER = new C16017b();
    private static final long serialVersionUID = 0;
    public final List<BizData> biz_data;

    public enum CustomizationType implements WireEnum {
        SingleSelect(1),
        MultipleSelect(2),
        Input(3);
        
        public static final ProtoAdapter<CustomizationType> ADAPTER = ProtoAdapter.newEnumAdapter(CustomizationType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CustomizationType fromValue(int i) {
            if (i == 1) {
                return SingleSelect;
            }
            if (i == 2) {
                return MultipleSelect;
            }
            if (i != 3) {
                return null;
            }
            return Input;
        }

        private CustomizationType(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        RESOURCE_APPROVAL_INFO(1),
        APPROVAL_REQUEST(2),
        RESOURCE_STRATEGY(3),
        RESOURCE_REQUISITION(4),
        RESOURCE_CUSTOMIZATION(5);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return RESOURCE_APPROVAL_INFO;
            }
            if (i == 2) {
                return APPROVAL_REQUEST;
            }
            if (i == 3) {
                return RESOURCE_STRATEGY;
            }
            if (i == 4) {
                return RESOURCE_REQUISITION;
            }
            if (i != 5) {
                return null;
            }
            return RESOURCE_CUSTOMIZATION;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class ApprovalRequest extends Message<ApprovalRequest, C15996a> {
        public static final ProtoAdapter<ApprovalRequest> ADAPTER = new C15997b();
        private static final long serialVersionUID = 0;
        public final List<String> approver_user_ids;
        public final String create_chatter_id;
        public final String reason;
        public final ApprovalTrigger trigger;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ApprovalRequest$b */
        private static final class C15997b extends ProtoAdapter<ApprovalRequest> {
            C15997b() {
                super(FieldEncoding.LENGTH_DELIMITED, ApprovalRequest.class);
            }

            /* renamed from: a */
            public int encodedSize(ApprovalRequest approvalRequest) {
                int i;
                int i2;
                int i3 = 0;
                if (approvalRequest.reason != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, approvalRequest.reason);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, approvalRequest.approver_user_ids);
                if (approvalRequest.create_chatter_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, approvalRequest.create_chatter_id);
                } else {
                    i2 = 0;
                }
                int i4 = encodedSizeWithTag + i2;
                if (approvalRequest.trigger != null) {
                    i3 = ApprovalTrigger.ADAPTER.encodedSizeWithTag(4, approvalRequest.trigger);
                }
                return i4 + i3 + approvalRequest.unknownFields().size();
            }

            /* renamed from: a */
            public ApprovalRequest decode(ProtoReader protoReader) throws IOException {
                C15996a aVar = new C15996a();
                aVar.f42016a = "";
                aVar.f42018c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42016a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42017b.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f42018c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42019d = ApprovalTrigger.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ApprovalRequest approvalRequest) throws IOException {
                if (approvalRequest.reason != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, approvalRequest.reason);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, approvalRequest.approver_user_ids);
                if (approvalRequest.create_chatter_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, approvalRequest.create_chatter_id);
                }
                if (approvalRequest.trigger != null) {
                    ApprovalTrigger.ADAPTER.encodeWithTag(protoWriter, 4, approvalRequest.trigger);
                }
                protoWriter.writeBytes(approvalRequest.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ApprovalRequest$a */
        public static final class C15996a extends Message.Builder<ApprovalRequest, C15996a> {

            /* renamed from: a */
            public String f42016a;

            /* renamed from: b */
            public List<String> f42017b = Internal.newMutableList();

            /* renamed from: c */
            public String f42018c;

            /* renamed from: d */
            public ApprovalTrigger f42019d;

            /* renamed from: a */
            public ApprovalRequest build() {
                return new ApprovalRequest(this.f42016a, this.f42017b, this.f42018c, this.f42019d, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15996a mo57573a(ApprovalTrigger approvalTrigger) {
                this.f42019d = approvalTrigger;
                return this;
            }

            /* renamed from: b */
            public C15996a mo57577b(String str) {
                this.f42018c = str;
                return this;
            }

            /* renamed from: a */
            public C15996a mo57574a(String str) {
                this.f42016a = str;
                return this;
            }

            /* renamed from: a */
            public C15996a mo57575a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f42017b = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15996a newBuilder() {
            C15996a aVar = new C15996a();
            aVar.f42016a = this.reason;
            aVar.f42017b = Internal.copyOf("approver_user_ids", this.approver_user_ids);
            aVar.f42018c = this.create_chatter_id;
            aVar.f42019d = this.trigger;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "ApprovalRequest");
            StringBuilder sb = new StringBuilder();
            if (this.reason != null) {
                sb.append(", reason=");
                sb.append(this.reason);
            }
            if (!this.approver_user_ids.isEmpty()) {
                sb.append(", approver_user_ids=");
                sb.append(this.approver_user_ids);
            }
            if (this.create_chatter_id != null) {
                sb.append(", create_chatter_id=");
                sb.append(this.create_chatter_id);
            }
            if (this.trigger != null) {
                sb.append(", trigger=");
                sb.append(this.trigger);
            }
            StringBuilder replace = sb.replace(0, 2, "ApprovalRequest{");
            replace.append('}');
            return replace.toString();
        }

        public ApprovalRequest(String str, List<String> list, String str2, ApprovalTrigger approvalTrigger) {
            this(str, list, str2, approvalTrigger, ByteString.EMPTY);
        }

        public ApprovalRequest(String str, List<String> list, String str2, ApprovalTrigger approvalTrigger, ByteString byteString) {
            super(ADAPTER, byteString);
            this.reason = str;
            this.approver_user_ids = Internal.immutableCopyOf("approver_user_ids", list);
            this.create_chatter_id = str2;
            this.trigger = approvalTrigger;
        }
    }

    public static final class ApprovalTrigger extends Message<ApprovalTrigger, C15998a> {
        public static final ProtoAdapter<ApprovalTrigger> ADAPTER = new C15999b();
        public static final Long DEFAULT_DURATION_TRIGGER = 0L;
        private static final long serialVersionUID = 0;
        public final Long duration_trigger;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ApprovalTrigger$b */
        private static final class C15999b extends ProtoAdapter<ApprovalTrigger> {
            C15999b() {
                super(FieldEncoding.LENGTH_DELIMITED, ApprovalTrigger.class);
            }

            /* renamed from: a */
            public int encodedSize(ApprovalTrigger approvalTrigger) {
                int i;
                if (approvalTrigger.duration_trigger != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, approvalTrigger.duration_trigger);
                } else {
                    i = 0;
                }
                return i + approvalTrigger.unknownFields().size();
            }

            /* renamed from: a */
            public ApprovalTrigger decode(ProtoReader protoReader) throws IOException {
                C15998a aVar = new C15998a();
                aVar.f42020a = 0L;
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
                        aVar.f42020a = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ApprovalTrigger approvalTrigger) throws IOException {
                if (approvalTrigger.duration_trigger != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, approvalTrigger.duration_trigger);
                }
                protoWriter.writeBytes(approvalTrigger.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ApprovalTrigger$a */
        public static final class C15998a extends Message.Builder<ApprovalTrigger, C15998a> {

            /* renamed from: a */
            public Long f42020a;

            /* renamed from: a */
            public ApprovalTrigger build() {
                return new ApprovalTrigger(this.f42020a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15998a newBuilder() {
            C15998a aVar = new C15998a();
            aVar.f42020a = this.duration_trigger;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "ApprovalTrigger");
            StringBuilder sb = new StringBuilder();
            if (this.duration_trigger != null) {
                sb.append(", duration_trigger=");
                sb.append(this.duration_trigger);
            }
            StringBuilder replace = sb.replace(0, 2, "ApprovalTrigger{");
            replace.append('}');
            return replace.toString();
        }

        public ApprovalTrigger(Long l) {
            this(l, ByteString.EMPTY);
        }

        public ApprovalTrigger(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.duration_trigger = l;
        }
    }

    public static final class BizData extends Message<BizData, C16000a> {
        public static final ProtoAdapter<BizData> ADAPTER = new C16001b();
        public static final Type DEFAULT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final ApprovalRequest approval_request;
        public final ResourceApprovalInfo resource_approval_info;
        public final ResourceCustomization resource_customization;
        public final ResourceRequisition resource_requisition;
        public final ResourceStrategy resource_strategy;
        public final Type type;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$BizData$b */
        private static final class C16001b extends ProtoAdapter<BizData> {
            C16001b() {
                super(FieldEncoding.LENGTH_DELIMITED, BizData.class);
            }

            /* renamed from: a */
            public int encodedSize(BizData bizData) {
                int i;
                int i2;
                int i3;
                int i4;
                int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, bizData.type);
                int i5 = 0;
                if (bizData.resource_approval_info != null) {
                    i = ResourceApprovalInfo.ADAPTER.encodedSizeWithTag(100, bizData.resource_approval_info);
                } else {
                    i = 0;
                }
                int i6 = encodedSizeWithTag + i;
                if (bizData.approval_request != null) {
                    i2 = ApprovalRequest.ADAPTER.encodedSizeWithTag(101, bizData.approval_request);
                } else {
                    i2 = 0;
                }
                int i7 = i6 + i2;
                if (bizData.resource_strategy != null) {
                    i3 = ResourceStrategy.ADAPTER.encodedSizeWithTag(102, bizData.resource_strategy);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (bizData.resource_requisition != null) {
                    i4 = ResourceRequisition.ADAPTER.encodedSizeWithTag(103, bizData.resource_requisition);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (bizData.resource_customization != null) {
                    i5 = ResourceCustomization.ADAPTER.encodedSizeWithTag(104, bizData.resource_customization);
                }
                return i9 + i5 + bizData.unknownFields().size();
            }

            /* renamed from: a */
            public BizData decode(ProtoReader protoReader) throws IOException {
                C16000a aVar = new C16000a();
                aVar.f42021a = Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        switch (nextTag) {
                            case 100:
                                aVar.mo57586a(ResourceApprovalInfo.ADAPTER.decode(protoReader));
                                continue;
                            case 101:
                                aVar.mo57585a(ApprovalRequest.ADAPTER.decode(protoReader));
                                continue;
                            case 102:
                                aVar.mo57589a(ResourceStrategy.ADAPTER.decode(protoReader));
                                continue;
                            case 103:
                                aVar.mo57588a(ResourceRequisition.ADAPTER.decode(protoReader));
                                continue;
                            case 104:
                                aVar.mo57587a(ResourceCustomization.ADAPTER.decode(protoReader));
                                continue;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                continue;
                        }
                    } else {
                        try {
                            aVar.f42021a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BizData bizData) throws IOException {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, bizData.type);
                if (bizData.resource_approval_info != null) {
                    ResourceApprovalInfo.ADAPTER.encodeWithTag(protoWriter, 100, bizData.resource_approval_info);
                }
                if (bizData.approval_request != null) {
                    ApprovalRequest.ADAPTER.encodeWithTag(protoWriter, 101, bizData.approval_request);
                }
                if (bizData.resource_strategy != null) {
                    ResourceStrategy.ADAPTER.encodeWithTag(protoWriter, 102, bizData.resource_strategy);
                }
                if (bizData.resource_requisition != null) {
                    ResourceRequisition.ADAPTER.encodeWithTag(protoWriter, 103, bizData.resource_requisition);
                }
                if (bizData.resource_customization != null) {
                    ResourceCustomization.ADAPTER.encodeWithTag(protoWriter, 104, bizData.resource_customization);
                }
                protoWriter.writeBytes(bizData.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16000a newBuilder() {
            C16000a aVar = new C16000a();
            aVar.f42021a = this.type;
            aVar.f42022b = this.resource_approval_info;
            aVar.f42023c = this.approval_request;
            aVar.f42024d = this.resource_strategy;
            aVar.f42025e = this.resource_requisition;
            aVar.f42026f = this.resource_customization;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "BizData");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (this.resource_approval_info != null) {
                sb.append(", resource_approval_info=");
                sb.append(this.resource_approval_info);
            }
            if (this.approval_request != null) {
                sb.append(", approval_request=");
                sb.append(this.approval_request);
            }
            if (this.resource_strategy != null) {
                sb.append(", resource_strategy=");
                sb.append(this.resource_strategy);
            }
            if (this.resource_requisition != null) {
                sb.append(", resource_requisition=");
                sb.append(this.resource_requisition);
            }
            if (this.resource_customization != null) {
                sb.append(", resource_customization=");
                sb.append(this.resource_customization);
            }
            StringBuilder replace = sb.replace(0, 2, "BizData{");
            replace.append('}');
            return replace.toString();
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$BizData$a */
        public static final class C16000a extends Message.Builder<BizData, C16000a> {

            /* renamed from: a */
            public Type f42021a;

            /* renamed from: b */
            public ResourceApprovalInfo f42022b;

            /* renamed from: c */
            public ApprovalRequest f42023c;

            /* renamed from: d */
            public ResourceStrategy f42024d;

            /* renamed from: e */
            public ResourceRequisition f42025e;

            /* renamed from: f */
            public ResourceCustomization f42026f;

            /* renamed from: a */
            public BizData build() {
                Type type = this.f42021a;
                if (type != null) {
                    return new BizData(type, this.f42022b, this.f42023c, this.f42024d, this.f42025e, this.f42026f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
            }

            /* renamed from: a */
            public C16000a mo57590a(Type type) {
                this.f42021a = type;
                return this;
            }

            /* renamed from: a */
            public C16000a mo57585a(ApprovalRequest approvalRequest) {
                this.f42023c = approvalRequest;
                this.f42022b = null;
                this.f42024d = null;
                this.f42025e = null;
                this.f42026f = null;
                return this;
            }

            /* renamed from: a */
            public C16000a mo57586a(ResourceApprovalInfo resourceApprovalInfo) {
                this.f42022b = resourceApprovalInfo;
                this.f42023c = null;
                this.f42024d = null;
                this.f42025e = null;
                this.f42026f = null;
                return this;
            }

            /* renamed from: a */
            public C16000a mo57587a(ResourceCustomization resourceCustomization) {
                this.f42026f = resourceCustomization;
                this.f42022b = null;
                this.f42023c = null;
                this.f42024d = null;
                this.f42025e = null;
                return this;
            }

            /* renamed from: a */
            public C16000a mo57588a(ResourceRequisition resourceRequisition) {
                this.f42025e = resourceRequisition;
                this.f42022b = null;
                this.f42023c = null;
                this.f42024d = null;
                this.f42026f = null;
                return this;
            }

            /* renamed from: a */
            public C16000a mo57589a(ResourceStrategy resourceStrategy) {
                this.f42024d = resourceStrategy;
                this.f42022b = null;
                this.f42023c = null;
                this.f42025e = null;
                this.f42026f = null;
                return this;
            }
        }

        public BizData(Type type2, ResourceApprovalInfo resourceApprovalInfo, ApprovalRequest approvalRequest, ResourceStrategy resourceStrategy, ResourceRequisition resourceRequisition, ResourceCustomization resourceCustomization) {
            this(type2, resourceApprovalInfo, approvalRequest, resourceStrategy, resourceRequisition, resourceCustomization, ByteString.EMPTY);
        }

        public BizData(Type type2, ResourceApprovalInfo resourceApprovalInfo, ApprovalRequest approvalRequest, ResourceStrategy resourceStrategy, ResourceRequisition resourceRequisition, ResourceCustomization resourceCustomization, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(resourceApprovalInfo, approvalRequest, resourceStrategy, resourceRequisition, resourceCustomization) <= 1) {
                this.type = type2;
                this.resource_approval_info = resourceApprovalInfo;
                this.approval_request = approvalRequest;
                this.resource_strategy = resourceStrategy;
                this.resource_requisition = resourceRequisition;
                this.resource_customization = resourceCustomization;
                return;
            }
            throw new IllegalArgumentException("at most one of resource_approval_info, approval_request, resource_strategy, resource_requisition, resource_customization may be non-null");
        }
    }

    public static final class CustomizationData extends Message<CustomizationData, C16002a> {
        public static final ProtoAdapter<CustomizationData> ADAPTER = new C16003b();
        public static final CustomizationType DEFAULT_CUSTOMIZATION_TYPE = CustomizationType.SingleSelect;
        public static final Boolean DEFAULT_IS_REQUIRED = false;
        private static final long serialVersionUID = 0;
        public final List<OptionCondition> conditions;
        public final CustomizationType customization_type;
        public final String index_key;
        public final String input_content;
        public final Boolean is_required;
        public final String label;
        public final List<CustomizationOption> options;
        public final String place_holder;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$CustomizationData$b */
        private static final class C16003b extends ProtoAdapter<CustomizationData> {
            C16003b() {
                super(FieldEncoding.LENGTH_DELIMITED, CustomizationData.class);
            }

            /* renamed from: a */
            public int encodedSize(CustomizationData customizationData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (customizationData.customization_type != null) {
                    i = CustomizationType.ADAPTER.encodedSizeWithTag(1, customizationData.customization_type);
                } else {
                    i = 0;
                }
                if (customizationData.is_required != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, customizationData.is_required);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (customizationData.label != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, customizationData.label);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (customizationData.index_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, customizationData.index_key);
                } else {
                    i4 = 0;
                }
                int encodedSizeWithTag = i8 + i4 + CustomizationOption.ADAPTER.asRepeated().encodedSizeWithTag(5, customizationData.options) + OptionCondition.ADAPTER.asRepeated().encodedSizeWithTag(6, customizationData.conditions);
                if (customizationData.input_content != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, customizationData.input_content);
                } else {
                    i5 = 0;
                }
                int i9 = encodedSizeWithTag + i5;
                if (customizationData.place_holder != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, customizationData.place_holder);
                }
                return i9 + i6 + customizationData.unknownFields().size();
            }

            /* renamed from: a */
            public CustomizationData decode(ProtoReader protoReader) throws IOException {
                C16002a aVar = new C16002a();
                aVar.f42027a = CustomizationType.SingleSelect;
                aVar.f42028b = false;
                aVar.f42029c = "";
                aVar.f42030d = "";
                aVar.f42033g = "";
                aVar.f42034h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f42027a = CustomizationType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f42028b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                aVar.f42029c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f42030d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f42031e.add(CustomizationOption.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                aVar.f42032f.add(OptionCondition.ADAPTER.decode(protoReader));
                                break;
                            case 7:
                                aVar.f42033g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f42034h = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, CustomizationData customizationData) throws IOException {
                if (customizationData.customization_type != null) {
                    CustomizationType.ADAPTER.encodeWithTag(protoWriter, 1, customizationData.customization_type);
                }
                if (customizationData.is_required != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, customizationData.is_required);
                }
                if (customizationData.label != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, customizationData.label);
                }
                if (customizationData.index_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, customizationData.index_key);
                }
                CustomizationOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, customizationData.options);
                OptionCondition.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, customizationData.conditions);
                if (customizationData.input_content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, customizationData.input_content);
                }
                if (customizationData.place_holder != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, customizationData.place_holder);
                }
                protoWriter.writeBytes(customizationData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$CustomizationData$a */
        public static final class C16002a extends Message.Builder<CustomizationData, C16002a> {

            /* renamed from: a */
            public CustomizationType f42027a;

            /* renamed from: b */
            public Boolean f42028b;

            /* renamed from: c */
            public String f42029c;

            /* renamed from: d */
            public String f42030d;

            /* renamed from: e */
            public List<CustomizationOption> f42031e = Internal.newMutableList();

            /* renamed from: f */
            public List<OptionCondition> f42032f = Internal.newMutableList();

            /* renamed from: g */
            public String f42033g;

            /* renamed from: h */
            public String f42034h;

            /* renamed from: a */
            public CustomizationData build() {
                return new CustomizationData(this.f42027a, this.f42028b, this.f42029c, this.f42030d, this.f42031e, this.f42032f, this.f42033g, this.f42034h, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16002a newBuilder() {
            C16002a aVar = new C16002a();
            aVar.f42027a = this.customization_type;
            aVar.f42028b = this.is_required;
            aVar.f42029c = this.label;
            aVar.f42030d = this.index_key;
            aVar.f42031e = Internal.copyOf("options", this.options);
            aVar.f42032f = Internal.copyOf("conditions", this.conditions);
            aVar.f42033g = this.input_content;
            aVar.f42034h = this.place_holder;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CustomizationData");
            StringBuilder sb = new StringBuilder();
            if (this.customization_type != null) {
                sb.append(", customization_type=");
                sb.append(this.customization_type);
            }
            if (this.is_required != null) {
                sb.append(", is_required=");
                sb.append(this.is_required);
            }
            if (this.label != null) {
                sb.append(", label=");
                sb.append(this.label);
            }
            if (this.index_key != null) {
                sb.append(", index_key=");
                sb.append(this.index_key);
            }
            if (!this.options.isEmpty()) {
                sb.append(", options=");
                sb.append(this.options);
            }
            if (!this.conditions.isEmpty()) {
                sb.append(", conditions=");
                sb.append(this.conditions);
            }
            if (this.input_content != null) {
                sb.append(", input_content=");
                sb.append(this.input_content);
            }
            if (this.place_holder != null) {
                sb.append(", place_holder=");
                sb.append(this.place_holder);
            }
            StringBuilder replace = sb.replace(0, 2, "CustomizationData{");
            replace.append('}');
            return replace.toString();
        }

        public CustomizationData(CustomizationType customizationType, Boolean bool, String str, String str2, List<CustomizationOption> list, List<OptionCondition> list2, String str3, String str4) {
            this(customizationType, bool, str, str2, list, list2, str3, str4, ByteString.EMPTY);
        }

        public CustomizationData(CustomizationType customizationType, Boolean bool, String str, String str2, List<CustomizationOption> list, List<OptionCondition> list2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.customization_type = customizationType;
            this.is_required = bool;
            this.label = str;
            this.index_key = str2;
            this.options = Internal.immutableCopyOf("options", list);
            this.conditions = Internal.immutableCopyOf("conditions", list2);
            this.input_content = str3;
            this.place_holder = str4;
        }
    }

    public static final class CustomizationOption extends Message<CustomizationOption, C16004a> {
        public static final ProtoAdapter<CustomizationOption> ADAPTER = new C16005b();
        public static final Boolean DEFAULT_IS_OTHERS = false;
        public static final Boolean DEFAULT_IS_SELECTED = false;
        private static final long serialVersionUID = 0;
        public final Boolean is_others;
        public final Boolean is_selected;
        public final String option_image_url;
        public final String option_key;
        public final String option_label;
        public final String others_content;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$CustomizationOption$b */
        private static final class C16005b extends ProtoAdapter<CustomizationOption> {
            C16005b() {
                super(FieldEncoding.LENGTH_DELIMITED, CustomizationOption.class);
            }

            /* renamed from: a */
            public int encodedSize(CustomizationOption customizationOption) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (customizationOption.is_others != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, customizationOption.is_others);
                } else {
                    i = 0;
                }
                if (customizationOption.others_content != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, customizationOption.others_content);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (customizationOption.option_label != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, customizationOption.option_label);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (customizationOption.option_image_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, customizationOption.option_image_url);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (customizationOption.option_key != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, customizationOption.option_key);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (customizationOption.is_selected != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, customizationOption.is_selected);
                }
                return i10 + i6 + customizationOption.unknownFields().size();
            }

            /* renamed from: a */
            public CustomizationOption decode(ProtoReader protoReader) throws IOException {
                C16004a aVar = new C16004a();
                aVar.f42035a = false;
                aVar.f42036b = "";
                aVar.f42037c = "";
                aVar.f42038d = "";
                aVar.f42039e = "";
                aVar.f42040f = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f42035a = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 2:
                                aVar.f42036b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f42037c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f42038d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f42039e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f42040f = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, CustomizationOption customizationOption) throws IOException {
                if (customizationOption.is_others != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, customizationOption.is_others);
                }
                if (customizationOption.others_content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, customizationOption.others_content);
                }
                if (customizationOption.option_label != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, customizationOption.option_label);
                }
                if (customizationOption.option_image_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, customizationOption.option_image_url);
                }
                if (customizationOption.option_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, customizationOption.option_key);
                }
                if (customizationOption.is_selected != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, customizationOption.is_selected);
                }
                protoWriter.writeBytes(customizationOption.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$CustomizationOption$a */
        public static final class C16004a extends Message.Builder<CustomizationOption, C16004a> {

            /* renamed from: a */
            public Boolean f42035a;

            /* renamed from: b */
            public String f42036b;

            /* renamed from: c */
            public String f42037c;

            /* renamed from: d */
            public String f42038d;

            /* renamed from: e */
            public String f42039e;

            /* renamed from: f */
            public Boolean f42040f;

            /* renamed from: a */
            public CustomizationOption build() {
                return new CustomizationOption(this.f42035a, this.f42036b, this.f42037c, this.f42038d, this.f42039e, this.f42040f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16004a newBuilder() {
            C16004a aVar = new C16004a();
            aVar.f42035a = this.is_others;
            aVar.f42036b = this.others_content;
            aVar.f42037c = this.option_label;
            aVar.f42038d = this.option_image_url;
            aVar.f42039e = this.option_key;
            aVar.f42040f = this.is_selected;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CustomizationOption");
            StringBuilder sb = new StringBuilder();
            if (this.is_others != null) {
                sb.append(", is_others=");
                sb.append(this.is_others);
            }
            if (this.others_content != null) {
                sb.append(", others_content=");
                sb.append(this.others_content);
            }
            if (this.option_label != null) {
                sb.append(", option_label=");
                sb.append(this.option_label);
            }
            if (this.option_image_url != null) {
                sb.append(", option_image_url=");
                sb.append(this.option_image_url);
            }
            if (this.option_key != null) {
                sb.append(", option_key=");
                sb.append(this.option_key);
            }
            if (this.is_selected != null) {
                sb.append(", is_selected=");
                sb.append(this.is_selected);
            }
            StringBuilder replace = sb.replace(0, 2, "CustomizationOption{");
            replace.append('}');
            return replace.toString();
        }

        public CustomizationOption(Boolean bool, String str, String str2, String str3, String str4, Boolean bool2) {
            this(bool, str, str2, str3, str4, bool2, ByteString.EMPTY);
        }

        public CustomizationOption(Boolean bool, String str, String str2, String str3, String str4, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_others = bool;
            this.others_content = str;
            this.option_label = str2;
            this.option_image_url = str3;
            this.option_key = str4;
            this.is_selected = bool2;
        }
    }

    public static final class OptionCondition extends Message<OptionCondition, C16006a> {
        public static final ProtoAdapter<OptionCondition> ADAPTER = new C16007b();
        private static final long serialVersionUID = 0;
        public final String custom_key;
        public final List<String> option_keys;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$OptionCondition$b */
        private static final class C16007b extends ProtoAdapter<OptionCondition> {
            C16007b() {
                super(FieldEncoding.LENGTH_DELIMITED, OptionCondition.class);
            }

            /* renamed from: a */
            public int encodedSize(OptionCondition optionCondition) {
                int i;
                if (optionCondition.custom_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, optionCondition.custom_key);
                } else {
                    i = 0;
                }
                return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, optionCondition.option_keys) + optionCondition.unknownFields().size();
            }

            /* renamed from: a */
            public OptionCondition decode(ProtoReader protoReader) throws IOException {
                C16006a aVar = new C16006a();
                aVar.f42041a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42041a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42042b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OptionCondition optionCondition) throws IOException {
                if (optionCondition.custom_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, optionCondition.custom_key);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, optionCondition.option_keys);
                protoWriter.writeBytes(optionCondition.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$OptionCondition$a */
        public static final class C16006a extends Message.Builder<OptionCondition, C16006a> {

            /* renamed from: a */
            public String f42041a;

            /* renamed from: b */
            public List<String> f42042b = Internal.newMutableList();

            /* renamed from: a */
            public OptionCondition build() {
                return new OptionCondition(this.f42041a, this.f42042b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16006a newBuilder() {
            C16006a aVar = new C16006a();
            aVar.f42041a = this.custom_key;
            aVar.f42042b = Internal.copyOf("option_keys", this.option_keys);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "OptionCondition");
            StringBuilder sb = new StringBuilder();
            if (this.custom_key != null) {
                sb.append(", custom_key=");
                sb.append(this.custom_key);
            }
            if (!this.option_keys.isEmpty()) {
                sb.append(", option_keys=");
                sb.append(this.option_keys);
            }
            StringBuilder replace = sb.replace(0, 2, "OptionCondition{");
            replace.append('}');
            return replace.toString();
        }

        public OptionCondition(String str, List<String> list) {
            this(str, list, ByteString.EMPTY);
        }

        public OptionCondition(String str, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.custom_key = str;
            this.option_keys = Internal.immutableCopyOf("option_keys", list);
        }
    }

    public static final class ResourceApprovalInfo extends Message<ResourceApprovalInfo, C16008a> {
        public static final ProtoAdapter<ResourceApprovalInfo> ADAPTER = new C16009b();
        private static final long serialVersionUID = 0;
        public final List<String> approver_user_ids;
        public final ApprovalTrigger trigger;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceApprovalInfo$b */
        private static final class C16009b extends ProtoAdapter<ResourceApprovalInfo> {
            C16009b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResourceApprovalInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(ResourceApprovalInfo resourceApprovalInfo) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, resourceApprovalInfo.approver_user_ids);
                if (resourceApprovalInfo.trigger != null) {
                    i = ApprovalTrigger.ADAPTER.encodedSizeWithTag(2, resourceApprovalInfo.trigger);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + resourceApprovalInfo.unknownFields().size();
            }

            /* renamed from: a */
            public ResourceApprovalInfo decode(ProtoReader protoReader) throws IOException {
                C16008a aVar = new C16008a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42043a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42044b = ApprovalTrigger.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ResourceApprovalInfo resourceApprovalInfo) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, resourceApprovalInfo.approver_user_ids);
                if (resourceApprovalInfo.trigger != null) {
                    ApprovalTrigger.ADAPTER.encodeWithTag(protoWriter, 2, resourceApprovalInfo.trigger);
                }
                protoWriter.writeBytes(resourceApprovalInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceApprovalInfo$a */
        public static final class C16008a extends Message.Builder<ResourceApprovalInfo, C16008a> {

            /* renamed from: a */
            public List<String> f42043a = Internal.newMutableList();

            /* renamed from: b */
            public ApprovalTrigger f42044b;

            /* renamed from: a */
            public ResourceApprovalInfo build() {
                return new ResourceApprovalInfo(this.f42043a, this.f42044b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16008a newBuilder() {
            C16008a aVar = new C16008a();
            aVar.f42043a = Internal.copyOf("approver_user_ids", this.approver_user_ids);
            aVar.f42044b = this.trigger;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "ResourceApprovalInfo");
            StringBuilder sb = new StringBuilder();
            if (!this.approver_user_ids.isEmpty()) {
                sb.append(", approver_user_ids=");
                sb.append(this.approver_user_ids);
            }
            if (this.trigger != null) {
                sb.append(", trigger=");
                sb.append(this.trigger);
            }
            StringBuilder replace = sb.replace(0, 2, "ResourceApprovalInfo{");
            replace.append('}');
            return replace.toString();
        }

        public ResourceApprovalInfo(List<String> list, ApprovalTrigger approvalTrigger) {
            this(list, approvalTrigger, ByteString.EMPTY);
        }

        public ResourceApprovalInfo(List<String> list, ApprovalTrigger approvalTrigger, ByteString byteString) {
            super(ADAPTER, byteString);
            this.approver_user_ids = Internal.immutableCopyOf("approver_user_ids", list);
            this.trigger = approvalTrigger;
        }
    }

    public static final class ResourceCustomization extends Message<ResourceCustomization, C16010a> {
        public static final ProtoAdapter<ResourceCustomization> ADAPTER = new C16011b();
        public static final Long DEFAULT_PREPARATION_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final List<String> contact_ids;
        public final List<CustomizationData> customization_data;
        public final Long preparation_time;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceCustomization$b */
        private static final class C16011b extends ProtoAdapter<ResourceCustomization> {
            C16011b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResourceCustomization.class);
            }

            /* renamed from: a */
            public int encodedSize(ResourceCustomization resourceCustomization) {
                int i;
                int encodedSizeWithTag = CustomizationData.ADAPTER.asRepeated().encodedSizeWithTag(1, resourceCustomization.customization_data) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, resourceCustomization.contact_ids);
                if (resourceCustomization.preparation_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(3, resourceCustomization.preparation_time);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + resourceCustomization.unknownFields().size();
            }

            /* renamed from: a */
            public ResourceCustomization decode(ProtoReader protoReader) throws IOException {
                C16010a aVar = new C16010a();
                aVar.f42047c = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42045a.add(CustomizationData.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f42046b.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42047c = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ResourceCustomization resourceCustomization) throws IOException {
                CustomizationData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, resourceCustomization.customization_data);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, resourceCustomization.contact_ids);
                if (resourceCustomization.preparation_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, resourceCustomization.preparation_time);
                }
                protoWriter.writeBytes(resourceCustomization.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceCustomization$a */
        public static final class C16010a extends Message.Builder<ResourceCustomization, C16010a> {

            /* renamed from: a */
            public List<CustomizationData> f42045a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f42046b = Internal.newMutableList();

            /* renamed from: c */
            public Long f42047c;

            /* renamed from: a */
            public ResourceCustomization build() {
                return new ResourceCustomization(this.f42045a, this.f42046b, this.f42047c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16010a newBuilder() {
            C16010a aVar = new C16010a();
            aVar.f42045a = Internal.copyOf("customization_data", this.customization_data);
            aVar.f42046b = Internal.copyOf("contact_ids", this.contact_ids);
            aVar.f42047c = this.preparation_time;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "ResourceCustomization");
            StringBuilder sb = new StringBuilder();
            if (!this.customization_data.isEmpty()) {
                sb.append(", customization_data=");
                sb.append(this.customization_data);
            }
            if (!this.contact_ids.isEmpty()) {
                sb.append(", contact_ids=");
                sb.append(this.contact_ids);
            }
            if (this.preparation_time != null) {
                sb.append(", preparation_time=");
                sb.append(this.preparation_time);
            }
            StringBuilder replace = sb.replace(0, 2, "ResourceCustomization{");
            replace.append('}');
            return replace.toString();
        }

        public ResourceCustomization(List<CustomizationData> list, List<String> list2, Long l) {
            this(list, list2, l, ByteString.EMPTY);
        }

        public ResourceCustomization(List<CustomizationData> list, List<String> list2, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.customization_data = Internal.immutableCopyOf("customization_data", list);
            this.contact_ids = Internal.immutableCopyOf("contact_ids", list2);
            this.preparation_time = l;
        }
    }

    public static final class ResourceRequisition extends Message<ResourceRequisition, C16012a> {
        public static final ProtoAdapter<ResourceRequisition> ADAPTER = new C16013b();
        public static final Long DEFAULT_END_TIME = 0L;
        public static final Long DEFAULT_START_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final List<String> contact_ids;
        public final Long end_time;
        public final String reason;
        public final Long start_time;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceRequisition$b */
        private static final class C16013b extends ProtoAdapter<ResourceRequisition> {
            C16013b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResourceRequisition.class);
            }

            /* renamed from: a */
            public int encodedSize(ResourceRequisition resourceRequisition) {
                int i;
                int i2;
                int i3 = 0;
                if (resourceRequisition.start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, resourceRequisition.start_time);
                } else {
                    i = 0;
                }
                if (resourceRequisition.end_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, resourceRequisition.end_time);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, resourceRequisition.contact_ids);
                if (resourceRequisition.reason != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, resourceRequisition.reason);
                }
                return encodedSizeWithTag + i3 + resourceRequisition.unknownFields().size();
            }

            /* renamed from: a */
            public ResourceRequisition decode(ProtoReader protoReader) throws IOException {
                C16012a aVar = new C16012a();
                aVar.f42048a = 0L;
                aVar.f42049b = 0L;
                aVar.f42051d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42048a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42049b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f42050c.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42051d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ResourceRequisition resourceRequisition) throws IOException {
                if (resourceRequisition.start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, resourceRequisition.start_time);
                }
                if (resourceRequisition.end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, resourceRequisition.end_time);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, resourceRequisition.contact_ids);
                if (resourceRequisition.reason != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, resourceRequisition.reason);
                }
                protoWriter.writeBytes(resourceRequisition.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceRequisition$a */
        public static final class C16012a extends Message.Builder<ResourceRequisition, C16012a> {

            /* renamed from: a */
            public Long f42048a;

            /* renamed from: b */
            public Long f42049b;

            /* renamed from: c */
            public List<String> f42050c = Internal.newMutableList();

            /* renamed from: d */
            public String f42051d;

            /* renamed from: a */
            public ResourceRequisition build() {
                return new ResourceRequisition(this.f42048a, this.f42049b, this.f42050c, this.f42051d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16012a newBuilder() {
            C16012a aVar = new C16012a();
            aVar.f42048a = this.start_time;
            aVar.f42049b = this.end_time;
            aVar.f42050c = Internal.copyOf("contact_ids", this.contact_ids);
            aVar.f42051d = this.reason;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "ResourceRequisition");
            StringBuilder sb = new StringBuilder();
            if (this.start_time != null) {
                sb.append(", start_time=");
                sb.append(this.start_time);
            }
            if (this.end_time != null) {
                sb.append(", end_time=");
                sb.append(this.end_time);
            }
            if (!this.contact_ids.isEmpty()) {
                sb.append(", contact_ids=");
                sb.append(this.contact_ids);
            }
            if (this.reason != null) {
                sb.append(", reason=");
                sb.append(this.reason);
            }
            StringBuilder replace = sb.replace(0, 2, "ResourceRequisition{");
            replace.append('}');
            return replace.toString();
        }

        public ResourceRequisition(Long l, Long l2, List<String> list, String str) {
            this(l, l2, list, str, ByteString.EMPTY);
        }

        public ResourceRequisition(Long l, Long l2, List<String> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.start_time = l;
            this.end_time = l2;
            this.contact_ids = Internal.immutableCopyOf("contact_ids", list);
            this.reason = str;
        }
    }

    public static final class ResourceStrategy extends Message<ResourceStrategy, C16014a> {
        public static final ProtoAdapter<ResourceStrategy> ADAPTER = new C16015b();
        public static final Integer DEFAULT_DAILY_END_TIME = 0;
        public static final Integer DEFAULT_DAILY_START_TIME = 0;
        public static final Integer DEFAULT_SINGLE_MAX_DURATION = 0;
        public static final Integer DEFAULT_UNTIL_MAX_DURATION = 0;
        private static final long serialVersionUID = 0;
        public final Integer daily_end_time;
        public final Integer daily_start_time;
        public final Integer single_max_duration;
        public final String timezone;
        public final Integer until_max_duration;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceStrategy$b */
        private static final class C16015b extends ProtoAdapter<ResourceStrategy> {
            C16015b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResourceStrategy.class);
            }

            /* renamed from: a */
            public int encodedSize(ResourceStrategy resourceStrategy) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (resourceStrategy.single_max_duration != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, resourceStrategy.single_max_duration);
                } else {
                    i = 0;
                }
                if (resourceStrategy.until_max_duration != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, resourceStrategy.until_max_duration);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (resourceStrategy.daily_start_time != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, resourceStrategy.daily_start_time);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (resourceStrategy.daily_end_time != null) {
                    i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, resourceStrategy.daily_end_time);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (resourceStrategy.timezone != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, resourceStrategy.timezone);
                }
                return i8 + i5 + resourceStrategy.unknownFields().size();
            }

            /* renamed from: a */
            public ResourceStrategy decode(ProtoReader protoReader) throws IOException {
                C16014a aVar = new C16014a();
                aVar.f42052a = 0;
                aVar.f42053b = 0;
                aVar.f42054c = 0;
                aVar.f42055d = 0;
                aVar.f42056e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42052a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42053b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f42054c = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f42055d = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42056e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ResourceStrategy resourceStrategy) throws IOException {
                if (resourceStrategy.single_max_duration != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, resourceStrategy.single_max_duration);
                }
                if (resourceStrategy.until_max_duration != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, resourceStrategy.until_max_duration);
                }
                if (resourceStrategy.daily_start_time != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, resourceStrategy.daily_start_time);
                }
                if (resourceStrategy.daily_end_time != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, resourceStrategy.daily_end_time);
                }
                if (resourceStrategy.timezone != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, resourceStrategy.timezone);
                }
                protoWriter.writeBytes(resourceStrategy.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceStrategy$a */
        public static final class C16014a extends Message.Builder<ResourceStrategy, C16014a> {

            /* renamed from: a */
            public Integer f42052a;

            /* renamed from: b */
            public Integer f42053b;

            /* renamed from: c */
            public Integer f42054c;

            /* renamed from: d */
            public Integer f42055d;

            /* renamed from: e */
            public String f42056e;

            /* renamed from: a */
            public ResourceStrategy build() {
                return new ResourceStrategy(this.f42052a, this.f42053b, this.f42054c, this.f42055d, this.f42056e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16014a newBuilder() {
            C16014a aVar = new C16014a();
            aVar.f42052a = this.single_max_duration;
            aVar.f42053b = this.until_max_duration;
            aVar.f42054c = this.daily_start_time;
            aVar.f42055d = this.daily_end_time;
            aVar.f42056e = this.timezone;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "ResourceStrategy");
            StringBuilder sb = new StringBuilder();
            if (this.single_max_duration != null) {
                sb.append(", single_max_duration=");
                sb.append(this.single_max_duration);
            }
            if (this.until_max_duration != null) {
                sb.append(", until_max_duration=");
                sb.append(this.until_max_duration);
            }
            if (this.daily_start_time != null) {
                sb.append(", daily_start_time=");
                sb.append(this.daily_start_time);
            }
            if (this.daily_end_time != null) {
                sb.append(", daily_end_time=");
                sb.append(this.daily_end_time);
            }
            if (this.timezone != null) {
                sb.append(", timezone=");
                sb.append(this.timezone);
            }
            StringBuilder replace = sb.replace(0, 2, "ResourceStrategy{");
            replace.append('}');
            return replace.toString();
        }

        public ResourceStrategy(Integer num, Integer num2, Integer num3, Integer num4, String str) {
            this(num, num2, num3, num4, str, ByteString.EMPTY);
        }

        public ResourceStrategy(Integer num, Integer num2, Integer num3, Integer num4, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.single_max_duration = num;
            this.until_max_duration = num2;
            this.daily_start_time = num3;
            this.daily_end_time = num4;
            this.timezone = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$b */
    private static final class C16017b extends ProtoAdapter<SchemaExtraData> {
        C16017b() {
            super(FieldEncoding.LENGTH_DELIMITED, SchemaExtraData.class);
        }

        /* renamed from: a */
        public int encodedSize(SchemaExtraData schemaExtraData) {
            return BizData.ADAPTER.asRepeated().encodedSizeWithTag(1, schemaExtraData.biz_data) + schemaExtraData.unknownFields().size();
        }

        /* renamed from: a */
        public SchemaExtraData decode(ProtoReader protoReader) throws IOException {
            C16016a aVar = new C16016a();
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
                    aVar.f42057a.add(BizData.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SchemaExtraData schemaExtraData) throws IOException {
            BizData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, schemaExtraData.biz_data);
            protoWriter.writeBytes(schemaExtraData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SchemaExtraData$a */
    public static final class C16016a extends Message.Builder<SchemaExtraData, C16016a> {

        /* renamed from: a */
        public List<BizData> f42057a = Internal.newMutableList();

        /* renamed from: a */
        public SchemaExtraData build() {
            return new SchemaExtraData(this.f42057a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16016a mo57623a(List<BizData> list) {
            Internal.checkElementsNotNull(list);
            this.f42057a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16016a newBuilder() {
        C16016a aVar = new C16016a();
        aVar.f42057a = Internal.copyOf("biz_data", this.biz_data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SchemaExtraData");
        StringBuilder sb = new StringBuilder();
        if (!this.biz_data.isEmpty()) {
            sb.append(", biz_data=");
            sb.append(this.biz_data);
        }
        StringBuilder replace = sb.replace(0, 2, "SchemaExtraData{");
        replace.append('}');
        return replace.toString();
    }

    public SchemaExtraData(List<BizData> list) {
        this(list, ByteString.EMPTY);
    }

    public SchemaExtraData(List<BizData> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_data = Internal.immutableCopyOf("biz_data", list);
    }
}
