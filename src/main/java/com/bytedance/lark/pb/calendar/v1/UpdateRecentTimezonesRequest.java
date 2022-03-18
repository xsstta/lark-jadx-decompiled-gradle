package com.bytedance.lark.pb.calendar.v1;

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

public final class UpdateRecentTimezonesRequest extends Message<UpdateRecentTimezonesRequest, C16096a> {
    public static final ProtoAdapter<UpdateRecentTimezonesRequest> ADAPTER = new C16097b();
    private static final long serialVersionUID = 0;
    public final List<String> added_timezone_ids;
    public final List<String> deleted_timezone_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateRecentTimezonesRequest$b */
    private static final class C16097b extends ProtoAdapter<UpdateRecentTimezonesRequest> {
        C16097b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateRecentTimezonesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateRecentTimezonesRequest updateRecentTimezonesRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, updateRecentTimezonesRequest.added_timezone_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, updateRecentTimezonesRequest.deleted_timezone_ids) + updateRecentTimezonesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateRecentTimezonesRequest decode(ProtoReader protoReader) throws IOException {
            C16096a aVar = new C16096a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42180a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42181b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateRecentTimezonesRequest updateRecentTimezonesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, updateRecentTimezonesRequest.added_timezone_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, updateRecentTimezonesRequest.deleted_timezone_ids);
            protoWriter.writeBytes(updateRecentTimezonesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateRecentTimezonesRequest$a */
    public static final class C16096a extends Message.Builder<UpdateRecentTimezonesRequest, C16096a> {

        /* renamed from: a */
        public List<String> f42180a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f42181b = Internal.newMutableList();

        /* renamed from: a */
        public UpdateRecentTimezonesRequest build() {
            return new UpdateRecentTimezonesRequest(this.f42180a, this.f42181b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16096a mo57834a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42180a = list;
            return this;
        }

        /* renamed from: b */
        public C16096a mo57836b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42181b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16096a newBuilder() {
        C16096a aVar = new C16096a();
        aVar.f42180a = Internal.copyOf("added_timezone_ids", this.added_timezone_ids);
        aVar.f42181b = Internal.copyOf("deleted_timezone_ids", this.deleted_timezone_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UpdateRecentTimezonesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.added_timezone_ids.isEmpty()) {
            sb.append(", added_timezone_ids=");
            sb.append(this.added_timezone_ids);
        }
        if (!this.deleted_timezone_ids.isEmpty()) {
            sb.append(", deleted_timezone_ids=");
            sb.append(this.deleted_timezone_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateRecentTimezonesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateRecentTimezonesRequest(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public UpdateRecentTimezonesRequest(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.added_timezone_ids = Internal.immutableCopyOf("added_timezone_ids", list);
        this.deleted_timezone_ids = Internal.immutableCopyOf("deleted_timezone_ids", list2);
    }
}
