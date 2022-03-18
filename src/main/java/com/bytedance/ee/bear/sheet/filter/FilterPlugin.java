package com.bytedance.ee.bear.sheet.filter;

import android.webkit.ValueCallback;
import androidx.lifecycle.AbstractC1142af;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.filter.FilterViewModel;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "filterViewModel", "Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel;", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "Companion", "FilterHandler", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FilterPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public FilterViewModel filterViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPlugin$Companion;", "", "()V", "BIZ_SHEET_SET_FILTER", "", "GET_FILTER", "TAG", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPlugin$FilterHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/filter/FilterData;", "(Lcom/bytedance/ee/bear/sheet/filter/FilterPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPlugin$b */
    private final class FilterHandler implements AbstractC7945d<FilterData> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/sheet/filter/FilterPlugin$FilterHandler$handle$1", "Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$Delegate;", "onFilterCallBack", "", "T", "id", "", "sheetId", "currentCol", "", "value", "isSearch", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Boolean;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPlugin$b$a */
        public static final class C11150a implements FilterViewModel.Delegate {

            /* renamed from: a */
            final /* synthetic */ AbstractC7947h f29968a;

            C11150a(AbstractC7947h hVar) {
                this.f29968a = hVar;
            }

            @Override // com.bytedance.ee.bear.sheet.filter.FilterViewModel.Delegate
            /* renamed from: a */
            public <T> void mo42663a(String str, String str2, int i, T t, Boolean bool) {
                Intrinsics.checkParameterIsNotNull(str, "id");
                AbstractC7947h hVar = this.f29968a;
                if (hVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = jSONObject;
                    jSONObject2.put((Object) "id", (Object) str);
                    jSONObject2.put((Object) "sheetId", (Object) str2);
                    jSONObject2.put((Object) "currentCol", (Object) Integer.valueOf(i));
                    jSONObject2.put((Object) "value", (Object) t);
                    if (bool != null) {
                        bool.booleanValue();
                        jSONObject2.put((Object) "isSearch", (Object) bool);
                    }
                    C13479a.m54772d("FilterPlugin", "callback: " + this.f29968a + ' ' + jSONObject);
                    hVar.mo17188a(jSONObject);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public FilterHandler() {
        }

        /* renamed from: a */
        public void handle(FilterData filterData, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(filterData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54772d("FilterPlugin", "handle: FilterData = " + filterData);
            FilterPlugin.access$getFilterViewModel$p(FilterPlugin.this).setDelegate(new C11150a(hVar));
            FilterPlugin.access$getFilterViewModel$p(FilterPlugin.this).updateFilterData(filterData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/sheet/filter/FilterPlugin$onAttachToUIContainer$1", "Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$FilterValueDelegate;", "getFilterValues", "", "current", "", "size", "sheetId", "", "currentCol", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPlugin$c */
    public static final class C11151c implements FilterViewModel.FilterValueDelegate {

        /* renamed from: a */
        final /* synthetic */ FilterPlugin f29969a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11151c(FilterPlugin filterPlugin) {
            this.f29969a = filterPlugin;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "value", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPlugin$c$a */
        static final class C11152a<T> implements ValueCallback<String> {

            /* renamed from: a */
            final /* synthetic */ C11151c f29970a;

            C11152a(C11151c cVar) {
                this.f29970a = cVar;
            }

            /* renamed from: a */
            public final void onReceiveValue(String str) {
                FilterPageData filterPageData = (FilterPageData) JSON.parseObject(str, FilterPageData.class);
                FilterViewModel access$getFilterViewModel$p = FilterPlugin.access$getFilterViewModel$p(this.f29970a.f29969a);
                Intrinsics.checkExpressionValueIsNotNull(filterPageData, "pageData");
                access$getFilterViewModel$p.updateFilterPageData(filterPageData);
                C13479a.m54772d("FilterPlugin", "pagination batch data from JS");
            }
        }

        @Override // com.bytedance.ee.bear.sheet.filter.FilterViewModel.FilterValueDelegate
        /* renamed from: a */
        public void mo42664a(int i, int i2, String str, int i3) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "current", (Object) Integer.valueOf(i));
            jSONObject2.put((Object) "size", (Object) Integer.valueOf(i2));
            jSONObject2.put((Object) "sheetId", (Object) str);
            jSONObject2.put((Object) "currentCol", (Object) Integer.valueOf(i3));
            C13479a.m54772d("FilterPlugin", "native pull paging data " + jSONObject);
            this.f29969a.execJS("javascript:window.lark.biz.sheet.getFilterValues", jSONObject, new C11152a(this));
        }
    }

    public static final /* synthetic */ FilterViewModel access$getFilterViewModel$p(FilterPlugin filterPlugin) {
        FilterViewModel eVar = filterPlugin.filterViewModel;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterViewModel");
        }
        return eVar;
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.sheet.setFilter", new FilterHandler());
    }

    public void onAttachToHost(C6095s sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        C6095s sVar2 = sVar;
        super.onAttachToHost((C4943e) sVar2);
        AbstractC1142af a = C4950k.m20478a(sVar2, FilterViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…terViewModel::class.java)");
        this.filterViewModel = (FilterViewModel) a;
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        FilterViewModel eVar = this.filterViewModel;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterViewModel");
        }
        eVar.setFilterValueDelegate(new C11151c(this));
    }
}
