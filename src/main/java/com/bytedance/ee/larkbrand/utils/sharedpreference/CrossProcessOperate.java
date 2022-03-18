package com.bytedance.ee.larkbrand.utils.sharedpreference;

import com.bytedance.ee.larkbrand.hostbridge.sync.C13118f;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002-.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010 \u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001fH\u0016J\u0018\u0010)\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001fH\u0016J\u0018\u0010*\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001dH\u0016J\u0018\u0010+\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020#H\u0016J\u0018\u0010,\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004¨\u0006/"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate;", "Lcom/bytedance/ee/larkbrand/utils/sharedpreference/SpOperate;", "name", "", "(Ljava/lang/String;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate$SpOpData;", "getData", "()Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate$SpOpData;", "setData", "(Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate$SpOpData;)V", "editList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate$SpOpDataItem;", "getEditList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "editList$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "setName", "buildEdit", "Lorg/json/JSONObject;", "buildGet", "executeGet", "", "key", "value", ShareHitPoint.f121869d, "", "getBoolean", "", "default", "getInt", "getLong", "", "getString", "remove", "", "save", "sync", "setBoolean", "setInt", "setLong", "setString", "SpOpData", "SpOpDataItem", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.utils.a.a */
public final class CrossProcessOperate implements SpOperate {

    /* renamed from: a */
    private final Lazy f35225a = LazyKt.lazy(C13335c.INSTANCE);

    /* renamed from: b */
    private String f35226b;

    /* renamed from: a */
    private final CopyOnWriteArrayList<SpOpDataItem> m54261a() {
        return (CopyOnWriteArrayList) this.f35225a.getValue();
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public boolean mo49628a(boolean z) {
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("sp_data", m54263b(this.f35226b)).mo234760a("sp_save_type", (Object) Boolean.valueOf(z)).mo234763b();
        m54261a().clear();
        CrossProcessDataEntity b2 = C13118f.m53717b("lark_sp_op_v2", b);
        if (b2 != null) {
            return b2.mo234746d("sp_result");
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate$SpOpDataItem;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.a.a$c */
    static final class C13335c extends Lambda implements Function0<CopyOnWriteArrayList<SpOpDataItem>> {
        public static final C13335c INSTANCE = new C13335c();

        C13335c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CopyOnWriteArrayList<SpOpDataItem> invoke() {
            return new CopyOnWriteArrayList<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate$SpOpData;", "", "command", "", "spName", "", "dataList", "", "Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate$SpOpDataItem;", "(ILjava/lang/String;Ljava/util/List;)V", "getCommand", "()I", "setCommand", "(I)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getSpName", "()Ljava/lang/String;", "setSpName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.a.a$a */
    public static final class SpOpData {

        /* renamed from: a */
        private int f35227a;

        /* renamed from: b */
        private String f35228b;

        /* renamed from: c */
        private List<SpOpDataItem> f35229c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpOpData)) {
                return false;
            }
            SpOpData aVar = (SpOpData) obj;
            return this.f35227a == aVar.f35227a && Intrinsics.areEqual(this.f35228b, aVar.f35228b) && Intrinsics.areEqual(this.f35229c, aVar.f35229c);
        }

        public int hashCode() {
            int i = this.f35227a * 31;
            String str = this.f35228b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            List<SpOpDataItem> list = this.f35229c;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "SpOpData(command=" + this.f35227a + ", spName=" + this.f35228b + ", dataList=" + this.f35229c + ")";
        }

        /* renamed from: a */
        public final JSONObject mo49633a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", this.f35227a);
            jSONObject.put("spName", this.f35228b);
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.f35229c.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo49637a());
            }
            jSONObject.put("items", jSONArray);
            return jSONObject;
        }

