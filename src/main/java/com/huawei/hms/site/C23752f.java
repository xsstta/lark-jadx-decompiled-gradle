package com.huawei.hms.site;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huawei.hmf.tasks.AbstractC23430d;
import com.huawei.hmf.tasks.AbstractC23431e;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.site.api.BuildConfig;
import com.huawei.hms.site.api.SearchResultListener;
import com.huawei.hms.site.api.SearchService;
import com.huawei.hms.site.api.model.DetailSearchRequest;
import com.huawei.hms.site.api.model.DetailSearchResponse;
import com.huawei.hms.site.api.model.NearbySearchRequest;
import com.huawei.hms.site.api.model.NearbySearchResponse;
import com.huawei.hms.site.api.model.QueryAutocompleteRequest;
import com.huawei.hms.site.api.model.QueryAutocompleteResponse;
import com.huawei.hms.site.api.model.QuerySuggestionRequest;
import com.huawei.hms.site.api.model.QuerySuggestionResponse;
import com.huawei.hms.site.api.model.SearchStatus;
import com.huawei.hms.site.api.model.TextSearchRequest;
import com.huawei.hms.site.api.model.TextSearchResponse;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.Util;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.huawei.hms.site.f */
public class C23752f extends HuaweiApi<Object> implements SearchService {

    /* renamed from: a */
    public String f58828a;

    /* renamed from: com.huawei.hms.site.f$b */
    public class C23754b implements AbstractC23431e<T> {

        /* renamed from: a */
        public final /* synthetic */ SearchResultListener f58830a;

        public C23754b(C23752f fVar, SearchResultListener searchResultListener) {
            this.f58830a = searchResultListener;
        }

        @Override // com.huawei.hmf.tasks.AbstractC23431e
        public void onSuccess(T t) {
            this.f58830a.onSearchResult(t);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/app/Activity;Lcom/huawei/hms/api/Api<Ljava/lang/Object;>;Ljava/lang/Object;Lcom/huawei/hms/common/internal/AbstractClientBuilder;Ljava/lang/String;)V */
    public C23752f(Activity activity, Api api, AbstractClientBuilder abstractClientBuilder, String str) {
        super(activity, api, (Api.ApiOptions) null, abstractClientBuilder);
        this.f58828a = str;
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/content/Context;Lcom/huawei/hms/api/Api<Ljava/lang/Object;>;Ljava/lang/Object;Lcom/huawei/hms/common/internal/AbstractClientBuilder;Ljava/lang/String;)V */
    public C23752f(Context context, Api api, AbstractClientBuilder abstractClientBuilder, String str) {
        super(context, api, (Api.ApiOptions) null, abstractClientBuilder);
        this.f58828a = str;
    }

    /* renamed from: a */
    public final <T> void mo85087a(AbstractC23432f<T> fVar, SearchResultListener<T> searchResultListener) {
        fVar.mo81828a(new C23754b(this, searchResultListener)).mo81827a(new C23753a(this, searchResultListener));
    }

    @Override // com.huawei.hms.site.api.SearchService
    public void detailSearch(DetailSearchRequest detailSearchRequest, SearchResultListener<DetailSearchResponse> searchResultListener) {
        mo85087a(doWrite(new C23748b("site.detailSearch", mo85086a(detailSearchRequest), HiAnalyticsClient.reportEntry(getContext(), "site.detailSearch", 0))), searchResultListener);
    }

    @Override // com.huawei.hms.site.api.SearchService
    public void nearbySearch(NearbySearchRequest nearbySearchRequest, SearchResultListener<NearbySearchResponse> searchResultListener) {
        mo85087a(doWrite(new C23749c("site.nearbySearch", mo85086a(nearbySearchRequest), HiAnalyticsClient.reportEntry(getContext(), "site.nearbySearch", 0))), searchResultListener);
    }

    @Override // com.huawei.hms.site.api.SearchService
    public void queryAutocomplete(QueryAutocompleteRequest queryAutocompleteRequest, SearchResultListener<QueryAutocompleteResponse> searchResultListener) {
        mo85087a(doWrite(new C23750d("site.queryAutocomplete", mo85086a(queryAutocompleteRequest), HiAnalyticsClient.reportEntry(getContext(), "site.queryAutocomplete", 0))), searchResultListener);
    }

    @Override // com.huawei.hms.site.api.SearchService
    public void querySuggestion(QuerySuggestionRequest querySuggestionRequest, SearchResultListener<QuerySuggestionResponse> searchResultListener) {
        mo85087a(doWrite(new C23751e("site.querySuggestion", mo85086a(querySuggestionRequest), HiAnalyticsClient.reportEntry(getContext(), "site.querySuggestion", 0))), searchResultListener);
    }

    @Override // com.huawei.hms.site.api.SearchService
    public void textSearch(TextSearchRequest textSearchRequest, SearchResultListener<TextSearchResponse> searchResultListener) {
        mo85087a(doWrite(new C23757i("site.textSearch", mo85086a(textSearchRequest), HiAnalyticsClient.reportEntry(getContext(), "site.textSearch", 0))), searchResultListener);
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        String str;
        Context context = getContext();
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.get("com.huawei.hms.min_api_level:site:site");
            if (obj != null) {
                str = String.valueOf(obj);
                if (str.startsWith("value=")) {
                    str = str.substring(6);
                }
                return Integer.parseInt(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        str = "";
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused2) {
            C23761m.m86935b("SearchServiceImpl", "apiLevel from metadata is not number");
            return 1;
        }
    }

    /* renamed from: com.huawei.hms.site.f$a */
    public class C23753a implements AbstractC23430d {

        /* renamed from: a */
        public final /* synthetic */ SearchResultListener f58829a;

        public C23753a(C23752f fVar, SearchResultListener searchResultListener) {
            this.f58829a = searchResultListener;
        }

        @Override // com.huawei.hmf.tasks.AbstractC23430d
        public void onFailure(Exception exc) {
            String str = "";
            SearchStatus searchStatus = new SearchStatus(str, str);
            if (exc instanceof ApiException) {
                ApiException apiException = (ApiException) exc;
                String str2 = apiException.getStatusCode() + str;
                if (TextUtils.isEmpty(str2)) {
                    str2 = str;
                } else if (str2.length() == 5) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("0");
                    stringBuffer.append(str2);
                    str2 = stringBuffer.toString();
                }
                searchStatus.setErrorCode(str2);
                if (apiException.getMessage() != null) {
                    str = apiException.getStatusMessage();
                }
                searchStatus.setErrorMessage(str);
            } else {
                searchStatus.setErrorMessage(exc.getMessage());
            }
            this.f58829a.onSearchError(searchStatus);
        }
    }

    /* renamed from: a */
    public final <T> String mo85086a(T t) {
        String a = C23760l.m86930a(t);
        if (C23760l.f58833b == null) {
            C23760l.f58833b = new JsonParser();
        }
        JsonObject asJsonObject = C23760l.f58833b.parse(a).getAsJsonObject();
        asJsonObject.addProperty("appId", Util.getAppId(getContext()));
        asJsonObject.addProperty("packageName", getContext().getPackageName());
        asJsonObject.addProperty("conversationId", C23759k.f58831a);
        String str = C23767r.f58842a;
        if (str == null) {
            C23767r.f58842a = BuildConfig.VERSION_NAME;
            str = C23767r.f58842a;
        }
        asJsonObject.addProperty("sdkVersion", str);
        asJsonObject.addProperty("apiKey", this.f58828a);
        return C23760l.m86930a(asJsonObject);
    }
}
