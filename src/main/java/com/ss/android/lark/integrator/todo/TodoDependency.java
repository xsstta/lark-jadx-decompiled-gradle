package com.ss.android.lark.integrator.todo;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.integrator.todo.dependency.TodoAccountChange;
import com.ss.android.lark.integrator.todo.dependency.TodoAppConfig;
import com.ss.android.lark.integrator.todo.dependency.TodoAppLifeCycle;
import com.ss.android.lark.integrator.todo.dependency.TodoBlockit;
import com.ss.android.lark.integrator.todo.dependency.TodoBrowser;
import com.ss.android.lark.integrator.todo.dependency.TodoChat;
import com.ss.android.lark.integrator.todo.dependency.TodoCommon;
import com.ss.android.lark.integrator.todo.dependency.TodoCoreModule;
import com.ss.android.lark.integrator.todo.dependency.TodoDoc;
import com.ss.android.lark.integrator.todo.dependency.TodoImage;
import com.ss.android.lark.integrator.todo.dependency.TodoLogin;
import com.ss.android.lark.integrator.todo.dependency.TodoMain;
import com.ss.android.lark.integrator.todo.dependency.TodoMessengerDependency;
import com.ss.android.lark.integrator.todo.dependency.TodoOldModule;
import com.ss.android.lark.integrator.todo.dependency.TodoPush;
import com.ss.android.lark.integrator.todo.dependency.TodoSearch;
import com.ss.android.lark.integrator.todo.dependency.TodoSetting;
import com.ss.android.lark.integrator.todo.dependency.TodoTimeFormatDependency;
import com.ss.android.lark.integrator.todo.dependency.TodoZenMode;
import com.ss.android.lark.integrator.todo.p2047a.C40053j;
import com.ss.android.lark.integrator.todo.p2047a.C40054l;
import com.ss.android.lark.integrator.todo.p2047a.C40058u;
import com.ss.android.lark.integrator.todo.p2047a.p2048a.C40046a;
import com.ss.android.lark.todo.dependency.ITodoDependency;
import com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency;
import com.ss.android.lark.todo.dependency.idependency.IAppConfigDependency;
import com.ss.android.lark.todo.dependency.idependency.IAppLifeCycleDependency;
import com.ss.android.lark.todo.dependency.idependency.IBlockitDependency;
import com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.todo.dependency.idependency.ICommonDependency;
import com.ss.android.lark.todo.dependency.idependency.ICoreModuleDependency;
import com.ss.android.lark.todo.dependency.idependency.ILoginDependency;
import com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.dependency.idependency.IOldModuleDependency;
import com.ss.android.lark.todo.dependency.idependency.IPushDependency;
import com.ss.android.lark.todo.dependency.idependency.ISearchModuleDependency;
import com.ss.android.lark.todo.dependency.idependency.ISettingDependency;
import com.ss.android.lark.todo.dependency.idependency.IZenModeDependency;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56253e;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56254i;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56255j;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56256k;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56257l;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56258t;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56259u;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@ClaymoreImpl(ITodoDependency.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00106\u001a\u000207H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010@\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020FH\u0016J\b\u0010J\u001a\u00020KH\u0016J\b\u0010O\u001a\u00020PH\u0016J\b\u0010T\u001a\u00020UH\u0016J\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010^\u001a\u00020_H\u0016J\b\u0010c\u001a\u00020dH\u0016J\b\u0010h\u001a\u00020iH\u0016J\b\u0010m\u001a\u00020nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002078BX\u0002¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020A8BX\u0002¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bB\u0010CR\u001b\u0010E\u001a\u00020F8BX\u0002¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\bG\u0010HR\u001b\u0010J\u001a\u00020K8BX\u0002¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\bL\u0010MR\u001b\u0010O\u001a\u00020P8BX\u0002¢\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\bQ\u0010RR\u001b\u0010T\u001a\u00020U8BX\u0002¢\u0006\f\n\u0004\bX\u0010\b\u001a\u0004\bV\u0010WR\u001b\u0010Y\u001a\u00020Z8BX\u0002¢\u0006\f\n\u0004\b]\u0010\b\u001a\u0004\b[\u0010\\R\u001b\u0010^\u001a\u00020_8BX\u0002¢\u0006\f\n\u0004\bb\u0010\b\u001a\u0004\b`\u0010aR\u001b\u0010c\u001a\u00020d8BX\u0002¢\u0006\f\n\u0004\bg\u0010\b\u001a\u0004\be\u0010fR\u001b\u0010h\u001a\u00020i8BX\u0002¢\u0006\f\n\u0004\bl\u0010\b\u001a\u0004\bj\u0010kR\u001b\u0010m\u001a\u00020n8BX\u0002¢\u0006\f\n\u0004\bq\u0010\b\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lcom/ss/android/lark/integrator/todo/TodoDependency;", "Lcom/ss/android/lark/todo/dependency/ITodoDependency;", "()V", "accountChangeDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency;", "getAccountChangeDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency;", "accountChangeDependency$delegate", "Lkotlin/Lazy;", "appConfigDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IAppConfigDependency;", "getAppConfigDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IAppConfigDependency;", "appConfigDependency$delegate", "appLifeCycleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency;", "getAppLifeCycleDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency;", "appLifeCycleDependency$delegate", "blockitDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IBlockitDependency;", "getBlockitDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IBlockitDependency;", "blockitDependency$delegate", "browserDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IBrowserModuleDependency;", "getBrowserDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IBrowserModuleDependency;", "browserDependency$delegate", "chatModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IChatModuleDependency;", "getChatModuleDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IChatModuleDependency;", "chatModuleDependency$delegate", "commonDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ICommonDependency;", "getCommonDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ICommonDependency;", "commonDependency$delegate", "coreModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ICoreModuleDependency;", "getCoreModuleDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ICoreModuleDependency;", "coreModuleDependency$delegate", "docDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IDocDependency;", "getDocDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IDocDependency;", "docDependency$delegate", "featureGatingDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IFeatureGatingDependency;", "getFeatureGatingDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IFeatureGatingDependency;", "featureGatingDependency$delegate", "imageDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IImageDependency;", "getImageDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IImageDependency;", "imageDependency$delegate", "languageDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILanguageDependency;", "getLanguageDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ILanguageDependency;", "languageDependency$delegate", "loginDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "getLoginDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "loginDependency$delegate", "mainModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IMainModuleDependency;", "getMainModuleDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IMainModuleDependency;", "mainModuleDependency$delegate", "messengerModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IMessengerDependency;", "getMessengerModuleDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IMessengerDependency;", "messengerModuleDependency$delegate", "oldModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IOldModuleDependency;", "getOldModuleDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IOldModuleDependency;", "oldModuleDependency$delegate", "pushDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IPushDependency;", "getPushDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IPushDependency;", "pushDependency$delegate", "searchDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ISearchModuleDependency;", "getSearchDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ISearchModuleDependency;", "searchDependency$delegate", "settingDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ISettingDependency;", "getSettingDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ISettingDependency;", "settingDependency$delegate", "statisticsDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IStatisticsDependency;", "getStatisticsDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IStatisticsDependency;", "statisticsDependency$delegate", "timeFormatDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "getTimeFormatDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "timeFormatDependency$delegate", "zenModeDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IZenModeDependency;", "getZenModeDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IZenModeDependency;", "zenModeDependency$delegate", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoDependency implements ITodoDependency {
    private final Lazy accountChangeDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40020a.INSTANCE);
    private final Lazy appConfigDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40021b.INSTANCE);
    private final Lazy appLifeCycleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40022c.INSTANCE);
    private final Lazy blockitDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40023d.INSTANCE);
    private final Lazy browserDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40024e.INSTANCE);
    private final Lazy chatModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40025f.INSTANCE);
    private final Lazy commonDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40026g.INSTANCE);
    private final Lazy coreModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40027h.INSTANCE);
    private final Lazy docDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40028i.INSTANCE);
    private final Lazy featureGatingDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40029j.INSTANCE);
    private final Lazy imageDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40030k.INSTANCE);
    private final Lazy languageDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40031l.INSTANCE);
    private final Lazy loginDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40032m.INSTANCE);
    private final Lazy mainModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40033n.INSTANCE);
    private final Lazy messengerModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40034o.INSTANCE);
    private final Lazy oldModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40035p.INSTANCE);
    private final Lazy pushDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40036q.INSTANCE);
    private final Lazy searchDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40037r.INSTANCE);
    private final Lazy settingDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40038s.INSTANCE);
    private final Lazy statisticsDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40039t.INSTANCE);
    private final Lazy timeFormatDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40040u.INSTANCE);
    private final Lazy zenModeDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C40041v.INSTANCE);

    private final IAccountChangeDependency getAccountChangeDependency() {
        return (IAccountChangeDependency) this.accountChangeDependency$delegate.getValue();
    }

    private final IAppConfigDependency getAppConfigDependency() {
        return (IAppConfigDependency) this.appConfigDependency$delegate.getValue();
    }

    private final IAppLifeCycleDependency getAppLifeCycleDependency() {
        return (IAppLifeCycleDependency) this.appLifeCycleDependency$delegate.getValue();
    }

    private final IBlockitDependency getBlockitDependency() {
        return (IBlockitDependency) this.blockitDependency$delegate.getValue();
    }

    private final AbstractC56253e getBrowserDependency() {
        return (AbstractC56253e) this.browserDependency$delegate.getValue();
    }

    private final IChatModuleDependency getChatModuleDependency() {
        return (IChatModuleDependency) this.chatModuleDependency$delegate.getValue();
    }

    private final ICommonDependency getCommonDependency() {
        return (ICommonDependency) this.commonDependency$delegate.getValue();
    }

    private final ICoreModuleDependency getCoreModuleDependency() {
        return (ICoreModuleDependency) this.coreModuleDependency$delegate.getValue();
    }

    private final AbstractC56254i getDocDependency() {
        return (AbstractC56254i) this.docDependency$delegate.getValue();
    }

    private final AbstractC56255j getFeatureGatingDependency() {
        return (AbstractC56255j) this.featureGatingDependency$delegate.getValue();
    }

    private final AbstractC56256k getImageDependency() {
        return (AbstractC56256k) this.imageDependency$delegate.getValue();
    }

    private final AbstractC56257l getLanguageDependency() {
        return (AbstractC56257l) this.languageDependency$delegate.getValue();
    }

    private final ILoginDependency getLoginDependency() {
        return (ILoginDependency) this.loginDependency$delegate.getValue();
    }

    private final IMainModuleDependency getMainModuleDependency() {
        return (IMainModuleDependency) this.mainModuleDependency$delegate.getValue();
    }

    private final IMessengerDependency getMessengerModuleDependency() {
        return (IMessengerDependency) this.messengerModuleDependency$delegate.getValue();
    }

    private final IOldModuleDependency getOldModuleDependency() {
        return (IOldModuleDependency) this.oldModuleDependency$delegate.getValue();
    }

    private final IPushDependency getPushDependency() {
        return (IPushDependency) this.pushDependency$delegate.getValue();
    }

    private final ISearchModuleDependency getSearchDependency() {
        return (ISearchModuleDependency) this.searchDependency$delegate.getValue();
    }

    private final ISettingDependency getSettingDependency() {
        return (ISettingDependency) this.settingDependency$delegate.getValue();
    }

    private final AbstractC56258t getStatisticsDependency() {
        return (AbstractC56258t) this.statisticsDependency$delegate.getValue();
    }

    private final AbstractC56259u getTimeFormatDependency() {
        return (AbstractC56259u) this.timeFormatDependency$delegate.getValue();
    }

    private final IZenModeDependency getZenModeDependency() {
        return (IZenModeDependency) this.zenModeDependency$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoAccountChange;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$a */
    static final class C40020a extends Lambda implements Function0<TodoAccountChange> {
        public static final C40020a INSTANCE = new C40020a();

        C40020a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoAccountChange invoke() {
            return new TodoAccountChange();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoAppConfig;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$b */
    static final class C40021b extends Lambda implements Function0<TodoAppConfig> {
        public static final C40021b INSTANCE = new C40021b();

        C40021b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoAppConfig invoke() {
            return new TodoAppConfig();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoAppLifeCycle;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$c */
    static final class C40022c extends Lambda implements Function0<TodoAppLifeCycle> {
        public static final C40022c INSTANCE = new C40022c();

        C40022c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoAppLifeCycle invoke() {
            return new TodoAppLifeCycle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoBlockit;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$d */
    static final class C40023d extends Lambda implements Function0<TodoBlockit> {
        public static final C40023d INSTANCE = new C40023d();

        C40023d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoBlockit invoke() {
            return new TodoBlockit();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoBrowser;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$e */
    static final class C40024e extends Lambda implements Function0<TodoBrowser> {
        public static final C40024e INSTANCE = new C40024e();

        C40024e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoBrowser invoke() {
            return new TodoBrowser();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoChat;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$f */
    static final class C40025f extends Lambda implements Function0<TodoChat> {
        public static final C40025f INSTANCE = new C40025f();

        C40025f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoChat invoke() {
            return new TodoChat();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoCommon;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$g */
    static final class C40026g extends Lambda implements Function0<TodoCommon> {
        public static final C40026g INSTANCE = new C40026g();

        C40026g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoCommon invoke() {
            return new TodoCommon();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoCoreModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$h */
    static final class C40027h extends Lambda implements Function0<TodoCoreModule> {
        public static final C40027h INSTANCE = new C40027h();

        C40027h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoCoreModule invoke() {
            return new TodoCoreModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoDoc;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$i */
    static final class C40028i extends Lambda implements Function0<TodoDoc> {
        public static final C40028i INSTANCE = new C40028i();

        C40028i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoDoc invoke() {
            return new TodoDoc();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoFeatureGating;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$j */
    static final class C40029j extends Lambda implements Function0<C40053j> {
        public static final C40029j INSTANCE = new C40029j();

        C40029j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C40053j invoke() {
            return new C40053j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoImage;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$k */
    static final class C40030k extends Lambda implements Function0<TodoImage> {
        public static final C40030k INSTANCE = new C40030k();

        C40030k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoImage invoke() {
            return new TodoImage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoLanguage;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$l */
    static final class C40031l extends Lambda implements Function0<C40054l> {
        public static final C40031l INSTANCE = new C40031l();

        C40031l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C40054l invoke() {
            return new C40054l();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoLogin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$m */
    static final class C40032m extends Lambda implements Function0<TodoLogin> {
        public static final C40032m INSTANCE = new C40032m();

        C40032m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoLogin invoke() {
            return new TodoLogin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoMain;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$n */
    static final class C40033n extends Lambda implements Function0<TodoMain> {
        public static final C40033n INSTANCE = new C40033n();

        C40033n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoMain invoke() {
            return new TodoMain();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoMessengerDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$o */
    static final class C40034o extends Lambda implements Function0<TodoMessengerDependency> {
        public static final C40034o INSTANCE = new C40034o();

        C40034o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoMessengerDependency invoke() {
            return new TodoMessengerDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoOldModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$p */
    static final class C40035p extends Lambda implements Function0<TodoOldModule> {
        public static final C40035p INSTANCE = new C40035p();

        C40035p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoOldModule invoke() {
            return new TodoOldModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoPush;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$q */
    static final class C40036q extends Lambda implements Function0<TodoPush> {
        public static final C40036q INSTANCE = new C40036q();

        C40036q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoPush invoke() {
            return new TodoPush();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoSearch;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$r */
    static final class C40037r extends Lambda implements Function0<TodoSearch> {
        public static final C40037r INSTANCE = new C40037r();

        C40037r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoSearch invoke() {
            return new TodoSearch();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoSetting;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$s */
    static final class C40038s extends Lambda implements Function0<TodoSetting> {
        public static final C40038s INSTANCE = new C40038s();

        C40038s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoSetting invoke() {
            return new TodoSetting();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoStatistics;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$t */
    static final class C40039t extends Lambda implements Function0<C40058u> {
        public static final C40039t INSTANCE = new C40039t();

        C40039t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C40058u invoke() {
            return new C40058u();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoTimeFormatDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$u */
    static final class C40040u extends Lambda implements Function0<TodoTimeFormatDependency> {
        public static final C40040u INSTANCE = new C40040u();

        C40040u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoTimeFormatDependency invoke() {
            return new TodoTimeFormatDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/todo/dependency/TodoZenMode;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.TodoDependency$v */
    static final class C40041v extends Lambda implements Function0<TodoZenMode> {
        public static final C40041v INSTANCE = new C40041v();

        C40041v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoZenMode invoke() {
            return new TodoZenMode();
        }
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IAccountChangeDependency accountChangeDependency() {
        return getAccountChangeDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IAppConfigDependency appConfigDependency() {
        return getAppConfigDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IAppLifeCycleDependency appLifeCycleDependency() {
        return getAppLifeCycleDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IBlockitDependency blockitDependency() {
        return getBlockitDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public AbstractC56253e browserDependency() {
        return getBrowserDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IChatModuleDependency chatModuleDependency() {
        return getChatModuleDependency();
    }

    public ICommonDependency commonDependency() {
        return getCommonDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public ICoreModuleDependency coreModuleDependency() {
        return getCoreModuleDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public AbstractC56254i docDependency() {
        return getDocDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public AbstractC56255j featureGatingDependency() {
        return getFeatureGatingDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public AbstractC56256k imageDependency() {
        return getImageDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public AbstractC56257l languageDependency() {
        return getLanguageDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public ILoginDependency loginDependency() {
        return getLoginDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IMainModuleDependency mainModuleDependency() {
        return getMainModuleDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IMessengerDependency messengerModuleDependency() {
        return getMessengerModuleDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IOldModuleDependency oldModuleDependency() {
        return getOldModuleDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IPushDependency pushDependency() {
        return getPushDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public ISearchModuleDependency searchDependency() {
        return getSearchDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public ISettingDependency settingDependency() {
        return getSettingDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public AbstractC56258t statisticsDependency() {
        return getStatisticsDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public AbstractC56259u timeFormatDependency() {
        return getTimeFormatDependency();
    }

    @Override // com.ss.android.lark.todo.dependency.ITodoDependency
    public IZenModeDependency zenModeDependency() {
        return getZenModeDependency();
    }

    public TodoDependency() {
        C40046a aVar = new C40046a();
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerNotification(aVar.mo31112a(), aVar);
    }
}
