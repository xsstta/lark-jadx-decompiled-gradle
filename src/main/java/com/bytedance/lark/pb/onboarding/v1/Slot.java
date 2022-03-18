package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Slot extends Message<Slot, C18618a> {
    public static final ProtoAdapter<Slot> ADAPTER = new C18619b();
    public static final Boolean DEFAULT_SHOULD_REPORT_BEHAVIOR = false;
    private static final long serialVersionUID = 0;
    public final String element_id;
    public final String linked_step_url;
    public final Boolean should_report_behavior;
    public final String slot_id;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Slot$b */
    private static final class C18619b extends ProtoAdapter<Slot> {
        C18619b() {
            super(FieldEncoding.LENGTH_DELIMITED, Slot.class);
        }

        /* renamed from: a */
        public int encodedSize(Slot slot) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, slot.slot_id);
            int i3 = 0;
            if (slot.element_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, slot.element_id);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (slot.linked_step_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, slot.linked_step_url);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (slot.should_report_behavior != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, slot.should_report_behavior);
            }
            return i5 + i3 + slot.unknownFields().size();
        }

        /* renamed from: a */
        public Slot decode(ProtoReader protoReader) throws IOException {
            C18618a aVar = new C18618a();
            aVar.f46123a = "";
            aVar.f46124b = "";
            aVar.f46125c = "";
            aVar.f46126d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46123a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46124b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46125c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46126d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Slot slot) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, slot.slot_id);
            if (slot.element_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, slot.element_id);
            }
            if (slot.linked_step_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, slot.linked_step_url);
            }
            if (slot.should_report_behavior != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, slot.should_report_behavior);
            }
            protoWriter.writeBytes(slot.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18618a newBuilder() {
        C18618a aVar = new C18618a();
        aVar.f46123a = this.slot_id;
        aVar.f46124b = this.element_id;
        aVar.f46125c = this.linked_step_url;
        aVar.f46126d = this.should_report_behavior;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Slot$a */
    public static final class C18618a extends Message.Builder<Slot, C18618a> {

        /* renamed from: a */
        public String f46123a;

        /* renamed from: b */
        public String f46124b;

        /* renamed from: c */
        public String f46125c;

        /* renamed from: d */
        public Boolean f46126d;

        /* renamed from: a */
        public Slot build() {
            String str = this.f46123a;
            if (str != null) {
                return new Slot(str, this.f46124b, this.f46125c, this.f46126d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "slot_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "Slot");
        StringBuilder sb = new StringBuilder();
        sb.append(", slot_id=");
        sb.append(this.slot_id);
        if (this.element_id != null) {
            sb.append(", element_id=");
            sb.append(this.element_id);
        }
        if (this.linked_step_url != null) {
            sb.append(", linked_step_url=");
            sb.append(this.linked_step_url);
        }
        if (this.should_report_behavior != null) {
            sb.append(", should_report_behavior=");
            sb.append(this.should_report_behavior);
        }
        StringBuilder replace = sb.replace(0, 2, "Slot{");
        replace.append('}');
        return replace.toString();
    }

    public Slot(String str, String str2, String str3, Boolean bool) {
        this(str, str2, str3, bool, ByteString.EMPTY);
    }

    public Slot(String str, String str2, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.slot_id = str;
        this.element_id = str2;
        this.linked_step_url = str3;
        this.should_report_behavior = bool;
    }
}
