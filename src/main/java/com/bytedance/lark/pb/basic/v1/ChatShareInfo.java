package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatShareInfo extends Message<ChatShareInfo, C14803a> {
    public static final ProtoAdapter<ChatShareInfo> ADAPTER = new C14804b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    public static final ShareStatus DEFAULT_STATUS = ShareStatus.UNKNOWN_STATE;
    public static final ShareTargetType DEFAULT_TARGET_TYPE = ShareTargetType.UNKNOWN_TARGET_TYPE;
    public static final ShareType DEFAULT_TYPE = ShareType.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final Long create_time;
    public final Long expire_time;
    public final String id;
    public final QrCodeExtra qr_code_extra;
    public final String share_chat_id;
    public final ShareChatterExtra share_chatter_extra;
    public final ShareStatus status;
    public final TargetChatExtra target_chat_extra;
    public final TargetChatterExtra target_chatter_extra;
    public final TargetDocExtra target_doc_extra;
    public final ShareTargetType target_type;
    public final String token;
    public final ShareType type;

    public enum ShareStatus implements WireEnum {
        UNKNOWN_STATE(0),
        ACTIVE(1),
        EXPIRED(2),
        DEACTIVED(3);
        
        public static final ProtoAdapter<ShareStatus> ADAPTER = ProtoAdapter.newEnumAdapter(ShareStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_STATE;
            }
            if (i == 1) {
                return ACTIVE;
            }
            if (i == 2) {
                return EXPIRED;
            }
            if (i != 3) {
                return null;
            }
            return DEACTIVED;
        }

        private ShareStatus(int i) {
            this.value = i;
        }
    }

    public enum ShareTargetType implements WireEnum {
        UNKNOWN_TARGET_TYPE(0),
        TARGET_CHAT(1),
        TARGET_CHATTER(2),
        TARGET_QRCODE(3),
        TARGET_DOC(4),
        TARGET_LINK(5);
        
        public static final ProtoAdapter<ShareTargetType> ADAPTER = ProtoAdapter.newEnumAdapter(ShareTargetType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareTargetType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TARGET_TYPE;
            }
            if (i == 1) {
                return TARGET_CHAT;
            }
            if (i == 2) {
                return TARGET_CHATTER;
            }
            if (i == 3) {
                return TARGET_QRCODE;
            }
            if (i == 4) {
                return TARGET_DOC;
            }
            if (i != 5) {
                return null;
            }
            return TARGET_LINK;
        }

        private ShareTargetType(int i) {
            this.value = i;
        }
    }

    public enum ShareType implements WireEnum {
        UNKNOWN_TYPE(0),
        CARD_MESSAGE(1),
        QRCODE(2),
        CARD_DOC(3),
        LINK(4);
        
        public static final ProtoAdapter<ShareType> ADAPTER = ProtoAdapter.newEnumAdapter(ShareType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return CARD_MESSAGE;
            }
            if (i == 2) {
                return QRCODE;
            }
            if (i == 3) {
                return CARD_DOC;
            }
            if (i != 4) {
                return null;
            }
            return LINK;
        }

        private ShareType(int i) {
            this.value = i;
        }
    }

    public static final class QrCodeExtra extends Message<QrCodeExtra, C14793a> {
        public static final ProtoAdapter<QrCodeExtra> ADAPTER = new C14794b();
        private static final long serialVersionUID = 0;
        public final String shared_url;

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$QrCodeExtra$b */
        private static final class C14794b extends ProtoAdapter<QrCodeExtra> {
            C14794b() {
                super(FieldEncoding.LENGTH_DELIMITED, QrCodeExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(QrCodeExtra qrCodeExtra) {
                int i;
                if (qrCodeExtra.shared_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, qrCodeExtra.shared_url);
                } else {
                    i = 0;
                }
                return i + qrCodeExtra.unknownFields().size();
            }

            /* renamed from: a */
            public QrCodeExtra decode(ProtoReader protoReader) throws IOException {
                C14793a aVar = new C14793a();
                aVar.f39085a = "";
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
                        aVar.f39085a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, QrCodeExtra qrCodeExtra) throws IOException {
                if (qrCodeExtra.shared_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, qrCodeExtra.shared_url);
                }
                protoWriter.writeBytes(qrCodeExtra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$QrCodeExtra$a */
        public static final class C14793a extends Message.Builder<QrCodeExtra, C14793a> {

            /* renamed from: a */
            public String f39085a;

            /* renamed from: a */
            public QrCodeExtra build() {
                return new QrCodeExtra(this.f39085a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14793a newBuilder() {
            C14793a aVar = new C14793a();
            aVar.f39085a = this.shared_url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "QrCodeExtra");
            StringBuilder sb = new StringBuilder();
            if (this.shared_url != null) {
                sb.append(", shared_url=");
                sb.append(this.shared_url);
            }
            StringBuilder replace = sb.replace(0, 2, "QrCodeExtra{");
            replace.append('}');
            return replace.toString();
        }

        public QrCodeExtra(String str) {
            this(str, ByteString.EMPTY);
        }

        public QrCodeExtra(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.shared_url = str;
        }
    }

    public static final class ShareChatterExtra extends Message<ShareChatterExtra, C14795a> {
        public static final ProtoAdapter<ShareChatterExtra> ADAPTER = new C14796b();
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final String name;
        public final String share_chatter_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$ShareChatterExtra$b */
        private static final class C14796b extends ProtoAdapter<ShareChatterExtra> {
            C14796b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareChatterExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareChatterExtra shareChatterExtra) {
                int i;
                int i2;
                int i3 = 0;
                if (shareChatterExtra.share_chatter_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareChatterExtra.share_chatter_id);
                } else {
                    i = 0;
                }
                if (shareChatterExtra.name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, shareChatterExtra.name);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (shareChatterExtra.avatar_key != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, shareChatterExtra.avatar_key);
                }
                return i4 + i3 + shareChatterExtra.unknownFields().size();
            }

            /* renamed from: a */
            public ShareChatterExtra decode(ProtoReader protoReader) throws IOException {
                C14795a aVar = new C14795a();
                aVar.f39086a = "";
                aVar.f39087b = "";
                aVar.f39088c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39086a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39087b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39088c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareChatterExtra shareChatterExtra) throws IOException {
                if (shareChatterExtra.share_chatter_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareChatterExtra.share_chatter_id);
                }
                if (shareChatterExtra.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shareChatterExtra.name);
                }
                if (shareChatterExtra.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareChatterExtra.avatar_key);
                }
                protoWriter.writeBytes(shareChatterExtra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$ShareChatterExtra$a */
        public static final class C14795a extends Message.Builder<ShareChatterExtra, C14795a> {

            /* renamed from: a */
            public String f39086a;

            /* renamed from: b */
            public String f39087b;

            /* renamed from: c */
            public String f39088c;

            /* renamed from: a */
            public ShareChatterExtra build() {
                return new ShareChatterExtra(this.f39086a, this.f39087b, this.f39088c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14795a newBuilder() {
            C14795a aVar = new C14795a();
            aVar.f39086a = this.share_chatter_id;
            aVar.f39087b = this.name;
            aVar.f39088c = this.avatar_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ShareChatterExtra");
            StringBuilder sb = new StringBuilder();
            if (this.share_chatter_id != null) {
                sb.append(", share_chatter_id=");
                sb.append(this.share_chatter_id);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            StringBuilder replace = sb.replace(0, 2, "ShareChatterExtra{");
            replace.append('}');
            return replace.toString();
        }

        public ShareChatterExtra(String str, String str2, String str3) {
            this(str, str2, str3, ByteString.EMPTY);
        }

        public ShareChatterExtra(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.share_chatter_id = str;
            this.name = str2;
            this.avatar_key = str3;
        }
    }

    public static final class TargetChatExtra extends Message<TargetChatExtra, C14797a> {
        public static final ProtoAdapter<TargetChatExtra> ADAPTER = new C14798b();
        private static final long serialVersionUID = 0;
        public final String chat_id;
        public final String chat_name;

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$TargetChatExtra$b */
        private static final class C14798b extends ProtoAdapter<TargetChatExtra> {
            C14798b() {
                super(FieldEncoding.LENGTH_DELIMITED, TargetChatExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(TargetChatExtra targetChatExtra) {
                int i;
                int i2 = 0;
                if (targetChatExtra.chat_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, targetChatExtra.chat_id);
                } else {
                    i = 0;
                }
                if (targetChatExtra.chat_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, targetChatExtra.chat_name);
                }
                return i + i2 + targetChatExtra.unknownFields().size();
            }

            /* renamed from: a */
            public TargetChatExtra decode(ProtoReader protoReader) throws IOException {
                C14797a aVar = new C14797a();
                aVar.f39089a = "";
                aVar.f39090b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39089a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39090b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TargetChatExtra targetChatExtra) throws IOException {
                if (targetChatExtra.chat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, targetChatExtra.chat_id);
                }
                if (targetChatExtra.chat_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, targetChatExtra.chat_name);
                }
                protoWriter.writeBytes(targetChatExtra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$TargetChatExtra$a */
        public static final class C14797a extends Message.Builder<TargetChatExtra, C14797a> {

            /* renamed from: a */
            public String f39089a;

            /* renamed from: b */
            public String f39090b;

            /* renamed from: a */
            public TargetChatExtra build() {
                return new TargetChatExtra(this.f39089a, this.f39090b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14797a newBuilder() {
            C14797a aVar = new C14797a();
            aVar.f39089a = this.chat_id;
            aVar.f39090b = this.chat_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TargetChatExtra");
            StringBuilder sb = new StringBuilder();
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            if (this.chat_name != null) {
                sb.append(", chat_name=");
                sb.append(this.chat_name);
            }
            StringBuilder replace = sb.replace(0, 2, "TargetChatExtra{");
            replace.append('}');
            return replace.toString();
        }

        public TargetChatExtra(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public TargetChatExtra(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_id = str;
            this.chat_name = str2;
        }
    }

    public static final class TargetChatterExtra extends Message<TargetChatterExtra, C14799a> {
        public static final ProtoAdapter<TargetChatterExtra> ADAPTER = new C14800b();
        private static final long serialVersionUID = 0;
        public final String chatter_id;
        public final String name;

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$TargetChatterExtra$b */
        private static final class C14800b extends ProtoAdapter<TargetChatterExtra> {
            C14800b() {
                super(FieldEncoding.LENGTH_DELIMITED, TargetChatterExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(TargetChatterExtra targetChatterExtra) {
                int i;
                int i2 = 0;
                if (targetChatterExtra.chatter_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, targetChatterExtra.chatter_id);
                } else {
                    i = 0;
                }
                if (targetChatterExtra.name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, targetChatterExtra.name);
                }
                return i + i2 + targetChatterExtra.unknownFields().size();
            }

            /* renamed from: a */
            public TargetChatterExtra decode(ProtoReader protoReader) throws IOException {
                C14799a aVar = new C14799a();
                aVar.f39091a = "";
                aVar.f39092b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39091a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39092b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TargetChatterExtra targetChatterExtra) throws IOException {
                if (targetChatterExtra.chatter_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, targetChatterExtra.chatter_id);
                }
                if (targetChatterExtra.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, targetChatterExtra.name);
                }
                protoWriter.writeBytes(targetChatterExtra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$TargetChatterExtra$a */
        public static final class C14799a extends Message.Builder<TargetChatterExtra, C14799a> {

            /* renamed from: a */
            public String f39091a;

            /* renamed from: b */
            public String f39092b;

            /* renamed from: a */
            public TargetChatterExtra build() {
                return new TargetChatterExtra(this.f39091a, this.f39092b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14799a newBuilder() {
            C14799a aVar = new C14799a();
            aVar.f39091a = this.chatter_id;
            aVar.f39092b = this.name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TargetChatterExtra");
            StringBuilder sb = new StringBuilder();
            if (this.chatter_id != null) {
                sb.append(", chatter_id=");
                sb.append(this.chatter_id);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            StringBuilder replace = sb.replace(0, 2, "TargetChatterExtra{");
            replace.append('}');
            return replace.toString();
        }

        public TargetChatterExtra(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public TargetChatterExtra(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chatter_id = str;
            this.name = str2;
        }
    }

    public static final class TargetDocExtra extends Message<TargetDocExtra, C14801a> {
        public static final ProtoAdapter<TargetDocExtra> ADAPTER = new C14802b();
        public static final Doc.Type DEFAULT_DOC_TYPE = Doc.Type.UNKNOWN;
        public static final Boolean DEFAULT_UNAUTHORIZED = false;
        private static final long serialVersionUID = 0;
        public final String doc_name;
        public final Doc.Type doc_type;
        public final String doc_url;
        public final Boolean unauthorized;

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$TargetDocExtra$b */
        private static final class C14802b extends ProtoAdapter<TargetDocExtra> {
            C14802b() {
                super(FieldEncoding.LENGTH_DELIMITED, TargetDocExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(TargetDocExtra targetDocExtra) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (targetDocExtra.doc_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, targetDocExtra.doc_url);
                } else {
                    i = 0;
                }
                if (targetDocExtra.doc_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, targetDocExtra.doc_name);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (targetDocExtra.doc_type != null) {
                    i3 = Doc.Type.ADAPTER.encodedSizeWithTag(3, targetDocExtra.doc_type);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (targetDocExtra.unauthorized != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, targetDocExtra.unauthorized);
                }
                return i6 + i4 + targetDocExtra.unknownFields().size();
            }

            /* renamed from: a */
            public TargetDocExtra decode(ProtoReader protoReader) throws IOException {
                C14801a aVar = new C14801a();
                aVar.f39093a = "";
                aVar.f39094b = "";
                aVar.f39095c = Doc.Type.UNKNOWN;
                aVar.f39096d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39093a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39094b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f39095c = Doc.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39096d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TargetDocExtra targetDocExtra) throws IOException {
                if (targetDocExtra.doc_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, targetDocExtra.doc_url);
                }
                if (targetDocExtra.doc_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, targetDocExtra.doc_name);
                }
                if (targetDocExtra.doc_type != null) {
                    Doc.Type.ADAPTER.encodeWithTag(protoWriter, 3, targetDocExtra.doc_type);
                }
                if (targetDocExtra.unauthorized != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, targetDocExtra.unauthorized);
                }
                protoWriter.writeBytes(targetDocExtra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$TargetDocExtra$a */
        public static final class C14801a extends Message.Builder<TargetDocExtra, C14801a> {

            /* renamed from: a */
            public String f39093a;

            /* renamed from: b */
            public String f39094b;

            /* renamed from: c */
            public Doc.Type f39095c;

            /* renamed from: d */
            public Boolean f39096d;

            /* renamed from: a */
            public TargetDocExtra build() {
                return new TargetDocExtra(this.f39093a, this.f39094b, this.f39095c, this.f39096d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14801a newBuilder() {
            C14801a aVar = new C14801a();
            aVar.f39093a = this.doc_url;
            aVar.f39094b = this.doc_name;
            aVar.f39095c = this.doc_type;
            aVar.f39096d = this.unauthorized;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TargetDocExtra");
            StringBuilder sb = new StringBuilder();
            if (this.doc_url != null) {
                sb.append(", doc_url=");
                sb.append(this.doc_url);
            }
            if (this.doc_name != null) {
                sb.append(", doc_name=");
                sb.append(this.doc_name);
            }
            if (this.doc_type != null) {
                sb.append(", doc_type=");
                sb.append(this.doc_type);
            }
            if (this.unauthorized != null) {
                sb.append(", unauthorized=");
                sb.append(this.unauthorized);
            }
            StringBuilder replace = sb.replace(0, 2, "TargetDocExtra{");
            replace.append('}');
            return replace.toString();
        }

        public TargetDocExtra(String str, String str2, Doc.Type type, Boolean bool) {
            this(str, str2, type, bool, ByteString.EMPTY);
        }

        public TargetDocExtra(String str, String str2, Doc.Type type, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.doc_url = str;
            this.doc_name = str2;
            this.doc_type = type;
            this.unauthorized = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$b */
    private static final class C14804b extends ProtoAdapter<ChatShareInfo> {
        C14804b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatShareInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatShareInfo chatShareInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            if (chatShareInfo.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatShareInfo.id);
            } else {
                i = 0;
            }
            if (chatShareInfo.type != null) {
                i2 = ShareType.ADAPTER.encodedSizeWithTag(2, chatShareInfo.type);
            } else {
                i2 = 0;
            }
            int i14 = i + i2;
            if (chatShareInfo.status != null) {
                i3 = ShareStatus.ADAPTER.encodedSizeWithTag(3, chatShareInfo.status);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (chatShareInfo.target_type != null) {
                i4 = ShareTargetType.ADAPTER.encodedSizeWithTag(4, chatShareInfo.target_type);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (chatShareInfo.share_chat_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, chatShareInfo.share_chat_id);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (chatShareInfo.token != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, chatShareInfo.token);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (chatShareInfo.create_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, chatShareInfo.create_time);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (chatShareInfo.expire_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, chatShareInfo.expire_time);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (chatShareInfo.share_chatter_extra != null) {
                i9 = ShareChatterExtra.ADAPTER.encodedSizeWithTag(9, chatShareInfo.share_chatter_extra);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (chatShareInfo.qr_code_extra != null) {
                i10 = QrCodeExtra.ADAPTER.encodedSizeWithTag(10, chatShareInfo.qr_code_extra);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (chatShareInfo.target_doc_extra != null) {
                i11 = TargetDocExtra.ADAPTER.encodedSizeWithTag(11, chatShareInfo.target_doc_extra);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (chatShareInfo.target_chat_extra != null) {
                i12 = TargetChatExtra.ADAPTER.encodedSizeWithTag(12, chatShareInfo.target_chat_extra);
            } else {
                i12 = 0;
            }
            int i24 = i23 + i12;
            if (chatShareInfo.target_chatter_extra != null) {
                i13 = TargetChatterExtra.ADAPTER.encodedSizeWithTag(13, chatShareInfo.target_chatter_extra);
            }
            return i24 + i13 + chatShareInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ChatShareInfo decode(ProtoReader protoReader) throws IOException {
            C14803a aVar = new C14803a();
            aVar.f39097a = "";
            aVar.f39098b = ShareType.UNKNOWN_TYPE;
            aVar.f39099c = ShareStatus.UNKNOWN_STATE;
            aVar.f39100d = ShareTargetType.UNKNOWN_TARGET_TYPE;
            aVar.f39101e = "";
            aVar.f39102f = "";
            aVar.f39103g = 0L;
            aVar.f39104h = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39097a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f39098b = ShareType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f39099c = ShareStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f39100d = ShareTargetType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 5:
                            aVar.f39101e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39102f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39103g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39104h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39105i = ShareChatterExtra.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39106j = QrCodeExtra.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f39107k = TargetDocExtra.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39108l = TargetChatExtra.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f39109m = TargetChatterExtra.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ChatShareInfo chatShareInfo) throws IOException {
            if (chatShareInfo.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatShareInfo.id);
            }
            if (chatShareInfo.type != null) {
                ShareType.ADAPTER.encodeWithTag(protoWriter, 2, chatShareInfo.type);
            }
            if (chatShareInfo.status != null) {
                ShareStatus.ADAPTER.encodeWithTag(protoWriter, 3, chatShareInfo.status);
            }
            if (chatShareInfo.target_type != null) {
                ShareTargetType.ADAPTER.encodeWithTag(protoWriter, 4, chatShareInfo.target_type);
            }
            if (chatShareInfo.share_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, chatShareInfo.share_chat_id);
            }
            if (chatShareInfo.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, chatShareInfo.token);
            }
            if (chatShareInfo.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, chatShareInfo.create_time);
            }
            if (chatShareInfo.expire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, chatShareInfo.expire_time);
            }
            if (chatShareInfo.share_chatter_extra != null) {
                ShareChatterExtra.ADAPTER.encodeWithTag(protoWriter, 9, chatShareInfo.share_chatter_extra);
            }
            if (chatShareInfo.qr_code_extra != null) {
                QrCodeExtra.ADAPTER.encodeWithTag(protoWriter, 10, chatShareInfo.qr_code_extra);
            }
            if (chatShareInfo.target_doc_extra != null) {
                TargetDocExtra.ADAPTER.encodeWithTag(protoWriter, 11, chatShareInfo.target_doc_extra);
            }
            if (chatShareInfo.target_chat_extra != null) {
                TargetChatExtra.ADAPTER.encodeWithTag(protoWriter, 12, chatShareInfo.target_chat_extra);
            }
            if (chatShareInfo.target_chatter_extra != null) {
                TargetChatterExtra.ADAPTER.encodeWithTag(protoWriter, 13, chatShareInfo.target_chatter_extra);
            }
            protoWriter.writeBytes(chatShareInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatShareInfo$a */
    public static final class C14803a extends Message.Builder<ChatShareInfo, C14803a> {

        /* renamed from: a */
        public String f39097a;

        /* renamed from: b */
        public ShareType f39098b;

        /* renamed from: c */
        public ShareStatus f39099c;

        /* renamed from: d */
        public ShareTargetType f39100d;

        /* renamed from: e */
        public String f39101e;

        /* renamed from: f */
        public String f39102f;

        /* renamed from: g */
        public Long f39103g;

        /* renamed from: h */
        public Long f39104h;

        /* renamed from: i */
        public ShareChatterExtra f39105i;

        /* renamed from: j */
        public QrCodeExtra f39106j;

        /* renamed from: k */
        public TargetDocExtra f39107k;

        /* renamed from: l */
        public TargetChatExtra f39108l;

        /* renamed from: m */
        public TargetChatterExtra f39109m;

        /* renamed from: a */
        public ChatShareInfo build() {
            return new ChatShareInfo(this.f39097a, this.f39098b, this.f39099c, this.f39100d, this.f39101e, this.f39102f, this.f39103g, this.f39104h, this.f39105i, this.f39106j, this.f39107k, this.f39108l, this.f39109m, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14803a newBuilder() {
        C14803a aVar = new C14803a();
        aVar.f39097a = this.id;
        aVar.f39098b = this.type;
        aVar.f39099c = this.status;
        aVar.f39100d = this.target_type;
        aVar.f39101e = this.share_chat_id;
        aVar.f39102f = this.token;
        aVar.f39103g = this.create_time;
        aVar.f39104h = this.expire_time;
        aVar.f39105i = this.share_chatter_extra;
        aVar.f39106j = this.qr_code_extra;
        aVar.f39107k = this.target_doc_extra;
        aVar.f39108l = this.target_chat_extra;
        aVar.f39109m = this.target_chatter_extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ChatShareInfo");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.target_type != null) {
            sb.append(", target_type=");
            sb.append(this.target_type);
        }
        if (this.share_chat_id != null) {
            sb.append(", share_chat_id=");
            sb.append(this.share_chat_id);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        if (this.share_chatter_extra != null) {
            sb.append(", share_chatter_extra=");
            sb.append(this.share_chatter_extra);
        }
        if (this.qr_code_extra != null) {
            sb.append(", qr_code_extra=");
            sb.append(this.qr_code_extra);
        }
        if (this.target_doc_extra != null) {
            sb.append(", target_doc_extra=");
            sb.append(this.target_doc_extra);
        }
        if (this.target_chat_extra != null) {
            sb.append(", target_chat_extra=");
            sb.append(this.target_chat_extra);
        }
        if (this.target_chatter_extra != null) {
            sb.append(", target_chatter_extra=");
            sb.append(this.target_chatter_extra);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatShareInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ChatShareInfo(String str, ShareType shareType, ShareStatus shareStatus, ShareTargetType shareTargetType, String str2, String str3, Long l, Long l2, ShareChatterExtra shareChatterExtra, QrCodeExtra qrCodeExtra, TargetDocExtra targetDocExtra, TargetChatExtra targetChatExtra, TargetChatterExtra targetChatterExtra) {
        this(str, shareType, shareStatus, shareTargetType, str2, str3, l, l2, shareChatterExtra, qrCodeExtra, targetDocExtra, targetChatExtra, targetChatterExtra, ByteString.EMPTY);
    }

    public ChatShareInfo(String str, ShareType shareType, ShareStatus shareStatus, ShareTargetType shareTargetType, String str2, String str3, Long l, Long l2, ShareChatterExtra shareChatterExtra, QrCodeExtra qrCodeExtra, TargetDocExtra targetDocExtra, TargetChatExtra targetChatExtra, TargetChatterExtra targetChatterExtra, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = shareType;
        this.status = shareStatus;
        this.target_type = shareTargetType;
        this.share_chat_id = str2;
        this.token = str3;
        this.create_time = l;
        this.expire_time = l2;
        this.share_chatter_extra = shareChatterExtra;
        this.qr_code_extra = qrCodeExtra;
        this.target_doc_extra = targetDocExtra;
        this.target_chat_extra = targetChatExtra;
        this.target_chatter_extra = targetChatterExtra;
    }
}
