package com.he.v8_inspect.console;

import com.he.v8_inspect.helper.ChromePeerManager;
import com.he.v8_inspect.protocol.module.Console;
import com.ss.android.lark.log.Log;

public class CLog {
    public static void writeToConsole(ChromePeerManager chromePeerManager, Console.MessageLevel messageLevel, Console.MessageSource messageSource, String str) {
        Log.m165379d("CLog", str);
        Console.ConsoleMessage consoleMessage = new Console.ConsoleMessage();
        consoleMessage.source = messageSource;
        consoleMessage.level = messageLevel;
        consoleMessage.text = str;
        Console.MessageAddedRequest messageAddedRequest = new Console.MessageAddedRequest();
        messageAddedRequest.message = consoleMessage;
        chromePeerManager.sendNotificationToPeers("Console.messageAdded", messageAddedRequest);
    }
}
