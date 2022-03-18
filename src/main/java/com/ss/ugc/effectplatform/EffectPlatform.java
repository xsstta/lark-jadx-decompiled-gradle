package com.ss.ugc.effectplatform;

import bytekn.foundation.concurrent.executor.AsyncExecutor;
import bytekn.foundation.concurrent.executor.ExecutorService;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1686c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ugc.effectplatform.cache.EffectCacheManager;
import com.ss.ugc.effectplatform.cache.EffectDiskLruCache;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.listener.IFetchEffectListener;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.repository.AlgorithmRepository;
import com.ss.ugc.effectplatform.repository.EffectListRepository;
import com.ss.ugc.effectplatform.repository.EffectListStore;
import com.ss.ugc.effectplatform.repository.EffectRepository;
import com.ss.ugc.effectplatform.repository.ResourceRepository;
import com.ss.ugc.effectplatform.repository.UserEffectRepository;
import com.ss.ugc.effectplatform.task.TaskManager;
import com.ss.ugc.effectplatform.util.EffectPlatformAES;
import com.ss.ugc.effectplatform.util.EffectUtils;
import com.ss.ugc.effectplatform.util.PlatformType;
import com.ss.ugc.effectplatform.util.PlatformUtil;
import com.ss.ugc.effectplatform.util.TextUtils;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ¦\u00012\u00020\u0001:\u0002¦\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J>\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000100J\u0012\u00101\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u0003H\u0002J6\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000100J6\u00104\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000100JF\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u00108\u001a\u0002092\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000100J6\u0010:\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000100J\u0010\u0010;\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+J\u0006\u0010<\u001a\u00020)J\u000e\u0010=\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J\u0010\u0010B\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010'J\u0006\u0010C\u001a\u00020)J6\u0010D\u001a\u00020)2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020'0F2\u0014\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0F\u0018\u0001002\n\b\u0002\u0010H\u001a\u0004\u0018\u00010IJ\u001a\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020L2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010MJ\u0018\u0010N\u001a\u00020)2\u0006\u0010&\u001a\u00020O2\b\u0010/\u001a\u0004\u0018\u00010PJd\u0010Q\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010R\u001a\u0002092\u0006\u0010S\u001a\u0002092\u0006\u0010T\u001a\u0002092\b\u0010U\u001a\u0004\u0018\u00010+2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020V\u0018\u000100JL\u0010W\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010R\u001a\u0002092\u0006\u0010S\u001a\u0002092\u0006\u0010T\u001a\u0002092\b\u0010U\u001a\u0004\u0018\u00010+2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020V\u0018\u000100J \u0010X\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u000100J\u0018\u0010[\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\b\u0010\\\u001a\u0004\u0018\u00010]J \u0010[\u001a\u00020)2\u0006\u0010&\u001a\u00020^2\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020'\u0018\u000100J0\u0010[\u001a\u00020)2\u0006\u0010_\u001a\u00020+2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\b\u0010\\\u001a\u0004\u0018\u00010]J>\u0010`\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010a\u001a\u00020%2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u000100JL\u0010`\u001a\u00020)2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020+0F2\u0006\u0010a\u001a\u00020%2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0016\b\u0002\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0F\u0018\u000100JL\u0010c\u001a\u00020)2\u001a\u0010b\u001a\u0016\u0012\u0004\u0012\u00020+\u0018\u00010dj\n\u0012\u0004\u0012\u00020+\u0018\u0001`e2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020f\u0018\u000100J@\u0010g\u001a\u00020)2\u000e\u0010h\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010F2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020f\u0018\u000100J\u001e\u0010i\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u000100J8\u0010j\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020k\u0018\u000100J<\u0010l\u001a\u00020)2\u0006\u0010R\u001a\u0002092\u0006\u0010S\u001a\u0002092\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020m\u0018\u000100JZ\u0010n\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010o\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010R\u001a\u0002092\u0006\u0010S\u001a\u0002092\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020p\u0018\u000100JB\u0010q\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010o\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010R\u001a\u0002092\u0006\u0010S\u001a\u0002092\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020p\u0018\u000100JP\u0010r\u001a\u00020)2\b\u0010s\u001a\u0004\u0018\u00010+2\u0006\u0010a\u001a\u00020%2\u0006\u0010S\u001a\u0002092\u0006\u0010R\u001a\u0002092\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020t\u0018\u000100J,\u0010u\u001a\u00020)2\u0014\u0010v\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020w\u0018\u000100J<\u0010x\u001a\u00020)2\u0014\u0010v\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u0010y\u001a\n\u0012\u0004\u0012\u00020w\u0018\u0001002\u000e\u0010z\u001a\n\u0012\u0004\u0012\u00020{\u0018\u000100JE\u0010|\u001a\u00020)2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020+0~2\u0018\u0010\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0F0.2\u000f\u0010/\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u000100¢\u0006\u0003\u0010\u0001J+\u0010\u0001\u001a\u00020)2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020+0F2\u0014\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0~\u0018\u000100J\t\u0010\u0001\u001a\u0004\u0018\u00010ZJ\u001d\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020'0F2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020'0FH\u0002J\u0011\u0010\u0001\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000f\u0010\u0001\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u000f\u0010\u0001\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u000f\u0010\u0001\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u000f\u0010\u0001\u001a\u00020%2\u0006\u0010K\u001a\u00020LJ(\u0010\u0001\u001a\u00020)2\u0006\u0010_\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020+2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000100JV\u0010\u0001\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020+0F2\u0007\u0010\u0001\u001a\u00020%2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0014\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0F\u0018\u000100JN\u0010\u0001\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010R\u001a\u0002092\b\b\u0002\u0010S\u001a\u0002092\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0011\b\u0002\u0010/\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u000100JX\u0010\u0001\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\n\b\u0002\u0010R\u001a\u0004\u0018\u0001092\n\b\u0002\u0010S\u001a\u0004\u0018\u0001092\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0011\b\u0002\u0010/\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u000100¢\u0006\u0003\u0010\u0001J\u0001\u0010\u0001\u001a\u00020)2\u0007\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020+2\n\b\u0002\u0010R\u001a\u0004\u0018\u0001092\n\b\u0002\u0010S\u001a\u0004\u0018\u0001092\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010+2*\b\u0002\u0010-\u001a$\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010\u0001j\u0011\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u0001`\u00012\u000f\u0010/\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u000100¢\u0006\u0003\u0010\u0001J-\u0010\u0001\u001a\u00020)2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020f\u0018\u000100J\u0007\u0010\u0001\u001a\u00020)JQ\u0010\u0001\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020+2\u0006\u0010R\u001a\u0002092\u0006\u0010S\u001a\u0002092\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010.2\u0011\b\u0002\u0010/\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u000100J:\u0010 \u0001\u001a\u00020)2\u0007\u0010\u0001\u001a\u00020+2\b\u0010s\u001a\u0004\u0018\u00010+2\u0006\u0010S\u001a\u0002092\u0006\u0010R\u001a\u0002092\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020t\u0018\u000100J\u0001\u0010¡\u0001\u001a\u00020)2\u0007\u0010\u0001\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020+2\u0007\u0010¢\u0001\u001a\u00020+2\n\b\u0002\u0010R\u001a\u0004\u0018\u0001092\n\b\u0002\u0010S\u001a\u0004\u0018\u0001092\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010+2*\b\u0002\u0010-\u001a$\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010\u0001j\u0011\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u0001`\u00012\u000f\u0010/\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u000100¢\u0006\u0003\u0010£\u0001J#\u0010¤\u0001\u001a\u00020)2\u0006\u0010_\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020+2\t\u0010/\u001a\u0005\u0018\u00010¥\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b!\u0010\"¨\u0006§\u0001"}, d2 = {"Lcom/ss/ugc/effectplatform/EffectPlatform;", "", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "algorithmRepository", "Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository;", "getAlgorithmRepository", "()Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository;", "algorithmRepository$delegate", "Lkotlin/Lazy;", "effectListRepository", "Lcom/ss/ugc/effectplatform/repository/EffectListRepository;", "getEffectListRepository", "()Lcom/ss/ugc/effectplatform/repository/EffectListRepository;", "effectListRepository$delegate", "effectListStore", "Lcom/ss/ugc/effectplatform/repository/EffectListStore;", "getEffectListStore", "()Lcom/ss/ugc/effectplatform/repository/EffectListStore;", "effectListStore$delegate", "effectRepository", "Lcom/ss/ugc/effectplatform/repository/EffectRepository;", "getEffectRepository", "()Lcom/ss/ugc/effectplatform/repository/EffectRepository;", "effectRepository$delegate", "resourceRepository", "Lcom/ss/ugc/effectplatform/repository/ResourceRepository;", "getResourceRepository", "()Lcom/ss/ugc/effectplatform/repository/ResourceRepository;", "resourceRepository$delegate", "userEffectRepository", "Lcom/ss/ugc/effectplatform/repository/UserEffectRepository;", "getUserEffectRepository", "()Lcom/ss/ugc/effectplatform/repository/UserEffectRepository;", "userEffectRepository$delegate", "areRequirementsReady", "", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "checkCategoryIsUpdate", "", "panel", "", "category", "extraParams", "", "listener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "checkConfiguration", "configuration", "checkInfoStickerUpdate", "checkPanelIsUpdate", "checkChannelListener", "checkUpdate", "checkKey", ShareHitPoint.f121869d, "", "checkedEffectListUpdate", "clearCache", "clearEffects", "clearVersion", "createTaskManager", "Lcom/ss/ugc/effectplatform/task/TaskManager;", "executorService", "Lbytekn/foundation/concurrent/executor/ExecutorService;", "deleteEffect", "destroy", "downloadEffectList", "effectList", "", "listListener", "extra", "Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;", "downloadInfoStickerEffect", "sticker", "Lcom/ss/ugc/effectplatform/model/net/InfoStickerEffect;", "Lcom/ss/ugc/effectplatform/listener/IDownloadInfoStickerEffectProgressListener;", "downloadProviderEffect", "Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "Lcom/ss/ugc/effectplatform/listener/IDownloadProviderEffectProgressListener;", "fetchCategoryEffect", "count", "cursor", "sortingPosition", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "fetchCategoryEffectFromCache", "fetchDownloadedEffectList", "iFetchEffectChannelListener", "Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "fetchEffect", "iFetchEffectListener", "Lcom/ss/ugc/effectplatform/listener/IFetchEffectListener;", "Lcom/ss/ugc/effectplatform/model/EffectQRCode;", "effectId", "fetchEffectList", "downloadAfterFetch", "effectIds", "fetchEffectListByEffectIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "fetchEffectListByResourceIds", "resourceIds", "fetchEffectListFromCache", "fetchFavoriteList", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;", "fetchHotEffect", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;", "fetchPanelInfo", "withCategoryEffects", "Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "fetchPanelInfoFromCache", "fetchProviderEffect", "providerName", "Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "fetchResourceList", "map", "Lcom/ss/ugc/effectplatform/model/ResourceListModel;", "fetchResourceListWithDownload", "resourceListListener", "resourceDownloadListener", "Lcom/ss/ugc/effectplatform/model/ResourceDownloadedBean;", "fetchResourcesByRequirementsAndModelNames", "requirements", "", "modelNames", "", "([Ljava/lang/String;Ljava/util/Map;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)V", "fetchResourcesNeededByRequirements", "getCurrentEffectChannel", "getNeedDownloadEffectList", "initCache", "isEffectDownloaded", "isEffectDownloading", "isEffectReady", "isInfoStickerEffectDownloaded", "isTagUpdated", "updateTime", "modifyFavoriteList", "isFavorite", "queryInfoStickerList", "Lcom/ss/ugc/effectplatform/model/net/QueryInfoStickerResponse;", "queryInfoStickerListFromCache", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)V", "queryRecommendStickerList", ShareHitPoint.f121868c, "creationId", "imageUri", "library", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Lcom/ss/ugc/effectplatform/model/net/InfoStickerListResponse;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/HashMap;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)V", "queryVideoUsedStickers", "removeAllListener", "searchEffect", "keyWord", "Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;", "searchProviderEffect", "searchStickerList", "word", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/HashMap;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)V", "updateTag", "Lcom/ss/ugc/effectplatform/listener/IUpdateTagListener;", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a */
public final class EffectPlatform {

