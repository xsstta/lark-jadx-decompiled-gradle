package com.ss.ugc.effectplatform.cache.disklrucache;

import bytekn.foundation.collections.SharedMutableList;
import bytekn.foundation.collections.SharedMutableMap;
import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.concurrent.executor.AsyncExecutor;
import bytekn.foundation.concurrent.lock.Lock;
import bytekn.foundation.io.file.ContentEncoding;
import bytekn.foundation.io.file.FileInputStream;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.io.file.FileMeta;
import bytekn.foundation.io.file.FileOutputStream;
import bytekn.foundation.io.file.FilePathComponent;
import bytekn.foundation.io.file.FileType;
import bytekn.foundation.io.file.IOException;
import bytekn.foundation.io.file.KnCloseable;
import bytekn.foundation.io.file.KnFileOutStreamWriter;
import bytekn.foundation.io.file.KnFileWriter;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1686c;
import com.ss.ugc.effectplatform.util.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 E2\u00020\u0001:\u0004EFGHB3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0003J\b\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020*J\u001c\u0010,\u001a\u00020*2\n\u0010-\u001a\u00060.R\u00020\u00002\u0006\u0010/\u001a\u00020\u0013H\u0002J\u0006\u00100\u001a\u00020*J\u001e\u00101\u001a\b\u0018\u00010.R\u00020\u00002\u0006\u0010(\u001a\u00020\u00032\u0006\u00102\u001a\u00020\bH\u0002J\u0016\u00101\u001a\b\u0018\u00010.R\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0003J\u0019\u00103\u001a\b\u0018\u000104R\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0002J\u0006\u00105\u001a\u00020\bJ\u0010\u00106\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010\u0003J\b\u00107\u001a\u00020*H\u0002J\b\u00108\u001a\u00020\u0013H\u0002J\u0006\u00109\u001a\u00020\u0013J\b\u0010:\u001a\u00020\u0013H\u0002J\b\u0010;\u001a\u00020*H\u0002J\u0006\u0010<\u001a\u00020*J\b\u0010=\u001a\u00020*H\u0002J\u0010\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u0003H\u0002J\b\u0010@\u001a\u00020*H\u0002J\u0010\u0010A\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010\u0003J\u000e\u0010B\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010C\u001a\u00020*H\u0002J\u0010\u0010D\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001fR\u00020\u00000\u001eX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;", "", "directory", "", "appVersion", "", "valueCount", "maxSize", "", "iAllowListKeyRule", "Lcom/ss/ugc/effectplatform/cache/disklrucache/IAllowListKeyRule;", "(Ljava/lang/String;IIJLcom/ss/ugc/effectplatform/cache/disklrucache/IAllowListKeyRule;)V", "classLock", "Lbytekn/foundation/concurrent/lock/Lock;", "cleanUpRunnable", "Ljava/lang/Runnable;", "Lbytekn/foundation/concurrent/Runnable;", "closed", "Lbytekn/foundation/concurrent/SharedReference;", "", "executorService", "Lbytekn/foundation/concurrent/executor/AsyncExecutor;", "initialized", "journalBackupComponent", "Lbytekn/foundation/io/file/FilePathComponent;", "journalComponent", "journalTmpComponent", "journalWriter", "Lbytekn/foundation/io/file/KnFileWriter;", "lruEntries", "Lbytekn/foundation/collections/SharedMutableMap;", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Entry;", "lruEntryKeys", "", "getLruEntryKeys", "()Ljava/util/Set;", "nextSequenceNumber", "redundantOpCount", "size", "addEntryToCache", "key", "checkNotClosed", "", "close", "completeEdit", "editor", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Editor;", "success", "delete", "edit", "expectedSequenceNumber", "get", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Snapshot;", "getMaxSize", "has", "initialize", "isClosed", "isValid", "journalRebuildRequired", "processJournal", "reOpen", "readJournal", "readJournalLine", "line", "rebuildJournal", "remove", "setMaxSize", "trimToSize", "validateKey", "Companion", "Editor", "Entry", "Snapshot", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.a.a */
public final class DiskLruCache {

    /* renamed from: h */
    public static final Companion f164764h = new Companion(null);

    /* renamed from: t */
    private static final Regex f164765t = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final FilePathComponent f164766a;

    /* renamed from: b */
    public SharedReference<Integer> f164767b;

    /* renamed from: c */
    public final Lock f164768c;

    /* renamed from: d */
    public SharedReference<Boolean> f164769d;

    /* renamed from: e */
    public SharedReference<Boolean> f164770e;

    /* renamed from: f */
    public final String f164771f;

    /* renamed from: g */
    public final int f164772g;

    /* renamed from: i */
    private final FilePathComponent f164773i;

    /* renamed from: j */
    private final FilePathComponent f164774j;

    /* renamed from: k */
    private SharedReference<Long> f164775k;

    /* renamed from: l */
    private SharedReference<KnFileWriter> f164776l;

    /* renamed from: m */
    private SharedReference<Long> f164777m;

    /* renamed from: n */
    private final SharedMutableMap<String, Entry> f164778n;

    /* renamed from: o */
    private final AsyncExecutor f164779o;

    /* renamed from: p */
    private final Runnable f164780p;

    /* renamed from: q */
    private final int f164781q;

    /* renamed from: r */
    private long f164782r;

    /* renamed from: s */
    private final IAllowListKeyRule f164783s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J2\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ \u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Companion;", "", "()V", "ANY_SEQUENCE_NUMBER", "", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "STRING_KEY_PATTERN", "TAG", "VERSION_1", "deleteIfExists", "", "file", "Lbytekn/foundation/io/file/FilePathComponent;", "open", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;", "directory", "appVersion", "", "valueCount", "maxSize", "iAllowListKeyRule", "Lcom/ss/ugc/effectplatform/cache/disklrucache/IAllowListKeyRule;", "renameTo", "from", "to", "deleteDestination", "", "toDiskLruCacheKey", "fileName", "toDiskLruCacheKeyPattern", "pattern", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m256638a(FilePathComponent gVar) {
            if (FileManager.f5817a.mo8725c(gVar) && !FileManager.f5817a.mo8727d(gVar)) {
                throw new IOException("delete file exception occur,file = " + gVar);
            }
        }

        /* renamed from: a */
        public final String mo227659a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fileName");
            char[] cArr = new char[str.length()];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                cArr[i] = str.charAt(i);
                char c = cArr[i];
                if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                    cArr[i] = '_';
                }
            }
            return new String(cArr);
        }

        /* renamed from: a */
        public final void mo227660a(FilePathComponent gVar, FilePathComponent gVar2, boolean z) {
            if (z) {
                m256638a(gVar2);
            }
            if (!FileManager.f5817a.mo8717a(gVar, gVar2)) {
                throw new IOException("rename file exception occur, from = " + gVar + ",to = " + gVar2);
            }
        }

        /* renamed from: a */
        public final DiskLruCache mo227658a(String str, int i, int i2, long j, IAllowListKeyRule dVar) {
            FilePathComponent a;
            Intrinsics.checkParameterIsNotNull(str, "directory");
            if (j <= 0) {
                throw new IllegalArgumentException("maxSize <= 0");
            } else if (i2 > 0) {
                if (!FileManager.f5817a.mo8730f(str)) {
                    FileManager.f5817a.mo8719a(str, true);
                }
                FilePathComponent a2 = new FilePathComponent(str).mo8743a("journal.bkp");
                if (a2 != null && FileManager.f5817a.mo8725c(a2) && (a = new FilePathComponent(str).mo8743a("journal")) != null && FileManager.f5817a.mo8725c(a)) {
                    if (FileManager.f5817a.mo8725c(a)) {
                        FileManager.f5817a.mo8727d(a2);
                    } else {
                        DiskLruCache.f164764h.mo227660a(a2, a, false);
                    }
                }
                DiskLruCache aVar = new DiskLruCache(str, i, i2, j, dVar, null);
                if (FileManager.f5817a.mo8725c(aVar.f164766a)) {
                    try {
                        aVar.mo227647c();
                        aVar.mo227650d();
                        return aVar;
                    } catch (Exception e) {
                        Logger bVar = Logger.f5760a;
                        Logger.m7508a(bVar, "DiskLruCache", "DiskLruCache " + str + " is corrupt: " + e.getMessage() + ", removing", null, 4, null);
                        aVar.mo227653f();
                    }
                }
                FileManager.f5817a.mo8719a(str, true);
                DiskLruCache aVar2 = new DiskLruCache(str, i, i2, j, dVar, null);
                aVar2.mo227652e();
                return aVar2;
            } else {
                throw new IllegalArgumentException("valueCount <= 0");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0019\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0015H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Editor;", "", "entry", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Entry;", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;", "(Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Entry;)V", "committed", "Lbytekn/foundation/concurrent/SharedReference;", "", "getEntry", "()Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Entry;", "hasErrors", "written", "", "getWritten", "()Lbytekn/foundation/concurrent/SharedReference;", "abort", "", "abortUnlessCommitted", "commit", "getString", "", "index", "", "newInputStream", "Lbytekn/foundation/io/file/FileInputStream;", "newOutputStream", "Lbytekn/foundation/io/file/FileOutputStream;", "set", "value", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.a.a$b */
    public final class Editor {

        /* renamed from: a */
        public SharedReference<Boolean> f164784a = new SharedReference<>(false);

        /* renamed from: b */
        final /* synthetic */ DiskLruCache f164785b;

        /* renamed from: c */
        private final SharedReference<boolean[]> f164786c;

        /* renamed from: d */
        private SharedReference<Boolean> f164787d = new SharedReference<>(false);

        /* renamed from: e */
        private final Entry f164788e;

        /* renamed from: a */
        public final SharedReference<boolean[]> mo227661a() {
            return this.f164786c;
        }

        /* renamed from: d */
        public final Entry mo227665d() {
            return this.f164788e;
        }

        /* renamed from: c */
        public final void mo227664c() {
            this.f164785b.mo227643a(this, false);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Editor$newOutputStream$2$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.ugc.effectplatform.a.a.a$b$a */
        public static final class C65494a extends Lambda implements Function0<Unit> {
            final /* synthetic */ int $index$inlined;
            final /* synthetic */ Editor this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65494a(Editor bVar, int i) {
                super(0);
                this.this$0 = bVar;
                this.$index$inlined = i;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f164784a.mo8626a(true);
            }
        }

        /* renamed from: b */
        public final void mo227663b() {
            if (this.f164784a.mo8625a().booleanValue()) {
                this.f164785b.mo227643a(this, false);
                this.f164785b.mo227648c(this.f164788e.mo227674f());
            } else {
                this.f164785b.mo227643a(this, true);
            }
            this.f164787d.mo8626a(true);
        }

        /* renamed from: a */
        public final FileOutputStream mo227662a(int i) {
            boolean z;
            FileOutputStream fVar;
            if (i < 0 || i >= this.f164785b.f164772g) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Lock gVar = this.f164785b.f164768c;
                gVar.mo8634a();
                try {
                    if (Intrinsics.areEqual(this.f164788e.mo227671c().mo8625a(), this)) {
                        if (!this.f164788e.mo227669b().mo8625a().booleanValue()) {
                            boolean[] zArr = new boolean[this.f164785b.f164772g];
                            zArr[i] = true;
                            this.f164786c.mo8626a(zArr);
                        }
                        FilePathComponent b = this.f164788e.mo227670b(i);
                        try {
                            fVar = FileManager.m7581a(FileManager.f5817a, b, false, 2, (Object) null);
                        } catch (Exception unused) {
                            FileManager.f5817a.mo8719a(this.f164785b.f164771f, true);
                            try {
                                fVar = FileManager.m7581a(FileManager.f5817a, b, false, 2, (Object) null);
                            } catch (Exception unused2) {
                                EmptyFileOutputStream bVar = new EmptyFileOutputStream();
                                gVar.mo8635b();
                                return bVar;
                            }
                        }
                        if (fVar == null) {
                            Intrinsics.throwNpe();
                        }
                        return new FaultHidingOutputStream(fVar, new C65494a(this, i));
                    }
                    throw new IllegalStateException("Check failed.".toString());
                } finally {
                    gVar.mo8635b();
                }
            } else {
                throw new IllegalArgumentException(("Expected index " + i + " to " + "be greater than 0 and less than the maximum value count " + "of " + this.f164785b.f164772g).toString());
            }
        }

        public Editor(DiskLruCache aVar, Entry cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "entry");
            this.f164785b = aVar;
            this.f164788e = cVar;
            this.f164786c = new SharedReference<>(new boolean[aVar.f164772g]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u0012\u001a\u00020\u0003J\u001b\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#H\u0002¢\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020&2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#¢\u0006\u0002\u0010'R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u0007R\u00020\b0\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\f¨\u0006("}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Entry;", "", "key", "", "(Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;Ljava/lang/String;)V", "currentEditor", "Lbytekn/foundation/concurrent/SharedReference;", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Editor;", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;", "getCurrentEditor", "()Lbytekn/foundation/concurrent/SharedReference;", "setCurrentEditor", "(Lbytekn/foundation/concurrent/SharedReference;)V", "getKey", "()Ljava/lang/String;", "lengths", "Lbytekn/foundation/collections/SharedMutableList;", "", "getLengths", "()Lbytekn/foundation/collections/SharedMutableList;", "readable", "", "getReadable", "setReadable", "sequenceNumber", "getSequenceNumber", "setSequenceNumber", "getCleanFile", "Lbytekn/foundation/io/file/FilePathComponent;", "i", "", "getDirtyFile", "invalidLengths", "Lbytekn/foundation/io/file/IOException;", "strings", "", "([Ljava/lang/String;)Lbytekn/foundation/io/file/IOException;", "setLengths", "", "([Ljava/lang/String;)V", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.a.a$c */
    public final class Entry {

        /* renamed from: a */
        final /* synthetic */ DiskLruCache f164789a;

        /* renamed from: b */
        private final SharedMutableList<Long> f164790b = new SharedMutableList<>(false, 1, null);

        /* renamed from: c */
        private SharedReference<Boolean> f164791c = new SharedReference<>(false);

        /* renamed from: d */
        private SharedReference<Editor> f164792d = new SharedReference<>(null);

        /* renamed from: e */
        private SharedReference<Long> f164793e = new SharedReference<>(0L);

        /* renamed from: f */
        private final String f164794f;

        /* renamed from: a */
        public final SharedMutableList<Long> mo227666a() {
            return this.f164790b;
        }

        /* renamed from: b */
        public final SharedReference<Boolean> mo227669b() {
            return this.f164791c;
        }

        /* renamed from: c */
        public final SharedReference<Editor> mo227671c() {
            return this.f164792d;
        }

        /* renamed from: d */
        public final SharedReference<Long> mo227672d() {
            return this.f164793e;
        }

        /* renamed from: f */
        public final String mo227674f() {
            return this.f164794f;
        }

        /* renamed from: e */
        public final String mo227673e() {
            StringBuilder sb = new StringBuilder();
            Iterator<Long> it = this.f164790b.iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                sb.append(' ');
                sb.append(longValue);
            }
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "result.toString()");
            return sb2;
        }

        /* renamed from: b */
        private final IOException m256647b(String[] strArr) {
            throw new Exception("unexpected journal line: " + strArr);
        }

        /* renamed from: a */
        public final FilePathComponent mo227667a(int i) {
            if (i == 0) {
                return new FilePathComponent(this.f164789a.f164771f).mo8743a(this.f164794f);
            }
            FilePathComponent gVar = new FilePathComponent(this.f164789a.f164771f);
            return gVar.mo8743a(this.f164794f + '.' + i);
        }

        /* renamed from: a */
        public final void mo227668a(String[] strArr) {
            Intrinsics.checkParameterIsNotNull(strArr, "strings");
            if (strArr.length == this.f164789a.f164772g) {
                try {
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        this.f164790b.set(i, Long.valueOf(Long.parseLong(strArr[i])));
                    }
                } catch (NumberFormatException unused) {
                    throw m256647b(strArr);
                }
            } else {
                throw m256647b(strArr);
            }
        }

        /* renamed from: b */
        public final FilePathComponent mo227670b(int i) {
            if (i == 0) {
                FilePathComponent gVar = new FilePathComponent(this.f164789a.f164771f);
                return gVar.mo8743a(this.f164794f + ".tmp");
            }
            FilePathComponent gVar2 = new FilePathComponent(this.f164789a.f164771f);
            return gVar2.mo8743a(this.f164794f + '.' + i + ".tmp");
        }

        public Entry(DiskLruCache aVar, String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            this.f164789a = aVar;
            this.f164794f = str;
            int i = aVar.f164772g;
            for (int i2 = 0; i2 < i; i2++) {
                this.f164790b.add(0L);
            }
        }
    }

    /* renamed from: l */
    private final boolean m256618l() {
        return this.f164770e.mo8625a().booleanValue();
    }

    /* renamed from: i */
    public final long mo227656i() {
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            return this.f164782r;
        } finally {
            gVar.mo8635b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\f\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u0017R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Snapshot;", "Lbytekn/foundation/io/file/KnCloseable;", "key", "", "sequenceNumber", "", "cleanFiles", "", "Lbytekn/foundation/io/file/FilePathComponent;", "ins", "Lbytekn/foundation/io/file/FileInputStream;", "lengths", "", "(Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;Ljava/lang/String;J[Lbytekn/foundation/io/file/FilePathComponent;[Lbytekn/foundation/io/file/FileInputStream;[J)V", "[Lbytekn/foundation/io/file/FilePathComponent;", "[Lbytekn/foundation/io/file/FileInputStream;", "close", "", "edit", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Editor;", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;", "getCleanFile", "index", "", "getInputStream", "getLength", "getString", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.a.a$d */
    public final class Snapshot implements KnCloseable {

        /* renamed from: a */
        final /* synthetic */ DiskLruCache f164795a;

        /* renamed from: b */
        private final FilePathComponent[] f164796b;

        /* renamed from: c */
        private final FileInputStream[] f164797c;

        /* renamed from: d */
        private final long[] f164798d;

        /* renamed from: e */
        private final String f164799e;

        /* renamed from: f */
        private final long f164800f;

        @Override // bytekn.foundation.io.file.KnCloseable
        /* renamed from: b */
        public void mo8708b() {
            FileInputStream[] bVarArr = this.f164797c;
            for (FileInputStream bVar : bVarArr) {
                if (bVar != null) {
                    FileManager.f5817a.mo8716a(bVar);
                }
            }
        }

        /* renamed from: a */
        public final FileInputStream mo227675a(int i) {
            return this.f164797c[i];
        }

        /* renamed from: b */
        public final FilePathComponent mo227676b(int i) {
            return this.f164796b[i];
        }

        public Snapshot(DiskLruCache aVar, String str, long j, FilePathComponent[] gVarArr, FileInputStream[] bVarArr, long[] jArr) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(gVarArr, "cleanFiles");
            Intrinsics.checkParameterIsNotNull(bVarArr, "ins");
            Intrinsics.checkParameterIsNotNull(jArr, "lengths");
            this.f164795a = aVar;
            this.f164799e = str;
            this.f164800f = j;
            this.f164796b = gVarArr;
            this.f164797c = bVarArr;
            this.f164798d = jArr;
        }
    }

    /* renamed from: m */
    private final void m256619m() {
        if (m256618l()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: b */
    public final boolean mo227645b() {
        if (!FileManager.f5817a.mo8730f(this.f164771f) || !FileManager.f5817a.mo8725c(this.f164766a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo227653f() {
        mo227654g();
        if (FileUtils.f165113a.mo228325c(this.f164771f)) {
            FileManager.f5817a.mo8719a(this.f164771f, true);
        }
    }

    /* renamed from: a */
    public final Set<String> mo227641a() {
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            return CollectionsKt.toSet(new LinkedHashSet(this.f164778n.keySet()));
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: j */
    public final boolean mo227657j() {
        if (this.f164767b.mo8625a().intValue() < 2000 || this.f164767b.mo8625a().intValue() < this.f164778n.size()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$cleanUpRunnable$1", "Ljava/lang/Runnable;", "Lbytekn/foundation/concurrent/Runnable;", "run", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.a.a$e */
    public static final class RunnableC65495e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskLruCache f164801a;

        public void run() {
            boolean z;
            Lock gVar = this.f164801a.f164768c;
            gVar.mo8634a();
            try {
                if (!this.f164801a.f164769d.mo8625a().booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !this.f164801a.f164770e.mo8625a().booleanValue()) {
                    this.f164801a.mo227655h();
                    if (this.f164801a.mo227657j()) {
                        this.f164801a.mo227652e();
                        this.f164801a.f164767b.mo8626a(0);
                    }
                    Unit unit = Unit.INSTANCE;
                    gVar.mo8635b();
                }
            } finally {
                gVar.mo8635b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC65495e(DiskLruCache aVar) {
            this.f164801a = aVar;
        }
    }

    /* renamed from: d */
    public final void mo227650d() {
        FileManager.f5817a.mo8727d(this.f164773i);
        Iterator<Entry> it = this.f164778n.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.mo227671c().mo8625a() == null) {
                int i2 = this.f164772g;
                while (i < i2) {
                    SharedReference<Long> bVar = this.f164775k;
                    bVar.mo8626a(Long.valueOf(bVar.mo8625a().longValue() + next.mo227666a().get(i).longValue()));
                    i++;
                }
            } else {
                next.mo227671c().mo8626a(null);
                int i3 = this.f164772g;
                while (i < i3) {
                    FileUtils.f165113a.mo228321a(next.mo227667a(i));
                    FileUtils.f165113a.mo228321a(next.mo227670b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: h */
    public final void mo227655h() {
        Map.Entry<String, Entry> next;
        while (this.f164775k.mo8625a().longValue() > this.f164782r) {
            int size = this.f164778n.size();
            int i = 0;
            Iterator<Map.Entry<String, Entry>> it = this.f164778n.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                IAllowListKeyRule dVar = this.f164783s;
                if (dVar != null && dVar.mo227678a(next.getKey())) {
                    i++;
                }
            }
            if (size - i < 10) {
                mo227642a(mo227656i() * ((long) 2));
            }
            mo227648c(next.getKey());
        }
    }

    /* renamed from: k */
    private final void m256617k() {
        if (!this.f164769d.mo8625a().booleanValue()) {
            Lock gVar = this.f164768c;
            gVar.mo8634a();
            try {
                if (FileManager.f5817a.mo8725c(this.f164774j)) {
                    if (!FileManager.f5817a.mo8725c(this.f164766a)) {
                        f164764h.mo227660a(this.f164774j, this.f164766a, false);
                    } else if (FileManager.f5817a.mo8727d(this.f164774j)) {
                        if (FileManager.f5817a.mo8725c(this.f164774j)) {
                            throw new IOException("failed to delete " + this.f164774j);
                        }
                    }
                }
                if (FileManager.f5817a.mo8725c(this.f164766a)) {
                    try {
                        mo227647c();
                        mo227650d();
                        this.f164769d.mo8626a(true);
                        return;
                    } catch (IOException e) {
                        Logger bVar = Logger.f5760a;
                        Logger.m7508a(bVar, "DiskLruCache", "DiskLruCache " + this.f164771f + " is corrupt: " + e.getMessage() + ", removing", null, 4, null);
                        mo227653f();
                        this.f164770e.mo8626a(false);
                    } catch (Throwable th) {
                        this.f164770e.mo8626a(false);
                        throw th;
                    }
                }
                mo227652e();
                this.f164769d.mo8626a(true);
                Unit unit = Unit.INSTANCE;
                gVar.mo8635b();
            } finally {
                gVar.mo8635b();
            }
        }
    }

    /* renamed from: c */
    public final void mo227647c() {
        FileInputStream e = FileManager.f5817a.mo8728e(this.f164766a);
        if (e != null) {
            StrictLineReader eVar = new StrictLineReader(e, 0, ContentEncoding.Ascii, 2, null);
            try {
                String a = eVar.mo227679a();
                String a2 = eVar.mo227679a();
                String a3 = eVar.mo227679a();
                String a4 = eVar.mo227679a();
                String a5 = eVar.mo227679a();
                if ((!Intrinsics.areEqual("libcore.io.DiskLruCache", a)) || (!Intrinsics.areEqual("1", a2)) || (!Intrinsics.areEqual(String.valueOf(this.f164781q), a3)) || (!Intrinsics.areEqual(String.valueOf(this.f164772g), a4)) || (!Intrinsics.areEqual(a5, ""))) {
                    throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
                }
                int i = 0;
                while (true) {
                    try {
                        String a6 = eVar.mo227679a();
                        if (a6 == null || !m256615f(a6)) {
                            break;
                        }
                        i++;
                    } catch (Exception unused) {
                    }
                }
                this.f164767b.mo8626a(Integer.valueOf(i - this.f164778n.size()));
                if (eVar.mo227680c()) {
                    mo227652e();
                } else {
                    SharedReference<KnFileWriter> bVar = this.f164776l;
                    FileOutputStream a7 = FileManager.f5817a.mo8711a(this.f164766a, true);
                    if (a7 == null) {
                        Intrinsics.throwNpe();
                    }
                    C1686c.m7469a(bVar, new KnFileOutStreamWriter(a7, ContentEncoding.Ascii));
                }
                FileManager.f5817a.mo8716a(eVar);
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th) {
                FileManager.f5817a.mo8716a(eVar);
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void mo227654g() {
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            if (this.f164769d.mo8625a().booleanValue()) {
                if (!this.f164770e.mo8625a().booleanValue()) {
                    Iterator it = new ArrayList(this.f164778n.values()).iterator();
                    while (it.hasNext()) {
                        Editor a = ((Entry) it.next()).mo227671c().mo8625a();
                        if (a != null) {
                            a.mo227664c();
                        }
                    }
                    mo227655h();
                    KnFileWriter a2 = this.f164776l.mo8625a();
                    if (a2 != null) {
                        a2.mo8708b();
                    }
                    C1686c.m7469a(this.f164776l, null);
                    this.f164770e.mo8626a(true);
                    Unit unit = Unit.INSTANCE;
                    gVar.mo8635b();
                    return;
                }
            }
            this.f164770e.mo8626a(true);
        } finally {
            gVar.mo8635b();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final void mo227652e() {
        FileOutputStream fVar;
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            KnFileWriter a = this.f164776l.mo8625a();
            if (a != null) {
                a.mo8708b();
            }
            try {
                fVar = FileManager.m7581a(FileManager.f5817a, this.f164773i, false, 2, (Object) null);
            } catch (Exception unused) {
                FileManager.f5817a.mo8722b(this.f164773i);
                fVar = FileManager.m7581a(FileManager.f5817a, this.f164773i, false, 2, (Object) null);
            }
            if (fVar != null) {
                KnFileOutStreamWriter iVar = new KnFileOutStreamWriter(fVar, ContentEncoding.Ascii);
                try {
                    iVar.mo8748a("libcore.io.DiskLruCache");
                    iVar.mo8748a("\n");
                    iVar.mo8748a("1");
                    iVar.mo8748a("\n");
                    iVar.mo8748a(String.valueOf(this.f164781q));
                    iVar.mo8748a("\n");
                    iVar.mo8748a(String.valueOf(this.f164772g));
                    iVar.mo8748a("\n");
                    iVar.mo8748a("\n");
                    for (Entry cVar : this.f164778n.values()) {
                        if (cVar.mo227671c().mo8625a() != null) {
                            iVar.mo8748a("DIRTY " + cVar.mo227674f() + '\n');
                        } else {
                            iVar.mo8748a("CLEAN " + cVar.mo227674f() + cVar.mo227673e() + '\n');
                        }
                    }
                    iVar.mo8708b();
                    if (FileManager.f5817a.mo8725c(this.f164766a)) {
                        f164764h.mo227660a(this.f164766a, this.f164774j, true);
                    }
                    f164764h.mo227660a(this.f164773i, this.f164766a, false);
                    FileManager.f5817a.mo8727d(this.f164774j);
                    SharedReference<KnFileWriter> bVar = this.f164776l;
                    FileOutputStream a2 = FileManager.f5817a.mo8711a(this.f164766a, true);
                    if (a2 == null) {
                        Intrinsics.throwNpe();
                    }
                    C1686c.m7469a(bVar, new KnFileOutStreamWriter(a2, ContentEncoding.Ascii));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    iVar.mo8708b();
                    throw th;
                }
            } else {
                gVar.mo8635b();
            }
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: g */
    private final boolean m256616g(String str) {
        return f164765t.matches(str);
    }

    /* renamed from: e */
    public final Editor mo227651e(String str) {
        if (str != null) {
            return mo227640a(str, -1);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo227642a(long j) {
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            this.f164782r = j;
            if (this.f164769d.mo8625a().booleanValue()) {
                this.f164779o.execute(this.f164780p);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: f */
    private final boolean m256615f(String str) {
        String str2;
        String str3 = str;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str3, ' ', 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return false;
        }
        int i = indexOf$default + 1;
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str3, ' ', i, false, 4, (Object) null);
        if (indexOf$default2 == -1) {
            if (str != null) {
                str2 = str.substring(i);
                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).substring(startIndex)");
                if (indexOf$default == 6 && StringsKt.startsWith$default(str, "REMOVE", false, 2, (Object) null)) {
                    this.f164778n.remove(str2);
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else if (str != null) {
            str2 = str.substring(i, indexOf$default2);
            Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        Entry cVar = this.f164778n.get(str2);
        if (cVar == null) {
            cVar = new Entry(this, str2);
            this.f164778n.put(str2, cVar);
        }
        if (indexOf$default2 != -1 && indexOf$default == 5 && StringsKt.startsWith$default(str, "CLEAN", false, 2, (Object) null)) {
            int i2 = indexOf$default2 + 1;
            if (str != null) {
                String substring = str.substring(i2);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                Object[] array = StringsKt.split$default((CharSequence) substring, new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array != null) {
                    cVar.mo227669b().mo8626a(true);
                    cVar.mo227671c().mo8626a(null);
                    cVar.mo227668a((String[]) array);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else if (indexOf$default2 == -1 && indexOf$default == 5 && StringsKt.startsWith$default(str, "DIRTY", false, 2, (Object) null)) {
            cVar.mo227671c().mo8626a(new Editor(this, cVar));
        } else if (!(indexOf$default2 == -1 && indexOf$default == 4 && StringsKt.startsWith$default(str, "READ", false, 2, (Object) null))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo227646b(String str) {
        if (str == null) {
            return false;
        }
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            m256619m();
            if (m256616g(str)) {
                Entry cVar = this.f164778n.get(str);
                if (cVar == null) {
                    gVar.mo8635b();
                    return false;
                } else if (!cVar.mo227669b().mo8625a().booleanValue()) {
                    return false;
                } else {
                    try {
                        SharedReference<Integer> bVar = this.f164767b;
                        bVar.mo8626a(Integer.valueOf(bVar.mo8625a().intValue() + 1));
                        KnFileWriter a = this.f164776l.mo8625a();
                        if (a != null) {
                            a.mo8748a("READ " + str + '\n');
                        }
                        KnFileWriter a2 = this.f164776l.mo8625a();
                        if (a2 != null) {
                            a2.mo8746a();
                        }
                        if (mo227657j()) {
                            this.f164779o.execute(this.f164780p);
                        }
                    } catch (Exception unused) {
                    }
                    gVar.mo8635b();
                    return true;
                }
            } else {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: d */
    public final Snapshot mo227649d(String str) {
        FileInputStream bVar;
        if (str == null) {
            return null;
        }
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            m256617k();
            m256619m();
            if (m256616g(str)) {
                Entry cVar = this.f164778n.get(str);
                if (cVar == null) {
                    gVar.mo8635b();
                    return null;
                } else if (!cVar.mo227669b().mo8625a().booleanValue()) {
                    return null;
                } else {
                    int i = this.f164772g;
                    FileInputStream[] bVarArr = new FileInputStream[i];
                    FilePathComponent[] gVarArr = new FilePathComponent[i];
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        try {
                            gVarArr[i3] = cVar.mo227667a(i3);
                            FilePathComponent gVar2 = gVarArr[i3];
                            if (gVar2 != null) {
                                bVarArr[i3] = FileManager.f5817a.mo8728e(gVar2);
                            }
                        } catch (Exception unused) {
                            while (i2 < this.f164772g && (bVar = bVarArr[i2]) != null) {
                                FileManager.f5817a.mo8716a(bVar);
                                if (bVar == null) {
                                    break;
                                }
                                i2++;
                            }
                            gVar.mo8635b();
                            return null;
                        }
                    }
                    SharedReference<Integer> bVar2 = this.f164767b;
                    bVar2.mo8626a(Integer.valueOf(bVar2.mo8625a().intValue() + 1));
                    KnFileWriter a = this.f164776l.mo8625a();
                    if (a != null) {
                        a.mo8747a((CharSequence) ("READ " + str + '\n'));
                    }
                    if (mo227657j()) {
                        this.f164779o.execute(this.f164780p);
                    }
                    Snapshot dVar = new Snapshot(this, str, cVar.mo227672d().mo8625a().longValue(), gVarArr, bVarArr, CollectionsKt.toLongArray(cVar.mo227666a()));
                    gVar.mo8635b();
                    return dVar;
                }
            } else {
                mo227648c(str);
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: c */
    public final boolean mo227648c(String str) {
        if (str == null) {
            return false;
        }
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            m256617k();
            m256619m();
            if (m256616g(str)) {
                Entry cVar = this.f164778n.get(str);
                if (cVar != null) {
                    if (cVar.mo227671c().mo8625a() == null) {
                        SharedReference<Integer> bVar = this.f164767b;
                        bVar.mo8626a(Integer.valueOf(bVar.mo8625a().intValue() + 1));
                        KnFileWriter a = this.f164776l.mo8625a();
                        if (a != null) {
                            a.mo8747a((CharSequence) ("REMOVE " + str + '\n'));
                        }
                        KnFileWriter a2 = this.f164776l.mo8625a();
                        if (a2 != null) {
                            a2.mo8746a();
                        }
                        this.f164778n.remove(str);
                        int i = this.f164772g;
                        for (int i2 = 0; i2 < i; i2++) {
                            FilePathComponent a3 = cVar.mo227667a(i2);
                            try {
                                FileUtils.f165113a.mo228321a(a3);
                                SharedReference<Long> bVar2 = this.f164775k;
                                bVar2.mo8626a(Long.valueOf(bVar2.mo8625a().longValue() - cVar.mo227666a().get(i2).longValue()));
                                cVar.mo227666a().set(i2, 0L);
                            } catch (Exception unused) {
                                throw new Exception("failed to delete " + a3);
                            }
                        }
                        if (mo227657j()) {
                            this.f164779o.execute(this.f164780p);
                        }
                        gVar.mo8635b();
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: a */
    public final boolean mo227644a(String str) {
        long j;
        String str2;
        Long b;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            m256619m();
            if (m256616g(str)) {
                Entry cVar = this.f164778n.get(str);
                boolean z = false;
                if (cVar == null) {
                    cVar = new Entry(this, str);
                    this.f164778n.put(str, cVar);
                } else if (cVar.mo227671c().mo8625a() != null) {
                    gVar.mo8635b();
                    return false;
                }
                FilePathComponent a = cVar.mo227667a(0);
                if (FileManager.f5817a.mo8725c(a)) {
                    long longValue = cVar.mo227666a().get(0).longValue();
                    FileMeta a2 = FileManager.f5817a.mo8710a(a);
                    if (a2 == null || (b = a2.mo8734b()) == null) {
                        j = 0;
                    } else {
                        j = b.longValue();
                    }
                    if (a2 != null && a2.mo8735c() == FileType.Directory) {
                        FileUtils kVar = FileUtils.f165113a;
                        if (a != null) {
                            str2 = a.mo8744a();
                        } else {
                            str2 = null;
                        }
                        j = kVar.mo228318a(str2);
                    }
                    cVar.mo227666a().set(0, Long.valueOf(j));
                    SharedReference<Long> bVar = this.f164775k;
                    bVar.mo8626a(Long.valueOf((bVar.mo8625a().longValue() - longValue) + j));
                    SharedReference<Integer> bVar2 = this.f164767b;
                    bVar2.mo8626a(Integer.valueOf(bVar2.mo8625a().intValue() + 1));
                    cVar.mo227671c().mo8626a(null);
                    cVar.mo227669b().mo8626a(true);
                    KnFileWriter a3 = this.f164776l.mo8625a();
                    if (a3 != null) {
                        a3.mo8748a("CLEAN " + cVar.mo227674f() + cVar.mo227673e() + '\n');
                    }
                    SharedReference<Long> bVar3 = this.f164777m;
                    bVar3.mo8626a(Long.valueOf(bVar3.mo8625a().longValue() + 1));
                    cVar.mo227672d().mo8626a(this.f164777m.mo8625a());
                    KnFileWriter a4 = this.f164776l.mo8625a();
                    if (a4 != null) {
                        a4.mo8746a();
                    }
                    if (this.f164775k.mo8625a().longValue() > this.f164782r || mo227657j()) {
                        this.f164779o.execute(this.f164780p);
                    }
                    z = true;
                } else {
                    this.f164778n.remove(cVar.mo227674f());
                    KnFileWriter a5 = this.f164776l.mo8625a();
                    if (a5 != null) {
                        a5.mo8748a("REMOVE " + cVar.mo227674f() + '\n');
                    }
                }
                return z;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: a */
    public final Editor mo227640a(String str, long j) {
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            m256617k();
            m256619m();
            if (m256616g(str)) {
                Entry cVar = this.f164778n.get(str);
                if (j != -1 && (cVar == null || cVar.mo227672d().mo8625a().longValue() != j)) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new Entry(this, str);
                    this.f164778n.put(str, cVar);
                } else if (cVar.mo227671c().mo8625a() != null) {
                    Logger bVar = Logger.f5760a;
                    bVar.mo8662a("DiskLruCache", "key: " + str + " is now in editing, return null!");
                    gVar.mo8635b();
                    return null;
                }
                Editor bVar2 = new Editor(this, cVar);
                cVar.mo227671c().mo8626a(bVar2);
                KnFileWriter a = this.f164776l.mo8625a();
                if (a != null) {
                    a.mo8748a("DIRTY " + str + '\n');
                }
                KnFileWriter a2 = this.f164776l.mo8625a();
                if (a2 != null) {
                    a2.mo8746a();
                }
                gVar.mo8635b();
                return bVar2;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: a */
    public final void mo227643a(Editor bVar, boolean z) {
        long j;
        Long b;
        Lock gVar = this.f164768c;
        gVar.mo8634a();
        try {
            Entry d = bVar.mo227665d();
            if (!(!Intrinsics.areEqual(d.mo227671c().mo8625a(), bVar))) {
                if (z && !d.mo227669b().mo8625a().booleanValue()) {
                    int i = this.f164772g;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!bVar.mo227661a().mo8625a()[i2]) {
                            bVar.mo227664c();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        } else if (d.mo227670b(i2) != null && !FileManager.f5817a.mo8725c(d.mo227670b(i2))) {
                            bVar.mo227664c();
                            return;
                        }
                    }
                }
                int i3 = this.f164772g;
                for (int i4 = 0; i4 < i3; i4++) {
                    FilePathComponent b2 = d.mo227670b(i4);
                    if (b2 != null) {
                        if (!z) {
                            FileUtils.f165113a.mo228321a(b2);
                        } else if (FileManager.f5817a.mo8725c(b2)) {
                            FilePathComponent a = d.mo227667a(i4);
                            FileManager.f5817a.mo8717a(b2, a);
                            long longValue = d.mo227666a().get(i4).longValue();
                            FileMeta a2 = FileManager.f5817a.mo8710a(a);
                            if (a2 == null || (b = a2.mo8734b()) == null) {
                                j = 0;
                            } else {
                                j = b.longValue();
                            }
                            d.mo227666a().set(i4, Long.valueOf(j));
                            SharedReference<Long> bVar2 = this.f164775k;
                            bVar2.mo8626a(Long.valueOf((bVar2.mo8625a().longValue() - longValue) + j));
                        }
                    }
                }
                SharedReference<Integer> bVar3 = this.f164767b;
                bVar3.mo8626a(Integer.valueOf(bVar3.mo8625a().intValue() + 1));
                d.mo227671c().mo8626a(null);
                if (d.mo227669b().mo8625a().booleanValue() || z) {
                    d.mo227669b().mo8626a(true);
                    KnFileWriter a3 = this.f164776l.mo8625a();
                    if (a3 != null) {
                        a3.mo8748a("CLEAN " + d.mo227674f() + d.mo227673e() + '\n');
                    }
                    if (z) {
                        SharedReference<Long> bVar4 = this.f164777m;
                        bVar4.mo8626a(Long.valueOf(bVar4.mo8625a().longValue() + 1));
                        d.mo227672d().mo8626a(this.f164777m.mo8625a());
                    }
                } else {
                    this.f164778n.remove(d.mo227674f());
                    KnFileWriter a4 = this.f164776l.mo8625a();
                    if (a4 != null) {
                        a4.mo8748a("REMOVE " + d.mo227674f() + '\n');
                    }
                }
                KnFileWriter a5 = this.f164776l.mo8625a();
                if (a5 != null) {
                    a5.mo8746a();
                }
                if (this.f164775k.mo8625a().longValue() > this.f164782r || mo227657j()) {
                    this.f164779o.execute(this.f164780p);
                }
                Unit unit = Unit.INSTANCE;
                gVar.mo8635b();
                return;
            }
            throw new IllegalStateException();
        } finally {
            gVar.mo8635b();
        }
    }

    private DiskLruCache(String str, int i, int i2, long j, IAllowListKeyRule dVar) {
        this.f164771f = str;
        this.f164781q = i;
        this.f164772g = i2;
        this.f164782r = j;
        this.f164783s = dVar;
        this.f164775k = new SharedReference<>(0L);
        this.f164767b = new SharedReference<>(0);
        this.f164776l = new SharedReference<>(null);
        this.f164768c = new Lock();
        this.f164769d = new SharedReference<>(false);
        this.f164770e = new SharedReference<>(false);
        this.f164777m = new SharedReference<>(0L);
        this.f164778n = new SharedMutableMap<>(false, 1, null);
        this.f164779o = new AsyncExecutor();
        this.f164780p = new RunnableC65495e(this);
        FilePathComponent a = new FilePathComponent(str).mo8743a("journal");
        if (a == null) {
            Intrinsics.throwNpe();
        }
        this.f164766a = a;
        FilePathComponent a2 = new FilePathComponent(str).mo8743a("journal.tmp");
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        this.f164773i = a2;
        FilePathComponent a3 = new FilePathComponent(str).mo8743a("journal.bkp");
        if (a3 == null) {
            Intrinsics.throwNpe();
        }
        this.f164774j = a3;
    }

    public /* synthetic */ DiskLruCache(String str, int i, int i2, long j, IAllowListKeyRule dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, j, dVar);
    }
}
