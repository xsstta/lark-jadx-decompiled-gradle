package com.ss.android.lark.pb.flow;

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

public final class BizEventReportRequest extends Message<BizEventReportRequest, C49754a> {
    public static final ProtoAdapter<BizEventReportRequest> ADAPTER = new C49755b();
    private static final long serialVersionUID = 0;
    public final String mevent_key;
    public final List<String> mevent_key_list;
    public final Map<String, String> mextra;

    /* renamed from: com.ss.android.lark.pb.flow.BizEventReportRequest$b */
    private static final class C49755b extends ProtoAdapter<BizEventReportRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124627a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49755b() {
            super(FieldEncoding.LENGTH_DELIMITED, BizEventReportRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(BizEventReportRequest bizEventReportRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, bizEventReportRequest.mevent_key) + this.f124627a.encodedSizeWithTag(2, bizEventReportRequest.mextra) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, bizEventReportRequest.mevent_key_list) + bizEventReportRequest.unknownFields().size();
        }

        /* renamed from: a */
        public BizEventReportRequest decode(ProtoReader protoReader) throws IOException {
            C49754a aVar = new C49754a();
            aVar.f124624a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124624a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124625b.putAll(this.f124627a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124626c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BizEventReportRequest bizEventReportRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bizEventReportRequest.mevent_key);
            this.f124627a.encodeWithTag(protoWriter, 2, bizEventReportRequest.mextra);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, bizEventReportRequest.mevent_key_list);
            protoWriter.writeBytes(bizEventReportRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.flow.BizEventReportRequest$a */
    public static final class C49754a extends Message.Builder<BizEventReportRequest, C49754a> {

        /* renamed from: a */
        public String f124624a;

        /* renamed from: b */
        public Map<String, String> f124625b = Internal.newMutableMap();

        /* renamed from: c */
        public List<String> f124626c = Internal.newMutableList();

        /* renamed from: a */
        public BizEventReportRequest build() {
            String str = this.f124624a;
            if (str != null) {
                return new BizEventReportRequest(str, this.f124625b, this.f124626c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mevent_key");
        }

        /* renamed from: a */
        public C49754a mo173243a(String str) {
            this.f124624a = str;
            return this;
        }

        /* renamed from: a */
        public C49754a mo173244a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124626c = list;
            return this;
        }

        /* renamed from: a */
        public C49754a mo173245a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f124625b = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49754a newBuilder() {
        C49754a aVar = new C49754a();
        aVar.f124624a = this.mevent_key;
        aVar.f124625b = Internal.copyOf("mextra", this.mextra);
        aVar.f124626c = Internal.copyOf("mevent_key_list", this.mevent_key_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", event_key=");
        sb.append(this.mevent_key);
        if (!this.mextra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.mextra);
        }
        if (!this.mevent_key_list.isEmpty()) {
            sb.append(", event_key_list=");
            sb.append(this.mevent_key_list);
        }
        StringBuilder replace = sb.replace(0, 2, "BizEventReportRequest{");
        replace.append('}');
        return replace.toString();
    }

    public BizEventReportRequest(String str, Map<String, String> map, List<String> list) {
        this(str, map, list, ByteString.EMPTY);
    }

    public BizEventReportRequest(String str, Map<String, String> map, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mevent_key = str;
        this.mextra = Internal.immutableCopyOf("mextra", map);
        this.mevent_key_list = Internal.immutableCopyOf("mevent_key_list", list);
    }
}
