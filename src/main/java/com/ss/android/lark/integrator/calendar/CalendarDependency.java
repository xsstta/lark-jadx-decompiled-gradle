package com.ss.android.lark.integrator.calendar;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.dependency.idependency.IAccountChangeDependency;
import com.ss.android.lark.calendar.dependency.idependency.IAppLifeCycleDependency;
import com.ss.android.lark.calendar.dependency.idependency.ICommonDependency;
import com.ss.android.lark.calendar.dependency.idependency.IDynamicConfigModuleDependency;
import com.ss.android.lark.calendar.dependency.idependency.ILeanModeGatingDependency;
import com.ss.android.lark.calendar.dependency.idependency.IMagicDependency;
import com.ss.android.lark.calendar.dependency.idependency.IPerfDependency;
import com.ss.android.lark.calendar.dependency.idependency.IPoiPickDependency;
import com.ss.android.lark.calendar.dependency.idependency.IQrCodeDependency;
import com.ss.android.lark.calendar.p1430a.AbstractC30060b;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30029ab;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30033ac;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30034ad;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30035ae;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30036af;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30040ai;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30041c;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30042d;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30043e;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30044f;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30046i;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30047j;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30048l;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30049m;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30050n;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30051o;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30053r;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30055u;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30056v;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30058x;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30059z;
import com.ss.android.lark.calendar.wrapper.dependency.AppRouter;
import com.ss.android.lark.integrator.calendar.dependency.C39187aa;
import com.ss.android.lark.integrator.calendar.dependency.C39190ab;
import com.ss.android.lark.integrator.calendar.dependency.C39191ac;
import com.ss.android.lark.integrator.calendar.dependency.C39192ad;
import com.ss.android.lark.integrator.calendar.dependency.C39193ae;
import com.ss.android.lark.integrator.calendar.dependency.C39197ag;
import com.ss.android.lark.integrator.calendar.dependency.C39205e;
import com.ss.android.lark.integrator.calendar.dependency.C39206f;
import com.ss.android.lark.integrator.calendar.dependency.C39209h;
import com.ss.android.lark.integrator.calendar.dependency.C39215i;
import com.ss.android.lark.integrator.calendar.dependency.C39216k;
import com.ss.android.lark.integrator.calendar.dependency.C39217n;
import com.ss.android.lark.integrator.calendar.dependency.C39218o;
import com.ss.android.lark.integrator.calendar.dependency.C39219q;
import com.ss.android.lark.integrator.calendar.dependency.C39221r;
import com.ss.android.lark.integrator.calendar.dependency.C39223t;
import com.ss.android.lark.integrator.calendar.dependency.C39224u;
import com.ss.android.lark.integrator.calendar.dependency.C39226y;
import com.ss.android.lark.integrator.calendar.dependency.CalAccountChangeDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalAppLifeCycleDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalAppLink;
import com.ss.android.lark.integrator.calendar.dependency.CalCommonDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalDynamicConfigModuleDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalGroupMemberManagerDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalGuideModuleDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalLeanModeGating;
import com.ss.android.lark.integrator.calendar.dependency.CalMagicDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalPerfDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalPhoneDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalPoiPickDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalQrCodeDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalTimeFormatDependency;
import com.ss.android.lark.integrator.calendar.dependency.CalVchat;
import com.ss.android.lark.integrator.calendar.dependency.CalZenModeDependency;
import com.ss.android.lark.integrator.calendar.dependency.http.CalendarHttpRequest;
import com.ss.android.lark.integrator.calendar.dependency.p2002a.C39182a;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@ClaymoreImpl(AbstractC30060b.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\t\u0010¸\u0001\u001a\u00020\u0019H\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00106\u001a\u000207H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010@\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020FH\u0016J\t\u0010¹\u0001\u001a\u00020\u001eH\u0016J\b\u0010J\u001a\u00020KH\u0016J\b\u0010O\u001a\u00020PH\u0016J\b\u0010T\u001a\u00020UH\u0016J\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010^\u001a\u00020_H\u0016J\b\u0010c\u001a\u00020dH\u0016J\b\u0010h\u001a\u00020iH\u0016J\t\u0010º\u0001\u001a\u00020#H\u0016J\b\u0010m\u001a\u00020nH\u0016J\b\u0010r\u001a\u00020sH\u0016J\b\u0010w\u001a\u00020xH\u0016J\b\u0010|\u001a\u00020}H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030 \u0001H\u0016J\n\u0010¤\u0001\u001a\u00030¥\u0001H\u0016J\n\u0010©\u0001\u001a\u00030ª\u0001H\u0016J\n\u0010®\u0001\u001a\u00030¯\u0001H\u0016J\n\u0010³\u0001\u001a\u00030´\u0001H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002078BX\u0002¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020A8BX\u0002¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bB\u0010CR\u001b\u0010E\u001a\u00020F8BX\u0002¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\bG\u0010HR\u001b\u0010J\u001a\u00020K8BX\u0002¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\bL\u0010MR\u001b\u0010O\u001a\u00020P8BX\u0002¢\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\bQ\u0010RR\u001b\u0010T\u001a\u00020U8BX\u0002¢\u0006\f\n\u0004\bX\u0010\b\u001a\u0004\bV\u0010WR\u001b\u0010Y\u001a\u00020Z8BX\u0002¢\u0006\f\n\u0004\b]\u0010\b\u001a\u0004\b[\u0010\\R\u001b\u0010^\u001a\u00020_8BX\u0002¢\u0006\f\n\u0004\bb\u0010\b\u001a\u0004\b`\u0010aR\u001b\u0010c\u001a\u00020d8BX\u0002¢\u0006\f\n\u0004\bg\u0010\b\u001a\u0004\be\u0010fR\u001b\u0010h\u001a\u00020i8BX\u0002¢\u0006\f\n\u0004\bl\u0010\b\u001a\u0004\bj\u0010kR\u001b\u0010m\u001a\u00020n8BX\u0002¢\u0006\f\n\u0004\bq\u0010\b\u001a\u0004\bo\u0010pR\u001b\u0010r\u001a\u00020s8BX\u0002¢\u0006\f\n\u0004\bv\u0010\b\u001a\u0004\bt\u0010uR\u001b\u0010w\u001a\u00020x8BX\u0002¢\u0006\f\n\u0004\b{\u0010\b\u001a\u0004\by\u0010zR\u001c\u0010|\u001a\u00020}8BX\u0002¢\u0006\r\n\u0005\b\u0001\u0010\b\u001a\u0004\b~\u0010R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\b\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\b\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\b\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\b\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\b\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\b\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030 \u00018BX\u0002¢\u0006\u000f\n\u0005\b£\u0001\u0010\b\u001a\u0006\b¡\u0001\u0010¢\u0001R \u0010¤\u0001\u001a\u00030¥\u00018BX\u0002¢\u0006\u000f\n\u0005\b¨\u0001\u0010\b\u001a\u0006\b¦\u0001\u0010§\u0001R \u0010©\u0001\u001a\u00030ª\u00018BX\u0002¢\u0006\u000f\n\u0005\b­\u0001\u0010\b\u001a\u0006\b«\u0001\u0010¬\u0001R \u0010®\u0001\u001a\u00030¯\u00018BX\u0002¢\u0006\u000f\n\u0005\b²\u0001\u0010\b\u001a\u0006\b°\u0001\u0010±\u0001R \u0010³\u0001\u001a\u00030´\u00018BX\u0002¢\u0006\u000f\n\u0005\b·\u0001\u0010\b\u001a\u0006\bµ\u0001\u0010¶\u0001¨\u0006»\u0001"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/CalendarDependency;", "Lcom/ss/android/lark/calendar/dependency/ICalDependency;", "()V", "appLifeCycleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency;", "getAppLifeCycleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency;", "appLifeCycleDependency$delegate", "Lkotlin/Lazy;", "appLinkDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLinkDependency;", "getAppLinkDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IAppLinkDependency;", "appLinkDependency$delegate", "appRouter", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppRouterDependency;", "getAppRouter", "()Lcom/ss/android/lark/calendar/dependency/idependency/IAppRouterDependency;", "appRouter$delegate", "browserModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IBrowserModuleDependency;", "getBrowserModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IBrowserModuleDependency;", "browserModuleDependency$delegate", "calAccountChangeDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IAccountChangeDependency;", "getCalAccountChangeDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IAccountChangeDependency;", "calAccountChangeDependency$delegate", "calHttpRequestDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ICalHttpRequestDependency;", "getCalHttpRequestDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ICalHttpRequestDependency;", "calHttpRequestDependency$delegate", "calMagicDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IMagicDependency;", "getCalMagicDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IMagicDependency;", "calMagicDependency$delegate", "calPhoneDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IPhoneDependency;", "getCalPhoneDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IPhoneDependency;", "calPhoneDependency$delegate", "chatModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IChatModuleDependency;", "getChatModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IChatModuleDependency;", "chatModuleDependency$delegate", "commonDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ICommonDependency;", "getCommonDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ICommonDependency;", "commonDependency$delegate", "contactModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IContactModuleDependency;", "getContactModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IContactModuleDependency;", "contactModuleDependency$delegate", "coreModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ICoreModuleDependency;", "getCoreModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ICoreModuleDependency;", "coreModuleDependency$delegate", "dynamicConfigModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IDynamicConfigModuleDependency;", "getDynamicConfigModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IDynamicConfigModuleDependency;", "dynamicConfigModuleDependency$delegate", "featureGatingDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IFeatureGatingDependency;", "getFeatureGatingDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IFeatureGatingDependency;", "featureGatingDependency$delegate", "groupMemberManageDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IGroupMemberManagerDependency;", "getGroupMemberManageDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IGroupMemberManagerDependency;", "groupMemberManageDependency$delegate", "guideModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IGuideModuleDependency;", "getGuideModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IGuideModuleDependency;", "guideModuleDependency$delegate", "imageDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IImageDependency;", "getImageDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IImageDependency;", "imageDependency$delegate", "languageDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILanguageDependency;", "getLanguageDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ILanguageDependency;", "languageDependency$delegate", "leanModeGatingDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILeanModeGatingDependency;", "getLeanModeGatingDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ILeanModeGatingDependency;", "leanModeGatingDependency$delegate", "locationDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILocationDependency;", "getLocationDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ILocationDependency;", "locationDependency$delegate", "loginDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILoginDependency;", "getLoginDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ILoginDependency;", "loginDependency$delegate", "mainModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IMainModuleDependency;", "getMainModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IMainModuleDependency;", "mainModuleDependency$delegate", "oldModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IOldModuleDependency;", "getOldModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IOldModuleDependency;", "oldModuleDependency$delegate", "perfDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IPerfDependency;", "getPerfDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IPerfDependency;", "perfDependency$delegate", "poiPickDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IPoiPickDependency;", "getPoiPickDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IPoiPickDependency;", "poiPickDependency$delegate", "pushDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IPushDependency;", "getPushDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IPushDependency;", "pushDependency$delegate", "qrCodeDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IQrCodeDependency;", "getQrCodeDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IQrCodeDependency;", "qrCodeDependency$delegate", "rxScheduledExecutorDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IRxScheduledExecutorDependency;", "getRxScheduledExecutorDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IRxScheduledExecutorDependency;", "rxScheduledExecutorDependency$delegate", "searchModuleDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ISearchModuleDependency;", "getSearchModuleDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ISearchModuleDependency;", "searchModuleDependency$delegate", "settingDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ISettingDependnecy;", "getSettingDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ISettingDependnecy;", "settingDependency$delegate", "spDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ISpDependency;", "getSpDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ISpDependency;", "spDependency$delegate", "statisticsDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IStatisticsDependency;", "getStatisticsDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IStatisticsDependency;", "statisticsDependency$delegate", "timeFormatDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency;", "getTimeFormatDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency;", "timeFormatDependency$delegate", "utilsDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IUtilsDependency;", "getUtilsDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IUtilsDependency;", "utilsDependency$delegate", "vchatDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IVchatDependency;", "getVchatDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IVchatDependency;", "vchatDependency$delegate", "zenModeDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IZenModeDependency;", "getZenModeDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/IZenModeDependency;", "zenModeDependency$delegate", "accountChangeDependency", "getHttpRequestDependency", "magicDependency", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarDependency implements AbstractC30060b {
    private final Lazy appLifeCycleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39146a.INSTANCE);
    private final Lazy appLinkDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39156b.INSTANCE);
    private final Lazy appRouter$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39157c.INSTANCE);
    private final Lazy browserModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39158d.INSTANCE);
    private final Lazy calAccountChangeDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39159e.INSTANCE);
    private final Lazy calHttpRequestDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39160f.INSTANCE);
    private final Lazy calMagicDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39161g.INSTANCE);
    private final Lazy calPhoneDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39162h.INSTANCE);
    private final Lazy chatModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39163i.INSTANCE);
    private final Lazy commonDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39164j.INSTANCE);
    private final Lazy contactModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39165k.INSTANCE);
    private final Lazy coreModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39166l.INSTANCE);
    private final Lazy dynamicConfigModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39167m.INSTANCE);
    private final Lazy featureGatingDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39168n.INSTANCE);
    private final Lazy groupMemberManageDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39169o.INSTANCE);
    private final Lazy guideModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39170p.INSTANCE);
    private final Lazy imageDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39171q.INSTANCE);
    private final Lazy languageDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39172r.INSTANCE);
    private final Lazy leanModeGatingDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39173s.INSTANCE);
    private final Lazy locationDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39174t.INSTANCE);
    private final Lazy loginDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39175u.INSTANCE);
    private final Lazy mainModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39176v.INSTANCE);
    private final Lazy oldModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39177w.INSTANCE);
    private final Lazy perfDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39178x.INSTANCE);
    private final Lazy poiPickDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39179y.INSTANCE);
    private final Lazy pushDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39180z.INSTANCE);
    private final Lazy qrCodeDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39147aa.INSTANCE);
    private final Lazy rxScheduledExecutorDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39148ab.INSTANCE);
    private final Lazy searchModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39149ac.INSTANCE);
    private final Lazy settingDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39150ad.INSTANCE);
    private final Lazy spDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39151ae.INSTANCE);
    private final Lazy statisticsDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39152af.INSTANCE);
    private final Lazy timeFormatDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39153ag.INSTANCE);
    private final Lazy utilsDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39154ah.INSTANCE);
    private final Lazy vchatDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39155ai.INSTANCE);
    private final Lazy zenModeDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) aj.INSTANCE);

    private final IAppLifeCycleDependency getAppLifeCycleDependency() {
        return (IAppLifeCycleDependency) this.appLifeCycleDependency$delegate.getValue();
    }

    private final AbstractC30041c getAppLinkDependency() {
        return (AbstractC30041c) this.appLinkDependency$delegate.getValue();
    }

    private final AbstractC30042d getAppRouter() {
        return (AbstractC30042d) this.appRouter$delegate.getValue();
    }

    private final AbstractC30043e getBrowserModuleDependency() {
        return (AbstractC30043e) this.browserModuleDependency$delegate.getValue();
    }

    private final IAccountChangeDependency getCalAccountChangeDependency() {
        return (IAccountChangeDependency) this.calAccountChangeDependency$delegate.getValue();
    }

    private final AbstractC30044f getCalHttpRequestDependency() {
        return (AbstractC30044f) this.calHttpRequestDependency$delegate.getValue();
    }

    private final IMagicDependency getCalMagicDependency() {
        return (IMagicDependency) this.calMagicDependency$delegate.getValue();
    }

    private final AbstractC30058x getCalPhoneDependency() {
        return (AbstractC30058x) this.calPhoneDependency$delegate.getValue();
    }

    private final AbstractC30045g getChatModuleDependency() {
        return (AbstractC30045g) this.chatModuleDependency$delegate.getValue();
    }

    private final ICommonDependency getCommonDependency() {
        return (ICommonDependency) this.commonDependency$delegate.getValue();
    }

    private final AbstractC30046i getContactModuleDependency() {
        return (AbstractC30046i) this.contactModuleDependency$delegate.getValue();
    }

    private final AbstractC30047j getCoreModuleDependency() {
        return (AbstractC30047j) this.coreModuleDependency$delegate.getValue();
    }

    private final IDynamicConfigModuleDependency getDynamicConfigModuleDependency() {
        return (IDynamicConfigModuleDependency) this.dynamicConfigModuleDependency$delegate.getValue();
    }

    private final AbstractC30048l getFeatureGatingDependency() {
        return (AbstractC30048l) this.featureGatingDependency$delegate.getValue();
    }

    private final AbstractC30049m getGroupMemberManageDependency() {
        return (AbstractC30049m) this.groupMemberManageDependency$delegate.getValue();
    }

    private final AbstractC30050n getGuideModuleDependency() {
        return (AbstractC30050n) this.guideModuleDependency$delegate.getValue();
    }

    private final AbstractC30051o getImageDependency() {
        return (AbstractC30051o) this.imageDependency$delegate.getValue();
    }

    private final AbstractC30052p getLanguageDependency() {
        return (AbstractC30052p) this.languageDependency$delegate.getValue();
    }

    private final ILeanModeGatingDependency getLeanModeGatingDependency() {
        return (ILeanModeGatingDependency) this.leanModeGatingDependency$delegate.getValue();
    }

    private final AbstractC30053r getLocationDependency() {
        return (AbstractC30053r) this.locationDependency$delegate.getValue();
    }

    private final AbstractC30054s getLoginDependency() {
        return (AbstractC30054s) this.loginDependency$delegate.getValue();
    }

    private final AbstractC30055u getMainModuleDependency() {
        return (AbstractC30055u) this.mainModuleDependency$delegate.getValue();
    }

    private final AbstractC30056v getOldModuleDependency() {
        return (AbstractC30056v) this.oldModuleDependency$delegate.getValue();
    }

    private final IPerfDependency getPerfDependency() {
        return (IPerfDependency) this.perfDependency$delegate.getValue();
    }

    private final IPoiPickDependency getPoiPickDependency() {
        return (IPoiPickDependency) this.poiPickDependency$delegate.getValue();
    }

    private final AbstractC30059z getPushDependency() {
        return (AbstractC30059z) this.pushDependency$delegate.getValue();
    }

    private final IQrCodeDependency getQrCodeDependency() {
        return (IQrCodeDependency) this.qrCodeDependency$delegate.getValue();
    }

    private final AbstractC30029ab getRxScheduledExecutorDependency() {
        return (AbstractC30029ab) this.rxScheduledExecutorDependency$delegate.getValue();
    }

    private final AbstractC30033ac getSearchModuleDependency() {
        return (AbstractC30033ac) this.searchModuleDependency$delegate.getValue();
    }

    private final AbstractC30034ad getSettingDependency() {
        return (AbstractC30034ad) this.settingDependency$delegate.getValue();
    }

    private final AbstractC30035ae getSpDependency() {
        return (AbstractC30035ae) this.spDependency$delegate.getValue();
    }

    private final AbstractC30036af getStatisticsDependency() {
        return (AbstractC30036af) this.statisticsDependency$delegate.getValue();
    }

    private final AbstractC30037ag getTimeFormatDependency() {
        return (AbstractC30037ag) this.timeFormatDependency$delegate.getValue();
    }

    private final AbstractC30039ah getUtilsDependency() {
        return (AbstractC30039ah) this.utilsDependency$delegate.getValue();
    }

    private final AbstractC30040ai getVchatDependency() {
        return (AbstractC30040ai) this.vchatDependency$delegate.getValue();
    }

    private final com.ss.android.lark.calendar.p1430a.p1431a.aj getZenModeDependency() {
        return (com.ss.android.lark.calendar.p1430a.p1431a.aj) this.zenModeDependency$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalAppLifeCycleDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$a */
    static final class C39146a extends Lambda implements Function0<CalAppLifeCycleDependency> {
        public static final C39146a INSTANCE = new C39146a();

        C39146a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalAppLifeCycleDependency invoke() {
            return new CalAppLifeCycleDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalQrCodeDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$aa */
    static final class C39147aa extends Lambda implements Function0<CalQrCodeDependency> {
        public static final C39147aa INSTANCE = new C39147aa();

        C39147aa() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalQrCodeDependency invoke() {
            return new CalQrCodeDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalRxScheduledExecutor;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$ab */
    static final class C39148ab extends Lambda implements Function0<C39187aa> {
        public static final C39148ab INSTANCE = new C39148ab();

        C39148ab() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39187aa invoke() {
            return new C39187aa();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalSearchModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$ac */
    static final class C39149ac extends Lambda implements Function0<C39190ab> {
        public static final C39149ac INSTANCE = new C39149ac();

        C39149ac() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39190ab invoke() {
            return new C39190ab();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalSetting;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$ad */
    static final class C39150ad extends Lambda implements Function0<C39191ac> {
        public static final C39150ad INSTANCE = new C39150ad();

        C39150ad() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39191ac invoke() {
            return new C39191ac();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalSp;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$ae */
    static final class C39151ae extends Lambda implements Function0<C39192ad> {
        public static final C39151ae INSTANCE = new C39151ae();

        C39151ae() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39192ad invoke() {
            return new C39192ad();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalStatistics;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$af */
    static final class C39152af extends Lambda implements Function0<C39193ae> {
        public static final C39152af INSTANCE = new C39152af();

        C39152af() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39193ae invoke() {
            return new C39193ae();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalTimeFormatDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$ag */
    static final class C39153ag extends Lambda implements Function0<CalTimeFormatDependency> {
        public static final C39153ag INSTANCE = new C39153ag();

        C39153ag() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalTimeFormatDependency invoke() {
            return new CalTimeFormatDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalUtils;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$ah */
    static final class C39154ah extends Lambda implements Function0<C39197ag> {
        public static final C39154ah INSTANCE = new C39154ah();

        C39154ah() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39197ag invoke() {
            return new C39197ag();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalVchat;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$ai */
    static final class C39155ai extends Lambda implements Function0<CalVchat> {
        public static final C39155ai INSTANCE = new C39155ai();

        C39155ai() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalVchat invoke() {
            return new CalVchat();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalZenModeDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    static final class aj extends Lambda implements Function0<CalZenModeDependency> {
        public static final aj INSTANCE = new aj();

        aj() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalZenModeDependency invoke() {
            return new CalZenModeDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalAppLink;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$b */
    static final class C39156b extends Lambda implements Function0<CalAppLink> {
        public static final C39156b INSTANCE = new C39156b();

        C39156b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalAppLink invoke() {
            return new CalAppLink();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/wrapper/dependency/AppRouter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$c */
    static final class C39157c extends Lambda implements Function0<AppRouter> {
        public static final C39157c INSTANCE = new C39157c();

        C39157c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppRouter invoke() {
            return new AppRouter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalBrowserModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$d */
    static final class C39158d extends Lambda implements Function0<C39205e> {
        public static final C39158d INSTANCE = new C39158d();

        C39158d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39205e invoke() {
            return new C39205e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalAccountChangeDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$e */
    static final class C39159e extends Lambda implements Function0<CalAccountChangeDependency> {
        public static final C39159e INSTANCE = new C39159e();

        C39159e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalAccountChangeDependency invoke() {
            return new CalAccountChangeDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpRequest;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$f */
    static final class C39160f extends Lambda implements Function0<CalendarHttpRequest> {
        public static final C39160f INSTANCE = new C39160f();

        C39160f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarHttpRequest invoke() {
            return new CalendarHttpRequest();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalMagicDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$g */
    static final class C39161g extends Lambda implements Function0<CalMagicDependency> {
        public static final C39161g INSTANCE = new C39161g();

        C39161g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalMagicDependency invoke() {
            return new CalMagicDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalPhoneDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$h */
    static final class C39162h extends Lambda implements Function0<CalPhoneDependency> {
        public static final C39162h INSTANCE = new C39162h();

        C39162h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalPhoneDependency invoke() {
            return new CalPhoneDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalChatModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$i */
    static final class C39163i extends Lambda implements Function0<C39206f> {
        public static final C39163i INSTANCE = new C39163i();

        C39163i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39206f invoke() {
            return new C39206f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalCommonDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$j */
    static final class C39164j extends Lambda implements Function0<CalCommonDependency> {
        public static final C39164j INSTANCE = new C39164j();

        C39164j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalCommonDependency invoke() {
            return new CalCommonDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalContactModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$k */
    static final class C39165k extends Lambda implements Function0<C39209h> {
        public static final C39165k INSTANCE = new C39165k();

        C39165k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39209h invoke() {
            return new C39209h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalCoreModuleDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$l */
    static final class C39166l extends Lambda implements Function0<C39215i> {
        public static final C39166l INSTANCE = new C39166l();

        C39166l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39215i invoke() {
            return new C39215i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalDynamicConfigModuleDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$m */
    static final class C39167m extends Lambda implements Function0<CalDynamicConfigModuleDependency> {
        public static final C39167m INSTANCE = new C39167m();

        C39167m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalDynamicConfigModuleDependency invoke() {
            return new CalDynamicConfigModuleDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalFeatureGating;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$n */
    static final class C39168n extends Lambda implements Function0<C39216k> {
        public static final C39168n INSTANCE = new C39168n();

        C39168n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39216k invoke() {
            return new C39216k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalGroupMemberManagerDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$o */
    static final class C39169o extends Lambda implements Function0<CalGroupMemberManagerDependency> {
        public static final C39169o INSTANCE = new C39169o();

        C39169o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalGroupMemberManagerDependency invoke() {
            return new CalGroupMemberManagerDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalGuideModuleDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$p */
    static final class C39170p extends Lambda implements Function0<CalGuideModuleDependency> {
        public static final C39170p INSTANCE = new C39170p();

        C39170p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalGuideModuleDependency invoke() {
            return new CalGuideModuleDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalImage;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$q */
    static final class C39171q extends Lambda implements Function0<C39217n> {
        public static final C39171q INSTANCE = new C39171q();

        C39171q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39217n invoke() {
            return new C39217n();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalLanguage;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$r */
    static final class C39172r extends Lambda implements Function0<C39218o> {
        public static final C39172r INSTANCE = new C39172r();

        C39172r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39218o invoke() {
            return new C39218o();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalLeanModeGating;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$s */
    static final class C39173s extends Lambda implements Function0<CalLeanModeGating> {
        public static final C39173s INSTANCE = new C39173s();

        C39173s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalLeanModeGating invoke() {
            return new CalLeanModeGating();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalLocation;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$t */
    static final class C39174t extends Lambda implements Function0<C39219q> {
        public static final C39174t INSTANCE = new C39174t();

        C39174t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39219q invoke() {
            return new C39219q();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalLogin;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$u */
    static final class C39175u extends Lambda implements Function0<C39221r> {
        public static final C39175u INSTANCE = new C39175u();

        C39175u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39221r invoke() {
            return new C39221r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalMainModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$v */
    static final class C39176v extends Lambda implements Function0<C39223t> {
        public static final C39176v INSTANCE = new C39176v();

        C39176v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39223t invoke() {
            return new C39223t();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalOldModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$w */
    static final class C39177w extends Lambda implements Function0<C39224u> {
        public static final C39177w INSTANCE = new C39177w();

        C39177w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39224u invoke() {
            return new C39224u();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalPerfDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$x */
    static final class C39178x extends Lambda implements Function0<CalPerfDependency> {
        public static final C39178x INSTANCE = new C39178x();

        C39178x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalPerfDependency invoke() {
            return new CalPerfDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalPoiPickDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$y */
    static final class C39179y extends Lambda implements Function0<CalPoiPickDependency> {
        public static final C39179y INSTANCE = new C39179y();

        C39179y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalPoiPickDependency invoke() {
            return new CalPoiPickDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/calendar/dependency/CalPush;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.CalendarDependency$z */
    static final class C39180z extends Lambda implements Function0<C39226y> {
        public static final C39180z INSTANCE = new C39180z();

        C39180z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39226y invoke() {
            return new C39226y();
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public IAccountChangeDependency accountChangeDependency() {
        return getCalAccountChangeDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public IAppLifeCycleDependency appLifeCycleDependency() {
        return getAppLifeCycleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30041c appLinkDependency() {
        return getAppLinkDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30042d appRouter() {
        return getAppRouter();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30043e browserModuleDependency() {
        return getBrowserModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30058x calPhoneDependency() {
        return getCalPhoneDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30045g chatModuleDependency() {
        return getChatModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public ICommonDependency commonDependency() {
        return getCommonDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30046i contactModuleDependency() {
        return getContactModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30047j coreModuleDependency() {
        return getCoreModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public IDynamicConfigModuleDependency dynamicConfigModuleDependency() {
        return getDynamicConfigModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30048l featureGatingDependency() {
        return getFeatureGatingDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30044f getHttpRequestDependency() {
        return getCalHttpRequestDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30049m groupMemberManageDependency() {
        return getGroupMemberManageDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30050n guideModuleDependency() {
        return getGuideModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30051o imageDependency() {
        return getImageDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30052p languageDependency() {
        return getLanguageDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public ILeanModeGatingDependency leanModeGatingDependency() {
        return getLeanModeGatingDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30053r locationDependency() {
        return getLocationDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30054s loginDependency() {
        return getLoginDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public IMagicDependency magicDependency() {
        return getCalMagicDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30055u mainModuleDependency() {
        return getMainModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30056v oldModuleDependency() {
        return getOldModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public IPerfDependency perfDependency() {
        return getPerfDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public IPoiPickDependency poiPickDependency() {
        return getPoiPickDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30059z pushDependency() {
        return getPushDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public IQrCodeDependency qrCodeDependency() {
        return getQrCodeDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30029ab rxScheduledExecutorDependency() {
        return getRxScheduledExecutorDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30033ac searchModuleDependency() {
        return getSearchModuleDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30034ad settingDependency() {
        return getSettingDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30035ae spDependency() {
        return getSpDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30036af statisticsDependency() {
        return getStatisticsDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30037ag timeFormatDependency() {
        return getTimeFormatDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30039ah utilsDependency() {
        return getUtilsDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public AbstractC30040ai vchatDependency() {
        return getVchatDependency();
    }

    @Override // com.ss.android.lark.calendar.p1430a.AbstractC30060b
    public com.ss.android.lark.calendar.p1430a.p1431a.aj zenModeDependency() {
        return getZenModeDependency();
    }

    public CalendarDependency() {
        C39182a aVar = new C39182a();
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerNotification(aVar.mo31112a(), aVar);
    }
}
