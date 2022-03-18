package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class NotificationSetting extends Message<NotificationSetting, C19179a> {
    public static final ProtoAdapter<NotificationSetting> ADAPTER = new C19180b();
    public static final Boolean DEFAULT_ALL = false;
    public static final Boolean DEFAULT_NONE = false;
    private static final long serialVersionUID = 0;
    public final Boolean all;
    public final Boolean none;
    public final SpecificMessages specific_messages;

    public static final class SpecificMessages extends Message<SpecificMessages, C19177a> {
        public static final ProtoAdapter<SpecificMessages> ADAPTER = new C19178b();
        public static final Boolean DEFAULT_BUZZ = false;
        public static final Boolean DEFAULT_MENTION = false;
        private static final long serialVersionUID = 0;
        public final Boolean buzz;
        public final Boolean mention;

        /* renamed from: com.bytedance.lark.pb.settings.v1.NotificationSetting$SpecificMessages$b */
        private static final class C19178b extends ProtoAdapter<SpecificMessages> {
            C19178b() {
                super(FieldEncoding.LENGTH_DELIMITED, SpecificMessages.class);
            }

            /* renamed from: a */
            public int encodedSize(SpecificMessages specificMessages) {
                int i;
                int i2 = 0;
                if (specificMessages.mention != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, specificMessages.mention);
                } else {
                    i = 0;
                }
                if (specificMessages.buzz != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, specificMessages.buzz);
                }
                return i + i2 + specificMessages.unknownFields().size();
            }

            /* renamed from: a */
            public SpecificMessages decode(ProtoReader protoReader) throws IOException {
                C19177a aVar = new C19177a();
                aVar.f47334a = false;
                aVar.f47335b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47334a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47335b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SpecificMessages specificMessages) throws IOException {
                if (specificMessages.mention != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, specificMessages.mention);
                }
                if (specificMessages.buzz != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, specificMessages.buzz);
                }
                protoWriter.writeBytes(specificMessages.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.settings.v1.NotificationSetting$SpecificMessages$a */
        public static final class C19177a extends Message.Builder<SpecificMessages, C19177a> {

            /* renamed from: a */
            public Boolean f47334a;

            /* renamed from: b */
            public Boolean f47335b;

            /* renamed from: a */
            public SpecificMessages build() {
                return new SpecificMessages(this.f47334a, this.f47335b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19177a newBuilder() {
            C19177a aVar = new C19177a();
            aVar.f47334a = this.mention;
            aVar.f47335b = this.buzz;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("settings", "SpecificMessages");
            StringBuilder sb = new StringBuilder();
            if (this.mention != null) {
                sb.append(", mention=");
                sb.append(this.mention);
            }
            if (this.buzz != null) {
                sb.append(", buzz=");
                sb.append(this.buzz);
            }
            StringBuilder replace = sb.replace(0, 2, "SpecificMessages{");
            replace.append('}');
            return replace.toString();
        }

        public SpecificMessages(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public SpecificMessages(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mention = bool;
            this.buzz = bool2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.NotificationSetting$b */
    private static final class C19180b extends ProtoAdapter<NotificationSetting> {
        C19180b() {
            super(FieldEncoding.LENGTH_DELIMITED, NotificationSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(NotificationSetting notificationSetting) {
            int i;
            int i2;
            int i3 = 0;
            if (notificationSetting.all != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, notificationSetting.all);
            } else {
                i = 0;
            }
            if (notificationSetting.specific_messages != null) {
                i2 = SpecificMessages.ADAPTER.encodedSizeWithTag(2, notificationSetting.specific_messages);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (notificationSetting.none != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, notificationSetting.none);
            }
            return i4 + i3 + notificationSetting.unknownFields().size();
        }

        /* renamed from: a */
        public NotificationSetting decode(ProtoReader protoReader) throws IOException {
            C19179a aVar = new C19179a();
            aVar.mo65520a((Boolean) false);
            aVar.mo65522b(false);
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.mo65520a(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.mo65519a(SpecificMessages.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo65522b(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NotificationSetting notificationSetting) throws IOException {
            if (notificationSetting.all != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, notificationSetting.all);
            }
            if (notificationSetting.specific_messages != null) {
                SpecificMessages.ADAPTER.encodeWithTag(protoWriter, 2, notificationSetting.specific_messages);
            }
            if (notificationSetting.none != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, notificationSetting.none);
            }
            protoWriter.writeBytes(notificationSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.NotificationSetting$a */
    public static final class C19179a extends Message.Builder<NotificationSetting, C19179a> {

        /* renamed from: a */
        public Boolean f47336a;

        /* renamed from: b */
        public SpecificMessages f47337b;

        /* renamed from: c */
        public Boolean f47338c;

        /* renamed from: a */
        public NotificationSetting build() {
            return new NotificationSetting(this.f47336a, this.f47337b, this.f47338c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19179a mo65519a(SpecificMessages specificMessages) {
            this.f47337b = specificMessages;
            this.f47336a = null;
            this.f47338c = null;
            return this;
        }

        /* renamed from: b */
        public C19179a mo65522b(Boolean bool) {
            this.f47338c = bool;
            this.f47336a = null;
            this.f47337b = null;
            return this;
        }

        /* renamed from: a */
        public C19179a mo65520a(Boolean bool) {
            this.f47336a = bool;
            this.f47337b = null;
            this.f47338c = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19179a newBuilder() {
        C19179a aVar = new C19179a();
        aVar.f47336a = this.all;
        aVar.f47337b = this.specific_messages;
        aVar.f47338c = this.none;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "NotificationSetting");
        StringBuilder sb = new StringBuilder();
        if (this.all != null) {
            sb.append(", all=");
            sb.append(this.all);
        }
        if (this.specific_messages != null) {
            sb.append(", specific_messages=");
            sb.append(this.specific_messages);
        }
        if (this.none != null) {
            sb.append(", none=");
            sb.append(this.none);
        }
        StringBuilder replace = sb.replace(0, 2, "NotificationSetting{");
        replace.append('}');
        return replace.toString();
    }

    public NotificationSetting(Boolean bool, SpecificMessages specificMessages, Boolean bool2) {
        this(bool, specificMessages, bool2, ByteString.EMPTY);
    }

    public NotificationSetting(Boolean bool, SpecificMessages specificMessages, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(bool, specificMessages, bool2) <= 1) {
            this.all = bool;
            this.specific_messages = specificMessages;
            this.none = bool2;
            return;
        }
        throw new IllegalArgumentException("at most one of all, specific_messages, none may be non-null");
    }
}
