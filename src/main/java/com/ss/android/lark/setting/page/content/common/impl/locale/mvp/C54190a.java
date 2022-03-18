package com.ss.android.lark.setting.page.content.common.impl.locale.mvp;

import com.bytedance.morpheus.core.C20208a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.dfcore.config.C36609b;
import com.ss.android.lark.dfcore.p1800b.AbstractC36599a;
import com.ss.android.lark.dfcore.p1800b.AbstractC36600b;
import com.ss.android.lark.dfcore.p1800b.AbstractC36601c;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import com.ss.android.lark.dfcore.task.DynamicLanguageTask;
import com.ss.android.lark.dfcore.utils.DynamicFeatureUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguagePickBean;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.AbstractC54204c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.a */
public class C54190a {

    /* renamed from: a */
    public static DynamicLanguageTask f134174a;

    /* renamed from: b */
    public static LanguagePickBean f134175b;

    /* renamed from: c */
    public static WeakReference<AbstractC54204c.AbstractC54205a.AbstractC54206a> f134176c;

    /* renamed from: d */
    public static WeakReference<AbstractC54201a> f134177d;

    /* renamed from: e */
    public static Map<Integer, Integer> f134178e = new HashMap();

    /* renamed from: f */
    public static final Integer f134179f = 0;

    /* renamed from: g */
    public static final Integer f134180g = 2;

    /* renamed from: h */
    public static final Integer f134181h = 3;

    /* renamed from: i */
    private static boolean f134182i;

    /* renamed from: j */
    private static final Integer f134183j = 1;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.a$a */
    public interface AbstractC54201a {
        /* renamed from: a */
        void mo185512a(IGetDataCallback<List<LanguagePickBean>> iGetDataCallback);
    }

    /* renamed from: d */
    public static Set<String> m210429d() {
        return DynamicFeatureUtils.getInstalledLanguages();
    }

    /* renamed from: b */
    public static void m210426b() {
        if (f134174a != null) {
            m210430e();
            f134174a = null;
            Log.m165389i("DynamicDownloadUtil", "Exit the language interface and actively destroy the task");
        }
        f134178e.clear();
    }

