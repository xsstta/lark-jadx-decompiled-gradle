package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;

public class AddTabItemModel extends C25920a {
    @JSONField(name = "dark")
    @LKRequiredParam
    public DarkIcon darkIcon;
    @JSONField(name = "index")
    @LKRequiredParam
    public int index;
    @JSONField(name = "light")
    @LKRequiredParam
    public LightIcon lightIcon;
    @JSONField(name = "pagePath")
    @LKRequiredParam
    public String pagePath;
    @JSONField(name = "text")
    @LKRequiredParam
    public String text;

    public static class DarkIcon {
        @JSONField(name = "iconPath")
        @LKRequiredParam
        public String iconPath;
        @JSONField(name = "selectedIconPath")
        @LKRequiredParam
        public String selectedIconPath;
    }

    public static class LightIcon {
        @JSONField(name = "iconPath")
        @LKRequiredParam
        public String iconPath;
        @JSONField(name = "selectedIconPath")
        @LKRequiredParam
        public String selectedIconPath;
    }
}