        public SpOpData(int i, String str, List<SpOpDataItem> list) {
            Intrinsics.checkParameterIsNotNull(str, "spName");
            Intrinsics.checkParameterIsNotNull(list, "dataList");
            this.f35227a = i;
            this.f35228b = str;
            this.f35229c = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/sharedpreference/CrossProcessOperate$SpOpDataItem;", "", "key", "", "value", ShareHitPoint.f121869d, "", "action", "(Ljava/lang/String;Ljava/lang/String;II)V", "getAction", "()I", "setAction", "(I)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getType", "setType", "getValue", "setValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.a.a$b */
    public static final class SpOpDataItem {

        /* renamed from: a */
        private String f35230a;

        /* renamed from: b */
        private String f35231b;

        /* renamed from: c */
        private int f35232c;

        /* renamed from: d */
        private int f35233d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpOpDataItem)) {
                return false;
            }
            SpOpDataItem bVar = (SpOpDataItem) obj;
            return Intrinsics.areEqual(this.f35230a, bVar.f35230a) && Intrinsics.areEqual(this.f35231b, bVar.f35231b) && this.f35232c == bVar.f35232c && this.f35233d == bVar.f35233d;
        }

        public int hashCode() {
            String str = this.f35230a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f35231b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((((hashCode + i) * 31) + this.f35232c) * 31) + this.f35233d;
        }

        public String toString() {
            return "SpOpDataItem(key=" + this.f35230a + ", value=" + this.f35231b + ", type=" + this.f35232c + ", action=" + this.f35233d + ")";
        }

        /* renamed from: a */
        public final JSONObject mo49637a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("put", this.f35233d);
            jSONObject.put("key", this.f35230a);
            jSONObject.put("value", this.f35231b);
            jSONObject.put(ShareHitPoint.f121869d, this.f35232c);
            return jSONObject;
        }

        public SpOpDataItem(String str, String str2, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "value");
            this.f35230a = str;
            this.f35231b = str2;
            this.f35232c = i;
            this.f35233d = i2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SpOpDataItem(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 2 : i, (i3 & 8) != 0 ? 1 : i2);
        }
    }

    public CrossProcessOperate(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f35226b = str;
    }

    /* renamed from: b */
    private final JSONObject m54263b(String str) {
        return new SpOpData(0, str, m54261a()).mo49633a();
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49623a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        m54261a().add(new SpOpDataItem(str, null, 0, 0, 6, null));
    }

    /* renamed from: a */
    private final JSONObject m54262a(String str, SpOpDataItem bVar) {
        return new SpOpData(1, str, CollectionsKt.listOf(bVar)).mo49633a();
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: b */
    public int mo49629b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Object a = m54260a(this.f35226b, str, String.valueOf(i), 0);
        if (!(a instanceof Integer)) {
            a = null;
        }
        Integer num = (Integer) a;
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: b */
    public long mo49630b(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Object a = m54260a(this.f35226b, str, String.valueOf(j), 3);
        if (!(a instanceof Long)) {
            a = null;
        }
        Long l = (Long) a;
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49624a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        m54261a().add(new SpOpDataItem(str, String.valueOf(i), 0, 0, 8, null));
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: b */
    public String mo49631b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "default");
        Object a = m54260a(this.f35226b, str, str2, 2);
        if (!(a instanceof String)) {
            a = null;
        }
        String str3 = (String) a;
        return str3 != null ? str3 : str2;
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49625a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        m54261a().add(new SpOpDataItem(str, String.valueOf(j), 3, 0, 8, null));
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: b */
    public boolean mo49632b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Object a = m54260a(this.f35226b, str, String.valueOf(z), 1);
        if (!(a instanceof Boolean)) {
            a = null;
        }
        Boolean bool = (Boolean) a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49626a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        m54261a().add(new SpOpDataItem(str, str2, 2, 0, 8, null));
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49627a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        m54261a().add(new SpOpDataItem(str, String.valueOf(z), 1, 0, 8, null));
    }

    /* renamed from: a */
    private final Object m54260a(String str, String str2, String str3, int i) {
        String a;
        CrossProcessDataEntity b = C13118f.m53717b("lark_sp_op_v2", CrossProcessDataEntity.C67574a.m263013a().mo234760a("sp_data", m54262a(str, new SpOpDataItem(str2, str3, i, 0, 8, null))).mo234763b());
        if (b == null) {
            return null;
        }
        if (i == 0) {
            String a2 = b.mo234740a("sp_result", str3);
            if (a2 != null) {
                return Integer.valueOf(Integer.parseInt(a2));
            }
            return null;
        } else if (i == 1) {
            String a3 = b.mo234740a("sp_result", str3);
            if (a3 != null) {
                return Boolean.valueOf(Boolean.parseBoolean(a3));
            }
            return null;
        } else if (i == 2) {
            return b.mo234744b("sp_result");
        } else {
            if (i == 3 && (a = b.mo234740a("sp_result", str3)) != null) {
                return Long.valueOf(Long.parseLong(a));
            }
            return null;
        }
    }
}
