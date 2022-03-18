package com.bytedance.ee.bear.bitable.card.viewmodel.fetch;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardType;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardsAction;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.enums.ESegmentType;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.TableDataModel;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.TableMetaModel;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.FieldCommandResultCode;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.SetFieldAttrBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.CommonActionType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionRequestBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionResult;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.performance.EditRecordPerformanceTracker;
import com.bytedance.ee.bear.bitable.card.performance.OpenCardPerformanceTracker;
import com.bytedance.ee.bear.bitable.card.performance.STDataParseFailTracker;
import com.bytedance.ee.bear.bitable.card.performance.STPerformance;
import com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4754a;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4755b;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4756c;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4768d;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4769e;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4770f;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;

public class BitableCardFetcher implements ICardFetcher {

    /* renamed from: a */
    private AbstractC4931i f14030a;

    /* renamed from: b */
    private AbstractC5233x f14031b;

    /* renamed from: c */
    private C4756c f14032c = new C4756c();

    /* renamed from: d */
    private ParserConfig f14033d;

    /* access modifiers changed from: private */
    public static class InnerRecordIdsData implements NonProguard {
        public String[] recordIds;
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: a */
    public Single<C4525a> mo18631a(C4535b bVar, String str) {
        C13479a.m54764b("BitableCardFetcher_fetchData", "fetchRecord");
        return mo18632a(bVar, str, ICardFetcher.FetchMode.FETCH_ONE).filter($$Lambda$BitableCardFetcher$3JpWoUa7JO09u7wfKPQrgdsxE.INSTANCE).mo238770a($$Lambda$BitableCardFetcher$2PUTiMrhfUHX1C4Nk3OrzkzOnnw.INSTANCE).mo238773b();
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: a */
    public Single<List<C4525a>> mo18632a(C4535b bVar, String str, ICardFetcher.FetchMode fetchMode) {
        C13479a.m54764b("BitableCardFetcher_fetchData", "fetchRecords, fetchMode = " + fetchMode);
        int i = C47751.f14034a[fetchMode.ordinal()];
        if (i == 1) {
            return m19711a(bVar, str, 6, 5).map(new STRecordsFunc(bVar));
        }
        if (i == 2) {
            return m19711a(bVar, str, -2, 5).map(new STRecordsFunc(bVar));
        }
        if (i == 3) {
            return m19711a(bVar, str, 5, 11).map(new STRecordsFunc(bVar));
        }
        if (i != 4) {
            return Single.just(new ArrayList());
        }
        return m19711a(bVar, str, 0, 1).map(new STRecordsFunc(bVar));
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: a */
    public Single<List<C4525a>> mo18633a(C4535b bVar, String[] strArr) {
        C13479a.m54764b("BitableCardFetcher_fetchData", "fetchRecords by ids, length = " + strArr.length);
        return m19723b(bVar, strArr).map(new STRecordsFunc(bVar));
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: a */
    public Single<C4535b> mo18635a(String str, String str2, String str3) {
        C13479a.m54764b("BitableCardFetcher_fetchData", "fetchTableMeta");
        return m19727c(str, str2, str3).map(new STTableFunc(str, str2, str3));
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: a */
    public Single<String[]> mo18634a(String str, String str2) {
        return Single.create(new AbstractC69013u(str, str2) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$2Wj8xdGfQUKQz8D4dJsUz1L0Dw */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                BitableCardFetcher.this.m19720a((BitableCardFetcher) this.f$1, this.f$2, (String) sVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19720a(String str, String str2, AbstractC69011s sVar) throws Exception {
        if (this.f14030a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("baseId", (Object) str);
            jSONObject.put("tableId", (Object) str2);
            C13479a.m54772d("BitableCardFetcher_fetchData", "fetchTableRecordIds: " + jSONObject);
            this.f14030a.mo19429a("javascript:window.lark.biz.bitable.getTableRecordIds", jSONObject, new ValueCallback(sVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$F3wJ8QbYVfxRx3enuqh_chYAmoE */
                public final /* synthetic */ AbstractC69011s f$1;

                {
                    this.f$1 = r2;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BitableCardFetcher.this.m19729d(this.f$1, (String) obj);
                }
            });
            return;
        }
        m19718a(sVar, "native_parse_table_recordIds_failed", new NullPointerException("mWeb is null!"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19721a(String str, String str2, String str3, AbstractC69011s sVar) throws Exception {
        if (this.f14030a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("baseId", (Object) str);
            jSONObject.put("tableId", (Object) str2);
            jSONObject.put("keywords", (Object) str3);
            jSONObject.put("ignoreCase", (Object) true);
            C13479a.m54772d("BitableCardFetcher_fetchData", "fetchRecords by keyword, data = " + jSONObject);
            this.f14030a.mo19429a("javascript:window.lark.biz.bitable.getTableRecordsBySearchKey", jSONObject, new ValueCallback(sVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$EHvXZslZ0ZloOhelbcB_AAzMrLI */
                public final /* synthetic */ AbstractC69011s f$1;

                {
                    this.f$1 = r2;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BitableCardFetcher.this.m19728c(this.f$1, (String) obj);
                }
            });
            return;
        }
        m19718a(sVar, "native_parse_table_recordIds_failed", new NullPointerException("mWeb is null!"));
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: a */
    public Single<PermissionResult> mo18636a(PermissionRequestBean[] permissionRequestBeanArr) {
        return Single.create(new AbstractC69013u(permissionRequestBeanArr) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$_Jcew89nMVUSJzU0YFnO396Latc */
            public final /* synthetic */ PermissionRequestBean[] f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                BitableCardFetcher.this.m19722a((BitableCardFetcher) this.f$1, (PermissionRequestBean[]) sVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19722a(PermissionRequestBean[] permissionRequestBeanArr, AbstractC69011s sVar) throws Exception {
        if (this.f14030a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("queryArr", (Object) permissionRequestBeanArr);
            C13479a.m54772d("BitableCardFetcher_fetchPermissionsData", "request data = " + jSONObject);
            this.f14030a.mo19429a("javascript:window.lark.biz.bitable.getPermissionsData", jSONObject, new ValueCallback(sVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$U8shb3BNW3UajZqMQKr4Ifu0duI */
                public final /* synthetic */ AbstractC69011s f$1;

                {
                    this.f$1 = r2;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BitableCardFetcher.this.m19724b((BitableCardFetcher) this.f$1, (AbstractC69011s) ((String) obj));
                }
            });
            return;
        }
        m19718a(sVar, "native_parse_permissions_data_failed", new NullPointerException("mWeb is null!"));
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: a */
    public <T> Single<T> mo18630a(CommonActionType commonActionType, JSONObject jSONObject, Class<T> cls) {
        return Single.create(new AbstractC69013u(commonActionType, jSONObject, cls) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$U7Oo849bCJM4E7TvbwrrDydBvOc */
            public final /* synthetic */ CommonActionType f$1;
            public final /* synthetic */ JSONObject f$2;
            public final /* synthetic */ Class f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                BitableCardFetcher.this.m19714a((BitableCardFetcher) this.f$1, (CommonActionType) this.f$2, (JSONObject) this.f$3, (Class) sVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19719a(Class cls, AbstractC69011s sVar, String str) {
        try {
            Object parseObject = JSON.parseObject(str, cls);
            if (parseObject == null || sVar.isDisposed()) {
                m19718a(sVar, "native_parse_common_data_failed", new Throwable("value is null!"));
            } else {
                sVar.onSuccess(parseObject);
            }
        } catch (Exception e) {
            m19718a(sVar, "native_parse_common_data_failed", e);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: a */
    public Single<FieldCommandResultCode> mo18629a(SetFieldAttrBean setFieldAttrBean) {
        return Single.create(new AbstractC69013u(setFieldAttrBean) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$lCN1MA_MCmnCHgahUHETac9alDE */
            public final /* synthetic */ SetFieldAttrBean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                BitableCardFetcher.this.m19713a((BitableCardFetcher) this.f$1, (SetFieldAttrBean) sVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.fetch.BitableCardFetcher$1 */
    public static /* synthetic */ class C47751 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14034a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher$FetchMode[] r0 = com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher.FetchMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.bitable.card.viewmodel.fetch.BitableCardFetcher.C47751.f14034a = r0
                com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher$FetchMode r1 = com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher.FetchMode.FETCH_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.bitable.card.viewmodel.fetch.BitableCardFetcher.C47751.f14034a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher$FetchMode r1 = com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher.FetchMode.FETCH_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.bitable.card.viewmodel.fetch.BitableCardFetcher.C47751.f14034a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher$FetchMode r1 = com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher.FetchMode.FETCH_UPDATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.bitable.card.viewmodel.fetch.BitableCardFetcher.C47751.f14034a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher$FetchMode r1 = com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher.FetchMode.FETCH_ONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.viewmodel.fetch.BitableCardFetcher.C47751.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m19712a() {
        ParserConfig parserConfig = new ParserConfig();
        this.f14033d = parserConfig;
        parserConfig.putDeserializer(ESegmentType.class, new C4769e());
        this.f14033d.putDeserializer(ECardsAction.class, new C4755b());
        this.f14033d.putDeserializer(EViewType.class, new C4770f());
        this.f14033d.putDeserializer(ECardType.class, new C4754a());
        this.f14033d.putDeserializer(EFieldUneditableReason.class, new C4768d());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C4525a m19710a(List list) throws Exception {
        return (C4525a) list.get(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m19726b(List list) throws Exception {
        if (list.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Single<TableDataModel> m19723b(C4535b bVar, String[] strArr) {
        return Single.create(new AbstractC69013u(bVar, strArr) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$RvYCxIE_siZwJcOpPvp920VTQ7A */
            public final /* synthetic */ C4535b f$1;
            public final /* synthetic */ String[] f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                BitableCardFetcher.this.m19716a((BitableCardFetcher) this.f$1, (C4535b) this.f$2, (String[]) sVar);
            }
        });
    }

    public BitableCardFetcher(AbstractC4931i iVar, AbstractC5233x xVar) {
        this.f14030a = iVar;
        this.f14031b = xVar;
        m19712a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19713a(SetFieldAttrBean setFieldAttrBean, AbstractC69011s sVar) throws Exception {
        if (this.f14030a != null) {
            C13479a.m54772d("BitableCardFetcher_executeFieldAttrCommands", "SetFieldAttr");
            this.f14030a.mo19434a("javascript:window.lark.biz.bitable.executeCommands", setFieldAttrBean, new ValueCallback(sVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$Q0b4hWOFZ7DXwRXkvJ8zVczqeqw */
                public final /* synthetic */ AbstractC69011s f$1;

                {
                    this.f$1 = r2;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BitableCardFetcher.this.m19717a((BitableCardFetcher) this.f$1, (AbstractC69011s) ((String) obj));
                }
            });
            return;
        }
        m19718a(sVar, "native_parse_commands_result_failed", new NullPointerException("mWeb is null!"));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19724b(AbstractC69011s sVar, String str) {
        try {
            PermissionResult permissionResult = (PermissionResult) JSON.parseObject(str, PermissionResult.class);
            if (permissionResult == null || sVar.isDisposed()) {
                m19718a(sVar, "native_parse_permissions_data_failed", new Throwable("value is null!"));
            } else {
                sVar.onSuccess(permissionResult);
            }
        } catch (Exception e) {
            m19718a(sVar, "native_parse_permissions_data_failed", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m19728c(AbstractC69011s sVar, String str) {
        try {
            InnerRecordIdsData innerRecordIdsData = (InnerRecordIdsData) JSON.parseObject(str, InnerRecordIdsData.class);
            if (innerRecordIdsData == null || sVar.isDisposed()) {
                m19718a(sVar, "native_parse_table_recordIds_failed", new Throwable("value is null!"));
            } else {
                sVar.onSuccess(innerRecordIdsData.recordIds);
            }
        } catch (Exception e) {
            m19718a(sVar, "native_parse_table_recordIds_failed", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m19729d(AbstractC69011s sVar, String str) {
        try {
            InnerRecordIdsData innerRecordIdsData = (InnerRecordIdsData) JSON.parseObject(str, InnerRecordIdsData.class);
            if (innerRecordIdsData != null) {
                sVar.onSuccess(innerRecordIdsData.recordIds);
            } else {
                m19718a(sVar, "native_parse_table_recordIds_failed", new Throwable("value is null!"));
            }
        } catch (Exception e) {
            m19718a(sVar, "native_parse_table_recordIds_failed", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m19731f(AbstractC69011s sVar, String str) {
        try {
            TableDataModel tableDataModel = (TableDataModel) JSON.parseObject(str, TableDataModel.class, this.f14033d, this.f14032c, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]);
            if (tableDataModel != null) {
                sVar.onSuccess(tableDataModel);
            } else {
                m19718a(sVar, "native_parse_table_data_failed", new Throwable("value is null!"));
            }
        } catch (Exception e) {
            m19718a(sVar, "native_parse_table_data_failed", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m19730e(AbstractC69011s sVar, String str) {
        try {
            OpenCardPerformanceTracker.f13271a.mo17446a().mo17442c(System.currentTimeMillis());
            TableMetaModel tableMetaModel = (TableMetaModel) JSON.parseObject(str, TableMetaModel.class, this.f14033d, this.f14032c, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]);
            if (tableMetaModel != null) {
                sVar.onSuccess(tableMetaModel);
                OpenCardPerformanceTracker.f13271a.mo17446a().mo17439a(tableMetaModel.transactionId, tableMetaModel.timestamp, tableMetaModel.viewType.toString().toLowerCase());
                return;
            }
            m19718a(sVar, "native_parse_table_meta_failed", new Throwable("value is null!"));
        } catch (Exception e) {
            m19718a(sVar, "native_parse_table_meta_failed", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m19732g(AbstractC69011s sVar, String str) {
        try {
            OpenCardPerformanceTracker.f13271a.mo17446a().mo17444e(System.currentTimeMillis());
            EditRecordPerformanceTracker.f13261a.mo17434a().mo17432c(System.currentTimeMillis());
            TableDataModel tableDataModel = (TableDataModel) JSON.parseObject(str, TableDataModel.class, this.f14033d, this.f14032c, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]);
            if (tableDataModel != null) {
                sVar.onSuccess(tableDataModel);
                OpenCardPerformanceTracker.f13271a.mo17446a().mo17438a(tableDataModel.transactionId, tableDataModel.timestamp);
                EditRecordPerformanceTracker.f13261a.mo17434a().mo17431b(tableDataModel.transactionId, tableDataModel.timestamp);
                return;
            }
            m19718a(sVar, "native_parse_table_data_failed", new Throwable("value is null!"));
        } catch (Exception e) {
            m19718a(sVar, "native_parse_table_data_failed", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19717a(AbstractC69011s sVar, String str) {
        try {
            int intValue = JSONObject.parseObject(str).getIntValue("result");
            if (!sVar.isDisposed()) {
                FieldCommandResultCode from = FieldCommandResultCode.from(intValue);
                sVar.onSuccess(from);
                C13479a.m54772d("BitableCardFetcher_executeFieldAttrCommands", "result = " + from.name());
            }
        } catch (Exception e) {
            m19718a(sVar, "native_parse_commands_result_failed", e);
        }
    }

    /* renamed from: c */
    private Single<TableMetaModel> m19727c(String str, String str2, String str3) {
        return Single.create(new AbstractC69013u(str, str2, str3) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$_LDiGD6S2h0tdcKMvNly18vcCU */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                BitableCardFetcher.this.m19725b(this.f$1, this.f$2, this.f$3, sVar);
            }
        });
    }

    /* renamed from: a */
    private void m19718a(AbstractC69011s sVar, String str, Throwable th) {
        if (!sVar.isDisposed()) {
            sVar.onError(th);
        }
        if (this.f14031b != null) {
            STDataParseFailTracker.f13283a.mo17450a().mo17448a(this.f14031b, str, th.getMessage());
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher
    /* renamed from: b */
    public Single<String[]> mo18637b(String str, String str2, String str3) {
        return Single.create(new AbstractC69013u(str, str2, str3) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$AbAUcpbtUet3_tBQSuRXJdQhBug */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                BitableCardFetcher.this.m19721a((BitableCardFetcher) this.f$1, this.f$2, this.f$3, (String) sVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19716a(C4535b bVar, String[] strArr, AbstractC69011s sVar) throws Exception {
        if (this.f14030a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("baseId", (Object) bVar.mo17757a());
            jSONObject.put("tableId", (Object) bVar.mo17767b());
            jSONObject.put("recordIds", (Object) strArr);
            C13479a.m54772d("BitableCardFetcher_fetchData", "fetchRecords by ids, data = " + jSONObject);
            this.f14030a.mo19429a("javascript:window.lark.biz.bitable.getRecordsData", jSONObject, new ValueCallback(sVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$kee4K7bOfC4TDaLiW95xcwabxE */
                public final /* synthetic */ AbstractC69011s f$1;

                {
                    this.f$1 = r2;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BitableCardFetcher.this.m19731f(this.f$1, (String) obj);
                }
            });
            return;
        }
        m19718a(sVar, "native_parse_table_data_failed", new NullPointerException("mWeb is null!"));
    }

    /* renamed from: a */
    private Single<TableDataModel> m19711a(C4535b bVar, String str, int i, int i2) {
        return Single.create(new AbstractC69013u(bVar, str, i, i2) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$EOjo_jNVLcVcUa9_oXiXvW3N1h0 */
            public final /* synthetic */ C4535b f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ int f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s sVar) {
                BitableCardFetcher.this.m19715a(this.f$1, this.f$2, this.f$3, this.f$4, sVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19725b(String str, String str2, String str3, AbstractC69011s sVar) throws Exception {
        if (this.f14030a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transactionId", (Object) STPerformance.f13286b.mo17472a());
            jSONObject.put("baseId", (Object) str);
            jSONObject.put("tableId", (Object) str2);
            jSONObject.put("viewId", (Object) str3);
            C13479a.m54772d("BitableCardFetcher_fetchData", "fetchTableMetaInner: " + jSONObject);
            OpenCardPerformanceTracker.f13271a.mo17446a().mo17441b(System.currentTimeMillis());
            this.f14030a.mo19429a("javascript:window.lark.biz.bitable.getTableMeta", jSONObject, new ValueCallback(sVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$R2tQi0fVIhC7eTkZTkxOHY1ZiYI */
                public final /* synthetic */ AbstractC69011s f$1;

                {
                    this.f$1 = r2;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BitableCardFetcher.this.m19730e(this.f$1, (String) obj);
                }
            });
            return;
        }
        m19718a(sVar, "native_parse_table_meta_failed", new NullPointerException("mWeb is null!"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19714a(CommonActionType commonActionType, JSONObject jSONObject, Class cls, AbstractC69011s sVar) throws Exception {
        if (this.f14030a != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ShareHitPoint.f121869d, (Object) commonActionType.getValue());
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            C13479a.m54772d("BitableCardFetcher_fetchCommonData", "request data = " + jSONObject2);
            this.f14030a.mo19429a("javascript:window.lark.biz.util.getBitableCommonData", jSONObject2, new ValueCallback(cls, sVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$S4Dqmy3VPMiNzUtZ28MnXnjh2Uw */
                public final /* synthetic */ Class f$1;
                public final /* synthetic */ AbstractC69011s f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BitableCardFetcher.this.m19719a((BitableCardFetcher) this.f$1, (Class) this.f$2, (AbstractC69011s) ((String) obj));
                }
            });
            return;
        }
        m19718a(sVar, "native_parse_common_data_failed", new NullPointerException("mWeb is null!"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19715a(C4535b bVar, String str, int i, int i2, AbstractC69011s sVar) throws Exception {
        if (this.f14030a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transactionId", (Object) STPerformance.f13286b.mo17472a());
            jSONObject.put("baseId", (Object) bVar.mo17757a());
            jSONObject.put("tableId", (Object) bVar.mo17767b());
            jSONObject.put("viewId", (Object) bVar.mo17775e().mo17793b());
            if (TextUtils.isEmpty(str)) {
                str = bVar.mo17785j();
            }
            jSONObject.put("recordId", (Object) str);
            jSONObject.put("offset", (Object) Integer.valueOf(i));
            jSONObject.put("length", (Object) Integer.valueOf(i2));
            C13479a.m54772d("BitableCardFetcher_fetchData", "fetchRecordsInner: " + jSONObject);
            OpenCardPerformanceTracker.f13271a.mo17446a().mo17443d(System.currentTimeMillis());
            EditRecordPerformanceTracker.f13261a.mo17434a().mo17430b(System.currentTimeMillis());
            this.f14030a.mo19429a("javascript:window.lark.biz.bitable.getTableData", jSONObject, new ValueCallback(sVar) {
                /* class com.bytedance.ee.bear.bitable.card.viewmodel.fetch.$$Lambda$BitableCardFetcher$wb2bcPUy6QVbI1LZR6b3xJQM9CM */
                public final /* synthetic */ AbstractC69011s f$1;

                {
                    this.f$1 = r2;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BitableCardFetcher.this.m19732g(this.f$1, (String) obj);
                }
            });
            return;
        }
        m19718a(sVar, "native_parse_table_data_failed", new NullPointerException("mWeb is null!"));
    }
}
