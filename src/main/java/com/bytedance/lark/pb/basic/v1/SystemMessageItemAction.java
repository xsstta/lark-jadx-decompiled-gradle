package com.bytedance.lark.pb.basic.v1;

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

public final class SystemMessageItemAction extends Message<SystemMessageItemAction, C15304a> {
    public static final ProtoAdapter<SystemMessageItemAction> ADAPTER = new C15305b();
    private static final long serialVersionUID = 0;
    public final InviteAtChatters invite_at_chatters;
    public final LarkCommand lark_command;
    public final Url url;

    public static final class InviteAtChatters extends Message<InviteAtChatters, C15298a> {
        public static final ProtoAdapter<InviteAtChatters> ADAPTER = new C15299b();
        private static final long serialVersionUID = 0;
        public final List<Long> at_chatter_ids;

        /* renamed from: com.bytedance.lark.pb.basic.v1.SystemMessageItemAction$InviteAtChatters$b */
        private static final class C15299b extends ProtoAdapter<InviteAtChatters> {
            C15299b() {
                super(FieldEncoding.LENGTH_DELIMITED, InviteAtChatters.class);
            }

            /* renamed from: a */
            public int encodedSize(InviteAtChatters inviteAtChatters) {
                return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, inviteAtChatters.at_chatter_ids) + inviteAtChatters.unknownFields().size();
            }

