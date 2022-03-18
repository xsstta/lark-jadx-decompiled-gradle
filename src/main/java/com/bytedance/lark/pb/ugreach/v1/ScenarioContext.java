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

public final class ScenarioContext extends Message<ScenarioContext, C19803a> {
    public static final ProtoAdapter<ScenarioContext> ADAPTER = new C19804b();
    public static final Integer DEFAULT_PRIORITY = 0;
    private static final long serialVersionUID = 0;
    public final List<ReachPointEntity> entities;
    public final LocalRule local_rule;
    public final Integer priority;
    public final String scenario_id;
    public final List<String> share_scenario_ids;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ScenarioContext$b */
    private static final class C19804b extends ProtoAdapter<ScenarioContext> {
        C19804b() {
            super(FieldEncoding.LENGTH_DELIMITED, ScenarioContext.class);
        }

        /* renamed from: a */
        public int encodedSize(ScenarioContext scenarioContext) {
            int i;
            int i2;
            int i3 = 0;
            if (scenarioContext.scenario_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, scenarioContext.scenario_id);
            } else {
                i = 0;
            }
            if (scenarioContext.local_rule != null) {
                i2 = LocalRule.ADAPTER.encodedSizeWithTag(2, scenarioContext.local_rule);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (scenarioContext.priority != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, scenarioContext.priority);
            }
            return i4 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, scenarioContext.share_scenario_ids) + ReachPointEntity.ADAPTER.asRepeated().encodedSizeWithTag(5, scenarioContext.entities) + scenarioContext.unknownFields().size();
        }

        /* renamed from: a */
        public ScenarioContext decode(ProtoReader protoReader) throws IOException {
            C19803a aVar = new C19803a();
            aVar.f48279a = "";
            aVar.f48281c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48279a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48280b = LocalRule.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48281c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f48282d.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48283e.add(ReachPointEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ScenarioContext scenarioContext) throws IOException {
            if (scenarioContext.scenario_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, scenarioContext.scenario_id);
            }
            if (scenarioContext.local_rule != null) {
                LocalRule.ADAPTER.encodeWithTag(protoWriter, 2, scenarioContext.local_rule);
            }
            if (scenarioContext.priority != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, scenarioContext.priority);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, scenarioContext.share_scenario_ids);
            ReachPointEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, scenarioContext.entities);
            protoWriter.writeBytes(scenarioContext.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ScenarioContext$a */
    public static final class C19803a extends Message.Builder<ScenarioContext, C19803a> {

        /* renamed from: a */
        public String f48279a;

        /* renamed from: b */
        public LocalRule f48280b;

        /* renamed from: c */
        public Integer f48281c;

        /* renamed from: d */
        public List<String> f48282d = Internal.newMutableList();

        /* renamed from: e */
        public List<ReachPointEntity> f48283e = Internal.newMutableList();

        /* renamed from: a */
        public ScenarioContext build() {
            return new ScenarioContext(this.f48279a, this.f48280b, this.f48281c, this.f48282d, this.f48283e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19803a mo67025a(LocalRule localRule) {
            this.f48280b = localRule;
            return this;
        }

        /* renamed from: a */
        public C19803a mo67026a(Integer num) {
            this.f48281c = num;
            return this;
        }

        /* renamed from: b */
        public C19803a mo67030b(List<ReachPointEntity> list) {
            Internal.checkElementsNotNull(list);
            this.f48283e = list;
            return this;
        }

        /* renamed from: a */
        public C19803a mo67027a(String str) {
            this.f48279a = str;
            return this;
        }

        /* renamed from: a */
        public C19803a mo67028a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f48282d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19803a newBuilder() {
        C19803a aVar = new C19803a();
        aVar.f48279a = this.scenario_id;
        aVar.f48280b = this.local_rule;
        aVar.f48281c = this.priority;
        aVar.f48282d = Internal.copyOf("share_scenario_ids", this.share_scenario_ids);
        aVar.f48283e = Internal.copyOf("entities", this.entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "ScenarioContext");
        StringBuilder sb = new StringBuilder();
        if (this.scenario_id != null) {
            sb.append(", scenario_id=");
            sb.append(this.scenario_id);
        }
        if (this.local_rule != null) {
            sb.append(", local_rule=");
            sb.append(this.local_rule);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (!this.share_scenario_ids.isEmpty()) {
            sb.append(", share_scenario_ids=");
            sb.append(this.share_scenario_ids);
        }
        if (!this.entities.isEmpty()) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "ScenarioContext{");
        replace.append('}');
        return replace.toString();
    }

    public ScenarioContext(String str, LocalRule localRule, Integer num, List<String> list, List<ReachPointEntity> list2) {
        this(str, localRule, num, list, list2, ByteString.EMPTY);
    }

    public ScenarioContext(String str, LocalRule localRule, Integer num, List<String> list, List<ReachPointEntity> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scenario_id = str;
        this.local_rule = localRule;
        this.priority = num;
        this.share_scenario_ids = Internal.immutableCopyOf("share_scenario_ids", list);
        this.entities = Internal.immutableCopyOf("entities", list2);
    }
}
