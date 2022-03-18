package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.list.common.header.DriveUploadView;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.browser.plugin.C12213f;
import com.bytedance.ee.bear.wikiv2.home.create.SelectIndex;
import com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectPanelDialog;
import com.bytedance.ee.bear.wikiv2.report.WikiDevReportV2;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.C12432c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.C12459b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpacePerm;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.AbstractC12476b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12477f;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12478g;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12479i;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12504l;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.Err;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.Loading;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.Ok;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.Result;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiAction;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiTips;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiDialogs;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 `2\u00020\u0001:\u0003`abB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020)J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u00105\u001a\u00020)2\u0006\u0010/\u001a\u0002002\u0006\u00106\u001a\u00020\nH\u0002J.\u00107\u001a\u00020)2\u0006\u00108\u001a\u00020#2\b\u00109\u001a\u0004\u0018\u00010\b2\u0006\u0010:\u001a\u00020\u001b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u001a\u0010=\u001a\u00020)2\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u0010F\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u0010G\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0002J\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I2\u0006\u0010K\u001a\u00020\bJ\u000e\u0010L\u001a\u00020)2\u0006\u00109\u001a\u00020\bJ6\u0010M\u001a\u00020)2\u0006\u00108\u001a\u00020#2\u0006\u0010N\u001a\u00020O2\b\u00109\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010:\u001a\u00020\u001b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<J6\u0010M\u001a\u00020)2\u0006\u00108\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010:\u001a\u00020\u001b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<J\u0012\u0010P\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010Q\u001a\u00020)J\u0012\u0010R\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010\bH\u0002J$\u0010S\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001bJ \u0010T\u001a\u00020)2\u0006\u0010U\u001a\u00020J2\u0006\u0010V\u001a\u00020J2\b\u0010W\u001a\u0004\u0018\u00010XJ\b\u0010Y\u001a\u00020)H\u0002J\b\u0010Z\u001a\u00020)H\u0014J\u0010\u0010[\u001a\u00020)2\u0006\u0010\\\u001a\u00020]H\u0002J\u0016\u0010^\u001a\u00020)2\u0006\u0010K\u001a\u00020\b2\u0006\u0010_\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "canCreate", "", "getCanCreate", "()Z", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "focusToken", "getFocusToken", "()Ljava/lang/String;", "spaceId", "getSpaceId", "spaceInfo", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/SpaceInfo;", "getSpaceInfo", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/SpaceInfo;", "uploadView", "Lcom/bytedance/ee/bear/list/common/header/DriveUploadView;", "viewConfig", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewConfig;", "viewDelegate", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;)V", "viewLifecycleOwner", "Landroidx/fragment/app/Fragment;", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/IWikiTreeModel;", "wikiDialog", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs;", "bindListener", "", "bindView", "viewLifeOwner", "Landroidx/lifecycle/LifecycleOwner;", "clearData", "doCollapse", "target", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/UITreeNode;", "doErr", "err", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Err;", "doExpand", "doFavorite", "switchOn", "doInit", "fragment", "wikiToken", "config", "dataLifecycleOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "doInsert", "doLoading", "loading", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Loading;", "doMoveTo", "doOk", "ok", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Ok;", "doRemove", "doRequestPerm", "doShortcutTo", "findSwipeItemLocation", "", "", "uid", "focusTo", "init", "workspace", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Workspace;", "initView", "insert", "isDisableToken", "load", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onClear", "onDetachedFromWindow", "reportOpenFinish", "result", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Result;", "setSwipeMenuOpen", "open", "Companion", "ViewConfig", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiTreeCtrlView extends FrameLayout {

    /* renamed from: g */
    public static final Companion f33573g = new Companion(null);

    /* renamed from: a */
    public String f33574a = "Wiki_WikiTreeCtrlView@";

    /* renamed from: b */
    public AbstractC12476b f33575b;

    /* renamed from: c */
    public ViewConfig f33576c;

    /* renamed from: d */
    public Fragment f33577d;

    /* renamed from: e */
    public DriveUploadView f33578e;

    /* renamed from: f */
    public final WikiDialogs f33579f = new WikiDialogs();

    /* renamed from: h */
    private final C68289a f33580h = new C68289a();

    /* renamed from: i */
    private ViewDelegate f33581i;

    /* renamed from: j */
    private HashMap f33582j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;", "", "()V", "onFocusChange", "", "wikiToken", "", "onInsert", "newToken", "onItemClick", "onMov", "toSpaceId", "movToken", "focusToken", "onPushDel", "delParentToken", "onPushMov", "onReady", "onRemove", "onShortcutTo", "toToken", "onWikiDeleted", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$c */
    public static abstract class ViewDelegate {
        /* renamed from: a */
        public void mo47295a() {
        }

        /* renamed from: a */
        public void mo47263a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        }

        /* renamed from: a */
        public void mo47296a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "toToken");
        }

        /* renamed from: a */
        public void mo47297a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "movToken");
            Intrinsics.checkParameterIsNotNull(str3, "focusToken");
        }

        /* renamed from: b */
        public void mo47377b() {
        }

        /* renamed from: b */
        public void mo47298b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "newToken");
        }

        /* renamed from: b */
        public void mo47299b(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "movToken");
            Intrinsics.checkParameterIsNotNull(str3, "focusToken");
        }

        /* renamed from: c */
        public void mo47300c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        }

        /* renamed from: d */
        public void mo47301d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "delParentToken");
        }

        /* renamed from: e */
        public void mo47302e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "delParentToken");
        }
    }

    /* renamed from: a */
    public View mo47696a(int i) {
        if (this.f33582j == null) {
            this.f33582j = new HashMap();
        }
        View view = (View) this.f33582j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33582j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$Companion;", "", "()V", "getViewModel", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/IWikiTreeModel;", "dataLifecycleOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC12476b mo47723a(ViewModelStoreOwner viewModelStoreOwner) {
            Intrinsics.checkParameterIsNotNull(viewModelStoreOwner, "dataLifecycleOwner");
            AbstractC12476b newInstance = C12479i.newInstance(viewModelStoreOwner);
            Intrinsics.checkExpressionValueIsNotNull(newInstance, "WikiTreeModel.newInstance(dataLifecycleOwner)");
            return newInstance;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001c\u0010\"\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\u001a\u0010%\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewConfig;", "", "()V", "dataFilter", "Lio/reactivex/functions/Function;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "", "getDataFilter", "()Lio/reactivex/functions/Function;", "setDataFilter", "(Lio/reactivex/functions/Function;)V", "disableToken", "", "getDisableToken", "()Ljava/lang/String;", "setDisableToken", "(Ljava/lang/String;)V", "enableFavorite", "getEnableFavorite", "()Z", "setEnableFavorite", "(Z)V", "enablePush", "getEnablePush", "setEnablePush", "enableRoot", "getEnableRoot", "setEnableRoot", "enableSwipe", "getEnableSwipe", "setEnableSwipe", "focusTo", "getFocusTo", "setFocusTo", ShareHitPoint.f121868c, "getSource", "setSource", "tagSuffix", "getTagSuffix", "setTagSuffix", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$b */
    public static final class ViewConfig {

        /* renamed from: a */
        private String f33583a = "";

        /* renamed from: b */
        private boolean f33584b;

        /* renamed from: c */
        private boolean f33585c = true;

        /* renamed from: d */
        private boolean f33586d;

        /* renamed from: e */
        private boolean f33587e;

        /* renamed from: f */
        private boolean f33588f;

        /* renamed from: g */
        private Function<TreeNode, Boolean> f33589g;

        /* renamed from: h */
        private String f33590h = "";

        /* renamed from: i */
        private String f33591i;

        /* renamed from: a */
        public final String mo47724a() {
            return this.f33583a;
        }

        /* renamed from: f */
        public final boolean mo47738f() {
            return this.f33588f;
        }

        /* renamed from: g */
        public final Function<TreeNode, Boolean> mo47739g() {
            return this.f33589g;
        }

        /* renamed from: h */
        public final String mo47740h() {
            return this.f33590h;
        }

        /* renamed from: i */
        public final String mo47741i() {
            return this.f33591i;
        }

        /* renamed from: d */
        public final boolean mo47735d() {
            return this.f33586d;
        }

        /* renamed from: e */
        public final boolean mo47737e() {
            return this.f33587e;
        }

        /* renamed from: b */
        public final boolean mo47730b() {
            return this.f33584b;
        }

        /* renamed from: c */
        public final boolean mo47733c() {
            return this.f33585c;
        }

        /* renamed from: b */
        public final void mo47729b(boolean z) {
            this.f33585c = z;
        }

        /* renamed from: c */
        public final void mo47731c(String str) {
            this.f33591i = str;
        }

        /* renamed from: d */
        public final void mo47734d(boolean z) {
            this.f33587e = z;
        }

        /* renamed from: e */
        public final void mo47736e(boolean z) {
            this.f33588f = z;
        }

        /* renamed from: a */
        public final void mo47725a(Function<TreeNode, Boolean> function) {
            this.f33589g = function;
        }

        /* renamed from: b */
        public final void mo47728b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f33590h = str;
        }

        /* renamed from: c */
        public final void mo47732c(boolean z) {
            this.f33586d = z;
        }

        /* renamed from: a */
        public final void mo47726a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f33583a = str;
        }

        /* renamed from: a */
        public final void mo47727a(boolean z) {
            this.f33584b = z;
        }
    }

    public final ViewDelegate getViewDelegate() {
        return this.f33581i;
    }

    /* renamed from: a */
    public final void mo47699a(Fragment fragment, String str, String str2, ViewConfig bVar, ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        if (!TextUtils.isEmpty(str)) {
            m52067a(fragment, str2, bVar, viewModelStoreOwner);
            AbstractC12476b bVar2 = this.f33575b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            bVar2.load(str, str2, !m52076d(str2));
        }
    }

    /* renamed from: a */
    public final void mo47703a(Result eVar) {
        if (eVar instanceof Ok) {
            String a = ((Ok) eVar).mo47487a();
            ViewConfig bVar = this.f33576c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
            }
            WikiDevReportV2.m50894a(a, bVar.mo47741i(), "success", 0);
        } else if (eVar instanceof Err) {
            ViewConfig bVar2 = this.f33576c;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
            }
            WikiDevReportV2.m50894a("", bVar2.mo47741i(), "fail", Integer.valueOf(C12477f.m51915b(((Err) eVar).mo47463a())));
        }
    }

    /* renamed from: a */
    public final void mo47701a(Loading cVar) {
        if (cVar.mo47506k() == WikiAction.EXPAND) {
            ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).mo47763a(cVar.mo47505j(), true);
            return;
        }
        WikiDialogs cVar2 = this.f33579f;
        Fragment fragment = this.f33577d;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
        }
        cVar2.mo47794a(fragment.getContext(), WikiTips.f33454a.mo47514a(cVar.mo47506k()));
    }

    /* renamed from: a */
    public final void mo47700a(Err aVar) {
        if (C12477f.m51915b(aVar.mo47463a()) == 233525002) {
            WikiDialogs cVar = this.f33579f;
            Fragment fragment = this.f33577d;
            if (fragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
            }
            cVar.mo47797a(fragment.getContext(), (View.OnClickListener) null);
            return;
        }
        WikiDialogs cVar2 = this.f33579f;
        Fragment fragment2 = this.f33577d;
        if (fragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
        }
        cVar2.mo47805b(fragment2.getContext(), WikiTips.f33454a.mo47515a(aVar.mo47506k(), aVar.mo47463a()), 0);
    }

    /* renamed from: a */
    public final void mo47702a(Ok dVar) {
        if (dVar.mo47503i() != null) {
            WikiTreeView wikiTreeView = (WikiTreeView) mo47696a(R.id.wiki_tree_view);
            AbstractC12476b bVar = this.f33575b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            String focus = bVar.getFocus();
            if (focus == null) {
                focus = "";
            }
            wikiTreeView.setFocusToken(focus);
            ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).setData(dVar.mo47503i());
        }
        int i = C12576f.f33686a[dVar.mo47506k().ordinal()];
        if (i == 1) {
            ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).setItemFocus(dVar.mo47489b());
        } else if (i == 2 || i == 3) {
            ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).mo47761a(getFocusToken());
        } else if (i == 4) {
            WikiTreeView wikiTreeView2 = (WikiTreeView) mo47696a(R.id.wiki_tree_view);
            String d = dVar.mo47493d();
            AbstractC12476b bVar2 = this.f33575b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            TreeNode node = bVar2.getNode(dVar.mo47493d());
            wikiTreeView2.mo47762a(d, node != null ? node.title : null);
        }
        switch (C12576f.f33687b[dVar.mo47506k().ordinal()]) {
            case 1:
                ViewDelegate cVar = this.f33581i;
                if (cVar != null) {
                    cVar.mo47295a();
                    return;
                }
                return;
            case 2:
                ViewDelegate cVar2 = this.f33581i;
                if (cVar2 != null) {
                    cVar2.mo47298b(dVar.mo47489b());
                    return;
                }
                return;
            case 3:
                ViewDelegate cVar3 = this.f33581i;
                if (cVar3 != null) {
                    cVar3.mo47301d(dVar.mo47491c());
                    return;
                }
                return;
            case 4:
                ViewDelegate cVar4 = this.f33581i;
                if (cVar4 != null) {
                    cVar4.mo47297a(dVar.mo47499g(), dVar.mo47495e(), dVar.mo47501h());
                    return;
                }
                return;
            case 5:
                ViewDelegate cVar5 = this.f33581i;
                if (cVar5 != null) {
                    cVar5.mo47302e(dVar.mo47491c());
                    return;
                }
                return;
            case 6:
                ViewDelegate cVar6 = this.f33581i;
                if (cVar6 != null) {
                    cVar6.mo47299b(dVar.mo47499g(), dVar.mo47495e(), dVar.mo47501h());
                    return;
                }
                return;
            case 7:
                WikiDialogs cVar7 = this.f33579f;
                Fragment fragment = this.f33577d;
                if (fragment == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
                }
                cVar7.mo47796a(fragment.getContext(), WikiTips.f33454a.mo47516b(dVar.mo47506k()), new View$OnClickListenerC12547g(this, dVar));
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (android.text.TextUtils.equals(r1.mo47724a(), r4) == false) goto L_0x0040;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47706a(java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.mo47706a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo47707a(String str, String str2, ViewConfig bVar) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        if (!TextUtils.isEmpty(str)) {
            if (bVar != null) {
                this.f33576c = bVar;
                m52075c(str2);
            }
            AbstractC12476b bVar2 = this.f33575b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            ViewConfig bVar3 = this.f33576c;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
            }
            String str3 = "";
            if (bVar3.mo47738f() && str2 != null) {
                str3 = str2;
            }
            bVar2.setFocus(str3);
            AbstractC12476b bVar4 = this.f33575b;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            bVar4.load(str, str2, !m52076d(str2));
        }
    }

    /* renamed from: a */
    public final void mo47708a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).mo47765b(str, z);
    }

    /* renamed from: a */
    public final void mo47704a(C12478g gVar) {
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.expand(gVar.f33450l);
    }

    /* renamed from: a */
    public final void mo47705a(C12478g gVar, boolean z) {
        Fragment fragment = this.f33577d;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            WikiReportV2.m50905a(getSpaceId(), gVar.f33440b, Boolean.valueOf(gVar.mo47511a()), gVar.f33441c, C8275a.m34050a(gVar.f33442d));
            WikiDialogs cVar = this.f33579f;
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            cVar.mo47802a(activity, gVar, new C12546f(this, gVar, z), z);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m52074c();
    }

    public final String getFocusToken() {
        return ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).getFocusToken();
    }

    public final SpaceInfo getSpaceInfo() {
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return bVar.getSpaceInfo();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¨\u0006\u0011"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$bindListener$1", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeView$IListener;", "onExpandChange", "", "node", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/UITreeNode;", "isExpand", "", "onFocusChanged", "newFocus", "", "onItemClick", "onMenuItemClick", "menuId", "", "onSwipeChanged", "isSwipe", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$d */
    public static final class C12543d implements WikiTreeView.IListener {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33592a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$bindListener$1$onMenuItemClick$1", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$ItemMoreViewDelegate;", "onDel", "", "onDismiss", "onFavorite", "switchOn", "", "onMov", "onShortcutTo", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$d$a */
        public static final class C12544a implements WikiDialogs.ItemMoreViewDelegate {

            /* renamed from: a */
            final /* synthetic */ C12543d f33593a;

            /* renamed from: b */
            final /* synthetic */ C12478g f33594b;

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiDialogs.ItemMoreViewDelegate
            /* renamed from: d */
            public void mo47751d() {
                String str = this.f33594b.f33450l;
                Intrinsics.checkExpressionValueIsNotNull(str, "node.uid");
                ((WikiTreeView) this.f33593a.f33592a.mo47696a(R.id.wiki_tree_view)).mo47765b(str, false);
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiDialogs.ItemMoreViewDelegate
            /* renamed from: a */
            public void mo47747a() {
                WikiReportV2.m50921b("shortcut_to", "ccm_wiki_file_location_select_view", Boolean.valueOf(this.f33594b.mo47513c()), this.f33593a.f33592a.getSpaceId(), this.f33594b.f33440b, Boolean.valueOf(this.f33594b.mo47511a()), this.f33594b.f33441c, C8275a.m34050a(this.f33594b.f33442d));
                this.f33593a.f33592a.mo47714e(this.f33594b);
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiDialogs.ItemMoreViewDelegate
            /* renamed from: b */
            public void mo47749b() {
                WikiReportV2.m50921b("move_to", "ccm_wiki_file_location_select_view", Boolean.valueOf(this.f33594b.mo47513c()), this.f33593a.f33592a.getSpaceId(), this.f33594b.f33440b, Boolean.valueOf(this.f33594b.mo47511a()), this.f33594b.f33441c, C8275a.m34050a(this.f33594b.f33442d));
                this.f33593a.f33592a.mo47713d(this.f33594b);
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiDialogs.ItemMoreViewDelegate
            /* renamed from: c */
            public void mo47750c() {
                WikiReportV2.m50921b("delete", "ccm_wiki_delete_confirm_view", Boolean.valueOf(this.f33594b.mo47513c()), this.f33593a.f33592a.getSpaceId(), this.f33594b.f33440b, Boolean.valueOf(this.f33594b.mo47511a()), this.f33594b.f33441c, C8275a.m34050a(this.f33594b.f33442d));
                this.f33593a.f33592a.mo47712c(this.f33594b);
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiDialogs.ItemMoreViewDelegate
            /* renamed from: a */
            public void mo47748a(boolean z) {
                String str;
                if (z) {
                    str = "star_page";
                } else {
                    str = "unstar_page";
                }
                WikiReportV2.m50921b(str, "none", Boolean.valueOf(this.f33594b.mo47513c()), this.f33593a.f33592a.getSpaceId(), this.f33594b.f33440b, Boolean.valueOf(this.f33594b.mo47511a()), this.f33594b.f33441c, C8275a.m34050a(this.f33594b.f33442d));
                this.f33593a.f33592a.mo47711b(this.f33594b, z);
            }

            C12544a(C12543d dVar, C12478g gVar) {
                this.f33593a = dVar;
                this.f33594b = gVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12543d(WikiTreeCtrlView wikiTreeCtrlView) {
            this.f33592a = wikiTreeCtrlView;
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView.IListener
        /* renamed from: a */
        public void mo47745a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "newFocus");
            WikiTreeCtrlView.m52073c(this.f33592a).setFocus(str);
            ViewDelegate viewDelegate = this.f33592a.getViewDelegate();
            if (viewDelegate != null) {
                viewDelegate.mo47263a(str);
            }
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView.IListener
        /* renamed from: a */
        public void mo47742a(C12478g gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "node");
            if (WikiTreeCtrlView.m52071b(this.f33592a).mo47741i() != null) {
                WikiReportV2.m50906a("page", "ccm_docs_page_view", Boolean.valueOf(gVar.mo47513c()), this.f33592a.getSpaceId(), gVar.f33440b, Boolean.valueOf(gVar.mo47511a()), gVar.f33441c, C8275a.m34050a(gVar.f33442d));
            }
            ViewDelegate viewDelegate = this.f33592a.getViewDelegate();
            if (viewDelegate != null) {
                String str = gVar.f33440b;
                Intrinsics.checkExpressionValueIsNotNull(str, "node.wiki_token");
                viewDelegate.mo47300c(str);
            }
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView.IListener
        /* renamed from: b */
        public void mo47746b(C12478g gVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(gVar, "node");
            if (z) {
                String focusToken = ((WikiTreeView) this.f33592a.mo47696a(R.id.wiki_tree_view)).getFocusToken();
                String str = gVar.f33440b;
                Intrinsics.checkExpressionValueIsNotNull(str, "node.wiki_token");
                WikiReportV2.m50912a("swipe_page", focusToken, str, Integer.valueOf(gVar.f33442d), Integer.valueOf(gVar.f33451m), null, null, null, null, null, null, 2016, null);
                this.f33592a.mo47715f(gVar);
            }
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView.IListener
        /* renamed from: a */
        public void mo47743a(C12478g gVar, int i) {
            WikNodePerm wikNodePerm;
            Intrinsics.checkParameterIsNotNull(gVar, "node");
            TreeNode node = WikiTreeCtrlView.m52073c(this.f33592a).getNode(gVar.f33440b);
            if (node == null || (wikNodePerm = node.perm) == null) {
                wikNodePerm = WikNodePerm.forbid();
                wikNodePerm.can_star = true;
            }
            if (i == R.id.swipe_menu_add) {
                WikiReportV2.m50906a("add", "ccm_wiki_tree_add_view", Boolean.valueOf(gVar.mo47513c()), this.f33592a.getSpaceId(), gVar.f33440b, Boolean.valueOf(gVar.mo47511a()), gVar.f33441c, C8275a.m34050a(gVar.f33442d));
                this.f33592a.mo47705a(gVar, wikNodePerm.can_create);
            } else if (i == R.id.swipe_menu_more) {
                WikiReportV2.m50906a("more", "ccm_wiki_tree_more_view", Boolean.valueOf(gVar.mo47513c()), this.f33592a.getSpaceId(), gVar.f33440b, Boolean.valueOf(gVar.mo47511a()), gVar.f33441c, C8275a.m34050a(gVar.f33442d));
                WikiReportV2.m50920b(this.f33592a.getSpaceId(), gVar.f33440b, Boolean.valueOf(gVar.mo47511a()), gVar.f33441c, C8275a.m34050a(gVar.f33442d));
                WikiDialogs cVar = this.f33592a.f33579f;
                Context context = WikiTreeCtrlView.m52066a(this.f33592a).getContext();
                boolean isFavorite = WikiTreeCtrlView.m52073c(this.f33592a).isFavorite(gVar.f33440b);
                Intrinsics.checkExpressionValueIsNotNull(wikNodePerm, "wikiPerm");
                cVar.mo47799a(context, gVar, isFavorite, wikNodePerm, new C12544a(this, gVar));
            }
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeView.IListener
        /* renamed from: a */
        public void mo47744a(C12478g gVar, boolean z) {
            String str;
            Intrinsics.checkParameterIsNotNull(gVar, "node");
            String focusToken = ((WikiTreeView) this.f33592a.mo47696a(R.id.wiki_tree_view)).getFocusToken();
            String str2 = gVar.f33440b;
            Intrinsics.checkExpressionValueIsNotNull(str2, "node.wiki_token");
            WikiReportV2.m50912a("node_expand_change", focusToken, str2, Integer.valueOf(gVar.f33442d), Integer.valueOf(gVar.f33451m), null, null, null, null, null, null, 2016, null);
            if (WikiTreeCtrlView.m52071b(this.f33592a).mo47741i() != null) {
                if (z) {
                    str = "expand";
                } else {
                    str = "collapse";
                }
                WikiReportV2.m50906a(str, "none", Boolean.valueOf(gVar.mo47513c()), this.f33592a.getSpaceId(), gVar.f33440b, Boolean.valueOf(gVar.mo47511a()), gVar.f33441c, C8275a.m34050a(gVar.f33442d));
            }
            if (z) {
                this.f33592a.mo47704a(gVar);
            } else {
                this.f33592a.mo47710b(gVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$initView$1", "Lcom/bytedance/ee/bear/list/common/header/DriveUploadView$ViewDelegate;", "onUploadFinish", "", "onUploadStart", "onUploadSuccess", "fileToken", "", "nodeToken", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$l */
    public static final class C12552l implements DriveUploadView.AbstractC8225a {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33608a;

        @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a
        /* renamed from: c */
        public void mo32244c() {
            ViewParent viewParent;
            DriveUploadView driveUploadView = this.f33608a.f33578e;
            if (driveUploadView != null) {
                viewParent = driveUploadView.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent != null) {
                ((WikiTreeView) this.f33608a.mo47696a(R.id.wiki_tree_view)).mo47759a();
            }
        }

        @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a
        /* renamed from: b */
        public void mo32243b() {
            ViewParent viewParent;
            DriveUploadView driveUploadView = this.f33608a.f33578e;
            if (driveUploadView != null) {
                viewParent = driveUploadView.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent == null) {
                WikiTreeView wikiTreeView = (WikiTreeView) this.f33608a.mo47696a(R.id.wiki_tree_view);
                DriveUploadView driveUploadView2 = this.f33608a.f33578e;
                if (driveUploadView2 == null) {
                    Intrinsics.throwNpe();
                }
                wikiTreeView.mo47760a(driveUploadView2);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12552l(WikiTreeCtrlView wikiTreeCtrlView) {
            this.f33608a = wikiTreeCtrlView;
        }

        @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a
        /* renamed from: a */
        public void mo32242a(String str, String str2) {
            C12213f.m50868c(str2);
        }
    }

    /* renamed from: b */
    private final void m52072b() {
        ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).setListener(new C12543d(this));
    }

    /* renamed from: c */
    private final void m52074c() {
        C13479a.m54764b(this.f33574a, "onClear. ");
        this.f33579f.mo47804b();
        this.f33580h.mo237935a();
        DriveUploadView driveUploadView = this.f33578e;
        if (driveUploadView != null) {
            driveUploadView.mo32225a();
        }
        this.f33578e = null;
    }

    public final String getSpaceId() {
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        SpaceInfo spaceInfo = bVar.getSpaceInfo();
        if (spaceInfo != null) {
            return spaceInfo.space_id;
        }
        return null;
    }

    public final boolean getCanCreate() {
        boolean z;
        SpacePerm a;
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        if (C12459b.m51818b(bVar.getRootToken())) {
            return false;
        }
        AbstractC12476b bVar2 = this.f33575b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        C12504l workspace = bVar2.getWorkspace();
        if (workspace == null || (a = workspace.mo47601a()) == null) {
            z = false;
        } else {
            z = a.can_edit_first_level;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo47697a() {
        C12478g a;
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        String rootToken = bVar.getRootToken();
        if (rootToken != null && (a = ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).getWikiUIList().mo47592a(rootToken)) != null) {
            mo47705a(a, getCanCreate());
        }
    }

    public final void setViewDelegate(ViewDelegate cVar) {
        this.f33581i = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$bindView$1", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Result;", "onChanged", "", "result", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$e */
    public static final class C12545e implements AbstractC1178x<Result> {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33595a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12545e(WikiTreeCtrlView wikiTreeCtrlView) {
            this.f33595a = wikiTreeCtrlView;
        }

        /* renamed from: a */
        public void onChanged(Result eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "result");
            String str = this.f33595a.f33574a;
            C13479a.m54764b(str, "bindView, wikiUIList onChange, result: " + eVar);
            if (eVar.mo47506k() == WikiAction.INIT_LOAD) {
                ((WikiEmptyView) this.f33595a.mo47696a(R.id.wiki_empty_view)).mo47689a(eVar);
                if (eVar instanceof Ok) {
                    this.f33595a.mo47702a((Ok) eVar);
                }
                this.f33595a.mo47703a(eVar);
            } else if (eVar.mo47506k() == WikiAction.PUSH_DES) {
                ((WikiEmptyView) this.f33595a.mo47696a(R.id.wiki_empty_view)).mo47689a(eVar);
                ViewDelegate viewDelegate = this.f33595a.getViewDelegate();
                if (viewDelegate != null) {
                    viewDelegate.mo47377b();
                }
            } else {
                this.f33595a.f33579f.mo47793a();
                ((WikiTreeView) this.f33595a.mo47696a(R.id.wiki_tree_view)).mo47763a(eVar.mo47505j(), false);
                if (eVar instanceof Loading) {
                    this.f33595a.mo47701a((Loading) eVar);
                } else if (eVar instanceof Err) {
                    this.f33595a.mo47700a((Err) eVar);
                } else if (eVar instanceof Ok) {
                    if (eVar.mo47506k() != WikiAction.SHORTCUT) {
                        this.f33595a.f33579f.mo47795a(WikiTreeCtrlView.m52066a(this.f33595a).getContext(), WikiTips.f33454a.mo47516b(eVar.mo47506k()), 0);
                    }
                    this.f33595a.mo47702a((Ok) eVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$k */
    public static final class C12551k<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33607a;

        C12551k(WikiTreeCtrlView wikiTreeCtrlView) {
            this.f33607a = wikiTreeCtrlView;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f33607a.f33574a, "requestNodePerm fail. ", th);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Fragment m52066a(WikiTreeCtrlView wikiTreeCtrlView) {
        Fragment fragment = wikiTreeCtrlView.f33577d;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
        }
        return fragment;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewConfig m52071b(WikiTreeCtrlView wikiTreeCtrlView) {
        ViewConfig bVar = wikiTreeCtrlView.f33576c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        return bVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ AbstractC12476b m52073c(WikiTreeCtrlView wikiTreeCtrlView) {
        AbstractC12476b bVar = wikiTreeCtrlView.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$g */
    public static final class View$OnClickListenerC12547g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33599a;

        /* renamed from: b */
        final /* synthetic */ Ok f33600b;

        View$OnClickListenerC12547g(WikiTreeCtrlView wikiTreeCtrlView, Ok dVar) {
            this.f33599a = wikiTreeCtrlView;
            this.f33600b = dVar;
        }

        public final void onClick(View view) {
            ViewDelegate viewDelegate = this.f33599a.getViewDelegate();
            if (viewDelegate != null) {
                viewDelegate.mo47296a(this.f33600b.mo47499g(), this.f33600b.mo47497f());
            }
        }
    }

    /* renamed from: a */
    private final void m52068a(LifecycleOwner lifecycleOwner) {
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.getWikiUIList().mo5923a(lifecycleOwner, new C12545e(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$i */
    public static final class View$OnClickListenerC12549i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33603a;

        /* renamed from: b */
        final /* synthetic */ C12478g f33604b;

        View$OnClickListenerC12549i(WikiTreeCtrlView wikiTreeCtrlView, C12478g gVar) {
            this.f33603a = wikiTreeCtrlView;
            this.f33604b = gVar;
        }

        public final void onClick(View view) {
            WikiReportV2.m50925c("cancel", "none", Boolean.valueOf(this.f33604b.mo47513c()), this.f33603a.getSpaceId(), this.f33604b.f33440b, Boolean.valueOf(this.f33604b.mo47511a()), this.f33604b.f33441c, C8275a.m34050a(this.f33604b.f33442d));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "wikiPerm", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikNodePerm;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$j */
    public static final class C12550j<T> implements Consumer<WikNodePerm> {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33605a;

        /* renamed from: b */
        final /* synthetic */ C12478g f33606b;

        C12550j(WikiTreeCtrlView wikiTreeCtrlView, C12478g gVar) {
            this.f33605a = wikiTreeCtrlView;
            this.f33606b = gVar;
        }

        /* renamed from: a */
        public final void accept(WikNodePerm wikNodePerm) {
            String str = this.f33605a.f33574a;
            C13479a.m54772d(str, "requestNodePerm. wikiPerm: " + wikNodePerm);
            WikiDialogs cVar = this.f33605a.f33579f;
            C12478g gVar = this.f33606b;
            Intrinsics.checkExpressionValueIsNotNull(wikNodePerm, "wikiPerm");
            cVar.mo47806b(gVar, wikNodePerm);
            this.f33605a.f33579f.mo47803a(this.f33606b, wikNodePerm);
        }
    }

    /* renamed from: d */
    private final boolean m52076d(String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            ViewConfig bVar = this.f33576c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
            }
            if (TextUtils.equals(str2, bVar.mo47724a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo47710b(C12478g gVar) {
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.collapse(gVar.f33450l);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$h */
    public static final class View$OnClickListenerC12548h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33601a;

        /* renamed from: b */
        final /* synthetic */ C12478g f33602b;

        View$OnClickListenerC12548h(WikiTreeCtrlView wikiTreeCtrlView, C12478g gVar) {
            this.f33601a = wikiTreeCtrlView;
            this.f33602b = gVar;
        }

        public final void onClick(View view) {
            String focusToken = ((WikiTreeView) this.f33601a.mo47696a(R.id.wiki_tree_view)).getFocusToken();
            String str = this.f33602b.f33440b;
            Intrinsics.checkExpressionValueIsNotNull(str, "target.wiki_token");
            WikiReportV2.m50912a("confirm_delete", focusToken, str, Integer.valueOf(this.f33602b.f33442d), Integer.valueOf(this.f33602b.f33451m), null, null, null, null, null, null, 2016, null);
            WikiReportV2.m50925c("delete", "none", Boolean.valueOf(this.f33602b.mo47513c()), this.f33601a.getSpaceId(), this.f33602b.f33440b, Boolean.valueOf(this.f33602b.mo47511a()), this.f33602b.f33441c, C8275a.m34050a(this.f33602b.f33442d));
            WikiTreeCtrlView.m52073c(this.f33601a).remove(this.f33602b.f33440b);
        }
    }

    /* renamed from: b */
    public final List<Integer> mo47709b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        ArrayList arrayList = new ArrayList(3);
        int[] iArr = {0, 0};
        RecyclerView.ViewHolder a = ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).mo47758a(((WikiTreeView) mo47696a(R.id.wiki_tree_view)).getWikiUIList().mo47597c(str));
        if (a == null) {
            C13479a.m54758a(this.f33574a, "find aim view holden by wikiToken failed, holder == null");
            return arrayList;
        }
        a.itemView.getLocationOnScreen(iArr);
        View view = a.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.itemView");
        int measuredHeight = view.getMeasuredHeight();
        if (iArr[1] > 0) {
            arrayList.add(Integer.valueOf(iArr[0]));
            arrayList.add(Integer.valueOf(iArr[1]));
            arrayList.add(Integer.valueOf(measuredHeight));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo47712c(C12478g gVar) {
        String focusToken = ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).getFocusToken();
        String str = gVar.f33440b;
        Intrinsics.checkExpressionValueIsNotNull(str, "target.wiki_token");
        WikiReportV2.m50912a("click_delete_in_pages", focusToken, str, Integer.valueOf(gVar.f33442d), Integer.valueOf(gVar.f33451m), null, null, null, null, null, null, 2016, null);
        WikiReportV2.m50924c(getSpaceId(), gVar.f33440b, Boolean.valueOf(gVar.mo47511a()), gVar.f33441c, C8275a.m34050a(gVar.f33442d));
        WikiDialogs cVar = this.f33579f;
        Fragment fragment = this.f33577d;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
        }
        cVar.mo47801a(fragment.getContext(), gVar.mo47511a(), new View$OnClickListenerC12548h(this, gVar), new View$OnClickListenerC12549i(this, gVar));
    }

    /* renamed from: d */
    public final void mo47713d(C12478g gVar) {
        WikNodePerm wikNodePerm;
        String focusToken = ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).getFocusToken();
        String str = gVar.f33440b;
        Intrinsics.checkExpressionValueIsNotNull(str, "target.wiki_token");
        WikiReportV2.m50912a("click_move", focusToken, str, Integer.valueOf(gVar.f33442d), Integer.valueOf(gVar.f33451m), null, null, null, null, null, null, 2016, null);
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        TreeNode node = bVar.getNode(gVar.f33440b);
        String str2 = null;
        if (node != null) {
            wikNodePerm = node.perm;
        } else {
            wikNodePerm = null;
        }
        if (wikNodePerm == null) {
            C13479a.m54764b(this.f33574a, "doMoveTo, perm not found. return. ");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("srcIsLock", wikNodePerm.is_locked ? 1 : 0);
        AbstractC12476b bVar2 = this.f33575b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        TreeNode node2 = bVar2.getNode(gVar.f33440b);
        if (node2 != null) {
            str2 = node2.parent_wiki_token;
        }
        bundle.putString("src_parent_token", str2);
        C12432c.m51713a(gVar.f33440b, gVar.f33442d, 2, 1024, bundle);
    }

    /* renamed from: e */
    public final void mo47714e(C12478g gVar) {
        String str;
        String focusToken = ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).getFocusToken();
        String str2 = gVar.f33440b;
        Intrinsics.checkExpressionValueIsNotNull(str2, "target.wiki_token");
        Integer valueOf = Integer.valueOf(gVar.f33442d);
        Integer valueOf2 = Integer.valueOf(gVar.f33451m);
        if (gVar.mo47511a()) {
            str = "shortcut";
        } else {
            str = "original";
        }
        WikiReportV2.m50912a("shortcut_to", focusToken, str2, valueOf, valueOf2, null, null, str, null, null, null, 1888, null);
        C12432c.m51713a(gVar.f33440b, gVar.f33442d, 3, 1025, null);
    }

    /* renamed from: f */
    public final void mo47715f(C12478g gVar) {
        AbstractC12476b bVar = this.f33575b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        TreeNode node = bVar.getNode(gVar.f33440b);
        if (node != null && node.perm == null) {
            C68289a aVar = this.f33580h;
            AbstractC12476b bVar2 = this.f33575b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            aVar.mo237937a(bVar2.requestNodePerm(gVar.f33440b).mo237985a(C11678b.m48481e()).mo238001b(new C12550j(this, gVar), new C12551k(this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$doInsert$1$1", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$ViewDelegate;", "onSelected", "", "indexId", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView$f */
    public static final class C12546f implements WikiCreateSelectPanelDialog.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiTreeCtrlView f33596a;

        /* renamed from: b */
        final /* synthetic */ C12478g f33597b;

        /* renamed from: c */
        final /* synthetic */ boolean f33598c;

        @Override // com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectPanelDialog.ViewDelegate
        public void onSelected(int i) {
            SelectIndex a = SelectIndex.Companion.mo46850a(i);
            int documentType = a.getDocumentType();
            String focusToken = ((WikiTreeView) this.f33596a.mo47696a(R.id.wiki_tree_view)).getFocusToken();
            String str = this.f33597b.f33440b;
            Intrinsics.checkExpressionValueIsNotNull(str, "target.wiki_token");
            WikiReportV2.m50912a("create_new_from_pages", focusToken, str, Integer.valueOf(documentType), Integer.valueOf(this.f33597b.f33451m), null, null, null, null, null, null, 2016, null);
            WikiReportV2.m50914a(WikiReportV2.Utils.m50929a(i), "ccm_docs_page_view", "none", C8275a.m34050a(documentType), Boolean.valueOf(this.f33597b.mo47513c()), this.f33596a.getSpaceId(), this.f33597b.f33440b, Boolean.valueOf(this.f33597b.mo47511a()), this.f33597b.f33441c, C8275a.m34050a(this.f33597b.f33442d));
            String str2 = this.f33597b.f33450l;
            Intrinsics.checkExpressionValueIsNotNull(str2, "target.uid");
            ((WikiTreeView) this.f33596a.mo47696a(R.id.wiki_tree_view)).mo47765b(str2, false);
            if (documentType != 12) {
                WikiTreeCtrlView.m52073c(this.f33596a).insert(this.f33597b.f33440b, documentType, true, this.f33597b.f33450l);
            } else if (a == SelectIndex.MEDIA) {
                ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19662b(this.f33597b.f33440b, "wiki", new Bundle(), -1);
            } else if (a == SelectIndex.FILE) {
                ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19654a(this.f33597b.f33440b, "wiki", new Bundle(), -1);
            }
        }

        C12546f(WikiTreeCtrlView wikiTreeCtrlView, C12478g gVar, boolean z) {
            this.f33596a = wikiTreeCtrlView;
            this.f33597b = gVar;
            this.f33598c = z;
        }
    }

    /* renamed from: c */
    private final void m52075c(String str) {
        String str2 = this.f33574a;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        ViewConfig bVar = this.f33576c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        sb.append(bVar.mo47740h());
        this.f33574a = sb.toString();
        WikiTreeView wikiTreeView = (WikiTreeView) mo47696a(R.id.wiki_tree_view);
        ViewConfig bVar2 = this.f33576c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        wikiTreeView.setDisableToken(bVar2.mo47724a());
        WikiTreeView wikiTreeView2 = (WikiTreeView) mo47696a(R.id.wiki_tree_view);
        ViewConfig bVar3 = this.f33576c;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        wikiTreeView2.setEnableRootClick(bVar3.mo47730b());
        WikiTreeView wikiTreeView3 = (WikiTreeView) mo47696a(R.id.wiki_tree_view);
        ViewConfig bVar4 = this.f33576c;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        wikiTreeView3.setEnableSwipeMenu(bVar4.mo47735d());
        AbstractC12476b bVar5 = this.f33575b;
        if (bVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ViewConfig bVar6 = this.f33576c;
        if (bVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        if (!bVar6.mo47738f() || str == null) {
            str = "";
        }
        bVar5.setFocus(str);
        AbstractC12476b bVar7 = this.f33575b;
        if (bVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ViewConfig bVar8 = this.f33576c;
        if (bVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        bVar7.setFavoriteEnable(bVar8.mo47733c());
        AbstractC12476b bVar9 = this.f33575b;
        if (bVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ViewConfig bVar10 = this.f33576c;
        if (bVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        bVar9.setPushEnable(bVar10.mo47737e());
        AbstractC12476b bVar11 = this.f33575b;
        if (bVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ViewConfig bVar12 = this.f33576c;
        if (bVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        bVar11.setDataFilter(bVar12.mo47739g());
        AbstractC12476b bVar13 = this.f33575b;
        if (bVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ViewConfig bVar14 = this.f33576c;
        if (bVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        bVar13.setTagSuffix(bVar14.mo47740h());
        WikiEmptyView.m52057a((WikiEmptyView) mo47696a(R.id.wiki_empty_view), (WikiTreeView) mo47696a(R.id.wiki_tree_view), null, 2, null);
        ViewConfig bVar15 = this.f33576c;
        if (bVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewConfig");
        }
        if (bVar15.mo47735d()) {
            DriveUploadView driveUploadView = new DriveUploadView(getContext());
            this.f33578e = driveUploadView;
            if (driveUploadView != null) {
                driveUploadView.setAboveLineVisible(false);
            }
            DriveUploadView driveUploadView2 = this.f33578e;
            if (driveUploadView2 != null) {
                driveUploadView2.setViewDelegate(new C12552l(this));
            }
            DriveUploadView driveUploadView3 = this.f33578e;
            if (driveUploadView3 != null) {
                String spaceId = getSpaceId();
                if (spaceId == null) {
                    spaceId = "none";
                }
                driveUploadView3.mo32228a("all_files_token", "wiki", spaceId);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiTreeCtrlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.wiki_tree_ctrl_view, this);
    }

    /* renamed from: b */
    public final void mo47711b(C12478g gVar, boolean z) {
        String str;
        if (z) {
            str = "file_star";
        } else {
            str = "file_unstar";
        }
        String focusToken = ((WikiTreeView) mo47696a(R.id.wiki_tree_view)).getFocusToken();
        String str2 = gVar.f33440b;
        Intrinsics.checkExpressionValueIsNotNull(str2, "target.wiki_token");
        WikiReportV2.m50912a(str, focusToken, str2, Integer.valueOf(gVar.f33442d), Integer.valueOf(gVar.f33451m), null, null, null, null, null, null, 2016, null);
        if (z) {
            AbstractC12476b bVar = this.f33575b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            bVar.favorite(gVar.f33440b);
            return;
        }
        AbstractC12476b bVar2 = this.f33575b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar2.unfavorite(gVar.f33440b);
    }

    /* renamed from: a */
    public final void mo47698a(int i, int i2, Intent intent) {
        String[] b;
        String str = this.f33574a;
        C13479a.m54764b(str, "onActivityResult. requestCode: " + i + ", resultCode: " + i2);
        if (i2 != -1) {
            return;
        }
        if (i == 1024) {
            String[] a = C12432c.m51718a(intent);
            if (a != null) {
                String str2 = a[0];
                AbstractC12476b bVar = this.f33575b;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                }
                boolean isContainInParent = bVar.isContainInParent(getFocusToken(), str2);
                AbstractC12476b bVar2 = this.f33575b;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                }
                bVar2.moveTo(str2, a[1], a[2], isContainInParent, getFocusToken());
            }
        } else if (i == 1025 && (b = C12432c.m51719b(intent)) != null) {
            AbstractC12476b bVar3 = this.f33575b;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            bVar3.shortcutTo(b[0], b[1], b[2]);
        }
    }

    /* renamed from: a */
    private final void m52067a(Fragment fragment, String str, ViewConfig bVar, ViewModelStoreOwner viewModelStoreOwner) {
        C13479a.m54764b(this.f33574a, "doInit. ");
        this.f33577d = fragment;
        Companion aVar = f33573g;
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = fragment;
        }
        this.f33575b = aVar.mo47723a(viewModelStoreOwner);
        this.f33576c = bVar;
        m52075c(str);
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        m52068a(viewLifecycleOwner);
        m52072b();
        String str2 = this.f33574a;
        StringBuilder sb = new StringBuilder();
        sb.append("doInit, init finish, viewModel@");
        AbstractC12476b bVar2 = this.f33575b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        sb.append(bVar2.hashCode());
        C13479a.m54764b(str2, sb.toString());
    }

    /* renamed from: a */
    public static /* synthetic */ void m52070a(WikiTreeCtrlView wikiTreeCtrlView, String str, String str2, ViewConfig bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            bVar = null;
        }
        wikiTreeCtrlView.mo47707a(str, str2, bVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m52069a(WikiTreeCtrlView wikiTreeCtrlView, Fragment fragment, String str, String str2, ViewConfig bVar, ViewModelStoreOwner viewModelStoreOwner, int i, Object obj) {
        if ((i & 8) != 0) {
            bVar = new ViewConfig();
        }
        if ((i & 16) != 0) {
            viewModelStoreOwner = null;
        }
        wikiTreeCtrlView.mo47699a(fragment, str, str2, bVar, viewModelStoreOwner);
    }
}
