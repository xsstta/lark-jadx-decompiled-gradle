package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BotMeta extends Message<BotMeta, C50190a> {
    public static final ProtoAdapter<BotMeta> ADAPTER = new C50191b();
    public static final Boolean DEFAULT_CAN_JOIN_GROUP = true;
    public static final Boolean DEFAULT_IN_CONTACTS = true;
    private static final long serialVersionUID = 0;
    public final Boolean mcan_join_group;
    public final String mchat_id;
    public final ExtraFields mextraFields;
    public final String mid;
    public final Boolean min_contacts;
    public final String mtenant_id;
    public final String mwith_bot_tag;

    public static final class ExtraFields extends Message<ExtraFields, C50188a> {
        public static final ProtoAdapter<ExtraFields> ADAPTER = new C50189b();
        public static final Boolean DEFAULT_IS_IN_CHAT = false;
        private static final long serialVersionUID = 0;
        public final Boolean mis_in_chat;

        /* renamed from: com.ss.android.lark.pb.usearch.BotMeta$ExtraFields$b */
        private static final class C50189b extends ProtoAdapter<ExtraFields> {
            C50189b() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtraFields.class);
            }

            /* renamed from: a */
            public int encodedSize(ExtraFields extraFields) {
                int i;
                if (extraFields.mis_in_chat != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, extraFields.mis_in_chat);
                } else {
                    i = 0;
                }
                return i + extraFields.unknownFields().size();
            }

            /* renamed from: a */
            public ExtraFields decode(ProtoReader protoReader) throws IOException {
                C50188a aVar = new C50188a();
                aVar.f125395a = false;
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
                        aVar.f125395a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ExtraFields extraFields) throws IOException {
                if (extraFields.mis_in_chat != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, extraFields.mis_in_chat);
                }
                protoWriter.writeBytes(extraFields.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.usearch.BotMeta$ExtraFields$a */
        public static final class C50188a extends Message.Builder<ExtraFields, C50188a> {

            /* renamed from: a */
            public Boolean f125395a;

            /* renamed from: a */
            public ExtraFields build() {
                return new ExtraFields(this.f125395a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50188a newBuilder() {
            C50188a aVar = new C50188a();
            aVar.f125395a = this.mis_in_chat;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mis_in_chat != null) {
                sb.append(", is_in_chat=");
                sb.append(this.mis_in_chat);
            }
            StringBuilder replace = sb.replace(0, 2, "ExtraFields{");
            replace.append('}');
            return replace.toString();
        }

        public ExtraFields(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public ExtraFields(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mis_in_chat = bool;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.BotMeta$b */
    private static final class C50191b extends ProtoAdapter<BotMeta> {
        C50191b() {
            super(FieldEncoding.LENGTH_DELIMITED, BotMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(BotMeta botMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, botMeta.mid);
            int i6 = 0;
            if (botMeta.mtenant_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, botMeta.mtenant_id);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (botMeta.mwith_bot_tag != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, botMeta.mwith_bot_tag);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (botMeta.min_contacts != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, botMeta.min_contacts);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (botMeta.mcan_join_group != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, botMeta.mcan_join_group);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (botMeta.mchat_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, botMeta.mchat_id);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (botMeta.mextraFields != null) {
                i6 = ExtraFields.ADAPTER.encodedSizeWithTag(8, botMeta.mextraFields);
            }
            return i11 + i6 + botMeta.unknownFields().size();
        }

        /* renamed from: a */
        public BotMeta decode(ProtoReader protoReader) throws IOException {
            C50190a aVar = new C50190a();
            aVar.f125396a = "";
            aVar.f125397b = "";
            aVar.f125398c = "bot";
            aVar.f125399d = true;
            aVar.f125400e = true;
            aVar.f125401f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125396a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125397b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125398c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125399d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125400e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125401f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 8:
                            aVar.f125402g = ExtraFields.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BotMeta botMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, botMeta.mid);
            if (botMeta.mtenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, botMeta.mtenant_id);
            }
            if (botMeta.mwith_bot_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, botMeta.mwith_bot_tag);
            }
            if (botMeta.min_contacts != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, botMeta.min_contacts);
            }
            if (botMeta.mcan_join_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, botMeta.mcan_join_group);
            }
            if (botMeta.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, botMeta.mchat_id);
            }
            if (botMeta.mextraFields != null) {
                ExtraFields.ADAPTER.encodeWithTag(protoWriter, 8, botMeta.mextraFields);
            }
            protoWriter.writeBytes(botMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.BotMeta$a */
    public static final class C50190a extends Message.Builder<BotMeta, C50190a> {

        /* renamed from: a */
        public String f125396a;

        /* renamed from: b */
        public String f125397b;

        /* renamed from: c */
        public String f125398c;

        /* renamed from: d */
        public Boolean f125399d;

        /* renamed from: e */
        public Boolean f125400e;

        /* renamed from: f */
        public String f125401f;

        /* renamed from: g */
        public ExtraFields f125402g;

        /* renamed from: a */
        public BotMeta build() {
            String str = this.f125396a;
            if (str != null) {
                return new BotMeta(str, this.f125397b, this.f125398c, this.f125399d, this.f125400e, this.f125401f, this.f125402g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50190a newBuilder() {
        C50190a aVar = new C50190a();
        aVar.f125396a = this.mid;
        aVar.f125397b = this.mtenant_id;
        aVar.f125398c = this.mwith_bot_tag;
        aVar.f125399d = this.min_contacts;
        aVar.f125400e = this.mcan_join_group;
        aVar.f125401f = this.mchat_id;
        aVar.f125402g = this.mextraFields;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        if (this.mwith_bot_tag != null) {
            sb.append(", with_bot_tag=");
            sb.append(this.mwith_bot_tag);
        }
        if (this.min_contacts != null) {
            sb.append(", in_contacts=");
            sb.append(this.min_contacts);
        }
        if (this.mcan_join_group != null) {
            sb.append(", can_join_group=");
            sb.append(this.mcan_join_group);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mextraFields != null) {
            sb.append(", extraFields=");
            sb.append(this.mextraFields);
        }
        StringBuilder replace = sb.replace(0, 2, "BotMeta{");
        replace.append('}');
        return replace.toString();
    }

    public BotMeta(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, ExtraFields extraFields) {
        this(str, str2, str3, bool, bool2, str4, extraFields, ByteString.EMPTY);
    }

    public BotMeta(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, ExtraFields extraFields, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mtenant_id = str2;
        this.mwith_bot_tag = str3;
        this.min_contacts = bool;
        this.mcan_join_group = bool2;
        this.mchat_id = str4;
        this.mextraFields = extraFields;
    }
}