            /* renamed from: a */
            public InviteAtChatters decode(ProtoReader protoReader) throws IOException {
                C15298a aVar = new C15298a();
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
                        aVar.f40503a.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, InviteAtChatters inviteAtChatters) throws IOException {
                ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, inviteAtChatters.at_chatter_ids);
                protoWriter.writeBytes(inviteAtChatters.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.SystemMessageItemAction$InviteAtChatters$a */
        public static final class C15298a extends Message.Builder<InviteAtChatters, C15298a> {

            /* renamed from: a */
            public List<Long> f40503a = Internal.newMutableList();

            /* renamed from: a */
            public InviteAtChatters build() {
                return new InviteAtChatters(this.f40503a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15298a newBuilder() {
            C15298a aVar = new C15298a();
            aVar.f40503a = Internal.copyOf("at_chatter_ids", this.at_chatter_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "InviteAtChatters");
            StringBuilder sb = new StringBuilder();
            if (!this.at_chatter_ids.isEmpty()) {
                sb.append(", at_chatter_ids=");
                sb.append(this.at_chatter_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "InviteAtChatters{");
            replace.append('}');
            return replace.toString();
        }

        public InviteAtChatters(List<Long> list) {
            this(list, ByteString.EMPTY);
        }

        public InviteAtChatters(List<Long> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.at_chatter_ids = Internal.immutableCopyOf("at_chatter_ids", list);
        }
    }

    public static final class LarkCommand extends Message<LarkCommand, C15300a> {
        public static final ProtoAdapter<LarkCommand> ADAPTER = new C15301b();
        public static final Integer DEFAULT_CMD = 0;
        public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
        private static final long serialVersionUID = 0;
        public final Integer cmd;
        public final ByteString payload;

        /* renamed from: com.bytedance.lark.pb.basic.v1.SystemMessageItemAction$LarkCommand$b */
        private static final class C15301b extends ProtoAdapter<LarkCommand> {
            C15301b() {
                super(FieldEncoding.LENGTH_DELIMITED, LarkCommand.class);
            }

            /* renamed from: a */
            public int encodedSize(LarkCommand larkCommand) {
                int i;
                int i2 = 0;
                if (larkCommand.payload != null) {
                    i = ProtoAdapter.BYTES.encodedSizeWithTag(1, larkCommand.payload);
                } else {
                    i = 0;
                }
                if (larkCommand.cmd != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, larkCommand.cmd);
                }
                return i + i2 + larkCommand.unknownFields().size();
            }

            /* renamed from: a */
            public LarkCommand decode(ProtoReader protoReader) throws IOException {
                C15300a aVar = new C15300a();
                aVar.f40504a = ByteString.EMPTY;
                aVar.f40505b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40504a = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40505b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LarkCommand larkCommand) throws IOException {
                if (larkCommand.payload != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, larkCommand.payload);
                }
                if (larkCommand.cmd != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, larkCommand.cmd);
                }
                protoWriter.writeBytes(larkCommand.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.SystemMessageItemAction$LarkCommand$a */
        public static final class C15300a extends Message.Builder<LarkCommand, C15300a> {

            /* renamed from: a */
            public ByteString f40504a;

            /* renamed from: b */
            public Integer f40505b;

            /* renamed from: a */
            public LarkCommand build() {
                return new LarkCommand(this.f40504a, this.f40505b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15300a newBuilder() {
            C15300a aVar = new C15300a();
            aVar.f40504a = this.payload;
            aVar.f40505b = this.cmd;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "LarkCommand");
            StringBuilder sb = new StringBuilder();
            if (this.payload != null) {
                sb.append(", payload=");
                sb.append(this.payload);
            }
            if (this.cmd != null) {
                sb.append(", cmd=");
                sb.append(this.cmd);
            }
            StringBuilder replace = sb.replace(0, 2, "LarkCommand{");
            replace.append('}');
            return replace.toString();
        }

        public LarkCommand(ByteString byteString, Integer num) {
            this(byteString, num, ByteString.EMPTY);
        }

        public LarkCommand(ByteString byteString, Integer num, ByteString byteString2) {
            super(ADAPTER, byteString2);
            this.payload = byteString;
            this.cmd = num;
        }
    }

    public static final class Url extends Message<Url, C15302a> {
        public static final ProtoAdapter<Url> ADAPTER = new C15303b();
        private static final long serialVersionUID = 0;

        /* renamed from: android  reason: collision with root package name */
        public final String f175429android;
        public final String common;
        public final String ios;
        public final String pc;
        public final String web;

        /* renamed from: com.bytedance.lark.pb.basic.v1.SystemMessageItemAction$Url$b */
        private static final class C15303b extends ProtoAdapter<Url> {
            C15303b() {
                super(FieldEncoding.LENGTH_DELIMITED, Url.class);
            }

            /* renamed from: a */
            public int encodedSize(Url url) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (url.ios != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, url.ios);
                } else {
                    i = 0;
                }
                if (url.f175429android != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, url.f175429android);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (url.pc != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, url.pc);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (url.web != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, url.web);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (url.common != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, url.common);
                }
                return i8 + i5 + url.unknownFields().size();
            }

            /* renamed from: a */
            public Url decode(ProtoReader protoReader) throws IOException {
                C15302a aVar = new C15302a();
                aVar.f40506a = "";
                aVar.f40507b = "";
                aVar.f40508c = "";
                aVar.f40509d = "";
                aVar.f40510e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40506a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40507b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f40508c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f40509d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40510e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Url url) throws IOException {
                if (url.ios != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, url.ios);
                }
                if (url.f175429android != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, url.f175429android);
                }
                if (url.pc != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, url.pc);
                }
                if (url.web != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, url.web);
                }
                if (url.common != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, url.common);
                }
                protoWriter.writeBytes(url.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.SystemMessageItemAction$Url$a */
        public static final class C15302a extends Message.Builder<Url, C15302a> {

            /* renamed from: a */
            public String f40506a;

            /* renamed from: b */
            public String f40507b;

            /* renamed from: c */
            public String f40508c;

            /* renamed from: d */
            public String f40509d;

            /* renamed from: e */
            public String f40510e;

            /* renamed from: a */
            public Url build() {
                return new Url(this.f40506a, this.f40507b, this.f40508c, this.f40509d, this.f40510e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15302a newBuilder() {
            C15302a aVar = new C15302a();
            aVar.f40506a = this.ios;
            aVar.f40507b = this.f175429android;
            aVar.f40508c = this.pc;
            aVar.f40509d = this.web;
            aVar.f40510e = this.common;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Url");
            StringBuilder sb = new StringBuilder();
            if (this.ios != null) {
                sb.append(", ios=");
                sb.append(this.ios);
            }
            if (this.f175429android != null) {
                sb.append(", android=");
                sb.append(this.f175429android);
            }
            if (this.pc != null) {
                sb.append(", pc=");
                sb.append(this.pc);
            }
            if (this.web != null) {
                sb.append(", web=");
                sb.append(this.web);
            }
            if (this.common != null) {
                sb.append(", common=");
                sb.append(this.common);
            }
            StringBuilder replace = sb.replace(0, 2, "Url{");
            replace.append('}');
            return replace.toString();
        }

        public Url(String str, String str2, String str3, String str4, String str5) {
            this(str, str2, str3, str4, str5, ByteString.EMPTY);
        }

        public Url(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.ios = str;
            this.f175429android = str2;
            this.pc = str3;
            this.web = str4;
            this.common = str5;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SystemMessageItemAction$b */
    private static final class C15305b extends ProtoAdapter<SystemMessageItemAction> {
        C15305b() {
            super(FieldEncoding.LENGTH_DELIMITED, SystemMessageItemAction.class);
        }

        /* renamed from: a */
        public int encodedSize(SystemMessageItemAction systemMessageItemAction) {
            int i;
            int i2;
            int i3 = 0;
            if (systemMessageItemAction.invite_at_chatters != null) {
                i = InviteAtChatters.ADAPTER.encodedSizeWithTag(1, systemMessageItemAction.invite_at_chatters);
            } else {
                i = 0;
            }
            if (systemMessageItemAction.url != null) {
                i2 = Url.ADAPTER.encodedSizeWithTag(2, systemMessageItemAction.url);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (systemMessageItemAction.lark_command != null) {
                i3 = LarkCommand.ADAPTER.encodedSizeWithTag(3, systemMessageItemAction.lark_command);
            }
            return i4 + i3 + systemMessageItemAction.unknownFields().size();
        }

        /* renamed from: a */
        public SystemMessageItemAction decode(ProtoReader protoReader) throws IOException {
            C15304a aVar = new C15304a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.mo55660a(InviteAtChatters.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.mo55662a(Url.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo55661a(LarkCommand.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SystemMessageItemAction systemMessageItemAction) throws IOException {
            if (systemMessageItemAction.invite_at_chatters != null) {
                InviteAtChatters.ADAPTER.encodeWithTag(protoWriter, 1, systemMessageItemAction.invite_at_chatters);
            }
            if (systemMessageItemAction.url != null) {
                Url.ADAPTER.encodeWithTag(protoWriter, 2, systemMessageItemAction.url);
            }
            if (systemMessageItemAction.lark_command != null) {
                LarkCommand.ADAPTER.encodeWithTag(protoWriter, 3, systemMessageItemAction.lark_command);
            }
            protoWriter.writeBytes(systemMessageItemAction.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15304a newBuilder() {
        C15304a aVar = new C15304a();
        aVar.f40511a = this.invite_at_chatters;
        aVar.f40512b = this.url;
        aVar.f40513c = this.lark_command;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SystemMessageItemAction$a */
    public static final class C15304a extends Message.Builder<SystemMessageItemAction, C15304a> {

        /* renamed from: a */
        public InviteAtChatters f40511a;

        /* renamed from: b */
        public Url f40512b;

        /* renamed from: c */
        public LarkCommand f40513c;

        /* renamed from: a */
        public SystemMessageItemAction build() {
            return new SystemMessageItemAction(this.f40511a, this.f40512b, this.f40513c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15304a mo55660a(InviteAtChatters inviteAtChatters) {
            this.f40511a = inviteAtChatters;
            this.f40512b = null;
            this.f40513c = null;
            return this;
        }

        /* renamed from: a */
        public C15304a mo55661a(LarkCommand larkCommand) {
            this.f40513c = larkCommand;
            this.f40511a = null;
            this.f40512b = null;
            return this;
        }

        /* renamed from: a */
        public C15304a mo55662a(Url url) {
            this.f40512b = url;
            this.f40511a = null;
            this.f40513c = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SystemMessageItemAction");
        StringBuilder sb = new StringBuilder();
        if (this.invite_at_chatters != null) {
            sb.append(", invite_at_chatters=");
            sb.append(this.invite_at_chatters);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.lark_command != null) {
            sb.append(", lark_command=");
            sb.append(this.lark_command);
        }
        StringBuilder replace = sb.replace(0, 2, "SystemMessageItemAction{");
        replace.append('}');
        return replace.toString();
    }

    public SystemMessageItemAction(InviteAtChatters inviteAtChatters, Url url2, LarkCommand larkCommand) {
        this(inviteAtChatters, url2, larkCommand, ByteString.EMPTY);
    }

    public SystemMessageItemAction(InviteAtChatters inviteAtChatters, Url url2, LarkCommand larkCommand, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(inviteAtChatters, url2, larkCommand) <= 1) {
            this.invite_at_chatters = inviteAtChatters;
            this.url = url2;
            this.lark_command = larkCommand;
            return;
        }
        throw new IllegalArgumentException("at most one of invite_at_chatters, url, lark_command may be non-null");
    }
}
