package com.ss.android.lark.searchcommon.view.binder;

import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCustomizationInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchQACardInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchServiceCardInfo;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.general.LynxCardViewHolder;
import com.ss.android.lark.searchcommon.view.general.lynx.CardInfo;
import com.ss.android.lark.searchcommon.view.general.lynx.CardRegistry;
import com.ss.android.lark.searchcommon.view.general.lynx.IReportListener;
import com.ss.android.lark.searchcommon.view.general.lynx.LynxCard;
import com.ss.android.lark.searchcommon.view.general.lynx.TemplateType;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/LynxCardBinder;", "", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "holder", "Lcom/ss/android/lark/searchcommon/view/general/LynxCardViewHolder;", "getCardInfo", "Lcom/ss/android/lark/searchcommon/view/general/lynx/CardInfo;", "getRenderContent", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.r */
public final class LynxCardBinder {

    /* renamed from: a */
    public final SearchResultViewAdapter.IOnItemClickHandler f133673a;

    public LynxCardBinder(SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133673a = bVar;
    }

    /* renamed from: b */
    private final CardInfo m209589b(SearchBaseInfo searchBaseInfo) {
        TemplateType templateType;
        if (searchBaseInfo instanceof SearchQACardInfo) {
            templateType = TemplateType.QA_CARD;
        } else if (searchBaseInfo instanceof SearchServiceCardInfo) {
            templateType = TemplateType.SERVICE_CARD;
        } else if (searchBaseInfo instanceof SearchCustomizationInfo) {
            templateType = TemplateType.STORE_CARD;
        } else {
            templateType = null;
        }
        if (templateType != null) {
            return CardRegistry.f133787e.mo184971a(templateType);
        }
        return null;
    }

    /* renamed from: a */
    private final String m209588a(SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo instanceof SearchQACardInfo) {
            return ((SearchQACardInfo) searchBaseInfo).getRenderContent();
        }
        if (searchBaseInfo instanceof SearchServiceCardInfo) {
            return ((SearchServiceCardInfo) searchBaseInfo).getRenderContent();
        }
        if (searchBaseInfo instanceof SearchCustomizationInfo) {
            return ((SearchCustomizationInfo) searchBaseInfo).getRenderContent();
        }
        return "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/LynxCardBinder$bind$1", "Lcom/ss/android/lark/searchcommon/view/general/lynx/IReportListener;", "call", "", "param", "Lorg/json/JSONObject;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.r$a */
    public static final class C53998a implements IReportListener {

        /* renamed from: a */
        final /* synthetic */ LynxCardBinder f133674a;

        /* renamed from: b */
        final /* synthetic */ SearchBaseInfo f133675b;

        /* renamed from: c */
        final /* synthetic */ int f133676c;

        @Override // com.ss.android.lark.searchcommon.view.general.lynx.IReportListener
        /* renamed from: a */
        public void mo101693a(JSONObject jSONObject) {
            if (jSONObject != null) {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Intrinsics.checkExpressionValueIsNotNull(next, "it");
                        Object obj = jSONObject.get(next);
                        Intrinsics.checkExpressionValueIsNotNull(obj, "param.get(it)");
                        hashMap.put(next, obj);
                    }
                }
                HashMap hashMap2 = hashMap;
                if (!hashMap2.isEmpty()) {
                    this.f133675b.setExtraParams(hashMap2);
                }
            }
            this.f133674a.f133673a.mo182499a(this.f133675b, true, this.f133676c);
        }

        C53998a(LynxCardBinder rVar, SearchBaseInfo searchBaseInfo, int i) {
            this.f133674a = rVar;
            this.f133675b = searchBaseInfo;
            this.f133676c = i;
        }
    }

    /* renamed from: a */
    public final void mo184864a(int i, SearchBaseInfo searchBaseInfo, LynxCardViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        String a = m209588a(searchBaseInfo);
        CardInfo b = m209589b(searchBaseInfo);
        aVar.mo184943a().mo184975a().setTag(R.id.lynx_view_click_listener, new C53998a(this, searchBaseInfo, i));
        if (b != null) {
            LynxCard.m209691a(aVar.mo184943a(), a, b, null, 4, null);
        }
    }
}
