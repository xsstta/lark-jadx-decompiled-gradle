package com.ss.android.lark.mm.module.record.audiorecorder;

import android.content.Context;
import android.os.Environment;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.record.model.MmRecordingLangSp;
import com.ss.android.lark.mm.module.record.upload.model.C46974a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.C69104g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J'\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016JF\u0010\u0017\u001a\u00020\f2>\u0010\u0018\u001a:\u00120\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u001aj\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u0001`\u001c\u0012\u0004\u0012\u00020\f0\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0004J\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u0010\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010\u0004J\u0012\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010(\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u0004J\u0012\u0010)\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\n\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u001eH\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0012\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010.\u001a\u00020\u0004H\u0007J\u0012\u0010/\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u0004J\n\u00101\u001a\u0004\u0018\u00010\u001eH\u0002J\u0019\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u001eJ\b\u00105\u001a\u00020\u0011H\u0002J\u001c\u00106\u001a\u0004\u0018\u00010\u001b2\b\u0010'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmAudioFileHelper;", "", "()V", "AAC_DIR", "", "AUDIO_DISK_THRESHOLD", "", "AUDIO_RECORD_DIR", "PART_DIR", "SPLIT", "TAG", "deleteFile", "", "filePath", "deleteLocalAudioFile", "token", "isForceDelete", "", "serverAudioDuration", "", "(Ljava/lang/String;ZLjava/lang/Long;)V", "findLocalAudioTokens", "", "findNeedUploadParts", "callback", "Lkotlin/Function1;", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/record/upload/model/MmAudioUploadRequest;", "Lkotlin/collections/HashMap;", "getAacFullDirFile", "Ljava/io/File;", "getAacFullFileSize", "objectToken", "getAudioFileSize", "getAudioPartFileSizeByToken", "getAudioTenantAndUserKey", "getDurationForAudioFile", "audioFilePath", "getDurationForPcm", "file", "getExternalAacFullDirFile", "getExternalTokenDirFile", "getExternalUserLevelDirFile", "getFolderSize", "getLocalAacPartFile", "getLocalAudioAacFile", "mToken", "getPrivateAacFullDirFile", "getPrivateTokenDirFile", "getPrivateUserLevelDirFile", "getSegIdFromFile", "(Ljava/io/File;)Ljava/lang/Integer;", "getStartTimeFromFile", "isExternalStorageAvailable", "mapFileToRequest", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.a */
public final class MmAudioFileHelper {

    /* renamed from: a */
    public static final MmAudioFileHelper f117976a = new MmAudioFileHelper();

    private MmAudioFileHelper() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.a$a */
    public static final class RunnableC46863a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f117977a;

        RunnableC46863a(String str) {
            this.f117977a = str;
        }

