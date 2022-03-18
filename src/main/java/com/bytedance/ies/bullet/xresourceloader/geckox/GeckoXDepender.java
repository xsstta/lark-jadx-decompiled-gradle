package com.bytedance.ies.bullet.xresourceloader.geckox;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.geckox.C14205b;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p772h.AbstractC14280c;
import com.bytedance.geckox.p772h.C14278a;
import com.bytedance.geckox.statistic.AbstractC14328a;
import com.bytedance.geckox.utils.C14369m;
import com.bytedance.ies.bullet.kit.resourceloader.ResLoaderConfigManager;
import com.bytedance.ies.bullet.kit.resourceloader.loader.LoaderUtil;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender;
import com.bytedance.ies.bullet.service.base.resourceloader.config.OnUpdateListener;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ResourceLoaderConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aJ(\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0002J\"\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0011H\u0002J+\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\u0018H\u0002J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0004H\u0002J\u0010\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0004H\u0002J\u0010\u00101\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0004H\u0002J\u0010\u00102\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0004H\u0002J$\u00103\u001a\u00020\u0016*\u00020+2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u000205H\u0002J4\u00106\u001a\u00020\u0016*\u00020+2\u0006\u0010\u0013\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\b\u00108\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u000205H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u00069"}, d2 = {"Lcom/bytedance/ies/bullet/xresourceloader/geckox/GeckoXDepender;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ILoaderDepender;", "()V", "GECKO_HIGH_PRIORITY_GROUP", "", "TAG", "geckoClientManager", "Lcom/bytedance/ies/bullet/xresourceloader/geckox/GeckoXClientManager;", "mStatisticMonitor", "Lcom/bytedance/geckox/statistic/IStatisticMonitor;", "service", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "getService", "()Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "setService", "(Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;)V", "checkIsExists", "", "rootDir", "accessKey", "channel", "checkUpdate", "", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "channelList", "", "listener", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/OnUpdateListener;", "geckoUpdateHighPriority", "getChannelPath", "Ljava/io/File;", "outChannel", "getGeckoOfflineDir", "offlineDir", "relativePath", "getGeckoXOfflineRootDirFileWithoutAccessKey", "offlineRootDir", "isRelative", "getLatestChannelVersion", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "getNormalGeckoXClient", "Lcom/bytedance/geckox/GeckoClient;", "initGeckoXMultiClient", "tConfig", "isNeedAppLogMonitor", "ak", "isNeedServerMonitor", "updateWhenInit", "useGeckoXV4", "checkUpdateMultiV4", "groupType", "Lcom/bytedance/geckox/listener/GeckoUpdateListener;", "checkUpdateTarget", "channels", "group", "x-resloader-dep-geckox_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ies.bullet.c.a.b */
public final class GeckoXDepender implements ILoaderDepender {

    /* renamed from: a */
    public final String f37822a = "GeckoXUtils";

    /* renamed from: b */
    private final String f37823b = "high_priority";

    /* renamed from: c */
    private final GeckoXClientManager f37824c = new GeckoXClientManager();

    /* renamed from: d */
    private IResourceLoaderService f37825d;

    /* renamed from: e */
    private final AbstractC14328a f37826e = new C14406b(this);

    /* renamed from: a */
    public IResourceLoaderService mo52609a() {
        return this.f37825d;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender
    /* renamed from: a */
    public void mo52571a(IResourceLoaderService iResourceLoaderService) {
        this.f37825d = iResourceLoaderService;
    }

    /* renamed from: a */
    private final C14205b m57946a(TaskConfig jVar) {
        String m = jVar.mo52767m();
        C14205b a = this.f37824c.mo52607a(m);
        if (a != null) {
            return a;
        }
        C14205b b = m57950b(jVar);
        this.f37824c.mo52608a(m, b);
        return b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J:\u0010\u000b\u001a\u00020\u00062&\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016JL\u0010\u0011\u001a\u00020\u00062&\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u0018\u00010\r2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0018\u00010\rH\u0016J\u001c\u0010\u0013\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u0014\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¨\u0006\u0017"}, d2 = {"com/bytedance/ies/bullet/xresourceloader/geckox/GeckoXDepender$checkUpdate$updateListener$1", "Lcom/bytedance/geckox/listener/GeckoUpdateListener;", "getResPath", "", "channel", "onActivateFail", "", "updatePackage", "Lcom/bytedance/geckox/model/UpdatePackage;", "e", "", "onCheckServerVersionFail", "requestMap", "", "", "Landroid/util/Pair;", "", "onCheckServerVersionSuccess", "responseMap", "onDownloadFail", "onUpdateFailed", "onUpdateSuccess", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "x-resloader-dep-geckox_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ies.bullet.c.a.b$a */
    public static final class C14405a extends AbstractC14267a {

        /* renamed from: a */
        final /* synthetic */ GeckoXDepender f37827a;

        /* renamed from: b */
        final /* synthetic */ TaskConfig f37828b;

        /* renamed from: c */
        final /* synthetic */ OnUpdateListener f37829c;

        /* renamed from: d */
        final /* synthetic */ List f37830d;

        /* renamed from: c */
        private final String m57957c(String str) {
            return this.f37827a.mo52574b(LoaderUtil.f37766a.mo52542a(ResLoaderConfigManager.f37779a.mo52569a().mo52565a(this.f37827a.mo52609a()), this.f37828b.mo52767m()).mo52731e(), this.f37828b.mo52767m(), str);
        }

        @Override // com.bytedance.geckox.p769e.AbstractC14267a
        /* renamed from: a */
        public void mo21859a(UpdatePackage updatePackage, Throwable th) {
            OnUpdateListener fVar = this.f37829c;
            if (fVar != null) {
                List<String> list = this.f37830d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.mo52535a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p769e.AbstractC14267a
        /* renamed from: b */
        public void mo21866b(UpdatePackage updatePackage, Throwable th) {
            OnUpdateListener fVar = this.f37829c;
            if (fVar != null) {
                List<String> list = this.f37830d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.mo52535a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p769e.AbstractC14267a
        /* renamed from: a */
        public void mo21861a(String str, long j) {
            Intrinsics.checkParameterIsNotNull(str, "channel");
            Log.i("GeckoXResLoadStrategy", "onUpdateSuccess");
            String c = m57957c(str);
            OnUpdateListener fVar = this.f37829c;
            if (fVar != null) {
                fVar.mo52534a(this.f37830d, c);
            }
        }

        @Override // com.bytedance.geckox.p769e.AbstractC14267a
        /* renamed from: a */
        public void mo21862a(String str, Throwable th) {
            super.mo21862a(str, th);
            OnUpdateListener fVar = this.f37829c;
            if (fVar != null) {
                List<String> list = this.f37830d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.mo52535a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p769e.AbstractC14267a
        /* renamed from: a */
        public void mo21863a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
            OnUpdateListener fVar = this.f37829c;
            if (fVar != null) {
                List<String> list = this.f37830d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.mo52535a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p769e.AbstractC14267a
        /* renamed from: a */
        public void mo21864a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
            boolean z;
            super.mo21864a(map, map2);
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : this.f37830d) {
                String str = (String) obj;
                UpdatePackage updatePackage = null;
                List<UpdatePackage> list = map2 != null ? map2.get(this.f37828b.mo52767m()) : null;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (Intrinsics.areEqual(next.getChannel(), str)) {
                            updatePackage = next;
                            break;
                        }
                    }
                    updatePackage = updatePackage;
                }
                if (updatePackage != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(obj);
                }
            }
            for (String str2 : arrayList) {
                OnUpdateListener fVar = this.f37829c;
                if (fVar != null) {
                    fVar.mo52534a(this.f37830d, m57957c(str2));
                }
            }
        }

        C14405a(GeckoXDepender bVar, TaskConfig jVar, OnUpdateListener fVar, List list) {
            this.f37827a = bVar;
            this.f37828b = jVar;
            this.f37829c = fVar;
            this.f37830d = list;
        }
    }

    /* renamed from: a */
    private final boolean m57949a(String str) {
        return LoaderUtil.f37766a.mo52542a(ResLoaderConfigManager.f37779a.mo52569a().mo52565a(mo52609a()), str).mo52727a();
    }

    /* renamed from: b */
    private final C14205b m57950b(TaskConfig jVar) {
        C14278a aVar;
        ResourceLoaderConfig a = ResLoaderConfigManager.f37779a.mo52569a().mo52565a(mo52609a());
        if (a == null) {
            return null;
        }
        Application a2 = ResLoaderConfigManager.f37779a.mo52569a().mo52564a();
        String f = a.mo52741f();
        if (TextUtils.isEmpty(f)) {
            Log.e(this.f37822a, "registerGeckoClientSpi: did is empty");
            return null;
        }
        String m = jVar.mo52767m();
        File a3 = m57947a(LoaderUtil.f37766a.mo52542a(a, m).mo52731e(), LoaderUtil.f37766a.mo52542a(a, m).mo52733g());
        if (LoaderUtil.f37766a.mo52542a(a, m).mo52729c() instanceof AbstractC14280c) {
            Object c = LoaderUtil.f37766a.mo52542a(a, m).mo52729c();
            if (c != null) {
                aVar = (AbstractC14280c) c;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.geckox.net.INetWork");
            }
        } else {
            aVar = new C14278a();
        }
        try {
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            return C14205b.m57334a(new C14218d.C14220a(a2.getApplicationContext()).mo52166c(a.mo52736a()).mo52154a(Long.parseLong(a.mo52739d())).mo52158a(a.mo52740e()).mo52155a(aVar).mo52156a(this.f37826e).mo52160a(m57949a(jVar.mo52767m())).mo52167d(a.mo52737b()).mo52165b(m).mo52161a(m).mo52163b(f).mo52157a(a3).mo52162a());
        } catch (Exception e) {
            Log.e("Gecko", "registerGeckoClientSpi: " + Log.getStackTraceString(e));
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "event", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "upload"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ies.bullet.c.a.b$b */
    static final class C14406b implements AbstractC14328a {

        /* renamed from: a */
        final /* synthetic */ GeckoXDepender f37831a;

        C14406b(GeckoXDepender bVar) {
            this.f37831a = bVar;
        }

        @Override // com.bytedance.geckox.statistic.AbstractC14328a
        public final void upload(String str, JSONObject jSONObject) {
            if (!TextUtils.isEmpty(str) && jSONObject != null) {
                String str2 = this.f37831a.f37822a;
                Log.d(str2, "event:" + str + ",data:" + jSONObject);
            }
        }
    }

    /* renamed from: a */
    private final File m57947a(String str, boolean z) {
        if (!z) {
            return new File(str);
        }
        try {
            Application a = ResLoaderConfigManager.f37779a.mo52569a().mo52564a();
            if (a == null) {
                Intrinsics.throwNpe();
            }
            File filesDir = a.getFilesDir();
            Intrinsics.checkExpressionValueIsNotNull(filesDir, "ResLoaderConfigManager.g…().application!!.filesDir");
            File file = new File(filesDir.getAbsolutePath(), str);
            if (file.exists()) {
                return file;
            }
            file.mkdirs();
            return file;
        } catch (Exception unused) {
            return new File(str);
        }
    }

    /* renamed from: a */
    private final String m57948a(File file, String str, String str2) {
        boolean z;
        boolean z2;
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        if (StringsKt.indexOf$default((CharSequence) str4, "/", 0, false, 6, (Object) null) == 0) {
            if (str2 != null) {
                str2 = str2.substring(1);
                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        String str5 = str2;
        if (StringsKt.lastIndexOf$default((CharSequence) str5, "/", 0, false, 6, (Object) null) == str2.length() - 1) {
            int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str5, "/", 0, false, 6, (Object) null);
            if (str2 != null) {
                str2 = str2.substring(0, lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        try {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            String absolutePath = file2.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
            File file3 = new File(absolutePath, str2);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            Long a = C14369m.m57849a(file3);
            if (a == null) {
                return null;
            }
            String str6 = absolutePath + File.separator + str2 + File.separator + a.longValue() + File.separator + "res";
            Log.d(this.f37822a, "getChannelPath:" + str6);
            return str6;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private final Long m57951c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        String str4 = this.f37822a;
        Log.d(str4, "getLatestChannelVersion:rootdir:" + str + ",accessKey:" + str2 + ",channel:" + str3);
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
            File file2 = new File(absolutePath, str3);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            Long a = C14369m.m57849a(file2);
            String str5 = this.f37822a;
            Log.d(str5, "getLatestChannelVersion:" + a);
            return a;
        } catch (Throwable th) {
            Log.d(this.f37822a, "getLatestChannelVersion:error");
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender
    /* renamed from: a */
    public void mo52572a(TaskConfig jVar, List<String> list, OnUpdateListener fVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        Intrinsics.checkParameterIsNotNull(list, "channelList");
        C14405a aVar = new C14405a(this, jVar, fVar, list);
        C14205b a = m57946a(jVar);
        if (a != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CheckRequestBodyModel.TargetChannel(list.get(0)));
            HashMap hashMap2 = hashMap;
            hashMap2.put(jVar.mo52767m(), arrayList);
            a.mo52091a(hashMap2, aVar);
        } else if (fVar != null) {
            fVar.mo52535a(list, new Throwable("GeckoXClient is null"));
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender
    /* renamed from: a */
    public boolean mo52573a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "rootDir");
        Intrinsics.checkParameterIsNotNull(str2, "accessKey");
        Intrinsics.checkParameterIsNotNull(str3, "channel");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        String absolutePath = m57947a(str, LoaderUtil.f37766a.mo52542a(ResLoaderConfigManager.f37779a.mo52569a().mo52565a(mo52609a()), str2).mo52733g()).getAbsolutePath();
        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "getGeckoXOfflineRootDirF…           ).absolutePath");
        if (m57951c(absolutePath, str2, str3) != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.ILoaderDepender
    /* renamed from: b */
    public String mo52574b(String str, String str2, String str3) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "offlineDir");
        Intrinsics.checkParameterIsNotNull(str2, "accessKey");
        Intrinsics.checkParameterIsNotNull(str3, "relativePath");
        boolean z3 = false;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = str3;
            if (str4.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (StringsKt.indexOf$default((CharSequence) str4, "/", 0, false, 6, (Object) null) != 0) {
                    return m57948a(m57947a(str, LoaderUtil.f37766a.mo52542a(ResLoaderConfigManager.f37779a.mo52569a().mo52565a(mo52609a()), str2).mo52733g()), str2, str3);
                }
                StringBuilder sb = new StringBuilder();
                Object[] array = new Regex("/").split(str4, 0).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length <= 1) {
                        return null;
                    }
                    String str5 = strArr[1];
                    int length = strArr.length;
                    for (int i = 2; i < length; i++) {
                        sb.append(File.separator);
                        sb.append(strArr[i]);
                    }
                    if (TextUtils.isEmpty(str5)) {
                        return null;
                    }
                    try {
                        File file = new File(m57947a(str, LoaderUtil.f37766a.mo52542a(ResLoaderConfigManager.f37779a.mo52569a().mo52565a(mo52609a()), str2).mo52733g()), str2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
                        File file2 = new File(absolutePath, str5);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        Long a = C14369m.m57849a(file2);
                        if (a == null) {
                            return null;
                        }
                        String str6 = absolutePath + File.separator + str5 + File.separator + a.longValue() + File.separator + "res";
                        if (sb.length() > 0) {
                            z3 = true;
                        }
                        if (z3) {
                            str6 = str6 + sb.toString();
                        }
                        Log.d(this.f37822a, "getRnResPath:" + str6);
                        return str6;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return null;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        return null;
    }
}
