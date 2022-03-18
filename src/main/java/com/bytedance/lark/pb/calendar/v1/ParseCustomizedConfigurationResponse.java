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

public final class ParseCustomizedConfigurationResponse extends Message<ParseCustomizedConfigurationResponse, C15902a> {
    public static final ProtoAdapter<ParseCustomizedConfigurationResponse> ADAPTER = new C15903b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> chatters;
    public final List<SchemaExtraData.CustomizationData> ui_layer_customization;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationResponse$a */
    public static final class C15902a extends Message.Builder<ParseCustomizedConfigurationResponse, C15902a> {

        /* renamed from: a */
        public List<SchemaExtraData.CustomizationData> f41862a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, String> f41863b = Internal.newMutableMap();

        /* renamed from: a */
        public ParseCustomizedConfigurationResponse build() {
            return new ParseCustomizedConfigurationResponse(this.f41862a, this.f41863b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationResponse$b */
    private static final class C15903b extends ProtoAdapter<ParseCustomizedConfigurationResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f41864a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15903b() {
            super(FieldEncoding.LENGTH_DELIMITED, ParseCustomizedConfigurationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ParseCustomizedConfigurationResponse parseCustomizedConfigurationResponse) {
            return SchemaExtraData.CustomizationData.ADAPTER.asRepeated().encodedSizeWithTag(1, parseCustomizedConfigurationResponse.ui_layer_customization) + this.f41864a.encodedSizeWithTag(2, parseCustomizedConfigurationResponse.chatters) + parseCustomizedConfigurationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ParseCustomizedConfigurationResponse decode(ProtoReader protoReader) throws IOException {
            C15902a aVar = new C15902a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41862a.add(SchemaExtraData.CustomizationData.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41863b.putAll(this.f41864a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ParseCustomizedConfigurationResponse parseCustomizedConfigurationResponse) throws IOException {
            SchemaExtraData.CustomizationData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, parseCustomizedConfigurationResponse.ui_layer_customization);
            this.f41864a.encodeWithTag(protoWriter, 2, parseCustomizedConfigurationResponse.chatters);
            protoWriter.writeBytes(parseCustomizedConfigurationResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15902a newBuilder() {
        C15902a aVar = new C15902a();
        aVar.f41862a = Internal.copyOf("ui_layer_customization", this.ui_layer_customization);
        aVar.f41863b = Internal.copyOf("chatters", this.chatters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ParseCustomizedConfigurationResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.ui_layer_customization.isEmpty()) {
            sb.append(", ui_layer_customization=");
            sb.append(this.ui_layer_customization);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        StringBuilder replace = sb.replace(0, 2, "ParseCustomizedConfigurationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ParseCustomizedConfigurationResponse(List<SchemaExtraData.CustomizationData> list, Map<String, String> map) {
        this(list, map, ByteString.EMPTY);
    }

    public ParseCustomizedConfigurationResponse(List<SchemaExtraData.CustomizationData> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ui_layer_customization = Internal.immutableCopyOf("ui_layer_customization", list);
        this.chatters = Internal.immutableCopyOf("chatters", map);
    }
}
