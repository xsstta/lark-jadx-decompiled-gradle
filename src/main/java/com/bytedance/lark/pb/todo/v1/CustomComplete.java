package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class CustomComplete extends Message<CustomComplete, C19487a> {
    public static final ProtoAdapter<CustomComplete> ADAPTER = new C19488b();
    private static final long serialVersionUID = 0;

    /* renamed from: android  reason: collision with root package name */
    public final Action f175433android;
    public final Action ios;
    public final Action pc;

    /* renamed from: com.bytedance.lark.pb.todo.v1.CustomComplete$b */
    private static final class C19488b extends ProtoAdapter<CustomComplete> {
        C19488b() {
            super(FieldEncoding.LENGTH_DELIMITED, CustomComplete.class);
        }

        /* renamed from: a */
        public int encodedSize(CustomComplete customComplete) {
            int i;
            int i2;
            int i3 = 0;
            if (customComplete.f175433android != null) {
                i = Action.ADAPTER.encodedSizeWithTag(1, customComplete.f175433android);
            } else {
                i = 0;
            }
            if (customComplete.ios != null) {
                i2 = Action.ADAPTER.encodedSizeWithTag(2, customComplete.ios);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (customComplete.pc != null) {
                i3 = Action.ADAPTER.encodedSizeWithTag(3, customComplete.pc);
            }
            return i4 + i3 + customComplete.unknownFields().size();
        }

        /* renamed from: a */
        public CustomComplete decode(ProtoReader protoReader) throws IOException {
            C19487a aVar = new C19487a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47841a = Action.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47842b = Action.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47843c = Action.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CustomComplete customComplete) throws IOException {
            if (customComplete.f175433android != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 1, customComplete.f175433android);
            }
            if (customComplete.ios != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 2, customComplete.ios);
            }
            if (customComplete.pc != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 3, customComplete.pc);
            }
            protoWriter.writeBytes(customComplete.unknownFields());
        }
    }

    public static final class Action extends Message<Action, C19485a> {
        public static final ProtoAdapter<Action> ADAPTER = new C19486b();
        private static final long serialVersionUID = 0;
        public final String href;
        public final Map<String, String> tip;

        /* renamed from: com.bytedance.lark.pb.todo.v1.CustomComplete$Action$a */
        public static final class C19485a extends Message.Builder<Action, C19485a> {

            /* renamed from: a */
            public String f47838a;

            /* renamed from: b */
            public Map<String, String> f47839b = Internal.newMutableMap();

            /* renamed from: a */
            public Action build() {
                return new Action(this.f47838a, this.f47839b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.CustomComplete$Action$b */
        private static final class C19486b extends ProtoAdapter<Action> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f47840a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C19486b() {
                super(FieldEncoding.LENGTH_DELIMITED, Action.class);
            }

            /* renamed from: a */
            public int encodedSize(Action action) {
                int i;
                if (action.href != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, action.href);
                } else {
                    i = 0;
                }
                return i + this.f47840a.encodedSizeWithTag(2, action.tip) + action.unknownFields().size();
            }

            /* renamed from: a */
            public Action decode(ProtoReader protoReader) throws IOException {
                C19485a aVar = new C19485a();
                aVar.f47838a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47838a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47839b.putAll(this.f47840a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Action action) throws IOException {
                if (action.href != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, action.href);
                }
                this.f47840a.encodeWithTag(protoWriter, 2, action.tip);
                protoWriter.writeBytes(action.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19485a newBuilder() {
            C19485a aVar = new C19485a();
            aVar.f47838a = this.href;
            aVar.f47839b = Internal.copyOf("tip", this.tip);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "Action");
            StringBuilder sb = new StringBuilder();
            if (this.href != null) {
                sb.append(", href=");
                sb.append(this.href);
            }
            if (!this.tip.isEmpty()) {
                sb.append(", tip=");
                sb.append(this.tip);
            }
            StringBuilder replace = sb.replace(0, 2, "Action{");
            replace.append('}');
            return replace.toString();
        }

        public Action(String str, Map<String, String> map) {
            this(str, map, ByteString.EMPTY);
        }

        public Action(String str, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.href = str;
            this.tip = Internal.immutableCopyOf("tip", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.CustomComplete$a */
    public static final class C19487a extends Message.Builder<CustomComplete, C19487a> {

        /* renamed from: a */
        public Action f47841a;

        /* renamed from: b */
        public Action f47842b;

        /* renamed from: c */
        public Action f47843c;

        /* renamed from: a */
        public CustomComplete build() {
            return new CustomComplete(this.f47841a, this.f47842b, this.f47843c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19487a newBuilder() {
        C19487a aVar = new C19487a();
        aVar.f47841a = this.f175433android;
        aVar.f47842b = this.ios;
        aVar.f47843c = this.pc;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "CustomComplete");
        StringBuilder sb = new StringBuilder();
        if (this.f175433android != null) {
            sb.append(", android=");
            sb.append(this.f175433android);
        }
        if (this.ios != null) {
            sb.append(", ios=");
            sb.append(this.ios);
        }
        if (this.pc != null) {
            sb.append(", pc=");
            sb.append(this.pc);
        }
        StringBuilder replace = sb.replace(0, 2, "CustomComplete{");
        replace.append('}');
        return replace.toString();
    }

    public CustomComplete(Action action, Action action2, Action action3) {
        this(action, action2, action3, ByteString.EMPTY);
    }

    public CustomComplete(Action action, Action action2, Action action3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f175433android = action;
        this.ios = action2;
        this.pc = action3;
    }
}
