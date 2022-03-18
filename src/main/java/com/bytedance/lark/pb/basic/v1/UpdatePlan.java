package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdatePlan extends Message<UpdatePlan, C15420a> {
    public static final ProtoAdapter<UpdatePlan> ADAPTER = new C15421b();
    public static final Integer DEFAULT_NOTICE_PLAN = 0;
    public static final Integer DEFAULT_POPUP_PLAN = 0;
    public static final Integer DEFAULT_SKIP_PLAN = 0;
    public static final Integer DEFAULT_SNOOZE_PLAN = 0;
    private static final long serialVersionUID = 0;
    public final Integer notice_plan;
    public final Integer popup_plan;
    public final Integer skip_plan;
    public final Integer snooze_plan;

    /* renamed from: com.bytedance.lark.pb.basic.v1.UpdatePlan$b */
    private static final class C15421b extends ProtoAdapter<UpdatePlan> {
        C15421b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdatePlan.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdatePlan updatePlan) {
            return ProtoAdapter.INT32.encodedSizeWithTag(5, updatePlan.notice_plan) + ProtoAdapter.INT32.encodedSizeWithTag(6, updatePlan.popup_plan) + ProtoAdapter.INT32.encodedSizeWithTag(7, updatePlan.snooze_plan) + ProtoAdapter.INT32.encodedSizeWithTag(8, updatePlan.skip_plan) + updatePlan.unknownFields().size();
        }

        /* renamed from: a */
        public UpdatePlan decode(ProtoReader protoReader) throws IOException {
            C15420a aVar = new C15420a();
            aVar.f40803a = 0;
            aVar.f40804b = 0;
            aVar.f40805c = 0;
            aVar.f40806d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 5) {
                    aVar.f40803a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 6) {
                    aVar.f40804b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 7) {
                    aVar.f40805c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 8) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40806d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdatePlan updatePlan) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, updatePlan.notice_plan);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, updatePlan.popup_plan);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, updatePlan.snooze_plan);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, updatePlan.skip_plan);
            protoWriter.writeBytes(updatePlan.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15420a newBuilder() {
        C15420a aVar = new C15420a();
        aVar.f40803a = this.notice_plan;
        aVar.f40804b = this.popup_plan;
        aVar.f40805c = this.snooze_plan;
        aVar.f40806d = this.skip_plan;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.UpdatePlan$a */
    public static final class C15420a extends Message.Builder<UpdatePlan, C15420a> {

        /* renamed from: a */
        public Integer f40803a;

        /* renamed from: b */
        public Integer f40804b;

        /* renamed from: c */
        public Integer f40805c;

        /* renamed from: d */
        public Integer f40806d;

        /* renamed from: a */
        public UpdatePlan build() {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4 = this.f40803a;
            if (num4 != null && (num = this.f40804b) != null && (num2 = this.f40805c) != null && (num3 = this.f40806d) != null) {
                return new UpdatePlan(num4, num, num2, num3, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num4, "notice_plan", this.f40804b, "popup_plan", this.f40805c, "snooze_plan", this.f40806d, "skip_plan");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "UpdatePlan");
        StringBuilder sb = new StringBuilder();
        sb.append(", notice_plan=");
        sb.append(this.notice_plan);
        sb.append(", popup_plan=");
        sb.append(this.popup_plan);
        sb.append(", snooze_plan=");
        sb.append(this.snooze_plan);
        sb.append(", skip_plan=");
        sb.append(this.skip_plan);
        StringBuilder replace = sb.replace(0, 2, "UpdatePlan{");
        replace.append('}');
        return replace.toString();
    }

    public UpdatePlan(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public UpdatePlan(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notice_plan = num;
        this.popup_plan = num2;
        this.snooze_plan = num3;
        this.skip_plan = num4;
    }
}
