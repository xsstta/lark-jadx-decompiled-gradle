package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.section.Action;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ActionRecommend extends Message<ActionRecommend, C49429a> {
    public static final ProtoAdapter<ActionRecommend> ADAPTER = new C49430b();
    private static final long serialVersionUID = 0;
    public final Action maction;
    public final String mbody;
    public final ActionHeader mheader;
    public final List<String> micons;
    public final ActionRecommendType mtype;

    public static final class ActionHeader extends Message<ActionHeader, C49427a> {
        public static final ProtoAdapter<ActionHeader> ADAPTER = new C49428b();
        private static final long serialVersionUID = 0;
        public final String micon_url_header;
        public final String mtext_header;
        public final ActionHeaderType mtype;

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

        /* renamed from: com.ss.android.lark.pb.ai.ActionRecommend$ActionHeader$b */
        private static final class C49428b extends ProtoAdapter<ActionHeader> {
            C49428b() {
                super(FieldEncoding.LENGTH_DELIMITED, ActionHeader.class);
            }

            /* renamed from: a */
            public int encodedSize(ActionHeader actionHeader) {
                int i;
                int encodedSizeWithTag = ActionHeaderType.ADAPTER.encodedSizeWithTag(16, actionHeader.mtype);
                int i2 = 0;
                if (actionHeader.mtext_header != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, actionHeader.mtext_header);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (actionHeader.micon_url_header != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, actionHeader.micon_url_header);
                }
                return i3 + i2 + actionHeader.unknownFields().size();
            }

            /* renamed from: a */
            public ActionHeader decode(ProtoReader protoReader) throws IOException {
                C49427a aVar = new C49427a();
                aVar.mo172494a("");
                aVar.mo172496b("");
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo172494a(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.mo172496b(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 16) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f123971a = ActionHeaderType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ActionHeader actionHeader) throws IOException {
                ActionHeaderType.ADAPTER.encodeWithTag(protoWriter, 16, actionHeader.mtype);
                if (actionHeader.mtext_header != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, actionHeader.mtext_header);
                }
                if (actionHeader.micon_url_header != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, actionHeader.micon_url_header);
                }
                protoWriter.writeBytes(actionHeader.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49427a newBuilder() {
            C49427a aVar = new C49427a();
            aVar.f123971a = this.mtype;
            aVar.f123972b = this.mtext_header;
            aVar.f123973c = this.micon_url_header;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.ai.ActionRecommend$ActionHeader$a */
        public static final class C49427a extends Message.Builder<ActionHeader, C49427a> {

            /* renamed from: a */
            public ActionHeaderType f123971a;

            /* renamed from: b */
            public String f123972b;

            /* renamed from: c */
            public String f123973c;

            /* renamed from: a */
            public ActionHeader build() {
                ActionHeaderType actionHeaderType = this.f123971a;
                if (actionHeaderType != null) {
                    return new ActionHeader(actionHeaderType, this.f123972b, this.f123973c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(actionHeaderType, "mtype");
            }

            /* renamed from: a */
            public C49427a mo172494a(String str) {
                this.f123972b = str;
                this.f123973c = null;
                return this;
            }

            /* renamed from: b */
            public C49427a mo172496b(String str) {
                this.f123973c = str;
                this.f123972b = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.mtype);
            if (this.mtext_header != null) {
                sb.append(", text_header=");
                sb.append(this.mtext_header);
            }
            if (this.micon_url_header != null) {
                sb.append(", icon_url_header=");
                sb.append(this.micon_url_header);
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
                this.mtype = actionHeaderType;
                this.mtext_header = str;
                this.micon_url_header = str2;
                return;
            }
            throw new IllegalArgumentException("at most one of mtext_header, micon_url_header may be non-null");
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

    /* renamed from: com.ss.android.lark.pb.ai.ActionRecommend$b */
    private static final class C49430b extends ProtoAdapter<ActionRecommend> {
        C49430b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionRecommend.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionRecommend actionRecommend) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, actionRecommend.mbody);
            if (actionRecommend.mheader != null) {
                i = ActionHeader.ADAPTER.encodedSizeWithTag(2, actionRecommend.mheader);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, actionRecommend.micons) + Action.ADAPTER.encodedSizeWithTag(4, actionRecommend.maction) + ActionRecommendType.ADAPTER.encodedSizeWithTag(5, actionRecommend.mtype) + actionRecommend.unknownFields().size();
        }

        /* renamed from: a */
        public ActionRecommend decode(ProtoReader protoReader) throws IOException {
            C49429a aVar = new C49429a();
            aVar.f123974a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123974a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f123975b = ActionHeader.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f123976c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f123977d = Action.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f123978e = ActionRecommendType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionRecommend actionRecommend) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, actionRecommend.mbody);
            if (actionRecommend.mheader != null) {
                ActionHeader.ADAPTER.encodeWithTag(protoWriter, 2, actionRecommend.mheader);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, actionRecommend.micons);
            Action.ADAPTER.encodeWithTag(protoWriter, 4, actionRecommend.maction);
            ActionRecommendType.ADAPTER.encodeWithTag(protoWriter, 5, actionRecommend.mtype);
            protoWriter.writeBytes(actionRecommend.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.ActionRecommend$a */
    public static final class C49429a extends Message.Builder<ActionRecommend, C49429a> {

        /* renamed from: a */
        public String f123974a;

        /* renamed from: b */
        public ActionHeader f123975b;

        /* renamed from: c */
        public List<String> f123976c = Internal.newMutableList();

        /* renamed from: d */
        public Action f123977d;

        /* renamed from: e */
        public ActionRecommendType f123978e;

        /* renamed from: a */
        public ActionRecommend build() {
            Action action;
            ActionRecommendType actionRecommendType;
            String str = this.f123974a;
            if (str != null && (action = this.f123977d) != null && (actionRecommendType = this.f123978e) != null) {
                return new ActionRecommend(str, this.f123975b, this.f123976c, action, actionRecommendType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mbody", this.f123977d, "maction", this.f123978e, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public C49429a newBuilder() {
        C49429a aVar = new C49429a();
        aVar.f123974a = this.mbody;
        aVar.f123975b = this.mheader;
        aVar.f123976c = Internal.copyOf("micons", this.micons);
        aVar.f123977d = this.maction;
        aVar.f123978e = this.mtype;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", body=");
        sb.append(this.mbody);
        if (this.mheader != null) {
            sb.append(", header=");
            sb.append(this.mheader);
        }
        if (!this.micons.isEmpty()) {
            sb.append(", icons=");
            sb.append(this.micons);
        }
        sb.append(", action=");
        sb.append(this.maction);
        sb.append(", type=");
        sb.append(this.mtype);
        StringBuilder replace = sb.replace(0, 2, "ActionRecommend{");
        replace.append('}');
        return replace.toString();
    }

    public ActionRecommend(String str, ActionHeader actionHeader, List<String> list, Action action, ActionRecommendType actionRecommendType) {
        this(str, actionHeader, list, action, actionRecommendType, ByteString.EMPTY);
    }

    public ActionRecommend(String str, ActionHeader actionHeader, List<String> list, Action action, ActionRecommendType actionRecommendType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbody = str;
        this.mheader = actionHeader;
        this.micons = Internal.immutableCopyOf("micons", list);
        this.maction = action;
        this.mtype = actionRecommendType;
    }
}
