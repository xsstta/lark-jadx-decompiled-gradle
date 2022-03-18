package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PushTranslateState extends Message<PushTranslateState, C17965a> {
    public static final ProtoAdapter<PushTranslateState> ADAPTER = new C17966b();
    public static final Boolean DEFAULT_IS_USER_MANUAL_TRANSLATE = false;
    private static final long serialVersionUID = 0;
    public final C14928Entity entities;
    public final Map<String, Integer> failed_messages;
    public final Boolean is_user_manual_translate;
    public final List<String> message_id;
    public final List<TranslateError> translate_errors;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTranslateState$b */
    private static final class C17966b extends ProtoAdapter<PushTranslateState> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Integer>> f45062a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        C17966b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTranslateState.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTranslateState pushTranslateState) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pushTranslateState.message_id) + C14928Entity.ADAPTER.encodedSizeWithTag(3, pushTranslateState.entities) + this.f45062a.encodedSizeWithTag(4, pushTranslateState.failed_messages) + TranslateError.ADAPTER.asRepeated().encodedSizeWithTag(5, pushTranslateState.translate_errors);
            if (pushTranslateState.is_user_manual_translate != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(6, pushTranslateState.is_user_manual_translate);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushTranslateState.unknownFields().size();
        }

        /* renamed from: a */
        public PushTranslateState decode(ProtoReader protoReader) throws IOException {
            C17965a aVar = new C17965a();
            aVar.f45061e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f45057a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f45058b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45059c.putAll(this.f45062a.decode(protoReader));
                } else if (nextTag == 5) {
                    aVar.f45060d.add(TranslateError.ADAPTER.decode(protoReader));
                } else if (nextTag != 6) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45061e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTranslateState pushTranslateState) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pushTranslateState.message_id);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, pushTranslateState.entities);
            this.f45062a.encodeWithTag(protoWriter, 4, pushTranslateState.failed_messages);
            TranslateError.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, pushTranslateState.translate_errors);
            if (pushTranslateState.is_user_manual_translate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, pushTranslateState.is_user_manual_translate);
            }
            protoWriter.writeBytes(pushTranslateState.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTranslateState$a */
    public static final class C17965a extends Message.Builder<PushTranslateState, C17965a> {

        /* renamed from: a */
        public List<String> f45057a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f45058b;

        /* renamed from: c */
        public Map<String, Integer> f45059c = Internal.newMutableMap();

        /* renamed from: d */
        public List<TranslateError> f45060d = Internal.newMutableList();

        /* renamed from: e */
        public Boolean f45061e;

        /* renamed from: a */
        public PushTranslateState build() {
            C14928Entity entity = this.f45058b;
            if (entity != null) {
                return new PushTranslateState(this.f45057a, entity, this.f45059c, this.f45060d, this.f45061e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entities");
        }
    }

    @Override // com.squareup.wire.Message
    public C17965a newBuilder() {
        C17965a aVar = new C17965a();
        aVar.f45057a = Internal.copyOf("message_id", this.message_id);
        aVar.f45058b = this.entities;
        aVar.f45059c = Internal.copyOf("failed_messages", this.failed_messages);
        aVar.f45060d = Internal.copyOf("translate_errors", this.translate_errors);
        aVar.f45061e = this.is_user_manual_translate;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushTranslateState");
        StringBuilder sb = new StringBuilder();
        if (!this.message_id.isEmpty()) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        sb.append(", entities=");
        sb.append(this.entities);
        if (!this.failed_messages.isEmpty()) {
            sb.append(", failed_messages=");
            sb.append(this.failed_messages);
        }
        if (!this.translate_errors.isEmpty()) {
            sb.append(", translate_errors=");
            sb.append(this.translate_errors);
        }
        if (this.is_user_manual_translate != null) {
            sb.append(", is_user_manual_translate=");
            sb.append(this.is_user_manual_translate);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTranslateState{");
        replace.append('}');
        return replace.toString();
    }

    public PushTranslateState(List<String> list, C14928Entity entity, Map<String, Integer> map, List<TranslateError> list2, Boolean bool) {
        this(list, entity, map, list2, bool, ByteString.EMPTY);
    }

    public PushTranslateState(List<String> list, C14928Entity entity, Map<String, Integer> map, List<TranslateError> list2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = Internal.immutableCopyOf("message_id", list);
        this.entities = entity;
        this.failed_messages = Internal.immutableCopyOf("failed_messages", map);
        this.translate_errors = Internal.immutableCopyOf("translate_errors", list2);
        this.is_user_manual_translate = bool;
    }
}
