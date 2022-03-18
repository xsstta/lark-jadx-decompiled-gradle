package com.bytedance.lark.pb.basic.v1;

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

public final class AppConfigV2 extends Message<AppConfigV2, C14684a> {
    public static final ProtoAdapter<AppConfigV2> ADAPTER = new C14685b();
    private static final long serialVersionUID = 0;
    public final Section section;

    public static final class FeatureConf extends Message<FeatureConf, C14680a> {
        public static final ProtoAdapter<FeatureConf> ADAPTER = new C14681b();
        public static final Boolean DEFAULT_ISON = false;
        private static final long serialVersionUID = 0;
        public final Boolean isOn;
        public final String traits;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfigV2$FeatureConf$b */
        private static final class C14681b extends ProtoAdapter<FeatureConf> {
            C14681b() {
                super(FieldEncoding.LENGTH_DELIMITED, FeatureConf.class);
            }

            /* renamed from: a */
            public int encodedSize(FeatureConf featureConf) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, featureConf.isOn);
                if (featureConf.traits != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, featureConf.traits);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + featureConf.unknownFields().size();
            }

            /* renamed from: a */
            public FeatureConf decode(ProtoReader protoReader) throws IOException {
                C14680a aVar = new C14680a();
                aVar.f38811a = false;
                aVar.f38812b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38811a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38812b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FeatureConf featureConf) throws IOException {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, featureConf.isOn);
                if (featureConf.traits != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, featureConf.traits);
                }
                protoWriter.writeBytes(featureConf.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfigV2$FeatureConf$a */
        public static final class C14680a extends Message.Builder<FeatureConf, C14680a> {

            /* renamed from: a */
            public Boolean f38811a;

            /* renamed from: b */
            public String f38812b;

            /* renamed from: a */
            public FeatureConf build() {
                Boolean bool = this.f38811a;
                if (bool != null) {
                    return new FeatureConf(bool, this.f38812b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(bool, "isOn");
            }
        }

        @Override // com.squareup.wire.Message
        public C14680a newBuilder() {
            C14680a aVar = new C14680a();
            aVar.f38811a = this.isOn;
            aVar.f38812b = this.traits;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "FeatureConf");
            StringBuilder sb = new StringBuilder();
            sb.append(", isOn=");
            sb.append(this.isOn);
            if (this.traits != null) {
                sb.append(", traits=");
                sb.append(this.traits);
            }
            StringBuilder replace = sb.replace(0, 2, "FeatureConf{");
            replace.append('}');
            return replace.toString();
        }

        public FeatureConf(Boolean bool, String str) {
            this(bool, str, ByteString.EMPTY);
        }

        public FeatureConf(Boolean bool, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.isOn = bool;
            this.traits = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfigV2$b */
    private static final class C14685b extends ProtoAdapter<AppConfigV2> {
        C14685b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppConfigV2.class);
        }

        /* renamed from: a */
        public int encodedSize(AppConfigV2 appConfigV2) {
            int i;
            if (appConfigV2.section != null) {
                i = Section.ADAPTER.encodedSizeWithTag(1, appConfigV2.section);
            } else {
                i = 0;
            }
            return i + appConfigV2.unknownFields().size();
        }

        /* renamed from: a */
        public AppConfigV2 decode(ProtoReader protoReader) throws IOException {
            C14684a aVar = new C14684a();
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
                    aVar.f38815a = Section.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AppConfigV2 appConfigV2) throws IOException {
            if (appConfigV2.section != null) {
                Section.ADAPTER.encodeWithTag(protoWriter, 1, appConfigV2.section);
            }
            protoWriter.writeBytes(appConfigV2.unknownFields());
        }
    }

    public static final class Section extends Message<Section, C14682a> {
        public static final ProtoAdapter<Section> ADAPTER = new C14683b();
        private static final long serialVersionUID = 0;
        public final Map<String, FeatureConf> features;

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfigV2$Section$a */
        public static final class C14682a extends Message.Builder<Section, C14682a> {

            /* renamed from: a */
            public Map<String, FeatureConf> f38813a = Internal.newMutableMap();

            /* renamed from: a */
            public Section build() {
                return new Section(this.f38813a, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfigV2$Section$b */
        private static final class C14683b extends ProtoAdapter<Section> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, FeatureConf>> f38814a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FeatureConf.ADAPTER);

            C14683b() {
                super(FieldEncoding.LENGTH_DELIMITED, Section.class);
            }

            /* renamed from: a */
            public int encodedSize(Section section) {
                return this.f38814a.encodedSizeWithTag(2, section.features) + section.unknownFields().size();
            }

            /* renamed from: a */
            public Section decode(ProtoReader protoReader) throws IOException {
                C14682a aVar = new C14682a();
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
                        aVar.f38813a.putAll(this.f38814a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Section section) throws IOException {
                this.f38814a.encodeWithTag(protoWriter, 2, section.features);
                protoWriter.writeBytes(section.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14682a newBuilder() {
            C14682a aVar = new C14682a();
            aVar.f38813a = Internal.copyOf("features", this.features);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Section");
            StringBuilder sb = new StringBuilder();
            if (!this.features.isEmpty()) {
                sb.append(", features=");
                sb.append(this.features);
            }
            StringBuilder replace = sb.replace(0, 2, "Section{");
            replace.append('}');
            return replace.toString();
        }

        public Section(Map<String, FeatureConf> map) {
            this(map, ByteString.EMPTY);
        }

        public Section(Map<String, FeatureConf> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.features = Internal.immutableCopyOf("features", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppConfigV2$a */
    public static final class C14684a extends Message.Builder<AppConfigV2, C14684a> {

        /* renamed from: a */
        public Section f38815a;

        /* renamed from: a */
        public AppConfigV2 build() {
            return new AppConfigV2(this.f38815a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14684a newBuilder() {
        C14684a aVar = new C14684a();
        aVar.f38815a = this.section;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AppConfigV2");
        StringBuilder sb = new StringBuilder();
        if (this.section != null) {
            sb.append(", section=");
            sb.append(this.section);
        }
        StringBuilder replace = sb.replace(0, 2, "AppConfigV2{");
        replace.append('}');
        return replace.toString();
    }

    public AppConfigV2(Section section2) {
        this(section2, ByteString.EMPTY);
    }

    public AppConfigV2(Section section2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.section = section2;
    }
}
