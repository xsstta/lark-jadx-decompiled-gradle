package com.ss.android.lark.search.redesign;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.search.feedback.v1.SearchResult;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.bytedance.lark.pb.search.v1.Scene;
import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.urecommend.SectionEntityType;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.search.impl.func.pick.chatpick.PickChatLauncher;
import com.ss.android.lark.search.impl.func.pick.chatterpick.C53667b;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53636d;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import com.ss.android.lark.search.impl.hitpoint.onscreen.OnScreenItem;
import com.ss.android.lark.search.impl.hitpoint.onscreen.OnScreenReporter;
import com.ss.android.lark.search.p2584b.C53287b;
import com.ss.android.lark.search.redesign.click.handler.HistoryProvider;
import com.ss.android.lark.search.redesign.click.handler.IContextProvider;
import com.ss.android.lark.search.redesign.click.handler.SearchItemClickHandler;
import com.ss.android.lark.search.redesign.click.report.SendSearchResultClickReporter;
import com.ss.android.lark.search.redesign.click.report.SubPositionCalculator;
import com.ss.android.lark.search.redesign.dto.TabInfo;
import com.ss.android.lark.search.redesign.viewmodel.BaseSearchTabFragmentViewModel;
import com.ss.android.lark.search.redesign.viewmodel.SearchFragmentViewModel;
import com.ss.android.lark.search.redesign.viewmodel.TabType;
import com.ss.android.lark.search.service.compatible.SearchLifecycleObserver;
import com.ss.android.lark.search.service.recommend.CommonRecommendPuller;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchActionRecommend;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCardInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMoreInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo;
import com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller;
import com.ss.android.lark.searchcommon.reporter.NewOnScreenItem;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.reporter.SearchOnScreenReporter;
import com.ss.android.lark.searchcommon.reporter.SearchTimeReporter;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.utils.ImprId;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.searchcommon.utils.SessionManager;
import com.ss.android.lark.searchcommon.view.SearchCardViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.binder.ActionRecommendBinder;
import com.ss.android.lark.searchcommon.view.binder.CardAdapter;
import com.ss.android.lark.searchcommon.view.binder.OnHistoryTagClickListener;
import com.ss.android.lark.searchcommon.view.feedback.DialogC54011a;
import com.ss.android.lark.searchcommon.view.feedback.FeedBackView;
import com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView;
import com.ss.android.lark.searchcommon.view.recommend.IOnClearHistoryListener;
import com.ss.android.lark.searchcommon.view.recommend.IOnMoreClickListener;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vesdk.C64034n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 Ó\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004Ó\u0001Ô\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0001\u001a\u00020[2\u0007\u0010\u0001\u001a\u00020[H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001b\u0010\u0001\u001a\u00030\u00012\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0017J\t\u0010\u0001\u001a\u00020\u0011H\u0016J!\u0010\u0001\u001a\u00030\u00012\u0015\u0010\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00010\u00010%H\u0002J!\u0010\u0001\u001a\u00030\u00012\u0015\u0010\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00010\u00010%H\u0016J\u0014\u0010\u0001\u001a\u00020\u00112\t\u0010\u0001\u001a\u0004\u0018\u00010&H\u0016J!\u0010\u0001\u001a\u00030\u00012\u0015\u0010\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00010\u00010%H\u0016J\u0015\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020\u0011H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020[H\u0017J\t\u0010\u0001\u001a\u00020[H\u0017J\t\u0010\u0001\u001a\u00020\u0011H\u0017J\t\u0010\u0001\u001a\u00020\u0011H\u0016J\u000b\u0010\u0001\u001a\u0004\u0018\u000104H\u0016J\f\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u000b\u0010\u0001\u001a\u0004\u0018\u000104H\u0016J\f\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0007\u0010\u0001\u001a\u000204J\n\u0010 \u0001\u001a\u00030\u0001H\u0002J\t\u0010¡\u0001\u001a\u00020\u0011H\u0016J\t\u0010¢\u0001\u001a\u00020\u0011H\u0016J\t\u0010£\u0001\u001a\u00020\u0011H\u0014J\u0016\u0010¤\u0001\u001a\u00030\u00012\n\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0016J.\u0010§\u0001\u001a\u0005\u0018\u00010¨\u00012\b\u0010©\u0001\u001a\u00030ª\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010¬\u00012\n\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0016J\n\u0010­\u0001\u001a\u00030\u0001H\u0016J\n\u0010®\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010¯\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010°\u0001\u001a\u00030\u0001H\u0016J\n\u0010±\u0001\u001a\u00030\u0001H\u0016J \u0010²\u0001\u001a\u00030\u00012\b\u0010³\u0001\u001a\u00030¨\u00012\n\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0016J\n\u0010´\u0001\u001a\u00030\u0001H\u0002J\t\u0010µ\u0001\u001a\u000204H\u0016J\u0010\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030·\u00010TH\u0016J\t\u0010¸\u0001\u001a\u00020\u0011H\u0016J\n\u0010¹\u0001\u001a\u00030º\u0001H\u0016J\n\u0010»\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010»\u0001\u001a\u00030\u00012\u0007\u0010¼\u0001\u001a\u000204H\u0016J\n\u0010½\u0001\u001a\u00030\u0001H\u0016J%\u0010¾\u0001\u001a\u00020\u00112\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010¿\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u00020[H\u0016J\t\u0010À\u0001\u001a\u00020\u0011H\u0016J\t\u0010Á\u0001\u001a\u00020\u0011H\u0016J\u0015\u0010Â\u0001\u001a\u00030\u00012\t\u0010Ã\u0001\u001a\u0004\u0018\u00010&H\u0004J\n\u0010Ä\u0001\u001a\u00030\u0001H\u0002J\b\u0010Å\u0001\u001a\u00030\u0001J\u0011\u0010Æ\u0001\u001a\u00030\u00012\u0007\u0010Ç\u0001\u001a\u00020\u0011J\"\u0010È\u0001\u001a\u00030\u00012\u000f\u0010É\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010\u00012\u0007\u0010Ë\u0001\u001a\u00020[J\"\u0010Ì\u0001\u001a\u00030\u00012\u000f\u0010É\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010\u00012\u0007\u0010Ë\u0001\u001a\u00020[J\u0012\u0010Í\u0001\u001a\u00020[2\u0007\u0010\u0001\u001a\u00020[H\u0016J\u0013\u0010Î\u0001\u001a\u00030Ï\u00012\u0007\u0010Ð\u0001\u001a\u000204H\u0016J\u0013\u0010Ñ\u0001\u001a\u00030\u00012\u0007\u0010Ò\u0001\u001a\u00020\u0011H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078DX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178DX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u000202X.¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u000104X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\u000e\u0010<\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020&0%X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u00020@X.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020FX.¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00106\"\u0004\bI\u00108R6\u0010J\u001a\u001e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020L0Kj\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020L`MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u000e\u0010R\u001a\u000204X.¢\u0006\u0002\n\u0000R \u0010S\u001a\b\u0012\u0004\u0012\u00020U0TX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u000e\u0010Z\u001a\u00020[X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020]X.¢\u0006\u0002\n\u0000R\u001c\u0010^\u001a\u0004\u0018\u00010_X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001a\u0010j\u001a\u00020kX.¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0011\u0010p\u001a\u00020q¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u001a\u0010t\u001a\u00020uX.¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001a\u0010z\u001a\u000202X.¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001c\u0010\u001a\u00020eX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010g\"\u0005\b\u0001\u0010i¨\u0006Õ\u0001"}, d2 = {"Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment;", "Lcom/ss/android/lark/search/redesign/BaseVMFragment;", "Lcom/ss/android/lark/search/redesign/click/report/SubPositionCalculator;", "Lcom/ss/android/lark/search/redesign/click/handler/HistoryProvider;", "Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "()V", "chatterBeanParser", "Lcom/ss/android/lark/search/impl/func/pick/parser/PickChatterBeanParser;", "getChatterBeanParser", "()Lcom/ss/android/lark/search/impl/func/pick/parser/PickChatterBeanParser;", "chatterBeanParser$delegate", "Lkotlin/Lazy;", "commonRecommendPuller", "Lcom/ss/android/lark/search/service/recommend/CommonRecommendPuller;", "defaultRecommendView", "Lcom/ss/android/lark/searchcommon/view/recommend/DefaultRecommendView;", "hasPulledRecommend", "", "getHasPulledRecommend", "()Z", "setHasPulledRecommend", "(Z)V", "imageDependency", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IImageDependency;", "getImageDependency", "()Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IImageDependency;", "imageDependency$delegate", "initSearch", "getInitSearch", "setInitSearch", "mBaseSearchTabFragmentViewModel", "Lcom/ss/android/lark/search/redesign/viewmodel/BaseSearchTabFragmentViewModel;", "getMBaseSearchTabFragmentViewModel", "()Lcom/ss/android/lark/search/redesign/viewmodel/BaseSearchTabFragmentViewModel;", "setMBaseSearchTabFragmentViewModel", "(Lcom/ss/android/lark/search/redesign/viewmodel/BaseSearchTabFragmentViewModel;)V", "mCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "getMCallback", "()Lcom/larksuite/framework/callback/IGetDataCallback;", "setMCallback", "(Lcom/larksuite/framework/callback/IGetDataCallback;)V", "mClickListenerImpl", "Lcom/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler;", "getMClickListenerImpl", "()Lcom/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler;", "setMClickListenerImpl", "(Lcom/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler;)V", "mDefaultViewContainer", "Landroid/widget/FrameLayout;", "mEntrySource", "", "getMEntrySource", "()Ljava/lang/String;", "setMEntrySource", "(Ljava/lang/String;)V", "mFilterStatusRptSnapshot", "getMFilterStatusRptSnapshot", "setMFilterStatusRptSnapshot", "mHasMore", "mHasShowedFeedback", "mInnerCallback", "mNewOnScreenReporter", "Lcom/ss/android/lark/searchcommon/reporter/SearchOnScreenReporter;", "getMNewOnScreenReporter", "()Lcom/ss/android/lark/searchcommon/reporter/SearchOnScreenReporter;", "setMNewOnScreenReporter", "(Lcom/ss/android/lark/searchcommon/reporter/SearchOnScreenReporter;)V", "mOnScreenReporter", "Lcom/ss/android/lark/search/impl/hitpoint/onscreen/OnScreenReporter;", "mQueryKey", "getMQueryKey", "setMQueryKey", "mReqIdTimeMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getMReqIdTimeMap", "()Ljava/util/HashMap;", "setMReqIdTimeMap", "(Ljava/util/HashMap;)V", "mRequestId", "mResults", "", "Lcom/bytedance/lark/pb/search/feedback/v1/SearchResult;", "getMResults", "()Ljava/util/List;", "setMResults", "(Ljava/util/List;)V", "mScrolledPageNumLimit", "", "mSearchFeedbackView", "Lcom/ss/android/lark/searchcommon/view/feedback/FeedBackView;", "mSearchFragmentViewModel", "Lcom/ss/android/lark/search/redesign/viewmodel/SearchFragmentViewModel;", "getMSearchFragmentViewModel", "()Lcom/ss/android/lark/search/redesign/viewmodel/SearchFragmentViewModel;", "setMSearchFragmentViewModel", "(Lcom/ss/android/lark/search/redesign/viewmodel/SearchFragmentViewModel;)V", "mSearchLifecycleObserver", "Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "getMSearchLifecycleObserver", "()Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "setMSearchLifecycleObserver", "(Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;)V", "mSearchResultView", "Lcom/ss/android/lark/searchcommon/view/SearchResultView;", "getMSearchResultView", "()Lcom/ss/android/lark/searchcommon/view/SearchResultView;", "setMSearchResultView", "(Lcom/ss/android/lark/searchcommon/view/SearchResultView;)V", "mSearchTimeReporter", "Lcom/ss/android/lark/searchcommon/reporter/SearchTimeReporter;", "getMSearchTimeReporter", "()Lcom/ss/android/lark/searchcommon/reporter/SearchTimeReporter;", "mTabInfo", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "getMTabInfo", "()Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "setMTabInfo", "(Lcom/ss/android/lark/search/redesign/dto/TabInfo;)V", "mTopSectionContainer", "getMTopSectionContainer", "()Landroid/widget/FrameLayout;", "setMTopSectionContainer", "(Landroid/widget/FrameLayout;)V", "recommendSearchLifecycleObserver", "getRecommendSearchLifecycleObserver", "setRecommendSearchLifecycleObserver", "absPosition", "position", "appendHistoryFilter", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "history", "attachInfoForReport", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "checkFilterUsable", "commonRecommend", "callback", "customRecommend", "customRecommendCanLoadMore", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "customRecommendLoadMore", "defaultMode", "init", "dismissFeedback", "emptyHintIv", "emptyHintTv", "enablePullCommonRecommend", "enablePullCustomRecommend", "filterStatusRpt", "getContextForClick", "Landroid/app/Activity;", "getEntrySource", "getHistory", "getQueryKey", "loadMore", "needEraseRecommendPadding", "needEraseResultPadding", "needShowDynamicSearchFeedback", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFeedbackDismiss", "onFeedbackPopUp", "onHistoryUpdate", "onPause", "onResume", "onViewCreated", "view", "popupFeedback", "recommendCacheKey", "recommendSectionList", "Lcom/ss/android/lark/pb/urecommend/SectionEntityType;", "recommendViewNeedHeader", "sceneType", "Lcom/bytedance/lark/pb/search/v1/Scene$Type;", "search", SearchIntents.EXTRA_QUERY, "searchMode", "selfRecommendClickHandler", "isSelected", "selfReportSearchRequest", "selfReportSearchTime", "sendSearchHitPoint", "response", "showClearSearchHistoryConfirmDialog", "showEmptyHintView", "showRecommendViewDivider", "show", "startChatPickerActivity", "pickedData", "Lcom/ss/android/lark/search/impl/func/pick/viewdata/BasePickViewData;", "requestId", "startPickChatterActivity", "subPagePosition", "transform2SearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "queryKey", "trySearchByFilter", "filterUsable", "Companion", "OnRecommendItemOnScreenListener", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.b */
public class BaseSearchTabFragment extends BaseVMFragment implements HistoryProvider, IContextProvider, SubPositionCalculator {

    /* renamed from: n */
    public static final Companion f132528n = new Companion(null);

    /* renamed from: A */
    private String f132529A = "";

    /* renamed from: B */
    private final SearchTimeReporter f132530B = new SearchTimeReporter("main");

    /* renamed from: C */
    private boolean f132531C;

    /* renamed from: D */
    private final Lazy f132532D = LazyKt.lazy(C53696c.INSTANCE);

    /* renamed from: E */
    private final Lazy f132533E = LazyKt.lazy(C53698e.INSTANCE);

    /* renamed from: F */
    private HashMap f132534F;

    /* renamed from: a */
    protected TabInfo f132535a;

    /* renamed from: b */
    public String f132536b;

    /* renamed from: c */
    public boolean f132537c;

    /* renamed from: d */
    protected BaseSearchTabFragmentViewModel f132538d;

    /* renamed from: e */
    protected FrameLayout f132539e;

    /* renamed from: f */
    protected SearchResultView f132540f;

    /* renamed from: g */
    public FrameLayout f132541g;

    /* renamed from: h */
    public OnScreenReporter f132542h;

    /* renamed from: i */
    protected SearchOnScreenReporter f132543i;

    /* renamed from: j */
    public int f132544j = 1;

    /* renamed from: k */
    public boolean f132545k;

    /* renamed from: l */
    public DefaultRecommendView f132546l;

    /* renamed from: m */
    public CommonRecommendPuller f132547m;

    /* renamed from: o */
    private SearchItemClickHandler f132548o;

    /* renamed from: p */
    private String f132549p = "";

    /* renamed from: q */
    private String f132550q = "tab";

    /* renamed from: r */
    private final IGetDataCallback<SearchResponse> f132551r = new C53699f(this);

    /* renamed from: s */
    private IGetDataCallback<SearchResponse> f132552s;

    /* renamed from: t */
    private SearchFragmentViewModel f132553t;

    /* renamed from: u */
    private FeedBackView f132554u;

    /* renamed from: v */
    private ISearchLifecycleObserver f132555v = new SearchLifecycleObserver(true);

    /* renamed from: w */
    private ISearchLifecycleObserver f132556w = new SearchLifecycleObserver(true);

    /* renamed from: x */
    private List<SearchResult> f132557x = new ArrayList();

    /* renamed from: y */
    private HashMap<String, Long> f132558y = new HashMap<>();

    /* renamed from: z */
    private boolean f132559z = true;

    /* renamed from: D */
    public String mo183118D() {
        return null;
    }

    /* renamed from: F */
    public boolean mo183120F() {
        return false;
    }

    /* renamed from: G */
    public boolean mo183121G() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo183123I() {
        return false;
    }

    /* renamed from: J */
    public void mo183124J() {
    }

    /* renamed from: K */
    public void mo183125K() {
    }

    /* renamed from: L */
    public boolean mo183126L() {
        return true;
    }

    /* renamed from: M */
    public boolean mo183127M() {
        return false;
    }

    /* renamed from: O */
    public boolean mo183129O() {
        return false;
    }

    /* renamed from: P */
    public boolean mo183130P() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final C53636d mo183132R() {
        return (C53636d) this.f132532D.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final ISearchModuleDependency.AbstractC53327m mo183133S() {
        return (ISearchModuleDependency.AbstractC53327m) this.f132533E.getValue();
    }

    @Override // com.ss.android.lark.search.redesign.click.report.SubPositionCalculator
    /* renamed from: a */
    public int mo183116a(int i) {
        return i;
    }

    /* renamed from: a */
    public String mo183078a() {
        return "";
    }

    /* renamed from: a */
    public void mo183136a(SearchInfoHistory searchInfoHistory) {
        Intrinsics.checkParameterIsNotNull(searchInfoHistory, "history");
    }

    /* renamed from: a */
    public boolean mo183140a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return false;
    }

    @Override // com.ss.android.lark.search.redesign.click.report.SubPositionCalculator
    /* renamed from: b */
    public int mo183117b(int i) {
        return i;
    }

    /* renamed from: b */
    public SearchInfoHistory mo183141b(SearchInfoHistory searchInfoHistory) {
        Intrinsics.checkParameterIsNotNull(searchInfoHistory, "history");
        return searchInfoHistory;
    }

    /* renamed from: b */
    public void mo183142b(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
    }

    /* renamed from: b */
    public boolean mo183146b(SearchResponse searchResponse) {
        return false;
    }

    /* renamed from: c */
    public void mo183147c(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
    }

    /* renamed from: e */
    public int mo183082e() {
        return R.drawable.illustration_placeholder_common_default;
    }

    /* renamed from: f */
    public int mo183083f() {
        return R.string.Lark_Search_UseKeyWordToSearch;
    }

    @Override // com.ss.android.lark.search.redesign.BaseVMFragment
    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132534F;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment$Companion;", "", "()V", "AVATAR_COUNT_IN_FILTER", "", "AVATAR_SIZE_IN_FILTER_DP", "", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment$OnRecommendItemOnScreenListener;", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "reporter", "Lcom/ss/android/lark/searchcommon/reporter/SearchOnScreenReporter;", "(Lcom/ss/android/lark/searchcommon/reporter/SearchOnScreenReporter;)V", "getReporter", "()Lcom/ss/android/lark/searchcommon/reporter/SearchOnScreenReporter;", "onScreen", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$b */
    public static final class OnRecommendItemOnScreenListener implements SearchResultViewAdapter.IOnItemOnScreenListener {

        /* renamed from: a */
        private final SearchOnScreenReporter f132560a;

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemOnScreenListener
        /* renamed from: a */
        public void mo183169a() {
            SearchResultViewAdapter.IOnItemOnScreenListener.C54037a.m209709a(this);
        }

        public OnRecommendItemOnScreenListener(SearchOnScreenReporter gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "reporter");
            this.f132560a = gVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemOnScreenListener
        /* renamed from: a */
        public void mo183170a(SearchBaseInfo searchBaseInfo, int i) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f132560a.mo183824a(new NewOnScreenItem(searchBaseInfo.getId(), searchBaseInfo.getResultTypeForReport(), searchBaseInfo.getTagForReport()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$2$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnResultScroll;", "onResultScrollScreen", "", "pageNum", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$l */
    public static final class C53713l implements SearchResultView.IOnResultScroll {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132583a;

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnResultScroll
        /* renamed from: a */
        public void mo182496a() {
            SearchResultView.IOnResultScroll.C53967a.m209313a(this);
        }

        C53713l(BaseSearchTabFragment bVar) {
            this.f132583a = bVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnResultScroll
        /* renamed from: a */
        public void mo182497a(int i) {
            if (this.f132583a.mo183123I() && i >= this.f132583a.f132544j && this.f132583a.mo183163u() && C53339b.m206446f() && !this.f132583a.f132545k) {
                this.f132583a.f132545k = true;
                this.f132583a.mo183122H();
            }
        }
    }

    @Override // com.ss.android.lark.search.redesign.click.report.SubPositionCalculator
    /* renamed from: A */
    public String mo183115A() {
        return this.f132550q;
    }

    /* renamed from: E */
    public final SearchTimeReporter mo183119E() {
        return this.f132530B;
    }

    /* renamed from: c */
    public Scene.Type mo183080c() {
        return Scene.Type.UNKNOWN;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final SearchItemClickHandler mo183151i() {
        return this.f132548o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo183152j() {
        return this.f132549p;
    }

    /* renamed from: k */
    public final String mo183153k() {
        return this.f132550q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final IGetDataCallback<SearchResponse> mo183154l() {
        return this.f132552s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final SearchFragmentViewModel mo183155m() {
        return this.f132553t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final ISearchLifecycleObserver mo183159q() {
        return this.f132556w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final List<SearchResult> mo183161s() {
        return this.f132557x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final HashMap<String, Long> mo183162t() {
        return this.f132558y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo183163u() {
        return this.f132559z;
    }

    /* renamed from: z */
    public final String mo183168z() {
        return this.f132549p;
    }

    /* renamed from: a */
    public void mo183139a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("search by filter, query length: ");
        sb.append(this.f132549p.length());
        sb.append(", ");
        sb.append("query pattern: ");
        sb.append(SearchCommonUtils.m209228a(this.f132549p));
        sb.append(", ");
        sb.append("from: ");
        TabInfo tabInfo = this.f132535a;
        if (tabInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        sb.append(tabInfo.reporterLocation());
        sb.append(", filterUsable: ");
        sb.append(z);
        sb.append('.');
        Log.m165389i("LarkSearch.Search.V2.BaseSearchTabFragment", sb.toString());
        if (z) {
            mo183164v();
        } else if (!StringsKt.isBlank(this.f132549p)) {
            mo183164v();
        } else {
            m207878a(this, false, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/search/impl/func/pick/parser/PickChatterBeanParser;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$c */
    static final class C53696c extends Lambda implements Function0<C53636d> {
        public static final C53696c INSTANCE = new C53696c();

        C53696c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C53636d invoke() {
            return new C53636d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$7$1", "Lcom/ss/android/lark/searchcommon/recommend/IRecommendPageDataPuller;", "canLoadMore", "", "loadData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "needHeader", "onLoadMore", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$g */
    public static final class C53702g implements IRecommendPageDataPuller {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132567a;

        @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
        /* renamed from: a */
        public boolean mo141032a() {
            return this.f132567a.mo183126L();
        }

        @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
        /* renamed from: b */
        public boolean mo141034b() {
            boolean z = false;
            if (this.f132567a.mo183081d()) {
                CommonRecommendPuller aVar = this.f132567a.f132547m;
                if (aVar != null) {
                    z = aVar.mo181927a();
                }
            } else if (this.f132567a.mo183127M()) {
                z = this.f132567a.mo183146b((SearchResponse) null);
            }
            Log.m165379d("LarkSearch.Search.V2.BaseSearchTabFragment", "canLoadMore: " + z);
            return z;
        }

        C53702g(BaseSearchTabFragment bVar) {
            this.f132567a = bVar;
        }

        @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
        /* renamed from: a */
        public void mo141031a(final IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            final C537031 r0 = new IGetDataCallback<List<? extends SearchBaseInfo>>(this) {
                /* class com.ss.android.lark.search.redesign.BaseSearchTabFragment.C53702g.C537031 */

                /* renamed from: a */
                final /* synthetic */ C53702g f132568a;

                /* renamed from: a */
                public void onSuccess(final List<? extends SearchBaseInfo> list) {
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.search.redesign.BaseSearchTabFragment.C53702g.C537031.RunnableC537041 */

                        /* renamed from: a */
                        final /* synthetic */ C537031 f132570a;

                        {
                            this.f132570a = r1;
                        }

                        public final void run() {
                            List list = list;
                            if (list == null || list.isEmpty()) {
                                BaseSearchTabFragment.m207879b(this.f132570a.f132568a.f132567a).removeView(this.f132570a.f132568a.f132567a.f132546l);
                                this.f132570a.f132568a.f132567a.mo183131Q();
                            }
                        }
                    });
                    iGetDataCallback.onSuccess(list);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.search.redesign.BaseSearchTabFragment.C53702g.C537031.RunnableC537052 */

                        /* renamed from: a */
                        final /* synthetic */ C537031 f132572a;

                        {
                            this.f132572a = r1;
                        }

                        public final void run() {
                            BaseSearchTabFragment.m207879b(this.f132572a.f132568a.f132567a).removeView(this.f132572a.f132568a.f132567a.f132546l);
                            this.f132572a.f132568a.f132567a.mo183131Q();
                        }
                    });
                    iGetDataCallback.onError(errorResult);
                }

                {
                    this.f132568a = r1;
                }
            };
            if (this.f132567a.mo183081d()) {
                this.f132567a.mo183149d(new IGetDataCallback<List<? extends SearchBaseInfo>>(this) {
                    /* class com.ss.android.lark.search.redesign.BaseSearchTabFragment.C53702g.C537062 */

                    /* renamed from: a */
                    final /* synthetic */ C53702g f132573a;

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        r0.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(List<? extends SearchBaseInfo> list) {
                        ArrayList arrayList;
                        SearchCommonUtils bVar = SearchCommonUtils.f133387a;
                        String a = this.f132573a.f132567a.mo183078a();
                        if (list != null) {
                            arrayList = list;
                        } else {
                            arrayList = new ArrayList();
                        }
                        bVar.mo184561a(a, arrayList);
                        if (list != null) {
                            for (T t : list) {
                                if (t instanceof SearchCardInfo) {
                                    t.setLocation(this.f132573a.f132567a.mo183150h().reporterLocation());
                                }
                            }
                        }
                        r0.onSuccess(list);
                    }

                    {
                        this.f132573a = r1;
                    }
                });
            } else if (this.f132567a.mo183127M()) {
                this.f132567a.mo183142b(r0);
            }
        }

        @Override // com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller
        /* renamed from: b */
        public void mo141033b(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            Log.m165379d("LarkSearch.Search.V2.BaseSearchTabFragment", "onLoadMore");
            if (this.f132567a.mo183081d()) {
                this.f132567a.mo183149d(iGetDataCallback);
            } else if (this.f132567a.mo183127M()) {
                this.f132567a.mo183147c(iGetDataCallback);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$7$3", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnClearHistoryListener;", "onClearHistory", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$i */
    public static final class C53710i implements IOnClearHistoryListener {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132580a;

        @Override // com.ss.android.lark.searchcommon.view.recommend.IOnClearHistoryListener
        /* renamed from: a */
        public void mo183179a() {
            this.f132580a.mo183128N();
        }

        C53710i(BaseSearchTabFragment bVar) {
            this.f132580a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$2$onLoadMore$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnLoadMore;", "canLoadMore", "", "onLoadMore", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$m */
    public static final class C53714m implements SearchResultView.IOnLoadMore {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132584a;

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnLoadMore
        /* renamed from: a */
        public boolean mo182494a() {
            return this.f132584a.f132537c;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnLoadMore
        /* renamed from: b */
        public void mo182495b() {
            this.f132584a.mo183166x();
        }

        C53714m(BaseSearchTabFragment bVar) {
            this.f132584a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$3", "Lcom/ss/android/lark/searchcommon/view/feedback/FeedBackView$IOnInteraction;", "onDismiss", "", "onPopUp", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$p */
    public static final class C53717p implements FeedBackView.IOnInteraction {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132588a;

        @Override // com.ss.android.lark.searchcommon.view.feedback.FeedBackView.IOnInteraction
        /* renamed from: a */
        public void mo183182a() {
            this.f132588a.mo183124J();
        }

        @Override // com.ss.android.lark.searchcommon.view.feedback.FeedBackView.IOnInteraction
        /* renamed from: b */
        public void mo183183b() {
            this.f132588a.mo183125K();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53717p(BaseSearchTabFragment bVar) {
            this.f132588a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$4", "Lcom/ss/android/lark/searchcommon/view/feedback/SearchFeedbackDialog$IFeedbackArgs;", "getIntegrationSearchRequest", "Lcom/bytedance/lark/pb/search/v1/IntegrationSearchRequest;", "getResults", "", "Lcom/bytedance/lark/pb/search/feedback/v1/SearchResult;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$q */
    public static final class C53718q implements DialogC54011a.AbstractC54024b {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132589a;

        @Override // com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.AbstractC54024b
        /* renamed from: b */
        public List<SearchResult> mo183185b() {
            return this.f132589a.mo183161s();
        }

        @Override // com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.AbstractC54024b
        /* renamed from: a */
        public IntegrationSearchRequest mo183184a() {
            IntegrationSearchRequest a = new IntegrationSearchRequest.C18831a().mo64662a(this.f132589a.mo183152j()).mo64664b((Integer) 15).mo64660a(this.f132589a.mo183080c()).mo64665b(this.f132589a.mo183150h().getSessionSnapshot()).mo64667d(this.f132589a.mo183150h().imprId()).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "IntegrationSearchRequest…                 .build()");
            return a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53718q(BaseSearchTabFragment bVar) {
            this.f132589a = bVar;
        }
    }

    @Override // com.ss.android.lark.search.redesign.click.handler.IContextProvider
    /* renamed from: C */
    public Activity mo183099C() {
        return getActivity();
    }

    /* renamed from: d */
    public boolean mo183081d() {
        return C53339b.m206448h();
    }

    /* renamed from: w */
    public boolean mo183165w() {
        this.f132529A = mo183118D();
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$d */
    public static final class RunnableC53697d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132561a;

        RunnableC53697d(BaseSearchTabFragment bVar) {
            this.f132561a = bVar;
        }

        public final void run() {
            this.f132561a.mo183158p().setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IImageDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$e */
    static final class C53698e extends Lambda implements Function0<ISearchModuleDependency.AbstractC53327m> {
        public static final C53698e INSTANCE = new C53698e();

        C53698e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ISearchModuleDependency.AbstractC53327m invoke() {
            ISearchModuleDependency a = C53258a.m205939a();
            Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
            return a.mo181758g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$2$onScreenListener$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "hasScrolled", "", "onScreen", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$n */
    public static final class C53715n implements SearchResultViewAdapter.IOnItemOnScreenListener {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132585a;

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemOnScreenListener
        /* renamed from: a */
        public void mo183169a() {
            BaseSearchTabFragment.m207877a(this.f132585a).mo182045a();
        }

        C53715n(BaseSearchTabFragment bVar) {
            this.f132585a = bVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemOnScreenListener
        /* renamed from: a */
        public void mo183170a(SearchBaseInfo searchBaseInfo, int i) {
            String str;
            String str2;
            String str3;
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String id = searchBaseInfo.getId();
            if (searchBaseInfo.getType() == 1 || searchBaseInfo.getType() == 15 || searchBaseInfo.getType() == 6) {
                id = C57859q.m224565a(id);
            }
            OnScreenReporter a = BaseSearchTabFragment.m207877a(this.f132585a);
            Scene.Type scene = searchBaseInfo.getScene();
            String imprId = searchBaseInfo.getImprId();
            if (imprId != null) {
                str = imprId;
            } else {
                str = "";
            }
            String session = searchBaseInfo.getSession();
            if (session != null) {
                str2 = session;
            } else {
                str2 = "";
            }
            String requestId = searchBaseInfo.getRequestId();
            if (requestId != null) {
                str3 = requestId;
            } else {
                str3 = "";
            }
            a.mo182046a(new OnScreenItem(scene, str, str2, str3, id, SearchCommonUtils.m209226a(searchBaseInfo.getType()), Integer.valueOf(this.f132585a.mo183116a(i) + 1), Integer.valueOf(this.f132585a.mo183117b(i) + 1), this.f132585a.mo183150h().getMapp_id()));
            this.f132585a.mo183160r().mo183824a(new NewOnScreenItem(searchBaseInfo.getId(), searchBaseInfo.getResultTypeForReport(), searchBaseInfo.getTagForReport()));
        }
    }

    /* renamed from: H */
    public final void mo183122H() {
        FeedBackView feedBackView = this.f132554u;
        if (feedBackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchFeedbackView");
        }
        feedBackView.mo184902a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final TabInfo mo183150h() {
        TabInfo tabInfo = this.f132535a;
        if (tabInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        return tabInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final BaseSearchTabFragmentViewModel mo183156n() {
        BaseSearchTabFragmentViewModel aVar = this.f132538d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBaseSearchTabFragmentViewModel");
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final FrameLayout mo183157o() {
        FrameLayout frameLayout = this.f132539e;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTopSectionContainer");
        }
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final SearchResultView mo183158p() {
        SearchResultView searchResultView = this.f132540f;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        return searchResultView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final SearchOnScreenReporter mo183160r() {
        SearchOnScreenReporter gVar = this.f132543i;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewOnScreenReporter");
        }
        return gVar;
    }

    @Override // com.ss.android.lark.search.redesign.click.handler.HistoryProvider
    /* renamed from: B */
    public SearchInfoHistory mo183098B() {
        SearchInfoHistory searchInfoHistory = new SearchInfoHistory();
        searchInfoHistory.setQuery(this.f132549p);
        TabInfo tabInfo = this.f132535a;
        if (tabInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        searchInfoHistory.setHistorySource(tabInfo.tabHistorySource());
        return mo183141b(searchInfoHistory);
    }

    /* renamed from: b */
    public List<SectionEntityType> mo183079b() {
        return new ArrayList();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$mInnerCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$f */
    public static final class C53699f implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132562a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.b$f$a */
        public static final class RunnableC53700a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53699f f132563a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f132564b;

            RunnableC53700a(C53699f fVar, ErrorResult errorResult) {
                this.f132563a = fVar;
                this.f132564b = errorResult;
            }

            public final void run() {
                if (this.f132563a.f132562a.mo183154l() != null) {
                    IGetDataCallback<SearchResponse> l = this.f132563a.f132562a.mo183154l();
                    if (l != null) {
                        l.onError(this.f132564b);
                    }
                    Log.m165383e("LarkSearch.Search.V2.BaseSearchTabFragment", "onError callback to sub class.");
                } else if (this.f132563a.f132562a.mo183163u()) {
                    this.f132563a.f132562a.mo183158p().mo184612a(this.f132563a.f132562a.mo183152j());
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.b$f$b */
        public static final class RunnableC53701b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53699f f132565a;

            /* renamed from: b */
            final /* synthetic */ SearchResponse f132566b;

            RunnableC53701b(C53699f fVar, SearchResponse searchResponse) {
                this.f132565a = fVar;
                this.f132566b = searchResponse;
            }

            public final void run() {
                SearchResponse searchResponse = this.f132566b;
                String str = null;
                if ((searchResponse != null ? searchResponse.getAbnormalNotice() : null) == SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                    Log.m165397w("LarkSearch.Search.V2.BaseSearchTabFragment", "request canceled, now: " + BaseSearchTabFragment.m207880c(this.f132565a.f132562a) + " ret: " + this.f132566b.getRequestId());
                    return;
                }
                SearchResponse searchResponse2 = this.f132566b;
                String requestId = searchResponse2 != null ? searchResponse2.getRequestId() : null;
                if (!Intrinsics.areEqual(requestId, BaseSearchTabFragment.m207880c(this.f132565a.f132562a))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("not same request, now: ");
                    sb.append(BaseSearchTabFragment.m207880c(this.f132565a.f132562a));
                    sb.append(" ret: ");
                    SearchResponse searchResponse3 = this.f132566b;
                    if (searchResponse3 != null) {
                        str = searchResponse3.getRequestId();
                    }
                    sb.append(str);
                    Log.m165397w("LarkSearch.Search.V2.BaseSearchTabFragment", sb.toString());
                    return;
                }
                this.f132565a.f132562a.mo183135a(this.f132566b);
                if (!this.f132565a.f132562a.mo183121G() && this.f132565a.f132562a.mo183163u()) {
                    SearchClickReporter.m208837a(this.f132565a.f132562a.mo183150h().getMapp_id(), this.f132565a.f132562a.mo183150h().reporterLocation(), this.f132565a.f132562a.mo183152j(), this.f132565a.f132562a.mo183118D(), this.f132566b.getImprId(), "main", this.f132565a.f132562a.mo183162t().get(this.f132566b.getRequestId()));
                    this.f132565a.f132562a.mo183162t().clear();
                }
                if (!this.f132565a.f132562a.mo183120F()) {
                    this.f132565a.f132562a.mo183119E().mo183832a(this.f132565a.f132562a.mo183150h().reporterLocation(), this.f132566b);
                }
                BaseSearchTabFragment bVar = this.f132565a.f132562a;
                List<SearchBaseInfo> infoList = this.f132566b.getInfoList();
                Intrinsics.checkExpressionValueIsNotNull(infoList, "response.infoList");
                bVar.mo183137a(infoList);
                if (this.f132565a.f132562a.mo183154l() != null) {
                    IGetDataCallback<SearchResponse> l = this.f132565a.f132562a.mo183154l();
                    if (l != null) {
                        l.onSuccess(this.f132566b);
                    }
                    Log.m165389i("LarkSearch.Search.V2.BaseSearchTabFragment", "onSuccess callback to sub class.");
                    return;
                }
                SearchResponse searchResponse4 = this.f132566b;
                this.f132565a.f132562a.mo183161s().clear();
                if (!searchResponse4.isEmpty() || !this.f132565a.f132562a.mo183163u()) {
                    this.f132565a.f132562a.f132537c = searchResponse4.isHasMore();
                    Log.m165389i("LarkSearch.Search.V2.BaseSearchTabFragment", "request " + BaseSearchTabFragment.m207880c(this.f132565a.f132562a) + " on screen, size: " + searchResponse4.getInfoList().size() + ", " + "hasMore: " + this.f132565a.f132562a.f132537c);
                    this.f132565a.f132562a.mo183156n().getSearchBaseInfoDataList().mo5929b(searchResponse4.getInfoList());
                    for (SearchBaseInfo searchBaseInfo : searchResponse4.getInfoList()) {
                        if (!(searchBaseInfo instanceof SearchPlaceholderInfo) && !(searchBaseInfo instanceof SearchMoreInfo)) {
                            List<SearchResult> s = this.f132565a.f132562a.mo183161s();
                            Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "info");
                            String id = searchBaseInfo.getId();
                            String str2 = "";
                            if (id == null) {
                                id = str2;
                            }
                            Integer valueOf = Integer.valueOf(searchBaseInfo.getType());
                            String title = searchBaseInfo.getTitle();
                            if (title != null) {
                                str2 = title;
                            }
                            s.add(new SearchResult(id, valueOf, str2));
                        }
                    }
                    if (this.f132565a.f132562a.mo183163u()) {
                        SearchResultView p = this.f132565a.f132562a.mo183158p();
                        List<SearchBaseInfo> infoList2 = searchResponse4.getInfoList();
                        Intrinsics.checkExpressionValueIsNotNull(infoList2, "infoList");
                        p.mo184617b(infoList2);
                        return;
                    }
                    SearchResultView p2 = this.f132565a.f132562a.mo183158p();
                    List<SearchBaseInfo> infoList3 = searchResponse4.getInfoList();
                    Intrinsics.checkExpressionValueIsNotNull(infoList3, "infoList");
                    p2.mo184613a(infoList3);
                    return;
                }
                Log.m165389i("LarkSearch.Search.V2.BaseSearchTabFragment", "request " + BaseSearchTabFragment.m207880c(this.f132565a.f132562a) + " is empty!");
                SearchResultView p3 = this.f132565a.f132562a.mo183158p();
                String query = searchResponse4.getQuery();
                Intrinsics.checkExpressionValueIsNotNull(query, SearchIntents.EXTRA_QUERY);
                p3.mo184612a(query);
                this.f132565a.f132562a.mo183160r().mo183826a(this.f132565a.f132562a.mo183152j(), this.f132565a.f132562a.mo183118D(), this.f132565a.f132562a.mo183150h().imprId(), false, 1, "main");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53699f(BaseSearchTabFragment bVar) {
            this.f132562a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            UICallbackExecutor.post(new RunnableC53701b(this, searchResponse));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.BaseSearchTabFragment", "onErr! " + errorResult.getDisplayMsg());
            UICallbackExecutor.post(new RunnableC53700a(this, errorResult));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        String str;
        C1177w<String> queryString;
        super.onResume();
        if (!this.f132531C) {
            this.f132531C = true;
            DefaultRecommendView defaultRecommendView = this.f132546l;
            if (defaultRecommendView != null) {
                defaultRecommendView.mo184991a();
            }
        }
        SearchFragmentViewModel bVar = this.f132553t;
        if (bVar == null || (queryString = bVar.getQueryString()) == null || (str = queryString.mo5927b()) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "mSearchFragmentViewModel?.queryString?.value ?: \"\"");
        mo183148c(str);
    }

    /* renamed from: x */
    public final void mo183166x() {
        this.f132559z = false;
        TabInfo tabInfo = this.f132535a;
        if (tabInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        tabInfo.setPage(tabInfo.getPage() + 1);
        String a = C53234a.m205877a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
        this.f132536b = a;
        this.f132530B.mo183831a();
        ISearchLifecycleObserver aVar = this.f132555v;
        String str = this.f132536b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
        }
        aVar.mo181872a(str);
    }

    /* renamed from: y */
    public void mo183167y() {
        FrameLayout frameLayout = this.f132541g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
        }
        frameLayout.setVisibility(8);
        SearchResultView searchResultView = this.f132540f;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.setVisibility(0);
        SearchResultView searchResultView2 = this.f132540f;
        if (searchResultView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView2.mo184609a();
    }

    /* renamed from: N */
    public final void mo183128N() {
        new C25639g(getActivity()).mo89254m(R.string.Lark_Search_ClearAllHistory).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Lark_Legacy_ConfirmDone).mo89267a(new DialogInterface$OnClickListenerC53722u(this))).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Lark_Legacy_Cancel)).mo89239c();
    }

    /* renamed from: Q */
    public final void mo183131Q() {
        LayoutInflater from = LayoutInflater.from(getContext());
        FrameLayout frameLayout = this.f132541g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
        }
        from.inflate(R.layout.view_search_empty, (ViewGroup) frameLayout, true);
        FrameLayout frameLayout2 = this.f132541g;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
        }
        View findViewById = frameLayout2.findViewById(R.id.search_result_empty);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mDefaultViewContainer.fi…R.id.search_result_empty)");
        View findViewById2 = findViewById.findViewById(R.id.search_empty_iv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "emptyHintView.findViewById(R.id.search_empty_iv)");
        View findViewById3 = findViewById.findViewById(R.id.search_empty_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "emptyHintView.findViewById(R.id.search_empty_hint)");
        C57582a.m223615c(findViewById);
        ((ImageView) findViewById2).setImageResource(mo183082e());
        ((TextView) findViewById3).setText(mo183083f());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        OnScreenReporter bVar = this.f132542h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnScreenReporter");
        }
        bVar.mo182047b();
        SearchOnScreenReporter gVar = this.f132543i;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewOnScreenReporter");
        }
        String str = this.f132549p;
        String D = mo183118D();
        TabInfo tabInfo = this.f132535a;
        if (tabInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        String imprId = tabInfo.imprId();
        TabInfo tabInfo2 = this.f132535a;
        if (tabInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        SearchOnScreenReporter.m208854a(gVar, str, D, imprId, false, Integer.valueOf(tabInfo2.getPage()), "main", 8, null);
    }

    /* renamed from: v */
    public void mo183164v() {
        SearchOnScreenReporter gVar = this.f132543i;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewOnScreenReporter");
        }
        String str = this.f132549p;
        String str2 = this.f132529A;
        TabInfo tabInfo = this.f132535a;
        if (tabInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        String sessionSnapshot = tabInfo.getSessionSnapshot();
        TabInfo tabInfo2 = this.f132535a;
        if (tabInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        String imprId = new ImprId(sessionSnapshot, tabInfo2.getSeqIdSnapshot()).imprId();
        TabInfo tabInfo3 = this.f132535a;
        if (tabInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        SearchOnScreenReporter.m208854a(gVar, str, str2, imprId, false, Integer.valueOf(tabInfo3.getPage()), "main", 8, null);
        this.f132559z = true;
        TabInfo tabInfo4 = this.f132535a;
        if (tabInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        tabInfo4.setPage(1);
        this.f132545k = false;
        mo183167y();
        String a = C53234a.m205877a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
        this.f132536b = a;
        HashMap<String, Long> hashMap = this.f132558y;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
        }
        hashMap.put(a, Long.valueOf(System.currentTimeMillis()));
        this.f132530B.mo183831a();
        TabInfo tabInfo5 = this.f132535a;
        if (tabInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        tabInfo5.setSessionSnapshot(SessionManager.m209245a());
        TabInfo tabInfo6 = this.f132535a;
        if (tabInfo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        tabInfo6.setSeqIdSnapshot(SessionManager.m209246b());
        ISearchLifecycleObserver aVar = this.f132555v;
        String str3 = this.f132536b;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
        }
        aVar.mo181873a(str3, mo183077a(this.f132549p), this.f132551r);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$7$4", "Lcom/ss/android/lark/searchcommon/view/binder/OnHistoryTagClickListener;", "onTagClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$j */
    public static final class C53711j implements OnHistoryTagClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132581a;

        C53711j(BaseSearchTabFragment bVar) {
            this.f132581a = bVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.binder.OnHistoryTagClickListener
        /* renamed from: a */
        public void mo183180a(View view, SearchInfoHistory searchInfoHistory, int i) {
            Scene.Type type;
            SearchFragmentViewModel m;
            C1177w<SearchInfoHistory> searchInfoHistory2;
            C1177w<TabType> tabType;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(searchInfoHistory, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SearchClickReporter.f133152a.mo183817a("search_history", searchInfoHistory.getQuery());
            SearchCommonConstants.SearchHistorySource historySource = searchInfoHistory.getHistorySource();
            if (historySource != null) {
                switch (C53724c.f132597a[historySource.ordinal()]) {
                    case 1:
                        type = Scene.Type.SEARCH_GLOBAL;
                        break;
                    case 2:
                        type = Scene.Type.SEARCH_MESSAGES;
                        break;
                    case 3:
                        type = Scene.Type.SEARCH_SPACE;
                        break;
                    case 4:
                        type = Scene.Type.SEARCH_WIKI_SCENE;
                        break;
                    case 5:
                        type = Scene.Type.SEARCH_CHATS;
                        break;
                    case 6:
                        type = Scene.Type.SEARCH_CHATTERS;
                        break;
                }
                SearchFragmentViewModel m2 = this.f132581a.mo183155m();
                if (!(m2 == null || (tabType = m2.getTabType()) == null)) {
                    tabType.mo5929b(new TabType(type, "history"));
                }
                m = this.f132581a.mo183155m();
                if (m != null && (searchInfoHistory2 = m.getSearchInfoHistory()) != null) {
                    searchInfoHistory2.mo5929b(searchInfoHistory);
                    return;
                }
            }
            type = Scene.Type.SEARCH_GLOBAL;
            SearchFragmentViewModel m22 = this.f132581a.mo183155m();
            tabType.mo5929b(new TabType(type, "history"));
            m = this.f132581a.mo183155m();
            if (m != null) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$7$5", "Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$OnActionTagClickListener;", "onTagClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchActionRecommend;", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$k */
    public static final class C53712k implements ActionRecommendBinder.OnActionTagClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132582a;

        C53712k(BaseSearchTabFragment bVar) {
            this.f132582a = bVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.binder.ActionRecommendBinder.OnActionTagClickListener
        /* renamed from: a */
        public void mo183181a(View view, SearchActionRecommend searchActionRecommend, int i) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(searchActionRecommend, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SearchClickReporter.f133152a.mo183817a("hot_queries", searchActionRecommend.getText());
            Fragment parentFragment = this.f132582a.getParentFragment();
            if (parentFragment instanceof SearchFragment) {
                ((SearchFragment) parentFragment).mo183457a(searchActionRecommend.getText());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$7$6", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;", "onMoreClick", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$t */
    public static final class C53721t implements IOnMoreClickListener {

        /* renamed from: a */
        final /* synthetic */ DefaultRecommendView f132592a;

        C53721t(DefaultRecommendView defaultRecommendView) {
            this.f132592a = defaultRecommendView;
        }

        @Override // com.ss.android.lark.searchcommon.view.recommend.IOnMoreClickListener
        /* renamed from: a */
        public void mo183188a(int i) {
            RecyclerView.Adapter adapter;
            int i2 = i + 1;
            RecyclerView.ViewHolder a = this.f132592a.mo184990a(i2);
            SearchBaseInfo b = this.f132592a.mo184994b(i2);
            if ((a instanceof SearchCardViewHolder) && (b instanceof SearchCardInfo)) {
                SearchCardInfo searchCardInfo = (SearchCardInfo) b;
                searchCardInfo.setExpand(!searchCardInfo.getExpand());
                RecyclerView.Adapter adapter2 = ((SearchCardViewHolder) a).mo184886a().getAdapter();
                if (!(adapter2 instanceof CardAdapter)) {
                    adapter = null;
                } else {
                    adapter = adapter2;
                }
                CardAdapter eVar = (CardAdapter) adapter;
                if (eVar != null) {
                    if (searchCardInfo.getExpand()) {
                        ((CardAdapter) adapter2).getItems().addAll(searchCardInfo.getNonTopRowList());
                        eVar.notifyItemRangeInserted(searchCardInfo.getTopRowList().size(), searchCardInfo.getNonTopRowList().size());
                    } else {
                        Iterator<T> it = searchCardInfo.getNonTopRowList().iterator();
                        while (it.hasNext()) {
                            ((CardAdapter) adapter2).getItems().remove(it.next());
                        }
                        eVar.notifyItemRangeRemoved(searchCardInfo.getTopRowList().size(), searchCardInfo.getNonTopRowList().size());
                    }
                }
                IOnMoreClickListener onMoreClickListener = searchCardInfo.getOnMoreClickListener();
                if (onMoreClickListener != null) {
                    onMoreClickListener.mo183188a(i);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ OnScreenReporter m207877a(BaseSearchTabFragment bVar) {
        OnScreenReporter bVar2 = bVar.f132542h;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnScreenReporter");
        }
        return bVar2;
    }

    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m207879b(BaseSearchTabFragment bVar) {
        FrameLayout frameLayout = bVar.f132541g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
        }
        return frameLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m207880c(BaseSearchTabFragment bVar) {
        String str = bVar.f132536b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
        }
        return str;
    }

    /* renamed from: d */
    public final void mo183149d(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        CommonRecommendPuller aVar = this.f132547m;
        if (aVar != null) {
            aVar.mo181925a(SessionManager.m209245a(), iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$7$2", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "clickHandler", "Lcom/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler;", "getClickHandler", "()Lcom/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler;", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$h */
    public static final class C53707h implements SearchResultViewAdapter.IOnItemClickHandler {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132575a;

        /* renamed from: b */
        private final SearchItemClickHandler f132576b;

        C53707h(BaseSearchTabFragment bVar) {
            this.f132575a = bVar;
            SearchItemClickHandler iVar = new SearchItemClickHandler(bVar, bVar);
            iVar.mo183106a(new SearchResultViewAdapter.IOnItemClickHandler(this) {
                /* class com.ss.android.lark.search.redesign.BaseSearchTabFragment.C53707h.C537081 */

                /* renamed from: a */
                final /* synthetic */ C53707h f132577a;

                /* renamed from: b */
                private final SendSearchResultClickReporter f132578b;

                {
                    this.f132577a = r3;
                    this.f132578b = new SendSearchResultClickReporter(r3.f132575a.mo183150h(), new SubPositionCalculator(this) {
                        /* class com.ss.android.lark.search.redesign.BaseSearchTabFragment.C53707h.C537081.C537091 */

                        /* renamed from: a */
                        final /* synthetic */ C537081 f132579a;

                        @Override // com.ss.android.lark.search.redesign.click.report.SubPositionCalculator
                        /* renamed from: a */
                        public int mo183116a(int i) {
                            return i;
                        }

                        @Override // com.ss.android.lark.search.redesign.click.report.SubPositionCalculator
                        /* renamed from: b */
                        public int mo183117b(int i) {
                            return i;
                        }

                        @Override // com.ss.android.lark.search.redesign.click.report.SubPositionCalculator
                        /* renamed from: A */
                        public String mo183115A() {
                            return this.f132579a.f132577a.f132575a.mo183153k();
                        }

                        {
                            this.f132579a = r1;
                        }
                    });
                }

                @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
                /* renamed from: a */
                public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
                    Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    this.f132578b.mo182499a(searchBaseInfo, z, i);
                    SearchOnScreenReporter.m208854a(this.f132577a.f132575a.mo183160r(), this.f132577a.f132575a.mo183152j(), this.f132577a.f132575a.mo183118D(), this.f132577a.f132575a.mo183150h().imprId(), false, Integer.valueOf(this.f132577a.f132575a.mo183150h().getPage()), "main", 8, null);
                }
            });
            this.f132576b = iVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
        /* renamed from: a */
        public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!this.f132575a.mo183140a(searchBaseInfo, z, i)) {
                this.f132576b.mo182499a(searchBaseInfo, z, i);
                SearchOnScreenReporter.m208854a(this.f132575a.mo183160r(), this.f132575a.mo183152j(), this.f132575a.mo183118D(), "", false, Integer.valueOf(this.f132575a.mo183150h().getPage()), "main", 8, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"com/ss/android/lark/search/redesign/BaseSearchTabFragment$onViewCreated$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "reporter", "Lcom/ss/android/lark/search/redesign/click/report/SendSearchResultClickReporter;", "getReporter", "()Lcom/ss/android/lark/search/redesign/click/report/SendSearchResultClickReporter;", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$o */
    public static final class C53716o implements SearchResultViewAdapter.IOnItemClickHandler {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132586a;

        /* renamed from: b */
        private final SendSearchResultClickReporter f132587b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53716o(BaseSearchTabFragment bVar) {
            this.f132586a = bVar;
            this.f132587b = new SendSearchResultClickReporter(bVar.mo183150h(), bVar);
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
        /* renamed from: a */
        public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f132587b.mo182499a(searchBaseInfo, z, i);
            SearchOnScreenReporter.m208854a(this.f132586a.mo183160r(), this.f132586a.mo183152j(), this.f132586a.mo183118D(), this.f132586a.mo183150h().imprId(), false, Integer.valueOf(this.f132586a.mo183150h().getPage()), "main", 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$r */
    static final class C53719r<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132590a;

        C53719r(BaseSearchTabFragment bVar) {
            this.f132590a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            Lifecycle lifecycle = this.f132590a.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycle");
            if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
                BaseSearchTabFragment bVar = this.f132590a;
                Intrinsics.checkExpressionValueIsNotNull(str, "it");
                bVar.mo183148c(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "history", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$s */
    static final class C53720s<T> implements AbstractC1178x<SearchInfoHistory> {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132591a;

        C53720s(BaseSearchTabFragment bVar) {
            this.f132591a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(SearchInfoHistory searchInfoHistory) {
            if (this.f132591a.mo183150h().tabHistorySource() != SearchCommonConstants.SearchHistorySource.UNKNOWN) {
                SearchCommonConstants.SearchHistorySource tabHistorySource = this.f132591a.mo183150h().tabHistorySource();
                Intrinsics.checkExpressionValueIsNotNull(searchInfoHistory, "history");
                if (tabHistorySource == searchInfoHistory.getHistorySource()) {
                    this.f132591a.mo183136a(searchInfoHistory);
                }
            }
        }
    }

    /* renamed from: a */
    public SearchContext mo183077a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        SearchContext searchContext = new SearchContext();
        TabInfo tabInfo = this.f132535a;
        if (tabInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        searchContext.mo184391a(tabInfo.getType());
        searchContext.mo184394a(str);
        return searchContext;
    }

    /* renamed from: c */
    private final void mo183406c(boolean z) {
        FrameLayout frameLayout = this.f132541g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
        }
        frameLayout.setVisibility(0);
        SearchResultView searchResultView = this.f132540f;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.mo184621d();
        if (z) {
            SearchResultView searchResultView2 = this.f132540f;
            if (searchResultView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
            }
            searchResultView2.setVisibility(8);
            return;
        }
        if (!this.f132531C) {
            this.f132531C = true;
            DefaultRecommendView defaultRecommendView = this.f132546l;
            if (defaultRecommendView != null) {
                defaultRecommendView.mo184991a();
            }
        }
        UICallbackExecutor.post(new RunnableC53697d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo183134a(IGetDataCallback<SearchResponse> iGetDataCallback) {
        this.f132552s = iGetDataCallback;
    }

    /* renamed from: b */
    public final void mo183143b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f132550q = str;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        TabInfo tabInfo = null;
        if (arguments != null) {
            obj = arguments.get("tab_info");
        } else {
            obj = null;
        }
        if (obj instanceof TabInfo) {
            tabInfo = obj;
        }
        TabInfo tabInfo2 = tabInfo;
        if (tabInfo2 == null) {
            int number = Scene.Type.SEARCH_GLOBAL.getNumber();
            String string = UIHelper.getString(R.string.Lark_Search_TopResults);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Search_TopResults)");
            tabInfo2 = new TabInfo(number, string, null, null, null, 28, null);
        }
        this.f132535a = tabInfo2;
        this.f132553t = (SearchFragmentViewModel) mo183297b(SearchFragmentViewModel.class);
        this.f132538d = (BaseSearchTabFragmentViewModel) mo183296a(BaseSearchTabFragmentViewModel.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo183135a(SearchResponse searchResponse) {
        boolean z;
        int i;
        if (searchResponse == null || searchResponse.getFrom() != 0) {
            TabInfo tabInfo = this.f132535a;
            if (tabInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
            }
            String searchHitPointLocation = tabInfo.searchHitPointLocation();
            if (searchResponse != null && this.f132559z) {
                if (searchHitPointLocation.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str = searchResponse.isEmpty() ? C64034n.f161683a : "y";
                    if (!TextUtils.isEmpty(searchResponse.getQuery())) {
                        i = searchResponse.getQuery().length();
                    } else {
                        i = 0;
                    }
                    String str2 = mo183165w() ? "y" : C64034n.f161683a;
                    SearchHitPoint.Companion aVar = SearchHitPoint.f131886a;
                    String requestId = searchResponse.getRequestId();
                    String session = searchResponse.getSession();
                    String imprId = searchResponse.getImprId();
                    String D = mo183118D();
                    TabInfo tabInfo2 = this.f132535a;
                    if (tabInfo2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
                    }
                    aVar.mo182012a(i, str, searchHitPointLocation, requestId, session, str2, imprId, D, tabInfo2.getMapp_id());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo183145b(boolean z) {
        this.f132531C = z;
    }

    /* renamed from: c */
    public void mo183148c(String str) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        boolean w = mo183165w();
        String str2 = str;
        if (!StringsKt.isBlank(str2) || !w) {
            SearchOnScreenReporter gVar = this.f132543i;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewOnScreenReporter");
            }
            String str3 = this.f132549p;
            String str4 = this.f132529A;
            TabInfo tabInfo = this.f132535a;
            if (tabInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
            }
            String sessionSnapshot = tabInfo.getSessionSnapshot();
            TabInfo tabInfo2 = this.f132535a;
            if (tabInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
            }
            String imprId = new ImprId(sessionSnapshot, tabInfo2.getSeqIdSnapshot()).imprId();
            TabInfo tabInfo3 = this.f132535a;
            if (tabInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
            }
            SearchOnScreenReporter.m208854a(gVar, str3, str4, imprId, false, Integer.valueOf(tabInfo3.getPage()), "main", 8, null);
            if ((!StringsKt.isBlank(this.f132549p)) && StringsKt.isBlank(str2)) {
                this.f132549p = "";
                StringBuilder sb = new StringBuilder();
                sb.append("reset requestId: ");
                String str5 = this.f132536b;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
                }
                sb.append(str5);
                Log.m165379d("LarkSearch.Search.V2.BaseSearchTabFragment", sb.toString());
                this.f132536b = "";
                m207878a(this, false, 1, null);
            } else if (TextUtils.equals(str2, this.f132549p)) {
                Log.m165379d("LarkSearch.Search.V2.BaseSearchTabFragment", "same query, return.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("search by query, query length: ");
                sb2.append(str.length());
                sb2.append(", query pattern: ");
                sb2.append(SearchCommonUtils.m209228a(str));
                sb2.append(", from: ");
                TabInfo tabInfo4 = this.f132535a;
                if (tabInfo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
                }
                sb2.append(tabInfo4.reporterLocation());
                sb2.append('.');
                Log.m165389i("LarkSearch.Search.V2.BaseSearchTabFragment", sb2.toString());
                this.f132549p = str;
                this.f132559z = true;
                TabInfo tabInfo5 = this.f132535a;
                if (tabInfo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
                }
                tabInfo5.setPage(1);
                this.f132545k = false;
                mo183167y();
                String a = C53234a.m205877a();
                Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
                this.f132536b = a;
                HashMap<String, Long> hashMap = this.f132558y;
                if (a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
                }
                hashMap.put(a, Long.valueOf(System.currentTimeMillis()));
                this.f132530B.mo183831a();
                TabInfo tabInfo6 = this.f132535a;
                if (tabInfo6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
                }
                tabInfo6.setSessionSnapshot(SessionManager.m209245a());
                TabInfo tabInfo7 = this.f132535a;
                if (tabInfo7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
                }
                tabInfo7.setSeqIdSnapshot(SessionManager.m209246b());
                ISearchLifecycleObserver aVar = this.f132555v;
                String str6 = this.f132536b;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRequestId");
                }
                aVar.mo181873a(str6, mo183077a(str), this.f132551r);
            }
        } else {
            this.f132549p = str;
            mo183139a(w);
        }
    }

    /* renamed from: a */
    public void mo183137a(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "infoList");
        for (SearchBaseInfo searchBaseInfo : list) {
            searchBaseInfo.setQuery(this.f132549p);
            searchBaseInfo.setFilterStatus(mo183118D());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.b$u */
    public static final class DialogInterface$OnClickListenerC53722u implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseSearchTabFragment f132593a;

        DialogInterface$OnClickListenerC53722u(BaseSearchTabFragment bVar) {
            this.f132593a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SearchHitPoint.f131886a.mo182011a();
            C53287b.m206193a().mo181876a(new UIGetDataCallback(new IGetDataCallback<Boolean>(this) {
                /* class com.ss.android.lark.search.redesign.BaseSearchTabFragment.DialogInterface$OnClickListenerC53722u.C537231 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC53722u f132594a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f132594a = r1;
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    SearchClickReporter.m208833a(SearchClickReporter.f133152a, "search_history_delete", (String) null, 2, (Object) null);
                    DefaultRecommendView defaultRecommendView = this.f132594a.f132593a.f132546l;
                    if (defaultRecommendView != null) {
                        defaultRecommendView.mo184995b();
                    }
                    SearchCommonUtils.f133387a.mo184565f(this.f132594a.f132593a.mo183078a());
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    Log.m165383e("LarkSearch.Search.V2.BaseSearchTabFragment", "clear all search history failed: " + errorResult.getDebugMsg());
                    LKUIToast.show(this.f132594a.f132593a.mContext, UIHelper.getString(R.string.Lark_Legacy_DeleteFail));
                }
            }));
        }
    }

    /* renamed from: b */
    public final void mo183144b(List<? extends BasePickViewData> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "pickedData");
        Context context = this.mContext;
        if (context != null) {
            startActivityForResult(PickChatLauncher.m207656a(context, (List<BasePickViewData>) list, C53258a.m205939a().mo181745a("search.topic.enabled") ? 1 : 0), i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C1177w<SearchInfoHistory> searchInfoHistory;
        C1177w<String> queryString;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        SearchItemClickHandler iVar = new SearchItemClickHandler(this, this);
        this.f132548o = iVar;
        if (iVar != null) {
            iVar.mo183106a(new C53716o(this));
        }
        SearchResultView searchResultView = this.f132540f;
        if (searchResultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        searchResultView.setClickHandler(this.f132548o);
        TabInfo tabInfo = this.f132535a;
        if (tabInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        this.f132542h = new OnScreenReporter(tabInfo.searchPage());
        TabInfo tabInfo2 = this.f132535a;
        if (tabInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabInfo");
        }
        this.f132543i = new SearchOnScreenReporter(tabInfo2.reporterLocation());
        SearchResultView searchResultView2 = this.f132540f;
        if (searchResultView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultView");
        }
        if (mo183130P()) {
            searchResultView2.mo184622e();
        }
        searchResultView2.setNeedLoadMore(true);
        searchResultView2.setOnResultScroll(new C53713l(this));
        C53714m mVar = new C53714m(this);
        C53715n nVar = new C53715n(this);
        searchResultView2.setOnLoadMore(mVar);
        searchResultView2.setOnItemOnScreenListener(nVar);
        FeedBackView feedBackView = this.f132554u;
        if (feedBackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchFeedbackView");
        }
        feedBackView.setOnInteraction(new C53717p(this));
        FeedBackView feedBackView2 = this.f132554u;
        if (feedBackView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchFeedbackView");
        }
        feedBackView2.setFeedbackArgs(new C53718q(this));
        FeedBackView feedBackView3 = this.f132554u;
        if (feedBackView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchFeedbackView");
        }
        feedBackView3.setEntrance("swipe");
        SearchFragmentViewModel bVar = this.f132553t;
        if (!(bVar == null || (queryString = bVar.getQueryString()) == null)) {
            queryString.mo5923a(getViewLifecycleOwner(), new C53719r(this));
        }
        SearchFragmentViewModel bVar2 = this.f132553t;
        if (!(bVar2 == null || (searchInfoHistory = bVar2.getSearchInfoHistory()) == null)) {
            searchInfoHistory.mo5923a(getViewLifecycleOwner(), new C53720s(this));
        }
        if (mo183081d() || mo183127M()) {
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            DefaultRecommendView defaultRecommendView = new DefaultRecommendView(context);
            if (mo183129O()) {
                defaultRecommendView.mo184997c();
            }
            defaultRecommendView.mo184999d();
            defaultRecommendView.setDataPuller(new C53702g(this));
            defaultRecommendView.setClickHandler(new C53707h(this));
            try {
                Object d = SearchCommonUtils.f133387a.mo184563d(mo183078a());
                if (!(d instanceof List)) {
                    d = null;
                }
                defaultRecommendView.mo184992a((List) d);
            } catch (Exception unused) {
                SearchCommonUtils.f133387a.mo184564e(mo183078a());
            }
            defaultRecommendView.setOnClearHistoryListener(new C53710i(this));
            defaultRecommendView.setOnHistoryTagClickListener(new C53711j(this));
            defaultRecommendView.setOnActionTagClickListener(new C53712k(this));
            SearchOnScreenReporter gVar = this.f132543i;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNewOnScreenReporter");
            }
            defaultRecommendView.setOnItemOnScreenListener(new OnRecommendItemOnScreenListener(gVar));
            defaultRecommendView.setOnMoreClickListener(new C53721t(defaultRecommendView));
            this.f132546l = defaultRecommendView;
            FrameLayout frameLayout = this.f132541g;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDefaultViewContainer");
            }
            frameLayout.addView(this.f132546l);
            this.f132547m = new CommonRecommendPuller(mo183079b(), mo183080c().toString());
        } else {
            mo183131Q();
        }
        mo183406c(true);
    }

    /* renamed from: a */
    public final void mo183138a(List<? extends BasePickViewData> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "pickedData");
        Context context = this.mContext;
        if (context != null) {
            startActivityForResult(C53667b.m207747a(context, list), i);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_search_tab, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.top_section);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.top_section)");
        this.f132539e = (FrameLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.search_result_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.search_result_view)");
        this.f132540f = (SearchResultView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.search_default_view_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.search_default_view_container)");
        this.f132541g = (FrameLayout) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.search_bottom_feedback);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.search_bottom_feedback)");
        this.f132554u = (FeedBackView) findViewById4;
        return inflate;
    }

    /* renamed from: a */
    static /* synthetic */ void m207878a(BaseSearchTabFragment bVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            bVar.mo183406c(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultMode");
    }
}
