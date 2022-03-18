package com.bytedance.ee.bear.middleground.permission;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.p283g.C5174a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13607e;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.regex.RegexUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bN\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001:\u0002Í\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010j\u001a\u00020\u00042\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010m\u001a\u00020\u0004H\u0002J\u001a\u0010n\u001a\u00020\u00042\b\u0010o\u001a\u0004\u0018\u00010\u00042\u0006\u0010m\u001a\u00020\u0004H\u0002J\u0018\u0010p\u001a\u00020\u00042\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020rH\u0002J\u0012\u0010t\u001a\u00020\u00042\b\u0010k\u001a\u0004\u0018\u00010lH\u0002J\u0012\u0010u\u001a\u00020\u00042\b\u0010k\u001a\u0004\u0018\u00010lH\u0002J8\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00042\u0006\u0010{\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u00042\u0006\u0010}\u001a\u00020r2\u0006\u0010~\u001a\u00020rH\u0003J(\u0010\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u00042\u0006\u0010}\u001a\u00020rH\u0007J)\u0010\u0001\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u00042\u0006\u0010}\u001a\u00020rH\u0007J)\u0010\u0001\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u00042\u0006\u0010}\u001a\u00020rH\u0007J4\u0010\u0001\u001a\u00020w2\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u0004H\u0007J0\u0010\u0001\u001a\u00020w2\u0007\u0010\u0001\u001a\u00020\u00042\b\u0010z\u001a\u0004\u0018\u00010\u00042\t\u0010\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J/\u0010\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010k\u001a\u00020l2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020rH\u0007J&\u0010\u0001\u001a\u00020w2\b\u0010z\u001a\u0004\u0018\u00010\u00042\u0006\u0010x\u001a\u00020y2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0001\u001a\u00020w2\b\u0010z\u001a\u0004\u0018\u00010\u00042\u0006\u0010x\u001a\u00020y2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0001\u001a\u00020w2\b\u0010z\u001a\u0004\u0018\u00010\u00042\u0006\u0010x\u001a\u00020y2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J1\u0010\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030\u00012\b\u0010k\u001a\u0004\u0018\u00010l2\u0007\u0010\u0001\u001a\u00020\u00042\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0001\u001a\u00020w2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010x\u001a\u00020y2\b\u0010k\u001a\u0004\u0018\u00010lH\u0007J9\u0010\u0001\u001a\u00020w2\b\u0010z\u001a\u0004\u0018\u00010\u00042\u0006\u0010x\u001a\u00020y2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010{\u001a\u00020\u00042\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J6\u0010\u0001\u001a\u00020w2\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J4\u0010\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00042\u0016\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\u0007J4\u0010\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00042\u0016\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\u0007J\u001d\u0010\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030\u00012\b\u0010k\u001a\u0004\u0018\u00010lH\u0007J\u001d\u0010 \u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030¡\u00012\b\u0010k\u001a\u0004\u0018\u00010lH\u0007J/\u0010¢\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030¡\u00012\u0006\u0010k\u001a\u00020l2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0001\u001a\u00020rH\u0007J1\u0010£\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030¡\u00012\b\u0010k\u001a\u0004\u0018\u00010l2\u0007\u0010\u0001\u001a\u00020\u00042\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J4\u0010¤\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030¡\u00012\u0007\u0010\u0001\u001a\u00020\u00042\u0016\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\u0007J4\u0010¥\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030¡\u00012\u0007\u0010\u0001\u001a\u00020\u00042\u0016\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\u0007JJ\u0010¦\u0001\u001a\u00020w2\u0010\u0010§\u0001\u001a\u000b\u0012\u0004\u0012\u00020l\u0018\u00010¨\u00012\u0006\u0010z\u001a\u00020\u00042\u0006\u0010x\u001a\u00020y2\u0007\u0010©\u0001\u001a\u00020r2\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J>\u0010¬\u0001\u001a\u00020w2\u0010\u0010§\u0001\u001a\u000b\u0012\u0004\u0012\u00020l\u0018\u00010¨\u00012\u0006\u0010z\u001a\u00020\u00042\u0006\u0010x\u001a\u00020y2\u0007\u0010©\u0001\u001a\u00020r2\b\u0010­\u0001\u001a\u00030®\u0001H\u0007J,\u0010¯\u0001\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0007\u0010°\u0001\u001a\u00020r2\u0007\u0010±\u0001\u001a\u00020\u00042\u0007\u0010²\u0001\u001a\u00020\u0004H\u0007JP\u0010³\u0001\u001a\u00020w2\u0006\u0010{\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010´\u0001\u001a\u00020\u00042\u0007\u0010µ\u0001\u001a\u00020\u00042\u0007\u0010¶\u0001\u001a\u00020\u00042\u0007\u0010·\u0001\u001a\u00020\u00042\u0007\u0010¸\u0001\u001a\u00020\u0004H\u0007J\u001b\u0010¹\u0001\u001a\u00020w2\u0006\u0010{\u001a\u00020\u00042\b\u0010\u0001\u001a\u00030\u0001H\u0007JE\u0010¹\u0001\u001a\u00020w2\u0006\u0010{\u001a\u00020\u00042\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00042\u0007\u0010°\u0001\u001a\u00020r2\u0007\u0010º\u0001\u001a\u00020\u00042\u0007\u0010»\u0001\u001a\u00020\u00042\u0007\u0010¼\u0001\u001a\u00020\u0004H\u0007J#\u0010½\u0001\u001a\u00020w2\u0007\u0010¾\u0001\u001a\u00020r2\u0006\u0010|\u001a\u00020y2\u0007\u0010¿\u0001\u001a\u00020rH\u0007J\u001a\u0010À\u0001\u001a\u00020w2\u0006\u0010k\u001a\u00020l2\u0007\u0010\u0001\u001a\u00020\u0004H\u0007J@\u0010Á\u0001\u001a\u00020w2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010Â\u0001\u001a\u0004\u0018\u00010y2\u0007\u0010Ã\u0001\u001a\u00020r2\u0010\u0010§\u0001\u001a\u000b\u0012\u0004\u0012\u00020l\u0018\u00010¨\u0001H\u0007¢\u0006\u0003\u0010Ä\u0001J5\u0010Å\u0001\u001a\u00020w2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010{\u001a\u00020\u00042\t\u0010\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010z\u001a\u00020\u00042\u0006\u0010x\u001a\u00020yH\u0007J+\u0010Æ\u0001\u001a\u00020w2\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u0004H\u0007J4\u0010Ç\u0001\u001a\u00020w2\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020rH\u0007J/\u0010È\u0001\u001a\u00020w2\u0007\u0010\u0001\u001a\u00020\u00042\b\u0010z\u001a\u0004\u0018\u00010\u00042\u0006\u0010x\u001a\u00020y2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J5\u0010É\u0001\u001a\u00020w2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010{\u001a\u00020\u00042\t\u0010\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010z\u001a\u00020\u00042\u0006\u0010x\u001a\u00020yH\u0007J#\u0010Ê\u0001\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0007\u0010°\u0001\u001a\u00020r2\u0007\u0010±\u0001\u001a\u00020\u0004H\u0007J\u001e\u0010Ë\u0001\u001a\u00020w2\b\u0010\u0001\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\t\u0010Ì\u0001\u001a\u00020wH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010R\u001a\u00020S8BX\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bT\u0010UR\u001b\u0010X\u001a\u00020Y8BX\u0002¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\bZ\u0010[R\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040^X\u0004¢\u0006\u0004\n\u0002\u0010_R\u001b\u0010`\u001a\u00020a8BX\u0002¢\u0006\f\n\u0004\bd\u0010W\u001a\u0004\bb\u0010cR\u001b\u0010e\u001a\u00020f8BX\u0002¢\u0006\f\n\u0004\bi\u0010W\u001a\u0004\bg\u0010h¨\u0006Î\u0001"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/PermissionAnalytic;", "", "()V", "ACTION", "", "ACTION_CONFIRM_REMOVE", "ACTION_POP", "CHAT_GROUP", "CLIENT_SFOLDER_MANAGE", "CLIENT_SFOLDER_MEMBER", "COLLABORATE_ID", "COLLABORATE_ORGANIZATION_COUNT", "COLLABORATE_TENANT_ID", "COLLABORATE_TYPE", "COLLAB_IS_CROSS_TENANT", "COLLAB_TENANT_ID", "EDIT", "ERASE_BEFORE_PERM", "EXTERNAL_PUBLIC_SHARE_CANCEL", "EXTERNAL_PUBLIC_SHARE_OK", "FILE_ID", "FILE_TYPE", "FROMUSER_COLLABORATE_TENANT_ID", "GROUP", "GROUP_RECENT", "GROUP_SEARCH", "INVITE_COLLABORATE_TYPE", "IS_OWNER", "LARK_INFORM", "LINK_PERM_INNER_EDITABLE", "LINK_PERM_INNER_READABLE", "LINK_PERM_PRIVATE", "LOCATION_APPLY_PERMISSION", "LOCATION_ASK_OWNER", "LOCATION_INVITED_MEMBER_AFTER", "LOCATION_INVITED_MEMBER_BEFORE", "LOCATION_OTHERS", "LOCATION_SEND_LINK", "OPERATION_NOT_NOW", "OPERATION_OK", "OPERATION_TURN_ON", "PERM_SET_AFTER", "PERM_SET_BEFORE", "PRODUCT", "PRODUCT_SPUR", "PRODUCT_SUITE", "READ", "REASON_ADMIN_SETTING", "REASON_BLOCK", "REASON_BLOCKED", "REASON_MORE_THAN_LIMITED", "REASON_OTHERS", "REASON_PHONE_LIMITED", "REASON_PRIVACY_SETTING", "RELATION_TYPE", "SEARCHRESULT_USER_ID", "SEARCHRESULT_USER_TYPE", "SEARCH_TYPE", "SEARCH_TYPE_NICKNAME", "SEARCH_TYPE_PHONE", "SHARE_METHOD_TYPE", "SHARE_METHOD_TYPE_LARK", "SHARE_METHOD_TYPE_PHONE", "SHARE_OPERATION", "SHOW_ASK_OWNER_ACTION_LINK_SHARE", "SHOW_ASK_OWNER_ACTION_SHARE", "SINGLEPRODUCT_HASREG", "SINGLEPRODUCT_NOREG", "SOURCE_PERM_LIST", "STATUS_CODE", "STATUS_NAME", "SUITE_ENTERPRISEL_USER", "SUITE_PERSONAL_USER", "SUITE_TOC_USER", "TAG", "TOUSER_ACCOUNT_TYPE", "TYPE_CALENDAR_EVENT", "TYPE_CHAT", "TYPE_ORGANIZATION", "TYPE_SHARE_SPACE", "TYPE_USER", "USER_STATUS", "accountService", "Lcom/bytedance/ee/bear/contract/LocalAccountService;", "getAccountService", "()Lcom/bytedance/ee/bear/contract/LocalAccountService;", "accountService$delegate", "Lkotlin/Lazy;", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "analyticService$delegate", "eventArray", "", "[Ljava/lang/String;", "infoProvideService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "getInfoProvideService", "()Lcom/bytedance/ee/bear/contract/InfoProvideService;", "infoProvideService$delegate", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "getAccountType", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "default", "getEncryptStr", "s", "getOperateItem", "memberEnable", "", "visitorEnable", "getShareMethodType", "getUserType", "reportApplyEditPermission", "", ShareHitPoint.f121869d, "", "token", "action", "permission", "hasNote", UpdateKey.STATUS, "reportApplyPermCancel", "reportApplyPermFailed", "reportApplyPermSuccess", "reportAskOwner", "eventName", ShareHitPoint.f121868c, "module", "reportBlock", "reason", "location", "reportChangePermission", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "isEdit", "reportClickCollList", "reportClickLinkShareItem", "reportClickPermSetItem", "reportClickRemovePermission", "detailAction", "reportClickSearchResult", "objToken", "reportClientLockSetting", "subType", "reportModule", "reportCreateNewShareFolder", "fileId", "fileTenantId", "parentFolderId", "reportDocFullTypeInfoEvent", "extEntry", "", "reportDocInfoEvent", "reportEditDocPermission", "reportEditFolderPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "reportFolderChangePermission", "reportFolderClickRemovePermission", "reportFolderFullTypeInfoEvent", "reportFolderInfoEvent", "reportInvite", "userInfos", "", "isNotifyLark", "status_code", "status_name", "reportInviteFailed", "throwable", "", "reportLinkShareOperation", "isOwner", "linkPermission", "operation", "reportManageNewShareFolderMember", "role", "memberId", "memberType", "memberRole", "scene", "reportPermissionOperation", "ownerUid", "createTime", "creatorTenantId", "reportPublicShareOperation", "confirm", "noMoreRemind", "reportRemoveFolderUser", "reportSearchCollaborate", "docType", "isMobilePhone", "(Ljava/lang/String;Ljava/lang/Integer;ZLjava/util/List;)V", "reportSendAskOwner", "reportSendLink", "reportSetNewShareFolderPermission", "reportSharePanelItemEvent", "reportShowAskOwner", "reportShowLinkShareTips", "reportShowPermSetPage", "reportSwitchPhoneCode", "OperateItem", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PermissionAnalytic {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f25611a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PermissionAnalytic.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PermissionAnalytic.class), "analyticService", "getAnalyticService()Lcom/bytedance/ee/bear/contract/AnalyticService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PermissionAnalytic.class), "infoProvideService", "getInfoProvideService()Lcom/bytedance/ee/bear/contract/InfoProvideService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PermissionAnalytic.class), "accountService", "getAccountService()Lcom/bytedance/ee/bear/contract/LocalAccountService;"))};

    /* renamed from: b */
    public static final PermissionAnalytic f25612b = new PermissionAnalytic();

    /* renamed from: c */
    private static final String[] f25613c = {"share", "click_add_collaborate", "click_invite_search_bar", "click_collaborate_inviter_next_step", "click_select_perm_inviter", "click_alter_collaborate_perm", "click_send_invite_btn"};

    /* renamed from: d */
    private static final Lazy f25614d = LazyKt.lazy(C9547d.INSTANCE);

    /* renamed from: e */
    private static final Lazy f25615e = LazyKt.lazy(C9545b.INSTANCE);

    /* renamed from: f */
    private static final Lazy f25616f = LazyKt.lazy(C9546c.INSTANCE);

    /* renamed from: g */
    private static final Lazy f25617g = LazyKt.lazy(C9544a.INSTANCE);

    /* renamed from: a */
    private final AbstractC5233x m39392a() {
        Lazy lazy = f25615e;
        KProperty kProperty = f25611a[1];
        return (AbstractC5233x) lazy.getValue();
    }

    /* renamed from: b */
    private final al m39417b() {
        Lazy lazy = f25616f;
        KProperty kProperty = f25611a[2];
        return (al) lazy.getValue();
    }

    /* renamed from: c */
    private final an m39425c() {
        Lazy lazy = f25617g;
        KProperty kProperty = f25611a[3];
        return (an) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/PermissionAnalytic$OperateItem;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "ManagerCanInvite", "VisitorCanInvite", "MemberCanInvite", "AllCanInvite", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum OperateItem {
        ManagerCanInvite(0),
        VisitorCanInvite(1),
        MemberCanInvite(2),
        AllCanInvite(3);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        private OperateItem(int i) {
            this.value = i;
        }
    }

    private PermissionAnalytic() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39408a(String str, int i, String str2, boolean z, String str3, String str4, String str5) {
        String str6;
        Intrinsics.checkParameterIsNotNull(str, "action");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "ownerUid");
        Intrinsics.checkParameterIsNotNull(str4, "createTime");
        Intrinsics.checkParameterIsNotNull(str5, "creatorTenantId");
        try {
            PermissionAnalytic permissionAnalytic = f25612b;
            AccountService.Account f = permissionAnalytic.m39425c().mo16408f();
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            hashMap.put("eventType", "click");
            String d = C13598b.m55197d(str2);
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(token)");
            hashMap.put("file_id", d);
            String d2 = C13598b.m55197d(str5);
            Intrinsics.checkExpressionValueIsNotNull(d2, "EncriptUtils.handleEncri…         creatorTenantId)");
            hashMap.put("file_tenant_id", d2);
            if (f == null || (str6 = f.f14592i) == null) {
                str6 = "";
            }
            hashMap.put("file_is_cross_tenant", String.valueOf(!Intrinsics.areEqual(str6, str5)));
            String a = C8275a.m34050a(i);
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(type)");
            hashMap.put("file_type", a);
            hashMap.put("owner_id", str3);
            hashMap.put("is_owner", String.valueOf(z));
            hashMap.put("create_time", str4);
            String b = C13607e.m55248b(Long.parseLong(str4));
            Intrinsics.checkExpressionValueIsNotNull(b, "ReportDateUtils.dateFrom…     createTime.toLong())");
            hashMap.put("create_date", b);
            String a2 = C13607e.m55247a(Long.parseLong(str4));
            Intrinsics.checkExpressionValueIsNotNull(a2, "ReportDateUtils.dayFromT…     createTime.toLong())");
            hashMap.put("from_create_date", a2);
            hashMap.put("module", String.valueOf(i));
            hashMap.put(ShareHitPoint.f121868c, "click_public_permission_setting_items");
            permissionAnalytic.m39392a().mo21079a("share_operation", hashMap);
        } catch (Exception unused) {
            C13479a.m54758a("PermissionAnalytic", "AnalyticConstant.EventID.SHARE_OPERATION report error");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39409a(String str, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        m39408a(str, docPermSetInfo.mo38825b(), docPermSetInfo.mo38827c(), docPermSetInfo.mo38845r(), docPermSetInfo.mo38832f(), docPermSetInfo.mo38833g(), docPermSetInfo.mo38836i());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39401a(DocPermSetInfo docPermSetInfo, String str, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m39421b(docPermSetInfo, str, map);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39403a(FolderPermSetInfo folderPermSetInfo, String str, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        PermissionAnalytic permissionAnalytic = f25612b;
        AccountService.Account f = permissionAnalytic.m39425c().mo16408f();
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        String f2 = folderPermSetInfo.mo38869f().length() == 0 ? "0" : folderPermSetInfo.mo38869f();
        HashMap hashMap2 = hashMap;
        hashMap2.put("is_owner", String.valueOf(folderPermSetInfo.mo38874j()));
        String d = C13598b.m55197d(folderPermSetInfo.mo38867e());
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncri…mSetInfo.getCreatorUid())");
        hashMap2.put("create_uid", d);
        hashMap2.put("create_time", f2);
        String b = C13607e.m55248b(Long.parseLong(f2));
        Intrinsics.checkExpressionValueIsNotNull(b, "ReportDateUtils.dateFromTime(createTime.toLong())");
        hashMap2.put("create_date", b);
        String a = C13607e.m55247a(Long.parseLong(f2));
        Intrinsics.checkExpressionValueIsNotNull(a, "ReportDateUtils.dayFromTime(createTime.toLong())");
        hashMap2.put("from_create_date", a);
        String a2 = C8275a.m34050a(folderPermSetInfo.mo38863b());
        Intrinsics.checkExpressionValueIsNotNull(a2, "DocumentType.getDocument…ng(permSetInfo.getType())");
        hashMap2.put("file_type", a2);
        String d2 = C13598b.m55197d(folderPermSetInfo.mo38864c());
        Intrinsics.checkExpressionValueIsNotNull(d2, "EncriptUtils.handleEncri…n(permSetInfo.getToken())");
        hashMap2.put("file_id", d2);
        if (C69043h.m265767b(f25613c, str)) {
            String d3 = C13598b.m55197d(folderPermSetInfo.mo38870g());
            Intrinsics.checkExpressionValueIsNotNull(d3, "EncriptUtils.handleEncri…nfo.getCreatorTenantId())");
            hashMap2.put("file_tenant_id", d3);
            if (f != null) {
                hashMap2.put("file_is_cross_tenant", String.valueOf(!Intrinsics.areEqual(f.f14592i, folderPermSetInfo.mo38870g())));
            }
        }
        try {
            permissionAnalytic.m39392a().mo21079a(str, hashMap);
        } catch (RemoteException unused) {
            C13479a.m54758a("PermissionAnalytic", str + " report error");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39416a(List<? extends UserInfo> list, String str, int i, boolean z, Throwable th) {
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        if (th instanceof NetService.ServerErrorException) {
            NetService.ServerErrorException serverErrorException = (NetService.ServerErrorException) th;
            str3 = String.valueOf(serverErrorException.getCode());
            str2 = serverErrorException.getMsg().toString();
        } else {
            str3 = "999";
            str2 = "Network Failed";
        }
        m39415a(list, str, i, z, str3, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39415a(List<? extends UserInfo> list, String str, int i, boolean z, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Iterator<T> it;
        Intrinsics.checkParameterIsNotNull(str, "token");
        try {
            AccountService.Account f = f25612b.m39425c().mo16408f();
            HashMap hashMap = new HashMap();
            String d = C13598b.m55197d(str);
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(token)");
            hashMap.put("file_id", d);
            String a = C8275a.m34050a(i);
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(type)");
            hashMap.put("file_type", a);
            HashMap hashMap2 = hashMap;
            String str11 = "";
            if (f == null || (str4 = f.f14592i) == null) {
                str4 = str11;
            }
            String d2 = C13598b.m55197d(str4);
            Intrinsics.checkExpressionValueIsNotNull(d2, "EncriptUtils.handleEncri… account?.tenantId ?: \"\")");
            hashMap2.put("fromuser_collaborate_tenant_id", d2);
            int i2 = 0;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                str10 = str11;
                str9 = str10;
                str8 = str9;
                str7 = str8;
                str6 = str7;
                str5 = str6;
                int i3 = 0;
                while (it2.hasNext()) {
                    T next = it2.next();
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    T t = next;
                    if (i2 == 0) {
                        PermissionAnalytic permissionAnalytic = f25612b;
                        str10 = permissionAnalytic.m39394a(t.getId(), "0");
                        str9 = permissionAnalytic.m39393a(t);
                        str8 = permissionAnalytic.m39394a(t.getTenantId(), "0");
                        str7 = permissionAnalytic.m39419b(t, "0");
                        it = it2;
                        str5 = String.valueOf(t.getPermission());
                        str6 = permissionAnalytic.m39418b(t);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str10);
                        sb.append(",");
                        PermissionAnalytic permissionAnalytic2 = f25612b;
                        it = it2;
                        sb.append(permissionAnalytic2.m39394a(t.getId(), "0"));
                        String str12 = str9 + "," + permissionAnalytic2.m39393a(t);
                        String str13 = str8 + "," + permissionAnalytic2.m39394a(t.getTenantId(), "0");
                        String str14 = str7 + "," + permissionAnalytic2.m39419b(t, "0");
                        str6 = str6 + "," + permissionAnalytic2.m39418b(t);
                        str5 = str5 + "," + t.getPermission();
                        str10 = sb.toString();
                        str7 = str14;
                        str8 = str13;
                        str9 = str12;
                    }
                    if (t.getOwnerType() == 18) {
                        i3++;
                    }
                    it2 = it;
                    i2 = i4;
                }
                i2 = i3;
            } else {
                str10 = str11;
                str9 = str10;
                str8 = str9;
                str7 = str8;
                str6 = str7;
                str5 = str6;
            }
            hashMap.put("collaborate_id", str10);
            hashMap.put("collaborate_type", str9);
            hashMap.put("collaborate_tenant_id", str8);
            hashMap.put("touser_account_type", str7);
            hashMap.put("share_method_type", str6);
            hashMap.put("collaborate_organization_count", String.valueOf(i2));
            HashMap hashMap3 = hashMap;
            PermissionAnalytic permissionAnalytic3 = f25612b;
            hashMap3.put("product", permissionAnalytic3.m39417b().mo17344E() == 1 ? "suite" : "spur");
            hashMap.put("perm_set_after", str5);
            hashMap.put("lark_inform", String.valueOf(z));
            hashMap.put("status_code", str2 != null ? str2 : str11);
            HashMap hashMap4 = hashMap;
            if (str3 != null) {
                str11 = str3;
            }
            hashMap4.put("status_name", str11);
            C13479a.m54772d("PermissionAnalytic", hashMap.toString());
            permissionAnalytic3.m39392a().mo21079a("click_send_invite_btn", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("PermissionAnalytic", e);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39410a(String str, Integer num, boolean z, List<? extends UserInfo> list) {
        int i;
        String str2;
        try {
            HashMap hashMap = new HashMap();
            String d = C13598b.m55197d(str);
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(objToken)");
            hashMap.put("file_id", d);
            HashMap hashMap2 = hashMap;
            if (num != null) {
                i = num.intValue();
            } else {
                C8275a aVar = C8275a.f22369b;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
                i = aVar.mo32555b();
            }
            String a = C8275a.m34050a(i);
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocument…cumentType.UNKNOWN.value)");
            hashMap2.put("file_type", a);
            String a2 = C5174a.m21161a(f25612b.m39417b().mo17344E());
            Intrinsics.checkExpressionValueIsNotNull(a2, "AnalyticUtil.getProductT…oProvideService.hostType)");
            hashMap.put("product", a2);
            hashMap.put("search_type", z ? "phone" : "nickname");
            String str3 = "";
            if (list != null) {
                int i2 = 0;
                str2 = str3;
                for (T t : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    T t2 = t;
                    if (i2 == 0) {
                        PermissionAnalytic permissionAnalytic = f25612b;
                        String a3 = permissionAnalytic.m39394a(t2.getId(), "0");
                        str2 = permissionAnalytic.m39419b(t2, "0");
                        str3 = a3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(",");
                        PermissionAnalytic permissionAnalytic2 = f25612b;
                        sb.append(permissionAnalytic2.m39394a(t2.getId(), "0"));
                        str2 = str2 + "," + permissionAnalytic2.m39419b(t2, "0");
                        str3 = sb.toString();
                    }
                    i2 = i3;
                }
            } else {
                str2 = str3;
            }
            hashMap.put("searchresult_user_id", str3);
            hashMap.put("searchresult_user_type", str2);
            f25612b.m39392a().mo21079a("click_search_inviter", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("PermissionAnalytic", e);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39405a(String str, int i, UserInfo userInfo) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_id", C13598b.m55197d(str));
            jSONObject.put("file_type", C8275a.m34050a(i));
            if (userInfo == null || (str2 = userInfo.getId()) == null) {
                str2 = "null";
            }
            jSONObject.put("member_id", str2);
            jSONObject.put("relation_type", userInfo != null ? Boolean.valueOf(userInfo.isFriend()) : null);
            C13479a.m54772d("PermissionAnalytic", jSONObject.toString());
            C5234y.m21391b().mo21080a("click_share_search_result", jSONObject);
        } catch (Throwable th) {
            C13479a.m54761a("PermissionAnalytic", th);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39404a(UserInfo userInfo, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        Intrinsics.checkParameterIsNotNull(str, "detailAction");
        try {
            PermissionAnalytic permissionAnalytic = f25612b;
            AccountService.Account f = permissionAnalytic.m39425c().mo16408f();
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            C8275a aVar = C8275a.f22370c;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
            String a = aVar.mo32553a();
            Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.FOLDER.type");
            hashMap.put("file_type", a);
            String str3 = null;
            HashMap hashMap2 = hashMap;
            if (TextUtils.isEmpty(f != null ? f.f14592i : null)) {
                str2 = "";
            } else {
                if (f != null) {
                    str3 = f.f14592i;
                }
                str2 = C13598b.m55197d(str3);
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "if (isUserTIdEmpty) \"\" e…       account?.tenantId)");
            hashMap2.put("fromuser_collaborate_tenant_id", str2);
            hashMap.put("is_owner", String.valueOf(userInfo.isOwner()));
            hashMap.put("erase_before_perm", String.valueOf(userInfo.getPermission()));
            hashMap.put("collaborate_id", permissionAnalytic.m39394a(userInfo.getId(), "0"));
            hashMap.put("collaborate_type", permissionAnalytic.m39393a(userInfo));
            hashMap.put("collaborate_tenant_id", permissionAnalytic.m39394a(userInfo.getTenantId(), "0"));
            hashMap.put("product", permissionAnalytic.m39417b().mo17344E() == 1 ? "suite" : "spur");
            hashMap.put("user_status", permissionAnalytic.m39419b(userInfo, "0"));
            hashMap.put(ShareHitPoint.f121868c, "perm-list");
            C13479a.m54772d("PermissionAnalytic", "reportClickRemovePermission, map = " + hashMap);
            permissionAnalytic.m39392a().mo21079a("click_erase_collaberate_perm", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("PermissionAnalytic", e);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39402a(FolderPermSetInfo folderPermSetInfo, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
        HashMap hashMap = new HashMap();
        hashMap.put("invite_collaborate_type", (userInfo == null || userInfo.getOwnerType() != 2) ? "user" : "chat");
        m39403a(folderPermSetInfo, "click_edit_collaborate_perm", hashMap);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39411a(String str, String str2, int i, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        Intrinsics.checkParameterIsNotNull(str3, "token");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put(ShareHitPoint.f121868c, "add_cooperator");
        hashMap2.put("module", str2);
        String a = C8275a.m34050a(i);
        Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(type)");
        hashMap2.put("file_type", a);
        String d = C13598b.m55197d(str3);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(token)");
        hashMap2.put("file_id", d);
        try {
            f25612b.m39392a().mo21079a(str, hashMap);
        } catch (RemoteException unused) {
            C13479a.m54758a("PermissionAnalytic", str + " report error");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39412a(String str, String str2, String str3, int i, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(str4, "token");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put("action", "share");
        hashMap2.put(ShareHitPoint.f121868c, str2);
        hashMap2.put("module", str3);
        String a = C8275a.m34050a(i);
        Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(type)");
        hashMap2.put("file_type", a);
        String d = C13598b.m55197d(str4);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(token)");
        hashMap2.put("file_id", d);
        try {
            f25612b.m39392a().mo21079a(str, hashMap);
        } catch (RemoteException unused) {
            C13479a.m54758a("PermissionAnalytic", str + " report error");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39413a(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "reason");
        Intrinsics.checkParameterIsNotNull(str4, "location");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put("reason", str);
        String d = C13598b.m55197d(str2);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(token)");
        hashMap2.put("file_id", d);
        if (str3 == null) {
            str3 = "";
        }
        hashMap2.put("module", str3);
        hashMap2.put("location", str4);
        try {
            C13479a.m54772d("PermissionAnalytic", hashMap.toString());
            f25612b.m39392a().mo21079a("client_auth_error", hashMap);
        } catch (Throwable th) {
            C13479a.m54759a("PermissionAnalytic", "client_auth_error report error", th);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39414a(String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str2, "action");
        Intrinsics.checkParameterIsNotNull(str4, "token");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, str);
            jSONObject.put("action", str2);
            jSONObject.put("module", str3);
            jSONObject.put("file_type", C8275a.m34050a(i));
            jSONObject.put("file_id", C13598b.m55197d(str4));
            C13479a.m54772d("PermissionAnalytic", "reportShowAskOwner()..." + jSONObject);
            f25612b.m39392a().mo21080a("show_ask_owner", jSONObject);
        } catch (Throwable th) {
            C13479a.m54761a("PermissionAnalytic", th);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39407a(String str, int i, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str3, "action");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str3);
            jSONObject.put("file_id", C13598b.m55197d(str));
            jSONObject.put("file_type", C8275a.m34050a(i));
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("sub_file_type", C8275a.m34050a(i));
            } else {
                jSONObject.put("sub_file_type", str2);
            }
            if (TextUtils.isEmpty(str4)) {
                jSONObject.put("module", C8275a.m34050a(i));
            } else {
                jSONObject.put("module", str4);
            }
            f25612b.m39392a().mo21080a("client_lock_setting", jSONObject);
            C13479a.m54772d("PermissionAnalytic", "client_lock_setting" + "  params = " + jSONObject);
        } catch (Exception e) {
            C13479a.m54761a("PermissionAnalytic", e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.PermissionAnalytic$b */
    static final class C9545b extends Lambda implements Function0<AbstractC5233x> {
        public static final C9545b INSTANCE = new C9545b();

        C9545b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5233x invoke() {
            return C5234y.m21391b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.PermissionAnalytic$c */
    static final class C9546c extends Lambda implements Function0<al> {
        public static final C9546c INSTANCE = new C9546c();

        C9546c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final al invoke() {
            return C4511g.m18594d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/LocalAccountService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.PermissionAnalytic$a */
    static final class C9544a extends Lambda implements Function0<an> {
        public static final C9544a INSTANCE = new C9544a();

        C9544a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final an invoke() {
            return (an) KoinJavaComponent.m268613a(an.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.PermissionAnalytic$d */
    static final class C9547d extends Lambda implements Function0<C10917c> {
        public static final C9547d INSTANCE = new C9547d();

        C9547d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* renamed from: a */
    private final String m39393a(UserInfo userInfo) {
        if (userInfo == null || userInfo.isUserType()) {
            return "user";
        }
        if (userInfo.getOwnerType() == 2) {
            return "chat";
        }
        if (userInfo.getOwnerType() == 5) {
            return "share_space";
        }
        if (userInfo.getOwnerType() == 9) {
            return "calendar_event";
        }
        if (userInfo.getOwnerType() == 18) {
            return "organization";
        }
        return "user";
    }

    /* renamed from: b */
    private final String m39418b(UserInfo userInfo) {
        if (userInfo != null && userInfo.getOwnerType() == 17) {
            RegexUtils aVar = RegexUtils.f35905a;
            String tempCountryCode = userInfo.getTempCountryCode();
            Intrinsics.checkExpressionValueIsNotNull(tempCountryCode, "userInfo.tempCountryCode");
            String tempPhone = userInfo.getTempPhone();
            Intrinsics.checkExpressionValueIsNotNull(tempPhone, "userInfo.tempPhone");
            if (aVar.mo50676a(tempCountryCode, tempPhone)) {
                return "Phone";
            }
        }
        return "Lark";
    }

    /* renamed from: a */
    private final String m39394a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String d = C13598b.m55197d(str);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(s)");
        return d;
    }

    /* renamed from: b */
    private final String m39419b(UserInfo userInfo, String str) {
        if (userInfo == null || !userInfo.isUserType()) {
            if (userInfo == null || userInfo.getOwnerType() != 2) {
                return str;
            }
            return "chat_group";
        } else if (userInfo.getOwnerType() == 17) {
            return "singleproduct_noreg";
        } else {
            if (TextUtils.isEmpty(userInfo.getTenant_tag())) {
                return str;
            }
            if (TextUtils.equals("0", userInfo.getTenant_tag())) {
                return "suite_enterprisel_user";
            }
            if (TextUtils.equals("", userInfo.getTenant_tag())) {
                return "suite_toc_user";
            }
            if (userInfo.isIs_single_product()) {
                return "singleproduct_hasreg";
            }
            return "suite_personal_user";
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39397a(DocPermSetInfo docPermSetInfo, UserInfo userInfo) {
        String str;
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        HashMap hashMap = new HashMap();
        if (userInfo == null || userInfo.getOwnerType() != 2) {
            str = "user";
        } else {
            str = "chat";
        }
        hashMap.put("invite_collaborate_type", str);
        m39421b(docPermSetInfo, "click_edit_collaborate_perm", hashMap);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39400a(DocPermSetInfo docPermSetInfo, String str) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put(ShareHitPoint.f121868c, str);
        m39421b(docPermSetInfo, "show_permmision_page", hashMap);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39406a(String str, int i, String str2) {
        f25612b.m39423b("view_collaborate_list", str, i, str2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39422b(String str, int i, String str2) {
        f25612b.m39423b("click_linkshare_setting", str, i, str2);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39427c(String str, int i, String str2) {
        f25612b.m39423b("click_file_perm_set_within", str, i, str2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39421b(DocPermSetInfo docPermSetInfo, String str, Map<String, String> map) {
        boolean z;
        String str2;
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        PermissionAnalytic permissionAnalytic = f25612b;
        AccountService.Account f = permissionAnalytic.m39425c().mo16408f();
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (docPermSetInfo.mo38833g().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = "0";
        } else {
            str2 = docPermSetInfo.mo38833g();
        }
        HashMap hashMap2 = hashMap;
        hashMap2.put("is_owner", String.valueOf(docPermSetInfo.mo38845r()));
        String d = C13598b.m55197d(docPermSetInfo.mo38834h());
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncri…mSetInfo.getCreatorUid())");
        hashMap2.put("create_uid", d);
        hashMap2.put("create_time", str2);
        String b = C13607e.m55248b(Long.parseLong(str2));
        Intrinsics.checkExpressionValueIsNotNull(b, "ReportDateUtils.dateFromTime(createTime.toLong())");
        hashMap2.put("create_date", b);
        String a = C13607e.m55247a(Long.parseLong(str2));
        Intrinsics.checkExpressionValueIsNotNull(a, "ReportDateUtils.dayFromTime(createTime.toLong())");
        hashMap2.put("from_create_date", a);
        String a2 = C8275a.m34050a(docPermSetInfo.mo38825b());
        Intrinsics.checkExpressionValueIsNotNull(a2, "DocumentType.getDocument…ng(permSetInfo.getType())");
        hashMap2.put("file_type", a2);
        String d2 = C13598b.m55197d(docPermSetInfo.mo38827c());
        Intrinsics.checkExpressionValueIsNotNull(d2, "EncriptUtils.handleEncri…n(permSetInfo.getToken())");
        hashMap2.put("file_id", d2);
        if (C69043h.m265767b(f25613c, str)) {
            String d3 = C13598b.m55197d(docPermSetInfo.mo38836i());
            Intrinsics.checkExpressionValueIsNotNull(d3, "EncriptUtils.handleEncri…nfo.getCreatorTenantId())");
            hashMap2.put("file_tenant_id", d3);
            if (f != null) {
                hashMap2.put("file_is_cross_tenant", String.valueOf(!Intrinsics.areEqual(f.f14592i, docPermSetInfo.mo38836i())));
            }
        }
        try {
            permissionAnalytic.m39392a().mo21079a(str, hashMap);
        } catch (RemoteException unused) {
            C13479a.m54758a("PermissionAnalytic", str + " report error");
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39420b(int i, String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "permission");
        m39395a(i, str, "send", str2, z, false);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m39426c(int i, String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "permission");
        m39395a(i, str, "cancel", str2, z, false);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39396a(int i, String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "permission");
        m39395a(i, str, "send", str2, z, true);
    }

    /* renamed from: b */
    private final void m39423b(String str, String str2, int i, String str3) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        String d = C13598b.m55197d(str2);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(token)");
        hashMap2.put("file_id", d);
        String a = C8275a.m34050a(i);
        Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocumentTypeString(type)");
        hashMap2.put("file_type", a);
        if (str3 == null) {
            str3 = "";
        }
        hashMap2.put("module", str3);
        try {
            C13479a.m54772d("PermissionAnalytic", "eventName: " + str + ", params: " + hashMap);
            m39392a().mo21079a(str, hashMap);
        } catch (Throwable th) {
            C13479a.m54759a("PermissionAnalytic", str + " report error", th);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39398a(DocPermSetInfo docPermSetInfo, UserInfo userInfo, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(str, "detailAction");
        try {
            PermissionAnalytic permissionAnalytic = f25612b;
            AccountService.Account f = permissionAnalytic.m39425c().mo16408f();
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            hashMap.put("file_type", String.valueOf(docPermSetInfo.mo38825b()));
            String str9 = null;
            if (f != null) {
                str3 = f.f14592i;
            } else {
                str3 = null;
            }
            HashMap hashMap2 = hashMap;
            if (TextUtils.isEmpty(str3)) {
                str4 = "";
            } else {
                if (f != null) {
                    str8 = f.f14592i;
                } else {
                    str8 = null;
                }
                str4 = C13598b.m55197d(str8);
            }
            Intrinsics.checkExpressionValueIsNotNull(str4, "if (isUserTIdEmpty) \"\" e…       account?.tenantId)");
            hashMap2.put("fromuser_collaborate_tenant_id", str4);
            hashMap.put("is_owner", String.valueOf(docPermSetInfo.mo38845r()));
            HashMap hashMap3 = hashMap;
            if (userInfo == null || (str5 = String.valueOf(userInfo.getPermission())) == null) {
                str5 = "";
            }
            hashMap3.put("erase_before_perm", str5);
            HashMap hashMap4 = hashMap;
            if (userInfo != null) {
                str6 = userInfo.getId();
            } else {
                str6 = null;
            }
            hashMap4.put("collaborate_id", permissionAnalytic.m39394a(str6, "0"));
            hashMap.put("collaborate_type", permissionAnalytic.m39393a(userInfo));
            HashMap hashMap5 = hashMap;
            if (userInfo != null) {
                str9 = userInfo.getTenantId();
            }
            hashMap5.put("collaborate_tenant_id", permissionAnalytic.m39394a(str9, "0"));
            HashMap hashMap6 = hashMap;
            if (permissionAnalytic.m39417b().mo17344E() == 1) {
                str7 = "suite";
            } else {
                str7 = "spur";
            }
            hashMap6.put("product", str7);
            hashMap.put("user_status", permissionAnalytic.m39419b(userInfo, "0"));
            HashMap hashMap7 = hashMap;
            if (str2 == null) {
                str2 = "";
            }
            hashMap7.put(ShareHitPoint.f121868c, str2);
            C13479a.m54772d("PermissionAnalytic", "reportClickRemovePermission, map = " + hashMap);
            m39421b(docPermSetInfo, "click_erase_collaberate_perm", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("PermissionAnalytic", e);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39399a(DocPermSetInfo docPermSetInfo, UserInfo userInfo, String str, boolean z) {
        String str2;
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        HashMap hashMap = new HashMap();
        int ownerType = userInfo.getOwnerType();
        if (ownerType == 2) {
            hashMap.put("collaborate_type", "chat");
        } else if (ownerType != 5) {
            hashMap.put("collaborate_type", "user");
        } else {
            hashMap.put("collaborate_type", "share_space");
        }
        HashMap hashMap2 = hashMap;
        String str3 = "read";
        if (z) {
            str2 = str3;
        } else {
            str2 = "edit";
        }
        hashMap2.put("perm_set_before", str2);
        if (z) {
            str3 = "edit";
        }
        hashMap2.put("perm_set_after", str3);
        if (str == null) {
            str = "";
        }
        hashMap2.put("module", str);
        C13479a.m54772d("PermissionAnalytic", "reportChangePermission, map = " + hashMap);
        m39401a(docPermSetInfo, "click_alter_collaborate_perm", hashMap2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m39424b(String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str2, "action");
        Intrinsics.checkParameterIsNotNull(str4, "token");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, str);
            jSONObject.put("action", str2);
            jSONObject.put("module", str3);
            jSONObject.put("file_type", C8275a.m34050a(i));
            jSONObject.put("file_id", C13598b.m55197d(str4));
            C13479a.m54772d("PermissionAnalytic", "reportSendAskOwner()..." + jSONObject);
            f25612b.m39392a().mo21080a("send_ask_owner", jSONObject);
        } catch (Throwable th) {
            C13479a.m54761a("PermissionAnalytic", th);
        }
    }

    @JvmStatic
    /* renamed from: a */
    private static final void m39395a(int i, String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_type", C8275a.m34050a(i));
            jSONObject.put("file_id", C13598b.m55197d(str));
            jSONObject.put("action", str2);
            jSONObject.put("permission", str3);
            String str5 = "1";
            if (z) {
                str4 = str5;
            } else {
                str4 = "0";
            }
            jSONObject.put("note", str4);
            if (!z2) {
                str5 = "0";
            }
            jSONObject.put(UpdateKey.STATUS, str5);
            C13479a.m54772d("PermissionAnalytic", "eventName: click_authority_apply_action, " + "reportApplyEditPermission()..." + jSONObject);
            f25612b.m39392a().mo21080a("click_authority_apply_action", jSONObject);
        } catch (Throwable th) {
            C13479a.m54761a("PermissionAnalytic", th);
        }
    }
}
