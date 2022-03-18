package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetUGSDKSettingsResponse extends Message<GetUGSDKSettingsResponse, C19777a> {
    public static final ProtoAdapter<GetUGSDKSettingsResponse> ADAPTER = new C19778b();
    private static final long serialVersionUID = 0;
    public final List<String> event_names;
    public final List<ScenarioContext> scenarios;
    public final SDKInnerStrategy sdk_strategy;

    public static final class SDKInnerStrategy extends Message<SDKInnerStrategy, C19775a> {
        public static final ProtoAdapter<SDKInnerStrategy> ADAPTER = new C19776b();
        public static final Double DEFAULT_REQUEST_TIMEOUT_DURATION = Double.valueOf(0.0d);
        public static final Boolean DEFAULT_SOLVE_CONFLICT_USE_GRAPH = false;
        public static final Boolean DEFAULT_UPLOAD_STATUS_USE_LOOP = false;
        private static final long serialVersionUID = 0;
        public final Double request_timeout_duration;
        public final Boolean solve_conflict_use_graph;
        public final Boolean upload_status_use_loop;

        /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGSDKSettingsResponse$SDKInnerStrategy$b */
        private static final class C19776b extends ProtoAdapter<SDKInnerStrategy> {
            C19776b() {
                super(FieldEncoding.LENGTH_DELIMITED, SDKInnerStrategy.class);
            }

            /* renamed from: a */
            public int encodedSize(SDKInnerStrategy sDKInnerStrategy) {
                int i;
                int i2;
                int i3 = 0;
                if (sDKInnerStrategy.solve_conflict_use_graph != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, sDKInnerStrategy.solve_conflict_use_graph);
                } else {
                    i = 0;
                }
                if (sDKInnerStrategy.request_timeout_duration != null) {
                    i2 = ProtoAdapter.DOUBLE.encodedSizeWithTag(2, sDKInnerStrategy.request_timeout_duration);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (sDKInnerStrategy.upload_status_use_loop != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, sDKInnerStrategy.upload_status_use_loop);
                }
                return i4 + i3 + sDKInnerStrategy.unknownFields().size();
            }

            /* renamed from: a */
            public SDKInnerStrategy decode(ProtoReader protoReader) throws IOException {
                C19775a aVar = new C19775a();
                aVar.f48234a = false;
                aVar.f48235b = Double.valueOf(0.0d);
                aVar.f48236c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48234a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f48235b = ProtoAdapter.DOUBLE.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48236c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SDKInnerStrategy sDKInnerStrategy) throws IOException {
                if (sDKInnerStrategy.solve_conflict_use_graph != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, sDKInnerStrategy.solve_conflict_use_graph);
                }
                if (sDKInnerStrategy.request_timeout_duration != null) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, sDKInnerStrategy.request_timeout_duration);
                }
                if (sDKInnerStrategy.upload_status_use_loop != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, sDKInnerStrategy.upload_status_use_loop);
                }
                protoWriter.writeBytes(sDKInnerStrategy.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGSDKSettingsResponse$SDKInnerStrategy$a */
        public static final class C19775a extends Message.Builder<SDKInnerStrategy, C19775a> {

            /* renamed from: a */
            public Boolean f48234a;

            /* renamed from: b */
            public Double f48235b;

            /* renamed from: c */
            public Boolean f48236c;

            /* renamed from: a */
            public SDKInnerStrategy build() {
                return new SDKInnerStrategy(this.f48234a, this.f48235b, this.f48236c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19775a newBuilder() {
            C19775a aVar = new C19775a();
            aVar.f48234a = this.solve_conflict_use_graph;
            aVar.f48235b = this.request_timeout_duration;
            aVar.f48236c = this.upload_status_use_loop;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("ugreach", "SDKInnerStrategy");
            StringBuilder sb = new StringBuilder();
            if (this.solve_conflict_use_graph != null) {
                sb.append(", solve_conflict_use_graph=");
                sb.append(this.solve_conflict_use_graph);
            }
            if (this.request_timeout_duration != null) {
                sb.append(", request_timeout_duration=");
                sb.append(this.request_timeout_duration);
            }
            if (this.upload_status_use_loop != null) {
                sb.append(", upload_status_use_loop=");
                sb.append(this.upload_status_use_loop);
            }
            StringBuilder replace = sb.replace(0, 2, "SDKInnerStrategy{");
            replace.append('}');
            return replace.toString();
        }

        public SDKInnerStrategy(Boolean bool, Double d, Boolean bool2) {
            this(bool, d, bool2, ByteString.EMPTY);
        }

        public SDKInnerStrategy(Boolean bool, Double d, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.solve_conflict_use_graph = bool;
            this.request_timeout_duration = d;
            this.upload_status_use_loop = bool2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGSDKSettingsResponse$b */
    private static final class C19778b extends ProtoAdapter<GetUGSDKSettingsResponse> {
        C19778b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUGSDKSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUGSDKSettingsResponse getUGSDKSettingsResponse) {
            int i;
            if (getUGSDKSettingsResponse.sdk_strategy != null) {
                i = SDKInnerStrategy.ADAPTER.encodedSizeWithTag(1, getUGSDKSettingsResponse.sdk_strategy);
            } else {
                i = 0;
            }
            return i + ScenarioContext.ADAPTER.asRepeated().encodedSizeWithTag(2, getUGSDKSettingsResponse.scenarios) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, getUGSDKSettingsResponse.event_names) + getUGSDKSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUGSDKSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C19777a aVar = new C19777a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48237a = SDKInnerStrategy.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48238b.add(ScenarioContext.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48239c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUGSDKSettingsResponse getUGSDKSettingsResponse) throws IOException {
            if (getUGSDKSettingsResponse.sdk_strategy != null) {
                SDKInnerStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getUGSDKSettingsResponse.sdk_strategy);
            }
            ScenarioContext.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getUGSDKSettingsResponse.scenarios);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, getUGSDKSettingsResponse.event_names);
            protoWriter.writeBytes(getUGSDKSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGSDKSettingsResponse$a */
    public static final class C19777a extends Message.Builder<GetUGSDKSettingsResponse, C19777a> {

        /* renamed from: a */
        public SDKInnerStrategy f48237a;

        /* renamed from: b */
        public List<ScenarioContext> f48238b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f48239c = Internal.newMutableList();

        /* renamed from: a */
        public GetUGSDKSettingsResponse build() {
            return new GetUGSDKSettingsResponse(this.f48237a, this.f48238b, this.f48239c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19777a newBuilder() {
        C19777a aVar = new C19777a();
        aVar.f48237a = this.sdk_strategy;
        aVar.f48238b = Internal.copyOf("scenarios", this.scenarios);
        aVar.f48239c = Internal.copyOf("event_names", this.event_names);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "GetUGSDKSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.sdk_strategy != null) {
            sb.append(", sdk_strategy=");
            sb.append(this.sdk_strategy);
        }
        if (!this.scenarios.isEmpty()) {
            sb.append(", scenarios=");
            sb.append(this.scenarios);
        }
        if (!this.event_names.isEmpty()) {
            sb.append(", event_names=");
            sb.append(this.event_names);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUGSDKSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUGSDKSettingsResponse(SDKInnerStrategy sDKInnerStrategy, List<ScenarioContext> list, List<String> list2) {
        this(sDKInnerStrategy, list, list2, ByteString.EMPTY);
    }

    public GetUGSDKSettingsResponse(SDKInnerStrategy sDKInnerStrategy, List<ScenarioContext> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sdk_strategy = sDKInnerStrategy;
        this.scenarios = Internal.immutableCopyOf("scenarios", list);
        this.event_names = Internal.immutableCopyOf("event_names", list2);
    }
}