    /* renamed from: b */
    public static final Companion f164754b = new Companion(null);

    /* renamed from: i */
    private static final String f164755i = f164755i;

    /* renamed from: a */
    public final EffectConfig f164756a;

    /* renamed from: c */
    private final Lazy f164757c = LazyKt.lazy(new C65491e(this));

    /* renamed from: d */
    private final Lazy f164758d = LazyKt.lazy(new C65489c(this));

    /* renamed from: e */
    private final Lazy f164759e = LazyKt.lazy(new C65493g(this));

    /* renamed from: f */
    private final Lazy f164760f = LazyKt.lazy(new C65488b(this));

    /* renamed from: g */
    private final Lazy f164761g = LazyKt.lazy(new C65492f(this));

    /* renamed from: h */
    private final Lazy f164762h = LazyKt.lazy(C65490d.INSTANCE);

    /* renamed from: a */
    private final EffectRepository m256599a() {
        return (EffectRepository) this.f164757c.getValue();
    }

    /* renamed from: b */
    private final EffectListRepository m256602b() {
        return (EffectListRepository) this.f164758d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/EffectPlatform$Companion;", "", "()V", "SDK_TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/ugc/effectplatform/repository/EffectListStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a$d */
    static final class C65490d extends Lambda implements Function0<EffectListStore> {
        public static final C65490d INSTANCE = new C65490d();

        C65490d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EffectListStore invoke() {
            return new EffectListStore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/ugc/effectplatform/repository/EffectListRepository;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a$c */
    static final class C65489c extends Lambda implements Function0<EffectListRepository> {
        final /* synthetic */ EffectPlatform this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65489c(EffectPlatform aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final EffectListRepository invoke() {
            return new EffectListRepository(this.this$0.f164756a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/ugc/effectplatform/repository/EffectRepository;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a$e */
    static final class C65491e extends Lambda implements Function0<EffectRepository> {
        final /* synthetic */ EffectPlatform this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65491e(EffectPlatform aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final EffectRepository invoke() {
            return new EffectRepository(this.this$0.f164756a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/ugc/effectplatform/repository/ResourceRepository;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a$f */
    static final class C65492f extends Lambda implements Function0<ResourceRepository> {
        final /* synthetic */ EffectPlatform this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65492f(EffectPlatform aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ResourceRepository invoke() {
            return new ResourceRepository(this.this$0.f164756a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/ugc/effectplatform/repository/UserEffectRepository;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a$g */
    static final class C65493g extends Lambda implements Function0<UserEffectRepository> {
        final /* synthetic */ EffectPlatform this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65493g(EffectPlatform aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserEffectRepository invoke() {
            return new UserEffectRepository(this.this$0.f164756a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a$b */
    static final class C65488b extends Lambda implements Function0<AlgorithmRepository> {
        final /* synthetic */ EffectPlatform this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65488b(EffectPlatform aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AlgorithmRepository invoke() {
            if (!AlgorithmRepository.f164914b.mo227801b()) {
                AlgorithmRepository.f164914b.mo227800a(this.this$0.f164756a);
            }
            return AlgorithmRepository.f164914b.mo227799a();
        }
    }

    /* renamed from: a */
    private final TaskManager m256600a(ExecutorService bVar) {
        TaskManager.Builder aVar = new TaskManager.Builder();
        if (bVar == null) {
            bVar = new AsyncExecutor();
        }
        return aVar.mo228293a(bVar).mo228294a();
    }

    /* renamed from: b */
    private final void m256603b(EffectConfig effectConfig) {
        String i = effectConfig.mo227562i();
        if (effectConfig.mo227576w().mo8625a() == null) {
            if (EffectCacheManager.f164822a.mo227691a(i) == null) {
                EffectCacheManager.f164822a.mo227692a(i, new EffectDiskLruCache(effectConfig));
            }
            C1686c.m7469a(effectConfig.mo227576w(), EffectCacheManager.f164822a.mo227691a(i));
            return;
        }
        EffectCacheManager.f164822a.mo227692a(i, (ICache) C1686c.m7468a(effectConfig.mo227576w()));
    }

    /* renamed from: b */
    public final boolean mo227636b(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        if (!EffectUtils.f165112a.mo228314a(effect) || !this.f164756a.mo227549I().mo227806a(effect.getEffect_id())) {
            return false;
        }
        return true;
    }

    public EffectPlatform(EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        this.f164756a = effectConfig;
        if (m256601a(effectConfig)) {
            if (effectConfig.mo227579z() == null) {
                effectConfig.mo227554a(m256600a(effectConfig.mo227574u()));
            }
            m256603b(effectConfig);
            if (PlatformUtil.f165131a.mo228354b() == PlatformType.ANDROID) {
                EffectPlatformAES.f165107a.mo228309b().mo8626a(effectConfig.mo227572s().mo8625a());
                EffectPlatformEncryptor.f164860a.mo227730a(new IEffectPlatformEncryptor() {
                    /* class com.ss.ugc.effectplatform.EffectPlatform.C654871 */

                    @Override // com.ss.ugc.effectplatform.IEffectPlatformEncryptor
                    /* renamed from: a */
                    public String mo207361a(String str) {
                        return EffectPlatformAES.f165107a.mo228310b(str);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalArgumentException("EffectConfiguration Error!");
    }

    /* renamed from: a */
    private final boolean m256601a(EffectConfig effectConfig) {
        if (effectConfig == null) {
            Logger.m7508a(Logger.f5760a, f164755i, "Not set configuration", null, 4, null);
            return false;
        } else if (effectConfig.mo227541A() == null) {
            Logger.m7508a(Logger.f5760a, f164755i, "Not set host !!!", null, 4, null);
            return false;
        } else if (effectConfig.mo227570q() == null) {
            Logger.m7508a(Logger.f5760a, f164755i, "Not set json convert", null, 4, null);
            return false;
        } else if (TextUtils.f165135a.mo228357a(effectConfig.mo227562i())) {
            Logger.m7508a(Logger.f5760a, f164755i, "Cache directory error", null, 4, null);
            return false;
        } else {
            if (!FileManager.f5817a.mo8730f(effectConfig.mo227562i())) {
                FileManager.f5817a.mo8719a(effectConfig.mo227562i(), true);
                if (!FileManager.f5817a.mo8730f(effectConfig.mo227562i())) {
                    Logger.m7508a(Logger.f5760a, f164755i, "Cache directory error", null, 4, null);
                    return false;
                }
            }
            if (!FileManager.f5817a.mo8730f(effectConfig.mo227548H())) {
                FileManager.f5817a.mo8719a(effectConfig.mo227548H(), true);
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo227635a(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        m256599a().mo227812a(effect, true, null);
        if (!this.f164756a.mo227549I().mo227805a(effect) || !EffectUtils.f165112a.mo228314a(effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo227631a(Effect effect, IFetchEffectListener dVar) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        m256599a().mo227812a(effect, false, dVar);
    }

    /* renamed from: a */
    public final void mo227634a(String str, String str2, int i, Map<String, String> map, IEffectPlatformBaseListener<Boolean> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "checkKey");
        m256602b().mo227811a(str, str2, i, map, bVar);
    }

    /* renamed from: a */
    public final void mo227632a(String str, String str2, int i, int i2, int i3, String str3, IEffectPlatformBaseListener<CategoryPageModel> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "panel");
        m256602b().mo227810a(str, str2, i, i2, i3, str3, true, null, bVar);
    }

    /* renamed from: a */
    public final void mo227633a(String str, String str2, int i, int i2, int i3, String str3, Map<String, String> map, IEffectPlatformBaseListener<CategoryPageModel> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "panel");
        m256602b().mo227810a(str, str2, i, i2, i3, str3, false, map, bVar);
    }
}
