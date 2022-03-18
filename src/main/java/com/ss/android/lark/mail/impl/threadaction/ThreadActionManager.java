package com.ss.android.lark.mail.impl.threadaction;

import android.util.Pair;
import android.view.View;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionConfigurator;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionManager;
import com.ss.android.lark.mail.impl.threadaction.config.MultiThreadActionConfig;
import com.ss.android.lark.mail.impl.threadaction.config.SingleThreadActionConfig;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ThreadActionManager {
    private static volatile boolean initialized = false;
    private static final HashMap<String, ThreadActionButtonInfo> threadActionButtonClassMap = new HashMap<>();
    private final HashMap<String, ButtonProxy> buttonMap = new HashMap<>();
    protected ThreadActionButtonListener listener;
    private ThreadActionConfig threadActionConfig;

    public static class ThreadActionButtonInfo {
        private final Class buttonClass;
        private final Method onClickCallbackMethod;

        public Class getButtonClass() {
            return this.buttonClass;
        }

        public Method getOnClickCallbackMethod() {
            return this.onClickCallbackMethod;
        }

        ThreadActionButtonInfo(Class cls, Method method) {
            this.buttonClass = cls;
            this.onClickCallbackMethod = method;
        }
    }

    public ThreadActionManager() {
    }

    public static synchronized void invalidate() {
        synchronized (ThreadActionManager.class) {
            initialized = false;
        }
    }

    public static void initAsync() {
        Log.m165389i("ThreadActionManager", "initAsync");
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.threadaction.ThreadActionManager.RunnableC437081 */

            public void run() {
                ThreadActionManager.initSync();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public class ButtonProxy {
        private AbsButton button;
        private final ThreadActionButtonInfo buttonInfo;

        public AbsButton getButton() {
            if (this.button == null) {
                try {
                    this.button = (AbsButton) this.buttonInfo.getButtonClass().getConstructor(AbsButton.AbstractC43948a.class).newInstance(new AbsButton.AbstractC43948a() {
                        /* class com.ss.android.lark.mail.impl.threadaction.$$Lambda$ThreadActionManager$ButtonProxy$qIcrj8SaTH6184Lcypz8t035K0 */

                        @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                        public final void onButtonClick(View view) {
                            ThreadActionManager.ButtonProxy.this.lambda$getButton$0$ThreadActionManager$ButtonProxy(view);
                        }
                    });
                } catch (Exception e) {
                    Log.m165384e("ThreadActionManager", "getButton", e);
                }
            }
            return this.button;
        }

        public /* synthetic */ void lambda$getButton$0$ThreadActionManager$ButtonProxy(View view) {
            if (ThreadActionManager.this.listener != null) {
                try {
                    this.buttonInfo.getOnClickCallbackMethod().invoke(ThreadActionManager.this.listener, new Object[0]);
                } catch (Exception e) {
                    Log.m165384e("ThreadActionManager", "getButton click", e);
                }
            }
        }

        ButtonProxy(ThreadActionButtonInfo threadActionButtonInfo) {
            this.buttonInfo = threadActionButtonInfo;
        }
    }

    public static synchronized void initSync() {
        synchronized (ThreadActionManager.class) {
            Log.m165389i("ThreadActionManager", "initSync");
            if (!initialized) {
                Log.m165389i("ThreadActionManager", "initSync start");
                Method[] methods = ThreadActionButtonListener.class.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(AbsButton.ButtonType.class)) {
                        try {
                            AbsButton.ButtonType buttonType = (AbsButton.ButtonType) method.getAnnotation(AbsButton.ButtonType.class);
                            if (buttonType != null) {
                                threadActionButtonClassMap.put(buttonType.action(), new ThreadActionButtonInfo(buttonType.clz(), method));
                            }
                        } catch (Throwable th) {
                            Log.m165384e("ThreadActionManager", "initSync", th);
                        }
                    }
                }
                ThreadActionConfigurator.init();
                initialized = true;
                Log.m165389i("ThreadActionManager", "initSync end");
            }
        }
    }

    public void setListener(ThreadActionButtonListener threadActionButtonListener) {
        this.listener = threadActionButtonListener;
    }

    private static ThreadActionButtonInfo getButtonInfo(String str) {
        return threadActionButtonClassMap.get(str);
    }

    public AbsButton getButton(String str) {
        Log.m165389i("ThreadActionManager", "getButton");
        return obtainThreadActionButton(str);
    }

    public ThreadActionManager(ThreadActionButtonListener threadActionButtonListener) {
        this.listener = threadActionButtonListener;
    }

    private Pair<List<AbsButton>, List<AbsButton>> obtainButtons(ThreadActionConfig threadActionConfig2) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (threadActionConfig2 == null) {
            Log.m165383e("ThreadActionManager", "obtainButtons empty config");
            return new Pair<>(null, null);
        }
        if (threadActionConfig2.getBarActionList() != null) {
            arrayList = new ArrayList();
            Iterator<String> it = threadActionConfig2.getBarActionList().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    Log.m165383e("ThreadActionManager", "obtainButtons null exposedAction");
                } else {
                    arrayList.add(obtainThreadActionButton(next));
                }
            }
        } else {
            arrayList = null;
        }
        if (threadActionConfig2.getPanelActionList() != null) {
            arrayList2 = new ArrayList();
            Iterator<String> it2 = threadActionConfig2.getPanelActionList().iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2 == null) {
                    Log.m165383e("ThreadActionManager", "obtainButtons null hiddenAction");
                } else {
                    arrayList2.add(obtainThreadActionButton(next2));
                }
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    private final AbsButton obtainThreadActionButton(String str) {
        if (str == null) {
            Log.m165383e("ThreadActionManager", "obtainThreadActionButton action null");
            return null;
        }
        ButtonProxy buttonProxy = this.buttonMap.get(str);
        if (buttonProxy == null) {
            ThreadActionButtonInfo buttonInfo = getButtonInfo(str);
            if (buttonInfo == null) {
                Log.m165383e("ThreadActionManager", "obtainThreadActionButton error : " + str + " is not initialed");
                return null;
            }
            ButtonProxy buttonProxy2 = new ButtonProxy(buttonInfo);
            this.buttonMap.put(str, buttonProxy2);
            buttonProxy = buttonProxy2;
        }
        return buttonProxy.getButton();
    }

    public Pair<List<AbsButton>, List<AbsButton>> getButtons(String str, List<MailThread> list) {
        Log.m165389i("ThreadActionManager", "getButtons");
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ThreadActionManager", "getButtons invalid parameter");
            return null;
        }
        ThreadActionConfig process = ThreadActionConfigurator.of(MultiThreadActionConfig.class).process(str, list);
        this.threadActionConfig = process;
        return obtainButtons(process);
    }

    public Pair<List<AbsButton>, List<AbsButton>> getButtons(C42104p pVar, List<C42097j> list, String str) {
        Log.m165389i("ThreadActionManager", "getButtons");
        ThreadActionConfig singleThreadActionConfig = getSingleThreadActionConfig(pVar, list, str);
        this.threadActionConfig = singleThreadActionConfig;
        return obtainButtons(singleThreadActionConfig);
    }

    public ThreadActionConfig getSingleThreadActionConfig(C42104p pVar, List<C42097j> list, String str) {
        List<MailLabelEntity> list2;
        Log.m165389i("ThreadActionManager", "getSingleThreadActionConfig labelID: " + str);
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(list)) {
            for (C42097j jVar : list) {
                if (!(jVar == null || jVar.mo151964g() == null || jVar.mo151964g().mo151586c() == null)) {
                    arrayList.add(jVar.mo151964g().mo151586c());
                }
            }
        }
        boolean containsOtherAddress = ThreadActionUtil.containsOtherAddress(arrayList);
        if (pVar == null) {
            list2 = null;
        } else {
            list2 = pVar.mo152018b();
        }
        return getSingleThreadActionConfig(pVar, list2, str, containsOtherAddress);
    }

    public ThreadActionConfig getSingleThreadActionConfig(C42104p pVar, List<MailLabelEntity> list, String str, boolean z) {
        Log.m165389i("ThreadActionManager", "getSingleThreadActionConfig labelID: " + str);
        ThreadActionConfigurator.Processor of = ThreadActionConfigurator.of(SingleThreadActionConfig.class);
        if (of == null) {
            Log.m165389i("ThreadActionManager", "getSingleThreadActionConfig processor null initialized: " + initialized);
            initialized = false;
            initSync();
        }
        return of.process(str, list, pVar, Boolean.valueOf(z));
    }
}
