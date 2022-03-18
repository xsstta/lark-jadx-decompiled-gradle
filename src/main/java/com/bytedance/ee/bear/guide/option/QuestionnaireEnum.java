package com.bytedance.ee.bear.guide.option;

import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum QuestionnaireEnum {
    SceneQuestionnaire(1, "scene", R.string.Onboarding_SelectOptions_Title, new ArrayList(Arrays.asList(new OptionEntity("goal_management", R.string.Onboarding_SelectOptions_Option1, "lottie_onboarding_goal_management.json"), new OptionEntity("project_management", R.string.Onboarding_SelectOptions_Option2, "lottie_onboarding_project_management.json"), new OptionEntity("organize_meeting", R.string.Onboarding_SelectOptions_Option3, "lottie_onboarding_organize_meeting.json"), new OptionEntity("customer_management", R.string.Onboarding_SelectOptions_Option4, "lottie_onboarding_customer_management.json"), new OptionEntity("event_planning", R.string.Onboarding_SelectOptions_Option5, "lottie_onboarding_event_planning.json"), new OptionEntity("write_content", R.string.Onboarding_SelectOptions_Option6, "lottie_onboarding_write_content.json"), new OptionEntity("personal_notes_management", R.string.Onboarding_SelectOptions_Option7, "lottie_onboarding_personal_notes_management.json"), new OptionEntity("option_others", R.string.Onboarding_SelectOptions_Option8, "lottie_onboarding_other_option.json"))), null),
    UsedProductQuestionnaire(2, "used_product", R.string.FeishuDocs_Survey_UsedProducts_Title, new ArrayList(Arrays.asList(new OptionEntity("shimo_docs", R.string.FeishuDocs_Survey_Shimo_Options), new OptionEntity("tencent_docs", R.string.FeishuDocs_Survey_Tencent_Options), new OptionEntity("wps_docs", R.string.FeishuDocs_Survey_WPS_Options), new OptionEntity("notion_wolai", R.string.FeishuDocs_Survey_NotionOrWolai_Options), new OptionEntity("evernote", R.string.FeishuDocs_Survey_Evernote_Options), new OptionEntity("typora_markdown", R.string.FeishuDocs_Survey_TyporaMarkdown_Options), new OptionEntity("none_of_all", R.string.FeishuDocs_Survey_NoneOfThemAbove_Options))), "none_of_all"),
    ChannelQuestionnaire(3, "channel_from", R.string.FeishuDocs_Survey_SelectChannel_Title, new ArrayList(Arrays.asList(new OptionEntity("feishu_user", R.string.FeishuDocs_Survey_Channel_AlreadyFeishuUser_Options), new OptionEntity("friends", R.string.FeishuDocs_Survey_Channel_FriendRecommendation_Options), new OptionEntity("zhihu", R.string.FeishuDocs_Survey_Channel_Zhihu_Options), new OptionEntity("douyin", R.string.FeishuDocs_Survey_Channel_Douyin_Options), new OptionEntity("jike", R.string.FeishuDocs_Survey_Channel_JikeApp_Options), new OptionEntity("wechat_official_account", R.string.FeishuDocs_Survey_Channel_OfficialAccounts_Options), new OptionEntity("channel_others", R.string.FeishuDocs_Survey_Channel_Others_Options))), null);
    
    public String mutuallyExclusiveOptionKey;
    public List<OptionEntity> optionList;
    public String optionStep;
    public int pageNum;
    public int titleRes;

    private QuestionnaireEnum(int i, String str, int i2, List list, String str2) {
        this.pageNum = i;
        this.optionStep = str;
        this.titleRes = i2;
        this.optionList = list;
        this.mutuallyExclusiveOptionKey = str2;
    }
}
