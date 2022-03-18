package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PatchItemRequest extends Message<PatchItemRequest, C17825a> {
    public static final ProtoAdapter<PatchItemRequest> ADAPTER = new C17826b();
    public static final Boolean DEFAULT_IS_HIDDEN = false;
    public static final Long DEFAULT_ITEM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean is_hidden;
    public final Long item_id;
    public final List<UpdateField> update_fields;

    public enum UpdateField implements WireEnum {
        UPDATE_FIELD_UNKNOWN(0),
        UPDATE_FIELD_IS_HIDDEN(1);
        
        public static final ProtoAdapter<UpdateField> ADAPTER = ProtoAdapter.newEnumAdapter(UpdateField.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UpdateField fromValue(int i) {
            if (i == 0) {
                return UPDATE_FIELD_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return UPDATE_FIELD_IS_HIDDEN;
        }

        private UpdateField(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchItemRequest$b */
    private static final class C17826b extends ProtoAdapter<PatchItemRequest> {
        C17826b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchItemRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchItemRequest patchItemRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, patchItemRequest.item_id) + UpdateField.ADAPTER.asRepeated().encodedSizeWithTag(2, patchItemRequest.update_fields);
            if (patchItemRequest.is_hidden != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(10, patchItemRequest.is_hidden);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + patchItemRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchItemRequest decode(ProtoReader protoReader) throws IOException {
            C17825a aVar = new C17825a();
            aVar.f44884a = 0L;
            aVar.f44886c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44884a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f44885b.add(UpdateField.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 10) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44886c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchItemRequest patchItemRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, patchItemRequest.item_id);
            UpdateField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, patchItemRequest.update_fields);
            if (patchItemRequest.is_hidden != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, patchItemRequest.is_hidden);
            }
            protoWriter.writeBytes(patchItemRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17825a newBuilder() {
        C17825a aVar = new C17825a();
        aVar.f44884a = this.item_id;
        aVar.f44885b = Internal.copyOf("update_fields", this.update_fields);
        aVar.f44886c = this.is_hidden;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchItemRequest$a */
    public static final class C17825a extends Message.Builder<PatchItemRequest, C17825a> {

        /* renamed from: a */
        public Long f44884a;

        /* renamed from: b */
        public List<UpdateField> f44885b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f44886c;

        /* renamed from: a */
        public PatchItemRequest build() {
            Long l = this.f44884a;
            if (l != null) {
                return new PatchItemRequest(l, this.f44885b, this.f44886c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "item_id");
        }

        /* renamed from: a */
        public C17825a mo62136a(Boolean bool) {
            this.f44886c = bool;
            return this;
        }

        /* renamed from: a */
        public C17825a mo62137a(Long l) {
            this.f44884a = l;
            return this;
        }

        /* renamed from: a */
        public C17825a mo62138a(List<UpdateField> list) {
            Internal.checkElementsNotNull(list);
            this.f44885b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchItemRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", item_id=");
        sb.append(this.item_id);
        if (!this.update_fields.isEmpty()) {
            sb.append(", update_fields=");
            sb.append(this.update_fields);
        }
        if (this.is_hidden != null) {
            sb.append(", is_hidden=");
            sb.append(this.is_hidden);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchItemRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchItemRequest(Long l, List<UpdateField> list, Boolean bool) {
        this(l, list, bool, ByteString.EMPTY);
    }

    public PatchItemRequest(Long l, List<UpdateField> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item_id = l;
        this.update_fields = Internal.immutableCopyOf("update_fields", list);
        this.is_hidden = bool;
    }
}
