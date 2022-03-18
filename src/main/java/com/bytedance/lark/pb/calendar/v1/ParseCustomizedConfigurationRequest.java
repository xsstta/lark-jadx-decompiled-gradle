package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
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

public final class ParseCustomizedConfigurationRequest extends Message<ParseCustomizedConfigurationRequest, C15900a> {
    public static final ProtoAdapter<ParseCustomizedConfigurationRequest> ADAPTER = new C15901b();
    private static final long serialVersionUID = 0;
    public final List<String> contact_ids;
    public final List<SchemaExtraData.CustomizationData> resource_customization;
    public final Map<String, SelectedKeys> user_inputs;

    public static final class SelectedKeys extends Message<SelectedKeys, C15898a> {
        public static final ProtoAdapter<SelectedKeys> ADAPTER = new C15899b();
        private static final long serialVersionUID = 0;
        public final List<String> selected_option_keys;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationRequest$SelectedKeys$b */
        private static final class C15899b extends ProtoAdapter<SelectedKeys> {
            C15899b() {
                super(FieldEncoding.LENGTH_DELIMITED, SelectedKeys.class);
            }

            /* renamed from: a */
            public int encodedSize(SelectedKeys selectedKeys) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, selectedKeys.selected_option_keys) + selectedKeys.unknownFields().size();
            }

            /* renamed from: a */
            public SelectedKeys decode(ProtoReader protoReader) throws IOException {
                C15898a aVar = new C15898a();
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
                        aVar.f41857a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SelectedKeys selectedKeys) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, selectedKeys.selected_option_keys);
                protoWriter.writeBytes(selectedKeys.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationRequest$SelectedKeys$a */
        public static final class C15898a extends Message.Builder<SelectedKeys, C15898a> {

            /* renamed from: a */
            public List<String> f41857a = Internal.newMutableList();

            /* renamed from: a */
            public SelectedKeys build() {
                return new SelectedKeys(this.f41857a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15898a mo57329a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f41857a = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15898a newBuilder() {
            C15898a aVar = new C15898a();
            aVar.f41857a = Internal.copyOf("selected_option_keys", this.selected_option_keys);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "SelectedKeys");
            StringBuilder sb = new StringBuilder();
            if (!this.selected_option_keys.isEmpty()) {
                sb.append(", selected_option_keys=");
                sb.append(this.selected_option_keys);
            }
            StringBuilder replace = sb.replace(0, 2, "SelectedKeys{");
            replace.append('}');
            return replace.toString();
        }

        public SelectedKeys(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public SelectedKeys(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.selected_option_keys = Internal.immutableCopyOf("selected_option_keys", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationRequest$a */
    public static final class C15900a extends Message.Builder<ParseCustomizedConfigurationRequest, C15900a> {

        /* renamed from: a */
        public Map<String, SelectedKeys> f41858a = Internal.newMutableMap();

        /* renamed from: b */
        public List<SchemaExtraData.CustomizationData> f41859b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f41860c = Internal.newMutableList();

        /* renamed from: a */
        public ParseCustomizedConfigurationRequest build() {
            return new ParseCustomizedConfigurationRequest(this.f41858a, this.f41859b, this.f41860c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15900a mo57334a(List<SchemaExtraData.CustomizationData> list) {
            Internal.checkElementsNotNull(list);
            this.f41859b = list;
            return this;
        }

        /* renamed from: b */
        public C15900a mo57337b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41860c = list;
            return this;
        }

        /* renamed from: a */
        public C15900a mo57335a(Map<String, SelectedKeys> map) {
            Internal.checkElementsNotNull(map);
            this.f41858a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationRequest$b */
    private static final class C15901b extends ProtoAdapter<ParseCustomizedConfigurationRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SelectedKeys>> f41861a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SelectedKeys.ADAPTER);

        C15901b() {
            super(FieldEncoding.LENGTH_DELIMITED, ParseCustomizedConfigurationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ParseCustomizedConfigurationRequest parseCustomizedConfigurationRequest) {
            return this.f41861a.encodedSizeWithTag(1, parseCustomizedConfigurationRequest.user_inputs) + SchemaExtraData.CustomizationData.ADAPTER.asRepeated().encodedSizeWithTag(2, parseCustomizedConfigurationRequest.resource_customization) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, parseCustomizedConfigurationRequest.contact_ids) + parseCustomizedConfigurationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ParseCustomizedConfigurationRequest decode(ProtoReader protoReader) throws IOException {
            C15900a aVar = new C15900a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41858a.putAll(this.f41861a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41859b.add(SchemaExtraData.CustomizationData.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41860c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ParseCustomizedConfigurationRequest parseCustomizedConfigurationRequest) throws IOException {
            this.f41861a.encodeWithTag(protoWriter, 1, parseCustomizedConfigurationRequest.user_inputs);
            SchemaExtraData.CustomizationData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, parseCustomizedConfigurationRequest.resource_customization);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, parseCustomizedConfigurationRequest.contact_ids);
            protoWriter.writeBytes(parseCustomizedConfigurationRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15900a newBuilder() {
        C15900a aVar = new C15900a();
        aVar.f41858a = Internal.copyOf("user_inputs", this.user_inputs);
        aVar.f41859b = Internal.copyOf("resource_customization", this.resource_customization);
        aVar.f41860c = Internal.copyOf("contact_ids", this.contact_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ParseCustomizedConfigurationRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.user_inputs.isEmpty()) {
            sb.append(", user_inputs=");
            sb.append(this.user_inputs);
        }
        if (!this.resource_customization.isEmpty()) {
            sb.append(", resource_customization=");
            sb.append(this.resource_customization);
        }
        if (!this.contact_ids.isEmpty()) {
            sb.append(", contact_ids=");
            sb.append(this.contact_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "ParseCustomizedConfigurationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ParseCustomizedConfigurationRequest(Map<String, SelectedKeys> map, List<SchemaExtraData.CustomizationData> list, List<String> list2) {
        this(map, list, list2, ByteString.EMPTY);
    }

    public ParseCustomizedConfigurationRequest(Map<String, SelectedKeys> map, List<SchemaExtraData.CustomizationData> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_inputs = Internal.immutableCopyOf("user_inputs", map);
        this.resource_customization = Internal.immutableCopyOf("resource_customization", list);
        this.contact_ids = Internal.immutableCopyOf("contact_ids", list2);
    }
}
