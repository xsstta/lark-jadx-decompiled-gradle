package com.ss.android.lark.searchcommon.dto.info;

import com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta;
import java.util.List;

public class SearchOpenSearchInfo extends SearchBaseInfo {
    private static final long serialVersionUID = -3610534218153492754L;
    private String app_link;
    private String extra;
    private String slashId;
    private SlashCommandMeta.SlashCommandType slash_command_type;
    private List<SlashCommandMeta.SlashCommandTag> tag;

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        return "slash_command";
    }

    public String getApp_link() {
        return this.app_link;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getSlashId() {
        return this.slashId;
    }

    public SlashCommandMeta.SlashCommandType getSlash_command_type() {
        return this.slash_command_type;
    }

    public List<SlashCommandMeta.SlashCommandTag> getTag() {
        return this.tag;
    }

    public SearchOpenSearchInfo() {
        this.type = 21;
    }

    public void setApp_link(String str) {
        this.app_link = str;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setSlashId(String str) {
        this.slashId = str;
    }

    public void setSlash_command_type(SlashCommandMeta.SlashCommandType slashCommandType) {
        this.slash_command_type = slashCommandType;
    }

    public void setTag(List<SlashCommandMeta.SlashCommandTag> list) {
        this.tag = list;
    }
}
