package com.ss.android.lark.contact.impl.p1747b;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.entity.ExternalContact;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.contact.impl.viewdata.C36077a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.contact.impl.b.a */
public class C35497a {

    /* renamed from: a */
    private static AbstractC35361b.AbstractC35375n f91776a = C35358a.m138143a().mo130153c();

    /* renamed from: b */
    private static AbstractC35361b.AbstractC35367f f91777b = C35358a.m138143a().mo130165j();

    /* renamed from: c */
    private static AbstractC35361b.AbstractC35370i f91778c = C35358a.m138143a().mo130150b();

    /* renamed from: b */
    private static List<String> m138873b(AbstractC35936a.C35939c cVar) {
        Map<String, Chatter> c = cVar.mo132230c();
        Map<String, String> d = cVar.mo132232d();
        ArrayList arrayList = new ArrayList();
        for (Chatter chatter : c.values()) {
            if (chatter != null) {
                String tenantId = chatter.getTenantId();
                if (d.get(tenantId) == null) {
                    arrayList.add(tenantId);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C36077a> m138868a(AbstractC35936a.C35939c cVar) {
        ArrayList arrayList = new ArrayList();
        List<ExternalContact> a = cVar.mo132223a();
        Map<String, Chatter> c = cVar.mo132230c();
        Map<String, String> d = cVar.mo132232d();
        for (ExternalContact externalContact : a) {
            Chatter chatter = c.get(externalContact.getChatterId());
            if (chatter != null) {
                arrayList.add(m138866a(chatter, d.get(chatter.getTenantId()), false));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m138869a(final AbstractC35936a.C35939c cVar, final IGetDataCallback<AbstractC35936a.C35939c> iGetDataCallback) {
        if (iGetDataCallback != null) {
            List<String> b = m138873b(cVar);
            if (CollectionUtils.isEmpty(b)) {
                iGetDataCallback.onSuccess(cVar);
            } else {
                m138872a(b, new IGetDataCallback<Map<String, String>>() {
                    /* class com.ss.android.lark.contact.impl.p1747b.C35497a.C355003 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, String> map) {
                        cVar.mo132232d().putAll(map);
                        iGetDataCallback.onSuccess(cVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private static String m138867a(Chatter chatter, Locale locale) {
        if (chatter == null) {
            return "#";
        }
        String localizedName = chatter.getLocalizedName();
        String name = chatter.getName();
        String namePy = chatter.getNamePy();
        if (localizedName == null) {
            localizedName = name;
        }
        return (!locale.getLanguage().toLowerCase().equals("zh") || TextUtils.isEmpty(namePy)) ? localizedName : namePy;
    }

    /* renamed from: a */
    public static void m138870a(final String str, final IGetDataCallback<AbstractC35936a.C35939c> iGetDataCallback) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.contact.impl.p1747b.C35497a.RunnableC354981 */

            public void run() {
                boolean z;
                String str;
                IGetDataCallback iGetDataCallback;
                AbstractC35936a.C35939c cVar = new AbstractC35936a.C35939c();
                String str2 = "0";
                int i = 0;
                do {
                    AbstractC35936a.C35939c a = C35497a.m138865a(str2, str, 50);
                    if (a != null) {
                        List<ExternalContact> a2 = cVar.mo132223a();
                        List<ExternalContact> a3 = a.mo132223a();
                        if (!CollectionUtils.isEmpty(a3)) {
                            a2.addAll(a3);
                        }
                        Map<String, Chat> b = cVar.mo132228b();
                        Map<String, Chat> b2 = a.mo132228b();
                        if (!CollectionUtils.isEmpty(b2)) {
                            b.putAll(b2);
                        }
                        Map<String, Chatter> c = cVar.mo132230c();
                        Map<String, Chatter> c2 = a.mo132230c();
                        if (!CollectionUtils.isEmpty(c2)) {
                            c.putAll(c2);
                        }
                        Map<String, String> d = cVar.mo132232d();
                        Map<String, String> d2 = a.mo132232d();
                        if (!CollectionUtils.isEmpty(d2)) {
                            d.putAll(d2);
                        }
                        Set<String> f = cVar.mo132235f();
                        Set<String> f2 = a.mo132235f();
                        if (!CollectionUtils.isEmpty(f2)) {
                            f.addAll(f2);
                        }
                        z = true;
                        if (CollectionUtils.isEmpty(a3)) {
                            str = str2;
                        } else {
                            str = a3.get(a3.size() - 1).getId();
                        }
                        if (str.equals(str2) || !a.mo132234e() || i >= 40) {
                            z = false;
                        }
                        cVar.mo132227a(z);
                        i++;
                        if (!z && (iGetDataCallback = iGetDataCallback) != null) {
                            iGetDataCallback.onSuccess(cVar);
                        }
                        str2 = str;
                        continue;
                    } else {
                        if (CollectionUtils.isEmpty(cVar.mo132223a())) {
                            IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                            if (iGetDataCallback2 != null) {
                                iGetDataCallback2.onError(new ErrorResult("Failed to get contacts"));
                            }
                        } else {
                            IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                            if (iGetDataCallback3 != null) {
                                iGetDataCallback3.onSuccess(cVar);
                            }
                        }
                        z = false;
                        continue;
                    }
                } while (z);
            }
        });
    }

    /* renamed from: a */
    private static void m138872a(List<String> list, final IGetDataCallback<Map<String, String>> iGetDataCallback) {
        AbstractC35361b.AbstractC35382u d = C35358a.m138143a().mo130156d();
        if (d == null && iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("Failed to get tenant service"));
        }
        d.mo130257a(list, true, new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.contact.impl.p1747b.C35497a.C355014 */

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(map);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    /* renamed from: a */
    public static AbstractC35936a.C35939c m138865a(String str, String str2, int i) {
        C35906e a = C35906e.m140678a();
        if (a == null) {
            return null;
        }
        return a.mo132136a(str, str2, i);
    }

    /* renamed from: a */
    public static C36077a m138866a(Chatter chatter, String str, boolean z) {
        Locale a = f91776a.mo130223a();
        C36077a aVar = new C36077a();
        aVar.f93243a = f91777b.mo130195a(chatter);
        aVar.f93244b = str;
        aVar.f93247e = chatter.getTenantId();
        aVar.f93245c = chatter.getAvatarKey();
        aVar.f93246d = chatter.getId();
        aVar.f93248f = z;
        aVar.f93249g = m138867a(chatter, a);
        aVar.f93250h = chatter.getDescription();
        aVar.f93251i = f91777b.mo130193a(chatter, a);
        return aVar;
    }

    /* renamed from: a */
    public static void m138871a(String str, String str2, String str3, int i, int i2, final IGetDataCallback<AbstractC35936a.C35939c> iGetDataCallback) {
        C35906e a = C35906e.m140678a();
        if (a == null) {
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(new ErrorResult("Failed to get contact service"));
            }
        } else if (f91778c.mo130208a("lark.client.contact.opt")) {
            a.mo132146a(str3, str, i, i2, iGetDataCallback);
        } else {
            a.mo132147a(str2, str, i, new IGetDataCallback<AbstractC35936a.C35939c>() {
                /* class com.ss.android.lark.contact.impl.p1747b.C35497a.C354992 */

                /* renamed from: a */
                public void onSuccess(AbstractC35936a.C35939c cVar) {
                    C35497a.m138869a(cVar, iGetDataCallback);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            });
        }
    }
}
