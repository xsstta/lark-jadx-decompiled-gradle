package com.bytedance.ee.bear.rn.middleground.business.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol.Body;
import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol;", "T", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "()V", "Body", "EnterInSuite", "ExitFromSuite", "FileDeleteList", "HOST", "OperationWhiteList", "PreloadSubBlock", "PushList", "ReliablePushList", "SetNetworkState", "TurnOnOffWebSocket", "UnWatchDocs", "WatchDocs", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class BaseProtocol<T extends Protocol.Body> extends Protocol<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "BeginSync", "Config", "FileDeletePushList", "OperationWhiteList", "PreloadSubBlock", "PushList", "ReliablePushList", "SetNetworkState", "TurnOnOffWebSocket", "Watch", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public interface Body extends Protocol.Body {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Config;", "Lcom/bytedance/ee/util/io/NonProguard;", "engineType", "", "(Ljava/lang/String;)V", "getEngineType", "()Ljava/lang/String;", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Config implements NonProguard {
            public static final Config BOX_CONFIG = new Config("BOX");
            public static final Companion Companion = new Companion(null);
            public static final Config DOCX_CONFIG = new Config("DOCX");
            private final String engineType;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Config$Companion;", "", "()V", "BOX_CONFIG", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Config;", "getBOX_CONFIG", "()Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Config;", "DOCX_CONFIG", "getDOCX_CONFIG", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$Body$Config$a */
            public static final class Companion {
                private Companion() {
                }

                /* renamed from: a */
                public final Config mo40418a() {
                    return Config.DOCX_CONFIG;
                }

                /* renamed from: b */
                public final Config mo40419b() {
                    return Config.BOX_CONFIG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final String getEngineType() {
                return this.engineType;
            }

            public Config(String str) {
                Intrinsics.checkParameterIsNotNull(str, "engineType");
                this.engineType = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$SetNetworkState;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$SetNetworkState$Data;", ShareHitPoint.f121869d, "", "(Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$SetNetworkState$Data;Ljava/lang/String;)V", "getData", "()Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$SetNetworkState$Data;", "getType", "()Ljava/lang/String;", "Data", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class SetNetworkState implements Body {
            private final Data data;
            private final String type;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$SetNetworkState$Data;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", UpdateKey.STATUS, "", "(Ljava/lang/Integer;)V", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            public static final class Data implements Body {
                private final Integer status;

                public final Integer getStatus() {
                    return this.status;
                }

                public Data(@ConnectionService.NetworkState.NetworkType Integer num) {
                    this.status = num;
                }
            }

            public final Data getData() {
                return this.data;
            }

            public final String getType() {
                return this.type;
            }

            public SetNetworkState(Data data2, String str) {
                this.data = data2;
                this.type = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ SetNetworkState(Data data2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(data2, (i & 2) != 0 ? "setNetworkState" : str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$BeginSync;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", "config", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Config;", "modules", "", "", "(Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Config;Ljava/util/List;)V", "getConfig", "()Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Config;", "getModules", "()Ljava/util/List;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class BeginSync implements Body {
            private final Config config;
            private final List<String> modules;

            public final Config getConfig() {
                return this.config;
            }

            public final List<String> getModules() {
                return this.modules;
            }

            public BeginSync(Config config2, List<String> list) {
                Intrinsics.checkParameterIsNotNull(config2, "config");
                Intrinsics.checkParameterIsNotNull(list, "modules");
                this.config = config2;
                this.modules = list;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ BeginSync(Config config2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(config2, (i & 2) != 0 ? CollectionsKt.listOf((Object[]) new String[]{"sync", "reaction", "image"}) : list);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$FileDeletePushList;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", ShareHitPoint.f121869d, "", "tag", "serviceType", "subtype", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServiceType", "()Ljava/lang/String;", "getSubtype", "getTag", "getType", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class FileDeletePushList implements Body {
            private final String serviceType;
            private final String subtype;
            private final String tag;
            private final String type;

            public final String getServiceType() {
                return this.serviceType;
            }

            public final String getSubtype() {
                return this.subtype;
            }

            public final String getTag() {
                return this.tag;
            }

            public final String getType() {
                return this.type;
            }

            public FileDeletePushList(String str, String str2, String str3, String str4) {
                this.type = str;
                this.tag = str2;
                this.serviceType = str3;
                this.subtype = str4;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$OperationWhiteList;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", "list", "", "", "([Ljava/lang/String;)V", "getList", "()[Ljava/lang/String;", "[Ljava/lang/String;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class OperationWhiteList implements Body {
            private final String[] list;

            public final String[] getList() {
                return this.list;
            }

            public OperationWhiteList(String[] strArr) {
                Intrinsics.checkParameterIsNotNull(strArr, "list");
                this.list = strArr;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$PreloadSubBlock;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", ShareHitPoint.f121869d, "", "objToken", "dataToken", "", "dataType", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDataToken", "()Ljava/util/List;", "getDataType", "()Ljava/lang/String;", "getObjToken", "getType", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class PreloadSubBlock implements Body {
            private final List<String> dataToken;
            private final String dataType;
            private final String objToken;
            private final String type;

            public final List<String> getDataToken() {
                return this.dataToken;
            }

            public final String getDataType() {
                return this.dataType;
            }

            public final String getObjToken() {
                return this.objToken;
            }

            public final String getType() {
                return this.type;
            }

            public PreloadSubBlock(String str, String str2, List<String> list, String str3) {
                this.type = str;
                this.objToken = str2;
                this.dataToken = list;
                this.dataType = str3;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$PushList;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", ShareHitPoint.f121869d, "", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getType", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class PushList implements Body {
            private final String tag;
            private final String type;

            public final String getTag() {
                return this.tag;
            }

            public final String getType() {
                return this.type;
            }

            public PushList(String str, String str2) {
                this.type = str;
                this.tag = str2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$ReliablePushList;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", ShareHitPoint.f121869d, "", "tag", "serviceType", "messageBoxVersion", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getMessageBoxVersion", "()I", "getServiceType", "()Ljava/lang/String;", "getTag", "getType", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static class ReliablePushList implements Body {
            private final int messageBoxVersion;
            private final String serviceType;
            private final String tag;
            private final String type;

            public final int getMessageBoxVersion() {
                return this.messageBoxVersion;
            }

            public final String getServiceType() {
                return this.serviceType;
            }

            public final String getTag() {
                return this.tag;
            }

            public final String getType() {
                return this.type;
            }

            public ReliablePushList(String str, String str2, String str3, int i) {
                this.type = str;
                this.tag = str2;
                this.serviceType = str3;
                this.messageBoxVersion = i;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$TurnOnOffWebSocket;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", "action", "", "(Ljava/lang/Integer;)V", "getAction", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class TurnOnOffWebSocket implements Body {
            private final Integer action;

            public final Integer getAction() {
                return this.action;
            }

            public TurnOnOffWebSocket(Integer num) {
                this.action = num;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Watch;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body;", "Ljava/util/ArrayList;", "", "list", "", "(Ljava/util/List;)V", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Watch extends ArrayList<Object> implements Body {
            public int getSize() {
                return super.size();
            }

            public final int size() {
                return getSize();
            }

            @Override // java.util.AbstractList, java.util.ArrayList, java.util.List
            public final Object remove(int i) {
                return removeAt(i);
            }

            public Object removeAt(int i) {
                return super.remove(i);
            }

            public Watch(List<? extends Object> list) {
                Intrinsics.checkParameterIsNotNull(list, "list");
                addAll(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$EnterInSuite;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Watch;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$a */
    public static final class EnterInSuite extends Protocol<Body.Watch> {
        /* renamed from: a */
        public String mo40443a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("base", new Protocol.Entity.Data("enterInSuite", null, null, mo40562b(), null, 22, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$ExitFromSuite;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Watch;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$b */
    public static final class ExitFromSuite extends Protocol<Body.Watch> {
        /* renamed from: a */
        public String mo40444a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("base", new Protocol.Entity.Data("exitFromSuite", null, null, mo40562b(), null, 22, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$FileDeleteList;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$FileDeletePushList;", "()V", "propertyFilter", "Lcom/alibaba/fastjson/serializer/PropertyPreFilter;", "getJsonString", "", "setPropertyFilter", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$c */
    public static final class FileDeleteList extends Protocol<Body.FileDeletePushList> {

        /* renamed from: a */
        private PropertyPreFilter f28642a;

        /* renamed from: a */
        public String mo40446a() {
            Protocol.Entity.Base base = new Protocol.Entity.Base("base", new Protocol.Entity.Data("pushList", null, null, mo40562b(), null, 22, null));
            PropertyPreFilter propertyPreFilter = this.f28642a;
            if (propertyPreFilter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("propertyFilter");
            }
            String jSONString = JSONObject.toJSONString(base, propertyPreFilter, SerializerFeature.PrettyFormat);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…rettyFormat\n            )");
            return jSONString;
        }

        /* renamed from: a */
        public final FileDeleteList mo40445a(PropertyPreFilter propertyPreFilter) {
            Intrinsics.checkParameterIsNotNull(propertyPreFilter, "propertyFilter");
            this.f28642a = propertyPreFilter;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$OperationWhiteList;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$OperationWhiteList;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$d */
    public static final class OperationWhiteList extends Protocol<Body.OperationWhiteList> {
        /* renamed from: a */
        public String mo40447a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("common", new Protocol.Entity.Data("commonOperationInfo", null, null, mo40562b(), null, 22, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$PreloadSubBlock;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$PreloadSubBlock;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$e */
    public static final class PreloadSubBlock extends Protocol<Body.PreloadSubBlock> {
        /* renamed from: a */
        public String mo40448a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("base", new Protocol.Entity.Data("preloadData", null, null, mo40562b(), null, 22, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$PushList;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$PushList;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$f */
    public static final class PushList extends Protocol<Body.PushList> {
        /* renamed from: a */
        public String mo40449a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("base", new Protocol.Entity.Data("pushList", null, null, mo40562b(), null, 22, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$ReliablePushList;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$ReliablePushList;", "()V", "propertyFilter", "Lcom/alibaba/fastjson/serializer/PropertyPreFilter;", "getJsonString", "", "setPropertyFilter", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$g */
    public static final class ReliablePushList extends Protocol<Body.ReliablePushList> {

        /* renamed from: a */
        private PropertyPreFilter f28643a;

        /* renamed from: a */
        public String mo40451a() {
            Protocol.Entity.Base base = new Protocol.Entity.Base("base", new Protocol.Entity.Data("pushList", null, null, mo40562b(), null, 22, null));
            PropertyPreFilter propertyPreFilter = this.f28643a;
            if (propertyPreFilter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("propertyFilter");
            }
            String jSONString = JSONObject.toJSONString(base, propertyPreFilter, SerializerFeature.PrettyFormat);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…rettyFormat\n            )");
            return jSONString;
        }

        /* renamed from: a */
        public final ReliablePushList mo40450a(PropertyPreFilter propertyPreFilter) {
            Intrinsics.checkParameterIsNotNull(propertyPreFilter, "propertyFilter");
            this.f28643a = propertyPreFilter;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$SetNetworkState;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$SetNetworkState;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$h */
    public static final class SetNetworkState extends Protocol<Body.SetNetworkState> {
        /* renamed from: a */
        public String mo40452a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("base", new Protocol.Entity.Data("nativeNotify", null, null, mo40562b(), null, 22, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$TurnOnOffWebSocket;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$TurnOnOffWebSocket;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$i */
    public static final class TurnOnOffWebSocket extends Protocol<Body.TurnOnOffWebSocket> {
        /* renamed from: a */
        public String mo40453a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("base", new Protocol.Entity.Data("socketConnect", null, null, mo40562b(), null, 22, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$UnWatchDocs;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Watch;", "watchType", "", "(Ljava/lang/String;)V", "getWatchType", "()Ljava/lang/String;", "getJsonString", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$j */
    public static final class UnWatchDocs extends Protocol<Body.Watch> {

        /* renamed from: a */
        private final String f28644a;

        /* renamed from: a */
        public String mo40454a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("base", new Protocol.Entity.Data("offUnwatch", null, null, mo40562b(), new Protocol.Entity.Extra(this.f28644a), 6, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }

        public UnWatchDocs(String str) {
            Intrinsics.checkParameterIsNotNull(str, "watchType");
            this.f28644a = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$WatchDocs;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$Watch;", "watchType", "", "(Ljava/lang/String;)V", "getWatchType", "()Ljava/lang/String;", "getJsonString", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol$k */
    public static final class WatchDocs extends Protocol<Body.Watch> {

        /* renamed from: a */
        private final String f28645a;

        /* renamed from: a */
        public String mo40455a() {
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("base", new Protocol.Entity.Data("offWatch", null, null, mo40562b(), new Protocol.Entity.Extra(this.f28645a), 6, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }

        public WatchDocs(String str) {
            Intrinsics.checkParameterIsNotNull(str, "watchType");
            this.f28645a = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$HOST;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;ILjava/lang/String;)V", "TEST", "STAGING", "PUBLISH", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum HOST {
        TEST("test"),
        STAGING("staging"),
        PUBLISH("publish");

        private HOST(String str) {
        }
    }
}
