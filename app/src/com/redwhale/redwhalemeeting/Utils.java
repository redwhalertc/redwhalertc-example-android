package com.redwhale.redwhalemeeting;


public class Utils {


    public static final String MEETING_SERVER_URL = "https://demo.redwhalertc.com/";
    public static final String MEETING_AVATAR_URL = "/photos/user_photo_5";

    public static int generateRandomUserId(){
        return (int)((Math.random()*9+1)*100);
    }
}
