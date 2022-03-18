package com.ss.android.lark.search.impl.p2592b.p2595c;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.search.impl.b.c.b */
public class C53345b {
    /* renamed from: a */
    public static boolean m206465a(int i) {
        return i == 2;
    }

    /* renamed from: b */
    public static String m206467b(int i) {
        switch (i) {
            case 1:
                return "FEED_TAB";
            case 2:
                return "CONTACT_TAB";
            case 3:
                return "PIN_TAB";
            case 4:
                return "PIN_ALL";
            case 5:
                return "CALENDAR_TAB";
            case 6:
                return "APP_CENTER_TAB";
            case 7:
                return "SPACE_TAB";
            case 8:
                return "WIKI_TAB";
            case 9:
                return "THREAD_TAB";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    /* renamed from: a */
    public static void m206463a(final IGetDataCallback<Integer> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.search.impl.p2592b.p2595c.C53345b.RunnableC533472 */

            public void run() {
                int a = C53258a.m205939a().mo181764m().mo181819a();
                if (a == 0) {
                    iGetDataCallback.onError(new ErrorResult("loadTimeFormat failed: timeFormat is unknown"));
                } else {
                    iGetDataCallback.onSuccess(Integer.valueOf(a));
                }
            }
        });
    }

    /* renamed from: a */
    public static void m206464a(final List<String> list, final IGetDataCallback<List<BasePickViewData>> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.search.impl.p2592b.p2595c.C53345b.RunnableC533461 */

            public void run() {
                if (CollectionUtils.isEmpty(list)) {
                    iGetDataCallback.onSuccess(new ArrayList());
                    return;
                }
                ISearchModuleDependency.AbstractC53317e f = C53258a.m205939a().mo181756f();
                Map<String, Chatter> b = f.mo181791b(list);
                ArrayList arrayList = new ArrayList();
                if (CollectionUtils.isEmpty(b)) {
                    iGetDataCallback.onSuccess(arrayList);
                    return;
                }
                for (Map.Entry<String, Chatter> entry : b.entrySet()) {
                    if (entry.getValue() == null) {
                        Log.m165383e("LarkSearch.Search.SearchUtils", "getPickChatterViewDataByChatterIds failed: chatter is null");
                    } else {
                        Chatter value = entry.getValue();
                        arrayList.add(C53344a.m206460a(value, f.mo181780a(value.getId(), false), C53258a.m205939a().mo181761j().mo181816b(), f.mo181779a(value)));
                    }
                }
                iGetDataCallback.onSuccess(arrayList);
            }
        });
    }

    /* renamed from: a */
    public static String m206461a(Date date, Date date2) {
        String str;
        Options aVar = new Options();
        aVar.mo191595a(TimeZone.getDefault().getID());
        aVar.mo191591a(DatePreciseness.DAY);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        if (date == null || date.getTime() == 0) {
            str = UIHelper.getString(R.string.Lark_Search_AnyTime);
        } else {
            if (C26279i.m95164c(date)) {
                aVar.mo191593a(LengthType.SHORT);
            } else {
                aVar.mo191593a(LengthType.LONG);
            }
            str = TimeFormatUtils.m219289e(LarkContext.getApplication().getApplicationContext(), date, aVar);
        }
        if (C26279i.m95164c(date2)) {
            aVar.mo191593a(LengthType.SHORT);
        } else {
            aVar.mo191593a(LengthType.LONG);
        }
        String e = TimeFormatUtils.m219289e(LarkContext.getApplication().getApplicationContext(), date2, aVar);
        return str + "-" + e;
    }

    /* renamed from: a */
    public static <T> List<T> m206462a(List<T> list, List<T> list2) {
        if (CollectionUtils.isEmpty(list)) {
            if (CollectionUtils.isEmpty(list2)) {
                return new ArrayList();
            }
            return list2;
        } else if (CollectionUtils.isEmpty(list2)) {
            return new ArrayList();
        } else {
            HashSet hashSet = new HashSet(list);
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (!hashSet.contains(t)) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static boolean m206466a(boolean z, String str, int i) {
        if (i != 0 || !z || !C53258a.m205939a().mo181745a("suite.search.patch.chatinside.msg.empty") || str.length() <= SearchService.f131813a.mo181936a().f133115a) {
            return false;
        }
        return true;
    }
}
