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
import okio.ByteString;

public final class LogPathWithType extends Message<LogPathWithType, C15041a> {
    public static final ProtoAdapter<LogPathWithType> ADAPTER = new C15042b();
    public static final LogOrigin DEFAULT_LOG_ORIGIN = LogOrigin.MAIN;
    public static final LogType DEFAULT_LOG_TYPE = LogType.XLOG;
    private static final long serialVersionUID = 0;
    public final LogOrigin log_origin;
    public final String log_path;
    public final LogType log_type;

    public enum LogOrigin implements WireEnum {
        MAIN(1),
        DOCS(2),
        MINIAPP(3);
        
        public static final ProtoAdapter<LogOrigin> ADAPTER = ProtoAdapter.newEnumAdapter(LogOrigin.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LogOrigin fromValue(int i) {
            if (i == 1) {
                return MAIN;
            }
            if (i == 2) {
                return DOCS;
            }
            if (i != 3) {
                return null;
            }
            return MINIAPP;
        }

        private LogOrigin(int i) {
            this.value = i;
        }
    }

    public enum LogType implements WireEnum {
        XLOG(1),
        METRIC(2);
        
        public static final ProtoAdapter<LogType> ADAPTER = ProtoAdapter.newEnumAdapter(LogType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LogType fromValue(int i) {
            if (i == 1) {
                return XLOG;
            }
            if (i != 2) {
                return null;
            }
            return METRIC;
        }

        private LogType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.LogPathWithType$b */
    private static final class C15042b extends ProtoAdapter<LogPathWithType> {
        C15042b() {
            super(FieldEncoding.LENGTH_DELIMITED, LogPathWithType.class);
        }

        /* renamed from: a */
        public int encodedSize(LogPathWithType logPathWithType) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, logPathWithType.log_path) + LogType.ADAPTER.encodedSizeWithTag(2, logPathWithType.log_type);
            if (logPathWithType.log_origin != null) {
                i = LogOrigin.ADAPTER.encodedSizeWithTag(3, logPathWithType.log_origin);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + logPathWithType.unknownFields().size();
        }

        /* renamed from: a */
        public LogPathWithType decode(ProtoReader protoReader) throws IOException {
            C15041a aVar = new C15041a();
            aVar.f39793a = "";
            aVar.f39794b = LogType.XLOG;
            aVar.f39795c = LogOrigin.MAIN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39793a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f39794b = LogType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f39795c = LogOrigin.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LogPathWithType logPathWithType) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, logPathWithType.log_path);
            LogType.ADAPTER.encodeWithTag(protoWriter, 2, logPathWithType.log_type);
            if (logPathWithType.log_origin != null) {
                LogOrigin.ADAPTER.encodeWithTag(protoWriter, 3, logPathWithType.log_origin);
            }
            protoWriter.writeBytes(logPathWithType.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15041a newBuilder() {
        C15041a aVar = new C15041a();
        aVar.f39793a = this.log_path;
        aVar.f39794b = this.log_type;
        aVar.f39795c = this.log_origin;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.LogPathWithType$a */
    public static final class C15041a extends Message.Builder<LogPathWithType, C15041a> {

        /* renamed from: a */
        public String f39793a;

        /* renamed from: b */
        public LogType f39794b;

        /* renamed from: c */
        public LogOrigin f39795c;

        /* renamed from: a */
        public LogPathWithType build() {
            LogType logType;
            String str = this.f39793a;
            if (str != null && (logType = this.f39794b) != null) {
                return new LogPathWithType(str, logType, this.f39795c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "log_path", this.f39794b, "log_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "LogPathWithType");
        StringBuilder sb = new StringBuilder();
        sb.append(", log_path=");
        sb.append(this.log_path);
        sb.append(", log_type=");
        sb.append(this.log_type);
        if (this.log_origin != null) {
            sb.append(", log_origin=");
            sb.append(this.log_origin);
        }
        StringBuilder replace = sb.replace(0, 2, "LogPathWithType{");
        replace.append('}');
        return replace.toString();
    }

    public LogPathWithType(String str, LogType logType, LogOrigin logOrigin) {
        this(str, logType, logOrigin, ByteString.EMPTY);
    }

    public LogPathWithType(String str, LogType logType, LogOrigin logOrigin, ByteString byteString) {
        super(ADAPTER, byteString);
        this.log_path = str;
        this.log_type = logType;
        this.log_origin = logOrigin;
    }
}
