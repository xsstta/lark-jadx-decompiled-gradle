package com.ss.android.lark.calendar_api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
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
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import pl.droidsonroids.gif.GifImageView;

public interface ICalendarApi {
    void bindViewWithShareCalendarMsg(TextView textView, TextView textView2, GifImageView gifImageView, Content content);

    void bindViewWithShareMsg(TextView textView, TextView textView2, GifImageView gifImageView, Content content);

    void bindViewWithShareTodoMsg(TextView textView, TextView textView2, ImageView imageView, TodoContent todoContent);

    void bindViewWithTodoSummary(TextView textView, TextView textView2, ImageView imageView, String str);

    boolean calendarFilterOuterForForward(Message message);

    boolean calendarFilterOuterForForward(Content content);

    boolean checkIfNeedGoImportGooglePage(Uri uri, Context context);

    <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> createCalendarPinHolderView(Context context, AbstractC33988a<T> aVar);

    AbstractC44552i createCalendarTabPageSpec(Context context, ITitleController iTitleController);

    AbstractC44552i createMomentsTabPageSpec(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo);

    void createTodo(Context context, BlockEntity blockEntity, BlockExtra blockExtra);

    <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> createTodoPinHolderView(Context context, AbstractC33988a<T> aVar);

    AbstractC44552i createTodoTabPageSpec(Context context, ITitleController iTitleController);

    void eventTransfer(String str, String str2, long j, String str3, Boolean bool, IGetDataCallback<Void> iGetDataCallback);

    List<AbstractC28490a<?>> getAbTestExperiments();

    List<LKPluginConfig> getAllApiPluginConfigs();

    Map<String, String> getAutoInitModuleConfigMap();

    Map<String, AbstractC29186b> getCalAppLinkHandlers(Context context);

    String getCalendarBotMessageTitle(Context context, Message message);

    String getCalendarCardReplyDigest(Message message);

    Content getCalendarContent(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content);

    Intent getCalendarIntentForWsChannelOfflinePush(String str);

    AbstractC33978b getCalendarMeetingForChatSetting(Activity activity, String str, String str2, AbstractC33980d dVar);

    AbstractC33977a getCalendarMeetingForChatWindow(Activity activity, String str, String str2, AbstractC33979c cVar);

    Collection<? extends IOpenMessageCellFactory> getCalendarMessageCellFactories();

    String getCalendarPageName();

    AbstractC54125a getCalendarSettingCompnent(Activity activity);

    Collection<? extends IOpenMessageCellFactory> getCalendarThreadCellFactories();

    String getCalendarTitle(Message message);

    void getChatTodoListReadState(String str, IGetDataCallback<Boolean> iGetDataCallback);

    void getChatterIdByCalendarId(String str, IGetDataCallback<String> iGetDataCallback);

    String getChatterIdsForAddAttendeeResultKey();

    void getEventSettingRole(String str, IGetDataCallback<Integer> iGetDataCallback);

    String getFormatTodoTaskViewInChatText(String str);

    Content getGeneralContent(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content);

    Map<String, Boolean> getLeanModeGatingMap();

    List<AbstractC28490a<?>> getMomentsABTestExperiments();

    Map<String, AbstractC29186b> getMomentsAppLinkHandlers(Context context);

    AbstractC54125a getMomentsSettingComponent(Activity activity);

    String getMomentsTabName();

    String getOpenCalendarFromNoticeKey();

    String getOpenTodoFromNoticeKey();

    Fragment getProfileMomentsFragment(String str);

    String getRepeatRuleAndEnd(String str);

    int getShareCalendarEventCode();

    Content getShareCalendarEventContent(com.bytedance.lark.pb.basic.v1.Content content);

    Intent getShareCalendarEventResult(ArrayList<String> arrayList, boolean z);

    String getShareCalendarMessageTitle(Message message);

    int getShareTodoCode();

