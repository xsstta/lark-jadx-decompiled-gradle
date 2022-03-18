package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ResourceCheckInStrategy extends Message<ResourceCheckInStrategy, C15976a> {
    public static final ProtoAdapter<ResourceCheckInStrategy> ADAPTER = new C15977b();
    public static final Long DEFAULT_DURATION_AFTER_START_CHECK_IN = 0L;
    public static final Long DEFAULT_DURATION_BEFORE_START_CHECK_IN = 0L;
    public static final Boolean DEFAULT_IS_QR_CHECK_IN_ENABLE = false;
    public static final QRCodeStatus DEFAULT_QR_STATUS = QRCodeStatus.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Long duration_after_start_check_in;
    public final Long duration_before_start_check_in;
    public final Boolean is_qr_check_in_enable;
    public final QRCodeStatus qr_status;

    public enum QRCodeStatus implements WireEnum {
        UNKNOWN(0),
        ACTIVATED(1),
        INACTIVATED(2),
        FIRST_ACTIVATED(3);
        
        public static final ProtoAdapter<QRCodeStatus> ADAPTER = ProtoAdapter.newEnumAdapter(QRCodeStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static QRCodeStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ACTIVATED;
            }
            if (i == 2) {
                return INACTIVATED;
            }
            if (i != 3) {
                return null;
            }
            return FIRST_ACTIVATED;
        }

        private QRCodeStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ResourceCheckInStrategy$b */
    private static final class C15977b extends ProtoAdapter<ResourceCheckInStrategy> {
        C15977b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResourceCheckInStrategy.class);
        }

        /* renamed from: a */
        public int encodedSize(ResourceCheckInStrategy resourceCheckInStrategy) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (resourceCheckInStrategy.duration_before_start_check_in != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, resourceCheckInStrategy.duration_before_start_check_in);
            } else {
                i = 0;
            }
            if (resourceCheckInStrategy.duration_after_start_check_in != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, resourceCheckInStrategy.duration_after_start_check_in);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (resourceCheckInStrategy.qr_status != null) {
                i3 = QRCodeStatus.ADAPTER.encodedSizeWithTag(3, resourceCheckInStrategy.qr_status);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (resourceCheckInStrategy.is_qr_check_in_enable != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, resourceCheckInStrategy.is_qr_check_in_enable);
            }
            return i6 + i4 + resourceCheckInStrategy.unknownFields().size();
        }

        /* renamed from: a */
        public ResourceCheckInStrategy decode(ProtoReader protoReader) throws IOException {
            C15976a aVar = new C15976a();
            aVar.f41975a = 0L;
            aVar.f41976b = 0L;
            aVar.f41977c = QRCodeStatus.UNKNOWN;
            aVar.f41978d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41975a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41976b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f41977c = QRCodeStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41978d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResourceCheckInStrategy resourceCheckInStrategy) throws IOException {
            if (resourceCheckInStrategy.duration_before_start_check_in != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, resourceCheckInStrategy.duration_before_start_check_in);
            }
            if (resourceCheckInStrategy.duration_after_start_check_in != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, resourceCheckInStrategy.duration_after_start_check_in);
            }
            if (resourceCheckInStrategy.qr_status != null) {
                QRCodeStatus.ADAPTER.encodeWithTag(protoWriter, 3, resourceCheckInStrategy.qr_status);
            }
            if (resourceCheckInStrategy.is_qr_check_in_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, resourceCheckInStrategy.is_qr_check_in_enable);
            }
            protoWriter.writeBytes(resourceCheckInStrategy.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ResourceCheckInStrategy$a */
    public static final class C15976a extends Message.Builder<ResourceCheckInStrategy, C15976a> {

        /* renamed from: a */
        public Long f41975a;

        /* renamed from: b */
        public Long f41976b;

        /* renamed from: c */
        public QRCodeStatus f41977c;

        /* renamed from: d */
        public Boolean f41978d;

        /* renamed from: a */
        public ResourceCheckInStrategy build() {
            return new ResourceCheckInStrategy(this.f41975a, this.f41976b, this.f41977c, this.f41978d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15976a newBuilder() {
        C15976a aVar = new C15976a();
        aVar.f41975a = this.duration_before_start_check_in;
        aVar.f41976b = this.duration_after_start_check_in;
        aVar.f41977c = this.qr_status;
        aVar.f41978d = this.is_qr_check_in_enable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ResourceCheckInStrategy");
        StringBuilder sb = new StringBuilder();
        if (this.duration_before_start_check_in != null) {
            sb.append(", duration_before_start_check_in=");
            sb.append(this.duration_before_start_check_in);
        }
        if (this.duration_after_start_check_in != null) {
            sb.append(", duration_after_start_check_in=");
            sb.append(this.duration_after_start_check_in);
        }
        if (this.qr_status != null) {
            sb.append(", qr_status=");
            sb.append(this.qr_status);
        }
        if (this.is_qr_check_in_enable != null) {
            sb.append(", is_qr_check_in_enable=");
            sb.append(this.is_qr_check_in_enable);
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceCheckInStrategy{");
        replace.append('}');
        return replace.toString();
    }

    public ResourceCheckInStrategy(Long l, Long l2, QRCodeStatus qRCodeStatus, Boolean bool) {
        this(l, l2, qRCodeStatus, bool, ByteString.EMPTY);
    }

    public ResourceCheckInStrategy(Long l, Long l2, QRCodeStatus qRCodeStatus, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.duration_before_start_check_in = l;
        this.duration_after_start_check_in = l2;
        this.qr_status = qRCodeStatus;
        this.is_qr_check_in_enable = bool;
    }
}