    /* renamed from: g */
    private static void m210432g() {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911 */

            public void run() {
                C54190a.m210428c();
                C54190a.f134174a.mo135042a((AbstractC36599a) new AbstractC36599a() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C541921 */

                    @Override // com.ss.android.lark.dfcore.p1800b.AbstractC36599a
                    /* renamed from: a */
                    public void mo135016a(DynamicFeatureTask dynamicFeatureTask, long j, long j2) {
                        Log.m165389i("DynamicDownloadUtil", "progress: " + j + "/" + j2);
                    }
                });
                C54190a.f134174a.mo135043a((AbstractC36600b) new AbstractC36600b() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C541932 */

                    @Override // com.ss.android.lark.dfcore.p1800b.AbstractC36600b
                    /* renamed from: a */
                    public void mo135017a(DynamicFeatureTask dynamicFeatureTask) {
                        if (dynamicFeatureTask == null) {
                            Log.m165397w("DynamicDownloadUtil", "task is null");
                            return;
                        }
                        Log.m165389i("DynamicDownloadUtil", "onInstallSuccess=======>" + dynamicFeatureTask.mo135056f() + "download successful");
                        if (!C54190a.m210424a()) {
                            Log.m165389i("DynamicDownloadUtil", "The language interface has been exited, and the callback method is not executed");
                            C54190a.f134174a = null;
                            Log.m165389i("DynamicDownloadUtil", "Task destroyed");
                            return;
                        }
                        C54190a.f134178e.put(Integer.valueOf(dynamicFeatureTask.mo135063l()), C54190a.f134180g);
                        boolean a = C54190a.m210425a(dynamicFeatureTask);
                        if (C54190a.m210427b(dynamicFeatureTask) || a) {
                            C54190a.m210428c();
                            if (C54190a.f134175b != null) {
                                UICallbackExecutor.execute(new Runnable() {
                                    /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C541932.RunnableC541941 */

                                    public void run() {
                                        C54190a.f134175b.mo185464a(1);
                                    }
                                });
                            }
                            final AbstractC54204c.AbstractC54205a.AbstractC54206a aVar = C54190a.f134176c.get();
                            if (aVar != null) {
                                Log.m165389i("DynamicDownloadUtil", "Download successfully, update language list...");
                                UICallbackExecutor.execute(new Runnable() {
                                    /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C541932.RunnableC541952 */

                                    public void run() {
                                        aVar.mo185534a(true);
                                    }
                                });
                                return;
                            }
                            Log.m165397w("DynamicDownloadUtil", "onInstallSuccess callback method: modelDelegate is null");
                            return;
                        }
                        Log.m165389i("DynamicDownloadUtil", "Not the download task of the currently selected language, interrupt the callback; the id of the callback task: " + dynamicFeatureTask.mo135063l() + ",mTask's id" + C54190a.f134174a.mo135063l());
                    }

                    @Override // com.ss.android.lark.dfcore.p1800b.AbstractC36600b
                    /* renamed from: b */
                    public void mo135019b(DynamicFeatureTask dynamicFeatureTask) {
                        if (dynamicFeatureTask == null) {
                            Log.m165389i("DynamicDownloadUtil", "task is null !");
                            return;
                        }
                        Log.m165389i("DynamicDownloadUtil", "Callback onInstallCanceled method, download language：" + dynamicFeatureTask.mo135056f());
                        if (!C54190a.m210424a()) {
                            Log.m165389i("DynamicDownloadUtil", "The language interface has been exited, and the callback method is not executed");
                            C54190a.f134174a = null;
                            Log.m165389i("DynamicDownloadUtil", "Task destroyed");
                            return;
                        }
                        C54190a.f134178e.put(Integer.valueOf(dynamicFeatureTask.mo135063l()), C54190a.f134179f);
                        boolean a = C54190a.m210425a(dynamicFeatureTask);
                        if (C54190a.f134175b == null) {
                            Log.m165389i("DynamicDownloadUtil", "mSelectLanguageBean is null!");
                        } else if (!C54190a.m210427b(dynamicFeatureTask) || !a) {
                            Log.m165389i("DynamicDownloadUtil", "Multiple clicks, no processing");
                            Log.m165389i("DynamicDownloadUtil", "The download task of the language not currently selected, interrupt the callback; the id of the callback task" + dynamicFeatureTask.mo135063l() + ",mTask's id: " + C54190a.f134174a.mo135063l());
                        } else {
                            Log.m165389i("DynamicDownloadUtil", "User clicked and no longer download");
                            AbstractC54201a aVar = C54190a.f134177d.get();
                            if (aVar == null) {
                                Log.m165397w("DynamicDownloadUtil", "Cancellation callback listener is empty");
                            } else {
                                aVar.mo185512a(new IGetDataCallback<List<LanguagePickBean>>() {
                                    /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C541932.C541985 */

                                    @Override // com.larksuite.framework.callback.IGetDataCallback
                                    public void onError(ErrorResult errorResult) {
                                    }

                                    /* renamed from: a */
                                    public void onSuccess(final List<LanguagePickBean> list) {
                                        final AbstractC54204c.AbstractC54205a.AbstractC54206a aVar = C54190a.f134176c.get();
                                        if (aVar != null) {
                                            UICallbackExecutor.execute(new Runnable() {
                                                /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C541932.C541985.RunnableC541991 */

                                                public void run() {
                                                    aVar.mo185533a(list);
                                                }
                                            });
                                        } else {
                                            Log.m165397w("DynamicDownloadUtil", "Cancel callback method: modelDelegate is null");
                                        }
                                    }
                                });
                            }
                        }
                    }

                    @Override // com.ss.android.lark.dfcore.p1800b.AbstractC36600b
                    /* renamed from: a */
                    public void mo135018a(DynamicFeatureTask dynamicFeatureTask, int i) {
                        if (dynamicFeatureTask == null) {
                            Log.m165397w("DynamicDownloadUtil", "task is null !");
                            return;
                        }
                        Log.m165389i("DynamicDownloadUtil", "onInstallFailed, errorCode: " + i + "，download language：" + dynamicFeatureTask.mo135056f());
                        if (!C54190a.m210424a()) {
                            Log.m165389i("DynamicDownloadUtil", "The language interface has been exited, and the callback method is not executed");
                            C54190a.f134174a = null;
                            Log.m165389i("DynamicDownloadUtil", "Task destroyed");
                            return;
                        }
                        C54190a.f134178e.put(Integer.valueOf(dynamicFeatureTask.mo135063l()), C54190a.f134181h);
                        boolean a = C54190a.m210425a(dynamicFeatureTask);
                        if (!C54190a.m210427b(dynamicFeatureTask) || !a) {
                            Log.m165389i("DynamicDownloadUtil", "Not the download task of the currently selected language, interrupt the callback; the id of the callback task: " + dynamicFeatureTask.mo135063l() + ",mTask's id: " + C54190a.f134174a.mo135063l());
                            return;
                        }
                        if (C54190a.f134175b != null) {
                            Log.m165389i("DynamicDownloadUtil", "set the status of " + C54190a.f134175b.mo185463a().toLanguageTag() + "download failed");
                            UICallbackExecutor.execute(new Runnable() {
                                /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C541932.RunnableC541963 */

                                public void run() {
                                    C54190a.f134175b.mo185464a(4);
                                }
                            });
                        }
                        final AbstractC54204c.AbstractC54205a.AbstractC54206a aVar = C54190a.f134176c.get();
                        if (aVar != null) {
                            Log.m165389i("DynamicDownloadUtil", "Download failed, update language list...");
                            UICallbackExecutor.execute(new Runnable() {
                                /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C541932.RunnableC541974 */

                                public void run() {
                                    aVar.mo185534a(false);
                                }
                            });
                            return;
                        }
                        Log.m165397w("DynamicDownloadUtil", "onInstallFailed callback method: modelDelegate is null");
                    }
                });
                C54190a.f134174a.mo135044a((AbstractC36601c) new AbstractC36601c() {
                    /* class com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54190a.RunnableC541911.C542003 */

                    @Override // com.bytedance.morpheus.core.AbstractC20209b
                    /* renamed from: a */
                    public void mo68394a(C20208a aVar) {
                        Log.m165389i("DynamicDownloadUtil", "onStateChanged, state: " + aVar);
                    }
                });
                C54190a.f134174a.mo135060i();
            }
        });
    }

    /* renamed from: a */
    public static boolean m210424a() {
        return f134182i;
    }

    /* renamed from: c */
    public static void m210428c() {
        Iterator<String> it = m210429d().iterator();
        while (it.hasNext()) {
            Log.m165389i("DynamicDownloadUtil", "installed：" + it.next());
        }
    }

    /* renamed from: f */
    private static void m210431f() {
        for (Integer num : f134178e.keySet()) {
            Log.m165389i("DynamicDownloadUtil", "task code:" + num + ",status: " + f134178e.get(num));
        }
    }

    /* renamed from: e */
    public static void m210430e() {
        DynamicLanguageTask dynamicLanguageTask = f134174a;
        if (dynamicLanguageTask == null || dynamicLanguageTask.mo135056f() == null) {
            Log.m165389i("DynamicDownloadUtil", "mTask is null or mTask.getLocale() is null");
            return;
        }
        Integer valueOf = Integer.valueOf(f134174a.mo135063l());
        Integer num = f134178e.get(valueOf);
        if (f134183j == num) {
            DynamicFeatureCore.cancel(f134174a);
            f134178e.put(valueOf, f134179f);
            Log.m165389i("DynamicDownloadUtil", "Multilingual download canceled...(" + f134174a.mo135056f() + ")");
            return;
        }
        Log.m165389i("DynamicDownloadUtil", "Don't cancel language download，" + f134174a.mo135056f() + "language status：" + num);
    }

    /* renamed from: a */
    public static void m210419a(LanguagePickBean languagePickBean) {
        f134175b = languagePickBean;
    }

    /* renamed from: a */
    public static void m210420a(AbstractC54201a aVar) {
        f134177d = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public static void m210421a(AbstractC54204c.AbstractC54205a.AbstractC54206a aVar) {
        f134176c = new WeakReference<>(aVar);
    }

    /* renamed from: b */
    public static boolean m210427b(DynamicFeatureTask dynamicFeatureTask) {
        if (dynamicFeatureTask.mo135063l() == f134174a.mo135063l()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m210423a(boolean z) {
        f134182i = z;
    }

    /* renamed from: a */
    public static void m210422a(Locale locale) {
        Log.m165389i("DynamicDownloadUtil", "Start multilingual download...(" + locale.toLanguageTag() + ")");
        f134174a = new DynamicLanguageTask(locale);
        f134174a.mo135045a(new C36609b.C36611a().mo135038a(true).mo135039a());
        m210431f();
        f134178e.put(Integer.valueOf(f134174a.mo135063l()), f134183j);
        m210432g();
    }

    /* renamed from: a */
    public static boolean m210425a(DynamicFeatureTask dynamicFeatureTask) {
        String str;
        if (dynamicFeatureTask == null || dynamicFeatureTask.mo135056f() == null) {
            Log.m165383e("DynamicDownloadUtil", "task is null or task.getLocale(）is null");
            str = "";
        } else {
            str = dynamicFeatureTask.mo135056f().getLanguage();
        }
        LanguagePickBean languagePickBean = f134175b;
        if (languagePickBean == null || languagePickBean.mo185463a() == null) {
            return false;
        }
        return str.equals(f134175b.mo185463a().getLanguage());
    }
}