        public final void run() {
            C69104g.m265937f(new File(this.f117977a));
        }
    }

    /* renamed from: f */
    private final boolean m185638f() {
        String externalStorageState = Environment.getExternalStorageState();
        Intrinsics.checkExpressionValueIsNotNull(externalStorageState, "Environment.getExternalStorageState()");
        return Intrinsics.areEqual("mounted", externalStorageState);
    }

    /* renamed from: c */
    public final long mo164605c() {
        File d = m185636d();
        if (d != null) {
            return f117976a.m185635c(d);
        }
        return 0;
    }

    /* renamed from: e */
    private final File m185637e() {
        boolean z;
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
        Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
        String b = loginDepend.mo144650b();
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.ILoginDepend loginDepend2 = a2.getLoginDepend();
        Intrinsics.checkExpressionValueIsNotNull(loginDepend2, "MmDepend.impl().loginDepend");
        String a3 = loginDepend2.mo144647a();
        String str = b;
        boolean z2 = false;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = a3;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z2 = true;
            }
            if (!z2) {
                return new File(C45851c.m181646a().getExternalFilesDir(null), "MmAudioRecord/" + (b + a3).hashCode());
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo164598a() {
        boolean z;
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
        Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
        String b = loginDepend.mo144650b();
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.ILoginDepend loginDepend2 = a2.getLoginDepend();
        Intrinsics.checkExpressionValueIsNotNull(loginDepend2, "MmDepend.impl().loginDepend");
        String a3 = loginDepend2.mo144647a();
        String str = b;
        boolean z2 = false;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str2 = a3;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        return String.valueOf((b + a3).hashCode());
    }

    /* renamed from: b */
    public final List<String> mo164604b() {
        File[] listFiles;
        File d = m185636d();
        if (d == null || !d.exists() || !d.isDirectory() || (listFiles = d.listFiles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            Intrinsics.checkExpressionValueIsNotNull(file, "it");
            arrayList.add(file.getName());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.a$b */
    public static final class RunnableC46864b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f117978a;

        /* renamed from: b */
        final /* synthetic */ boolean f117979b;

        /* renamed from: c */
        final /* synthetic */ Long f117980c;

        RunnableC46864b(String str, boolean z, Long l) {
            this.f117978a = str;
            this.f117979b = z;
            this.f117980c = l;
        }

        public final void run() {
            File b = MmAudioFileHelper.f117976a.mo164603b(this.f117978a);
            File c = MmAudioFileHelper.f117976a.mo164606c(this.f117978a);
            if (this.f117979b) {
                C45855f.m181664c("MmAudioFileHelper", "delete Local Audio File, token: " + this.f117978a);
                if (b != null) {
                    C69104g.m265937f(b);
                }
                if (c != null) {
                    C69104g.m265937f(c);
                    return;
                }
                return;
            }
            Long l = this.f117980c;
            if (l != null) {
                l.longValue();
                String g = MmAudioFileHelper.f117976a.mo164610g(this.f117978a);
                if (g != null) {
                    long h = MmAudioFileHelper.f117976a.mo164611h(g);
                    long abs = Math.abs(h - this.f117980c.longValue());
                    C45855f.m181664c("MmAudioFileHelper", "[deleteLocalAudioFile] gap: " + abs);
                    if (abs <= ((long) Math.min(Math.max(((float) h) * 0.1f, 1000.0f), 120000.0f))) {
                        C45855f.m181664c("MmAudioFileHelper", "delete Local Audio File, token: " + this.f117978a);
                        if (b != null) {
                            C69104g.m265937f(b);
                        }
                        if (c != null) {
                            C69104g.m265937f(c);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private final File m185636d() {
        boolean z;
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
        Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
        String b = loginDepend.mo144650b();
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.ILoginDepend loginDepend2 = a2.getLoginDepend();
        Intrinsics.checkExpressionValueIsNotNull(loginDepend2, "MmDepend.impl().loginDepend");
        String a3 = loginDepend2.mo144647a();
        String str = b;
        boolean z2 = false;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str2 = a3;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MmAudioRecord/");
        sb.append((b + a3).hashCode());
        String sb2 = sb.toString();
        Context a4 = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "MmContext.getContext()");
        return new File(a4.getFilesDir(), sb2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.a$c */
    public static final class RunnableC46865c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Function1 f117981a;

        RunnableC46865c(Function1 function1) {
            this.f117981a = function1;
        }

        public final void run() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.ILoginDepend loginDepend = a.getLoginDepend();
            Intrinsics.checkExpressionValueIsNotNull(loginDepend, "MmDepend.impl().loginDepend");
            String b = loginDepend.mo144650b();
            IMmDepend a2 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
            IMmDepend.ILoginDepend loginDepend2 = a2.getLoginDepend();
            Intrinsics.checkExpressionValueIsNotNull(loginDepend2, "MmDepend.impl().loginDepend");
            String a3 = loginDepend2.mo144647a();
            String str = b;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str2 = a3;
                if (str2 == null || StringsKt.isBlank(str2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MmAudioRecord/");
                    sb.append((b + a3).hashCode());
                    String sb2 = sb.toString();
                    Context a4 = C45851c.m181646a();
                    Intrinsics.checkExpressionValueIsNotNull(a4, "MmContext.getContext()");
                    File file = new File(a4.getFilesDir(), sb2);
                    if (!file.exists() || !file.isDirectory()) {
                        this.f117981a.invoke(null);
                        return;
                    }
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            HashMap hashMap = new HashMap();
                            for (File file2 : listFiles) {
                                File[] listFiles2 = new File(file2, "part").listFiles();
                                if (listFiles2 != null) {
                                    if (listFiles2.length == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        HashMap hashMap2 = hashMap;
                                        Intrinsics.checkExpressionValueIsNotNull(file2, "objectTokenFile");
                                        String name = file2.getName();
                                        Intrinsics.checkExpressionValueIsNotNull(name, "objectTokenFile.name");
                                        ArrayList arrayList = new ArrayList();
                                        for (File file3 : listFiles2) {
                                            MmAudioFileHelper aVar = MmAudioFileHelper.f117976a;
                                            String name2 = file2.getName();
                                            Intrinsics.checkExpressionValueIsNotNull(name2, "objectTokenFile.name");
                                            C46974a a5 = aVar.mo164597a(file3, name2);
                                            if (a5 != null) {
                                                arrayList.add(a5);
                                            }
                                        }
                                        hashMap2.put(name, CollectionsKt.sortedWith(arrayList, new C46866a()));
                                    }
                                }
                            }
                            this.f117981a.invoke(hashMap);
                            return;
                        }
                    }
                    this.f117981a.invoke(null);
                    return;
                }
            }
            this.f117981a.invoke(null);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.a$c$a */
        public static final class C46866a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(t.mo164937d()), Integer.valueOf(t2.mo164937d()));
            }
        }
    }

    /* renamed from: i */
    private final File m185639i(String str) {
        File b = mo164603b(str);
        if (b != null) {
            return new File(b, "aac");
        }
        return null;
    }

    /* renamed from: k */
    private final File m185641k(String str) {
        File b = mo164603b(str);
        if (b != null) {
            return new File(b, "part");
        }
        return null;
    }

    /* renamed from: j */
    private final File m185640j(String str) {
        File file = null;
        File d = mo164607d(str);
        File i = m185639i(str);
        if (d == null || !d.exists()) {
            return (i == null || !i.exists()) ? file : i;
        }
        return d;
    }

    /* renamed from: l */
    private final long m185642l(String str) {
        if (str == null) {
            return 0;
        }
        return (long) ((((float) new File(str).length()) / ((float) 88200)) * ((float) 1000));
    }

    /* renamed from: b */
    public final File mo164603b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        File d = m185636d();
        if (d != null) {
            return new File(d, str);
        }
        return null;
    }

    /* renamed from: c */
    public final File mo164606c(String str) {
        File e = m185637e();
        if (e != null) {
            return new File(e, str);
        }
        return null;
    }

    /* renamed from: d */
    public final File mo164607d(String str) {
        File c;
        Intrinsics.checkParameterIsNotNull(str, "token");
        if (!m185638f() || (c = mo164606c(str)) == null) {
            return null;
        }
        return new File(c, "aac");
    }

    /* renamed from: e */
    public final long mo164608e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        File k = m185641k(str);
        if (k != null) {
            return f117976a.m185635c(k);
        }
        return 0;
    }

    /* renamed from: f */
    public final long mo164609f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        String g = mo164610g(str);
        if (g != null) {
            return new File(g).length();
        }
        return 0;
    }

    /* renamed from: b */
    private final Integer m185634b(File file) {
        if (file == null) {
            return null;
        }
        List split$default = StringsKt.split$default((CharSequence) C69104g.m265936e(file), new String[]{"-"}, false, 0, 6, (Object) null);
        if (split$default.size() != 2) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt((String) split$default.get(1)));
    }

    /* renamed from: c */
    private final long m185635c(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                Intrinsics.checkExpressionValueIsNotNull(file2, "fileList[i]");
                if (file2.isDirectory()) {
                    File file3 = listFiles[i];
                    Intrinsics.checkExpressionValueIsNotNull(file3, "fileList[i]");
                    j = m185635c(file3);
                } else {
                    j = listFiles[i].length();
                }
                j2 += j;
            }
        }
        return j2;
    }

    /* renamed from: a */
    public final String mo164599a(File file) {
        if (file == null) {
            return null;
        }
        List split$default = StringsKt.split$default((CharSequence) C69104g.m265936e(file), new String[]{"-"}, false, 0, 6, (Object) null);
        if (split$default.size() != 2) {
            return null;
        }
        return (String) split$default.get(0);
    }

    /* renamed from: g */
    public final String mo164610g(String str) {
        File[] listFiles;
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "mToken");
        File j = m185640j(str);
        if (!(j == null || !j.isDirectory() || (listFiles = j.listFiles()) == null)) {
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                File file = listFiles[0];
                Intrinsics.checkExpressionValueIsNotNull(file, "listFiles[0]");
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo164611h(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.record.audiorecorder.MmAudioFileHelper.mo164611h(java.lang.String):long");
    }

    /* renamed from: a */
    public final void mo164600a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        if (!StringsKt.isBlank(str)) {
            C45855f.m181663b("MmAudioFileHelper", "[deleteFile] filePath: " + str);
            C45857i.m181676a(new RunnableC46863a(str));
        }
    }

    /* renamed from: a */
    public final void mo164602a(Function1<? super HashMap<String, List<C46974a>>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        C45857i.m181676a(new RunnableC46865c(function1));
    }

    /* renamed from: a */
    public final C46974a mo164597a(File file, String str) {
        C46974a aVar = null;
        if (file == null) {
            return null;
        }
        Integer b = m185634b(file);
        if (b != null) {
            int intValue = b.intValue();
            String a = mo164599a(file);
            if (a != null) {
                int h = (int) mo164611h(file.getAbsolutePath());
                if (h < 500) {
                    C45855f.m181664c("MmAudioFileHelper", "[mapFileToRequest] duration below 500ms, delete");
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
                    mo164600a(absolutePath);
                } else {
                    aVar = new C46974a();
                    aVar.mo164929a(h);
                    aVar.mo164936c(file.getAbsolutePath());
                    aVar.mo164930a(str);
                    aVar.mo164934b(a);
                    aVar.mo164933b(intValue);
                    String a2 = MmRecordingLangSp.f118185a.mo164880a(str);
                    if (StringsKt.isBlank(a2)) {
                        IMmDepend a3 = C45899c.m181859a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "MmDepend.impl()");
                        IMmDepend.AbstractC45879g hostDepend = a3.getHostDepend();
                        Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
                        String c = hostDepend.mo144635c();
                        Intrinsics.checkExpressionValueIsNotNull(c, "MmDepend.impl().hostDepend.locale");
                        if (StringsKt.contains((CharSequence) c, (CharSequence) "zh", true)) {
                            a2 = "zh_cn";
                        } else {
                            a2 = "en_us";
                        }
                    }
                    aVar.mo164938d(a2);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo164601a(String str, boolean z, Long l) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        C45857i.m181676a(new RunnableC46864b(str, z, l));
    }

    /* renamed from: a */
    public static /* synthetic */ void m185633a(MmAudioFileHelper aVar, String str, boolean z, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        aVar.mo164601a(str, z, l);
    }
}
