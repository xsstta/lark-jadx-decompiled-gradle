package com.ss.android.openbusiness.data;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;

@AppConfig(key = "messageaction_plusmenu_config")
public class MessengeActionConfig {
    @SerializedName("MessageAction")

    /* renamed from: a */
    private MessageActionDTO f147855a;
    @SerializedName("PlusMenu")

    /* renamed from: b */
    private PlusMenuDTO f147856b;

    public class MessageActionDTO {
        @SerializedName("helpUrl")
        private String helpUrl;

        public String getHelpUrl() {
            return this.helpUrl;
        }

        public void setHelpUrl(String str) {
            this.helpUrl = str;
        }

        public MessageActionDTO() {
        }
    }

    public class PlusMenuDTO {
        @SerializedName("helpUrl")
        private String helpUrl;

        public String getHelpUrl() {
            return this.helpUrl;
        }

        public void setHelpUrl(String str) {
            this.helpUrl = str;
        }

        public PlusMenuDTO() {
        }
    }

    /* renamed from: a */
    public MessageActionDTO mo202953a() {
        return this.f147855a;
    }

    /* renamed from: b */
    public PlusMenuDTO mo202954b() {
        return this.f147856b;
    }
}
