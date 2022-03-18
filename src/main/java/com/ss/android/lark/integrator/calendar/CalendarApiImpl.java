package com.ss.android.lark.integrator.calendar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.calendar.api.entity.CalendarSearchEventsResponse;
import com.ss.android.lark.calendar.api.p1433a.AbstractC30062a;
import com.ss.android.lark.calendar.api.p1433a.AbstractC30063b;
import com.ss.android.lark.calendar.api.p1434b.AbstractC30065a;
import com.ss.android.lark.calendar.api.p1434b.AbstractC30066b;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingDependency;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32632ac;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarGeneralContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33977a;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33978b;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33979c;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33980d;
import com.ss.android.lark.chat.entity.p1665e.AbstractC33988a;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.integrator.calendar.dependency.CalLeanModeGating;
import com.ss.android.lark.integrator.calendar.dependency.aj;
import com.ss.android.lark.integrator.moments.MomentsModuleProvider;
import com.ss.android.lark.integrator.moments.p2043a.C39902q;
import com.ss.android.lark.integrator.todo.TodoModuleProvider;
import com.ss.android.lark.integrator.todo.p2047a.C40056t;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.p2567s.p2568a.p2569a.C53195a;
import com.ss.android.lark.p2567s.p2568a.p2569a.C53196b;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCalendarEventInfo;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListActivity;
import com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import pl.droidsonroids.gif.GifImageView;

