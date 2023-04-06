package com.saucedemo.main.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralUtil {
    private GeneralUtil() {

    }
    private static final Logger LOGER= LoggerFactory.getLogger(GeneralUtil.class);
    private static final String MESSAGE_WAITING="PROGRAMA PAUSADO";
    private static final String MESSAGE_INFORMATION="\n%s\n----------------------------------------------------";

    public static void explicitWait(Long duration){
        try {
            String s= formatMessageWaiting("El robot se puso por"+ (duration/1000L)+"s");
            LOGER.info(s);
            Thread.sleep(duration);

        }catch(InterruptedException e){
            LOGER.info(e.getMessage());
            Thread.currentThread().interrupt();


        }
    }

    private static String formatMessageWaiting(String message) {
        return String.format(MESSAGE_WAITING,message);
    }

    public static String formatMessageInformation(String message){
        return String.format(MESSAGE_INFORMATION,message);
    }

}
