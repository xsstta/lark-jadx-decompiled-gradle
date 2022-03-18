package com.ss.android.lark.todo.dependency;

import com.ss.android.lark.todo.dependency.idependency.IAccountChangeDependency;
import com.ss.android.lark.todo.dependency.idependency.IAppConfigDependency;
import com.ss.android.lark.todo.dependency.idependency.IAppLifeCycleDependency;
import com.ss.android.lark.todo.dependency.idependency.IBlockitDependency;
import com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency;
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
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020'H&J\b\u0010(\u001a\u00020)H&J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020-H&¨\u0006."}, d2 = {"Lcom/ss/android/lark/todo/dependency/ITodoDependency;", "", "accountChangeDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IAccountChangeDependency;", "appConfigDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IAppConfigDependency;", "appLifeCycleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IAppLifeCycleDependency;", "blockitDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IBlockitDependency;", "browserDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IBrowserModuleDependency;", "chatModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IChatModuleDependency;", "commonDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ICommonDependency;", "coreModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ICoreModuleDependency;", "docDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IDocDependency;", "featureGatingDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IFeatureGatingDependency;", "imageDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IImageDependency;", "languageDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILanguageDependency;", "loginDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "mainModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IMainModuleDependency;", "messengerModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IMessengerDependency;", "oldModuleDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IOldModuleDependency;", "pushDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IPushDependency;", "searchDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ISearchModuleDependency;", "settingDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ISettingDependency;", "statisticsDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IStatisticsDependency;", "timeFormatDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ITimeFormatDependency;", "zenModeDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IZenModeDependency;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.a */
public interface ITodoDependency {
    IAccountChangeDependency accountChangeDependency();

    IAppConfigDependency appConfigDependency();

    IAppLifeCycleDependency appLifeCycleDependency();

    IBlockitDependency blockitDependency();

    AbstractC56253e browserDependency();

    IChatModuleDependency chatModuleDependency();

    ICoreModuleDependency coreModuleDependency();

    AbstractC56254i docDependency();

    AbstractC56255j featureGatingDependency();

    AbstractC56256k imageDependency();

    AbstractC56257l languageDependency();

    ILoginDependency loginDependency();

    IMainModuleDependency mainModuleDependency();

    IMessengerDependency messengerModuleDependency();

    IOldModuleDependency oldModuleDependency();

    IPushDependency pushDependency();

    ISearchModuleDependency searchDependency();

    ISettingDependency settingDependency();

    AbstractC56258t statisticsDependency();

    AbstractC56259u timeFormatDependency();

    IZenModeDependency zenModeDependency();
}
