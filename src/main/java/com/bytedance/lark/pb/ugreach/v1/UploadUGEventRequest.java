package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class UploadUGEventRequest extends Message<UploadUGEventRequest, C19807a> {
    public static final ProtoAdapter<UploadUGEventRequest> ADAPTER = new C19808b();
    public static final Long DEFAULT_LOCAL_RULE_ID = 0L;
    public static final Boolean DEFAULT_RETRY_IN_FUTURE = false;
    private static final long serialVersionUID = 0;
    public final String event_name;
    public final Long local_rule_id;
    public final String material_key;
    public final String reach_point_id;
    public final Boolean retry_in_future;
    public final String scenario_id;
    public final Map<String, String> upload_context;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.UploadUGEventRequest$a */
    public static final class C19807a extends Message.Builder<UploadUGEventRequest, C19807a> {

        /* renamed from: a */
        public String f48287a;

        /* renamed from: b */
        public String f48288b;

        /* renamed from: c */
        public String f48289c;

        /* renamed from: d */
        public Long f48290d;

        /* renamed from: e */
        public String f48291e;

        /* renamed from: f */
        public Map<String, String> f48292f = Internal.newMutableMap();

        /* renamed from: g */
        public Boolean f48293g;

        /* renamed from: a */
        public UploadUGEventRequest build() {
            return new UploadUGEventRequest(this.f48287a, this.f48288b, this.f48289c, this.f48290d, this.f48291e, this.f48292f, this.f48293g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19807a mo67038a(Long l) {
            this.f48290d = l;
            return this;
        }

        /* renamed from: b */
        public C19807a mo67042b(String str) {
            this.f48288b = str;
            return this;
        }

        /* renamed from: c */
        public C19807a mo67043c(String str) {
            this.f48289c = str;
            return this;
        }

        /* renamed from: d */
        public C19807a mo67044d(String str) {
            this.f48291e = str;
            return this;
        }

        /* renamed from: a */
        public C19807a mo67039a(String str) {
            this.f48287a = str;
            return this;
        }

        /* renamed from: a */
        public C19807a mo67040a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f48292f = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.UploadUGEventRequest$b */
    private static final class C19808b extends ProtoAdapter<UploadUGEventRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f48294a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19808b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadUGEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadUGEventRequest uploadUGEventRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (uploadUGEventRequest.scenario_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadUGEventRequest.scenario_id);
            } else {
                i = 0;
            }
            if (uploadUGEventRequest.reach_point_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, uploadUGEventRequest.reach_point_id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (uploadUGEventRequest.material_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, uploadUGEventRequest.material_key);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (uploadUGEventRequest.local_rule_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, uploadUGEventRequest.local_rule_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (uploadUGEventRequest.event_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, uploadUGEventRequest.event_name);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i9 + i5 + this.f48294a.encodedSizeWithTag(6, uploadUGEventRequest.upload_context);
            if (uploadUGEventRequest.retry_in_future != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, uploadUGEventRequest.retry_in_future);
            }
            return encodedSizeWithTag + i6 + uploadUGEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadUGEventRequest decode(ProtoReader protoReader) throws IOException {
            C19807a aVar = new C19807a();
            aVar.f48287a = "";
            aVar.f48288b = "";
            aVar.f48289c = "";
            aVar.f48290d = 0L;
            aVar.f48291e = "";
            aVar.f48293g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48287a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f48288b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f48289c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f48290d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f48291e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f48292f.putAll(this.f48294a.decode(protoReader));
                            break;
                        case 7:
                            aVar.f48293g = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UploadUGEventRequest uploadUGEventRequest) throws IOException {
            if (uploadUGEventRequest.scenario_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadUGEventRequest.scenario_id);
            }
            if (uploadUGEventRequest.reach_point_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, uploadUGEventRequest.reach_point_id);
            }
            if (uploadUGEventRequest.material_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uploadUGEventRequest.material_key);
            }
            if (uploadUGEventRequest.local_rule_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, uploadUGEventRequest.local_rule_id);
            }
            if (uploadUGEventRequest.event_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, uploadUGEventRequest.event_name);
            }
            this.f48294a.encodeWithTag(protoWriter, 6, uploadUGEventRequest.upload_context);
            if (uploadUGEventRequest.retry_in_future != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, uploadUGEventRequest.retry_in_future);
            }
            protoWriter.writeBytes(uploadUGEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19807a newBuilder() {
        C19807a aVar = new C19807a();
        aVar.f48287a = this.scenario_id;
        aVar.f48288b = this.reach_point_id;
        aVar.f48289c = this.material_key;
        aVar.f48290d = this.local_rule_id;
        aVar.f48291e = this.event_name;
        aVar.f48292f = Internal.copyOf("upload_context", this.upload_context);
        aVar.f48293g = this.retry_in_future;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "UploadUGEventRequest");
        StringBuilder sb = new StringBuilder();
        if (this.scenario_id != null) {
            sb.append(", scenario_id=");
            sb.append(this.scenario_id);
        }
        if (this.reach_point_id != null) {
            sb.append(", reach_point_id=");
            sb.append(this.reach_point_id);
        }
        if (this.material_key != null) {
            sb.append(", material_key=");
            sb.append(this.material_key);
        }
        if (this.local_rule_id != null) {
            sb.append(", local_rule_id=");
            sb.append(this.local_rule_id);
        }
        if (this.event_name != null) {
            sb.append(", event_name=");
            sb.append(this.event_name);
        }
        if (!this.upload_context.isEmpty()) {
            sb.append(", upload_context=");
            sb.append(this.upload_context);
        }
        if (this.retry_in_future != null) {
            sb.append(", retry_in_future=");
            sb.append(this.retry_in_future);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadUGEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadUGEventRequest(String str, String str2, String str3, Long l, String str4, Map<String, String> map, Boolean bool) {
        this(str, str2, str3, l, str4, map, bool, ByteString.EMPTY);
    }

    public UploadUGEventRequest(String str, String str2, String str3, Long l, String str4, Map<String, String> map, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scenario_id = str;
        this.reach_point_id = str2;
        this.material_key = str3;
        this.local_rule_id = l;
        this.event_name = str4;
        this.upload_context = Internal.immutableCopyOf("upload_context", map);
        this.retry_in_future = bool;
    }
}
