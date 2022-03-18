package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class LocalRule extends Message<LocalRule, C19787a> {
    public static final ProtoAdapter<LocalRule> ADAPTER = new C19788b();
    public static final Long DEFAULT_RULE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final RuleExpression root_exp_node;
    public final Long rule_id;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.LocalRule$b */
    private static final class C19788b extends ProtoAdapter<LocalRule> {
        C19788b() {
            super(FieldEncoding.LENGTH_DELIMITED, LocalRule.class);
        }

        /* renamed from: a */
        public int encodedSize(LocalRule localRule) {
            int i;
            int i2 = 0;
            if (localRule.rule_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, localRule.rule_id);
            } else {
                i = 0;
            }
            if (localRule.root_exp_node != null) {
                i2 = RuleExpression.ADAPTER.encodedSizeWithTag(2, localRule.root_exp_node);
            }
            return i + i2 + localRule.unknownFields().size();
        }

        /* renamed from: a */
        public LocalRule decode(ProtoReader protoReader) throws IOException {
            C19787a aVar = new C19787a();
            aVar.f48248a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48248a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48249b = RuleExpression.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LocalRule localRule) throws IOException {
            if (localRule.rule_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, localRule.rule_id);
            }
            if (localRule.root_exp_node != null) {
                RuleExpression.ADAPTER.encodeWithTag(protoWriter, 2, localRule.root_exp_node);
            }
            protoWriter.writeBytes(localRule.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.LocalRule$a */
    public static final class C19787a extends Message.Builder<LocalRule, C19787a> {

        /* renamed from: a */
        public Long f48248a;

        /* renamed from: b */
        public RuleExpression f48249b;

        /* renamed from: a */
        public LocalRule build() {
            return new LocalRule(this.f48248a, this.f48249b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19787a newBuilder() {
        C19787a aVar = new C19787a();
        aVar.f48248a = this.rule_id;
        aVar.f48249b = this.root_exp_node;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "LocalRule");
        StringBuilder sb = new StringBuilder();
        if (this.rule_id != null) {
            sb.append(", rule_id=");
            sb.append(this.rule_id);
        }
        if (this.root_exp_node != null) {
            sb.append(", root_exp_node=");
            sb.append(this.root_exp_node);
        }
        StringBuilder replace = sb.replace(0, 2, "LocalRule{");
        replace.append('}');
        return replace.toString();
    }

    public LocalRule(Long l, RuleExpression ruleExpression) {
        this(l, ruleExpression, ByteString.EMPTY);
    }

    public LocalRule(Long l, RuleExpression ruleExpression, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rule_id = l;
        this.root_exp_node = ruleExpression;
    }
}
