package com.bytedance.lark.pb.search.recommend.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.sections.v1.Action;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ActionRecommend extends Message<ActionRecommend, C18763a> {
    public static final ProtoAdapter<ActionRecommend> ADAPTER = new C18764b();
    public static final ActionRecommendType DEFAULT_TYPE = ActionRecommendType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String body;
    public final ActionHeader header;
    public final List<String> icons;
    public final ActionRecommendType type;

    public static final class ActionHeader extends Message<ActionHeader, C18761a> {
        public static final ProtoAdapter<ActionHeader> ADAPTER = new C18762b();
        public static final ActionHeaderType DEFAULT_TYPE = ActionHeaderType.TEXT;
        private static final long serialVersionUID = 0;
        public final String icon_url_header;
        public final String text_header;
        public final ActionHeaderType type;

        public enum ActionHeaderType implements WireEnum {
            TEXT(1),
            ICON_URL(2);
            
            public static final ProtoAdapter<ActionHeaderType> ADAPTER = ProtoAdapter.newEnumAdapter(ActionHeaderType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static ActionHeaderType fromValue(int i) {
                if (i == 1) {
                    return TEXT;
                }
                if (i != 2) {
                    return null;
                }
                return ICON_URL;
            }

            private ActionHeaderType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.recommend.v1.ActionRecommend$ActionHeader$b */
        private static final class C18762b extends ProtoAdapter<ActionHeader> {
            C18762b() {
                super(FieldEncoding.LENGTH_DELIMITED, ActionHeader.class);
            }

            /* renamed from: a */
            public int encodedSize(ActionHeader actionHeader) {
                int i;
                int encodedSizeWithTag = ActionHeaderType.ADAPTER.encodedSizeWithTag(16, actionHeader.type);
                int i2 = 0;
                if (actionHeader.text_header != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, actionHeader.text_header);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (actionHeader.icon_url_header != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, actionHeader.icon_url_header);
                }
                return i3 + i2 + actionHeader.unknownFields().size();
            }

            /* renamed from: a */
            public ActionHeader decode(ProtoReader protoReader) throws IOException {
                C18761a aVar = new C18761a();
                aVar.f46312a = ActionHeaderType.TEXT;
                aVar.mo64483a("");
                aVar.mo64485b("");
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo64483a(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.mo64485b(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 16) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f46312a = ActionHeaderType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ActionHeader actionHeader) throws IOException {
                ActionHeaderType.ADAPTER.encodeWithTag(protoWriter, 16, actionHeader.type);
                if (actionHeader.text_header != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, actionHeader.text_header);
                }
                if (actionHeader.icon_url_header != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, actionHeader.icon_url_header);
                }
                protoWriter.writeBytes(actionHeader.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18761a newBuilder() {
            C18761a aVar = new C18761a();
            aVar.f46312a = this.type;
            aVar.f46313b = this.text_header;
            aVar.f46314c = this.icon_url_header;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.recommend.v1.ActionRecommend$ActionHeader$a */
        public static final class C18761a extends Message.Builder<ActionHeader, C18761a> {

            /* renamed from: a */
            public ActionHeaderType f46312a;

            /* renamed from: b */
            public String f46313b;

            /* renamed from: c */
            public String f46314c;

            /* renamed from: a */
            public ActionHeader build() {
                ActionHeaderType actionHeaderType = this.f46312a;
                if (actionHeaderType != null) {
                    return new ActionHeader(actionHeaderType, this.f46313b, this.f46314c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(actionHeaderType, ShareHitPoint.f121869d);
            }

            /* renamed from: a */
            public C18761a mo64483a(String str) {
                this.f46313b = str;
                this.f46314c = null;
                return this;
            }

            /* renamed from: b */
            public C18761a mo64485b(String str) {
                this.f46314c = str;
                this.f46313b = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ActionHeader");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (this.text_header != null) {
                sb.append(", text_header=");
                sb.append(this.text_header);
            }
            if (this.icon_url_header != null) {
                sb.append(", icon_url_header=");
                sb.append(this.icon_url_header);
            }
            StringBuilder replace = sb.replace(0, 2, "ActionHeader{");
            replace.append('}');
            return replace.toString();
        }

        public ActionHeader(ActionHeaderType actionHeaderType, String str, String str2) {
            this(actionHeaderType, str, str2, ByteString.EMPTY);
        }

        public ActionHeader(ActionHeaderType actionHeaderType, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(str, str2) <= 1) {
                this.type = actionHeaderType;
                this.text_header = str;
                this.icon_url_header = str2;
                return;
            }
            throw new IllegalArgumentException("at most one of text_header, icon_url_header may be non-null");
        }
    }

    public enum ActionRecommendType implements WireEnum {
        UNKNOWN(0),
        FEATURES_RECOMMEND(1),
        OPERATION_RECOMMEND(2);
        
        public static final ProtoAdapter<ActionRecommendType> ADAPTER = ProtoAdapter.newEnumAdapter(ActionRecommendType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionRecommendType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FEATURES_RECOMMEND;
            }
            if (i != 2) {
                return null;
            }
            return OPERATION_RECOMMEND;
        }

        private ActionRecommendType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.ActionRecommend$b */
    private static final class C18764b extends ProtoAdapter<ActionRecommend> {
        C18764b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionRecommend.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionRecommend actionRecommend) {
            int i;
            if (actionRecommend.header != null) {
                i = ActionHeader.ADAPTER.encodedSizeWithTag(1, actionRecommend.header);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.encodedSizeWithTag(2, actionRecommend.body) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, actionRecommend.icons) + Action.ADAPTER.encodedSizeWithTag(4, actionRecommend.action) + ActionRecommendType.ADAPTER.encodedSizeWithTag(5, actionRecommend.type) + actionRecommend.unknownFields().size();
        }

        /* renamed from: a */
        public ActionRecommend decode(ProtoReader protoReader) throws IOException {
            C18763a aVar = new C18763a();
            aVar.f46316b = "";
            aVar.f46319e = ActionRecommendType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46315a = ActionHeader.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46316b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46317c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f46318d = Action.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46319e = ActionRecommendType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionRecommend actionRecommend) throws IOException {
            if (actionRecommend.header != null) {
                ActionHeader.ADAPTER.encodeWithTag(protoWriter, 1, actionRecommend.header);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, actionRecommend.body);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, actionRecommend.icons);
            Action.ADAPTER.encodeWithTag(protoWriter, 4, actionRecommend.action);
            ActionRecommendType.ADAPTER.encodeWithTag(protoWriter, 5, actionRecommend.type);
            protoWriter.writeBytes(actionRecommend.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.ActionRecommend$a */
    public static final class C18763a extends Message.Builder<ActionRecommend, C18763a> {

        /* renamed from: a */
        public ActionHeader f46315a;

        /* renamed from: b */
        public String f46316b;

        /* renamed from: c */
        public List<String> f46317c = Internal.newMutableList();

        /* renamed from: d */
        public Action f46318d;

        /* renamed from: e */
        public ActionRecommendType f46319e;

        /* renamed from: a */
        public ActionRecommend build() {
            Action action;
            ActionRecommendType actionRecommendType;
            String str = this.f46316b;
            if (str != null && (action = this.f46318d) != null && (actionRecommendType = this.f46319e) != null) {
                return new ActionRecommend(this.f46315a, str, this.f46317c, action, actionRecommendType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "body", this.f46318d, "action", this.f46319e, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C18763a newBuilder() {
        C18763a aVar = new C18763a();
        aVar.f46315a = this.header;
        aVar.f46316b = this.body;
        aVar.f46317c = Internal.copyOf("icons", this.icons);
        aVar.f46318d = this.action;
        aVar.f46319e = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ActionRecommend");
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        sb.append(", body=");
        sb.append(this.body);
        if (!this.icons.isEmpty()) {
            sb.append(", icons=");
            sb.append(this.icons);
        }
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", type=");
        sb.append(this.type);
        StringBuilder replace = sb.replace(0, 2, "ActionRecommend{");
        replace.append('}');
        return replace.toString();
    }

    public ActionRecommend(ActionHeader actionHeader, String str, List<String> list, Action action2, ActionRecommendType actionRecommendType) {
        this(actionHeader, str, list, action2, actionRecommendType, ByteString.EMPTY);
    }

    public ActionRecommend(ActionHeader actionHeader, String str, List<String> list, Action action2, ActionRecommendType actionRecommendType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = actionHeader;
        this.body = str;
        this.icons = Internal.immutableCopyOf("icons", list);
        this.action = action2;
        this.type = actionRecommendType;
    }
}
