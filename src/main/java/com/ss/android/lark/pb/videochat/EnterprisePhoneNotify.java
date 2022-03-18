package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class EnterprisePhoneNotify extends Message<EnterprisePhoneNotify, C50292a> {
    public static final ProtoAdapter<EnterprisePhoneNotify> ADAPTER = new C50293b();
    private static final long serialVersionUID = 0;
    public final Action maction;
    public final CallExceptionNotice mcaller_unreached_toast_data;
    public final String menterprise_phone_id;

    public enum Action implements WireEnum {
        CALLER_RINGING(0),
        CALL_EXCEPTION_TOAST_CALLER_UNREACHED(1);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return CALLER_RINGING;
            }
            if (i != 1) {
                return null;
            }
            return CALL_EXCEPTION_TOAST_CALLER_UNREACHED;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public static final class CallExceptionNotice extends Message<CallExceptionNotice, C50290a> {
        public static final ProtoAdapter<CallExceptionNotice> ADAPTER = new C50291b();
        private static final long serialVersionUID = 0;
        public final String mkey;

        /* renamed from: com.ss.android.lark.pb.videochat.EnterprisePhoneNotify$CallExceptionNotice$b */
        private static final class C50291b extends ProtoAdapter<CallExceptionNotice> {
            C50291b() {
                super(FieldEncoding.LENGTH_DELIMITED, CallExceptionNotice.class);
            }

            /* renamed from: a */
            public int encodedSize(CallExceptionNotice callExceptionNotice) {
                int i;
                if (callExceptionNotice.mkey != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, callExceptionNotice.mkey);
                } else {
                    i = 0;
                }
                return i + callExceptionNotice.unknownFields().size();
            }

            /* renamed from: a */
            public CallExceptionNotice decode(ProtoReader protoReader) throws IOException {
                C50290a aVar = new C50290a();
                aVar.f125652a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125652a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CallExceptionNotice callExceptionNotice) throws IOException {
                if (callExceptionNotice.mkey != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, callExceptionNotice.mkey);
                }
                protoWriter.writeBytes(callExceptionNotice.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.EnterprisePhoneNotify$CallExceptionNotice$a */
        public static final class C50290a extends Message.Builder<CallExceptionNotice, C50290a> {

            /* renamed from: a */
            public String f125652a;

            /* renamed from: a */
            public CallExceptionNotice build() {
                return new CallExceptionNotice(this.f125652a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50290a newBuilder() {
            C50290a aVar = new C50290a();
            aVar.f125652a = this.mkey;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mkey != null) {
                sb.append(", key=");
                sb.append(this.mkey);
            }
            StringBuilder replace = sb.replace(0, 2, "CallExceptionNotice{");
            replace.append('}');
            return replace.toString();
        }

        public CallExceptionNotice(String str) {
            this(str, ByteString.EMPTY);
        }

        public CallExceptionNotice(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mkey = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.EnterprisePhoneNotify$b */
    private static final class C50293b extends ProtoAdapter<EnterprisePhoneNotify> {
        C50293b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnterprisePhoneNotify.class);
        }

        /* renamed from: a */
        public int encodedSize(EnterprisePhoneNotify enterprisePhoneNotify) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, enterprisePhoneNotify.menterprise_phone_id) + Action.ADAPTER.encodedSizeWithTag(2, enterprisePhoneNotify.maction);
            if (enterprisePhoneNotify.mcaller_unreached_toast_data != null) {
                i = CallExceptionNotice.ADAPTER.encodedSizeWithTag(3, enterprisePhoneNotify.mcaller_unreached_toast_data);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + enterprisePhoneNotify.unknownFields().size();
        }

        /* renamed from: a */
        public EnterprisePhoneNotify decode(ProtoReader protoReader) throws IOException {
            C50292a aVar = new C50292a();
            aVar.f125653a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125653a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f125654b = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125655c = CallExceptionNotice.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnterprisePhoneNotify enterprisePhoneNotify) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, enterprisePhoneNotify.menterprise_phone_id);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, enterprisePhoneNotify.maction);
            if (enterprisePhoneNotify.mcaller_unreached_toast_data != null) {
                CallExceptionNotice.ADAPTER.encodeWithTag(protoWriter, 3, enterprisePhoneNotify.mcaller_unreached_toast_data);
            }
            protoWriter.writeBytes(enterprisePhoneNotify.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50292a newBuilder() {
        C50292a aVar = new C50292a();
        aVar.f125653a = this.menterprise_phone_id;
        aVar.f125654b = this.maction;
        aVar.f125655c = this.mcaller_unreached_toast_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.EnterprisePhoneNotify$a */
    public static final class C50292a extends Message.Builder<EnterprisePhoneNotify, C50292a> {

        /* renamed from: a */
        public String f125653a;

        /* renamed from: b */
        public Action f125654b;

        /* renamed from: c */
        public CallExceptionNotice f125655c;

        /* renamed from: a */
        public EnterprisePhoneNotify build() {
            Action action;
            String str = this.f125653a;
            if (str != null && (action = this.f125654b) != null) {
                return new EnterprisePhoneNotify(str, action, this.f125655c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "menterprise_phone_id", this.f125654b, "maction");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", enterprise_phone_id=");
        sb.append(this.menterprise_phone_id);
        sb.append(", action=");
        sb.append(this.maction);
        if (this.mcaller_unreached_toast_data != null) {
            sb.append(", caller_unreached_toast_data=");
            sb.append(this.mcaller_unreached_toast_data);
        }
        StringBuilder replace = sb.replace(0, 2, "EnterprisePhoneNotify{");
        replace.append('}');
        return replace.toString();
    }

    public EnterprisePhoneNotify(String str, Action action, CallExceptionNotice callExceptionNotice) {
        this(str, action, callExceptionNotice, ByteString.EMPTY);
    }

    public EnterprisePhoneNotify(String str, Action action, CallExceptionNotice callExceptionNotice, ByteString byteString) {
        super(ADAPTER, byteString);
        this.menterprise_phone_id = str;
        this.maction = action;
        this.mcaller_unreached_toast_data = callExceptionNotice;
    }
}
