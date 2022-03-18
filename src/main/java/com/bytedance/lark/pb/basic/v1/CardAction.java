package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class CardAction extends Message<CardAction, C14732a> {
    public static final ProtoAdapter<CardAction> ADAPTER = new C14733b();
    public static final Integer DEFAULT_CMD = 0;
    public static final Method DEFAULT_METHOD = Method.GET;
    private static final long serialVersionUID = 0;
    public final Integer cmd;
    public final Method method;
    public final Url open_url;
    public final CardActionPacket packet;
    public final Parameters parameters;
    public final RequiredParameters required_parameters;
    public final String url;

    public enum Method implements WireEnum {
        GET(1),
        POST(2),
        LARK_COMMAND(3),
        OPEN_URL(4);
        
        public static final ProtoAdapter<Method> ADAPTER = ProtoAdapter.newEnumAdapter(Method.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Method fromValue(int i) {
            if (i == 1) {
                return GET;
            }
            if (i == 2) {
                return POST;
            }
            if (i == 3) {
                return LARK_COMMAND;
            }
            if (i != 4) {
                return null;
            }
            return OPEN_URL;
        }

        private Method(int i) {
            this.value = i;
        }
    }

    public static final class MessageInfo extends Message<MessageInfo, C14722a> {
        public static final ProtoAdapter<MessageInfo> ADAPTER = new C14723b();
        private static final long serialVersionUID = 0;
        public final String message_open_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$MessageInfo$b */
        private static final class C14723b extends ProtoAdapter<MessageInfo> {
            C14723b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageInfo messageInfo) {
                int i;
                if (messageInfo.message_open_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, messageInfo.message_open_id);
                } else {
                    i = 0;
                }
                return i + messageInfo.unknownFields().size();
            }

            /* renamed from: a */
            public MessageInfo decode(ProtoReader protoReader) throws IOException {
                C14722a aVar = new C14722a();
                aVar.f38940a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38940a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageInfo messageInfo) throws IOException {
                if (messageInfo.message_open_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, messageInfo.message_open_id);
                }
                protoWriter.writeBytes(messageInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$MessageInfo$a */
        public static final class C14722a extends Message.Builder<MessageInfo, C14722a> {

            /* renamed from: a */
            public String f38940a;

            /* renamed from: a */
            public MessageInfo build() {
                return new MessageInfo(this.f38940a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14722a mo54173a(String str) {
                this.f38940a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14722a newBuilder() {
            C14722a aVar = new C14722a();
            aVar.f38940a = this.message_open_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MessageInfo");
            StringBuilder sb = new StringBuilder();
            if (this.message_open_id != null) {
                sb.append(", message_open_id=");
                sb.append(this.message_open_id);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageInfo{");
            replace.append('}');
            return replace.toString();
        }

        public MessageInfo(String str) {
            this(str, ByteString.EMPTY);
        }

        public MessageInfo(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.message_open_id = str;
        }
    }

    public static final class RequiredParameters extends Message<RequiredParameters, C14726a> {
        public static final ProtoAdapter<RequiredParameters> ADAPTER = new C14727b();
        public static final Boolean DEFAULT_NEED_MESSAGE_ID = false;
        public static final Boolean DEFAULT_NEED_MESSAGE_INFO = false;
        public static final Boolean DEFAULT_NEED_USER_ID = false;
        public static final Boolean DEFAULT_NEED_USER_INFO = false;
        private static final long serialVersionUID = 0;
        public final Boolean need_message_id;
        public final Boolean need_message_info;
        public final Boolean need_user_id;
        public final Boolean need_user_info;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$RequiredParameters$b */
        private static final class C14727b extends ProtoAdapter<RequiredParameters> {
            C14727b() {
                super(FieldEncoding.LENGTH_DELIMITED, RequiredParameters.class);
            }

            /* renamed from: a */
            public int encodedSize(RequiredParameters requiredParameters) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (requiredParameters.need_user_info != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, requiredParameters.need_user_info);
                } else {
                    i = 0;
                }
                if (requiredParameters.need_message_info != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, requiredParameters.need_message_info);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (requiredParameters.need_user_id != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, requiredParameters.need_user_id);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (requiredParameters.need_message_id != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, requiredParameters.need_message_id);
                }
                return i6 + i4 + requiredParameters.unknownFields().size();
            }

            /* renamed from: a */
            public RequiredParameters decode(ProtoReader protoReader) throws IOException {
                C14726a aVar = new C14726a();
                aVar.f38947a = false;
                aVar.f38948b = false;
                aVar.f38949c = false;
                aVar.f38950d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38947a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f38948b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f38949c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38950d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RequiredParameters requiredParameters) throws IOException {
                if (requiredParameters.need_user_info != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, requiredParameters.need_user_info);
                }
                if (requiredParameters.need_message_info != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, requiredParameters.need_message_info);
                }
                if (requiredParameters.need_user_id != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, requiredParameters.need_user_id);
                }
                if (requiredParameters.need_message_id != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, requiredParameters.need_message_id);
                }
                protoWriter.writeBytes(requiredParameters.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$RequiredParameters$a */
        public static final class C14726a extends Message.Builder<RequiredParameters, C14726a> {

            /* renamed from: a */
            public Boolean f38947a;

            /* renamed from: b */
            public Boolean f38948b;

            /* renamed from: c */
            public Boolean f38949c;

            /* renamed from: d */
            public Boolean f38950d;

            /* renamed from: a */
            public RequiredParameters build() {
                return new RequiredParameters(this.f38947a, this.f38948b, this.f38949c, this.f38950d, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14726a mo54187a(Boolean bool) {
                this.f38947a = bool;
                return this;
            }

            /* renamed from: b */
            public C14726a mo54189b(Boolean bool) {
                this.f38948b = bool;
                return this;
            }

            /* renamed from: c */
            public C14726a mo54190c(Boolean bool) {
                this.f38949c = bool;
                return this;
            }

            /* renamed from: d */
            public C14726a mo54191d(Boolean bool) {
                this.f38950d = bool;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14726a newBuilder() {
            C14726a aVar = new C14726a();
            aVar.f38947a = this.need_user_info;
            aVar.f38948b = this.need_message_info;
            aVar.f38949c = this.need_user_id;
            aVar.f38950d = this.need_message_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "RequiredParameters");
            StringBuilder sb = new StringBuilder();
            if (this.need_user_info != null) {
                sb.append(", need_user_info=");
                sb.append(this.need_user_info);
            }
            if (this.need_message_info != null) {
                sb.append(", need_message_info=");
                sb.append(this.need_message_info);
            }
            if (this.need_user_id != null) {
                sb.append(", need_user_id=");
                sb.append(this.need_user_id);
            }
            if (this.need_message_id != null) {
                sb.append(", need_message_id=");
                sb.append(this.need_message_id);
            }
            StringBuilder replace = sb.replace(0, 2, "RequiredParameters{");
            replace.append('}');
            return replace.toString();
        }

        public RequiredParameters(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this(bool, bool2, bool3, bool4, ByteString.EMPTY);
        }

        public RequiredParameters(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.need_user_info = bool;
            this.need_message_info = bool2;
            this.need_user_id = bool3;
            this.need_message_id = bool4;
        }
    }

    public static final class Url extends Message<Url, C14728a> {
        public static final ProtoAdapter<Url> ADAPTER = new C14729b();
        private static final long serialVersionUID = 0;
        public final String android_url;
        public final String ios_url;
        public final String pc_url;
        public final String url;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$Url$b */
        private static final class C14729b extends ProtoAdapter<Url> {
            C14729b() {
                super(FieldEncoding.LENGTH_DELIMITED, Url.class);
            }

            /* renamed from: a */
            public int encodedSize(Url url) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (url.url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, url.url);
                } else {
                    i = 0;
                }
                if (url.ios_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, url.ios_url);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (url.android_url != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, url.android_url);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (url.pc_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, url.pc_url);
                }
                return i6 + i4 + url.unknownFields().size();
            }

            /* renamed from: a */
            public Url decode(ProtoReader protoReader) throws IOException {
                C14728a aVar = new C14728a();
                aVar.f38951a = "";
                aVar.f38952b = "";
                aVar.f38953c = "";
                aVar.f38954d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38951a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f38952b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f38953c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38954d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Url url) throws IOException {
                if (url.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, url.url);
                }
                if (url.ios_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, url.ios_url);
                }
                if (url.android_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, url.android_url);
                }
                if (url.pc_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, url.pc_url);
                }
                protoWriter.writeBytes(url.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$Url$a */
        public static final class C14728a extends Message.Builder<Url, C14728a> {

            /* renamed from: a */
            public String f38951a;

            /* renamed from: b */
            public String f38952b;

            /* renamed from: c */
            public String f38953c;

            /* renamed from: d */
            public String f38954d;

            /* renamed from: a */
            public Url build() {
                return new Url(this.f38951a, this.f38952b, this.f38953c, this.f38954d, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14728a mo54195a(String str) {
                this.f38951a = str;
                return this;
            }

            /* renamed from: b */
            public C14728a mo54197b(String str) {
                this.f38952b = str;
                return this;
            }

            /* renamed from: c */
            public C14728a mo54198c(String str) {
                this.f38953c = str;
                return this;
            }

            /* renamed from: d */
            public C14728a mo54199d(String str) {
                this.f38954d = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14728a newBuilder() {
            C14728a aVar = new C14728a();
            aVar.f38951a = this.url;
            aVar.f38952b = this.ios_url;
            aVar.f38953c = this.android_url;
            aVar.f38954d = this.pc_url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Url");
            StringBuilder sb = new StringBuilder();
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            if (this.ios_url != null) {
                sb.append(", ios_url=");
                sb.append(this.ios_url);
            }
            if (this.android_url != null) {
                sb.append(", android_url=");
                sb.append(this.android_url);
            }
            if (this.pc_url != null) {
                sb.append(", pc_url=");
                sb.append(this.pc_url);
            }
            StringBuilder replace = sb.replace(0, 2, "Url{");
            replace.append('}');
            return replace.toString();
        }

        public Url(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, ByteString.EMPTY);
        }

        public Url(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
            this.ios_url = str2;
            this.android_url = str3;
            this.pc_url = str4;
        }
    }

    public static final class UserInfo extends Message<UserInfo, C14730a> {
        public static final ProtoAdapter<UserInfo> ADAPTER = new C14731b();
        private static final long serialVersionUID = 0;
        public final String user_open_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$UserInfo$b */
        private static final class C14731b extends ProtoAdapter<UserInfo> {
            C14731b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(UserInfo userInfo) {
                int i;
                if (userInfo.user_open_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, userInfo.user_open_id);
                } else {
                    i = 0;
                }
                return i + userInfo.unknownFields().size();
            }

            /* renamed from: a */
            public UserInfo decode(ProtoReader protoReader) throws IOException {
                C14730a aVar = new C14730a();
                aVar.f38955a = "";
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
                        aVar.f38955a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserInfo userInfo) throws IOException {
                if (userInfo.user_open_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userInfo.user_open_id);
                }
                protoWriter.writeBytes(userInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$UserInfo$a */
        public static final class C14730a extends Message.Builder<UserInfo, C14730a> {

            /* renamed from: a */
            public String f38955a;

            /* renamed from: a */
            public UserInfo build() {
                return new UserInfo(this.f38955a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14730a mo54203a(String str) {
                this.f38955a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14730a newBuilder() {
            C14730a aVar = new C14730a();
            aVar.f38955a = this.user_open_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "UserInfo");
            StringBuilder sb = new StringBuilder();
            if (this.user_open_id != null) {
                sb.append(", user_open_id=");
                sb.append(this.user_open_id);
            }
            StringBuilder replace = sb.replace(0, 2, "UserInfo{");
            replace.append('}');
            return replace.toString();
        }

        public UserInfo(String str) {
            this(str, ByteString.EMPTY);
        }

        public UserInfo(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_open_id = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$b */
    private static final class C14733b extends ProtoAdapter<CardAction> {
        C14733b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardAction.class);
        }

        /* renamed from: a */
        public int encodedSize(CardAction cardAction) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, cardAction.url) + Method.ADAPTER.encodedSizeWithTag(2, cardAction.method);
            int i5 = 0;
            if (cardAction.required_parameters != null) {
                i = RequiredParameters.ADAPTER.encodedSizeWithTag(3, cardAction.required_parameters);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (cardAction.parameters != null) {
                i2 = Parameters.ADAPTER.encodedSizeWithTag(4, cardAction.parameters);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (cardAction.cmd != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, cardAction.cmd);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (cardAction.packet != null) {
                i4 = CardActionPacket.ADAPTER.encodedSizeWithTag(6, cardAction.packet);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (cardAction.open_url != null) {
                i5 = Url.ADAPTER.encodedSizeWithTag(7, cardAction.open_url);
            }
            return i9 + i5 + cardAction.unknownFields().size();
        }

        /* renamed from: a */
        public CardAction decode(ProtoReader protoReader) throws IOException {
            C14732a aVar = new C14732a();
            aVar.f38956a = "";
            aVar.f38957b = Method.GET;
            aVar.f38960e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38956a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f38957b = Method.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f38958c = RequiredParameters.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38959d = Parameters.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38960e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38961f = CardActionPacket.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38962g = Url.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CardAction cardAction) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardAction.url);
            Method.ADAPTER.encodeWithTag(protoWriter, 2, cardAction.method);
            if (cardAction.required_parameters != null) {
                RequiredParameters.ADAPTER.encodeWithTag(protoWriter, 3, cardAction.required_parameters);
            }
            if (cardAction.parameters != null) {
                Parameters.ADAPTER.encodeWithTag(protoWriter, 4, cardAction.parameters);
            }
            if (cardAction.cmd != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, cardAction.cmd);
            }
            if (cardAction.packet != null) {
                CardActionPacket.ADAPTER.encodeWithTag(protoWriter, 6, cardAction.packet);
            }
            if (cardAction.open_url != null) {
                Url.ADAPTER.encodeWithTag(protoWriter, 7, cardAction.open_url);
            }
            protoWriter.writeBytes(cardAction.unknownFields());
        }
    }

    public static final class Parameters extends Message<Parameters, C14724a> {
        public static final ProtoAdapter<Parameters> ADAPTER = new C14725b();
        private static final long serialVersionUID = 0;
        public final String message_id;
        public final MessageInfo message_info;
        public final Map<String, String> parameters;
        public final String user_id;
        public final UserInfo user_info;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$Parameters$b */
        private static final class C14725b extends ProtoAdapter<Parameters> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f38946a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C14725b() {
                super(FieldEncoding.LENGTH_DELIMITED, Parameters.class);
            }

            /* renamed from: a */
            public int encodedSize(Parameters parameters) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = this.f38946a.encodedSizeWithTag(1, parameters.parameters);
                int i4 = 0;
                if (parameters.user_info != null) {
                    i = UserInfo.ADAPTER.encodedSizeWithTag(2, parameters.user_info);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (parameters.message_info != null) {
                    i2 = MessageInfo.ADAPTER.encodedSizeWithTag(3, parameters.message_info);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (parameters.user_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, parameters.user_id);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (parameters.message_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, parameters.message_id);
                }
                return i7 + i4 + parameters.unknownFields().size();
            }

            /* renamed from: a */
            public Parameters decode(ProtoReader protoReader) throws IOException {
                C14724a aVar = new C14724a();
                aVar.f38944d = "";
                aVar.f38945e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38941a.putAll(this.f38946a.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f38942b = UserInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f38943c = MessageInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f38944d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38945e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Parameters parameters) throws IOException {
                this.f38946a.encodeWithTag(protoWriter, 1, parameters.parameters);
                if (parameters.user_info != null) {
                    UserInfo.ADAPTER.encodeWithTag(protoWriter, 2, parameters.user_info);
                }
                if (parameters.message_info != null) {
                    MessageInfo.ADAPTER.encodeWithTag(protoWriter, 3, parameters.message_info);
                }
                if (parameters.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, parameters.user_id);
                }
                if (parameters.message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, parameters.message_id);
                }
                protoWriter.writeBytes(parameters.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$Parameters$a */
        public static final class C14724a extends Message.Builder<Parameters, C14724a> {

            /* renamed from: a */
            public Map<String, String> f38941a = Internal.newMutableMap();

            /* renamed from: b */
            public UserInfo f38942b;

            /* renamed from: c */
            public MessageInfo f38943c;

            /* renamed from: d */
            public String f38944d;

            /* renamed from: e */
            public String f38945e;

            /* renamed from: a */
            public Parameters build() {
                return new Parameters(this.f38941a, this.f38942b, this.f38943c, this.f38944d, this.f38945e, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14724a mo54178a(MessageInfo messageInfo) {
                this.f38943c = messageInfo;
                return this;
            }

            /* renamed from: b */
            public C14724a mo54183b(String str) {
                this.f38945e = str;
                return this;
            }

            /* renamed from: a */
            public C14724a mo54179a(UserInfo userInfo) {
                this.f38942b = userInfo;
                return this;
            }

            /* renamed from: a */
            public C14724a mo54180a(String str) {
                this.f38944d = str;
                return this;
            }

            /* renamed from: a */
            public C14724a mo54181a(Map<String, String> map) {
                Internal.checkElementsNotNull(map);
                this.f38941a = map;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14724a newBuilder() {
            C14724a aVar = new C14724a();
            aVar.f38941a = Internal.copyOf("parameters", this.parameters);
            aVar.f38942b = this.user_info;
            aVar.f38943c = this.message_info;
            aVar.f38944d = this.user_id;
            aVar.f38945e = this.message_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Parameters");
            StringBuilder sb = new StringBuilder();
            if (!this.parameters.isEmpty()) {
                sb.append(", parameters=");
                sb.append(this.parameters);
            }
            if (this.user_info != null) {
                sb.append(", user_info=");
                sb.append(this.user_info);
            }
            if (this.message_info != null) {
                sb.append(", message_info=");
                sb.append(this.message_info);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.message_id != null) {
                sb.append(", message_id=");
                sb.append(this.message_id);
            }
            StringBuilder replace = sb.replace(0, 2, "Parameters{");
            replace.append('}');
            return replace.toString();
        }

        public Parameters(Map<String, String> map, UserInfo userInfo, MessageInfo messageInfo, String str, String str2) {
            this(map, userInfo, messageInfo, str, str2, ByteString.EMPTY);
        }

        public Parameters(Map<String, String> map, UserInfo userInfo, MessageInfo messageInfo, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.parameters = Internal.immutableCopyOf("parameters", map);
            this.user_info = userInfo;
            this.message_info = messageInfo;
            this.user_id = str;
            this.message_id = str2;
        }
    }

    @Override // com.squareup.wire.Message
    public C14732a newBuilder() {
        C14732a aVar = new C14732a();
        aVar.f38956a = this.url;
        aVar.f38957b = this.method;
        aVar.f38958c = this.required_parameters;
        aVar.f38959d = this.parameters;
        aVar.f38960e = this.cmd;
        aVar.f38961f = this.packet;
        aVar.f38962g = this.open_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CardAction");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", method=");
        sb.append(this.method);
        if (this.required_parameters != null) {
            sb.append(", required_parameters=");
            sb.append(this.required_parameters);
        }
        if (this.parameters != null) {
            sb.append(", parameters=");
            sb.append(this.parameters);
        }
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.packet != null) {
            sb.append(", packet=");
            sb.append(this.packet);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        StringBuilder replace = sb.replace(0, 2, "CardAction{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CardAction$a */
    public static final class C14732a extends Message.Builder<CardAction, C14732a> {

        /* renamed from: a */
        public String f38956a;

        /* renamed from: b */
        public Method f38957b;

        /* renamed from: c */
        public RequiredParameters f38958c;

        /* renamed from: d */
        public Parameters f38959d;

        /* renamed from: e */
        public Integer f38960e;

        /* renamed from: f */
        public CardActionPacket f38961f;

        /* renamed from: g */
        public Url f38962g;

        /* renamed from: a */
        public CardAction build() {
            Method method;
            String str = this.f38956a;
            if (str != null && (method = this.f38957b) != null) {
                return new CardAction(str, method, this.f38958c, this.f38959d, this.f38960e, this.f38961f, this.f38962g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url", this.f38957b, "method");
        }

        /* renamed from: a */
        public C14732a mo54208a(Method method) {
            this.f38957b = method;
            return this;
        }

        /* renamed from: a */
        public C14732a mo54209a(Parameters parameters) {
            this.f38959d = parameters;
            return this;
        }

        /* renamed from: a */
        public C14732a mo54210a(RequiredParameters requiredParameters) {
            this.f38958c = requiredParameters;
            return this;
        }

        /* renamed from: a */
        public C14732a mo54211a(Url url) {
            this.f38962g = url;
            return this;
        }

        /* renamed from: a */
        public C14732a mo54212a(CardActionPacket cardActionPacket) {
            this.f38961f = cardActionPacket;
            return this;
        }

        /* renamed from: a */
        public C14732a mo54213a(Integer num) {
            this.f38960e = num;
            return this;
        }

        /* renamed from: a */
        public C14732a mo54214a(String str) {
            this.f38956a = str;
            return this;
        }
    }

    public CardAction(String str, Method method2, RequiredParameters requiredParameters, Parameters parameters2, Integer num, CardActionPacket cardActionPacket, Url url2) {
        this(str, method2, requiredParameters, parameters2, num, cardActionPacket, url2, ByteString.EMPTY);
    }

    public CardAction(String str, Method method2, RequiredParameters requiredParameters, Parameters parameters2, Integer num, CardActionPacket cardActionPacket, Url url2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.method = method2;
        this.required_parameters = requiredParameters;
        this.parameters = parameters2;
        this.cmd = num;
        this.packet = cardActionPacket;
        this.open_url = url2;
    }
}