    Intent getShareTodoResult(ArrayList<String> arrayList, String str, String str2);

    Collection<String> getSyncKeys();

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    Map<String, AbstractC29186b> getTodoAppLinkHandlers(Context context);

    CharSequence getTodoCardMessageTitle(Message message);

    Content getTodoContent(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content);

    Intent getTodoIntentForWsChannelOfflinePush(String str);

    Collection<? extends IOpenMessageCellFactory> getTodoMessageCellFactories();

    String getTodoPageName();

    AbstractC54125a getTodoSettingComponent(Activity activity);

    Collection<? extends IOpenMessageCellFactory> getTodoThreadCellFactories();

    Intent getVideoEventIntent(Context context, String str, long j);

    void gotoChatTodoListActivity(Context context, String str, boolean z);

    void gotoFindTimeActivity(Activity activity, Chat chat, ChatChatter chatChatter);

    void gotoFindTimeActivity(Context context, Chat chat, ChatChatter chatChatter);

    void hitpointEmailAttendeeEnter();

    void hitpointEmailAttendeeInvate();

    void initForCalendarRust(Context context);

    void initProcessorDoInit(String str);

    boolean isEnableRSVPCalendarType(Message message);

    boolean isInviteEmailEnable();

    boolean isMettingNoRole(int i);

    boolean isMettingOrganizer(int i);

    boolean isMomentsSettingEnable();

    boolean isSupportFindTime(Chat chat, ChatChatter chatChatter);

    boolean isSupportMultiTimeZone();

    boolean isTodoDailyRemindEnable();

    boolean isTodoInlineEnable();

    boolean isTodoTabEnable();

    boolean isTransferOptimize();

    boolean isValidateEmail(String str);

    void packageCalendarOfflinePushNotice(Bundle bundle, String str);

    void packageLaunchCalendarTransPageIntent(Bundle bundle, String str);

    void packageLaunchTodoTransPageIntent(Bundle bundle, String str);

    void packageTodoOfflinePushNotice(Bundle bundle, String str);

    void preloadCalendarTabPageData(Context context);

    void preloadCalendarTabPageView(Activity activity);

    void searchCalendarEvent(String str, String str2, IGetDataCallback<SearchResponse> iGetDataCallback);

    void sendOnClickShareForward();

    void sendOnEventTransferConfirm();

    void shareMomentsPost(List<String> list, String str, int i, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    void showVideoEventInfo(Context context, String str, long j);

    List<String> splitEmail(String str);

    void startArrangeMeeting(Activity activity, String str, boolean z, long j, long j2, String str2, ArrayList<String> arrayList, boolean z2, int i);

    void startCalendarArrangeLookActivity(Activity activity, String str);

    void startCalendarEventDetailActivity(String str, String str2, Long l, Context context, Long l2, Long l3);

    void startCalendarSearchActivity(Context context, String str, String str2);

    void startCalendarSettingActivity(Activity activity);

    void startCreateEventActivity(Context context, String str, long j, long j2, boolean z);

    void startEmailEventDetailActivity(Context context, String str, String str2, long j);

    void startEventDetailActivityFromAuthorizedAppLink(Context context, String str, String str2, long j, long j2);

    void startEventEditActivity(Context context, String str, List<String> list);

    void startFindTimeActivity(Activity activity, String str, boolean z, String str2, ArrayList<String> arrayList, long j, long j2, boolean z2, int i);

    void startMeetingRoomSignInActivity(Context context, String str, String str2);

    void startMomentsSettingActivity(Activity activity);

    void startPreemptMeetingRoomActivity(Context context, String str);

    void startTodoSettingActivity(Activity activity);

    void transferToChat(String str, IGetDataCallback<Boolean> iGetDataCallback);

    void triggerQuitMeetingEvent();

    void updateProfileBackground(String str, IGetDataCallback<String> iGetDataCallback);

    Content wrapShareCalendarEventContent(Object obj);
}
