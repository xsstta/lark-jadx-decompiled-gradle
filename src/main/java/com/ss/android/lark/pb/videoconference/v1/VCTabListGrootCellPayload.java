package com.ss.android.lark.pb.videoconference.v1;

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

public final class VCTabListGrootCellPayload extends Message<VCTabListGrootCellPayload, C51190a> {
    public static final ProtoAdapter<VCTabListGrootCellPayload> ADAPTER = new C51191b();
    private static final long serialVersionUID = 0;
    public final List<String> cal_deleted_history_ids;
    public final List<VCTabListItem> cal_insert_top_items;
    public final List<VCTabListItem> cal_update_items;
    public final List<String> deleted_history_ids;
    public final List<String> enterprise_deleted_history_ids;
    public final List<VCTabListItem> enterprise_insert_top_items;
    public final List<VCTabListItem> enterprise_update_items;
    public final List<VCTabListItem> insert_top_items;
    public final List<VCTabListItem> update_items;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabListGrootCellPayload$b */
    private static final class C51191b extends ProtoAdapter<VCTabListGrootCellPayload> {
        C51191b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabListGrootCellPayload.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabListGrootCellPayload vCTabListGrootCellPayload) {
            return VCTabListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, vCTabListGrootCellPayload.insert_top_items) + VCTabListItem.ADAPTER.asRepeated().encodedSizeWithTag(2, vCTabListGrootCellPayload.update_items) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, vCTabListGrootCellPayload.deleted_history_ids) + VCTabListItem.ADAPTER.asRepeated().encodedSizeWithTag(4, vCTabListGrootCellPayload.cal_insert_top_items) + VCTabListItem.ADAPTER.asRepeated().encodedSizeWithTag(5, vCTabListGrootCellPayload.cal_update_items) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, vCTabListGrootCellPayload.cal_deleted_history_ids) + VCTabListItem.ADAPTER.asRepeated().encodedSizeWithTag(7, vCTabListGrootCellPayload.enterprise_insert_top_items) + VCTabListItem.ADAPTER.asRepeated().encodedSizeWithTag(8, vCTabListGrootCellPayload.enterprise_update_items) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, vCTabListGrootCellPayload.enterprise_deleted_history_ids) + vCTabListGrootCellPayload.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabListGrootCellPayload decode(ProtoReader protoReader) throws IOException {
            C51190a aVar = new C51190a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127413a.add(VCTabListItem.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f127414b.add(VCTabListItem.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f127415c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f127416d.add(VCTabListItem.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f127417e.add(VCTabListItem.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f127418f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f127419g.add(VCTabListItem.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.f127420h.add(VCTabListItem.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f127421i.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, VCTabListGrootCellPayload vCTabListGrootCellPayload) throws IOException {
            VCTabListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, vCTabListGrootCellPayload.insert_top_items);
            VCTabListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, vCTabListGrootCellPayload.update_items);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, vCTabListGrootCellPayload.deleted_history_ids);
            VCTabListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, vCTabListGrootCellPayload.cal_insert_top_items);
            VCTabListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, vCTabListGrootCellPayload.cal_update_items);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, vCTabListGrootCellPayload.cal_deleted_history_ids);
            VCTabListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, vCTabListGrootCellPayload.enterprise_insert_top_items);
            VCTabListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, vCTabListGrootCellPayload.enterprise_update_items);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, vCTabListGrootCellPayload.enterprise_deleted_history_ids);
            protoWriter.writeBytes(vCTabListGrootCellPayload.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabListGrootCellPayload$a */
    public static final class C51190a extends Message.Builder<VCTabListGrootCellPayload, C51190a> {

        /* renamed from: a */
        public List<VCTabListItem> f127413a = Internal.newMutableList();

        /* renamed from: b */
        public List<VCTabListItem> f127414b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f127415c = Internal.newMutableList();

        /* renamed from: d */
        public List<VCTabListItem> f127416d = Internal.newMutableList();

        /* renamed from: e */
        public List<VCTabListItem> f127417e = Internal.newMutableList();

        /* renamed from: f */
        public List<String> f127418f = Internal.newMutableList();

        /* renamed from: g */
        public List<VCTabListItem> f127419g = Internal.newMutableList();

        /* renamed from: h */
        public List<VCTabListItem> f127420h = Internal.newMutableList();

        /* renamed from: i */
        public List<String> f127421i = Internal.newMutableList();

        /* renamed from: a */
        public VCTabListGrootCellPayload build() {
            return new VCTabListGrootCellPayload(this.f127413a, this.f127414b, this.f127415c, this.f127416d, this.f127417e, this.f127418f, this.f127419g, this.f127420h, this.f127421i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51190a newBuilder() {
        C51190a aVar = new C51190a();
        aVar.f127413a = Internal.copyOf("insert_top_items", this.insert_top_items);
        aVar.f127414b = Internal.copyOf("update_items", this.update_items);
        aVar.f127415c = Internal.copyOf("deleted_history_ids", this.deleted_history_ids);
        aVar.f127416d = Internal.copyOf("cal_insert_top_items", this.cal_insert_top_items);
        aVar.f127417e = Internal.copyOf("cal_update_items", this.cal_update_items);
        aVar.f127418f = Internal.copyOf("cal_deleted_history_ids", this.cal_deleted_history_ids);
        aVar.f127419g = Internal.copyOf("enterprise_insert_top_items", this.enterprise_insert_top_items);
        aVar.f127420h = Internal.copyOf("enterprise_update_items", this.enterprise_update_items);
        aVar.f127421i = Internal.copyOf("enterprise_deleted_history_ids", this.enterprise_deleted_history_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabListGrootCellPayload");
        StringBuilder sb = new StringBuilder();
        if (!this.insert_top_items.isEmpty()) {
            sb.append(", insert_top_items=");
            sb.append(this.insert_top_items);
        }
        if (!this.update_items.isEmpty()) {
            sb.append(", update_items=");
            sb.append(this.update_items);
        }
        if (!this.deleted_history_ids.isEmpty()) {
            sb.append(", deleted_history_ids=");
            sb.append(this.deleted_history_ids);
        }
        if (!this.cal_insert_top_items.isEmpty()) {
            sb.append(", cal_insert_top_items=");
            sb.append(this.cal_insert_top_items);
        }
        if (!this.cal_update_items.isEmpty()) {
            sb.append(", cal_update_items=");
            sb.append(this.cal_update_items);
        }
        if (!this.cal_deleted_history_ids.isEmpty()) {
            sb.append(", cal_deleted_history_ids=");
            sb.append(this.cal_deleted_history_ids);
        }
        if (!this.enterprise_insert_top_items.isEmpty()) {
            sb.append(", enterprise_insert_top_items=");
            sb.append(this.enterprise_insert_top_items);
        }
        if (!this.enterprise_update_items.isEmpty()) {
            sb.append(", enterprise_update_items=");
            sb.append(this.enterprise_update_items);
        }
        if (!this.enterprise_deleted_history_ids.isEmpty()) {
            sb.append(", enterprise_deleted_history_ids=");
            sb.append(this.enterprise_deleted_history_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabListGrootCellPayload{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabListGrootCellPayload(List<VCTabListItem> list, List<VCTabListItem> list2, List<String> list3, List<VCTabListItem> list4, List<VCTabListItem> list5, List<String> list6, List<VCTabListItem> list7, List<VCTabListItem> list8, List<String> list9) {
        this(list, list2, list3, list4, list5, list6, list7, list8, list9, ByteString.EMPTY);
    }

    public VCTabListGrootCellPayload(List<VCTabListItem> list, List<VCTabListItem> list2, List<String> list3, List<VCTabListItem> list4, List<VCTabListItem> list5, List<String> list6, List<VCTabListItem> list7, List<VCTabListItem> list8, List<String> list9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.insert_top_items = Internal.immutableCopyOf("insert_top_items", list);
        this.update_items = Internal.immutableCopyOf("update_items", list2);
        this.deleted_history_ids = Internal.immutableCopyOf("deleted_history_ids", list3);
        this.cal_insert_top_items = Internal.immutableCopyOf("cal_insert_top_items", list4);
        this.cal_update_items = Internal.immutableCopyOf("cal_update_items", list5);
        this.cal_deleted_history_ids = Internal.immutableCopyOf("cal_deleted_history_ids", list6);
        this.enterprise_insert_top_items = Internal.immutableCopyOf("enterprise_insert_top_items", list7);
        this.enterprise_update_items = Internal.immutableCopyOf("enterprise_update_items", list8);
        this.enterprise_deleted_history_ids = Internal.immutableCopyOf("enterprise_deleted_history_ids", list9);
    }
}
