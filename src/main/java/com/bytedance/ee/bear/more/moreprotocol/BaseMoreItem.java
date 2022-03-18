package com.bytedance.ee.bear.more.moreprotocol;

import android.text.TextUtils;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0004J\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\rH\u0004J\b\u0010\u0012\u001a\u00020\rH\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "()V", "host", "Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;", "getHost", "getMoreInfo", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "getString", "", "resId", "", "isContainsCurItem", "", "items", "", "([Ljava/lang/String;)Z", "isItemDisabledByJSMsg", "isItemInvisibleByJSMsg", "onRelease", "", "setHost", "shouldShowBadgeByJSMsg", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class BaseMoreItem implements IBaseMoreItem {
    private IMoreHost host;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public void onRelease() {
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public IMoreHost getHost() {
        IMoreHost aVar = this.host;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        return aVar;
    }

    public final IMoreInfo getMoreInfo() {
        IMoreHost aVar = this.host;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        return aVar.mo39164a();
    }

    /* access modifiers changed from: protected */
    public final boolean isItemDisabledByJSMsg() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            return isContainsCurItem(moreInfo.mo39011G());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean isItemInvisibleByJSMsg() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            return isContainsCurItem(moreInfo.mo39012H());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean shouldShowBadgeByJSMsg() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            return isContainsCurItem(moreInfo.mo39013I());
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public void setHost(IMoreHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        this.host = aVar;
    }

    private final boolean isContainsCurItem(String[] strArr) {
        boolean z;
        if (strArr != null) {
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && !TextUtils.isEmpty(getId())) {
                for (String str : strArr) {
                    if (TextUtils.equals(getId(), str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final String getString(int i) {
        IMoreHost aVar = this.host;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        if (aVar.mo39165b().getContext() == null) {
            C13479a.m54775e("BaseMoreItem", "getString()...context == null");
            return "";
        }
        IMoreHost aVar2 = this.host;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        String string = aVar2.mo39165b().getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "host.getHostFragment().getString(resId)");
        return string;
    }
}
