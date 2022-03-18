package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushSaveToNutStoreStateResponse extends Message<PushSaveToNutStoreStateResponse, C18282a> {
    public static final ProtoAdapter<PushSaveToNutStoreStateResponse> ADAPTER = new C18283b();
    public static final Message.SourceType DEFAULT_SOURCE_TYPE = Message.SourceType.TYPE_FROM_UNKONWN;
    public static final SaveState DEFAULT_STATE = SaveState.SUCCESS;
    public static final Integer DEFAULT_STATE_CODE = 0;
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final String message_id;
    public final String source_id;
    public final Message.SourceType source_type;
    public final SaveState state;
    public final Integer state_code;

    public enum SaveState implements WireEnum {
        SUCCESS(0),
        IN_PROGRESS(1),
        FAILED(2),
        INIT(100);
        
        public static final ProtoAdapter<SaveState> ADAPTER = ProtoAdapter.newEnumAdapter(SaveState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SaveState fromValue(int i) {
            if (i == 0) {
                return SUCCESS;
            }
            if (i == 1) {
                return IN_PROGRESS;
            }
            if (i == 2) {
                return FAILED;
            }
            if (i != 100) {
                return null;
            }
            return INIT;
        }

        private SaveState(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.PushSaveToNutStoreStateResponse$b */
    private static final class C18283b extends ProtoAdapter<PushSaveToNutStoreStateResponse> {
        C18283b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushSaveToNutStoreStateResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushSaveToNutStoreStateResponse pushSaveToNutStoreStateResponse) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushSaveToNutStoreStateResponse.message_id) + SaveState.ADAPTER.encodedSizeWithTag(2, pushSaveToNutStoreStateResponse.state);
            int i4 = 0;
            if (pushSaveToNutStoreStateResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(3, pushSaveToNutStoreStateResponse.entity);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (pushSaveToNutStoreStateResponse.source_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushSaveToNutStoreStateResponse.source_id);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (pushSaveToNutStoreStateResponse.source_type != null) {
                i3 = Message.SourceType.ADAPTER.encodedSizeWithTag(5, pushSaveToNutStoreStateResponse.source_type);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (pushSaveToNutStoreStateResponse.state_code != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, pushSaveToNutStoreStateResponse.state_code);
            }
            return i7 + i4 + pushSaveToNutStoreStateResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushSaveToNutStoreStateResponse decode(ProtoReader protoReader) throws IOException {
            C18282a aVar = new C18282a();
            aVar.f45557a = "";
            aVar.f45558b = SaveState.SUCCESS;
            aVar.f45560d = "";
            aVar.f45561e = Message.SourceType.TYPE_FROM_UNKONWN;
            aVar.f45562f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45557a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f45558b = SaveState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f45559c = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45560d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f45561e = Message.SourceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f45562f = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PushSaveToNutStoreStateResponse pushSaveToNutStoreStateResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushSaveToNutStoreStateResponse.message_id);
            SaveState.ADAPTER.encodeWithTag(protoWriter, 2, pushSaveToNutStoreStateResponse.state);
            if (pushSaveToNutStoreStateResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, pushSaveToNutStoreStateResponse.entity);
            }
            if (pushSaveToNutStoreStateResponse.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushSaveToNutStoreStateResponse.source_id);
            }
            if (pushSaveToNutStoreStateResponse.source_type != null) {
                Message.SourceType.ADAPTER.encodeWithTag(protoWriter, 5, pushSaveToNutStoreStateResponse.source_type);
            }
            if (pushSaveToNutStoreStateResponse.state_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, pushSaveToNutStoreStateResponse.state_code);
            }
            protoWriter.writeBytes(pushSaveToNutStoreStateResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.PushSaveToNutStoreStateResponse$a */
    public static final class C18282a extends Message.Builder<PushSaveToNutStoreStateResponse, C18282a> {

        /* renamed from: a */
        public String f45557a;

        /* renamed from: b */
        public SaveState f45558b;

        /* renamed from: c */
        public C14928Entity f45559c;

        /* renamed from: d */
        public String f45560d;

        /* renamed from: e */
        public Message.SourceType f45561e;

        /* renamed from: f */
        public Integer f45562f;

        /* renamed from: a */
        public PushSaveToNutStoreStateResponse build() {
            SaveState saveState;
            String str = this.f45557a;
            if (str != null && (saveState = this.f45558b) != null) {
                return new PushSaveToNutStoreStateResponse(str, saveState, this.f45559c, this.f45560d, this.f45561e, this.f45562f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id", this.f45558b, "state");
        }
    }

    @Override // com.squareup.wire.Message
    public C18282a newBuilder() {
        C18282a aVar = new C18282a();
        aVar.f45557a = this.message_id;
        aVar.f45558b = this.state;
        aVar.f45559c = this.entity;
        aVar.f45560d = this.source_id;
        aVar.f45561e = this.source_type;
        aVar.f45562f = this.state_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "PushSaveToNutStoreStateResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", state=");
        sb.append(this.state);
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.state_code != null) {
            sb.append(", state_code=");
            sb.append(this.state_code);
        }
        StringBuilder replace = sb.replace(0, 2, "PushSaveToNutStoreStateResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushSaveToNutStoreStateResponse(String str, SaveState saveState, C14928Entity entity2, String str2, Message.SourceType sourceType, Integer num) {
        this(str, saveState, entity2, str2, sourceType, num, ByteString.EMPTY);
    }

    public PushSaveToNutStoreStateResponse(String str, SaveState saveState, C14928Entity entity2, String str2, Message.SourceType sourceType, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.state = saveState;
        this.entity = entity2;
        this.source_id = str2;
        this.source_type = sourceType;
        this.state_code = num;
    }
}
