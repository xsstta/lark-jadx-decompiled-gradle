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

public final class PushUGScenarioInfo extends Message<PushUGScenarioInfo, C19791a> {
    public static final ProtoAdapter<PushUGScenarioInfo> ADAPTER = new C19792b();
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final LocalRule local_rule;
    public final UpdatedReachPoints reach_point_ids;
    public final String scenario_id;

    public static final class UpdatedReachPoints extends Message<UpdatedReachPoints, C19789a> {
        public static final ProtoAdapter<UpdatedReachPoints> ADAPTER = new C19790b();
        private static final long serialVersionUID = 0;
        public final List<String> reach_point_ids;

        /* renamed from: com.bytedance.lark.pb.ugreach.v1.PushUGScenarioInfo$UpdatedReachPoints$b */
        private static final class C19790b extends ProtoAdapter<UpdatedReachPoints> {
            C19790b() {
                super(FieldEncoding.LENGTH_DELIMITED, UpdatedReachPoints.class);
            }

            /* renamed from: a */
            public int encodedSize(UpdatedReachPoints updatedReachPoints) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, updatedReachPoints.reach_point_ids) + updatedReachPoints.unknownFields().size();
            }

            /* renamed from: a */
            public UpdatedReachPoints decode(ProtoReader protoReader) throws IOException {
                C19789a aVar = new C19789a();
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
                        aVar.f48250a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UpdatedReachPoints updatedReachPoints) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, updatedReachPoints.reach_point_ids);
                protoWriter.writeBytes(updatedReachPoints.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.ugreach.v1.PushUGScenarioInfo$UpdatedReachPoints$a */
        public static final class C19789a extends Message.Builder<UpdatedReachPoints, C19789a> {

            /* renamed from: a */
            public List<String> f48250a = Internal.newMutableList();

            /* renamed from: a */
            public UpdatedReachPoints build() {
                return new UpdatedReachPoints(this.f48250a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19789a newBuilder() {
            C19789a aVar = new C19789a();
            aVar.f48250a = Internal.copyOf("reach_point_ids", this.reach_point_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("ugreach", "UpdatedReachPoints");
            StringBuilder sb = new StringBuilder();
            if (!this.reach_point_ids.isEmpty()) {
                sb.append(", reach_point_ids=");
                sb.append(this.reach_point_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "UpdatedReachPoints{");
            replace.append('}');
            return replace.toString();
        }

        public UpdatedReachPoints(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public UpdatedReachPoints(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.reach_point_ids = Internal.immutableCopyOf("reach_point_ids", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.PushUGScenarioInfo$b */
    private static final class C19792b extends ProtoAdapter<PushUGScenarioInfo> {
        C19792b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUGScenarioInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUGScenarioInfo pushUGScenarioInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pushUGScenarioInfo.app_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushUGScenarioInfo.app_id);
            } else {
                i = 0;
            }
            if (pushUGScenarioInfo.scenario_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushUGScenarioInfo.scenario_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (pushUGScenarioInfo.local_rule != null) {
                i3 = LocalRule.ADAPTER.encodedSizeWithTag(100, pushUGScenarioInfo.local_rule);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pushUGScenarioInfo.reach_point_ids != null) {
                i4 = UpdatedReachPoints.ADAPTER.encodedSizeWithTag(101, pushUGScenarioInfo.reach_point_ids);
            }
            return i6 + i4 + pushUGScenarioInfo.unknownFields().size();
        }

        /* renamed from: a */
        public PushUGScenarioInfo decode(ProtoReader protoReader) throws IOException {
            C19791a aVar = new C19791a();
            aVar.f48251a = "";
            aVar.f48252b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48251a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48252b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 100) {
                    aVar.mo66999a(LocalRule.ADAPTER.decode(protoReader));
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo67000a(UpdatedReachPoints.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUGScenarioInfo pushUGScenarioInfo) throws IOException {
            if (pushUGScenarioInfo.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushUGScenarioInfo.app_id);
            }
            if (pushUGScenarioInfo.scenario_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushUGScenarioInfo.scenario_id);
            }
            if (pushUGScenarioInfo.local_rule != null) {
                LocalRule.ADAPTER.encodeWithTag(protoWriter, 100, pushUGScenarioInfo.local_rule);
            }
            if (pushUGScenarioInfo.reach_point_ids != null) {
                UpdatedReachPoints.ADAPTER.encodeWithTag(protoWriter, 101, pushUGScenarioInfo.reach_point_ids);
            }
            protoWriter.writeBytes(pushUGScenarioInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.PushUGScenarioInfo$a */
    public static final class C19791a extends Message.Builder<PushUGScenarioInfo, C19791a> {

        /* renamed from: a */
        public String f48251a;

        /* renamed from: b */
        public String f48252b;

        /* renamed from: c */
        public LocalRule f48253c;

        /* renamed from: d */
        public UpdatedReachPoints f48254d;

        /* renamed from: a */
        public PushUGScenarioInfo build() {
            return new PushUGScenarioInfo(this.f48251a, this.f48252b, this.f48253c, this.f48254d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19791a mo66999a(LocalRule localRule) {
            this.f48253c = localRule;
            this.f48254d = null;
            return this;
        }

        /* renamed from: a */
        public C19791a mo67000a(UpdatedReachPoints updatedReachPoints) {
            this.f48254d = updatedReachPoints;
            this.f48253c = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19791a newBuilder() {
        C19791a aVar = new C19791a();
        aVar.f48251a = this.app_id;
        aVar.f48252b = this.scenario_id;
        aVar.f48253c = this.local_rule;
        aVar.f48254d = this.reach_point_ids;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "PushUGScenarioInfo");
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.scenario_id != null) {
            sb.append(", scenario_id=");
            sb.append(this.scenario_id);
        }
        if (this.local_rule != null) {
            sb.append(", local_rule=");
            sb.append(this.local_rule);
        }
        if (this.reach_point_ids != null) {
            sb.append(", reach_point_ids=");
            sb.append(this.reach_point_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushUGScenarioInfo{");
        replace.append('}');
        return replace.toString();
    }

    public PushUGScenarioInfo(String str, String str2, LocalRule localRule, UpdatedReachPoints updatedReachPoints) {
        this(str, str2, localRule, updatedReachPoints, ByteString.EMPTY);
    }

    public PushUGScenarioInfo(String str, String str2, LocalRule localRule, UpdatedReachPoints updatedReachPoints, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(localRule, updatedReachPoints) <= 1) {
            this.app_id = str;
            this.scenario_id = str2;
            this.local_rule = localRule;
            this.reach_point_ids = updatedReachPoints;
            return;
        }
        throw new IllegalArgumentException("at most one of local_rule, reach_point_ids may be non-null");
    }
}
