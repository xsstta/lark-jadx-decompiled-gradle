package com.ss.android.lark.pb.authorization;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AllPermissionData extends Message<AllPermissionData, C49551a> {
    public static final ProtoAdapter<AllPermissionData> ADAPTER = new C49552b();
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long mexpire_time;
    public final List<OperatePermission> moperate_permission_data;
    public final Long mupdate_time;

    /* renamed from: com.ss.android.lark.pb.authorization.AllPermissionData$b */
    private static final class C49552b extends ProtoAdapter<AllPermissionData> {
        C49552b() {
            super(FieldEncoding.LENGTH_DELIMITED, AllPermissionData.class);
        }

        /* renamed from: a */
        public int encodedSize(AllPermissionData allPermissionData) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, allPermissionData.mupdate_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, allPermissionData.mexpire_time) + OperatePermission.ADAPTER.asRepeated().encodedSizeWithTag(3, allPermissionData.moperate_permission_data) + allPermissionData.unknownFields().size();
        }

        /* renamed from: a */
        public AllPermissionData decode(ProtoReader protoReader) throws IOException {
            C49551a aVar = new C49551a();
            aVar.f124163a = 0L;
            aVar.f124164b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124163a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124164b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124165c.add(OperatePermission.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AllPermissionData allPermissionData) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, allPermissionData.mupdate_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, allPermissionData.mexpire_time);
            OperatePermission.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, allPermissionData.moperate_permission_data);
            protoWriter.writeBytes(allPermissionData.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49551a newBuilder() {
        C49551a aVar = new C49551a();
        aVar.f124163a = this.mupdate_time;
        aVar.f124164b = this.mexpire_time;
        aVar.f124165c = Internal.copyOf("moperate_permission_data", this.moperate_permission_data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.authorization.AllPermissionData$a */
    public static final class C49551a extends Message.Builder<AllPermissionData, C49551a> {

        /* renamed from: a */
        public Long f124163a;

        /* renamed from: b */
        public Long f124164b;

        /* renamed from: c */
        public List<OperatePermission> f124165c = Internal.newMutableList();

        /* renamed from: a */
        public AllPermissionData build() {
            Long l;
            Long l2 = this.f124163a;
            if (l2 != null && (l = this.f124164b) != null) {
                return new AllPermissionData(l2, l, this.f124165c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "mupdate_time", this.f124164b, "mexpire_time");
        }

        /* renamed from: a */
        public C49551a mo172805a(Long l) {
            this.f124163a = l;
            return this;
        }

        /* renamed from: b */
        public C49551a mo172808b(Long l) {
            this.f124164b = l;
            return this;
        }

        /* renamed from: a */
        public C49551a mo172806a(List<OperatePermission> list) {
            Internal.checkElementsNotNull(list);
            this.f124165c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", update_time=");
        sb.append(this.mupdate_time);
        sb.append(", expire_time=");
        sb.append(this.mexpire_time);
        if (!this.moperate_permission_data.isEmpty()) {
            sb.append(", operate_permission_data=");
            sb.append(this.moperate_permission_data);
        }
        StringBuilder replace = sb.replace(0, 2, "AllPermissionData{");
        replace.append('}');
        return replace.toString();
    }

    public AllPermissionData(Long l, Long l2, List<OperatePermission> list) {
        this(l, l2, list, ByteString.EMPTY);
    }

    public AllPermissionData(Long l, Long l2, List<OperatePermission> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mupdate_time = l;
        this.mexpire_time = l2;
        this.moperate_permission_data = Internal.immutableCopyOf("moperate_permission_data", list);
    }
}
