package com.ss.android.lark.forward.impl.statistics.favourite;

import com.ss.android.lark.statistics.extensions.IParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/favourite/ForwardHitpointExtraParams;", "", "()V", "Click", "LeaveAMessage", "Scene", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ForwardHitpointExtraParams {

    /* renamed from: a */
    public static final ForwardHitpointExtraParams f98832a = new ForwardHitpointExtraParams();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/favourite/ForwardHitpointExtraParams$Click;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "Send", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Click implements IParam {
        Send("send", null, 2, null);
        
        private final String key;
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return this.key;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IParam.C54954a.m213213a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IParam.C54954a.m213212a(this, cVar);
        }

        private Click(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Click(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "click" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/favourite/ForwardHitpointExtraParams$LeaveAMessage;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "True", "False", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum LeaveAMessage implements IParam {
        True("true", null, 2, null),
        False("false", null, 2, null);
        
        private final String key;
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return this.key;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IParam.C54954a.m213213a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IParam.C54954a.m213212a(this, cVar);
        }

        private LeaveAMessage(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ LeaveAMessage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "leave_a_message" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/favourite/ForwardHitpointExtraParams$Scene;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "GROUP_CREATE_FROM_FORWARD", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Scene implements IParam {
        GROUP_CREATE_FROM_FORWARD("group_create_from_forward", null, 2, null);
        
        private final String key;
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return this.key;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IParam.C54954a.m213213a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IParam.C54954a.m213212a(this, cVar);
        }

        private Scene(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Scene(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "scene" : str2);
        }
    }

    private ForwardHitpointExtraParams() {
    }
}
