package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class RuleExpression extends Message<RuleExpression, C19801a> {
    public static final ProtoAdapter<RuleExpression> ADAPTER = new C19802b();
    public static final ConditionOperator DEFAULT_COND_OPERATOR = ConditionOperator.UNKNOWN_CONDITION;
    public static final ExpressionOperator DEFAULT_EXP_OPERATOR = ExpressionOperator.UNKNOWN_EXPRESSION;
    private static final long serialVersionUID = 0;
    public final ConditionOperator cond_operator;
    public final ExpressionOperator exp_operator;
    public final RuleExpression left;
    public final RuleExpression right;
    public final String rule_action;
    public final String value;

    public enum ConditionOperator implements WireEnum {
        UNKNOWN_CONDITION(0),
        AND(1),
        OR(2),
        NOT(3);
        
        public static final ProtoAdapter<ConditionOperator> ADAPTER = ProtoAdapter.newEnumAdapter(ConditionOperator.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ConditionOperator fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_CONDITION;
            }
            if (i == 1) {
                return AND;
            }
            if (i == 2) {
                return OR;
            }
            if (i != 3) {
                return null;
            }
            return NOT;
        }

        private ConditionOperator(int i) {
            this.value = i;
        }
    }

    public enum ExpressionOperator implements WireEnum {
        UNKNOWN_EXPRESSION(0),
        IN(1),
        EQUAL(2),
        NOT_EQUAL(3),
        LESS_OR_EQUAL(4),
        LESS_THAN(5),
        GREATER_OR_EQUAL(6),
        GREATER_THAN(7);
        
        public static final ProtoAdapter<ExpressionOperator> ADAPTER = ProtoAdapter.newEnumAdapter(ExpressionOperator.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ExpressionOperator fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_EXPRESSION;
                case 1:
                    return IN;
                case 2:
                    return EQUAL;
                case 3:
                    return NOT_EQUAL;
                case 4:
                    return LESS_OR_EQUAL;
                case 5:
                    return LESS_THAN;
                case 6:
                    return GREATER_OR_EQUAL;
                case 7:
                    return GREATER_THAN;
                default:
                    return null;
            }
        }

        private ExpressionOperator(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.RuleExpression$b */
    private static final class C19802b extends ProtoAdapter<RuleExpression> {
        C19802b() {
            super(FieldEncoding.LENGTH_DELIMITED, RuleExpression.class);
        }

        /* renamed from: a */
        public int encodedSize(RuleExpression ruleExpression) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (ruleExpression.left != null) {
                i = RuleExpression.ADAPTER.encodedSizeWithTag(1, ruleExpression.left);
            } else {
                i = 0;
            }
            if (ruleExpression.right != null) {
                i2 = RuleExpression.ADAPTER.encodedSizeWithTag(2, ruleExpression.right);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (ruleExpression.rule_action != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, ruleExpression.rule_action);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (ruleExpression.value != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, ruleExpression.value);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (ruleExpression.exp_operator != null) {
                i5 = ExpressionOperator.ADAPTER.encodedSizeWithTag(5, ruleExpression.exp_operator);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (ruleExpression.cond_operator != null) {
                i6 = ConditionOperator.ADAPTER.encodedSizeWithTag(6, ruleExpression.cond_operator);
            }
            return i10 + i6 + ruleExpression.unknownFields().size();
        }

        /* renamed from: a */
        public RuleExpression decode(ProtoReader protoReader) throws IOException {
            C19801a aVar = new C19801a();
            aVar.f48275c = "";
            aVar.f48276d = "";
            aVar.f48277e = ExpressionOperator.UNKNOWN_EXPRESSION;
            aVar.f48278f = ConditionOperator.UNKNOWN_CONDITION;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48273a = RuleExpression.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f48274b = RuleExpression.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f48275c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f48276d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f48277e = ExpressionOperator.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f48278f = ConditionOperator.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, RuleExpression ruleExpression) throws IOException {
            if (ruleExpression.left != null) {
                RuleExpression.ADAPTER.encodeWithTag(protoWriter, 1, ruleExpression.left);
            }
            if (ruleExpression.right != null) {
                RuleExpression.ADAPTER.encodeWithTag(protoWriter, 2, ruleExpression.right);
            }
            if (ruleExpression.rule_action != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ruleExpression.rule_action);
            }
            if (ruleExpression.value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ruleExpression.value);
            }
            if (ruleExpression.exp_operator != null) {
                ExpressionOperator.ADAPTER.encodeWithTag(protoWriter, 5, ruleExpression.exp_operator);
            }
            if (ruleExpression.cond_operator != null) {
                ConditionOperator.ADAPTER.encodeWithTag(protoWriter, 6, ruleExpression.cond_operator);
            }
            protoWriter.writeBytes(ruleExpression.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.RuleExpression$a */
    public static final class C19801a extends Message.Builder<RuleExpression, C19801a> {

        /* renamed from: a */
        public RuleExpression f48273a;

        /* renamed from: b */
        public RuleExpression f48274b;

        /* renamed from: c */
        public String f48275c;

        /* renamed from: d */
        public String f48276d;

        /* renamed from: e */
        public ExpressionOperator f48277e;

        /* renamed from: f */
        public ConditionOperator f48278f;

        /* renamed from: a */
        public RuleExpression build() {
            return new RuleExpression(this.f48273a, this.f48274b, this.f48275c, this.f48276d, this.f48277e, this.f48278f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19801a newBuilder() {
        C19801a aVar = new C19801a();
        aVar.f48273a = this.left;
        aVar.f48274b = this.right;
        aVar.f48275c = this.rule_action;
        aVar.f48276d = this.value;
        aVar.f48277e = this.exp_operator;
        aVar.f48278f = this.cond_operator;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "RuleExpression");
        StringBuilder sb = new StringBuilder();
        if (this.left != null) {
            sb.append(", left=");
            sb.append(this.left);
        }
        if (this.right != null) {
            sb.append(", right=");
            sb.append(this.right);
        }
        if (this.rule_action != null) {
            sb.append(", rule_action=");
            sb.append(this.rule_action);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.exp_operator != null) {
            sb.append(", exp_operator=");
            sb.append(this.exp_operator);
        }
        if (this.cond_operator != null) {
            sb.append(", cond_operator=");
            sb.append(this.cond_operator);
        }
        StringBuilder replace = sb.replace(0, 2, "RuleExpression{");
        replace.append('}');
        return replace.toString();
    }

    public RuleExpression(RuleExpression ruleExpression, RuleExpression ruleExpression2, String str, String str2, ExpressionOperator expressionOperator, ConditionOperator conditionOperator) {
        this(ruleExpression, ruleExpression2, str, str2, expressionOperator, conditionOperator, ByteString.EMPTY);
    }

    public RuleExpression(RuleExpression ruleExpression, RuleExpression ruleExpression2, String str, String str2, ExpressionOperator expressionOperator, ConditionOperator conditionOperator, ByteString byteString) {
        super(ADAPTER, byteString);
        this.left = ruleExpression;
        this.right = ruleExpression2;
        this.rule_action = str;
        this.value = str2;
        this.exp_operator = expressionOperator;
        this.cond_operator = conditionOperator;
    }
}