@ClaymoreImpl(ICalendarApi.class)
public class CalendarApiImpl implements ICalendarApi {
    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getChatterIdsForAddAttendeeResultKey() {
        return "param_chatter_ids_for_calendar";
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getOpenCalendarFromNoticeKey() {
        return "enter_calendar_tab_from_offline_push";
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getOpenTodoFromNoticeKey() {
        return "enter_todo_tab_from_offline_push";
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public int getShareCalendarEventCode() {
        return 4;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public int getShareTodoCode() {
        return 1;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isMettingNoRole(int i) {
        return i == 0;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isMettingOrganizer(int i) {
        return i == 1 || i == 2;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53195a.f131524a;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53195a.f131525b;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53195a.f131526c;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public List<LKPluginConfig> getAllApiPluginConfigs() {
        return Collections.emptyList();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Map<String, Boolean> getLeanModeGatingMap() {
        return CalLeanModeGating.m154667a();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void hitpointEmailAttendeeEnter() {
        CalendarModuleProvider.m154500a().mo108134h();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void hitpointEmailAttendeeInvate() {
        CalendarModuleProvider.m154500a().mo108135i();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public List<AbstractC28490a<?>> getAbTestExperiments() {
        return TodoModuleProvider.m158690a().mo191661d();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Collection<? extends IOpenMessageCellFactory> getCalendarMessageCellFactories() {
        return CalendarModuleProvider.m154500a().mo120369m().mo120382a();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getCalendarPageName() {
        return CalendarModuleProvider.m154500a().mo108131e();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Collection<? extends IOpenMessageCellFactory> getCalendarThreadCellFactories() {
        return CalendarModuleProvider.m154500a().mo120369m().mo120385b();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public List<AbstractC28490a<?>> getMomentsABTestExperiments() {
        return MomentsModuleProvider.m158362a().mo165891c();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getMomentsTabName() {
        return MomentsModuleProvider.m158362a().mo165885a();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Collection<String> getSyncKeys() {
        return CalendarModuleProvider.m154500a().mo108137k();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Collection<? extends IOpenMessageCellFactory> getTodoMessageCellFactories() {
        return TodoModuleProvider.m158690a().mo191666f().mo191674a();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getTodoPageName() {
        return TodoModuleProvider.m158690a().mo191659b();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Collection<? extends IOpenMessageCellFactory> getTodoThreadCellFactories() {
        return TodoModuleProvider.m158690a().mo191666f().mo191675b();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isInviteEmailEnable() {
        return CalendarModuleProvider.m154500a().mo108132f();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isSupportMultiTimeZone() {
        return CalendarModuleProvider.m154500a().mo108133g();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isTodoDailyRemindEnable() {
        return TodoModuleProvider.m158690a().mo191670j();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isTodoInlineEnable() {
        return TodoModuleProvider.m158690a().mo191662e();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isTodoTabEnable() {
        return TodoModuleProvider.m158690a().mo191669i();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isTransferOptimize() {
        return CalendarModuleProvider.m154500a().mo108138l();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void sendOnClickShareForward() {
        CalendarModuleProvider.m154500a().mo108130d().mo108144b();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void sendOnEventTransferConfirm() {
        CalendarModuleProvider.m154500a().mo108130d().mo108146c();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void triggerQuitMeetingEvent() {
        CalendarModuleProvider.m154500a().mo108130d().mo108140a();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isMomentsSettingEnable() {
        if (!MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144719a("moments") || !MomentsDependencyHolder.f118997a.mo166489a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void initProcessorDoInit(String str) {
        C53196b.m205838a(str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public AbstractC54125a getCalendarSettingCompnent(Activity activity) {
        return new aj(activity);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public AbstractC54125a getMomentsSettingComponent(Activity activity) {
        return new C39902q(activity);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getRepeatRuleAndEnd(String str) {
        return C32632ac.m125171b(str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public AbstractC54125a getTodoSettingComponent(Activity activity) {
        return new C40056t(activity);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void preloadCalendarTabPageData(Context context) {
        CalendarModuleProvider.m154500a().mo120368b(context);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void preloadCalendarTabPageView(Activity activity) {
        CalendarModuleProvider.m154500a().mo120367b(activity);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startCalendarSettingActivity(Activity activity) {
        CalendarModuleProvider.m154500a().mo108108a(activity);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startMomentsSettingActivity(Activity activity) {
        MomentsModuleProvider.m158362a().mo165887a(activity);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startTodoSettingActivity(Activity activity) {
        TodoModuleProvider.m158690a().mo191653a(activity);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Map<String, AbstractC29186b> getCalAppLinkHandlers(Context context) {
        return CalendarModuleProvider.m154500a().mo120365a(context);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Intent getCalendarIntentForWsChannelOfflinePush(String str) {
        return CalendarModuleProvider.m154500a().mo108128c(str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getFormatTodoTaskViewInChatText(String str) {
        return UIHelper.mustacheFormat((int) R.string.Todo_Task_ViewInChat, "sourceName", str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Map<String, AbstractC29186b> getMomentsAppLinkHandlers(Context context) {
        return MomentsModuleProvider.m158362a().mo165886a(context);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Fragment getProfileMomentsFragment(String str) {
        return MomentsModuleProvider.m158362a().mo165883a(str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Content getShareCalendarEventContent(com.bytedance.lark.pb.basic.v1.Content content) {
        return CalendarModuleProvider.m154500a().mo120370n().mo120377a(content);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Map<String, AbstractC29186b> getTodoAppLinkHandlers(Context context) {
        return TodoModuleProvider.m158690a().mo191665a(context);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Intent getTodoIntentForWsChannelOfflinePush(String str) {
        return TodoModuleProvider.m158690a().mo191650a(str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void initForCalendarRust(Context context) {
        CalendarModuleProvider.m154500a().mo108129c().mo108465a(context);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isValidateEmail(String str) {
        return CalendarModuleProvider.m154500a().mo108122a(str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public List<String> splitEmail(String str) {
        return CalendarModuleProvider.m154500a().mo108124b(str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Content wrapShareCalendarEventContent(Object obj) {
        return CalendarModuleProvider.m154500a().mo120372p().mo120374a(obj);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean calendarFilterOuterForForward(Message message) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).calendarFilterOuterForForward((ShareCalendarEventContent) message.getContent());
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getCalendarCardReplyDigest(Message message) {
        CalendarGeneralContent calendarGeneralContent;
        if (message.getType() == Message.Type.GENERAL_CALENDAR && (calendarGeneralContent = (CalendarGeneralContent) message.getContent()) != null) {
            return CalendarModuleProvider.m154500a().mo120369m().mo120384b(calendarGeneralContent);
        }
        return null;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getCalendarTitle(Message message) {
        CalendarContent calendarContent;
        if (message.getType() != Message.Type.CALENDAR || (calendarContent = (CalendarContent) message.getContent()) == null) {
            return "";
        }
        return calendarContent.getCalendarInternalContent().getSummary();
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getShareCalendarMessageTitle(Message message) {
        ShareCalendarEventContent shareCalendarEventContent;
        if (message.getType() != Message.Type.SHARE_CALENDAR_EVENT || (shareCalendarEventContent = (ShareCalendarEventContent) message.getContent()) == null) {
            return "";
        }
        return CalendarModuleProvider.m154500a().mo120369m().mo120381a(shareCalendarEventContent);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public CharSequence getTodoCardMessageTitle(Message message) {
        TodoContent todoContent;
        if (message.getType() != Message.Type.TODO || (todoContent = (TodoContent) message.getContent()) == null) {
            return "";
        }
        return TodoModuleProvider.m158690a().mo191651a(todoContent);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isEnableRSVPCalendarType(Message message) {
        if (message.getType() == Message.Type.GENERAL_CALENDAR) {
            return CalendarModuleProvider.m154500a().mo120369m().mo120383a((CalendarGeneralContent) message.getContent());
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean calendarFilterOuterForForward(Content content) {
        if (!(content instanceof ShareCalendarEventContent)) {
            return false;
        }
        return CalendarModuleProvider.m154500a().mo120372p().mo120375a((ShareCalendarEventContent) content);
    }

    public List<SearchBaseInfo> parseCalendarSearchEventsResponses(List<CalendarSearchEventsResponse> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (CalendarSearchEventsResponse bVar : list) {
            SearchCalendarEventInfo searchCalendarEventInfo = new SearchCalendarEventInfo();
            searchCalendarEventInfo.setId(bVar.mo108390c());
            searchCalendarEventInfo.setCalendarId(bVar.mo108381a());
            searchCalendarEventInfo.setEventKey(bVar.mo108390c());
            searchCalendarEventInfo.setOriginalTime(Long.valueOf(bVar.mo108386b()));
            searchCalendarEventInfo.setTitle(bVar.mo108393d());
            searchCalendarEventInfo.setTitleHitTerms(bVar.mo108398f());
            searchCalendarEventInfo.setSubTitle(bVar.mo108395e());
            searchCalendarEventInfo.setSubTitleHitTerms(bVar.mo108399g());
            searchCalendarEventInfo.setIsGoogleEvent(bVar.mo108400h());
            searchCalendarEventInfo.setStartTime(Long.valueOf(bVar.mo108402i()));
            searchCalendarEventInfo.setEndTime(Long.valueOf(bVar.mo108403j()));
            searchCalendarEventInfo.setEventExactData(bVar.mo108404k());
            arrayList.add(searchCalendarEventInfo);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startCalendarArrangeLookActivity(Activity activity, String str) {
        CalendarModuleProvider.m154500a().mo108109a(activity, str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startPreemptMeetingRoomActivity(Context context, String str) {
        CalendarModuleProvider.m154500a().mo108112a(context, str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void updateProfileBackground(String str, IGetDataCallback<String> iGetDataCallback) {
        MomentsModuleProvider.m158362a().mo165888a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean checkIfNeedGoImportGooglePage(Uri uri, Context context) {
        return CalendarModuleProvider.m154500a().mo108130d().mo108143a(uri, context);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public AbstractC44552i createCalendarTabPageSpec(Context context, ITitleController iTitleController) {
        return CalendarModuleProvider.m154500a().mo120364a(context, iTitleController);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public AbstractC44552i createTodoTabPageSpec(Context context, ITitleController iTitleController) {
        return TodoModuleProvider.m158690a().mo191664a(context, iTitleController);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Content getCalendarContent(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content) {
        return CalendarModuleProvider.m154500a().mo120370n().mo120376a(entity, content);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void getChatTodoListReadState(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        TodoModuleProvider.m158690a().mo191660c().mo191663a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void getChatterIdByCalendarId(String str, IGetDataCallback<String> iGetDataCallback) {
        CalendarModuleProvider.m154500a().mo108130d().mo108141a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void getEventSettingRole(String str, final IGetDataCallback<Integer> iGetDataCallback) {
        C32533b.m124620a().mo118857a(str, new IGetDataCallback<MeetingDependency>() {
            /* class com.ss.android.lark.integrator.calendar.CalendarApiImpl.C391458 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(MeetingDependency meetingDependency) {
                CalendarEvent calendarEvent;
                if (meetingDependency != null) {
                    calendarEvent = meetingDependency.getCalendarEvent();
                } else {
                    calendarEvent = null;
                }
                iGetDataCallback.onSuccess(Integer.valueOf(m154498a(calendarEvent)));
            }

            /* renamed from: a */
            private int m154498a(CalendarEvent calendarEvent) {
                boolean z = false;
                if (calendarEvent == null) {
                    return 0;
                }
                String c = C30810k.m114955a().mo111644c();
                if (!TextUtils.isEmpty(c)) {
                    z = c.equals(calendarEvent.getOrganizerCalendarId());
                }
                boolean z2 = !TextUtils.isEmpty(calendarEvent.getRRule());
                if (z) {
                    if (z2) {
                        return 1;
                    }
                    return 2;
                } else if (z2) {
                    return 3;
                } else {
                    return 4;
                }
            }
        });
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Content getGeneralContent(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content) {
        return CalendarModuleProvider.m154500a().mo120370n().mo120378b(entity, content);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Intent getShareCalendarEventResult(ArrayList<String> arrayList, boolean z) {
        Intent intent = new Intent();
        intent.putStringArrayListExtra("shareCalendarEventResult", arrayList);
        intent.putExtra("shareCalendarEventExternalAlert", z);
        return intent;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Content getTodoContent(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content) {
        return TodoModuleProvider.m158690a().mo191668h().mo191676a(entity, content);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public boolean isSupportFindTime(Chat chat, ChatChatter chatChatter) {
        return CalendarModuleProvider.m154500a().mo120366a(chat, chatChatter);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void packageCalendarOfflinePushNotice(Bundle bundle, String str) {
        bundle.putBoolean("enter_calendar_tab_from_offline_push", true);
        bundle.putString("key_offline_push_event_data", str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void packageLaunchCalendarTransPageIntent(Bundle bundle, String str) {
        bundle.putBoolean("enter_calendar_tab_from_offline_push", true);
        bundle.putString("key_offline_push_event_data", str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void packageLaunchTodoTransPageIntent(Bundle bundle, String str) {
        bundle.putBoolean("enter_todo_tab_from_offline_push", true);
        bundle.putString("key_offline_push_todo_data", str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void packageTodoOfflinePushNotice(Bundle bundle, String str) {
        bundle.putBoolean("enter_todo_tab_from_offline_push", true);
        bundle.putString("key_offline_push_todo_data", str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void transferToChat(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        CalendarModuleProvider.m154500a().mo108130d().mo108145b(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> createCalendarPinHolderView(Context context, final AbstractC33988a<T> aVar) {
        return CalendarModuleProvider.m154500a().mo120369m().mo120379a(context, new AbstractC32679d.AbstractC32680a<T>() {
            /* class com.ss.android.lark.integrator.calendar.CalendarApiImpl.C391436 */

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: b */
            public Message mo120390b() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124923c();
                }
                return null;
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: c */
            public String mo120391c() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124924d();
                }
                return "";
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: d */
            public String mo120392d() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124926f();
                }
                return "";
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: e */
            public String mo120393e() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124927g();
                }
                return "";
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: f */
            public String mo120394f() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124925e();
                }
                return "";
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: g */
            public boolean mo120395g() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124928h();
                }
                return false;
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: h */
            public String mo120396h() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124929i();
                }
                return "";
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: a */
            public boolean mo120389a() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124922b();
                }
                return false;
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: a */
            public void mo120388a(T t) {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    aVar.mo124921a(t);
                }
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: a */
            public void mo120386a(int i) {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    aVar.mo124919a(i, aVar.mo124918a());
                }
            }

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d.AbstractC32680a
            /* renamed from: a */
            public void mo120387a(View view) {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    aVar.mo124920a(view, aVar.mo124918a());
                }
            }
        });
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> createTodoPinHolderView(Context context, final AbstractC33988a<T> aVar) {
        return TodoModuleProvider.m158690a().mo191666f().mo191673a(context, new AbstractC56227a.AbstractC56228a<T>() {
            /* class com.ss.android.lark.integrator.calendar.CalendarApiImpl.C391425 */

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: b */
            public Message mo143013b() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124923c();
                }
                return null;
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: c */
            public String mo143014c() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124924d();
                }
                return "";
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: d */
            public String mo143015d() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124926f();
                }
                return "";
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: e */
            public String mo143016e() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124927g();
                }
                return "";
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: f */
            public String mo143017f() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124925e();
                }
                return "";
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: g */
            public boolean mo143018g() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124928h();
                }
                return false;
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: h */
            public String mo143019h() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124929i();
                }
                return "";
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: a */
            public boolean mo143012a() {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    return aVar.mo124922b();
                }
                return false;
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: a */
            public void mo143011a(T t) {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    aVar.mo124921a(t);
                }
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: a */
            public void mo143009a(int i) {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    aVar.mo124919a(i, aVar.mo124918a());
                }
            }

            @Override // com.ss.android.lark.todo.p2774b.p2775a.AbstractC56227a.AbstractC56228a
            /* renamed from: a */
            public void mo143010a(View view) {
                AbstractC33988a aVar = aVar;
                if (aVar != null) {
                    aVar.mo124920a(view, aVar.mo124918a());
                }
            }
        });
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public String getCalendarBotMessageTitle(Context context, Message message) {
        CalendarContent calendarContent;
        if (message.getType() != Message.Type.CALENDAR || (calendarContent = (CalendarContent) message.getContent()) == null) {
            return "";
        }
        return CalendarModuleProvider.m154500a().mo120369m().mo120380a(context, calendarContent);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void createTodo(Context context, BlockEntity blockEntity, BlockExtra blockExtra) {
        TodoModuleProvider.m158690a().mo191654a(context, blockEntity, blockExtra);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void gotoChatTodoListActivity(Context context, String str, boolean z) {
        TodoChatListActivity.f139322b.mo191856a(context, str, z);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void showVideoEventInfo(Context context, String str, long j) {
        CalendarModuleProvider.m154500a().mo108113a(context, str, j);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startEventEditActivity(Context context, String str, List<String> list) {
        CalendarModuleProvider.m154500a().mo108121a(context, str, list);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startMeetingRoomSignInActivity(Context context, String str, String str2) {
        CalendarModuleProvider.m154500a().mo108115a(context, str, str2);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public AbstractC44552i createMomentsTabPageSpec(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        return MomentsModuleProvider.m158362a().mo165884a(context, iTitleController, tabAppInfo);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Intent getVideoEventIntent(Context context, String str, long j) {
        return CalendarModuleProvider.m154500a().mo108123b(context, str, j);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startCalendarSearchActivity(Context context, String str, String str2) {
        CalendarModuleProvider.m154500a().mo108136j().mo108346a(context, str, str2);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public Intent getShareTodoResult(ArrayList<String> arrayList, String str, String str2) {
        Intent intent = new Intent();
        intent.putStringArrayListExtra("chat_ids_for_share_todo", arrayList);
        intent.putExtra("comment_for_share_todo", str);
        intent.putExtra("guid_for_share_todo", str2);
        return intent;
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void searchCalendarEvent(final String str, final String str2, final IGetDataCallback<SearchResponse> iGetDataCallback) {
        CalendarModuleProvider.m154500a().mo108136j().mo108347a(str, new IGetDataCallback<List<CalendarSearchEventsResponse>>() {
            /* class com.ss.android.lark.integrator.calendar.CalendarApiImpl.C391447 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(List<CalendarSearchEventsResponse> list) {
                if (list == null) {
                    onError(new ErrorResult("net search failed: occurs in search CalendarEvent: null"));
                    return;
                }
                SearchResponse searchResponse = new SearchResponse();
                searchResponse.setQuery(str);
                searchResponse.setRequestId(str2);
                searchResponse.setFrom(1);
                searchResponse.setInfoList(CalendarApiImpl.this.parseCalendarSearchEventsResponses(list));
                searchResponse.setTotal(list.size());
                searchResponse.setResultType(10000004);
                searchResponse.setScene(Scene.Type.SEARCH_CALENDAR_EVENT);
                iGetDataCallback.onSuccess(searchResponse);
            }
        });
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void gotoFindTimeActivity(Activity activity, Chat chat, ChatChatter chatChatter) {
        if (chat != null) {
            boolean z = true;
            if (chatChatter != null) {
                CalendarModuleProvider.m154500a().mo108107a(1, chat.getId());
            } else if (chat.isMeeting()) {
                CalendarModuleProvider.m154500a().mo108107a(2, chat.getId());
            } else {
                CalendarModuleProvider.m154500a().mo108107a(3, chat.getId());
            }
            AbstractC32677a a = CalendarModuleProvider.m154500a();
            String id = chat.getId();
            if (chat.getType() != Chat.Type.P2P) {
                z = false;
            }
            a.mo108110a(activity, id, z);
        }
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void gotoFindTimeActivity(Context context, Chat chat, ChatChatter chatChatter) {
        if (chat != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            AbstractC32677a a = CalendarModuleProvider.m154500a();
            boolean z = true;
            if (chatChatter != null) {
                a.mo108107a(1, chat.getId());
            } else if (chat.isMeeting()) {
                a.mo108107a(2, chat.getId());
            } else {
                a.mo108107a(3, chat.getId());
            }
            String id = chat.getId();
            if (chat.getType() != Chat.Type.P2P) {
                z = false;
            }
            a.mo108110a(activity, id, z);
        }
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void bindViewWithShareMsg(TextView textView, TextView textView2, GifImageView gifImageView, Content content) {
        if (content instanceof ShareCalendarEventContent) {
            bindViewWithShareCalendarMsg(textView, textView2, gifImageView, (ShareCalendarEventContent) content);
        }
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void bindViewWithShareTodoMsg(TextView textView, TextView textView2, ImageView imageView, TodoContent todoContent) {
        TodoModuleProvider.m158690a().mo191667g().mo191671a(textView, textView2, imageView, todoContent);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void bindViewWithTodoSummary(TextView textView, TextView textView2, ImageView imageView, String str) {
        TodoModuleProvider.m158690a().mo191667g().mo191672a(textView, textView2, imageView, str);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startEmailEventDetailActivity(Context context, String str, String str2, long j) {
        CalendarModuleProvider.m154500a().mo108116a(context, str, str2, j);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void bindViewWithShareCalendarMsg(TextView textView, TextView textView2, GifImageView gifImageView, Content content) {
        if (content instanceof ShareCalendarEventContent) {
            CalendarModuleProvider.m154500a().mo120371o().mo120373a(textView, textView2, gifImageView, (ShareCalendarEventContent) content);
        }
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public AbstractC33978b getCalendarMeetingForChatSetting(Activity activity, String str, String str2, final AbstractC33980d dVar) {
        final AbstractC30063b a = CalendarModuleProvider.m154500a().mo108104a(activity, str, new AbstractC30062a() {
            /* class com.ss.android.lark.integrator.calendar.CalendarApiImpl.C391403 */

            @Override // com.ss.android.lark.calendar.api.p1433a.AbstractC30062a
            /* renamed from: a */
            public void mo108330a() {
                dVar.mo124338a();
            }

            @Override // com.ss.android.lark.calendar.api.p1433a.AbstractC30062a
            /* renamed from: b */
            public void mo108332b() {
                dVar.mo124340b();
            }

            @Override // com.ss.android.lark.calendar.api.p1433a.AbstractC30062a
            /* renamed from: a */
            public void mo108331a(boolean z) {
                dVar.mo124339a(z);
            }

            @Override // com.ss.android.lark.calendar.api.p1433a.AbstractC30062a
            /* renamed from: b */
            public void mo108333b(boolean z) {
                dVar.mo124341b(z);
            }
        });
        return new AbstractC33978b() {
            /* class com.ss.android.lark.integrator.calendar.CalendarApiImpl.C391414 */

            @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33978b
            /* renamed from: a */
            public void mo124335a() {
                a.mo108334a();
            }

            @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33978b
            /* renamed from: b */
            public void mo124336b() {
                a.mo108335b();
            }

            @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33978b
            /* renamed from: c */
            public void mo124337c() {
                a.mo108336c();
            }
        };
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public AbstractC33977a getCalendarMeetingForChatWindow(Activity activity, String str, String str2, final AbstractC33979c cVar) {
        final AbstractC30066b a = CalendarModuleProvider.m154500a().mo108105a(activity, str, str2, new AbstractC30065a() {
            /* class com.ss.android.lark.integrator.calendar.CalendarApiImpl.C391381 */

            @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30065a
            /* renamed from: a */
            public void mo108337a() {
                cVar.mo123747a();
            }

            @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30065a
            /* renamed from: b */
            public void mo108341b() {
                cVar.mo123751b();
            }

            @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30065a
            /* renamed from: c */
            public void mo108343c() {
                cVar.mo123753c();
            }

            @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30065a
            /* renamed from: a */
            public void mo108338a(int i) {
                cVar.mo123748a(i);
            }

            @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30065a
            /* renamed from: b */
            public void mo108342b(boolean z) {
                cVar.mo123752b(z);
            }

            @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30065a
            /* renamed from: a */
            public void mo108339a(View view) {
                cVar.mo123749a(view);
            }

            @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30065a
            /* renamed from: a */
            public void mo108340a(boolean z) {
                cVar.mo123750a(z);
            }
        });
        return new AbstractC33977a() {
            /* class com.ss.android.lark.integrator.calendar.CalendarApiImpl.C391392 */

            @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33977a
            /* renamed from: a */
            public void mo124333a() {
                a.mo108344a();
            }

            @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33977a
            /* renamed from: b */
            public int mo124334b() {
                return a.mo108345b();
            }
        };
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startEventDetailActivityFromAuthorizedAppLink(Context context, String str, String str2, long j, long j2) {
        C31238b.m116879b(context, str, str2, j, j2);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void shareMomentsPost(List<String> list, String str, int i, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        MomentsModuleProvider.m158362a().mo165889a(list, str, i, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startCreateEventActivity(Context context, String str, long j, long j2, boolean z) {
        CalendarModuleProvider.m154500a().mo108114a(context, str, j, j2, z);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void eventTransfer(String str, String str2, long j, String str3, Boolean bool, IGetDataCallback<Void> iGetDataCallback) {
        CalendarModuleProvider.m154500a().mo108130d().mo108142a(str, str2, j, str3, bool, iGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startCalendarEventDetailActivity(String str, String str2, Long l, Context context, Long l2, Long l3) {
        CalendarModuleProvider.m154500a().mo108136j().mo108348a(str, str2, l, context, l2, l3);
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startArrangeMeeting(Activity activity, String str, boolean z, long j, long j2, String str2, ArrayList<String> arrayList, boolean z2, int i) {
        CalendarModuleProvider.m154500a().mo108111a(activity, str, z, str2, arrayList, j, j2, z2, com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.Scene.valueOf(i));
    }

    @Override // com.ss.android.lark.calendar_api.ICalendarApi
    public void startFindTimeActivity(Activity activity, String str, boolean z, String str2, ArrayList<String> arrayList, long j, long j2, boolean z2, int i) {
        CalendarModuleProvider.m154500a().mo108111a(activity, str, z, str2, arrayList, j, j2, z2, com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.Scene.forNumber(i));
    }
}
