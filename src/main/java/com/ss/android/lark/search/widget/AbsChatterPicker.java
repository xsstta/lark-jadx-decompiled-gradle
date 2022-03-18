package com.ss.android.lark.search.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.lark.pb.search.v2.MailContactMeta;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.EmailContact;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.business.ContactsSelectorBusiness;
import com.ss.android.lark.search.widget.business.ICustomBusiness;
import com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.search.widget.params.PickType;
import com.ss.android.lark.search.widget.reporter.PickerReporter;
import com.ss.android.lark.search.widget.reporter.PickerReporterConstants;
import com.ss.android.lark.search.widget.reporter.PickerReporterDelegate;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import com.ss.android.lark.searchcommon.reporter.SafeReporter;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 «\u0001*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0004«\u0001¬\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001a\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010I\u001a\u00020\fJ\u001a\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010K\u001a\u00020\fJ\u001a\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010I\u001a\u00020\fJ\u001a\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010I\u001a\u00020\fJ\u001a\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010O\u001a\u00020\fJ\u001a\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010O\u001a\u00020\fJ\u001a\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010O\u001a\u00020\fJ\b\u0010R\u001a\u00020SH\u0016J\u0017\u0010T\u001a\u00028\u00012\n\u0010U\u001a\u0006\u0012\u0002\b\u00030\u001c¢\u0006\u0002\u0010VJ\u001a\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010X\u001a\u00020\fJ\u0015\u0010Y\u001a\u00028\u00012\b\u0010Z\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00028\u00012\u0006\u0010]\u001a\u00020\f¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00028\u00012\u0006\u0010`\u001a\u00020\f¢\u0006\u0002\u0010^J\u0013\u0010a\u001a\u00028\u00012\u0006\u0010b\u001a\u00020\f¢\u0006\u0002\u0010^J\u0013\u0010c\u001a\u00028\u00012\u0006\u0010d\u001a\u00020\f¢\u0006\u0002\u0010^J\u0013\u0010e\u001a\u00028\u00012\u0006\u0010f\u001a\u00020\f¢\u0006\u0002\u0010^J\u0013\u0010g\u001a\u00028\u00012\u0006\u0010h\u001a\u00020\f¢\u0006\u0002\u0010^J\u0013\u0010i\u001a\u00028\u00012\u0006\u0010j\u001a\u00020\f¢\u0006\u0002\u0010^J\u0013\u0010k\u001a\u00028\u00012\u0006\u0010l\u001a\u00020\f¢\u0006\u0002\u0010^J\u001a\u0010m\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010n\u001a\u00020\fJ\u0006\u0010o\u001a\u00020pJ\u0006\u0010q\u001a\u00020*J\u000e\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00190sH\u0002J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00190sH\u0002J\u000e\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00190sH\u0002J\u000e\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00190sH\u0002J\b\u0010w\u001a\u00020SH\u0002J\b\u0010x\u001a\u00020SH\u0002J\b\u0010y\u001a\u00020SH\u0002J\b\u0010z\u001a\u00020SH\u0002J\b\u0010{\u001a\u00020\fH\u0016J#\u0010|\u001a\u00020\f2\u0006\u0010}\u001a\u00020~2\u0006\u0010\u001a\u00020\f2\t\b\u0002\u0010\u0001\u001a\u00020*H\u0002J3\u0010\u0001\u001a\u00020\f2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010\u001a\u00020\f2\t\b\u0002\u0010\u0001\u001a\u00020*2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0019H\u0002J'\u0010\u0001\u001a\u00020\f2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010\u0001\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u00020\fH\u0002J$\u0010\u0001\u001a\u00020\f2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010\u001a\u00020\f2\u0007\u0010\u0001\u001a\u00020*H\u0002J\u001a\u0010\u0001\u001a\u00020S2\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0012\u0010\u0001\u001a\u00030\u00012\u0006\u0010}\u001a\u00020~H\u0002J\u0007\u0010\u0001\u001a\u00020SJ\t\u0010\u0001\u001a\u00020SH\u0016J\u0007\u0010\u0001\u001a\u00020SJ\u000f\u0010\u0001\u001a\u00020S2\u0006\u0010I\u001a\u00020\fJ\u000f\u0010\u0001\u001a\u00020S2\u0006\u0010K\u001a\u00020\fJ\u000f\u0010\u0001\u001a\u00020S2\u0006\u0010O\u001a\u00020\fJ\u0010\u0010\u0001\u001a\u00020S2\u0007\u0010\u0001\u001a\u00020\fJ\u0010\u0010\u0001\u001a\u00020S2\u0007\u0010\u0001\u001a\u00020\fJ\t\u0010\u0001\u001a\u00020SH\u0002J\u0010\u0010\u0001\u001a\u00020S2\u0007\u0010\u0001\u001a\u00020\u0019J\u001b\u0010\u0001\u001a\u00020S2\u0007\u0010 \u0001\u001a\u00020*2\t\b\u0002\u0010\u0001\u001a\u00020\u0019J\u001b\u0010¡\u0001\u001a\u00020S2\u0007\u0010\u0001\u001a\u00020\u00192\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0019J\u0007\u0010£\u0001\u001a\u00020SJ\u0012\u0010¤\u0001\u001a\u00020S2\u0007\u0010¥\u0001\u001a\u00020\fH\u0016J%\u0010¦\u0001\u001a\u00030§\u00012\b\u0010¨\u0001\u001a\u00030§\u00012\t\u0010©\u0001\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0003\u0010ª\u0001R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020*X\u000e¢\u0006\b\n\u0000\u0012\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013R\u000e\u0010:\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000¨\u0006­\u0001"}, d2 = {"Lcom/ss/android/lark/search/widget/AbsChatterPicker;", "P", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "PK", "Lcom/ss/android/lark/search/widget/BasePicker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "addChatterFromChatByOrganization", "", "addChatterFromChatBySearch", "addChatterFromDepartmentByOrganization", "addChatterFromDepartmentBySearch", "getAddChatterFromDepartmentBySearch", "()Z", "setAddChatterFromDepartmentBySearch", "(Z)V", "appreciableRptFirstRenderCost", "", "appreciableRptInitViewCost", "appreciableRptInitViewStart", "appreciableRptKey", "", "mBusinessExtensions", "", "Lcom/ss/android/lark/search/widget/business/ICustomBusiness;", "mContactsOwnerGroupController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsOwnerGroupController;", "mContactsOwnerGroupFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "mContactsSelectorFragment", "mContext", "mCustomerContactFragment", "mDepartmentDetailFragment", "mDisableEmailContact", "mDisableExternalChatter", "mDisableSearchChatter", "mEmailContactFragment", "mFragmentType", "", "mFragmentType$annotations", "()V", "mIContactHomeController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactHomeController;", "mIContactsSelectorController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController;", "mIDepartmentDetailController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IDepartmentDetailController;", "mIEmailContactController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IEmailContactController;", "mISchoolNodeDetailController", "mInitDepartmentId", "mIsDepartmentSelectableWhenVisible", "getMIsDepartmentSelectableWhenVisible", "setMIsDepartmentSelectableWhenVisible", "mIsEmailContactEnabled", "mIsExternalContactEnabled", "mIsShowDepartment", "mIsShowMineGroupItem", "mIsShowOwnerGroup", "mIsShowSchoolContacts", "mIsShowTrustParty", "mPickType", "Lcom/ss/android/lark/search/widget/params/PickType;", "mSchoolNodeDetailFragment", "mSearchOuterGroupChat", "mSelfId", "mTrustPartyController", "mTrustPartyFragment", "attachAddChatterFromChat", "addChatterFromChat", "attachAddChatterFromChatAndDepartment", "addChatterFromChatAndDepartment", "attachAddChatterFromChatByOrganization", "attachAddChatterFromChatBySearch", "attachAddChatterFromDepartment", "addChatterFromDepartment", "attachAddChatterFromDepartmentByOrganization", "attachAddChatterFromDepartmentBySearch", "attachComplete", "", "attachCustomBusiness", "customBusiness", "(Lcom/ss/android/lark/search/widget/business/ICustomBusiness;)Lcom/ss/android/lark/search/widget/BasePicker;", "attachDisableChatter", "disableSearchChatter", "attachInitDepartmentId", "initDepartmentId", "(Ljava/lang/String;)Lcom/ss/android/lark/search/widget/BasePicker;", "attachIsDepartmentSelectableWhenVisible", "isDepartmentSelectableWhenVisible", "(Z)Lcom/ss/android/lark/search/widget/BasePicker;", "attachIsEmailContactEnabled", "isEmailContactEnabled", "attachIsExternalContactEnabled", "isExternalContactEnabled", "attachIsShowDepartment", "isShowDepartment", "attachIsShowMineGroupItem", "isShowMineGroupItem", "attachIsShowOwnerGroupItem", "isShowOwnerGroup", "attachIsShowSchoolContacts", "isShowSchoolContacts", "attachIsShowTrustParty", "isShowTrustParty", "attachSearchOuterGroupChat", "searchOuterGroupChat", "getCurDepartment", "Lcom/ss/android/lark/contact/entity/Department;", "getFragmentType", "getSelectedChatIds", "", "getSelectedChatterIds", "getSelectedDepartmentIds", "getSelectedEmailContactIds", "initFragmentForBusiness", "initFragmentForCustomer", "initFragmentForEmailContact", "initOrganizationFragment", "onBackPressed", "onEmailContactPick", "contact", "Lcom/ss/android/lark/contact/entity/EmailContact;", "isSelected", "deniedReason", "onOrganizationChatterPick", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "enterpriseEmail", "onOrganizationDepartmentPick", "departmentId", "departmentName", "onOwnerGroupItemPick", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "position", "onSearchSuccess", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "parseChatterViewDataFromContact", "Lcom/ss/android/lark/searchcommon/dto/info/SearchMailContactInfo;", "refreshCurrentDepartment", "refreshDefault", "refreshSchoolParentDetailDepartment", "setAddChatterFromChat", "setAddChatterFromChatAndDepartment", "setAddChatterFromDepartment", "setDisableEmailContact", "disableEmailContact", "setDisableExternalChatter", "disableExternalChatter", "showContactOwnerGroupFragment", "showDepartmentDetailFragment", "targetId", "showFragment", "fragmentType", "showSchoolParentDetailFragment", "prefixName", "showTrustPartyFragment", "switchMultipleStatus", "isMultiple", "transformByPickerParams", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "searchContext", "pickerParams", "(Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;)Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "Companion", "FragmentType", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
public class AbsChatterPicker<P extends ChatterPickerParams, PK extends BasePicker<P, PK>> extends BasePicker<P, PK> {

    /* renamed from: k */
    public static final Companion f132900k = new Companion(null);

    /* renamed from: A */
    private final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController f132901A;

    /* renamed from: B */
    private BaseFragment f132902B;

    /* renamed from: C */
    private BaseFragment f132903C;

    /* renamed from: D */
    private final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController f132904D;

    /* renamed from: E */
    private BaseFragment f132905E;

    /* renamed from: F */
    private BaseFragment f132906F;

    /* renamed from: G */
    private BaseFragment f132907G;

    /* renamed from: H */
    private BaseFragment f132908H;

    /* renamed from: I */
    private BaseFragment f132909I;

    /* renamed from: J */
    private boolean f132910J;

    /* renamed from: K */
    private boolean f132911K;

    /* renamed from: L */
    private boolean f132912L;

    /* renamed from: M */
    private boolean f132913M;

    /* renamed from: N */
    private boolean f132914N;

    /* renamed from: O */
    private boolean f132915O;

    /* renamed from: P */
    private int f132916P;

    /* renamed from: Q */
    private String f132917Q;

    /* renamed from: R */
    private String f132918R;

    /* renamed from: S */
    private boolean f132919S;

    /* renamed from: T */
    private boolean f132920T;

    /* renamed from: U */
    private Set<ICustomBusiness<?>> f132921U;

    /* renamed from: V */
    private boolean f132922V;

    /* renamed from: W */
    private boolean f132923W;

    /* renamed from: a */
    public final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController f132924a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;

    /* renamed from: b */
    public final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController f132925b;

    /* renamed from: c */
    public final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController f132926c;

    /* renamed from: d */
    public final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController f132927d;

    /* renamed from: e */
    public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController f132928e;

    /* renamed from: f */
    public boolean f132929f;

    /* renamed from: g */
    public final String f132930g;

    /* renamed from: h */
    public long f132931h;

    /* renamed from: i */
    public long f132932i;

    /* renamed from: j */
    public long f132933j;

    /* renamed from: y */
    private PickType f132934y;

    /* renamed from: z */
    private Context f132935z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/search/widget/AbsChatterPicker$FragmentType;", "", "Companion", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface FragmentType {
        public static final Companion Companion = Companion.f132936a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/search/widget/AbsChatterPicker$FragmentType$Companion;", "", "()V", "TYPE_CONTACTS_OWNER_GROUP", "", "TYPE_CONTACTS_SELECTOR", "TYPE_CUSTOMER_CONTACTS", "TYPE_DEPARTMENT_DETAIL", "TYPE_EMAIL_CONTACT", "TYPE_SCHOOL_PARENT_DETAIL", "TYPE_TRUST_PARTY", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$FragmentType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f132936a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/search/widget/AbsChatterPicker$Companion;", "", "()V", "APPRECIABLE_RPT_FIRST_RENDER_COST", "", "APPRECIABLE_RPT_FROM_TYPE", "APPRECIABLE_RPT_VIEW_INIT_COST", "EXTERNAL_STRUCT_DEPARTMENT_ID", "KEY_CHAT_ID", "KEY_IS_B2B_CONNECT", "TAG", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/search/widget/AbsChatterPicker$initFragmentForBusiness$onContactsSelectorViewDataListener$1", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController$IOnViewDataListener;", "onReady", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$e */
    public static final class C53837e implements SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnViewDataListener {
        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnViewDataListener
        /* renamed from: a */
        public void mo183541a() {
        }

        C53837e() {
        }
    }

    /* access modifiers changed from: protected */
    public final boolean getAddChatterFromDepartmentBySearch() {
        return this.ac;
    }

    public final int getFragmentType() {
        return this.f132916P;
    }

    /* access modifiers changed from: protected */
    public final boolean getMIsDepartmentSelectableWhenVisible() {
        return this.ae;
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: a */
    public void mo183483a() {
        super.mo183483a();
        m208359o();
        mo183605q(getMSoftInputInitPopup());
        this.f132931h = System.currentTimeMillis() - this.f132932i;
        Log.m165379d("LarkSearch.SearchWidget.AbsChatterPicker", "appreciableRptInitViewCost: " + this.f132931h + '.');
        post(new RunnableC53833b(this));
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: a */
    public void mo183487a(List<SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "infoList");
        for (T t : list) {
            if (t instanceof SearchChatterInfo) {
                T t2 = t;
                t2.customer(Intrinsics.areEqual("0", t2.getTenantId()));
                t2.zenMode(SearchWidgetModuleDependency.m208511a().mo102928a(t2.getZenModeEndTime()));
            }
        }
    }

    /* renamed from: a */
    public final void mo183485a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        mo183484a(2, str);
        BasePicker.OnPickerParamsLoader<P> mOnPickerParamsLoader = getMOnPickerParamsLoader();
        getMDefaultViewContainer().post(new RunnableC53842j(this, mOnPickerParamsLoader != null ? (ChatterPickerParams) mOnPickerParamsLoader.onLoadPickerParams() : null, str));
    }

    /* renamed from: a */
    public final void mo183486a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        ChatterPickerParams dVar = null;
        m208355a(this, 4, null, 2, null);
        BasePicker.OnPickerParamsLoader<P> mOnPickerParamsLoader = getMOnPickerParamsLoader();
        if (mOnPickerParamsLoader != null) {
            dVar = (ChatterPickerParams) mOnPickerParamsLoader.onLoadPickerParams();
        }
        getMDefaultViewContainer().post(new RunnableC53843k(this, dVar, str, str2));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo183484a(int i, String str) {
        String str2;
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        this.f132916P = i;
        Bundle bundle = null;
        ChatterPickerParams dVar = null;
        boolean z = true;
        switch (i) {
            case 1:
                BaseFragment baseFragment = this.f132905E;
                if (baseFragment == null) {
                    Intrinsics.throwNpe();
                }
                mo183567a(baseFragment);
                str2 = "";
                break;
            case 2:
                BaseFragment baseFragment2 = this.f132906F;
                if (baseFragment2 == null) {
                    Intrinsics.throwNpe();
                }
                mo183567a(baseFragment2);
                if (!Intrinsics.areEqual(str, "-1")) {
                    str2 = "public_picker_select_architecture_member_view";
                    break;
                } else {
                    str2 = "public_picker_select_external_view";
                    break;
                }
            case 3:
                BaseFragment baseFragment3 = this.f132902B;
                if (baseFragment3 == null) {
                    Intrinsics.throwNpe();
                }
                mo183567a(baseFragment3);
                str2 = "";
                break;
            case 4:
                BaseFragment baseFragment4 = this.f132908H;
                if (baseFragment4 != null) {
                    bundle = baseFragment4.getArguments();
                }
                if (bundle != null) {
                    bundle.putBoolean("is_edu_mode", true);
                }
                BaseFragment baseFragment5 = this.f132908H;
                if (baseFragment5 != null) {
                    baseFragment5.setArguments(bundle);
                }
                BaseFragment baseFragment6 = this.f132908H;
                if (baseFragment6 != null) {
                    mo183567a(baseFragment6);
                }
                str2 = "";
                break;
            case 5:
                BaseFragment baseFragment7 = this.f132909I;
                if (baseFragment7 == null) {
                    Intrinsics.throwNpe();
                }
                mo183567a(baseFragment7);
                str2 = "public_picker_select_manage_group_view";
                break;
            case 6:
                BaseFragment baseFragment8 = this.f132907G;
                Bundle arguments = baseFragment8 != null ? baseFragment8.getArguments() : null;
                BasePicker.OnPickerParamsLoader<P> mOnPickerParamsLoader = getMOnPickerParamsLoader();
                if (mOnPickerParamsLoader != null) {
                    dVar = (ChatterPickerParams) mOnPickerParamsLoader.onLoadPickerParams();
                }
                if (dVar == null || (arrayList = dVar.mo183691e()) == null) {
                    arrayList = new ArrayList();
                }
                if (!arrayList.isEmpty()) {
                    if ((arrayList.get(0).length() > 0) && arguments != null) {
                        arguments.putString("chat_id", arrayList.get(0));
                    }
                }
                if (arguments != null) {
                    arguments.putBoolean("b2b_connect", this.f132920T);
                }
                BaseFragment baseFragment9 = this.f132907G;
                if (baseFragment9 != null) {
                    baseFragment9.setArguments(arguments);
                }
                BaseFragment baseFragment10 = this.f132907G;
                if (baseFragment10 != null) {
                    mo183567a(baseFragment10);
                }
                str2 = "public_picker_select_associated_organizations_view";
                break;
            case 7:
                BaseFragment baseFragment11 = this.f132903C;
                if (baseFragment11 == null) {
                    Intrinsics.throwNpe();
                }
                mo183567a(baseFragment11);
                str2 = "public_picker_select_email_member_view";
                break;
            default:
                str2 = "";
                break;
        }
        if (str2.length() <= 0) {
            z = false;
        }
        if (z) {
            PickerReporter.f133096a.mo183768c(str2);
        }
    }

    /* renamed from: a */
    public final boolean mo183489a(Chatter chatter, boolean z, int i, String str) {
        SearchChatterInfo a = SearchCommonUtils.m209224a(chatter);
        a.setFromOrganization(true);
        a.setDeniedReason(i);
        a.setMailAddress(str);
        a.selected(!z);
        SearchResultView.IOnBusinessConsumeItem mOnBusinessConsumeItem = getMOnBusinessConsumeItem();
        boolean z2 = false;
        if (mOnBusinessConsumeItem != null && mOnBusinessConsumeItem.mo110049b(a)) {
            return false;
        }
        String mailAddress = a.getMailAddress();
        if (mailAddress == null || StringsKt.isBlank(mailAddress)) {
            z2 = true;
        }
        if (z2) {
            a.setMailAddress(str);
        }
        a.selected(z);
        mo183569a(a, z);
        return true;
    }

    /* renamed from: a */
    public final boolean mo183490a(String str, String str2, boolean z) {
        SearchDepartmentInfo c = SearchCommonUtils.m209232c(str);
        c.selected(!z);
        SearchResultView.IOnBusinessConsumeItem mOnBusinessConsumeItem = getMOnBusinessConsumeItem();
        if (mOnBusinessConsumeItem != null && mOnBusinessConsumeItem.mo110049b(c)) {
            return false;
        }
        c.selected(z);
        c.setTitle(str2);
        mo183569a(c, z);
        return true;
    }

    /* renamed from: a */
    public final boolean mo183488a(Chat chat, boolean z, int i) {
        Log.m165379d("LarkSearch.SearchWidget.AbsChatterPicker", "position: " + i);
        SearchChatInfo a = SearchCommonUtils.m209223a(chat);
        a.selected(z ^ true);
        SearchResultView.IOnBusinessConsumeItem mOnBusinessConsumeItem = getMOnBusinessConsumeItem();
        if (mOnBusinessConsumeItem != null && mOnBusinessConsumeItem.mo110049b(a)) {
            return false;
        }
        PickerReporter.f133096a.mo183764a(chat, z, i);
        a.selected(z);
        mo183569a(a, z);
        return true;
    }

    /* renamed from: g */
    public final void mo183502g() {
        this.f132925b.mo102976d();
    }

    public final Department getCurDepartment() {
        return this.f132925b.mo102970b();
    }

    public final List<String> getSelectedChatIds() {
        return mo183566a(2);
    }

    public final List<String> getSelectedChatterIds() {
        return mo183566a(1);
    }

    public final List<String> getSelectedDepartmentIds() {
        return mo183566a(17);
    }

    public final List<String> getSelectedEmailContactIds() {
        return mo183566a(16);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/search/widget/AbsChatterPicker$initFragmentForBusiness$groupOperationListener$1", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsOwnerGroupController$IOnOperationListener;", "onContactsGroupSelect", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isSelected", "position", "", "onFinish", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$c */
    public static final class C53834c implements SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController.IOnOperationListener {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132938a;

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController.IOnOperationListener
        /* renamed from: a */
        public void mo183528a() {
            AbsChatterPicker.m208355a(this.f132938a, 1, null, 2, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53834c(AbsChatterPicker absChatterPicker) {
            this.f132938a = absChatterPicker;
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController.IOnOperationListener
        /* renamed from: a */
        public boolean mo183529a(Chat chat, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            return this.f132938a.mo183488a(chat, z, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J2\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016J$\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H\u0016¨\u0006\u0019"}, d2 = {"com/ss/android/lark/search/widget/AbsChatterPicker$initFragmentForBusiness$onDepartmentDetailOperationListener$1", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IDepartmentDetailController$IOnOperationListener;", "onBreadcrumbsItemClick", "", "isCollaboration", "", "onClickNextDepartmentLevel", "onContactsChatterClick", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "deniedReason", "", "position", "onContactsChatterSelect", "isSelected", "enterpriseEmail", "", "onContactsDepartmentSelect", "departmentId", "departmentName", "onFinish", "onTitleChange", "newTitle", "onTitleSecLeftVisibleChange", "visible", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$f */
    public static final class C53838f implements SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132941a;

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener
        /* renamed from: a */
        public void mo183544a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "newTitle");
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener
        /* renamed from: a */
        public void mo183545a(boolean z) {
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener
        /* renamed from: a */
        public void mo183542a() {
            AbsChatterPicker.m208355a(this.f132941a, 1, null, 2, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53838f(AbsChatterPicker absChatterPicker) {
            this.f132941a = absChatterPicker;
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener
        /* renamed from: b */
        public void mo183548b(boolean z) {
            String str;
            String str2;
            SafeReporter dVar = SafeReporter.f133151a;
            if (z) {
                str = "public_picker_select_associated_organizations_click";
            } else {
                str = "public_picker_select_architecture_member_click";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "navigation_bar");
            if (z) {
                str2 = "public_picker_select_associated_organizations_view";
            } else {
                str2 = "public_picker_select_architecture_member_view";
            }
            jSONObject.put("target", str2);
            dVar.mo183813a(str, jSONObject);
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener
        /* renamed from: c */
        public void mo183549c(boolean z) {
            String str;
            String str2;
            SafeReporter dVar = SafeReporter.f133151a;
            if (z) {
                str = "public_picker_select_associated_organizations_click";
            } else {
                str = "public_picker_select_architecture_member_click";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "next_level");
            if (z) {
                str2 = "public_picker_select_associated_organizations_view";
            } else {
                str2 = "public_picker_select_architecture_member_view";
            }
            jSONObject.put("target", str2);
            dVar.mo183813a(str, jSONObject);
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener
        /* renamed from: a */
        public void mo183543a(Chatter chatter, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(chatter, "chatter");
            PickerReporter.f133096a.mo183765a(chatter, true, i2);
            AbsChatterPicker.m208357a(this.f132941a, chatter, true, i, null, 8, null);
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener
        /* renamed from: a */
        public boolean mo183547a(String str, String str2, boolean z) {
            return this.f132941a.mo183490a(str, str2, z);
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener
        /* renamed from: a */
        public boolean mo183546a(Chatter chatter, boolean z, int i, String str, int i2) {
            Intrinsics.checkParameterIsNotNull(chatter, "chatter");
            PickerReporter.f133096a.mo183765a(chatter, z, i2);
            return this.f132941a.mo183489a(chatter, z, i, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/search/widget/AbsChatterPicker$initFragmentForEmailContact$1", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IEmailContactController$IOnItemSelectedListener;", "onFinish", "", "onItemSelected", "", "contact", "Lcom/ss/android/lark/contact/entity/EmailContact;", "isSelected", "position", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$h */
    public static final class C53840h implements SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController.IOnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132943a;

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController.IOnItemSelectedListener
        /* renamed from: a */
        public void mo183551a() {
            AbsChatterPicker.m208355a(this.f132943a, 1, null, 2, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53840h(AbsChatterPicker absChatterPicker) {
            this.f132943a = absChatterPicker;
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController.IOnItemSelectedListener
        /* renamed from: a */
        public boolean mo183552a(EmailContact emailContact, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(emailContact, "contact");
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("click", "select");
                jSONObject.put("select_type", PickerReporterConstants.VALUE.TYPE.f133099a.mo183772c());
                jSONObject.put("list_number", i + 1);
            } else {
                jSONObject.put("click", "remove");
            }
            jSONObject.put("target", "public_picker_select_email_member_view");
            dVar.mo183813a("public_picker_select_email_member_click", jSONObject);
            return AbsChatterPicker.m208358a(this.f132943a, emailContact, z, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/search/widget/AbsChatterPicker$initFragmentForBusiness$onContactsSelectorClickListener$1", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController$IOnClickListener;", "onEmailContactClick", "", "onExternalContactClick", "onMineGroupClick", "onNewContactClick", "onOnCallClick", "onOwnerGroupClick", "onRobotClick", "onSchoolParentItemClick", "id", "", "schoolNodePreName", "onSubordinateItemClick", "onTrustPartyItemClick", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$d */
    public static final class C53835d implements SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132939a;

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: a */
        public void mo183530a() {
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: c */
        public void mo183534c() {
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: d */
        public void mo183535d() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "P", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "PK", "Lcom/ss/android/lark/search/widget/BasePicker;", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$d$a */
        static final class RunnableC53836a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53835d f132940a;

            RunnableC53836a(C53835d dVar) {
                this.f132940a = dVar;
            }

            public final void run() {
                this.f132940a.f132939a.f132924a.mo102943a(this.f132940a.f132939a.getSelectedEmailContactIds());
            }
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: b */
        public void mo183533b() {
            Activity b;
            PickerReporterDelegate mReporterDelegate = this.f132939a.getMReporterDelegate();
            if (mReporterDelegate != null) {
                mReporterDelegate.mo134030b();
            }
            BasePicker.IViewDependency mDependency = this.f132939a.getMDependency();
            if (mDependency != null && (b = mDependency.mo110056b()) != null) {
                SearchWidgetModuleDependency.m208511a().mo102926a(b);
            }
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: e */
        public void mo183536e() {
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "external");
            jSONObject.put("target", "public_picker_select_external_view");
            jSONObject.put("scene", this.f132939a.getScene());
            dVar.mo183813a("public_picker_select_click", jSONObject);
            this.f132939a.mo183485a("-1");
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: g */
        public void mo183538g() {
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "manage_group");
            jSONObject.put("target", "public_picker_select_manage_group_view");
            jSONObject.put("scene", this.f132939a.getScene());
            dVar.mo183813a("public_picker_select_click", jSONObject);
            this.f132939a.mo183497d();
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: h */
        public void mo183539h() {
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "associated_organizations");
            jSONObject.put("target", "public_picker_select_associated_organizations_view");
            jSONObject.put("scene", this.f132939a.getScene());
            dVar.mo183813a("public_picker_select_click", jSONObject);
            this.f132939a.mo183495c();
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: f */
        public void mo183537f() {
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "email_member");
            jSONObject.put("target", "public_picker_select_email_member_view");
            jSONObject.put("scene", this.f132939a.getScene());
            dVar.mo183813a("public_picker_select_click", jSONObject);
            this.f132939a.mo183493b();
            AbsChatterPicker.m208355a(this.f132939a, 7, null, 2, null);
            this.f132939a.getMDefaultViewContainer().post(new RunnableC53836a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53835d(AbsChatterPicker absChatterPicker) {
            this.f132939a = absChatterPicker;
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: a */
        public void mo183531a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "architecture_member");
            jSONObject.put("target", "public_picker_select_architecture_member_view");
            jSONObject.put("scene", this.f132939a.getScene());
            dVar.mo183813a("public_picker_select_click", jSONObject);
            this.f132939a.mo183485a(str);
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener
        /* renamed from: a */
        public void mo183532a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "schoolNodePreName");
            this.f132939a.mo183486a(str, str2);
        }
    }

    /* renamed from: p */
    private final void m208360p() {
        this.f132902B = this.f132901A.mo102938a(true, getMIsMultiple(), false, new C53839g(this)).mo102937a();
    }

    /* renamed from: b */
    public final void mo183493b() {
        this.f132903C = this.f132924a.mo102942a(true, getMIsMultiple(), getMIsMultiple(), new C53840h(this)).mo102941a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "P", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "PK", "Lcom/ss/android/lark/search/widget/BasePicker;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$i */
    public static final class RunnableC53841i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132944a;

        /* renamed from: b */
        final /* synthetic */ ChatterPickerParams f132945b;

        RunnableC53841i(AbsChatterPicker absChatterPicker, ChatterPickerParams dVar) {
            this.f132944a = absChatterPicker;
            this.f132945b = dVar;
        }

        public final void run() {
            ArrayList arrayList;
            SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController cVar;
            ChatterPickerParams dVar = this.f132945b;
            if (dVar == null || (arrayList = dVar.mo183691e()) == null) {
                arrayList = new ArrayList();
            }
            if ((!arrayList.isEmpty()) && (cVar = this.f132944a.f132928e) != null) {
                cVar.mo102991a(arrayList);
            }
            SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController cVar2 = this.f132944a.f132928e;
            if (cVar2 != null) {
                cVar2.mo102992b(this.f132944a.getSelectedChatIds());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "P", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "PK", "Lcom/ss/android/lark/search/widget/BasePicker;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$l */
    public static final class RunnableC53845l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132954a;

        /* renamed from: b */
        final /* synthetic */ ChatterPickerParams f132955b;

        RunnableC53845l(AbsChatterPicker absChatterPicker, ChatterPickerParams dVar) {
            this.f132954a = absChatterPicker;
            this.f132955b = dVar;
        }

        public final void run() {
            ArrayList arrayList;
            SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController eVar = this.f132954a.f132926c;
            ChatterPickerParams dVar = this.f132955b;
            if (dVar == null || (arrayList = dVar.mo183655b()) == null) {
                arrayList = new ArrayList();
            }
            eVar.mo102971b(arrayList);
            eVar.mo102968a(this.f132954a.getSelectedChatterIds());
            eVar.mo102972b(this.f132954a.f132929f);
        }
    }

    /* renamed from: o */
    private final void m208359o() {
        if (SearchWidgetModuleDependency.m208511a().mo102929b()) {
            m208360p();
            m208355a(this, 3, null, 2, null);
            return;
        }
        m208361q();
        if (TextUtils.isEmpty(this.f132917Q)) {
            m208355a(this, 1, null, 2, null);
        } else {
            mo183485a(this.f132917Q);
        }
    }

    /* renamed from: c */
    public final void mo183495c() {
        ChatterPickerParams dVar = null;
        m208355a(this, 6, null, 2, null);
        BasePicker.OnPickerParamsLoader<P> mOnPickerParamsLoader = getMOnPickerParamsLoader();
        if (mOnPickerParamsLoader != null) {
            dVar = (ChatterPickerParams) mOnPickerParamsLoader.onLoadPickerParams();
        }
        getMDefaultViewContainer().post(new RunnableC53845l(this, dVar));
    }

    /* renamed from: d */
    public final void mo183497d() {
        ChatterPickerParams dVar = null;
        m208355a(this, 5, null, 2, null);
        BasePicker.OnPickerParamsLoader<P> mOnPickerParamsLoader = getMOnPickerParamsLoader();
        if (mOnPickerParamsLoader != null) {
            dVar = (ChatterPickerParams) mOnPickerParamsLoader.onLoadPickerParams();
        }
        getMDefaultViewContainer().post(new RunnableC53841i(this, dVar));
    }

    /* renamed from: f */
    public boolean mo183501f() {
        if (getMIsSearch()) {
            BasePicker.m208421a(this, false, 1, null);
            return false;
        }
        int i = this.f132916P;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            this.f132925b.mo102973c();
            return false;
        } else if (i == 4) {
            this.f132927d.mo102973c();
            return false;
        } else if (i == 3) {
            return true;
        } else {
            if (i == 5) {
                m208355a(this, 1, null, 2, null);
                return false;
            } else if (i != 6) {
                return true;
            } else {
                this.f132926c.mo102973c();
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "P", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "PK", "Lcom/ss/android/lark/search/widget/BasePicker;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$k */
    public static final class RunnableC53843k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132949a;

        /* renamed from: b */
        final /* synthetic */ ChatterPickerParams f132950b;

        /* renamed from: c */
        final /* synthetic */ String f132951c;

        /* renamed from: d */
        final /* synthetic */ String f132952d;

        RunnableC53843k(AbsChatterPicker absChatterPicker, ChatterPickerParams dVar, String str, String str2) {
            this.f132949a = absChatterPicker;
            this.f132950b = dVar;
            this.f132951c = str;
            this.f132952d = str2;
        }

        public final void run() {
            ArrayList arrayList;
            ChatterPickerParams dVar = this.f132950b;
            if (dVar == null || (arrayList = dVar.mo183691e()) == null) {
                arrayList = new ArrayList();
            }
            boolean z = true;
            if (!arrayList.isEmpty()) {
                if (arrayList.get(0).length() <= 0) {
                    z = false;
                }
                if (z) {
                    this.f132949a.f132927d.mo102967a(this.f132951c, arrayList.get(0), this.f132952d);
                    C57865c.m224576a(new Runnable(this) {
                        /* class com.ss.android.lark.search.widget.AbsChatterPicker.RunnableC53843k.RunnableC538441 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC53843k f132953a;

                        {
                            this.f132953a = r1;
                        }

                        public final void run() {
                            ArrayList arrayList;
                            SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController eVar = this.f132953a.f132949a.f132927d;
                            ChatterPickerParams dVar = this.f132953a.f132950b;
                            if (dVar == null || (arrayList = dVar.mo183655b()) == null) {
                                arrayList = new ArrayList();
                            }
                            eVar.mo102971b(arrayList);
                            this.f132953a.f132949a.f132927d.mo102968a(this.f132953a.f132949a.mo183566a(1));
                            this.f132953a.f132949a.f132927d.mo102972b(this.f132953a.f132949a.f132929f);
                        }
                    });
                }
            }
            this.f132949a.f132927d.mo102967a(this.f132951c, null, this.f132952d);
            C57865c.m224576a(new Runnable(this) {
                /* class com.ss.android.lark.search.widget.AbsChatterPicker.RunnableC53843k.RunnableC538441 */

                /* renamed from: a */
                final /* synthetic */ RunnableC53843k f132953a;

                {
                    this.f132953a = r1;
                }

                public final void run() {
                    ArrayList arrayList;
                    SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController eVar = this.f132953a.f132949a.f132927d;
                    ChatterPickerParams dVar = this.f132953a.f132950b;
                    if (dVar == null || (arrayList = dVar.mo183655b()) == null) {
                        arrayList = new ArrayList();
                    }
                    eVar.mo102971b(arrayList);
                    this.f132953a.f132949a.f132927d.mo102968a(this.f132953a.f132949a.mo183566a(1));
                    this.f132953a.f132949a.f132927d.mo102972b(this.f132953a.f132949a.f132929f);
                }
            });
        }
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: e */
    public void mo183499e() {
        switch (this.f132916P) {
            case 2:
                this.f132925b.mo102968a(getSelectedChatterIds());
                this.f132925b.mo102974c(getSelectedDepartmentIds());
                return;
            case 3:
                this.f132901A.mo102939a(getSelectedChatterIds());
                return;
            case 4:
                this.f132927d.mo102968a(getSelectedChatterIds());
                return;
            case 5:
                SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController cVar = this.f132928e;
                if (cVar != null) {
                    cVar.mo102992b(getSelectedChatIds());
                    return;
                }
                return;
            case 6:
                this.f132926c.mo102968a(getSelectedChatterIds());
                return;
            case 7:
                this.f132924a.mo102943a(getSelectedEmailContactIds());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "P", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "PK", "Lcom/ss/android/lark/search/widget/BasePicker;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$b */
    public static final class RunnableC53833b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132937a;

        RunnableC53833b(AbsChatterPicker absChatterPicker) {
            this.f132937a = absChatterPicker;
        }

        public final void run() {
            this.f132937a.f132933j = System.currentTimeMillis() - this.f132937a.f132932i;
            Log.m165379d("LarkSearch.SearchWidget.AbsChatterPicker", "appreciableRptFirstRenderCost: " + this.f132937a.f132933j + '.');
            AppreciableKit.m107390a(AppreciableKit.f73094h.mo103524a(), this.f132937a.f132930g, this.f132937a.getMPickerUsePage().toString(), MapsKt.mapOf(TuplesKt.to("init_view_cost", Long.valueOf(this.f132937a.f132931h)), TuplesKt.to("first_render", Long.valueOf(this.f132937a.f132933j))), (Map) null, (Map) null, MapsKt.mapOf(TuplesKt.to("from_type", Integer.valueOf(this.f132937a.getMPickerUseCategory().ordinal()))), 24, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "P", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "PK", "Lcom/ss/android/lark/search/widget/BasePicker;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$j */
    public static final class RunnableC53842j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132946a;

        /* renamed from: b */
        final /* synthetic */ ChatterPickerParams f132947b;

        /* renamed from: c */
        final /* synthetic */ String f132948c;

        RunnableC53842j(AbsChatterPicker absChatterPicker, ChatterPickerParams dVar, String str) {
            this.f132946a = absChatterPicker;
            this.f132947b = dVar;
            this.f132948c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.widget.AbsChatterPicker.RunnableC53842j.run():void");
        }
    }

    /* renamed from: q */
    private final void m208361q() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController a;
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController a2;
        C53835d dVar = new C53835d(this);
        C53837e eVar = new C53837e();
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController dVar2 = this.f132904D;
        boolean z11 = this.f132910J;
        boolean z12 = this.f132911K;
        boolean z13 = this.f132912L;
        boolean z14 = this.f132913M;
        boolean z15 = this.f132920T;
        boolean z16 = this.f132914N;
        String string = UIUtils.getString(this.f132935z, R.string.Lark_Legacy_CreateGroupChatSelectGroup);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(mConte…eateGroupChatSelectGroup)");
        dVar2.mo102947a(false, z11, z12, false, false, z13, z14, this.f132919S, z15, z16, string, dVar, eVar);
        ArrayList<ContactsSelectorBusiness> arrayList = new ArrayList();
        for (T t : this.f132921U) {
            if (t instanceof ContactsSelectorBusiness) {
                arrayList.add(t);
            }
        }
        for (ContactsSelectorBusiness aVar : arrayList) {
            aVar.mo183647a(this.f132904D);
        }
        this.f132905E = this.f132904D.mo102946a();
        C53838f fVar = new C53838f(this);
        C53834c cVar = new C53834c(this);
        BasePicker.OnPickerParamsLoader<P> mOnPickerParamsLoader = getMOnPickerParamsLoader();
        BaseFragment baseFragment = null;
        ChatterPickerParams dVar3 = mOnPickerParamsLoader != null ? (ChatterPickerParams) mOnPickerParamsLoader.onLoadPickerParams() : null;
        PickType eVar2 = this.f132934y;
        eVar2.mo183740a(!this.f132922V);
        if (dVar3 != null) {
            z = dVar3.mo183694h();
        } else {
            z = true;
        }
        eVar2.mo183742b(z);
        eVar2.mo183744c(this.aa);
        if (dVar3 != null) {
            z2 = dVar3.mo183706t();
        } else {
            z2 = false;
        }
        eVar2.mo183746d(z2);
        if (dVar3 != null) {
            z3 = dVar3.mo183707u();
        } else {
            z3 = false;
        }
        eVar2.mo183748e(z3);
        eVar2.mo183750f(this.ad);
        if (dVar3 != null) {
            z4 = dVar3.mo183703q();
        } else {
            z4 = true;
        }
        eVar2.mo183752g(z4);
        if (dVar3 != null) {
            z5 = dVar3.mo183704r();
        } else {
            z5 = true;
        }
        eVar2.mo183754h(z5);
        if (dVar3 != null) {
            z6 = dVar3.mo183705s();
        } else {
            z6 = true;
        }
        eVar2.mo183756i(z6);
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController eVar3 = this.f132925b;
        boolean mIsMultiple = getMIsMultiple();
        boolean z17 = !this.ae;
        PickType eVar4 = this.f132934y;
        if (dVar3 != null) {
            z7 = dVar3.mo183696j();
        } else {
            z7 = false;
        }
        if (dVar3 != null) {
            z8 = Boolean.valueOf(dVar3.mo183708v());
        } else {
            z8 = false;
        }
        this.f132906F = eVar3.mo102963a(mIsMultiple, true, eVar4, fVar, z17, true, z7, false, z8).mo102962a();
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController eVar5 = this.f132926c;
        boolean mIsMultiple2 = getMIsMultiple();
        PickType eVar6 = this.f132934y;
        if (dVar3 != null) {
            z9 = dVar3.mo183696j();
        } else {
            z9 = false;
        }
        this.f132907G = eVar5.mo102963a(mIsMultiple2, true, eVar6, fVar, true, true, z9, false, false).mo102962a();
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController eVar7 = this.f132927d;
        boolean mIsMultiple3 = getMIsMultiple();
        PickType eVar8 = this.f132934y;
        if (dVar3 != null) {
            z10 = dVar3.mo183696j();
        } else {
            z10 = false;
        }
        this.f132908H = eVar7.mo102963a(mIsMultiple3, true, eVar8, fVar, true, true, z10, true, false).mo102962a();
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController cVar2 = this.f132928e;
        if (!(cVar2 == null || (a = cVar2.mo102989a(getMIsMultiple(), this.f132934y)) == null || (a2 = a.mo102988a(cVar)) == null)) {
            baseFragment = a2.mo102987a();
        }
        this.f132909I = baseFragment;
    }

    /* access modifiers changed from: protected */
    public final void setAddChatterFromDepartmentBySearch(boolean z) {
        this.ac = z;
    }

    /* access modifiers changed from: protected */
    public final void setMIsDepartmentSelectableWhenVisible(boolean z) {
        this.ae = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/search/widget/AbsChatterPicker$initFragmentForCustomer$1", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactHomeController$IOnItemSelectedListener;", "onItemSelected", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "isSelected", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.AbsChatterPicker$g */
    public static final class C53839g implements SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController.IOnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ AbsChatterPicker f132942a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53839g(AbsChatterPicker absChatterPicker) {
            this.f132942a = absChatterPicker;
        }

        @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController.IOnItemSelectedListener
        /* renamed from: a */
        public void mo183550a(Chatter chatter, boolean z) {
            Intrinsics.checkParameterIsNotNull(chatter, "chatter");
            AbsChatterPicker.m208357a(this.f132942a, chatter, z, 0, null, 12, null);
        }
    }

    /* renamed from: a */
    public final PK mo183480a(boolean z) {
        this.f132919S = z;
        return mo183602m();
    }

    /* renamed from: b */
    public final PK mo183492b(boolean z) {
        this.f132910J = z;
        return mo183602m();
    }

    /* renamed from: c */
    public final PK mo183494c(boolean z) {
        this.f132911K = z;
        return mo183602m();
    }

    /* renamed from: d */
    public final PK mo183496d(boolean z) {
        this.f132912L = z;
        return mo183602m();
    }

    /* renamed from: e */
    public final PK mo183498e(boolean z) {
        this.f132913M = z;
        return mo183602m();
    }

    /* renamed from: f */
    public final PK mo183500f(boolean z) {
        this.f132914N = z;
        return mo183602m();
    }

    /* renamed from: h */
    public final AbsChatterPicker<P, PK> mo183512h(boolean z) {
        AbsChatterPicker<P, PK> absChatterPicker = this;
        absChatterPicker.f132922V = z;
        return absChatterPicker;
    }

    /* renamed from: j */
    public final AbsChatterPicker<P, PK> mo183514j(boolean z) {
        AbsChatterPicker<P, PK> absChatterPicker = this;
        absChatterPicker.f132923W = z;
        return absChatterPicker;
    }

    /* renamed from: k */
    public final AbsChatterPicker<P, PK> mo183515k(boolean z) {
        AbsChatterPicker<P, PK> absChatterPicker = this;
        absChatterPicker.ab = z;
        return absChatterPicker;
    }

    /* renamed from: l */
    public final AbsChatterPicker<P, PK> mo183516l(boolean z) {
        AbsChatterPicker<P, PK> absChatterPicker = this;
        absChatterPicker.ac = z;
        absChatterPicker.ad = z;
        return absChatterPicker;
    }

    /* renamed from: m */
    public final AbsChatterPicker<P, PK> mo183517m(boolean z) {
        AbsChatterPicker<P, PK> absChatterPicker = this;
        absChatterPicker.ac = z;
        return absChatterPicker;
    }

    /* renamed from: n */
    public final PK mo183518n(boolean z) {
        this.f132920T = z;
        return mo183602m();
    }

    /* renamed from: o */
    public final PK mo183519o(boolean z) {
        this.ae = z;
        return mo183602m();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbsChatterPicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final PK mo183479a(ICustomBusiness<?> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "customBusiness");
        this.f132921U.add(bVar);
        return mo183602m();
    }

    /* renamed from: b */
    public final PK mo183491b(String str) {
        if (str == null) {
            str = "";
        }
        this.f132917Q = str;
        return mo183602m();
    }

    /* renamed from: i */
    public final AbsChatterPicker<P, PK> mo183513i(boolean z) {
        AbsChatterPicker<P, PK> absChatterPicker = this;
        absChatterPicker.f132923W = z;
        absChatterPicker.aa = z;
        absChatterPicker.ac = z;
        absChatterPicker.ad = z;
        return absChatterPicker;
    }

    @Override // com.ss.android.lark.search.widget.BasePicker
    /* renamed from: g */
    public void mo183503g(boolean z) {
        super.mo183503g(z);
        if (SearchWidgetModuleDependency.m208511a().mo102929b()) {
            this.f132901A.mo102940a(z);
        } else {
            this.f132925b.mo102975c(z);
        }
    }

    public final void setAddChatterFromChat(boolean z) {
        this.f132923W = z;
        this.aa = z;
        PickType eVar = this.f132934y;
        eVar.mo183744c(z);
        this.f132925b.mo102964a(eVar);
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController cVar = this.f132928e;
        if (cVar != null) {
            cVar.mo102990a(eVar);
        }
    }

    public final void setAddChatterFromChatAndDepartment(boolean z) {
        this.f132923W = z;
        this.ac = z;
        this.aa = z;
        this.ad = z;
        PickType eVar = this.f132934y;
        eVar.mo183744c(z);
        eVar.mo183750f(this.ad);
        this.f132925b.mo102964a(eVar);
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController cVar = this.f132928e;
        if (cVar != null) {
            cVar.mo102990a(eVar);
        }
    }

    public final void setAddChatterFromDepartment(boolean z) {
        this.ac = z;
        this.ad = z;
        PickType eVar = this.f132934y;
        eVar.mo183750f(z);
        this.f132925b.mo102964a(eVar);
        SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController cVar = this.f132928e;
        if (cVar != null) {
            cVar.mo102990a(eVar);
        }
    }

    public final void setDisableEmailContact(boolean z) {
        this.f132915O = z;
        mo183607s(z);
        this.f132925b.mo102972b(this.f132915O);
        this.f132904D.mo102950b(!z);
    }

    public final void setDisableExternalChatter(boolean z) {
        this.f132929f = z;
        mo183606r(z);
        this.f132925b.mo102972b(this.f132929f);
        this.f132904D.mo102949a(!z);
    }

    /* renamed from: a */
    private final SearchMailContactInfo m208354a(EmailContact emailContact) {
        String a = emailContact.mo130495a();
        String str = "";
        if (a == null) {
            a = str;
        }
        String d = emailContact.mo130498d();
        if (d == null) {
            d = str;
        }
        SearchMailContactInfo searchMailContactInfo = new SearchMailContactInfo(a, d, MailContactMeta.ContactType.NAME_CARD);
        String a2 = emailContact.mo130495a();
        if (a2 == null) {
            a2 = emailContact.mo130498d();
        }
        if (a2 != null) {
            str = a2;
        }
        searchMailContactInfo.setId(str);
        searchMailContactInfo.setAvatarKey(emailContact.mo130496b());
        searchMailContactInfo.setTitle(emailContact.mo130497c());
        searchMailContactInfo.setSubTitle(emailContact.mo130498d());
        return searchMailContactInfo;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsChatterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f132934y = new PickType();
        this.f132901A = SearchWidgetModuleDependency.m208511a().mo102930c();
        this.f132924a = SearchWidgetModuleDependency.m208511a().mo102931d();
        this.f132904D = SearchWidgetModuleDependency.m208511a().mo102932e();
        this.f132925b = SearchWidgetModuleDependency.m208511a().mo102933f();
        this.f132926c = SearchWidgetModuleDependency.m208511a().mo102933f();
        this.f132927d = SearchWidgetModuleDependency.m208511a().mo102933f();
        this.f132928e = SearchWidgetModuleDependency.m208511a().mo102935h();
        this.f132913M = true;
        this.f132916P = 1;
        String str = "";
        this.f132917Q = str;
        this.f132918R = str;
        this.f132931h = -1;
        this.f132932i = System.currentTimeMillis();
        this.f132933j = -1;
        this.f132921U = new LinkedHashSet();
        Log.m165379d("LarkSearch.SearchWidget.AbsChatterPicker", "constructor, AbsChatterPicker.");
        this.f132930g = AppreciableKit.f73094h.mo103524a().mo103508a(Biz.Messenger, Scene.Picker, Event.enter_picker, "", false);
        this.f132935z = context;
        String g = SearchWidgetModuleDependency.m208511a().mo102934g();
        this.f132918R = g != null ? g : str;
    }

    /* renamed from: a */
    public SearchContext mo183481a(SearchContext searchContext, P p) {
        Intrinsics.checkParameterIsNotNull(searchContext, "searchContext");
        if (p == null) {
            searchContext.mo184391a(Scene.Type.ADD_CHAT_CHATTERS);
        } else if (p.mo183697k()) {
            searchContext.mo184391a(Scene.Type.SEARCH_CHATTERS);
            searchContext.mo184428l(p.mo183698l());
            searchContext.mo184430m(p.mo183699m());
            searchContext.mo184438q(p.mo183700n());
            searchContext.mo184440r(p.mo183701o());
            searchContext.mo184407c(p.mo183694h());
        } else {
            searchContext.mo184391a(Scene.Type.ADD_CHAT_CHATTERS);
            List<String> c = searchContext.mo184404c();
            c.clear();
            c.addAll(p.mo183691e());
            searchContext.mo184396a(p.mo183692f());
            searchContext.mo184403b(p.mo183693g());
            searchContext.mo184407c(p.mo183694h());
            searchContext.mo184422i(p.mo183695i());
            searchContext.mo184424j(p.mo183702p());
            searchContext.mo184410d(this.f132922V);
            searchContext.mo184413e(this.f132923W);
            searchContext.mo184416f(this.ab);
            searchContext.mo184418g(this.ac);
            searchContext.mo184420h(this.ae);
        }
        return searchContext;
    }

    /* renamed from: a */
    private final boolean m208356a(EmailContact emailContact, boolean z, int i) {
        SearchMailContactInfo a = m208354a(emailContact);
        a.selected(!z);
        SearchResultView.IOnBusinessConsumeItem mOnBusinessConsumeItem = getMOnBusinessConsumeItem();
        if (mOnBusinessConsumeItem != null && mOnBusinessConsumeItem.mo110049b(a)) {
            return false;
        }
        a.selected(z);
        mo183569a(a, z);
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ void m208355a(AbsChatterPicker absChatterPicker, int i, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            absChatterPicker.mo183484a(i, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFragment");
    }

    /* renamed from: a */
    static /* synthetic */ boolean m208358a(AbsChatterPicker absChatterPicker, EmailContact emailContact, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return absChatterPicker.m208356a(emailContact, z, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEmailContactPick");
    }

    /* renamed from: a */
    static /* synthetic */ boolean m208357a(AbsChatterPicker absChatterPicker, Chatter chatter, boolean z, int i, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                str = null;
            }
            return absChatterPicker.mo183489a(chatter, z, i, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onOrganizationChatterPick");
    }
}
